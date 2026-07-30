package androidx.compose.ui.draw;

import a0.m;
import m2.e;
import n.f;
import r1.a1;
import r1.s0;
import r6.k;
import s0.n;
import s1.l0;
import z0.o;
import z0.p0;
import z0.u;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class ShadowGraphicsLayerElement extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public final p0 f703a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f704b;

    /* renamed from: c, reason: collision with root package name */
    public final long f705c;

    /* renamed from: d, reason: collision with root package name */
    public final long f706d;

    public ShadowGraphicsLayerElement(p0 p0Var, boolean z8, long j8, long j9) {
        float f9 = f.f6478a;
        this.f703a = p0Var;
        this.f704b = z8;
        this.f705c = j8;
        this.f706d = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShadowGraphicsLayerElement)) {
            return false;
        }
        ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) obj;
        float f9 = f.f6481d;
        return e.a(f9, f9) && k.a(this.f703a, shadowGraphicsLayerElement.f703a) && this.f704b == shadowGraphicsLayerElement.f704b && u.c(this.f705c, shadowGraphicsLayerElement.f705c) && u.c(this.f706d, shadowGraphicsLayerElement.f706d);
    }

    public final int hashCode() {
        int e9 = m.e((this.f703a.hashCode() + (Float.hashCode(f.f6481d) * 31)) * 31, 31, this.f704b);
        int i7 = u.f10058h;
        return Long.hashCode(this.f706d) + m.d(e9, 31, this.f705c);
    }

    @Override // r1.s0
    public final n l() {
        return new o(new l0(11, this));
    }

    @Override // r1.s0
    public final void m(n nVar) {
        o oVar = (o) nVar;
        oVar.f10029s = new l0(11, this);
        a1 a1Var = r1.f.r(oVar, 2).f7701r;
        if (a1Var != null) {
            a1Var.h1(oVar.f10029s, true);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        sb.append((Object) e.e(f.f6481d));
        sb.append(", shape=");
        sb.append(this.f703a);
        sb.append(", clip=");
        sb.append(this.f704b);
        sb.append(", ambientColor=");
        m.r(this.f705c, sb, ", spotColor=");
        sb.append((Object) u.i(this.f706d));
        sb.append(')');
        return sb.toString();
    }
}
