package C0;

import F.C0;
import a0.C0238c;
import a0.C0239d;
import android.graphics.RectF;
import android.text.Layout;
import b0.C0341j;
import java.text.BreakIterator;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public final G f557a;

    /* renamed from: b, reason: collision with root package name */
    public final o f558b;

    /* renamed from: c, reason: collision with root package name */
    public final long f559c;

    /* renamed from: d, reason: collision with root package name */
    public final float f560d;

    /* renamed from: e, reason: collision with root package name */
    public final float f561e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f562f;

    public H(G g3, o oVar, long j3) {
        this.f557a = g3;
        this.f558b = oVar;
        this.f559c = j3;
        ArrayList arrayList = oVar.f625h;
        float f3 = 0.0f;
        this.f560d = arrayList.isEmpty() ? 0.0f : ((r) arrayList.get(0)).f634a.f581d.d(0);
        if (!arrayList.isEmpty()) {
            r rVar = (r) S1.l.Q0(arrayList);
            f3 = rVar.f634a.f581d.d(r4.f828g - 1) + rVar.f639f;
        }
        this.f561e = f3;
        this.f562f = oVar.f624g;
    }

    public final N0.h a(int i3) {
        o oVar = this.f558b;
        oVar.j(i3);
        int length = ((C0031g) oVar.f618a.f630c).f596a.length();
        ArrayList arrayList = oVar.f625h;
        r rVar = (r) arrayList.get(i3 == length ? S1.m.z0(arrayList) : l0.c.t(i3, arrayList));
        return rVar.f634a.f581d.f827f.isRtlCharAt(rVar.b(i3)) ? N0.h.f3545e : N0.h.f3544d;
    }

    public final C0239d b(int i3) {
        float i4;
        float i5;
        float h3;
        float h4;
        o oVar = this.f558b;
        oVar.i(i3);
        ArrayList arrayList = oVar.f625h;
        r rVar = (r) arrayList.get(l0.c.t(i3, arrayList));
        C0026b c0026b = rVar.f634a;
        int b3 = rVar.b(i3);
        CharSequence charSequence = c0026b.f582e;
        if (b3 < 0 || b3 >= charSequence.length()) {
            StringBuilder k3 = A.k.k(b3, "offset(", ") is out of bounds [0,");
            k3.append(charSequence.length());
            k3.append(')');
            throw new IllegalArgumentException(k3.toString().toString());
        }
        D0.G g3 = c0026b.f581d;
        Layout layout = g3.f827f;
        int lineForOffset = layout.getLineForOffset(b3);
        float g4 = g3.g(lineForOffset);
        float e3 = g3.e(lineForOffset);
        boolean z3 = layout.getParagraphDirection(lineForOffset) == 1;
        boolean isRtlCharAt = layout.isRtlCharAt(b3);
        if (!z3 || isRtlCharAt) {
            if (z3 && isRtlCharAt) {
                h3 = g3.i(b3, false);
                h4 = g3.i(b3 + 1, true);
            } else if (isRtlCharAt) {
                h3 = g3.h(b3, false);
                h4 = g3.h(b3 + 1, true);
            } else {
                i4 = g3.i(b3, false);
                i5 = g3.i(b3 + 1, true);
            }
            float f3 = h3;
            i4 = h4;
            i5 = f3;
        } else {
            i4 = g3.h(b3, false);
            i5 = g3.h(b3 + 1, true);
        }
        RectF rectF = new RectF(i4, g4, i5, e3);
        float f4 = rectF.left;
        float f5 = rectF.top;
        float f6 = rectF.right;
        float f7 = rectF.bottom;
        long e4 = l0.c.e(0.0f, rVar.f639f);
        return new C0239d(C0238c.d(e4) + f4, C0238c.e(e4) + f5, C0238c.d(e4) + f6, C0238c.e(e4) + f7);
    }

    public final C0239d c(int i3) {
        o oVar = this.f558b;
        oVar.j(i3);
        int length = ((C0031g) oVar.f618a.f630c).f596a.length();
        ArrayList arrayList = oVar.f625h;
        r rVar = (r) arrayList.get(i3 == length ? S1.m.z0(arrayList) : l0.c.t(i3, arrayList));
        C0026b c0026b = rVar.f634a;
        int b3 = rVar.b(i3);
        CharSequence charSequence = c0026b.f582e;
        if (b3 < 0 || b3 > charSequence.length()) {
            StringBuilder k3 = A.k.k(b3, "offset(", ") is out of bounds [0,");
            k3.append(charSequence.length());
            k3.append(']');
            throw new IllegalArgumentException(k3.toString().toString());
        }
        D0.G g3 = c0026b.f581d;
        float h3 = g3.h(b3, false);
        int lineForOffset = g3.f827f.getLineForOffset(b3);
        float g4 = g3.g(lineForOffset);
        float e3 = g3.e(lineForOffset);
        long e4 = l0.c.e(0.0f, rVar.f639f);
        return new C0239d(C0238c.d(e4) + h3, C0238c.e(e4) + g4, C0238c.d(e4) + h3, C0238c.e(e4) + e3);
    }

    public final int d(int i3, boolean z3) {
        int f3;
        o oVar = this.f558b;
        oVar.k(i3);
        ArrayList arrayList = oVar.f625h;
        r rVar = (r) arrayList.get(l0.c.u(i3, arrayList));
        C0026b c0026b = rVar.f634a;
        int i4 = i3 - rVar.f637d;
        D0.G g3 = c0026b.f581d;
        if (z3) {
            Layout layout = g3.f827f;
            if (layout.getEllipsisStart(i4) == 0) {
                q c2 = g3.c();
                Layout layout2 = (Layout) c2.f630c;
                f3 = c2.i(layout2.getLineEnd(i4), layout2.getLineStart(i4));
            } else {
                f3 = layout.getEllipsisStart(i4) + layout.getLineStart(i4);
            }
        } else {
            f3 = g3.f(i4);
        }
        return f3 + rVar.f635b;
    }

    public final int e(int i3) {
        o oVar = this.f558b;
        int length = ((C0031g) oVar.f618a.f630c).f596a.length();
        ArrayList arrayList = oVar.f625h;
        r rVar = (r) arrayList.get(i3 >= length ? S1.m.z0(arrayList) : i3 < 0 ? 0 : l0.c.t(i3, arrayList));
        return rVar.f634a.f581d.f827f.getLineForOffset(rVar.b(i3)) + rVar.f637d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        H h3 = (H) obj;
        return f2.j.a(this.f557a, h3.f557a) && this.f558b.equals(h3.f558b) && O0.j.a(this.f559c, h3.f559c) && this.f560d == h3.f560d && this.f561e == h3.f561e && f2.j.a(this.f562f, h3.f562f);
    }

    public final float f(int i3) {
        o oVar = this.f558b;
        oVar.k(i3);
        ArrayList arrayList = oVar.f625h;
        r rVar = (r) arrayList.get(l0.c.u(i3, arrayList));
        C0026b c0026b = rVar.f634a;
        int i4 = i3 - rVar.f637d;
        D0.G g3 = c0026b.f581d;
        return g3.f827f.getLineLeft(i4) + (i4 == g3.f828g + (-1) ? g3.f831j : 0.0f);
    }

    public final float g(int i3) {
        o oVar = this.f558b;
        oVar.k(i3);
        ArrayList arrayList = oVar.f625h;
        r rVar = (r) arrayList.get(l0.c.u(i3, arrayList));
        C0026b c0026b = rVar.f634a;
        int i4 = i3 - rVar.f637d;
        D0.G g3 = c0026b.f581d;
        return g3.f827f.getLineRight(i4) + (i4 == g3.f828g + (-1) ? g3.f832k : 0.0f);
    }

    public final int h(int i3) {
        o oVar = this.f558b;
        oVar.k(i3);
        ArrayList arrayList = oVar.f625h;
        r rVar = (r) arrayList.get(l0.c.u(i3, arrayList));
        C0026b c0026b = rVar.f634a;
        return c0026b.f581d.f827f.getLineStart(i3 - rVar.f637d) + rVar.f635b;
    }

    public final int hashCode() {
        return this.f562f.hashCode() + A.k.a(this.f561e, A.k.a(this.f560d, A.k.c((this.f558b.hashCode() + (this.f557a.hashCode() * 31)) * 31, 31, this.f559c), 31), 31);
    }

    public final N0.h i(int i3) {
        o oVar = this.f558b;
        oVar.j(i3);
        int length = ((C0031g) oVar.f618a.f630c).f596a.length();
        ArrayList arrayList = oVar.f625h;
        r rVar = (r) arrayList.get(i3 == length ? S1.m.z0(arrayList) : l0.c.t(i3, arrayList));
        C0026b c0026b = rVar.f634a;
        int b3 = rVar.b(i3);
        D0.G g3 = c0026b.f581d;
        return g3.f827f.getParagraphDirection(g3.f827f.getLineForOffset(b3)) == 1 ? N0.h.f3544d : N0.h.f3545e;
    }

    public final C0341j j(int i3, int i4) {
        o oVar = this.f558b;
        C0031g c0031g = (C0031g) oVar.f618a.f630c;
        if (i3 >= 0 && i3 <= i4 && i4 <= c0031g.f596a.length()) {
            if (i3 == i4) {
                return b0.M.h();
            }
            C0341j h3 = b0.M.h();
            l0.c.w(oVar.f625h, O2.l.J(i3, i4), new C0(h3, i3, i4, 3));
            return h3;
        }
        throw new IllegalArgumentException(("Start(" + i3 + ") or End(" + i4 + ") is out of range [0.." + c0031g.f596a.length() + "), or start > end!").toString());
    }

    public final long k(int i3) {
        int preceding;
        int i4;
        int following;
        o oVar = this.f558b;
        oVar.j(i3);
        int length = ((C0031g) oVar.f618a.f630c).f596a.length();
        ArrayList arrayList = oVar.f625h;
        r rVar = (r) arrayList.get(i3 == length ? S1.m.z0(arrayList) : l0.c.t(i3, arrayList));
        C0026b c0026b = rVar.f634a;
        int b3 = rVar.b(i3);
        E0.f j3 = c0026b.f581d.j();
        j3.a(b3);
        BreakIterator breakIterator = (BreakIterator) j3.f1031e;
        if (j3.f(breakIterator.preceding(b3))) {
            j3.a(b3);
            preceding = b3;
            while (preceding != -1 && (!j3.f(preceding) || j3.d(preceding))) {
                j3.a(preceding);
                preceding = breakIterator.preceding(preceding);
            }
        } else {
            j3.a(b3);
            preceding = j3.e(b3) ? (!breakIterator.isBoundary(b3) || j3.c(b3)) ? breakIterator.preceding(b3) : b3 : j3.c(b3) ? breakIterator.preceding(b3) : -1;
        }
        if (preceding == -1) {
            preceding = b3;
        }
        j3.a(b3);
        if (j3.d(breakIterator.following(b3))) {
            j3.a(b3);
            i4 = b3;
            while (i4 != -1 && (j3.f(i4) || !j3.d(i4))) {
                j3.a(i4);
                i4 = breakIterator.following(i4);
            }
        } else {
            j3.a(b3);
            if (j3.c(b3)) {
                following = (!breakIterator.isBoundary(b3) || j3.e(b3)) ? breakIterator.following(b3) : b3;
            } else if (j3.e(b3)) {
                following = breakIterator.following(b3);
            } else {
                i4 = -1;
            }
            i4 = following;
        }
        if (i4 != -1) {
            b3 = i4;
        }
        return rVar.a(O2.l.J(preceding, b3), false);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.f557a + ", multiParagraph=" + this.f558b + ", size=" + ((Object) O0.j.d(this.f559c)) + ", firstBaseline=" + this.f560d + ", lastBaseline=" + this.f561e + ", placeholderRects=" + this.f562f + ')';
    }
}
