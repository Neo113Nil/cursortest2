package com.bumptech.glide.load.data;

import com.google.android.gms.internal.ads.CL;
import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class h extends FilterInputStream {

    /* renamed from: v, reason: collision with root package name */
    public static final byte[] f23581v = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};

    /* renamed from: w, reason: collision with root package name */
    public static final int f23582w = 31;

    /* renamed from: n, reason: collision with root package name */
    public final byte f23583n;

    /* renamed from: u, reason: collision with root package name */
    public int f23584u;

    public h(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            throw new IllegalArgumentException(CL.i(i, "Cannot add invalid orientation: "));
        }
        this.f23583n = (byte) i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int i;
        int i4 = this.f23584u;
        int read = (i4 < 2 || i4 > (i = f23582w)) ? super.read() : i4 == i ? this.f23583n : f23581v[i4 - 2] & 255;
        if (read != -1) {
            this.f23584u++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j9) {
        long skip = super.skip(j9);
        if (skip > 0) {
            this.f23584u = (int) (this.f23584u + skip);
        }
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i4) {
        int i9;
        int i10 = this.f23584u;
        int i11 = f23582w;
        if (i10 > i11) {
            i9 = super.read(bArr, i, i4);
        } else if (i10 == i11) {
            bArr[i] = this.f23583n;
            i9 = 1;
        } else if (i10 < 2) {
            i9 = super.read(bArr, i, 2 - i10);
        } else {
            int min = Math.min(i11 - i10, i4);
            System.arraycopy(f23581v, this.f23584u - 2, bArr, i, min);
            i9 = min;
        }
        if (i9 > 0) {
            this.f23584u += i9;
        }
        return i9;
    }
}
