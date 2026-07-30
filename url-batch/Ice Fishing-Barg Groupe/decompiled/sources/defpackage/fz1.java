package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class fz1 implements l01, AutoCloseable {
    public final ez1 OPXfSBeufaJ8;
    public final String rtx2ld2ELZv4;
    public boolean wdg6QnbFHrFF;

    public fz1(String str, ez1 ez1Var) {
        this.rtx2ld2ELZv4 = str;
        this.OPXfSBeufaJ8 = ez1Var;
    }

    @Override // defpackage.l01
    public final void cpQdD2nAriOS(o01 o01Var, e01 e01Var) {
        if (e01Var == e01.ON_DESTROY) {
            this.wdg6QnbFHrFF = false;
            o01Var.rtx2ld2ELZv4().a92UlCVFR9N8(this);
        }
    }

    public final void gPXPFXrUH4XX(s01 s01Var, cr1 cr1Var) {
        cr1Var.getClass();
        s01Var.getClass();
        if (this.wdg6QnbFHrFF) {
            u9.rtx2ld2ELZv4("Already attached to lifecycleOwner");
            return;
        }
        this.wdg6QnbFHrFF = true;
        s01Var.PxuCJdSBwIXG(this);
        cr1Var.wdg6QnbFHrFF(this.rtx2ld2ELZv4, (zm) this.OPXfSBeufaJ8.lS5Rgt96tfkO.a92UlCVFR9N8);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
