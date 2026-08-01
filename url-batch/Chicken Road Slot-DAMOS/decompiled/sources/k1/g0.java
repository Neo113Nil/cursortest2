package k1;

import c2.o0;
import c2.x1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g0 extends d1.k implements c2.v, x1 {
    public float C;
    public float D;
    public float E;
    public float F;
    public long G;
    public f0 H;
    public boolean I;
    public long J;
    public long K;
    public int L;
    public a3.e M;

    @Override // c2.x1
    public final boolean b() {
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb2.append(this.C);
        sb2.append(", scaleY=");
        sb2.append(this.D);
        sb2.append(", alpha = ");
        sb2.append(this.E);
        sb2.append(", translationX=0.0, translationY=0.0, shadowElevation=0.0, rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=");
        sb2.append(this.F);
        sb2.append(", transformOrigin=");
        sb2.append((Object) i0.b(this.G));
        sb2.append(", shape=");
        sb2.append(this.H);
        sb2.append(", clip=");
        sb2.append(this.I);
        sb2.append(", renderEffect=null, ambientShadowColor=");
        v4.a.t(this.J, sb2, ", spotShadowColor=");
        v4.a.t(this.K, sb2, ", compositingStrategy=CompositingStrategy(value=0), blendMode=");
        sb2.append((Object) v.u(this.L));
        sb2.append(", colorFilter=null)");
        return sb2.toString();
    }

    @Override // c2.x1
    public final void u(j2.u uVar) {
        if (this.I) {
            f0 f0Var = this.H;
            wd.y[] yVarArr = j2.s.f5019a;
            j2.t tVar = j2.q.M;
            wd.y yVar = j2.s.f5019a[30];
            uVar.b(tVar, f0Var);
        }
    }

    @Override // c2.v
    public final a2.h0 v(o0 o0Var, a2.f0 f0Var, long j) {
        a2.o0 c10 = f0Var.c(j);
        return a2.i0.V(o0Var, c10.f131d, c10.f132e, new a3.d(6, c10, this));
    }

    @Override // d1.k
    public final boolean x() {
        return false;
    }
}
