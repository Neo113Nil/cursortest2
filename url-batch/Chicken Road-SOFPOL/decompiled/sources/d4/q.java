package d4;

import android.os.Trace;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class q implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = m3.b.f5221a;
            Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
            if (l.c()) {
                l.a().d();
            }
            Trace.endSection();
        } catch (Throwable th) {
            int i8 = m3.b.f5221a;
            Trace.endSection();
            throw th;
        }
    }
}
