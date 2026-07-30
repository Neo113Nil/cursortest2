package defpackage;

import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class zd1 {
    public final l12 PxuCJdSBwIXG;
    public hy TSizfFm2Yiuu;
    public boolean Y1f8riQaR6yg;
    public final op0 e9gEMXR7LXtO = new op0(13);
    public final pe0 lS5Rgt96tfkO;

    public zd1(l12 l12Var, pe0 pe0Var, hy hyVar) {
        this.PxuCJdSBwIXG = l12Var;
        this.lS5Rgt96tfkO = pe0Var;
        this.TSizfFm2Yiuu = hyVar;
    }

    public static void PxuCJdSBwIXG(qn1 qn1Var) {
        List list = qn1Var.PxuCJdSBwIXG;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((ao1) list.get(i)).PxuCJdSBwIXG();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object lS5Rgt96tfkO(pe0 pe0Var, ct ctVar) {
        yd1 yd1Var;
        int i;
        if (ctVar instanceof yd1) {
            yd1Var = (yd1) ctVar;
            int i2 = yd1Var.cpQdD2nAriOS;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yd1Var.cpQdD2nAriOS = i2 - Integer.MIN_VALUE;
                Object obj = yd1Var.dgRBjINgWbAK;
                i = yd1Var.cpQdD2nAriOS;
                bt btVar = null;
                if (i != 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    this.Y1f8riQaR6yg = true;
                    a92UlCVFR9N8 a92ulcvfr9n8 = new a92UlCVFR9N8(this, pe0Var, btVar, 21);
                    yd1Var.cpQdD2nAriOS = 1;
                    hu huVar = yd1Var.OPXfSBeufaJ8;
                    huVar.getClass();
                    lb2 lb2Var = new lb2(yd1Var, huVar);
                    Object i68hK7ahKtgp = sj0.i68hK7ahKtgp(lb2Var, lb2Var, a92ulcvfr9n8);
                    su suVar = su.rtx2ld2ELZv4;
                    if (i68hK7ahKtgp == suVar) {
                        return suVar;
                    }
                } else {
                    if (i != 1) {
                        u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ng0.tmVwIGCQF4zR(obj);
                }
                this.Y1f8riQaR6yg = false;
                return no2.PxuCJdSBwIXG;
            }
        }
        yd1Var = new yd1(this, ctVar);
        Object obj2 = yd1Var.dgRBjINgWbAK;
        i = yd1Var.cpQdD2nAriOS;
        bt btVar2 = null;
        if (i != 0) {
        }
        this.Y1f8riQaR6yg = false;
        return no2.PxuCJdSBwIXG;
    }
}
