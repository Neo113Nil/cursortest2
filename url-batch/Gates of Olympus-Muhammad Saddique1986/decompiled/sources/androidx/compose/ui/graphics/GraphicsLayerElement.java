package androidx.compose.ui.graphics;

import A.k;
import A0.l;
import U.p;
import b0.C0352v;
import b0.M;
import b0.Q;
import b0.S;
import f2.j;
import t0.AbstractC0993f;
import t0.U;
import t0.b0;

/* loaded from: classes.dex */
final class GraphicsLayerElement extends U {

    /* renamed from: a, reason: collision with root package name */
    public final float f4910a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4911b;

    /* renamed from: c, reason: collision with root package name */
    public final float f4912c;

    /* renamed from: d, reason: collision with root package name */
    public final float f4913d;

    /* renamed from: e, reason: collision with root package name */
    public final float f4914e;

    /* renamed from: f, reason: collision with root package name */
    public final float f4915f;

    /* renamed from: g, reason: collision with root package name */
    public final float f4916g;

    /* renamed from: h, reason: collision with root package name */
    public final float f4917h;

    /* renamed from: i, reason: collision with root package name */
    public final float f4918i;

    /* renamed from: j, reason: collision with root package name */
    public final float f4919j;

    /* renamed from: k, reason: collision with root package name */
    public final long f4920k;

    /* renamed from: l, reason: collision with root package name */
    public final Q f4921l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f4922m;

    /* renamed from: n, reason: collision with root package name */
    public final long f4923n;

    /* renamed from: o, reason: collision with root package name */
    public final long f4924o;

    /* renamed from: p, reason: collision with root package name */
    public final int f4925p;

    public GraphicsLayerElement(float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, long j3, Q q3, boolean z3, long j4, long j5, int i3) {
        this.f4910a = f3;
        this.f4911b = f4;
        this.f4912c = f5;
        this.f4913d = f6;
        this.f4914e = f7;
        this.f4915f = f8;
        this.f4916g = f9;
        this.f4917h = f10;
        this.f4918i = f11;
        this.f4919j = f12;
        this.f4920k = j3;
        this.f4921l = q3;
        this.f4922m = z3;
        this.f4923n = j4;
        this.f4924o = j5;
        this.f4925p = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
        return Float.compare(this.f4910a, graphicsLayerElement.f4910a) == 0 && Float.compare(this.f4911b, graphicsLayerElement.f4911b) == 0 && Float.compare(this.f4912c, graphicsLayerElement.f4912c) == 0 && Float.compare(this.f4913d, graphicsLayerElement.f4913d) == 0 && Float.compare(this.f4914e, graphicsLayerElement.f4914e) == 0 && Float.compare(this.f4915f, graphicsLayerElement.f4915f) == 0 && Float.compare(this.f4916g, graphicsLayerElement.f4916g) == 0 && Float.compare(this.f4917h, graphicsLayerElement.f4917h) == 0 && Float.compare(this.f4918i, graphicsLayerElement.f4918i) == 0 && Float.compare(this.f4919j, graphicsLayerElement.f4919j) == 0 && b0.U.a(this.f4920k, graphicsLayerElement.f4920k) && j.a(this.f4921l, graphicsLayerElement.f4921l) && this.f4922m == graphicsLayerElement.f4922m && j.a(null, null) && C0352v.c(this.f4923n, graphicsLayerElement.f4923n) && C0352v.c(this.f4924o, graphicsLayerElement.f4924o) && M.q(this.f4925p, graphicsLayerElement.f4925p);
    }

    public final int hashCode() {
        int a3 = k.a(this.f4919j, k.a(this.f4918i, k.a(this.f4917h, k.a(this.f4916g, k.a(this.f4915f, k.a(this.f4914e, k.a(this.f4913d, k.a(this.f4912c, k.a(this.f4911b, Float.hashCode(this.f4910a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i3 = b0.U.f5401c;
        int e3 = k.e((this.f4921l.hashCode() + k.c(a3, 31, this.f4920k)) * 31, 961, this.f4922m);
        int i4 = C0352v.f5440h;
        return Integer.hashCode(this.f4925p) + k.c(k.c(e3, 31, this.f4923n), 31, this.f4924o);
    }

    @Override // t0.U
    public final p l() {
        S s3 = new S();
        s3.f5389q = this.f4910a;
        s3.f5390r = this.f4911b;
        s3.f5391s = this.f4912c;
        s3.f5392t = this.f4913d;
        s3.f5393u = this.f4914e;
        s3.f5394v = this.f4915f;
        s3.f5395w = this.f4916g;
        s3.f5396x = this.f4917h;
        s3.f5397y = this.f4918i;
        s3.f5398z = this.f4919j;
        s3.f5384A = this.f4920k;
        s3.f5385B = this.f4921l;
        s3.C = this.f4922m;
        s3.D = this.f4923n;
        s3.f5386E = this.f4924o;
        s3.f5387F = this.f4925p;
        s3.f5388G = new l(16, s3);
        return s3;
    }

    @Override // t0.U
    public final void m(p pVar) {
        S s3 = (S) pVar;
        s3.f5389q = this.f4910a;
        s3.f5390r = this.f4911b;
        s3.f5391s = this.f4912c;
        s3.f5392t = this.f4913d;
        s3.f5393u = this.f4914e;
        s3.f5394v = this.f4915f;
        s3.f5395w = this.f4916g;
        s3.f5396x = this.f4917h;
        s3.f5397y = this.f4918i;
        s3.f5398z = this.f4919j;
        s3.f5384A = this.f4920k;
        s3.f5385B = this.f4921l;
        s3.C = this.f4922m;
        s3.D = this.f4923n;
        s3.f5386E = this.f4924o;
        s3.f5387F = this.f4925p;
        b0 b0Var = AbstractC0993f.r(s3, 2).f8712p;
        if (b0Var != null) {
            b0Var.f1(s3.f5388G, true);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicsLayerElement(scaleX=");
        sb.append(this.f4910a);
        sb.append(", scaleY=");
        sb.append(this.f4911b);
        sb.append(", alpha=");
        sb.append(this.f4912c);
        sb.append(", translationX=");
        sb.append(this.f4913d);
        sb.append(", translationY=");
        sb.append(this.f4914e);
        sb.append(", shadowElevation=");
        sb.append(this.f4915f);
        sb.append(", rotationX=");
        sb.append(this.f4916g);
        sb.append(", rotationY=");
        sb.append(this.f4917h);
        sb.append(", rotationZ=");
        sb.append(this.f4918i);
        sb.append(", cameraDistance=");
        sb.append(this.f4919j);
        sb.append(", transformOrigin=");
        sb.append((Object) b0.U.d(this.f4920k));
        sb.append(", shape=");
        sb.append(this.f4921l);
        sb.append(", clip=");
        sb.append(this.f4922m);
        sb.append(", renderEffect=null, ambientShadowColor=");
        k.p(this.f4923n, sb, ", spotShadowColor=");
        sb.append((Object) C0352v.i(this.f4924o));
        sb.append(", compositingStrategy=");
        sb.append((Object) ("CompositingStrategy(value=" + this.f4925p + ')'));
        sb.append(')');
        return sb.toString();
    }
}
