package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kje extends FilterInputStream implements InputStreamRetargetInterface {
    private final int a;
    private final kmm b;
    private long c;
    private long d;
    private long e;

    public kje(InputStream inputStream, int i, kmm kmmVar) {
        super(inputStream);
        this.e = -1L;
        this.a = i;
        this.b = kmmVar;
    }

    private final void a() {
        if (this.d > this.c) {
            kmm.d(this.b);
            this.c = this.d;
        }
    }

    private final void b() {
        long j = this.d;
        int i = this.a;
        if (j > i) {
            throw new kbt(kbq.h.e(a.Y(i, "Decompressed gRPC message exceeds maximum size ")), null);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        this.in.mark(i);
        this.e = this.d;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = this.in.read();
        if (read != -1) {
            this.d++;
        }
        b();
        a();
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (!this.in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.e == -1) {
            throw new IOException("Mark not set");
        }
        this.in.reset();
        this.d = this.e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long skip = this.in.skip(j);
        this.d += skip;
        b();
        a();
        return skip;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = this.in.read(bArr, i, i2);
        if (read != -1) {
            this.d += read;
        }
        b();
        a();
        return read;
    }
}
