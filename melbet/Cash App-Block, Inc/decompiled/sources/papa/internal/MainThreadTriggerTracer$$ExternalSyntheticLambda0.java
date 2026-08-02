package papa.internal;

import android.os.Trace;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import papa.InteractionTrace;
import papa.InteractionTrigger;
import papa.MainThreadMessageSpy;
import papa.MainThreadTriggerStack;
import papa.SafeTrace;
import papa.SimpleInteractionTrigger;

/* loaded from: classes3.dex */
public final /* synthetic */ class MainThreadTriggerTracer$$ExternalSyntheticLambda0 implements MainThreadMessageSpy.Tracer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Serializable f$0;

    public /* synthetic */ MainThreadTriggerTracer$$ExternalSyntheticLambda0(int i, Serializable serializable) {
        this.$r8$classId = i;
        this.f$0 = serializable;
    }

    @Override // papa.MainThreadMessageSpy.Tracer
    public final void onMessageDispatch(String str, boolean z) {
        String str2;
        int i = this.$r8$classId;
        Serializable serializable = this.f$0;
        switch (i) {
            case 0:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) serializable;
                if (z) {
                    Duration.Companion companion = Duration.Companion;
                    SimpleInteractionTrigger simpleInteractionTrigger = new SimpleInteractionTrigger(DurationKt.toDuration(System.nanoTime(), DurationUnit.NANOSECONDS), "main-message", null);
                    ref$ObjectRef.element = simpleInteractionTrigger;
                    MainThreadTriggerStack.pushTriggeredBy$papa_release(simpleInteractionTrigger);
                    return;
                }
                ArrayList arrayList = MainThreadTriggerStack.interactionTriggerStack;
                Object obj = ref$ObjectRef.element;
                if (obj == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("currentTrigger");
                    throw null;
                }
                MainThreadTriggerStack.popTriggeredBy$papa_release((InteractionTrigger) obj);
                Object obj2 = ref$ObjectRef.element;
                if (obj2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("currentTrigger");
                    throw null;
                }
                InteractionTrace takeOverInteractionTrace = ((InteractionTrigger) obj2).takeOverInteractionTrace();
                if (takeOverInteractionTrace != null) {
                    takeOverInteractionTrace.endTrace();
                    return;
                }
                return;
            default:
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) serializable;
                if (ref$BooleanRef.element) {
                    ref$BooleanRef.element = false;
                    if (Trace.isEnabled()) {
                        Trace.endSection();
                        return;
                    }
                    return;
                }
                if (Trace.isEnabled() && z && !StringsKt.contains((CharSequence) str, (CharSequence) "android.view.Choreographer$FrameDisplayEventReceiver", false)) {
                    String removePrefix = StringsKt.removePrefix(">>>>> Dispatching to ", str);
                    int lastIndexOf$default = StringsKt.lastIndexOf$default(removePrefix, ": ", 0, 6);
                    int indexOf$default = StringsKt.indexOf$default((CharSequence) removePrefix, "} ", 0, false, 6);
                    String substring = removePrefix.substring(0, indexOf$default + 1);
                    String substring2 = removePrefix.substring(lastIndexOf$default + 2);
                    String substring3 = removePrefix.substring(indexOf$default + 2, lastIndexOf$default);
                    if (substring3.equals("null")) {
                        str2 = substring + ' ' + substring2;
                    } else {
                        int indexOf$default2 = StringsKt.indexOf$default((CharSequence) substring3, "Continuation at ", 0, false, 6);
                        if (indexOf$default2 != -1) {
                            substring3 = substring3.substring(indexOf$default2 + 16);
                        }
                        str2 = substring3 + ' ' + substring + ' ' + substring2;
                    }
                    SafeTrace.beginSection(str2);
                    ref$BooleanRef.element = true;
                    return;
                }
                return;
        }
    }
}
