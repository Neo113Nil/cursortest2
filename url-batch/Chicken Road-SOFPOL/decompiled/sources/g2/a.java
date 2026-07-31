package g2;

import android.graphics.Canvas;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final n2.c f2894a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2895b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2896c;

    /* renamed from: d, reason: collision with root package name */
    public final h2.j f2897d;

    /* renamed from: e, reason: collision with root package name */
    public final CharSequence f2898e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f2899f;

    /* JADX WARN: Removed duplicated region for block: B:102:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x027a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(n2.c cVar, int i, int i8, long j7) {
        int i9;
        CharSequence charSequence;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        b0 b0Var;
        int i16;
        int i17;
        int i18;
        char c8;
        b0 b0Var2;
        TextUtils.TruncateAt truncateAt;
        TextUtils.TruncateAt truncateAt2;
        h2.j a8;
        int i19;
        a aVar;
        int i20;
        int i21;
        int i22;
        Layout layout;
        p2.b[] bVarArr;
        CharSequence charSequence2;
        Object obj;
        e1.c cVar2;
        float g3;
        this.f2894a = cVar;
        this.f2895b = i;
        this.f2896c = j7;
        if (r2.a.i(j7) != 0 || r2.a.j(j7) != 0) {
            l2.a.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i < 1) {
            l2.a.a("maxLines should be greater than 0");
        }
        i0 i0Var = cVar.f5307b;
        CharSequence charSequence3 = cVar.f5313h;
        if (i8 == 2) {
            i9 = 0;
            charSequence = charSequence3;
            if (!r2.n.a(i0Var.f2964a.f2910h, r2.o.Q(0))) {
                charSequence = charSequence3;
                if (!r2.n.a(i0Var.f2964a.f2910h, r2.n.f6534c)) {
                    int i23 = i0Var.f2965b.f2993a;
                    charSequence = charSequence3;
                    charSequence = charSequence3;
                    charSequence = charSequence3;
                    if (i23 != Integer.MIN_VALUE && i23 != 5 && i23 != 4) {
                        int length = charSequence3.length();
                        charSequence = charSequence3;
                        if (length != 0) {
                            Spannable spannable = charSequence3 instanceof Spannable ? (Spannable) charSequence3 : null;
                            Spannable spannableString = spannable == null ? new SpannableString(charSequence3) : spannable;
                            boolean c9 = h2.g.c(spannableString, i2.c.class);
                            charSequence = spannableString;
                            if (!c9) {
                                spannableString.setSpan(new i2.c(), spannableString.length() - 1, spannableString.length() - 1, 33);
                                charSequence = spannableString;
                            }
                        }
                    }
                }
            }
        } else {
            i9 = 0;
            charSequence = charSequence3;
        }
        CharSequence charSequence4 = charSequence;
        this.f2898e = charSequence4;
        r rVar = i0Var.f2965b;
        b0 b0Var3 = i0Var.f2964a;
        int i24 = rVar.f2993a;
        int i25 = 3;
        int i26 = i24 == 1 ? 3 : i24 == 2 ? 4 : i24 == 3 ? 2 : (i24 != 5 && i24 == 6) ? 1 : i9;
        int i27 = i24 == 4 ? 1 : i9;
        int i28 = rVar.f3000h == 2 ? Build.VERSION.SDK_INT <= 32 ? 2 : 4 : i9;
        int i29 = rVar.f2999g;
        int i30 = i29 & 255;
        if (i30 != 1) {
            if (i30 == 2) {
                i10 = i29;
                i11 = i27;
                i12 = 1;
            } else if (i30 == 3) {
                i10 = i29;
                i11 = i27;
                i12 = 2;
            }
            i13 = (i10 >> 8) & 255;
            if (i13 != 1) {
                if (i13 == 2) {
                    i25 = 1;
                } else if (i13 == 3) {
                    i25 = 2;
                } else if (i13 == 4) {
                }
                i14 = (i10 >> 16) & 255;
                if (i14 == 1) {
                    i15 = 2;
                } else {
                    i15 = 2;
                    if (i14 == 2) {
                        b0Var = b0Var3;
                        i16 = i26;
                        i17 = 1;
                        if (i8 != i15) {
                            truncateAt2 = TextUtils.TruncateAt.END;
                        } else if (i8 == 5) {
                            truncateAt2 = TextUtils.TruncateAt.MIDDLE;
                        } else {
                            if (i8 != 4) {
                                i18 = i28;
                                c8 = ' ';
                                b0Var2 = b0Var;
                                truncateAt = null;
                                a8 = a(i16, i11, truncateAt, i, i18, i12, i25, i17, charSequence4);
                                Layout layout2 = a8.f3107e;
                                i19 = i16;
                                if (Build.VERSION.SDK_INT < 35 || cVar.f5312g.getLetterSpacing() == 0.0f || (!(i8 == 4 || i8 == 5) || layout2.getEllipsisCount(0) <= 0)) {
                                    aVar = this;
                                    i20 = i;
                                    i21 = i19;
                                    i22 = 2;
                                } else {
                                    int ellipsisStart = layout2.getEllipsisStart(0);
                                    i22 = 2;
                                    CharSequence[] charSequenceArr = {charSequence4.subSequence(0, ellipsisStart), "…", charSequence4.subSequence(layout2.getEllipsisCount(0) + ellipsisStart, charSequence4.length())};
                                    aVar = this;
                                    i20 = i;
                                    i21 = i19;
                                    a8 = aVar.a(i21, i11, truncateAt, i20, i18, i12, i25, i17, TextUtils.concat(charSequenceArr));
                                }
                                int i31 = a8.f3108f;
                                if (i8 == i22 || a8.a() <= r2.a.g(j7) || i20 <= 1) {
                                    aVar.f2897d = a8;
                                } else {
                                    int g7 = r2.a.g(j7);
                                    int i32 = 0;
                                    while (true) {
                                        if (i32 >= i31) {
                                            i32 = i31;
                                            break;
                                        } else if (a8.d(i32) > g7) {
                                            break;
                                        } else {
                                            i32++;
                                        }
                                    }
                                    if (i32 >= 0 && i32 != aVar.f2895b) {
                                        a8 = aVar.a(i21, i11, truncateAt, i32 < 1 ? 1 : i32, i18, i12, i25, i17, aVar.f2898e);
                                    }
                                    aVar.f2897d = a8;
                                }
                                aVar.f2894a.f5312g.c(b0Var2.f2903a.c(), (Float.floatToRawIntBits(aVar.b()) & 4294967295L) | (Float.floatToRawIntBits(aVar.c()) << c8), b0Var2.f2903a.a());
                                layout = aVar.f2897d.f3107e;
                                if (layout.getText() instanceof Spanned) {
                                    CharSequence text = layout.getText();
                                    q6.i.c(text, "null cannot be cast to non-null type android.text.Spanned");
                                    Spanned spanned = (Spanned) text;
                                    if (spanned.nextSpanTransition(-1, spanned.length(), p2.b.class) != spanned.length()) {
                                        CharSequence text2 = layout.getText();
                                        q6.i.c(text2, "null cannot be cast to non-null type android.text.Spanned");
                                        bVarArr = (p2.b[]) ((Spanned) text2).getSpans(0, layout.getText().length(), p2.b.class);
                                        if (bVarArr != null) {
                                            d6.b h8 = q6.i.h(bVarArr);
                                            while (h8.hasNext()) {
                                                ((p2.b) h8.next()).f5734f.setValue(new e1.e((Float.floatToRawIntBits(aVar.b()) & 4294967295L) | (Float.floatToRawIntBits(aVar.c()) << c8)));
                                            }
                                        }
                                        charSequence2 = aVar.f2898e;
                                        if (charSequence2 instanceof Spanned) {
                                            obj = d6.u.f2326d;
                                        } else {
                                            Spanned spanned2 = (Spanned) charSequence2;
                                            Object[] spans = spanned2.getSpans(0, charSequence2.length(), i2.i.class);
                                            ArrayList arrayList = new ArrayList(spans.length);
                                            for (Object obj2 : spans) {
                                                i2.i iVar = (i2.i) obj2;
                                                int spanStart = spanned2.getSpanStart(iVar);
                                                int spanEnd = spanned2.getSpanEnd(iVar);
                                                int lineForOffset = aVar.f2897d.f3107e.getLineForOffset(spanStart);
                                                boolean z3 = lineForOffset >= aVar.f2895b;
                                                boolean z7 = aVar.f2897d.f3107e.getEllipsisCount(lineForOffset) > 0 && spanEnd > aVar.f2897d.f3107e.getEllipsisStart(lineForOffset) + aVar.f2897d.f3107e.getLineStart(lineForOffset);
                                                boolean z8 = spanEnd > aVar.f2897d.e(lineForOffset);
                                                if (z7 || z8 || z3) {
                                                    cVar2 = null;
                                                } else {
                                                    int ordinal = (aVar.f2897d.f3107e.isRtlCharAt(spanStart) ? q2.j.f6053e : q2.j.f6052d).ordinal();
                                                    if (ordinal == 0) {
                                                        g3 = aVar.f2897d.g(spanStart, false);
                                                    } else {
                                                        if (ordinal != 1) {
                                                            throw new a5.c();
                                                        }
                                                        float g8 = aVar.f2897d.g(spanStart, false);
                                                        if (!iVar.f3412g) {
                                                            l2.a.b("PlaceholderSpan is not laid out yet.");
                                                        }
                                                        g3 = g8 - iVar.f3410e;
                                                    }
                                                    if (!iVar.f3412g) {
                                                        l2.a.b("PlaceholderSpan is not laid out yet.");
                                                    }
                                                    float c10 = aVar.f2897d.c(lineForOffset) - iVar.b();
                                                    cVar2 = new e1.c(g3, c10, iVar.f3410e + g3, iVar.b() + c10);
                                                }
                                                arrayList.add(cVar2);
                                            }
                                            obj = arrayList;
                                        }
                                        aVar.f2899f = obj;
                                    }
                                }
                                bVarArr = null;
                                if (bVarArr != null) {
                                }
                                charSequence2 = aVar.f2898e;
                                if (charSequence2 instanceof Spanned) {
                                }
                                aVar.f2899f = obj;
                            }
                            truncateAt2 = TextUtils.TruncateAt.START;
                        }
                        i18 = i28;
                        c8 = ' ';
                        b0Var2 = b0Var;
                        truncateAt = truncateAt2;
                        a8 = a(i16, i11, truncateAt, i, i18, i12, i25, i17, charSequence4);
                        Layout layout22 = a8.f3107e;
                        i19 = i16;
                        if (Build.VERSION.SDK_INT < 35) {
                        }
                        aVar = this;
                        i20 = i;
                        i21 = i19;
                        i22 = 2;
                        int i312 = a8.f3108f;
                        if (i8 == i22) {
                        }
                        aVar.f2897d = a8;
                        aVar.f2894a.f5312g.c(b0Var2.f2903a.c(), (Float.floatToRawIntBits(aVar.b()) & 4294967295L) | (Float.floatToRawIntBits(aVar.c()) << c8), b0Var2.f2903a.a());
                        layout = aVar.f2897d.f3107e;
                        if (layout.getText() instanceof Spanned) {
                        }
                        bVarArr = null;
                        if (bVarArr != null) {
                        }
                        charSequence2 = aVar.f2898e;
                        if (charSequence2 instanceof Spanned) {
                        }
                        aVar.f2899f = obj;
                    }
                }
                b0Var = b0Var3;
                i16 = i26;
                i17 = i9;
                if (i8 != i15) {
                }
                i18 = i28;
                c8 = ' ';
                b0Var2 = b0Var;
                truncateAt = truncateAt2;
                a8 = a(i16, i11, truncateAt, i, i18, i12, i25, i17, charSequence4);
                Layout layout222 = a8.f3107e;
                i19 = i16;
                if (Build.VERSION.SDK_INT < 35) {
                }
                aVar = this;
                i20 = i;
                i21 = i19;
                i22 = 2;
                int i3122 = a8.f3108f;
                if (i8 == i22) {
                }
                aVar.f2897d = a8;
                aVar.f2894a.f5312g.c(b0Var2.f2903a.c(), (Float.floatToRawIntBits(aVar.b()) & 4294967295L) | (Float.floatToRawIntBits(aVar.c()) << c8), b0Var2.f2903a.a());
                layout = aVar.f2897d.f3107e;
                if (layout.getText() instanceof Spanned) {
                }
                bVarArr = null;
                if (bVarArr != null) {
                }
                charSequence2 = aVar.f2898e;
                if (charSequence2 instanceof Spanned) {
                }
                aVar.f2899f = obj;
            }
            i25 = i9;
            i14 = (i10 >> 16) & 255;
            if (i14 == 1) {
            }
            b0Var = b0Var3;
            i16 = i26;
            i17 = i9;
            if (i8 != i15) {
            }
            i18 = i28;
            c8 = ' ';
            b0Var2 = b0Var;
            truncateAt = truncateAt2;
            a8 = a(i16, i11, truncateAt, i, i18, i12, i25, i17, charSequence4);
            Layout layout2222 = a8.f3107e;
            i19 = i16;
            if (Build.VERSION.SDK_INT < 35) {
            }
            aVar = this;
            i20 = i;
            i21 = i19;
            i22 = 2;
            int i31222 = a8.f3108f;
            if (i8 == i22) {
            }
            aVar.f2897d = a8;
            aVar.f2894a.f5312g.c(b0Var2.f2903a.c(), (Float.floatToRawIntBits(aVar.b()) & 4294967295L) | (Float.floatToRawIntBits(aVar.c()) << c8), b0Var2.f2903a.a());
            layout = aVar.f2897d.f3107e;
            if (layout.getText() instanceof Spanned) {
            }
            bVarArr = null;
            if (bVarArr != null) {
            }
            charSequence2 = aVar.f2898e;
            if (charSequence2 instanceof Spanned) {
            }
            aVar.f2899f = obj;
        }
        i10 = i29;
        i11 = i27;
        i12 = i9;
        i13 = (i10 >> 8) & 255;
        if (i13 != 1) {
        }
        i25 = i9;
        i14 = (i10 >> 16) & 255;
        if (i14 == 1) {
        }
        b0Var = b0Var3;
        i16 = i26;
        i17 = i9;
        if (i8 != i15) {
        }
        i18 = i28;
        c8 = ' ';
        b0Var2 = b0Var;
        truncateAt = truncateAt2;
        a8 = a(i16, i11, truncateAt, i, i18, i12, i25, i17, charSequence4);
        Layout layout22222 = a8.f3107e;
        i19 = i16;
        if (Build.VERSION.SDK_INT < 35) {
        }
        aVar = this;
        i20 = i;
        i21 = i19;
        i22 = 2;
        int i312222 = a8.f3108f;
        if (i8 == i22) {
        }
        aVar.f2897d = a8;
        aVar.f2894a.f5312g.c(b0Var2.f2903a.c(), (Float.floatToRawIntBits(aVar.b()) & 4294967295L) | (Float.floatToRawIntBits(aVar.c()) << c8), b0Var2.f2903a.a());
        layout = aVar.f2897d.f3107e;
        if (layout.getText() instanceof Spanned) {
        }
        bVarArr = null;
        if (bVarArr != null) {
        }
        charSequence2 = aVar.f2898e;
        if (charSequence2 instanceof Spanned) {
        }
        aVar.f2899f = obj;
    }

    public final h2.j a(int i, int i8, TextUtils.TruncateAt truncateAt, int i9, int i10, int i11, int i12, int i13, CharSequence charSequence) {
        t tVar;
        float c8 = c();
        n2.c cVar = this.f2894a;
        n2.e eVar = cVar.f5312g;
        int i14 = cVar.f5316l;
        h2.e eVar2 = cVar.i;
        i0 i0Var = cVar.f5307b;
        n2.a aVar = n2.b.f5305a;
        u uVar = i0Var.f2966c;
        return new h2.j(charSequence, c8, eVar, i, truncateAt, i14, (uVar == null || (tVar = uVar.f3004a) == null) ? false : tVar.f3003a, i9, i11, i12, i13, i10, i8, eVar2);
    }

    public final float b() {
        return this.f2897d.a();
    }

    public final float c() {
        return r2.a.h(this.f2896c);
    }

    public final void d(f1.q qVar) {
        Canvas a8 = f1.c.a(qVar);
        h2.j jVar = this.f2897d;
        if (jVar.f3106d) {
            a8.save();
            a8.clipRect(0.0f, 0.0f, c(), b());
        }
        int i = jVar.f3109g;
        if (a8.getClipBounds(jVar.f3116o)) {
            if (i != 0) {
                a8.translate(0.0f, i);
            }
            h2.i iVar = h2.k.f3118a;
            iVar.f3102a = a8;
            jVar.f3107e.draw(iVar);
            if (i != 0) {
                a8.translate(0.0f, (-1) * i);
            }
        }
        if (jVar.f3106d) {
            a8.restore();
        }
    }
}
