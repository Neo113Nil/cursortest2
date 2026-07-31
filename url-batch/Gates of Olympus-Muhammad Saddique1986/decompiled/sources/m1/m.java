package m1;

import android.os.Trace;

/* loaded from: classes.dex */
public final class m implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i3 = Z0.d.f4712a;
            Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
            if (i.c()) {
                i.a().d();
            }
            Trace.endSection();
        } catch (Throwable th) {
            int i4 = Z0.d.f4712a;
            Trace.endSection();
            throw th;
        }
    }
}
