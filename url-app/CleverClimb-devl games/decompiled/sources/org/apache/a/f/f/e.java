package org.apache.a.f.f;

import java.io.IOException;
import java.io.InputStream;
import org.apache.a.af;
import org.apache.a.v;

/* compiled from: ChunkedInputStream.java */
/* loaded from: classes2.dex */
public class e extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    private final org.apache.a.g.f f9908a;

    /* renamed from: b, reason: collision with root package name */
    private final org.apache.a.k.b f9909b;

    /* renamed from: c, reason: collision with root package name */
    private int f9910c;

    /* renamed from: d, reason: collision with root package name */
    private int f9911d;
    private int e;
    private boolean f = false;
    private boolean g = false;
    private org.apache.a.d[] h = new org.apache.a.d[0];

    public e(org.apache.a.g.f fVar) {
        if (fVar == null) {
            throw new IllegalArgumentException("Session input buffer may not be null");
        }
        this.f9908a = fVar;
        this.e = 0;
        this.f9909b = new org.apache.a.k.b(16);
        this.f9910c = 1;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        if (this.f9908a instanceof org.apache.a.g.a) {
            return Math.min(((org.apache.a.g.a) this.f9908a).e(), this.f9911d - this.e);
        }
        return 0;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.g) {
            throw new IOException("Attempted read from closed stream.");
        }
        if (this.f) {
            return -1;
        }
        if (this.f9910c != 2) {
            a();
            if (this.f) {
                return -1;
            }
        }
        int a2 = this.f9908a.a();
        if (a2 != -1) {
            this.e++;
            if (this.e >= this.f9911d) {
                this.f9910c = 3;
            }
        }
        return a2;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.g) {
            throw new IOException("Attempted read from closed stream.");
        }
        if (this.f) {
            return -1;
        }
        if (this.f9910c != 2) {
            a();
            if (this.f) {
                return -1;
            }
        }
        int a2 = this.f9908a.a(bArr, i, Math.min(i2, this.f9911d - this.e));
        if (a2 != -1) {
            this.e += a2;
            if (this.e >= this.f9911d) {
                this.f9910c = 3;
            }
            return a2;
        }
        this.f = true;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Truncated chunk ( expected size: ");
        stringBuffer.append(this.f9911d);
        stringBuffer.append("; actual size: ");
        stringBuffer.append(this.e);
        stringBuffer.append(")");
        throw new af(stringBuffer.toString());
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    private void a() throws IOException {
        this.f9911d = b();
        if (this.f9911d < 0) {
            throw new v("Negative chunk size");
        }
        this.f9910c = 2;
        this.e = 0;
        if (this.f9911d == 0) {
            this.f = true;
            c();
        }
    }

    private int b() throws IOException {
        int i = this.f9910c;
        if (i != 1) {
            if (i == 3) {
                this.f9909b.a();
                if (this.f9908a.a(this.f9909b) == -1) {
                    return 0;
                }
                if (!this.f9909b.d()) {
                    throw new v("Unexpected content at the end of chunk");
                }
                this.f9910c = 1;
            } else {
                throw new IllegalStateException("Inconsistent codec state");
            }
        }
        this.f9909b.a();
        if (this.f9908a.a(this.f9909b) == -1) {
            return 0;
        }
        int c2 = this.f9909b.c(59);
        if (c2 < 0) {
            c2 = this.f9909b.c();
        }
        try {
            return Integer.parseInt(this.f9909b.b(0, c2), 16);
        } catch (NumberFormatException unused) {
            throw new v("Bad chunk header");
        }
    }

    private void c() throws IOException {
        try {
            this.h = a.a(this.f9908a, -1, -1, null);
        } catch (org.apache.a.l e) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Invalid footer: ");
            stringBuffer.append(e.getMessage());
            v vVar = new v(stringBuffer.toString());
            org.apache.a.k.e.a(vVar, e);
            throw vVar;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.g) {
            return;
        }
        try {
            if (!this.f) {
                do {
                } while (read(new byte[2048]) >= 0);
            }
        } finally {
            this.f = true;
            this.g = true;
        }
    }
}
