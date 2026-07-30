package defpackage;

import com.google.firebase.encoders.json.BuildConfig;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class qf0 {
    public final sg a;
    public int b;
    public int c;
    public int d;
    public int e;

    public qf0(yd ydVar, long j) {
        String str = ydVar.n;
        sg sgVar = new sg();
        sgVar.d = str;
        sgVar.b = -1;
        sgVar.c = -1;
        this.a = sgVar;
        this.b = jw2.e(j);
        this.c = jw2.d(j);
        this.d = -1;
        this.e = -1;
        int e = jw2.e(j);
        int d = jw2.d(j);
        if (e < 0 || e > str.length()) {
            ey.d(str.length(), in1.n(e, "start (", ") offset is outside of text region "));
            throw null;
        }
        if (d < 0 || d > str.length()) {
            ey.d(str.length(), in1.n(d, "end (", ") offset is outside of text region "));
            throw null;
        }
        if (e <= d) {
            return;
        }
        lh.e(q40.j("Do not set reversed range: ", e, d, " > "));
        throw null;
    }

    public final void a(int i, int i2) {
        long a = th2.a(i, i2);
        this.a.o(BuildConfig.FLAVOR, i, i2);
        long S = s03.S(th2.a(this.b, this.c), a);
        h(jw2.e(S));
        g(jw2.d(S));
        int i3 = this.d;
        if (i3 != -1) {
            long S2 = s03.S(th2.a(i3, this.e), a);
            if (jw2.b(S2)) {
                this.d = -1;
                this.e = -1;
            } else {
                this.d = jw2.e(S2);
                this.e = jw2.d(S2);
            }
        }
    }

    public final char b(int i) {
        sg sgVar = this.a;
        gn gnVar = (gn) sgVar.e;
        if (gnVar == null) {
            return ((String) sgVar.d).charAt(i);
        }
        if (i < sgVar.b) {
            return ((String) sgVar.d).charAt(i);
        }
        int c = gnVar.b - gnVar.c();
        int i2 = sgVar.b;
        if (i >= c + i2) {
            return ((String) sgVar.d).charAt(i - ((c - sgVar.c) + i2));
        }
        int i3 = i - i2;
        int i4 = gnVar.c;
        char[] cArr = (char[]) gnVar.e;
        return i3 < i4 ? cArr[i3] : cArr[(i3 - i4) + gnVar.d];
    }

    public final jw2 c() {
        int i = this.d;
        if (i != -1) {
            return new jw2(th2.a(i, this.e));
        }
        return null;
    }

    public final void d(String str, int i, int i2) {
        sg sgVar = this.a;
        if (i < 0 || i > sgVar.c()) {
            ey.d(sgVar.c(), in1.n(i, "start (", ") offset is outside of text region "));
            return;
        }
        if (i2 < 0 || i2 > sgVar.c()) {
            ey.d(sgVar.c(), in1.n(i2, "end (", ") offset is outside of text region "));
        } else {
            if (i > i2) {
                lh.e(q40.j("Do not set reversed range: ", i, i2, " > "));
                return;
            }
            sgVar.o(str, i, i2);
            h(str.length() + i);
            g(str.length() + i);
            this.d = -1;
            this.e = -1;
        }
    }

    public final void e(int i, int i2) {
        sg sgVar = this.a;
        if (i < 0 || i > sgVar.c()) {
            ey.d(sgVar.c(), in1.n(i, "start (", ") offset is outside of text region "));
        } else if (i2 < 0 || i2 > sgVar.c()) {
            ey.d(sgVar.c(), in1.n(i2, "end (", ") offset is outside of text region "));
        } else if (i >= i2) {
            lh.e(q40.j("Do not set reversed or empty range: ", i, i2, " > "));
        } else {
            this.d = i;
            this.e = i2;
        }
    }

    public final void f(int i, int i2) {
        sg sgVar = this.a;
        if (i < 0 || i > sgVar.c()) {
            ey.d(sgVar.c(), in1.n(i, "start (", ") offset is outside of text region "));
        } else if (i2 < 0 || i2 > sgVar.c()) {
            ey.d(sgVar.c(), in1.n(i2, "end (", ") offset is outside of text region "));
        } else if (i > i2) {
            lh.e(q40.j("Do not set reversed range: ", i, i2, " > "));
        } else {
            h(i);
            g(i2);
        }
    }

    public final void g(int i) {
        if (!(i >= 0)) {
            i21.a("Cannot set selectionEnd to a negative value: " + i);
        }
        this.c = i;
    }

    public final void h(int i) {
        if (!(i >= 0)) {
            i21.a("Cannot set selectionStart to a negative value: " + i);
        }
        this.b = i;
    }

    public final String toString() {
        return this.a.toString();
    }
}
