package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class po implements f30 {
    public final cy f;
    public final Inflater g;
    public int h;
    public boolean i;

    public po(cy cyVar, Inflater inflater) {
        this.f = cyVar;
        this.g = inflater;
    }

    @Override // defpackage.f30
    public final v50 a() {
        return this.f.f.a();
    }

    @Override // defpackage.f30
    public final long b(long j, u8 u8Var) {
        long j2;
        Inflater inflater = this.g;
        while (!this.i) {
            try {
                v10 t = u8Var.t(1);
                int min = (int) Math.min(8192L, 8192 - t.c);
                boolean needsInput = inflater.needsInput();
                cy cyVar = this.f;
                if (needsInput && !cyVar.m()) {
                    v10 v10Var = cyVar.g.f;
                    v10Var.getClass();
                    int i = v10Var.c;
                    int i2 = v10Var.b;
                    int i3 = i - i2;
                    this.h = i3;
                    inflater.setInput(v10Var.a, i2, i3);
                }
                int inflate = inflater.inflate(t.a, t.c, min);
                int i4 = this.h;
                if (i4 != 0) {
                    int remaining = i4 - inflater.getRemaining();
                    this.h -= remaining;
                    cyVar.skip(remaining);
                }
                if (inflate > 0) {
                    t.c += inflate;
                    j2 = inflate;
                    u8Var.g += j2;
                } else {
                    if (t.b == t.c) {
                        u8Var.f = t.a();
                        w10.a(t);
                    }
                    j2 = 0;
                }
                if (j2 > 0) {
                    return j2;
                }
                if (inflater.finished() || inflater.needsDictionary()) {
                    return -1L;
                }
                if (cyVar.m()) {
                    throw new EOFException("source exhausted prematurely");
                }
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
        t8.t("closed");
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
