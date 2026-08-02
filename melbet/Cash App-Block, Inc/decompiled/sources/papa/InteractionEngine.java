package papa;

import android.os.Looper;
import android.os.Trace;
import android.view.Choreographer;
import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt__MapWithDefaultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt___StringsKt;
import kotlin.time.Duration;
import papa.InteractionEngine;
import papa.InteractionUpdated;
import papa.internal.LaunchTracker$onActivityResumed$1$1;
import papa.internal.Perfs$$ExternalSyntheticLambda2;

/* loaded from: classes3.dex */
public final class InteractionEngine {
    public SentEvent eventInScope;
    public final Map onEventCallbacks;
    public final OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 updateListener;
    public final ArrayList runningInteractions = new ArrayList();
    public final ArrayList finishingInteractions = new ArrayList();

    public final class RealRunningInteraction {
        public final InteractionEngine$RealRunningInteraction$$ExternalSyntheticLambda0 cancelOnTimeout;
        public final InteractionTrigger interactionTrigger;
        public final ArrayList sentEvents = new ArrayList();
        public final InteractionTrace trace;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Runnable, papa.InteractionEngine$RealRunningInteraction$$ExternalSyntheticLambda0] */
        public RealRunningInteraction(InteractionTrigger interactionTrigger, InteractionTrace interactionTrace, final long j) {
            this.interactionTrigger = interactionTrigger;
            this.trace = interactionTrace;
            ?? r2 = new Runnable() { // from class: papa.InteractionEngine$RealRunningInteraction$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    if (Trace.isEnabled()) {
                        Trace.beginSection(androidx.tracing.Trace.truncatedTraceSectionLabel(StringsKt___StringsKt.take(127, "PAPA-cancel:timeout")));
                        Trace.endSection();
                    }
                    InteractionEngine.RealRunningInteraction realRunningInteraction = InteractionEngine.RealRunningInteraction.this;
                    realRunningInteraction.stopRunning();
                    realRunningInteraction.trace.endTrace();
                    r2.updateListener.onInteractionUpdate(new InteractionUpdated.CanceledOnTimeout(j, realRunningInteraction));
                }
            };
            this.cancelOnTimeout = r2;
            Handlers.getMainThreadHandler().postDelayed(r2, Duration.m4167getInWholeMillisecondsimpl(j));
            addRecordedEvent();
        }

        public final void addRecordedEvent() {
            SentEvent sentEvent = InteractionEngine.this.eventInScope;
            sentEvent.getClass();
            ArrayList arrayList = this.sentEvents;
            SentEvent sentEvent2 = (SentEvent) CollectionsKt.lastOrNull((List) arrayList);
            if ((sentEvent2 != null ? sentEvent2.event : null) != sentEvent.event) {
                arrayList.add(sentEvent);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x00a2  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x00a6  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void finish() {
            InteractionEngine interactionEngine = InteractionEngine.this;
            SentEvent sentEvent = interactionEngine.eventInScope;
            sentEvent.getClass();
            if (Trace.isEnabled()) {
                Trace.beginSection(androidx.tracing.Trace.truncatedTraceSectionLabel(StringsKt___StringsKt.take(127, "PAPA-finishInteraction:" + sentEvent.event)));
                Trace.endSection();
            }
            stopRunning();
            interactionEngine.finishingInteractions.add(this);
            addRecordedEvent();
            interactionEngine.updateListener.onInteractionUpdate(new InteractionUpdated.Finished(sentEvent, this));
            Choreographers choreographers = Choreographers.INSTANCE;
            boolean z = true;
            LaunchTracker$onActivityResumed$1$1 launchTracker$onActivityResumed$1$1 = new LaunchTracker$onActivityResumed$1$1(1 == true ? 1 : 0, this, interactionEngine, sentEvent);
            choreographers.getClass();
            Lazy lazy = Handlers.mainThreadHandler$delegate;
            if (Looper.getMainLooper() == Looper.myLooper()) {
                if (!MainThreadMessageSpy.enabled) {
                    StackTraceElement[] stackTrace = new RuntimeException().getStackTrace();
                    stackTrace.getClass();
                    for (int length = stackTrace.length - 1; -1 < length; length--) {
                        StackTraceElement stackTraceElement = stackTrace[length];
                        if (Intrinsics.areEqual(stackTraceElement.getClassName(), "android.view.Choreographer") && Intrinsics.areEqual(stackTraceElement.getMethodName(), "doFrame")) {
                            break;
                        }
                    }
                } else {
                    z = ((Boolean) Choreographers.isInChoreographerFrameMessage$delegate.getValue(choreographers, Choreographers.$$delegatedProperties[0])).booleanValue();
                }
                if (z) {
                    Choreographer.getInstance().postFrameCallback(new Choreographers$$ExternalSyntheticLambda3(launchTracker$onActivityResumed$1$1, 0));
                    return;
                } else {
                    Choreographers.postOnCurrentFrameRendered$papa_release(launchTracker$onActivityResumed$1$1);
                    return;
                }
            }
            z = false;
            if (z) {
            }
        }

        public final void recordEvent() {
            InteractionEngine interactionEngine = InteractionEngine.this;
            SentEvent sentEvent = interactionEngine.eventInScope;
            sentEvent.getClass();
            if (Trace.isEnabled()) {
                Trace.beginSection(androidx.tracing.Trace.truncatedTraceSectionLabel(StringsKt___StringsKt.take(127, "PAPA-recordEvent:" + sentEvent.event)));
                Trace.endSection();
            }
            addRecordedEvent();
            interactionEngine.updateListener.onInteractionUpdate(new InteractionUpdated.EventRecorded(sentEvent, this));
        }

        public final void stopRunning() {
            if (InteractionEngine.this.runningInteractions.remove(this)) {
                Handlers.getMainThreadHandler().removeCallbacks(this.cancelOnTimeout);
                return;
            }
            StringBuilder sb = new StringBuilder("Interaction started by ");
            ArrayList arrayList = this.sentEvents;
            sb.append(CollectionsKt.first((List) arrayList));
            Object last = CollectionsKt.last((List) arrayList);
            sb.append(" and ended by ");
            sb.append(last);
            sb.append(" is not running.");
            throw new IllegalStateException(sb.toString().toString());
        }
    }

    public InteractionEngine(OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0, InteractionScope interactionScope) {
        this.updateListener = onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
        this.onEventCallbacks = MapsKt__MapWithDefaultKt.withDefaultMutable(new LinkedHashMap(), new Perfs$$ExternalSyntheticLambda2(CollectionsKt.toList(interactionScope.onEventCallbacks), 9));
    }
}
