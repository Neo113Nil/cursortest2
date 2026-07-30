package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final /* synthetic */ class qy implements le0 {
    public final /* synthetic */ int OPXfSBeufaJ8;
    public final /* synthetic */ Object dgRBjINgWbAK;
    public final /* synthetic */ int rtx2ld2ELZv4;
    public final /* synthetic */ Object wdg6QnbFHrFF;
    public final /* synthetic */ Object x50lh2ztY7Y5;

    public /* synthetic */ qy(em1[] em1VarArr, by1 by1Var, int i, int[] iArr) {
        this.rtx2ld2ELZv4 = 2;
        this.wdg6QnbFHrFF = em1VarArr;
        this.dgRBjINgWbAK = by1Var;
        this.OPXfSBeufaJ8 = i;
        this.x50lh2ztY7Y5 = iArr;
    }

    @Override // defpackage.le0
    public final Object OPXfSBeufaJ8(Object obj) {
        int i = this.rtx2ld2ELZv4;
        int i2 = 0;
        no2 no2Var = no2.PxuCJdSBwIXG;
        Object obj2 = this.x50lh2ztY7Y5;
        int i3 = this.OPXfSBeufaJ8;
        Object obj3 = this.dgRBjINgWbAK;
        Object obj4 = this.wdg6QnbFHrFF;
        switch (i) {
            case 0:
                er0 er0Var = (er0) obj3;
                l81 l81Var = (l81) obj2;
                if (obj == ((ty) obj4)) {
                    u9.rtx2ld2ELZv4("A derived state calculation cannot read itself");
                    break;
                } else {
                    if (obj instanceof p92) {
                        int i4 = er0Var.PxuCJdSBwIXG - i3;
                        int Y1f8riQaR6yg = l81Var.Y1f8riQaR6yg(obj);
                        l81Var.RAsUl2FVSrh6(Math.min(i4, Y1f8riQaR6yg >= 0 ? l81Var.TSizfFm2Yiuu[Y1f8riQaR6yg] : Integer.MAX_VALUE), obj);
                    }
                    break;
                }
            case 1:
                fk0 fk0Var = (fk0) obj4;
                l51 l51Var = (l51) obj3;
                em1 em1Var = (em1) obj2;
                dm1 dm1Var = (dm1) obj;
                int i5 = fk0Var.lS5Rgt96tfkO;
                ug2 ug2Var = fk0Var.PxuCJdSBwIXG;
                yk2 yk2Var = fk0Var.TSizfFm2Yiuu;
                ki2 ki2Var = (ki2) fk0Var.Y1f8riQaR6yg.PxuCJdSBwIXG();
                ug2Var.PxuCJdSBwIXG(th1.OPXfSBeufaJ8, vi0.RAsUl2FVSrh6(dm1Var, i5, yk2Var, ki2Var != null ? ki2Var.PxuCJdSBwIXG : null, l51Var.getLayoutDirection() == cw0.OPXfSBeufaJ8, em1Var.rtx2ld2ELZv4), i3, em1Var.rtx2ld2ELZv4);
                dm1.wdg6QnbFHrFF(dm1Var, em1Var, Math.round(-ug2Var.PxuCJdSBwIXG.rtx2ld2ELZv4()), 0);
                break;
            default:
                em1[] em1VarArr = (em1[]) obj4;
                by1 by1Var = (by1) obj3;
                int[] iArr = (int[]) obj2;
                dm1 dm1Var2 = (dm1) obj;
                int length = em1VarArr.length;
                int i6 = 0;
                while (i2 < length) {
                    em1 em1Var2 = em1VarArr[i2];
                    em1Var2.getClass();
                    em1Var2.wdg6QnbFHrFF();
                    dm1.RAsUl2FVSrh6(dm1Var2, em1Var2, iArr[i6], by1Var.lS5Rgt96tfkO.PxuCJdSBwIXG(em1Var2.OPXfSBeufaJ8, i3));
                    i2++;
                    i6++;
                }
                break;
        }
        return no2Var;
    }

    public /* synthetic */ qy(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.rtx2ld2ELZv4 = i2;
        this.wdg6QnbFHrFF = obj;
        this.dgRBjINgWbAK = obj2;
        this.x50lh2ztY7Y5 = obj3;
        this.OPXfSBeufaJ8 = i;
    }
}
