package papa;

import kotlin.time.Duration;

/* loaded from: classes10.dex */
public final class InteractionTriggerWithPayload implements InteractionTrigger {
    public final /* synthetic */ SimpleInteractionTrigger $$delegate_0;
    public final InputEventTrigger payload;

    public InteractionTriggerWithPayload(long j, String str, InteractionTrace interactionTrace, InputEventTrigger inputEventTrigger) {
        this.$$delegate_0 = new SimpleInteractionTrigger(j, str, interactionTrace);
        this.payload = inputEventTrigger;
    }

    @Override // papa.InteractionTrigger
    /* renamed from: getTriggerUptime-UwyO8pc */
    public final long mo4371getTriggerUptimeUwyO8pc() {
        return this.$$delegate_0.triggerUptime;
    }

    @Override // papa.InteractionTrigger
    public final InteractionTrace takeOverInteractionTrace() {
        return this.$$delegate_0.takeOverInteractionTrace();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InteractionTrigger(name='");
        SimpleInteractionTrigger simpleInteractionTrigger = this.$$delegate_0;
        sb.append(simpleInteractionTrigger.name);
        sb.append("', triggerUptime=");
        sb.append((Object) Duration.m4177toStringimpl(simpleInteractionTrigger.triggerUptime));
        sb.append(", payload=");
        sb.append(this.payload);
        sb.append(')');
        return sb.toString();
    }
}
