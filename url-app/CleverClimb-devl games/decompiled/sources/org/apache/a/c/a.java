package org.apache.a.c;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: BasicManagedEntity.java */
/* loaded from: classes2.dex */
public class a extends org.apache.a.e.f implements i, k {

    /* renamed from: a, reason: collision with root package name */
    protected n f9658a;

    /* renamed from: b, reason: collision with root package name */
    protected final boolean f9659b;

    @Override // org.apache.a.e.f, org.apache.a.j
    public boolean a() {
        return false;
    }

    public a(org.apache.a.j jVar, n nVar, boolean z) {
        super(jVar);
        if (nVar == null) {
            throw new IllegalArgumentException("Connection may not be null.");
        }
        this.f9658a = nVar;
        this.f9659b = z;
    }

    @Override // org.apache.a.e.f, org.apache.a.j
    public InputStream f() throws IOException {
        return new j(this.f9708c.f(), this);
    }

    private void l() throws IOException {
        if (this.f9658a == null) {
            return;
        }
        try {
            if (this.f9659b) {
                org.apache.a.k.d.a(this.f9708c);
                this.f9658a.n();
            }
        } finally {
            k();
        }
    }

    @Override // org.apache.a.e.f, org.apache.a.j
    @Deprecated
    public void h() throws IOException {
        l();
    }

    @Override // org.apache.a.e.f, org.apache.a.j
    public void a(OutputStream outputStream) throws IOException {
        super.a(outputStream);
        l();
    }

    @Override // org.apache.a.c.i
    public void i() throws IOException {
        l();
    }

    @Override // org.apache.a.c.i
    public void j() throws IOException {
        if (this.f9658a != null) {
            try {
                this.f9658a.j();
            } finally {
                this.f9658a = null;
            }
        }
    }

    @Override // org.apache.a.c.k
    public boolean a(InputStream inputStream) throws IOException {
        try {
            if (this.f9659b && this.f9658a != null) {
                inputStream.close();
                this.f9658a.n();
            }
            k();
            return false;
        } catch (Throwable th) {
            k();
            throw th;
        }
    }

    @Override // org.apache.a.c.k
    public boolean b(InputStream inputStream) throws IOException {
        try {
            if (this.f9659b && this.f9658a != null) {
                inputStream.close();
                this.f9658a.n();
            }
            k();
            return false;
        } catch (Throwable th) {
            k();
            throw th;
        }
    }

    @Override // org.apache.a.c.k
    public boolean c(InputStream inputStream) throws IOException {
        if (this.f9658a == null) {
            return false;
        }
        this.f9658a.j();
        return false;
    }

    protected void k() throws IOException {
        if (this.f9658a != null) {
            try {
                this.f9658a.i();
            } finally {
                this.f9658a = null;
            }
        }
    }
}
