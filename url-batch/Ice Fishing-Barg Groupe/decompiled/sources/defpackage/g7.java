package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class g7 {
    public final o8 OPXfSBeufaJ8;
    public final lm2 PxuCJdSBwIXG;
    public final o8 RAsUl2FVSrh6;
    public final j8 TSizfFm2Yiuu;
    public final mj1 Y1f8riQaR6yg;
    public final o91 a92UlCVFR9N8;
    public final mj1 e9gEMXR7LXtO;
    public final Object lS5Rgt96tfkO;
    public final o8 rtx2ld2ELZv4;
    public final o8 wdg6QnbFHrFF;

    public g7(Object obj, lm2 lm2Var, Object obj2) {
        this.PxuCJdSBwIXG = lm2Var;
        this.lS5Rgt96tfkO = obj2;
        j8 j8Var = new j8(lm2Var, obj, null, 60);
        this.TSizfFm2Yiuu = j8Var;
        this.Y1f8riQaR6yg = sj0.tmVwIGCQF4zR(Boolean.FALSE);
        this.e9gEMXR7LXtO = sj0.tmVwIGCQF4zR(obj);
        this.a92UlCVFR9N8 = new o91();
        new w82(obj2);
        o8 o8Var = j8Var.wdg6QnbFHrFF;
        boolean z = o8Var instanceof k8;
        o8 o8Var2 = z ? cs0.e9gEMXR7LXtO : o8Var instanceof l8 ? cs0.a92UlCVFR9N8 : o8Var instanceof m8 ? cs0.RAsUl2FVSrh6 : cs0.rtx2ld2ELZv4;
        this.RAsUl2FVSrh6 = o8Var2;
        o8 o8Var3 = z ? cs0.PxuCJdSBwIXG : o8Var instanceof l8 ? cs0.lS5Rgt96tfkO : o8Var instanceof m8 ? cs0.TSizfFm2Yiuu : cs0.Y1f8riQaR6yg;
        this.rtx2ld2ELZv4 = o8Var3;
        this.OPXfSBeufaJ8 = o8Var2;
        this.wdg6QnbFHrFF = o8Var3;
    }

    public static final Object PxuCJdSBwIXG(g7 g7Var, Object obj) {
        lm2 lm2Var = g7Var.PxuCJdSBwIXG;
        o8 o8Var = g7Var.wdg6QnbFHrFF;
        o8 o8Var2 = g7Var.OPXfSBeufaJ8;
        if (!cs0.wdg6QnbFHrFF(o8Var2, g7Var.RAsUl2FVSrh6) || !cs0.wdg6QnbFHrFF(o8Var, g7Var.rtx2ld2ELZv4)) {
            o8 o8Var3 = (o8) lm2Var.PxuCJdSBwIXG.OPXfSBeufaJ8(obj);
            int lS5Rgt96tfkO = o8Var3.lS5Rgt96tfkO();
            boolean z = false;
            for (int i = 0; i < lS5Rgt96tfkO; i++) {
                if (o8Var3.PxuCJdSBwIXG(i) < o8Var2.PxuCJdSBwIXG(i) || o8Var3.PxuCJdSBwIXG(i) > o8Var.PxuCJdSBwIXG(i)) {
                    o8Var3.e9gEMXR7LXtO(ng0.OPXfSBeufaJ8(o8Var3.PxuCJdSBwIXG(i), o8Var2.PxuCJdSBwIXG(i), o8Var.PxuCJdSBwIXG(i)), i);
                    z = true;
                }
            }
            if (z) {
                return lm2Var.lS5Rgt96tfkO.OPXfSBeufaJ8(o8Var3);
            }
        }
        return obj;
    }

    public static Object TSizfFm2Yiuu(g7 g7Var, Object obj, i8 i8Var, le0 le0Var, jc2 jc2Var, int i) {
        Object OPXfSBeufaJ8 = g7Var.PxuCJdSBwIXG.lS5Rgt96tfkO.OPXfSBeufaJ8(g7Var.TSizfFm2Yiuu.wdg6QnbFHrFF);
        le0 le0Var2 = (i & 8) != 0 ? null : le0Var;
        Object Y1f8riQaR6yg = g7Var.Y1f8riQaR6yg();
        lm2 lm2Var = g7Var.PxuCJdSBwIXG;
        return o91.PxuCJdSBwIXG(g7Var.a92UlCVFR9N8, new e7(g7Var, OPXfSBeufaJ8, new sd2(i8Var, lm2Var, Y1f8riQaR6yg, obj, (o8) lm2Var.PxuCJdSBwIXG.OPXfSBeufaJ8(OPXfSBeufaJ8)), g7Var.TSizfFm2Yiuu.dgRBjINgWbAK, le0Var2, null), jc2Var);
    }

    public static final void lS5Rgt96tfkO(g7 g7Var) {
        j8 j8Var = g7Var.TSizfFm2Yiuu;
        j8Var.wdg6QnbFHrFF.Y1f8riQaR6yg();
        j8Var.dgRBjINgWbAK = Long.MIN_VALUE;
        g7Var.Y1f8riQaR6yg.setValue(Boolean.FALSE);
    }

    public final Object Y1f8riQaR6yg() {
        return this.TSizfFm2Yiuu.OPXfSBeufaJ8.getValue();
    }

    public final Object e9gEMXR7LXtO(bt btVar, Object obj) {
        Object PxuCJdSBwIXG = o91.PxuCJdSBwIXG(this.a92UlCVFR9N8, new f7(this, obj, null), btVar);
        return PxuCJdSBwIXG == su.rtx2ld2ELZv4 ? PxuCJdSBwIXG : no2.PxuCJdSBwIXG;
    }

    public /* synthetic */ g7(Object obj, lm2 lm2Var, Object obj2, int i) {
        this(obj, lm2Var, (i & 4) != 0 ? null : obj2);
    }
}
