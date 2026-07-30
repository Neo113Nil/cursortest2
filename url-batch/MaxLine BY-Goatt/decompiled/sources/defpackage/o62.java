package defpackage;

import java.io.InputStream;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class o62 extends InputStream {
    public final /* synthetic */ p62 m;

    public o62(p62 p62Var) {
        this.m = p62Var;
    }

    @Override // java.io.InputStream
    public final int available() {
        p62 p62Var = this.m;
        if (!p62Var.o) {
            return (int) Math.min(p62Var.n.n, 2147483647L);
        }
        dm0.j("closed");
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.m.close();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        p62 p62Var = this.m;
        fq fqVar = p62Var.n;
        if (p62Var.o) {
            dm0.j("closed");
            return 0;
        }
        o70.r(bArr.length, i, i2);
        if (fqVar.n == 0 && p62Var.m.h(8192L, fqVar) == -1) {
            return -1;
        }
        return fqVar.read(bArr, i, i2);
    }

    public final String toString() {
        return this.m + ".inputStream()";
    }

    @Override // java.io.InputStream
    public final int read() {
        p62 p62Var = this.m;
        fq fqVar = p62Var.n;
        if (p62Var.o) {
            dm0.j("closed");
            return 0;
        }
        if (fqVar.n == 0 && p62Var.m.h(8192L, fqVar) == -1) {
            return -1;
        }
        return fqVar.readByte() & 255;
    }
}
