package T;

import android.os.Trace;

/* loaded from: classes.dex */
public final class o implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = G.h.f211a;
            Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
            if (k.f816k != null) {
                k.a().c();
            }
            Trace.endSection();
        } catch (Throwable th) {
            int i2 = G.h.f211a;
            Trace.endSection();
            throw th;
        }
    }
}
