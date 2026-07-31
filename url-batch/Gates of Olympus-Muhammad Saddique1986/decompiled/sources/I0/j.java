package I0;

import B.C0014o;
import C0.C0031g;
import C0.J;
import h2.AbstractC0508a;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final E0.f f3065a;

    /* renamed from: b, reason: collision with root package name */
    public int f3066b;

    /* renamed from: c, reason: collision with root package name */
    public int f3067c;

    /* renamed from: d, reason: collision with root package name */
    public int f3068d;

    /* renamed from: e, reason: collision with root package name */
    public int f3069e;

    public j(C0031g c0031g, long j3) {
        String str = c0031g.f596a;
        E0.f fVar = new E0.f();
        fVar.f1030d = str;
        fVar.f1028b = -1;
        fVar.f1029c = -1;
        this.f3065a = fVar;
        this.f3066b = J.e(j3);
        this.f3067c = J.d(j3);
        this.f3068d = -1;
        this.f3069e = -1;
        int e3 = J.e(j3);
        int d3 = J.d(j3);
        String str2 = c0031g.f596a;
        if (e3 < 0 || e3 > str2.length()) {
            StringBuilder k3 = A.k.k(e3, "start (", ") offset is outside of text region ");
            k3.append(str2.length());
            throw new IndexOutOfBoundsException(k3.toString());
        }
        if (d3 < 0 || d3 > str2.length()) {
            StringBuilder k4 = A.k.k(d3, "end (", ") offset is outside of text region ");
            k4.append(str2.length());
            throw new IndexOutOfBoundsException(k4.toString());
        }
        if (e3 > d3) {
            throw new IllegalArgumentException(A.k.f(e3, d3, "Do not set reversed range: ", " > "));
        }
    }

    public final void a(int i3, int i4) {
        long J3 = O2.l.J(i3, i4);
        this.f3065a.g(i3, i4, "");
        long Z2 = AbstractC0508a.Z(O2.l.J(this.f3066b, this.f3067c), J3);
        h(J.e(Z2));
        g(J.d(Z2));
        int i5 = this.f3068d;
        if (i5 != -1) {
            long Z3 = AbstractC0508a.Z(O2.l.J(i5, this.f3069e), J3);
            if (J.b(Z3)) {
                this.f3068d = -1;
                this.f3069e = -1;
            } else {
                this.f3068d = J.e(Z3);
                this.f3069e = J.d(Z3);
            }
        }
    }

    public final char b(int i3) {
        E0.f fVar = this.f3065a;
        C0014o c0014o = (C0014o) fVar.f1031e;
        if (c0014o == null) {
            return ((String) fVar.f1030d).charAt(i3);
        }
        if (i3 < fVar.f1028b) {
            return ((String) fVar.f1030d).charAt(i3);
        }
        int b3 = c0014o.f428b - c0014o.b();
        int i4 = fVar.f1028b;
        if (i3 >= b3 + i4) {
            return ((String) fVar.f1030d).charAt(i3 - ((b3 - fVar.f1029c) + i4));
        }
        int i5 = i3 - i4;
        int i6 = c0014o.f429c;
        return i5 < i6 ? ((char[]) c0014o.f431e)[i5] : ((char[]) c0014o.f431e)[(i5 - i6) + c0014o.f430d];
    }

    public final J c() {
        int i3 = this.f3068d;
        if (i3 != -1) {
            return new J(O2.l.J(i3, this.f3069e));
        }
        return null;
    }

    public final void d(int i3, int i4, String str) {
        E0.f fVar = this.f3065a;
        if (i3 < 0 || i3 > fVar.b()) {
            StringBuilder k3 = A.k.k(i3, "start (", ") offset is outside of text region ");
            k3.append(fVar.b());
            throw new IndexOutOfBoundsException(k3.toString());
        }
        if (i4 < 0 || i4 > fVar.b()) {
            StringBuilder k4 = A.k.k(i4, "end (", ") offset is outside of text region ");
            k4.append(fVar.b());
            throw new IndexOutOfBoundsException(k4.toString());
        }
        if (i3 > i4) {
            throw new IllegalArgumentException(A.k.f(i3, i4, "Do not set reversed range: ", " > "));
        }
        fVar.g(i3, i4, str);
        h(str.length() + i3);
        g(str.length() + i3);
        this.f3068d = -1;
        this.f3069e = -1;
    }

    public final void e(int i3, int i4) {
        E0.f fVar = this.f3065a;
        if (i3 < 0 || i3 > fVar.b()) {
            StringBuilder k3 = A.k.k(i3, "start (", ") offset is outside of text region ");
            k3.append(fVar.b());
            throw new IndexOutOfBoundsException(k3.toString());
        }
        if (i4 < 0 || i4 > fVar.b()) {
            StringBuilder k4 = A.k.k(i4, "end (", ") offset is outside of text region ");
            k4.append(fVar.b());
            throw new IndexOutOfBoundsException(k4.toString());
        }
        if (i3 >= i4) {
            throw new IllegalArgumentException(A.k.f(i3, i4, "Do not set reversed or empty range: ", " > "));
        }
        this.f3068d = i3;
        this.f3069e = i4;
    }

    public final void f(int i3, int i4) {
        E0.f fVar = this.f3065a;
        if (i3 < 0 || i3 > fVar.b()) {
            StringBuilder k3 = A.k.k(i3, "start (", ") offset is outside of text region ");
            k3.append(fVar.b());
            throw new IndexOutOfBoundsException(k3.toString());
        }
        if (i4 < 0 || i4 > fVar.b()) {
            StringBuilder k4 = A.k.k(i4, "end (", ") offset is outside of text region ");
            k4.append(fVar.b());
            throw new IndexOutOfBoundsException(k4.toString());
        }
        if (i3 > i4) {
            throw new IllegalArgumentException(A.k.f(i3, i4, "Do not set reversed range: ", " > "));
        }
        h(i3);
        g(i4);
    }

    public final void g(int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException(A.k.h("Cannot set selectionEnd to a negative value: ", i3).toString());
        }
        this.f3067c = i3;
    }

    public final void h(int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException(A.k.h("Cannot set selectionStart to a negative value: ", i3).toString());
        }
        this.f3066b = i3;
    }

    public final String toString() {
        return this.f3065a.toString();
    }
}
