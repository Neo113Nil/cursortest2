package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.util.Arrays;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class yk0 implements d70 {
    public static final vk0 Companion = new vk0();
    public static final hj0 a92UlCVFR9N8;
    public final if1 PxuCJdSBwIXG;
    public final m9 TSizfFm2Yiuu;
    public int Y1f8riQaR6yg;
    public final ij0 e9gEMXR7LXtO;
    public final b70 lS5Rgt96tfkO;

    static {
        hj0.Companion.getClass();
        String[] strArr = (String[]) Arrays.copyOf(new String[]{"OkHttp-Response-Body", "Truncated"}, 2);
        if (strArr.length % 2 != 0) {
            u9.XL4ISE6Oc65B("Expected alternating header names and values");
            return;
        }
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        int length = strArr2.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (strArr2[i2] == null) {
                u9.XL4ISE6Oc65B("Headers cannot be null");
                return;
            }
            strArr2[i2] = ia2.GlTbNTgfSMqy(strArr[i2]).toString();
        }
        int aF05bpZJlKEP = kj0.aF05bpZJlKEP(0, strArr2.length - 1, 2);
        if (aF05bpZJlKEP >= 0) {
            while (true) {
                String str = strArr2[i];
                String str2 = strArr2[i + 1];
                kj0.kpCQ9veP6n3I(str);
                kj0.rZjpSjn4zoMv(str2, str);
                if (i == aF05bpZJlKEP) {
                    break;
                } else {
                    i += 2;
                }
            }
        }
        a92UlCVFR9N8 = new hj0(strArr2);
    }

    public yk0(if1 if1Var, b70 b70Var, m9 m9Var) {
        m9Var.getClass();
        this.PxuCJdSBwIXG = if1Var;
        this.lS5Rgt96tfkO = b70Var;
        this.TSizfFm2Yiuu = m9Var;
        es1 es1Var = (es1) m9Var.wdg6QnbFHrFF;
        es1Var.getClass();
        ij0 ij0Var = new ij0();
        ij0Var.lS5Rgt96tfkO = es1Var;
        ij0Var.PxuCJdSBwIXG = 262144L;
        this.e9gEMXR7LXtO = ij0Var;
    }

    @Override // defpackage.d70
    public final mv1 OPXfSBeufaJ8(boolean z) {
        ij0 ij0Var = this.e9gEMXR7LXtO;
        int i = this.Y1f8riQaR6yg;
        if (i != 0 && i != 1 && i != 2 && i != 3) {
            rc1.rtx2ld2ELZv4("state: ", this.Y1f8riQaR6yg);
            return null;
        }
        try {
            v92 v92Var = w92.Companion;
            String e6tOsSdd2EFb = ((ig) ij0Var.lS5Rgt96tfkO).e6tOsSdd2EFb(ij0Var.PxuCJdSBwIXG);
            ij0Var.PxuCJdSBwIXG -= e6tOsSdd2EFb.length();
            v92Var.getClass();
            w92 PxuCJdSBwIXG = v92.PxuCJdSBwIXG(e6tOsSdd2EFb);
            int i2 = PxuCJdSBwIXG.lS5Rgt96tfkO;
            mv1 mv1Var = new mv1();
            mv1Var.lS5Rgt96tfkO = PxuCJdSBwIXG.PxuCJdSBwIXG;
            mv1Var.TSizfFm2Yiuu = i2;
            mv1Var.Y1f8riQaR6yg = PxuCJdSBwIXG.TSizfFm2Yiuu;
            mv1Var.a92UlCVFR9N8 = ij0Var.Y1f8riQaR6yg().TSizfFm2Yiuu();
            if (z && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.Y1f8riQaR6yg = 3;
                return mv1Var;
            }
            if (102 > i2 || i2 >= 200) {
                this.Y1f8riQaR6yg = 4;
                return mv1Var;
            }
            this.Y1f8riQaR6yg = 3;
            return mv1Var;
        } catch (EOFException e) {
            throw new IOException("unexpected end of stream on ".concat(this.lS5Rgt96tfkO.a92UlCVFR9N8().PxuCJdSBwIXG.rtx2ld2ELZv4.a92UlCVFR9N8()), e);
        }
    }

    @Override // defpackage.d70
    public final void PxuCJdSBwIXG(xb xbVar) {
        Proxy.Type type = this.lS5Rgt96tfkO.a92UlCVFR9N8().lS5Rgt96tfkO.type();
        type.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((String) xbVar.TSizfFm2Yiuu);
        sb.append(' ');
        gm0 gm0Var = (gm0) xbVar.lS5Rgt96tfkO;
        if (cs0.wdg6QnbFHrFF(gm0Var.PxuCJdSBwIXG, "https") || type != Proxy.Type.HTTP) {
            String lS5Rgt96tfkO = gm0Var.lS5Rgt96tfkO();
            String Y1f8riQaR6yg = gm0Var.Y1f8riQaR6yg();
            if (Y1f8riQaR6yg != null) {
                lS5Rgt96tfkO = lS5Rgt96tfkO + '?' + Y1f8riQaR6yg;
            }
            sb.append(lS5Rgt96tfkO);
        } else {
            sb.append(gm0Var);
        }
        sb.append(" HTTP/1.1");
        dgRBjINgWbAK((hj0) xbVar.Y1f8riQaR6yg, sb.toString());
    }

    @Override // defpackage.d70
    public final b70 RAsUl2FVSrh6() {
        return this.lS5Rgt96tfkO;
    }

    @Override // defpackage.d70
    public final void TSizfFm2Yiuu() {
        ((ds1) this.TSizfFm2Yiuu.dgRBjINgWbAK).flush();
    }

    @Override // defpackage.d70
    public final boolean Y1f8riQaR6yg() {
        return this.Y1f8riQaR6yg == 6;
    }

    @Override // defpackage.d70
    public final g82 a92UlCVFR9N8() {
        return this.TSizfFm2Yiuu;
    }

    @Override // defpackage.d70
    public final void cancel() {
        this.lS5Rgt96tfkO.cancel();
    }

    public final void dgRBjINgWbAK(hj0 hj0Var, String str) {
        hj0Var.getClass();
        if (this.Y1f8riQaR6yg != 0) {
            rc1.rtx2ld2ELZv4("state: ", this.Y1f8riQaR6yg);
            return;
        }
        m9 m9Var = this.TSizfFm2Yiuu;
        ds1 ds1Var = (ds1) m9Var.dgRBjINgWbAK;
        ds1Var.a92UlCVFR9N8(str);
        ds1Var.a92UlCVFR9N8("\r\n");
        int size = hj0Var.size();
        int i = 0;
        while (true) {
            ds1 ds1Var2 = (ds1) m9Var.dgRBjINgWbAK;
            if (i >= size) {
                ds1Var2.a92UlCVFR9N8("\r\n");
                this.Y1f8riQaR6yg = 1;
                return;
            } else {
                ds1Var2.a92UlCVFR9N8(hj0Var.lS5Rgt96tfkO(i));
                ds1Var2.a92UlCVFR9N8(": ");
                ds1Var2.a92UlCVFR9N8(hj0Var.Y1f8riQaR6yg(i));
                ds1Var2.a92UlCVFR9N8("\r\n");
                i++;
            }
        }
    }

    @Override // defpackage.d70
    public final void e9gEMXR7LXtO() {
        ((ds1) this.TSizfFm2Yiuu.dgRBjINgWbAK).flush();
    }

    @Override // defpackage.d70
    public final o82 lS5Rgt96tfkO(nv1 nv1Var) {
        xb xbVar = nv1Var.rtx2ld2ELZv4;
        if (!yl0.PxuCJdSBwIXG(nv1Var)) {
            return wdg6QnbFHrFF((gm0) xbVar.lS5Rgt96tfkO, 0L);
        }
        String PxuCJdSBwIXG = nv1Var.cpQdD2nAriOS.PxuCJdSBwIXG("Transfer-Encoding");
        if (PxuCJdSBwIXG == null) {
            PxuCJdSBwIXG = null;
        }
        if ("chunked".equalsIgnoreCase(PxuCJdSBwIXG)) {
            gm0 gm0Var = (gm0) xbVar.lS5Rgt96tfkO;
            if (this.Y1f8riQaR6yg == 4) {
                this.Y1f8riQaR6yg = 5;
                return new uk0(this, gm0Var);
            }
            rc1.rtx2ld2ELZv4("state: ", this.Y1f8riQaR6yg);
            return null;
        }
        long e9gEMXR7LXtO = mv2.e9gEMXR7LXtO(nv1Var);
        if (e9gEMXR7LXtO != -1) {
            return wdg6QnbFHrFF((gm0) xbVar.lS5Rgt96tfkO, e9gEMXR7LXtO);
        }
        gm0 gm0Var2 = (gm0) xbVar.lS5Rgt96tfkO;
        if (this.Y1f8riQaR6yg != 4) {
            rc1.rtx2ld2ELZv4("state: ", this.Y1f8riQaR6yg);
            return null;
        }
        this.Y1f8riQaR6yg = 5;
        this.lS5Rgt96tfkO.rtx2ld2ELZv4();
        gm0Var2.getClass();
        return new xk0(this, gm0Var2);
    }

    @Override // defpackage.d70
    public final long rtx2ld2ELZv4(nv1 nv1Var) {
        if (!yl0.PxuCJdSBwIXG(nv1Var)) {
            return 0L;
        }
        String PxuCJdSBwIXG = nv1Var.cpQdD2nAriOS.PxuCJdSBwIXG("Transfer-Encoding");
        if (PxuCJdSBwIXG == null) {
            PxuCJdSBwIXG = null;
        }
        if ("chunked".equalsIgnoreCase(PxuCJdSBwIXG)) {
            return -1L;
        }
        return mv2.e9gEMXR7LXtO(nv1Var);
    }

    public final wk0 wdg6QnbFHrFF(gm0 gm0Var, long j) {
        if (this.Y1f8riQaR6yg == 4) {
            this.Y1f8riQaR6yg = 5;
            return new wk0(this, gm0Var, j);
        }
        rc1.rtx2ld2ELZv4("state: ", this.Y1f8riQaR6yg);
        return null;
    }
}
