package C0;

import D0.C0065c;
import a.AbstractC0235a;
import a0.C0239d;
import a0.C0241f;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import b0.AbstractC0335d;
import b0.AbstractC0347p;
import b0.P;
import d0.AbstractC0404e;
import java.util.ArrayList;
import z.C1256t;

/* renamed from: C0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0026b {

    /* renamed from: a, reason: collision with root package name */
    public final K0.c f578a;

    /* renamed from: b, reason: collision with root package name */
    public final int f579b;

    /* renamed from: c, reason: collision with root package name */
    public final long f580c;

    /* renamed from: d, reason: collision with root package name */
    public final D0.G f581d;

    /* renamed from: e, reason: collision with root package name */
    public final CharSequence f582e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f583f;

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
    public C0026b(K0.c cVar, int i3, boolean z3, long j3) {
        int i4;
        int i5;
        int i6;
        D0.G a3;
        D0.G g3;
        M0.b[] bVarArr;
        CharSequence charSequence;
        Object obj;
        C0239d c0239d;
        float h3;
        this.f578a = cVar;
        this.f579b = i3;
        this.f580c = j3;
        if (O0.a.i(j3) != 0 || O0.a.j(j3) != 0) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i3 < 1) {
            throw new IllegalArgumentException("maxLines should be greater than 0");
        }
        K k3 = cVar.f3230b;
        CharSequence charSequence2 = cVar.f3236h;
        CharSequence charSequence3 = charSequence2;
        if (z3) {
            charSequence3 = charSequence2;
            if (!O0.m.a(k3.f571a.f532h, O2.l.g0(0))) {
                charSequence3 = charSequence2;
                if (!O0.m.a(k3.f571a.f532h, O0.m.f3746c)) {
                    u uVar = k3.f572b;
                    charSequence3 = charSequence2;
                    if (!N0.i.a(uVar.f644a, Integer.MIN_VALUE)) {
                        int i7 = uVar.f644a;
                        charSequence3 = charSequence2;
                        if (!N0.i.a(i7, 5)) {
                            charSequence3 = charSequence2;
                            if (!N0.i.a(i7, 4)) {
                                int length = charSequence2.length();
                                charSequence3 = charSequence2;
                                if (length != 0) {
                                    SpannableString spannableString = charSequence2 instanceof Spannable ? (Spannable) charSequence2 : new SpannableString(charSequence2);
                                    spannableString.setSpan(new F0.c(), spannableString.length() - 1, spannableString.length() - 1, 33);
                                    charSequence3 = spannableString;
                                }
                            }
                        }
                    }
                }
            }
        }
        this.f582e = charSequence3;
        int i8 = k3.f572b.f644a;
        int i9 = N0.i.a(i8, 1) ? 3 : N0.i.a(i8, 2) ? 4 : N0.i.a(i8, 3) ? 2 : (!N0.i.a(i8, 5) && N0.i.a(i8, 6)) ? 1 : 0;
        u uVar2 = k3.f572b;
        boolean a4 = N0.i.a(uVar2.f644a, 4);
        int i10 = N0.d.a(uVar2.f651h, 2) ? Build.VERSION.SDK_INT <= 32 ? 2 : 4 : 0;
        int i11 = uVar2.f650g;
        int i12 = i11 & 255;
        if (!l0.c.r(i12, 1)) {
            if (l0.c.r(i12, 2)) {
                i4 = 1;
            } else if (l0.c.r(i12, 3)) {
                i4 = 2;
            }
            i5 = (i11 >> 8) & 255;
            if (!O2.d.K(i5, 1)) {
                if (O2.d.K(i5, 2)) {
                    i6 = 1;
                } else if (O2.d.K(i5, 3)) {
                    i6 = 2;
                } else if (O2.d.K(i5, 4)) {
                    i6 = 3;
                }
                int i13 = (i11 >> 16) & 255;
                int i14 = (i13 != 1 && i13 == 2) ? 1 : 0;
                TextUtils.TruncateAt truncateAt = !z3 ? TextUtils.TruncateAt.END : null;
                a3 = a(i9, a4 ? 1 : 0, truncateAt, i3, i10, i4, i6, i14);
                if (z3 || a3.a() <= O0.a.g(j3) || i3 <= 1) {
                    this.f581d = a3;
                } else {
                    int g4 = O0.a.g(j3);
                    int i15 = 0;
                    while (true) {
                        int i16 = a3.f828g;
                        if (i15 >= i16) {
                            i15 = i16;
                            break;
                        } else if (a3.e(i15) > g4) {
                            break;
                        } else {
                            i15++;
                        }
                    }
                    if (i15 >= 0 && i15 != this.f579b) {
                        a3 = a(i9, a4 ? 1 : 0, truncateAt, i15 < 1 ? 1 : i15, i10, i4, i6, i14);
                    }
                    this.f581d = a3;
                }
                K0.c cVar2 = this.f578a;
                D d3 = k3.f571a;
                cVar2.f3235g.c(d3.f525a.c(), AbstractC0235a.e(d(), b()), d3.f525a.a());
                g3 = this.f581d;
                if (g3.f827f.getText() instanceof Spanned) {
                    Layout layout = g3.f827f;
                    CharSequence text = layout.getText();
                    f2.j.d(text, "null cannot be cast to non-null type android.text.Spanned");
                    Spanned spanned = (Spanned) text;
                    if (spanned.nextSpanTransition(-1, spanned.length(), M0.b.class) != spanned.length()) {
                        CharSequence text2 = layout.getText();
                        f2.j.d(text2, "null cannot be cast to non-null type android.text.Spanned");
                        bVarArr = (M0.b[]) ((Spanned) text2).getSpans(0, layout.getText().length(), M0.b.class);
                        if (bVarArr != null) {
                            R1.p h4 = f2.j.h(bVarArr);
                            while (h4.hasNext()) {
                                ((M0.b) h4.next()).f3454c.setValue(new C0241f(AbstractC0235a.e(d(), b())));
                            }
                        }
                        charSequence = this.f582e;
                        if (charSequence instanceof Spanned) {
                            Spanned spanned2 = (Spanned) charSequence;
                            Object[] spans = spanned2.getSpans(0, charSequence.length(), F0.i.class);
                            ArrayList arrayList = new ArrayList(spans.length);
                            for (Object obj2 : spans) {
                                F0.i iVar = (F0.i) obj2;
                                int spanStart = spanned2.getSpanStart(iVar);
                                int spanEnd = spanned2.getSpanEnd(iVar);
                                int lineForOffset = this.f581d.f827f.getLineForOffset(spanStart);
                                boolean z4 = lineForOffset >= this.f579b;
                                boolean z5 = this.f581d.f827f.getEllipsisCount(lineForOffset) > 0 && spanEnd > this.f581d.f827f.getEllipsisStart(lineForOffset);
                                boolean z6 = spanEnd > this.f581d.f(lineForOffset);
                                if (z5 || z6 || z4) {
                                    c0239d = null;
                                } else {
                                    int ordinal = (this.f581d.f827f.isRtlCharAt(spanStart) ? N0.h.f3545e : N0.h.f3544d).ordinal();
                                    if (ordinal == 0) {
                                        h3 = this.f581d.h(spanStart, false);
                                    } else {
                                        if (ordinal != 1) {
                                            throw new C1.c();
                                        }
                                        float h5 = this.f581d.h(spanStart, false);
                                        if (!iVar.f1943d) {
                                            throw new IllegalStateException("PlaceholderSpan is not laid out yet.");
                                        }
                                        h3 = h5 - iVar.f1941b;
                                    }
                                    if (!iVar.f1943d) {
                                        throw new IllegalStateException("PlaceholderSpan is not laid out yet.");
                                    }
                                    float d4 = this.f581d.d(lineForOffset) - iVar.b();
                                    c0239d = new C0239d(h3, d4, iVar.f1941b + h3, iVar.b() + d4);
                                }
                                arrayList.add(c0239d);
                            }
                            obj = arrayList;
                        } else {
                            obj = S1.u.f4320d;
                        }
                        this.f583f = obj;
                    }
                }
                bVarArr = null;
                if (bVarArr != null) {
                }
                charSequence = this.f582e;
                if (charSequence instanceof Spanned) {
                }
                this.f583f = obj;
            }
            i6 = 0;
            int i132 = (i11 >> 16) & 255;
            if (i132 != 1) {
                if (!z3) {
                }
                a3 = a(i9, a4 ? 1 : 0, truncateAt, i3, i10, i4, i6, i14);
                if (z3) {
                }
                this.f581d = a3;
                K0.c cVar22 = this.f578a;
                D d32 = k3.f571a;
                cVar22.f3235g.c(d32.f525a.c(), AbstractC0235a.e(d(), b()), d32.f525a.a());
                g3 = this.f581d;
                if (g3.f827f.getText() instanceof Spanned) {
                }
                bVarArr = null;
                if (bVarArr != null) {
                }
                charSequence = this.f582e;
                if (charSequence instanceof Spanned) {
                }
                this.f583f = obj;
            }
            if (!z3) {
            }
            a3 = a(i9, a4 ? 1 : 0, truncateAt, i3, i10, i4, i6, i14);
            if (z3) {
            }
            this.f581d = a3;
            K0.c cVar222 = this.f578a;
            D d322 = k3.f571a;
            cVar222.f3235g.c(d322.f525a.c(), AbstractC0235a.e(d(), b()), d322.f525a.a());
            g3 = this.f581d;
            if (g3.f827f.getText() instanceof Spanned) {
            }
            bVarArr = null;
            if (bVarArr != null) {
            }
            charSequence = this.f582e;
            if (charSequence instanceof Spanned) {
            }
            this.f583f = obj;
        }
        i4 = 0;
        i5 = (i11 >> 8) & 255;
        if (!O2.d.K(i5, 1)) {
        }
        i6 = 0;
        int i1322 = (i11 >> 16) & 255;
        if (i1322 != 1) {
        }
        if (!z3) {
        }
        a3 = a(i9, a4 ? 1 : 0, truncateAt, i3, i10, i4, i6, i14);
        if (z3) {
        }
        this.f581d = a3;
        K0.c cVar2222 = this.f578a;
        D d3222 = k3.f571a;
        cVar2222.f3235g.c(d3222.f525a.c(), AbstractC0235a.e(d(), b()), d3222.f525a.a());
        g3 = this.f581d;
        if (g3.f827f.getText() instanceof Spanned) {
        }
        bVarArr = null;
        if (bVarArr != null) {
        }
        charSequence = this.f582e;
        if (charSequence instanceof Spanned) {
        }
        this.f583f = obj;
    }

    public final D0.G a(int i3, int i4, TextUtils.TruncateAt truncateAt, int i5, int i6, int i7, int i8, int i9) {
        w wVar;
        float d3 = d();
        K0.c cVar = this.f578a;
        K0.a aVar = K0.b.f3228a;
        y yVar = cVar.f3230b.f573c;
        return new D0.G(this.f582e, d3, cVar.f3235g, i3, truncateAt, cVar.f3240l, (yVar == null || (wVar = yVar.f659b) == null) ? false : wVar.f656a, i5, i7, i8, i9, i6, i4, cVar.f3237i);
    }

    public final float b() {
        return this.f581d.a();
    }

    public final long c(C0239d c0239d, int i3, B.r rVar) {
        E0.e cVar;
        int i4;
        char c2;
        int[] iArr;
        RectF C = b0.M.C(c0239d);
        int i5 = (!(i3 == 0) && i3 == 1) ? 1 : 0;
        C0025a c0025a = new C0025a(0, rVar);
        int i6 = Build.VERSION.SDK_INT;
        D0.G g3 = this.f581d;
        if (i6 >= 34) {
            g3.getClass();
            iArr = C0065c.f842a.a(g3, C, i5, c0025a);
            c2 = 1;
        } else {
            q c3 = g3.c();
            Layout layout = g3.f827f;
            if (i5 == 1) {
                cVar = new C1256t(layout.getText(), 2, g3.j());
            } else {
                CharSequence text = layout.getText();
                cVar = i6 >= 29 ? new E0.c(text, g3.f822a) : new E0.d(text);
            }
            E0.e eVar = cVar;
            int lineForVertical = layout.getLineForVertical((int) C.top);
            if (C.top <= g3.e(lineForVertical) || (lineForVertical = lineForVertical + 1) < g3.f828g) {
                int i7 = lineForVertical;
                int lineForVertical2 = layout.getLineForVertical((int) C.bottom);
                if (lineForVertical2 != 0 || C.bottom >= g3.g(0)) {
                    int d3 = D0.B.d(g3, layout, c3, i7, C, eVar, c0025a, true);
                    while (true) {
                        i4 = i7;
                        if (d3 != -1 || i4 >= lineForVertical2) {
                            break;
                        }
                        i7 = i4 + 1;
                        d3 = D0.B.d(g3, layout, c3, i7, C, eVar, c0025a, true);
                    }
                    if (d3 != -1) {
                        int i8 = i4;
                        int i9 = d3;
                        int d4 = D0.B.d(g3, layout, c3, lineForVertical2, C, eVar, c0025a, false);
                        int i10 = lineForVertical2;
                        while (d4 == -1) {
                            int i11 = i8;
                            if (i11 >= i10) {
                                break;
                            }
                            int i12 = i10 - 1;
                            d4 = D0.B.d(g3, layout, c3, i12, C, eVar, c0025a, false);
                            i8 = i11;
                            i10 = i12;
                        }
                        if (d4 == -1) {
                            iArr = null;
                            c2 = 1;
                        } else {
                            c2 = 1;
                            iArr = new int[]{eVar.v(i9 + 1), eVar.w(d4 - 1)};
                        }
                    }
                }
            }
            c2 = 1;
            iArr = null;
        }
        return iArr == null ? J.f567b : O2.l.J(iArr[0], iArr[c2]);
    }

    public final float d() {
        return O0.a.h(this.f580c);
    }

    public final void e(b0.r rVar) {
        Canvas a3 = AbstractC0335d.a(rVar);
        D0.G g3 = this.f581d;
        if (g3.f825d) {
            a3.save();
            a3.clipRect(0.0f, 0.0f, d(), b());
        }
        if (a3.getClipBounds(g3.f837p)) {
            int i3 = g3.f829h;
            if (i3 != 0) {
                a3.translate(0.0f, i3);
            }
            D0.F f3 = D0.H.f839a;
            f3.f821a = a3;
            g3.f827f.draw(f3);
            if (i3 != 0) {
                a3.translate(0.0f, (-1) * i3);
            }
        }
        if (g3.f825d) {
            a3.restore();
        }
    }

    public final void f(b0.r rVar, long j3, P p3, N0.j jVar, AbstractC0404e abstractC0404e, int i3) {
        K0.c cVar = this.f578a;
        K0.d dVar = cVar.f3235g;
        int i4 = dVar.f3243c;
        dVar.d(j3);
        dVar.f(p3);
        dVar.g(jVar);
        dVar.e(abstractC0404e);
        dVar.b(i3);
        e(rVar);
        cVar.f3235g.b(i4);
    }

    public final void g(b0.r rVar, AbstractC0347p abstractC0347p, float f3, P p3, N0.j jVar, AbstractC0404e abstractC0404e, int i3) {
        K0.d dVar = this.f578a.f3235g;
        int i4 = dVar.f3243c;
        dVar.c(abstractC0347p, AbstractC0235a.e(d(), b()), f3);
        dVar.f(p3);
        dVar.g(jVar);
        dVar.e(abstractC0404e);
        dVar.b(i3);
        e(rVar);
        dVar.b(i4);
    }
}
