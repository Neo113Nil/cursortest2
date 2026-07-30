package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public final class b0 extends a implements Serializable {
    public static final b0 c = new b0();
    private static final long serialVersionUID = 1039765215346859963L;

    private b0() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.m
    public final List A() {
        return j$.time.b.c(e0.values());
    }

    @Override // j$.time.chrono.m
    public final n C(int i) {
        if (i == 0) {
            return e0.BEFORE_ROC;
        }
        if (i == 1) {
            return e0.ROC;
        }
        j$.time.h.b("Invalid era: ", i);
        return null;
    }

    @Override // j$.time.chrono.m
    public final int D(n nVar, int i) {
        if (nVar instanceof e0) {
            return nVar == e0.ROC ? i : 1 - i;
        }
        throw new ClassCastException("Era must be MinguoEra");
    }

    @Override // j$.time.chrono.m
    public final b H(TemporalAccessor temporalAccessor) {
        return temporalAccessor instanceof d0 ? (d0) temporalAccessor : new d0(LocalDate.G(temporalAccessor));
    }

    @Override // j$.time.chrono.m
    public final b M() {
        return new d0(LocalDate.G(LocalDate.c0(j$.time.b.d())));
    }

    @Override // j$.time.chrono.m
    public final b Q(int i, int i2, int i3) {
        return new d0(LocalDate.of(i + 1911, i2, i3));
    }

    @Override // j$.time.chrono.a, j$.time.chrono.m
    public final b S(Map map, j$.time.format.e0 e0Var) {
        return (d0) super.S(map, e0Var);
    }

    @Override // j$.time.chrono.m
    public final j T(Instant instant, j$.time.y yVar) {
        return l.G(this, instant, yVar);
    }

    @Override // j$.time.chrono.m
    public final boolean X(long j) {
        return t.c.X(j + 1911);
    }

    @Override // j$.time.chrono.m
    public final b p(long j) {
        return new d0(LocalDate.ofEpochDay(j));
    }

    @Override // j$.time.chrono.m
    public final String q() {
        return "Minguo";
    }

    @Override // j$.time.chrono.m
    public final String u() {
        return "roc";
    }

    @Override // j$.time.chrono.m
    public final b v(int i, int i2) {
        return new d0(LocalDate.d0(i + 1911, i2));
    }

    public Object writeReplace() {
        return new f0((byte) 1, this);
    }

    @Override // j$.time.chrono.m
    public final j$.time.temporal.u z(j$.time.temporal.a aVar) {
        int i = a0.a[aVar.ordinal()];
        if (i == 1) {
            j$.time.temporal.u uVar = j$.time.temporal.a.PROLEPTIC_MONTH.b;
            return j$.time.temporal.u.f(uVar.a - 22932, uVar.d - 22932);
        }
        if (i == 2) {
            j$.time.temporal.u uVar2 = j$.time.temporal.a.YEAR.b;
            return j$.time.temporal.u.g(1L, uVar2.d - 1911, (-uVar2.a) + 1912);
        }
        if (i != 3) {
            return aVar.b;
        }
        j$.time.temporal.u uVar3 = j$.time.temporal.a.YEAR.b;
        return j$.time.temporal.u.f(uVar3.a - 1911, uVar3.d - 1911);
    }
}
