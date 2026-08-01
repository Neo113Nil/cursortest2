package n2;

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
import com.appsflyer.internal.j;
import com.google.android.gms.internal.measurement.se;
import kotlin.collections.w;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f7007a;

    /* renamed from: b, reason: collision with root package name */
    public final TextUtils.TruncateAt f7008b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7009c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7010d;

    /* renamed from: e, reason: collision with root package name */
    public final Layout f7011e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7012f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public final int f7013h;

    /* renamed from: i, reason: collision with root package name */
    public final float f7014i;
    public final float j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f7015k;

    /* renamed from: l, reason: collision with root package name */
    public final Paint.FontMetricsInt f7016l;

    /* renamed from: m, reason: collision with root package name */
    public final int f7017m;

    /* renamed from: n, reason: collision with root package name */
    public final o2.h[] f7018n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f7019o = new Rect();

    /* renamed from: p, reason: collision with root package name */
    public se f7020p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0184 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0296 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0320  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h(CharSequence charSequence, float f3, TextPaint textPaint, int i3, TextUtils.TruncateAt truncateAt, int i10, boolean z10, int i11, int i12, int i13, int i14, int i15, int i16, d dVar) {
        int i17;
        int i18;
        TextDirectionHeuristic textDirectionHeuristic;
        Layout a9;
        o2.h[] hVarArr;
        int i19;
        int i20;
        int i21;
        char c10;
        long j;
        int i22;
        int i23;
        long a10;
        int i24;
        boolean isFallbackLineSpacingEnabled;
        boolean isFallbackLineSpacingEnabled2;
        long j3;
        int i25;
        Layout layout;
        Paint.FontMetricsInt fontMetricsInt;
        int i26;
        this.f7007a = textPaint;
        this.f7008b = truncateAt;
        this.f7009c = z10;
        int length = charSequence.length();
        TextDirectionHeuristic b10 = i.b(i10);
        Layout.Alignment alignment = f.f7004a;
        Layout.Alignment alignment2 = i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? Layout.Alignment.ALIGN_NORMAL : f.f7005b : f.f7004a : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        boolean z11 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, o2.a.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics a11 = dVar.a();
            double d10 = f3;
            int ceil = (int) Math.ceil(d10);
            if (a11 == null || dVar.c() > f3 || z11) {
                i17 = 0;
                this.f7015k = false;
                i18 = i11;
                textDirectionHeuristic = b10;
                a9 = e.a(charSequence, textPaint, ceil, charSequence.length(), textDirectionHeuristic, alignment2, i18, truncateAt, (int) Math.ceil(d10), i16, z10, i12, i13, i14, i15);
            } else {
                this.f7015k = true;
                if (ceil < 0) {
                    r2.a.a("negative width");
                }
                if (ceil < 0) {
                    r2.a.a("negative ellipsized width");
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    a9 = j.i(charSequence, textPaint, ceil, alignment2, a11, z10, truncateAt, ceil);
                    i17 = 0;
                } else {
                    i17 = 0;
                    a9 = new BoringLayout(charSequence, textPaint, ceil, alignment2, 1.0f, 0.0f, a11, z10, truncateAt, ceil);
                }
                i18 = i11;
                textDirectionHeuristic = b10;
            }
            this.f7011e = a9;
            Trace.endSection();
            int min = Math.min(a9.getLineCount(), i18);
            this.f7012f = min;
            int i27 = min - 1;
            this.f7010d = (min >= i18 && (a9.getEllipsisCount(i27) > 0 || a9.getLineEnd(i27) != charSequence.length())) ? 1 : i17;
            if (a9.getText() instanceof Spanned) {
                CharSequence text = a9.getText();
                text.getClass();
                if (e.c((Spanned) text, o2.h.class) || a9.getText().length() <= 0) {
                    CharSequence text2 = a9.getText();
                    text2.getClass();
                    hVarArr = (o2.h[]) ((Spanned) text2).getSpans(i17, a9.getText().length(), o2.h.class);
                    this.f7018n = hVarArr;
                    if (hVarArr != null) {
                        o2.h hVar = hVarArr.length == 0 ? null : hVarArr[i17];
                        if (hVar != null) {
                            if (hVar.f7342i) {
                                i19 = 2;
                                if (hVar.f7345t == 2) {
                                    i26 = 1;
                                    i20 = i26;
                                    if (hVarArr != null) {
                                        o2.h hVar2 = hVarArr.length == 0 ? null : hVarArr[i17];
                                        if (hVar2 != null && hVar2.f7343r && hVar2.f7345t == i19) {
                                            i21 = 1;
                                            if (i20 != 0 || i21 == 0) {
                                                long j10 = i.f7022b;
                                                if (z10) {
                                                    c10 = ' ';
                                                    j = 4294967295L;
                                                    i22 = 33;
                                                } else if (this.f7015k) {
                                                    BoringLayout boringLayout = (BoringLayout) a9;
                                                    i22 = 33;
                                                    if (Build.VERSION.SDK_INT >= 33) {
                                                        isFallbackLineSpacingEnabled2 = boringLayout.isFallbackLineSpacingEnabled();
                                                        i24 = isFallbackLineSpacingEnabled2;
                                                        if (i24 != 0) {
                                                            c10 = ' ';
                                                            j = 4294967295L;
                                                        } else {
                                                            TextPaint paint = a9.getPaint();
                                                            CharSequence text3 = a9.getText();
                                                            c10 = ' ';
                                                            j = 4294967295L;
                                                            Rect b11 = e.b(paint, text3, a9.getLineStart(i17), a9.getLineEnd(i17));
                                                            int lineAscent = a9.getLineAscent(i17);
                                                            int i28 = b11.top;
                                                            int topPadding = i28 < lineAscent ? lineAscent - i28 : a9.getTopPadding();
                                                            i23 = 1;
                                                            b11 = min != 1 ? e.b(paint, text3, a9.getLineStart(i27), a9.getLineEnd(i27)) : b11;
                                                            int lineDescent = a9.getLineDescent(i27);
                                                            int i29 = b11.bottom;
                                                            int bottomPadding = i29 > lineDescent ? i29 - lineDescent : a9.getBottomPadding();
                                                            if (topPadding != 0 || bottomPadding != 0) {
                                                                j10 = i.a(topPadding, bottomPadding);
                                                            }
                                                            a10 = i.a(i20 == 0 ? i17 : (int) (j10 >> c10), i21 == 0 ? i17 : (int) (j10 & j));
                                                        }
                                                    }
                                                    i24 = i17;
                                                    if (i24 != 0) {
                                                    }
                                                } else {
                                                    i22 = 33;
                                                    StaticLayout staticLayout = (StaticLayout) a9;
                                                    int i30 = Build.VERSION.SDK_INT;
                                                    if (i30 >= 33) {
                                                        isFallbackLineSpacingEnabled = staticLayout.isFallbackLineSpacingEnabled();
                                                        i24 = isFallbackLineSpacingEnabled;
                                                    } else {
                                                        if (i30 >= 28) {
                                                            i24 = 1;
                                                        }
                                                        i24 = i17;
                                                    }
                                                    if (i24 != 0) {
                                                    }
                                                }
                                                i23 = 1;
                                                a10 = i.a(i20 == 0 ? i17 : (int) (j10 >> c10), i21 == 0 ? i17 : (int) (j10 & j));
                                            } else {
                                                a10 = i.f7022b;
                                                c10 = ' ';
                                                j = 4294967295L;
                                                i22 = 33;
                                                i23 = 1;
                                            }
                                            if (hVarArr != null) {
                                                int length2 = hVarArr.length;
                                                int i31 = i17;
                                                int i32 = i31;
                                                int i33 = i32;
                                                while (i32 < length2) {
                                                    o2.h hVar3 = hVarArr[i32];
                                                    int i34 = hVar3.f7350y;
                                                    i31 = i34 < 0 ? Math.max(i31, Math.abs(i34)) : i31;
                                                    int i35 = hVar3.f7351z;
                                                    if (i35 < 0) {
                                                        i33 = Math.max(i31, Math.abs(i35));
                                                    }
                                                    i32++;
                                                }
                                                j3 = (i31 == 0 && i33 == 0) ? i.f7022b : i.a(i31, i33);
                                            } else {
                                                j3 = i.f7022b;
                                            }
                                            this.g = Math.max((int) (a10 >> c10), (int) (j3 >> c10));
                                            this.f7013h = Math.max((int) (a10 & j), (int) (j3 & j));
                                            TextPaint textPaint2 = this.f7007a;
                                            o2.h[] hVarArr2 = this.f7018n;
                                            i25 = this.f7012f - i23;
                                            layout = this.f7011e;
                                            if (layout.getLineStart(i25) == layout.getLineEnd(i25) || hVarArr2 == null || hVarArr2.length == 0) {
                                                fontMetricsInt = null;
                                            } else {
                                                TextDirectionHeuristic textDirectionHeuristic2 = textDirectionHeuristic;
                                                SpannableString spannableString = new SpannableString("\u200b");
                                                o2.h hVar4 = (o2.h) w.n(hVarArr2);
                                                spannableString.setSpan(new o2.h(hVar4.f7340d, spannableString.length(), (i25 == 0 || !hVar4.f7343r) ? hVar4.f7343r : i17, hVar4.f7343r, hVar4.f7344s, hVar4.f7345t), i17, spannableString.length(), i22);
                                                StaticLayout a12 = e.a(spannableString, textPaint2, Integer.MAX_VALUE, spannableString.length(), textDirectionHeuristic2, b.f6992a, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 0, this.f7009c, 0, 0, 0, 0);
                                                fontMetricsInt = new Paint.FontMetricsInt();
                                                fontMetricsInt.ascent = a12.getLineAscent(i17);
                                                fontMetricsInt.descent = a12.getLineDescent(i17);
                                                fontMetricsInt.top = a12.getLineTop(i17);
                                                fontMetricsInt.bottom = a12.getLineBottom(i17);
                                            }
                                            this.f7017m = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (d(i27) - f(i27))) : i17;
                                            this.f7016l = fontMetricsInt;
                                            Layout layout2 = this.f7011e;
                                            this.f7014i = a.a.y(layout2, i27, layout2.getPaint());
                                            Layout layout3 = this.f7011e;
                                            this.j = a.a.z(layout3, i27, layout3.getPaint());
                                        }
                                    }
                                    i21 = i17;
                                    if (i20 != 0) {
                                    }
                                    long j102 = i.f7022b;
                                    if (z10) {
                                    }
                                    i23 = 1;
                                    a10 = i.a(i20 == 0 ? i17 : (int) (j102 >> c10), i21 == 0 ? i17 : (int) (j102 & j));
                                    if (hVarArr != null) {
                                    }
                                    this.g = Math.max((int) (a10 >> c10), (int) (j3 >> c10));
                                    this.f7013h = Math.max((int) (a10 & j), (int) (j3 & j));
                                    TextPaint textPaint22 = this.f7007a;
                                    o2.h[] hVarArr22 = this.f7018n;
                                    i25 = this.f7012f - i23;
                                    layout = this.f7011e;
                                    if (layout.getLineStart(i25) == layout.getLineEnd(i25)) {
                                    }
                                    fontMetricsInt = null;
                                    this.f7017m = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (d(i27) - f(i27))) : i17;
                                    this.f7016l = fontMetricsInt;
                                    Layout layout22 = this.f7011e;
                                    this.f7014i = a.a.y(layout22, i27, layout22.getPaint());
                                    Layout layout32 = this.f7011e;
                                    this.j = a.a.z(layout32, i27, layout32.getPaint());
                                }
                            } else {
                                i19 = 2;
                            }
                            i26 = i17;
                            i20 = i26;
                            if (hVarArr != null) {
                            }
                            i21 = i17;
                            if (i20 != 0) {
                            }
                            long j1022 = i.f7022b;
                            if (z10) {
                            }
                            i23 = 1;
                            a10 = i.a(i20 == 0 ? i17 : (int) (j1022 >> c10), i21 == 0 ? i17 : (int) (j1022 & j));
                            if (hVarArr != null) {
                            }
                            this.g = Math.max((int) (a10 >> c10), (int) (j3 >> c10));
                            this.f7013h = Math.max((int) (a10 & j), (int) (j3 & j));
                            TextPaint textPaint222 = this.f7007a;
                            o2.h[] hVarArr222 = this.f7018n;
                            i25 = this.f7012f - i23;
                            layout = this.f7011e;
                            if (layout.getLineStart(i25) == layout.getLineEnd(i25)) {
                            }
                            fontMetricsInt = null;
                            this.f7017m = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (d(i27) - f(i27))) : i17;
                            this.f7016l = fontMetricsInt;
                            Layout layout222 = this.f7011e;
                            this.f7014i = a.a.y(layout222, i27, layout222.getPaint());
                            Layout layout322 = this.f7011e;
                            this.j = a.a.z(layout322, i27, layout322.getPaint());
                        }
                    }
                    i19 = 2;
                    i20 = i17;
                    if (hVarArr != null) {
                    }
                    i21 = i17;
                    if (i20 != 0) {
                    }
                    long j10222 = i.f7022b;
                    if (z10) {
                    }
                    i23 = 1;
                    a10 = i.a(i20 == 0 ? i17 : (int) (j10222 >> c10), i21 == 0 ? i17 : (int) (j10222 & j));
                    if (hVarArr != null) {
                    }
                    this.g = Math.max((int) (a10 >> c10), (int) (j3 >> c10));
                    this.f7013h = Math.max((int) (a10 & j), (int) (j3 & j));
                    TextPaint textPaint2222 = this.f7007a;
                    o2.h[] hVarArr2222 = this.f7018n;
                    i25 = this.f7012f - i23;
                    layout = this.f7011e;
                    if (layout.getLineStart(i25) == layout.getLineEnd(i25)) {
                    }
                    fontMetricsInt = null;
                    this.f7017m = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (d(i27) - f(i27))) : i17;
                    this.f7016l = fontMetricsInt;
                    Layout layout2222 = this.f7011e;
                    this.f7014i = a.a.y(layout2222, i27, layout2222.getPaint());
                    Layout layout3222 = this.f7011e;
                    this.j = a.a.z(layout3222, i27, layout3222.getPaint());
                }
            }
            hVarArr = null;
            this.f7018n = hVarArr;
            if (hVarArr != null) {
            }
            i19 = 2;
            i20 = i17;
            if (hVarArr != null) {
            }
            i21 = i17;
            if (i20 != 0) {
            }
            long j102222 = i.f7022b;
            if (z10) {
            }
            i23 = 1;
            a10 = i.a(i20 == 0 ? i17 : (int) (j102222 >> c10), i21 == 0 ? i17 : (int) (j102222 & j));
            if (hVarArr != null) {
            }
            this.g = Math.max((int) (a10 >> c10), (int) (j3 >> c10));
            this.f7013h = Math.max((int) (a10 & j), (int) (j3 & j));
            TextPaint textPaint22222 = this.f7007a;
            o2.h[] hVarArr22222 = this.f7018n;
            i25 = this.f7012f - i23;
            layout = this.f7011e;
            if (layout.getLineStart(i25) == layout.getLineEnd(i25)) {
            }
            fontMetricsInt = null;
            this.f7017m = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (d(i27) - f(i27))) : i17;
            this.f7016l = fontMetricsInt;
            Layout layout22222 = this.f7011e;
            this.f7014i = a.a.y(layout22222, i27, layout22222.getPaint());
            Layout layout32222 = this.f7011e;
            this.j = a.a.z(layout32222, i27, layout32222.getPaint());
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final int a() {
        boolean z10 = this.f7010d;
        Layout layout = this.f7011e;
        return (z10 ? layout.getLineBottom(this.f7012f - 1) : layout.getHeight()) + this.g + this.f7013h + this.f7017m;
    }

    public final se b() {
        se seVar = this.f7020p;
        if (seVar != null) {
            return seVar;
        }
        se seVar2 = new se(this.f7011e);
        this.f7020p = seVar2;
        return seVar2;
    }

    public final float c(int i3) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.g + ((i3 != this.f7012f + (-1) || (fontMetricsInt = this.f7016l) == null) ? this.f7011e.getLineBaseline(i3) : f(i3) - fontMetricsInt.ascent);
    }

    public final float d(int i3) {
        Paint.FontMetricsInt fontMetricsInt;
        int i10 = this.f7012f;
        int i11 = i10 - 1;
        Layout layout = this.f7011e;
        if (i3 != i11 || (fontMetricsInt = this.f7016l) == null) {
            return this.g + layout.getLineBottom(i3) + (i3 == i10 + (-1) ? this.f7013h : 0);
        }
        return layout.getLineBottom(i3 - 1) + fontMetricsInt.bottom;
    }

    public final int e(int i3) {
        ThreadLocal threadLocal = i.f7021a;
        Layout layout = this.f7011e;
        return (layout.getEllipsisCount(i3) <= 0 || this.f7008b != TextUtils.TruncateAt.END) ? layout.getLineEnd(i3) : layout.getText().length();
    }

    public final float f(int i3) {
        return this.f7011e.getLineTop(i3) + (i3 == 0 ? 0 : this.g);
    }

    public final float g(int i3, boolean z10) {
        return (this.f7011e.getLineForOffset(i3) == this.f7012f - 1 ? this.f7014i + this.j : 0.0f) + b().n(i3, true, z10);
    }

    public final float h(int i3, boolean z10) {
        return (this.f7011e.getLineForOffset(i3) == this.f7012f + (-1) ? this.f7014i + this.j : 0.0f) + b().n(i3, false, z10);
    }
}
