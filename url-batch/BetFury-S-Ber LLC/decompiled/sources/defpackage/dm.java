package defpackage;

import android.os.Trace;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class dm implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = bj0.a;
            Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
            if (zl.k != null) {
                zl.a().c();
            }
            Trace.endSection();
        } catch (Throwable th) {
            int i2 = bj0.a;
            Trace.endSection();
            throw th;
        }
    }
}
