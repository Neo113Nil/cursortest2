package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final /* synthetic */ class m6 implements ae0 {
    public final /* synthetic */ d91 OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4;

    public /* synthetic */ m6(d91 d91Var, int i) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = d91Var;
    }

    @Override // defpackage.ae0
    public final Object PxuCJdSBwIXG() {
        int i = this.rtx2ld2ELZv4;
        d91 d91Var = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                bw0 bw0Var = (bw0) d91Var.getValue();
                if (bw0Var != null) {
                    return bw0Var;
                }
                hp0.Y1f8riQaR6yg("Required value was null.");
                u9.Y1f8riQaR6yg();
                return null;
            case 1:
                bw0 bw0Var2 = (bw0) d91Var.getValue();
                if (bw0Var2 != null) {
                    return bw0Var2;
                }
                hp0.Y1f8riQaR6yg("Required value was null.");
                u9.Y1f8riQaR6yg();
                return null;
            case 2:
                Boolean bool = (Boolean) d91Var.getValue();
                bool.booleanValue();
                return bool;
            case 3:
                return (zy0) ((ae0) d91Var.getValue()).PxuCJdSBwIXG();
            case 4:
                return new yy0((le0) d91Var.getValue());
            default:
                bw0 bw0Var3 = (bw0) d91Var.getValue();
                if (bw0Var3 != null) {
                    return bw0Var3;
                }
                hp0.Y1f8riQaR6yg("Required value was null.");
                u9.Y1f8riQaR6yg();
                return null;
        }
    }
}
