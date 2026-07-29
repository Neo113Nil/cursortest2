package org.apache.a.e;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: BasicHttpEntity.java */
/* loaded from: classes2.dex */
public class b extends a {

    /* renamed from: d, reason: collision with root package name */
    private InputStream f9705d;
    private long e = -1;

    @Override // org.apache.a.j
    public boolean a() {
        return false;
    }

    @Override // org.apache.a.j
    public long c() {
        return this.e;
    }

    @Override // org.apache.a.j
    public InputStream f() throws IllegalStateException {
        if (this.f9705d == null) {
            throw new IllegalStateException("Content has not been provided");
        }
        return this.f9705d;
    }

    public void a(long j) {
        this.e = j;
    }

    public void a(InputStream inputStream) {
        this.f9705d = inputStream;
    }

    @Override // org.apache.a.j
    public void a(OutputStream outputStream) throws IOException {
        if (outputStream == null) {
            throw new IllegalArgumentException("Output stream may not be null");
        }
        InputStream f = f();
        try {
            byte[] bArr = new byte[2048];
            while (true) {
                int read = f.read(bArr);
                if (read == -1) {
                    return;
                } else {
                    outputStream.write(bArr, 0, read);
                }
            }
        } finally {
            f.close();
        }
    }

    @Override // org.apache.a.j
    public boolean g() {
        return this.f9705d != null;
    }

    @Override // org.apache.a.e.a, org.apache.a.j
    public void h() throws IOException {
        if (this.f9705d != null) {
            this.f9705d.close();
        }
    }
}
