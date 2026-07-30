package p0;

import d6.z;
import g0.p;
import g0.p1;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g implements c {

    /* renamed from: d, reason: collision with root package name */
    public static final androidx.room.c f7002d;

    /* renamed from: a, reason: collision with root package name */
    public final Map f7003a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f7004b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public i f7005c;

    static {
        d dVar = d.f6993h;
        e eVar = e.f6996h;
        androidx.room.c cVar = m.f7013a;
        f7002d = new androidx.room.c(dVar, 28, eVar);
    }

    public g(Map map) {
        this.f7003a = map;
    }

    @Override // p0.c
    public final void c(Object obj) {
        f fVar = (f) this.f7004b.get(obj);
        if (fVar != null) {
            fVar.f7000b = false;
        } else {
            this.f7003a.remove(obj);
        }
    }

    @Override // p0.c
    public final void e(Object obj, o0.a aVar, p pVar, int i7) {
        int i8;
        pVar.S(-1198538093);
        if ((i7 & 6) == 0) {
            i8 = (pVar.h(obj) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= pVar.h(aVar) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= pVar.h(this) ? 256 : 128;
        }
        if ((i8 & 147) == 146 && pVar.x()) {
            pVar.L();
        } else {
            pVar.T(obj);
            Object G = pVar.G();
            Object obj2 = g0.l.f3784a;
            if (G == obj2) {
                i iVar = this.f7005c;
                if (!(iVar != null ? iVar.a(obj) : true)) {
                    throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
                }
                G = new f(this, obj);
                pVar.a0(G);
            }
            f fVar = (f) G;
            g0.d.a(k.f7012a.a(fVar.f7001c), aVar, pVar, (i8 & 112) | 8);
            boolean h3 = pVar.h(this) | pVar.h(obj) | pVar.h(fVar);
            Object G2 = pVar.G();
            if (h3 || G2 == obj2) {
                G2 = new c.h(this, obj, fVar, 5);
                pVar.a0(G2);
            }
            g0.d.d(z.f2639a, (q6.c) G2, pVar);
            if (pVar.f3843x && pVar.F.f3966i == pVar.f3844y) {
                pVar.f3844y = -1;
                pVar.f3843x = false;
            }
            pVar.p(false);
        }
        p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new a0.a(this, obj, aVar, i7, 4);
        }
    }
}
