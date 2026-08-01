package com.google.firebase.messaging;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d extends FilterInputStream {

    /* renamed from: d, reason: collision with root package name */
    public long f3118d;

    /* renamed from: e, reason: collision with root package name */
    public long f3119e;

    public d(InputStream inputStream) {
        super(inputStream);
        this.f3119e = -1L;
        this.f3118d = 1048577L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return (int) Math.min(((FilterInputStream) this).in.available(), this.f3118d);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i3) {
        ((FilterInputStream) this).in.mark(i3);
        this.f3119e = this.f3118d;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i3, int i10) {
        long j = this.f3118d;
        if (j == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read(bArr, i3, (int) Math.min(i10, j));
        if (read != -1) {
            this.f3118d -= read;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.f3119e == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.f3118d = this.f3119e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long skip = ((FilterInputStream) this).in.skip(Math.min(j, this.f3118d));
        this.f3118d -= skip;
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (this.f3118d == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            this.f3118d--;
        }
        return read;
    }
}
