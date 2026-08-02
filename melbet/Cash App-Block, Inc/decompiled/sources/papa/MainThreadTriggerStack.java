package papa;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.time.Duration;
import papa.internal.Perfs$$ExternalSyntheticLambda2;

/* loaded from: classes3.dex */
public abstract class MainThreadTriggerStack {
    public static final ArrayList interactionTriggerStack = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [papa.InteractionTrigger] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public static InteractionTrigger getEarliestInteractionTrigger() {
        InteractionTrigger interactionTrigger;
        Handlers.checkOnMainThread();
        Iterator it = interactionTriggerStack.iterator();
        if (it.hasNext()) {
            ?? next = it.next();
            while (it.hasNext()) {
                InteractionTrigger interactionTrigger2 = (InteractionTrigger) it.next();
                next = (InteractionTrigger) next;
                if (Duration.m4164compareToLRDsOJo(interactionTrigger2.mo4371getTriggerUptimeUwyO8pc(), next.mo4371getTriggerUptimeUwyO8pc()) <= 0) {
                    next = interactionTrigger2;
                }
            }
            interactionTrigger = next;
        } else {
            interactionTrigger = null;
        }
        return interactionTrigger;
    }

    public static void popTriggeredBy$papa_release(InteractionTrigger interactionTrigger) {
        interactionTrigger.getClass();
        CollectionsKt__MutableCollectionsKt.removeAll(interactionTriggerStack, new Perfs$$ExternalSyntheticLambda2(interactionTrigger, 10));
    }

    public static void pushTriggeredBy$papa_release(InteractionTrigger interactionTrigger) {
        interactionTrigger.getClass();
        ArrayList arrayList = interactionTriggerStack;
        if (arrayList == null || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((InteractionTrigger) it.next()) == interactionTrigger) {
                    Handlers$$ExternalSyntheticBUOutline0.m("Trigger ", interactionTrigger, " already in the main thread trigger stack");
                    return;
                }
            }
        }
        arrayList.add(interactionTrigger);
    }
}
