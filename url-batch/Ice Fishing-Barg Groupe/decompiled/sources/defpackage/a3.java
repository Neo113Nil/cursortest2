package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class a3 extends kv0 implements pe0 {
    public final /* synthetic */ int OPXfSBeufaJ8;
    public final /* synthetic */ Object dgRBjINgWbAK;
    public final /* synthetic */ Object wdg6QnbFHrFF;
    public final /* synthetic */ pe0 x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(av2 av2Var, dp dpVar, pe0 pe0Var) {
        super(2);
        this.OPXfSBeufaJ8 = 2;
        this.wdg6QnbFHrFF = av2Var;
        this.dgRBjINgWbAK = dpVar;
        this.x50lh2ztY7Y5 = pe0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
    
        if (r5 == r8) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005e, code lost:
    
        if (r5 == r8) goto L19;
     */
    @Override // defpackage.pe0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
        int i = this.OPXfSBeufaJ8;
        no2 no2Var = no2.PxuCJdSBwIXG;
        pe0 pe0Var = this.x50lh2ztY7Y5;
        Object obj3 = this.dgRBjINgWbAK;
        Object obj4 = this.wdg6QnbFHrFF;
        int i2 = 1;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                zv.Y1f8riQaR6yg((ae0) obj4, (xz) obj3, (on) pe0Var, (hp) obj, ki0.bEKsvqmvPh2y(385));
                break;
            case 1:
                ((Number) obj2).intValue();
                eq.PxuCJdSBwIXG((ei1) obj4, (ih0) obj3, pe0Var, (hp) obj, ki0.bEKsvqmvPh2y(1));
                break;
            default:
                hp hpVar = (hp) obj;
                int intValue = ((Number) obj2).intValue();
                av2 av2Var = (av2) obj4;
                int i3 = 0;
                tf0 tf0Var = (tf0) hpVar;
                if (!tf0Var.Pf0ThKz3j5YS(intValue & 1, (intValue & 3) != 2)) {
                    tf0Var.i68hK7ahKtgp();
                    break;
                } else {
                    gg1 gg1Var = mp.PxuCJdSBwIXG;
                    r1 r1Var = av2Var.rtx2ld2ELZv4;
                    boolean rtx2ld2ELZv4 = tf0Var.rtx2ld2ELZv4(av2Var);
                    Object nLZGh9p8gVSu = tf0Var.nLZGh9p8gVSu();
                    bt btVar = null;
                    jx1 jx1Var = fp.lS5Rgt96tfkO;
                    if (!rtx2ld2ELZv4) {
                        hp.Companion.getClass();
                        break;
                    }
                    nLZGh9p8gVSu = new zu2(av2Var, btVar, i3);
                    tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu);
                    mm2.wdg6QnbFHrFF(tf0Var, (pe0) nLZGh9p8gVSu, r1Var);
                    boolean rtx2ld2ELZv42 = tf0Var.rtx2ld2ELZv4(av2Var);
                    Object nLZGh9p8gVSu2 = tf0Var.nLZGh9p8gVSu();
                    if (!rtx2ld2ELZv42) {
                        hp.Companion.getClass();
                        break;
                    }
                    nLZGh9p8gVSu2 = new zu2(av2Var, btVar, i2);
                    tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu2);
                    mm2.wdg6QnbFHrFF(tf0Var, (pe0) nLZGh9p8gVSu2, r1Var);
                    ((dp) obj3).PxuCJdSBwIXG(r1Var, pe0Var, tf0Var, 0);
                    break;
                }
        }
        return no2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a3(Object obj, Object obj2, pe0 pe0Var, int i, int i2) {
        super(2);
        this.OPXfSBeufaJ8 = i2;
        this.wdg6QnbFHrFF = obj;
        this.dgRBjINgWbAK = obj2;
        this.x50lh2ztY7Y5 = pe0Var;
    }
}
