package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class x50 extends kv0 implements le0 {
    public final /* synthetic */ int OPXfSBeufaJ8;
    public final /* synthetic */ k70 dgRBjINgWbAK;
    public final /* synthetic */ e60 wdg6QnbFHrFF;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x50(e60 e60Var, k70 k70Var, int i) {
        super(1);
        this.OPXfSBeufaJ8 = i;
        this.wdg6QnbFHrFF = e60Var;
        this.dgRBjINgWbAK = k70Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        if (((defpackage.l70) r9).TSizfFm2Yiuu.PxuCJdSBwIXG != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
    
        r8 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006a, code lost:
    
        if (((defpackage.f60) r1).lS5Rgt96tfkO.PxuCJdSBwIXG != null) goto L26;
     */
    @Override // defpackage.le0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OPXfSBeufaJ8(Object obj) {
        int i = this.OPXfSBeufaJ8;
        e60 e60Var = this.wdg6QnbFHrFF;
        u50 u50Var = u50.wdg6QnbFHrFF;
        u50 u50Var2 = u50.OPXfSBeufaJ8;
        u50 u50Var3 = u50.rtx2ld2ELZv4;
        float f = 1.0f;
        k70 k70Var = this.dgRBjINgWbAK;
        switch (i) {
            case 0:
                dl2 dl2Var = (dl2) obj;
                if (dl2Var.PxuCJdSBwIXG(u50Var3, u50Var2)) {
                    m70 m70Var = ((f60) e60Var).lS5Rgt96tfkO.PxuCJdSBwIXG;
                    return m70Var != null ? m70Var.PxuCJdSBwIXG : z50.lS5Rgt96tfkO;
                }
                if (!dl2Var.PxuCJdSBwIXG(u50Var2, u50Var)) {
                    return z50.lS5Rgt96tfkO;
                }
                m70 m70Var2 = ((l70) k70Var).TSizfFm2Yiuu.PxuCJdSBwIXG;
                return m70Var2 != null ? m70Var2.PxuCJdSBwIXG : z50.lS5Rgt96tfkO;
            case 1:
                int ordinal = ((u50) obj).ordinal();
                if (ordinal == 0) {
                    break;
                } else {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            u9.gPXPFXrUH4XX();
                            return null;
                        }
                        break;
                    }
                    return Float.valueOf(f);
                }
            case 2:
                dl2 dl2Var2 = (dl2) obj;
                if (dl2Var2.PxuCJdSBwIXG(u50Var3, u50Var2)) {
                    return z50.lS5Rgt96tfkO;
                }
                if (!dl2Var2.PxuCJdSBwIXG(u50Var2, u50Var)) {
                    return z50.lS5Rgt96tfkO;
                }
                hl2 hl2Var = ((l70) k70Var).TSizfFm2Yiuu;
                return z50.lS5Rgt96tfkO;
            default:
                int ordinal2 = ((u50) obj).ordinal();
                if (ordinal2 != 0 && ordinal2 != 1) {
                    if (ordinal2 != 2) {
                        u9.gPXPFXrUH4XX();
                        return null;
                    }
                    hl2 hl2Var2 = ((l70) k70Var).TSizfFm2Yiuu;
                }
                return Float.valueOf(1.0f);
        }
    }
}
