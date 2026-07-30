package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class jy0 extends hy0 {
    public long p;
    public final /* synthetic */ ly0 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jy0(ly0 ly0Var, long j) {
        super(ly0Var);
        this.q = ly0Var;
        this.p = j;
        if (j == 0) {
            b();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        if (this.n) {
            return;
        }
        if (this.p != 0) {
            byte[] bArr = n33.a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                z = n33.q(this, 100);
            } catch (IOException unused) {
                z = false;
            }
            if (!z) {
                this.q.b.k();
                b();
            }
        }
        this.n = true;
    }

    @Override // defpackage.hy0, defpackage.pn2
    public final long h(long j, fq fqVar) {
        fqVar.getClass();
        if (j < 0) {
            lh.c(q40.i(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.n) {
            lh.g("closed");
            return 0L;
        }
        long j2 = this.p;
        if (j2 == 0) {
            return -1L;
        }
        long h = super.h(Math.min(j2, j), fqVar);
        if (h == -1) {
            this.q.b.k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            b();
            throw protocolException;
        }
        long j3 = this.p - h;
        this.p = j3;
        if (j3 == 0) {
            b();
        }
        return h;
    }
}
