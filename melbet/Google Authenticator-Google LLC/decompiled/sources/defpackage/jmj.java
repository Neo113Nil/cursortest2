package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jmj {
    private static volatile int a = 100;

    public static /* bridge */ /* synthetic */ void b(Object obj, int i, jjq jjqVar) {
        ((jmk) obj).e((i << 3) | 2, jjqVar);
    }

    public static /* bridge */ /* synthetic */ void c(Object obj, int i, long j) {
        ((jmk) obj).e(i << 3, Long.valueOf(j));
    }

    public static jmk d(Object obj) {
        return ((jkp) obj).s;
    }

    public static void e(Object obj, jmk jmkVar) {
        ((jkp) obj).s = jmkVar;
    }

    public static final jmk f(Object obj) {
        jmk d = d(obj);
        if (d != jmk.a) {
            return d;
        }
        jmk jmkVar = new jmk();
        e(obj, jmkVar);
        return jmkVar;
    }

    public static final void g(Object obj) {
        d(obj).d();
    }

    final boolean a(Object obj, jjv jjvVar, int i) {
        int i2 = jjvVar.a;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            c(obj, i3, jjvVar.k());
            return true;
        }
        if (i4 == 1) {
            ((jmk) obj).e((i3 << 3) | 1, Long.valueOf(jjvVar.j()));
            return true;
        }
        if (i4 == 2) {
            b(obj, i3, jjvVar.o());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                if (i != 0) {
                    return false;
                }
                throw new jld("Protocol message end-group tag did not match expected tag.");
            }
            if (i4 != 5) {
                throw new jlc();
            }
            ((jmk) obj).e(5 | (i3 << 3), Integer.valueOf(jjvVar.e()));
            return true;
        }
        int i5 = i3 << 3;
        jmk jmkVar = new jmk();
        int i6 = i + 1;
        if (i6 >= a) {
            throw new jld("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (jjvVar.c() != Integer.MAX_VALUE && a(jmkVar, jjvVar, i6)) {
        }
        if ((i5 | 4) != jjvVar.a) {
            throw new jld("Protocol message end-group tag did not match expected tag.");
        }
        jmkVar.d();
        ((jmk) obj).e(i5 | 3, jmkVar);
        return true;
    }
}
