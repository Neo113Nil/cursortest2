package defpackage;

import android.os.Looper;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class x6 extends ud0 {
    public static volatile x6 b;
    public static final w6 c = new w6(0);
    public final cj a = new cj();

    public static x6 F() {
        if (b != null) {
            return b;
        }
        synchronized (x6.class) {
            try {
                if (b == null) {
                    b = new x6();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b;
    }

    public final void G(Runnable runnable) {
        cj cjVar = this.a;
        if (cjVar.c == null) {
            synchronized (cjVar.a) {
                try {
                    if (cjVar.c == null) {
                        cjVar.c = cj.F(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        cjVar.c.post(runnable);
    }
}
