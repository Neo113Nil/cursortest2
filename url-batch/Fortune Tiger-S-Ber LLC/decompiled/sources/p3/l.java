package p3;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class l implements v {

    /* renamed from: f, reason: collision with root package name */
    public final p f3035f;
    public final Inflater g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3036i;

    public l(p pVar, Inflater inflater) {
        this.f3035f = pVar;
        this.g = inflater;
    }

    @Override // p3.v
    public final x a() {
        return this.f3035f.f3040f.a();
    }

    @Override // p3.v
    public final long c(long j4, f fVar) {
        long j5;
        Inflater inflater = this.g;
        while (!this.f3036i) {
            try {
                q t3 = fVar.t(1);
                int min = (int) Math.min(8192L, 8192 - t3.c);
                boolean needsInput = inflater.needsInput();
                p pVar = this.f3035f;
                if (needsInput && !pVar.m()) {
                    q qVar = pVar.g.f3028f;
                    u2.c.b(qVar);
                    int i4 = qVar.c;
                    int i5 = qVar.f3042b;
                    int i6 = i4 - i5;
                    this.h = i6;
                    inflater.setInput(qVar.f3041a, i5, i6);
                }
                int inflate = inflater.inflate(t3.f3041a, t3.c, min);
                int i7 = this.h;
                if (i7 != 0) {
                    int remaining = i7 - inflater.getRemaining();
                    this.h -= remaining;
                    pVar.skip(remaining);
                }
                if (inflate > 0) {
                    t3.c += inflate;
                    j5 = inflate;
                    fVar.g += j5;
                } else {
                    if (t3.f3042b == t3.c) {
                        fVar.f3028f = t3.a();
                        r.a(t3);
                    }
                    j5 = 0;
                }
                if (j5 > 0) {
                    return j5;
                }
                if (inflater.finished() || inflater.needsDictionary()) {
                    return -1L;
                }
                if (pVar.m()) {
                    throw new EOFException("source exhausted prematurely");
                }
            } catch (DataFormatException e4) {
                throw new IOException(e4);
            }
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3036i) {
            return;
        }
        this.g.end();
        this.f3036i = true;
        this.f3035f.close();
    }
}
