package j$.time.zone;

import j$.time.c0;
import j$.time.n;
import j$.time.o;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class d implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;
    public final o a;
    public final byte b;
    public final j$.time.d c;
    public final n d;
    public final boolean e;
    public final c f;
    public final c0 g;
    public final c0 h;
    public final c0 i;

    public d(o oVar, int i, j$.time.d dVar, n nVar, boolean z, c cVar, c0 c0Var, c0 c0Var2, c0 c0Var3) {
        this.a = oVar;
        this.b = (byte) i;
        this.c = dVar;
        this.d = nVar;
        this.e = z;
        this.f = cVar;
        this.g = c0Var;
        this.h = c0Var2;
        this.i = c0Var3;
    }

    public static d a(ObjectInput objectInput) {
        c cVar;
        n nVar;
        int readInt = objectInput.readInt();
        o w = o.w(readInt >>> 28);
        int i = ((264241152 & readInt) >>> 22) - 32;
        int i2 = (3670016 & readInt) >>> 19;
        j$.time.d t = i2 == 0 ? null : j$.time.d.t(i2);
        int i3 = (507904 & readInt) >>> 14;
        c cVar2 = c.values()[(readInt & 12288) >>> 12];
        int i4 = (readInt & 4080) >>> 4;
        int i5 = (readInt & 12) >>> 2;
        int i6 = readInt & 3;
        if (i3 == 31) {
            long readInt2 = objectInput.readInt();
            n nVar2 = n.e;
            j$.time.temporal.a.SECOND_OF_DAY.k(readInt2);
            int i7 = (int) (readInt2 / 3600);
            long j = readInt2 - (i7 * 3600);
            cVar = cVar2;
            nVar = n.u(i7, (int) (j / 60), (int) (j - (r14 * 60)), 0);
        } else {
            cVar = cVar2;
            int i8 = i3 % 24;
            n nVar3 = n.e;
            j$.time.temporal.a.HOUR_OF_DAY.k(i8);
            nVar = n.h[i8];
        }
        c0 C = c0.C(i4 == 255 ? objectInput.readInt() : (i4 - 128) * 900);
        int i9 = C.a;
        c0 C2 = c0.C(i5 == 3 ? objectInput.readInt() : (i5 * 1800) + i9);
        c0 C3 = c0.C(i6 == 3 ? objectInput.readInt() : (i6 * 1800) + i9);
        boolean z = i3 == 24;
        Objects.a(w, "month");
        Objects.a(nVar, "time");
        c cVar3 = cVar;
        Objects.a(cVar3, "timeDefnition");
        if (i < -28 || i > 31 || i == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (z && !nVar.equals(n.g)) {
            throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
        }
        if (nVar.d == 0) {
            return new d(w, i, t, nVar, z, cVar3, C, C2, C3);
        }
        throw new IllegalArgumentException("Time's nano-of-second must be zero");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 3, this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.a == dVar.a && this.b == dVar.b && this.c == dVar.c && this.f == dVar.f && this.d.equals(dVar.d) && this.e == dVar.e && this.g.equals(dVar.g) && this.h.equals(dVar.h) && this.i.equals(dVar.i);
    }

    public final int hashCode() {
        int F = ((this.d.F() + (this.e ? 1 : 0)) << 15) + (this.a.ordinal() << 11) + ((this.b + 32) << 5);
        j$.time.d dVar = this.c;
        return this.i.a ^ ((this.g.a ^ (this.f.ordinal() + (F + ((dVar == null ? 7 : dVar.ordinal()) << 2)))) ^ this.h.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransitionRule[");
        c0 c0Var = this.i;
        int i = c0Var.a;
        c0 c0Var2 = this.h;
        sb.append(i - c0Var2.a > 0 ? "Gap " : "Overlap ");
        sb.append(c0Var2);
        sb.append(" to ");
        sb.append(c0Var);
        sb.append(", ");
        o oVar = this.a;
        byte b = this.b;
        j$.time.d dVar = this.c;
        if (dVar == null) {
            sb.append(oVar.name());
            sb.append(' ');
            sb.append((int) b);
        } else if (b == -1) {
            sb.append(dVar.name());
            sb.append(" on or before last day of ");
            sb.append(oVar.name());
        } else if (b < 0) {
            sb.append(dVar.name());
            sb.append(" on or before last day minus ");
            sb.append((-b) - 1);
            sb.append(" of ");
            sb.append(oVar.name());
        } else {
            sb.append(dVar.name());
            sb.append(" on or after ");
            sb.append(oVar.name());
            sb.append(' ');
            sb.append((int) b);
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

    public final void writeExternal(ObjectOutput objectOutput) {
        int i = this.i.a;
        int i2 = this.h.a;
        n nVar = this.d;
        boolean z = this.e;
        int F = z ? 86400 : nVar.F();
        int i3 = this.g.a;
        int i4 = i2 - i3;
        int i5 = i - i3;
        byte b = F % 3600 == 0 ? z ? (byte) 24 : nVar.a : (byte) 31;
        int i6 = i3 % 900 == 0 ? (i3 / 900) + 128 : 255;
        int i7 = (i4 == 0 || i4 == 1800 || i4 == 3600) ? i4 / 1800 : 3;
        int i8 = (i5 == 0 || i5 == 1800 || i5 == 3600) ? i5 / 1800 : 3;
        j$.time.d dVar = this.c;
        objectOutput.writeInt((this.a.getValue() << 28) + ((this.b + 32) << 22) + ((dVar == null ? 0 : dVar.getValue()) << 19) + (b << 14) + (this.f.ordinal() << 12) + (i6 << 4) + (i7 << 2) + i8);
        if (b == 31) {
            objectOutput.writeInt(F);
        }
        if (i6 == 255) {
            objectOutput.writeInt(i3);
        }
        if (i7 == 3) {
            objectOutput.writeInt(i2);
        }
        if (i8 == 3) {
            objectOutput.writeInt(i);
        }
    }
}
