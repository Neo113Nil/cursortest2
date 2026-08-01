package m;

import i1.r;
import java.util.concurrent.Executors;

/* renamed from: m.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0301a extends r {

    /* renamed from: e, reason: collision with root package name */
    public static volatile C0301a f3531e;

    /* renamed from: d, reason: collision with root package name */
    public final Object f3532d;

    public C0301a(int i) {
        switch (i) {
            case 1:
                this.f3532d = new Object();
                Executors.newFixedThreadPool(4, new b());
                break;
            default:
                this.f3532d = new C0301a(1);
                break;
        }
    }

    public static C0301a u() {
        if (f3531e != null) {
            return f3531e;
        }
        synchronized (C0301a.class) {
            try {
                if (f3531e == null) {
                    f3531e = new C0301a(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f3531e;
    }
}
