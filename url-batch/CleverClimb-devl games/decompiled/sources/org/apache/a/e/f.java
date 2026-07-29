package org.apache.a.e;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.a.j;

/* compiled from: HttpEntityWrapper.java */
/* loaded from: classes2.dex */
public class f implements j {

    /* renamed from: c, reason: collision with root package name */
    protected j f9708c;

    public f(j jVar) {
        if (jVar == null) {
            throw new IllegalArgumentException("wrapped entity must not be null");
        }
        this.f9708c = jVar;
    }

    @Override // org.apache.a.j
    public boolean a() {
        return this.f9708c.a();
    }

    @Override // org.apache.a.j
    public boolean b() {
        return this.f9708c.b();
    }

    @Override // org.apache.a.j
    public long c() {
        return this.f9708c.c();
    }

    @Override // org.apache.a.j
    public org.apache.a.d d() {
        return this.f9708c.d();
    }

    @Override // org.apache.a.j
    public org.apache.a.d e() {
        return this.f9708c.e();
    }

    @Override // org.apache.a.j
    public InputStream f() throws IOException {
        return this.f9708c.f();
    }

    @Override // org.apache.a.j
    public void a(OutputStream outputStream) throws IOException {
        this.f9708c.a(outputStream);
    }

    @Override // org.apache.a.j
    public boolean g() {
        return this.f9708c.g();
    }

    @Override // org.apache.a.j
    public void h() throws IOException {
        this.f9708c.h();
    }
}
