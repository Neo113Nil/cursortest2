package com.onesignal.user.internal.migrations;

/* loaded from: classes.dex */
public interface a extends com.onesignal.core.internal.startup.b {
    boolean isInBadState();

    void recover();

    String recoveryMessage();

    @Override // com.onesignal.core.internal.startup.b
    /* synthetic */ void start();
}
