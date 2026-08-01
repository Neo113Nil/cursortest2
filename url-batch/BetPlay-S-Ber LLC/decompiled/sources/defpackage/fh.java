package defpackage;

import android.os.Trace;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class fh implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = t60.a;
            Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
            if (ch.k != null) {
                ch.a().c();
            }
            Trace.endSection();
        } catch (Throwable th) {
            int i2 = t60.a;
            Trace.endSection();
            throw th;
        }
    }
}
