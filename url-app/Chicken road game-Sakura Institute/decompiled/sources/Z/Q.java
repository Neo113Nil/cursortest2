package Z;

import A.AbstractC0017m;
import A.C0028y;
import A.g0;
import p0.AbstractC0954O;
import p0.InterfaceC0944E;
import p0.InterfaceC0946G;
import p0.InterfaceC0947H;
import r0.InterfaceC1081w;
import z2.C1412P;

/* loaded from: classes.dex */
public final class Q extends S.n implements InterfaceC1081w {

    /* renamed from: A, reason: collision with root package name */
    public float f4492A;
    public float B;

    /* renamed from: C, reason: collision with root package name */
    public float f4493C;

    /* renamed from: D, reason: collision with root package name */
    public long f4494D;

    /* renamed from: E, reason: collision with root package name */
    public P f4495E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f4496F;

    /* renamed from: G, reason: collision with root package name */
    public long f4497G;

    /* renamed from: H, reason: collision with root package name */
    public long f4498H;

    /* renamed from: I, reason: collision with root package name */
    public int f4499I;

    /* renamed from: J, reason: collision with root package name */
    public g0 f4500J;

    /* renamed from: t, reason: collision with root package name */
    public float f4501t;

    /* renamed from: u, reason: collision with root package name */
    public float f4502u;

    /* renamed from: v, reason: collision with root package name */
    public float f4503v;

    /* renamed from: w, reason: collision with root package name */
    public float f4504w;

    /* renamed from: x, reason: collision with root package name */
    public float f4505x;

    /* renamed from: y, reason: collision with root package name */
    public float f4506y;

    /* renamed from: z, reason: collision with root package name */
    public float f4507z;

    @Override // r0.InterfaceC1081w
    public final InterfaceC0946G i(InterfaceC0947H interfaceC0947H, InterfaceC0944E interfaceC0944E, long j4) {
        InterfaceC0946G t4;
        AbstractC0954O a4 = interfaceC0944E.a(j4);
        t4 = interfaceC0947H.t(a4.f9005d, a4.f9006e, C1412P.c(), new C0028y(a4, 15, this));
        return t4;
    }

    @Override // S.n
    public final boolean q0() {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb.append(this.f4501t);
        sb.append(", scaleY=");
        sb.append(this.f4502u);
        sb.append(", alpha = ");
        sb.append(this.f4503v);
        sb.append(", translationX=");
        sb.append(this.f4504w);
        sb.append(", translationY=");
        sb.append(this.f4505x);
        sb.append(", shadowElevation=");
        sb.append(this.f4506y);
        sb.append(", rotationX=");
        sb.append(this.f4507z);
        sb.append(", rotationY=");
        sb.append(this.f4492A);
        sb.append(", rotationZ=");
        sb.append(this.B);
        sb.append(", cameraDistance=");
        sb.append(this.f4493C);
        sb.append(", transformOrigin=");
        sb.append((Object) U.d(this.f4494D));
        sb.append(", shape=");
        sb.append(this.f4495E);
        sb.append(", clip=");
        sb.append(this.f4496F);
        sb.append(", renderEffect=null, ambientShadowColor=");
        AbstractC0017m.s(this.f4497G, sb, ", spotShadowColor=");
        AbstractC0017m.s(this.f4498H, sb, ", compositingStrategy=");
        sb.append((Object) ("CompositingStrategy(value=" + this.f4499I + ')'));
        sb.append(')');
        return sb.toString();
    }
}
