package X;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class m extends OutputStream {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f3571n = 0;

    /* renamed from: u, reason: collision with root package name */
    public final Object f3572u;

    public m(u8.p pVar) {
        this.f3572u = pVar;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f3571n) {
            case 0:
                break;
            default:
                ((u8.p) this.f3572u).close();
                break;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        switch (this.f3571n) {
            case 0:
                ((FileOutputStream) this.f3572u).flush();
                break;
            default:
                u8.p pVar = (u8.p) this.f3572u;
                if (!pVar.f41306v) {
                    pVar.flush();
                    break;
                }
                break;
        }
    }

    public String toString() {
        switch (this.f3571n) {
            case 1:
                return ((u8.p) this.f3572u) + ".outputStream()";
            default:
                return super.toString();
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        switch (this.f3571n) {
            case 0:
                ((FileOutputStream) this.f3572u).write(i);
                return;
            default:
                u8.p pVar = (u8.p) this.f3572u;
                if (pVar.f41306v) {
                    throw new IOException("closed");
                }
                pVar.f41305u.X((byte) i);
                pVar.b();
                return;
        }
    }

    public m(FileOutputStream fileOutputStream) {
        this.f3572u = fileOutputStream;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bytes, int i, int i4) {
        switch (this.f3571n) {
            case 0:
                kotlin.jvm.internal.h.e(bytes, "bytes");
                ((FileOutputStream) this.f3572u).write(bytes, i, i4);
                return;
            default:
                kotlin.jvm.internal.h.e(bytes, "data");
                u8.p pVar = (u8.p) this.f3572u;
                if (!pVar.f41306v) {
                    pVar.f41305u.V(bytes, i, i4);
                    pVar.b();
                    return;
                }
                throw new IOException("closed");
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] b9) {
        switch (this.f3571n) {
            case 0:
                kotlin.jvm.internal.h.e(b9, "b");
                ((FileOutputStream) this.f3572u).write(b9);
                break;
            default:
                super.write(b9);
                break;
        }
    }

    private final void b() {
    }
}
