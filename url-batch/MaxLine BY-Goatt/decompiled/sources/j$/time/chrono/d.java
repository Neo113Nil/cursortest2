package j$.time.chrono;

import defpackage.l42;
import java.io.Serializable;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public abstract class d implements b, j$.time.temporal.m, j$.time.temporal.n, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    public static b s(m mVar, j$.time.temporal.m mVar2) {
        b bVar = (b) mVar2;
        if (mVar.equals(bVar.d())) {
            return bVar;
        }
        j$.time.h.e("Chronology mismatch, expected: ", mVar.q(), bVar.d().q());
        return null;
    }

    public abstract b B(long j);

    public abstract b G(long j);

    public abstract b J(long j);

    @Override // j$.time.chrono.b
    public b R(j$.time.temporal.p pVar) {
        return s(d(), pVar.s(this));
    }

    @Override // j$.time.temporal.m
    public /* bridge */ /* synthetic */ j$.time.temporal.m a(long j, j$.time.temporal.s sVar) {
        return a(j, sVar);
    }

    @Override // j$.time.chrono.b
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && compareTo((b) obj) == 0;
    }

    @Override // j$.time.chrono.b
    public int hashCode() {
        long epochDay = toEpochDay();
        return d().hashCode() ^ ((int) (epochDay ^ (epochDay >>> 32)));
    }

    @Override // j$.time.temporal.m
    public b i(long j, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.t(j$.time.d.a("Unsupported field: ", qVar));
        }
        return s(d(), qVar.W(this, j));
    }

    @Override // j$.time.temporal.m
    public b l(long j, j$.time.temporal.s sVar) {
        boolean z = sVar instanceof j$.time.temporal.b;
        if (!z) {
            if (!z) {
                return s(d(), sVar.s(this, j));
            }
            j$.time.h.d("Unsupported unit: ", sVar);
            return null;
        }
        switch (c.a[((j$.time.temporal.b) sVar).ordinal()]) {
            case 1:
                return B(j);
            case 2:
                return B(Math.multiplyExact(j, 7L));
            case 3:
                return G(j);
            case 4:
                return J(j);
            case 5:
                return J(Math.multiplyExact(j, 10L));
            case 6:
                return J(Math.multiplyExact(j, 100L));
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                return J(Math.multiplyExact(j, 1000L));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return i(Math.addExact(g(aVar), j), (j$.time.temporal.q) aVar);
            default:
                j$.time.h.d("Unsupported unit: ", sVar);
                return null;
        }
    }

    @Override // j$.time.temporal.m
    public b m(j$.time.temporal.n nVar) {
        return s(d(), nVar.c(this));
    }

    @Override // j$.time.chrono.b
    public final String toString() {
        long g = g(j$.time.temporal.a.YEAR_OF_ERA);
        long g2 = g(j$.time.temporal.a.MONTH_OF_YEAR);
        long g3 = g(j$.time.temporal.a.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(d().toString());
        sb.append(" ");
        sb.append(N());
        sb.append(" ");
        sb.append(g);
        sb.append(g2 < 10 ? "-0" : "-");
        sb.append(g2);
        sb.append(g3 < 10 ? "-0" : "-");
        sb.append(g3);
        return sb.toString();
    }
}
