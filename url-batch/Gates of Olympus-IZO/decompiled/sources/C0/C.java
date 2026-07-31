package C0;

import a.AbstractC0157a;
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

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f425a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f426b;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f428d;

    /* renamed from: e, reason: collision with root package name */
    public final Layout f429e;

    /* renamed from: f, reason: collision with root package name */
    public final int f430f;

    /* renamed from: g, reason: collision with root package name */
    public final int f431g;

    /* renamed from: h, reason: collision with root package name */
    public final int f432h;

    /* renamed from: i, reason: collision with root package name */
    public final float f433i;

    /* renamed from: j, reason: collision with root package name */
    public final float f434j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f435k;

    /* renamed from: l, reason: collision with root package name */
    public final Paint.FontMetricsInt f436l;

    /* renamed from: m, reason: collision with root package name */
    public final int f437m;

    /* renamed from: n, reason: collision with root package name */
    public final D0.g[] f438n;
    public A2.w p;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f427c = true;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f439o = new Rect();

    /* JADX WARN: Removed duplicated region for block: B:60:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0273 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C(CharSequence charSequence, float f3, TextPaint textPaint, int i3, TextUtils.TruncateAt truncateAt, int i4, boolean z3, int i5, int i6, int i7, int i8, int i9, int i10, p pVar) {
        boolean z4;
        s sVar;
        Layout a3;
        long j3;
        D0.g[] gVarArr;
        int i11;
        Layout layout;
        int i12;
        Paint.FontMetricsInt fontMetricsInt;
        boolean a4;
        s sVar2;
        Layout a5;
        this.f425a = textPaint;
        this.f426b = z3;
        int length = charSequence.length();
        TextDirectionHeuristic a6 = D.a(i4);
        Layout.Alignment alignment = A.f422a;
        Layout.Alignment alignment2 = i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? Layout.Alignment.ALIGN_NORMAL : A.f423b : A.f422a : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        boolean z5 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, D0.a.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics a7 = pVar.a();
            double d3 = f3;
            int ceil = (int) Math.ceil(d3);
            s sVar3 = x.f462a;
            if (a7 == null || pVar.b() > f3 || z5) {
                z4 = true;
                this.f435k = false;
                sVar = sVar3;
                a3 = sVar.a(new z(charSequence, 0, charSequence.length(), textPaint, ceil, a6, alignment2, i5, truncateAt, (int) Math.ceil(d3), 1.0f, 0.0f, i10, z3, true, i6, i7, i8, i9, null, null));
            } else {
                this.f435k = true;
                if (ceil < 0) {
                    throw new IllegalArgumentException("negative width");
                }
                if (ceil < 0) {
                    throw new IllegalArgumentException("negative ellipsized width");
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    sVar2 = sVar3;
                    z4 = true;
                    a5 = AbstractC0010b.a(charSequence, textPaint, ceil, alignment2, 1.0f, 0.0f, a7, z3, true, truncateAt, ceil);
                } else {
                    sVar2 = sVar3;
                    z4 = true;
                    a5 = AbstractC0011c.a(charSequence, textPaint, ceil, alignment2, 1.0f, 0.0f, a7, z3, truncateAt, ceil);
                }
                a3 = a5;
                sVar = sVar2;
            }
            this.f429e = a3;
            Trace.endSection();
            int min = Math.min(a3.getLineCount(), i5);
            this.f430f = min;
            int i13 = min - 1;
            this.f428d = min >= i5 && (a3.getEllipsisCount(i13) > 0 || a3.getLineEnd(i13) != charSequence.length());
            long j4 = D.f441b;
            if (!z3) {
                if (this.f435k) {
                    a4 = Build.VERSION.SDK_INT >= 33 ? AbstractC0010b.c((BoringLayout) a3) : false;
                } else {
                    StaticLayout staticLayout = (StaticLayout) a3;
                    int i14 = Build.VERSION.SDK_INT;
                    a4 = i14 >= 33 ? w.a(staticLayout) : i14 >= 28 ? z4 : false;
                }
                if (!a4) {
                    TextPaint paint = a3.getPaint();
                    CharSequence text = a3.getText();
                    Rect a8 = x.a(paint, text, a3.getLineStart(0), a3.getLineEnd(0));
                    int lineAscent = a3.getLineAscent(0);
                    int i15 = a8.top;
                    int topPadding = i15 < lineAscent ? lineAscent - i15 : a3.getTopPadding();
                    a8 = min != 1 ? x.a(paint, text, a3.getLineStart(i13), a3.getLineEnd(i13)) : a8;
                    int lineDescent = a3.getLineDescent(i13);
                    int i16 = a8.bottom;
                    int bottomPadding = i16 > lineDescent ? i16 - lineDescent : a3.getBottomPadding();
                    if (topPadding != 0 || bottomPadding != 0) {
                        j3 = (bottomPadding & 4294967295L) | (topPadding << 32);
                        if (a3.getText() instanceof Spanned) {
                            CharSequence text2 = a3.getText();
                            Z1.i.d(text2, "null cannot be cast to non-null type android.text.Spanned");
                            if (x.b((Spanned) text2, D0.g.class) || a3.getText().length() <= 0) {
                                CharSequence text3 = a3.getText();
                                Z1.i.d(text3, "null cannot be cast to non-null type android.text.Spanned");
                                gVarArr = (D0.g[]) ((Spanned) text3).getSpans(0, a3.getText().length(), D0.g.class);
                                this.f438n = gVarArr;
                                if (gVarArr != null) {
                                    int i17 = 0;
                                    int i18 = 0;
                                    for (D0.g gVar : gVarArr) {
                                        int i19 = gVar.f502j;
                                        i17 = i19 < 0 ? Math.max(i17, Math.abs(i19)) : i17;
                                        int i20 = gVar.f503k;
                                        if (i20 < 0) {
                                            i18 = Math.max(i17, Math.abs(i20));
                                        }
                                    }
                                    j4 = (i17 == 0 && i18 == 0) ? D.f441b : (i17 << 32) | (i18 & 4294967295L);
                                }
                                this.f431g = Math.max((int) (j3 >> 32), (int) (j4 >> 32));
                                this.f432h = Math.max((int) (j3 & 4294967295L), (int) (j4 & 4294967295L));
                                TextPaint textPaint2 = this.f425a;
                                D0.g[] gVarArr2 = this.f438n;
                                i11 = this.f430f - 1;
                                layout = this.f429e;
                                if (layout.getLineStart(i11) == layout.getLineEnd(i11) || gVarArr2 == null || gVarArr2.length == 0) {
                                    i12 = 0;
                                    fontMetricsInt = null;
                                } else {
                                    SpannableString spannableString = new SpannableString("\u200b");
                                    if (gVarArr2.length == 0) {
                                        throw new NoSuchElementException("Array is empty.");
                                    }
                                    D0.g gVar2 = gVarArr2[0];
                                    spannableString.setSpan(new D0.g(gVar2.f493a, spannableString.length(), (i11 == 0 || !gVar2.f496d) ? gVar2.f496d : false, gVar2.f496d, gVar2.f497e), 0, spannableString.length(), 33);
                                    i12 = 0;
                                    StaticLayout a9 = sVar.a(new z(spannableString, 0, spannableString.length(), textPaint2, Integer.MAX_VALUE, a6, n.f450a, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 1.0f, 0.0f, 0, this.f426b, this.f427c, 0, 0, 0, 0, null, null));
                                    fontMetricsInt = new Paint.FontMetricsInt();
                                    fontMetricsInt.ascent = a9.getLineAscent(0);
                                    fontMetricsInt.descent = a9.getLineDescent(0);
                                    fontMetricsInt.top = a9.getLineTop(0);
                                    fontMetricsInt.bottom = a9.getLineBottom(0);
                                }
                                this.f437m = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (d(i13) - f(i13))) : i12;
                                this.f436l = fontMetricsInt;
                                Layout layout2 = this.f429e;
                                this.f433i = AbstractC0157a.D(layout2, i13, layout2.getPaint());
                                Layout layout3 = this.f429e;
                                this.f434j = AbstractC0157a.E(layout3, i13, layout3.getPaint());
                            }
                        }
                        gVarArr = null;
                        this.f438n = gVarArr;
                        if (gVarArr != null) {
                        }
                        this.f431g = Math.max((int) (j3 >> 32), (int) (j4 >> 32));
                        this.f432h = Math.max((int) (j3 & 4294967295L), (int) (j4 & 4294967295L));
                        TextPaint textPaint22 = this.f425a;
                        D0.g[] gVarArr22 = this.f438n;
                        i11 = this.f430f - 1;
                        layout = this.f429e;
                        if (layout.getLineStart(i11) == layout.getLineEnd(i11)) {
                        }
                        i12 = 0;
                        fontMetricsInt = null;
                        this.f437m = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (d(i13) - f(i13))) : i12;
                        this.f436l = fontMetricsInt;
                        Layout layout22 = this.f429e;
                        this.f433i = AbstractC0157a.D(layout22, i13, layout22.getPaint());
                        Layout layout32 = this.f429e;
                        this.f434j = AbstractC0157a.E(layout32, i13, layout32.getPaint());
                    }
                }
            }
            j3 = j4;
            if (a3.getText() instanceof Spanned) {
            }
            gVarArr = null;
            this.f438n = gVarArr;
            if (gVarArr != null) {
            }
            this.f431g = Math.max((int) (j3 >> 32), (int) (j4 >> 32));
            this.f432h = Math.max((int) (j3 & 4294967295L), (int) (j4 & 4294967295L));
            TextPaint textPaint222 = this.f425a;
            D0.g[] gVarArr222 = this.f438n;
            i11 = this.f430f - 1;
            layout = this.f429e;
            if (layout.getLineStart(i11) == layout.getLineEnd(i11)) {
            }
            i12 = 0;
            fontMetricsInt = null;
            this.f437m = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (d(i13) - f(i13))) : i12;
            this.f436l = fontMetricsInt;
            Layout layout222 = this.f429e;
            this.f433i = AbstractC0157a.D(layout222, i13, layout222.getPaint());
            Layout layout322 = this.f429e;
            this.f434j = AbstractC0157a.E(layout322, i13, layout322.getPaint());
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final int a() {
        boolean z3 = this.f428d;
        Layout layout = this.f429e;
        return (z3 ? layout.getLineBottom(this.f430f - 1) : layout.getHeight()) + this.f431g + this.f432h + this.f437m;
    }

    public final A2.w b() {
        A2.w wVar = this.p;
        if (wVar != null) {
            return wVar;
        }
        A2.w wVar2 = new A2.w(this.f429e);
        this.p = wVar2;
        return wVar2;
    }

    public final float c(int i3) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.f431g + ((i3 != this.f430f + (-1) || (fontMetricsInt = this.f436l) == null) ? this.f429e.getLineBaseline(i3) : f(i3) - fontMetricsInt.ascent);
    }

    public final float d(int i3) {
        Paint.FontMetricsInt fontMetricsInt;
        int i4 = this.f430f;
        int i5 = i4 - 1;
        Layout layout = this.f429e;
        if (i3 != i5 || (fontMetricsInt = this.f436l) == null) {
            return this.f431g + layout.getLineBottom(i3) + (i3 == i4 + (-1) ? this.f432h : 0);
        }
        return layout.getLineBottom(i3 - 1) + fontMetricsInt.bottom;
    }

    public final int e(int i3) {
        Layout layout = this.f429e;
        return layout.getEllipsisStart(i3) == 0 ? layout.getLineEnd(i3) : layout.getText().length();
    }

    public final float f(int i3) {
        return this.f429e.getLineTop(i3) + (i3 == 0 ? 0 : this.f431g);
    }

    public final float g(int i3, boolean z3) {
        return (this.f429e.getLineForOffset(i3) == this.f430f - 1 ? this.f433i + this.f434j : 0.0f) + b().d(i3, true, z3);
    }

    public final float h(int i3, boolean z3) {
        return (this.f429e.getLineForOffset(i3) == this.f430f + (-1) ? this.f433i + this.f434j : 0.0f) + b().d(i3, false, z3);
    }
}
