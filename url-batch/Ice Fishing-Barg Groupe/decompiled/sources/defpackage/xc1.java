package defpackage;

import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class xc1 extends b91 {
    public final b91 QrzZRwfaDlRX;
    public boolean gPXPFXrUH4XX;

    public xc1(long j, q72 q72Var, le0 le0Var, le0 le0Var2, b91 b91Var) {
        super(j, q72Var, le0Var, le0Var2);
        this.QrzZRwfaDlRX = b91Var;
        b91Var.dgRBjINgWbAK();
    }

    @Override // defpackage.b91
    public final xi0 S2OOm9zPNm0h() {
        xc1 xc1Var;
        b91 b91Var = this.QrzZRwfaDlRX;
        if (b91Var.cpQdD2nAriOS || b91Var.TSizfFm2Yiuu) {
            return new l72(this);
        }
        w81 w81Var = this.rtx2ld2ELZv4;
        long j = this.lS5Rgt96tfkO;
        HashMap PxuCJdSBwIXG = w81Var != null ? s72.PxuCJdSBwIXG(b91Var.RAsUl2FVSrh6(), this, this.QrzZRwfaDlRX.Y1f8riQaR6yg()) : null;
        Object obj = s72.TSizfFm2Yiuu;
        synchronized (obj) {
            try {
                s72.lS5Rgt96tfkO(this);
                if (w81Var == null || w81Var.Y1f8riQaR6yg == 0) {
                    xc1Var = this;
                    xc1Var.PxuCJdSBwIXG();
                } else {
                    xc1Var = this;
                    xi0 IAToe7bXGz4N = xc1Var.IAToe7bXGz4N(this.QrzZRwfaDlRX.RAsUl2FVSrh6(), w81Var, PxuCJdSBwIXG, this.QrzZRwfaDlRX.Y1f8riQaR6yg());
                    if (!IAToe7bXGz4N.equals(m72.PxuCJdSBwIXG)) {
                        return IAToe7bXGz4N;
                    }
                    w81 ZbWwgt3aGe7A = xc1Var.QrzZRwfaDlRX.ZbWwgt3aGe7A();
                    if (ZbWwgt3aGe7A != null) {
                        ZbWwgt3aGe7A.wdg6QnbFHrFF(w81Var);
                    } else {
                        xc1Var.QrzZRwfaDlRX.jyegZNwi31qc(w81Var);
                        xc1Var.rtx2ld2ELZv4 = null;
                    }
                }
                if (cs0.BRwzKIf41E4i(xc1Var.QrzZRwfaDlRX.RAsUl2FVSrh6(), j) < 0) {
                    xc1Var.QrzZRwfaDlRX.VhhvGxCb8gfr();
                }
                b91 b91Var2 = xc1Var.QrzZRwfaDlRX;
                b91Var2.XL4ISE6Oc65B(b91Var2.Y1f8riQaR6yg().lS5Rgt96tfkO(j).PxuCJdSBwIXG(xc1Var.wdg6QnbFHrFF));
                xc1Var.QrzZRwfaDlRX.e6tOsSdd2EFb(j);
                b91 b91Var3 = xc1Var.QrzZRwfaDlRX;
                int i = xc1Var.Y1f8riQaR6yg;
                xc1Var.Y1f8riQaR6yg = -1;
                if (i >= 0) {
                    int[] iArr = b91Var3.dgRBjINgWbAK;
                    iArr.getClass();
                    int length = iArr.length;
                    int[] copyOf = Arrays.copyOf(iArr, length + 1);
                    copyOf[length] = i;
                    b91Var3.dgRBjINgWbAK = copyOf;
                } else {
                    b91Var3.getClass();
                }
                b91 b91Var4 = xc1Var.QrzZRwfaDlRX;
                q72 q72Var = xc1Var.wdg6QnbFHrFF;
                b91Var4.getClass();
                synchronized (obj) {
                    b91Var4.wdg6QnbFHrFF = b91Var4.wdg6QnbFHrFF.Y1f8riQaR6yg(q72Var);
                    b91 b91Var5 = xc1Var.QrzZRwfaDlRX;
                    int[] iArr2 = xc1Var.dgRBjINgWbAK;
                    b91Var5.getClass();
                    if (iArr2.length != 0) {
                        int[] iArr3 = b91Var5.dgRBjINgWbAK;
                        if (iArr3.length != 0) {
                            int length2 = iArr3.length;
                            int length3 = iArr2.length;
                            int[] copyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                            System.arraycopy(iArr2, 0, copyOf2, length2, length3);
                            iArr2 = copyOf2;
                        }
                        b91Var5.dgRBjINgWbAK = iArr2;
                    }
                }
                xc1Var.cpQdD2nAriOS = true;
                if (!xc1Var.gPXPFXrUH4XX) {
                    xc1Var.gPXPFXrUH4XX = true;
                    xc1Var.QrzZRwfaDlRX.x50lh2ztY7Y5();
                }
                return m72.PxuCJdSBwIXG;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.b91, defpackage.j72
    public final void TSizfFm2Yiuu() {
        if (this.TSizfFm2Yiuu) {
            return;
        }
        super.TSizfFm2Yiuu();
        if (this.gPXPFXrUH4XX) {
            return;
        }
        this.gPXPFXrUH4XX = true;
        this.QrzZRwfaDlRX.x50lh2ztY7Y5();
    }
}
