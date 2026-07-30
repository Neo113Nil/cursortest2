package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class u10 extends kv0 implements le0 {
    public final /* synthetic */ int OPXfSBeufaJ8 = 0;
    public final /* synthetic */ vt1 wdg6QnbFHrFF;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u10(i2 i2Var, v10 v10Var, vt1 vt1Var) {
        super(1);
        this.wdg6QnbFHrFF = vt1Var;
    }

    @Override // defpackage.le0
    public final Object OPXfSBeufaJ8(Object obj) {
        int i = this.OPXfSBeufaJ8;
        ml2 ml2Var = ml2.rtx2ld2ELZv4;
        vt1 vt1Var = this.wdg6QnbFHrFF;
        switch (i) {
            case 0:
                v10 v10Var = (v10) obj;
                if (!v10Var.S9EYkSpbGuxq) {
                    return ml2.OPXfSBeufaJ8;
                }
                if (v10Var.S2OOm9zPNm0h != null) {
                    ep0.lS5Rgt96tfkO("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                }
                v10Var.S2OOm9zPNm0h = null;
                vt1Var.rtx2ld2ELZv4 = vt1Var.rtx2ld2ELZv4;
                return ml2Var;
            default:
                if (!((ik0) obj).ZbWwgt3aGe7A) {
                    return ml2Var;
                }
                vt1Var.rtx2ld2ELZv4 = false;
                return ml2.wdg6QnbFHrFF;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u10(vt1 vt1Var) {
        super(1);
        this.wdg6QnbFHrFF = vt1Var;
    }
}
