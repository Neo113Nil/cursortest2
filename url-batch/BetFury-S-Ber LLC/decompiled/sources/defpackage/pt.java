package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class pt extends nt {
    public long i;
    public final /* synthetic */ rt j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pt(rt rtVar, long j) {
        super(rtVar);
        this.j = rtVar;
        this.i = j;
        if (j == 0) {
            i();
        }
    }

    @Override // defpackage.nt, defpackage.ke0
    public final long c(long j, t9 t9Var) {
        if (this.g) {
            s9.u("closed");
            return 0L;
        }
        long j2 = this.i;
        if (j2 == 0) {
            return -1L;
        }
        long c = super.c(Math.min(j2, 8192L), t9Var);
        if (c == -1) {
            this.j.b.k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            i();
            throw protocolException;
        }
        long j3 = this.i - c;
        this.i = j3;
        if (j3 == 0) {
            i();
        }
        return c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        if (this.g) {
            return;
        }
        if (this.i != 0) {
            byte[] bArr = zk0.a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                z = zk0.r(this, 100);
            } catch (IOException unused) {
                z = false;
            }
            if (!z) {
                this.j.b.k();
                i();
            }
        }
        this.g = true;
    }
}
