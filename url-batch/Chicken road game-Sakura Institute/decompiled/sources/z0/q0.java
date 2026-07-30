package z0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class q0 extends s0.n implements r1.w {
    public long A;
    public long B;
    public s1.l0 C;

    /* renamed from: s, reason: collision with root package name */
    public float f10037s;

    /* renamed from: t, reason: collision with root package name */
    public float f10038t;

    /* renamed from: u, reason: collision with root package name */
    public float f10039u;

    /* renamed from: v, reason: collision with root package name */
    public float f10040v;

    /* renamed from: w, reason: collision with root package name */
    public float f10041w;

    /* renamed from: x, reason: collision with root package name */
    public long f10042x;

    /* renamed from: y, reason: collision with root package name */
    public p0 f10043y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f10044z;

    @Override // r1.w
    public final p1.g0 f(p1.h0 h0Var, p1.e0 e0Var, long j8) {
        p1.n0 b9 = e0Var.b(j8);
        return h0Var.C(b9.f7063f, b9.f7064g, e6.v.f2827f, new q.t0(b9, 16, this));
    }

    @Override // s0.n
    public final boolean p0() {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb.append(this.f10037s);
        sb.append(", scaleY=");
        sb.append(this.f10038t);
        sb.append(", alpha = ");
        sb.append(this.f10039u);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.f10040v);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=");
        sb.append(this.f10041w);
        sb.append(", transformOrigin=");
        sb.append((Object) s0.d(this.f10042x));
        sb.append(", shape=");
        sb.append(this.f10043y);
        sb.append(", clip=");
        sb.append(this.f10044z);
        sb.append(", renderEffect=null, ambientShadowColor=");
        a0.m.r(this.A, sb, ", spotShadowColor=");
        sb.append((Object) u.i(this.B));
        sb.append(", compositingStrategy=CompositingStrategy(value=0))");
        return sb.toString();
    }
}
