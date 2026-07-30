package u8;

import java.io.FileOutputStream;

/* loaded from: classes2.dex */
public final class n implements v {

    /* renamed from: n, reason: collision with root package name */
    public final FileOutputStream f41296n;

    /* renamed from: u, reason: collision with root package name */
    public final z f41297u;

    public n(FileOutputStream out, z zVar) {
        kotlin.jvm.internal.h.e(out, "out");
        this.f41296n = out;
        this.f41297u = zVar;
    }

    @Override // u8.v
    public final z L() {
        return this.f41297u;
    }

    @Override // u8.v
    public final void N(long j9, e eVar) {
        b.d(eVar.f41277u, 0L, j9);
        while (j9 > 0) {
            this.f41297u.f();
            s sVar = eVar.f41276n;
            kotlin.jvm.internal.h.b(sVar);
            int min = (int) Math.min(j9, sVar.f41313c - sVar.f41312b);
            this.f41296n.write(sVar.f41311a, sVar.f41312b, min);
            int i = sVar.f41312b + min;
            sVar.f41312b = i;
            long j10 = min;
            j9 -= j10;
            eVar.f41277u -= j10;
            if (i == sVar.f41313c) {
                eVar.f41276n = sVar.a();
                t.a(sVar);
            }
        }
    }

    @Override // u8.v, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f41296n.close();
    }

    @Override // u8.v, java.io.Flushable
    public final void flush() {
        this.f41296n.flush();
    }

    public final String toString() {
        return "sink(" + this.f41296n + ')';
    }
}
