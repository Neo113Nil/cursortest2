package b0;

import F.C0047j0;
import F.D0;
import H2.AbstractC0080b;
import t0.InterfaceC0914w;

/* renamed from: b0.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0264O extends U.k implements InterfaceC0914w {

    /* renamed from: A, reason: collision with root package name */
    public long f4243A;
    public InterfaceC0263N B;
    public boolean C;
    public long D;

    /* renamed from: E, reason: collision with root package name */
    public long f4244E;

    /* renamed from: F, reason: collision with root package name */
    public int f4245F;

    /* renamed from: G, reason: collision with root package name */
    public C0047j0 f4246G;

    /* renamed from: q, reason: collision with root package name */
    public float f4247q;

    /* renamed from: r, reason: collision with root package name */
    public float f4248r;

    /* renamed from: s, reason: collision with root package name */
    public float f4249s;

    /* renamed from: t, reason: collision with root package name */
    public float f4250t;

    /* renamed from: u, reason: collision with root package name */
    public float f4251u;

    /* renamed from: v, reason: collision with root package name */
    public float f4252v;

    /* renamed from: w, reason: collision with root package name */
    public float f4253w;

    /* renamed from: x, reason: collision with root package name */
    public float f4254x;

    /* renamed from: y, reason: collision with root package name */
    public float f4255y;

    /* renamed from: z, reason: collision with root package name */
    public float f4256z;

    @Override // t0.InterfaceC0914w
    public final r0.B b(t0.O o3, r0.z zVar, long j3) {
        r0.H b2 = zVar.b(j3);
        return o3.Y(b2.f7114d, b2.f7115e, M1.v.f2804d, new D0(b2, 10, this));
    }

    @Override // U.k
    public final boolean k0() {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb.append(this.f4247q);
        sb.append(", scaleY=");
        sb.append(this.f4248r);
        sb.append(", alpha = ");
        sb.append(this.f4249s);
        sb.append(", translationX=");
        sb.append(this.f4250t);
        sb.append(", translationY=");
        sb.append(this.f4251u);
        sb.append(", shadowElevation=");
        sb.append(this.f4252v);
        sb.append(", rotationX=");
        sb.append(this.f4253w);
        sb.append(", rotationY=");
        sb.append(this.f4254x);
        sb.append(", rotationZ=");
        sb.append(this.f4255y);
        sb.append(", cameraDistance=");
        sb.append(this.f4256z);
        sb.append(", transformOrigin=");
        sb.append((Object) C0266Q.d(this.f4243A));
        sb.append(", shape=");
        sb.append(this.B);
        sb.append(", clip=");
        sb.append(this.C);
        sb.append(", renderEffect=null, ambientShadowColor=");
        AbstractC0080b.q(this.D, sb, ", spotShadowColor=");
        AbstractC0080b.q(this.f4244E, sb, ", compositingStrategy=");
        sb.append((Object) ("CompositingStrategy(value=" + this.f4245F + ')'));
        sb.append(')');
        return sb.toString();
    }
}
