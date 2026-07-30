package defpackage;

import android.os.Looper;
import android.view.Choreographer;
import android.view.View;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class z4 extends kv0 implements le0 {
    public final /* synthetic */ int OPXfSBeufaJ8;
    public final /* synthetic */ Object dgRBjINgWbAK;
    public final /* synthetic */ Object wdg6QnbFHrFF;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z4(int i, Object obj, Object obj2) {
        super(1);
        this.OPXfSBeufaJ8 = i;
        this.dgRBjINgWbAK = obj;
        this.wdg6QnbFHrFF = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.le0
    public final Object OPXfSBeufaJ8(Object obj) {
        lt1 lt1Var;
        int i = 0;
        switch (this.OPXfSBeufaJ8) {
            case 0:
                return new pp0((zz0) this.dgRBjINgWbAK, new y4(i, (a5) this.wdg6QnbFHrFF));
            case 1:
                pp0 pp0Var = (pp0) this.dgRBjINgWbAK;
                synchronized (pp0Var.TSizfFm2Yiuu) {
                    try {
                        pp0Var.e9gEMXR7LXtO = true;
                        f91 f91Var = pp0Var.Y1f8riQaR6yg;
                        Object[] objArr = f91Var.rtx2ld2ELZv4;
                        int i2 = f91Var.wdg6QnbFHrFF;
                        while (i < i2) {
                            je1 je1Var = (je1) ((zr2) objArr[i]).get();
                            if (je1Var != null && (lt1Var = je1Var.lS5Rgt96tfkO) != null) {
                                lt1Var.closeConnection();
                                je1Var.lS5Rgt96tfkO = null;
                            }
                            i++;
                        }
                        pp0Var.Y1f8riQaR6yg.RAsUl2FVSrh6();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                ai2 ai2Var = ((a5) this.wdg6QnbFHrFF).OPXfSBeufaJ8;
                ai2Var.lS5Rgt96tfkO.set(null);
                ai2Var.PxuCJdSBwIXG.RAsUl2FVSrh6();
                return no2.PxuCJdSBwIXG;
            case 2:
                ap1 ap1Var = (ap1) this.dgRBjINgWbAK;
                ap1Var.setPositionProvider((dp1) this.wdg6QnbFHrFF);
                ap1Var.XL4ISE6Oc65B();
                return new e5(0);
            case 3:
                v6 v6Var = (v6) this.dgRBjINgWbAK;
                w6 w6Var = (w6) this.wdg6QnbFHrFF;
                synchronized (v6Var.x50lh2ztY7Y5) {
                    v6Var.r3s1LDPKFs1S.remove(w6Var);
                }
                return no2.PxuCJdSBwIXG;
            case 4:
                ((Choreographer) ((x6) this.dgRBjINgWbAK).OPXfSBeufaJ8).removeFrameCallback((w6) this.wdg6QnbFHrFF);
                return no2.PxuCJdSBwIXG;
            case 5:
                dm1 dm1Var = (dm1) obj;
                em1 em1Var = (em1) this.dgRBjINgWbAK;
                float rtx2ld2ELZv4 = ((is) this.wdg6QnbFHrFF).TSizfFm2Yiuu.rtx2ld2ELZv4();
                dm1Var.getClass();
                dm1.PxuCJdSBwIXG(dm1Var, em1Var);
                em1Var.hVNtCUZb4tYH(wq0.TSizfFm2Yiuu(0L, em1Var.x50lh2ztY7Y5), rtx2ld2ELZv4, null);
                return no2.PxuCJdSBwIXG;
            case 6:
                dm1.x50lh2ztY7Y5((dm1) obj, (em1) this.dgRBjINgWbAK, ((vd) this.wdg6QnbFHrFF).VhhvGxCb8gfr);
                return no2.PxuCJdSBwIXG;
            case 7:
                dm1.x50lh2ztY7Y5((dm1) obj, (em1) this.dgRBjINgWbAK, ((u52) this.wdg6QnbFHrFF).ozEBbv0hFTAB);
                return no2.PxuCJdSBwIXG;
            default:
                dp dpVar = (dp) obj;
                pe0 pe0Var = (pe0) this.wdg6QnbFHrFF;
                av2 av2Var = (av2) this.dgRBjINgWbAK;
                if (!av2Var.wdg6QnbFHrFF) {
                    o01 o01Var = dpVar.TSizfFm2Yiuu;
                    View view = dpVar.PxuCJdSBwIXG;
                    s01 rtx2ld2ELZv42 = o01Var.rtx2ld2ELZv4();
                    av2Var.x50lh2ztY7Y5 = pe0Var;
                    if (av2Var.dgRBjINgWbAK == null) {
                        if (cs0.wdg6QnbFHrFF(Looper.myLooper(), view.getHandler().getLooper())) {
                            av2Var.dgRBjINgWbAK = rtx2ld2ELZv42;
                            rtx2ld2ELZv42.PxuCJdSBwIXG(av2Var);
                        } else {
                            view.post(new l2(3, av2Var, rtx2ld2ELZv42));
                        }
                    } else if (rtx2ld2ELZv42.rtx2ld2ELZv4.compareTo(f01.wdg6QnbFHrFF) >= 0) {
                        av2Var.OPXfSBeufaJ8.e6tOsSdd2EFb(new on(-1723985096, true, new a3(av2Var, dpVar, pe0Var)));
                    }
                }
                return no2.PxuCJdSBwIXG;
        }
    }
}
