package G0;

import A.AbstractC0017m;
import A.C0020p;
import A0.C0036g;
import A0.K;
import a.AbstractC0345a;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final C0.f f3061a;

    /* renamed from: b, reason: collision with root package name */
    public int f3062b;

    /* renamed from: c, reason: collision with root package name */
    public int f3063c;

    /* renamed from: d, reason: collision with root package name */
    public int f3064d;

    /* renamed from: e, reason: collision with root package name */
    public int f3065e;

    public j(C0036g c0036g, long j4) {
        String str = c0036g.f328a;
        C0.f fVar = new C0.f();
        fVar.f1158d = str;
        fVar.f1156b = -1;
        fVar.f1157c = -1;
        this.f3061a = fVar;
        this.f3062b = K.e(j4);
        this.f3063c = K.d(j4);
        this.f3064d = -1;
        this.f3065e = -1;
        int e4 = K.e(j4);
        int d4 = K.d(j4);
        String str2 = c0036g.f328a;
        if (e4 < 0 || e4 > str2.length()) {
            StringBuilder o4 = AbstractC0017m.o(e4, "start (", ") offset is outside of text region ");
            o4.append(str2.length());
            throw new IndexOutOfBoundsException(o4.toString());
        }
        if (d4 < 0 || d4 > str2.length()) {
            StringBuilder o5 = AbstractC0017m.o(d4, "end (", ") offset is outside of text region ");
            o5.append(str2.length());
            throw new IndexOutOfBoundsException(o5.toString());
        }
        if (e4 > d4) {
            throw new IllegalArgumentException(r0.B.b(e4, d4, "Do not set reversed range: ", " > "));
        }
    }

    public final void a(int i2, int i4) {
        long j4 = M1.a.j(i2, i4);
        this.f3061a.g("", i2, i4);
        long J3 = AbstractC0345a.J(M1.a.j(this.f3062b, this.f3063c), j4);
        h(K.e(J3));
        g(K.d(J3));
        int i5 = this.f3064d;
        if (i5 != -1) {
            long J4 = AbstractC0345a.J(M1.a.j(i5, this.f3065e), j4);
            if (K.b(J4)) {
                this.f3064d = -1;
                this.f3065e = -1;
            } else {
                this.f3064d = K.e(J4);
                this.f3065e = K.d(J4);
            }
        }
    }

    public final char b(int i2) {
        C0.f fVar = this.f3061a;
        C0020p c0020p = (C0020p) fVar.f1159e;
        if (c0020p != null && i2 >= fVar.f1156b) {
            int b4 = c0020p.f172b - c0020p.b();
            int i4 = fVar.f1156b;
            if (i2 >= b4 + i4) {
                return ((String) fVar.f1158d).charAt(i2 - ((b4 - fVar.f1157c) + i4));
            }
            int i5 = i2 - i4;
            int i6 = c0020p.f173c;
            return i5 < i6 ? ((char[]) c0020p.f175e)[i5] : ((char[]) c0020p.f175e)[(i5 - i6) + c0020p.f174d];
        }
        return ((String) fVar.f1158d).charAt(i2);
    }

    public final K c() {
        int i2 = this.f3064d;
        if (i2 != -1) {
            return new K(M1.a.j(i2, this.f3065e));
        }
        return null;
    }

    public final void d(String str, int i2, int i4) {
        C0.f fVar = this.f3061a;
        if (i2 < 0 || i2 > fVar.b()) {
            StringBuilder o4 = AbstractC0017m.o(i2, "start (", ") offset is outside of text region ");
            o4.append(fVar.b());
            throw new IndexOutOfBoundsException(o4.toString());
        }
        if (i4 < 0 || i4 > fVar.b()) {
            StringBuilder o5 = AbstractC0017m.o(i4, "end (", ") offset is outside of text region ");
            o5.append(fVar.b());
            throw new IndexOutOfBoundsException(o5.toString());
        }
        if (i2 > i4) {
            throw new IllegalArgumentException(r0.B.b(i2, i4, "Do not set reversed range: ", " > "));
        }
        fVar.g(str, i2, i4);
        h(str.length() + i2);
        g(str.length() + i2);
        this.f3064d = -1;
        this.f3065e = -1;
    }

    public final void e(int i2, int i4) {
        C0.f fVar = this.f3061a;
        if (i2 < 0 || i2 > fVar.b()) {
            StringBuilder o4 = AbstractC0017m.o(i2, "start (", ") offset is outside of text region ");
            o4.append(fVar.b());
            throw new IndexOutOfBoundsException(o4.toString());
        }
        if (i4 < 0 || i4 > fVar.b()) {
            StringBuilder o5 = AbstractC0017m.o(i4, "end (", ") offset is outside of text region ");
            o5.append(fVar.b());
            throw new IndexOutOfBoundsException(o5.toString());
        }
        if (i2 >= i4) {
            throw new IllegalArgumentException(r0.B.b(i2, i4, "Do not set reversed or empty range: ", " > "));
        }
        this.f3064d = i2;
        this.f3065e = i4;
    }

    public final void f(int i2, int i4) {
        C0.f fVar = this.f3061a;
        if (i2 < 0 || i2 > fVar.b()) {
            StringBuilder o4 = AbstractC0017m.o(i2, "start (", ") offset is outside of text region ");
            o4.append(fVar.b());
            throw new IndexOutOfBoundsException(o4.toString());
        }
        if (i4 < 0 || i4 > fVar.b()) {
            StringBuilder o5 = AbstractC0017m.o(i4, "end (", ") offset is outside of text region ");
            o5.append(fVar.b());
            throw new IndexOutOfBoundsException(o5.toString());
        }
        if (i2 > i4) {
            throw new IllegalArgumentException(r0.B.b(i2, i4, "Do not set reversed range: ", " > "));
        }
        h(i2);
        g(i4);
    }

    public final void g(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(AbstractC0017m.g(i2, "Cannot set selectionEnd to a negative value: ").toString());
        }
        this.f3063c = i2;
    }

    public final void h(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(AbstractC0017m.g(i2, "Cannot set selectionStart to a negative value: ").toString());
        }
        this.f3062b = i2;
    }

    public final String toString() {
        return this.f3061a.toString();
    }
}
