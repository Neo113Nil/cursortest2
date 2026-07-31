package m;

import I.C0089d;
import I.C0102j0;
import I.C0105l;
import I.C0113p;
import I.C0119s0;
import I.InterfaceC0088c0;

/* renamed from: m.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0583H {

    /* renamed from: a, reason: collision with root package name */
    public final K.d f5582a = new K.d(new C0580E[16]);

    /* renamed from: b, reason: collision with root package name */
    public final C0102j0 f5583b;

    /* renamed from: c, reason: collision with root package name */
    public long f5584c;

    /* renamed from: d, reason: collision with root package name */
    public final C0102j0 f5585d;

    public C0583H() {
        Boolean bool = Boolean.FALSE;
        I.X x3 = I.X.f2228i;
        this.f5583b = C0089d.J(bool, x3);
        this.f5584c = Long.MIN_VALUE;
        this.f5585d = C0089d.J(Boolean.TRUE, x3);
    }

    public final void a(int i3, C0113p c0113p) {
        int i4;
        c0113p.S(-318043801);
        if ((i3 & 6) == 0) {
            i4 = (c0113p.h(this) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i4 & 3) == 2 && c0113p.x()) {
            c0113p.L();
        } else {
            Object G3 = c0113p.G();
            I.X x3 = C0105l.f2272a;
            if (G3 == x3) {
                G3 = C0089d.J(null, I.X.f2228i);
                c0113p.a0(G3);
            }
            InterfaceC0088c0 interfaceC0088c0 = (InterfaceC0088c0) G3;
            if (((Boolean) this.f5585d.getValue()).booleanValue() || ((Boolean) this.f5583b.getValue()).booleanValue()) {
                c0113p.Q(1719915818);
                boolean h3 = c0113p.h(this);
                Object G4 = c0113p.G();
                if (h3 || G4 == x3) {
                    G4 = new C0582G(interfaceC0088c0, this, null);
                    c0113p.a0(G4);
                }
                C0089d.e(c0113p, (Y1.e) G4, this);
                c0113p.p(false);
            } else {
                c0113p.Q(1721436120);
                c0113p.p(false);
            }
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new P0.m(this, i3, 1);
        }
    }
}
