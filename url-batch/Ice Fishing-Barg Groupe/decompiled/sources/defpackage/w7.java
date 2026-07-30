package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class w7 extends kv0 implements le0 {
    public final /* synthetic */ int OPXfSBeufaJ8;
    public final /* synthetic */ long dgRBjINgWbAK;
    public final /* synthetic */ x7 wdg6QnbFHrFF;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w7(x7 x7Var, long j, int i) {
        super(1);
        this.OPXfSBeufaJ8 = i;
        this.wdg6QnbFHrFF = x7Var;
        this.dgRBjINgWbAK = j;
    }

    @Override // defpackage.le0
    public final Object OPXfSBeufaJ8(Object obj) {
        e80 e80Var;
        int i = this.OPXfSBeufaJ8;
        long j = 0;
        long j2 = this.dgRBjINgWbAK;
        x7 x7Var = this.wdg6QnbFHrFF;
        switch (i) {
            case 0:
                dl2 dl2Var = (dl2) obj;
                if (!cs0.wdg6QnbFHrFF(dl2Var.lS5Rgt96tfkO(), x7Var.ZbWwgt3aGe7A.lS5Rgt96tfkO())) {
                    i92 i92Var = (i92) x7Var.ZbWwgt3aGe7A.Y1f8riQaR6yg.RAsUl2FVSrh6(dl2Var.lS5Rgt96tfkO());
                    if (i92Var != null) {
                        j2 = ((ir0) i92Var.getValue()).PxuCJdSBwIXG;
                    } else {
                        ir0.Companion.getClass();
                        j2 = 0;
                    }
                } else if (!ir0.PxuCJdSBwIXG(x7Var.pnx5pC0XzaCw, -9223372034707292160L)) {
                    j2 = x7Var.pnx5pC0XzaCw;
                }
                i92 i92Var2 = (i92) x7Var.ZbWwgt3aGe7A.Y1f8riQaR6yg.RAsUl2FVSrh6(dl2Var.TSizfFm2Yiuu());
                if (i92Var2 != null) {
                    j = ((ir0) i92Var2.getValue()).PxuCJdSBwIXG;
                } else {
                    ir0.Companion.getClass();
                }
                e62 e62Var = (e62) x7Var.S2OOm9zPNm0h.getValue();
                return (e62Var == null || (e80Var = (e80) e62Var.PxuCJdSBwIXG.rtx2ld2ELZv4(new ir0(j2), new ir0(j))) == null) ? b51.ngxnMNrpiKat(0.0f, 400.0f, null, 5) : e80Var;
            default:
                if (cs0.wdg6QnbFHrFF(obj, x7Var.ZbWwgt3aGe7A.lS5Rgt96tfkO())) {
                    j = ir0.PxuCJdSBwIXG(x7Var.pnx5pC0XzaCw, -9223372034707292160L) ? j2 : x7Var.pnx5pC0XzaCw;
                } else {
                    i92 i92Var3 = (i92) x7Var.ZbWwgt3aGe7A.Y1f8riQaR6yg.RAsUl2FVSrh6(obj);
                    if (i92Var3 != null) {
                        j = ((ir0) i92Var3.getValue()).PxuCJdSBwIXG;
                    } else {
                        ir0.Companion.getClass();
                    }
                }
                return new ir0(j);
        }
    }
}
