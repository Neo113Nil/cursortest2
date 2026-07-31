package b0;

import B.C0022x;
import r0.AbstractC0893O;
import r0.InterfaceC0884F;
import r0.InterfaceC0886H;
import r0.InterfaceC0887I;
import t0.InterfaceC1009w;

/* loaded from: classes.dex */
public final class S extends U.p implements InterfaceC1009w {

    /* renamed from: A, reason: collision with root package name */
    public long f5384A;

    /* renamed from: B, reason: collision with root package name */
    public Q f5385B;
    public boolean C;
    public long D;

    /* renamed from: E, reason: collision with root package name */
    public long f5386E;

    /* renamed from: F, reason: collision with root package name */
    public int f5387F;

    /* renamed from: G, reason: collision with root package name */
    public A0.l f5388G;

    /* renamed from: q, reason: collision with root package name */
    public float f5389q;

    /* renamed from: r, reason: collision with root package name */
    public float f5390r;

    /* renamed from: s, reason: collision with root package name */
    public float f5391s;

    /* renamed from: t, reason: collision with root package name */
    public float f5392t;

    /* renamed from: u, reason: collision with root package name */
    public float f5393u;

    /* renamed from: v, reason: collision with root package name */
    public float f5394v;

    /* renamed from: w, reason: collision with root package name */
    public float f5395w;

    /* renamed from: x, reason: collision with root package name */
    public float f5396x;

    /* renamed from: y, reason: collision with root package name */
    public float f5397y;

    /* renamed from: z, reason: collision with root package name */
    public float f5398z;

    @Override // t0.InterfaceC1009w
    public final InterfaceC0886H g(InterfaceC0887I interfaceC0887I, InterfaceC0884F interfaceC0884F, long j3) {
        AbstractC0893O b3 = interfaceC0884F.b(j3);
        return interfaceC0887I.i0(b3.f8126d, b3.f8127e, S1.v.f4321d, new C0022x(b3, 17, this));
    }

    @Override // U.p
    public final boolean n0() {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb.append(this.f5389q);
        sb.append(", scaleY=");
        sb.append(this.f5390r);
        sb.append(", alpha = ");
        sb.append(this.f5391s);
        sb.append(", translationX=");
        sb.append(this.f5392t);
        sb.append(", translationY=");
        sb.append(this.f5393u);
        sb.append(", shadowElevation=");
        sb.append(this.f5394v);
        sb.append(", rotationX=");
        sb.append(this.f5395w);
        sb.append(", rotationY=");
        sb.append(this.f5396x);
        sb.append(", rotationZ=");
        sb.append(this.f5397y);
        sb.append(", cameraDistance=");
        sb.append(this.f5398z);
        sb.append(", transformOrigin=");
        sb.append((Object) U.d(this.f5384A));
        sb.append(", shape=");
        sb.append(this.f5385B);
        sb.append(", clip=");
        sb.append(this.C);
        sb.append(", renderEffect=null, ambientShadowColor=");
        A.k.p(this.D, sb, ", spotShadowColor=");
        A.k.p(this.f5386E, sb, ", compositingStrategy=");
        sb.append((Object) ("CompositingStrategy(value=" + this.f5387F + ')'));
        sb.append(')');
        return sb.toString();
    }
}
