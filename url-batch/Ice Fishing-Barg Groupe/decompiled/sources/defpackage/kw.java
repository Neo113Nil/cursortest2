package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class kw extends jc2 implements pe0 {
    public final /* synthetic */ h12 BRwzKIf41E4i;
    public final /* synthetic */ float QrzZRwfaDlRX;
    public j8 cpQdD2nAriOS;
    public final /* synthetic */ lw gPXPFXrUH4XX;
    public int r3s1LDPKFs1S;
    public wt1 x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kw(float f, lw lwVar, h12 h12Var, bt btVar) {
        super(2, btVar);
        this.QrzZRwfaDlRX = f;
        this.gPXPFXrUH4XX = lwVar;
        this.BRwzKIf41E4i = h12Var;
    }

    @Override // defpackage.nc
    public final Object RfyTYNmI9Srp(Object obj) {
        float f;
        j8 j8Var;
        wt1 wt1Var;
        j8 j8Var2;
        bw bwVar;
        d7 d7Var;
        int i = this.r3s1LDPKFs1S;
        if (i == 0) {
            ng0.tmVwIGCQF4zR(obj);
            f = this.QrzZRwfaDlRX;
            if (Math.abs(f) > 1.0f) {
                wt1 wt1Var2 = new wt1();
                wt1Var2.rtx2ld2ELZv4 = f;
                wt1 wt1Var3 = new wt1();
                j8 XL4ISE6Oc65B = fx1.XL4ISE6Oc65B(f, 28);
                try {
                    lw lwVar = this.gPXPFXrUH4XX;
                    bwVar = lwVar.PxuCJdSBwIXG;
                    d7Var = new d7(wt1Var3, this.BRwzKIf41E4i, wt1Var2, lwVar, 2);
                    this.x50lh2ztY7Y5 = wt1Var2;
                    this.cpQdD2nAriOS = XL4ISE6Oc65B;
                    this.r3s1LDPKFs1S = 1;
                    j8Var = XL4ISE6Oc65B;
                } catch (CancellationException unused) {
                    j8Var = XL4ISE6Oc65B;
                }
                try {
                    Object x50lh2ztY7Y5 = ki0.x50lh2ztY7Y5(j8Var, new aw(bwVar, b51.QrzZRwfaDlRX, XL4ISE6Oc65B.OPXfSBeufaJ8.getValue(), XL4ISE6Oc65B.wdg6QnbFHrFF), Long.MIN_VALUE, d7Var, this);
                    Object obj2 = su.rtx2ld2ELZv4;
                    if (x50lh2ztY7Y5 != obj2) {
                        x50lh2ztY7Y5 = no2.PxuCJdSBwIXG;
                    }
                    if (x50lh2ztY7Y5 == obj2) {
                        return obj2;
                    }
                    wt1Var = wt1Var2;
                } catch (CancellationException unused2) {
                    wt1Var = wt1Var2;
                    j8Var2 = j8Var;
                    wt1Var.rtx2ld2ELZv4 = ((Number) j8Var2.rtx2ld2ELZv4.lS5Rgt96tfkO.OPXfSBeufaJ8(j8Var2.wdg6QnbFHrFF)).floatValue();
                    f = wt1Var.rtx2ld2ELZv4;
                    return new Float(f);
                }
            }
            return new Float(f);
        }
        if (i != 1) {
            u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j8Var2 = this.cpQdD2nAriOS;
        wt1Var = this.x50lh2ztY7Y5;
        try {
            ng0.tmVwIGCQF4zR(obj);
        } catch (CancellationException unused3) {
            wt1Var.rtx2ld2ELZv4 = ((Number) j8Var2.rtx2ld2ELZv4.lS5Rgt96tfkO.OPXfSBeufaJ8(j8Var2.wdg6QnbFHrFF)).floatValue();
            f = wt1Var.rtx2ld2ELZv4;
            return new Float(f);
        }
        f = wt1Var.rtx2ld2ELZv4;
        return new Float(f);
    }

    @Override // defpackage.nc
    public final bt gPXPFXrUH4XX(bt btVar, Object obj) {
        return new kw(this.QrzZRwfaDlRX, this.gPXPFXrUH4XX, this.BRwzKIf41E4i, btVar);
    }

    @Override // defpackage.pe0
    public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
        return ((kw) gPXPFXrUH4XX((bt) obj2, (ru) obj)).RfyTYNmI9Srp(no2.PxuCJdSBwIXG);
    }
}
