package N;

import M1.AbstractC0144e;

/* loaded from: classes.dex */
public class c extends AbstractC0144e {

    /* renamed from: f, reason: collision with root package name */
    public static final c f2820f = new c(m.f2839e, 0);

    /* renamed from: d, reason: collision with root package name */
    public final m f2821d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2822e;

    public c(m mVar, int i3) {
        this.f2821d = mVar;
        this.f2822e = i3;
    }

    public final c a(Object obj, O.a aVar) {
        E2.n u3 = this.f2821d.u(obj != null ? obj.hashCode() : 0, 0, obj, aVar);
        return u3 == null ? this : new c((m) u3.f844c, this.f2822e + u3.f843b);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f2821d.d(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.f2821d.g(obj != null ? obj.hashCode() : 0, obj, 0);
    }
}
