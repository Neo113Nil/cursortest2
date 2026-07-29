package org.apache.a.c;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: EofSensorInputStream.java */
/* loaded from: classes2.dex */
public class j extends InputStream implements i {

    /* renamed from: a, reason: collision with root package name */
    protected InputStream f9693a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f9694b;

    /* renamed from: c, reason: collision with root package name */
    private final k f9695c;

    public j(InputStream inputStream, k kVar) {
        if (inputStream == null) {
            throw new IllegalArgumentException("Wrapped stream may not be null.");
        }
        this.f9693a = inputStream;
        this.f9694b = false;
        this.f9695c = kVar;
    }

    protected boolean a() throws IOException {
        if (this.f9694b) {
            throw new IOException("Attempted read on closed stream.");
        }
        return this.f9693a != null;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (!a()) {
            return -1;
        }
        try {
            int read = this.f9693a.read();
            a(read);
            return read;
        } catch (IOException e) {
            c();
            throw e;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (!a()) {
            return -1;
        }
        try {
            int read = this.f9693a.read(bArr, i, i2);
            a(read);
            return read;
        } catch (IOException e) {
            c();
            throw e;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        if (!a()) {
            return -1;
        }
        try {
            int read = this.f9693a.read(bArr);
            a(read);
            return read;
        } catch (IOException e) {
            c();
            throw e;
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        if (!a()) {
            return 0;
        }
        try {
            return this.f9693a.available();
        } catch (IOException e) {
            c();
            throw e;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f9694b = true;
        b();
    }

    protected void a(int i) throws IOException {
        if (this.f9693a == null || i >= 0) {
            return;
        }
        try {
            if (this.f9695c != null ? this.f9695c.a(this.f9693a) : true) {
                this.f9693a.close();
            }
        } finally {
            this.f9693a = null;
        }
    }

    protected void b() throws IOException {
        if (this.f9693a != null) {
            try {
                if (this.f9695c != null ? this.f9695c.b(this.f9693a) : true) {
                    this.f9693a.close();
                }
            } finally {
                this.f9693a = null;
            }
        }
    }

    protected void c() throws IOException {
        if (this.f9693a != null) {
            try {
                if (this.f9695c != null ? this.f9695c.c(this.f9693a) : true) {
                    this.f9693a.close();
                }
            } finally {
                this.f9693a = null;
            }
        }
    }

    @Override // org.apache.a.c.i
    public void i() throws IOException {
        close();
    }

    @Override // org.apache.a.c.i
    public void j() throws IOException {
        this.f9694b = true;
        c();
    }
}
