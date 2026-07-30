package defpackage;

import android.graphics.Canvas;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import com.appsflyer.internal.l;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class x5 {
    public final b6 a;
    public final int b;
    public final long c;
    public final fh1 d;
    public final CharSequence e;
    public final List f;

    /* JADX WARN: Removed duplicated region for block: B:103:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0273  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public x5(b6 b6Var, int i, int i2, long j) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        jc1 jc1Var;
        int i10;
        int i11;
        int i12;
        char c;
        jc1 jc1Var2;
        TextUtils.TruncateAt truncateAt;
        TextUtils.TruncateAt truncateAt2;
        fh1 a;
        int i13;
        x5 x5Var;
        int i14;
        int i15;
        int i16;
        Layout layout;
        r91[] r91VarArr;
        CharSequence charSequence;
        List list;
        s11 s11Var;
        float g;
        int i17;
        this.a = b6Var;
        this.b = i;
        this.c = j;
        if (mm.i(j) != 0 || mm.j(j) != 0) {
            p80.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i < 1) {
            p80.a("maxLines should be greater than 0");
        }
        th1 th1Var = b6Var.e;
        CharSequence charSequence2 = b6Var.l;
        if (i2 == 2) {
            i3 = 0;
            if (!wh1.a(th1Var.a.h, t80.x(0)) && !wh1.a(th1Var.a.h, wh1.c) && (i17 = th1Var.b.a) != 0 && i17 != 5 && i17 != 4 && charSequence2.length() != 0) {
                Spannable spannable = charSequence2 instanceof Spannable ? (Spannable) charSequence2 : null;
                spannable = spannable == null ? new SpannableString(charSequence2) : spannable;
                if (!xa0.o(spannable, p70.class)) {
                    spannable.setSpan(new p70(), spannable.length() - 1, spannable.length() - 1, 33);
                }
                charSequence2 = spannable;
            }
        } else {
            i3 = 0;
        }
        CharSequence charSequence3 = charSequence2;
        this.e = charSequence3;
        uu0 uu0Var = th1Var.b;
        jc1 jc1Var3 = th1Var.a;
        int i18 = uu0Var.a;
        int i19 = 3;
        int i20 = i18 == 1 ? 3 : i18 == 2 ? 4 : i18 == 3 ? 2 : (i18 != 5 && i18 == 6) ? 1 : i3;
        int i21 = i18 == 4 ? 1 : i3;
        int i22 = uu0Var.h == 2 ? Build.VERSION.SDK_INT <= 32 ? 2 : 4 : i3;
        int i23 = uu0Var.g;
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
                        jc1Var = jc1Var3;
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
                                jc1Var2 = jc1Var;
                                truncateAt = null;
                                a = a(i10, i5, truncateAt, i, i12, i6, i19, i11, charSequence3);
                                Layout layout2 = a.e;
                                i13 = i10;
                                if (Build.VERSION.SDK_INT < 35 || b6Var.k.getLetterSpacing() == 0.0f || (!(i2 == 4 || i2 == 5) || layout2.getEllipsisCount(0) <= 0)) {
                                    x5Var = this;
                                    i14 = i;
                                    i15 = i13;
                                    i16 = 2;
                                } else {
                                    int ellipsisStart = layout2.getEllipsisStart(0);
                                    i16 = 2;
                                    CharSequence[] charSequenceArr = {charSequence3.subSequence(0, ellipsisStart), "…", charSequence3.subSequence(layout2.getEllipsisCount(0) + ellipsisStart, charSequence3.length())};
                                    x5Var = this;
                                    i14 = i;
                                    i15 = i13;
                                    a = x5Var.a(i15, i5, truncateAt, i14, i12, i6, i19, i11, TextUtils.concat(charSequenceArr));
                                }
                                int i25 = a.f;
                                if (i2 == i16 || a.a() <= mm.g(j) || i14 <= 1) {
                                    x5Var.d = a;
                                } else {
                                    int g2 = mm.g(j);
                                    int i26 = 0;
                                    while (true) {
                                        if (i26 >= i25) {
                                            i26 = i25;
                                            break;
                                        } else if (a.d(i26) > g2) {
                                            break;
                                        } else {
                                            i26++;
                                        }
                                    }
                                    if (i26 >= 0 && i26 != x5Var.b) {
                                        a = x5Var.a(i15, i5, truncateAt, i26 < 1 ? 1 : i26, i12, i6, i19, i11, x5Var.e);
                                    }
                                    x5Var.d = a;
                                }
                                x5Var.a.k.c(jc1Var2.a.j(), (Float.floatToRawIntBits(x5Var.b()) & 4294967295L) | (Float.floatToRawIntBits(x5Var.c()) << c), jc1Var2.a.k());
                                layout = x5Var.d.e;
                                if (layout.getText() instanceof Spanned) {
                                    CharSequence text = layout.getText();
                                    text.getClass();
                                    Spanned spanned = (Spanned) text;
                                    if (spanned.nextSpanTransition(-1, spanned.length(), r91.class) != spanned.length()) {
                                        CharSequence text2 = layout.getText();
                                        text2.getClass();
                                        r91VarArr = (r91[]) ((Spanned) text2).getSpans(0, layout.getText().length(), r91.class);
                                        if (r91VarArr != null) {
                                            for (r91 r91Var : r91VarArr) {
                                                r91Var.g.setValue(new va1((Float.floatToRawIntBits(x5Var.b()) & 4294967295L) | (Float.floatToRawIntBits(x5Var.c()) << c)));
                                            }
                                        }
                                        charSequence = x5Var.e;
                                        if (charSequence instanceof Spanned) {
                                            list = nv.d;
                                        } else {
                                            Spanned spanned2 = (Spanned) charSequence;
                                            Object[] spans = spanned2.getSpans(0, charSequence.length(), cx0.class);
                                            ArrayList arrayList = new ArrayList(spans.length);
                                            for (Object obj : spans) {
                                                cx0 cx0Var = (cx0) obj;
                                                int spanStart = spanned2.getSpanStart(cx0Var);
                                                int spanEnd = spanned2.getSpanEnd(cx0Var);
                                                int lineForOffset = x5Var.d.e.getLineForOffset(spanStart);
                                                boolean z = lineForOffset >= x5Var.b;
                                                boolean z2 = x5Var.d.e.getEllipsisCount(lineForOffset) > 0 && spanEnd > x5Var.d.e.getEllipsisStart(lineForOffset) + x5Var.d.e.getLineStart(lineForOffset);
                                                boolean z3 = spanEnd > x5Var.d.e(lineForOffset);
                                                if (z2 || z3 || z) {
                                                    s11Var = null;
                                                } else {
                                                    int ordinal = (x5Var.d.e.isRtlCharAt(spanStart) ? b31.e : b31.d).ordinal();
                                                    if (ordinal == 0) {
                                                        g = x5Var.d.g(spanStart, false);
                                                    } else {
                                                        if (ordinal != 1) {
                                                            l.a();
                                                            throw null;
                                                        }
                                                        float g3 = x5Var.d.g(spanStart, false);
                                                        if (!cx0Var.h) {
                                                            p80.b("PlaceholderSpan is not laid out yet.");
                                                        }
                                                        g = g3 - cx0Var.e;
                                                    }
                                                    if (!cx0Var.h) {
                                                        p80.b("PlaceholderSpan is not laid out yet.");
                                                    }
                                                    float c2 = x5Var.d.c(lineForOffset) - cx0Var.b();
                                                    s11Var = new s11(g, c2, cx0Var.e + g, cx0Var.b() + c2);
                                                }
                                                arrayList.add(s11Var);
                                            }
                                            list = arrayList;
                                        }
                                        x5Var.f = list;
                                    }
                                }
                                r91VarArr = null;
                                if (r91VarArr != null) {
                                }
                                charSequence = x5Var.e;
                                if (charSequence instanceof Spanned) {
                                }
                                x5Var.f = list;
                            }
                            truncateAt2 = TextUtils.TruncateAt.START;
                        }
                        i12 = i22;
                        c = ' ';
                        jc1Var2 = jc1Var;
                        truncateAt = truncateAt2;
                        a = a(i10, i5, truncateAt, i, i12, i6, i19, i11, charSequence3);
                        Layout layout22 = a.e;
                        i13 = i10;
                        if (Build.VERSION.SDK_INT < 35) {
                        }
                        x5Var = this;
                        i14 = i;
                        i15 = i13;
                        i16 = 2;
                        int i252 = a.f;
                        if (i2 == i16) {
                        }
                        x5Var.d = a;
                        x5Var.a.k.c(jc1Var2.a.j(), (Float.floatToRawIntBits(x5Var.b()) & 4294967295L) | (Float.floatToRawIntBits(x5Var.c()) << c), jc1Var2.a.k());
                        layout = x5Var.d.e;
                        if (layout.getText() instanceof Spanned) {
                        }
                        r91VarArr = null;
                        if (r91VarArr != null) {
                        }
                        charSequence = x5Var.e;
                        if (charSequence instanceof Spanned) {
                        }
                        x5Var.f = list;
                    }
                }
                jc1Var = jc1Var3;
                i10 = i20;
                i11 = i3;
                if (i2 != i9) {
                }
                i12 = i22;
                c = ' ';
                jc1Var2 = jc1Var;
                truncateAt = truncateAt2;
                a = a(i10, i5, truncateAt, i, i12, i6, i19, i11, charSequence3);
                Layout layout222 = a.e;
                i13 = i10;
                if (Build.VERSION.SDK_INT < 35) {
                }
                x5Var = this;
                i14 = i;
                i15 = i13;
                i16 = 2;
                int i2522 = a.f;
                if (i2 == i16) {
                }
                x5Var.d = a;
                x5Var.a.k.c(jc1Var2.a.j(), (Float.floatToRawIntBits(x5Var.b()) & 4294967295L) | (Float.floatToRawIntBits(x5Var.c()) << c), jc1Var2.a.k());
                layout = x5Var.d.e;
                if (layout.getText() instanceof Spanned) {
                }
                r91VarArr = null;
                if (r91VarArr != null) {
                }
                charSequence = x5Var.e;
                if (charSequence instanceof Spanned) {
                }
                x5Var.f = list;
            }
            i19 = i3;
            i8 = (i4 >> 16) & 255;
            if (i8 == 1) {
            }
            jc1Var = jc1Var3;
            i10 = i20;
            i11 = i3;
            if (i2 != i9) {
            }
            i12 = i22;
            c = ' ';
            jc1Var2 = jc1Var;
            truncateAt = truncateAt2;
            a = a(i10, i5, truncateAt, i, i12, i6, i19, i11, charSequence3);
            Layout layout2222 = a.e;
            i13 = i10;
            if (Build.VERSION.SDK_INT < 35) {
            }
            x5Var = this;
            i14 = i;
            i15 = i13;
            i16 = 2;
            int i25222 = a.f;
            if (i2 == i16) {
            }
            x5Var.d = a;
            x5Var.a.k.c(jc1Var2.a.j(), (Float.floatToRawIntBits(x5Var.b()) & 4294967295L) | (Float.floatToRawIntBits(x5Var.c()) << c), jc1Var2.a.k());
            layout = x5Var.d.e;
            if (layout.getText() instanceof Spanned) {
            }
            r91VarArr = null;
            if (r91VarArr != null) {
            }
            charSequence = x5Var.e;
            if (charSequence instanceof Spanned) {
            }
            x5Var.f = list;
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
        jc1Var = jc1Var3;
        i10 = i20;
        i11 = i3;
        if (i2 != i9) {
        }
        i12 = i22;
        c = ' ';
        jc1Var2 = jc1Var;
        truncateAt = truncateAt2;
        a = a(i10, i5, truncateAt, i, i12, i6, i19, i11, charSequence3);
        Layout layout22222 = a.e;
        i13 = i10;
        if (Build.VERSION.SDK_INT < 35) {
        }
        x5Var = this;
        i14 = i;
        i15 = i13;
        i16 = 2;
        int i252222 = a.f;
        if (i2 == i16) {
        }
        x5Var.d = a;
        x5Var.a.k.c(jc1Var2.a.j(), (Float.floatToRawIntBits(x5Var.b()) & 4294967295L) | (Float.floatToRawIntBits(x5Var.c()) << c), jc1Var2.a.k());
        layout = x5Var.d.e;
        if (layout.getText() instanceof Spanned) {
        }
        r91VarArr = null;
        if (r91VarArr != null) {
        }
        charSequence = x5Var.e;
        if (charSequence instanceof Spanned) {
        }
        x5Var.f = list;
    }

    public final fh1 a(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        hx0 hx0Var;
        float c = c();
        b6 b6Var = this.a;
        l6 l6Var = b6Var.k;
        int i8 = b6Var.p;
        yc0 yc0Var = b6Var.m;
        th1 th1Var = b6Var.e;
        y5 y5Var = z5.a;
        kx0 kx0Var = th1Var.c;
        return new fh1(charSequence, c, l6Var, i, truncateAt, i8, (kx0Var == null || (hx0Var = kx0Var.a) == null) ? false : hx0Var.a, i3, i5, i6, i7, i4, i2, yc0Var);
    }

    public final float b() {
        return this.d.a();
    }

    public final float c() {
        return mm.h(this.c);
    }

    public final void d(xf xfVar) {
        Canvas a = k3.a(xfVar);
        fh1 fh1Var = this.d;
        if (fh1Var.d) {
            a.save();
            a.clipRect(0.0f, 0.0f, c(), b());
        }
        int i = fh1Var.g;
        if (a.getClipBounds(fh1Var.o)) {
            if (i != 0) {
                a.translate(0.0f, i);
            }
            ThreadLocal threadLocal = ih1.a;
            Object obj = threadLocal.get();
            if (obj == null) {
                obj = new vg1();
                threadLocal.set(obj);
            }
            vg1 vg1Var = (vg1) obj;
            vg1Var.a = a;
            try {
                fh1Var.e.draw(vg1Var);
                if (i != 0) {
                    a.translate(0.0f, (-1.0f) * i);
                }
            } finally {
                vg1Var.a = null;
            }
        }
        if (fh1Var.d) {
            a.restore();
        }
    }
}
