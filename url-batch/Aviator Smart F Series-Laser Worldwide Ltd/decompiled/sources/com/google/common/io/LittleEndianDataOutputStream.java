package com.google.common.io;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Longs;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FilterOutputStream;
import java.io.OutputStream;

@ElementTypesAreNonnullByDefault
@Beta
@GwtIncompatible
/* loaded from: classes4.dex */
public final class LittleEndianDataOutputStream extends FilterOutputStream implements DataOutput {
    public LittleEndianDataOutputStream(OutputStream outputStream) {
        super(new DataOutputStream((OutputStream) Preconditions.checkNotNull(outputStream)));
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ((FilterOutputStream) this).out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.DataOutput
    public void write(byte[] bArr, int i8, int i9) {
        ((FilterOutputStream) this).out.write(bArr, i8, i9);
    }

    @Override // java.io.DataOutput
    public void writeBoolean(boolean z7) {
        ((DataOutputStream) ((FilterOutputStream) this).out).writeBoolean(z7);
    }

    @Override // java.io.DataOutput
    public void writeByte(int i8) {
        ((DataOutputStream) ((FilterOutputStream) this).out).writeByte(i8);
    }

    @Override // java.io.DataOutput
    @Deprecated
    public void writeBytes(String str) {
        ((DataOutputStream) ((FilterOutputStream) this).out).writeBytes(str);
    }

    @Override // java.io.DataOutput
    public void writeChar(int i8) {
        writeShort(i8);
    }

    @Override // java.io.DataOutput
    public void writeChars(String str) {
        for (int i8 = 0; i8 < str.length(); i8++) {
            writeChar(str.charAt(i8));
        }
    }

    @Override // java.io.DataOutput
    public void writeDouble(double d8) {
        writeLong(Double.doubleToLongBits(d8));
    }

    @Override // java.io.DataOutput
    public void writeFloat(float f8) {
        writeInt(Float.floatToIntBits(f8));
    }

    @Override // java.io.DataOutput
    public void writeInt(int i8) {
        ((FilterOutputStream) this).out.write(i8 & 255);
        ((FilterOutputStream) this).out.write((i8 >> 8) & 255);
        ((FilterOutputStream) this).out.write((i8 >> 16) & 255);
        ((FilterOutputStream) this).out.write((i8 >> 24) & 255);
    }

    @Override // java.io.DataOutput
    public void writeLong(long j8) {
        byte[] byteArray = Longs.toByteArray(Long.reverseBytes(j8));
        write(byteArray, 0, byteArray.length);
    }

    @Override // java.io.DataOutput
    public void writeShort(int i8) {
        ((FilterOutputStream) this).out.write(i8 & 255);
        ((FilterOutputStream) this).out.write((i8 >> 8) & 255);
    }

    @Override // java.io.DataOutput
    public void writeUTF(String str) {
        ((DataOutputStream) ((FilterOutputStream) this).out).writeUTF(str);
    }
}
