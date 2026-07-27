package A0;

import A.AbstractC0017m;
import D.C0174u0;
import Z.C0313j;
import a.AbstractC0345a;
import android.graphics.RectF;
import android.text.Layout;
import java.text.BreakIterator;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import z2.C1403G;
import z2.C1441y;

/* loaded from: classes.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    public final H f289a;

    /* renamed from: b, reason: collision with root package name */
    public final o f290b;

    /* renamed from: c, reason: collision with root package name */
    public final long f291c;

    /* renamed from: d, reason: collision with root package name */
    public final float f292d;

    /* renamed from: e, reason: collision with root package name */
    public final float f293e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f294f;

    public I(H h4, o oVar, long j4) {
        this.f289a = h4;
        this.f290b = oVar;
        this.f291c = j4;
        ArrayList arrayList = oVar.f357h;
        float f4 = 0.0f;
        this.f292d = arrayList.isEmpty() ? 0.0f : ((r) arrayList.get(0)).f366a.f313d.d(0);
        if (!arrayList.isEmpty()) {
            r rVar = (r) C1403G.x(arrayList);
            f4 = rVar.f366a.f313d.d(r4.f906g - 1) + rVar.f371f;
        }
        this.f293e = f4;
        this.f294f = oVar.f356g;
    }

    public final L0.h a(int i2) {
        o oVar = this.f290b;
        oVar.j(i2);
        int length = ((C0036g) oVar.f350a.f362c).f328a.length();
        ArrayList arrayList = oVar.f357h;
        r rVar = (r) arrayList.get(i2 == length ? C1441y.d(arrayList) : u3.d.x(i2, arrayList));
        return rVar.f366a.f313d.f905f.isRtlCharAt(rVar.b(i2)) ? L0.h.f3507e : L0.h.f3506d;
    }

    public final Y.d b(int i2) {
        float i4;
        float i5;
        float h4;
        float h5;
        o oVar = this.f290b;
        oVar.i(i2);
        ArrayList arrayList = oVar.f357h;
        r rVar = (r) arrayList.get(u3.d.x(i2, arrayList));
        C0031b c0031b = rVar.f366a;
        int b4 = rVar.b(i2);
        CharSequence charSequence = c0031b.f314e;
        if (b4 < 0 || b4 >= charSequence.length()) {
            StringBuilder o4 = AbstractC0017m.o(b4, "offset(", ") is out of bounds [0,");
            o4.append(charSequence.length());
            o4.append(')');
            throw new IllegalArgumentException(o4.toString().toString());
        }
        B0.F f4 = c0031b.f313d;
        Layout layout = f4.f905f;
        int lineForOffset = layout.getLineForOffset(b4);
        float g4 = f4.g(lineForOffset);
        float e4 = f4.e(lineForOffset);
        boolean z4 = layout.getParagraphDirection(lineForOffset) == 1;
        boolean isRtlCharAt = layout.isRtlCharAt(b4);
        if (!z4 || isRtlCharAt) {
            if (z4 && isRtlCharAt) {
                h4 = f4.i(b4, false);
                h5 = f4.i(b4 + 1, true);
            } else if (isRtlCharAt) {
                h4 = f4.h(b4, false);
                h5 = f4.h(b4 + 1, true);
            } else {
                i4 = f4.i(b4, false);
                i5 = f4.i(b4 + 1, true);
            }
            float f5 = h4;
            i4 = h5;
            i5 = f5;
        } else {
            i4 = f4.h(b4, false);
            i5 = f4.h(b4 + 1, true);
        }
        RectF rectF = new RectF(i4, g4, i5, e4);
        float f6 = rectF.left;
        float f7 = rectF.top;
        float f8 = rectF.right;
        float f9 = rectF.bottom;
        long c4 = AbstractC0345a.c(0.0f, rVar.f371f);
        return new Y.d(Y.c.d(c4) + f6, Y.c.e(c4) + f7, Y.c.d(c4) + f8, Y.c.e(c4) + f9);
    }

    public final Y.d c(int i2) {
        o oVar = this.f290b;
        oVar.j(i2);
        int length = ((C0036g) oVar.f350a.f362c).f328a.length();
        ArrayList arrayList = oVar.f357h;
        r rVar = (r) arrayList.get(i2 == length ? C1441y.d(arrayList) : u3.d.x(i2, arrayList));
        C0031b c0031b = rVar.f366a;
        int b4 = rVar.b(i2);
        CharSequence charSequence = c0031b.f314e;
        if (b4 < 0 || b4 > charSequence.length()) {
            StringBuilder o4 = AbstractC0017m.o(b4, "offset(", ") is out of bounds [0,");
            o4.append(charSequence.length());
            o4.append(']');
            throw new IllegalArgumentException(o4.toString().toString());
        }
        B0.F f4 = c0031b.f313d;
        float h4 = f4.h(b4, false);
        int lineForOffset = f4.f905f.getLineForOffset(b4);
        float g4 = f4.g(lineForOffset);
        float e4 = f4.e(lineForOffset);
        long c4 = AbstractC0345a.c(0.0f, rVar.f371f);
        return new Y.d(Y.c.d(c4) + h4, Y.c.e(c4) + g4, Y.c.d(c4) + h4, Y.c.e(c4) + e4);
    }

    public final int d(int i2, boolean z4) {
        int f4;
        o oVar = this.f290b;
        oVar.k(i2);
        ArrayList arrayList = oVar.f357h;
        r rVar = (r) arrayList.get(u3.d.y(i2, arrayList));
        C0031b c0031b = rVar.f366a;
        int i4 = i2 - rVar.f369d;
        B0.F f5 = c0031b.f313d;
        if (z4) {
            Layout layout = f5.f905f;
            if (layout.getEllipsisStart(i4) == 0) {
                q c4 = f5.c();
                Layout layout2 = (Layout) c4.f362c;
                f4 = c4.j(layout2.getLineEnd(i4), layout2.getLineStart(i4));
            } else {
                f4 = layout.getEllipsisStart(i4) + layout.getLineStart(i4);
            }
        } else {
            f4 = f5.f(i4);
        }
        return f4 + rVar.f367b;
    }

    public final int e(int i2) {
        o oVar = this.f290b;
        int length = ((C0036g) oVar.f350a.f362c).f328a.length();
        ArrayList arrayList = oVar.f357h;
        r rVar = (r) arrayList.get(i2 >= length ? C1441y.d(arrayList) : i2 < 0 ? 0 : u3.d.x(i2, arrayList));
        return rVar.f366a.f313d.f905f.getLineForOffset(rVar.b(i2)) + rVar.f369d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I)) {
            return false;
        }
        I i2 = (I) obj;
        return Intrinsics.a(this.f289a, i2.f289a) && this.f290b.equals(i2.f290b) && M0.j.a(this.f291c, i2.f291c) && this.f292d == i2.f292d && this.f293e == i2.f293e && Intrinsics.a(this.f294f, i2.f294f);
    }

    public final float f(int i2) {
        o oVar = this.f290b;
        oVar.k(i2);
        ArrayList arrayList = oVar.f357h;
        r rVar = (r) arrayList.get(u3.d.y(i2, arrayList));
        C0031b c0031b = rVar.f366a;
        int i4 = i2 - rVar.f369d;
        B0.F f4 = c0031b.f313d;
        return f4.f905f.getLineLeft(i4) + (i4 == f4.f906g + (-1) ? f4.f909j : 0.0f);
    }

    public final float g(int i2) {
        o oVar = this.f290b;
        oVar.k(i2);
        ArrayList arrayList = oVar.f357h;
        r rVar = (r) arrayList.get(u3.d.y(i2, arrayList));
        C0031b c0031b = rVar.f366a;
        int i4 = i2 - rVar.f369d;
        B0.F f4 = c0031b.f313d;
        return f4.f905f.getLineRight(i4) + (i4 == f4.f906g + (-1) ? f4.f910k : 0.0f);
    }

    public final int h(int i2) {
        o oVar = this.f290b;
        oVar.k(i2);
        ArrayList arrayList = oVar.f357h;
        r rVar = (r) arrayList.get(u3.d.y(i2, arrayList));
        C0031b c0031b = rVar.f366a;
        return c0031b.f313d.f905f.getLineStart(i2 - rVar.f369d) + rVar.f367b;
    }

    public final int hashCode() {
        return this.f294f.hashCode() + AbstractC0017m.a(this.f293e, AbstractC0017m.a(this.f292d, AbstractC0017m.c((this.f290b.hashCode() + (this.f289a.hashCode() * 31)) * 31, 31, this.f291c), 31), 31);
    }

    public final L0.h i(int i2) {
        o oVar = this.f290b;
        oVar.j(i2);
        int length = ((C0036g) oVar.f350a.f362c).f328a.length();
        ArrayList arrayList = oVar.f357h;
        r rVar = (r) arrayList.get(i2 == length ? C1441y.d(arrayList) : u3.d.x(i2, arrayList));
        C0031b c0031b = rVar.f366a;
        int b4 = rVar.b(i2);
        B0.F f4 = c0031b.f313d;
        return f4.f905f.getParagraphDirection(f4.f905f.getLineForOffset(b4)) == 1 ? L0.h.f3506d : L0.h.f3507e;
    }

    public final C0313j j(int i2, int i4) {
        o oVar = this.f290b;
        C0036g c0036g = (C0036g) oVar.f350a.f362c;
        if (i2 >= 0 && i2 <= i4 && i4 <= c0036g.f328a.length()) {
            if (i2 == i4) {
                return Z.K.h();
            }
            C0313j h4 = Z.K.h();
            u3.d.A(oVar.f357h, M1.a.j(i2, i4), new C0174u0(h4, i2, i4, 4));
            return h4;
        }
        throw new IllegalArgumentException(("Start(" + i2 + ") or End(" + i4 + ") is out of range [0.." + c0036g.f328a.length() + "), or start > end!").toString());
    }

    public final long k(int i2) {
        int preceding;
        int i4;
        int following;
        o oVar = this.f290b;
        oVar.j(i2);
        int length = ((C0036g) oVar.f350a.f362c).f328a.length();
        ArrayList arrayList = oVar.f357h;
        r rVar = (r) arrayList.get(i2 == length ? C1441y.d(arrayList) : u3.d.x(i2, arrayList));
        C0031b c0031b = rVar.f366a;
        int b4 = rVar.b(i2);
        C0.f j4 = c0031b.f313d.j();
        j4.a(b4);
        BreakIterator breakIterator = (BreakIterator) j4.f1159e;
        if (j4.f(breakIterator.preceding(b4))) {
            j4.a(b4);
            preceding = b4;
            while (preceding != -1 && (!j4.f(preceding) || j4.d(preceding))) {
                j4.a(preceding);
                preceding = breakIterator.preceding(preceding);
            }
        } else {
            j4.a(b4);
            preceding = j4.e(b4) ? (!breakIterator.isBoundary(b4) || j4.c(b4)) ? breakIterator.preceding(b4) : b4 : j4.c(b4) ? breakIterator.preceding(b4) : -1;
        }
        if (preceding == -1) {
            preceding = b4;
        }
        j4.a(b4);
        if (j4.d(breakIterator.following(b4))) {
            j4.a(b4);
            i4 = b4;
            while (i4 != -1 && (j4.f(i4) || !j4.d(i4))) {
                j4.a(i4);
                i4 = breakIterator.following(i4);
            }
        } else {
            j4.a(b4);
            if (j4.c(b4)) {
                following = (!breakIterator.isBoundary(b4) || j4.e(b4)) ? breakIterator.following(b4) : b4;
            } else if (j4.e(b4)) {
                following = breakIterator.following(b4);
            } else {
                i4 = -1;
            }
            i4 = following;
        }
        if (i4 != -1) {
            b4 = i4;
        }
        return rVar.a(M1.a.j(preceding, b4), false);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.f289a + ", multiParagraph=" + this.f290b + ", size=" + ((Object) M0.j.d(this.f291c)) + ", firstBaseline=" + this.f292d + ", lastBaseline=" + this.f293e + ", placeholderRects=" + this.f294f + ')';
    }
}
