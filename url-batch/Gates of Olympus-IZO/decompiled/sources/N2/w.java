package N2;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class w extends OutputStream {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x f2968d;

    public w(x xVar) {
        this.f2968d = xVar;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2968d.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        x xVar = this.f2968d;
        if (xVar.f2971f) {
            return;
        }
        xVar.flush();
    }

    public final String toString() {
        return this.f2968d + ".outputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i3) {
        x xVar = this.f2968d;
        if (xVar.f2971f) {
            throw new IOException("closed");
        }
        xVar.f2970e.Q((byte) i3);
        xVar.a();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i3, int i4) {
        Z1.i.f(bArr, "data");
        x xVar = this.f2968d;
        if (!xVar.f2971f) {
            xVar.f2970e.O(bArr, i3, i4);
            xVar.a();
            return;
        }
        throw new IOException("closed");
    }
}
