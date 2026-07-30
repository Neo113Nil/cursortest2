package j$.time;

import com.facebook.appevents.AppEventsConstants;
import com.google.firebase.encoders.json.BuildConfig;
import j$.time.temporal.TemporalAccessor;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public final class ZoneOffset extends y implements TemporalAccessor, j$.time.temporal.n, Comparable<ZoneOffset>, Serializable {
    private static final long serialVersionUID = 2357656521762053153L;
    public final int b;
    public final transient String c;
    public static final ConcurrentMap d = new ConcurrentHashMap(16, 0.75f, 4);
    public static final ConcurrentMap e = new ConcurrentHashMap(16, 0.75f, 4);
    public static final ZoneOffset UTC = b0(0);
    public static final ZoneOffset f = b0(-64800);
    public static final ZoneOffset g = b0(64800);

    public ZoneOffset(int i) {
        String sb;
        this.b = i;
        if (i == 0) {
            sb = "Z";
        } else {
            int abs = Math.abs(i);
            StringBuilder sb2 = new StringBuilder();
            int i2 = abs / 3600;
            int i3 = (abs / 60) % 60;
            sb2.append(i < 0 ? "-" : "+");
            sb2.append(i2 < 10 ? AppEventsConstants.EVENT_PARAM_VALUE_NO : BuildConfig.FLAVOR);
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
        this.c = sb;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0090 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ZoneOffset Z(String str) {
        int c0;
        int i;
        int i2;
        char charAt;
        Objects.requireNonNull(str, "offsetId");
        ZoneOffset zoneOffset = (ZoneOffset) ((ConcurrentHashMap) e).get(str);
        if (zoneOffset != null) {
            return zoneOffset;
        }
        int length = str.length();
        if (length == 2) {
            str = str.charAt(0) + AppEventsConstants.EVENT_PARAM_VALUE_NO + str.charAt(1);
        } else if (length != 3) {
            if (length == 5) {
                c0 = c0(str, 1, false);
                i = c0(str, 3, false);
            } else {
                if (length != 6) {
                    if (length == 7) {
                        c0 = c0(str, 1, false);
                        i = c0(str, 3, false);
                        i2 = c0(str, 5, false);
                    } else {
                        if (length != 9) {
                            h.a("Invalid ID for ZoneOffset, invalid format: ".concat(str));
                            return null;
                        }
                        c0 = c0(str, 1, false);
                        i = c0(str, 4, true);
                        i2 = c0(str, 7, true);
                    }
                    charAt = str.charAt(0);
                    if (charAt != '+' || charAt == '-') {
                        return charAt == '-' ? a0(-c0, -i, -i2) : a0(c0, i, i2);
                    }
                    h.a("Invalid ID for ZoneOffset, plus/minus not found when expected: ".concat(str));
                    return null;
                }
                c0 = c0(str, 1, false);
                i = c0(str, 4, true);
            }
            i2 = 0;
            charAt = str.charAt(0);
            if (charAt != '+') {
            }
            if (charAt == '-') {
            }
        }
        c0 = c0(str, 1, false);
        i = 0;
        i2 = 0;
        charAt = str.charAt(0);
        if (charAt != '+') {
        }
        if (charAt == '-') {
        }
    }

    public static ZoneOffset a0(int i, int i2, int i3) {
        if (i < -18 || i > 18) {
            h.c("Zone offset hours not in valid range: value ", i, " is not in the range -18 to 18");
            return null;
        }
        if (i > 0) {
            if (i2 < 0 || i3 < 0) {
                h.a("Zone offset minutes and seconds must be positive because hours is positive");
                return null;
            }
        } else if (i < 0) {
            if (i2 > 0 || i3 > 0) {
                h.a("Zone offset minutes and seconds must be negative because hours is negative");
                return null;
            }
        } else if ((i2 > 0 && i3 < 0) || (i2 < 0 && i3 > 0)) {
            h.a("Zone offset minutes and seconds must have the same sign");
            return null;
        }
        if (i2 < -59 || i2 > 59) {
            h.c("Zone offset minutes not in valid range: value ", i2, " is not in the range -59 to 59");
            return null;
        }
        if (i3 < -59 || i3 > 59) {
            h.c("Zone offset seconds not in valid range: value ", i3, " is not in the range -59 to 59");
            return null;
        }
        if (Math.abs(i) != 18 || (i2 | i3) == 0) {
            return b0((i2 * 60) + (i * 3600) + i3);
        }
        h.a("Zone offset not in valid range: -18:00 to +18:00");
        return null;
    }

    public static ZoneOffset b0(int i) {
        if (i < -64800 || i > 64800) {
            h.a("Zone offset not in valid range: -18:00 to +18:00");
            return null;
        }
        if (i % 900 != 0) {
            return new ZoneOffset(i);
        }
        Integer valueOf = Integer.valueOf(i);
        ConcurrentMap concurrentMap = d;
        ZoneOffset zoneOffset = (ZoneOffset) concurrentMap.get(valueOf);
        if (zoneOffset != null) {
            return zoneOffset;
        }
        concurrentMap.putIfAbsent(valueOf, new ZoneOffset(i));
        ZoneOffset zoneOffset2 = (ZoneOffset) concurrentMap.get(valueOf);
        e.putIfAbsent(zoneOffset2.c, zoneOffset2);
        return zoneOffset2;
    }

    public static int c0(CharSequence charSequence, int i, boolean z) {
        if (z) {
            String str = (String) charSequence;
            if (str.charAt(i - 1) != ':') {
                h.i("Invalid ID for ZoneOffset, colon not found when expected: ", str);
                return 0;
            }
        }
        String str2 = (String) charSequence;
        char charAt = str2.charAt(i);
        char charAt2 = str2.charAt(i + 1);
        if (charAt < '0' || charAt > '9' || charAt2 < '0' || charAt2 > '9') {
            h.i("Invalid ID for ZoneOffset, non numeric characters found: ", str2);
            return 0;
        }
        return (charAt2 - '0') + ((charAt - '0') * 10);
    }

    public static ZoneOffset d0(DataInput dataInput) {
        byte readByte = dataInput.readByte();
        return readByte == Byte.MAX_VALUE ? b0(dataInput.readInt()) : b0(readByte * 900);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new t((byte) 8, this);
    }

    @Override // j$.time.y
    public final j$.time.zone.f B() {
        return new j$.time.zone.f(this);
    }

    @Override // j$.time.y
    public final void W(DataOutput dataOutput) {
        dataOutput.writeByte(8);
        e0(dataOutput);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object b(a0 a0Var) {
        return (a0Var == j$.time.temporal.r.d || a0Var == j$.time.temporal.r.e) ? this : super.b(a0Var);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m c(j$.time.temporal.m mVar) {
        return mVar.i(this.b, j$.time.temporal.a.OFFSET_SECONDS);
    }

    @Override // java.lang.Comparable
    public final int compareTo(ZoneOffset zoneOffset) {
        return zoneOffset.b - this.b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int e(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.b;
        }
        if (qVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.t(d.a("Unsupported field: ", qVar));
        }
        return super.k(qVar).a(g(qVar), qVar);
    }

    public final void e0(DataOutput dataOutput) {
        int i = this.b;
        int i2 = i % 900 == 0 ? i / 900 : 127;
        dataOutput.writeByte(i2);
        if (i2 == 127) {
            dataOutput.writeInt(i);
        }
    }

    @Override // j$.time.y
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZoneOffset) && this.b == ((ZoneOffset) obj).b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.OFFSET_SECONDS : qVar != null && qVar.s(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long g(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.b;
        }
        if (qVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.t(d.a("Unsupported field: ", qVar));
        }
        return qVar.P(this);
    }

    @Override // j$.time.y
    public final int hashCode() {
        return this.b;
    }

    @Override // j$.time.y
    public final String q() {
        return this.c;
    }

    @Override // j$.time.y
    public final String toString() {
        return this.c;
    }
}
