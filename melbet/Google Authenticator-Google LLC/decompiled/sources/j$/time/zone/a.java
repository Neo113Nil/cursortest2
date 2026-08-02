package j$.time.zone;

import j$.time.c0;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import java.util.TimeZone;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class a implements Externalizable {
    private static final long serialVersionUID = -8885321777449118786L;
    public byte a;
    public Serializable b;

    public a(byte b, Serializable serializable) {
        this.a = b;
        this.b = serializable;
    }

    public static long a(ObjectInput objectInput) {
        if ((objectInput.readByte() & 255) == 255) {
            return objectInput.readLong();
        }
        return ((((r0 << 16) + ((objectInput.readByte() & 255) << 8)) + (objectInput.readByte() & 255)) * 900) - 4575744000L;
    }

    public static c0 b(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        return readByte == Byte.MAX_VALUE ? c0.C(objectInput.readInt()) : c0.C(readByte * 900);
    }

    public static void c(long j, ObjectOutput objectOutput) {
        if (j < -4575744000L || j >= 10413792000L || j % 900 != 0) {
            objectOutput.writeByte(255);
            objectOutput.writeLong(j);
        } else {
            int i = (int) ((j + 4575744000L) / 900);
            objectOutput.writeByte((i >>> 16) & 255);
            objectOutput.writeByte((i >>> 8) & 255);
            objectOutput.writeByte(i & 255);
        }
    }

    public static void d(c0 c0Var, ObjectOutput objectOutput) {
        int i = c0Var.a;
        int i2 = i % 900 == 0 ? i / 900 : 127;
        objectOutput.writeByte(i2);
        if (i2 == 127) {
            objectOutput.writeInt(i);
        }
    }

    private Object readResolve() {
        return this.b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        Serializable eVar;
        byte readByte = objectInput.readByte();
        this.a = readByte;
        if (readByte == 1) {
            int readInt = objectInput.readInt();
            long[] jArr = e.i;
            long[] jArr2 = readInt == 0 ? jArr : new long[readInt];
            for (int i = 0; i < readInt; i++) {
                jArr2[i] = a(objectInput);
            }
            int i2 = readInt + 1;
            c0[] c0VarArr = new c0[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                c0VarArr[i3] = b(objectInput);
            }
            int readInt2 = objectInput.readInt();
            if (readInt2 != 0) {
                jArr = new long[readInt2];
            }
            long[] jArr3 = jArr;
            for (int i4 = 0; i4 < readInt2; i4++) {
                jArr3[i4] = a(objectInput);
            }
            int i5 = readInt2 + 1;
            c0[] c0VarArr2 = new c0[i5];
            for (int i6 = 0; i6 < i5; i6++) {
                c0VarArr2[i6] = b(objectInput);
            }
            int readByte2 = objectInput.readByte();
            d[] dVarArr = readByte2 == 0 ? e.j : new d[readByte2];
            for (int i7 = 0; i7 < readByte2; i7++) {
                dVarArr[i7] = d.a(objectInput);
            }
            eVar = new e(jArr2, c0VarArr, jArr3, c0VarArr2, dVarArr);
        } else if (readByte == 2) {
            long a = a(objectInput);
            c0 b = b(objectInput);
            c0 b2 = b(objectInput);
            if (b.equals(b2)) {
                throw new IllegalArgumentException("Offsets must not be equal");
            }
            eVar = new b(a, b, b2);
        } else if (readByte == 3) {
            eVar = d.a(objectInput);
        } else {
            if (readByte != 100) {
                throw new StreamCorruptedException("Unknown serialized type");
            }
            eVar = new e(TimeZone.getTimeZone(objectInput.readUTF()));
        }
        this.b = eVar;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        byte b = this.a;
        Serializable serializable = this.b;
        objectOutput.writeByte(b);
        if (b != 1) {
            if (b == 2) {
                b bVar = (b) serializable;
                c(bVar.a, objectOutput);
                d(bVar.c, objectOutput);
                d(bVar.d, objectOutput);
                return;
            }
            if (b == 3) {
                ((d) serializable).writeExternal(objectOutput);
                return;
            } else {
                if (b != 100) {
                    throw new InvalidClassException("Unknown serialized type");
                }
                objectOutput.writeUTF(((e) serializable).g.getID());
                return;
            }
        }
        e eVar = (e) serializable;
        d[] dVarArr = eVar.f;
        long[] jArr = eVar.c;
        long[] jArr2 = eVar.a;
        objectOutput.writeInt(jArr2.length);
        for (long j : jArr2) {
            c(j, objectOutput);
        }
        for (c0 c0Var : eVar.b) {
            d(c0Var, objectOutput);
        }
        objectOutput.writeInt(jArr.length);
        for (long j2 : jArr) {
            c(j2, objectOutput);
        }
        for (c0 c0Var2 : eVar.e) {
            d(c0Var2, objectOutput);
        }
        objectOutput.writeByte(dVarArr.length);
        for (d dVar : dVarArr) {
            dVar.writeExternal(objectOutput);
        }
    }

    public a() {
    }
}
