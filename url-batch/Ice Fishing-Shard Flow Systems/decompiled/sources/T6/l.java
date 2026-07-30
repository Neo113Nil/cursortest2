package T6;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l implements w {

    /* renamed from: d, reason: collision with root package name */
    public final q f2628d;

    /* renamed from: e, reason: collision with root package name */
    public final Inflater f2629e;

    /* renamed from: i, reason: collision with root package name */
    public int f2630i;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2631l;

    public l(q source, Inflater inflater) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f2628d = source;
        this.f2629e = inflater;
    }

    @Override // T6.w
    public final y b() {
        return this.f2628d.f2640d.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f2631l) {
            return;
        }
        this.f2629e.end();
        this.f2631l = true;
        this.f2628d.close();
    }

    @Override // T6.w
    public final long o(long j, f sink) {
        q qVar;
        long j7;
        Inflater inflater = this.f2629e;
        Intrinsics.checkNotNullParameter(sink, "sink");
        do {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (this.f2631l) {
                throw new IllegalStateException("closed");
            }
            try {
                r E7 = sink.E(1);
                int min = (int) Math.min(8192L, 8192 - E7.f2645c);
                boolean needsInput = inflater.needsInput();
                qVar = this.f2628d;
                if (needsInput && !qVar.a()) {
                    r rVar = qVar.f2641e.f2616d;
                    Intrinsics.b(rVar);
                    int i2 = rVar.f2645c;
                    int i5 = rVar.f2644b;
                    int i7 = i2 - i5;
                    this.f2630i = i7;
                    inflater.setInput(rVar.f2643a, i5, i7);
                }
                int inflate = inflater.inflate(E7.f2643a, E7.f2645c, min);
                int i8 = this.f2630i;
                if (i8 != 0) {
                    int remaining = i8 - inflater.getRemaining();
                    this.f2630i -= remaining;
                    qVar.skip(remaining);
                }
                if (inflate > 0) {
                    E7.f2645c += inflate;
                    j7 = inflate;
                    sink.f2617e += j7;
                } else {
                    if (E7.f2644b == E7.f2645c) {
                        sink.f2616d = E7.a();
                        s.a(E7);
                    }
                    j7 = 0;
                }
                if (j7 > 0) {
                    return j7;
                }
                if (inflater.finished() || inflater.needsDictionary()) {
                    return -1L;
                }
            } catch (DataFormatException e7) {
                throw new IOException(e7);
            }
        } while (!qVar.a());
        throw new EOFException("source exhausted prematurely");
    }
}
