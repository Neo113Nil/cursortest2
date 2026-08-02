package j$.time;

import j$.util.Objects;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import org.chromium.net.UrlRequest;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class w implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;
    public byte a;
    public Object b;

    public w(byte b, Object obj) {
        this.a = b;
        this.b = obj;
    }

    public static Serializable a(byte b, ObjectInput objectInput) {
        switch (b) {
            case 1:
                Duration duration = Duration.ZERO;
                return Duration.ofSeconds(objectInput.readLong(), objectInput.readInt());
            case 2:
                Instant instant = Instant.EPOCH;
                return Instant.ofEpochSecond(objectInput.readLong(), objectInput.readInt());
            case 3:
                j jVar = j.d;
                return j.E(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case 4:
                return n.D(objectInput);
            case 5:
                l lVar = l.c;
                j jVar2 = j.d;
                return l.w(j.E(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), n.D(objectInput));
            case 6:
                l lVar2 = l.c;
                j jVar3 = j.d;
                l w = l.w(j.E(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), n.D(objectInput));
                c0 E = c0.E(objectInput);
                b0 b0Var = (b0) a(objectInput.readByte(), objectInput);
                Objects.a(b0Var, "zone");
                if (!(b0Var instanceof c0) || E.equals(b0Var)) {
                    return new f0(w, b0Var, E);
                }
                throw new IllegalArgumentException("ZoneId must match ZoneOffset");
            case 7:
                int i = d0.c;
                String readUTF = objectInput.readUTF();
                Objects.a(readUTF, "zoneId");
                return (readUTF.length() <= 1 || readUTF.startsWith("+") || readUTF.startsWith("-")) ? c0.A(readUTF) : (readUTF.startsWith("UTC") || readUTF.startsWith("GMT")) ? b0.x(readUTF, 3) : readUTF.startsWith("UT") ? b0.x(readUTF, 2) : d0.z(readUTF);
            case 8:
                return c0.E(objectInput);
            case 9:
                int i2 = u.c;
                return new u(n.D(objectInput), c0.E(objectInput));
            case 10:
                int i3 = s.c;
                j jVar4 = j.d;
                return new s(l.w(j.E(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), n.D(objectInput)), c0.E(objectInput));
            case 11:
                int i4 = y.b;
                return y.t(objectInput.readInt());
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                int i5 = a0.c;
                int readInt = objectInput.readInt();
                byte readByte = objectInput.readByte();
                j$.time.temporal.a.YEAR.k(readInt);
                j$.time.temporal.a.MONTH_OF_YEAR.k(readByte);
                return new a0(readInt, readByte);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                int i6 = q.c;
                byte readByte2 = objectInput.readByte();
                byte readByte3 = objectInput.readByte();
                o w2 = o.w(readByte2);
                Objects.a(w2, "month");
                j$.time.temporal.a.DAY_OF_MONTH.k(readByte3);
                if (readByte3 <= w2.v()) {
                    return new q(w2.getValue(), readByte3);
                }
                throw new c("Illegal value for DayOfMonth field, value " + ((int) readByte3) + " is not valid for month " + w2.name());
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                v vVar = v.d;
                int readInt2 = objectInput.readInt();
                int readInt3 = objectInput.readInt();
                int readInt4 = objectInput.readInt();
                return ((readInt2 | readInt3) | readInt4) == 0 ? v.d : new v(readInt2, readInt3, readInt4);
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        this.a = readByte;
        this.b = a(readByte, objectInput);
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        byte b = this.a;
        Object obj = this.b;
        objectOutput.writeByte(b);
        switch (b) {
            case 1:
                Duration duration = (Duration) obj;
                objectOutput.writeLong(duration.a);
                objectOutput.writeInt(duration.b);
                return;
            case 2:
                Instant instant = (Instant) obj;
                objectOutput.writeLong(instant.a);
                objectOutput.writeInt(instant.b);
                return;
            case 3:
                j jVar = (j) obj;
                objectOutput.writeInt(jVar.a);
                objectOutput.writeByte(jVar.b);
                objectOutput.writeByte(jVar.c);
                return;
            case 4:
                ((n) obj).I(objectOutput);
                return;
            case 5:
                l lVar = (l) obj;
                j jVar2 = lVar.a;
                objectOutput.writeInt(jVar2.a);
                objectOutput.writeByte(jVar2.b);
                objectOutput.writeByte(jVar2.c);
                lVar.b.I(objectOutput);
                return;
            case 6:
                f0 f0Var = (f0) obj;
                l lVar2 = f0Var.a;
                j jVar3 = lVar2.a;
                objectOutput.writeInt(jVar3.a);
                objectOutput.writeByte(jVar3.b);
                objectOutput.writeByte(jVar3.c);
                lVar2.b.I(objectOutput);
                f0Var.b.F(objectOutput);
                f0Var.c.y(objectOutput);
                return;
            case 7:
                objectOutput.writeUTF(((d0) obj).a);
                return;
            case 8:
                ((c0) obj).F(objectOutput);
                return;
            case 9:
                u uVar = (u) obj;
                uVar.a.I(objectOutput);
                uVar.b.F(objectOutput);
                return;
            case 10:
                s sVar = (s) obj;
                l lVar3 = sVar.a;
                j jVar4 = lVar3.a;
                objectOutput.writeInt(jVar4.a);
                objectOutput.writeByte(jVar4.b);
                objectOutput.writeByte(jVar4.c);
                lVar3.b.I(objectOutput);
                sVar.b.F(objectOutput);
                return;
            case 11:
                objectOutput.writeInt(((y) obj).a);
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                a0 a0Var = (a0) obj;
                objectOutput.writeInt(a0Var.a);
                objectOutput.writeByte(a0Var.b);
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                q qVar = (q) obj;
                objectOutput.writeByte(qVar.a);
                objectOutput.writeByte(qVar.b);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                v vVar = (v) obj;
                objectOutput.writeInt(vVar.a);
                objectOutput.writeInt(vVar.b);
                objectOutput.writeInt(vVar.c);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    public w() {
    }
}
