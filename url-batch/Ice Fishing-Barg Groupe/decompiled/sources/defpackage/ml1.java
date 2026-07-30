package defpackage;

import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public class ml1 extends ll1 {
    public boolean cpQdD2nAriOS;
    public final gl1 dgRBjINgWbAK;
    public int r3s1LDPKFs1S;
    public Object x50lh2ztY7Y5;

    public ml1(gl1 gl1Var, ul2[] ul2VarArr) {
        super(gl1Var.OPXfSBeufaJ8, ul2VarArr);
        this.dgRBjINgWbAK = gl1Var;
        this.r3s1LDPKFs1S = gl1Var.dgRBjINgWbAK;
    }

    public final void TSizfFm2Yiuu(int i, tl2 tl2Var, Object obj, int i2) {
        int i3 = i2 * 5;
        ul2[] ul2VarArr = this.rtx2ld2ELZv4;
        if (i3 <= 30) {
            int VhhvGxCb8gfr = 1 << th0.VhhvGxCb8gfr(i, i3);
            if (tl2Var.rtx2ld2ELZv4(VhhvGxCb8gfr)) {
                ul2VarArr[i2].PxuCJdSBwIXG(tl2Var.Y1f8riQaR6yg, Integer.bitCount(tl2Var.PxuCJdSBwIXG) * 2, tl2Var.a92UlCVFR9N8(VhhvGxCb8gfr));
                this.OPXfSBeufaJ8 = i2;
                return;
            } else {
                int EcgxDIVH5in8 = tl2Var.EcgxDIVH5in8(VhhvGxCb8gfr);
                tl2 RfyTYNmI9Srp = tl2Var.RfyTYNmI9Srp(EcgxDIVH5in8);
                ul2VarArr[i2].PxuCJdSBwIXG(tl2Var.Y1f8riQaR6yg, Integer.bitCount(tl2Var.PxuCJdSBwIXG) * 2, EcgxDIVH5in8);
                TSizfFm2Yiuu(i, RfyTYNmI9Srp, obj, i2 + 1);
                return;
            }
        }
        ul2 ul2Var = ul2VarArr[i2];
        Object[] objArr = tl2Var.Y1f8riQaR6yg;
        ul2Var.PxuCJdSBwIXG(objArr, objArr.length, 0);
        while (true) {
            ul2 ul2Var2 = ul2VarArr[i2];
            if (cs0.wdg6QnbFHrFF(ul2Var2.rtx2ld2ELZv4[ul2Var2.wdg6QnbFHrFF], obj)) {
                this.OPXfSBeufaJ8 = i2;
                return;
            } else {
                ul2VarArr[i2].wdg6QnbFHrFF += 2;
            }
        }
    }

    @Override // defpackage.ll1, java.util.Iterator
    public final Object next() {
        if (this.dgRBjINgWbAK.dgRBjINgWbAK != this.r3s1LDPKFs1S) {
            throw new ConcurrentModificationException();
        }
        if (!this.wdg6QnbFHrFF) {
            u9.RfyTYNmI9Srp();
            return null;
        }
        ul2 ul2Var = this.rtx2ld2ELZv4[this.OPXfSBeufaJ8];
        this.x50lh2ztY7Y5 = ul2Var.rtx2ld2ELZv4[ul2Var.wdg6QnbFHrFF];
        this.cpQdD2nAriOS = true;
        return super.next();
    }

    @Override // defpackage.ll1, java.util.Iterator
    public final void remove() {
        if (!this.cpQdD2nAriOS) {
            throw new IllegalStateException();
        }
        boolean z = this.wdg6QnbFHrFF;
        gl1 gl1Var = this.dgRBjINgWbAK;
        if (!z) {
            mm2.RfyTYNmI9Srp(gl1Var).remove(this.x50lh2ztY7Y5);
        } else {
            if (!z) {
                u9.RfyTYNmI9Srp();
                return;
            }
            ul2 ul2Var = this.rtx2ld2ELZv4[this.OPXfSBeufaJ8];
            Object obj = ul2Var.rtx2ld2ELZv4[ul2Var.wdg6QnbFHrFF];
            mm2.RfyTYNmI9Srp(gl1Var).remove(this.x50lh2ztY7Y5);
            TSizfFm2Yiuu(obj != null ? obj.hashCode() : 0, gl1Var.OPXfSBeufaJ8, obj, 0);
        }
        this.x50lh2ztY7Y5 = null;
        this.cpQdD2nAriOS = false;
        this.r3s1LDPKFs1S = gl1Var.dgRBjINgWbAK;
    }
}
