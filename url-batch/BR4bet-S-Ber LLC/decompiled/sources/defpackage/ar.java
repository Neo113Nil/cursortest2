package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class ar implements h60 {
    public final e10 f;
    public final Inflater g;
    public int h;
    public boolean i;

    public ar(e10 e10Var, Inflater inflater) {
        this.f = e10Var;
        this.g = inflater;
    }

    @Override // defpackage.h60
    public final f90 a() {
        return this.f.f.a();
    }

    @Override // defpackage.h60
    public final long b(long j, h9 h9Var) {
        long j2;
        Inflater inflater = this.g;
        while (!this.i) {
            try {
                u40 t = h9Var.t(1);
                int min = (int) Math.min(8192L, 8192 - t.c);
                boolean needsInput = inflater.needsInput();
                e10 e10Var = this.f;
                if (needsInput && !e10Var.f()) {
                    u40 u40Var = e10Var.g.f;
                    u40Var.getClass();
                    int i = u40Var.c;
                    int i2 = u40Var.b;
                    int i3 = i - i2;
                    this.h = i3;
                    inflater.setInput(u40Var.a, i2, i3);
                }
                int inflate = inflater.inflate(t.a, t.c, min);
                int i4 = this.h;
                if (i4 != 0) {
                    int remaining = i4 - inflater.getRemaining();
                    this.h -= remaining;
                    e10Var.skip(remaining);
                }
                if (inflate > 0) {
                    t.c += inflate;
                    j2 = inflate;
                    h9Var.g += j2;
                } else {
                    if (t.b == t.c) {
                        h9Var.f = t.a();
                        v40.a(t);
                    }
                    j2 = 0;
                }
                if (j2 > 0) {
                    return j2;
                }
                if (inflater.finished() || inflater.needsDictionary()) {
                    return -1L;
                }
                if (e10Var.f()) {
                    throw new EOFException("source exhausted prematurely");
                }
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
        g9.s("closed");
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.i) {
            return;
        }
        this.g.end();
        this.i = true;
        this.f.close();
    }
}
