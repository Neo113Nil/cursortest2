package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class wLFCmsViZrNT {
    public int OPXfSBeufaJ8;
    public kb2 dgRBjINgWbAK;
    public xbgXKYA2cIfu[] rtx2ld2ELZv4;
    public int wdg6QnbFHrFF;

    public final kb2 RAsUl2FVSrh6() {
        kb2 kb2Var;
        synchronized (this) {
            kb2Var = this.dgRBjINgWbAK;
            if (kb2Var == null) {
                int i = this.OPXfSBeufaJ8;
                kb2Var = new kb2(1, Integer.MAX_VALUE, ag.OPXfSBeufaJ8);
                kb2Var.BRwzKIf41E4i(Integer.valueOf(i));
                this.dgRBjINgWbAK = kb2Var;
            }
        }
        return kb2Var;
    }

    public final xbgXKYA2cIfu TSizfFm2Yiuu() {
        xbgXKYA2cIfu xbgxkya2cifu;
        kb2 kb2Var;
        synchronized (this) {
            try {
                xbgXKYA2cIfu[] xbgxkya2cifuArr = this.rtx2ld2ELZv4;
                if (xbgxkya2cifuArr == null) {
                    xbgxkya2cifuArr = e9gEMXR7LXtO();
                    this.rtx2ld2ELZv4 = xbgxkya2cifuArr;
                } else if (this.OPXfSBeufaJ8 >= xbgxkya2cifuArr.length) {
                    Object[] copyOf = Arrays.copyOf(xbgxkya2cifuArr, xbgxkya2cifuArr.length * 2);
                    this.rtx2ld2ELZv4 = (xbgXKYA2cIfu[]) copyOf;
                    xbgxkya2cifuArr = (xbgXKYA2cIfu[]) copyOf;
                }
                int i = this.wdg6QnbFHrFF;
                do {
                    xbgxkya2cifu = xbgxkya2cifuArr[i];
                    if (xbgxkya2cifu == null) {
                        xbgxkya2cifu = Y1f8riQaR6yg();
                        xbgxkya2cifuArr[i] = xbgxkya2cifu;
                    }
                    i++;
                    if (i >= xbgxkya2cifuArr.length) {
                        i = 0;
                    }
                } while (!xbgxkya2cifu.PxuCJdSBwIXG(this));
                this.wdg6QnbFHrFF = i;
                this.OPXfSBeufaJ8++;
                kb2Var = this.dgRBjINgWbAK;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (kb2Var != null) {
            kb2Var.S2OOm9zPNm0h(1);
        }
        return xbgxkya2cifu;
    }

    public abstract xbgXKYA2cIfu Y1f8riQaR6yg();

    public final void a92UlCVFR9N8(xbgXKYA2cIfu xbgxkya2cifu) {
        kb2 kb2Var;
        int i;
        bt[] lS5Rgt96tfkO;
        synchronized (this) {
            try {
                int i2 = this.OPXfSBeufaJ8 - 1;
                this.OPXfSBeufaJ8 = i2;
                kb2Var = this.dgRBjINgWbAK;
                if (i2 == 0) {
                    this.wdg6QnbFHrFF = 0;
                }
                xbgxkya2cifu.getClass();
                lS5Rgt96tfkO = xbgxkya2cifu.lS5Rgt96tfkO(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (bt btVar : lS5Rgt96tfkO) {
            if (btVar != null) {
                btVar.RAsUl2FVSrh6(no2.PxuCJdSBwIXG);
            }
        }
        if (kb2Var != null) {
            kb2Var.S2OOm9zPNm0h(-1);
        }
    }

    public abstract xbgXKYA2cIfu[] e9gEMXR7LXtO();
}
