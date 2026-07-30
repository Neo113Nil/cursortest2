package defpackage;

import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class fx0 extends sw0 {
    public final /* synthetic */ pe0 TSizfFm2Yiuu;
    public final /* synthetic */ jx0 lS5Rgt96tfkO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fx0(jx0 jx0Var, pe0 pe0Var, String str) {
        super(str);
        this.lS5Rgt96tfkO = jx0Var;
        this.TSizfFm2Yiuu = pe0Var;
    }

    @Override // defpackage.j51
    public final k51 a92UlCVFR9N8(l51 l51Var, List list, long j) {
        jx0 jx0Var = this.lS5Rgt96tfkO;
        dx0 dx0Var = jx0Var.QrzZRwfaDlRX;
        dx0Var.rtx2ld2ELZv4 = l51Var.getLayoutDirection();
        dx0Var.OPXfSBeufaJ8 = l51Var.lS5Rgt96tfkO();
        dx0Var.wdg6QnbFHrFF = l51Var.r3s1LDPKFs1S();
        boolean VhhvGxCb8gfr = l51Var.VhhvGxCb8gfr();
        pe0 pe0Var = this.TSizfFm2Yiuu;
        if (VhhvGxCb8gfr || jx0Var.rtx2ld2ELZv4.QrzZRwfaDlRX == null) {
            jx0Var.dgRBjINgWbAK = 0;
            k51 k51Var = (k51) pe0Var.rtx2ld2ELZv4(dx0Var, new rr(j));
            return new ex0(k51Var, jx0Var, jx0Var.dgRBjINgWbAK, k51Var, 1);
        }
        jx0Var.x50lh2ztY7Y5 = 0;
        k51 k51Var2 = (k51) pe0Var.rtx2ld2ELZv4(jx0Var.gPXPFXrUH4XX, new rr(j));
        return new ex0(k51Var2, jx0Var, jx0Var.x50lh2ztY7Y5, k51Var2, 0);
    }
}
