package U;

import android.os.Trace;

/* loaded from: classes.dex */
public final class m implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i2 = E.h.f656a;
            Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
            if (j.j != null) {
                j.a().c();
            }
            Trace.endSection();
        } catch (Throwable th) {
            int i5 = E.h.f656a;
            Trace.endSection();
            throw th;
        }
    }
}
