package f8;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class z extends InputStream {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a0 f3651f;

    public z(a0 a0Var) {
        this.f3651f = a0Var;
    }

    @Override // java.io.InputStream
    public final int available() {
        a0 a0Var = this.f3651f;
        if (a0Var.f3570h) {
            throw new IOException("closed");
        }
        return (int) Math.min(a0Var.f3569g.f3598g, Integer.MAX_VALUE);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3651f.close();
    }

    @Override // java.io.InputStream
    public final int read() {
        a0 a0Var = this.f3651f;
        f fVar = a0Var.f3569g;
        if (a0Var.f3570h) {
            throw new IOException("closed");
        }
        if (fVar.f3598g == 0 && a0Var.f3568f.v(8192L, fVar) == -1) {
            return -1;
        }
        return fVar.readByte() & 255;
    }

    public final String toString() {
        return this.f3651f + ".inputStream()";
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i7, int i8) {
        r6.k.f(bArr, "data");
        a0 a0Var = this.f3651f;
        f fVar = a0Var.f3569g;
        if (!a0Var.f3570h) {
            t6.a.t(bArr.length, i7, i8);
            if (fVar.f3598g == 0 && a0Var.f3568f.v(8192L, fVar) == -1) {
                return -1;
            }
            return fVar.read(bArr, i7, i8);
        }
        throw new IOException("closed");
    }
}
