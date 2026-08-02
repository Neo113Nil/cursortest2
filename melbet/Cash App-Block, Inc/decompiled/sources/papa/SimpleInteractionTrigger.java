package papa;

import kotlin.time.Duration;

/* loaded from: classes3.dex */
public final class SimpleInteractionTrigger implements InteractionTrigger {
    public InteractionTrace interactionTrace;
    public final String name;
    public final long triggerUptime;

    public SimpleInteractionTrigger(long j, String str, InteractionTrace interactionTrace) {
        this.triggerUptime = j;
        this.name = str;
        this.interactionTrace = interactionTrace;
    }

    @Override // papa.InteractionTrigger
    /* renamed from: getTriggerUptime-UwyO8pc */
    public final long mo4371getTriggerUptimeUwyO8pc() {
        return this.triggerUptime;
    }

    @Override // papa.InteractionTrigger
    public final InteractionTrace takeOverInteractionTrace() {
        Handlers.checkOnMainThread();
        try {
            return this.interactionTrace;
        } finally {
            this.interactionTrace = null;
        }
    }

    public final String toString() {
        return "InteractionTrigger(name='" + this.name + "', triggerUptime=" + ((Object) Duration.m4177toStringimpl(this.triggerUptime)) + ')';
    }
}
