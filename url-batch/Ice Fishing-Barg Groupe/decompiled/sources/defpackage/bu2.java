package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class bu2 {
    public static final c81 PxuCJdSBwIXG;
    public static final zt2[] lS5Rgt96tfkO;

    static {
        c81 c81Var = new c81(8);
        zt2.Companion.getClass();
        au2 au2Var = yt2.RAsUl2FVSrh6;
        c81Var.rtx2ld2ELZv4(1, au2Var);
        au2 au2Var2 = yt2.a92UlCVFR9N8;
        c81Var.rtx2ld2ELZv4(2, au2Var2);
        au2 au2Var3 = yt2.lS5Rgt96tfkO;
        c81Var.rtx2ld2ELZv4(4, au2Var3);
        au2 au2Var4 = yt2.Y1f8riQaR6yg;
        c81Var.rtx2ld2ELZv4(8, au2Var4);
        au2 au2Var5 = yt2.rtx2ld2ELZv4;
        c81Var.rtx2ld2ELZv4(16, au2Var5);
        au2 au2Var6 = yt2.e9gEMXR7LXtO;
        c81Var.rtx2ld2ELZv4(32, au2Var6);
        au2 au2Var7 = yt2.OPXfSBeufaJ8;
        c81Var.rtx2ld2ELZv4(64, au2Var7);
        au2 au2Var8 = yt2.TSizfFm2Yiuu;
        c81Var.rtx2ld2ELZv4(128, au2Var8);
        PxuCJdSBwIXG = c81Var;
        lS5Rgt96tfkO = new zt2[]{au2Var, au2Var2, au2Var3, au2Var7, au2Var5, au2Var6, au2Var4, yt2.wdg6QnbFHrFF, au2Var8};
    }

    public static final void PxuCJdSBwIXG(r31 r31Var, ut1 ut1Var, long j, int i, int i2) {
        if (vi0.BRwzKIf41E4i(j, -1L)) {
            return;
        }
        r31Var.PxuCJdSBwIXG(ut1Var.TSizfFm2Yiuu(), (int) ((j >>> 48) & 65535));
        r31Var.PxuCJdSBwIXG(ut1Var.lS5Rgt96tfkO(), (int) ((j >>> 32) & 65535));
        r31Var.PxuCJdSBwIXG(ut1Var.Y1f8riQaR6yg(), i - ((int) ((j >>> 16) & 65535)));
        r31Var.PxuCJdSBwIXG(ut1Var.PxuCJdSBwIXG(), i2 - ((int) (j & 65535)));
    }
}
