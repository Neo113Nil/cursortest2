package g2;

import a2.j0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final c2.f f4035a;

    /* renamed from: b, reason: collision with root package name */
    public int f4036b;

    /* renamed from: c, reason: collision with root package name */
    public int f4037c;

    /* renamed from: d, reason: collision with root package name */
    public int f4038d;

    /* renamed from: e, reason: collision with root package name */
    public int f4039e;

    public j(a2.g gVar, long j8) {
        String str = gVar.f373f;
        c2.f fVar = new c2.f();
        fVar.f1637d = str;
        fVar.f1635b = -1;
        fVar.f1636c = -1;
        this.f4035a = fVar;
        this.f4036b = j0.e(j8);
        this.f4037c = j0.d(j8);
        this.f4038d = -1;
        this.f4039e = -1;
        int e9 = j0.e(j8);
        int d8 = j0.d(j8);
        if (e9 < 0 || e9 > str.length()) {
            StringBuilder n8 = a0.m.n(e9, "start (", ") offset is outside of text region ");
            n8.append(str.length());
            throw new IndexOutOfBoundsException(n8.toString());
        }
        if (d8 < 0 || d8 > str.length()) {
            StringBuilder n9 = a0.m.n(d8, "end (", ") offset is outside of text region ");
            n9.append(str.length());
            throw new IndexOutOfBoundsException(n9.toString());
        }
        if (e9 > d8) {
            throw new IllegalArgumentException(r6.i.b(e9, d8, "Do not set reversed range: ", " > "));
        }
    }

    public final void a(int i7, int i8) {
        long h3 = r4.a.h(i7, i8);
        this.f4035a.g(i7, i8, "");
        long S = t6.a.S(r4.a.h(this.f4036b, this.f4037c), h3);
        h(j0.e(S));
        g(j0.d(S));
        int i9 = this.f4038d;
        if (i9 != -1) {
            long S2 = t6.a.S(r4.a.h(i9, this.f4039e), h3);
            if (j0.b(S2)) {
                this.f4038d = -1;
                this.f4039e = -1;
            } else {
                this.f4038d = j0.e(S2);
                this.f4039e = j0.d(S2);
            }
        }
    }

    public final char b(int i7) {
        c2.f fVar = this.f4035a;
        a0.p pVar = (a0.p) fVar.f1638e;
        if (pVar == null) {
            return ((String) fVar.f1637d).charAt(i7);
        }
        if (i7 < fVar.f1635b) {
            return ((String) fVar.f1637d).charAt(i7);
        }
        int b9 = pVar.f118b - pVar.b();
        int i8 = fVar.f1635b;
        if (i7 >= b9 + i8) {
            return ((String) fVar.f1637d).charAt(i7 - ((b9 - fVar.f1636c) + i8));
        }
        int i9 = i7 - i8;
        int i10 = pVar.f119c;
        return i9 < i10 ? ((char[]) pVar.f121e)[i9] : ((char[]) pVar.f121e)[(i9 - i10) + pVar.f120d];
    }

    public final j0 c() {
        int i7 = this.f4038d;
        if (i7 != -1) {
            return new j0(r4.a.h(i7, this.f4039e));
        }
        return null;
    }

    public final void d(int i7, int i8, String str) {
        c2.f fVar = this.f4035a;
        if (i7 < 0 || i7 > fVar.b()) {
            StringBuilder n8 = a0.m.n(i7, "start (", ") offset is outside of text region ");
            n8.append(fVar.b());
            throw new IndexOutOfBoundsException(n8.toString());
        }
        if (i8 < 0 || i8 > fVar.b()) {
            StringBuilder n9 = a0.m.n(i8, "end (", ") offset is outside of text region ");
            n9.append(fVar.b());
            throw new IndexOutOfBoundsException(n9.toString());
        }
        if (i7 > i8) {
            throw new IllegalArgumentException(r6.i.b(i7, i8, "Do not set reversed range: ", " > "));
        }
        fVar.g(i7, i8, str);
        h(str.length() + i7);
        g(str.length() + i7);
        this.f4038d = -1;
        this.f4039e = -1;
    }

    public final void e(int i7, int i8) {
        c2.f fVar = this.f4035a;
        if (i7 < 0 || i7 > fVar.b()) {
            StringBuilder n8 = a0.m.n(i7, "start (", ") offset is outside of text region ");
            n8.append(fVar.b());
            throw new IndexOutOfBoundsException(n8.toString());
        }
        if (i8 < 0 || i8 > fVar.b()) {
            StringBuilder n9 = a0.m.n(i8, "end (", ") offset is outside of text region ");
            n9.append(fVar.b());
            throw new IndexOutOfBoundsException(n9.toString());
        }
        if (i7 >= i8) {
            throw new IllegalArgumentException(r6.i.b(i7, i8, "Do not set reversed or empty range: ", " > "));
        }
        this.f4038d = i7;
        this.f4039e = i8;
    }

    public final void f(int i7, int i8) {
        c2.f fVar = this.f4035a;
        if (i7 < 0 || i7 > fVar.b()) {
            StringBuilder n8 = a0.m.n(i7, "start (", ") offset is outside of text region ");
            n8.append(fVar.b());
            throw new IndexOutOfBoundsException(n8.toString());
        }
        if (i8 < 0 || i8 > fVar.b()) {
            StringBuilder n9 = a0.m.n(i8, "end (", ") offset is outside of text region ");
            n9.append(fVar.b());
            throw new IndexOutOfBoundsException(n9.toString());
        }
        if (i7 > i8) {
            throw new IllegalArgumentException(r6.i.b(i7, i8, "Do not set reversed range: ", " > "));
        }
        h(i7);
        g(i8);
    }

    public final void g(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException(a0.m.i("Cannot set selectionEnd to a negative value: ", i7).toString());
        }
        this.f4037c = i7;
    }

    public final void h(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException(a0.m.i("Cannot set selectionStart to a negative value: ", i7).toString());
        }
        this.f4036b = i7;
    }

    public final String toString() {
        return this.f4035a.toString();
    }
}
