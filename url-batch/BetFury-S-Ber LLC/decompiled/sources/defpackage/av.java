package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class av implements ke0 {
    public final j70 f;
    public final Inflater g;
    public int h;
    public boolean i;

    public av(j70 j70Var, Inflater inflater) {
        this.f = j70Var;
        this.g = inflater;
    }

    @Override // defpackage.ke0
    public final gi0 a() {
        return this.f.f.a();
    }

    @Override // defpackage.ke0
    public final long c(long j, t9 t9Var) {
        long j2;
        Inflater inflater = this.g;
        while (!this.i) {
            try {
                kc0 Q = t9Var.Q(1);
                int min = (int) Math.min(8192L, 8192 - Q.c);
                boolean needsInput = inflater.needsInput();
                j70 j70Var = this.f;
                if (needsInput && !j70Var.i()) {
                    kc0 kc0Var = j70Var.g.f;
                    kc0Var.getClass();
                    int i = kc0Var.c;
                    int i2 = kc0Var.b;
                    int i3 = i - i2;
                    this.h = i3;
                    inflater.setInput(kc0Var.a, i2, i3);
                }
                int inflate = inflater.inflate(Q.a, Q.c, min);
                int i4 = this.h;
                if (i4 != 0) {
                    int remaining = i4 - inflater.getRemaining();
                    this.h -= remaining;
                    j70Var.skip(remaining);
                }
                if (inflate > 0) {
                    Q.c += inflate;
                    j2 = inflate;
                    t9Var.g += j2;
                } else {
                    if (Q.b == Q.c) {
                        t9Var.f = Q.a();
                        nc0.a(Q);
                    }
                    j2 = 0;
                }
                if (j2 > 0) {
                    return j2;
                }
                if (inflater.finished() || inflater.needsDictionary()) {
                    return -1L;
                }
                if (j70Var.i()) {
                    throw new EOFException("source exhausted prematurely");
                }
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
        s9.u("closed");
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
