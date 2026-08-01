package m;

import java.util.concurrent.Executors;
import k0.k;

/* renamed from: m.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0273a extends k {

    /* renamed from: e, reason: collision with root package name */
    public static volatile C0273a f3172e;
    public final Object d;

    public C0273a(int i) {
        switch (i) {
            case 1:
                this.d = new Object();
                Executors.newFixedThreadPool(4, new b());
                break;
            default:
                this.d = new C0273a(1);
                break;
        }
    }

    public static C0273a u() {
        if (f3172e != null) {
            return f3172e;
        }
        synchronized (C0273a.class) {
            try {
                if (f3172e == null) {
                    f3172e = new C0273a(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f3172e;
    }
}
