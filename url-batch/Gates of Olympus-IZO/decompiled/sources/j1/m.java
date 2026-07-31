package j1;

import android.os.Trace;

/* loaded from: classes.dex */
public final class m implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i3 = X0.d.f3391a;
            Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
            if (C0518i.f5255k != null) {
                C0518i.a().c();
            }
            Trace.endSection();
        } catch (Throwable th) {
            int i4 = X0.d.f3391a;
            Trace.endSection();
            throw th;
        }
    }
}
