package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class v implements TemporalAmount, Serializable {
    public static final v d = new v(0, 0, 0);
    private static final long serialVersionUID = -3587258372562876L;
    public final int a;
    public final int b;
    public final int c;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        Object[] objArr = {ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS};
        ArrayList arrayList = new ArrayList(3);
        for (int i = 0; i < 3; i++) {
            Object obj = objArr[i];
            obj.getClass();
            arrayList.add(obj);
        }
        Collections.unmodifiableList(arrayList);
    }

    public v(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public static void a(Instant instant) {
        j$.time.chrono.a aVar = (j$.time.chrono.a) instant.k(j$.time.temporal.o.b);
        if (aVar == null || j$.time.chrono.s.c.equals(aVar)) {
            return;
        }
        throw new c("Chronology mismatch, expected: ISO, actual: " + aVar.j());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new w((byte) 14, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            if (this.a == vVar.a && this.b == vVar.b && this.c == vVar.c) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal f(Instant instant) {
        a(instant);
        int i = this.b;
        int i2 = this.a;
        if (i != 0) {
            long j = (i2 * 12) + i;
            if (j != 0) {
                instant = instant.b(j, ChronoUnit.MONTHS);
            }
        } else if (i2 != 0) {
            instant = instant.b(i2, ChronoUnit.YEARS);
        }
        int i3 = this.c;
        return i3 != 0 ? instant.b(i3, ChronoUnit.DAYS) : instant;
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal g(Instant instant) {
        a(instant);
        int i = this.b;
        int i2 = this.a;
        Temporal temporal = instant;
        if (i != 0) {
            long j = (i2 * 12) + i;
            temporal = instant;
            if (j != 0) {
                temporal = instant.n(j, ChronoUnit.MONTHS);
            }
        } else if (i2 != 0) {
            temporal = instant.n(i2, ChronoUnit.YEARS);
        }
        int i3 = this.c;
        if (i3 == 0) {
            return temporal;
        }
        return ((Instant) temporal).n(i3, ChronoUnit.DAYS);
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.c, 16) + Integer.rotateLeft(this.b, 8) + this.a;
    }

    public final String toString() {
        if (this == d) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder("P");
        int i = this.a;
        if (i != 0) {
            sb.append(i);
            sb.append('Y');
        }
        int i2 = this.b;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        int i3 = this.c;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('D');
        }
        return sb.toString();
    }
}
