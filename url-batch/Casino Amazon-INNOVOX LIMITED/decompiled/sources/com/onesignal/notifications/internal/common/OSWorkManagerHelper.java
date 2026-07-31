package com.onesignal.notifications.internal.common;

import android.content.Context;
import androidx.work.Configuration;
import androidx.work.WorkManager;
import com.onesignal.debug.internal.logging.Logging;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OSWorkManagerHelper.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\t"}, d2 = {"Lcom/onesignal/notifications/internal/common/OSWorkManagerHelper;", "", "()V", "getInstance", "Landroidx/work/WorkManager;", "context", "Landroid/content/Context;", "initializeWorkManager", "", "com.onesignal.notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OSWorkManagerHelper {
    public static final OSWorkManagerHelper INSTANCE = new OSWorkManagerHelper();

    private OSWorkManagerHelper() {
    }

    public final synchronized WorkManager getInstance(Context context) {
        WorkManager workManager;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            workManager = WorkManager.getInstance(context);
            Intrinsics.checkNotNull(workManager);
        } catch (IllegalStateException e) {
            Logging.warn("OSWorkManagerHelper.getInstance failed, attempting to initialize: ", e);
            initializeWorkManager(context);
            workManager = WorkManager.getInstance(context);
            Intrinsics.checkNotNull(workManager);
        }
        return workManager;
    }

    private final void initializeWorkManager(Context context) {
        Configuration build;
        try {
            Object applicationContext = context.getApplicationContext();
            Configuration.Provider provider = applicationContext instanceof Configuration.Provider ? (Configuration.Provider) applicationContext : null;
            if (provider == null || (build = provider.getWorkManagerConfiguration()) == null) {
                build = new Configuration.Builder().build();
            }
            Intrinsics.checkNotNull(build);
            WorkManager.initialize(context, build);
        } catch (IllegalStateException e) {
            Logging.warn("OSWorkManagerHelper initializing WorkManager failed: ", e);
        }
    }
}
