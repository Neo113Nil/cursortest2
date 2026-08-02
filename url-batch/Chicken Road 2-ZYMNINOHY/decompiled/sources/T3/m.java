package T3;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class m implements v {

    /* renamed from: a, reason: collision with root package name */
    public final p f2986a;

    /* renamed from: b, reason: collision with root package name */
    public final Inflater f2987b;

    /* renamed from: c, reason: collision with root package name */
    public int f2988c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2989d;

    public m(p pVar, Inflater inflater) {
        this.f2986a = pVar;
        this.f2987b = inflater;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f2989d) {
            return;
        }
        this.f2987b.end();
        this.f2989d = true;
        this.f2986a.close();
    }

    @Override // T3.v
    public final x d() {
        return this.f2986a.f2994a.d();
    }

    @Override // T3.v
    public final long j(g sink, long j4) {
        long j5;
        Inflater inflater = this.f2987b;
        kotlin.jvm.internal.i.e(sink, "sink");
        while (!this.f2989d) {
            try {
                q t4 = sink.t(1);
                int min = (int) Math.min(8192L, 8192 - t4.f2999c);
                boolean needsInput = inflater.needsInput();
                p pVar = this.f2986a;
                if (needsInput && !pVar.a()) {
                    q qVar = pVar.f2995b.f2974a;
                    kotlin.jvm.internal.i.b(qVar);
                    int i4 = qVar.f2999c;
                    int i5 = qVar.f2998b;
                    int i6 = i4 - i5;
                    this.f2988c = i6;
                    inflater.setInput(qVar.f2997a, i5, i6);
                }
                int inflate = inflater.inflate(t4.f2997a, t4.f2999c, min);
                int i7 = this.f2988c;
                if (i7 != 0) {
                    int remaining = i7 - inflater.getRemaining();
                    this.f2988c -= remaining;
                    pVar.skip(remaining);
                }
                if (inflate > 0) {
                    t4.f2999c += inflate;
                    j5 = inflate;
                    sink.f2975b += j5;
                } else {
                    if (t4.f2998b == t4.f2999c) {
                        sink.f2974a = t4.a();
                        r.a(t4);
                    }
                    j5 = 0;
                }
                if (j5 > 0) {
                    return j5;
                }
                if (inflater.finished() || inflater.needsDictionary()) {
                    return -1L;
                }
                if (pVar.a()) {
                    throw new EOFException("source exhausted prematurely");
                }
            } catch (DataFormatException e4) {
                throw new IOException(e4);
            }
        }
        throw new IllegalStateException("closed");
    }
}
