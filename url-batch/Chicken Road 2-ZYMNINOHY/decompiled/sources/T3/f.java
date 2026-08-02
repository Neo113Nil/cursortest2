package T3;

import a.AbstractC0124a;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class f extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2972a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f2973b;

    public /* synthetic */ f(i iVar, int i4) {
        this.f2972a = i4;
        this.f2973b = iVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        long min;
        switch (this.f2972a) {
            case 0:
                min = Math.min(((g) this.f2973b).f2975b, Integer.MAX_VALUE);
                break;
            default:
                p pVar = (p) this.f2973b;
                if (!pVar.f2996c) {
                    min = Math.min(pVar.f2995b.f2975b, Integer.MAX_VALUE);
                    break;
                } else {
                    throw new IOException("closed");
                }
        }
        return (int) min;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f2972a) {
            case 0:
                break;
            default:
                ((p) this.f2973b).close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        switch (this.f2972a) {
            case 0:
                g gVar = (g) this.f2973b;
                if (gVar.f2975b > 0) {
                    return gVar.readByte() & 255;
                }
                return -1;
            default:
                p pVar = (p) this.f2973b;
                g gVar2 = pVar.f2995b;
                if (pVar.f2996c) {
                    throw new IOException("closed");
                }
                if (gVar2.f2975b == 0 && pVar.f2994a.j(gVar2, 8192L) == -1) {
                    return -1;
                }
                return gVar2.readByte() & 255;
        }
    }

    public final String toString() {
        switch (this.f2972a) {
            case 0:
                return ((g) this.f2973b) + ".inputStream()";
            default:
                return ((p) this.f2973b) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] sink, int i4, int i5) {
        switch (this.f2972a) {
            case 0:
                kotlin.jvm.internal.i.e(sink, "sink");
                return ((g) this.f2973b).read(sink, i4, i5);
            default:
                kotlin.jvm.internal.i.e(sink, "data");
                p pVar = (p) this.f2973b;
                g gVar = pVar.f2995b;
                if (!pVar.f2996c) {
                    AbstractC0124a.p(sink.length, i4, i5);
                    if (gVar.f2975b == 0 && pVar.f2994a.j(gVar, 8192L) == -1) {
                        return -1;
                    }
                    return gVar.read(sink, i4, i5);
                }
                throw new IOException("closed");
        }
    }

    private final void a() {
    }
}
