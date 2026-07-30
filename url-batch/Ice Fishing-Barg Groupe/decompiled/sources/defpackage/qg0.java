package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final /* synthetic */ class qg0 implements le0 {
    public final /* synthetic */ le0 OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4;

    public /* synthetic */ qg0(le0 le0Var, int i) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = le0Var;
    }

    @Override // defpackage.le0
    public final Object OPXfSBeufaJ8(Object obj) {
        int i = this.rtx2ld2ELZv4;
        le0 le0Var = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                ol2 ol2Var = (ol2) obj;
                if (!(ol2Var instanceof pg0)) {
                    u9.rtx2ld2ELZv4("Node is not a GestureNode instance");
                    return null;
                }
                Boolean bool = (Boolean) le0Var.OPXfSBeufaJ8(((pg0) ol2Var).VhhvGxCb8gfr);
                bool.getClass();
                return bool;
            case 1:
                j72 j72Var = (j72) le0Var.OPXfSBeufaJ8((q72) obj);
                synchronized (s72.TSizfFm2Yiuu) {
                    s72.Y1f8riQaR6yg = s72.Y1f8riQaR6yg.e9gEMXR7LXtO(j72Var.RAsUl2FVSrh6());
                }
                return j72Var;
            default:
                Long l = (Long) obj;
                l.getClass();
                return le0Var.OPXfSBeufaJ8(l);
        }
    }
}
