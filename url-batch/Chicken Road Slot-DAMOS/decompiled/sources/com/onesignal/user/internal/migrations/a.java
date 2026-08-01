package com.onesignal.user.internal.migrations;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public interface a extends ra.b {
    boolean isInBadState();

    void recover();

    String recoveryMessage();

    @Override // ra.b
    /* synthetic */ void start();
}
