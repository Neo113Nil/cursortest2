package R;

import B.C0000a;
import I.C0143d;
import I.C0159l;
import I.C0167p;
import I.C0173s0;
import R1.y;
import e2.InterfaceC0424c;
import java.util.LinkedHashMap;
import java.util.Map;
import z.C1256t;

/* loaded from: classes.dex */
public final class i implements c {

    /* renamed from: d, reason: collision with root package name */
    public static final C1256t f4026d;

    /* renamed from: a, reason: collision with root package name */
    public final Map f4027a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f4028b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public k f4029c;

    static {
        d dVar = d.f4009f;
        e eVar = e.f4012f;
        C1256t c1256t = o.f4037a;
        f4026d = new C1256t(dVar, 6, eVar);
    }

    public i(Map map) {
        this.f4027a = map;
    }

    @Override // R.c
    public final void a(Object obj) {
        f fVar = (f) this.f4028b.get(obj);
        if (fVar != null) {
            fVar.f4016b = false;
        } else {
            this.f4027a.remove(obj);
        }
    }

    @Override // R.c
    public final void e(Object obj, Q.a aVar, C0167p c0167p, int i3) {
        int i4;
        c0167p.S(-1198538093);
        if ((i3 & 6) == 0) {
            i4 = (c0167p.h(obj) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0167p.h(aVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0167p.h(this) ? 256 : 128;
        }
        if ((i4 & 147) == 146 && c0167p.x()) {
            c0167p.L();
        } else {
            c0167p.T(obj);
            Object G3 = c0167p.G();
            Object obj2 = C0159l.f2829a;
            if (G3 == obj2) {
                k kVar = this.f4029c;
                if (!(kVar != null ? kVar.b(obj) : true)) {
                    throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
                }
                G3 = new f(this, obj);
                c0167p.a0(G3);
            }
            f fVar = (f) G3;
            C0143d.a(m.f4036a.a(fVar.f4017c), aVar, c0167p, (i4 & 112) | 8);
            y yVar = y.f4171a;
            boolean h3 = c0167p.h(this) | c0167p.h(obj) | c0167p.h(fVar);
            Object G4 = c0167p.G();
            if (h3 || G4 == obj2) {
                G4 = new h(this, obj, fVar, 0);
                c0167p.a0(G4);
            }
            C0143d.c(yVar, (InterfaceC0424c) G4, c0167p);
            if (c0167p.f2888x && c0167p.f2854F.f2663i == c0167p.f2889y) {
                c0167p.f2889y = -1;
                c0167p.f2888x = false;
            }
            c0167p.p(false);
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new C0000a(this, obj, aVar, i3, 2);
        }
    }
}
