package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class l7 extends kv0 implements le0 {
    public final /* synthetic */ int OPXfSBeufaJ8;
    public final /* synthetic */ Object dgRBjINgWbAK;
    public final /* synthetic */ Object wdg6QnbFHrFF;
    public final /* synthetic */ Object x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l7(Object obj, Object obj2, Object obj3, int i) {
        super(1);
        this.OPXfSBeufaJ8 = i;
        this.wdg6QnbFHrFF = obj;
        this.dgRBjINgWbAK = obj2;
        this.x50lh2ztY7Y5 = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.le0
    public final Object OPXfSBeufaJ8(Object obj) {
        long j;
        long j2;
        int i = this.OPXfSBeufaJ8;
        boolean z = false;
        Object[] objArr = 0;
        xk2 xk2Var = null;
        Object obj2 = this.dgRBjINgWbAK;
        Object obj3 = this.x50lh2ztY7Y5;
        Object obj4 = this.wdg6QnbFHrFF;
        switch (i) {
            case 0:
                return new k7((d82) obj4, obj2, (y7) obj3, objArr == true ? 1 : 0);
            case 1:
                ol2 ol2Var = (ol2) obj;
                v10 v10Var = (v10) ol2Var;
                if (!((g3) ((r1) zv.wLFCmsViZrNT((v10) obj2)).m16getDragAndDropManager()).lS5Rgt96tfkO.contains(v10Var) || !bs0.wdg6QnbFHrFF(v10Var, cs0.IAToe7bXGz4N((i2) obj3))) {
                    return ml2.rtx2ld2ELZv4;
                }
                ((zt1) obj4).rtx2ld2ELZv4 = ol2Var;
                return ml2.wdg6QnbFHrFF;
            case 2:
                dw1 dw1Var = (dw1) obj;
                i92 i92Var = (i92) obj2;
                i92 i92Var2 = (i92) obj4;
                dw1Var.TSizfFm2Yiuu(i92Var2 != null ? ((Number) i92Var2.getValue()).floatValue() : 1.0f);
                dw1Var.RAsUl2FVSrh6(i92Var != null ? ((Number) i92Var.getValue()).floatValue() : 1.0f);
                dw1Var.OPXfSBeufaJ8(i92Var != null ? ((Number) i92Var.getValue()).floatValue() : 1.0f);
                i92 i92Var3 = (i92) obj3;
                if (i92Var3 != null) {
                    j = ((xk2) i92Var3.getValue()).PxuCJdSBwIXG;
                } else {
                    xk2.Companion.getClass();
                    j = xk2.lS5Rgt96tfkO;
                }
                dw1Var.QrzZRwfaDlRX(j);
                return no2.PxuCJdSBwIXG;
            case 3:
                k70 k70Var = (k70) obj3;
                int ordinal = ((u50) obj).ordinal();
                if (ordinal == 0) {
                    hl2 hl2Var = ((l70) k70Var).TSizfFm2Yiuu;
                } else if (ordinal == 1) {
                    xk2Var = (xk2) obj4;
                } else {
                    if (ordinal != 2) {
                        u9.gPXPFXrUH4XX();
                        return null;
                    }
                    hl2 hl2Var2 = ((l70) k70Var).TSizfFm2Yiuu;
                }
                if (xk2Var != null) {
                    j2 = xk2Var.PxuCJdSBwIXG;
                } else {
                    xk2.Companion.getClass();
                    j2 = xk2.lS5Rgt96tfkO;
                }
                return new xk2(j2);
            default:
                ab0 ab0Var = (ab0) obj;
                if (!cs0.wdg6QnbFHrFF(ab0Var, (ab0) obj4)) {
                    if (cs0.wdg6QnbFHrFF(ab0Var, ((qa0) obj2).TSizfFm2Yiuu)) {
                        u9.rtx2ld2ELZv4("Focus search landed at the root.");
                        return null;
                    }
                    z = ((Boolean) ((le0) obj3).OPXfSBeufaJ8(ab0Var)).booleanValue();
                }
                return Boolean.valueOf(z);
        }
    }
}
