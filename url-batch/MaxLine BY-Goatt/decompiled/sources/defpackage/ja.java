package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ja {
    public final na a;
    public final int b;
    public final long c;
    public final zv2 d;
    public final CharSequence e;
    public final List f;

    /* JADX WARN: Removed duplicated region for block: B:108:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0246  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ja(na naVar, int i, int i2, long j) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        un2 un2Var;
        int i10;
        int i11;
        int i12;
        char c;
        un2 un2Var2;
        TextUtils.TruncateAt truncateAt;
        TextUtils.TruncateAt truncateAt2;
        zv2 a;
        int i13;
        ja jaVar;
        int i14;
        int i15;
        int i16;
        Layout layout;
        ck2[] ck2VarArr;
        CharSequence charSequence;
        List list;
        w72 w72Var;
        float h;
        int i17;
        this.a = naVar;
        this.b = i;
        this.c = j;
        if (u10.i(j) != 0 || u10.j(j) != 0) {
            i21.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i < 1) {
            i21.a("maxLines should be greater than 0");
        }
        pw2 pw2Var = naVar.n;
        CharSequence charSequence2 = naVar.t;
        if (i2 == 2) {
            i3 = 0;
            if (!sw2.a(pw2Var.a.h, mi2.l(0)) && !sw2.a(pw2Var.a.h, sw2.c) && (i17 = pw2Var.b.a) != Integer.MIN_VALUE && i17 != 5 && i17 != 4 && charSequence2.length() != 0) {
                Spannable spannable = charSequence2 instanceof Spannable ? (Spannable) charSequence2 : null;
                spannable = spannable == null ? new SpannableString(charSequence2) : spannable;
                if (!mh2.k(spannable, x11.class)) {
                    spannable.setSpan(new x11(), spannable.length() - 1, spannable.length() - 1, 33);
                }
                charSequence2 = spannable;
            }
        } else {
            i3 = 0;
        }
        CharSequence charSequence3 = charSequence2;
        this.e = charSequence3;
        ez1 ez1Var = pw2Var.b;
        un2 un2Var3 = pw2Var.a;
        int i18 = ez1Var.a;
        int i19 = 3;
        int i20 = i18 == 1 ? 3 : i18 == 2 ? 4 : i18 == 3 ? 2 : (i18 != 5 && i18 == 6) ? 1 : i3;
        int i21 = i18 == 4 ? 1 : i3;
        int i22 = ez1Var.h == 2 ? Build.VERSION.SDK_INT <= 32 ? 2 : 4 : i3;
        int i23 = ez1Var.g;
        int i24 = i23 & 255;
        if (i24 != 1) {
            if (i24 == 2) {
                i4 = i23;
                i5 = i21;
                i6 = 1;
            } else if (i24 == 3) {
                i4 = i23;
                i5 = i21;
                i6 = 2;
            }
            i7 = (i4 >> 8) & 255;
            if (i7 != 1) {
                if (i7 == 2) {
                    i19 = 1;
                } else if (i7 == 3) {
                    i19 = 2;
                } else if (i7 == 4) {
                }
                i8 = (i4 >> 16) & 255;
                if (i8 == 1) {
                    i9 = 2;
                } else {
                    i9 = 2;
                    if (i8 == 2) {
                        un2Var = un2Var3;
                        i10 = i20;
                        i11 = 1;
                        if (i2 != i9) {
                            truncateAt2 = TextUtils.TruncateAt.END;
                        } else if (i2 == 5) {
                            truncateAt2 = TextUtils.TruncateAt.MIDDLE;
                        } else {
                            if (i2 != 4) {
                                i12 = i22;
                                c = ' ';
                                un2Var2 = un2Var;
                                truncateAt = null;
                                a = a(i10, i5, truncateAt, i, i12, i6, i19, i11, charSequence3);
                                Layout layout2 = a.f;
                                i13 = i10;
                                if (Build.VERSION.SDK_INT < 35 || naVar.s.getLetterSpacing() == 0.0f || (!(i2 == 4 || i2 == 5) || layout2.getEllipsisCount(0) <= 0)) {
                                    jaVar = this;
                                    i14 = i;
                                    i15 = i13;
                                    i16 = 2;
                                } else {
                                    int ellipsisStart = layout2.getEllipsisStart(0);
                                    i16 = 2;
                                    CharSequence[] charSequenceArr = {charSequence3.subSequence(0, ellipsisStart), "…", charSequence3.subSequence(layout2.getEllipsisCount(0) + ellipsisStart, charSequence3.length())};
                                    jaVar = this;
                                    i14 = i;
                                    i15 = i13;
                                    a = jaVar.a(i15, i5, truncateAt, i14, i12, i6, i19, i11, TextUtils.concat(charSequenceArr));
                                }
                                int i25 = a.g;
                                if (i2 == i16 || a.a() <= u10.g(j) || i14 <= 1) {
                                    jaVar.d = a;
                                } else {
                                    int g = u10.g(j);
                                    int i26 = 0;
                                    while (true) {
                                        if (i26 >= i25) {
                                            i26 = i25;
                                            break;
                                        } else if (a.e(i26) > g) {
                                            break;
                                        } else {
                                            i26++;
                                        }
                                    }
                                    if (i26 >= 0 && i26 != jaVar.b) {
                                        a = jaVar.a(i15, i5, truncateAt, i26 < 1 ? 1 : i26, i12, i6, i19, i11, jaVar.e);
                                    }
                                    jaVar.d = a;
                                }
                                jaVar.a.s.c(un2Var2.a.c(), (Float.floatToRawIntBits(jaVar.b()) & 4294967295L) | (Float.floatToRawIntBits(jaVar.d()) << c), un2Var2.a.a());
                                layout = jaVar.d.f;
                                if (layout.getText() instanceof Spanned) {
                                    CharSequence text = layout.getText();
                                    text.getClass();
                                    Spanned spanned = (Spanned) text;
                                    if (spanned.nextSpanTransition(-1, spanned.length(), ck2.class) != spanned.length()) {
                                        CharSequence text2 = layout.getText();
                                        text2.getClass();
                                        ck2VarArr = (ck2[]) ((Spanned) text2).getSpans(0, layout.getText().length(), ck2.class);
                                        if (ck2VarArr != null) {
                                            int i27 = 0;
                                            while (i27 < ck2VarArr.length) {
                                                int i28 = i27 + 1;
                                                try {
                                                    ck2VarArr[i27].o.setValue(new ql2((Float.floatToRawIntBits(jaVar.b()) & 4294967295L) | (Float.floatToRawIntBits(jaVar.d()) << c)));
                                                    i27 = i28;
                                                } catch (ArrayIndexOutOfBoundsException e) {
                                                    ch2.k(e.getMessage());
                                                    throw null;
                                                }
                                            }
                                        }
                                        charSequence = jaVar.e;
                                        if (charSequence instanceof Spanned) {
                                            list = ah0.m;
                                        } else {
                                            Spanned spanned2 = (Spanned) charSequence;
                                            Object[] spans = spanned2.getSpans(0, charSequence.length(), q12.class);
                                            ArrayList arrayList = new ArrayList(spans.length);
                                            for (Object obj : spans) {
                                                q12 q12Var = (q12) obj;
                                                int spanStart = spanned2.getSpanStart(q12Var);
                                                int spanEnd = spanned2.getSpanEnd(q12Var);
                                                int lineForOffset = jaVar.d.f.getLineForOffset(spanStart);
                                                boolean z = lineForOffset >= jaVar.b;
                                                boolean z2 = jaVar.d.f.getEllipsisCount(lineForOffset) > 0 && spanEnd > jaVar.d.f.getEllipsisStart(lineForOffset);
                                                boolean z3 = spanEnd > jaVar.d.f(lineForOffset);
                                                if (z2 || z3 || z) {
                                                    w72Var = null;
                                                } else {
                                                    int ordinal = (jaVar.d.f.isRtlCharAt(spanStart) ? k92.n : k92.m).ordinal();
                                                    if (ordinal == 0) {
                                                        h = jaVar.d.h(spanStart, false);
                                                    } else {
                                                        if (ordinal != 1) {
                                                            a.b();
                                                            throw null;
                                                        }
                                                        float h2 = jaVar.d.h(spanStart, false);
                                                        if (!q12Var.p) {
                                                            i21.b("PlaceholderSpan is not laid out yet.");
                                                        }
                                                        h = h2 - q12Var.n;
                                                    }
                                                    if (!q12Var.p) {
                                                        i21.b("PlaceholderSpan is not laid out yet.");
                                                    }
                                                    float d = jaVar.d.d(lineForOffset) - q12Var.b();
                                                    w72Var = new w72(h, d, q12Var.n + h, q12Var.b() + d);
                                                }
                                                arrayList.add(w72Var);
                                            }
                                            list = arrayList;
                                        }
                                        jaVar.f = list;
                                    }
                                }
                                ck2VarArr = null;
                                if (ck2VarArr != null) {
                                }
                                charSequence = jaVar.e;
                                if (charSequence instanceof Spanned) {
                                }
                                jaVar.f = list;
                            }
                            truncateAt2 = TextUtils.TruncateAt.START;
                        }
                        i12 = i22;
                        c = ' ';
                        un2Var2 = un2Var;
                        truncateAt = truncateAt2;
                        a = a(i10, i5, truncateAt, i, i12, i6, i19, i11, charSequence3);
                        Layout layout22 = a.f;
                        i13 = i10;
                        if (Build.VERSION.SDK_INT < 35) {
                        }
                        jaVar = this;
                        i14 = i;
                        i15 = i13;
                        i16 = 2;
                        int i252 = a.g;
                        if (i2 == i16) {
                        }
                        jaVar.d = a;
                        jaVar.a.s.c(un2Var2.a.c(), (Float.floatToRawIntBits(jaVar.b()) & 4294967295L) | (Float.floatToRawIntBits(jaVar.d()) << c), un2Var2.a.a());
                        layout = jaVar.d.f;
                        if (layout.getText() instanceof Spanned) {
                        }
                        ck2VarArr = null;
                        if (ck2VarArr != null) {
                        }
                        charSequence = jaVar.e;
                        if (charSequence instanceof Spanned) {
                        }
                        jaVar.f = list;
                    }
                }
                un2Var = un2Var3;
                i10 = i20;
                i11 = i3;
                if (i2 != i9) {
                }
                i12 = i22;
                c = ' ';
                un2Var2 = un2Var;
                truncateAt = truncateAt2;
                a = a(i10, i5, truncateAt, i, i12, i6, i19, i11, charSequence3);
                Layout layout222 = a.f;
                i13 = i10;
                if (Build.VERSION.SDK_INT < 35) {
                }
                jaVar = this;
                i14 = i;
                i15 = i13;
                i16 = 2;
                int i2522 = a.g;
                if (i2 == i16) {
                }
                jaVar.d = a;
                jaVar.a.s.c(un2Var2.a.c(), (Float.floatToRawIntBits(jaVar.b()) & 4294967295L) | (Float.floatToRawIntBits(jaVar.d()) << c), un2Var2.a.a());
                layout = jaVar.d.f;
                if (layout.getText() instanceof Spanned) {
                }
                ck2VarArr = null;
                if (ck2VarArr != null) {
                }
                charSequence = jaVar.e;
                if (charSequence instanceof Spanned) {
                }
                jaVar.f = list;
            }
            i19 = i3;
            i8 = (i4 >> 16) & 255;
            if (i8 == 1) {
            }
            un2Var = un2Var3;
            i10 = i20;
            i11 = i3;
            if (i2 != i9) {
            }
            i12 = i22;
            c = ' ';
            un2Var2 = un2Var;
            truncateAt = truncateAt2;
            a = a(i10, i5, truncateAt, i, i12, i6, i19, i11, charSequence3);
            Layout layout2222 = a.f;
            i13 = i10;
            if (Build.VERSION.SDK_INT < 35) {
            }
            jaVar = this;
            i14 = i;
            i15 = i13;
            i16 = 2;
            int i25222 = a.g;
            if (i2 == i16) {
            }
            jaVar.d = a;
            jaVar.a.s.c(un2Var2.a.c(), (Float.floatToRawIntBits(jaVar.b()) & 4294967295L) | (Float.floatToRawIntBits(jaVar.d()) << c), un2Var2.a.a());
            layout = jaVar.d.f;
            if (layout.getText() instanceof Spanned) {
            }
            ck2VarArr = null;
            if (ck2VarArr != null) {
            }
            charSequence = jaVar.e;
            if (charSequence instanceof Spanned) {
            }
            jaVar.f = list;
        }
        i4 = i23;
        i5 = i21;
        i6 = i3;
        i7 = (i4 >> 8) & 255;
        if (i7 != 1) {
        }
        i19 = i3;
        i8 = (i4 >> 16) & 255;
        if (i8 == 1) {
        }
        un2Var = un2Var3;
        i10 = i20;
        i11 = i3;
        if (i2 != i9) {
        }
        i12 = i22;
        c = ' ';
        un2Var2 = un2Var;
        truncateAt = truncateAt2;
        a = a(i10, i5, truncateAt, i, i12, i6, i19, i11, charSequence3);
        Layout layout22222 = a.f;
        i13 = i10;
        if (Build.VERSION.SDK_INT < 35) {
        }
        jaVar = this;
        i14 = i;
        i15 = i13;
        i16 = 2;
        int i252222 = a.g;
        if (i2 == i16) {
        }
        jaVar.d = a;
        jaVar.a.s.c(un2Var2.a.c(), (Float.floatToRawIntBits(jaVar.b()) & 4294967295L) | (Float.floatToRawIntBits(jaVar.d()) << c), un2Var2.a.a());
        layout = jaVar.d.f;
        if (layout.getText() instanceof Spanned) {
        }
        ck2VarArr = null;
        if (ck2VarArr != null) {
        }
        charSequence = jaVar.e;
        if (charSequence instanceof Spanned) {
        }
        jaVar.f = list;
    }

    public final zv2 a(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        a22 a22Var;
        float d = d();
        na naVar = this.a;
        sb sbVar = naVar.s;
        int i8 = naVar.x;
        x81 x81Var = naVar.u;
        pw2 pw2Var = naVar.n;
        ka kaVar = la.a;
        j22 j22Var = pw2Var.c;
        return new zv2(charSequence, d, sbVar, i, truncateAt, i8, (j22Var == null || (a22Var = j22Var.b) == null) ? false : a22Var.a, i3, i5, i6, i7, i4, i2, x81Var);
    }

    public final float b() {
        return this.d.a();
    }

    public final long c(w72 w72Var, int i, ch2 ch2Var) {
        wg2 aw0Var;
        int i2;
        int[] iArr;
        RectF J = bd3.J(w72Var);
        int i3 = 0;
        int i4 = (i != 0 && i == 1) ? 1 : 0;
        ia iaVar = new ia(i3, ch2Var);
        zv2 zv2Var = this.d;
        Layout layout = zv2Var.f;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 34) {
            iArr = v1.f(zv2Var, J, i4, iaVar);
        } else {
            fy c = zv2Var.c();
            if (i4 == 1) {
                aw0Var = new tt1(17, layout.getText(), zv2Var.j());
            } else {
                CharSequence text = layout.getText();
                aw0Var = i5 >= 29 ? new aw0(text, zv2Var.a) : new bw0(text);
            }
            wg2 wg2Var = aw0Var;
            int lineForVertical = layout.getLineForVertical((int) J.top);
            if (J.top <= zv2Var.e(lineForVertical) || (lineForVertical = lineForVertical + 1) < zv2Var.g) {
                int i6 = lineForVertical;
                int lineForVertical2 = layout.getLineForVertical((int) J.bottom);
                if (lineForVertical2 != 0 || J.bottom >= zv2Var.g(0)) {
                    int g = ph2.g(zv2Var, layout, c, i6, J, wg2Var, iaVar, true);
                    while (true) {
                        i2 = i6;
                        if (g != -1 || i2 >= lineForVertical2) {
                            break;
                        }
                        i6 = i2 + 1;
                        g = ph2.g(zv2Var, layout, c, i6, J, wg2Var, iaVar, true);
                    }
                    if (g != -1) {
                        int i7 = lineForVertical2;
                        int g2 = ph2.g(zv2Var, layout, c, i7, J, wg2Var, iaVar, false);
                        while (g2 == -1 && i2 < i7) {
                            i7--;
                            g2 = ph2.g(zv2Var, layout, c, i7, J, wg2Var, iaVar, false);
                        }
                        if (g2 != -1) {
                            iArr = new int[]{wg2Var.b(g + 1), wg2Var.d(g2 - 1)};
                        }
                    }
                }
            }
            iArr = null;
        }
        return iArr == null ? jw2.b : th2.a(iArr[0], iArr[1]);
    }

    public final float d() {
        return u10.h(this.c);
    }

    public final void e(ls lsVar) {
        Canvas a = z6.a(lsVar);
        zv2 zv2Var = this.d;
        if (zv2Var.d) {
            a.save();
            a.clipRect(0.0f, 0.0f, d(), b());
        }
        int i = zv2Var.h;
        if (a.getClipBounds(zv2Var.p)) {
            if (i != 0) {
                a.translate(0.0f, i);
            }
            wt2 wt2Var = ew2.a;
            wt2Var.a = a;
            zv2Var.f.draw(wt2Var);
            if (i != 0) {
                a.translate(0.0f, (-1.0f) * i);
            }
        }
        if (zv2Var.d) {
            a.restore();
        }
    }

    public final void f(ls lsVar, long j, dk2 dk2Var, xt2 xt2Var, ae0 ae0Var) {
        sb sbVar = this.a.s;
        int i = sbVar.c;
        sbVar.d(j);
        sbVar.f(dk2Var);
        sbVar.g(xt2Var);
        sbVar.e(ae0Var);
        sbVar.b(3);
        e(lsVar);
        sbVar.b(i);
    }

    public final void g(ls lsVar, cq cqVar, float f, dk2 dk2Var, xt2 xt2Var, ae0 ae0Var) {
        sb sbVar = this.a.s;
        int i = sbVar.c;
        float d = d();
        float b = b();
        sbVar.c(cqVar, (Float.floatToRawIntBits(b) & 4294967295L) | (Float.floatToRawIntBits(d) << 32), f);
        sbVar.f(dk2Var);
        sbVar.g(xt2Var);
        sbVar.e(ae0Var);
        sbVar.b(3);
        e(lsVar);
        sbVar.b(i);
    }
}
