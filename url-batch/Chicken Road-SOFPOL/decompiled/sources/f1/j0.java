package f1;

import w1.n0;
import w1.s1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class j0 extends y0.l implements w1.v, s1 {
    public long A;
    public int B;
    public b1.e C;

    /* renamed from: r, reason: collision with root package name */
    public float f2672r;

    /* renamed from: s, reason: collision with root package name */
    public float f2673s;

    /* renamed from: t, reason: collision with root package name */
    public float f2674t;

    /* renamed from: u, reason: collision with root package name */
    public float f2675u;

    /* renamed from: v, reason: collision with root package name */
    public float f2676v;

    /* renamed from: w, reason: collision with root package name */
    public long f2677w;

    /* renamed from: x, reason: collision with root package name */
    public i0 f2678x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f2679y;

    /* renamed from: z, reason: collision with root package name */
    public long f2680z;

    @Override // w1.v
    public final u1.f0 e(n0 n0Var, u1.d0 d0Var, long j7) {
        u1.l0 e8 = d0Var.e(j7);
        return n0Var.e0(e8.f7230d, e8.f7231e, d6.v.f2327d, new n(1, e8, this));
    }

    @Override // w1.s1
    public final boolean f() {
        return false;
    }

    @Override // y0.l
    public final boolean g0() {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb.append(this.f2672r);
        sb.append(", scaleY=");
        sb.append(this.f2673s);
        sb.append(", alpha = ");
        sb.append(this.f2674t);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.f2675u);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=");
        sb.append(this.f2676v);
        sb.append(", transformOrigin=");
        sb.append((Object) l0.d(this.f2677w));
        sb.append(", shape=");
        sb.append(this.f2678x);
        sb.append(", clip=");
        sb.append(this.f2679y);
        sb.append(", renderEffect=null, ambientShadowColor=");
        a0.q.o(this.f2680z, sb, ", spotShadowColor=");
        a0.q.o(this.A, sb, ", compositingStrategy=CompositingStrategy(value=0), blendMode=");
        sb.append((Object) p.y(this.B));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }

    @Override // w1.s1
    public final void q(d2.j jVar) {
    }
}
