package androidx.emoji2.text;

import android.os.Trace;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class o implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i4 = g0.f.f1759a;
            Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
            if (l.f340k != null) {
                l.a().c();
            }
            Trace.endSection();
        } catch (Throwable th) {
            int i5 = g0.f.f1759a;
            Trace.endSection();
            throw th;
        }
    }
}
