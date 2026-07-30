package com.yanzhenjie.kalle.util;

import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes4.dex */
public class b extends OutputStream {
    private final AtomicLong mLength = new AtomicLong(0);

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
    }

    public long getLength() {
        return this.mLength.get();
    }

    public void write(long j8) {
        this.mLength.addAndGet(j8);
    }

    @Override // java.io.OutputStream
    public void write(int i8) {
        this.mLength.addAndGet(1L);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.mLength.addAndGet(bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i8, int i9) {
        this.mLength.addAndGet(i9);
    }
}
