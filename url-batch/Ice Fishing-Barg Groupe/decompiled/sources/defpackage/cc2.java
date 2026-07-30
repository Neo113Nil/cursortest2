package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class cc2 implements pe0 {
    public final /* synthetic */ z42 OPXfSBeufaJ8;
    public final /* synthetic */ float cpQdD2nAriOS;
    public final /* synthetic */ float dgRBjINgWbAK;
    public final /* synthetic */ on r3s1LDPKFs1S;
    public final /* synthetic */ n61 rtx2ld2ELZv4;
    public final /* synthetic */ long wdg6QnbFHrFF;
    public final /* synthetic */ le x50lh2ztY7Y5;

    public cc2(n61 n61Var, z42 z42Var, long j, float f, le leVar, float f2, on onVar) {
        this.rtx2ld2ELZv4 = n61Var;
        this.OPXfSBeufaJ8 = z42Var;
        this.wdg6QnbFHrFF = j;
        this.dgRBjINgWbAK = f;
        this.x50lh2ztY7Y5 = leVar;
        this.cpQdD2nAriOS = f2;
        this.r3s1LDPKFs1S = onVar;
    }

    @Override // defpackage.pe0
    public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
        hp hpVar = (hp) obj;
        int intValue = ((Number) obj2).intValue();
        tf0 tf0Var = (tf0) hpVar;
        boolean Pf0ThKz3j5YS = tf0Var.Pf0ThKz3j5YS(intValue & 1, (intValue & 3) != 2);
        no2 no2Var = no2.PxuCJdSBwIXG;
        if (!Pf0ThKz3j5YS) {
            tf0Var.i68hK7ahKtgp();
            return no2Var;
        }
        gg1 gg1Var = mp.PxuCJdSBwIXG;
        n61 PxuCJdSBwIXG = ec2.PxuCJdSBwIXG(this.rtx2ld2ELZv4, this.OPXfSBeufaJ8, ec2.lS5Rgt96tfkO(this.wdg6QnbFHrFF, this.dgRBjINgWbAK, tf0Var), this.x50lh2ztY7Y5, ((hy) tf0Var.wdg6QnbFHrFF(eq.rtx2ld2ELZv4)).e6tOsSdd2EFb(this.cpQdD2nAriOS));
        Object nLZGh9p8gVSu = tf0Var.nLZGh9p8gVSu();
        hp.Companion.getClass();
        jx1 jx1Var = fp.lS5Rgt96tfkO;
        if (nLZGh9p8gVSu == jx1Var) {
            nLZGh9p8gVSu = new vz1(19);
            tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu);
        }
        AtomicInteger atomicInteger = a32.PxuCJdSBwIXG;
        n61 TSizfFm2Yiuu = PxuCJdSBwIXG.TSizfFm2Yiuu(new p9((le0) nLZGh9p8gVSu, false));
        Object nLZGh9p8gVSu2 = tf0Var.nLZGh9p8gVSu();
        if (nLZGh9p8gVSu2 == jx1Var) {
            nLZGh9p8gVSu2 = bc2.PxuCJdSBwIXG;
            tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu2);
        }
        n61 PxuCJdSBwIXG2 = lc2.PxuCJdSBwIXG(TSizfFm2Yiuu, no2Var, (PointerInputEventHandler) nLZGh9p8gVSu2);
        s.Companion.getClass();
        j51 Y1f8riQaR6yg = xe.Y1f8riQaR6yg(r.lS5Rgt96tfkO, true);
        int S9EYkSpbGuxq = cs0.S9EYkSpbGuxq(tf0Var);
        il1 x50lh2ztY7Y5 = tf0Var.x50lh2ztY7Y5();
        n61 xfACYKDMU6Dj = ov2.xfACYKDMU6Dj(tf0Var, PxuCJdSBwIXG2);
        yo.Companion.getClass();
        dq dqVar = xo.lS5Rgt96tfkO;
        tf0Var.ngxnMNrpiKat();
        if (tf0Var.zf8DYfih6EZu) {
            tf0Var.dgRBjINgWbAK(dqVar);
        } else {
            tf0Var.hVNtCUZb4tYH();
        }
        th0.tmVwIGCQF4zR(tf0Var, xo.a92UlCVFR9N8, Y1f8riQaR6yg);
        th0.tmVwIGCQF4zR(tf0Var, xo.e9gEMXR7LXtO, x50lh2ztY7Y5);
        p7 p7Var = xo.RAsUl2FVSrh6;
        if (tf0Var.zf8DYfih6EZu || !cs0.wdg6QnbFHrFF(tf0Var.nLZGh9p8gVSu(), Integer.valueOf(S9EYkSpbGuxq))) {
            o0.RfyTYNmI9Srp(S9EYkSpbGuxq, tf0Var, S9EYkSpbGuxq, p7Var);
        }
        th0.tmVwIGCQF4zR(tf0Var, xo.Y1f8riQaR6yg, xfACYKDMU6Dj);
        this.r3s1LDPKFs1S.rtx2ld2ELZv4(tf0Var, 0);
        tf0Var.gPXPFXrUH4XX(true);
        return no2Var;
    }
}
