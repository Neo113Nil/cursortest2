package org.apache.a.e;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.a.j;

/* compiled from: BufferedHttpEntity.java */
/* loaded from: classes2.dex */
public class c extends f {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f9706a;

    @Override // org.apache.a.e.f, org.apache.a.j
    public boolean a() {
        return true;
    }

    public c(j jVar) throws IOException {
        super(jVar);
        if (!jVar.a() || jVar.c() < 0) {
            this.f9706a = org.apache.a.k.d.b(jVar);
        } else {
            this.f9706a = null;
        }
    }

    @Override // org.apache.a.e.f, org.apache.a.j
    public long c() {
        if (this.f9706a != null) {
            return this.f9706a.length;
        }
        return this.f9708c.c();
    }

    @Override // org.apache.a.e.f, org.apache.a.j
    public InputStream f() throws IOException {
        if (this.f9706a != null) {
            return new ByteArrayInputStream(this.f9706a);
        }
        return this.f9708c.f();
    }

    @Override // org.apache.a.e.f, org.apache.a.j
    public boolean b() {
        return this.f9706a == null && this.f9708c.b();
    }

    @Override // org.apache.a.e.f, org.apache.a.j
    public void a(OutputStream outputStream) throws IOException {
        if (outputStream == null) {
            throw new IllegalArgumentException("Output stream may not be null");
        }
        if (this.f9706a != null) {
            outputStream.write(this.f9706a);
        } else {
            this.f9708c.a(outputStream);
        }
    }

    @Override // org.apache.a.e.f, org.apache.a.j
    public boolean g() {
        return this.f9706a == null && this.f9708c.g();
    }
}
