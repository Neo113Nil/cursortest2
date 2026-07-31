package F;

import H2.AbstractC0080b;
import I.C0089d;
import I.C0105l;
import I.C0113p;
import I.InterfaceC0088c0;
import m.C0593d;
import m.C0603m;
import q.C0767b;
import q.C0769d;
import q.C0771f;

/* renamed from: F.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0073x {

    /* renamed from: a, reason: collision with root package name */
    public final float f1412a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1413b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1414c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1415d;

    /* renamed from: e, reason: collision with root package name */
    public final float f1416e;

    /* renamed from: f, reason: collision with root package name */
    public final float f1417f;

    public C0073x(float f3, float f4, float f5, float f6, float f7, float f8) {
        this.f1412a = f3;
        this.f1413b = f4;
        this.f1414c = f5;
        this.f1415d = f6;
        this.f1416e = f7;
        this.f1417f = f8;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final I.X0 a(boolean z3, q.j jVar, C0113p c0113p, int i3) {
        float f3;
        Object G3;
        boolean h3;
        Object G4;
        c0113p.Q(-1763481333);
        c0113p.Q(-734838460);
        Object obj = C0105l.f2272a;
        float f4 = this.f1412a;
        if (jVar == null) {
            Object G5 = c0113p.G();
            if (G5 == obj) {
                G5 = C0089d.J(new M0.e(f4), I.X.f2228i);
                c0113p.a0(G5);
            }
            InterfaceC0088c0 interfaceC0088c0 = (InterfaceC0088c0) G5;
            c0113p.p(false);
            c0113p.p(false);
            return interfaceC0088c0;
        }
        c0113p.p(false);
        Object G6 = c0113p.G();
        if (G6 == obj) {
            G6 = new S.t();
            c0113p.a0(G6);
        }
        S.t tVar = (S.t) G6;
        boolean z4 = true;
        boolean z5 = (((i3 & 112) ^ 48) > 32 && c0113p.f(jVar)) || (i3 & 48) == 32;
        Object G7 = c0113p.G();
        if (z5 || G7 == obj) {
            G7 = new C0069v(jVar, tVar, null);
            c0113p.a0(G7);
        }
        C0089d.e(c0113p, (Y1.e) G7, jVar);
        q.h hVar = (q.h) M1.l.t0(tVar);
        if (!z3) {
            f3 = this.f1417f;
        } else if (hVar instanceof q.l) {
            f3 = this.f1413b;
        } else if (hVar instanceof C0771f) {
            f3 = this.f1415d;
        } else {
            if (!(hVar instanceof C0769d)) {
                if (hVar instanceof C0767b) {
                    f3 = this.f1416e;
                }
                G3 = c0113p.G();
                if (G3 == obj) {
                    G3 = new C0593d(new M0.e(f4), m.z0.f5887c, null, 12);
                    c0113p.a0(G3);
                }
                C0593d c0593d = (C0593d) G3;
                M0.e eVar = new M0.e(f4);
                boolean h4 = c0113p.h(c0593d) | c0113p.c(f4) | ((((i3 & 14) ^ 6) <= 4 && c0113p.g(z3)) || (i3 & 6) == 4);
                if ((((i3 & 896) ^ 384) > 256 || !c0113p.f(this)) && (i3 & 384) != 256) {
                    z4 = false;
                }
                h3 = h4 | z4 | c0113p.h(hVar);
                G4 = c0113p.G();
                if (!h3 || G4 == obj) {
                    Object c0071w = new C0071w(c0593d, f4, z3, this, hVar, null);
                    c0113p.a0(c0071w);
                    G4 = c0071w;
                }
                C0089d.e(c0113p, (Y1.e) G4, eVar);
                C0603m c0603m = c0593d.f5704c;
                c0113p.p(false);
                return c0603m;
            }
            f3 = this.f1414c;
        }
        f4 = f3;
        G3 = c0113p.G();
        if (G3 == obj) {
        }
        C0593d c0593d2 = (C0593d) G3;
        M0.e eVar2 = new M0.e(f4);
        boolean h42 = c0113p.h(c0593d2) | c0113p.c(f4) | ((((i3 & 14) ^ 6) <= 4 && c0113p.g(z3)) || (i3 & 6) == 4);
        if (((i3 & 896) ^ 384) > 256) {
        }
        z4 = false;
        h3 = h42 | z4 | c0113p.h(hVar);
        G4 = c0113p.G();
        if (!h3) {
        }
        Object c0071w2 = new C0071w(c0593d2, f4, z3, this, hVar, null);
        c0113p.a0(c0071w2);
        G4 = c0071w2;
        C0089d.e(c0113p, (Y1.e) G4, eVar2);
        C0603m c0603m2 = c0593d2.f5704c;
        c0113p.p(false);
        return c0603m2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0073x)) {
            return false;
        }
        C0073x c0073x = (C0073x) obj;
        return M0.e.a(this.f1412a, c0073x.f1412a) && M0.e.a(this.f1413b, c0073x.f1413b) && M0.e.a(this.f1414c, c0073x.f1414c) && M0.e.a(this.f1415d, c0073x.f1415d) && M0.e.a(this.f1417f, c0073x.f1417f);
    }

    public final int hashCode() {
        return Float.hashCode(this.f1417f) + AbstractC0080b.a(this.f1415d, AbstractC0080b.a(this.f1414c, AbstractC0080b.a(this.f1413b, Float.hashCode(this.f1412a) * 31, 31), 31), 31);
    }
}
