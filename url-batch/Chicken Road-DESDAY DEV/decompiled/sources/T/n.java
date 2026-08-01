package T;

import android.os.Trace;

/* loaded from: classes.dex */
public final class n implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = G.h.f194a;
            Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
            if (j.f774k != null) {
                j.a().c();
            }
            Trace.endSection();
        } catch (Throwable th) {
            int i2 = G.h.f194a;
            Trace.endSection();
            throw th;
        }
    }
}
