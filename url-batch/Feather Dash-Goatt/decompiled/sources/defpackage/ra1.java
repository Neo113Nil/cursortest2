package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ra1 extends zl0 implements ad0, j81 {
    public long A;
    public long B;
    public int C;
    public a3 D;
    public float s;
    public float t;
    public float u;
    public float v;
    public float w;
    public long x;
    public u91 y;
    public boolean z;

    @Override // defpackage.ad0
    public final wk0 P(ej0 ej0Var, qk0 qk0Var, long j) {
        zw0 c = qk0Var.c(j);
        return xk0.q(ej0Var, c.d, c.e, new t4(c, 7, this));
    }

    @Override // defpackage.j81
    public final void W(u81 u81Var) {
        if (this.z) {
            u91 u91Var = this.y;
            dc0[] dc0VarArr = s81.a;
            t81 t81Var = p81.M;
            dc0 dc0Var = s81.a[28];
            u81Var.a(t81Var, u91Var);
        }
    }

    @Override // defpackage.j81
    public final boolean b() {
        return false;
    }

    @Override // defpackage.zl0
    public final boolean o0() {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb.append(this.s);
        sb.append(", scaleY=");
        sb.append(this.t);
        sb.append(", alpha = ");
        sb.append(this.u);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.v);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=");
        sb.append(this.w);
        sb.append(", transformOrigin=");
        long j = this.x;
        int i = aj1.b;
        sb.append((Object) ("TransformOrigin(packedValue=" + j + ')'));
        sb.append(", shape=");
        sb.append(this.y);
        sb.append(", clip=");
        sb.append(this.z);
        sb.append(", renderEffect=null, ambientShadowColor=");
        qy0.r(this.A, sb, ", spotShadowColor=");
        qy0.r(this.B, sb, ", compositingStrategy=CompositingStrategy(value=0), blendMode=");
        sb.append((Object) m90.N(this.C));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }
}
