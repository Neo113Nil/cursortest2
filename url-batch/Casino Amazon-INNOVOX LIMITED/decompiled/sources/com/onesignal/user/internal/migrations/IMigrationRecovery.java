package com.onesignal.user.internal.migrations;

import com.onesignal.core.BuildConfig;
import com.onesignal.core.internal.startup.IStartableService;
import kotlin.Metadata;

/* compiled from: IMigrationRecovery.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/onesignal/user/internal/migrations/IMigrationRecovery;", "Lcom/onesignal/core/internal/startup/IStartableService;", "isInBadState", "", "recover", "", "recoveryMessage", "", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface IMigrationRecovery extends IStartableService {
    boolean isInBadState();

    void recover();

    String recoveryMessage();
}
