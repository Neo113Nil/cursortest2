package com.onesignal.user.internal.migrations;

import com.onesignal.core.internal.startup.IStartableService;

/* loaded from: classes.dex */
public interface IMigrationRecovery extends IStartableService {
    boolean isInBadState();

    void recover();

    String recoveryMessage();
}
