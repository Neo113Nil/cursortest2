package T;

import android.os.Trace;

/* loaded from: classes.dex */
public final class n implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = G.i.f203a;
            Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
            if (j.f789k != null) {
                j.a().c();
            }
            Trace.endSection();
        } catch (Throwable th) {
            int i2 = G.i.f203a;
            Trace.endSection();
            throw th;
        }
    }
}
