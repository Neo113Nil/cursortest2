package U;

import android.os.Trace;

/* loaded from: classes.dex */
public final class n implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = G.h.f234a;
            Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
            if (j.f847k != null) {
                j.a().c();
            }
            Trace.endSection();
        } catch (Throwable th) {
            int i2 = G.h.f234a;
            Trace.endSection();
            throw th;
        }
    }
}
