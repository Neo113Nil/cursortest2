package f8;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class x extends OutputStream {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y f3647f;

    public x(y yVar) {
        this.f3647f = yVar;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3647f.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        y yVar = this.f3647f;
        if (yVar.f3650h) {
            return;
        }
        yVar.flush();
    }

    public final String toString() {
        return this.f3647f + ".outputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i7) {
        y yVar = this.f3647f;
        if (yVar.f3650h) {
            throw new IOException("closed");
        }
        yVar.f3649g.Q((byte) i7);
        yVar.b();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i7, int i8) {
        r6.k.f(bArr, "data");
        y yVar = this.f3647f;
        if (!yVar.f3650h) {
            yVar.f3649g.write(bArr, i7, i8);
            yVar.b();
            return;
        }
        throw new IOException("closed");
    }
}
