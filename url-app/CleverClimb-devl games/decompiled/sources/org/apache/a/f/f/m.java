package org.apache.a.f.f;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: IdentityOutputStream.java */
/* loaded from: classes2.dex */
public class m extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    private final org.apache.a.g.g f9929a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f9930b = false;

    public m(org.apache.a.g.g gVar) {
        if (gVar == null) {
            throw new IllegalArgumentException("Session output buffer may not be null");
        }
        this.f9929a = gVar;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f9930b) {
            return;
        }
        this.f9930b = true;
        this.f9929a.a();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.f9929a.a();
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (this.f9930b) {
            throw new IOException("Attempted write to closed stream.");
        }
        this.f9929a.a(bArr, i, i2);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        if (this.f9930b) {
            throw new IOException("Attempted write to closed stream.");
        }
        this.f9929a.a(i);
    }
}
