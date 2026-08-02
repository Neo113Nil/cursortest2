package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jmv {
    static {
        jkj k = jkb.a.k();
        if (!k.b.M()) {
            k.t();
        }
        jkp jkpVar = k.b;
        ((jkb) jkpVar).b = -315576000000L;
        if (!jkpVar.M()) {
            k.t();
        }
        ((jkb) k.b).c = -999999999;
        jkj k2 = jkb.a.k();
        if (!k2.b.M()) {
            k2.t();
        }
        jkp jkpVar2 = k2.b;
        ((jkb) jkpVar2).b = 315576000000L;
        if (!jkpVar2.M()) {
            k2.t();
        }
        ((jkb) k2.b).c = 999999999;
        jkj k3 = jkb.a.k();
        if (!k3.b.M()) {
            k3.t();
        }
        jkp jkpVar3 = k3.b;
        ((jkb) jkpVar3).b = 0L;
        if (!jkpVar3.M()) {
            k3.t();
        }
        ((jkb) k3.b).c = 0;
    }

    public static jkb a(long j) {
        return c(j / 1000, (int) ((j % 1000) * 1000000));
    }

    public static jkb b(long j) {
        return c(j / 1000000000, (int) (j % 1000000000));
    }

    public static jkb c(long j, int i) {
        if (i <= -1000000000 || i >= 1000000000) {
            j = a.l(j, i / 1000000000);
            i %= 1000000000;
        }
        if (j > 0 && i < 0) {
            i += 1000000000;
            j--;
        }
        if (j < 0 && i > 0) {
            i -= 1000000000;
            j++;
        }
        jkj k = jkb.a.k();
        if (!k.b.M()) {
            k.t();
        }
        jkp jkpVar = k.b;
        ((jkb) jkpVar).b = j;
        if (!jkpVar.M()) {
            k.t();
        }
        ((jkb) k.b).c = i;
        jkb jkbVar = (jkb) k.q();
        d(jkbVar);
        return jkbVar;
    }

    public static void d(jkb jkbVar) {
        long j = jkbVar.b;
        int i = jkbVar.c;
        if (a.i(j, i)) {
            return;
        }
        throw new IllegalArgumentException("Duration is not valid. See proto definition for valid values. Seconds (" + j + ") must be in range [-315,576,000,000, +315,576,000,000]. Nanos (" + i + ") must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds");
    }
}
