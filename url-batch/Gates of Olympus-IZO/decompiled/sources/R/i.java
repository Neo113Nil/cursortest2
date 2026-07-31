package R;

import I.C0089d;
import I.C0105l;
import I.C0113p;
import I.C0119s0;
import L1.z;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class i implements c {

    /* renamed from: d, reason: collision with root package name */
    public static final C2.c f3153d;

    /* renamed from: a, reason: collision with root package name */
    public final Map f3154a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f3155b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public k f3156c;

    static {
        d dVar = d.f3136f;
        e eVar = e.f3139f;
        C2.c cVar = o.f3164a;
        f3153d = new C2.c(dVar, 3, eVar);
    }

    public i(Map map) {
        this.f3154a = map;
    }

    @Override // R.c
    public final void b(Object obj) {
        f fVar = (f) this.f3155b.get(obj);
        if (fVar != null) {
            fVar.f3143b = false;
        } else {
            this.f3154a.remove(obj);
        }
    }

    @Override // R.c
    public final void e(Object obj, Q.a aVar, C0113p c0113p, int i3) {
        int i4;
        c0113p.S(-1198538093);
        if ((i3 & 6) == 0) {
            i4 = (c0113p.h(obj) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0113p.h(aVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0113p.h(this) ? 256 : 128;
        }
        if ((i4 & 147) == 146 && c0113p.x()) {
            c0113p.L();
        } else {
            c0113p.T(obj);
            Object G3 = c0113p.G();
            Object obj2 = C0105l.f2272a;
            if (G3 == obj2) {
                k kVar = this.f3156c;
                if (!(kVar != null ? kVar.c(obj) : true)) {
                    throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
                }
                G3 = new f(this, obj);
                c0113p.a0(G3);
            }
            f fVar = (f) G3;
            C0089d.a(m.f3163a.a(fVar.f3144c), aVar, c0113p, (i4 & 112) | 8);
            z zVar = z.f2729a;
            boolean h3 = c0113p.h(this) | c0113p.h(obj) | c0113p.h(fVar);
            Object G4 = c0113p.G();
            if (h3 || G4 == obj2) {
                G4 = new h(this, obj, fVar, 0);
                c0113p.a0(G4);
            }
            C0089d.c(zVar, (Y1.c) G4, c0113p);
            if (c0113p.f2329x && c0113p.f2296F.f2109i == c0113p.f2330y) {
                c0113p.f2330y = -1;
                c0113p.f2329x = false;
            }
            c0113p.p(false);
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new P0.d(this, obj, aVar, i3, 2);
        }
    }
}
