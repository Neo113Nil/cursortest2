package m;

import i1.q;
import java.util.concurrent.Executors;

/* renamed from: m.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0275a extends q {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0275a f3188c;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3189b;

    public C0275a(int i) {
        switch (i) {
            case 1:
                this.f3189b = new Object();
                Executors.newFixedThreadPool(4, new b());
                break;
            default:
                this.f3189b = new C0275a(1);
                break;
        }
    }

    public static C0275a l() {
        if (f3188c != null) {
            return f3188c;
        }
        synchronized (C0275a.class) {
            try {
                if (f3188c == null) {
                    f3188c = new C0275a(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f3188c;
    }
}
