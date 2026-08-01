package defpackage;

import android.os.Trace;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class nh implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = n60.a;
            Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
            if (kh.k != null) {
                kh.a().c();
            }
            Trace.endSection();
        } catch (Throwable th) {
            int i2 = n60.a;
            Trace.endSection();
            throw th;
        }
    }
}
