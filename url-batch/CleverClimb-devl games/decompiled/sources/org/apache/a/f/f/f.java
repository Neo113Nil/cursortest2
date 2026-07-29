package org.apache.a.f.f;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: ChunkedOutputStream.java */
/* loaded from: classes2.dex */
public class f extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    private final org.apache.a.g.g f9912a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f9913b;

    /* renamed from: c, reason: collision with root package name */
    private int f9914c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f9915d;
    private boolean e;

    public f(org.apache.a.g.g gVar, int i) throws IOException {
        this.f9914c = 0;
        this.f9915d = false;
        this.e = false;
        this.f9913b = new byte[i];
        this.f9912a = gVar;
    }

    public f(org.apache.a.g.g gVar) throws IOException {
        this(gVar, 2048);
    }

    protected void a() throws IOException {
        if (this.f9914c > 0) {
            this.f9912a.a(Integer.toHexString(this.f9914c));
            this.f9912a.a(this.f9913b, 0, this.f9914c);
            this.f9912a.a("");
            this.f9914c = 0;
        }
    }

    protected void a(byte[] bArr, int i, int i2) throws IOException {
        this.f9912a.a(Integer.toHexString(this.f9914c + i2));
        this.f9912a.a(this.f9913b, 0, this.f9914c);
        this.f9912a.a(bArr, i, i2);
        this.f9912a.a("");
        this.f9914c = 0;
    }

    protected void b() throws IOException {
        this.f9912a.a("0");
        this.f9912a.a("");
    }

    public void c() throws IOException {
        if (this.f9915d) {
            return;
        }
        a();
        b();
        this.f9915d = true;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        if (this.e) {
            throw new IOException("Attempted write to closed stream.");
        }
        this.f9913b[this.f9914c] = (byte) i;
        this.f9914c++;
        if (this.f9914c == this.f9913b.length) {
            a();
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (this.e) {
            throw new IOException("Attempted write to closed stream.");
        }
        if (i2 >= this.f9913b.length - this.f9914c) {
            a(bArr, i, i2);
        } else {
            System.arraycopy(bArr, i, this.f9913b, this.f9914c, i2);
            this.f9914c += i2;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        a();
        this.f9912a.a();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.e) {
            return;
        }
        this.e = true;
        c();
        this.f9912a.a();
    }
}
