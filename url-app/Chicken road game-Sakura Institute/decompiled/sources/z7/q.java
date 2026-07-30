package z7;

import f8.g0;
import f8.i0;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class q implements g0 {

    /* renamed from: f, reason: collision with root package name */
    public final f8.h f10210f;

    /* renamed from: g, reason: collision with root package name */
    public int f10211g;

    /* renamed from: h, reason: collision with root package name */
    public int f10212h;

    /* renamed from: i, reason: collision with root package name */
    public int f10213i;

    /* renamed from: j, reason: collision with root package name */
    public int f10214j;

    /* renamed from: k, reason: collision with root package name */
    public int f10215k;

    public q(f8.h hVar) {
        r6.k.f(hVar, "source");
        this.f10210f = hVar;
    }

    @Override // f8.g0
    public final i0 a() {
        return this.f10210f.a();
    }

    @Override // f8.g0
    public final long v(long j8, f8.f fVar) {
        int i7;
        int readInt;
        r6.k.f(fVar, "sink");
        do {
            int i8 = this.f10214j;
            f8.h hVar = this.f10210f;
            if (i8 == 0) {
                hVar.skip(this.f10215k);
                this.f10215k = 0;
                if ((this.f10212h & 4) == 0) {
                    i7 = this.f10213i;
                    int r8 = t7.b.r(hVar);
                    this.f10214j = r8;
                    this.f10211g = r8;
                    int readByte = hVar.readByte() & 255;
                    this.f10212h = hVar.readByte() & 255;
                    Logger logger = r.f10216i;
                    if (logger.isLoggable(Level.FINE)) {
                        f8.i iVar = f.f10159a;
                        logger.fine(f.a(true, this.f10213i, this.f10211g, readByte, this.f10212h));
                    }
                    readInt = hVar.readInt() & Integer.MAX_VALUE;
                    this.f10213i = readInt;
                    if (readByte != 9) {
                        throw new IOException(readByte + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long v5 = hVar.v(Math.min(j8, i8), fVar);
                if (v5 != -1) {
                    this.f10214j -= (int) v5;
                    return v5;
                }
            }
            return -1L;
        } while (readInt == i7);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
