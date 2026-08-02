package papa;

import com.squareup.cash.interaction.InteractionEvent;

/* loaded from: classes3.dex */
public final class SentEvent {
    public final InteractionEvent event;
    public final long uptime;

    public SentEvent(long j, InteractionEvent interactionEvent) {
        this.uptime = j;
        this.event = interactionEvent;
    }
}
