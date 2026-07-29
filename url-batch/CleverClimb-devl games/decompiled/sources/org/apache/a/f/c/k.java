package org.apache.a.f.c;

import java.io.IOException;

/* compiled from: LoggingSessionInputBuffer.java */
/* loaded from: classes2.dex */
public class k implements org.apache.a.g.b, org.apache.a.g.f {

    /* renamed from: a, reason: collision with root package name */
    private final org.apache.a.g.f f9841a;

    /* renamed from: b, reason: collision with root package name */
    private final org.apache.a.g.b f9842b;

    /* renamed from: c, reason: collision with root package name */
    private final o f9843c;

    /* renamed from: d, reason: collision with root package name */
    private final String f9844d;

    public k(org.apache.a.g.f fVar, o oVar, String str) {
        this.f9841a = fVar;
        this.f9842b = fVar instanceof org.apache.a.g.b ? (org.apache.a.g.b) fVar : null;
        this.f9843c = oVar;
        this.f9844d = str == null ? "ASCII" : str;
    }

    @Override // org.apache.a.g.f
    public boolean a(int i) throws IOException {
        return this.f9841a.a(i);
    }

    @Override // org.apache.a.g.f
    public int a(byte[] bArr, int i, int i2) throws IOException {
        int a2 = this.f9841a.a(bArr, i, i2);
        if (this.f9843c.a() && a2 > 0) {
            this.f9843c.b(bArr, i, a2);
        }
        return a2;
    }

    @Override // org.apache.a.g.f
    public int a() throws IOException {
        int a2 = this.f9841a.a();
        if (this.f9843c.a() && a2 != -1) {
            this.f9843c.b(a2);
        }
        return a2;
    }

    @Override // org.apache.a.g.f
    public int a(org.apache.a.k.b bVar) throws IOException {
        int a2 = this.f9841a.a(bVar);
        if (this.f9843c.a() && a2 >= 0) {
            this.f9843c.b((new String(bVar.b(), bVar.c() - a2, a2) + "\r\n").getBytes(this.f9844d));
        }
        return a2;
    }

    @Override // org.apache.a.g.f
    public org.apache.a.g.e b() {
        return this.f9841a.b();
    }

    @Override // org.apache.a.g.b
    public boolean c() {
        if (this.f9842b != null) {
            return this.f9842b.c();
        }
        return false;
    }
}
