package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class e7 extends jc2 implements le0 {
    public final /* synthetic */ sd2 BRwzKIf41E4i;
    public final /* synthetic */ g7 QrzZRwfaDlRX;
    public final /* synthetic */ le0 RfyTYNmI9Srp;
    public final /* synthetic */ long XL4ISE6Oc65B;
    public vt1 cpQdD2nAriOS;
    public final /* synthetic */ Object gPXPFXrUH4XX;
    public int r3s1LDPKFs1S;
    public j8 x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7(g7 g7Var, Object obj, sd2 sd2Var, long j, le0 le0Var, bt btVar) {
        super(1, btVar);
        this.QrzZRwfaDlRX = g7Var;
        this.gPXPFXrUH4XX = obj;
        this.BRwzKIf41E4i = sd2Var;
        this.XL4ISE6Oc65B = j;
        this.RfyTYNmI9Srp = le0Var;
    }

    @Override // defpackage.le0
    public final Object OPXfSBeufaJ8(Object obj) {
        long j = this.XL4ISE6Oc65B;
        le0 le0Var = this.RfyTYNmI9Srp;
        return new e7(this.QrzZRwfaDlRX, this.gPXPFXrUH4XX, this.BRwzKIf41E4i, j, le0Var, (bt) obj).RfyTYNmI9Srp(no2.PxuCJdSBwIXG);
    }

    @Override // defpackage.nc
    public final Object RfyTYNmI9Srp(Object obj) {
        g7 g7Var;
        j8 j8Var;
        vt1 vt1Var;
        long j;
        d7 d7Var;
        j8 j8Var2;
        vt1 vt1Var2;
        CancellationException cancellationException;
        sd2 sd2Var = this.BRwzKIf41E4i;
        int i = this.r3s1LDPKFs1S;
        g7 g7Var2 = this.QrzZRwfaDlRX;
        if (i == 0) {
            ng0.tmVwIGCQF4zR(obj);
            try {
                g7Var2.TSizfFm2Yiuu.wdg6QnbFHrFF = (o8) g7Var2.PxuCJdSBwIXG.PxuCJdSBwIXG.OPXfSBeufaJ8(this.gPXPFXrUH4XX);
                g7Var2.e9gEMXR7LXtO.setValue(sd2Var.TSizfFm2Yiuu);
                g7Var2.Y1f8riQaR6yg.setValue(Boolean.TRUE);
                j8 j8Var3 = g7Var2.TSizfFm2Yiuu;
                j8Var = new j8(j8Var3.rtx2ld2ELZv4, j8Var3.OPXfSBeufaJ8.getValue(), mm2.aF05bpZJlKEP(j8Var3.wdg6QnbFHrFF), j8Var3.dgRBjINgWbAK, Long.MIN_VALUE, j8Var3.cpQdD2nAriOS);
                vt1Var = new vt1();
                j = this.XL4ISE6Oc65B;
                d7Var = new d7(g7Var2, j8Var, this.RfyTYNmI9Srp, vt1Var, 0);
                g7Var = g7Var2;
            } catch (CancellationException e) {
                e = e;
                g7Var = g7Var2;
                cancellationException = e;
                g7.lS5Rgt96tfkO(g7Var);
                throw cancellationException;
            }
            try {
                this.x50lh2ztY7Y5 = j8Var;
                this.cpQdD2nAriOS = vt1Var;
                this.r3s1LDPKFs1S = 1;
                Object x50lh2ztY7Y5 = ki0.x50lh2ztY7Y5(j8Var, sd2Var, j, d7Var, this);
                su suVar = su.rtx2ld2ELZv4;
                if (x50lh2ztY7Y5 == suVar) {
                    return suVar;
                }
                j8Var2 = j8Var;
                vt1Var2 = vt1Var;
            } catch (CancellationException e2) {
                e = e2;
                cancellationException = e;
                g7.lS5Rgt96tfkO(g7Var);
                throw cancellationException;
            }
        } else {
            if (i != 1) {
                u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vt1Var2 = this.cpQdD2nAriOS;
            j8Var2 = this.x50lh2ztY7Y5;
            try {
                ng0.tmVwIGCQF4zR(obj);
                g7Var = g7Var2;
            } catch (CancellationException e3) {
                cancellationException = e3;
                g7Var = g7Var2;
                g7.lS5Rgt96tfkO(g7Var);
                throw cancellationException;
            }
        }
        f8 f8Var = vt1Var2.rtx2ld2ELZv4 ? f8.rtx2ld2ELZv4 : f8.OPXfSBeufaJ8;
        g7.lS5Rgt96tfkO(g7Var);
        return new g8(j8Var2, f8Var);
    }
}
