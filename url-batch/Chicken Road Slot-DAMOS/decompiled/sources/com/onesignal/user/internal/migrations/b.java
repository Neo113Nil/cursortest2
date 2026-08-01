package com.onesignal.user.internal.migrations;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class b implements a {
    @Override // com.onesignal.user.internal.migrations.a
    public abstract /* synthetic */ boolean isInBadState();

    @Override // com.onesignal.user.internal.migrations.a
    public abstract /* synthetic */ void recover();

    @Override // com.onesignal.user.internal.migrations.a
    public abstract /* synthetic */ String recoveryMessage();

    @Override // com.onesignal.user.internal.migrations.a, ra.b
    public void start() {
        if (isInBadState()) {
            com.onesignal.debug.internal.logging.b.warn$default(recoveryMessage(), null, 2, null);
            recover();
        }
    }
}
