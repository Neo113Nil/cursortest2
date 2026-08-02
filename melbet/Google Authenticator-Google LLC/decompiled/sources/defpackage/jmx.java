package defpackage;

import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jmx {
    public static final /* synthetic */ int a = 0;

    static {
        Logger.getLogger(jmx.class.getName());
        jkj k = jmh.a.k();
        if (!k.b.M()) {
            k.t();
        }
        jkp jkpVar = k.b;
        ((jmh) jkpVar).b = -62135596800L;
        if (!jkpVar.M()) {
            k.t();
        }
        ((jmh) k.b).c = 0;
        jkj k2 = jmh.a.k();
        if (!k2.b.M()) {
            k2.t();
        }
        jkp jkpVar2 = k2.b;
        ((jmh) jkpVar2).b = 253402300799L;
        if (!jkpVar2.M()) {
            k2.t();
        }
        ((jmh) k2.b).c = 999999999;
        jkj k3 = jmh.a.k();
        if (!k3.b.M()) {
            k3.t();
        }
        jkp jkpVar3 = k3.b;
        ((jmh) jkpVar3).b = 0L;
        if (!jkpVar3.M()) {
            k3.t();
        }
        ((jmh) k3.b).c = 0;
        new jmw();
        f("now");
        f("getEpochSecond");
        f("getNano");
    }

    private jmx() {
    }

    public static long a(jmh jmhVar) {
        long j;
        d(jmhVar);
        long j2 = jmhVar.b;
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(1000L) + Long.numberOfLeadingZeros(-1001L);
        if (numberOfLeadingZeros <= 65) {
            if (numberOfLeadingZeros >= 64) {
                long j3 = j2 * 1000;
                if (j2 == 0 || j3 / j2 == 1000) {
                    j = j3;
                }
            }
            throw new ArithmeticException();
        }
        j = j2 * 1000;
        return a.l(j, jmhVar.c / 1000000);
    }

    public static jmh b(long j) {
        return c(j / 1000, (int) ((j % 1000) * 1000000));
    }

    public static jmh c(long j, int i) {
        if (!e(j)) {
            throw new IllegalArgumentException("Timestamp is not valid. Input seconds is too large. Seconds (" + j + ") must be in range [-62,135,596,800, +253,402,300,799]. ");
        }
        if (i <= -1000000000 || i >= 1000000000) {
            j = a.l(j, i / 1000000000);
            i %= 1000000000;
        }
        if (i < 0) {
            i += 1000000000;
            long j2 = (-1) + j;
            if (!((j ^ j2) >= 0) && !((1 ^ j) >= 0)) {
                throw new ArithmeticException();
            }
            j = j2;
        }
        jkj k = jmh.a.k();
        if (!k.b.M()) {
            k.t();
        }
        jkp jkpVar = k.b;
        ((jmh) jkpVar).b = j;
        if (!jkpVar.M()) {
            k.t();
        }
        ((jmh) k.b).c = i;
        jmh jmhVar = (jmh) k.q();
        d(jmhVar);
        return jmhVar;
    }

    public static void d(jmh jmhVar) {
        long j = jmhVar.b;
        boolean e = e(j);
        int i = jmhVar.c;
        if (!e || i < 0 || i >= 1000000000) {
            throw new IllegalArgumentException("Timestamp is not valid. See proto definition for valid values. Seconds (" + j + ") must be in range [-62,135,596,800, +253,402,300,799]. Nanos (" + i + ") must be in range [0, +999,999,999].");
        }
    }

    private static boolean e(long j) {
        return j >= -62135596800L && j <= 253402300799L;
    }

    private static void f(String str) {
        try {
            Class.forName("java.time.Instant").getMethod(str, null);
        } catch (Exception unused) {
        }
    }
}
