package androidx.compose.ui.graphics;

import a0.q;
import b1.e;
import f1.i0;
import f1.j0;
import f1.l0;
import f1.p;
import f1.s;
import q6.i;
import w1.d1;
import w1.f;
import w1.x0;
import y0.l;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
final class GraphicsLayerElement extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f545a;

    /* renamed from: b, reason: collision with root package name */
    public final float f546b;

    /* renamed from: c, reason: collision with root package name */
    public final float f547c;

    /* renamed from: d, reason: collision with root package name */
    public final float f548d;

    /* renamed from: e, reason: collision with root package name */
    public final long f549e;

    /* renamed from: f, reason: collision with root package name */
    public final i0 f550f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f551g;

    /* renamed from: h, reason: collision with root package name */
    public final long f552h;
    public final long i;

    public GraphicsLayerElement(float f6, float f8, float f9, float f10, long j7, i0 i0Var, boolean z3, long j8, long j9) {
        this.f545a = f6;
        this.f546b = f8;
        this.f547c = f9;
        this.f548d = f10;
        this.f549e = j7;
        this.f550f = i0Var;
        this.f551g = z3;
        this.f552h = j8;
        this.i = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
        return Float.compare(this.f545a, graphicsLayerElement.f545a) == 0 && Float.compare(this.f546b, graphicsLayerElement.f546b) == 0 && Float.compare(this.f547c, graphicsLayerElement.f547c) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.f548d, graphicsLayerElement.f548d) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(8.0f, 8.0f) == 0 && l0.a(this.f549e, graphicsLayerElement.f549e) && i.a(this.f550f, graphicsLayerElement.f550f) && this.f551g == graphicsLayerElement.f551g && s.c(this.f552h, graphicsLayerElement.f552h) && s.c(this.i, graphicsLayerElement.i);
    }

    @Override // w1.x0
    public final l f() {
        j0 j0Var = new j0();
        j0Var.f2672r = this.f545a;
        j0Var.f2673s = this.f546b;
        j0Var.f2674t = this.f547c;
        j0Var.f2675u = this.f548d;
        j0Var.f2676v = 8.0f;
        j0Var.f2677w = this.f549e;
        j0Var.f2678x = this.f550f;
        j0Var.f2679y = this.f551g;
        j0Var.f2680z = this.f552h;
        j0Var.A = this.i;
        j0Var.B = 3;
        j0Var.C = new e(6, j0Var);
        return j0Var;
    }

    @Override // w1.x0
    public final void g(l lVar) {
        j0 j0Var = (j0) lVar;
        j0Var.f2672r = this.f545a;
        j0Var.f2673s = this.f546b;
        j0Var.f2674t = this.f547c;
        j0Var.f2675u = this.f548d;
        j0Var.f2676v = 8.0f;
        j0Var.f2677w = this.f549e;
        j0Var.f2678x = this.f550f;
        j0Var.f2679y = this.f551g;
        j0Var.f2680z = this.f552h;
        j0Var.A = this.i;
        j0Var.B = 3;
        d1 d1Var = f.s(j0Var, 2).f7615s;
        if (d1Var != null) {
            d1Var.b1(j0Var.C, true);
        }
    }

    public final int hashCode() {
        int a8 = q.a(8.0f, q.a(0.0f, q.a(0.0f, q.a(0.0f, q.a(this.f548d, q.a(0.0f, q.a(0.0f, q.a(this.f547c, q.a(this.f546b, Float.hashCode(this.f545a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i = l0.f2684c;
        int d8 = q.d((this.f550f.hashCode() + q.c(a8, 31, this.f549e)) * 31, 961, this.f551g);
        int i8 = s.i;
        return q.b(3, q.b(0, q.c(q.c(d8, 31, this.f552h), 31, this.i), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicsLayerElement(scaleX=");
        sb.append(this.f545a);
        sb.append(", scaleY=");
        sb.append(this.f546b);
        sb.append(", alpha=");
        sb.append(this.f547c);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.f548d);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=8.0, transformOrigin=");
        sb.append((Object) l0.d(this.f549e));
        sb.append(", shape=");
        sb.append(this.f550f);
        sb.append(", clip=");
        sb.append(this.f551g);
        sb.append(", renderEffect=null, ambientShadowColor=");
        q.o(this.f552h, sb, ", spotShadowColor=");
        sb.append((Object) s.i(this.i));
        sb.append(", compositingStrategy=CompositingStrategy(value=0), blendMode=");
        sb.append((Object) p.y(3));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }
}
