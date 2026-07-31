package e7;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final g6.c[] f2543a = new g6.c[0];

    /* renamed from: b, reason: collision with root package name */
    public static final d4.t f2544b = new d4.t("NULL", 1);

    public static final Object a(g6.h hVar, Object obj, Object obj2, p6.e eVar, g6.c cVar) {
        Object g3;
        Object l3 = f7.a.l(hVar, obj2);
        try {
            u uVar = new u(cVar, hVar);
            if (eVar == null) {
                g3 = m.a.S(eVar, obj, uVar);
            } else {
                q6.v.c(2, eVar);
                g3 = eVar.g(obj, uVar);
            }
            f7.a.g(hVar, l3);
            if (g3 == h6.a.f3204d) {
                q6.i.e(cVar, "frame");
            }
            return g3;
        } catch (Throwable th) {
            f7.a.g(hVar, l3);
            throw th;
        }
    }
}
