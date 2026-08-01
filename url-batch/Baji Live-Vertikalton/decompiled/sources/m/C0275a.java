package m;

import i1.p;
import java.util.concurrent.Executors;

/* renamed from: m.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0275a extends p {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0275a f3165c;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3166b;

    public C0275a(int i) {
        switch (i) {
            case 1:
                this.f3166b = new Object();
                Executors.newFixedThreadPool(4, new b());
                break;
            default:
                this.f3166b = new C0275a(1);
                break;
        }
    }

    public static C0275a l() {
        if (f3165c != null) {
            return f3165c;
        }
        synchronized (C0275a.class) {
            try {
                if (f3165c == null) {
                    f3165c = new C0275a(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f3165c;
    }
}
