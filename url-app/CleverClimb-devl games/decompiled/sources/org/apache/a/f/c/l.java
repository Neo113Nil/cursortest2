package org.apache.a.f.c;

import java.io.IOException;

/* compiled from: LoggingSessionOutputBuffer.java */
/* loaded from: classes2.dex */
public class l implements org.apache.a.g.g {

    /* renamed from: a, reason: collision with root package name */
    private final org.apache.a.g.g f9845a;

    /* renamed from: b, reason: collision with root package name */
    private final o f9846b;

    /* renamed from: c, reason: collision with root package name */
    private final String f9847c;

    public l(org.apache.a.g.g gVar, o oVar, String str) {
        this.f9845a = gVar;
        this.f9846b = oVar;
        this.f9847c = str == null ? "ASCII" : str;
    }

    @Override // org.apache.a.g.g
    public void a(byte[] bArr, int i, int i2) throws IOException {
        this.f9845a.a(bArr, i, i2);
        if (this.f9846b.a()) {
            this.f9846b.a(bArr, i, i2);
        }
    }

    @Override // org.apache.a.g.g
    public void a(int i) throws IOException {
        this.f9845a.a(i);
        if (this.f9846b.a()) {
            this.f9846b.a(i);
        }
    }

    @Override // org.apache.a.g.g
    public void a() throws IOException {
        this.f9845a.a();
    }

    @Override // org.apache.a.g.g
    public void a(org.apache.a.k.b bVar) throws IOException {
        this.f9845a.a(bVar);
        if (this.f9846b.a()) {
            this.f9846b.a((new String(bVar.b(), 0, bVar.c()) + "\r\n").getBytes(this.f9847c));
        }
    }

    @Override // org.apache.a.g.g
    public void a(String str) throws IOException {
        this.f9845a.a(str);
        if (this.f9846b.a()) {
            this.f9846b.a((str + "\r\n").getBytes(this.f9847c));
        }
    }

    @Override // org.apache.a.g.g
    public org.apache.a.g.e b() {
        return this.f9845a.b();
    }
}
