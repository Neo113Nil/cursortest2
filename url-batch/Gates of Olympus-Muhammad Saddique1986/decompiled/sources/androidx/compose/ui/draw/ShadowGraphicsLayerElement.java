package androidx.compose.ui.draw;

import A.k;
import A0.l;
import O0.e;
import U.p;
import b0.C0346o;
import b0.C0352v;
import b0.Q;
import o.j;
import t0.AbstractC0993f;
import t0.U;
import t0.b0;

/* loaded from: classes.dex */
public final class ShadowGraphicsLayerElement extends U {

    /* renamed from: a, reason: collision with root package name */
    public final Q f4891a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4892b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4893c;

    /* renamed from: d, reason: collision with root package name */
    public final long f4894d;

    public ShadowGraphicsLayerElement(Q q3, boolean z3, long j3, long j4) {
        float f3 = j.f7403a;
        this.f4891a = q3;
        this.f4892b = z3;
        this.f4893c = j3;
        this.f4894d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShadowGraphicsLayerElement)) {
            return false;
        }
        ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) obj;
        shadowGraphicsLayerElement.getClass();
        float f3 = j.f7406d;
        return e.a(f3, f3) && f2.j.a(this.f4891a, shadowGraphicsLayerElement.f4891a) && this.f4892b == shadowGraphicsLayerElement.f4892b && C0352v.c(this.f4893c, shadowGraphicsLayerElement.f4893c) && C0352v.c(this.f4894d, shadowGraphicsLayerElement.f4894d);
    }

    public final int hashCode() {
        int e3 = k.e((this.f4891a.hashCode() + (Float.hashCode(j.f7406d) * 31)) * 31, 31, this.f4892b);
        int i3 = C0352v.f5440h;
        return Long.hashCode(this.f4894d) + k.c(e3, 31, this.f4893c);
    }

    @Override // t0.U
    public final p l() {
        return new C0346o(new l(15, this));
    }

    @Override // t0.U
    public final void m(p pVar) {
        C0346o c0346o = (C0346o) pVar;
        c0346o.f5428q = new l(15, this);
        b0 b0Var = AbstractC0993f.r(c0346o, 2).f8712p;
        if (b0Var != null) {
            b0Var.f1(c0346o.f5428q, true);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        sb.append((Object) e.b(j.f7406d));
        sb.append(", shape=");
        sb.append(this.f4891a);
        sb.append(", clip=");
        sb.append(this.f4892b);
        sb.append(", ambientColor=");
        k.p(this.f4893c, sb, ", spotColor=");
        sb.append((Object) C0352v.i(this.f4894d));
        sb.append(')');
        return sb.toString();
    }
}
