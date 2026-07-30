package j$.time.zone;

import j$.time.ZoneOffset;
import j$.time.l;
import j$.time.n;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public final class e implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;
    public final n a;
    public final byte b;
    public final j$.time.e c;
    public final l d;
    public final boolean e;
    public final d f;
    public final ZoneOffset g;
    public final ZoneOffset h;
    public final ZoneOffset i;

    public e(n nVar, int i, j$.time.e eVar, l lVar, boolean z, d dVar, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        this.a = nVar;
        this.b = (byte) i;
        this.c = eVar;
        this.d = lVar;
        this.e = z;
        this.f = dVar;
        this.g = zoneOffset;
        this.h = zoneOffset2;
        this.i = zoneOffset3;
    }

    public static e a(DataInput dataInput) {
        d dVar;
        l lVar;
        int readInt = dataInput.readInt();
        n J = n.J(readInt >>> 28);
        int i = ((264241152 & readInt) >>> 22) - 32;
        int i2 = (3670016 & readInt) >>> 19;
        j$.time.e s = i2 == 0 ? null : j$.time.e.s(i2);
        int i3 = (507904 & readInt) >>> 14;
        d dVar2 = d.values()[(readInt & 12288) >>> 12];
        int i4 = (readInt & 4080) >>> 4;
        int i5 = (readInt & 12) >>> 2;
        int i6 = readInt & 3;
        if (i3 == 31) {
            long readInt2 = dataInput.readInt();
            l lVar2 = l.e;
            j$.time.temporal.a.SECOND_OF_DAY.Z(readInt2);
            int i7 = (int) (readInt2 / 3600);
            long j = readInt2 - (i7 * 3600);
            dVar = dVar2;
            lVar = l.B(i7, (int) (j / 60), (int) (j - (r14 * 60)), 0);
        } else {
            dVar = dVar2;
            int i8 = i3 % 24;
            l lVar3 = l.e;
            j$.time.temporal.a.HOUR_OF_DAY.Z(i8);
            lVar = l.h[i8];
        }
        ZoneOffset b0 = ZoneOffset.b0(i4 == 255 ? dataInput.readInt() : (i4 - 128) * 900);
        ZoneOffset b02 = ZoneOffset.b0(i5 == 3 ? dataInput.readInt() : (i5 * 1800) + b0.b);
        ZoneOffset b03 = ZoneOffset.b0(i6 == 3 ? dataInput.readInt() : (i6 * 1800) + b0.b);
        boolean z = i3 == 24;
        Objects.requireNonNull(J, "month");
        Objects.requireNonNull(lVar, "time");
        d dVar3 = dVar;
        Objects.requireNonNull(dVar3, "timeDefnition");
        if (i < -28 || i > 31 || i == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (z && !lVar.equals(l.g)) {
            throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
        }
        if (lVar.d == 0) {
            return new e(J, i, s, lVar, z, dVar3, b0, b02, b03);
        }
        throw new IllegalArgumentException("Time's nano-of-second must be zero");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 3, this);
    }

    public final void b(DataOutput dataOutput) {
        int g0 = this.e ? 86400 : this.d.g0();
        int i = this.g.b;
        int i2 = this.h.b - i;
        int i3 = this.i.b - i;
        byte b = g0 % 3600 == 0 ? this.e ? (byte) 24 : this.d.a : (byte) 31;
        int i4 = i % 900 == 0 ? (i / 900) + 128 : 255;
        int i5 = (i2 == 0 || i2 == 1800 || i2 == 3600) ? i2 / 1800 : 3;
        int i6 = (i3 == 0 || i3 == 1800 || i3 == 3600) ? i3 / 1800 : 3;
        j$.time.e eVar = this.c;
        dataOutput.writeInt((this.a.getValue() << 28) + ((this.b + 32) << 22) + ((eVar == null ? 0 : eVar.getValue()) << 19) + (b << 14) + (this.f.ordinal() << 12) + (i4 << 4) + (i5 << 2) + i6);
        if (b == 31) {
            dataOutput.writeInt(g0);
        }
        if (i4 == 255) {
            dataOutput.writeInt(i);
        }
        if (i5 == 3) {
            dataOutput.writeInt(this.h.b);
        }
        if (i6 == 3) {
            dataOutput.writeInt(this.i.b);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a == eVar.a && this.b == eVar.b && this.c == eVar.c && this.f == eVar.f && this.d.equals(eVar.d) && this.e == eVar.e && this.g.equals(eVar.g) && this.h.equals(eVar.h) && this.i.equals(eVar.i);
    }

    public final int hashCode() {
        int g0 = ((this.d.g0() + (this.e ? 1 : 0)) << 15) + (this.a.ordinal() << 11) + ((this.b + 32) << 5);
        j$.time.e eVar = this.c;
        return this.i.b ^ ((this.g.b ^ (this.f.ordinal() + (g0 + ((eVar == null ? 7 : eVar.ordinal()) << 2)))) ^ this.h.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransitionRule[");
        sb.append(this.i.b - this.h.b > 0 ? "Gap " : "Overlap ");
        sb.append(this.h);
        sb.append(" to ");
        sb.append(this.i);
        sb.append(", ");
        j$.time.e eVar = this.c;
        if (eVar != null) {
            byte b = this.b;
            if (b == -1) {
                sb.append(eVar.name());
                sb.append(" on or before last day of ");
                sb.append(this.a.name());
            } else if (b < 0) {
                sb.append(eVar.name());
                sb.append(" on or before last day minus ");
                sb.append((-this.b) - 1);
                sb.append(" of ");
                sb.append(this.a.name());
            } else {
                sb.append(eVar.name());
                sb.append(" on or after ");
                sb.append(this.a.name());
                sb.append(' ');
                sb.append((int) this.b);
            }
        } else {
            sb.append(this.a.name());
            sb.append(' ');
            sb.append((int) this.b);
        }
        sb.append(" at ");
        sb.append(this.e ? "24:00" : this.d.toString());
        sb.append(" ");
        sb.append(this.f);
        sb.append(", standard offset ");
        sb.append(this.g);
        sb.append(']');
        return sb.toString();
    }
}
