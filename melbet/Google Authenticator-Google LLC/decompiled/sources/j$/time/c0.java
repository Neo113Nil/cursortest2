package j$.time;

import j$.time.temporal.Temporal;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class c0 extends b0 implements j$.time.temporal.k, j$.time.temporal.l, Comparable {
    public static final ConcurrentHashMap c = new ConcurrentHashMap(16, 0.75f, 4);
    public static final ConcurrentHashMap d = new ConcurrentHashMap(16, 0.75f, 4);
    public static final c0 e = C(0);
    public static final c0 f = C(-64800);
    public static final c0 g = C(64800);
    private static final long serialVersionUID = 2357656521762053153L;
    public final int a;
    public final transient String b;

    public c0(int i) {
        String sb;
        this.a = i;
        if (i == 0) {
            sb = "Z";
        } else {
            int abs = Math.abs(i);
            int i2 = abs / 3600;
            int i3 = (abs / 60) % 60;
            StringBuilder sb2 = new StringBuilder(i < 0 ? "-" : "+");
            sb2.append(i2 < 10 ? "0" : "");
            sb2.append(i2);
            sb2.append(i3 < 10 ? ":0" : ":");
            sb2.append(i3);
            int i4 = abs % 60;
            if (i4 != 0) {
                sb2.append(i4 < 10 ? ":0" : ":");
                sb2.append(i4);
            }
            sb = sb2.toString();
        }
        this.b = sb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0089 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c0 A(String str) {
        int D;
        int i;
        int i2;
        char charAt;
        c0 c0Var = (c0) d.get(str);
        if (c0Var != null) {
            return c0Var;
        }
        int length = str.length();
        if (length == 2) {
            str = str.charAt(0) + "0" + str.charAt(1);
        } else if (length != 3) {
            if (length == 5) {
                D = D(str, 1, false);
                i = D(str, 3, false);
            } else {
                if (length != 6) {
                    if (length == 7) {
                        D = D(str, 1, false);
                        i = D(str, 3, false);
                        i2 = D(str, 5, false);
                    } else {
                        if (length != 9) {
                            i.d("Invalid ID for ZoneOffset, invalid format: ".concat(str));
                            return null;
                        }
                        D = D(str, 1, false);
                        i = D(str, 4, true);
                        i2 = D(str, 7, true);
                    }
                    charAt = str.charAt(0);
                    if (charAt != '+' || charAt == '-') {
                        return charAt == '-' ? B(-D, -i, -i2) : B(D, i, i2);
                    }
                    i.d("Invalid ID for ZoneOffset, plus/minus not found when expected: ".concat(str));
                    return null;
                }
                D = D(str, 1, false);
                i = D(str, 4, true);
            }
            i2 = 0;
            charAt = str.charAt(0);
            if (charAt != '+') {
            }
            if (charAt == '-') {
            }
        }
        D = D(str, 1, false);
        i = 0;
        i2 = 0;
        charAt = str.charAt(0);
        if (charAt != '+') {
        }
        if (charAt == '-') {
        }
    }

    public static c0 B(int i, int i2, int i3) {
        if (i < -18 || i > 18) {
            i.c("Zone offset hours not in valid range: value ", i, " is not in the range -18 to 18");
            return null;
        }
        if (i > 0) {
            if (i2 < 0 || i3 < 0) {
                i.d("Zone offset minutes and seconds must be positive because hours is positive");
                return null;
            }
        } else if (i < 0) {
            if (i2 > 0 || i3 > 0) {
                i.d("Zone offset minutes and seconds must be negative because hours is negative");
                return null;
            }
        } else if ((i2 > 0 && i3 < 0) || (i2 < 0 && i3 > 0)) {
            i.d("Zone offset minutes and seconds must have the same sign");
            return null;
        }
        if (i2 < -59 || i2 > 59) {
            i.c("Zone offset minutes not in valid range: value ", i2, " is not in the range -59 to 59");
            return null;
        }
        if (i3 < -59 || i3 > 59) {
            i.c("Zone offset seconds not in valid range: value ", i3, " is not in the range -59 to 59");
            return null;
        }
        if (Math.abs(i) != 18 || (i2 | i3) == 0) {
            return C((i2 * 60) + (i * 3600) + i3);
        }
        i.d("Zone offset not in valid range: -18:00 to +18:00");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static c0 C(int i) {
        if (i < -64800 || i > 64800) {
            i.d("Zone offset not in valid range: -18:00 to +18:00");
            return null;
        }
        if (i % 900 != 0) {
            return new c0(i);
        }
        Integer valueOf = Integer.valueOf(i);
        ConcurrentHashMap concurrentHashMap = c;
        c0 c0Var = (c0) concurrentHashMap.get(valueOf);
        if (c0Var != null) {
            return c0Var;
        }
        concurrentHashMap.putIfAbsent(valueOf, new c0(i));
        c0 c0Var2 = (c0) concurrentHashMap.get(valueOf);
        d.putIfAbsent(c0Var2.b, c0Var2);
        return c0Var2;
    }

    public static int D(CharSequence charSequence, int i, boolean z) {
        if (z && charSequence.charAt(i - 1) != ':') {
            i.d("Invalid ID for ZoneOffset, colon not found when expected: ".concat(String.valueOf(charSequence)));
            return 0;
        }
        char charAt = charSequence.charAt(i);
        char charAt2 = charSequence.charAt(i + 1);
        if (charAt < '0' || charAt > '9' || charAt2 < '0' || charAt2 > '9') {
            i.d("Invalid ID for ZoneOffset, non numeric characters found: ".concat(String.valueOf(charSequence)));
            return 0;
        }
        return (charAt2 - '0') + ((charAt - '0') * 10);
    }

    public static c0 E(DataInput dataInput) {
        byte readByte = dataInput.readByte();
        return readByte == Byte.MAX_VALUE ? C(dataInput.readInt()) : C(readByte * 900);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new w((byte) 8, this);
    }

    public static c0 z(Temporal temporal) {
        Objects.a(temporal, "temporal");
        c0 c0Var = (c0) temporal.k(j$.time.temporal.o.d);
        if (c0Var != null) {
            return c0Var;
        }
        i.d(g.a("Unable to obtain ZoneOffset from TemporalAccessor: ", String.valueOf(temporal), " of type ", temporal.getClass().getName()));
        return null;
    }

    public final void F(DataOutput dataOutput) {
        int i = this.a;
        int i2 = i % 900 == 0 ? i / 900 : 127;
        dataOutput.writeByte(i2);
        if (i2 == 127) {
            dataOutput.writeInt(i);
        }
    }

    @Override // j$.time.temporal.k
    public final boolean c(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? nVar == j$.time.temporal.a.OFFSET_SECONDS : nVar != null && nVar.f(this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return ((c0) obj).a - this.a;
    }

    @Override // j$.time.b0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c0) {
            if (this.a == ((c0) obj).a) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.k
    public final int f(j$.time.temporal.n nVar) {
        if (nVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.a;
        }
        if (!(nVar != null)) {
            return j$.time.temporal.o.d(this, nVar).a(o(nVar), nVar);
        }
        i.a("Unsupported field: ".concat(String.valueOf(nVar)));
        return 0;
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.q h(j$.time.temporal.n nVar) {
        return j$.time.temporal.o.d(this, nVar);
    }

    @Override // j$.time.b0
    public final int hashCode() {
        return this.a;
    }

    @Override // j$.time.temporal.l
    public final Temporal j(Temporal temporal) {
        return temporal.a(this.a, j$.time.temporal.a.OFFSET_SECONDS);
    }

    @Override // j$.time.temporal.k
    public final Object k(j$.time.format.b bVar) {
        return (bVar == j$.time.temporal.o.d || bVar == j$.time.temporal.o.e) ? this : j$.time.temporal.o.c(this, bVar);
    }

    @Override // j$.time.temporal.k
    public final long o(j$.time.temporal.n nVar) {
        if (nVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.a;
        }
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.h(this);
        }
        i.a("Unsupported field: ".concat(String.valueOf(nVar)));
        return 0L;
    }

    @Override // j$.time.b0
    public final String toString() {
        return this.b;
    }

    @Override // j$.time.b0
    public final String u() {
        return this.b;
    }

    @Override // j$.time.b0
    public final j$.time.zone.e v() {
        return new j$.time.zone.e(this);
    }

    @Override // j$.time.b0
    public final void y(ObjectOutput objectOutput) {
        objectOutput.writeByte(8);
        F(objectOutput);
    }
}
