package j$.time.chrono;

import j$.time.LocalDate;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public final class z implements n, Serializable {
    public static final z d;
    public static final z[] e;
    private static final long serialVersionUID = 1466499369062886794L;
    public final transient int a;
    public final transient LocalDate b;
    public final transient String c;

    static {
        z zVar = new z(-1, LocalDate.of(1868, 1, 1), "Meiji");
        d = zVar;
        e = new z[]{zVar, new z(0, LocalDate.of(1912, 7, 30), "Taisho"), new z(1, LocalDate.of(1926, 12, 25), "Showa"), new z(2, LocalDate.of(1989, 1, 8), "Heisei"), new z(3, LocalDate.of(2019, 5, 1), "Reiwa")};
    }

    public z(int i, LocalDate localDate, String str) {
        this.a = i;
        this.b = localDate;
        this.c = str;
    }

    public static z p(LocalDate localDate) {
        if (localDate.Z(y.d)) {
            j$.time.h.a("JapaneseDate before Meiji 6 are not supported");
            return null;
        }
        for (int length = e.length - 1; length >= 0; length--) {
            z zVar = e[length];
            if (localDate.compareTo(zVar.b) >= 0) {
                return zVar;
            }
        }
        return null;
    }

    public static z r(int i) {
        int i2 = i + 1;
        if (i2 >= 0) {
            z[] zVarArr = e;
            if (i2 < zVarArr.length) {
                return zVarArr[i2];
            }
        }
        j$.time.h.b("Invalid era: ", i);
        return null;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new f0((byte) 5, this);
    }

    @Override // j$.time.chrono.n
    public final int getValue() {
        return this.a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.u k(j$.time.temporal.q qVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        return qVar == aVar ? w.c.z(aVar) : super.k(qVar);
    }

    public final z q() {
        if (this == e[r0.length - 1]) {
            return null;
        }
        return r(this.a + 1);
    }

    public final String toString() {
        return this.c;
    }
}
