package androidx.compose.ui.graphics;

import a0.m;
import r1.a1;
import r1.f;
import r1.s0;
import r6.k;
import s0.n;
import s1.l0;
import z0.p0;
import z0.q0;
import z0.u;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
final class GraphicsLayerElement extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f722a;

    /* renamed from: b, reason: collision with root package name */
    public final float f723b;

    /* renamed from: c, reason: collision with root package name */
    public final long f724c;

    /* renamed from: d, reason: collision with root package name */
    public final p0 f725d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f726e;

    /* renamed from: f, reason: collision with root package name */
    public final long f727f;

    /* renamed from: g, reason: collision with root package name */
    public final long f728g;

    public GraphicsLayerElement(float f9, float f10, long j8, p0 p0Var, boolean z8, long j9, long j10) {
        this.f722a = f9;
        this.f723b = f10;
        this.f724c = j8;
        this.f725d = p0Var;
        this.f726e = z8;
        this.f727f = j9;
        this.f728g = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
        return Float.compare(1.0f, 1.0f) == 0 && Float.compare(1.0f, 1.0f) == 0 && Float.compare(this.f722a, graphicsLayerElement.f722a) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.f723b, graphicsLayerElement.f723b) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(8.0f, 8.0f) == 0 && z0.s0.a(this.f724c, graphicsLayerElement.f724c) && k.a(this.f725d, graphicsLayerElement.f725d) && this.f726e == graphicsLayerElement.f726e && u.c(this.f727f, graphicsLayerElement.f727f) && u.c(this.f728g, graphicsLayerElement.f728g);
    }

    public final int hashCode() {
        int a3 = m.a(8.0f, m.a(0.0f, m.a(0.0f, m.a(0.0f, m.a(this.f723b, m.a(0.0f, m.a(0.0f, m.a(this.f722a, m.a(1.0f, Float.hashCode(1.0f) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i7 = z0.s0.f10048c;
        int e9 = m.e((this.f725d.hashCode() + m.d(a3, 31, this.f724c)) * 31, 961, this.f726e);
        int i8 = u.f10058h;
        return Integer.hashCode(0) + m.d(m.d(e9, 31, this.f727f), 31, this.f728g);
    }

    @Override // r1.s0
    public final n l() {
        q0 q0Var = new q0();
        q0Var.f10037s = 1.0f;
        q0Var.f10038t = 1.0f;
        q0Var.f10039u = this.f722a;
        q0Var.f10040v = this.f723b;
        q0Var.f10041w = 8.0f;
        q0Var.f10042x = this.f724c;
        q0Var.f10043y = this.f725d;
        q0Var.f10044z = this.f726e;
        q0Var.A = this.f727f;
        q0Var.B = this.f728g;
        q0Var.C = new l0(16, q0Var);
        return q0Var;
    }

    @Override // r1.s0
    public final void m(n nVar) {
        q0 q0Var = (q0) nVar;
        q0Var.f10037s = 1.0f;
        q0Var.f10038t = 1.0f;
        q0Var.f10039u = this.f722a;
        q0Var.f10040v = this.f723b;
        q0Var.f10041w = 8.0f;
        q0Var.f10042x = this.f724c;
        q0Var.f10043y = this.f725d;
        q0Var.f10044z = this.f726e;
        q0Var.A = this.f727f;
        q0Var.B = this.f728g;
        a1 a1Var = f.r(q0Var, 2).f7701r;
        if (a1Var != null) {
            a1Var.h1(q0Var.C, true);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicsLayerElement(scaleX=1.0, scaleY=1.0, alpha=");
        sb.append(this.f722a);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.f723b);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=8.0, transformOrigin=");
        sb.append((Object) z0.s0.d(this.f724c));
        sb.append(", shape=");
        sb.append(this.f725d);
        sb.append(", clip=");
        sb.append(this.f726e);
        sb.append(", renderEffect=null, ambientShadowColor=");
        m.r(this.f727f, sb, ", spotShadowColor=");
        sb.append((Object) u.i(this.f728g));
        sb.append(", compositingStrategy=CompositingStrategy(value=0))");
        return sb.toString();
    }
}
