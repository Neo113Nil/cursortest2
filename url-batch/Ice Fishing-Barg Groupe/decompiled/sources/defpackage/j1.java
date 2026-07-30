package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class j1 extends kv0 implements le0 {
    public final /* synthetic */ int OPXfSBeufaJ8;
    public final /* synthetic */ zt1 wdg6QnbFHrFF;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j1(int i, zt1 zt1Var) {
        super(1);
        this.OPXfSBeufaJ8 = i;
        this.wdg6QnbFHrFF = zt1Var;
    }

    @Override // defpackage.le0
    public final Object OPXfSBeufaJ8(Object obj) {
        boolean z;
        int i = this.OPXfSBeufaJ8;
        zt1 zt1Var = this.wdg6QnbFHrFF;
        switch (i) {
            case 0:
                zt1Var.rtx2ld2ELZv4 = (ab0) obj;
                return Boolean.TRUE;
            case 1:
                ik0 ik0Var = (ik0) obj;
                Object obj2 = zt1Var.rtx2ld2ELZv4;
                if (obj2 == null && ik0Var.ZbWwgt3aGe7A) {
                    zt1Var.rtx2ld2ELZv4 = ik0Var;
                } else if (obj2 != null) {
                    ik0Var.getClass();
                }
                return Boolean.TRUE;
            default:
                tx txVar = (ol2) obj;
                if (((m61) txVar).rtx2ld2ELZv4.S9EYkSpbGuxq) {
                    zt1Var.rtx2ld2ELZv4 = txVar;
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
