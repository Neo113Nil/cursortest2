package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ss {
    public final d82 PxuCJdSBwIXG = new d82();

    public static void lS5Rgt96tfkO(final ss ssVar, final pe0 pe0Var, on onVar, final ae0 ae0Var, int i) {
        final k61 k61Var = n61.Companion;
        if ((i & 8) != 0) {
            onVar = null;
        }
        final on onVar2 = onVar;
        ssVar.PxuCJdSBwIXG.add(new on(-1789283891, true, new qe0() { // from class: rs
            @Override // defpackage.qe0
            public final Object a92UlCVFR9N8(Object obj, Object obj2, Object obj3) {
                os osVar = (os) obj;
                hp hpVar = (hp) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= ((tf0) hpVar).a92UlCVFR9N8(osVar) ? 4 : 2;
                }
                tf0 tf0Var = (tf0) hpVar;
                if (tf0Var.Pf0ThKz3j5YS(intValue & 1, (intValue & 19) != 18)) {
                    gg1 gg1Var = mp.PxuCJdSBwIXG;
                    String str = (String) pe0.this.rtx2ld2ELZv4(tf0Var, 0);
                    if (ia2.fRTaYY6FBZcX(str)) {
                        hp0.TSizfFm2Yiuu("Label must not be blank");
                    }
                    ssVar.getClass();
                    ov2.Y1f8riQaR6yg.Y1f8riQaR6yg(k61Var, str, Boolean.TRUE, osVar, onVar2, ae0Var, tf0Var, Integer.valueOf((intValue << 9) & 7168));
                } else {
                    tf0Var.i68hK7ahKtgp();
                }
                return no2.PxuCJdSBwIXG;
            }
        }));
    }

    public final void PxuCJdSBwIXG(os osVar, hp hpVar, int i) {
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(-798501095);
        int i2 = (tf0Var.a92UlCVFR9N8(osVar) ? 4 : 2) | i | (tf0Var.a92UlCVFR9N8(this) ? 32 : 16);
        if (tf0Var.Pf0ThKz3j5YS(i2 & 1, (i2 & 19) != 18)) {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            d82 d82Var = this.PxuCJdSBwIXG;
            int size = d82Var.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((qe0) d82Var.get(i3)).a92UlCVFR9N8(osVar, tf0Var, Integer.valueOf(i2 & 14));
            }
            gg1 gg1Var2 = mp.PxuCJdSBwIXG;
        } else {
            tf0Var.i68hK7ahKtgp();
        }
        zs1 XL4ISE6Oc65B = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B != null) {
            XL4ISE6Oc65B.Y1f8riQaR6yg = new bf(i, 3, this, osVar);
        }
    }
}
