package defpackage;

import android.os.Trace;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class dg0 implements Runnable {
    public static final /* synthetic */ dg0 n = new dg0(1);
    public static final /* synthetic */ dg0 o = new dg0(2);
    public final /* synthetic */ int m;

    public /* synthetic */ dg0(int i) {
        this.m = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.m) {
            case 0:
                try {
                    int i = ry2.a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (ag0.d()) {
                        ag0.a().e();
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    int i2 = ry2.a;
                    Trace.endSection();
                    throw th;
                }
            case 1:
                tl3.i.incrementAndGet();
                return;
            default:
                tl3.i.incrementAndGet();
                return;
        }
    }
}
