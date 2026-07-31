package H1;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: H1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0130d extends FilterInputStream {

    /* renamed from: f, reason: collision with root package name */
    public long f951f;

    /* renamed from: g, reason: collision with root package name */
    public long f952g;

    public C0130d(InputStream inputStream) {
        super(inputStream);
        this.f952g = -1L;
        this.f951f = 1048577L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return (int) Math.min(((FilterInputStream) this).in.available(), this.f951f);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i7) {
        ((FilterInputStream) this).in.mark(i7);
        this.f952g = this.f951f;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (this.f951f == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            this.f951f--;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.f952g == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.f951f = this.f952g;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j4) {
        long skip = ((FilterInputStream) this).in.skip(Math.min(j4, this.f951f));
        this.f951f -= skip;
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i7, int i8) {
        long j4 = this.f951f;
        if (j4 == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read(bArr, i7, (int) Math.min(i8, j4));
        if (read != -1) {
            this.f951f -= read;
        }
        return read;
    }
}
