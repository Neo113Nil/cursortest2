package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kkc extends InputStream implements InputStreamRetargetInterface, jyw {
    private final kkb a;

    public kkc(kkb kkbVar) {
        kkbVar.getClass();
        this.a = kkbVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        return ((kfq) this.a).a;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.a.b();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.a.d();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        kkb kkbVar = this.a;
        int i3 = ((kfq) kkbVar).a;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i3, i2);
        kkbVar.j(bArr, i, min);
        return min;
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.a.c();
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        kkb kkbVar = this.a;
        int min = (int) Math.min(((kfq) kkbVar).a, j);
        kkbVar.k(min);
        return min;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read() {
        kkb kkbVar = this.a;
        if (((kfq) kkbVar).a == 0) {
            return -1;
        }
        return kkbVar.e();
    }
}
