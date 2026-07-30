package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class h12 implements n02 {
    public final /* synthetic */ l12 PxuCJdSBwIXG;
    public final /* synthetic */ j12 lS5Rgt96tfkO;

    public h12(l12 l12Var, j12 j12Var) {
        this.PxuCJdSBwIXG = l12Var;
        this.lS5Rgt96tfkO = j12Var;
    }

    @Override // defpackage.n02
    public final float PxuCJdSBwIXG(float f) {
        float abs = Math.abs(f);
        l12 l12Var = this.PxuCJdSBwIXG;
        if (abs != 0.0f && !((Boolean) l12Var.rtx2ld2ELZv4.PxuCJdSBwIXG()).booleanValue()) {
            throw new k80("The fling animation was cancelled", 0);
        }
        long e9gEMXR7LXtO = l12Var.e9gEMXR7LXtO(l12Var.rtx2ld2ELZv4(f));
        fd1.Companion.getClass();
        return l12Var.Y1f8riQaR6yg(l12Var.RAsUl2FVSrh6(this.lS5Rgt96tfkO.PxuCJdSBwIXG(2, e9gEMXR7LXtO)));
    }
}
