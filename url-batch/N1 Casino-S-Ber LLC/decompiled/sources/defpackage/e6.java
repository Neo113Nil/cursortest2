package defpackage;

import java.util.concurrent.Executors;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class e6 extends e70 {
    public static volatile e6 j;
    public final Object i;

    public e6(int i) {
        switch (i) {
            case 1:
                this.i = new Object();
                Executors.newFixedThreadPool(4, new af());
                break;
            default:
                this.i = new e6(1);
                break;
        }
    }

    public static e6 b0() {
        if (j != null) {
            return j;
        }
        synchronized (e6.class) {
            try {
                if (j == null) {
                    j = new e6(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j;
    }
}
