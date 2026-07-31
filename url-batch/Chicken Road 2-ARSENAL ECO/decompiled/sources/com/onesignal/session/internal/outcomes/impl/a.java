package com.onesignal.session.internal.outcomes.impl;

import h3.EnumC0407c;

/* loaded from: classes.dex */
public final class a {
    private final EnumC0407c channel;
    private final String influenceId;

    public a(String influenceId, EnumC0407c channel) {
        kotlin.jvm.internal.i.e(influenceId, "influenceId");
        kotlin.jvm.internal.i.e(channel, "channel");
        this.influenceId = influenceId;
        this.channel = channel;
    }

    public final EnumC0407c getChannel() {
        return this.channel;
    }

    public final String getInfluenceId() {
        return this.influenceId;
    }
}
