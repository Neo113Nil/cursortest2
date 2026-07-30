package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public final class h0 extends a implements Serializable {
    public static final h0 c = new h0();
    private static final long serialVersionUID = 2775954514031616474L;

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        hashMap.put("en", new String[]{"BB", "BE"});
        hashMap.put("th", new String[]{"BB", "BE"});
        hashMap2.put("en", new String[]{"B.B.", "B.E."});
        hashMap2.put("th", new String[]{"พ.ศ.", "ปีก่อนคริสต์กาลที่"});
        hashMap3.put("en", new String[]{"Before Buddhist", "Budhhist Era"});
        hashMap3.put("th", new String[]{"พุทธศักราช", "ปีก่อนคริสต์กาลที่"});
    }

    private h0() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.m
    public final List A() {
        return j$.time.b.c(k0.values());
    }

    @Override // j$.time.chrono.m
    public final n C(int i) {
        if (i == 0) {
            return k0.BEFORE_BE;
        }
        if (i == 1) {
            return k0.BE;
        }
        j$.time.h.b("Invalid era: ", i);
        return null;
    }

    @Override // j$.time.chrono.m
    public final int D(n nVar, int i) {
        if (nVar instanceof k0) {
            return nVar == k0.BE ? i : 1 - i;
        }
        throw new ClassCastException("Era must be BuddhistEra");
    }

    @Override // j$.time.chrono.m
    public final b H(TemporalAccessor temporalAccessor) {
        return temporalAccessor instanceof j0 ? (j0) temporalAccessor : new j0(LocalDate.G(temporalAccessor));
    }

    @Override // j$.time.chrono.m
    public final b M() {
        return new j0(LocalDate.G(LocalDate.c0(j$.time.b.d())));
    }

    @Override // j$.time.chrono.m
    public final b Q(int i, int i2, int i3) {
        return new j0(LocalDate.of(i - 543, i2, i3));
    }

    @Override // j$.time.chrono.a, j$.time.chrono.m
    public final b S(Map map, j$.time.format.e0 e0Var) {
        return (j0) super.S(map, e0Var);
    }

    @Override // j$.time.chrono.m
    public final j T(Instant instant, j$.time.y yVar) {
        return l.G(this, instant, yVar);
    }

    @Override // j$.time.chrono.m
    public final boolean X(long j) {
        return t.c.X(j - 543);
    }

    @Override // j$.time.chrono.m
    public final b p(long j) {
        return new j0(LocalDate.ofEpochDay(j));
    }

    @Override // j$.time.chrono.m
    public final String q() {
        return "ThaiBuddhist";
    }

    @Override // j$.time.chrono.m
    public final String u() {
        return "buddhist";
    }

    @Override // j$.time.chrono.m
    public final b v(int i, int i2) {
        return new j0(LocalDate.d0(i - 543, i2));
    }

    public Object writeReplace() {
        return new f0((byte) 1, this);
    }

    @Override // j$.time.chrono.m
    public final j$.time.temporal.u z(j$.time.temporal.a aVar) {
        int i = g0.a[aVar.ordinal()];
        if (i == 1) {
            j$.time.temporal.u uVar = j$.time.temporal.a.PROLEPTIC_MONTH.b;
            return j$.time.temporal.u.f(uVar.a + 6516, uVar.d + 6516);
        }
        if (i == 2) {
            j$.time.temporal.u uVar2 = j$.time.temporal.a.YEAR.b;
            return j$.time.temporal.u.g(1L, (-(uVar2.a + 543)) + 1, uVar2.d + 543);
        }
        if (i != 3) {
            return aVar.b;
        }
        j$.time.temporal.u uVar3 = j$.time.temporal.a.YEAR.b;
        return j$.time.temporal.u.f(uVar3.a + 543, uVar3.d + 543);
    }
}
