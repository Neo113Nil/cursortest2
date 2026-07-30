package j$.time;

import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.firebase.encoders.json.BuildConfig;
import defpackage.l42;
import j$.time.temporal.TemporalAccessor;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public final class l implements j$.time.temporal.m, j$.time.temporal.n, Comparable, Serializable {
    public static final l e;
    public static final l f;
    public static final l g;
    public static final l[] h = new l[24];
    private static final long serialVersionUID = 6414437269572265201L;
    public final byte a;
    public final byte b;
    public final byte c;
    public final int d;

    static {
        int i = 0;
        while (true) {
            l[] lVarArr = h;
            if (i >= lVarArr.length) {
                l lVar = lVarArr[0];
                g = lVar;
                l lVar2 = lVarArr[12];
                e = lVar;
                f = new l(23, 59, 59, 999999999);
                return;
            }
            lVarArr[i] = new l(i, 0, 0, 0);
            i++;
        }
    }

    public l(int i, int i2, int i3, int i4) {
        this.a = (byte) i;
        this.b = (byte) i2;
        this.c = (byte) i3;
        this.d = i4;
    }

    public static l B(int i, int i2, int i3, int i4) {
        return ((i2 | i3) | i4) == 0 ? h[i] : new l(i, i2, i3, i4);
    }

    public static l G(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        l lVar = (l) temporalAccessor.b(j$.time.temporal.r.g);
        if (lVar != null) {
            return lVar;
        }
        h.f("Unable to obtain LocalTime from TemporalAccessor: ", temporalAccessor, " of type ", temporalAccessor.getClass().getName());
        return null;
    }

    public static l P(int i, int i2, int i3, int i4) {
        j$.time.temporal.a.HOUR_OF_DAY.Z(i);
        j$.time.temporal.a.MINUTE_OF_HOUR.Z(i2);
        j$.time.temporal.a.SECOND_OF_MINUTE.Z(i3);
        j$.time.temporal.a.NANO_OF_SECOND.Z(i4);
        return B(i, i2, i3, i4);
    }

    public static l W(long j) {
        j$.time.temporal.a.NANO_OF_DAY.Z(j);
        int i = (int) (j / 3600000000000L);
        long j2 = j - (i * 3600000000000L);
        int i2 = (int) (j2 / 60000000000L);
        long j3 = j2 - (i2 * 60000000000L);
        int i3 = (int) (j3 / 1000000000);
        return B(i, i2, i3, (int) (j3 - (i3 * 1000000000)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [int] */
    public static l e0(DataInput dataInput) {
        int readInt;
        int i;
        int readByte = dataInput.readByte();
        byte b = 0;
        if (readByte < 0) {
            readByte = ~readByte;
            i = 0;
            readInt = 0;
        } else {
            byte readByte2 = dataInput.readByte();
            if (readByte2 < 0) {
                ?? r5 = ~readByte2;
                readInt = 0;
                b = r5;
                i = 0;
            } else {
                byte readByte3 = dataInput.readByte();
                if (readByte3 < 0) {
                    i = ~readByte3;
                    readInt = 0;
                    b = readByte2;
                } else {
                    readInt = dataInput.readInt();
                    b = readByte2;
                    i = readByte3;
                }
            }
        }
        return P(readByte, b, i, readInt);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new t((byte) 4, this);
    }

    public final int J(j$.time.temporal.q qVar) {
        switch (k.a[((j$.time.temporal.a) qVar).ordinal()]) {
            case 1:
                return this.d;
            case 2:
                throw new j$.time.temporal.t("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return this.d / 1000;
            case 4:
                throw new j$.time.temporal.t("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return this.d / 1000000;
            case 6:
                return (int) (f0() / 1000000);
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                return this.c;
            case 8:
                return g0();
            case 9:
                return this.b;
            case 10:
                return (this.a * 60) + this.b;
            case 11:
                return this.a % 12;
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                int i = this.a % 12;
                if (i % 12 == 0) {
                    return 12;
                }
                return i;
            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                return this.a;
            case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                byte b = this.a;
                if (b == 0) {
                    return 24;
                }
                return b;
            case 15:
                return this.a / 12;
            default:
                throw new j$.time.temporal.t(d.a("Unsupported field: ", qVar));
        }
    }

    @Override // j$.time.temporal.m
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public final l l(long j, j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.b)) {
            return (l) sVar.s(this, j);
        }
        switch (k.b[((j$.time.temporal.b) sVar).ordinal()]) {
            case 1:
                return c0(j);
            case 2:
                return c0((j % 86400000000L) * 1000);
            case 3:
                return c0((j % 86400000) * 1000000);
            case 4:
                return d0(j);
            case 5:
                return b0(j);
            case 6:
                return a0(j);
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                return a0((j % 2) * 12);
            default:
                h.d("Unsupported unit: ", sVar);
                return null;
        }
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m a(long j, j$.time.temporal.s sVar) {
        long j2;
        if (j == Long.MIN_VALUE) {
            this = l(Long.MAX_VALUE, sVar);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return this.l(j2, sVar);
    }

    public final l a0(long j) {
        return j == 0 ? this : B(((((int) (j % 24)) + this.a) + 24) % 24, this.b, this.c, this.d);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object b(a0 a0Var) {
        if (a0Var == j$.time.temporal.r.b || a0Var == j$.time.temporal.r.a || a0Var == j$.time.temporal.r.e || a0Var == j$.time.temporal.r.d) {
            return null;
        }
        if (a0Var == j$.time.temporal.r.g) {
            return this;
        }
        if (a0Var == j$.time.temporal.r.f) {
            return null;
        }
        return a0Var == j$.time.temporal.r.c ? j$.time.temporal.b.NANOS : a0Var.j(this);
    }

    public final l b0(long j) {
        if (j != 0) {
            int i = (this.a * 60) + this.b;
            int i2 = ((((int) (j % 1440)) + i) + 1440) % 1440;
            if (i != i2) {
                return B(i2 / 60, i2 % 60, this.c, this.d);
            }
        }
        return this;
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m c(j$.time.temporal.m mVar) {
        return mVar.i(f0(), j$.time.temporal.a.NANO_OF_DAY);
    }

    public final l c0(long j) {
        if (j != 0) {
            long f0 = f0();
            long j2 = (((j % 86400000000000L) + f0) + 86400000000000L) % 86400000000000L;
            if (f0 != j2) {
                return B((int) (j2 / 3600000000000L), (int) ((j2 / 60000000000L) % 60), (int) ((j2 / 1000000000) % 60), (int) (j2 % 1000000000));
            }
        }
        return this;
    }

    public final l d0(long j) {
        if (j != 0) {
            int i = (this.b * 60) + (this.a * 3600) + this.c;
            int i2 = ((((int) (j % 86400)) + i) + 86400) % 86400;
            if (i != i2) {
                return B(i2 / 3600, (i2 / 60) % 60, i2 % 60, this.d);
            }
        }
        return this;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int e(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? J(qVar) : super.e(qVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.a == lVar.a && this.b == lVar.b && this.c == lVar.c && this.d == lVar.d) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) qVar).a0() : qVar != null && qVar.s(this);
    }

    public final long f0() {
        return (this.c * 1000000000) + (this.b * 60000000000L) + (this.a * 3600000000000L) + this.d;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long g(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.NANO_OF_DAY ? f0() : qVar == j$.time.temporal.a.MICRO_OF_DAY ? f0() / 1000 : J(qVar) : qVar.P(this);
    }

    public final int g0() {
        return (this.b * 60) + (this.a * 3600) + this.c;
    }

    @Override // j$.time.temporal.m
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public final l i(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (l) qVar.W(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        aVar.Z(j);
        switch (k.a[aVar.ordinal()]) {
            case 1:
                return i0((int) j);
            case 2:
                return W(j);
            case 3:
                return i0(((int) j) * 1000);
            case 4:
                return W(j * 1000);
            case 5:
                return i0(((int) j) * 1000000);
            case 6:
                return W(j * 1000000);
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                int i = (int) j;
                if (this.c != i) {
                    j$.time.temporal.a.SECOND_OF_MINUTE.Z(i);
                    return B(this.a, this.b, i, this.d);
                }
                return this;
            case 8:
                return d0(j - g0());
            case 9:
                int i2 = (int) j;
                if (this.b != i2) {
                    j$.time.temporal.a.MINUTE_OF_HOUR.Z(i2);
                    return B(this.a, i2, this.c, this.d);
                }
                return this;
            case 10:
                return b0(j - ((this.a * 60) + this.b));
            case 11:
                return a0(j - (this.a % 12));
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                if (j == 12) {
                    j = 0;
                }
                return a0(j - (this.a % 12));
            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                int i3 = (int) j;
                if (this.a != i3) {
                    j$.time.temporal.a.HOUR_OF_DAY.Z(i3);
                    return B(i3, this.b, this.c, this.d);
                }
                return this;
            case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                if (j == 24) {
                    j = 0;
                }
                int i4 = (int) j;
                if (this.a != i4) {
                    j$.time.temporal.a.HOUR_OF_DAY.Z(i4);
                    return B(i4, this.b, this.c, this.d);
                }
                return this;
            case 15:
                return a0((j - (this.a / 12)) * 12);
            default:
                throw new j$.time.temporal.t(d.a("Unsupported field: ", qVar));
        }
    }

    public final int hashCode() {
        long f0 = f0();
        return (int) (f0 ^ (f0 >>> 32));
    }

    public final l i0(int i) {
        if (this.d == i) {
            return this;
        }
        j$.time.temporal.a.NANO_OF_SECOND.Z(i);
        return B(this.a, this.b, this.c, i);
    }

    @Override // j$.time.temporal.m
    /* renamed from: j */
    public final j$.time.temporal.m m(LocalDate localDate) {
        return (l) localDate.c(this);
    }

    public final void j0(DataOutput dataOutput) {
        if (this.d != 0) {
            dataOutput.writeByte(this.a);
            dataOutput.writeByte(this.b);
            dataOutput.writeByte(this.c);
            dataOutput.writeInt(this.d);
            return;
        }
        if (this.c != 0) {
            dataOutput.writeByte(this.a);
            dataOutput.writeByte(this.b);
            dataOutput.writeByte(~this.c);
            return;
        }
        byte b = this.b;
        byte b2 = this.a;
        if (b == 0) {
            dataOutput.writeByte(~b2);
        } else {
            dataOutput.writeByte(b2);
            dataOutput.writeByte(~this.b);
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final int compareTo(l lVar) {
        int compare = Integer.compare(this.a, lVar.a);
        return (compare == 0 && (compare = Integer.compare(this.b, lVar.b)) == 0 && (compare = Integer.compare(this.c, lVar.c)) == 0) ? Integer.compare(this.d, lVar.d) : compare;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(18);
        byte b = this.a;
        byte b2 = this.b;
        byte b3 = this.c;
        int i = this.d;
        sb.append(b < 10 ? AppEventsConstants.EVENT_PARAM_VALUE_NO : BuildConfig.FLAVOR);
        sb.append((int) b);
        sb.append(b2 < 10 ? ":0" : ":");
        sb.append((int) b2);
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
}
