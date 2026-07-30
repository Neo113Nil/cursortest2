package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final /* synthetic */ class ry0 implements le0 {
    public final /* synthetic */ uy0 OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4;

    public /* synthetic */ ry0(uy0 uy0Var, int i) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = uy0Var;
    }

    @Override // defpackage.le0
    public final Object OPXfSBeufaJ8(Object obj) {
        int i = this.rtx2ld2ELZv4;
        uy0 uy0Var = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                zy0 zy0Var = (zy0) uy0Var.VhhvGxCb8gfr.PxuCJdSBwIXG();
                int TSizfFm2Yiuu = zy0Var.TSizfFm2Yiuu();
                int i2 = 0;
                while (true) {
                    if (i2 >= TSizfFm2Yiuu) {
                        i2 = -1;
                    } else if (!zy0Var.Y1f8riQaR6yg(i2).equals(obj)) {
                        i2++;
                    }
                }
                return Integer.valueOf(i2);
            default:
                int intValue = ((Integer) obj).intValue();
                zy0 zy0Var2 = (zy0) uy0Var.VhhvGxCb8gfr.PxuCJdSBwIXG();
                if (intValue < 0 || intValue >= zy0Var2.TSizfFm2Yiuu()) {
                    StringBuilder BRwzKIf41E4i = o0.BRwzKIf41E4i(intValue, "Can't scroll to index ", ", it is out of bounds [0, ");
                    BRwzKIf41E4i.append(zy0Var2.TSizfFm2Yiuu());
                    BRwzKIf41E4i.append(')');
                    hp0.PxuCJdSBwIXG(BRwzKIf41E4i.toString());
                }
                fx1.KUoIVIumpKat(uy0Var.GlTbNTgfSMqy(), null, new ty0(uy0Var, intValue, null), 3);
                return Boolean.TRUE;
        }
    }
}
