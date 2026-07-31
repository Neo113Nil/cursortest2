package f2;

import F5.j;
import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.i;

/* renamed from: f2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0366c {
    public static final C0366c INSTANCE = new C0366c();

    private C0366c() {
    }

    public final void ensureNoObfuscatedPrefStore(Context context) {
        File[] listFiles;
        i.e(context, "context");
        try {
            File file = new File(context.getDataDir(), "shared_prefs");
            File file2 = new File(file, "OneSignal.xml");
            if (file.exists() && file.isDirectory() && !file2.exists() && (listFiles = file.listFiles()) != null) {
                for (File file3 : listFiles) {
                    i.b(file3);
                    String name = file3.getName();
                    i.d(name, "getName(...)");
                    int V6 = j.V(name, 6, ".");
                    if (V6 != -1) {
                        name = name.substring(0, V6);
                        i.d(name, "substring(...)");
                    }
                    if (context.getSharedPreferences(name, 0).contains("GT_PLAYER_ID")) {
                        file3.renameTo(file2);
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            com.onesignal.debug.internal.logging.b.log(i2.c.ERROR, "error attempting to fix obfuscated preference store", th);
        }
    }
}
