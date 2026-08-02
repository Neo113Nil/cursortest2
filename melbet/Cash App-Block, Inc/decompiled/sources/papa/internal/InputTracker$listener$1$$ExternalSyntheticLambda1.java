package papa.internal;

import android.view.KeyEvent;
import android.view.Window;
import curtains.DispatchState;
import curtains.internal.WindowCallbackWrapper$dispatchKeyEvent$dispatch$1;
import java.util.ArrayList;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import papa.Handlers;
import papa.InputEventTrigger;
import papa.InteractionTrace;
import papa.InteractionTriggerWithPayload;
import papa.MainThreadTriggerStack;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final /* synthetic */ class InputTracker$listener$1$$ExternalSyntheticLambda1 {
    public final /* synthetic */ Window f$0;

    public /* synthetic */ InputTracker$listener$1$$ExternalSyntheticLambda1(Window window) {
        this.f$0 = window;
    }

    public final DispatchState intercept(KeyEvent keyEvent, WindowCallbackWrapper$dispatchKeyEvent$dispatch$1 windowCallbackWrapper$dispatchKeyEvent$dispatch$1) {
        keyEvent.getClass();
        long nanoTime = System.nanoTime();
        String concat = InputTracker.getName(keyEvent).concat(" Interaction");
        int i = (int) (nanoTime % 2147483647L);
        SafeTrace.beginAsyncSection(concat, i);
        Duration.Companion companion = Duration.Companion;
        DurationUnit durationUnit = DurationUnit.NANOSECONDS;
        long duration = DurationKt.toDuration(nanoTime, durationUnit);
        long duration2 = DurationKt.toDuration(keyEvent.getEventTime(), DurationUnit.MILLISECONDS);
        long j = Duration.m4164compareToLRDsOJo(duration2, duration) > 0 ? duration : duration2;
        String concat2 = "key ".concat(InputTracker.getName(keyEvent));
        InputTracker$listener$1$1$2$trigger$1 inputTracker$listener$1$1$2$trigger$1 = new InputTracker$listener$1$1$2$trigger$1(concat, i);
        DurationKt.toDuration(nanoTime, durationUnit);
        InteractionTriggerWithPayload interactionTriggerWithPayload = new InteractionTriggerWithPayload(j, concat2, inputTracker$listener$1$1$2$trigger$1, InputEventTrigger.Companion.m4369createTrackingWhenFrameRenderedSxA4cEA(this.f$0, keyEvent));
        ArrayList arrayList = MainThreadTriggerStack.interactionTriggerStack;
        Handlers.checkOnMainThread();
        MainThreadTriggerStack.pushTriggeredBy$papa_release(interactionTriggerWithPayload);
        try {
            return (DispatchState) windowCallbackWrapper$dispatchKeyEvent$dispatch$1.invoke(keyEvent);
        } finally {
            MainThreadTriggerStack.popTriggeredBy$papa_release(interactionTriggerWithPayload);
            InteractionTrace takeOverInteractionTrace = interactionTriggerWithPayload.takeOverInteractionTrace();
            if (takeOverInteractionTrace != null) {
                takeOverInteractionTrace.endTrace();
            }
        }
    }
}
