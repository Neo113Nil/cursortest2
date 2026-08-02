package j$.time.temporal;

import j$.util.Objects;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public abstract class o {
    public static final j$.time.format.b a = new j$.time.format.b(1);
    public static final j$.time.format.b b = new j$.time.format.b(2);
    public static final j$.time.format.b c = new j$.time.format.b(3);
    public static final j$.time.format.b d = new j$.time.format.b(4);
    public static final j$.time.format.b e = new j$.time.format.b(5);
    public static final j$.time.format.b f = new j$.time.format.b(6);
    public static final j$.time.format.b g = new j$.time.format.b(7);

    public static int a(k kVar, n nVar) {
        q h = kVar.h(nVar);
        if (!h.d()) {
            throw new p("Invalid field " + String.valueOf(nVar) + " for get() method, use getLong() instead");
        }
        long o = kVar.o(nVar);
        if (h.e(o)) {
            return (int) o;
        }
        throw new j$.time.c("Invalid value for " + String.valueOf(nVar) + " (valid values " + String.valueOf(h) + "): " + o);
    }

    public static Temporal b(Temporal temporal, long j, TemporalUnit temporalUnit) {
        long j2;
        if (j == Long.MIN_VALUE) {
            temporal = temporal.b(Long.MAX_VALUE, temporalUnit);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return temporal.b(j2, temporalUnit);
    }

    public static Object c(k kVar, j$.time.format.b bVar) {
        if (bVar == a || bVar == b || bVar == c) {
            return null;
        }
        return bVar.a(kVar);
    }

    public static q d(k kVar, n nVar) {
        if (!(nVar instanceof a)) {
            Objects.a(nVar, "field");
            return nVar.g(kVar);
        }
        if (kVar.c(nVar)) {
            return ((a) nVar).b;
        }
        j$.time.i.a("Unsupported field: ".concat(String.valueOf(nVar)));
        return null;
    }
}
