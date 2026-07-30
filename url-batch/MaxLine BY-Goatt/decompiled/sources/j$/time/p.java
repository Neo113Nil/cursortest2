package j$.time;

import com.facebook.appevents.AppEventsConstants;
import com.google.firebase.encoders.json.BuildConfig;
import j$.time.format.e0;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public final class p implements TemporalAccessor, j$.time.temporal.n, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = -939150713474957432L;
    public final int a;
    public final int b;

    static {
        j$.time.format.u uVar = new j$.time.format.u();
        uVar.e("--");
        uVar.l(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        uVar.d('-');
        uVar.l(j$.time.temporal.a.DAY_OF_MONTH, 2);
        uVar.q(Locale.getDefault(), e0.SMART, null);
    }

    public p(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new t((byte) 13, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object b(a0 a0Var) {
        return a0Var == j$.time.temporal.r.b ? j$.time.chrono.t.c : super.b(a0Var);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m c(j$.time.temporal.m mVar) {
        if (!j$.time.chrono.m.r(mVar).equals(j$.time.chrono.t.c)) {
            h.a("Adjustment only supported on ISO date-time");
            return null;
        }
        j$.time.temporal.m i = mVar.i(this.a, j$.time.temporal.a.MONTH_OF_YEAR);
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_MONTH;
        return i.i(Math.min(i.k(aVar).d, this.b), aVar);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        p pVar = (p) obj;
        int i = this.a - pVar.a;
        return i == 0 ? this.b - pVar.b : i;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int e(j$.time.temporal.q qVar) {
        return k(qVar).a(g(qVar), qVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.a == pVar.a && this.b == pVar.b) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.MONTH_OF_YEAR || qVar == j$.time.temporal.a.DAY_OF_MONTH : qVar != null && qVar.s(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long g(j$.time.temporal.q qVar) {
        int i;
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.P(this);
        }
        int i2 = o.a[((j$.time.temporal.a) qVar).ordinal()];
        if (i2 == 1) {
            i = this.b;
        } else {
            if (i2 != 2) {
                throw new j$.time.temporal.t(d.a("Unsupported field: ", qVar));
            }
            i = this.a;
        }
        return i;
    }

    public final int hashCode() {
        return (this.a << 6) + this.b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.u k(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return qVar.J();
        }
        if (qVar != j$.time.temporal.a.DAY_OF_MONTH) {
            return super.k(qVar);
        }
        n J = n.J(this.a);
        J.getClass();
        int i = m.a[J.ordinal()];
        return j$.time.temporal.u.g(1L, i != 1 ? (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31 : 28, n.J(this.a).G());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(10);
        sb.append("--");
        sb.append(this.a < 10 ? AppEventsConstants.EVENT_PARAM_VALUE_NO : BuildConfig.FLAVOR);
        sb.append(this.a);
        sb.append(this.b < 10 ? "-0" : "-");
        sb.append(this.b);
        return sb.toString();
    }
}
