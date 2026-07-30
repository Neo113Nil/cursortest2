package l0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public class c extends e6.e {

    /* renamed from: h, reason: collision with root package name */
    public static final c f5746h = new c(k.f5761e, 0);

    /* renamed from: f, reason: collision with root package name */
    public final k f5747f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5748g;

    public c(k kVar, int i7) {
        this.f5747f = kVar;
        this.f5748g = i7;
    }

    public final c a(Object obj, m0.a aVar) {
        l.i u8 = this.f5747f.u(obj != null ? obj.hashCode() : 0, 0, obj, aVar);
        return u8 == null ? this : new c((k) u8.f5526c, this.f5748g + u8.f5525b);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f5747f.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.f5747f.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }
}
