package j5;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class l implements w {

    /* renamed from: a, reason: collision with root package name */
    public final q f10506a;

    /* renamed from: b, reason: collision with root package name */
    public final Inflater f10507b;

    /* renamed from: c, reason: collision with root package name */
    public int f10508c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10509d;

    public l(q qVar, Inflater inflater) {
        this.f10506a = qVar;
        this.f10507b = inflater;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f10509d) {
            return;
        }
        this.f10507b.end();
        this.f10509d = true;
        this.f10506a.close();
    }

    @Override // j5.w
    public final y d() {
        return this.f10506a.f10518a.d();
    }

    @Override // j5.w
    public final long s(f sink, long j2) {
        long j6;
        kotlin.jvm.internal.i.e(sink, "sink");
        while (!this.f10509d) {
            q qVar = this.f10506a;
            Inflater inflater = this.f10507b;
            try {
                r F2 = sink.F(1);
                int min = (int) Math.min(8192L, 8192 - F2.f10523c);
                if (inflater.needsInput() && !qVar.a()) {
                    r rVar = qVar.f10519b.f10494a;
                    kotlin.jvm.internal.i.b(rVar);
                    int i2 = rVar.f10523c;
                    int i3 = rVar.f10522b;
                    int i6 = i2 - i3;
                    this.f10508c = i6;
                    inflater.setInput(rVar.f10521a, i3, i6);
                }
                int inflate = inflater.inflate(F2.f10521a, F2.f10523c, min);
                int i7 = this.f10508c;
                if (i7 != 0) {
                    int remaining = i7 - inflater.getRemaining();
                    this.f10508c -= remaining;
                    qVar.C(remaining);
                }
                if (inflate > 0) {
                    F2.f10523c += inflate;
                    j6 = inflate;
                    sink.f10495b += j6;
                } else {
                    if (F2.f10522b == F2.f10523c) {
                        sink.f10494a = F2.a();
                        s.a(F2);
                    }
                    j6 = 0;
                }
                if (j6 > 0) {
                    return j6;
                }
                if (inflater.finished() || inflater.needsDictionary()) {
                    return -1L;
                }
                if (qVar.a()) {
                    throw new EOFException("source exhausted prematurely");
                }
            } catch (DataFormatException e3) {
                throw new IOException(e3);
            }
        }
        throw new IllegalStateException("closed");
    }
}
