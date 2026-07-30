package com.google.common.io;

import com.google.common.annotations.GwtIncompatible;
import java.io.DataOutput;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes4.dex */
public interface ByteArrayDataOutput extends DataOutput {
    byte[] toByteArray();

    @Override // java.io.DataOutput
    void write(int i8);

    @Override // java.io.DataOutput
    void write(byte[] bArr);

    @Override // java.io.DataOutput
    void write(byte[] bArr, int i8, int i9);

    @Override // java.io.DataOutput
    void writeBoolean(boolean z7);

    @Override // java.io.DataOutput
    void writeByte(int i8);

    @Override // java.io.DataOutput
    @Deprecated
    void writeBytes(String str);

    @Override // java.io.DataOutput
    void writeChar(int i8);

    @Override // java.io.DataOutput
    void writeChars(String str);

    @Override // java.io.DataOutput
    void writeDouble(double d8);

    @Override // java.io.DataOutput
    void writeFloat(float f8);

    @Override // java.io.DataOutput
    void writeInt(int i8);

    @Override // java.io.DataOutput
    void writeLong(long j8);

    @Override // java.io.DataOutput
    void writeShort(int i8);

    @Override // java.io.DataOutput
    void writeUTF(String str);
}
