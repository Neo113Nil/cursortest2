package org.apache.a.f.b;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.a.z;

/* compiled from: EntityEnclosingRequestWrapper.java */
/* loaded from: classes2.dex */
public class p extends r implements org.apache.a.k {

    /* renamed from: a, reason: collision with root package name */
    private org.apache.a.j f9781a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f9782b;

    public p(org.apache.a.k kVar) throws z {
        super(kVar);
        a(kVar.getEntity());
    }

    @Override // org.apache.a.k
    public org.apache.a.j getEntity() {
        return this.f9781a;
    }

    public void a(org.apache.a.j jVar) {
        this.f9781a = jVar != null ? new a(jVar) : null;
        this.f9782b = false;
    }

    @Override // org.apache.a.k
    public boolean expectContinue() {
        org.apache.a.d firstHeader = getFirstHeader("Expect");
        return firstHeader != null && "100-continue".equalsIgnoreCase(firstHeader.d());
    }

    @Override // org.apache.a.f.b.r
    public boolean a() {
        return this.f9781a == null || this.f9781a.a() || !this.f9782b;
    }

    /* compiled from: EntityEnclosingRequestWrapper.java */
    class a extends org.apache.a.e.f {
        a(org.apache.a.j jVar) {
            super(jVar);
        }

        @Override // org.apache.a.e.f, org.apache.a.j
        @Deprecated
        public void h() throws IOException {
            p.this.f9782b = true;
            super.h();
        }

        @Override // org.apache.a.e.f, org.apache.a.j
        public InputStream f() throws IOException {
            p.this.f9782b = true;
            return super.f();
        }

        @Override // org.apache.a.e.f, org.apache.a.j
        public void a(OutputStream outputStream) throws IOException {
            p.this.f9782b = true;
            super.a(outputStream);
        }
    }
}
