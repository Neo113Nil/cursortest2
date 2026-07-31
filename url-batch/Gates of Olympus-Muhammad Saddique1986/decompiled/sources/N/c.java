package N;

/* loaded from: classes.dex */
public class c extends S1.e {

    /* renamed from: f, reason: collision with root package name */
    public static final c f3502f = new c(m.f3521e, 0);

    /* renamed from: d, reason: collision with root package name */
    public final m f3503d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3504e;

    public c(m mVar, int i3) {
        this.f3503d = mVar;
        this.f3504e = i3;
    }

    public final c a(Object obj, O.a aVar) {
        K2.m u3 = this.f3503d.u(obj != null ? obj.hashCode() : 0, 0, obj, aVar);
        return u3 == null ? this : new c((m) u3.f3331c, this.f3504e + u3.f3330b);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f3503d.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.f3503d.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }
}
