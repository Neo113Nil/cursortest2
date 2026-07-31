package com.squareup.picasso;

import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
final class k extends InputStream implements AutoCloseable {

    /* renamed from: b, reason: collision with root package name */
    private final InputStream f21725b;

    /* renamed from: c, reason: collision with root package name */
    private long f21726c;

    /* renamed from: d, reason: collision with root package name */
    private long f21727d;

    /* renamed from: e, reason: collision with root package name */
    private long f21728e;

    /* renamed from: f, reason: collision with root package name */
    private long f21729f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f21730g;

    /* renamed from: h, reason: collision with root package name */
    private int f21731h;

    k(InputStream inputStream) {
        this(inputStream, Base64Utils.IO_BUFFER_SIZE);
    }

    private void e(long j4) {
        try {
            long j5 = this.f21727d;
            long j6 = this.f21726c;
            if (j5 >= j6 || j6 > this.f21728e) {
                this.f21727d = j6;
                this.f21725b.mark((int) (j4 - j6));
            } else {
                this.f21725b.reset();
                this.f21725b.mark((int) (j4 - this.f21727d));
                f(this.f21727d, this.f21726c);
            }
            this.f21728e = j4;
        } catch (IOException e4) {
            throw new IllegalStateException("Unable to mark: " + e4);
        }
    }

    private void f(long j4, long j5) {
        while (j4 < j5) {
            long skip = this.f21725b.skip(j5 - j4);
            if (skip == 0) {
                if (read() == -1) {
                    return;
                } else {
                    skip = 1;
                }
            }
            j4 += skip;
        }
    }

    public void a(boolean z4) {
        this.f21730g = z4;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f21725b.available();
    }

    public void b(long j4) {
        if (this.f21726c > this.f21728e || j4 < this.f21727d) {
            throw new IOException("Cannot reset");
        }
        this.f21725b.reset();
        f(this.f21727d, j4);
        this.f21726c = j4;
    }

    public long c(int i4) {
        long j4 = this.f21726c + i4;
        if (this.f21728e < j4) {
            e(j4);
        }
        return this.f21726c;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f21725b.close();
    }

    @Override // java.io.InputStream
    public void mark(int i4) {
        this.f21729f = c(i4);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f21725b.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        if (!this.f21730g) {
            long j4 = this.f21726c + 1;
            long j5 = this.f21728e;
            if (j4 > j5) {
                e(j5 + this.f21731h);
            }
        }
        int read = this.f21725b.read();
        if (read != -1) {
            this.f21726c++;
        }
        return read;
    }

    @Override // java.io.InputStream
    public void reset() {
        b(this.f21729f);
    }

    @Override // java.io.InputStream
    public long skip(long j4) {
        if (!this.f21730g) {
            long j5 = this.f21726c;
            if (j5 + j4 > this.f21728e) {
                e(j5 + j4 + this.f21731h);
            }
        }
        long skip = this.f21725b.skip(j4);
        this.f21726c += skip;
        return skip;
    }

    k(InputStream inputStream, int i4) {
        this(inputStream, i4, 1024);
    }

    private k(InputStream inputStream, int i4, int i5) {
        this.f21729f = -1L;
        this.f21730g = true;
        this.f21731h = -1;
        this.f21725b = inputStream.markSupported() ? inputStream : new BufferedInputStream(inputStream, i4);
        this.f21731h = i5;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        if (!this.f21730g) {
            long j4 = this.f21726c;
            if (bArr.length + j4 > this.f21728e) {
                e(j4 + bArr.length + this.f21731h);
            }
        }
        int read = this.f21725b.read(bArr);
        if (read != -1) {
            this.f21726c += read;
        }
        return read;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i4, int i5) {
        if (!this.f21730g) {
            long j4 = this.f21726c;
            long j5 = i5;
            if (j4 + j5 > this.f21728e) {
                e(j4 + j5 + this.f21731h);
            }
        }
        int read = this.f21725b.read(bArr, i4, i5);
        if (read != -1) {
            this.f21726c += read;
        }
        return read;
    }
}
