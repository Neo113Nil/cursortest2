package b2;

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

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f1263a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1264b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1265c;

    /* renamed from: d, reason: collision with root package name */
    public c2.f f1266d;

    /* renamed from: e, reason: collision with root package name */
    public final Layout f1267e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1268f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1269g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1270h;

    /* renamed from: i, reason: collision with root package name */
    public final float f1271i;

    /* renamed from: j, reason: collision with root package name */
    public final float f1272j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f1273k;

    /* renamed from: l, reason: collision with root package name */
    public final Paint.FontMetricsInt f1274l;

    /* renamed from: m, reason: collision with root package name */
    public final int f1275m;

    /* renamed from: n, reason: collision with root package name */
    public final d2.h[] f1276n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f1277o = new Rect();

    /* renamed from: p, reason: collision with root package name */
    public a2.q f1278p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0271 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d0(CharSequence charSequence, float f9, TextPaint textPaint, int i7, TextUtils.TruncateAt truncateAt, int i8, boolean z8, int i9, int i10, int i11, int i12, int i13, int i14, r rVar) {
        char c4;
        int i15;
        int i16;
        TextDirectionHeuristic textDirectionHeuristic;
        u uVar;
        Layout a3;
        char c6;
        long j8;
        int i17;
        int i18;
        long j9;
        d2.h[] hVarArr;
        int i19;
        Layout layout;
        int i20;
        Paint.FontMetricsInt fontMetricsInt;
        int i21;
        u uVar2;
        Layout a9;
        this.f1263a = textPaint;
        this.f1264b = z8;
        int length = charSequence.length();
        TextDirectionHeuristic a10 = e0.a(i8);
        Layout.Alignment alignment = b0.f1259a;
        Layout.Alignment alignment2 = i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? Layout.Alignment.ALIGN_NORMAL : b0.f1260b : b0.f1259a : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        boolean z9 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, d2.a.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics a11 = rVar.a();
            double d8 = f9;
            int ceil = (int) Math.ceil(d8);
            u uVar3 = y.f1304a;
            if (a11 == null || rVar.b() > f9 || z9) {
                c4 = true;
                i15 = 0;
                this.f1273k = false;
                i16 = i9;
                textDirectionHeuristic = a10;
                uVar = uVar3;
                a3 = uVar.a(new a0(charSequence, charSequence.length(), textPaint, ceil, textDirectionHeuristic, alignment2, i16, truncateAt, (int) Math.ceil(d8), i14, z8, i10, i11, i12, i13));
            } else {
                this.f1273k = true;
                if (ceil < 0) {
                    throw new IllegalArgumentException("negative width");
                }
                if (ceil < 0) {
                    throw new IllegalArgumentException("negative ellipsized width");
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    uVar2 = uVar3;
                    i15 = 0;
                    a9 = d.a(charSequence, textPaint, ceil, alignment2, 1.0f, 0.0f, a11, z8, true, truncateAt, ceil);
                    c4 = true;
                } else {
                    c4 = true;
                    uVar2 = uVar3;
                    i15 = 0;
                    a9 = e.a(charSequence, textPaint, ceil, alignment2, 1.0f, 0.0f, a11, z8, truncateAt, ceil);
                }
                i16 = i9;
                a3 = a9;
                textDirectionHeuristic = a10;
                uVar = uVar2;
            }
            this.f1267e = a3;
            Trace.endSection();
            int min = Math.min(a3.getLineCount(), i16);
            this.f1268f = min;
            int i22 = min - 1;
            this.f1265c = (min >= i16 && (a3.getEllipsisCount(i22) > 0 || a3.getLineEnd(i22) != charSequence.length())) ? 1 : i15;
            long j10 = e0.f1280b;
            if (z8) {
                c6 = ' ';
                j8 = 4294967295L;
                i17 = 33;
            } else if (this.f1273k) {
                BoringLayout boringLayout = (BoringLayout) a3;
                i17 = 33;
                if (Build.VERSION.SDK_INT >= 33) {
                    i21 = d.c(boringLayout);
                    if (i21 == 0) {
                        TextPaint paint = a3.getPaint();
                        CharSequence text = a3.getText();
                        c6 = ' ';
                        Rect a12 = y.a(paint, text, a3.getLineStart(i15), a3.getLineEnd(i15));
                        int lineAscent = a3.getLineAscent(i15);
                        j8 = 4294967295L;
                        int i23 = a12.top;
                        int topPadding = i23 < lineAscent ? lineAscent - i23 : a3.getTopPadding();
                        a12 = min != 1 ? y.a(paint, text, a3.getLineStart(i22), a3.getLineEnd(i22)) : a12;
                        int lineDescent = a3.getLineDescent(i22);
                        int i24 = a12.bottom;
                        int bottomPadding = i24 > lineDescent ? i24 - lineDescent : a3.getBottomPadding();
                        if (topPadding == 0 && bottomPadding == 0) {
                            i18 = 1;
                            j9 = j10;
                            if (a3.getText() instanceof Spanned) {
                            }
                            hVarArr = null;
                            this.f1276n = hVarArr;
                            if (hVarArr != null) {
                            }
                            this.f1269g = Math.max((int) (j9 >> c6), (int) (j10 >> c6));
                            this.f1270h = Math.max((int) (j9 & j8), (int) (j10 & j8));
                            TextPaint textPaint2 = this.f1263a;
                            d2.h[] hVarArr2 = this.f1276n;
                            i19 = this.f1268f - 1;
                            layout = this.f1267e;
                            if (layout.getLineStart(i19) == layout.getLineEnd(i19)) {
                            }
                            i20 = i22;
                            fontMetricsInt = null;
                            this.f1275m = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (e(i20) - g(i20))) : i15;
                            this.f1274l = fontMetricsInt;
                            Layout layout2 = this.f1267e;
                            this.f1271i = t6.a.C(layout2, i20, layout2.getPaint());
                            Layout layout3 = this.f1267e;
                            this.f1272j = t6.a.D(layout3, i20, layout3.getPaint());
                        }
                        i18 = 1;
                        j9 = (topPadding << 32) | (bottomPadding & 4294967295L);
                        if (a3.getText() instanceof Spanned) {
                            CharSequence text2 = a3.getText();
                            r6.k.d(text2, "null cannot be cast to non-null type android.text.Spanned");
                            Spanned spanned = (Spanned) text2;
                            if ((spanned.nextSpanTransition(-1, spanned.length(), d2.h.class) != spanned.length() ? i18 : i15) != 0 || a3.getText().length() <= 0) {
                                CharSequence text3 = a3.getText();
                                r6.k.d(text3, "null cannot be cast to non-null type android.text.Spanned");
                                hVarArr = (d2.h[]) ((Spanned) text3).getSpans(i15, a3.getText().length(), d2.h.class);
                                this.f1276n = hVarArr;
                                if (hVarArr != null) {
                                    int length2 = hVarArr.length;
                                    int i25 = i15;
                                    int i26 = i25;
                                    int i27 = i26;
                                    while (i25 < length2) {
                                        d2.h hVar = hVarArr[i25];
                                        int i28 = hVar.f2581o;
                                        i26 = i28 < 0 ? Math.max(i26, Math.abs(i28)) : i26;
                                        int i29 = hVar.f2582p;
                                        if (i29 < 0) {
                                            i27 = Math.max(i26, Math.abs(i29));
                                        }
                                        i25++;
                                    }
                                    j10 = (i26 == 0 && i27 == 0) ? e0.f1280b : (i27 & j8) | (i26 << c6);
                                }
                                this.f1269g = Math.max((int) (j9 >> c6), (int) (j10 >> c6));
                                this.f1270h = Math.max((int) (j9 & j8), (int) (j10 & j8));
                                TextPaint textPaint22 = this.f1263a;
                                d2.h[] hVarArr22 = this.f1276n;
                                i19 = this.f1268f - 1;
                                layout = this.f1267e;
                                if (layout.getLineStart(i19) == layout.getLineEnd(i19) || hVarArr22 == null || hVarArr22.length == 0) {
                                    i20 = i22;
                                    fontMetricsInt = null;
                                } else {
                                    SpannableString spannableString = new SpannableString("\u200b");
                                    if (hVarArr22.length == 0) {
                                        throw new NoSuchElementException("Array is empty.");
                                    }
                                    d2.h hVar2 = hVarArr22[i15];
                                    spannableString.setSpan(new d2.h(hVar2.f2572f, spannableString.length(), (i19 == 0 || !hVar2.f2575i) ? hVar2.f2575i : i15, hVar2.f2575i, hVar2.f2576j), i15, spannableString.length(), i17);
                                    i20 = i22;
                                    StaticLayout a13 = uVar.a(new a0(spannableString, spannableString.length(), textPaint22, Integer.MAX_VALUE, textDirectionHeuristic, p.f1292a, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 0, this.f1264b, 0, 0, 0, 0));
                                    fontMetricsInt = new Paint.FontMetricsInt();
                                    fontMetricsInt.ascent = a13.getLineAscent(i15);
                                    fontMetricsInt.descent = a13.getLineDescent(i15);
                                    fontMetricsInt.top = a13.getLineTop(i15);
                                    fontMetricsInt.bottom = a13.getLineBottom(i15);
                                }
                                this.f1275m = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (e(i20) - g(i20))) : i15;
                                this.f1274l = fontMetricsInt;
                                Layout layout22 = this.f1267e;
                                this.f1271i = t6.a.C(layout22, i20, layout22.getPaint());
                                Layout layout32 = this.f1267e;
                                this.f1272j = t6.a.D(layout32, i20, layout32.getPaint());
                            }
                        }
                        hVarArr = null;
                        this.f1276n = hVarArr;
                        if (hVarArr != null) {
                        }
                        this.f1269g = Math.max((int) (j9 >> c6), (int) (j10 >> c6));
                        this.f1270h = Math.max((int) (j9 & j8), (int) (j10 & j8));
                        TextPaint textPaint222 = this.f1263a;
                        d2.h[] hVarArr222 = this.f1276n;
                        i19 = this.f1268f - 1;
                        layout = this.f1267e;
                        if (layout.getLineStart(i19) == layout.getLineEnd(i19)) {
                        }
                        i20 = i22;
                        fontMetricsInt = null;
                        this.f1275m = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (e(i20) - g(i20))) : i15;
                        this.f1274l = fontMetricsInt;
                        Layout layout222 = this.f1267e;
                        this.f1271i = t6.a.C(layout222, i20, layout222.getPaint());
                        Layout layout322 = this.f1267e;
                        this.f1272j = t6.a.D(layout322, i20, layout322.getPaint());
                    }
                    c6 = ' ';
                    j8 = 4294967295L;
                }
                i21 = i15;
                if (i21 == 0) {
                }
            } else {
                i17 = 33;
                StaticLayout staticLayout = (StaticLayout) a3;
                int i30 = Build.VERSION.SDK_INT;
                if (i30 >= 33) {
                    i21 = x.a(staticLayout);
                } else {
                    if (i30 >= 28) {
                        i21 = c4;
                    }
                    i21 = i15;
                }
                if (i21 == 0) {
                }
            }
            i18 = 1;
            j9 = j10;
            if (a3.getText() instanceof Spanned) {
            }
            hVarArr = null;
            this.f1276n = hVarArr;
            if (hVarArr != null) {
            }
            this.f1269g = Math.max((int) (j9 >> c6), (int) (j10 >> c6));
            this.f1270h = Math.max((int) (j9 & j8), (int) (j10 & j8));
            TextPaint textPaint2222 = this.f1263a;
            d2.h[] hVarArr2222 = this.f1276n;
            i19 = this.f1268f - 1;
            layout = this.f1267e;
            if (layout.getLineStart(i19) == layout.getLineEnd(i19)) {
            }
            i20 = i22;
            fontMetricsInt = null;
            this.f1275m = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (e(i20) - g(i20))) : i15;
            this.f1274l = fontMetricsInt;
            Layout layout2222 = this.f1267e;
            this.f1271i = t6.a.C(layout2222, i20, layout2222.getPaint());
            Layout layout3222 = this.f1267e;
            this.f1272j = t6.a.D(layout3222, i20, layout3222.getPaint());
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final int a() {
        boolean z8 = this.f1265c;
        Layout layout = this.f1267e;
        return (z8 ? layout.getLineBottom(this.f1268f - 1) : layout.getHeight()) + this.f1269g + this.f1270h + this.f1275m;
    }

    public final float b(int i7) {
        if (i7 == this.f1268f - 1) {
            return this.f1271i + this.f1272j;
        }
        return 0.0f;
    }

    public final a2.q c() {
        a2.q qVar = this.f1278p;
        if (qVar != null) {
            return qVar;
        }
        a2.q qVar2 = new a2.q(this.f1267e);
        this.f1278p = qVar2;
        return qVar2;
    }

    public final float d(int i7) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.f1269g + ((i7 != this.f1268f + (-1) || (fontMetricsInt = this.f1274l) == null) ? this.f1267e.getLineBaseline(i7) : g(i7) - fontMetricsInt.ascent);
    }

    public final float e(int i7) {
        Paint.FontMetricsInt fontMetricsInt;
        int i8 = this.f1268f;
        int i9 = i8 - 1;
        Layout layout = this.f1267e;
        if (i7 != i9 || (fontMetricsInt = this.f1274l) == null) {
            return this.f1269g + layout.getLineBottom(i7) + (i7 == i8 + (-1) ? this.f1270h : 0);
        }
        return layout.getLineBottom(i7 - 1) + fontMetricsInt.bottom;
    }

    public final int f(int i7) {
        Layout layout = this.f1267e;
        return layout.getEllipsisStart(i7) == 0 ? layout.getLineEnd(i7) : layout.getText().length();
    }

    public final float g(int i7) {
        return this.f1267e.getLineTop(i7) + (i7 == 0 ? 0 : this.f1269g);
    }

    public final float h(int i7, boolean z8) {
        return b(this.f1267e.getLineForOffset(i7)) + c().f(i7, true, z8);
    }

    public final float i(int i7, boolean z8) {
        return b(this.f1267e.getLineForOffset(i7)) + c().f(i7, false, z8);
    }

    public final c2.f j() {
        c2.f fVar = this.f1266d;
        if (fVar != null) {
            return fVar;
        }
        Layout layout = this.f1267e;
        c2.f fVar2 = new c2.f(layout.getText(), layout.getText().length(), this.f1263a.getTextLocale());
        this.f1266d = fVar2;
        return fVar2;
    }
}
