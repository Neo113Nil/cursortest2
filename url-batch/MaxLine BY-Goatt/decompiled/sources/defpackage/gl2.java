package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class gl2 extends ul1 implements a91, xh2 {
    public float A;
    public float B;
    public float C;
    public float D;
    public float E;
    public long F;
    public fk2 G;
    public boolean H;
    public long I;
    public long J;
    public int K;
    public s72 L;

    @Override // defpackage.a91
    public final pj1 j(qj1 qj1Var, jj1 jj1Var, long j) {
        pj1 G;
        n12 c = jj1Var.c(j);
        G = qj1Var.G(c.m, c.n, mi1.c(), new ih2(2, c, this));
        return G;
    }

    @Override // defpackage.xh2
    public final boolean l() {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb.append(this.A);
        sb.append(", scaleY=");
        sb.append(this.B);
        sb.append(", alpha = ");
        sb.append(this.C);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.D);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=");
        sb.append(this.E);
        sb.append(", transformOrigin=");
        sb.append((Object) wy2.b(this.F));
        sb.append(", shape=");
        sb.append(this.G);
        sb.append(", clip=");
        sb.append(this.H);
        sb.append(", renderEffect=null, ambientShadowColor=");
        in1.o(this.I, sb, ", spotShadowColor=");
        in1.o(this.J, sb, ", compositingStrategy=CompositingStrategy(value=0), blendMode=");
        sb.append((Object) o70.O(this.K));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }

    @Override // defpackage.ul1
    public final boolean v0() {
        return false;
    }

    @Override // defpackage.xh2
    public final void M(sh2 sh2Var) {
    }
}
