package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public class ud1 {
    public final f91 PxuCJdSBwIXG = new f91(new hd1[16]);
    public final p81 lS5Rgt96tfkO = new p81(10);

    public boolean PxuCJdSBwIXG(p31 p31Var, bw0 bw0Var, op0 op0Var, boolean z) {
        f91 f91Var = this.PxuCJdSBwIXG;
        Object[] objArr = f91Var.rtx2ld2ELZv4;
        int i = f91Var.wdg6QnbFHrFF;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z2 = ((hd1) objArr[i2]).PxuCJdSBwIXG(p31Var, bw0Var, op0Var, z) || z2;
        }
        return z2;
    }

    public void lS5Rgt96tfkO(op0 op0Var) {
        f91 f91Var = this.PxuCJdSBwIXG;
        int i = f91Var.wdg6QnbFHrFF;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (((hd1) f91Var.rtx2ld2ELZv4[i]).Y1f8riQaR6yg.lS5Rgt96tfkO == 0) {
                f91Var.dgRBjINgWbAK(i);
            }
        }
    }
}
