package defpackage;

import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class xx1 {
    public static final wx1 Companion = new wx1();
    public final o PxuCJdSBwIXG;
    public List RAsUl2FVSrh6;
    public final js1 TSizfFm2Yiuu;
    public final boolean Y1f8riQaR6yg;
    public int a92UlCVFR9N8;
    public final List e9gEMXR7LXtO;
    public final i2 lS5Rgt96tfkO;
    public final ArrayList rtx2ld2ELZv4;

    public xx1(o oVar, i2 i2Var, js1 js1Var, boolean z) {
        List wdg6QnbFHrFF;
        i2Var.getClass();
        this.PxuCJdSBwIXG = oVar;
        this.lS5Rgt96tfkO = i2Var;
        this.TSizfFm2Yiuu = js1Var;
        this.Y1f8riQaR6yg = z;
        p50 p50Var = p50.rtx2ld2ELZv4;
        this.e9gEMXR7LXtO = p50Var;
        this.RAsUl2FVSrh6 = p50Var;
        this.rtx2ld2ELZv4 = new ArrayList();
        gm0 gm0Var = oVar.rtx2ld2ELZv4;
        js1Var.dgRBjINgWbAK.getClass();
        gm0Var.getClass();
        URI RAsUl2FVSrh6 = gm0Var.RAsUl2FVSrh6();
        if (RAsUl2FVSrh6.getHost() == null) {
            wdg6QnbFHrFF = mv2.wdg6QnbFHrFF(new Proxy[]{Proxy.NO_PROXY});
        } else {
            List<Proxy> select = oVar.RAsUl2FVSrh6.select(RAsUl2FVSrh6);
            wdg6QnbFHrFF = (select == null || select.isEmpty()) ? mv2.wdg6QnbFHrFF(new Proxy[]{Proxy.NO_PROXY}) : mv2.OPXfSBeufaJ8(select);
        }
        this.e9gEMXR7LXtO = wdg6QnbFHrFF;
        this.a92UlCVFR9N8 = 0;
        s60 s60Var = js1Var.dgRBjINgWbAK;
        List list = this.e9gEMXR7LXtO;
        s60Var.getClass();
        list.getClass();
    }

    public final boolean PxuCJdSBwIXG() {
        return this.a92UlCVFR9N8 < this.e9gEMXR7LXtO.size() || !this.rtx2ld2ELZv4.isEmpty();
    }
}
