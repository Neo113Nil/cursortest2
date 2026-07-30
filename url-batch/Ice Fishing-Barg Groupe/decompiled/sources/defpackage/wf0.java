package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class wf0 implements ae0 {
    public final /* synthetic */ xf0 rtx2ld2ELZv4;

    public wf0(xf0 xf0Var) {
        this.rtx2ld2ELZv4 = xf0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ae0
    public final Object PxuCJdSBwIXG() {
        ArrayList arrayList = this.rtx2ld2ELZv4.PxuCJdSBwIXG;
        v81 v81Var = new v81(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            tu0 tu0Var = (tu0) arrayList.get(i);
            Object obj = tu0Var.lS5Rgt96tfkO;
            int i2 = tu0Var.PxuCJdSBwIXG;
            Object ft0Var = obj != null ? new ft0(Integer.valueOf(i2), tu0Var.lS5Rgt96tfkO) : Integer.valueOf(i2);
            int a92UlCVFR9N8 = v81Var.a92UlCVFR9N8(ft0Var);
            boolean z = a92UlCVFR9N8 < 0;
            Object obj2 = z ? null : v81Var.TSizfFm2Yiuu[a92UlCVFR9N8];
            if (obj2 != null) {
                if (obj2 instanceof p81) {
                    p81 p81Var = (p81) obj2;
                    p81Var.PxuCJdSBwIXG(tu0Var);
                    tu0Var = p81Var;
                } else {
                    Object[] objArr = pe1.PxuCJdSBwIXG;
                    p81 p81Var2 = new p81(2);
                    p81Var2.PxuCJdSBwIXG(obj2);
                    p81Var2.PxuCJdSBwIXG(tu0Var);
                    tu0Var = p81Var2;
                }
            }
            if (z) {
                int i3 = ~a92UlCVFR9N8;
                v81Var.lS5Rgt96tfkO[i3] = ft0Var;
                v81Var.TSizfFm2Yiuu[i3] = tu0Var;
            } else {
                v81Var.TSizfFm2Yiuu[a92UlCVFR9N8] = tu0Var;
            }
        }
        return new x71(v81Var);
    }
}
