package com.onesignal.core.internal.preferences;

import B4.k;
import android.content.Context;
import com.onesignal.debug.LogLevel;
import com.onesignal.debug.internal.logging.Logging;
import java.io.File;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class PreferenceStoreFix {
    public static final PreferenceStoreFix INSTANCE = new PreferenceStoreFix();

    private PreferenceStoreFix() {
    }

    public final void ensureNoObfuscatedPrefStore(Context context) {
        File[] listFiles;
        i.e(context, "context");
        try {
            File file = new File(context.getDataDir(), "shared_prefs");
            File file2 = new File(file, "OneSignal.xml");
            if (!file.exists() || !file.isDirectory() || file2.exists() || (listFiles = file.listFiles()) == null) {
                return;
            }
            for (File file3 : listFiles) {
                i.b(file3);
                String name = file3.getName();
                i.d(name, "getName(...)");
                int a02 = k.a0(6, name, ".");
                if (a02 != -1) {
                    name = name.substring(0, a02);
                    i.d(name, "substring(...)");
                }
                if (context.getSharedPreferences(name, 0).contains(PreferenceOneSignalKeys.PREFS_LEGACY_PLAYER_ID)) {
                    file3.renameTo(file2);
                    return;
                }
            }
        } catch (Throwable th) {
            Logging.log(LogLevel.ERROR, "error attempting to fix obfuscated preference store", th);
        }
    }
}
