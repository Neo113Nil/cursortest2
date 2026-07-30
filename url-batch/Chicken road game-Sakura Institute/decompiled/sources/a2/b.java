package a2;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import z0.o0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final i2.d f311a;

    /* renamed from: b, reason: collision with root package name */
    public final int f312b;

    /* renamed from: c, reason: collision with root package name */
    public final long f313c;

    /* renamed from: d, reason: collision with root package name */
    public final b2.d0 f314d;

    /* renamed from: e, reason: collision with root package name */
    public final CharSequence f315e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f316f;

    /* JADX WARN: Code restructure failed: missing block: B:143:0x00cc, code lost:
    
        if (r15 == 4) goto L70;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c1  */
    /* JADX WARN: Type inference failed for: r1v39, types: [android.text.Spannable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(i2.d dVar, int i7, boolean z8, long j8) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        TextUtils.TruncateAt truncateAt;
        Layout layout;
        k2.b[] bVarArr;
        CharSequence charSequence;
        Object obj;
        y0.d dVar2;
        float h3;
        this.f311a = dVar;
        this.f312b = i7;
        this.f313c = j8;
        if (m2.a.i(j8) != 0 || m2.a.j(j8) != 0) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i7 < 1) {
            throw new IllegalArgumentException("maxLines should be greater than 0");
        }
        k0 k0Var = dVar.f4860b;
        CharSequence charSequence2 = dVar.f4866h;
        CharSequence charSequence3 = charSequence2;
        if (z8) {
            charSequence3 = charSequence2;
            if (!m2.m.a(k0Var.f412a.f354h, r4.a.I(0))) {
                charSequence3 = charSequence2;
                if (!m2.m.a(k0Var.f412a.f354h, m2.m.f6327c)) {
                    int i14 = k0Var.f413b.f450a;
                    charSequence3 = charSequence2;
                    charSequence3 = charSequence2;
                    charSequence3 = charSequence2;
                    if (i14 != Integer.MIN_VALUE && i14 != 5 && i14 != 4) {
                        int length = charSequence2.length();
                        charSequence3 = charSequence2;
                        if (length != 0) {
                            SpannableString spannableString = charSequence2 instanceof Spannable ? (Spannable) charSequence2 : new SpannableString(charSequence2);
                            spannableString.setSpan(new d2.c(), spannableString.length() - 1, spannableString.length() - 1, 33);
                            charSequence3 = spannableString;
                        }
                    }
                }
            }
        }
        this.f315e = charSequence3;
        u uVar = k0Var.f413b;
        d0 d0Var = k0Var.f412a;
        int i15 = uVar.f450a;
        int i16 = 3;
        int i17 = i15 == 1 ? 3 : i15 == 2 ? 4 : i15 == 3 ? 2 : (i15 != 5 && i15 == 6) ? 1 : 0;
        int i18 = i15 == 4 ? 1 : 0;
        int i19 = uVar.f457h == 2 ? Build.VERSION.SDK_INT <= 32 ? 2 : 4 : 0;
        int i20 = uVar.f456g;
        int i21 = i20 & 255;
        if (i21 != 1) {
            if (i21 == 2) {
                i8 = 1;
            } else if (i21 == 3) {
                i8 = 2;
            }
            i9 = (i20 >> 8) & 255;
            if (i9 != 1) {
                if (i9 == 2) {
                    i16 = 1;
                } else if (i9 == 3) {
                    i16 = 2;
                }
                i10 = (i20 >> 16) & 255;
                if (i10 != 1 && i10 == 2) {
                    i11 = i19;
                    i12 = 1;
                } else {
                    i11 = i19;
                    i12 = 0;
                }
                if (z8) {
                    i13 = i17;
                    truncateAt = null;
                } else {
                    int i22 = i17;
                    truncateAt = TextUtils.TruncateAt.END;
                    i13 = i22;
                }
                int i23 = i16;
                int i24 = i8;
                b2.d0 a3 = a(i13, i18, truncateAt, i7, i11, i24, i23, i12);
                int i25 = a3.f1268f;
                if (z8) {
                    int i26 = i13;
                    if (a3.a() > m2.a.g(j8) && i7 > 1) {
                        int g9 = m2.a.g(j8);
                        int i27 = 0;
                        while (true) {
                            if (i27 >= i25) {
                                break;
                            }
                            if (a3.e(i27) > g9) {
                                i25 = i27;
                                break;
                            }
                            i27++;
                        }
                        if (i25 >= 0 && i25 != this.f312b) {
                            a3 = a(i26, i18, truncateAt, i25 < 1 ? 1 : i25, i11, i24, i23, i12);
                        }
                        this.f314d = a3;
                        this.f311a.f4865g.c(d0Var.f347a.c(), v0.d.a(d(), b()), d0Var.f347a.a());
                        layout = this.f314d.f1267e;
                        if (layout.getText() instanceof Spanned) {
                            CharSequence text = layout.getText();
                            r6.k.d(text, "null cannot be cast to non-null type android.text.Spanned");
                            Spanned spanned = (Spanned) text;
                            if (spanned.nextSpanTransition(-1, spanned.length(), k2.b.class) != spanned.length()) {
                                CharSequence text2 = layout.getText();
                                r6.k.d(text2, "null cannot be cast to non-null type android.text.Spanned");
                                bVarArr = (k2.b[]) ((Spanned) text2).getSpans(0, layout.getText().length(), k2.b.class);
                                if (bVarArr != null) {
                                    d6.q h8 = r6.k.h(bVarArr);
                                    while (h8.hasNext()) {
                                        ((k2.b) h8.next()).f5344h.setValue(new y0.f(v0.d.a(d(), b())));
                                    }
                                }
                                charSequence = this.f315e;
                                if (charSequence instanceof Spanned) {
                                    obj = e6.u.f2826f;
                                } else {
                                    Spanned spanned2 = (Spanned) charSequence;
                                    Object[] spans = spanned2.getSpans(0, charSequence.length(), d2.i.class);
                                    ArrayList arrayList = new ArrayList(spans.length);
                                    for (Object obj2 : spans) {
                                        d2.i iVar = (d2.i) obj2;
                                        int spanStart = spanned2.getSpanStart(iVar);
                                        int spanEnd = spanned2.getSpanEnd(iVar);
                                        int lineForOffset = this.f314d.f1267e.getLineForOffset(spanStart);
                                        boolean z9 = lineForOffset >= this.f312b;
                                        boolean z10 = this.f314d.f1267e.getEllipsisCount(lineForOffset) > 0 && spanEnd > this.f314d.f1267e.getEllipsisStart(lineForOffset);
                                        boolean z11 = spanEnd > this.f314d.f(lineForOffset);
                                        if (z10 || z11 || z9) {
                                            dVar2 = null;
                                        } else {
                                            int ordinal = (this.f314d.f1267e.isRtlCharAt(spanStart) ? l2.h.f5874g : l2.h.f5873f).ordinal();
                                            if (ordinal == 0) {
                                                h3 = this.f314d.h(spanStart, false);
                                            } else {
                                                if (ordinal != 1) {
                                                    throw new b4.c();
                                                }
                                                float h9 = this.f314d.h(spanStart, false);
                                                if (!iVar.f2586i) {
                                                    throw new IllegalStateException("PlaceholderSpan is not laid out yet.");
                                                }
                                                h3 = h9 - iVar.f2584g;
                                            }
                                            if (!iVar.f2586i) {
                                                throw new IllegalStateException("PlaceholderSpan is not laid out yet.");
                                            }
                                            float d8 = this.f314d.d(lineForOffset) - iVar.b();
                                            dVar2 = new y0.d(h3, d8, iVar.f2584g + h3, iVar.b() + d8);
                                        }
                                        arrayList.add(dVar2);
                                    }
                                    obj = arrayList;
                                }
                                this.f316f = obj;
                            }
                        }
                        bVarArr = null;
                        if (bVarArr != null) {
                        }
                        charSequence = this.f315e;
                        if (charSequence instanceof Spanned) {
                        }
                        this.f316f = obj;
                    }
                }
                this.f314d = a3;
                this.f311a.f4865g.c(d0Var.f347a.c(), v0.d.a(d(), b()), d0Var.f347a.a());
                layout = this.f314d.f1267e;
                if (layout.getText() instanceof Spanned) {
                }
                bVarArr = null;
                if (bVarArr != null) {
                }
                charSequence = this.f315e;
                if (charSequence instanceof Spanned) {
                }
                this.f316f = obj;
            }
            i16 = 0;
            i10 = (i20 >> 16) & 255;
            if (i10 != 1) {
                i11 = i19;
                i12 = 1;
                if (z8) {
                }
                int i232 = i16;
                int i242 = i8;
                b2.d0 a32 = a(i13, i18, truncateAt, i7, i11, i242, i232, i12);
                int i252 = a32.f1268f;
                if (z8) {
                }
                this.f314d = a32;
                this.f311a.f4865g.c(d0Var.f347a.c(), v0.d.a(d(), b()), d0Var.f347a.a());
                layout = this.f314d.f1267e;
                if (layout.getText() instanceof Spanned) {
                }
                bVarArr = null;
                if (bVarArr != null) {
                }
                charSequence = this.f315e;
                if (charSequence instanceof Spanned) {
                }
                this.f316f = obj;
            }
            i11 = i19;
            i12 = 0;
            if (z8) {
            }
            int i2322 = i16;
            int i2422 = i8;
            b2.d0 a322 = a(i13, i18, truncateAt, i7, i11, i2422, i2322, i12);
            int i2522 = a322.f1268f;
            if (z8) {
            }
            this.f314d = a322;
            this.f311a.f4865g.c(d0Var.f347a.c(), v0.d.a(d(), b()), d0Var.f347a.a());
            layout = this.f314d.f1267e;
            if (layout.getText() instanceof Spanned) {
            }
            bVarArr = null;
            if (bVarArr != null) {
            }
            charSequence = this.f315e;
            if (charSequence instanceof Spanned) {
            }
            this.f316f = obj;
        }
        i8 = 0;
        i9 = (i20 >> 8) & 255;
        if (i9 != 1) {
        }
        i16 = 0;
        i10 = (i20 >> 16) & 255;
        if (i10 != 1) {
        }
        i11 = i19;
        i12 = 0;
        if (z8) {
        }
        int i23222 = i16;
        int i24222 = i8;
        b2.d0 a3222 = a(i13, i18, truncateAt, i7, i11, i24222, i23222, i12);
        int i25222 = a3222.f1268f;
        if (z8) {
        }
        this.f314d = a3222;
        this.f311a.f4865g.c(d0Var.f347a.c(), v0.d.a(d(), b()), d0Var.f347a.a());
        layout = this.f314d.f1267e;
        if (layout.getText() instanceof Spanned) {
        }
        bVarArr = null;
        if (bVarArr != null) {
        }
        charSequence = this.f315e;
        if (charSequence instanceof Spanned) {
        }
        this.f316f = obj;
    }

    public final b2.d0 a(int i7, int i8, TextUtils.TruncateAt truncateAt, int i9, int i10, int i11, int i12, int i13) {
        w wVar;
        float d8 = d();
        i2.d dVar = this.f311a;
        i2.e eVar = dVar.f4865g;
        int i14 = dVar.f4870l;
        b2.r rVar = dVar.f4867i;
        k0 k0Var = dVar.f4860b;
        i2.a aVar = i2.b.f4856a;
        y yVar = k0Var.f414c;
        return new b2.d0(this.f315e, d8, eVar, i7, truncateAt, i14, (yVar == null || (wVar = yVar.f465b) == null) ? false : wVar.f462a, i9, i11, i12, i13, i10, i8, rVar);
    }

    public final float b() {
        return this.f314d.a();
    }

    public final long c(y0.d dVar, int i7, a0.s sVar) {
        c2.e cVar;
        int i8;
        int[] iArr;
        RectF v5 = z0.l0.v(dVar);
        int i9 = (i7 != 0 && i7 == 1) ? 1 : 0;
        a aVar = new a(0, sVar);
        b2.d0 d0Var = this.f314d;
        Layout layout = d0Var.f1267e;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            iArr = b2.c.f1261a.a(d0Var, v5, i9, aVar);
        } else {
            q c4 = d0Var.c();
            if (i9 == 1) {
                cVar = new androidx.room.c(layout.getText(), 3, d0Var.j());
            } else {
                CharSequence text = layout.getText();
                cVar = i10 >= 29 ? new c2.c(text, d0Var.f1263a) : new c2.d(text);
            }
            c2.e eVar = cVar;
            int lineForVertical = layout.getLineForVertical((int) v5.top);
            if (v5.top <= d0Var.e(lineForVertical) || (lineForVertical = lineForVertical + 1) < d0Var.f1268f) {
                int i11 = lineForVertical;
                int lineForVertical2 = layout.getLineForVertical((int) v5.bottom);
                if (lineForVertical2 != 0 || v5.bottom >= d0Var.g(0)) {
                    int d8 = b2.y.d(d0Var, layout, c4, i11, v5, eVar, aVar, true);
                    while (true) {
                        i8 = i11;
                        if (d8 != -1 || i8 >= lineForVertical2) {
                            break;
                        }
                        i11 = i8 + 1;
                        d8 = b2.y.d(d0Var, layout, c4, i11, v5, eVar, aVar, true);
                    }
                    if (d8 != -1) {
                        int i12 = lineForVertical2;
                        int d9 = b2.y.d(d0Var, layout, c4, i12, v5, eVar, aVar, false);
                        while (d9 == -1 && i8 < i12) {
                            i12--;
                            d9 = b2.y.d(d0Var, layout, c4, i12, v5, eVar, aVar, false);
                        }
                        if (d9 != -1) {
                            iArr = new int[]{eVar.c(d8 + 1), eVar.d(d9 - 1)};
                        }
                    }
                }
            }
            iArr = null;
        }
        return iArr == null ? j0.f406b : r4.a.h(iArr[0], iArr[1]);
    }

    public final float d() {
        return m2.a.h(this.f313c);
    }

    public final void e(z0.r rVar) {
        Canvas a3 = z0.e.a(rVar);
        b2.d0 d0Var = this.f314d;
        if (d0Var.f1265c) {
            a3.save();
            a3.clipRect(0.0f, 0.0f, d(), b());
        }
        int i7 = d0Var.f1269g;
        if (a3.getClipBounds(d0Var.f1277o)) {
            if (i7 != 0) {
                a3.translate(0.0f, i7);
            }
            b2.c0 c0Var = b2.e0.f1279a;
            c0Var.f1262a = a3;
            d0Var.f1267e.draw(c0Var);
            if (i7 != 0) {
                a3.translate(0.0f, (-1) * i7);
            }
        }
        if (d0Var.f1265c) {
            a3.restore();
        }
    }

    public final void f(z0.r rVar, long j8, o0 o0Var, l2.j jVar, b1.f fVar) {
        i2.e eVar = this.f311a.f4865g;
        int i7 = eVar.f4873c;
        eVar.d(j8);
        eVar.f(o0Var);
        eVar.g(jVar);
        eVar.e(fVar);
        eVar.b(3);
        e(rVar);
        eVar.b(i7);
    }

    public final void g(z0.r rVar, z0.p pVar, float f9, o0 o0Var, l2.j jVar, b1.f fVar) {
        i2.e eVar = this.f311a.f4865g;
        int i7 = eVar.f4873c;
        eVar.c(pVar, v0.d.a(d(), b()), f9);
        eVar.f(o0Var);
        eVar.g(jVar);
        eVar.e(fVar);
        eVar.b(3);
        e(rVar);
        eVar.b(i7);
    }
}
