package defpackage;

import java.util.concurrent.Executors;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class v6 extends op {
    public static volatile v6 p;
    public final Object o;

    public v6(int i) {
        switch (i) {
            case 1:
                this.o = new Object();
                Executors.newFixedThreadPool(4, new ze());
                break;
            default:
                this.o = new v6(1);
                break;
        }
    }

    public static v6 e0() {
        if (p != null) {
            return p;
        }
        synchronized (v6.class) {
            try {
                if (p == null) {
                    p = new v6(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return p;
    }
}
