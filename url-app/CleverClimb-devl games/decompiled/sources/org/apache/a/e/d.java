package org.apache.a.e;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: ByteArrayEntity.java */
/* loaded from: classes2.dex */
public class d extends a implements Cloneable {

    /* renamed from: d, reason: collision with root package name */
    protected final byte[] f9707d;

    @Override // org.apache.a.j
    public boolean a() {
        return true;
    }

    @Override // org.apache.a.j
    public boolean g() {
        return false;
    }

    public d(byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("Source byte array may not be null");
        }
        this.f9707d = bArr;
    }

    @Override // org.apache.a.j
    public long c() {
        return this.f9707d.length;
    }

    @Override // org.apache.a.j
    public InputStream f() {
        return new ByteArrayInputStream(this.f9707d);
    }

    @Override // org.apache.a.j
    public void a(OutputStream outputStream) throws IOException {
        if (outputStream == null) {
            throw new IllegalArgumentException("Output stream may not be null");
        }
        outputStream.write(this.f9707d);
        outputStream.flush();
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
