package androidx.compose.ui.graphics;

import A.AbstractC0017m;
import A.g0;
import S.n;
import Z.C0323u;
import Z.K;
import Z.P;
import Z.Q;
import Z.U;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import r0.AbstractC1065f;
import r0.T;
import r0.a0;
import y2.y;

@Metadata
/* loaded from: classes.dex */
final class GraphicsLayerElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final float f5185a;

    /* renamed from: b, reason: collision with root package name */
    public final float f5186b;

    /* renamed from: c, reason: collision with root package name */
    public final float f5187c;

    /* renamed from: d, reason: collision with root package name */
    public final float f5188d;

    /* renamed from: e, reason: collision with root package name */
    public final float f5189e;

    /* renamed from: f, reason: collision with root package name */
    public final float f5190f;

    /* renamed from: g, reason: collision with root package name */
    public final float f5191g;

    /* renamed from: h, reason: collision with root package name */
    public final float f5192h;

    /* renamed from: i, reason: collision with root package name */
    public final float f5193i;

    /* renamed from: j, reason: collision with root package name */
    public final float f5194j;

    /* renamed from: k, reason: collision with root package name */
    public final long f5195k;

    /* renamed from: l, reason: collision with root package name */
    public final P f5196l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f5197m;

    /* renamed from: n, reason: collision with root package name */
    public final long f5198n;

    /* renamed from: o, reason: collision with root package name */
    public final long f5199o;

    /* renamed from: p, reason: collision with root package name */
    public final int f5200p;

    public GraphicsLayerElement(float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, long j4, P p4, boolean z4, long j5, long j6, int i2) {
        this.f5185a = f4;
        this.f5186b = f5;
        this.f5187c = f6;
        this.f5188d = f7;
        this.f5189e = f8;
        this.f5190f = f9;
        this.f5191g = f10;
        this.f5192h = f11;
        this.f5193i = f12;
        this.f5194j = f13;
        this.f5195k = j4;
        this.f5196l = p4;
        this.f5197m = z4;
        this.f5198n = j5;
        this.f5199o = j6;
        this.f5200p = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
        return Float.compare(this.f5185a, graphicsLayerElement.f5185a) == 0 && Float.compare(this.f5186b, graphicsLayerElement.f5186b) == 0 && Float.compare(this.f5187c, graphicsLayerElement.f5187c) == 0 && Float.compare(this.f5188d, graphicsLayerElement.f5188d) == 0 && Float.compare(this.f5189e, graphicsLayerElement.f5189e) == 0 && Float.compare(this.f5190f, graphicsLayerElement.f5190f) == 0 && Float.compare(this.f5191g, graphicsLayerElement.f5191g) == 0 && Float.compare(this.f5192h, graphicsLayerElement.f5192h) == 0 && Float.compare(this.f5193i, graphicsLayerElement.f5193i) == 0 && Float.compare(this.f5194j, graphicsLayerElement.f5194j) == 0 && U.a(this.f5195k, graphicsLayerElement.f5195k) && Intrinsics.a(this.f5196l, graphicsLayerElement.f5196l) && this.f5197m == graphicsLayerElement.f5197m && Intrinsics.a(null, null) && C0323u.c(this.f5198n, graphicsLayerElement.f5198n) && C0323u.c(this.f5199o, graphicsLayerElement.f5199o) && K.p(this.f5200p, graphicsLayerElement.f5200p);
    }

    public final int hashCode() {
        int a4 = AbstractC0017m.a(this.f5194j, AbstractC0017m.a(this.f5193i, AbstractC0017m.a(this.f5192h, AbstractC0017m.a(this.f5191g, AbstractC0017m.a(this.f5190f, AbstractC0017m.a(this.f5189e, AbstractC0017m.a(this.f5188d, AbstractC0017m.a(this.f5187c, AbstractC0017m.a(this.f5186b, Float.hashCode(this.f5185a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i2 = U.f4511c;
        int d4 = AbstractC0017m.d((this.f5196l.hashCode() + AbstractC0017m.c(a4, 31, this.f5195k)) * 31, 961, this.f5197m);
        int i4 = C0323u.f4548h;
        y.a aVar = y.f11688e;
        return Integer.hashCode(this.f5200p) + AbstractC0017m.c(AbstractC0017m.c(d4, 31, this.f5198n), 31, this.f5199o);
    }

    @Override // r0.T
    public final n l() {
        Q q2 = new Q();
        q2.f4501t = this.f5185a;
        q2.f4502u = this.f5186b;
        q2.f4503v = this.f5187c;
        q2.f4504w = this.f5188d;
        q2.f4505x = this.f5189e;
        q2.f4506y = this.f5190f;
        q2.f4507z = this.f5191g;
        q2.f4492A = this.f5192h;
        q2.B = this.f5193i;
        q2.f4493C = this.f5194j;
        q2.f4494D = this.f5195k;
        q2.f4495E = this.f5196l;
        q2.f4496F = this.f5197m;
        q2.f4497G = this.f5198n;
        q2.f4498H = this.f5199o;
        q2.f4499I = this.f5200p;
        q2.f4500J = new g0(10, q2);
        return q2;
    }

    @Override // r0.T
    public final void m(n nVar) {
        Q q2 = (Q) nVar;
        q2.f4501t = this.f5185a;
        q2.f4502u = this.f5186b;
        q2.f4503v = this.f5187c;
        q2.f4504w = this.f5188d;
        q2.f4505x = this.f5189e;
        q2.f4506y = this.f5190f;
        q2.f4507z = this.f5191g;
        q2.f4492A = this.f5192h;
        q2.B = this.f5193i;
        q2.f4493C = this.f5194j;
        q2.f4494D = this.f5195k;
        q2.f4495E = this.f5196l;
        q2.f4496F = this.f5197m;
        q2.f4497G = this.f5198n;
        q2.f4498H = this.f5199o;
        q2.f4499I = this.f5200p;
        a0 a0Var = AbstractC1065f.t(q2, 2).f9763s;
        if (a0Var != null) {
            a0Var.j1(q2.f4500J, true);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicsLayerElement(scaleX=");
        sb.append(this.f5185a);
        sb.append(", scaleY=");
        sb.append(this.f5186b);
        sb.append(", alpha=");
        sb.append(this.f5187c);
        sb.append(", translationX=");
        sb.append(this.f5188d);
        sb.append(", translationY=");
        sb.append(this.f5189e);
        sb.append(", shadowElevation=");
        sb.append(this.f5190f);
        sb.append(", rotationX=");
        sb.append(this.f5191g);
        sb.append(", rotationY=");
        sb.append(this.f5192h);
        sb.append(", rotationZ=");
        sb.append(this.f5193i);
        sb.append(", cameraDistance=");
        sb.append(this.f5194j);
        sb.append(", transformOrigin=");
        sb.append((Object) U.d(this.f5195k));
        sb.append(", shape=");
        sb.append(this.f5196l);
        sb.append(", clip=");
        sb.append(this.f5197m);
        sb.append(", renderEffect=null, ambientShadowColor=");
        AbstractC0017m.s(this.f5198n, sb, ", spotShadowColor=");
        sb.append((Object) C0323u.i(this.f5199o));
        sb.append(", compositingStrategy=");
        sb.append((Object) ("CompositingStrategy(value=" + this.f5200p + ')'));
        sb.append(')');
        return sb.toString();
    }
}
