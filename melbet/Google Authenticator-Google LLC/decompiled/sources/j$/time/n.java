package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;
import org.chromium.net.UrlRequest;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class n implements Temporal, j$.time.temporal.l, Comparable, Serializable {
    public static final n e;
    public static final n f;
    public static final n g;
    public static final n[] h = new n[24];
    private static final long serialVersionUID = 6414437269572265201L;
    public final byte a;
    public final byte b;
    public final byte c;
    public final int d;

    static {
        int i = 0;
        while (true) {
            n[] nVarArr = h;
            if (i >= nVarArr.length) {
                n nVar = nVarArr[0];
                g = nVar;
                n nVar2 = nVarArr[12];
                e = nVar;
                f = new n(23, 59, 59, 999999999);
                return;
            }
            nVarArr[i] = new n(i, 0, 0, 0);
            i++;
        }
    }

    public n(int i, int i2, int i3, int i4) {
        this.a = (byte) i;
        this.b = (byte) i2;
        this.c = (byte) i3;
        this.d = i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v4, types: [int] */
    public static n D(ObjectInput objectInput) {
        int readInt;
        int i;
        int readByte = objectInput.readByte();
        byte b = 0;
        if (readByte < 0) {
            readByte = ~readByte;
            i = 0;
            readInt = 0;
        } else {
            byte readByte2 = objectInput.readByte();
            if (readByte2 < 0) {
                ?? r7 = ~readByte2;
                readInt = 0;
                b = r7;
                i = 0;
            } else {
                byte readByte3 = objectInput.readByte();
                if (readByte3 < 0) {
                    i = ~readByte3;
                    readInt = 0;
                    b = readByte2;
                } else {
                    readInt = objectInput.readInt();
                    b = readByte2;
                    i = readByte3;
                }
            }
        }
        j$.time.temporal.a.HOUR_OF_DAY.k(readByte);
        j$.time.temporal.a.MINUTE_OF_HOUR.k(b);
        j$.time.temporal.a.SECOND_OF_MINUTE.k(i);
        j$.time.temporal.a.NANO_OF_SECOND.k(readInt);
        return u(readByte, b, i, readInt);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static n u(int i, int i2, int i3, int i4) {
        return ((i2 | i3) | i4) == 0 ? h[i] : new n(i, i2, i3, i4);
    }

    public static n v(j$.time.temporal.k kVar) {
        Objects.a(kVar, "temporal");
        n nVar = (n) kVar.k(j$.time.temporal.o.g);
        if (nVar != null) {
            return nVar;
        }
        i.d(g.a("Unable to obtain LocalTime from TemporalAccessor: ", String.valueOf(kVar), " of type ", kVar.getClass().getName()));
        return null;
    }

    private Object writeReplace() {
        return new w((byte) 4, this);
    }

    public static n x(long j) {
        j$.time.temporal.a.NANO_OF_DAY.k(j);
        int i = (int) (j / 3600000000000L);
        long j2 = j - (i * 3600000000000L);
        int i2 = (int) (j2 / 60000000000L);
        long j3 = j2 - (i2 * 60000000000L);
        int i3 = (int) (j3 / 1000000000);
        return u(i, i2, i3, (int) (j3 - (i3 * 1000000000)));
    }

    public final n A(long j) {
        if (j != 0) {
            int i = (this.a * 60) + this.b;
            int i2 = ((((int) (j % 1440)) + i) + 1440) % 1440;
            if (i != i2) {
                return u(i2 / 60, i2 % 60, this.c, this.d);
            }
        }
        return this;
    }

    public final n B(long j) {
        if (j != 0) {
            long E = E();
            long j2 = (((j % 86400000000000L) + E) + 86400000000000L) % 86400000000000L;
            if (E != j2) {
                return u((int) (j2 / 3600000000000L), (int) ((j2 / 60000000000L) % 60), (int) ((j2 / 1000000000) % 60), (int) (j2 % 1000000000));
            }
        }
        return this;
    }

    public final n C(long j) {
        if (j != 0) {
            int i = (this.b * 60) + (this.a * 3600) + this.c;
            int i2 = ((((int) (j % 86400)) + i) + 86400) % 86400;
            if (i != i2) {
                return u(i2 / 3600, (i2 / 60) % 60, i2 % 60, this.d);
            }
        }
        return this;
    }

    public final long E() {
        return (this.c * 1000000000) + (this.b * 60000000000L) + (this.a * 3600000000000L) + this.d;
    }

    public final int F() {
        return (this.b * 60) + (this.a * 3600) + this.c;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public final n a(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (n) nVar.j(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        aVar.k(j);
        int i = m.a[aVar.ordinal()];
        int i2 = this.d;
        byte b = this.c;
        byte b2 = this.b;
        byte b3 = this.a;
        switch (i) {
            case 1:
                return H((int) j);
            case 2:
                return x(j);
            case 3:
                return H(((int) j) * 1000);
            case 4:
                return x(j * 1000);
            case 5:
                return H(((int) j) * 1000000);
            case 6:
                return x(j * 1000000);
            case 7:
                int i3 = (int) j;
                if (b != i3) {
                    j$.time.temporal.a.SECOND_OF_MINUTE.k(i3);
                    return u(b3, b2, i3, i2);
                }
                return this;
            case 8:
                return C(j - F());
            case 9:
                int i4 = (int) j;
                if (b2 != i4) {
                    j$.time.temporal.a.MINUTE_OF_HOUR.k(i4);
                    return u(b3, i4, b, i2);
                }
                return this;
            case 10:
                return A(j - ((b3 * 60) + b2));
            case 11:
                return z(j - (b3 % 12));
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                if (j == 12) {
                    j = 0;
                }
                return z(j - (b3 % 12));
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                int i5 = (int) j;
                if (b3 != i5) {
                    j$.time.temporal.a.HOUR_OF_DAY.k(i5);
                    return u(i5, b2, b, i2);
                }
                return this;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                if (j == 24) {
                    j = 0;
                }
                int i6 = (int) j;
                if (b3 != i6) {
                    j$.time.temporal.a.HOUR_OF_DAY.k(i6);
                    return u(i6, b2, b, i2);
                }
                return this;
            case 15:
                return z((j - (b3 / 12)) * 12);
            default:
                i.a("Unsupported field: ".concat(String.valueOf(nVar)));
                return null;
        }
    }

    public final n H(int i) {
        if (this.d == i) {
            return this;
        }
        j$.time.temporal.a.NANO_OF_SECOND.k(i);
        return u(this.a, this.b, this.c, i);
    }

    public final void I(DataOutput dataOutput) {
        byte b = this.a;
        byte b2 = this.c;
        byte b3 = this.b;
        int i = this.d;
        if (i != 0) {
            dataOutput.writeByte(b);
            dataOutput.writeByte(b3);
            dataOutput.writeByte(b2);
            dataOutput.writeInt(i);
            return;
        }
        if (b2 != 0) {
            dataOutput.writeByte(b);
            dataOutput.writeByte(b3);
            dataOutput.writeByte(~b2);
        } else if (b3 == 0) {
            dataOutput.writeByte(~b);
        } else {
            dataOutput.writeByte(b);
            dataOutput.writeByte(~b3);
        }
    }

    @Override // j$.time.temporal.k
    public final boolean c(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) nVar).n() : nVar != null && nVar.f(this);
    }

    @Override // j$.time.temporal.Temporal
    public final long d(Temporal temporal, TemporalUnit temporalUnit) {
        n v = v(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, v);
        }
        long E = v.E() - E();
        switch (m.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return E;
            case 2:
                return E / 1000;
            case 3:
                return E / 1000000;
            case 4:
                return E / 1000000000;
            case 5:
                return E / 60000000000L;
            case 6:
                return E / 3600000000000L;
            case 7:
                return E / 43200000000000L;
            default:
                i.a("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
                return 0L;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.a == nVar.a && this.b == nVar.b && this.c == nVar.c && this.d == nVar.d) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.k
    public final int f(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? w(nVar) : j$.time.temporal.o.a(this, nVar);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal g(j jVar) {
        return (n) j$.nio.file.attribute.a.c(jVar, this);
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.q h(j$.time.temporal.n nVar) {
        return j$.time.temporal.o.d(this, nVar);
    }

    public final int hashCode() {
        long E = E();
        return (int) (E ^ (E >>> 32));
    }

    @Override // j$.time.temporal.l
    public final Temporal j(Temporal temporal) {
        return temporal.a(E(), j$.time.temporal.a.NANO_OF_DAY);
    }

    @Override // j$.time.temporal.k
    public final Object k(j$.time.format.b bVar) {
        if (bVar == j$.time.temporal.o.b || bVar == j$.time.temporal.o.a || bVar == j$.time.temporal.o.e || bVar == j$.time.temporal.o.d) {
            return null;
        }
        if (bVar == j$.time.temporal.o.g) {
            return this;
        }
        if (bVar == j$.time.temporal.o.f) {
            return null;
        }
        return bVar == j$.time.temporal.o.c ? ChronoUnit.NANOS : bVar.a(this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal n(long j, ChronoUnit chronoUnit) {
        long j2;
        if (j == Long.MIN_VALUE) {
            this = b(Long.MAX_VALUE, chronoUnit);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return this.b(j2, chronoUnit);
    }

    @Override // j$.time.temporal.k
    public final long o(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? nVar == j$.time.temporal.a.NANO_OF_DAY ? E() : nVar == j$.time.temporal.a.MICRO_OF_DAY ? E() / 1000 : w(nVar) : nVar.h(this);
    }

    @Override // java.lang.Comparable
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final int compareTo(n nVar) {
        int compare = Integer.compare(this.a, nVar.a);
        return (compare == 0 && (compare = Integer.compare(this.b, nVar.b)) == 0 && (compare = Integer.compare(this.c, nVar.c)) == 0) ? Integer.compare(this.d, nVar.d) : compare;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(18);
        byte b = this.a;
        sb.append(b < 10 ? "0" : "");
        sb.append((int) b);
        byte b2 = this.b;
        sb.append(b2 < 10 ? ":0" : ":");
        sb.append((int) b2);
        byte b3 = this.c;
        int i = this.d;
        if (b3 > 0 || i > 0) {
            sb.append(b3 < 10 ? ":0" : ":");
            sb.append((int) b3);
            if (i > 0) {
                sb.append('.');
                if (i % 1000000 == 0) {
                    sb.append(Integer.toString((i / 1000000) + 1000).substring(1));
                } else if (i % 1000 == 0) {
                    sb.append(Integer.toString((i / 1000) + 1000000).substring(1));
                } else {
                    sb.append(Integer.toString(i + 1000000000).substring(1));
                }
            }
        }
        return sb.toString();
    }

    public final int w(j$.time.temporal.n nVar) {
        int i = m.a[((j$.time.temporal.a) nVar).ordinal()];
        byte b = this.b;
        int i2 = this.d;
        byte b2 = this.a;
        switch (i) {
            case 1:
                return i2;
            case 2:
                i.a("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
                return 0;
            case 3:
                return i2 / 1000;
            case 4:
                i.a("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
                return 0;
            case 5:
                return i2 / 1000000;
            case 6:
                return (int) (E() / 1000000);
            case 7:
                return this.c;
            case 8:
                return F();
            case 9:
                return b;
            case 10:
                return (b2 * 60) + b;
            case 11:
                return b2 % 12;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                int i3 = b2 % 12;
                if (i3 % 12 == 0) {
                    return 12;
                }
                return i3;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                if (b2 == 0) {
                    return 24;
                }
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return b2;
            case 15:
                return b2 / 12;
            default:
                i.a("Unsupported field: ".concat(String.valueOf(nVar)));
                return 0;
        }
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final n b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (n) temporalUnit.f(this, j);
        }
        switch (m.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return B(j);
            case 2:
                return B((j % 86400000000L) * 1000);
            case 3:
                return B((j % 86400000) * 1000000);
            case 4:
                return C(j);
            case 5:
                return A(j);
            case 6:
                return z(j);
            case 7:
                return z((j % 2) * 12);
            default:
                i.a("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
                return null;
        }
    }

    public final n z(long j) {
        if (j == 0) {
            return this;
        }
        return u(((((int) (j % 24)) + this.a) + 24) % 24, this.b, this.c, this.d);
    }
}
