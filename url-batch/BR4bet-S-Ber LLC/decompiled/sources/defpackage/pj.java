package defpackage;

import android.os.Trace;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class pj implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = v90.a;
            Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
            if (lj.k != null) {
                lj.a().c();
            }
            Trace.endSection();
        } catch (Throwable th) {
            int i2 = v90.a;
            Trace.endSection();
            throw th;
        }
    }
}
