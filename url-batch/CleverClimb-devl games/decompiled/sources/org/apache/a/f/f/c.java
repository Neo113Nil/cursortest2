package org.apache.a.f.f;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: AbstractSessionInputBuffer.java */
/* loaded from: classes2.dex */
public abstract class c implements org.apache.a.g.a, org.apache.a.g.f {

    /* renamed from: a, reason: collision with root package name */
    private InputStream f9900a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f9901b;

    /* renamed from: c, reason: collision with root package name */
    private int f9902c;

    /* renamed from: d, reason: collision with root package name */
    private int f9903d;
    private org.apache.a.k.a e = null;
    private String f = "US-ASCII";
    private boolean g = true;
    private int h = -1;
    private int i = 512;
    private k j;

    protected void a(InputStream inputStream, int i, org.apache.a.i.d dVar) {
        if (inputStream == null) {
            throw new IllegalArgumentException("Input stream may not be null");
        }
        if (i <= 0) {
            throw new IllegalArgumentException("Buffer size may not be negative or zero");
        }
        if (dVar == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        this.f9900a = inputStream;
        this.f9901b = new byte[i];
        this.f9902c = 0;
        this.f9903d = 0;
        this.e = new org.apache.a.k.a(i);
        this.f = org.apache.a.i.e.a(dVar);
        this.g = this.f.equalsIgnoreCase("US-ASCII") || this.f.equalsIgnoreCase("ASCII");
        this.h = dVar.a("http.connection.max-line-length", -1);
        this.i = dVar.a("http.connection.min-chunk-limit", 512);
        this.j = d();
    }

    protected k d() {
        return new k();
    }

    @Override // org.apache.a.g.a
    public int e() {
        return this.f9903d - this.f9902c;
    }

    protected int f() throws IOException {
        if (this.f9902c > 0) {
            int i = this.f9903d - this.f9902c;
            if (i > 0) {
                System.arraycopy(this.f9901b, this.f9902c, this.f9901b, 0, i);
            }
            this.f9902c = 0;
            this.f9903d = i;
        }
        int i2 = this.f9903d;
        int read = this.f9900a.read(this.f9901b, i2, this.f9901b.length - i2);
        if (read == -1) {
            return -1;
        }
        this.f9903d = i2 + read;
        this.j.a(read);
        return read;
    }

    protected boolean g() {
        return this.f9902c < this.f9903d;
    }

    @Override // org.apache.a.g.f
    public int a() throws IOException {
        while (!g()) {
            if (f() == -1) {
                return -1;
            }
        }
        byte[] bArr = this.f9901b;
        int i = this.f9902c;
        this.f9902c = i + 1;
        return bArr[i] & 255;
    }

    @Override // org.apache.a.g.f
    public int a(byte[] bArr, int i, int i2) throws IOException {
        if (bArr == null) {
            return 0;
        }
        if (g()) {
            int min = Math.min(i2, this.f9903d - this.f9902c);
            System.arraycopy(this.f9901b, this.f9902c, bArr, i, min);
            this.f9902c += min;
            return min;
        }
        if (i2 > this.i) {
            int read = this.f9900a.read(bArr, i, i2);
            if (read > 0) {
                this.j.a(read);
            }
            return read;
        }
        while (!g()) {
            if (f() == -1) {
                return -1;
            }
        }
        int min2 = Math.min(i2, this.f9903d - this.f9902c);
        System.arraycopy(this.f9901b, this.f9902c, bArr, i, min2);
        this.f9902c += min2;
        return min2;
    }

    private int c() {
        for (int i = this.f9902c; i < this.f9903d; i++) {
            if (this.f9901b[i] == 10) {
                return i;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x004a, code lost:
    
        if (r2 == (-1)) goto L13;
     */
    @Override // org.apache.a.g.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int a(org.apache.a.k.b bVar) throws IOException {
        if (bVar == null) {
            throw new IllegalArgumentException("Char array buffer may not be null");
        }
        boolean z = true;
        int i = 0;
        while (z) {
            int c2 = c();
            if (c2 != -1) {
                if (this.e.f()) {
                    return a(bVar, c2);
                }
                int i2 = c2 + 1;
                this.e.a(this.f9901b, this.f9902c, i2 - this.f9902c);
                this.f9902c = i2;
            } else {
                if (g()) {
                    this.e.a(this.f9901b, this.f9902c, this.f9903d - this.f9902c);
                    this.f9902c = this.f9903d;
                }
                i = f();
            }
            z = false;
            if (this.h > 0 && this.e.d() >= this.h) {
                throw new IOException("Maximum line length limit exceeded");
            }
        }
        if (i == -1 && this.e.f()) {
            return -1;
        }
        return b(bVar);
    }

    private int b(org.apache.a.k.b bVar) throws IOException {
        int d2 = this.e.d();
        if (d2 > 0) {
            if (this.e.b(d2 - 1) == 10) {
                d2--;
                this.e.c(d2);
            }
            if (d2 > 0 && this.e.b(d2 - 1) == 13) {
                this.e.c(d2 - 1);
            }
        }
        int d3 = this.e.d();
        if (this.g) {
            bVar.a(this.e, 0, d3);
        } else {
            String str = new String(this.e.e(), 0, d3, this.f);
            d3 = str.length();
            bVar.a(str);
        }
        this.e.a();
        return d3;
    }

    private int a(org.apache.a.k.b bVar, int i) throws IOException {
        int i2 = this.f9902c;
        this.f9902c = i + 1;
        if (i > 0 && this.f9901b[i - 1] == 13) {
            i--;
        }
        int i3 = i - i2;
        if (this.g) {
            bVar.a(this.f9901b, i2, i3);
            return i3;
        }
        String str = new String(this.f9901b, i2, i3, this.f);
        bVar.a(str);
        return str.length();
    }

    @Override // org.apache.a.g.f
    public org.apache.a.g.e b() {
        return this.j;
    }
}
