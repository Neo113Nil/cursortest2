package P;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o0 extends OutputStream {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2143d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2144e;

    public o0(FileOutputStream fileOutputStream) {
        Intrinsics.checkNotNullParameter(fileOutputStream, "fileOutputStream");
        this.f2144e = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f2143d) {
            case 0:
                break;
            default:
                ((T6.p) this.f2144e).close();
                break;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        switch (this.f2143d) {
            case 0:
                ((FileOutputStream) this.f2144e).flush();
                break;
            default:
                T6.p pVar = (T6.p) this.f2144e;
                if (!pVar.f2639i) {
                    pVar.flush();
                    break;
                }
                break;
        }
    }

    public String toString() {
        switch (this.f2143d) {
            case 1:
                return ((T6.p) this.f2144e) + ".outputStream()";
            default:
                return super.toString();
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] b7) {
        switch (this.f2143d) {
            case 0:
                Intrinsics.checkNotNullParameter(b7, "b");
                ((FileOutputStream) this.f2144e).write(b7);
                break;
            default:
                super.write(b7);
                break;
        }
    }

    public o0(T6.p pVar) {
        this.f2144e = pVar;
    }

    @Override // java.io.OutputStream
    public final void write(int i2) {
        switch (this.f2143d) {
            case 0:
                ((FileOutputStream) this.f2144e).write(i2);
                return;
            default:
                T6.p pVar = (T6.p) this.f2144e;
                if (pVar.f2639i) {
                    throw new IOException("closed");
                }
                pVar.f2638e.H((byte) i2);
                pVar.a();
                return;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bytes, int i2, int i5) {
        switch (this.f2143d) {
            case 0:
                Intrinsics.checkNotNullParameter(bytes, "bytes");
                ((FileOutputStream) this.f2144e).write(bytes, i2, i5);
                return;
            default:
                Intrinsics.checkNotNullParameter(bytes, "data");
                T6.p pVar = (T6.p) this.f2144e;
                if (!pVar.f2639i) {
                    pVar.f2638e.write(bytes, i2, i5);
                    pVar.a();
                    return;
                }
                throw new IOException("closed");
        }
    }

    private final void a() {
    }
}
