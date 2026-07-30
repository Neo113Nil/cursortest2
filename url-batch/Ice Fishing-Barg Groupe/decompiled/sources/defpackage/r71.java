package defpackage;

import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class r71 {
    public final xb PxuCJdSBwIXG;
    public final ArrayList RAsUl2FVSrh6;
    public final boolean TSizfFm2Yiuu;
    public final float Y1f8riQaR6yg;
    public final int a92UlCVFR9N8;
    public final float e9gEMXR7LXtO;
    public final int lS5Rgt96tfkO;
    public final ArrayList rtx2ld2ELZv4;

    public r71(xb xbVar, long j, int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int RAsUl2FVSrh6;
        int i5;
        this.PxuCJdSBwIXG = xbVar;
        this.lS5Rgt96tfkO = i;
        if (rr.wdg6QnbFHrFF(j) != 0 || rr.OPXfSBeufaJ8(j) != 0) {
            fp0.PxuCJdSBwIXG("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) xbVar.a92UlCVFR9N8;
        int size = arrayList2.size();
        float f = 0.0f;
        int i6 = 0;
        int i7 = 0;
        while (i6 < size) {
            yi1 yi1Var = (yi1) arrayList2.get(i6);
            q4 q4Var = yi1Var.PxuCJdSBwIXG;
            int rtx2ld2ELZv4 = rr.rtx2ld2ELZv4(j);
            if (rr.TSizfFm2Yiuu(j)) {
                i4 = i6;
                RAsUl2FVSrh6 = rr.RAsUl2FVSrh6(j) - ((int) Math.ceil(f));
                if (RAsUl2FVSrh6 < 0) {
                    RAsUl2FVSrh6 = 0;
                }
            } else {
                i4 = i6;
                RAsUl2FVSrh6 = rr.RAsUl2FVSrh6(j);
            }
            i3 = 0;
            m4 m4Var = new m4(q4Var, this.lS5Rgt96tfkO - i7, i2, sr.lS5Rgt96tfkO(0, rtx2ld2ELZv4, 0, RAsUl2FVSrh6, 5));
            float lS5Rgt96tfkO = m4Var.lS5Rgt96tfkO() + f;
            hi2 hi2Var = m4Var.Y1f8riQaR6yg;
            int i8 = i7 + hi2Var.RAsUl2FVSrh6;
            arrayList.add(new xi1(m4Var, yi1Var.lS5Rgt96tfkO, yi1Var.TSizfFm2Yiuu, i7, i8, f, lS5Rgt96tfkO));
            if (!hi2Var.Y1f8riQaR6yg) {
                if (i8 == this.lS5Rgt96tfkO) {
                    i5 = i4;
                    if (i5 != fx1.xbgXKYA2cIfu((ArrayList) this.PxuCJdSBwIXG.a92UlCVFR9N8)) {
                    }
                } else {
                    i5 = i4;
                }
                i6 = i5 + 1;
                i7 = i8;
                f = lS5Rgt96tfkO;
            }
            z = true;
            i7 = i8;
            f = lS5Rgt96tfkO;
            break;
        }
        i3 = 0;
        z = false;
        this.e9gEMXR7LXtO = f;
        this.a92UlCVFR9N8 = i7;
        this.TSizfFm2Yiuu = z;
        this.rtx2ld2ELZv4 = arrayList;
        this.Y1f8riQaR6yg = rr.rtx2ld2ELZv4(j);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i9 = i3; i9 < size2; i9++) {
            xi1 xi1Var = (xi1) arrayList.get(i9);
            List list = xi1Var.PxuCJdSBwIXG.a92UlCVFR9N8;
            ArrayList arrayList4 = new ArrayList(list.size());
            int size3 = list.size();
            for (int i10 = i3; i10 < size3; i10++) {
                qt1 qt1Var = (qt1) list.get(i10);
                arrayList4.add(qt1Var != null ? xi1Var.PxuCJdSBwIXG(qt1Var) : null);
            }
            el.MBpAROcyNHKN(arrayList4, arrayList3);
        }
        if (arrayList3.size() < ((List) this.PxuCJdSBwIXG.TSizfFm2Yiuu).size()) {
            int size4 = ((List) this.PxuCJdSBwIXG.TSizfFm2Yiuu).size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i11 = i3; i11 < size4; i11++) {
                arrayList5.add(null);
            }
            arrayList3 = zk.wcHq2YQJmeHg(arrayList3, arrayList5);
        }
        this.RAsUl2FVSrh6 = arrayList3;
    }

    public static void OPXfSBeufaJ8(r71 r71Var, gi giVar, uf ufVar, float f, w42 w42Var, if2 if2Var, l30 l30Var) {
        k30.Companion.getClass();
        giVar.wdg6QnbFHrFF();
        ArrayList arrayList = r71Var.rtx2ld2ELZv4;
        if (arrayList.size() <= 1) {
            mm2.BjEWd04qc7Mw(r71Var, giVar, ufVar, f, w42Var, if2Var, l30Var);
        } else if (ufVar instanceof m82) {
            mm2.BjEWd04qc7Mw(r71Var, giVar, ufVar, f, w42Var, if2Var, l30Var);
        } else {
            if (!(ufVar instanceof vf)) {
                u9.gPXPFXrUH4XX();
                return;
            }
            int size = arrayList.size();
            float f2 = 0.0f;
            float f3 = 0.0f;
            for (int i = 0; i < size; i++) {
                xi1 xi1Var = (xi1) arrayList.get(i);
                f3 += xi1Var.PxuCJdSBwIXG.lS5Rgt96tfkO();
                f2 = Math.max(f2, xi1Var.PxuCJdSBwIXG.Y1f8riQaR6yg());
            }
            Float.floatToRawIntBits(f2);
            Float.floatToRawIntBits(f3);
            Shader shader = ((vf) ufVar).TSizfFm2Yiuu;
            Matrix matrix = new Matrix();
            shader.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                m4 m4Var = ((xi1) arrayList.get(i2)).PxuCJdSBwIXG;
                m4Var.RAsUl2FVSrh6(giVar, new vf(shader), f, w42Var, if2Var, l30Var);
                giVar.Y1f8riQaR6yg(0.0f, m4Var.lS5Rgt96tfkO());
                matrix.setTranslate(0.0f, -m4Var.lS5Rgt96tfkO());
                shader.setLocalMatrix(matrix);
            }
        }
        giVar.RAsUl2FVSrh6();
    }

    public final void PxuCJdSBwIXG(long j, float[] fArr) {
        wdg6QnbFHrFF(vi2.a92UlCVFR9N8(j));
        dgRBjINgWbAK(vi2.e9gEMXR7LXtO(j));
        xt1 xt1Var = new xt1();
        xt1Var.rtx2ld2ELZv4 = 0;
        kj0.S9EYkSpbGuxq(this.rtx2ld2ELZv4, j, new ie(j, fArr, xt1Var, new wt1()));
    }

    public final int RAsUl2FVSrh6(long j) {
        int offsetForHorizontal;
        int i = (int) (j & 4294967295L);
        float intBitsToFloat = Float.intBitsToFloat(i);
        ArrayList arrayList = this.rtx2ld2ELZv4;
        xi1 xi1Var = (xi1) arrayList.get(kj0.XL4ISE6Oc65B(arrayList, intBitsToFloat));
        int i2 = xi1Var.TSizfFm2Yiuu;
        int i3 = xi1Var.lS5Rgt96tfkO;
        if (i2 - i3 == 0) {
            return i3;
        }
        m4 m4Var = xi1Var.PxuCJdSBwIXG;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat(i) - xi1Var.a92UlCVFR9N8;
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L);
        hi2 hi2Var = m4Var.Y1f8riQaR6yg;
        int intBitsToFloat4 = (int) Float.intBitsToFloat((int) (4294967295L & floatToRawIntBits));
        Layout layout = hi2Var.a92UlCVFR9N8;
        int lineForVertical = layout.getLineForVertical(intBitsToFloat4 - hi2Var.rtx2ld2ELZv4);
        if (lineForVertical >= hi2Var.RAsUl2FVSrh6) {
            offsetForHorizontal = layout.getText().length();
        } else {
            offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, (hi2Var.lS5Rgt96tfkO(lineForVertical) * (-1.0f)) + Float.intBitsToFloat((int) (floatToRawIntBits >> 32)));
        }
        return offsetForHorizontal + i3;
    }

    public final int TSizfFm2Yiuu(int i, boolean z) {
        int a92UlCVFR9N8;
        x50lh2ztY7Y5(i);
        ArrayList arrayList = this.rtx2ld2ELZv4;
        xi1 xi1Var = (xi1) arrayList.get(kj0.BRwzKIf41E4i(i, arrayList));
        m4 m4Var = xi1Var.PxuCJdSBwIXG;
        int i2 = i - xi1Var.Y1f8riQaR6yg;
        hi2 hi2Var = m4Var.Y1f8riQaR6yg;
        if (z) {
            Layout layout = hi2Var.a92UlCVFR9N8;
            ThreadLocal threadLocal = li2.PxuCJdSBwIXG;
            if (layout.getEllipsisCount(i2) <= 0 || hi2Var.lS5Rgt96tfkO != TextUtils.TruncateAt.END) {
                xb TSizfFm2Yiuu = hi2Var.TSizfFm2Yiuu();
                Layout layout2 = (Layout) TSizfFm2Yiuu.lS5Rgt96tfkO;
                a92UlCVFR9N8 = TSizfFm2Yiuu.cpQdD2nAriOS(layout2.getLineEnd(i2), layout2.getLineStart(i2));
            } else {
                a92UlCVFR9N8 = layout.getEllipsisStart(i2) + layout.getLineStart(i2);
            }
        } else {
            a92UlCVFR9N8 = hi2Var.a92UlCVFR9N8(i2);
        }
        return a92UlCVFR9N8 + xi1Var.lS5Rgt96tfkO;
    }

    public final int Y1f8riQaR6yg(int i) {
        int length = ((v8) this.PxuCJdSBwIXG.lS5Rgt96tfkO).OPXfSBeufaJ8.length();
        ArrayList arrayList = this.rtx2ld2ELZv4;
        xi1 xi1Var = (xi1) arrayList.get(i >= length ? fx1.xbgXKYA2cIfu(arrayList) : i < 0 ? 0 : kj0.gPXPFXrUH4XX(i, arrayList));
        return xi1Var.PxuCJdSBwIXG.Y1f8riQaR6yg.RAsUl2FVSrh6(xi1Var.Y1f8riQaR6yg(i)) + xi1Var.Y1f8riQaR6yg;
    }

    public final float a92UlCVFR9N8(int i) {
        x50lh2ztY7Y5(i);
        ArrayList arrayList = this.rtx2ld2ELZv4;
        xi1 xi1Var = (xi1) arrayList.get(kj0.BRwzKIf41E4i(i, arrayList));
        m4 m4Var = xi1Var.PxuCJdSBwIXG;
        return m4Var.Y1f8riQaR6yg.rtx2ld2ELZv4(i - xi1Var.Y1f8riQaR6yg) + xi1Var.a92UlCVFR9N8;
    }

    public final void dgRBjINgWbAK(int i) {
        v8 v8Var = (v8) this.PxuCJdSBwIXG.lS5Rgt96tfkO;
        if (i < 0 || i > v8Var.OPXfSBeufaJ8.length()) {
            StringBuilder BRwzKIf41E4i = o0.BRwzKIf41E4i(i, "offset(", ") is out of bounds [0, ");
            BRwzKIf41E4i.append(v8Var.OPXfSBeufaJ8.length());
            BRwzKIf41E4i.append(']');
            fp0.PxuCJdSBwIXG(BRwzKIf41E4i.toString());
        }
    }

    public final int e9gEMXR7LXtO(float f) {
        int lineForVertical;
        ArrayList arrayList = this.rtx2ld2ELZv4;
        xi1 xi1Var = (xi1) arrayList.get(kj0.XL4ISE6Oc65B(arrayList, f));
        int i = xi1Var.TSizfFm2Yiuu - xi1Var.lS5Rgt96tfkO;
        int i2 = xi1Var.Y1f8riQaR6yg;
        if (i == 0) {
            return i2;
        }
        m4 m4Var = xi1Var.PxuCJdSBwIXG;
        float f2 = f - xi1Var.a92UlCVFR9N8;
        hi2 hi2Var = m4Var.Y1f8riQaR6yg;
        int i3 = (int) f2;
        int i4 = hi2Var.RAsUl2FVSrh6;
        if (i4 <= 0) {
            lineForVertical = 0;
        } else {
            lineForVertical = hi2Var.a92UlCVFR9N8.getLineForVertical(i3 - hi2Var.rtx2ld2ELZv4);
            int i5 = i4 - 1;
            if (lineForVertical > i5) {
                lineForVertical = i5;
            }
        }
        return lineForVertical + i2;
    }

    public final float lS5Rgt96tfkO(int i) {
        x50lh2ztY7Y5(i);
        ArrayList arrayList = this.rtx2ld2ELZv4;
        xi1 xi1Var = (xi1) arrayList.get(kj0.BRwzKIf41E4i(i, arrayList));
        m4 m4Var = xi1Var.PxuCJdSBwIXG;
        return m4Var.Y1f8riQaR6yg.e9gEMXR7LXtO(i - xi1Var.Y1f8riQaR6yg) + xi1Var.a92UlCVFR9N8;
    }

    public final long rtx2ld2ELZv4(qt1 qt1Var, int i, xh2 xh2Var) {
        long j;
        long j2;
        float f = qt1Var.lS5Rgt96tfkO;
        ArrayList arrayList = this.rtx2ld2ELZv4;
        int XL4ISE6Oc65B = kj0.XL4ISE6Oc65B(arrayList, f);
        float f2 = ((xi1) arrayList.get(XL4ISE6Oc65B)).RAsUl2FVSrh6;
        float f3 = qt1Var.Y1f8riQaR6yg;
        if (f2 >= f3 || XL4ISE6Oc65B == fx1.xbgXKYA2cIfu(arrayList)) {
            xi1 xi1Var = (xi1) arrayList.get(XL4ISE6Oc65B);
            return xi1Var.lS5Rgt96tfkO(xi1Var.PxuCJdSBwIXG.TSizfFm2Yiuu(xi1Var.TSizfFm2Yiuu(qt1Var), i, xh2Var), true);
        }
        int XL4ISE6Oc65B2 = kj0.XL4ISE6Oc65B(arrayList, f3);
        vi2.Companion.getClass();
        long j3 = vi2.lS5Rgt96tfkO;
        while (true) {
            vi2.Companion.getClass();
            j = vi2.lS5Rgt96tfkO;
            if (!vi2.lS5Rgt96tfkO(j3, j) || XL4ISE6Oc65B > XL4ISE6Oc65B2) {
                break;
            }
            xi1 xi1Var2 = (xi1) arrayList.get(XL4ISE6Oc65B);
            j3 = xi1Var2.lS5Rgt96tfkO(xi1Var2.PxuCJdSBwIXG.TSizfFm2Yiuu(xi1Var2.TSizfFm2Yiuu(qt1Var), i, xh2Var), true);
            XL4ISE6Oc65B++;
        }
        if (vi2.lS5Rgt96tfkO(j3, j)) {
            return j;
        }
        while (true) {
            vi2.Companion.getClass();
            j2 = vi2.lS5Rgt96tfkO;
            if (!vi2.lS5Rgt96tfkO(j, j2) || XL4ISE6Oc65B > XL4ISE6Oc65B2) {
                break;
            }
            xi1 xi1Var3 = (xi1) arrayList.get(XL4ISE6Oc65B2);
            j = xi1Var3.lS5Rgt96tfkO(xi1Var3.PxuCJdSBwIXG.TSizfFm2Yiuu(xi1Var3.TSizfFm2Yiuu(qt1Var), i, xh2Var), true);
            XL4ISE6Oc65B2--;
        }
        return vi2.lS5Rgt96tfkO(j, j2) ? j3 : jh0.rtx2ld2ELZv4((int) (j3 >> 32), (int) (4294967295L & j));
    }

    public final void wdg6QnbFHrFF(int i) {
        v8 v8Var = (v8) this.PxuCJdSBwIXG.lS5Rgt96tfkO;
        if (i < 0 || i >= v8Var.OPXfSBeufaJ8.length()) {
            StringBuilder BRwzKIf41E4i = o0.BRwzKIf41E4i(i, "offset(", ") is out of bounds [0, ");
            BRwzKIf41E4i.append(v8Var.OPXfSBeufaJ8.length());
            BRwzKIf41E4i.append(')');
            fp0.PxuCJdSBwIXG(BRwzKIf41E4i.toString());
        }
    }

    public final void x50lh2ztY7Y5(int i) {
        boolean z = false;
        int i2 = this.a92UlCVFR9N8;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (z) {
            return;
        }
        fp0.PxuCJdSBwIXG("lineIndex(" + i + ") is out of bounds [0, " + i2 + ')');
    }
}
