package defpackage;

import java.util.Set;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class cl1 implements ku1 {
    public final f91 OPXfSBeufaJ8 = new f91(new yf0[16]);
    public final Set rtx2ld2ELZv4;

    public cl1(Set set) {
        this.rtx2ld2ELZv4 = set;
    }

    @Override // defpackage.ku1
    public final void PxuCJdSBwIXG() {
        f91 f91Var = this.OPXfSBeufaJ8;
        Object[] objArr = f91Var.rtx2ld2ELZv4;
        int i = f91Var.wdg6QnbFHrFF;
        for (int i2 = 0; i2 < i; i2++) {
            ku1 ku1Var = ((yf0) objArr[i2]).PxuCJdSBwIXG;
            this.rtx2ld2ELZv4.remove(ku1Var);
            ku1Var.PxuCJdSBwIXG();
        }
    }

    @Override // defpackage.ku1
    public final void TSizfFm2Yiuu() {
    }

    @Override // defpackage.ku1
    public final void Y1f8riQaR6yg() {
    }
}
