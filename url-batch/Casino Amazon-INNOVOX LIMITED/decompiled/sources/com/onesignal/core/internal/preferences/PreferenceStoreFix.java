package com.onesignal.core.internal.preferences;

import android.content.Context;
import com.onesignal.core.BuildConfig;
import com.onesignal.debug.LogLevel;
import com.onesignal.debug.internal.logging.Logging;
import java.io.File;
import kotlin.Metadata;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PreferenceStoreFix.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/onesignal/core/internal/preferences/PreferenceStoreFix;", "", "()V", "ensureNoObfuscatedPrefStore", "", "context", "Landroid/content/Context;", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PreferenceStoreFix {
    public static final PreferenceStoreFix INSTANCE = new PreferenceStoreFix();

    private PreferenceStoreFix() {
    }

    public final void ensureNoObfuscatedPrefStore(Context context) {
        File[] listFiles;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            File file = new File(context.getDataDir(), "shared_prefs");
            File file2 = new File(file, "OneSignal.xml");
            if (file.exists() && file.isDirectory() && !file2.exists() && (listFiles = file.listFiles()) != null) {
                for (File file3 : listFiles) {
                    Intrinsics.checkNotNull(file3);
                    if (context.getSharedPreferences(FilesKt.getNameWithoutExtension(file3), 0).contains(PreferenceOneSignalKeys.PREFS_LEGACY_PLAYER_ID)) {
                        file3.renameTo(file2);
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            Logging.log(LogLevel.ERROR, "error attempting to fix obfuscated preference store", th);
        }
    }
}
