package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Enumeration;

/* loaded from: classes5.dex */
public class r {
    private OutputStream os;

    public r(OutputStream outputStream) {
        this.os = outputStream;
    }

    public static r create(OutputStream outputStream) {
        return new r(outputStream);
    }

    public void close() {
        this.os.close();
    }

    public void flush() {
        this.os.flush();
    }

    void flushInternal() {
    }

    e1 getDERSubStream() {
        return new e1(this.os);
    }

    r getDLSubStream() {
        return new s1(this.os);
    }

    final void write(int i8) {
        this.os.write(i8);
    }

    final void writeElements(Enumeration enumeration) {
        while (enumeration.hasMoreElements()) {
            writePrimitive(((f) enumeration.nextElement()).toASN1Primitive(), true);
        }
    }

    final void writeEncoded(boolean z7, int i8, byte b8) {
        if (z7) {
            write(i8);
        }
        writeLength(1);
        write(b8);
    }

    final void writeEncodedIndef(boolean z7, int i8, int i9, byte[] bArr) {
        writeTag(z7, i8, i9);
        write(128);
        write(bArr, 0, bArr.length);
        write(0);
        write(0);
    }

    final void writeLength(int i8) {
        if (i8 <= 127) {
            write((byte) i8);
            return;
        }
        int i9 = i8;
        int i10 = 1;
        while (true) {
            i9 >>>= 8;
            if (i9 == 0) {
                break;
            } else {
                i10++;
            }
        }
        write((byte) (i10 | 128));
        for (int i11 = (i10 - 1) * 8; i11 >= 0; i11 -= 8) {
            write((byte) (i8 >> i11));
        }
    }

    public void writeObject(f fVar) {
        if (fVar == null) {
            throw new IOException("null object detected");
        }
        writePrimitive(fVar.toASN1Primitive(), true);
        flushInternal();
    }

    void writePrimitive(s sVar, boolean z7) {
        sVar.encode(this, z7);
    }

    final void writeTag(boolean z7, int i8, int i9) {
        if (z7) {
            if (i9 < 31) {
                write(i8 | i9);
                return;
            }
            write(31 | i8);
            if (i9 < 128) {
                write(i9);
                return;
            }
            byte[] bArr = new byte[5];
            int i10 = 4;
            bArr[4] = (byte) (i9 & 127);
            do {
                i9 >>= 7;
                i10--;
                bArr[i10] = (byte) ((i9 & 127) | 128);
            } while (i9 > 127);
            write(bArr, i10, 5 - i10);
        }
    }

    public static r create(OutputStream outputStream, String str) {
        return str.equals("DER") ? new e1(outputStream) : str.equals("DL") ? new s1(outputStream) : new r(outputStream);
    }

    final void write(byte[] bArr, int i8, int i9) {
        this.os.write(bArr, i8, i9);
    }

    final void writeElements(f[] fVarArr) {
        for (f fVar : fVarArr) {
            writePrimitive(fVar.toASN1Primitive(), true);
        }
    }

    final void writeEncoded(boolean z7, int i8, byte b8, byte[] bArr) {
        if (z7) {
            write(i8);
        }
        writeLength(bArr.length + 1);
        write(b8);
        write(bArr, 0, bArr.length);
    }

    final void writeEncodedIndef(boolean z7, int i8, Enumeration enumeration) {
        if (z7) {
            write(i8);
        }
        write(128);
        writeElements(enumeration);
        write(0);
        write(0);
    }

    public void writeObject(s sVar) {
        if (sVar == null) {
            throw new IOException("null object detected");
        }
        writePrimitive(sVar, true);
        flushInternal();
    }

    final void writeEncoded(boolean z7, int i8, byte b8, byte[] bArr, int i9, int i10, byte b9) {
        if (z7) {
            write(i8);
        }
        writeLength(i10 + 2);
        write(b8);
        write(bArr, i9, i10);
        write(b9);
    }

    final void writeEncodedIndef(boolean z7, int i8, f[] fVarArr) {
        if (z7) {
            write(i8);
        }
        write(128);
        writeElements(fVarArr);
        write(0);
        write(0);
    }

    final void writeEncoded(boolean z7, int i8, int i9, byte[] bArr) {
        writeTag(z7, i8, i9);
        writeLength(bArr.length);
        write(bArr, 0, bArr.length);
    }

    final void writeEncoded(boolean z7, int i8, byte[] bArr) {
        if (z7) {
            write(i8);
        }
        writeLength(bArr.length);
        write(bArr, 0, bArr.length);
    }

    final void writeEncoded(boolean z7, int i8, byte[] bArr, int i9, int i10) {
        if (z7) {
            write(i8);
        }
        writeLength(i10);
        write(bArr, i9, i10);
    }
}
