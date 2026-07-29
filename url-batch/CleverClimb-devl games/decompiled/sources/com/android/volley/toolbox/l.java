package com.android.volley.toolbox;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* compiled from: PoolingByteArrayOutputStream.java */
/* loaded from: classes.dex */
public class l extends ByteArrayOutputStream {

    /* renamed from: a, reason: collision with root package name */
    private final b f2369a;

    public l(b bVar, int i) {
        this.f2369a = bVar;
        this.buf = this.f2369a.a(Math.max(i, 256));
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f2369a.a(this.buf);
        this.buf = null;
        super.close();
    }

    public void finalize() {
        this.f2369a.a(this.buf);
    }

    private void a(int i) {
        if (this.count + i <= this.buf.length) {
            return;
        }
        byte[] a2 = this.f2369a.a((this.count + i) * 2);
        System.arraycopy(this.buf, 0, a2, 0, this.count);
        this.f2369a.a(this.buf);
        this.buf = a2;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr, int i, int i2) {
        a(i2);
        super.write(bArr, i, i2);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(int i) {
        a(1);
        super.write(i);
    }
}
