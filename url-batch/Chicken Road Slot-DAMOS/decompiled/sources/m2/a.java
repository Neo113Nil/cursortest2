package m2;

import android.graphics.Canvas;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final t2.c f6416a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6417b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6418c;

    /* renamed from: d, reason: collision with root package name */
    public final n2.h f6419d;

    /* renamed from: e, reason: collision with root package name */
    public final CharSequence f6420e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f6421f;

    /* JADX WARN: Removed duplicated region for block: B:101:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x026e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(t2.c cVar, int i3, int i10, long j) {
        int i11;
        CharSequence charSequence;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        a0 a0Var;
        int i18;
        int i19;
        int i20;
        char c10;
        a0 a0Var2;
        TextUtils.TruncateAt truncateAt;
        TextUtils.TruncateAt truncateAt2;
        n2.h a9;
        int i21;
        a aVar;
        int i22;
        int i23;
        int i24;
        Layout layout;
        v2.b[] bVarArr;
        CharSequence charSequence2;
        Object obj;
        j1.c cVar2;
        float h10;
        int c11;
        float g;
        int c12;
        this.f6416a = cVar;
        this.f6417b = i3;
        this.f6418c = j;
        if (x2.a.i(j) != 0 || x2.a.j(j) != 0) {
            r2.a.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i3 < 1) {
            r2.a.a("maxLines should be greater than 0");
        }
        h0 h0Var = cVar.f9227e;
        CharSequence charSequence3 = cVar.f9233v;
        if (i10 == 2) {
            i11 = 0;
            charSequence = charSequence3;
            if (!x2.n.a(h0Var.f6481a.f6428h, z4.v.c(0))) {
                charSequence = charSequence3;
                if (!x2.n.a(h0Var.f6481a.f6428h, x2.n.f10335c)) {
                    int i25 = h0Var.f6482b.f6501a;
                    charSequence = charSequence3;
                    charSequence = charSequence3;
                    charSequence = charSequence3;
                    if (i25 != 0 && i25 != 5 && i25 != 4) {
                        int length = charSequence3.length();
                        charSequence = charSequence3;
                        if (length != 0) {
                            Spannable spannable = charSequence3 instanceof Spannable ? (Spannable) charSequence3 : null;
                            Spannable spannableString = spannable == null ? new SpannableString(charSequence3) : spannable;
                            boolean c13 = n2.e.c(spannableString, o2.c.class);
                            charSequence = spannableString;
                            if (!c13) {
                                spannableString.setSpan(new o2.c(), spannableString.length() - 1, spannableString.length() - 1, 33);
                                charSequence = spannableString;
                            }
                        }
                    }
                }
            }
        } else {
            i11 = 0;
            charSequence = charSequence3;
        }
        CharSequence charSequence4 = charSequence;
        this.f6420e = charSequence4;
        p pVar = h0Var.f6482b;
        a0 a0Var3 = h0Var.f6481a;
        int i26 = pVar.f6501a;
        int i27 = 3;
        int i28 = i26 == 1 ? 3 : i26 == 2 ? 4 : i26 == 3 ? 2 : (i26 != 5 && i26 == 6) ? 1 : i11;
        int i29 = i26 == 4 ? 1 : i11;
        int i30 = pVar.f6507h == 2 ? Build.VERSION.SDK_INT <= 32 ? 2 : 4 : i11;
        int i31 = pVar.g;
        int i32 = i31 & 255;
        if (i32 != 1) {
            if (i32 == 2) {
                i12 = i31;
                i13 = i29;
                i14 = 1;
            } else if (i32 == 3) {
                i12 = i31;
                i13 = i29;
                i14 = 2;
            }
            i15 = (i12 >> 8) & 255;
            if (i15 != 1) {
                if (i15 == 2) {
                    i27 = 1;
                } else if (i15 == 3) {
                    i27 = 2;
                } else if (i15 == 4) {
                }
                i16 = (i12 >> 16) & 255;
                if (i16 == 1) {
                    i17 = 2;
                } else {
                    i17 = 2;
                    if (i16 == 2) {
                        a0Var = a0Var3;
                        i18 = i28;
                        i19 = 1;
                        if (i10 != i17) {
                            truncateAt2 = TextUtils.TruncateAt.END;
                        } else if (i10 == 5) {
                            truncateAt2 = TextUtils.TruncateAt.MIDDLE;
                        } else {
                            if (i10 != 4) {
                                i20 = i30;
                                c10 = ' ';
                                a0Var2 = a0Var;
                                truncateAt = null;
                                a9 = a(i18, i13, truncateAt, i3, i20, i14, i27, i19, charSequence4);
                                Layout layout2 = a9.f7011e;
                                i21 = i18;
                                if (Build.VERSION.SDK_INT < 35 || cVar.f9232u.getLetterSpacing() == 0.0f || (!(i10 == 4 || i10 == 5) || layout2.getEllipsisCount(0) <= 0)) {
                                    aVar = this;
                                    i22 = i3;
                                    i23 = i21;
                                    i24 = 2;
                                } else {
                                    int ellipsisStart = layout2.getEllipsisStart(0);
                                    i24 = 2;
                                    CharSequence[] charSequenceArr = {charSequence4.subSequence(0, ellipsisStart), "…", charSequence4.subSequence(layout2.getEllipsisCount(0) + ellipsisStart, charSequence4.length())};
                                    aVar = this;
                                    i22 = i3;
                                    i23 = i21;
                                    a9 = aVar.a(i23, i13, truncateAt, i22, i20, i14, i27, i19, TextUtils.concat(charSequenceArr));
                                }
                                int i33 = a9.f7012f;
                                if (i10 == i24 || a9.a() <= x2.a.g(j) || i22 <= 1) {
                                    aVar.f6419d = a9;
                                } else {
                                    int g2 = x2.a.g(j);
                                    int i34 = 0;
                                    while (true) {
                                        if (i34 >= i33) {
                                            i34 = i33;
                                            break;
                                        } else if (a9.d(i34) > g2) {
                                            break;
                                        } else {
                                            i34++;
                                        }
                                    }
                                    if (i34 >= 0 && i34 != aVar.f6417b) {
                                        a9 = aVar.a(i23, i13, truncateAt, i34 < 1 ? 1 : i34, i20, i14, i27, i19, aVar.f6420e);
                                    }
                                    aVar.f6419d = a9;
                                }
                                aVar.f6416a.f9232u.c(a0Var2.f6422a.c(), (Float.floatToRawIntBits(aVar.b()) & 4294967295L) | (Float.floatToRawIntBits(aVar.c()) << c10), a0Var2.f6422a.a());
                                layout = aVar.f6419d.f7011e;
                                if (layout.getText() instanceof Spanned) {
                                    CharSequence text = layout.getText();
                                    text.getClass();
                                    Spanned spanned = (Spanned) text;
                                    if (spanned.nextSpanTransition(-1, spanned.length(), v2.b.class) != spanned.length()) {
                                        CharSequence text2 = layout.getText();
                                        text2.getClass();
                                        bVarArr = (v2.b[]) ((Spanned) text2).getSpans(0, layout.getText().length(), v2.b.class);
                                        if (bVarArr != null) {
                                            for (v2.b bVar : bVarArr) {
                                                bVar.f9950i.setValue(new j1.e((Float.floatToRawIntBits(aVar.b()) & 4294967295L) | (Float.floatToRawIntBits(aVar.c()) << c10)));
                                            }
                                        }
                                        charSequence2 = aVar.f6420e;
                                        if (charSequence2 instanceof Spanned) {
                                            obj = kotlin.collections.j0.f5574d;
                                        } else {
                                            Spanned spanned2 = (Spanned) charSequence2;
                                            Object[] spans = spanned2.getSpans(0, charSequence2.length(), o2.i.class);
                                            ArrayList arrayList = new ArrayList(spans.length);
                                            for (Object obj2 : spans) {
                                                o2.i iVar = (o2.i) obj2;
                                                int spanStart = spanned2.getSpanStart(iVar);
                                                int spanEnd = spanned2.getSpanEnd(iVar);
                                                int lineForOffset = aVar.f6419d.f7011e.getLineForOffset(spanStart);
                                                boolean z10 = lineForOffset >= aVar.f6417b;
                                                boolean z11 = aVar.f6419d.f7011e.getEllipsisCount(lineForOffset) > 0 && spanEnd > aVar.f6419d.f7011e.getEllipsisStart(lineForOffset) + aVar.f6419d.f7011e.getLineStart(lineForOffset);
                                                boolean z12 = spanEnd > aVar.f6419d.e(lineForOffset);
                                                if (z11 || z12 || z10) {
                                                    cVar2 = null;
                                                } else {
                                                    boolean z13 = aVar.f6419d.f7011e.getParagraphDirection(lineForOffset) == 1;
                                                    boolean isRtlCharAt = aVar.f6419d.f7011e.isRtlCharAt(spanStart);
                                                    if (!z13 || isRtlCharAt) {
                                                        if (z13 && isRtlCharAt) {
                                                            g = aVar.f6419d.h(spanStart, false);
                                                            c12 = iVar.c();
                                                        } else {
                                                            n2.h hVar = aVar.f6419d;
                                                            if (isRtlCharAt) {
                                                                g = hVar.g(spanStart, false);
                                                                c12 = iVar.c();
                                                            } else {
                                                                h10 = hVar.h(spanStart, false);
                                                                c11 = iVar.c();
                                                            }
                                                        }
                                                        h10 = g - c12;
                                                        n2.h hVar2 = aVar.f6419d;
                                                        iVar.getClass();
                                                        float c14 = hVar2.c(lineForOffset) - iVar.b();
                                                        cVar2 = new j1.c(h10, c14, g, iVar.b() + c14);
                                                    } else {
                                                        h10 = aVar.f6419d.g(spanStart, false);
                                                        c11 = iVar.c();
                                                    }
                                                    g = c11 + h10;
                                                    n2.h hVar22 = aVar.f6419d;
                                                    iVar.getClass();
                                                    float c142 = hVar22.c(lineForOffset) - iVar.b();
                                                    cVar2 = new j1.c(h10, c142, g, iVar.b() + c142);
                                                }
                                                arrayList.add(cVar2);
                                            }
                                            obj = arrayList;
                                        }
                                        aVar.f6421f = obj;
                                    }
                                }
                                bVarArr = null;
                                if (bVarArr != null) {
                                }
                                charSequence2 = aVar.f6420e;
                                if (charSequence2 instanceof Spanned) {
                                }
                                aVar.f6421f = obj;
                            }
                            truncateAt2 = TextUtils.TruncateAt.START;
                        }
                        i20 = i30;
                        c10 = ' ';
                        a0Var2 = a0Var;
                        truncateAt = truncateAt2;
                        a9 = a(i18, i13, truncateAt, i3, i20, i14, i27, i19, charSequence4);
                        Layout layout22 = a9.f7011e;
                        i21 = i18;
                        if (Build.VERSION.SDK_INT < 35) {
                        }
                        aVar = this;
                        i22 = i3;
                        i23 = i21;
                        i24 = 2;
                        int i332 = a9.f7012f;
                        if (i10 == i24) {
                        }
                        aVar.f6419d = a9;
                        aVar.f6416a.f9232u.c(a0Var2.f6422a.c(), (Float.floatToRawIntBits(aVar.b()) & 4294967295L) | (Float.floatToRawIntBits(aVar.c()) << c10), a0Var2.f6422a.a());
                        layout = aVar.f6419d.f7011e;
                        if (layout.getText() instanceof Spanned) {
                        }
                        bVarArr = null;
                        if (bVarArr != null) {
                        }
                        charSequence2 = aVar.f6420e;
                        if (charSequence2 instanceof Spanned) {
                        }
                        aVar.f6421f = obj;
                    }
                }
                a0Var = a0Var3;
                i18 = i28;
                i19 = i11;
                if (i10 != i17) {
                }
                i20 = i30;
                c10 = ' ';
                a0Var2 = a0Var;
                truncateAt = truncateAt2;
                a9 = a(i18, i13, truncateAt, i3, i20, i14, i27, i19, charSequence4);
                Layout layout222 = a9.f7011e;
                i21 = i18;
                if (Build.VERSION.SDK_INT < 35) {
                }
                aVar = this;
                i22 = i3;
                i23 = i21;
                i24 = 2;
                int i3322 = a9.f7012f;
                if (i10 == i24) {
                }
                aVar.f6419d = a9;
                aVar.f6416a.f9232u.c(a0Var2.f6422a.c(), (Float.floatToRawIntBits(aVar.b()) & 4294967295L) | (Float.floatToRawIntBits(aVar.c()) << c10), a0Var2.f6422a.a());
                layout = aVar.f6419d.f7011e;
                if (layout.getText() instanceof Spanned) {
                }
                bVarArr = null;
                if (bVarArr != null) {
                }
                charSequence2 = aVar.f6420e;
                if (charSequence2 instanceof Spanned) {
                }
                aVar.f6421f = obj;
            }
            i27 = i11;
            i16 = (i12 >> 16) & 255;
            if (i16 == 1) {
            }
            a0Var = a0Var3;
            i18 = i28;
            i19 = i11;
            if (i10 != i17) {
            }
            i20 = i30;
            c10 = ' ';
            a0Var2 = a0Var;
            truncateAt = truncateAt2;
            a9 = a(i18, i13, truncateAt, i3, i20, i14, i27, i19, charSequence4);
            Layout layout2222 = a9.f7011e;
            i21 = i18;
            if (Build.VERSION.SDK_INT < 35) {
            }
            aVar = this;
            i22 = i3;
            i23 = i21;
            i24 = 2;
            int i33222 = a9.f7012f;
            if (i10 == i24) {
            }
            aVar.f6419d = a9;
            aVar.f6416a.f9232u.c(a0Var2.f6422a.c(), (Float.floatToRawIntBits(aVar.b()) & 4294967295L) | (Float.floatToRawIntBits(aVar.c()) << c10), a0Var2.f6422a.a());
            layout = aVar.f6419d.f7011e;
            if (layout.getText() instanceof Spanned) {
            }
            bVarArr = null;
            if (bVarArr != null) {
            }
            charSequence2 = aVar.f6420e;
            if (charSequence2 instanceof Spanned) {
            }
            aVar.f6421f = obj;
        }
        i12 = i31;
        i13 = i29;
        i14 = i11;
        i15 = (i12 >> 8) & 255;
        if (i15 != 1) {
        }
        i27 = i11;
        i16 = (i12 >> 16) & 255;
        if (i16 == 1) {
        }
        a0Var = a0Var3;
        i18 = i28;
        i19 = i11;
        if (i10 != i17) {
        }
        i20 = i30;
        c10 = ' ';
        a0Var2 = a0Var;
        truncateAt = truncateAt2;
        a9 = a(i18, i13, truncateAt, i3, i20, i14, i27, i19, charSequence4);
        Layout layout22222 = a9.f7011e;
        i21 = i18;
        if (Build.VERSION.SDK_INT < 35) {
        }
        aVar = this;
        i22 = i3;
        i23 = i21;
        i24 = 2;
        int i332222 = a9.f7012f;
        if (i10 == i24) {
        }
        aVar.f6419d = a9;
        aVar.f6416a.f9232u.c(a0Var2.f6422a.c(), (Float.floatToRawIntBits(aVar.b()) & 4294967295L) | (Float.floatToRawIntBits(aVar.c()) << c10), a0Var2.f6422a.a());
        layout = aVar.f6419d.f7011e;
        if (layout.getText() instanceof Spanned) {
        }
        bVarArr = null;
        if (bVarArr != null) {
        }
        charSequence2 = aVar.f6420e;
        if (charSequence2 instanceof Spanned) {
        }
        aVar.f6421f = obj;
    }

    public final n2.h a(int i3, int i10, TextUtils.TruncateAt truncateAt, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence) {
        r rVar;
        float c10 = c();
        t2.c cVar = this.f6416a;
        t2.d dVar = cVar.f9232u;
        int i16 = cVar.f9237z;
        n2.d dVar2 = cVar.f9234w;
        h0 h0Var = cVar.f9227e;
        t2.a aVar = t2.b.f9225a;
        s sVar = h0Var.f6483c;
        return new n2.h(charSequence, c10, dVar, i3, truncateAt, i16, (sVar == null || (rVar = sVar.f6513a) == null) ? false : rVar.f6511a, i11, i13, i14, i15, i12, i10, dVar2);
    }

    public final float b() {
        return this.f6419d.a();
    }

    public final float c() {
        return x2.a.h(this.f6418c);
    }

    public final void d(k1.n nVar) {
        Canvas a9 = k1.c.a(nVar);
        n2.h hVar = this.f6419d;
        if (hVar.f7010d) {
            a9.save();
            a9.clipRect(0.0f, 0.0f, c(), b());
        }
        int i3 = hVar.g;
        if (a9.getClipBounds(hVar.f7019o)) {
            if (i3 != 0) {
                a9.translate(0.0f, i3);
            }
            ThreadLocal threadLocal = n2.i.f7021a;
            Object obj = threadLocal.get();
            if (obj == null) {
                obj = new n2.g();
                threadLocal.set(obj);
            }
            n2.g gVar = (n2.g) obj;
            gVar.f7006a = a9;
            try {
                hVar.f7011e.draw(gVar);
                if (i3 != 0) {
                    a9.translate(0.0f, (-1) * i3);
                }
            } finally {
                gVar.f7006a = null;
            }
        }
        if (hVar.f7010d) {
            a9.restore();
        }
    }
}
