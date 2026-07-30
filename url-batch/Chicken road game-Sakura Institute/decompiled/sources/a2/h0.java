package a2;

import android.graphics.RectF;
import android.text.Layout;
import d0.t1;
import java.text.BreakIterator;
import java.util.ArrayList;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f388a;

    /* renamed from: b, reason: collision with root package name */
    public final o f389b;

    /* renamed from: c, reason: collision with root package name */
    public final long f390c;

    /* renamed from: d, reason: collision with root package name */
    public final float f391d;

    /* renamed from: e, reason: collision with root package name */
    public final float f392e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f393f;

    public h0(g0 g0Var, o oVar, long j8) {
        this.f388a = g0Var;
        this.f389b = oVar;
        this.f390c = j8;
        ArrayList arrayList = oVar.f431h;
        float f9 = 0.0f;
        this.f391d = arrayList.isEmpty() ? 0.0f : ((r) arrayList.get(0)).f440a.f314d.d(0);
        if (!arrayList.isEmpty()) {
            r rVar = (r) e6.l.n0(arrayList);
            f9 = rVar.f440a.f314d.d(r4.f1268f - 1) + rVar.f445f;
        }
        this.f392e = f9;
        this.f393f = oVar.f430g;
    }

    public final l2.h a(int i7) {
        o oVar = this.f389b;
        ArrayList arrayList = oVar.f431h;
        oVar.i(i7);
        r rVar = (r) arrayList.get(i7 == ((g) oVar.f424a.f436c).f373f.length() ? e6.m.W(arrayList) : a8.m.v(i7, arrayList));
        return rVar.f440a.f314d.f1267e.isRtlCharAt(rVar.b(i7)) ? l2.h.f5874g : l2.h.f5873f;
    }

    public final y0.d b(int i7) {
        float i8;
        float i9;
        float h3;
        float h8;
        o oVar = this.f389b;
        oVar.h(i7);
        ArrayList arrayList = oVar.f431h;
        r rVar = (r) arrayList.get(a8.m.v(i7, arrayList));
        b bVar = rVar.f440a;
        int b9 = rVar.b(i7);
        CharSequence charSequence = bVar.f315e;
        if (b9 < 0 || b9 >= charSequence.length()) {
            StringBuilder n8 = a0.m.n(b9, "offset(", ") is out of bounds [0,");
            n8.append(charSequence.length());
            n8.append(')');
            throw new IllegalArgumentException(n8.toString().toString());
        }
        b2.d0 d0Var = bVar.f314d;
        Layout layout = d0Var.f1267e;
        int lineForOffset = layout.getLineForOffset(b9);
        float g9 = d0Var.g(lineForOffset);
        float e9 = d0Var.e(lineForOffset);
        boolean z8 = layout.getParagraphDirection(lineForOffset) == 1;
        boolean isRtlCharAt = layout.isRtlCharAt(b9);
        if (!z8 || isRtlCharAt) {
            if (z8 && isRtlCharAt) {
                h3 = d0Var.i(b9, false);
                h8 = d0Var.i(b9 + 1, true);
            } else if (isRtlCharAt) {
                h3 = d0Var.h(b9, false);
                h8 = d0Var.h(b9 + 1, true);
            } else {
                i8 = d0Var.i(b9, false);
                i9 = d0Var.i(b9 + 1, true);
            }
            float f9 = h3;
            i8 = h8;
            i9 = f9;
        } else {
            i8 = d0Var.h(b9, false);
            i9 = d0Var.h(b9 + 1, true);
        }
        RectF rectF = new RectF(i8, g9, i9, e9);
        float f10 = rectF.left;
        float f11 = rectF.top;
        float f12 = rectF.right;
        float f13 = rectF.bottom;
        long a3 = u3.r.a(0.0f, rVar.f445f);
        return new y0.d(y0.c.d(a3) + f10, y0.c.e(a3) + f11, y0.c.d(a3) + f12, y0.c.e(a3) + f13);
    }

    public final y0.d c(int i7) {
        o oVar = this.f389b;
        ArrayList arrayList = oVar.f431h;
        oVar.i(i7);
        r rVar = (r) arrayList.get(i7 == ((g) oVar.f424a.f436c).f373f.length() ? e6.m.W(arrayList) : a8.m.v(i7, arrayList));
        b bVar = rVar.f440a;
        int b9 = rVar.b(i7);
        CharSequence charSequence = bVar.f315e;
        b2.d0 d0Var = bVar.f314d;
        if (b9 < 0 || b9 > charSequence.length()) {
            StringBuilder n8 = a0.m.n(b9, "offset(", ") is out of bounds [0,");
            n8.append(charSequence.length());
            n8.append(']');
            throw new IllegalArgumentException(n8.toString().toString());
        }
        float h3 = d0Var.h(b9, false);
        int lineForOffset = d0Var.f1267e.getLineForOffset(b9);
        float g9 = d0Var.g(lineForOffset);
        float e9 = d0Var.e(lineForOffset);
        long a3 = u3.r.a(0.0f, rVar.f445f);
        return new y0.d(y0.c.d(a3) + h3, y0.c.e(a3) + g9, y0.c.d(a3) + h3, y0.c.e(a3) + e9);
    }

    public final int d(int i7, boolean z8) {
        int f9;
        o oVar = this.f389b;
        oVar.j(i7);
        ArrayList arrayList = oVar.f431h;
        r rVar = (r) arrayList.get(a8.m.w(i7, arrayList));
        b bVar = rVar.f440a;
        int i8 = i7 - rVar.f443d;
        b2.d0 d0Var = bVar.f314d;
        if (z8) {
            Layout layout = d0Var.f1267e;
            if (layout.getEllipsisStart(i8) == 0) {
                q c4 = d0Var.c();
                Layout layout2 = (Layout) c4.f436c;
                f9 = c4.i(layout2.getLineEnd(i8), layout2.getLineStart(i8));
            } else {
                f9 = layout.getEllipsisStart(i8) + layout.getLineStart(i8);
            }
        } else {
            f9 = d0Var.f(i8);
        }
        return f9 + rVar.f441b;
    }

    public final int e(int i7) {
        o oVar = this.f389b;
        ArrayList arrayList = oVar.f431h;
        r rVar = (r) arrayList.get(i7 >= ((g) oVar.f424a.f436c).f373f.length() ? e6.m.W(arrayList) : i7 < 0 ? 0 : a8.m.v(i7, arrayList));
        return rVar.f440a.f314d.f1267e.getLineForOffset(rVar.b(i7)) + rVar.f443d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return r6.k.a(this.f388a, h0Var.f388a) && this.f389b.equals(h0Var.f389b) && m2.j.a(this.f390c, h0Var.f390c) && this.f391d == h0Var.f391d && this.f392e == h0Var.f392e && r6.k.a(this.f393f, h0Var.f393f);
    }

    public final float f(int i7) {
        o oVar = this.f389b;
        oVar.j(i7);
        ArrayList arrayList = oVar.f431h;
        r rVar = (r) arrayList.get(a8.m.w(i7, arrayList));
        b bVar = rVar.f440a;
        int i8 = i7 - rVar.f443d;
        b2.d0 d0Var = bVar.f314d;
        return d0Var.f1267e.getLineLeft(i8) + (i8 == d0Var.f1268f + (-1) ? d0Var.f1271i : 0.0f);
    }

    public final float g(int i7) {
        o oVar = this.f389b;
        oVar.j(i7);
        ArrayList arrayList = oVar.f431h;
        r rVar = (r) arrayList.get(a8.m.w(i7, arrayList));
        b bVar = rVar.f440a;
        int i8 = i7 - rVar.f443d;
        b2.d0 d0Var = bVar.f314d;
        return d0Var.f1267e.getLineRight(i8) + (i8 == d0Var.f1268f + (-1) ? d0Var.f1272j : 0.0f);
    }

    public final int h(int i7) {
        o oVar = this.f389b;
        oVar.j(i7);
        ArrayList arrayList = oVar.f431h;
        r rVar = (r) arrayList.get(a8.m.w(i7, arrayList));
        b bVar = rVar.f440a;
        return bVar.f314d.f1267e.getLineStart(i7 - rVar.f443d) + rVar.f441b;
    }

    public final int hashCode() {
        return this.f393f.hashCode() + a0.m.a(this.f392e, a0.m.a(this.f391d, a0.m.d((this.f389b.hashCode() + (this.f388a.hashCode() * 31)) * 31, 31, this.f390c), 31), 31);
    }

    public final l2.h i(int i7) {
        o oVar = this.f389b;
        ArrayList arrayList = oVar.f431h;
        oVar.i(i7);
        r rVar = (r) arrayList.get(i7 == ((g) oVar.f424a.f436c).f373f.length() ? e6.m.W(arrayList) : a8.m.v(i7, arrayList));
        b bVar = rVar.f440a;
        int b9 = rVar.b(i7);
        b2.d0 d0Var = bVar.f314d;
        return d0Var.f1267e.getParagraphDirection(d0Var.f1267e.getLineForOffset(b9)) == 1 ? l2.h.f5873f : l2.h.f5874g;
    }

    public final z0.j j(int i7, int i8) {
        o oVar = this.f389b;
        g gVar = (g) oVar.f424a.f436c;
        if (i7 >= 0 && i7 <= i8 && i8 <= gVar.f373f.length()) {
            if (i7 == i8) {
                return z0.l0.h();
            }
            z0.j h3 = z0.l0.h();
            a8.m.y(oVar.f431h, r4.a.h(i7, i8), new t1(h3, i7, i8, 3));
            return h3;
        }
        throw new IllegalArgumentException(("Start(" + i7 + ") or End(" + i8 + ") is out of range [0.." + gVar.f373f.length() + "), or start > end!").toString());
    }

    public final long k(int i7) {
        int preceding;
        int i8;
        int following;
        o oVar = this.f389b;
        ArrayList arrayList = oVar.f431h;
        oVar.i(i7);
        r rVar = (r) arrayList.get(i7 == ((g) oVar.f424a.f436c).f373f.length() ? e6.m.W(arrayList) : a8.m.v(i7, arrayList));
        b bVar = rVar.f440a;
        int b9 = rVar.b(i7);
        c2.f j8 = bVar.f314d.j();
        BreakIterator breakIterator = (BreakIterator) j8.f1638e;
        j8.a(b9);
        if (j8.f(breakIterator.preceding(b9))) {
            j8.a(b9);
            preceding = b9;
            while (preceding != -1 && (!j8.f(preceding) || j8.d(preceding))) {
                j8.a(preceding);
                preceding = breakIterator.preceding(preceding);
            }
        } else {
            j8.a(b9);
            preceding = j8.e(b9) ? (!breakIterator.isBoundary(b9) || j8.c(b9)) ? breakIterator.preceding(b9) : b9 : j8.c(b9) ? breakIterator.preceding(b9) : -1;
        }
        if (preceding == -1) {
            preceding = b9;
        }
        j8.a(b9);
        if (j8.d(breakIterator.following(b9))) {
            j8.a(b9);
            i8 = b9;
            while (i8 != -1 && (j8.f(i8) || !j8.d(i8))) {
                j8.a(i8);
                i8 = breakIterator.following(i8);
            }
        } else {
            j8.a(b9);
            if (j8.c(b9)) {
                if (!breakIterator.isBoundary(b9) || j8.e(b9)) {
                    following = breakIterator.following(b9);
                    i8 = following;
                } else {
                    i8 = b9;
                }
            } else if (j8.e(b9)) {
                following = breakIterator.following(b9);
                i8 = following;
            } else {
                i8 = -1;
            }
        }
        if (i8 != -1) {
            b9 = i8;
        }
        return rVar.a(r4.a.h(preceding, b9), false);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.f388a + ", multiParagraph=" + this.f389b + ", size=" + ((Object) m2.j.b(this.f390c)) + ", firstBaseline=" + this.f391d + ", lastBaseline=" + this.f392e + ", placeholderRects=" + this.f393f + ')';
    }
}
