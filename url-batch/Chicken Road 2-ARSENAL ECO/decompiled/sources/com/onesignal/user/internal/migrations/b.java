package com.onesignal.user.internal.migrations;

/* loaded from: classes.dex */
public abstract class b implements a {
    @Override // com.onesignal.user.internal.migrations.a
    public abstract /* synthetic */ boolean isInBadState();

    @Override // com.onesignal.user.internal.migrations.a
    public abstract /* synthetic */ void recover();

    @Override // com.onesignal.user.internal.migrations.a
    public abstract /* synthetic */ String recoveryMessage();

    @Override // com.onesignal.user.internal.migrations.a, com.onesignal.core.internal.startup.b
    public void start() {
        if (isInBadState()) {
            com.onesignal.debug.internal.logging.b.warn$default(recoveryMessage(), null, 2, null);
            recover();
        }
    }
}
