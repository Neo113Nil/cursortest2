package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class np0 implements ut1 {
    public final /* synthetic */ int PxuCJdSBwIXG;
    public final ek0 TSizfFm2Yiuu;
    public final iq2 Y1f8riQaR6yg;
    public final Serializable a92UlCVFR9N8;
    public final ek0 e9gEMXR7LXtO;
    public final iq2 lS5Rgt96tfkO;

    /* JADX WARN: Multi-variable type inference failed */
    public np0(ut1[] ut1VarArr) {
        int i = 0;
        this.PxuCJdSBwIXG = 0;
        this.a92UlCVFR9N8 = ut1VarArr;
        hq2 hq2Var = iq2.Companion;
        int length = ut1VarArr.length;
        iq2[] iq2VarArr = new iq2[length];
        for (int i2 = 0; i2 < length; i2++) {
            iq2VarArr[i2] = ((ut1[]) this.a92UlCVFR9N8)[i2].TSizfFm2Yiuu();
        }
        hq2Var.getClass();
        this.lS5Rgt96tfkO = new iq2(new gq2(iq2VarArr, i));
        dk0 dk0Var = ek0.Companion;
        int length2 = ((ut1[]) this.a92UlCVFR9N8).length;
        ek0[] ek0VarArr = new ek0[length2];
        for (int i3 = 0; i3 < length2; i3++) {
            ek0VarArr[i3] = ((ut1[]) this.a92UlCVFR9N8)[i3].lS5Rgt96tfkO();
        }
        dk0Var.getClass();
        this.TSizfFm2Yiuu = new ek0(new ck0(ek0VarArr, i));
        hq2 hq2Var2 = iq2.Companion;
        int length3 = ((ut1[]) this.a92UlCVFR9N8).length;
        iq2[] iq2VarArr2 = new iq2[length3];
        for (int i4 = 0; i4 < length3; i4++) {
            iq2VarArr2[i4] = ((ut1[]) this.a92UlCVFR9N8)[i4].Y1f8riQaR6yg();
        }
        hq2Var2.getClass();
        int i5 = 1;
        this.Y1f8riQaR6yg = new iq2(new gq2(iq2VarArr2, i5));
        dk0 dk0Var2 = ek0.Companion;
        int length4 = ((ut1[]) this.a92UlCVFR9N8).length;
        ek0[] ek0VarArr2 = new ek0[length4];
        while (i < length4) {
            ek0VarArr2[i] = ((ut1[]) this.a92UlCVFR9N8)[i].PxuCJdSBwIXG();
            i++;
        }
        dk0Var2.getClass();
        this.e9gEMXR7LXtO = new ek0(new ck0(ek0VarArr2, i5));
    }

    @Override // defpackage.ut1
    public final ek0 PxuCJdSBwIXG() {
        int i = this.PxuCJdSBwIXG;
        return this.e9gEMXR7LXtO;
    }

    @Override // defpackage.ut1
    public final iq2 TSizfFm2Yiuu() {
        int i = this.PxuCJdSBwIXG;
        return this.lS5Rgt96tfkO;
    }

    @Override // defpackage.ut1
    public final iq2 Y1f8riQaR6yg() {
        int i = this.PxuCJdSBwIXG;
        return this.Y1f8riQaR6yg;
    }

    @Override // defpackage.ut1
    public final ek0 lS5Rgt96tfkO() {
        int i = this.PxuCJdSBwIXG;
        return this.TSizfFm2Yiuu;
    }

    public final String toString() {
        int i = this.PxuCJdSBwIXG;
        Object obj = this.a92UlCVFR9N8;
        switch (i) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) "innermostOf(");
                int i2 = 0;
                for (ut1 ut1Var : (ut1[]) obj) {
                    i2++;
                    if (i2 > 1) {
                        sb.append((CharSequence) ", ");
                    }
                    th0.OPXfSBeufaJ8(sb, ut1Var, null);
                }
                sb.append((CharSequence) ")");
                return sb.toString();
            default:
                return o0.dgRBjINgWbAK("RectRulers(", (String) obj, ')');
        }
    }

    public np0(String str) {
        this.PxuCJdSBwIXG = 1;
        this.a92UlCVFR9N8 = str;
        this.lS5Rgt96tfkO = new iq2(null);
        this.TSizfFm2Yiuu = new ek0(null);
        this.Y1f8riQaR6yg = new iq2(null);
        this.e9gEMXR7LXtO = new ek0(null);
    }
}
