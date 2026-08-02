package j$.time.chrono;

import j$.time.Instant;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class h implements TemporalAmount, Serializable {
    public static final /* synthetic */ int e = 0;
    private static final long serialVersionUID = 57387258289L;
    public final a a;
    public final int b;
    public final int c;
    public final int d;

    static {
        Object[] objArr = {ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS};
        ArrayList arrayList = new ArrayList(3);
        for (int i = 0; i < 3; i++) {
            Object obj = objArr[i];
            obj.getClass();
            arrayList.add(obj);
        }
        Collections.unmodifiableList(arrayList);
    }

    public h(a aVar, int i, int i2, int i3) {
        this.a = aVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final long a() {
        j$.time.temporal.q o = this.a.o(j$.time.temporal.a.MONTH_OF_YEAR);
        long j = o.a;
        long j2 = o.d;
        if (j == o.b && o.c == j2 && o.d()) {
            return (j2 - o.a) + 1;
        }
        return -1L;
    }

    public final void b(Instant instant) {
        a aVar = (a) instant.k(j$.time.temporal.o.b);
        if (aVar != null) {
            a aVar2 = this.a;
            if (aVar2.equals(aVar)) {
                return;
            }
            j$.time.i.d(j$.time.g.a("Chronology mismatch, expected: ", aVar2.j(), ", actual: ", aVar.j()));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.b == hVar.b && this.c == hVar.c && this.d == hVar.d && this.a.equals(hVar.a);
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal f(Instant instant) {
        b(instant);
        int i = this.b;
        int i2 = this.c;
        if (i2 != 0) {
            long a = a();
            if (a > 0) {
                instant = instant.b((i * a) + i2, ChronoUnit.MONTHS);
            } else {
                if (i != 0) {
                    instant = instant.b(i, ChronoUnit.YEARS);
                }
                instant = instant.b(i2, ChronoUnit.MONTHS);
            }
        } else if (i != 0) {
            instant = instant.b(i, ChronoUnit.YEARS);
        }
        int i3 = this.d;
        return i3 != 0 ? instant.b(i3, ChronoUnit.DAYS) : instant;
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal g(Instant instant) {
        b(instant);
        int i = this.b;
        int i2 = this.c;
        Temporal temporal = instant;
        if (i2 != 0) {
            long a = a();
            Temporal temporal2 = instant;
            if (a > 0) {
                temporal = instant.n((i * a) + i2, ChronoUnit.MONTHS);
            } else {
                if (i != 0) {
                    temporal2 = instant.n(i, ChronoUnit.YEARS);
                }
                temporal = ((Instant) temporal2).n(i2, ChronoUnit.MONTHS);
            }
        } else if (i != 0) {
            temporal = instant.n(i, ChronoUnit.YEARS);
        }
        int i3 = this.d;
        return i3 != 0 ? temporal.n(i3, ChronoUnit.DAYS) : temporal;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ (Integer.rotateLeft(this.d, 16) + (Integer.rotateLeft(this.c, 8) + this.b));
    }

    public final String toString() {
        a aVar = this.a;
        int i = this.d;
        int i2 = this.c;
        int i3 = this.b;
        if (i3 == 0 && i2 == 0 && i == 0) {
            return aVar.toString() + " P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(aVar.toString());
        sb.append(" P");
        if (i3 != 0) {
            sb.append(i3);
            sb.append('Y');
        }
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        if (i != 0) {
            sb.append(i);
            sb.append('D');
        }
        return sb.toString();
    }

    public Object writeReplace() {
        return new e0((byte) 9, this);
    }
}
