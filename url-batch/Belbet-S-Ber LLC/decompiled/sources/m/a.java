package m;

import b4.d;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class a extends d {

    /* renamed from: p, reason: collision with root package name */
    public static volatile a f2719p;

    /* renamed from: o, reason: collision with root package name */
    public final Object f2720o;

    public a(int i) {
        switch (i) {
            case 1:
                this.f2720o = new Object();
                Executors.newFixedThreadPool(4, new b());
                break;
            default:
                this.f2720o = new a(1);
                break;
        }
    }

    public static a Z() {
        if (f2719p != null) {
            return f2719p;
        }
        synchronized (a.class) {
            try {
                if (f2719p == null) {
                    f2719p = new a(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f2719p;
    }
}
