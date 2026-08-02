package j$.time;

import j$.time.temporal.Temporal;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class q implements j$.time.temporal.k, j$.time.temporal.l, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = -939150713474957432L;
    public final int a;
    public final int b;

    static {
        j$.time.format.o oVar = new j$.time.format.o();
        oVar.d("--");
        oVar.g(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        oVar.c('-');
        oVar.g(j$.time.temporal.a.DAY_OF_MONTH, 2);
        oVar.l(Locale.getDefault(), j$.time.format.u.SMART, null);
    }

    public q(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new w((byte) 13, this);
    }

    @Override // j$.time.temporal.k
    public final boolean c(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? nVar == j$.time.temporal.a.MONTH_OF_YEAR || nVar == j$.time.temporal.a.DAY_OF_MONTH : nVar != null && nVar.f(this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        q qVar = (q) obj;
        int i = this.a - qVar.a;
        return i == 0 ? this.b - qVar.b : i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.a == qVar.a && this.b == qVar.b) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.k
    public final int f(j$.time.temporal.n nVar) {
        return h(nVar).a(o(nVar), nVar);
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.q h(j$.time.temporal.n nVar) {
        if (nVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return nVar.range();
        }
        if (nVar != j$.time.temporal.a.DAY_OF_MONTH) {
            return j$.time.temporal.o.d(this, nVar);
        }
        int ordinal = o.w(this.a).ordinal();
        return j$.time.temporal.q.g(ordinal != 1 ? (ordinal == 3 || ordinal == 5 || ordinal == 8 || ordinal == 10) ? 30 : 31 : 28, o.w(r2).v());
    }

    public final int hashCode() {
        return (this.a << 6) + this.b;
    }

    @Override // j$.time.temporal.l
    public final Temporal j(Temporal temporal) {
        if (!j$.nio.file.attribute.a.A(temporal).equals(j$.time.chrono.s.c)) {
            i.d("Adjustment only supported on ISO date-time");
            return null;
        }
        Temporal a = temporal.a(this.a, j$.time.temporal.a.MONTH_OF_YEAR);
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_MONTH;
        return a.a(Math.min(a.h(aVar).d, this.b), aVar);
    }

    @Override // j$.time.temporal.k
    public final Object k(j$.time.format.b bVar) {
        return bVar == j$.time.temporal.o.b ? j$.time.chrono.s.c : j$.time.temporal.o.c(this, bVar);
    }

    @Override // j$.time.temporal.k
    public final long o(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.h(this);
        }
        int i = p.a[((j$.time.temporal.a) nVar).ordinal()];
        if (i == 1) {
            return this.b;
        }
        if (i == 2) {
            return this.a;
        }
        i.a("Unsupported field: ".concat(String.valueOf(nVar)));
        return 0L;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(10);
        sb.append("--");
        int i = this.a;
        sb.append(i < 10 ? "0" : "");
        sb.append(i);
        int i2 = this.b;
        sb.append(i2 < 10 ? "-0" : "-");
        sb.append(i2);
        return sb.toString();
    }
}
