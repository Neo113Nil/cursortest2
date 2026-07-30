package defpackage;

import android.database.SQLException;
import java.util.Set;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class bm2 extends jc2 implements pe0 {
    public final /* synthetic */ gm2 QrzZRwfaDlRX;
    public int cpQdD2nAriOS;
    public /* synthetic */ Object r3s1LDPKFs1S;
    public final /* synthetic */ int x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bm2(gm2 gm2Var, bt btVar, int i) {
        super(2, btVar);
        this.x50lh2ztY7Y5 = i;
        this.QrzZRwfaDlRX = gm2Var;
    }

    @Override // defpackage.nc
    public final Object RfyTYNmI9Srp(Object obj) {
        tk2 tk2Var;
        int i = this.x50lh2ztY7Y5;
        gm2 gm2Var = this.QrzZRwfaDlRX;
        su suVar = su.rtx2ld2ELZv4;
        bt btVar = null;
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
                qj1 qj1Var = (qj1) this.r3s1LDPKFs1S;
                this.cpQdD2nAriOS = 1;
                Object PxuCJdSBwIXG = gm2.PxuCJdSBwIXG(gm2Var, qj1Var, this);
                return PxuCJdSBwIXG == suVar ? suVar : PxuCJdSBwIXG;
            default:
                int i3 = this.cpQdD2nAriOS;
                try {
                    if (i3 == 0) {
                        ng0.tmVwIGCQF4zR(obj);
                        tk2Var = (tk2) this.r3s1LDPKFs1S;
                        this.r3s1LDPKFs1S = tk2Var;
                        this.cpQdD2nAriOS = 1;
                        obj = tk2Var.TSizfFm2Yiuu(this);
                        if (obj == suVar) {
                            return suVar;
                        }
                    } else {
                        if (i3 != 1) {
                            if (i3 == 2) {
                                ng0.tmVwIGCQF4zR(obj);
                                return (Set) obj;
                            }
                            u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        tk2Var = (tk2) this.r3s1LDPKFs1S;
                        ng0.tmVwIGCQF4zR(obj);
                    }
                    if (!((Boolean) obj).booleanValue()) {
                        sk2 sk2Var = sk2.OPXfSBeufaJ8;
                        bm2 bm2Var = new bm2(gm2Var, btVar, 0);
                        this.r3s1LDPKFs1S = null;
                        this.cpQdD2nAriOS = 2;
                        obj = tk2Var.PxuCJdSBwIXG(sk2Var, bm2Var, this);
                        if (obj == suVar) {
                            return suVar;
                        }
                        return (Set) obj;
                    }
                } catch (SQLException unused) {
                }
                return t50.rtx2ld2ELZv4;
        }
    }

    @Override // defpackage.nc
    public final bt gPXPFXrUH4XX(bt btVar, Object obj) {
        switch (this.x50lh2ztY7Y5) {
            case 0:
                bm2 bm2Var = new bm2(this.QrzZRwfaDlRX, btVar, 0);
                bm2Var.r3s1LDPKFs1S = obj;
                return bm2Var;
            default:
                bm2 bm2Var2 = new bm2(this.QrzZRwfaDlRX, btVar, 1);
                bm2Var2.r3s1LDPKFs1S = obj;
                return bm2Var2;
        }
    }

    @Override // defpackage.pe0
    public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
        int i = this.x50lh2ztY7Y5;
        no2 no2Var = no2.PxuCJdSBwIXG;
        switch (i) {
            case 0:
                return ((bm2) gPXPFXrUH4XX((bt) obj2, (qj1) obj)).RfyTYNmI9Srp(no2Var);
            default:
                return ((bm2) gPXPFXrUH4XX((bt) obj2, (tk2) obj)).RfyTYNmI9Srp(no2Var);
        }
    }
}
