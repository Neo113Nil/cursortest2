package D0;

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
import h2.AbstractC0508a;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f822a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f823b;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f825d;

    /* renamed from: e, reason: collision with root package name */
    public E0.f f826e;

    /* renamed from: f, reason: collision with root package name */
    public final Layout f827f;

    /* renamed from: g, reason: collision with root package name */
    public final int f828g;

    /* renamed from: h, reason: collision with root package name */
    public final int f829h;

    /* renamed from: i, reason: collision with root package name */
    public final int f830i;

    /* renamed from: j, reason: collision with root package name */
    public final float f831j;

    /* renamed from: k, reason: collision with root package name */
    public final float f832k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f833l;

    /* renamed from: m, reason: collision with root package name */
    public final Paint.FontMetricsInt f834m;

    /* renamed from: n, reason: collision with root package name */
    public final int f835n;

    /* renamed from: o, reason: collision with root package name */
    public final F0.h[] f836o;

    /* renamed from: q, reason: collision with root package name */
    public C0.q f838q;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f824c = true;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f837p = new Rect();

    /* JADX WARN: Removed duplicated region for block: B:60:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0273 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public G(CharSequence charSequence, float f3, TextPaint textPaint, int i3, TextUtils.TruncateAt truncateAt, int i4, boolean z3, int i5, int i6, int i7, int i8, int i9, int i10, t tVar) {
        boolean z4;
        w wVar;
        Layout a3;
        long j3;
        F0.h[] hVarArr;
        int i11;
        Layout layout;
        int i12;
        Paint.FontMetricsInt fontMetricsInt;
        boolean a4;
        w wVar2;
        Layout a5;
        this.f822a = textPaint;
        this.f823b = z3;
        int length = charSequence.length();
        TextDirectionHeuristic a6 = H.a(i4);
        Layout.Alignment alignment = E.f819a;
        Layout.Alignment alignment2 = i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? Layout.Alignment.ALIGN_NORMAL : E.f820b : E.f819a : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        boolean z5 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, F0.a.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics a7 = tVar.a();
            double d3 = f3;
            int ceil = (int) Math.ceil(d3);
            w wVar3 = B.f797a;
            if (a7 == null || tVar.b() > f3 || z5) {
                z4 = true;
                this.f833l = false;
                wVar = wVar3;
                a3 = wVar.a(new D(charSequence, 0, charSequence.length(), textPaint, ceil, a6, alignment2, i5, truncateAt, (int) Math.ceil(d3), 1.0f, 0.0f, i10, z3, true, i6, i7, i8, i9, null, null));
            } else {
                this.f833l = true;
                if (ceil < 0) {
                    throw new IllegalArgumentException("negative width");
                }
                if (ceil < 0) {
                    throw new IllegalArgumentException("negative ellipsized width");
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    wVar2 = wVar3;
                    z4 = true;
                    a5 = AbstractC0067e.a(charSequence, textPaint, ceil, alignment2, 1.0f, 0.0f, a7, z3, true, truncateAt, ceil);
                } else {
                    wVar2 = wVar3;
                    z4 = true;
                    a5 = AbstractC0068f.a(charSequence, textPaint, ceil, alignment2, 1.0f, 0.0f, a7, z3, truncateAt, ceil);
                }
                a3 = a5;
                wVar = wVar2;
            }
            this.f827f = a3;
            Trace.endSection();
            int min = Math.min(a3.getLineCount(), i5);
            this.f828g = min;
            int i13 = min - 1;
            this.f825d = min >= i5 && (a3.getEllipsisCount(i13) > 0 || a3.getLineEnd(i13) != charSequence.length());
            long j4 = H.f840b;
            if (!z3) {
                if (this.f833l) {
                    a4 = Build.VERSION.SDK_INT >= 33 ? AbstractC0067e.c((BoringLayout) a3) : false;
                } else {
                    StaticLayout staticLayout = (StaticLayout) a3;
                    int i14 = Build.VERSION.SDK_INT;
                    a4 = i14 >= 33 ? A.a(staticLayout) : i14 >= 28 ? z4 : false;
                }
                if (!a4) {
                    TextPaint paint = a3.getPaint();
                    CharSequence text = a3.getText();
                    Rect a8 = B.a(paint, text, a3.getLineStart(0), a3.getLineEnd(0));
                    int lineAscent = a3.getLineAscent(0);
                    int i15 = a8.top;
                    int topPadding = i15 < lineAscent ? lineAscent - i15 : a3.getTopPadding();
                    a8 = min != 1 ? B.a(paint, text, a3.getLineStart(i13), a3.getLineEnd(i13)) : a8;
                    int lineDescent = a3.getLineDescent(i13);
                    int i16 = a8.bottom;
                    int bottomPadding = i16 > lineDescent ? i16 - lineDescent : a3.getBottomPadding();
                    if (topPadding != 0 || bottomPadding != 0) {
                        j3 = (bottomPadding & 4294967295L) | (topPadding << 32);
                        if (a3.getText() instanceof Spanned) {
                            CharSequence text2 = a3.getText();
                            f2.j.d(text2, "null cannot be cast to non-null type android.text.Spanned");
                            if (B.e((Spanned) text2, F0.h.class) || a3.getText().length() <= 0) {
                                CharSequence text3 = a3.getText();
                                f2.j.d(text3, "null cannot be cast to non-null type android.text.Spanned");
                                hVarArr = (F0.h[]) ((Spanned) text3).getSpans(0, a3.getText().length(), F0.h.class);
                                this.f836o = hVarArr;
                                if (hVarArr != null) {
                                    int i17 = 0;
                                    int i18 = 0;
                                    for (F0.h hVar : hVarArr) {
                                        int i19 = hVar.f1938j;
                                        i17 = i19 < 0 ? Math.max(i17, Math.abs(i19)) : i17;
                                        int i20 = hVar.f1939k;
                                        if (i20 < 0) {
                                            i18 = Math.max(i17, Math.abs(i20));
                                        }
                                    }
                                    j4 = (i17 == 0 && i18 == 0) ? H.f840b : (i17 << 32) | (i18 & 4294967295L);
                                }
                                this.f829h = Math.max((int) (j3 >> 32), (int) (j4 >> 32));
                                this.f830i = Math.max((int) (j3 & 4294967295L), (int) (j4 & 4294967295L));
                                TextPaint textPaint2 = this.f822a;
                                F0.h[] hVarArr2 = this.f836o;
                                i11 = this.f828g - 1;
                                layout = this.f827f;
                                if (layout.getLineStart(i11) == layout.getLineEnd(i11) || hVarArr2 == null || hVarArr2.length == 0) {
                                    i12 = 0;
                                    fontMetricsInt = null;
                                } else {
                                    SpannableString spannableString = new SpannableString("\u200b");
                                    if (hVarArr2.length == 0) {
                                        throw new NoSuchElementException("Array is empty.");
                                    }
                                    F0.h hVar2 = hVarArr2[0];
                                    spannableString.setSpan(new F0.h(hVar2.f1929a, spannableString.length(), (i11 == 0 || !hVar2.f1932d) ? hVar2.f1932d : false, hVar2.f1932d, hVar2.f1933e), 0, spannableString.length(), 33);
                                    i12 = 0;
                                    StaticLayout a9 = wVar.a(new D(spannableString, 0, spannableString.length(), textPaint2, Integer.MAX_VALUE, a6, r.f854a, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 1.0f, 0.0f, 0, this.f823b, this.f824c, 0, 0, 0, 0, null, null));
                                    fontMetricsInt = new Paint.FontMetricsInt();
                                    fontMetricsInt.ascent = a9.getLineAscent(0);
                                    fontMetricsInt.descent = a9.getLineDescent(0);
                                    fontMetricsInt.top = a9.getLineTop(0);
                                    fontMetricsInt.bottom = a9.getLineBottom(0);
                                }
                                this.f835n = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (e(i13) - g(i13))) : i12;
                                this.f834m = fontMetricsInt;
                                Layout layout2 = this.f827f;
                                this.f831j = AbstractC0508a.E(layout2, i13, layout2.getPaint());
                                Layout layout3 = this.f827f;
                                this.f832k = AbstractC0508a.F(layout3, i13, layout3.getPaint());
                            }
                        }
                        hVarArr = null;
                        this.f836o = hVarArr;
                        if (hVarArr != null) {
                        }
                        this.f829h = Math.max((int) (j3 >> 32), (int) (j4 >> 32));
                        this.f830i = Math.max((int) (j3 & 4294967295L), (int) (j4 & 4294967295L));
                        TextPaint textPaint22 = this.f822a;
                        F0.h[] hVarArr22 = this.f836o;
                        i11 = this.f828g - 1;
                        layout = this.f827f;
                        if (layout.getLineStart(i11) == layout.getLineEnd(i11)) {
                        }
                        i12 = 0;
                        fontMetricsInt = null;
                        this.f835n = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (e(i13) - g(i13))) : i12;
                        this.f834m = fontMetricsInt;
                        Layout layout22 = this.f827f;
                        this.f831j = AbstractC0508a.E(layout22, i13, layout22.getPaint());
                        Layout layout32 = this.f827f;
                        this.f832k = AbstractC0508a.F(layout32, i13, layout32.getPaint());
                    }
                }
            }
            j3 = j4;
            if (a3.getText() instanceof Spanned) {
            }
            hVarArr = null;
            this.f836o = hVarArr;
            if (hVarArr != null) {
            }
            this.f829h = Math.max((int) (j3 >> 32), (int) (j4 >> 32));
            this.f830i = Math.max((int) (j3 & 4294967295L), (int) (j4 & 4294967295L));
            TextPaint textPaint222 = this.f822a;
            F0.h[] hVarArr222 = this.f836o;
            i11 = this.f828g - 1;
            layout = this.f827f;
            if (layout.getLineStart(i11) == layout.getLineEnd(i11)) {
            }
            i12 = 0;
            fontMetricsInt = null;
            this.f835n = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (e(i13) - g(i13))) : i12;
            this.f834m = fontMetricsInt;
            Layout layout222 = this.f827f;
            this.f831j = AbstractC0508a.E(layout222, i13, layout222.getPaint());
            Layout layout322 = this.f827f;
            this.f832k = AbstractC0508a.F(layout322, i13, layout322.getPaint());
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final int a() {
        boolean z3 = this.f825d;
        Layout layout = this.f827f;
        return (z3 ? layout.getLineBottom(this.f828g - 1) : layout.getHeight()) + this.f829h + this.f830i + this.f835n;
    }

    public final float b(int i3) {
        if (i3 == this.f828g - 1) {
            return this.f831j + this.f832k;
        }
        return 0.0f;
    }

    public final C0.q c() {
        C0.q qVar = this.f838q;
        if (qVar != null) {
            return qVar;
        }
        C0.q qVar2 = new C0.q(this.f827f);
        this.f838q = qVar2;
        return qVar2;
    }

    public final float d(int i3) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.f829h + ((i3 != this.f828g + (-1) || (fontMetricsInt = this.f834m) == null) ? this.f827f.getLineBaseline(i3) : g(i3) - fontMetricsInt.ascent);
    }

    public final float e(int i3) {
        Paint.FontMetricsInt fontMetricsInt;
        int i4 = this.f828g;
        int i5 = i4 - 1;
        Layout layout = this.f827f;
        if (i3 != i5 || (fontMetricsInt = this.f834m) == null) {
            return this.f829h + layout.getLineBottom(i3) + (i3 == i4 + (-1) ? this.f830i : 0);
        }
        return layout.getLineBottom(i3 - 1) + fontMetricsInt.bottom;
    }

    public final int f(int i3) {
        Layout layout = this.f827f;
        return layout.getEllipsisStart(i3) == 0 ? layout.getLineEnd(i3) : layout.getText().length();
    }

    public final float g(int i3) {
        return this.f827f.getLineTop(i3) + (i3 == 0 ? 0 : this.f829h);
    }

    public final float h(int i3, boolean z3) {
        return b(this.f827f.getLineForOffset(i3)) + c().f(i3, true, z3);
    }

    public final float i(int i3, boolean z3) {
        return b(this.f827f.getLineForOffset(i3)) + c().f(i3, false, z3);
    }

    public final E0.f j() {
        E0.f fVar = this.f826e;
        if (fVar != null) {
            return fVar;
        }
        Layout layout = this.f827f;
        E0.f fVar2 = new E0.f(layout.getText(), layout.getText().length(), this.f822a.getTextLocale());
        this.f826e = fVar2;
        return fVar2;
    }
}
