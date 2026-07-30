package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class e21 implements pn2 {
    public final p62 m;
    public final Inflater n;
    public int o;
    public boolean p;

    public e21(p62 p62Var, Inflater inflater) {
        this.m = p62Var;
        this.n = inflater;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.p) {
            return;
        }
        this.n.end();
        this.p = true;
        this.m.close();
    }

    @Override // defpackage.pn2
    public final rx2 e() {
        return this.m.m.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082 A[SYNTHETIC] */
    @Override // defpackage.pn2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long h(long j, fq fqVar) {
        long j2;
        fqVar.getClass();
        while (j >= 0) {
            if (this.p) {
                lh.g("closed");
                return 0L;
            }
            p62 p62Var = this.m;
            Inflater inflater = this.n;
            if (j != 0) {
                try {
                    ug2 B = fqVar.B(1);
                    int min = (int) Math.min(j, 8192 - B.c);
                    if (inflater.needsInput() && !p62Var.b()) {
                        ug2 ug2Var = p62Var.n.m;
                        ug2Var.getClass();
                        int i = ug2Var.c;
                        int i2 = ug2Var.b;
                        int i3 = i - i2;
                        this.o = i3;
                        inflater.setInput(ug2Var.a, i2, i3);
                    }
                    int inflate = inflater.inflate(B.a, B.c, min);
                    int i4 = this.o;
                    if (i4 != 0) {
                        int remaining = i4 - inflater.getRemaining();
                        this.o -= remaining;
                        p62Var.skip(remaining);
                    }
                    if (inflate > 0) {
                        B.c += inflate;
                        j2 = inflate;
                        fqVar.n += j2;
                        if (j2 <= 0) {
                            return j2;
                        }
                        if (inflater.finished() || inflater.needsDictionary()) {
                            return -1L;
                        }
                        if (p62Var.b()) {
                            throw new EOFException("source exhausted prematurely");
                        }
                    } else if (B.b == B.c) {
                        fqVar.m = B.a();
                        xg2.a(B);
                    }
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            }
            j2 = 0;
            if (j2 <= 0) {
            }
        }
        lh.c(q40.i(j, "byteCount < 0: "));
        return 0L;
    }
}
