package F4;

import M7.j;
import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public final class c {
    public static final c INSTANCE = new c();

    private c() {
    }

    public final void ensureNoObfuscatedPrefStore(Context context) {
        File[] listFiles;
        h.e(context, "context");
        try {
            File file = new File(context.getDataDir(), "shared_prefs");
            File file2 = new File(file, "OneSignal.xml");
            if (file.exists() && file.isDirectory() && !file2.exists() && (listFiles = file.listFiles()) != null) {
                for (File file3 : listFiles) {
                    h.b(file3);
                    String name = file3.getName();
                    h.d(name, "getName(...)");
                    int U7 = j.U(6, name, com.anythink.core.common.d.j.f12535z);
                    if (U7 != -1) {
                        name = name.substring(0, U7);
                        h.d(name, "substring(...)");
                    }
                    if (context.getSharedPreferences(name, 0).contains("GT_PLAYER_ID")) {
                        file3.renameTo(file2);
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            com.onesignal.debug.internal.logging.b.log(I4.c.ERROR, "error attempting to fix obfuscated preference store", th);
        }
    }
}
