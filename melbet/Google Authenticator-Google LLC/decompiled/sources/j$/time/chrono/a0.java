package j$.time.chrono;

import j$.time.Instant;
import j$.time.temporal.Temporal;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class a0 extends a implements Serializable {
    public static final a0 c = new a0();
    private static final long serialVersionUID = 1039765215346859963L;

    private a0() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.a
    public final b f(Temporal temporal) {
        return temporal instanceof c0 ? (c0) temporal : new c0(j$.time.j.v(temporal));
    }

    @Override // j$.time.chrono.a
    public final m g(int i) {
        if (i == 0) {
            return d0.BEFORE_ROC;
        }
        if (i == 1) {
            return d0.ROC;
        }
        j$.time.i.b("Invalid era: ", i);
        return null;
    }

    @Override // j$.time.chrono.a
    public final String h() {
        return "roc";
    }

    @Override // j$.time.chrono.a
    public final String j() {
        return "Minguo";
    }

    @Override // j$.time.chrono.a
    public final j$.time.temporal.q o(j$.time.temporal.a aVar) {
        int i = z.a[aVar.ordinal()];
        if (i == 1) {
            j$.time.temporal.q qVar = j$.time.temporal.a.PROLEPTIC_MONTH.b;
            return j$.time.temporal.q.f(qVar.a - 22932, qVar.d - 22932);
        }
        if (i == 2) {
            j$.time.temporal.q qVar2 = j$.time.temporal.a.YEAR.b;
            return j$.time.temporal.q.g(qVar2.d - 1911, (-qVar2.a) + 1912);
        }
        if (i != 3) {
            return aVar.b;
        }
        j$.time.temporal.q qVar3 = j$.time.temporal.a.YEAR.b;
        return j$.time.temporal.q.f(qVar3.a - 1911, qVar3.d - 1911);
    }

    @Override // j$.time.chrono.a
    public final j u(Instant instant, j$.time.b0 b0Var) {
        return l.u(this, instant, b0Var);
    }

    public Object writeReplace() {
        return new e0((byte) 1, this);
    }
}
