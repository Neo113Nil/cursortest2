package defpackage;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class hi2 {
    public xb BRwzKIf41E4i;
    public final int OPXfSBeufaJ8;
    public final TextPaint PxuCJdSBwIXG;
    public final q11[] QrzZRwfaDlRX;
    public final int RAsUl2FVSrh6;
    public final boolean TSizfFm2Yiuu;
    public final boolean Y1f8riQaR6yg;
    public final Layout a92UlCVFR9N8;
    public final Paint.FontMetricsInt cpQdD2nAriOS;
    public final float dgRBjINgWbAK;
    public tu2 e9gEMXR7LXtO;
    public final Rect gPXPFXrUH4XX = new Rect();
    public final TextUtils.TruncateAt lS5Rgt96tfkO;
    public final int r3s1LDPKFs1S;
    public final int rtx2ld2ELZv4;
    public final float wdg6QnbFHrFF;
    public final boolean x50lh2ztY7Y5;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0185 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0297 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0331  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public hi2(CharSequence charSequence, float f, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, hw0 hw0Var) {
        int i9;
        TextDirectionHeuristic textDirectionHeuristic;
        Layout EcgxDIVH5in8;
        q11[] q11VarArr;
        int i10;
        int i11;
        int i12;
        int i13;
        char c;
        long j;
        int i14;
        int i15;
        long PxuCJdSBwIXG;
        int i16;
        boolean isFallbackLineSpacingEnabled;
        boolean isFallbackLineSpacingEnabled2;
        long j2;
        int i17;
        Layout layout;
        int i18;
        Paint.FontMetricsInt fontMetricsInt;
        int i19;
        this.PxuCJdSBwIXG = textPaint;
        this.lS5Rgt96tfkO = truncateAt;
        this.TSizfFm2Yiuu = z;
        int length = charSequence.length();
        TextDirectionHeuristic lS5Rgt96tfkO = li2.lS5Rgt96tfkO(i2);
        Layout.Alignment alignment = ie2.PxuCJdSBwIXG;
        Layout.Alignment alignment2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? Layout.Alignment.ALIGN_NORMAL : ie2.lS5Rgt96tfkO : ie2.PxuCJdSBwIXG : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        boolean z2 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, vc.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics PxuCJdSBwIXG2 = hw0Var.PxuCJdSBwIXG();
            double d = f;
            int ceil = (int) Math.ceil(d);
            if (PxuCJdSBwIXG2 == null || hw0Var.TSizfFm2Yiuu() > f || z2) {
                this.x50lh2ztY7Y5 = false;
                i9 = i3;
                textDirectionHeuristic = lS5Rgt96tfkO;
                EcgxDIVH5in8 = xi0.EcgxDIVH5in8(charSequence, textPaint, ceil, charSequence.length(), textDirectionHeuristic, alignment2, i9, truncateAt, (int) Math.ceil(d), i8, z, i4, i5, i6, i7);
            } else {
                this.x50lh2ztY7Y5 = true;
                if (ceil < 0) {
                    fp0.PxuCJdSBwIXG("negative width");
                }
                if (ceil < 0) {
                    fp0.PxuCJdSBwIXG("negative ellipsized width");
                }
                EcgxDIVH5in8 = Build.VERSION.SDK_INT >= 33 ? uy1Qfkdvj4xZ.e9gEMXR7LXtO(charSequence, textPaint, ceil, alignment2, PxuCJdSBwIXG2, z, truncateAt, ceil) : new BoringLayout(charSequence, textPaint, ceil, alignment2, 1.0f, 0.0f, PxuCJdSBwIXG2, z, truncateAt, ceil);
                i9 = i3;
                textDirectionHeuristic = lS5Rgt96tfkO;
            }
            this.a92UlCVFR9N8 = EcgxDIVH5in8;
            Trace.endSection();
            int min = Math.min(EcgxDIVH5in8.getLineCount(), i9);
            this.RAsUl2FVSrh6 = min;
            int i20 = min - 1;
            this.Y1f8riQaR6yg = min >= i9 && (EcgxDIVH5in8.getEllipsisCount(i20) > 0 || EcgxDIVH5in8.getLineEnd(i20) != charSequence.length());
            if (EcgxDIVH5in8.getText() instanceof Spanned) {
                CharSequence text = EcgxDIVH5in8.getText();
                text.getClass();
                if (vi0.BjEWd04qc7Mw((Spanned) text, q11.class) || EcgxDIVH5in8.getText().length() <= 0) {
                    CharSequence text2 = EcgxDIVH5in8.getText();
                    text2.getClass();
                    i10 = 0;
                    q11VarArr = (q11[]) ((Spanned) text2).getSpans(0, EcgxDIVH5in8.getText().length(), q11.class);
                    this.QrzZRwfaDlRX = q11VarArr;
                    if (q11VarArr != null) {
                        q11 q11Var = q11VarArr.length == 0 ? null : q11VarArr[i10];
                        if (q11Var != null) {
                            if (q11Var.wdg6QnbFHrFF) {
                                int i21 = q11Var.cpQdD2nAriOS;
                                m11.Companion.getClass();
                                i11 = 2;
                                if (i21 == 2) {
                                    i19 = 1;
                                    i12 = i19;
                                    if (q11VarArr != null) {
                                        q11 q11Var2 = q11VarArr.length == 0 ? null : q11VarArr[i10];
                                        if (q11Var2 != null && q11Var2.dgRBjINgWbAK) {
                                            int i22 = q11Var2.cpQdD2nAriOS;
                                            m11.Companion.getClass();
                                            if (i22 == i11) {
                                                i13 = 1;
                                                if (i12 != 0 || i13 == 0) {
                                                    long j3 = li2.lS5Rgt96tfkO;
                                                    if (z) {
                                                        c = ' ';
                                                        j = 4294967295L;
                                                        i14 = 1;
                                                        i15 = 33;
                                                    } else if (this.x50lh2ztY7Y5) {
                                                        BoringLayout boringLayout = (BoringLayout) EcgxDIVH5in8;
                                                        i15 = 33;
                                                        if (Build.VERSION.SDK_INT >= 33) {
                                                            isFallbackLineSpacingEnabled2 = boringLayout.isFallbackLineSpacingEnabled();
                                                            i16 = isFallbackLineSpacingEnabled2;
                                                            if (i16 != 0) {
                                                                c = ' ';
                                                                j = 4294967295L;
                                                                i14 = 1;
                                                            } else {
                                                                TextPaint paint = EcgxDIVH5in8.getPaint();
                                                                CharSequence text3 = EcgxDIVH5in8.getText();
                                                                c = ' ';
                                                                Rect S2OOm9zPNm0h = ni0.S2OOm9zPNm0h(paint, text3, EcgxDIVH5in8.getLineStart(i10), EcgxDIVH5in8.getLineEnd(i10));
                                                                int lineAscent = EcgxDIVH5in8.getLineAscent(i10);
                                                                j = 4294967295L;
                                                                int i23 = S2OOm9zPNm0h.top;
                                                                int topPadding = i23 < lineAscent ? lineAscent - i23 : EcgxDIVH5in8.getTopPadding();
                                                                i14 = 1;
                                                                S2OOm9zPNm0h = min != 1 ? ni0.S2OOm9zPNm0h(paint, text3, EcgxDIVH5in8.getLineStart(i20), EcgxDIVH5in8.getLineEnd(i20)) : S2OOm9zPNm0h;
                                                                int lineDescent = EcgxDIVH5in8.getLineDescent(i20);
                                                                int i24 = S2OOm9zPNm0h.bottom;
                                                                int bottomPadding = i24 > lineDescent ? i24 - lineDescent : EcgxDIVH5in8.getBottomPadding();
                                                                if (topPadding != 0 || bottomPadding != 0) {
                                                                    j3 = li2.PxuCJdSBwIXG(topPadding, bottomPadding);
                                                                }
                                                            }
                                                        }
                                                        i16 = i10;
                                                        if (i16 != 0) {
                                                        }
                                                    } else {
                                                        i15 = 33;
                                                        StaticLayout staticLayout = (StaticLayout) EcgxDIVH5in8;
                                                        int i25 = Build.VERSION.SDK_INT;
                                                        if (i25 >= 33) {
                                                            isFallbackLineSpacingEnabled = staticLayout.isFallbackLineSpacingEnabled();
                                                            i16 = isFallbackLineSpacingEnabled;
                                                        } else {
                                                            if (i25 >= 28) {
                                                                i16 = 1;
                                                            }
                                                            i16 = i10;
                                                        }
                                                        if (i16 != 0) {
                                                        }
                                                    }
                                                    PxuCJdSBwIXG = li2.PxuCJdSBwIXG(i12 != 0 ? i10 : (int) (j3 >> c), i13 != 0 ? i10 : (int) (j3 & j));
                                                } else {
                                                    PxuCJdSBwIXG = li2.lS5Rgt96tfkO;
                                                    c = ' ';
                                                    j = 4294967295L;
                                                    i14 = 1;
                                                    i15 = 33;
                                                }
                                                if (q11VarArr != null) {
                                                    int length2 = q11VarArr.length;
                                                    int i26 = i10;
                                                    int i27 = i26;
                                                    for (int i28 = i27; i28 < length2; i28++) {
                                                        q11 q11Var3 = q11VarArr[i28];
                                                        int i29 = q11Var3.XL4ISE6Oc65B;
                                                        i26 = i29 < 0 ? Math.max(i26, Math.abs(i29)) : i26;
                                                        int i30 = q11Var3.RfyTYNmI9Srp;
                                                        if (i30 < 0) {
                                                            i27 = Math.max(i26, Math.abs(i30));
                                                        }
                                                    }
                                                    j2 = (i26 == 0 && i27 == 0) ? li2.lS5Rgt96tfkO : li2.PxuCJdSBwIXG(i26, i27);
                                                } else {
                                                    j2 = li2.lS5Rgt96tfkO;
                                                }
                                                this.rtx2ld2ELZv4 = Math.max((int) (PxuCJdSBwIXG >> c), (int) (j2 >> c));
                                                this.OPXfSBeufaJ8 = Math.max((int) (PxuCJdSBwIXG & j), (int) (j2 & j));
                                                TextPaint textPaint2 = this.PxuCJdSBwIXG;
                                                q11[] q11VarArr2 = this.QrzZRwfaDlRX;
                                                i17 = this.RAsUl2FVSrh6 - i14;
                                                layout = this.a92UlCVFR9N8;
                                                if (layout.getLineStart(i17) == layout.getLineEnd(i17) || q11VarArr2 == null || q11VarArr2.length == 0) {
                                                    i18 = i10;
                                                    fontMetricsInt = null;
                                                } else {
                                                    SpannableString spannableString = new SpannableString("\u200b");
                                                    q11 q11Var4 = (q11) na.iSxsmagYqzHM(q11VarArr2);
                                                    spannableString.setSpan(new q11(q11Var4.rtx2ld2ELZv4, spannableString.length(), (i17 == 0 || !q11Var4.dgRBjINgWbAK) ? q11Var4.dgRBjINgWbAK : i10, q11Var4.dgRBjINgWbAK, q11Var4.x50lh2ztY7Y5, q11Var4.cpQdD2nAriOS), i10, spannableString.length(), i15);
                                                    i18 = i10;
                                                    StaticLayout EcgxDIVH5in82 = xi0.EcgxDIVH5in8(spannableString, textPaint2, Integer.MAX_VALUE, spannableString.length(), textDirectionHeuristic, aw0.PxuCJdSBwIXG, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 0, this.TSizfFm2Yiuu, 0, 0, 0, 0);
                                                    fontMetricsInt = new Paint.FontMetricsInt();
                                                    fontMetricsInt.ascent = EcgxDIVH5in82.getLineAscent(i18);
                                                    fontMetricsInt.descent = EcgxDIVH5in82.getLineDescent(i18);
                                                    fontMetricsInt.top = EcgxDIVH5in82.getLineTop(i18);
                                                    fontMetricsInt.bottom = EcgxDIVH5in82.getLineBottom(i18);
                                                }
                                                this.r3s1LDPKFs1S = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (e9gEMXR7LXtO(i20) - rtx2ld2ELZv4(i20))) : i18;
                                                this.cpQdD2nAriOS = fontMetricsInt;
                                                Layout layout2 = this.a92UlCVFR9N8;
                                                this.wdg6QnbFHrFF = xi0.jyegZNwi31qc(layout2, i20, layout2.getPaint());
                                                Layout layout3 = this.a92UlCVFR9N8;
                                                this.dgRBjINgWbAK = xi0.aF05bpZJlKEP(layout3, i20, layout3.getPaint());
                                            }
                                        }
                                    }
                                    i13 = i10;
                                    if (i12 != 0) {
                                    }
                                    long j32 = li2.lS5Rgt96tfkO;
                                    if (z) {
                                    }
                                    PxuCJdSBwIXG = li2.PxuCJdSBwIXG(i12 != 0 ? i10 : (int) (j32 >> c), i13 != 0 ? i10 : (int) (j32 & j));
                                    if (q11VarArr != null) {
                                    }
                                    this.rtx2ld2ELZv4 = Math.max((int) (PxuCJdSBwIXG >> c), (int) (j2 >> c));
                                    this.OPXfSBeufaJ8 = Math.max((int) (PxuCJdSBwIXG & j), (int) (j2 & j));
                                    TextPaint textPaint22 = this.PxuCJdSBwIXG;
                                    q11[] q11VarArr22 = this.QrzZRwfaDlRX;
                                    i17 = this.RAsUl2FVSrh6 - i14;
                                    layout = this.a92UlCVFR9N8;
                                    if (layout.getLineStart(i17) == layout.getLineEnd(i17)) {
                                    }
                                    i18 = i10;
                                    fontMetricsInt = null;
                                    this.r3s1LDPKFs1S = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (e9gEMXR7LXtO(i20) - rtx2ld2ELZv4(i20))) : i18;
                                    this.cpQdD2nAriOS = fontMetricsInt;
                                    Layout layout22 = this.a92UlCVFR9N8;
                                    this.wdg6QnbFHrFF = xi0.jyegZNwi31qc(layout22, i20, layout22.getPaint());
                                    Layout layout32 = this.a92UlCVFR9N8;
                                    this.dgRBjINgWbAK = xi0.aF05bpZJlKEP(layout32, i20, layout32.getPaint());
                                }
                            } else {
                                i11 = 2;
                            }
                            i19 = i10;
                            i12 = i19;
                            if (q11VarArr != null) {
                            }
                            i13 = i10;
                            if (i12 != 0) {
                            }
                            long j322 = li2.lS5Rgt96tfkO;
                            if (z) {
                            }
                            PxuCJdSBwIXG = li2.PxuCJdSBwIXG(i12 != 0 ? i10 : (int) (j322 >> c), i13 != 0 ? i10 : (int) (j322 & j));
                            if (q11VarArr != null) {
                            }
                            this.rtx2ld2ELZv4 = Math.max((int) (PxuCJdSBwIXG >> c), (int) (j2 >> c));
                            this.OPXfSBeufaJ8 = Math.max((int) (PxuCJdSBwIXG & j), (int) (j2 & j));
                            TextPaint textPaint222 = this.PxuCJdSBwIXG;
                            q11[] q11VarArr222 = this.QrzZRwfaDlRX;
                            i17 = this.RAsUl2FVSrh6 - i14;
                            layout = this.a92UlCVFR9N8;
                            if (layout.getLineStart(i17) == layout.getLineEnd(i17)) {
                            }
                            i18 = i10;
                            fontMetricsInt = null;
                            this.r3s1LDPKFs1S = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (e9gEMXR7LXtO(i20) - rtx2ld2ELZv4(i20))) : i18;
                            this.cpQdD2nAriOS = fontMetricsInt;
                            Layout layout222 = this.a92UlCVFR9N8;
                            this.wdg6QnbFHrFF = xi0.jyegZNwi31qc(layout222, i20, layout222.getPaint());
                            Layout layout322 = this.a92UlCVFR9N8;
                            this.dgRBjINgWbAK = xi0.aF05bpZJlKEP(layout322, i20, layout322.getPaint());
                        }
                    }
                    i11 = 2;
                    i12 = i10;
                    if (q11VarArr != null) {
                    }
                    i13 = i10;
                    if (i12 != 0) {
                    }
                    long j3222 = li2.lS5Rgt96tfkO;
                    if (z) {
                    }
                    PxuCJdSBwIXG = li2.PxuCJdSBwIXG(i12 != 0 ? i10 : (int) (j3222 >> c), i13 != 0 ? i10 : (int) (j3222 & j));
                    if (q11VarArr != null) {
                    }
                    this.rtx2ld2ELZv4 = Math.max((int) (PxuCJdSBwIXG >> c), (int) (j2 >> c));
                    this.OPXfSBeufaJ8 = Math.max((int) (PxuCJdSBwIXG & j), (int) (j2 & j));
                    TextPaint textPaint2222 = this.PxuCJdSBwIXG;
                    q11[] q11VarArr2222 = this.QrzZRwfaDlRX;
                    i17 = this.RAsUl2FVSrh6 - i14;
                    layout = this.a92UlCVFR9N8;
                    if (layout.getLineStart(i17) == layout.getLineEnd(i17)) {
                    }
                    i18 = i10;
                    fontMetricsInt = null;
                    this.r3s1LDPKFs1S = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (e9gEMXR7LXtO(i20) - rtx2ld2ELZv4(i20))) : i18;
                    this.cpQdD2nAriOS = fontMetricsInt;
                    Layout layout2222 = this.a92UlCVFR9N8;
                    this.wdg6QnbFHrFF = xi0.jyegZNwi31qc(layout2222, i20, layout2222.getPaint());
                    Layout layout3222 = this.a92UlCVFR9N8;
                    this.dgRBjINgWbAK = xi0.aF05bpZJlKEP(layout3222, i20, layout3222.getPaint());
                }
            }
            q11VarArr = null;
            i10 = 0;
            this.QrzZRwfaDlRX = q11VarArr;
            if (q11VarArr != null) {
            }
            i11 = 2;
            i12 = i10;
            if (q11VarArr != null) {
            }
            i13 = i10;
            if (i12 != 0) {
            }
            long j32222 = li2.lS5Rgt96tfkO;
            if (z) {
            }
            PxuCJdSBwIXG = li2.PxuCJdSBwIXG(i12 != 0 ? i10 : (int) (j32222 >> c), i13 != 0 ? i10 : (int) (j32222 & j));
            if (q11VarArr != null) {
            }
            this.rtx2ld2ELZv4 = Math.max((int) (PxuCJdSBwIXG >> c), (int) (j2 >> c));
            this.OPXfSBeufaJ8 = Math.max((int) (PxuCJdSBwIXG & j), (int) (j2 & j));
            TextPaint textPaint22222 = this.PxuCJdSBwIXG;
            q11[] q11VarArr22222 = this.QrzZRwfaDlRX;
            i17 = this.RAsUl2FVSrh6 - i14;
            layout = this.a92UlCVFR9N8;
            if (layout.getLineStart(i17) == layout.getLineEnd(i17)) {
            }
            i18 = i10;
            fontMetricsInt = null;
            this.r3s1LDPKFs1S = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (e9gEMXR7LXtO(i20) - rtx2ld2ELZv4(i20))) : i18;
            this.cpQdD2nAriOS = fontMetricsInt;
            Layout layout22222 = this.a92UlCVFR9N8;
            this.wdg6QnbFHrFF = xi0.jyegZNwi31qc(layout22222, i20, layout22222.getPaint());
            Layout layout32222 = this.a92UlCVFR9N8;
            this.dgRBjINgWbAK = xi0.aF05bpZJlKEP(layout32222, i20, layout32222.getPaint());
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final float OPXfSBeufaJ8(int i, boolean z) {
        return lS5Rgt96tfkO(RAsUl2FVSrh6(i)) + TSizfFm2Yiuu().wdg6QnbFHrFF(i, true, z);
    }

    public final int PxuCJdSBwIXG() {
        boolean z = this.Y1f8riQaR6yg;
        Layout layout = this.a92UlCVFR9N8;
        return (z ? layout.getLineBottom(this.RAsUl2FVSrh6 - 1) : layout.getHeight()) + this.rtx2ld2ELZv4 + this.OPXfSBeufaJ8 + this.r3s1LDPKFs1S;
    }

    public final int RAsUl2FVSrh6(int i) {
        int i2 = this.RAsUl2FVSrh6;
        if (i2 <= 0) {
            return 0;
        }
        int lineForOffset = this.a92UlCVFR9N8.getLineForOffset(i);
        int i3 = i2 - 1;
        return lineForOffset > i3 ? i3 : lineForOffset;
    }

    public final xb TSizfFm2Yiuu() {
        xb xbVar = this.BRwzKIf41E4i;
        if (xbVar != null) {
            return xbVar;
        }
        xb xbVar2 = new xb(this.a92UlCVFR9N8);
        this.BRwzKIf41E4i = xbVar2;
        return xbVar2;
    }

    public final float Y1f8riQaR6yg(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.rtx2ld2ELZv4 + ((i != this.RAsUl2FVSrh6 + (-1) || (fontMetricsInt = this.cpQdD2nAriOS) == null) ? this.a92UlCVFR9N8.getLineBaseline(i) : rtx2ld2ELZv4(i) - fontMetricsInt.ascent);
    }

    public final int a92UlCVFR9N8(int i) {
        ThreadLocal threadLocal = li2.PxuCJdSBwIXG;
        Layout layout = this.a92UlCVFR9N8;
        return (layout.getEllipsisCount(i) <= 0 || this.lS5Rgt96tfkO != TextUtils.TruncateAt.END) ? layout.getLineEnd(i) : layout.getText().length();
    }

    public final tu2 dgRBjINgWbAK() {
        tu2 tu2Var = this.e9gEMXR7LXtO;
        if (tu2Var != null) {
            return tu2Var;
        }
        Layout layout = this.a92UlCVFR9N8;
        tu2 tu2Var2 = new tu2(layout.getText(), layout.getText().length(), this.PxuCJdSBwIXG.getTextLocale());
        this.e9gEMXR7LXtO = tu2Var2;
        return tu2Var2;
    }

    public final float e9gEMXR7LXtO(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        int i2 = this.RAsUl2FVSrh6;
        int i3 = i2 - 1;
        Layout layout = this.a92UlCVFR9N8;
        if (i != i3 || (fontMetricsInt = this.cpQdD2nAriOS) == null) {
            return this.rtx2ld2ELZv4 + layout.getLineBottom(i) + (i == i2 + (-1) ? this.OPXfSBeufaJ8 : 0);
        }
        return layout.getLineBottom(i - 1) + fontMetricsInt.bottom;
    }

    public final float lS5Rgt96tfkO(int i) {
        if (i == this.RAsUl2FVSrh6 - 1) {
            return this.wdg6QnbFHrFF + this.dgRBjINgWbAK;
        }
        return 0.0f;
    }

    public final float rtx2ld2ELZv4(int i) {
        return this.a92UlCVFR9N8.getLineTop(i) + (i == 0 ? 0 : this.rtx2ld2ELZv4);
    }

    public final float wdg6QnbFHrFF(int i, boolean z) {
        return lS5Rgt96tfkO(RAsUl2FVSrh6(i)) + TSizfFm2Yiuu().wdg6QnbFHrFF(i, false, z);
    }
}
