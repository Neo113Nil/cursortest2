package D;

import a.AbstractC0345a;
import l.C0778d;
import p.C0935k;
import p0.AbstractC0954O;
import p0.InterfaceC0944E;
import p0.InterfaceC0946G;
import p0.InterfaceC0947H;
import r0.InterfaceC1081w;
import z2.C1412P;

/* loaded from: classes.dex */
public final class S1 extends S.n implements InterfaceC1081w {

    /* renamed from: t, reason: collision with root package name */
    public C0935k f1619t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1620u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1621v;

    /* renamed from: w, reason: collision with root package name */
    public C0778d f1622w;

    /* renamed from: x, reason: collision with root package name */
    public C0778d f1623x;

    /* renamed from: y, reason: collision with root package name */
    public float f1624y;

    /* renamed from: z, reason: collision with root package name */
    public float f1625z;

    @Override // r0.InterfaceC1081w
    public final InterfaceC0946G i(InterfaceC0947H interfaceC0947H, InterfaceC0944E interfaceC0944E, long j4) {
        InterfaceC0946G t4;
        boolean z4 = false;
        float L3 = interfaceC0947H.L(this.f1621v ? F.t.f2506a : ((interfaceC0944E.b(M0.a.i(j4)) != 0 && interfaceC0944E.X(M0.a.h(j4)) != 0) || this.f1620u) ? androidx.compose.material3.a.f5150a : androidx.compose.material3.a.f5151b);
        C0778d c0778d = this.f1623x;
        int floatValue = (int) (c0778d != null ? ((Number) c0778d.d()).floatValue() : L3);
        if (floatValue >= 0 && floatValue >= 0) {
            z4 = true;
        }
        if (!z4) {
            AbstractC0345a.I("width(" + floatValue + ") and height(" + floatValue + ") must be >= 0");
            throw null;
        }
        AbstractC0954O a4 = interfaceC0944E.a(u3.d.t(floatValue, floatValue, floatValue, floatValue));
        float L4 = interfaceC0947H.L((androidx.compose.material3.a.f5153d - interfaceC0947H.k0(L3)) / 2.0f);
        float L5 = interfaceC0947H.L((androidx.compose.material3.a.f5152c - androidx.compose.material3.a.f5150a) - androidx.compose.material3.a.f5154e);
        boolean z5 = this.f1621v;
        if (z5 && this.f1620u) {
            L4 = L5 - interfaceC0947H.L(F.t.f2510e);
        } else if (z5 && !this.f1620u) {
            L4 = interfaceC0947H.L(F.t.f2510e);
        } else if (this.f1620u) {
            L4 = L5;
        }
        C0778d c0778d2 = this.f1623x;
        Float f4 = c0778d2 != null ? (Float) c0778d2.f7702e.getValue() : null;
        if (f4 == null || f4.floatValue() != L3) {
            W2.B.m(p0(), null, null, new O1(this, L3, null), 3);
        }
        C0778d c0778d3 = this.f1622w;
        Float f5 = c0778d3 != null ? (Float) c0778d3.f7702e.getValue() : null;
        if (f5 == null || f5.floatValue() != L4) {
            W2.B.m(p0(), null, null, new P1(this, L4, null), 3);
        }
        if (Float.isNaN(this.f1625z) && Float.isNaN(this.f1624y)) {
            this.f1625z = L3;
            this.f1624y = L4;
        }
        t4 = interfaceC0947H.t(floatValue, floatValue, C1412P.c(), new Q1(a4, this, L4));
        return t4;
    }

    @Override // S.n
    public final boolean q0() {
        return false;
    }

    @Override // S.n
    public final void t0() {
        W2.B.m(p0(), null, null, new R1(this, null), 3);
    }
}
