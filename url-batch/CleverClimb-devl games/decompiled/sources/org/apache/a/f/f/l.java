package org.apache.a.f.f;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: IdentityInputStream.java */
/* loaded from: classes2.dex */
public class l extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    private final org.apache.a.g.f f9927a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f9928b = false;

    public l(org.apache.a.g.f fVar) {
        if (fVar == null) {
            throw new IllegalArgumentException("Session input buffer may not be null");
        }
        this.f9927a = fVar;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        if (this.f9927a instanceof org.apache.a.g.a) {
            return ((org.apache.a.g.a) this.f9927a).e();
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f9928b = true;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.f9928b) {
            return -1;
        }
        return this.f9927a.a();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f9928b) {
            return -1;
        }
        return this.f9927a.a(bArr, i, i2);
    }
}
