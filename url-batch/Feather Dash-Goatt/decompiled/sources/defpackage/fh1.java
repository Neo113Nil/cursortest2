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
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class fh1 {
    public final TextPaint a;
    public final TextUtils.TruncateAt b;
    public final boolean c;
    public final boolean d;
    public final Layout e;
    public final int f;
    public final int g;
    public final int h;
    public final float i;
    public final float j;
    public final boolean k;
    public final Paint.FontMetricsInt l;
    public final int m;
    public final kh0[] n;
    public final Rect o = new Rect();
    public mc p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0289 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x031b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fh1(CharSequence charSequence, float f, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, yc0 yc0Var) {
        int i9;
        TextDirectionHeuristic textDirectionHeuristic;
        Layout g;
        kh0[] kh0VarArr;
        int i10;
        int i11;
        int i12;
        int i13;
        char c;
        long j;
        int i14;
        int i15;
        long a;
        int i16;
        boolean isFallbackLineSpacingEnabled;
        boolean isFallbackLineSpacingEnabled2;
        long j2;
        int i17;
        Layout layout;
        int i18;
        Paint.FontMetricsInt fontMetricsInt;
        int i19;
        this.a = textPaint;
        this.b = truncateAt;
        this.c = z;
        int length = charSequence.length();
        TextDirectionHeuristic b = ih1.b(i2);
        Layout.Alignment alignment = ug1.a;
        Layout.Alignment alignment2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? Layout.Alignment.ALIGN_NORMAL : ug1.b : ug1.a : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        boolean z2 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, bd.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics a2 = yc0Var.a();
            double d = f;
            int ceil = (int) Math.ceil(d);
            if (a2 == null || yc0Var.c() > f || z2) {
                this.k = false;
                i9 = i3;
                textDirectionHeuristic = b;
                g = t90.g(charSequence, textPaint, ceil, charSequence.length(), textDirectionHeuristic, alignment2, i9, truncateAt, (int) Math.ceil(d), i8, z, i4, i5, i6, i7);
            } else {
                this.k = true;
                if (ceil < 0) {
                    p80.a("negative width");
                }
                if (ceil < 0) {
                    p80.a("negative ellipsized width");
                }
                g = Build.VERSION.SDK_INT >= 33 ? l1.e(charSequence, textPaint, ceil, alignment2, a2, z, truncateAt, ceil) : new BoringLayout(charSequence, textPaint, ceil, alignment2, 1.0f, 0.0f, a2, z, truncateAt, ceil);
                i9 = i3;
                textDirectionHeuristic = b;
            }
            this.e = g;
            Trace.endSection();
            int min = Math.min(g.getLineCount(), i9);
            this.f = min;
            int i20 = min - 1;
            this.d = min >= i9 && (g.getEllipsisCount(i20) > 0 || g.getLineEnd(i20) != charSequence.length());
            if (g.getText() instanceof Spanned) {
                CharSequence text = g.getText();
                text.getClass();
                if (xa0.o((Spanned) text, kh0.class) || g.getText().length() <= 0) {
                    CharSequence text2 = g.getText();
                    text2.getClass();
                    i10 = 0;
                    kh0VarArr = (kh0[]) ((Spanned) text2).getSpans(0, g.getText().length(), kh0.class);
                    this.n = kh0VarArr;
                    if (kh0VarArr != null) {
                        kh0 kh0Var = kh0VarArr.length == 0 ? null : kh0VarArr[i10];
                        if (kh0Var != null) {
                            if (kh0Var.g) {
                                i11 = 2;
                                if (kh0Var.j == 2) {
                                    i19 = 1;
                                    i12 = i19;
                                    if (kh0VarArr != null) {
                                        kh0 kh0Var2 = kh0VarArr.length == 0 ? null : kh0VarArr[i10];
                                        if (kh0Var2 != null && kh0Var2.h && kh0Var2.j == i11) {
                                            i13 = 1;
                                            if (i12 != 0 || i13 == 0) {
                                                long j3 = ih1.b;
                                                if (z) {
                                                    c = ' ';
                                                    j = 4294967295L;
                                                    i14 = 1;
                                                    i15 = 33;
                                                } else {
                                                    if (this.k) {
                                                        BoringLayout boringLayout = (BoringLayout) g;
                                                        i15 = 33;
                                                        if (Build.VERSION.SDK_INT >= 33) {
                                                            isFallbackLineSpacingEnabled2 = boringLayout.isFallbackLineSpacingEnabled();
                                                            i16 = isFallbackLineSpacingEnabled2;
                                                        } else {
                                                            i16 = i10;
                                                        }
                                                    } else {
                                                        i15 = 33;
                                                        StaticLayout staticLayout = (StaticLayout) g;
                                                        if (Build.VERSION.SDK_INT >= 33) {
                                                            isFallbackLineSpacingEnabled = staticLayout.isFallbackLineSpacingEnabled();
                                                            i16 = isFallbackLineSpacingEnabled;
                                                        } else {
                                                            i16 = 1;
                                                        }
                                                    }
                                                    if (i16 != 0) {
                                                        c = ' ';
                                                        j = 4294967295L;
                                                        i14 = 1;
                                                    } else {
                                                        TextPaint paint = g.getPaint();
                                                        CharSequence text3 = g.getText();
                                                        c = ' ';
                                                        Rect v = gb0.v(paint, text3, g.getLineStart(i10), g.getLineEnd(i10));
                                                        int lineAscent = g.getLineAscent(i10);
                                                        j = 4294967295L;
                                                        int i21 = v.top;
                                                        int topPadding = i21 < lineAscent ? lineAscent - i21 : g.getTopPadding();
                                                        i14 = 1;
                                                        v = min != 1 ? gb0.v(paint, text3, g.getLineStart(i20), g.getLineEnd(i20)) : v;
                                                        int lineDescent = g.getLineDescent(i20);
                                                        int i22 = v.bottom;
                                                        int bottomPadding = i22 > lineDescent ? i22 - lineDescent : g.getBottomPadding();
                                                        if (topPadding != 0 || bottomPadding != 0) {
                                                            j3 = ih1.a(topPadding, bottomPadding);
                                                        }
                                                    }
                                                }
                                                a = ih1.a(i12 != 0 ? i10 : (int) (j3 >> c), i13 != 0 ? i10 : (int) (j3 & j));
                                            } else {
                                                a = ih1.b;
                                                c = ' ';
                                                j = 4294967295L;
                                                i14 = 1;
                                                i15 = 33;
                                            }
                                            if (kh0VarArr != null) {
                                                int length2 = kh0VarArr.length;
                                                int i23 = i10;
                                                int i24 = i23;
                                                for (int i25 = i24; i25 < length2; i25++) {
                                                    kh0 kh0Var3 = kh0VarArr[i25];
                                                    int i26 = kh0Var3.o;
                                                    i23 = i26 < 0 ? Math.max(i23, Math.abs(i26)) : i23;
                                                    int i27 = kh0Var3.p;
                                                    if (i27 < 0) {
                                                        i24 = Math.max(i23, Math.abs(i27));
                                                    }
                                                }
                                                j2 = (i23 == 0 && i24 == 0) ? ih1.b : ih1.a(i23, i24);
                                            } else {
                                                j2 = ih1.b;
                                            }
                                            this.g = Math.max((int) (a >> c), (int) (j2 >> c));
                                            this.h = Math.max((int) (a & j), (int) (j2 & j));
                                            TextPaint textPaint2 = this.a;
                                            kh0[] kh0VarArr2 = this.n;
                                            i17 = this.f - i14;
                                            layout = this.e;
                                            if (layout.getLineStart(i17) == layout.getLineEnd(i17) || kh0VarArr2 == null || kh0VarArr2.length == 0) {
                                                i18 = i10;
                                                fontMetricsInt = null;
                                            } else {
                                                SpannableString spannableString = new SpannableString("\u200b");
                                                if (kh0VarArr2.length == 0) {
                                                    throw new NoSuchElementException("Array is empty.");
                                                }
                                                kh0 kh0Var4 = kh0VarArr2[i10];
                                                spannableString.setSpan(new kh0(kh0Var4.d, spannableString.length(), (i17 == 0 || !kh0Var4.h) ? kh0Var4.h : i10, kh0Var4.h, kh0Var4.i, kh0Var4.j), i10, spannableString.length(), i15);
                                                i18 = i10;
                                                StaticLayout g2 = t90.g(spannableString, textPaint2, Integer.MAX_VALUE, spannableString.length(), textDirectionHeuristic, tc0.a, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 0, this.c, 0, 0, 0, 0);
                                                fontMetricsInt = new Paint.FontMetricsInt();
                                                fontMetricsInt.ascent = g2.getLineAscent(i18);
                                                fontMetricsInt.descent = g2.getLineDescent(i18);
                                                fontMetricsInt.top = g2.getLineTop(i18);
                                                fontMetricsInt.bottom = g2.getLineBottom(i18);
                                            }
                                            this.m = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (d(i20) - f(i20))) : i18;
                                            this.l = fontMetricsInt;
                                            Layout layout2 = this.e;
                                            this.i = m90.x(layout2, i20, layout2.getPaint());
                                            Layout layout3 = this.e;
                                            this.j = m90.y(layout3, i20, layout3.getPaint());
                                        }
                                    }
                                    i13 = i10;
                                    if (i12 != 0) {
                                    }
                                    long j32 = ih1.b;
                                    if (z) {
                                    }
                                    a = ih1.a(i12 != 0 ? i10 : (int) (j32 >> c), i13 != 0 ? i10 : (int) (j32 & j));
                                    if (kh0VarArr != null) {
                                    }
                                    this.g = Math.max((int) (a >> c), (int) (j2 >> c));
                                    this.h = Math.max((int) (a & j), (int) (j2 & j));
                                    TextPaint textPaint22 = this.a;
                                    kh0[] kh0VarArr22 = this.n;
                                    i17 = this.f - i14;
                                    layout = this.e;
                                    if (layout.getLineStart(i17) == layout.getLineEnd(i17)) {
                                    }
                                    i18 = i10;
                                    fontMetricsInt = null;
                                    this.m = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (d(i20) - f(i20))) : i18;
                                    this.l = fontMetricsInt;
                                    Layout layout22 = this.e;
                                    this.i = m90.x(layout22, i20, layout22.getPaint());
                                    Layout layout32 = this.e;
                                    this.j = m90.y(layout32, i20, layout32.getPaint());
                                }
                            } else {
                                i11 = 2;
                            }
                            i19 = i10;
                            i12 = i19;
                            if (kh0VarArr != null) {
                            }
                            i13 = i10;
                            if (i12 != 0) {
                            }
                            long j322 = ih1.b;
                            if (z) {
                            }
                            a = ih1.a(i12 != 0 ? i10 : (int) (j322 >> c), i13 != 0 ? i10 : (int) (j322 & j));
                            if (kh0VarArr != null) {
                            }
                            this.g = Math.max((int) (a >> c), (int) (j2 >> c));
                            this.h = Math.max((int) (a & j), (int) (j2 & j));
                            TextPaint textPaint222 = this.a;
                            kh0[] kh0VarArr222 = this.n;
                            i17 = this.f - i14;
                            layout = this.e;
                            if (layout.getLineStart(i17) == layout.getLineEnd(i17)) {
                            }
                            i18 = i10;
                            fontMetricsInt = null;
                            this.m = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (d(i20) - f(i20))) : i18;
                            this.l = fontMetricsInt;
                            Layout layout222 = this.e;
                            this.i = m90.x(layout222, i20, layout222.getPaint());
                            Layout layout322 = this.e;
                            this.j = m90.y(layout322, i20, layout322.getPaint());
                        }
                    }
                    i11 = 2;
                    i12 = i10;
                    if (kh0VarArr != null) {
                    }
                    i13 = i10;
                    if (i12 != 0) {
                    }
                    long j3222 = ih1.b;
                    if (z) {
                    }
                    a = ih1.a(i12 != 0 ? i10 : (int) (j3222 >> c), i13 != 0 ? i10 : (int) (j3222 & j));
                    if (kh0VarArr != null) {
                    }
                    this.g = Math.max((int) (a >> c), (int) (j2 >> c));
                    this.h = Math.max((int) (a & j), (int) (j2 & j));
                    TextPaint textPaint2222 = this.a;
                    kh0[] kh0VarArr2222 = this.n;
                    i17 = this.f - i14;
                    layout = this.e;
                    if (layout.getLineStart(i17) == layout.getLineEnd(i17)) {
                    }
                    i18 = i10;
                    fontMetricsInt = null;
                    this.m = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (d(i20) - f(i20))) : i18;
                    this.l = fontMetricsInt;
                    Layout layout2222 = this.e;
                    this.i = m90.x(layout2222, i20, layout2222.getPaint());
                    Layout layout3222 = this.e;
                    this.j = m90.y(layout3222, i20, layout3222.getPaint());
                }
            }
            kh0VarArr = null;
            i10 = 0;
            this.n = kh0VarArr;
            if (kh0VarArr != null) {
            }
            i11 = 2;
            i12 = i10;
            if (kh0VarArr != null) {
            }
            i13 = i10;
            if (i12 != 0) {
            }
            long j32222 = ih1.b;
            if (z) {
            }
            a = ih1.a(i12 != 0 ? i10 : (int) (j32222 >> c), i13 != 0 ? i10 : (int) (j32222 & j));
            if (kh0VarArr != null) {
            }
            this.g = Math.max((int) (a >> c), (int) (j2 >> c));
            this.h = Math.max((int) (a & j), (int) (j2 & j));
            TextPaint textPaint22222 = this.a;
            kh0[] kh0VarArr22222 = this.n;
            i17 = this.f - i14;
            layout = this.e;
            if (layout.getLineStart(i17) == layout.getLineEnd(i17)) {
            }
            i18 = i10;
            fontMetricsInt = null;
            this.m = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (d(i20) - f(i20))) : i18;
            this.l = fontMetricsInt;
            Layout layout22222 = this.e;
            this.i = m90.x(layout22222, i20, layout22222.getPaint());
            Layout layout32222 = this.e;
            this.j = m90.y(layout32222, i20, layout32222.getPaint());
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final int a() {
        boolean z = this.d;
        Layout layout = this.e;
        return (z ? layout.getLineBottom(this.f - 1) : layout.getHeight()) + this.g + this.h + this.m;
    }

    public final mc b() {
        mc mcVar = this.p;
        if (mcVar != null) {
            return mcVar;
        }
        mc mcVar2 = new mc(this.e);
        this.p = mcVar2;
        return mcVar2;
    }

    public final float c(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.g + ((i != this.f + (-1) || (fontMetricsInt = this.l) == null) ? this.e.getLineBaseline(i) : f(i) - fontMetricsInt.ascent);
    }

    public final float d(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        int i2 = this.f;
        int i3 = i2 - 1;
        Layout layout = this.e;
        if (i != i3 || (fontMetricsInt = this.l) == null) {
            return this.g + layout.getLineBottom(i) + (i == i2 + (-1) ? this.h : 0);
        }
        return layout.getLineBottom(i - 1) + fontMetricsInt.bottom;
    }

    public final int e(int i) {
        ThreadLocal threadLocal = ih1.a;
        Layout layout = this.e;
        return (layout.getEllipsisCount(i) <= 0 || this.b != TextUtils.TruncateAt.END) ? layout.getLineEnd(i) : layout.getText().length();
    }

    public final float f(int i) {
        return this.e.getLineTop(i) + (i == 0 ? 0 : this.g);
    }

    public final float g(int i, boolean z) {
        return (this.e.getLineForOffset(i) == this.f - 1 ? this.i + this.j : 0.0f) + b().k(i, true, z);
    }

    public final float h(int i, boolean z) {
        return (this.e.getLineForOffset(i) == this.f + (-1) ? this.i + this.j : 0.0f) + b().k(i, false, z);
    }
}
