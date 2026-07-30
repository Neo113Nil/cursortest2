package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class rj0 implements kr2 {
    public static final ib0 Y1f8riQaR6yg = new ib0(3);
    public final ox0 PxuCJdSBwIXG;
    public final c TSizfFm2Yiuu;
    public final kr2 lS5Rgt96tfkO;

    public rj0(ox0 ox0Var, kr2 kr2Var, i2 i2Var) {
        this.PxuCJdSBwIXG = ox0Var;
        this.lS5Rgt96tfkO = kr2Var;
        this.TSizfFm2Yiuu = new c(1, i2Var);
    }

    public static rj0 Y1f8riQaR6yg(hn hnVar, kr2 kr2Var) {
        nv nvVar = (nv) ((pj0) ov2.aF05bpZJlKEP(hnVar, pj0.class));
        return new rj0(nvVar.PxuCJdSBwIXG(), kr2Var, new i2(nvVar.PxuCJdSBwIXG, nvVar.lS5Rgt96tfkO));
    }

    @Override // defpackage.kr2
    public final dr2 PxuCJdSBwIXG(Class cls) {
        if (this.PxuCJdSBwIXG.containsKey(cls)) {
            throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
        }
        return this.lS5Rgt96tfkO.PxuCJdSBwIXG(cls);
    }

    @Override // defpackage.kr2
    public final dr2 lS5Rgt96tfkO(Class cls, z71 z71Var) {
        return this.PxuCJdSBwIXG.containsKey(cls) ? this.TSizfFm2Yiuu.lS5Rgt96tfkO(cls, z71Var) : this.lS5Rgt96tfkO.lS5Rgt96tfkO(cls, z71Var);
    }
}
