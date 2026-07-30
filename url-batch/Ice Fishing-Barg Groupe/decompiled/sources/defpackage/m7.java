package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class m7 extends kv0 implements qe0 {
    public final /* synthetic */ d82 OPXfSBeufaJ8;
    public final /* synthetic */ y7 dgRBjINgWbAK;
    public final /* synthetic */ Object wdg6QnbFHrFF;
    public final /* synthetic */ on x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7(d82 d82Var, Object obj, y7 y7Var, on onVar) {
        super(3);
        this.OPXfSBeufaJ8 = d82Var;
        this.wdg6QnbFHrFF = obj;
        this.dgRBjINgWbAK = y7Var;
        this.x50lh2ztY7Y5 = onVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        if (r4 == r5) goto L22;
     */
    @Override // defpackage.qe0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a92UlCVFR9N8(Object obj, Object obj2, Object obj3) {
        c8 c8Var = (c8) obj;
        hp hpVar = (hp) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= (intValue & 8) == 0 ? ((tf0) hpVar).a92UlCVFR9N8(c8Var) : ((tf0) hpVar).rtx2ld2ELZv4(c8Var) ? 4 : 2;
        }
        tf0 tf0Var = (tf0) hpVar;
        if (tf0Var.Pf0ThKz3j5YS(intValue & 1, (intValue & 19) != 18)) {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            d82 d82Var = this.OPXfSBeufaJ8;
            boolean a92UlCVFR9N8 = tf0Var.a92UlCVFR9N8(d82Var);
            Object obj4 = this.wdg6QnbFHrFF;
            boolean rtx2ld2ELZv4 = a92UlCVFR9N8 | tf0Var.rtx2ld2ELZv4(obj4);
            y7 y7Var = this.dgRBjINgWbAK;
            boolean rtx2ld2ELZv42 = rtx2ld2ELZv4 | tf0Var.rtx2ld2ELZv4(y7Var);
            Object nLZGh9p8gVSu = tf0Var.nLZGh9p8gVSu();
            jx1 jx1Var = fp.lS5Rgt96tfkO;
            if (!rtx2ld2ELZv42) {
                hp.Companion.getClass();
            }
            nLZGh9p8gVSu = new l7(d82Var, obj4, y7Var, 0);
            tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu);
            mm2.rtx2ld2ELZv4(c8Var, (le0) nLZGh9p8gVSu, tf0Var);
            v81 v81Var = y7Var.Y1f8riQaR6yg;
            c8Var.getClass();
            v81Var.cpQdD2nAriOS(obj4, ((d8) c8Var).PxuCJdSBwIXG);
            Object nLZGh9p8gVSu2 = tf0Var.nLZGh9p8gVSu();
            hp.Companion.getClass();
            if (nLZGh9p8gVSu2 == jx1Var) {
                nLZGh9p8gVSu2 = new s7();
                tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu2);
            }
            this.x50lh2ztY7Y5.r3s1LDPKFs1S((s7) nLZGh9p8gVSu2, obj4, tf0Var, 0);
        } else {
            tf0Var.i68hK7ahKtgp();
        }
        return no2.PxuCJdSBwIXG;
    }
}
