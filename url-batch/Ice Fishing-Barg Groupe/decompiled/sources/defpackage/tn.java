package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final /* synthetic */ class tn implements ve0 {
    @Override // defpackage.ve0
    public final Object Y1f8riQaR6yg(Object obj, Object obj2, Boolean bool, Object obj3, Object obj4, Object obj5, tf0 tf0Var, Integer num) {
        int i;
        n61 n61Var = (n61) obj;
        String str = (String) obj2;
        boolean booleanValue = bool.booleanValue();
        os osVar = (os) obj3;
        qe0 qe0Var = (qe0) obj4;
        ae0 ae0Var = (ae0) obj5;
        int intValue = num.intValue();
        if ((intValue & 6) == 0) {
            i = (tf0Var.a92UlCVFR9N8(n61Var) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= tf0Var.a92UlCVFR9N8(str) ? 32 : 16;
        }
        if ((intValue & 384) == 0) {
            i |= tf0Var.RAsUl2FVSrh6(booleanValue) ? 256 : 128;
        }
        if ((intValue & 3072) == 0) {
            i |= tf0Var.a92UlCVFR9N8(osVar) ? 2048 : 1024;
        }
        if ((intValue & 24576) == 0) {
            i |= tf0Var.rtx2ld2ELZv4(qe0Var) ? 16384 : 8192;
        }
        if ((intValue & 196608) == 0) {
            i |= tf0Var.rtx2ld2ELZv4(ae0Var) ? 131072 : 65536;
        }
        if (tf0Var.Pf0ThKz3j5YS(i & 1, (599187 & i) != 599186)) {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            zs.TSizfFm2Yiuu(str, booleanValue, osVar, n61Var, qe0Var, ae0Var, tf0Var, ((i >> 3) & 1022) | ((i << 9) & 7168) | (57344 & i) | (i & 458752));
        } else {
            tf0Var.i68hK7ahKtgp();
        }
        return no2.PxuCJdSBwIXG;
    }
}
