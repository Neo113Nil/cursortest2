package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class q7 extends kv0 implements le0 {
    public final /* synthetic */ em1[] OPXfSBeufaJ8;
    public final /* synthetic */ int dgRBjINgWbAK;
    public final /* synthetic */ r7 wdg6QnbFHrFF;
    public final /* synthetic */ int x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7(em1[] em1VarArr, r7 r7Var, int i, int i2) {
        super(1);
        this.OPXfSBeufaJ8 = em1VarArr;
        this.wdg6QnbFHrFF = r7Var;
        this.dgRBjINgWbAK = i;
        this.x50lh2ztY7Y5 = i2;
    }

    @Override // defpackage.le0
    public final Object OPXfSBeufaJ8(Object obj) {
        dm1 dm1Var = (dm1) obj;
        for (em1 em1Var : this.OPXfSBeufaJ8) {
            if (em1Var != null) {
                long PxuCJdSBwIXG = this.wdg6QnbFHrFF.PxuCJdSBwIXG.lS5Rgt96tfkO.PxuCJdSBwIXG((em1Var.rtx2ld2ELZv4 << 32) | (em1Var.OPXfSBeufaJ8 & 4294967295L), (this.dgRBjINgWbAK << 32) | (this.x50lh2ztY7Y5 & 4294967295L), cw0.rtx2ld2ELZv4);
                dm1.RAsUl2FVSrh6(dm1Var, em1Var, (int) (PxuCJdSBwIXG >> 32), (int) (PxuCJdSBwIXG & 4294967295L));
            }
        }
        return no2.PxuCJdSBwIXG;
    }
}
