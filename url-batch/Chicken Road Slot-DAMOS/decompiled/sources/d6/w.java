package d6;

import java.util.HashMap;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: e, reason: collision with root package name */
    public static final String f3680e = t5.o.f("WorkTimer");

    /* renamed from: a, reason: collision with root package name */
    public final l.d f3681a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f3682b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f3683c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final Object f3684d = new Object();

    public w(l.d dVar) {
        this.f3681a = dVar;
    }

    public final void a(c6.j jVar) {
        synchronized (this.f3684d) {
            try {
                if (((v) this.f3682b.remove(jVar)) != null) {
                    t5.o.d().a(f3680e, "Stopping timer for " + jVar);
                    this.f3683c.remove(jVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
