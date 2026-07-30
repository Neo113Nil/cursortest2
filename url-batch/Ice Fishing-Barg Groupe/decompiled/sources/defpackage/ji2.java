package defpackage;

import android.graphics.RectF;
import android.text.Layout;
import java.util.ArrayList;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ji2 {
    public final ii2 PxuCJdSBwIXG;
    public final long TSizfFm2Yiuu;
    public final float Y1f8riQaR6yg;
    public final ArrayList a92UlCVFR9N8;
    public final float e9gEMXR7LXtO;
    public final r71 lS5Rgt96tfkO;

    public ji2(ii2 ii2Var, r71 r71Var, long j) {
        this.PxuCJdSBwIXG = ii2Var;
        this.lS5Rgt96tfkO = r71Var;
        this.TSizfFm2Yiuu = j;
        ArrayList arrayList = r71Var.rtx2ld2ELZv4;
        float f = 0.0f;
        this.Y1f8riQaR6yg = arrayList.isEmpty() ? 0.0f : ((xi1) arrayList.get(0)).PxuCJdSBwIXG.Y1f8riQaR6yg.Y1f8riQaR6yg(0);
        if (!arrayList.isEmpty()) {
            xi1 xi1Var = (xi1) zk.kRWHK87H9qm4(arrayList);
            f = xi1Var.PxuCJdSBwIXG.Y1f8riQaR6yg.Y1f8riQaR6yg(r4.RAsUl2FVSrh6 - 1) + xi1Var.a92UlCVFR9N8;
        }
        this.e9gEMXR7LXtO = f;
        this.a92UlCVFR9N8 = r71Var.RAsUl2FVSrh6;
    }

    public final iv1 PxuCJdSBwIXG(int i) {
        r71 r71Var = this.lS5Rgt96tfkO;
        r71Var.dgRBjINgWbAK(i);
        int length = ((v8) r71Var.PxuCJdSBwIXG.lS5Rgt96tfkO).OPXfSBeufaJ8.length();
        ArrayList arrayList = r71Var.rtx2ld2ELZv4;
        xi1 xi1Var = (xi1) arrayList.get(i == length ? fx1.xbgXKYA2cIfu(arrayList) : kj0.gPXPFXrUH4XX(i, arrayList));
        return xi1Var.PxuCJdSBwIXG.Y1f8riQaR6yg.a92UlCVFR9N8.isRtlCharAt(xi1Var.Y1f8riQaR6yg(i)) ? iv1.OPXfSBeufaJ8 : iv1.rtx2ld2ELZv4;
    }

    public final iv1 RAsUl2FVSrh6(int i) {
        r71 r71Var = this.lS5Rgt96tfkO;
        r71Var.dgRBjINgWbAK(i);
        int length = ((v8) r71Var.PxuCJdSBwIXG.lS5Rgt96tfkO).OPXfSBeufaJ8.length();
        ArrayList arrayList = r71Var.rtx2ld2ELZv4;
        xi1 xi1Var = (xi1) arrayList.get(i == length ? fx1.xbgXKYA2cIfu(arrayList) : kj0.gPXPFXrUH4XX(i, arrayList));
        m4 m4Var = xi1Var.PxuCJdSBwIXG;
        int Y1f8riQaR6yg = xi1Var.Y1f8riQaR6yg(i);
        hi2 hi2Var = m4Var.Y1f8riQaR6yg;
        return hi2Var.a92UlCVFR9N8.getParagraphDirection(hi2Var.RAsUl2FVSrh6(Y1f8riQaR6yg)) == 1 ? iv1.rtx2ld2ELZv4 : iv1.OPXfSBeufaJ8;
    }

    public final qt1 TSizfFm2Yiuu(int i) {
        r71 r71Var = this.lS5Rgt96tfkO;
        r71Var.dgRBjINgWbAK(i);
        int length = ((v8) r71Var.PxuCJdSBwIXG.lS5Rgt96tfkO).OPXfSBeufaJ8.length();
        ArrayList arrayList = r71Var.rtx2ld2ELZv4;
        xi1 xi1Var = (xi1) arrayList.get(i == length ? fx1.xbgXKYA2cIfu(arrayList) : kj0.gPXPFXrUH4XX(i, arrayList));
        m4 m4Var = xi1Var.PxuCJdSBwIXG;
        int Y1f8riQaR6yg = xi1Var.Y1f8riQaR6yg(i);
        CharSequence charSequence = m4Var.e9gEMXR7LXtO;
        hi2 hi2Var = m4Var.Y1f8riQaR6yg;
        if (Y1f8riQaR6yg < 0 || Y1f8riQaR6yg > charSequence.length()) {
            StringBuilder BRwzKIf41E4i = o0.BRwzKIf41E4i(Y1f8riQaR6yg, "offset(", ") is out of bounds [0,");
            BRwzKIf41E4i.append(charSequence.length());
            BRwzKIf41E4i.append(']');
            fp0.PxuCJdSBwIXG(BRwzKIf41E4i.toString());
        }
        float OPXfSBeufaJ8 = hi2Var.OPXfSBeufaJ8(Y1f8riQaR6yg, false);
        int RAsUl2FVSrh6 = hi2Var.RAsUl2FVSrh6(Y1f8riQaR6yg);
        return xi1Var.PxuCJdSBwIXG(new qt1(OPXfSBeufaJ8, hi2Var.rtx2ld2ELZv4(RAsUl2FVSrh6), OPXfSBeufaJ8, hi2Var.e9gEMXR7LXtO(RAsUl2FVSrh6)));
    }

    public final float Y1f8riQaR6yg(int i) {
        r71 r71Var = this.lS5Rgt96tfkO;
        r71Var.x50lh2ztY7Y5(i);
        ArrayList arrayList = r71Var.rtx2ld2ELZv4;
        xi1 xi1Var = (xi1) arrayList.get(kj0.BRwzKIf41E4i(i, arrayList));
        m4 m4Var = xi1Var.PxuCJdSBwIXG;
        int i2 = i - xi1Var.Y1f8riQaR6yg;
        hi2 hi2Var = m4Var.Y1f8riQaR6yg;
        return hi2Var.a92UlCVFR9N8.getLineLeft(i2) + (i2 == hi2Var.RAsUl2FVSrh6 + (-1) ? hi2Var.wdg6QnbFHrFF : 0.0f);
    }

    public final int a92UlCVFR9N8(int i) {
        r71 r71Var = this.lS5Rgt96tfkO;
        r71Var.x50lh2ztY7Y5(i);
        ArrayList arrayList = r71Var.rtx2ld2ELZv4;
        xi1 xi1Var = (xi1) arrayList.get(kj0.BRwzKIf41E4i(i, arrayList));
        m4 m4Var = xi1Var.PxuCJdSBwIXG;
        return m4Var.Y1f8riQaR6yg.a92UlCVFR9N8.getLineStart(i - xi1Var.Y1f8riQaR6yg) + xi1Var.lS5Rgt96tfkO;
    }

    public final float e9gEMXR7LXtO(int i) {
        r71 r71Var = this.lS5Rgt96tfkO;
        r71Var.x50lh2ztY7Y5(i);
        ArrayList arrayList = r71Var.rtx2ld2ELZv4;
        xi1 xi1Var = (xi1) arrayList.get(kj0.BRwzKIf41E4i(i, arrayList));
        m4 m4Var = xi1Var.PxuCJdSBwIXG;
        int i2 = i - xi1Var.Y1f8riQaR6yg;
        hi2 hi2Var = m4Var.Y1f8riQaR6yg;
        return hi2Var.a92UlCVFR9N8.getLineRight(i2) + (i2 == hi2Var.RAsUl2FVSrh6 + (-1) ? hi2Var.dgRBjINgWbAK : 0.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ji2) {
            ji2 ji2Var = (ji2) obj;
            if (cs0.wdg6QnbFHrFF(this.PxuCJdSBwIXG, ji2Var.PxuCJdSBwIXG) && this.lS5Rgt96tfkO == ji2Var.lS5Rgt96tfkO && ir0.PxuCJdSBwIXG(this.TSizfFm2Yiuu, ji2Var.TSizfFm2Yiuu) && this.Y1f8riQaR6yg == ji2Var.Y1f8riQaR6yg && this.e9gEMXR7LXtO == ji2Var.e9gEMXR7LXtO && cs0.wdg6QnbFHrFF(this.a92UlCVFR9N8, ji2Var.a92UlCVFR9N8)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a92UlCVFR9N8.hashCode() + o0.PxuCJdSBwIXG(this.e9gEMXR7LXtO, o0.PxuCJdSBwIXG(this.Y1f8riQaR6yg, o0.TSizfFm2Yiuu((this.lS5Rgt96tfkO.hashCode() + (this.PxuCJdSBwIXG.hashCode() * 31)) * 31, 31, this.TSizfFm2Yiuu), 31), 31);
    }

    public final qt1 lS5Rgt96tfkO(int i) {
        float wdg6QnbFHrFF;
        float wdg6QnbFHrFF2;
        float OPXfSBeufaJ8;
        float OPXfSBeufaJ82;
        r71 r71Var = this.lS5Rgt96tfkO;
        r71Var.wdg6QnbFHrFF(i);
        ArrayList arrayList = r71Var.rtx2ld2ELZv4;
        xi1 xi1Var = (xi1) arrayList.get(kj0.gPXPFXrUH4XX(i, arrayList));
        m4 m4Var = xi1Var.PxuCJdSBwIXG;
        int Y1f8riQaR6yg = xi1Var.Y1f8riQaR6yg(i);
        CharSequence charSequence = m4Var.e9gEMXR7LXtO;
        if (Y1f8riQaR6yg < 0 || Y1f8riQaR6yg >= charSequence.length()) {
            StringBuilder BRwzKIf41E4i = o0.BRwzKIf41E4i(Y1f8riQaR6yg, "offset(", ") is out of bounds [0,");
            BRwzKIf41E4i.append(charSequence.length());
            BRwzKIf41E4i.append(')');
            fp0.PxuCJdSBwIXG(BRwzKIf41E4i.toString());
        }
        hi2 hi2Var = m4Var.Y1f8riQaR6yg;
        int RAsUl2FVSrh6 = hi2Var.RAsUl2FVSrh6(Y1f8riQaR6yg);
        float rtx2ld2ELZv4 = hi2Var.rtx2ld2ELZv4(RAsUl2FVSrh6);
        float e9gEMXR7LXtO = hi2Var.e9gEMXR7LXtO(RAsUl2FVSrh6);
        Layout layout = hi2Var.a92UlCVFR9N8;
        boolean z = layout.getParagraphDirection(RAsUl2FVSrh6) == 1;
        boolean isRtlCharAt = layout.isRtlCharAt(Y1f8riQaR6yg);
        if (!z || isRtlCharAt) {
            if (z && isRtlCharAt) {
                OPXfSBeufaJ8 = hi2Var.wdg6QnbFHrFF(Y1f8riQaR6yg, false);
                OPXfSBeufaJ82 = hi2Var.wdg6QnbFHrFF(Y1f8riQaR6yg + 1, true);
            } else if (isRtlCharAt) {
                OPXfSBeufaJ8 = hi2Var.OPXfSBeufaJ8(Y1f8riQaR6yg, false);
                OPXfSBeufaJ82 = hi2Var.OPXfSBeufaJ8(Y1f8riQaR6yg + 1, true);
            } else {
                wdg6QnbFHrFF = hi2Var.wdg6QnbFHrFF(Y1f8riQaR6yg, false);
                wdg6QnbFHrFF2 = hi2Var.wdg6QnbFHrFF(Y1f8riQaR6yg + 1, true);
            }
            float f = OPXfSBeufaJ8;
            wdg6QnbFHrFF = OPXfSBeufaJ82;
            wdg6QnbFHrFF2 = f;
        } else {
            wdg6QnbFHrFF = hi2Var.OPXfSBeufaJ8(Y1f8riQaR6yg, false);
            wdg6QnbFHrFF2 = hi2Var.OPXfSBeufaJ8(Y1f8riQaR6yg + 1, true);
        }
        RectF rectF = new RectF(wdg6QnbFHrFF, rtx2ld2ELZv4, wdg6QnbFHrFF2, e9gEMXR7LXtO);
        return xi1Var.PxuCJdSBwIXG(new qt1(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    public final long rtx2ld2ELZv4(int i) {
        int OPXfSBeufaJ8;
        int i2;
        int rtx2ld2ELZv4;
        r71 r71Var = this.lS5Rgt96tfkO;
        r71Var.dgRBjINgWbAK(i);
        int length = ((v8) r71Var.PxuCJdSBwIXG.lS5Rgt96tfkO).OPXfSBeufaJ8.length();
        ArrayList arrayList = r71Var.rtx2ld2ELZv4;
        xi1 xi1Var = (xi1) arrayList.get(i == length ? fx1.xbgXKYA2cIfu(arrayList) : kj0.gPXPFXrUH4XX(i, arrayList));
        m4 m4Var = xi1Var.PxuCJdSBwIXG;
        int Y1f8riQaR6yg = xi1Var.Y1f8riQaR6yg(i);
        tu2 dgRBjINgWbAK = m4Var.Y1f8riQaR6yg.dgRBjINgWbAK();
        if (dgRBjINgWbAK.RAsUl2FVSrh6(dgRBjINgWbAK.OPXfSBeufaJ8(Y1f8riQaR6yg))) {
            dgRBjINgWbAK.PxuCJdSBwIXG(Y1f8riQaR6yg);
            OPXfSBeufaJ8 = Y1f8riQaR6yg;
            while (OPXfSBeufaJ8 != -1 && (!dgRBjINgWbAK.RAsUl2FVSrh6(OPXfSBeufaJ8) || dgRBjINgWbAK.TSizfFm2Yiuu(OPXfSBeufaJ8))) {
                OPXfSBeufaJ8 = dgRBjINgWbAK.OPXfSBeufaJ8(OPXfSBeufaJ8);
            }
        } else {
            dgRBjINgWbAK.PxuCJdSBwIXG(Y1f8riQaR6yg);
            OPXfSBeufaJ8 = dgRBjINgWbAK.a92UlCVFR9N8(Y1f8riQaR6yg) ? (!dgRBjINgWbAK.Y1f8riQaR6yg(Y1f8riQaR6yg) || dgRBjINgWbAK.lS5Rgt96tfkO(Y1f8riQaR6yg)) ? dgRBjINgWbAK.OPXfSBeufaJ8(Y1f8riQaR6yg) : Y1f8riQaR6yg : dgRBjINgWbAK.lS5Rgt96tfkO(Y1f8riQaR6yg) ? dgRBjINgWbAK.OPXfSBeufaJ8(Y1f8riQaR6yg) : -1;
        }
        if (OPXfSBeufaJ8 == -1) {
            OPXfSBeufaJ8 = Y1f8riQaR6yg;
        }
        if (dgRBjINgWbAK.TSizfFm2Yiuu(dgRBjINgWbAK.rtx2ld2ELZv4(Y1f8riQaR6yg))) {
            dgRBjINgWbAK.PxuCJdSBwIXG(Y1f8riQaR6yg);
            i2 = Y1f8riQaR6yg;
            while (i2 != -1 && (dgRBjINgWbAK.RAsUl2FVSrh6(i2) || !dgRBjINgWbAK.TSizfFm2Yiuu(i2))) {
                i2 = dgRBjINgWbAK.rtx2ld2ELZv4(i2);
            }
        } else {
            dgRBjINgWbAK.PxuCJdSBwIXG(Y1f8riQaR6yg);
            if (dgRBjINgWbAK.lS5Rgt96tfkO(Y1f8riQaR6yg)) {
                if (!dgRBjINgWbAK.Y1f8riQaR6yg(Y1f8riQaR6yg) || dgRBjINgWbAK.a92UlCVFR9N8(Y1f8riQaR6yg)) {
                    rtx2ld2ELZv4 = dgRBjINgWbAK.rtx2ld2ELZv4(Y1f8riQaR6yg);
                    i2 = rtx2ld2ELZv4;
                } else {
                    i2 = Y1f8riQaR6yg;
                }
            } else if (dgRBjINgWbAK.a92UlCVFR9N8(Y1f8riQaR6yg)) {
                rtx2ld2ELZv4 = dgRBjINgWbAK.rtx2ld2ELZv4(Y1f8riQaR6yg);
                i2 = rtx2ld2ELZv4;
            } else {
                i2 = -1;
            }
        }
        if (i2 != -1) {
            Y1f8riQaR6yg = i2;
        }
        return xi1Var.lS5Rgt96tfkO(jh0.rtx2ld2ELZv4(OPXfSBeufaJ8, Y1f8riQaR6yg), false);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.PxuCJdSBwIXG + ", multiParagraph=" + this.lS5Rgt96tfkO + ", size=" + ((Object) ir0.lS5Rgt96tfkO(this.TSizfFm2Yiuu)) + ", firstBaseline=" + this.Y1f8riQaR6yg + ", lastBaseline=" + this.e9gEMXR7LXtO + ", placeholderRects=" + this.a92UlCVFR9N8 + ')';
    }
}
