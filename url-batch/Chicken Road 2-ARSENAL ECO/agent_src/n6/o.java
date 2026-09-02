package n6;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class o extends OutputStream {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f5543f;

    public o(p pVar) {
        this.f5543f = pVar;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f5543f.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        p pVar = this.f5543f;
        if (pVar.f5546h) {
            return;
        }
        pVar.flush();
    }

    public final String toString() {
        return this.f5543f + ".outputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i7) {
        p pVar = this.f5543f;
        if (pVar.f5546h) {
            throw new IOException("closed");
        }
        pVar.f5545g.I((byte) i7);
        pVar.a();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] data, int i7, int i8) {
        kotlin.jvm.internal.i.e(data, "data");
        p pVar = this.f5543f;
        if (!pVar.f5546h) {
            pVar.f5545g.write(data, i7, i8);
            pVar.a();
            return;
        }
        throw new IOException("closed");
    }
}
