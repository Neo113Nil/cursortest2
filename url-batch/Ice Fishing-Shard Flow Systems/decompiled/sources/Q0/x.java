package Q0;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: e, reason: collision with root package name */
    public static final String f2347e = G0.s.f("WorkTimer");

    /* renamed from: a, reason: collision with root package name */
    public final l2.c f2348a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f2349b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f2350c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final Object f2351d = new Object();

    public x(l2.c cVar) {
        this.f2348a = cVar;
    }

    public final void a(P0.j jVar) {
        synchronized (this.f2351d) {
            try {
                if (((w) this.f2349b.remove(jVar)) != null) {
                    G0.s.d().a(f2347e, "Stopping timer for " + jVar);
                    this.f2350c.remove(jVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
