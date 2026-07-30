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

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class zv2 {
    public final TextPaint a;
    public final TextUtils.TruncateAt b;
    public final boolean c;
    public final boolean d;
    public sg e;
    public final Layout f;
    public final int g;
    public final int h;
    public final int i;
    public final float j;
    public final float k;
    public final boolean l;
    public final Paint.FontMetricsInt m;
    public final int n;
    public final vd1[] o;
    public final Rect p = new Rect();
    public fy q;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0246 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zv2(CharSequence charSequence, float f, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, x81 x81Var) {
        int i9;
        TextDirectionHeuristic textDirectionHeuristic;
        Layout c;
        char c2;
        boolean z2;
        int i10;
        int i11;
        long j;
        vd1[] vd1VarArr;
        long j2;
        int i12;
        Layout layout;
        int i13;
        boolean z3;
        this.a = textPaint;
        this.b = truncateAt;
        this.c = z;
        int length = charSequence.length();
        TextDirectionHeuristic a = ew2.a(i2);
        Layout.Alignment alignment = vt2.a;
        Layout.Alignment alignment2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? Layout.Alignment.ALIGN_NORMAL : vt2.b : vt2.a : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        boolean z4 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, on.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics a2 = x81Var.a();
            double d = f;
            int ceil = (int) Math.ceil(d);
            if (a2 == null || x81Var.c() > f || z4) {
                this.l = false;
                i9 = i3;
                textDirectionHeuristic = a;
                c = th2.c(charSequence, textPaint, ceil, charSequence.length(), textDirectionHeuristic, alignment2, i9, truncateAt, (int) Math.ceil(d), i8, z, i4, i5, i6, i7);
            } else {
                this.l = true;
                if (ceil < 0) {
                    i21.a("negative width");
                }
                if (ceil < 0) {
                    i21.a("negative ellipsized width");
                }
                c = Build.VERSION.SDK_INT >= 33 ? zo.a(charSequence, textPaint, ceil, alignment2, a2, z, truncateAt, ceil) : new BoringLayout(charSequence, textPaint, ceil, alignment2, 1.0f, 0.0f, a2, z, truncateAt, ceil);
                i9 = i3;
                textDirectionHeuristic = a;
            }
            this.f = c;
            Trace.endSection();
            int min = Math.min(c.getLineCount(), i9);
            this.g = min;
            int i14 = min - 1;
            this.d = min >= i9 && (c.getEllipsisCount(i14) > 0 || c.getLineEnd(i14) != charSequence.length());
            long j3 = ew2.b;
            long j4 = 4294967295L;
            if (z) {
                c2 = ' ';
                z2 = true;
                i10 = 33;
            } else if (this.l) {
                BoringLayout boringLayout = (BoringLayout) c;
                i10 = 33;
                if (Build.VERSION.SDK_INT >= 33) {
                    z3 = d2.f(boringLayout);
                    if (!z3) {
                        TextPaint paint = c.getPaint();
                        CharSequence text = c.getText();
                        i11 = 0;
                        Rect A = ap.A(paint, text, c.getLineStart(0), c.getLineEnd(0));
                        int lineAscent = c.getLineAscent(0);
                        c2 = ' ';
                        int i15 = A.top;
                        int topPadding = i15 < lineAscent ? lineAscent - i15 : c.getTopPadding();
                        z2 = true;
                        A = min != 1 ? ap.A(paint, text, c.getLineStart(i14), c.getLineEnd(i14)) : A;
                        int lineDescent = c.getLineDescent(i14);
                        int i16 = A.bottom;
                        int bottomPadding = i16 > lineDescent ? i16 - lineDescent : c.getBottomPadding();
                        if (topPadding != 0 || bottomPadding != 0) {
                            j = (bottomPadding & 4294967295L) | (topPadding << 32);
                            Paint.FontMetricsInt fontMetricsInt = null;
                            if (c.getText() instanceof Spanned) {
                                CharSequence text2 = c.getText();
                                text2.getClass();
                                if (mh2.k((Spanned) text2, vd1.class) || c.getText().length() <= 0) {
                                    CharSequence text3 = c.getText();
                                    text3.getClass();
                                    vd1VarArr = (vd1[]) ((Spanned) text3).getSpans(i11, c.getText().length(), vd1.class);
                                    this.o = vd1VarArr;
                                    if (vd1VarArr == null) {
                                        int length2 = vd1VarArr.length;
                                        int i17 = i11;
                                        int i18 = i17;
                                        int i19 = i18;
                                        while (i17 < length2) {
                                            boolean z5 = z2;
                                            vd1 vd1Var = vd1VarArr[i17];
                                            long j5 = j4;
                                            int i20 = vd1Var.w;
                                            i18 = i20 < 0 ? Math.max(i18, Math.abs(i20)) : i18;
                                            int i21 = vd1Var.x;
                                            if (i21 < 0) {
                                                i19 = Math.max(i18, Math.abs(i21));
                                            }
                                            i17++;
                                            j4 = j5;
                                            z2 = z5;
                                        }
                                        j2 = j4;
                                        j3 = (i18 == 0 && i19 == 0) ? ew2.b : (i18 << c2) | (i19 & j2);
                                    } else {
                                        j2 = 4294967295L;
                                    }
                                    this.h = Math.max((int) (j >> c2), (int) (j3 >> c2));
                                    this.i = Math.max((int) (j & j2), (int) (j3 & j2));
                                    TextPaint textPaint2 = this.a;
                                    vd1[] vd1VarArr2 = this.o;
                                    i12 = this.g - 1;
                                    layout = this.f;
                                    if (layout.getLineStart(i12) == layout.getLineEnd(i12) || vd1VarArr2 == null || vd1VarArr2.length == 0) {
                                        i13 = i11;
                                    } else {
                                        SpannableString spannableString = new SpannableString("\u200b");
                                        if (vd1VarArr2.length == 0) {
                                            ch2.k("Array is empty.");
                                            throw null;
                                        }
                                        vd1 vd1Var2 = vd1VarArr2[i11];
                                        spannableString.setSpan(new vd1(vd1Var2.m, spannableString.length(), (i12 == 0 || !vd1Var2.p) ? vd1Var2.p : i11, vd1Var2.p, vd1Var2.q, vd1Var2.r), i11, spannableString.length(), i10);
                                        i13 = i11;
                                        StaticLayout c3 = th2.c(spannableString, textPaint2, Integer.MAX_VALUE, spannableString.length(), textDirectionHeuristic, s81.a, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 0, this.c, 0, 0, 0, 0);
                                        fontMetricsInt = new Paint.FontMetricsInt();
                                        fontMetricsInt.ascent = c3.getLineAscent(i13);
                                        fontMetricsInt.descent = c3.getLineDescent(i13);
                                        fontMetricsInt.top = c3.getLineTop(i13);
                                        fontMetricsInt.bottom = c3.getLineBottom(i13);
                                    }
                                    this.n = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (e(i14) - g(i14))) : i13;
                                    this.m = fontMetricsInt;
                                    Layout layout2 = this.f;
                                    this.j = s03.u(layout2, i14, layout2.getPaint());
                                    Layout layout3 = this.f;
                                    this.k = s03.v(layout3, i14, layout3.getPaint());
                                }
                            }
                            vd1VarArr = null;
                            this.o = vd1VarArr;
                            if (vd1VarArr == null) {
                            }
                            this.h = Math.max((int) (j >> c2), (int) (j3 >> c2));
                            this.i = Math.max((int) (j & j2), (int) (j3 & j2));
                            TextPaint textPaint22 = this.a;
                            vd1[] vd1VarArr22 = this.o;
                            i12 = this.g - 1;
                            layout = this.f;
                            if (layout.getLineStart(i12) == layout.getLineEnd(i12)) {
                            }
                            i13 = i11;
                            this.n = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (e(i14) - g(i14))) : i13;
                            this.m = fontMetricsInt;
                            Layout layout22 = this.f;
                            this.j = s03.u(layout22, i14, layout22.getPaint());
                            Layout layout32 = this.f;
                            this.k = s03.v(layout32, i14, layout32.getPaint());
                        }
                        j = j3;
                        Paint.FontMetricsInt fontMetricsInt2 = null;
                        if (c.getText() instanceof Spanned) {
                        }
                        vd1VarArr = null;
                        this.o = vd1VarArr;
                        if (vd1VarArr == null) {
                        }
                        this.h = Math.max((int) (j >> c2), (int) (j3 >> c2));
                        this.i = Math.max((int) (j & j2), (int) (j3 & j2));
                        TextPaint textPaint222 = this.a;
                        vd1[] vd1VarArr222 = this.o;
                        i12 = this.g - 1;
                        layout = this.f;
                        if (layout.getLineStart(i12) == layout.getLineEnd(i12)) {
                        }
                        i13 = i11;
                        this.n = fontMetricsInt2 != null ? fontMetricsInt2.bottom - ((int) (e(i14) - g(i14))) : i13;
                        this.m = fontMetricsInt2;
                        Layout layout222 = this.f;
                        this.j = s03.u(layout222, i14, layout222.getPaint());
                        Layout layout322 = this.f;
                        this.k = s03.v(layout322, i14, layout322.getPaint());
                    }
                    c2 = ' ';
                    z2 = true;
                }
                z3 = false;
                if (!z3) {
                }
            } else {
                i10 = 33;
                StaticLayout staticLayout = (StaticLayout) c;
                int i22 = Build.VERSION.SDK_INT;
                if (i22 >= 33) {
                    z3 = d2.g(staticLayout);
                } else {
                    if (i22 >= 28) {
                        z3 = true;
                    }
                    z3 = false;
                }
                if (!z3) {
                }
            }
            i11 = 0;
            j = j3;
            Paint.FontMetricsInt fontMetricsInt22 = null;
            if (c.getText() instanceof Spanned) {
            }
            vd1VarArr = null;
            this.o = vd1VarArr;
            if (vd1VarArr == null) {
            }
            this.h = Math.max((int) (j >> c2), (int) (j3 >> c2));
            this.i = Math.max((int) (j & j2), (int) (j3 & j2));
            TextPaint textPaint2222 = this.a;
            vd1[] vd1VarArr2222 = this.o;
            i12 = this.g - 1;
            layout = this.f;
            if (layout.getLineStart(i12) == layout.getLineEnd(i12)) {
            }
            i13 = i11;
            this.n = fontMetricsInt22 != null ? fontMetricsInt22.bottom - ((int) (e(i14) - g(i14))) : i13;
            this.m = fontMetricsInt22;
            Layout layout2222 = this.f;
            this.j = s03.u(layout2222, i14, layout2222.getPaint());
            Layout layout3222 = this.f;
            this.k = s03.v(layout3222, i14, layout3222.getPaint());
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final int a() {
        boolean z = this.d;
        Layout layout = this.f;
        return (z ? layout.getLineBottom(this.g - 1) : layout.getHeight()) + this.h + this.i + this.n;
    }

    public final float b(int i) {
        if (i == this.g - 1) {
            return this.j + this.k;
        }
        return 0.0f;
    }

    public final fy c() {
        fy fyVar = this.q;
        if (fyVar != null) {
            return fyVar;
        }
        fy fyVar2 = new fy(this.f);
        this.q = fyVar2;
        return fyVar2;
    }

    public final float d(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.h + ((i != this.g + (-1) || (fontMetricsInt = this.m) == null) ? this.f.getLineBaseline(i) : g(i) - fontMetricsInt.ascent);
    }

    public final float e(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        int i2 = this.g;
        int i3 = i2 - 1;
        Layout layout = this.f;
        if (i != i3 || (fontMetricsInt = this.m) == null) {
            return this.h + layout.getLineBottom(i) + (i == i2 + (-1) ? this.i : 0);
        }
        return layout.getLineBottom(i - 1) + fontMetricsInt.bottom;
    }

    public final int f(int i) {
        wt2 wt2Var = ew2.a;
        Layout layout = this.f;
        return (layout.getEllipsisCount(i) <= 0 || this.b != TextUtils.TruncateAt.END) ? layout.getLineEnd(i) : layout.getText().length();
    }

    public final float g(int i) {
        return this.f.getLineTop(i) + (i == 0 ? 0 : this.h);
    }

    public final float h(int i, boolean z) {
        return b(this.f.getLineForOffset(i)) + c().i(i, true, z);
    }

    public final float i(int i, boolean z) {
        return b(this.f.getLineForOffset(i)) + c().i(i, false, z);
    }

    public final sg j() {
        sg sgVar = this.e;
        if (sgVar != null) {
            return sgVar;
        }
        Layout layout = this.f;
        sg sgVar2 = new sg(layout.getText(), layout.getText().length(), this.a.getTextLocale());
        this.e = sgVar2;
        return sgVar2;
    }
}
