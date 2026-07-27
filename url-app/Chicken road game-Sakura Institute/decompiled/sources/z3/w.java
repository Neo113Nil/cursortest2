package z3;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w extends OutputStream {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x f12039d;

    public w(x xVar) {
        this.f12039d = xVar;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f12039d.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        x xVar = this.f12039d;
        if (xVar.f12042i) {
            return;
        }
        xVar.flush();
    }

    public final String toString() {
        return this.f12039d + ".outputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i2) {
        x xVar = this.f12039d;
        if (xVar.f12042i) {
            throw new IOException("closed");
        }
        xVar.f12041e.y((byte) i2);
        xVar.a();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] data, int i2, int i4) {
        Intrinsics.checkNotNullParameter(data, "data");
        x xVar = this.f12039d;
        if (!xVar.f12042i) {
            xVar.f12041e.w(data, i2, i4);
            xVar.a();
            return;
        }
        throw new IOException("closed");
    }
}
