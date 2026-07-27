package t3;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import z3.C1448f;
import z3.C1451i;
import z3.F;
import z3.H;

/* loaded from: classes.dex */
public final class s implements F {

    /* renamed from: d, reason: collision with root package name */
    public final z3.z f10842d;

    /* renamed from: e, reason: collision with root package name */
    public int f10843e;

    /* renamed from: i, reason: collision with root package name */
    public int f10844i;

    /* renamed from: j, reason: collision with root package name */
    public int f10845j;

    /* renamed from: k, reason: collision with root package name */
    public int f10846k;

    /* renamed from: l, reason: collision with root package name */
    public int f10847l;

    public s(z3.z source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f10842d = source;
    }

    @Override // z3.F
    public final H c() {
        return this.f10842d.f12044d.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // z3.F
    public final long l(C1448f sink, long j4) {
        int i2;
        int h4;
        Intrinsics.checkNotNullParameter(sink, "sink");
        do {
            int i4 = this.f10846k;
            z3.z zVar = this.f10842d;
            if (i4 != 0) {
                long l4 = zVar.l(sink, Math.min(j4, i4));
                if (l4 == -1) {
                    return -1L;
                }
                this.f10846k -= (int) l4;
                return l4;
            }
            zVar.u(this.f10847l);
            this.f10847l = 0;
            if ((this.f10844i & 4) != 0) {
                return -1L;
            }
            i2 = this.f10845j;
            int s4 = n3.b.s(zVar);
            this.f10846k = s4;
            this.f10843e = s4;
            int d4 = zVar.d() & 255;
            this.f10844i = zVar.d() & 255;
            Logger logger = t.f10848j;
            if (logger.isLoggable(Level.FINE)) {
                C1451i c1451i = g.f10783a;
                logger.fine(g.a(true, this.f10845j, this.f10843e, d4, this.f10844i));
            }
            h4 = zVar.h() & Integer.MAX_VALUE;
            this.f10845j = h4;
            if (d4 != 9) {
                throw new IOException(d4 + " != TYPE_CONTINUATION");
            }
        } while (h4 == i2);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }
}
