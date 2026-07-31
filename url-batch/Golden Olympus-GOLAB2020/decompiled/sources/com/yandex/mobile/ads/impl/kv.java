package com.yandex.mobile.ads.impl;

import java.io.InputStream;

/* loaded from: classes3.dex */
public final class kv extends InputStream implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    private final iv f28330a;

    /* renamed from: b, reason: collision with root package name */
    private final mv f28331b;

    /* renamed from: d, reason: collision with root package name */
    private boolean f28333d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f28334e = false;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f28332c = new byte[1];

    public kv(h22 h22Var, mv mvVar) {
        this.f28330a = h22Var;
        this.f28331b = mvVar;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f28334e) {
            return;
        }
        this.f28330a.close();
        this.f28334e = true;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f28332c;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return this.f28332c[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i4, int i5) {
        if (!this.f28334e) {
            if (!this.f28333d) {
                this.f28330a.a(this.f28331b);
                this.f28333d = true;
            }
            int read = this.f28330a.read(bArr, i4, i5);
            if (read == -1) {
                return -1;
            }
            return read;
        }
        throw new IllegalStateException();
    }
}
