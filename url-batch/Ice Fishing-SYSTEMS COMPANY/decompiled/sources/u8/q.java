package u8;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class q extends InputStream {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ r f41307n;

    public q(r rVar) {
        this.f41307n = rVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        r rVar = this.f41307n;
        if (rVar.f41310v) {
            throw new IOException("closed");
        }
        return (int) Math.min(rVar.f41309u.f41277u, Integer.MAX_VALUE);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f41307n.close();
    }

    @Override // java.io.InputStream
    public final int read() {
        r rVar = this.f41307n;
        if (rVar.f41310v) {
            throw new IOException("closed");
        }
        e eVar = rVar.f41309u;
        if (eVar.f41277u == 0 && rVar.f41308n.f(8192L, eVar) == -1) {
            return -1;
        }
        return eVar.z() & 255;
    }

    public final String toString() {
        return this.f41307n + ".inputStream()";
    }

    @Override // java.io.InputStream
    public final long transferTo(OutputStream out) {
        kotlin.jvm.internal.h.e(out, "out");
        r rVar = this.f41307n;
        if (rVar.f41310v) {
            throw new IOException("closed");
        }
        long j9 = 0;
        long j10 = 0;
        while (true) {
            e eVar = rVar.f41309u;
            if (eVar.f41277u == j9 && rVar.f41308n.f(8192L, eVar) == -1) {
                return j10;
            }
            long j11 = eVar.f41277u;
            j10 += j11;
            b.d(j11, 0L, j11);
            s sVar = eVar.f41276n;
            while (j11 > j9) {
                kotlin.jvm.internal.h.b(sVar);
                int min = (int) Math.min(j11, sVar.f41313c - sVar.f41312b);
                out.write(sVar.f41311a, sVar.f41312b, min);
                int i = sVar.f41312b + min;
                sVar.f41312b = i;
                long j12 = min;
                eVar.f41277u -= j12;
                j11 -= j12;
                if (i == sVar.f41313c) {
                    s a9 = sVar.a();
                    eVar.f41276n = a9;
                    t.a(sVar);
                    sVar = a9;
                }
                j9 = 0;
            }
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] data, int i, int i4) {
        kotlin.jvm.internal.h.e(data, "data");
        r rVar = this.f41307n;
        if (!rVar.f41310v) {
            b.d(data.length, i, i4);
            e eVar = rVar.f41309u;
            if (eVar.f41277u == 0 && rVar.f41308n.f(8192L, eVar) == -1) {
                return -1;
            }
            return eVar.m(data, i, i4);
        }
        throw new IOException("closed");
    }
}
