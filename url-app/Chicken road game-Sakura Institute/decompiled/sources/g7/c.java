package g7;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final h6.d[] f4480a = new h6.d[0];

    /* renamed from: b, reason: collision with root package name */
    public static final h7.s f4481b = new h7.s("NULL", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final h7.s f4482c = new h7.s("UNINITIALIZED", 0);

    public static final Object a(h6.i iVar, Object obj, Object obj2, q6.e eVar, h6.d dVar) {
        Object d8;
        Object l8 = h7.a.l(iVar, obj2);
        try {
            z zVar = new z(dVar, iVar);
            if (eVar == null) {
                d8 = a8.m.N(eVar, obj, zVar);
            } else {
                r6.y.d(2, eVar);
                d8 = eVar.d(obj, zVar);
            }
            h7.a.g(iVar, l8);
            if (d8 == i6.a.f4956f) {
                r6.k.f(dVar, "frame");
            }
            return d8;
        } catch (Throwable th) {
            h7.a.g(iVar, l8);
            throw th;
        }
    }
}
