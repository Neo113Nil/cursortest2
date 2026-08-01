package qa;

import android.content.Context;
import java.io.File;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c {
    public static final c INSTANCE = new c();

    private c() {
    }

    public final void ensureNoObfuscatedPrefStore(Context context) {
        File[] listFiles;
        context.getClass();
        try {
            File file = new File(context.getDataDir(), "shared_prefs");
            File file2 = new File(file, "OneSignal.xml");
            if (file.exists() && file.isDirectory() && !file2.exists() && (listFiles = file.listFiles()) != null) {
                for (File file3 : listFiles) {
                    file3.getClass();
                    String name = file3.getName();
                    name.getClass();
                    int lastIndexOf = name.lastIndexOf(".", StringsKt.p(name));
                    if (lastIndexOf != -1) {
                        name = name.substring(0, lastIndexOf);
                    }
                    if (context.getSharedPreferences(name, 0).contains("GT_PLAYER_ID")) {
                        file3.renameTo(file2);
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            com.onesignal.debug.internal.logging.b.log(ua.c.ERROR, "error attempting to fix obfuscated preference store", th);
        }
    }
}
