package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
final class v6 extends FilterInputStream {

    /* renamed from: f, reason: collision with root package name */
    private final long f13136f;

    /* renamed from: g, reason: collision with root package name */
    private long f13137g;

    v6(InputStream inputStream, long j7) {
        super(inputStream);
        this.f13136f = j7;
    }

    final long b() {
        return this.f13136f - this.f13137g;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = super.read();
        if (read != -1) {
            this.f13137g++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i7, int i8) {
        int read = super.read(bArr, i7, i8);
        if (read != -1) {
            this.f13137g += read;
        }
        return read;
    }
}
