package h2;

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
import g2.n;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f3103a;

    /* renamed from: b, reason: collision with root package name */
    public final TextUtils.TruncateAt f3104b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3105c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3106d;

    /* renamed from: e, reason: collision with root package name */
    public final Layout f3107e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3108f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3109g;

    /* renamed from: h, reason: collision with root package name */
    public final int f3110h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public final float f3111j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f3112k;

    /* renamed from: l, reason: collision with root package name */
    public final Paint.FontMetricsInt f3113l;

    /* renamed from: m, reason: collision with root package name */
    public final int f3114m;

    /* renamed from: n, reason: collision with root package name */
    public final i2.h[] f3115n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f3116o = new Rect();

    /* renamed from: p, reason: collision with root package name */
    public n f3117p;

    /* JADX WARN: Removed duplicated region for block: B:101:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x023c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j(CharSequence charSequence, float f6, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i8, boolean z3, int i9, int i10, int i11, int i12, int i13, int i14, e eVar) {
        int i15;
        TextDirectionHeuristic textDirectionHeuristic;
        int i16;
        Layout a8;
        long j7;
        i2.h[] hVarArr;
        char c8;
        int i17;
        Layout layout;
        int i18;
        boolean z7;
        this.f3103a = textPaint;
        this.f3104b = truncateAt;
        this.f3105c = z3;
        int length = charSequence.length();
        TextDirectionHeuristic a9 = k.a(i8);
        Layout.Alignment alignment = h.f3100a;
        Layout.Alignment alignment2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? Layout.Alignment.ALIGN_NORMAL : h.f3101b : h.f3100a : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        boolean z8 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, i2.a.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics a10 = eVar.a();
            double d8 = f6;
            int ceil = (int) Math.ceil(d8);
            if (a10 == null || eVar.c() > f6 || z8) {
                this.f3112k = false;
                i15 = i9;
                textDirectionHeuristic = a9;
                i16 = 33;
                a8 = g.a(charSequence, textPaint, ceil, charSequence.length(), textDirectionHeuristic, alignment2, i15, truncateAt, (int) Math.ceil(d8), i14, z3, i10, i11, i12, i13);
            } else {
                this.f3112k = true;
                if (ceil < 0) {
                    l2.a.a("negative width");
                }
                if (ceil < 0) {
                    l2.a.a("negative ellipsized width");
                }
                a8 = Build.VERSION.SDK_INT >= 33 ? b.b.f(charSequence, textPaint, ceil, alignment2, a10, z3, truncateAt, ceil) : new BoringLayout(charSequence, textPaint, ceil, alignment2, 1.0f, 0.0f, a10, z3, truncateAt, ceil);
                i15 = i9;
                textDirectionHeuristic = a9;
                i16 = 33;
            }
            this.f3107e = a8;
            Trace.endSection();
            int min = Math.min(a8.getLineCount(), i15);
            this.f3108f = min;
            int i19 = min - 1;
            this.f3106d = min >= i15 && (a8.getEllipsisCount(i19) > 0 || a8.getLineEnd(i19) != charSequence.length());
            long j8 = k.f3119b;
            char c9 = ' ';
            if (!z3) {
                if (this.f3112k) {
                    BoringLayout boringLayout = (BoringLayout) a8;
                    if (Build.VERSION.SDK_INT >= i16) {
                        z7 = boringLayout.isFallbackLineSpacingEnabled();
                        if (!z7) {
                            TextPaint paint = a8.getPaint();
                            CharSequence text = a8.getText();
                            Rect b8 = g.b(paint, text, a8.getLineStart(0), a8.getLineEnd(0));
                            int lineAscent = a8.getLineAscent(0);
                            int i20 = b8.top;
                            int topPadding = i20 < lineAscent ? lineAscent - i20 : a8.getTopPadding();
                            b8 = min != 1 ? g.b(paint, text, a8.getLineStart(i19), a8.getLineEnd(i19)) : b8;
                            int lineDescent = a8.getLineDescent(i19);
                            int i21 = b8.bottom;
                            int bottomPadding = i21 > lineDescent ? i21 - lineDescent : a8.getBottomPadding();
                            j7 = (topPadding == 0 && bottomPadding == 0) ? j7 : (topPadding << 32) | (bottomPadding & 4294967295L);
                        }
                    }
                    z7 = false;
                    if (!z7) {
                    }
                } else {
                    StaticLayout staticLayout = (StaticLayout) a8;
                    int i22 = Build.VERSION.SDK_INT;
                    if (i22 >= i16) {
                        z7 = staticLayout.isFallbackLineSpacingEnabled();
                    } else {
                        if (i22 >= 28) {
                            z7 = true;
                        }
                        z7 = false;
                    }
                    if (!z7) {
                    }
                }
                Paint.FontMetricsInt fontMetricsInt = null;
                if (a8.getText() instanceof Spanned) {
                    CharSequence text2 = a8.getText();
                    q6.i.c(text2, "null cannot be cast to non-null type android.text.Spanned");
                    if (g.c((Spanned) text2, i2.h.class) || a8.getText().length() <= 0) {
                        CharSequence text3 = a8.getText();
                        q6.i.c(text3, "null cannot be cast to non-null type android.text.Spanned");
                        hVarArr = (i2.h[]) ((Spanned) text3).getSpans(0, a8.getText().length(), i2.h.class);
                        this.f3115n = hVarArr;
                        if (hVarArr != null) {
                            int length2 = hVarArr.length;
                            int i23 = 0;
                            int i24 = 0;
                            int i25 = 0;
                            while (i25 < length2) {
                                i2.h hVar = hVarArr[i25];
                                char c10 = c9;
                                int i26 = hVar.f3407n;
                                i23 = i26 < 0 ? Math.max(i23, Math.abs(i26)) : i23;
                                int i27 = hVar.f3408o;
                                if (i27 < 0) {
                                    i24 = Math.max(i23, Math.abs(i27));
                                }
                                i25++;
                                c9 = c10;
                            }
                            c8 = c9;
                            j8 = (i23 == 0 && i24 == 0) ? k.f3119b : (i23 << c8) | (i24 & 4294967295L);
                        } else {
                            c8 = ' ';
                        }
                        this.f3109g = Math.max((int) (j7 >> c8), (int) (j8 >> c8));
                        this.f3110h = Math.max((int) (j7 & 4294967295L), (int) (j8 & 4294967295L));
                        TextPaint textPaint2 = this.f3103a;
                        i2.h[] hVarArr2 = this.f3115n;
                        i17 = this.f3108f - 1;
                        layout = this.f3107e;
                        if (layout.getLineStart(i17) == layout.getLineEnd(i17) || hVarArr2 == null || hVarArr2.length == 0) {
                            i18 = 0;
                        } else {
                            TextDirectionHeuristic textDirectionHeuristic2 = textDirectionHeuristic;
                            SpannableString spannableString = new SpannableString("\u200b");
                            if (hVarArr2.length == 0) {
                                throw new NoSuchElementException("Array is empty.");
                            }
                            i2.h hVar2 = hVarArr2[0];
                            spannableString.setSpan(new i2.h(hVar2.f3398d, spannableString.length(), (i17 == 0 || !hVar2.f3401g) ? hVar2.f3401g : false, hVar2.f3401g, hVar2.f3402h, hVar2.i), 0, spannableString.length(), i16);
                            StaticLayout a11 = g.a(spannableString, textPaint2, Integer.MAX_VALUE, spannableString.length(), textDirectionHeuristic2, c.f3088a, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 0, this.f3105c, 0, 0, 0, 0);
                            fontMetricsInt = new Paint.FontMetricsInt();
                            i18 = 0;
                            fontMetricsInt.ascent = a11.getLineAscent(0);
                            fontMetricsInt.descent = a11.getLineDescent(0);
                            fontMetricsInt.top = a11.getLineTop(0);
                            fontMetricsInt.bottom = a11.getLineBottom(0);
                        }
                        this.f3114m = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (d(i19) - f(i19))) : i18;
                        this.f3113l = fontMetricsInt;
                        Layout layout2 = this.f3107e;
                        this.i = h0.a.E(layout2, i19, layout2.getPaint());
                        Layout layout3 = this.f3107e;
                        this.f3111j = h0.a.F(layout3, i19, layout3.getPaint());
                    }
                }
                hVarArr = null;
                this.f3115n = hVarArr;
                if (hVarArr != null) {
                }
                this.f3109g = Math.max((int) (j7 >> c8), (int) (j8 >> c8));
                this.f3110h = Math.max((int) (j7 & 4294967295L), (int) (j8 & 4294967295L));
                TextPaint textPaint22 = this.f3103a;
                i2.h[] hVarArr22 = this.f3115n;
                i17 = this.f3108f - 1;
                layout = this.f3107e;
                if (layout.getLineStart(i17) == layout.getLineEnd(i17)) {
                }
                i18 = 0;
                this.f3114m = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (d(i19) - f(i19))) : i18;
                this.f3113l = fontMetricsInt;
                Layout layout22 = this.f3107e;
                this.i = h0.a.E(layout22, i19, layout22.getPaint());
                Layout layout32 = this.f3107e;
                this.f3111j = h0.a.F(layout32, i19, layout32.getPaint());
            }
            j7 = j8;
            Paint.FontMetricsInt fontMetricsInt2 = null;
            if (a8.getText() instanceof Spanned) {
            }
            hVarArr = null;
            this.f3115n = hVarArr;
            if (hVarArr != null) {
            }
            this.f3109g = Math.max((int) (j7 >> c8), (int) (j8 >> c8));
            this.f3110h = Math.max((int) (j7 & 4294967295L), (int) (j8 & 4294967295L));
            TextPaint textPaint222 = this.f3103a;
            i2.h[] hVarArr222 = this.f3115n;
            i17 = this.f3108f - 1;
            layout = this.f3107e;
            if (layout.getLineStart(i17) == layout.getLineEnd(i17)) {
            }
            i18 = 0;
            this.f3114m = fontMetricsInt2 != null ? fontMetricsInt2.bottom - ((int) (d(i19) - f(i19))) : i18;
            this.f3113l = fontMetricsInt2;
            Layout layout222 = this.f3107e;
            this.i = h0.a.E(layout222, i19, layout222.getPaint());
            Layout layout322 = this.f3107e;
            this.f3111j = h0.a.F(layout322, i19, layout322.getPaint());
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final int a() {
        boolean z3 = this.f3106d;
        Layout layout = this.f3107e;
        return (z3 ? layout.getLineBottom(this.f3108f - 1) : layout.getHeight()) + this.f3109g + this.f3110h + this.f3114m;
    }

    public final n b() {
        n nVar = this.f3117p;
        if (nVar != null) {
            return nVar;
        }
        n nVar2 = new n(this.f3107e);
        this.f3117p = nVar2;
        return nVar2;
    }

    public final float c(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.f3109g + ((i != this.f3108f + (-1) || (fontMetricsInt = this.f3113l) == null) ? this.f3107e.getLineBaseline(i) : f(i) - fontMetricsInt.ascent);
    }

    public final float d(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        int i8 = this.f3108f;
        int i9 = i8 - 1;
        Layout layout = this.f3107e;
        if (i != i9 || (fontMetricsInt = this.f3113l) == null) {
            return this.f3109g + layout.getLineBottom(i) + (i == i8 + (-1) ? this.f3110h : 0);
        }
        return layout.getLineBottom(i - 1) + fontMetricsInt.bottom;
    }

    public final int e(int i) {
        i iVar = k.f3118a;
        Layout layout = this.f3107e;
        return (layout.getEllipsisCount(i) <= 0 || this.f3104b != TextUtils.TruncateAt.END) ? layout.getLineEnd(i) : layout.getText().length();
    }

    public final float f(int i) {
        return this.f3107e.getLineTop(i) + (i == 0 ? 0 : this.f3109g);
    }

    public final float g(int i, boolean z3) {
        return (this.f3107e.getLineForOffset(i) == this.f3108f - 1 ? this.i + this.f3111j : 0.0f) + b().d(i, true, z3);
    }

    public final float h(int i, boolean z3) {
        return (this.f3107e.getLineForOffset(i) == this.f3108f + (-1) ? this.i + this.f3111j : 0.0f) + b().d(i, false, z3);
    }
}
