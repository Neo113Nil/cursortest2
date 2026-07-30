package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class e90 extends zl0 implements kj1 {
    public ro1 s;
    public ro1 t;

    public e90() {
        sz szVar = la0.w;
        this.s = szVar;
        this.t = szVar;
    }

    @Override // defpackage.kj1
    public final Object h() {
        return "androidx.compose.foundation.layout.ConsumedInsetsProvider";
    }

    @Override // defpackage.zl0
    public void r0() {
        ka0.H(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new d90(this, 1));
        z0();
    }

    @Override // defpackage.zl0
    public void s0() {
        this.t = this.s;
        ka0.I(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new d90(this, 0));
    }

    @Override // defpackage.zl0
    public final void t0() {
        this.s = la0.w;
    }

    public abstract void z0();
}
