package C0;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: e, reason: collision with root package name */
    public static final String f380e = s0.s.f("WorkTimer");

    /* renamed from: a, reason: collision with root package name */
    public final U.e f381a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f382b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f383c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final Object f384d = new Object();

    public z(U.e eVar) {
        this.f381a = eVar;
    }

    public final void a(B0.j jVar) {
        synchronized (this.f384d) {
            try {
                if (((y) this.f382b.remove(jVar)) != null) {
                    s0.s.d().a(f380e, "Stopping timer for " + jVar);
                    this.f383c.remove(jVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
