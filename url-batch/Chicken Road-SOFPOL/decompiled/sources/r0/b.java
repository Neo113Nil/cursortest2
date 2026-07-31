package r0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class b extends d6.f {

    /* renamed from: f, reason: collision with root package name */
    public static final b f6473f = new b(j.f6488e, 0);

    /* renamed from: d, reason: collision with root package name */
    public final j f6474d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6475e;

    public b(j jVar, int i) {
        this.f6474d = jVar;
        this.f6475e = i;
    }

    public final b a(Object obj, s0.a aVar) {
        k5.e u7 = this.f6474d.u(obj != null ? obj.hashCode() : 0, 0, obj, aVar);
        return u7 == null ? this : new b((j) u7.f4190e, this.f6475e + u7.f4189d);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f6474d.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.f6474d.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }
}
