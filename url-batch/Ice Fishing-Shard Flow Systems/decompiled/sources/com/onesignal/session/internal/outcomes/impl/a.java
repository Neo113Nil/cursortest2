package com.onesignal.session.internal.outcomes.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a {
    private final J3.c channel;
    private final String influenceId;

    public a(String influenceId, J3.c channel) {
        Intrinsics.checkNotNullParameter(influenceId, "influenceId");
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.influenceId = influenceId;
        this.channel = channel;
    }

    public final J3.c getChannel() {
        return this.channel;
    }

    public final String getInfluenceId() {
        return this.influenceId;
    }
}
