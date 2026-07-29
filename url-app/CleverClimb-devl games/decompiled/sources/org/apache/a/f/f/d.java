package org.apache.a.f.f;

import com.umeng.commonsdk.proguard.ao;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: AbstractSessionOutputBuffer.java */
/* loaded from: classes2.dex */
public abstract class d implements org.apache.a.g.a, org.apache.a.g.g {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f9904a = {ao.k, 10};

    /* renamed from: b, reason: collision with root package name */
    private OutputStream f9905b;

    /* renamed from: c, reason: collision with root package name */
    private org.apache.a.k.a f9906c;

    /* renamed from: d, reason: collision with root package name */
    private String f9907d = "US-ASCII";
    private boolean e = true;
    private int f = 512;
    private k g;

    protected void a(OutputStream outputStream, int i, org.apache.a.i.d dVar) {
        if (outputStream == null) {
            throw new IllegalArgumentException("Input stream may not be null");
        }
        if (i <= 0) {
            throw new IllegalArgumentException("Buffer size may not be negative or zero");
        }
        if (dVar == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        this.f9905b = outputStream;
        this.f9906c = new org.apache.a.k.a(i);
        this.f9907d = org.apache.a.i.e.a(dVar);
        this.e = this.f9907d.equalsIgnoreCase("US-ASCII") || this.f9907d.equalsIgnoreCase("ASCII");
        this.f = dVar.a("http.connection.min-chunk-limit", 512);
        this.g = c();
    }

    protected k c() {
        return new k();
    }

    @Override // org.apache.a.g.a
    public int e() {
        return this.f9906c.d();
    }

    protected void d() throws IOException {
        int d2 = this.f9906c.d();
        if (d2 > 0) {
            this.f9905b.write(this.f9906c.e(), 0, d2);
            this.f9906c.a();
            this.g.a(d2);
        }
    }

    @Override // org.apache.a.g.g
    public void a() throws IOException {
        d();
        this.f9905b.flush();
    }

    @Override // org.apache.a.g.g
    public void a(byte[] bArr, int i, int i2) throws IOException {
        if (bArr == null) {
            return;
        }
        if (i2 > this.f || i2 > this.f9906c.c()) {
            d();
            this.f9905b.write(bArr, i, i2);
            this.g.a(i2);
        } else {
            if (i2 > this.f9906c.c() - this.f9906c.d()) {
                d();
            }
            this.f9906c.a(bArr, i, i2);
        }
    }

    public void a(byte[] bArr) throws IOException {
        if (bArr == null) {
            return;
        }
        a(bArr, 0, bArr.length);
    }

    @Override // org.apache.a.g.g
    public void a(int i) throws IOException {
        if (this.f9906c.g()) {
            d();
        }
        this.f9906c.a(i);
    }

    @Override // org.apache.a.g.g
    public void a(String str) throws IOException {
        if (str == null) {
            return;
        }
        if (str.length() > 0) {
            a(str.getBytes(this.f9907d));
        }
        a(f9904a);
    }

    @Override // org.apache.a.g.g
    public void a(org.apache.a.k.b bVar) throws IOException {
        if (bVar == null) {
            return;
        }
        if (this.e) {
            int i = 0;
            int c2 = bVar.c();
            while (c2 > 0) {
                int min = Math.min(this.f9906c.c() - this.f9906c.d(), c2);
                if (min > 0) {
                    this.f9906c.a(bVar, i, min);
                }
                if (this.f9906c.g()) {
                    d();
                }
                i += min;
                c2 -= min;
            }
        } else {
            a(bVar.toString().getBytes(this.f9907d));
        }
        a(f9904a);
    }

    @Override // org.apache.a.g.g
    public org.apache.a.g.e b() {
        return this.g;
    }
}
