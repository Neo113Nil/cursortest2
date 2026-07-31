package androidx.compose.ui.graphics;

import F.C0047j0;
import H2.AbstractC0080b;
import U.k;
import Z1.i;
import b0.AbstractC0259J;
import b0.C0264O;
import b0.C0266Q;
import b0.C0288u;
import b0.InterfaceC0263N;
import t0.AbstractC0898f;
import t0.T;
import t0.a0;

/* loaded from: classes.dex */
final class GraphicsLayerElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final float f3714a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3715b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3716c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3717d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3718e;

    /* renamed from: f, reason: collision with root package name */
    public final float f3719f;

    /* renamed from: g, reason: collision with root package name */
    public final float f3720g;

    /* renamed from: h, reason: collision with root package name */
    public final float f3721h;

    /* renamed from: i, reason: collision with root package name */
    public final float f3722i;

    /* renamed from: j, reason: collision with root package name */
    public final float f3723j;

    /* renamed from: k, reason: collision with root package name */
    public final long f3724k;

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC0263N f3725l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f3726m;

    /* renamed from: n, reason: collision with root package name */
    public final long f3727n;

    /* renamed from: o, reason: collision with root package name */
    public final long f3728o;
    public final int p;

    public GraphicsLayerElement(float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, long j3, InterfaceC0263N interfaceC0263N, boolean z3, long j4, long j5, int i3) {
        this.f3714a = f3;
        this.f3715b = f4;
        this.f3716c = f5;
        this.f3717d = f6;
        this.f3718e = f7;
        this.f3719f = f8;
        this.f3720g = f9;
        this.f3721h = f10;
        this.f3722i = f11;
        this.f3723j = f12;
        this.f3724k = j3;
        this.f3725l = interfaceC0263N;
        this.f3726m = z3;
        this.f3727n = j4;
        this.f3728o = j5;
        this.p = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
        return Float.compare(this.f3714a, graphicsLayerElement.f3714a) == 0 && Float.compare(this.f3715b, graphicsLayerElement.f3715b) == 0 && Float.compare(this.f3716c, graphicsLayerElement.f3716c) == 0 && Float.compare(this.f3717d, graphicsLayerElement.f3717d) == 0 && Float.compare(this.f3718e, graphicsLayerElement.f3718e) == 0 && Float.compare(this.f3719f, graphicsLayerElement.f3719f) == 0 && Float.compare(this.f3720g, graphicsLayerElement.f3720g) == 0 && Float.compare(this.f3721h, graphicsLayerElement.f3721h) == 0 && Float.compare(this.f3722i, graphicsLayerElement.f3722i) == 0 && Float.compare(this.f3723j, graphicsLayerElement.f3723j) == 0 && C0266Q.a(this.f3724k, graphicsLayerElement.f3724k) && i.a(this.f3725l, graphicsLayerElement.f3725l) && this.f3726m == graphicsLayerElement.f3726m && i.a(null, null) && C0288u.c(this.f3727n, graphicsLayerElement.f3727n) && C0288u.c(this.f3728o, graphicsLayerElement.f3728o) && AbstractC0259J.o(this.p, graphicsLayerElement.p);
    }

    @Override // t0.T
    public final k h() {
        C0264O c0264o = new C0264O();
        c0264o.f4247q = this.f3714a;
        c0264o.f4248r = this.f3715b;
        c0264o.f4249s = this.f3716c;
        c0264o.f4250t = this.f3717d;
        c0264o.f4251u = this.f3718e;
        c0264o.f4252v = this.f3719f;
        c0264o.f4253w = this.f3720g;
        c0264o.f4254x = this.f3721h;
        c0264o.f4255y = this.f3722i;
        c0264o.f4256z = this.f3723j;
        c0264o.f4243A = this.f3724k;
        c0264o.B = this.f3725l;
        c0264o.C = this.f3726m;
        c0264o.D = this.f3727n;
        c0264o.f4244E = this.f3728o;
        c0264o.f4245F = this.p;
        c0264o.f4246G = new C0047j0(13, c0264o);
        return c0264o;
    }

    public final int hashCode() {
        int a3 = AbstractC0080b.a(this.f3723j, AbstractC0080b.a(this.f3722i, AbstractC0080b.a(this.f3721h, AbstractC0080b.a(this.f3720g, AbstractC0080b.a(this.f3719f, AbstractC0080b.a(this.f3718e, AbstractC0080b.a(this.f3717d, AbstractC0080b.a(this.f3716c, AbstractC0080b.a(this.f3715b, Float.hashCode(this.f3714a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i3 = C0266Q.f4259c;
        int f3 = AbstractC0080b.f((this.f3725l.hashCode() + AbstractC0080b.d(a3, 31, this.f3724k)) * 31, 961, this.f3726m);
        int i4 = C0288u.f4297g;
        return Integer.hashCode(this.p) + AbstractC0080b.d(AbstractC0080b.d(f3, 31, this.f3727n), 31, this.f3728o);
    }

    @Override // t0.T
    public final void i(k kVar) {
        C0264O c0264o = (C0264O) kVar;
        c0264o.f4247q = this.f3714a;
        c0264o.f4248r = this.f3715b;
        c0264o.f4249s = this.f3716c;
        c0264o.f4250t = this.f3717d;
        c0264o.f4251u = this.f3718e;
        c0264o.f4252v = this.f3719f;
        c0264o.f4253w = this.f3720g;
        c0264o.f4254x = this.f3721h;
        c0264o.f4255y = this.f3722i;
        c0264o.f4256z = this.f3723j;
        c0264o.f4243A = this.f3724k;
        c0264o.B = this.f3725l;
        c0264o.C = this.f3726m;
        c0264o.D = this.f3727n;
        c0264o.f4244E = this.f3728o;
        c0264o.f4245F = this.p;
        a0 a0Var = AbstractC0898f.r(c0264o, 2).p;
        if (a0Var != null) {
            a0Var.U0(c0264o.f4246G, true);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicsLayerElement(scaleX=");
        sb.append(this.f3714a);
        sb.append(", scaleY=");
        sb.append(this.f3715b);
        sb.append(", alpha=");
        sb.append(this.f3716c);
        sb.append(", translationX=");
        sb.append(this.f3717d);
        sb.append(", translationY=");
        sb.append(this.f3718e);
        sb.append(", shadowElevation=");
        sb.append(this.f3719f);
        sb.append(", rotationX=");
        sb.append(this.f3720g);
        sb.append(", rotationY=");
        sb.append(this.f3721h);
        sb.append(", rotationZ=");
        sb.append(this.f3722i);
        sb.append(", cameraDistance=");
        sb.append(this.f3723j);
        sb.append(", transformOrigin=");
        sb.append((Object) C0266Q.d(this.f3724k));
        sb.append(", shape=");
        sb.append(this.f3725l);
        sb.append(", clip=");
        sb.append(this.f3726m);
        sb.append(", renderEffect=null, ambientShadowColor=");
        AbstractC0080b.q(this.f3727n, sb, ", spotShadowColor=");
        sb.append((Object) C0288u.i(this.f3728o));
        sb.append(", compositingStrategy=");
        sb.append((Object) ("CompositingStrategy(value=" + this.p + ')'));
        sb.append(')');
        return sb.toString();
    }
}
