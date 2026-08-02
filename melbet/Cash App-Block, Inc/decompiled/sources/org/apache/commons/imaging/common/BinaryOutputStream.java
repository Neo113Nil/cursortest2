package org.apache.commons.imaging.common;

import java.io.OutputStream;
import java.nio.ByteOrder;

/* loaded from: classes9.dex */
public class BinaryOutputStream extends OutputStream {
    private ByteOrder byteOrder;
    private int count;
    private final OutputStream os;

    public BinaryOutputStream(OutputStream outputStream, ByteOrder byteOrder) {
        ByteOrder byteOrder2 = ByteOrder.BIG_ENDIAN;
        this.byteOrder = byteOrder;
        this.os = outputStream;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.os.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        this.os.flush();
    }

    public int getByteCount() {
        return this.count;
    }

    public ByteOrder getByteOrder() {
        return this.byteOrder;
    }

    public void setByteOrder(ByteOrder byteOrder) {
        this.byteOrder = byteOrder;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.os.write(bArr, 0, bArr.length);
        this.count += bArr.length;
    }

    public final void write2Bytes(int i) {
        if (this.byteOrder == ByteOrder.BIG_ENDIAN) {
            write((i >> 8) & 255);
            write(i & 255);
        } else {
            write(i & 255);
            write((i >> 8) & 255);
        }
    }

    public final void write3Bytes(int i) {
        if (this.byteOrder == ByteOrder.BIG_ENDIAN) {
            write((i >> 16) & 255);
            write((i >> 8) & 255);
            write(i & 255);
        } else {
            write(i & 255);
            write((i >> 8) & 255);
            write((i >> 16) & 255);
        }
    }

    public final void write4Bytes(int i) {
        if (this.byteOrder == ByteOrder.BIG_ENDIAN) {
            write((i >> 24) & 255);
            write((i >> 16) & 255);
            write((i >> 8) & 255);
            write(i & 255);
            return;
        }
        write(i & 255);
        write((i >> 8) & 255);
        write((i >> 16) & 255);
        write((i >> 24) & 255);
    }

    public BinaryOutputStream(OutputStream outputStream) {
        this.byteOrder = ByteOrder.BIG_ENDIAN;
        this.os = outputStream;
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        this.os.write(i);
        this.count++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.os.write(bArr, i, i2);
        this.count += i2;
    }
}
