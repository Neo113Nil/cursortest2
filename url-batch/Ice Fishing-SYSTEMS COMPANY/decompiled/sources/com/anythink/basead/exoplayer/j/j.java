package com.anythink.basead.exoplayer.j;

import com.anythink.basead.exoplayer.k.C0544a;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class j extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    private final h f8286a;

    /* renamed from: b, reason: collision with root package name */
    private final k f8287b;

    /* renamed from: f, reason: collision with root package name */
    private long f8291f;

    /* renamed from: d, reason: collision with root package name */
    private boolean f8289d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f8290e = false;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f8288c = new byte[1];

    public j(h hVar, k kVar) {
        this.f8286a = hVar;
        this.f8287b = kVar;
    }

    private void c() {
        if (this.f8289d) {
            return;
        }
        this.f8286a.a(this.f8287b);
        this.f8289d = true;
    }

    public final long a() {
        return this.f8291f;
    }

    public final void b() {
        c();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f8290e) {
            return;
        }
        this.f8286a.b();
        this.f8290e = true;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (read(this.f8288c) == -1) {
            return -1;
        }
        return this.f8288c[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i4) {
        C0544a.b(!this.f8290e);
        c();
        int a9 = this.f8286a.a(bArr, i, i4);
        if (a9 == -1) {
            return -1;
        }
        this.f8291f += a9;
        return a9;
    }
}
