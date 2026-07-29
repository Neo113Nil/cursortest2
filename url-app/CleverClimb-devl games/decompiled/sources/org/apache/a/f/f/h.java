package org.apache.a.f.f;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: ContentLengthOutputStream.java */
/* loaded from: classes2.dex */
public class h extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    private final org.apache.a.g.g f9920a;

    /* renamed from: b, reason: collision with root package name */
    private final long f9921b;

    /* renamed from: c, reason: collision with root package name */
    private long f9922c = 0;

    /* renamed from: d, reason: collision with root package name */
    private boolean f9923d = false;

    public h(org.apache.a.g.g gVar, long j) {
        if (gVar == null) {
            throw new IllegalArgumentException("Session output buffer may not be null");
        }
        if (j < 0) {
            throw new IllegalArgumentException("Content length may not be negative");
        }
        this.f9920a = gVar;
        this.f9921b = j;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f9923d) {
            return;
        }
        this.f9923d = true;
        this.f9920a.a();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.f9920a.a();
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (this.f9923d) {
            throw new IOException("Attempted write to closed stream.");
        }
        if (this.f9922c < this.f9921b) {
            long j = this.f9921b - this.f9922c;
            if (i2 > j) {
                i2 = (int) j;
            }
            this.f9920a.a(bArr, i, i2);
            this.f9922c += i2;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        if (this.f9923d) {
            throw new IOException("Attempted write to closed stream.");
        }
        if (this.f9922c < this.f9921b) {
            this.f9920a.a(i);
            this.f9922c++;
        }
    }
}
