package j$.time.chrono;

import j$.time.temporal.Temporal;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class y implements m, Serializable {
    public static final y d;
    public static final y[] e;
    private static final long serialVersionUID = 1466499369062886794L;
    public final transient int a;
    public final transient j$.time.j b;
    public final transient String c;

    static {
        y yVar = new y(-1, j$.time.j.E(1868, 1, 1), "Meiji");
        d = yVar;
        e = new y[]{yVar, new y(0, j$.time.j.E(1912, 7, 30), "Taisho"), new y(1, j$.time.j.E(1926, 12, 25), "Showa"), new y(2, j$.time.j.E(1989, 1, 8), "Heisei"), new y(3, j$.time.j.E(2019, 5, 1), "Reiwa")};
    }

    public y(int i, j$.time.j jVar, String str) {
        this.a = i;
        this.b = jVar;
        this.c = str;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static y t(j$.time.j jVar) {
        if (jVar.A(x.d)) {
            j$.time.i.d("JapaneseDate before Meiji 6 are not supported");
            return null;
        }
        y[] yVarArr = e;
        for (int length = yVarArr.length - 1; length >= 0; length--) {
            y yVar = yVarArr[length];
            if (jVar.compareTo(yVar.b) >= 0) {
                return yVar;
            }
        }
        return null;
    }

    public static y v(int i) {
        int i2 = i + 1;
        if (i2 >= 0) {
            y[] yVarArr = e;
            if (i2 < yVarArr.length) {
                return yVarArr[i2];
            }
        }
        j$.time.i.b("Invalid era: ", i);
        return null;
    }

    private Object writeReplace() {
        return new e0((byte) 5, this);
    }

    @Override // j$.time.temporal.k
    public final /* synthetic */ boolean c(j$.time.temporal.n nVar) {
        return j$.nio.file.attribute.a.q(this, nVar);
    }

    @Override // j$.time.temporal.k
    public final /* synthetic */ int f(j$.time.temporal.n nVar) {
        return j$.nio.file.attribute.a.l(this, nVar);
    }

    @Override // j$.time.chrono.m
    public final int getValue() {
        return this.a;
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.q h(j$.time.temporal.n nVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        return nVar == aVar ? v.c.o(aVar) : j$.time.temporal.o.d(this, nVar);
    }

    @Override // j$.time.temporal.l
    public final Temporal j(Temporal temporal) {
        return temporal.a(getValue(), j$.time.temporal.a.ERA);
    }

    @Override // j$.time.temporal.k
    public final /* synthetic */ Object k(j$.time.format.b bVar) {
        return j$.nio.file.attribute.a.u(this, bVar);
    }

    @Override // j$.time.temporal.k
    public final /* synthetic */ long o(j$.time.temporal.n nVar) {
        return j$.nio.file.attribute.a.n(this, nVar);
    }

    public final String toString() {
        return this.c;
    }

    public final y u() {
        if (this == e[r0.length - 1]) {
            return null;
        }
        return v(this.a + 1);
    }
}
