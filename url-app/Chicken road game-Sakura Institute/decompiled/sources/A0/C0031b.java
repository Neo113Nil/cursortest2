package A0;

import A.C0022s;
import B0.C0089c;
import M2.C0249a;
import Z.AbstractC0307d;
import Z.AbstractC0319p;
import Z.O;
import a.AbstractC0345a;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import b0.AbstractC0497e;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import y2.C1338m;
import z2.C1405I;

/* renamed from: A0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0031b {

    /* renamed from: a, reason: collision with root package name */
    public final I0.c f310a;

    /* renamed from: b, reason: collision with root package name */
    public final int f311b;

    /* renamed from: c, reason: collision with root package name */
    public final long f312c;

    /* renamed from: d, reason: collision with root package name */
    public final B0.F f313d;

    /* renamed from: e, reason: collision with root package name */
    public final CharSequence f314e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f315f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0126 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x022c  */
    /* JADX WARN: Type inference failed for: r0v40, types: [android.text.Spannable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0031b(I0.c cVar, int i2, boolean z4, long j4) {
        int i4;
        int i5;
        int i6;
        B0.F a4;
        B0.F f4;
        K0.b[] bVarArr;
        CharSequence charSequence;
        Object obj;
        Y.d dVar;
        float h4;
        this.f310a = cVar;
        this.f311b = i2;
        this.f312c = j4;
        if (M0.a.j(j4) != 0 || M0.a.k(j4) != 0) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i2 < 1) {
            throw new IllegalArgumentException("maxLines should be greater than 0");
        }
        L l4 = cVar.f3346b;
        CharSequence charSequence2 = cVar.f3352h;
        CharSequence charSequence3 = charSequence2;
        if (z4) {
            charSequence3 = charSequence2;
            if (!M0.m.a(l4.f303a.f263h, u3.l.k0(0))) {
                charSequence3 = charSequence2;
                if (!M0.m.a(l4.f303a.f263h, M0.m.f3560c)) {
                    u uVar = l4.f304b;
                    charSequence3 = charSequence2;
                    if (!L0.i.a(uVar.f376a, Integer.MIN_VALUE)) {
                        int i7 = uVar.f376a;
                        charSequence3 = charSequence2;
                        if (!L0.i.a(i7, 5)) {
                            charSequence3 = charSequence2;
                            if (!L0.i.a(i7, 4)) {
                                int length = charSequence2.length();
                                charSequence3 = charSequence2;
                                if (length != 0) {
                                    SpannableString spannableString = charSequence2 instanceof Spannable ? (Spannable) charSequence2 : new SpannableString(charSequence2);
                                    spannableString.setSpan(new D0.c(), spannableString.length() - 1, spannableString.length() - 1, 33);
                                    charSequence3 = spannableString;
                                }
                            }
                        }
                    }
                }
            }
        }
        this.f314e = charSequence3;
        int i8 = l4.f304b.f376a;
        int i9 = L0.i.a(i8, 1) ? 3 : L0.i.a(i8, 2) ? 4 : L0.i.a(i8, 3) ? 2 : (!L0.i.a(i8, 5) && L0.i.a(i8, 6)) ? 1 : 0;
        u uVar2 = l4.f304b;
        boolean a5 = L0.i.a(uVar2.f376a, 4);
        int i10 = L0.d.a(uVar2.f383h, 2) ? Build.VERSION.SDK_INT <= 32 ? 2 : 4 : 0;
        int i11 = uVar2.f382g;
        int i12 = i11 & 255;
        if (!AbstractC0345a.q(i12, 1)) {
            if (AbstractC0345a.q(i12, 2)) {
                i4 = 1;
            } else if (AbstractC0345a.q(i12, 3)) {
                i4 = 2;
            }
            i5 = (i11 >> 8) & 255;
            if (!j0.c.v(i5, 1)) {
                if (j0.c.v(i5, 2)) {
                    i6 = 1;
                } else if (j0.c.v(i5, 3)) {
                    i6 = 2;
                } else if (j0.c.v(i5, 4)) {
                    i6 = 3;
                }
                int i13 = (i11 >> 16) & 255;
                int i14 = (i13 != 1 && i13 == 2) ? 1 : 0;
                TextUtils.TruncateAt truncateAt = !z4 ? TextUtils.TruncateAt.END : null;
                a4 = a(i9, a5 ? 1 : 0, truncateAt, i2, i10, i4, i6, i14);
                if (z4 || a4.a() <= M0.a.h(j4) || i2 <= 1) {
                    this.f313d = a4;
                } else {
                    int h5 = M0.a.h(j4);
                    int i15 = 0;
                    while (true) {
                        int i16 = a4.f906g;
                        if (i15 >= i16) {
                            i15 = i16;
                            break;
                        } else if (a4.e(i15) > h5) {
                            break;
                        } else {
                            i15++;
                        }
                    }
                    if (i15 >= 0 && i15 != this.f311b) {
                        a4 = a(i9, a5 ? 1 : 0, truncateAt, i15 < 1 ? 1 : i15, i10, i4, i6, i14);
                    }
                    this.f313d = a4;
                }
                I0.c cVar2 = this.f310a;
                D d4 = l4.f303a;
                cVar2.f3351g.c(d4.f256a.c(), u3.l.N(d(), b()), d4.f256a.a());
                f4 = this.f313d;
                if (f4.f905f.getText() instanceof Spanned) {
                    Layout layout = f4.f905f;
                    CharSequence text = layout.getText();
                    Intrinsics.d(text, "null cannot be cast to non-null type android.text.Spanned");
                    Spanned spanned = (Spanned) text;
                    if (spanned.nextSpanTransition(-1, spanned.length(), K0.b.class) != spanned.length()) {
                        CharSequence text2 = layout.getText();
                        Intrinsics.d(text2, "null cannot be cast to non-null type android.text.Spanned");
                        bVarArr = (K0.b[]) ((Spanned) text2).getSpans(0, layout.getText().length(), K0.b.class);
                        if (bVarArr != null) {
                            C0249a f5 = M2.J.f(bVarArr);
                            while (f5.hasNext()) {
                                ((K0.b) f5.next()).f3450c.setValue(new Y.f(u3.l.N(d(), b())));
                            }
                        }
                        charSequence = this.f314e;
                        if (charSequence instanceof Spanned) {
                            Spanned spanned2 = (Spanned) charSequence;
                            Object[] spans = spanned2.getSpans(0, charSequence.length(), D0.i.class);
                            ArrayList arrayList = new ArrayList(spans.length);
                            for (Object obj2 : spans) {
                                D0.i iVar = (D0.i) obj2;
                                int spanStart = spanned2.getSpanStart(iVar);
                                int spanEnd = spanned2.getSpanEnd(iVar);
                                int lineForOffset = this.f313d.f905f.getLineForOffset(spanStart);
                                boolean z5 = lineForOffset >= this.f311b;
                                boolean z6 = this.f313d.f905f.getEllipsisCount(lineForOffset) > 0 && spanEnd > this.f313d.f905f.getEllipsisStart(lineForOffset);
                                boolean z7 = spanEnd > this.f313d.f(lineForOffset);
                                if (z6 || z7 || z5) {
                                    dVar = null;
                                } else {
                                    int ordinal = (this.f313d.f905f.isRtlCharAt(spanStart) ? L0.h.f3507e : L0.h.f3506d).ordinal();
                                    if (ordinal == 0) {
                                        h4 = this.f313d.h(spanStart, false);
                                    } else {
                                        if (ordinal != 1) {
                                            throw new C1338m();
                                        }
                                        float h6 = this.f313d.h(spanStart, false);
                                        if (!iVar.f2154d) {
                                            throw new IllegalStateException("PlaceholderSpan is not laid out yet.");
                                        }
                                        h4 = h6 - iVar.f2152b;
                                    }
                                    if (!iVar.f2154d) {
                                        throw new IllegalStateException("PlaceholderSpan is not laid out yet.");
                                    }
                                    float d5 = this.f313d.d(lineForOffset) - iVar.b();
                                    dVar = new Y.d(h4, d5, iVar.f2152b + h4, iVar.b() + d5);
                                }
                                arrayList.add(dVar);
                            }
                            obj = arrayList;
                        } else {
                            obj = C1405I.f11931d;
                        }
                        this.f315f = obj;
                    }
                }
                bVarArr = null;
                if (bVarArr != null) {
                }
                charSequence = this.f314e;
                if (charSequence instanceof Spanned) {
                }
                this.f315f = obj;
            }
            i6 = 0;
            int i132 = (i11 >> 16) & 255;
            if (i132 != 1) {
                if (!z4) {
                }
                a4 = a(i9, a5 ? 1 : 0, truncateAt, i2, i10, i4, i6, i14);
                if (z4) {
                }
                this.f313d = a4;
                I0.c cVar22 = this.f310a;
                D d42 = l4.f303a;
                cVar22.f3351g.c(d42.f256a.c(), u3.l.N(d(), b()), d42.f256a.a());
                f4 = this.f313d;
                if (f4.f905f.getText() instanceof Spanned) {
                }
                bVarArr = null;
                if (bVarArr != null) {
                }
                charSequence = this.f314e;
                if (charSequence instanceof Spanned) {
                }
                this.f315f = obj;
            }
            if (!z4) {
            }
            a4 = a(i9, a5 ? 1 : 0, truncateAt, i2, i10, i4, i6, i14);
            if (z4) {
            }
            this.f313d = a4;
            I0.c cVar222 = this.f310a;
            D d422 = l4.f303a;
            cVar222.f3351g.c(d422.f256a.c(), u3.l.N(d(), b()), d422.f256a.a());
            f4 = this.f313d;
            if (f4.f905f.getText() instanceof Spanned) {
            }
            bVarArr = null;
            if (bVarArr != null) {
            }
            charSequence = this.f314e;
            if (charSequence instanceof Spanned) {
            }
            this.f315f = obj;
        }
        i4 = 0;
        i5 = (i11 >> 8) & 255;
        if (!j0.c.v(i5, 1)) {
        }
        i6 = 0;
        int i1322 = (i11 >> 16) & 255;
        if (i1322 != 1) {
        }
        if (!z4) {
        }
        a4 = a(i9, a5 ? 1 : 0, truncateAt, i2, i10, i4, i6, i14);
        if (z4) {
        }
        this.f313d = a4;
        I0.c cVar2222 = this.f310a;
        D d4222 = l4.f303a;
        cVar2222.f3351g.c(d4222.f256a.c(), u3.l.N(d(), b()), d4222.f256a.a());
        f4 = this.f313d;
        if (f4.f905f.getText() instanceof Spanned) {
        }
        bVarArr = null;
        if (bVarArr != null) {
        }
        charSequence = this.f314e;
        if (charSequence instanceof Spanned) {
        }
        this.f315f = obj;
    }

    public final B0.F a(int i2, int i4, TextUtils.TruncateAt truncateAt, int i5, int i6, int i7, int i8, int i9) {
        w wVar;
        float d4 = d();
        I0.c cVar = this.f310a;
        I0.a aVar = I0.b.f3344a;
        y yVar = cVar.f3346b.f305c;
        return new B0.F(this.f314e, d4, cVar.f3351g, i2, truncateAt, cVar.f3356l, (yVar == null || (wVar = yVar.f391b) == null) ? false : wVar.f388a, i5, i7, i8, i9, i6, i4, cVar.f3353i);
    }

    public final float b() {
        return this.f313d.a();
    }

    public final long c(Y.d dVar, int i2, C0022s c0022s) {
        C0.e cVar;
        int i4;
        char c4;
        int[] iArr;
        RectF C3 = Z.K.C(dVar);
        int i5 = (!(i2 == 0) && i2 == 1) ? 1 : 0;
        C0030a c0030a = new C0030a(0, c0022s);
        int i6 = Build.VERSION.SDK_INT;
        B0.F f4 = this.f313d;
        if (i6 >= 34) {
            f4.getClass();
            iArr = C0089c.f920a.a(f4, C3, i5, c0030a);
            c4 = 1;
        } else {
            q c5 = f4.c();
            Layout layout = f4.f905f;
            if (i5 == 1) {
                cVar = new y.t(layout.getText(), 3, f4.j());
            } else {
                CharSequence text = layout.getText();
                cVar = i6 >= 29 ? new C0.c(text, f4.f900a) : new C0.d(text);
            }
            C0.e eVar = cVar;
            int lineForVertical = layout.getLineForVertical((int) C3.top);
            if (C3.top <= f4.e(lineForVertical) || (lineForVertical = lineForVertical + 1) < f4.f906g) {
                int i7 = lineForVertical;
                int lineForVertical2 = layout.getLineForVertical((int) C3.bottom);
                if (lineForVertical2 != 0 || C3.bottom >= f4.g(0)) {
                    int d4 = B0.A.d(f4, layout, c5, i7, C3, eVar, c0030a, true);
                    while (true) {
                        i4 = i7;
                        if (d4 != -1 || i4 >= lineForVertical2) {
                            break;
                        }
                        i7 = i4 + 1;
                        d4 = B0.A.d(f4, layout, c5, i7, C3, eVar, c0030a, true);
                    }
                    if (d4 != -1) {
                        int i8 = i4;
                        int i9 = d4;
                        int d5 = B0.A.d(f4, layout, c5, lineForVertical2, C3, eVar, c0030a, false);
                        int i10 = lineForVertical2;
                        while (d5 == -1) {
                            int i11 = i8;
                            if (i11 >= i10) {
                                break;
                            }
                            int i12 = i10 - 1;
                            d5 = B0.A.d(f4, layout, c5, i12, C3, eVar, c0030a, false);
                            i8 = i11;
                            i10 = i12;
                        }
                        if (d5 == -1) {
                            iArr = null;
                            c4 = 1;
                        } else {
                            c4 = 1;
                            iArr = new int[]{eVar.w(i9 + 1), eVar.x(d5 - 1)};
                        }
                    }
                }
            }
            c4 = 1;
            iArr = null;
        }
        return iArr == null ? K.f299b : M1.a.j(iArr[0], iArr[c4]);
    }

    public final float d() {
        return M0.a.i(this.f312c);
    }

    public final void e(Z.r rVar) {
        Canvas a4 = AbstractC0307d.a(rVar);
        B0.F f4 = this.f313d;
        if (f4.f903d) {
            a4.save();
            a4.clipRect(0.0f, 0.0f, d(), b());
        }
        if (a4.getClipBounds(f4.f915p)) {
            int i2 = f4.f907h;
            if (i2 != 0) {
                a4.translate(0.0f, i2);
            }
            B0.E e4 = B0.G.f917a;
            e4.f899a = a4;
            f4.f905f.draw(e4);
            if (i2 != 0) {
                a4.translate(0.0f, (-1) * i2);
            }
        }
        if (f4.f903d) {
            a4.restore();
        }
    }

    public final void f(Z.r rVar, long j4, O o4, L0.j jVar, AbstractC0497e abstractC0497e, int i2) {
        I0.c cVar = this.f310a;
        I0.e eVar = cVar.f3351g;
        int i4 = eVar.f3362c;
        eVar.d(j4);
        eVar.f(o4);
        eVar.g(jVar);
        eVar.e(abstractC0497e);
        eVar.b(i2);
        e(rVar);
        cVar.f3351g.b(i4);
    }

    public final void g(Z.r rVar, AbstractC0319p abstractC0319p, float f4, O o4, L0.j jVar, AbstractC0497e abstractC0497e, int i2) {
        I0.e eVar = this.f310a.f3351g;
        int i4 = eVar.f3362c;
        eVar.c(abstractC0319p, u3.l.N(d(), b()), f4);
        eVar.f(o4);
        eVar.g(jVar);
        eVar.e(abstractC0497e);
        eVar.b(i2);
        e(rVar);
        eVar.b(i4);
    }
}
