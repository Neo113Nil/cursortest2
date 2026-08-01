package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class ep implements q30 {
    public final ry f;
    public final Inflater g;
    public int h;
    public boolean i;

    public ep(ry ryVar, Inflater inflater) {
        this.f = ryVar;
        this.g = inflater;
    }

    @Override // defpackage.q30
    public final d60 a() {
        return this.f.f.a();
    }

    @Override // defpackage.q30
    public final long b(long j, p8 p8Var) {
        long j2;
        Inflater inflater = this.g;
        while (!this.i) {
            try {
                f20 t = p8Var.t(1);
                int min = (int) Math.min(8192L, 8192 - t.c);
                boolean needsInput = inflater.needsInput();
                ry ryVar = this.f;
                if (needsInput && !ryVar.m()) {
                    f20 f20Var = ryVar.g.f;
                    f20Var.getClass();
                    int i = f20Var.c;
                    int i2 = f20Var.b;
                    int i3 = i - i2;
                    this.h = i3;
                    inflater.setInput(f20Var.a, i2, i3);
                }
                int inflate = inflater.inflate(t.a, t.c, min);
                int i4 = this.h;
                if (i4 != 0) {
                    int remaining = i4 - inflater.getRemaining();
                    this.h -= remaining;
                    ryVar.skip(remaining);
                }
                if (inflate > 0) {
                    t.c += inflate;
                    j2 = inflate;
                    p8Var.g += j2;
                } else {
                    if (t.b == t.c) {
                        p8Var.f = t.a();
                        g20.a(t);
                    }
                    j2 = 0;
                }
                if (j2 > 0) {
                    return j2;
                }
                if (inflater.finished() || inflater.needsDictionary()) {
                    return -1L;
                }
                if (ryVar.m()) {
                    throw new EOFException("source exhausted prematurely");
                }
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
        o8.t("closed");
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
