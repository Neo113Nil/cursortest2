package V;

import android.os.Trace;

/* loaded from: classes.dex */
public final class m implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = I.h.f335a;
            Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
            if (j.f887k != null) {
                j.a().c();
            }
            Trace.endSection();
        } catch (Throwable th) {
            int i2 = I.h.f335a;
            Trace.endSection();
            throw th;
        }
    }
}
