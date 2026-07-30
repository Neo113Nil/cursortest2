package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.SegmentFinder;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class m4 {
    public final q4 PxuCJdSBwIXG;
    public final long TSizfFm2Yiuu;
    public final hi2 Y1f8riQaR6yg;
    public final List a92UlCVFR9N8;
    public final CharSequence e9gEMXR7LXtO;
    public final int lS5Rgt96tfkO;

    /* JADX WARN: Removed duplicated region for block: B:103:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x029c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m4(q4 q4Var, int i, int i2, long j) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        TextUtils.TruncateAt truncateAt;
        TextUtils.TruncateAt truncateAt2;
        hi2 PxuCJdSBwIXG;
        int i11;
        m4 m4Var;
        int i12;
        int i13;
        int i14;
        Layout layout;
        u42[] u42VarArr;
        CharSequence charSequence;
        List list;
        qt1 qt1Var;
        float wdg6QnbFHrFF;
        int TSizfFm2Yiuu;
        float OPXfSBeufaJ8;
        int TSizfFm2Yiuu2;
        int i15;
        this.PxuCJdSBwIXG = q4Var;
        this.lS5Rgt96tfkO = i;
        this.TSizfFm2Yiuu = j;
        if (rr.OPXfSBeufaJ8(j) != 0 || rr.wdg6QnbFHrFF(j) != 0) {
            fp0.PxuCJdSBwIXG("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i < 1) {
            fp0.PxuCJdSBwIXG("maxLines should be greater than 0");
        }
        dj2 dj2Var = q4Var.lS5Rgt96tfkO;
        CharSequence charSequence2 = q4Var.rtx2ld2ELZv4;
        si2.Companion.getClass();
        if (i2 == 2) {
            q82 q82Var = dj2Var.PxuCJdSBwIXG;
            bj1 bj1Var = dj2Var.lS5Rgt96tfkO;
            i4 = 0;
            i3 = 1;
            if (!hj2.PxuCJdSBwIXG(q82Var.rtx2ld2ELZv4, ki0.tmVwIGCQF4zR(0))) {
                long j2 = dj2Var.PxuCJdSBwIXG.rtx2ld2ELZv4;
                hj2.Companion.getClass();
                if (!hj2.PxuCJdSBwIXG(j2, hj2.TSizfFm2Yiuu)) {
                    int i16 = bj1Var.PxuCJdSBwIXG;
                    he2.Companion.getClass();
                    if (i16 != 0 && (i15 = bj1Var.PxuCJdSBwIXG) != 5 && i15 != 4 && charSequence2.length() != 0) {
                        Spannable spannable = charSequence2 instanceof Spannable ? (Spannable) charSequence2 : null;
                        spannable = spannable == null ? new SpannableString(charSequence2) : spannable;
                        if (!vi0.BjEWd04qc7Mw(spannable, rn0.class)) {
                            spannable.setSpan(new rn0(), spannable.length() - 1, spannable.length() - 1, 33);
                        }
                        charSequence2 = spannable;
                    }
                }
            }
        } else {
            i3 = 1;
            i4 = 0;
        }
        CharSequence charSequence3 = charSequence2;
        this.e9gEMXR7LXtO = charSequence3;
        bj1 bj1Var2 = dj2Var.lS5Rgt96tfkO;
        q82 q82Var2 = dj2Var.PxuCJdSBwIXG;
        int i17 = bj1Var2.PxuCJdSBwIXG;
        he2.Companion.getClass();
        int i18 = i17 == i3 ? 3 : i17 == 2 ? 4 : i17 == 3 ? 2 : (i17 != 5 && i17 == 6) ? 1 : i4;
        int i19 = bj1Var2.PxuCJdSBwIXG;
        int i20 = bj1Var2.RAsUl2FVSrh6;
        int i21 = i19 == 4 ? 1 : i4;
        int i22 = bj1Var2.rtx2ld2ELZv4;
        om0.Companion.getClass();
        int i23 = i22 == 2 ? Build.VERSION.SDK_INT <= 32 ? 2 : 4 : i4;
        z01 z01Var = g11.Companion;
        int i24 = i20 & 255;
        b11.Companion.getClass();
        if (i24 != 1) {
            if (i24 == 2) {
                i5 = 1;
            } else if (i24 == 3) {
                i5 = 2;
            }
            i6 = (i20 >> 8) & 255;
            d11.Companion.getClass();
            if (i6 != 1) {
                if (i6 == 2) {
                    i7 = i23;
                    i8 = i21;
                    i9 = 1;
                } else if (i6 == 3) {
                    i7 = i23;
                    i8 = i21;
                    i9 = 2;
                } else if (i6 == 4) {
                    i7 = i23;
                    i8 = i21;
                    i9 = 3;
                }
                int i25 = (i20 >> 16) & 255;
                f11.Companion.getClass();
                int i26 = (i25 != 1 && i25 == 2) ? 1 : i4;
                if (i2 != 2) {
                    i10 = i5;
                    truncateAt = TextUtils.TruncateAt.END;
                } else {
                    if (i2 == 5) {
                        truncateAt2 = TextUtils.TruncateAt.MIDDLE;
                    } else if (i2 == 4) {
                        truncateAt2 = TextUtils.TruncateAt.START;
                    } else {
                        i10 = i5;
                        truncateAt = null;
                    }
                    i10 = i5;
                    truncateAt = truncateAt2;
                }
                PxuCJdSBwIXG = PxuCJdSBwIXG(i18, i8, truncateAt, i, i7, i10, i9, i26, charSequence3);
                Layout layout2 = PxuCJdSBwIXG.a92UlCVFR9N8;
                i11 = i18;
                if (Build.VERSION.SDK_INT < 35 || q4Var.RAsUl2FVSrh6.getLetterSpacing() == 0.0f || (!(i2 == 4 || i2 == 5) || layout2.getEllipsisCount(0) <= 0)) {
                    m4Var = this;
                    i12 = i;
                    i13 = i11;
                    i14 = 2;
                } else {
                    int ellipsisStart = layout2.getEllipsisStart(0);
                    i14 = 2;
                    CharSequence[] charSequenceArr = {charSequence3.subSequence(0, ellipsisStart), "…", charSequence3.subSequence(layout2.getEllipsisCount(0) + ellipsisStart, charSequence3.length())};
                    m4Var = this;
                    i12 = i;
                    i13 = i11;
                    PxuCJdSBwIXG = m4Var.PxuCJdSBwIXG(i13, i8, truncateAt, i12, i7, i10, i9, i26, TextUtils.concat(charSequenceArr));
                }
                int i27 = PxuCJdSBwIXG.RAsUl2FVSrh6;
                if (i2 == i14 || PxuCJdSBwIXG.PxuCJdSBwIXG() <= rr.RAsUl2FVSrh6(j) || i12 <= 1) {
                    m4Var.Y1f8riQaR6yg = PxuCJdSBwIXG;
                } else {
                    int RAsUl2FVSrh6 = rr.RAsUl2FVSrh6(j);
                    int i28 = 0;
                    while (true) {
                        if (i28 >= i27) {
                            i28 = i27;
                            break;
                        } else if (PxuCJdSBwIXG.e9gEMXR7LXtO(i28) > RAsUl2FVSrh6) {
                            break;
                        } else {
                            i28++;
                        }
                    }
                    if (i28 >= 0 && i28 != m4Var.lS5Rgt96tfkO) {
                        PxuCJdSBwIXG = m4Var.PxuCJdSBwIXG(i13, i8, truncateAt, i28 < 1 ? 1 : i28, i7, i10, i9, i26, m4Var.e9gEMXR7LXtO);
                    }
                    m4Var.Y1f8riQaR6yg = PxuCJdSBwIXG;
                }
                m4Var.PxuCJdSBwIXG.RAsUl2FVSrh6.TSizfFm2Yiuu(q82Var2.PxuCJdSBwIXG.TSizfFm2Yiuu(), (Float.floatToRawIntBits(m4Var.lS5Rgt96tfkO()) & 4294967295L) | (Float.floatToRawIntBits(m4Var.Y1f8riQaR6yg()) << 32), q82Var2.PxuCJdSBwIXG.PxuCJdSBwIXG());
                layout = m4Var.Y1f8riQaR6yg.a92UlCVFR9N8;
                if (layout.getText() instanceof Spanned) {
                    CharSequence text = layout.getText();
                    text.getClass();
                    Spanned spanned = (Spanned) text;
                    if (spanned.nextSpanTransition(-1, spanned.length(), u42.class) != spanned.length()) {
                        CharSequence text2 = layout.getText();
                        text2.getClass();
                        u42VarArr = (u42[]) ((Spanned) text2).getSpans(0, layout.getText().length(), u42.class);
                        if (u42VarArr != null) {
                            for (u42 u42Var : u42VarArr) {
                                u42Var.wdg6QnbFHrFF.setValue(new a62((Float.floatToRawIntBits(m4Var.lS5Rgt96tfkO()) & 4294967295L) | (Float.floatToRawIntBits(m4Var.Y1f8riQaR6yg()) << 32)));
                            }
                        }
                        charSequence = m4Var.e9gEMXR7LXtO;
                        if (charSequence instanceof Spanned) {
                            Spanned spanned2 = (Spanned) charSequence;
                            Object[] spans = spanned2.getSpans(0, charSequence.length(), im1.class);
                            ArrayList arrayList = new ArrayList(spans.length);
                            for (Object obj : spans) {
                                im1 im1Var = (im1) obj;
                                int spanStart = spanned2.getSpanStart(im1Var);
                                int spanEnd = spanned2.getSpanEnd(im1Var);
                                int RAsUl2FVSrh62 = m4Var.Y1f8riQaR6yg.RAsUl2FVSrh6(spanStart);
                                boolean z = RAsUl2FVSrh62 >= m4Var.lS5Rgt96tfkO;
                                boolean z2 = m4Var.Y1f8riQaR6yg.a92UlCVFR9N8.getEllipsisCount(RAsUl2FVSrh62) > 0 && spanEnd > m4Var.Y1f8riQaR6yg.a92UlCVFR9N8.getEllipsisStart(RAsUl2FVSrh62) + m4Var.Y1f8riQaR6yg.a92UlCVFR9N8.getLineStart(RAsUl2FVSrh62);
                                boolean z3 = spanEnd > m4Var.Y1f8riQaR6yg.a92UlCVFR9N8(RAsUl2FVSrh62);
                                if (z2 || z3 || z) {
                                    qt1Var = null;
                                } else {
                                    boolean z4 = m4Var.Y1f8riQaR6yg.a92UlCVFR9N8.getParagraphDirection(RAsUl2FVSrh62) == 1;
                                    boolean isRtlCharAt = m4Var.Y1f8riQaR6yg.a92UlCVFR9N8.isRtlCharAt(spanStart);
                                    if (!z4 || isRtlCharAt) {
                                        if (z4 && isRtlCharAt) {
                                            OPXfSBeufaJ8 = m4Var.Y1f8riQaR6yg.wdg6QnbFHrFF(spanStart, false);
                                            TSizfFm2Yiuu2 = im1Var.TSizfFm2Yiuu();
                                        } else {
                                            hi2 hi2Var = m4Var.Y1f8riQaR6yg;
                                            if (isRtlCharAt) {
                                                OPXfSBeufaJ8 = hi2Var.OPXfSBeufaJ8(spanStart, false);
                                                TSizfFm2Yiuu2 = im1Var.TSizfFm2Yiuu();
                                            } else {
                                                wdg6QnbFHrFF = hi2Var.wdg6QnbFHrFF(spanStart, false);
                                                TSizfFm2Yiuu = im1Var.TSizfFm2Yiuu();
                                            }
                                        }
                                        wdg6QnbFHrFF = OPXfSBeufaJ8 - TSizfFm2Yiuu2;
                                        hi2 hi2Var2 = m4Var.Y1f8riQaR6yg;
                                        im1Var.getClass();
                                        float Y1f8riQaR6yg = hi2Var2.Y1f8riQaR6yg(RAsUl2FVSrh62) - im1Var.lS5Rgt96tfkO();
                                        qt1Var = new qt1(wdg6QnbFHrFF, Y1f8riQaR6yg, OPXfSBeufaJ8, im1Var.lS5Rgt96tfkO() + Y1f8riQaR6yg);
                                    } else {
                                        wdg6QnbFHrFF = m4Var.Y1f8riQaR6yg.OPXfSBeufaJ8(spanStart, false);
                                        TSizfFm2Yiuu = im1Var.TSizfFm2Yiuu();
                                    }
                                    OPXfSBeufaJ8 = TSizfFm2Yiuu + wdg6QnbFHrFF;
                                    hi2 hi2Var22 = m4Var.Y1f8riQaR6yg;
                                    im1Var.getClass();
                                    float Y1f8riQaR6yg2 = hi2Var22.Y1f8riQaR6yg(RAsUl2FVSrh62) - im1Var.lS5Rgt96tfkO();
                                    qt1Var = new qt1(wdg6QnbFHrFF, Y1f8riQaR6yg2, OPXfSBeufaJ8, im1Var.lS5Rgt96tfkO() + Y1f8riQaR6yg2);
                                }
                                arrayList.add(qt1Var);
                            }
                            list = arrayList;
                        } else {
                            list = p50.rtx2ld2ELZv4;
                        }
                        m4Var.a92UlCVFR9N8 = list;
                    }
                }
                u42VarArr = null;
                if (u42VarArr != null) {
                }
                charSequence = m4Var.e9gEMXR7LXtO;
                if (charSequence instanceof Spanned) {
                }
                m4Var.a92UlCVFR9N8 = list;
            }
            i7 = i23;
            i8 = i21;
            i9 = i4;
            int i252 = (i20 >> 16) & 255;
            f11.Companion.getClass();
            if (i252 != 1) {
                if (i2 != 2) {
                }
                PxuCJdSBwIXG = PxuCJdSBwIXG(i18, i8, truncateAt, i, i7, i10, i9, i26, charSequence3);
                Layout layout22 = PxuCJdSBwIXG.a92UlCVFR9N8;
                i11 = i18;
                if (Build.VERSION.SDK_INT < 35) {
                }
                m4Var = this;
                i12 = i;
                i13 = i11;
                i14 = 2;
                int i272 = PxuCJdSBwIXG.RAsUl2FVSrh6;
                if (i2 == i14) {
                }
                m4Var.Y1f8riQaR6yg = PxuCJdSBwIXG;
                m4Var.PxuCJdSBwIXG.RAsUl2FVSrh6.TSizfFm2Yiuu(q82Var2.PxuCJdSBwIXG.TSizfFm2Yiuu(), (Float.floatToRawIntBits(m4Var.lS5Rgt96tfkO()) & 4294967295L) | (Float.floatToRawIntBits(m4Var.Y1f8riQaR6yg()) << 32), q82Var2.PxuCJdSBwIXG.PxuCJdSBwIXG());
                layout = m4Var.Y1f8riQaR6yg.a92UlCVFR9N8;
                if (layout.getText() instanceof Spanned) {
                }
                u42VarArr = null;
                if (u42VarArr != null) {
                }
                charSequence = m4Var.e9gEMXR7LXtO;
                if (charSequence instanceof Spanned) {
                }
                m4Var.a92UlCVFR9N8 = list;
            }
            if (i2 != 2) {
            }
            PxuCJdSBwIXG = PxuCJdSBwIXG(i18, i8, truncateAt, i, i7, i10, i9, i26, charSequence3);
            Layout layout222 = PxuCJdSBwIXG.a92UlCVFR9N8;
            i11 = i18;
            if (Build.VERSION.SDK_INT < 35) {
            }
            m4Var = this;
            i12 = i;
            i13 = i11;
            i14 = 2;
            int i2722 = PxuCJdSBwIXG.RAsUl2FVSrh6;
            if (i2 == i14) {
            }
            m4Var.Y1f8riQaR6yg = PxuCJdSBwIXG;
            m4Var.PxuCJdSBwIXG.RAsUl2FVSrh6.TSizfFm2Yiuu(q82Var2.PxuCJdSBwIXG.TSizfFm2Yiuu(), (Float.floatToRawIntBits(m4Var.lS5Rgt96tfkO()) & 4294967295L) | (Float.floatToRawIntBits(m4Var.Y1f8riQaR6yg()) << 32), q82Var2.PxuCJdSBwIXG.PxuCJdSBwIXG());
            layout = m4Var.Y1f8riQaR6yg.a92UlCVFR9N8;
            if (layout.getText() instanceof Spanned) {
            }
            u42VarArr = null;
            if (u42VarArr != null) {
            }
            charSequence = m4Var.e9gEMXR7LXtO;
            if (charSequence instanceof Spanned) {
            }
            m4Var.a92UlCVFR9N8 = list;
        }
        i5 = i4;
        i6 = (i20 >> 8) & 255;
        d11.Companion.getClass();
        if (i6 != 1) {
        }
        i7 = i23;
        i8 = i21;
        i9 = i4;
        int i2522 = (i20 >> 16) & 255;
        f11.Companion.getClass();
        if (i2522 != 1) {
        }
        if (i2 != 2) {
        }
        PxuCJdSBwIXG = PxuCJdSBwIXG(i18, i8, truncateAt, i, i7, i10, i9, i26, charSequence3);
        Layout layout2222 = PxuCJdSBwIXG.a92UlCVFR9N8;
        i11 = i18;
        if (Build.VERSION.SDK_INT < 35) {
        }
        m4Var = this;
        i12 = i;
        i13 = i11;
        i14 = 2;
        int i27222 = PxuCJdSBwIXG.RAsUl2FVSrh6;
        if (i2 == i14) {
        }
        m4Var.Y1f8riQaR6yg = PxuCJdSBwIXG;
        m4Var.PxuCJdSBwIXG.RAsUl2FVSrh6.TSizfFm2Yiuu(q82Var2.PxuCJdSBwIXG.TSizfFm2Yiuu(), (Float.floatToRawIntBits(m4Var.lS5Rgt96tfkO()) & 4294967295L) | (Float.floatToRawIntBits(m4Var.Y1f8riQaR6yg()) << 32), q82Var2.PxuCJdSBwIXG.PxuCJdSBwIXG());
        layout = m4Var.Y1f8riQaR6yg.a92UlCVFR9N8;
        if (layout.getText() instanceof Spanned) {
        }
        u42VarArr = null;
        if (u42VarArr != null) {
        }
        charSequence = m4Var.e9gEMXR7LXtO;
        if (charSequence instanceof Spanned) {
        }
        m4Var.a92UlCVFR9N8 = list;
    }

    public final hi2 PxuCJdSBwIXG(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        xm1 xm1Var;
        float Y1f8riQaR6yg = Y1f8riQaR6yg();
        q4 q4Var = this.PxuCJdSBwIXG;
        p6 p6Var = q4Var.RAsUl2FVSrh6;
        int i8 = q4Var.x50lh2ztY7Y5;
        hw0 hw0Var = q4Var.OPXfSBeufaJ8;
        dj2 dj2Var = q4Var.lS5Rgt96tfkO;
        n4 n4Var = o4.PxuCJdSBwIXG;
        ln1 ln1Var = dj2Var.TSizfFm2Yiuu;
        return new hi2(charSequence, Y1f8riQaR6yg, p6Var, i, truncateAt, i8, (ln1Var == null || (xm1Var = ln1Var.lS5Rgt96tfkO) == null) ? false : xm1Var.PxuCJdSBwIXG, i3, i5, i6, i7, i4, i2, hw0Var);
    }

    public final void RAsUl2FVSrh6(gi giVar, uf ufVar, float f, w42 w42Var, if2 if2Var, l30 l30Var) {
        p6 p6Var = this.PxuCJdSBwIXG.RAsUl2FVSrh6;
        int i = p6Var.TSizfFm2Yiuu;
        float Y1f8riQaR6yg = Y1f8riQaR6yg();
        float lS5Rgt96tfkO = lS5Rgt96tfkO();
        p6Var.TSizfFm2Yiuu(ufVar, (Float.floatToRawIntBits(lS5Rgt96tfkO) & 4294967295L) | (Float.floatToRawIntBits(Y1f8riQaR6yg) << 32), f);
        p6Var.a92UlCVFR9N8(w42Var);
        p6Var.RAsUl2FVSrh6(if2Var);
        p6Var.e9gEMXR7LXtO(l30Var);
        p6Var.lS5Rgt96tfkO(3);
        e9gEMXR7LXtO(giVar);
        p6Var.lS5Rgt96tfkO(i);
    }

    /* JADX WARN: Type inference failed for: r10v27, types: [z3] */
    public final long TSizfFm2Yiuu(qt1 qt1Var, int i, xh2 xh2Var) {
        c22 lh0Var;
        int i2;
        int[] iArr;
        SegmentFinder dgRBjINgWbAK;
        RectF JHNfcAUfKc4G = vi0.JHNfcAUfKc4G(qt1Var);
        vh2.Companion.getClass();
        int i3 = 0;
        boolean z = i != 0 && i == 1;
        final l4 l4Var = new l4(i3, xh2Var);
        hi2 hi2Var = this.Y1f8riQaR6yg;
        TextPaint textPaint = hi2Var.PxuCJdSBwIXG;
        Layout layout = hi2Var.a92UlCVFR9N8;
        int i4 = Build.VERSION.SDK_INT;
        int i5 = 12;
        if (i4 >= 34) {
            if (z) {
                dgRBjINgWbAK = new g9(new cr1(i5, layout.getText(), hi2Var.dgRBjINgWbAK()));
            } else {
                y3.QrzZRwfaDlRX();
                dgRBjINgWbAK = y3.dgRBjINgWbAK(y3.wdg6QnbFHrFF(layout.getText(), textPaint));
            }
            iArr = layout.getRangeForRect(JHNfcAUfKc4G, dgRBjINgWbAK, new Layout.TextInclusionStrategy() { // from class: z3
                @Override // android.text.Layout.TextInclusionStrategy
                public final boolean isSegmentInside(RectF rectF, RectF rectF2) {
                    return ((Boolean) l4.this.rtx2ld2ELZv4(rectF, rectF2)).booleanValue();
                }
            });
        } else {
            xb TSizfFm2Yiuu = hi2Var.TSizfFm2Yiuu();
            if (z) {
                lh0Var = new cr1(i5, layout.getText(), hi2Var.dgRBjINgWbAK());
            } else {
                CharSequence text = layout.getText();
                lh0Var = i4 >= 29 ? new lh0(text, textPaint) : new mh0(text);
            }
            c22 c22Var = lh0Var;
            int lineForVertical = layout.getLineForVertical((int) JHNfcAUfKc4G.top);
            if (JHNfcAUfKc4G.top <= hi2Var.e9gEMXR7LXtO(lineForVertical) || (lineForVertical = lineForVertical + 1) < hi2Var.RAsUl2FVSrh6) {
                int i6 = lineForVertical;
                int lineForVertical2 = layout.getLineForVertical((int) JHNfcAUfKc4G.bottom);
                if (lineForVertical2 != 0 || JHNfcAUfKc4G.bottom >= hi2Var.rtx2ld2ELZv4(0)) {
                    int ZbWwgt3aGe7A = ng0.ZbWwgt3aGe7A(hi2Var, layout, TSizfFm2Yiuu, i6, JHNfcAUfKc4G, c22Var, l4Var, true);
                    while (true) {
                        i2 = i6;
                        if (ZbWwgt3aGe7A != -1 || i2 >= lineForVertical2) {
                            break;
                        }
                        i6 = i2 + 1;
                        ZbWwgt3aGe7A = ng0.ZbWwgt3aGe7A(hi2Var, layout, TSizfFm2Yiuu, i6, JHNfcAUfKc4G, c22Var, l4Var, true);
                    }
                    if (ZbWwgt3aGe7A != -1) {
                        int i7 = lineForVertical2;
                        int ZbWwgt3aGe7A2 = ng0.ZbWwgt3aGe7A(hi2Var, layout, TSizfFm2Yiuu, i7, JHNfcAUfKc4G, c22Var, l4Var, false);
                        while (ZbWwgt3aGe7A2 == -1 && i2 < i7) {
                            i7--;
                            ZbWwgt3aGe7A2 = ng0.ZbWwgt3aGe7A(hi2Var, layout, TSizfFm2Yiuu, i7, JHNfcAUfKc4G, c22Var, l4Var, false);
                        }
                        if (ZbWwgt3aGe7A2 != -1) {
                            iArr = new int[]{c22Var.PxuCJdSBwIXG(ZbWwgt3aGe7A + 1), c22Var.lS5Rgt96tfkO(ZbWwgt3aGe7A2 - 1)};
                        }
                    }
                }
            }
            iArr = null;
        }
        if (iArr != null) {
            return jh0.rtx2ld2ELZv4(iArr[0], iArr[1]);
        }
        vi2.Companion.getClass();
        return vi2.lS5Rgt96tfkO;
    }

    public final float Y1f8riQaR6yg() {
        return rr.rtx2ld2ELZv4(this.TSizfFm2Yiuu);
    }

    public final void a92UlCVFR9N8(gi giVar, long j, w42 w42Var, if2 if2Var, l30 l30Var) {
        p6 p6Var = this.PxuCJdSBwIXG.RAsUl2FVSrh6;
        int i = p6Var.TSizfFm2Yiuu;
        p6Var.Y1f8riQaR6yg(j);
        p6Var.a92UlCVFR9N8(w42Var);
        p6Var.RAsUl2FVSrh6(if2Var);
        p6Var.e9gEMXR7LXtO(l30Var);
        p6Var.lS5Rgt96tfkO(3);
        e9gEMXR7LXtO(giVar);
        p6Var.lS5Rgt96tfkO(i);
    }

    public final void e9gEMXR7LXtO(gi giVar) {
        Canvas PxuCJdSBwIXG = u0.PxuCJdSBwIXG(giVar);
        hi2 hi2Var = this.Y1f8riQaR6yg;
        if (hi2Var.Y1f8riQaR6yg) {
            PxuCJdSBwIXG.save();
            PxuCJdSBwIXG.clipRect(0.0f, 0.0f, Y1f8riQaR6yg(), lS5Rgt96tfkO());
        }
        int i = hi2Var.rtx2ld2ELZv4;
        if (PxuCJdSBwIXG.getClipBounds(hi2Var.gPXPFXrUH4XX)) {
            if (i != 0) {
                PxuCJdSBwIXG.translate(0.0f, i);
            }
            ThreadLocal threadLocal = li2.PxuCJdSBwIXG;
            Object obj = threadLocal.get();
            if (obj == null) {
                obj = new je2();
                threadLocal.set(obj);
            }
            je2 je2Var = (je2) obj;
            je2Var.PxuCJdSBwIXG = PxuCJdSBwIXG;
            try {
                hi2Var.a92UlCVFR9N8.draw(je2Var);
                if (i != 0) {
                    PxuCJdSBwIXG.translate(0.0f, (-1.0f) * i);
                }
            } finally {
                je2Var.PxuCJdSBwIXG = null;
            }
        }
        if (hi2Var.Y1f8riQaR6yg) {
            PxuCJdSBwIXG.restore();
        }
    }

    public final float lS5Rgt96tfkO() {
        return this.Y1f8riQaR6yg.PxuCJdSBwIXG();
    }
}
