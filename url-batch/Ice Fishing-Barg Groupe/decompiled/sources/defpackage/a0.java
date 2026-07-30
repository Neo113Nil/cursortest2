package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class a0 extends jc2 implements pe0 {
    public int cpQdD2nAriOS;
    public final /* synthetic */ b0 r3s1LDPKFs1S;
    public final /* synthetic */ int x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(b0 b0Var, bt btVar, int i) {
        super(2, btVar);
        this.x50lh2ztY7Y5 = i;
        this.r3s1LDPKFs1S = b0Var;
    }

    @Override // defpackage.nc
    public final Object RfyTYNmI9Srp(Object obj) {
        Object uv1Var;
        Object uv1Var2;
        int i = this.x50lh2ztY7Y5;
        b0 b0Var = this.r3s1LDPKFs1S;
        su suVar = su.rtx2ld2ELZv4;
        switch (i) {
            case 0:
                int i2 = this.cpQdD2nAriOS;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ng0.tmVwIGCQF4zR(obj);
                        return obj;
                    }
                    u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ng0.tmVwIGCQF4zR(obj);
                q3 q3Var = b0Var.lS5Rgt96tfkO;
                this.cpQdD2nAriOS = 1;
                q3Var.getClass();
                uy1 uy1Var = new uy1(12, q3Var);
                yw ywVar = j00.PxuCJdSBwIXG;
                Object OYiFbU3x63rc = fx1.OYiFbU3x63rc(qw.wdg6QnbFHrFF, new c0(uy1Var, null, 0), this);
                return OYiFbU3x63rc == suVar ? suVar : OYiFbU3x63rc;
            case 1:
                int i3 = this.cpQdD2nAriOS;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ng0.tmVwIGCQF4zR(obj);
                        return obj;
                    }
                    u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ng0.tmVwIGCQF4zR(obj);
                q3 q3Var2 = b0Var.TSizfFm2Yiuu;
                this.cpQdD2nAriOS = 1;
                q3Var2.getClass();
                bi biVar = new bi(1, ng0.IAToe7bXGz4N(this));
                biVar.ZbWwgt3aGe7A();
                try {
                    uv1Var = new eq0(q3Var2.PxuCJdSBwIXG);
                } catch (Throwable th) {
                    uv1Var = new uv1(th);
                }
                Throwable PxuCJdSBwIXG = vv1.PxuCJdSBwIXG(uv1Var);
                if (PxuCJdSBwIXG == null) {
                    eq0 eq0Var = (eq0) uv1Var;
                    biVar.IAToe7bXGz4N(new d0(1, eq0Var));
                    try {
                        eq0Var.lS5Rgt96tfkO(new op0(1, eq0Var, biVar));
                        uv1Var2 = no2.PxuCJdSBwIXG;
                    } catch (Throwable th2) {
                        uv1Var2 = new uv1(th2);
                    }
                    Throwable PxuCJdSBwIXG2 = vv1.PxuCJdSBwIXG(uv1Var2);
                    if (PxuCJdSBwIXG2 != null) {
                        if (PxuCJdSBwIXG2 instanceof CancellationException) {
                            throw PxuCJdSBwIXG2;
                        }
                        bs0.gPXPFXrUH4XX(eq0Var);
                        if (biVar.S2OOm9zPNm0h() instanceof be1) {
                            biVar.RAsUl2FVSrh6("");
                        }
                    }
                } else if (PxuCJdSBwIXG instanceof CancellationException) {
                    biVar.QrzZRwfaDlRX(PxuCJdSBwIXG);
                } else if (biVar.S2OOm9zPNm0h() instanceof be1) {
                    biVar.RAsUl2FVSrh6("");
                }
                Object VhhvGxCb8gfr = biVar.VhhvGxCb8gfr();
                return VhhvGxCb8gfr == suVar ? suVar : VhhvGxCb8gfr;
            default:
                int i4 = this.cpQdD2nAriOS;
                if (i4 != 0) {
                    if (i4 == 1) {
                        ng0.tmVwIGCQF4zR(obj);
                        return obj;
                    }
                    u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ng0.tmVwIGCQF4zR(obj);
                q3 q3Var3 = b0Var.Y1f8riQaR6yg;
                this.cpQdD2nAriOS = 1;
                q3Var3.getClass();
                o5 o5Var = new o5(6, q3Var3);
                yw ywVar2 = j00.PxuCJdSBwIXG;
                Object OYiFbU3x63rc2 = fx1.OYiFbU3x63rc(qw.wdg6QnbFHrFF, new c0(o5Var, null, 0), this);
                return OYiFbU3x63rc2 == suVar ? suVar : OYiFbU3x63rc2;
        }
    }

    @Override // defpackage.nc
    public final bt gPXPFXrUH4XX(bt btVar, Object obj) {
        switch (this.x50lh2ztY7Y5) {
            case 0:
                return new a0(this.r3s1LDPKFs1S, btVar, 0);
            case 1:
                return new a0(this.r3s1LDPKFs1S, btVar, 1);
            default:
                return new a0(this.r3s1LDPKFs1S, btVar, 2);
        }
    }

    @Override // defpackage.pe0
    public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
        int i = this.x50lh2ztY7Y5;
        no2 no2Var = no2.PxuCJdSBwIXG;
        ru ruVar = (ru) obj;
        bt btVar = (bt) obj2;
        switch (i) {
        }
        return ((a0) gPXPFXrUH4XX(btVar, ruVar)).RfyTYNmI9Srp(no2Var);
    }
}
