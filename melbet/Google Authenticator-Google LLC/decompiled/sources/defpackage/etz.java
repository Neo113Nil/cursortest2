package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class etz {
    public static final etz a = new etz(hjc.c);
    public final hfv b;

    public etz(hfv hfvVar) {
        this.b = hfvVar;
    }

    public static etz a(jju jjuVar) {
        long j;
        String str;
        ety etyVar;
        int k = jjuVar.k();
        if (k < 0) {
            throw new jld("Negative number of flags");
        }
        hft hftVar = new hft(hih.a);
        long j2 = 0;
        for (int i = 0; i < k; i++) {
            long w = jjuVar.w();
            int i2 = (int) w;
            long j3 = w >>> 3;
            if (j3 == 0) {
                j = 0;
                str = jjuVar.B();
            } else {
                long j4 = j3 + j2;
                if (j4 > 2305843009213693951L) {
                    throw new jld("Flag name larger than max size");
                }
                j = j4;
                str = null;
            }
            int i3 = i2 & 7;
            if (i3 == 0 || i3 == 1) {
                etyVar = new ety(j, str, i3, 0L, null);
            } else if (i3 == 2) {
                etyVar = new ety(j, str, i3, jjuVar.w(), null);
            } else if (i3 == 3) {
                etyVar = new ety(j, str, i3, Double.doubleToRawLongBits(jjuVar.b()), null);
            } else if (i3 == 4) {
                etyVar = new ety(j, str, i3, 0L, jjuVar.B());
            } else {
                if (i3 != 5) {
                    throw new jld(a.Y(i3, "Unrecognized flag type "));
                }
                etyVar = new ety(j, str, i3, 0L, jjuVar.J());
            }
            long j5 = etyVar.a;
            if (j5 != 0) {
                j2 = j5;
            }
            hftVar.m(etyVar);
        }
        return new etz(hftVar.g());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof etz) {
            return this.b.equals(((etz) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return hnu.h(this.b);
    }
}
