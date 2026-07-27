package com.onesignal.session.internal.outcomes.impl;

import com.onesignal.session.internal.influence.InfluenceChannel;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class CachedUniqueOutcome {
    private final InfluenceChannel channel;
    private final String influenceId;

    public CachedUniqueOutcome(String influenceId, InfluenceChannel channel) {
        i.e(influenceId, "influenceId");
        i.e(channel, "channel");
        this.influenceId = influenceId;
        this.channel = channel;
    }

    public final InfluenceChannel getChannel() {
        return this.channel;
    }

    public final String getInfluenceId() {
        return this.influenceId;
    }
}
