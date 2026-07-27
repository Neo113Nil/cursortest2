package B0;

import a.AbstractC0345a;
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
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f900a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f901b;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f903d;

    /* renamed from: e, reason: collision with root package name */
    public C0.f f904e;

    /* renamed from: f, reason: collision with root package name */
    public final Layout f905f;

    /* renamed from: g, reason: collision with root package name */
    public final int f906g;

    /* renamed from: h, reason: collision with root package name */
    public final int f907h;

    /* renamed from: i, reason: collision with root package name */
    public final int f908i;

    /* renamed from: j, reason: collision with root package name */
    public final float f909j;

    /* renamed from: k, reason: collision with root package name */
    public final float f910k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f911l;

    /* renamed from: m, reason: collision with root package name */
    public final Paint.FontMetricsInt f912m;

    /* renamed from: n, reason: collision with root package name */
    public final int f913n;

    /* renamed from: o, reason: collision with root package name */
    public final D0.h[] f914o;

    /* renamed from: q, reason: collision with root package name */
    public A0.q f916q;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f902c = true;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f915p = new Rect();

    /* JADX WARN: Removed duplicated region for block: B:60:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0273 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public F(CharSequence charSequence, float f4, TextPaint textPaint, int i2, TextUtils.TruncateAt truncateAt, int i4, boolean z4, int i5, int i6, int i7, int i8, int i9, int i10, s sVar) {
        boolean z5;
        v vVar;
        Layout a4;
        long j4;
        D0.h[] hVarArr;
        int i11;
        Layout layout;
        int i12;
        Paint.FontMetricsInt fontMetricsInt;
        boolean a5;
        v vVar2;
        Layout a6;
        this.f900a = textPaint;
        this.f901b = z4;
        int length = charSequence.length();
        TextDirectionHeuristic a7 = G.a(i4);
        Layout.Alignment alignment = D.f897a;
        Layout.Alignment alignment2 = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? Layout.Alignment.ALIGN_NORMAL : D.f898b : D.f897a : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        boolean z6 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, D0.a.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics a8 = sVar.a();
            double d4 = f4;
            int ceil = (int) Math.ceil(d4);
            v vVar3 = A.f875a;
            if (a8 == null || sVar.b() > f4 || z6) {
                z5 = true;
                this.f911l = false;
                vVar = vVar3;
                a4 = vVar.a(new C(charSequence, 0, charSequence.length(), textPaint, ceil, a7, alignment2, i5, truncateAt, (int) Math.ceil(d4), 1.0f, 0.0f, i10, z4, true, i6, i7, i8, i9, null, null));
            } else {
                this.f911l = true;
                if (ceil < 0) {
                    throw new IllegalArgumentException("negative width");
                }
                if (ceil < 0) {
                    throw new IllegalArgumentException("negative ellipsized width");
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    vVar2 = vVar3;
                    z5 = true;
                    a6 = AbstractC0091e.a(charSequence, textPaint, ceil, alignment2, 1.0f, 0.0f, a8, z4, true, truncateAt, ceil);
                } else {
                    vVar2 = vVar3;
                    z5 = true;
                    a6 = AbstractC0092f.a(charSequence, textPaint, ceil, alignment2, 1.0f, 0.0f, a8, z4, truncateAt, ceil);
                }
                a4 = a6;
                vVar = vVar2;
            }
            this.f905f = a4;
            Trace.endSection();
            int min = Math.min(a4.getLineCount(), i5);
            this.f906g = min;
            int i13 = min - 1;
            this.f903d = min >= i5 && (a4.getEllipsisCount(i13) > 0 || a4.getLineEnd(i13) != charSequence.length());
            long j5 = G.f918b;
            if (!z4) {
                if (this.f911l) {
                    a5 = Build.VERSION.SDK_INT >= 33 ? AbstractC0091e.c((BoringLayout) a4) : false;
                } else {
                    StaticLayout staticLayout = (StaticLayout) a4;
                    int i14 = Build.VERSION.SDK_INT;
                    a5 = i14 >= 33 ? z.a(staticLayout) : i14 >= 28 ? z5 : false;
                }
                if (!a5) {
                    TextPaint paint = a4.getPaint();
                    CharSequence text = a4.getText();
                    Rect a9 = A.a(paint, text, a4.getLineStart(0), a4.getLineEnd(0));
                    int lineAscent = a4.getLineAscent(0);
                    int i15 = a9.top;
                    int topPadding = i15 < lineAscent ? lineAscent - i15 : a4.getTopPadding();
                    a9 = min != 1 ? A.a(paint, text, a4.getLineStart(i13), a4.getLineEnd(i13)) : a9;
                    int lineDescent = a4.getLineDescent(i13);
                    int i16 = a9.bottom;
                    int bottomPadding = i16 > lineDescent ? i16 - lineDescent : a4.getBottomPadding();
                    if (topPadding != 0 || bottomPadding != 0) {
                        j4 = (bottomPadding & 4294967295L) | (topPadding << 32);
                        if (a4.getText() instanceof Spanned) {
                            CharSequence text2 = a4.getText();
                            Intrinsics.d(text2, "null cannot be cast to non-null type android.text.Spanned");
                            if (A.e((Spanned) text2, D0.h.class) || a4.getText().length() <= 0) {
                                CharSequence text3 = a4.getText();
                                Intrinsics.d(text3, "null cannot be cast to non-null type android.text.Spanned");
                                hVarArr = (D0.h[]) ((Spanned) text3).getSpans(0, a4.getText().length(), D0.h.class);
                                this.f914o = hVarArr;
                                if (hVarArr != null) {
                                    int i17 = 0;
                                    int i18 = 0;
                                    for (D0.h hVar : hVarArr) {
                                        int i19 = hVar.f2149j;
                                        i17 = i19 < 0 ? Math.max(i17, Math.abs(i19)) : i17;
                                        int i20 = hVar.f2150k;
                                        if (i20 < 0) {
                                            i18 = Math.max(i17, Math.abs(i20));
                                        }
                                    }
                                    j5 = (i17 == 0 && i18 == 0) ? G.f918b : (i17 << 32) | (i18 & 4294967295L);
                                }
                                this.f907h = Math.max((int) (j4 >> 32), (int) (j5 >> 32));
                                this.f908i = Math.max((int) (j4 & 4294967295L), (int) (j5 & 4294967295L));
                                TextPaint textPaint2 = this.f900a;
                                D0.h[] hVarArr2 = this.f914o;
                                i11 = this.f906g - 1;
                                layout = this.f905f;
                                if (layout.getLineStart(i11) == layout.getLineEnd(i11) || hVarArr2 == null || hVarArr2.length == 0) {
                                    i12 = 0;
                                    fontMetricsInt = null;
                                } else {
                                    SpannableString spannableString = new SpannableString("\u200b");
                                    Intrinsics.checkNotNullParameter(hVarArr2, "<this>");
                                    if (hVarArr2.length == 0) {
                                        throw new NoSuchElementException("Array is empty.");
                                    }
                                    D0.h hVar2 = hVarArr2[0];
                                    spannableString.setSpan(new D0.h(hVar2.f2140a, spannableString.length(), (i11 == 0 || !hVar2.f2143d) ? hVar2.f2143d : false, hVar2.f2143d, hVar2.f2144e), 0, spannableString.length(), 33);
                                    i12 = 0;
                                    StaticLayout a10 = vVar.a(new C(spannableString, 0, spannableString.length(), textPaint2, Integer.MAX_VALUE, a7, q.f932a, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 1.0f, 0.0f, 0, this.f901b, this.f902c, 0, 0, 0, 0, null, null));
                                    fontMetricsInt = new Paint.FontMetricsInt();
                                    fontMetricsInt.ascent = a10.getLineAscent(0);
                                    fontMetricsInt.descent = a10.getLineDescent(0);
                                    fontMetricsInt.top = a10.getLineTop(0);
                                    fontMetricsInt.bottom = a10.getLineBottom(0);
                                }
                                this.f913n = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (e(i13) - g(i13))) : i12;
                                this.f912m = fontMetricsInt;
                                Layout layout2 = this.f905f;
                                this.f909j = AbstractC0345a.t(layout2, i13, layout2.getPaint());
                                Layout layout3 = this.f905f;
                                this.f910k = AbstractC0345a.u(layout3, i13, layout3.getPaint());
                            }
                        }
                        hVarArr = null;
                        this.f914o = hVarArr;
                        if (hVarArr != null) {
                        }
                        this.f907h = Math.max((int) (j4 >> 32), (int) (j5 >> 32));
                        this.f908i = Math.max((int) (j4 & 4294967295L), (int) (j5 & 4294967295L));
                        TextPaint textPaint22 = this.f900a;
                        D0.h[] hVarArr22 = this.f914o;
                        i11 = this.f906g - 1;
                        layout = this.f905f;
                        if (layout.getLineStart(i11) == layout.getLineEnd(i11)) {
                        }
                        i12 = 0;
                        fontMetricsInt = null;
                        this.f913n = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (e(i13) - g(i13))) : i12;
                        this.f912m = fontMetricsInt;
                        Layout layout22 = this.f905f;
                        this.f909j = AbstractC0345a.t(layout22, i13, layout22.getPaint());
                        Layout layout32 = this.f905f;
                        this.f910k = AbstractC0345a.u(layout32, i13, layout32.getPaint());
                    }
                }
            }
            j4 = j5;
            if (a4.getText() instanceof Spanned) {
            }
            hVarArr = null;
            this.f914o = hVarArr;
            if (hVarArr != null) {
            }
            this.f907h = Math.max((int) (j4 >> 32), (int) (j5 >> 32));
            this.f908i = Math.max((int) (j4 & 4294967295L), (int) (j5 & 4294967295L));
            TextPaint textPaint222 = this.f900a;
            D0.h[] hVarArr222 = this.f914o;
            i11 = this.f906g - 1;
            layout = this.f905f;
            if (layout.getLineStart(i11) == layout.getLineEnd(i11)) {
            }
            i12 = 0;
            fontMetricsInt = null;
            this.f913n = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (e(i13) - g(i13))) : i12;
            this.f912m = fontMetricsInt;
            Layout layout222 = this.f905f;
            this.f909j = AbstractC0345a.t(layout222, i13, layout222.getPaint());
            Layout layout322 = this.f905f;
            this.f910k = AbstractC0345a.u(layout322, i13, layout322.getPaint());
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final int a() {
        boolean z4 = this.f903d;
        Layout layout = this.f905f;
        return (z4 ? layout.getLineBottom(this.f906g - 1) : layout.getHeight()) + this.f907h + this.f908i + this.f913n;
    }

    public final float b(int i2) {
        if (i2 == this.f906g - 1) {
            return this.f909j + this.f910k;
        }
        return 0.0f;
    }

    public final A0.q c() {
        A0.q qVar = this.f916q;
        if (qVar != null) {
            return qVar;
        }
        A0.q qVar2 = new A0.q(this.f905f);
        this.f916q = qVar2;
        return qVar2;
    }

    public final float d(int i2) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.f907h + ((i2 != this.f906g + (-1) || (fontMetricsInt = this.f912m) == null) ? this.f905f.getLineBaseline(i2) : g(i2) - fontMetricsInt.ascent);
    }

    public final float e(int i2) {
        Paint.FontMetricsInt fontMetricsInt;
        int i4 = this.f906g;
        int i5 = i4 - 1;
        Layout layout = this.f905f;
        if (i2 != i5 || (fontMetricsInt = this.f912m) == null) {
            return this.f907h + layout.getLineBottom(i2) + (i2 == i4 + (-1) ? this.f908i : 0);
        }
        return layout.getLineBottom(i2 - 1) + fontMetricsInt.bottom;
    }

    public final int f(int i2) {
        Layout layout = this.f905f;
        return layout.getEllipsisStart(i2) == 0 ? layout.getLineEnd(i2) : layout.getText().length();
    }

    public final float g(int i2) {
        return this.f905f.getLineTop(i2) + (i2 == 0 ? 0 : this.f907h);
    }

    public final float h(int i2, boolean z4) {
        return b(this.f905f.getLineForOffset(i2)) + c().f(i2, true, z4);
    }

    public final float i(int i2, boolean z4) {
        return b(this.f905f.getLineForOffset(i2)) + c().f(i2, false, z4);
    }

    public final C0.f j() {
        C0.f fVar = this.f904e;
        if (fVar != null) {
            return fVar;
        }
        Layout layout = this.f905f;
        C0.f fVar2 = new C0.f(layout.getText(), layout.getText().length(), this.f900a.getTextLocale());
        this.f904e = fVar2;
        return fVar2;
    }
}
