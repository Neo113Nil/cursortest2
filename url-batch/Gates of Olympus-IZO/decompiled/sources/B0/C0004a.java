package B0;

import a.AbstractC0157a;
import android.graphics.Canvas;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import b0.AbstractC0259J;
import b0.AbstractC0272e;
import b0.C0262M;
import b0.InterfaceC0285r;
import d0.AbstractC0322c;
import java.util.ArrayList;
import m.AbstractC0600j;

/* renamed from: B0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0004a {

    /* renamed from: a, reason: collision with root package name */
    public final I0.d f240a;

    /* renamed from: b, reason: collision with root package name */
    public final int f241b;

    /* renamed from: c, reason: collision with root package name */
    public final long f242c;

    /* renamed from: d, reason: collision with root package name */
    public final C0.C f243d;

    /* renamed from: e, reason: collision with root package name */
    public final CharSequence f244e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f245f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0126 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x022e  */
    /* JADX WARN: Type inference failed for: r0v40, types: [android.text.Spannable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0004a(I0.d dVar, int i3, boolean z3, long j3) {
        int i4;
        int i5;
        int i6;
        C0.C a3;
        C0.C c3;
        K0.b[] bVarArr;
        CharSequence charSequence;
        Object obj;
        a0.d dVar2;
        float g3;
        this.f240a = dVar;
        this.f241b = i3;
        this.f242c = j3;
        if (M0.a.i(j3) != 0 || M0.a.j(j3) != 0) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i3 < 1) {
            throw new IllegalArgumentException("maxLines should be greater than 0");
        }
        C c4 = dVar.f2429b;
        CharSequence charSequence2 = dVar.f2435h;
        CharSequence charSequence3 = charSequence2;
        if (z3) {
            charSequence3 = charSequence2;
            if (!M0.l.a(c4.f235a.f372h, AbstractC0157a.I(0))) {
                charSequence3 = charSequence2;
                if (!M0.l.a(c4.f235a.f372h, M0.l.f2780c)) {
                    o oVar = c4.f236b;
                    charSequence3 = charSequence2;
                    if (!L0.f.a(oVar.f288a, Integer.MIN_VALUE)) {
                        int i7 = oVar.f288a;
                        charSequence3 = charSequence2;
                        if (!L0.f.a(i7, 5)) {
                            charSequence3 = charSequence2;
                            if (!L0.f.a(i7, 4)) {
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
        this.f244e = charSequence3;
        int i8 = c4.f236b.f288a;
        int i9 = L0.f.a(i8, 1) ? 3 : L0.f.a(i8, 2) ? 4 : L0.f.a(i8, 3) ? 2 : (!L0.f.a(i8, 5) && L0.f.a(i8, 6)) ? 1 : 0;
        o oVar2 = c4.f236b;
        boolean a4 = L0.f.a(oVar2.f288a, 4);
        int i10 = I2.l.w(oVar2.f295h, 2) ? Build.VERSION.SDK_INT <= 32 ? 2 : 4 : 0;
        int i11 = oVar2.f294g;
        int i12 = i11 & 255;
        if (!AbstractC0157a.x(i12, 1)) {
            if (AbstractC0157a.x(i12, 2)) {
                i4 = 1;
            } else if (AbstractC0157a.x(i12, 3)) {
                i4 = 2;
            }
            i5 = (i11 >> 8) & 255;
            if (!M1.B.z(i5, 1)) {
                if (M1.B.z(i5, 2)) {
                    i6 = 1;
                } else if (M1.B.z(i5, 3)) {
                    i6 = 2;
                } else if (M1.B.z(i5, 4)) {
                    i6 = 3;
                }
                int i13 = (i11 >> 16) & 255;
                int i14 = (i13 != 1 && i13 == 2) ? 1 : 0;
                TextUtils.TruncateAt truncateAt = !z3 ? TextUtils.TruncateAt.END : null;
                a3 = a(i9, a4 ? 1 : 0, truncateAt, i3, i10, i4, i6, i14);
                if (z3 || a3.a() <= M0.a.g(j3) || i3 <= 1) {
                    this.f243d = a3;
                } else {
                    int g4 = M0.a.g(j3);
                    int i15 = 0;
                    while (true) {
                        int i16 = a3.f430f;
                        if (i15 >= i16) {
                            i15 = i16;
                            break;
                        } else if (a3.d(i15) > g4) {
                            break;
                        } else {
                            i15++;
                        }
                    }
                    if (i15 >= 0 && i15 != this.f241b) {
                        a3 = a(i9, a4 ? 1 : 0, truncateAt, i15 < 1 ? 1 : i15, i10, i4, i6, i14);
                    }
                    this.f243d = a3;
                }
                I0.d dVar3 = this.f240a;
                w wVar = c4.f235a;
                dVar3.f2434g.c(wVar.f365a.c(), I2.d.h(c(), b()), wVar.f365a.a());
                c3 = this.f243d;
                if (c3.f429e.getText() instanceof Spanned) {
                    Layout layout = c3.f429e;
                    CharSequence text = layout.getText();
                    Z1.i.d(text, "null cannot be cast to non-null type android.text.Spanned");
                    Spanned spanned = (Spanned) text;
                    if (spanned.nextSpanTransition(-1, spanned.length(), K0.b.class) != spanned.length()) {
                        CharSequence text2 = layout.getText();
                        Z1.i.d(text2, "null cannot be cast to non-null type android.text.Spanned");
                        bVarArr = (K0.b[]) ((Spanned) text2).getSpans(0, layout.getText().length(), K0.b.class);
                        if (bVarArr != null) {
                            L1.q h3 = Z1.i.h(bVarArr);
                            while (h3.hasNext()) {
                                ((K0.b) h3.next()).f2657c.setValue(new a0.f(I2.d.h(c(), b())));
                            }
                        }
                        charSequence = this.f244e;
                        if (charSequence instanceof Spanned) {
                            Spanned spanned2 = (Spanned) charSequence;
                            Object[] spans = spanned2.getSpans(0, charSequence.length(), D0.h.class);
                            ArrayList arrayList = new ArrayList(spans.length);
                            for (Object obj2 : spans) {
                                D0.h hVar = (D0.h) obj2;
                                int spanStart = spanned2.getSpanStart(hVar);
                                int spanEnd = spanned2.getSpanEnd(hVar);
                                int lineForOffset = this.f243d.f429e.getLineForOffset(spanStart);
                                boolean z4 = lineForOffset >= this.f241b;
                                boolean z5 = this.f243d.f429e.getEllipsisCount(lineForOffset) > 0 && spanEnd > this.f243d.f429e.getEllipsisStart(lineForOffset);
                                boolean z6 = spanEnd > this.f243d.e(lineForOffset);
                                if (z5 || z6 || z4) {
                                    dVar2 = null;
                                } else {
                                    int a5 = AbstractC0600j.a(this.f243d.f429e.isRtlCharAt(spanStart) ? 2 : 1);
                                    if (a5 == 0) {
                                        g3 = this.f243d.g(spanStart, false);
                                    } else {
                                        if (a5 != 1) {
                                            throw new L1.f();
                                        }
                                        float g5 = this.f243d.g(spanStart, false);
                                        if (!hVar.f507d) {
                                            throw new IllegalStateException("PlaceholderSpan is not laid out yet.");
                                        }
                                        g3 = g5 - hVar.f505b;
                                    }
                                    if (!hVar.f507d) {
                                        throw new IllegalStateException("PlaceholderSpan is not laid out yet.");
                                    }
                                    float c5 = this.f243d.c(lineForOffset) - hVar.b();
                                    dVar2 = new a0.d(g3, c5, hVar.f505b + g3, hVar.b() + c5);
                                }
                                arrayList.add(dVar2);
                            }
                            obj = arrayList;
                        } else {
                            obj = M1.u.f2803d;
                        }
                        this.f245f = obj;
                    }
                }
                bVarArr = null;
                if (bVarArr != null) {
                }
                charSequence = this.f244e;
                if (charSequence instanceof Spanned) {
                }
                this.f245f = obj;
            }
            i6 = 0;
            int i132 = (i11 >> 16) & 255;
            if (i132 != 1) {
                if (!z3) {
                }
                a3 = a(i9, a4 ? 1 : 0, truncateAt, i3, i10, i4, i6, i14);
                if (z3) {
                }
                this.f243d = a3;
                I0.d dVar32 = this.f240a;
                w wVar2 = c4.f235a;
                dVar32.f2434g.c(wVar2.f365a.c(), I2.d.h(c(), b()), wVar2.f365a.a());
                c3 = this.f243d;
                if (c3.f429e.getText() instanceof Spanned) {
                }
                bVarArr = null;
                if (bVarArr != null) {
                }
                charSequence = this.f244e;
                if (charSequence instanceof Spanned) {
                }
                this.f245f = obj;
            }
            if (!z3) {
            }
            a3 = a(i9, a4 ? 1 : 0, truncateAt, i3, i10, i4, i6, i14);
            if (z3) {
            }
            this.f243d = a3;
            I0.d dVar322 = this.f240a;
            w wVar22 = c4.f235a;
            dVar322.f2434g.c(wVar22.f365a.c(), I2.d.h(c(), b()), wVar22.f365a.a());
            c3 = this.f243d;
            if (c3.f429e.getText() instanceof Spanned) {
            }
            bVarArr = null;
            if (bVarArr != null) {
            }
            charSequence = this.f244e;
            if (charSequence instanceof Spanned) {
            }
            this.f245f = obj;
        }
        i4 = 0;
        i5 = (i11 >> 8) & 255;
        if (!M1.B.z(i5, 1)) {
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
        this.f243d = a3;
        I0.d dVar3222 = this.f240a;
        w wVar222 = c4.f235a;
        dVar3222.f2434g.c(wVar222.f365a.c(), I2.d.h(c(), b()), wVar222.f365a.a());
        c3 = this.f243d;
        if (c3.f429e.getText() instanceof Spanned) {
        }
        bVarArr = null;
        if (bVarArr != null) {
        }
        charSequence = this.f244e;
        if (charSequence instanceof Spanned) {
        }
        this.f245f = obj;
    }

    public final C0.C a(int i3, int i4, TextUtils.TruncateAt truncateAt, int i5, int i6, int i7, int i8, int i9) {
        float c3 = c();
        I0.d dVar = this.f240a;
        I0.a aVar = I0.b.f2425a;
        r rVar = dVar.f2429b.f237c;
        return new C0.C(this.f244e, c3, dVar.f2434g, i3, truncateAt, dVar.f2439l, false, i5, i7, i8, i9, i6, i4, dVar.f2436i);
    }

    public final float b() {
        return this.f243d.a();
    }

    public final float c() {
        return M0.a.h(this.f242c);
    }

    public final void d(InterfaceC0285r interfaceC0285r) {
        Canvas a3 = AbstractC0272e.a(interfaceC0285r);
        C0.C c3 = this.f243d;
        if (c3.f428d) {
            a3.save();
            a3.clipRect(0.0f, 0.0f, c(), b());
        }
        if (a3.getClipBounds(c3.f439o)) {
            int i3 = c3.f431g;
            if (i3 != 0) {
                a3.translate(0.0f, i3);
            }
            C0.B b2 = C0.D.f440a;
            b2.f424a = a3;
            c3.f429e.draw(b2);
            if (i3 != 0) {
                a3.translate(0.0f, (-1) * i3);
            }
        }
        if (c3.f428d) {
            a3.restore();
        }
    }

    public final void e(InterfaceC0285r interfaceC0285r, long j3, C0262M c0262m, L0.g gVar, AbstractC0322c abstractC0322c, int i3) {
        I0.d dVar = this.f240a;
        I0.e eVar = dVar.f2434g;
        int i4 = eVar.f2442c;
        eVar.d(j3);
        eVar.f(c0262m);
        eVar.g(gVar);
        eVar.e(abstractC0322c);
        eVar.b(i3);
        d(interfaceC0285r);
        dVar.f2434g.b(i4);
    }

    public final void f(InterfaceC0285r interfaceC0285r, AbstractC0259J abstractC0259J, float f3, C0262M c0262m, L0.g gVar, AbstractC0322c abstractC0322c, int i3) {
        I0.e eVar = this.f240a.f2434g;
        int i4 = eVar.f2442c;
        eVar.c(abstractC0259J, I2.d.h(c(), b()), f3);
        eVar.f(c0262m);
        eVar.g(gVar);
        eVar.e(abstractC0322c);
        eVar.b(i3);
        d(interfaceC0285r);
        eVar.b(i4);
    }
}
