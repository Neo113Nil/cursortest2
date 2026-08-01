package m;

import i1.r;
import java.util.concurrent.Executors;

/* renamed from: m.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0303a extends r {

    /* renamed from: e, reason: collision with root package name */
    public static volatile C0303a f3535e;

    /* renamed from: d, reason: collision with root package name */
    public final Object f3536d;

    public C0303a(int i) {
        switch (i) {
            case 1:
                this.f3536d = new Object();
                Executors.newFixedThreadPool(4, new b());
                break;
            default:
                this.f3536d = new C0303a(1);
                break;
        }
    }

    public static C0303a u() {
        if (f3535e != null) {
            return f3535e;
        }
        synchronized (C0303a.class) {
            try {
                if (f3535e == null) {
                    f3535e = new C0303a(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f3535e;
    }
}
