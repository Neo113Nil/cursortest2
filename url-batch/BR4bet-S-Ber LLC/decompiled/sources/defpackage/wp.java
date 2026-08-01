package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class wp extends up {
    public long i;
    public final /* synthetic */ yp j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wp(yp ypVar, long j) {
        super(ypVar);
        this.j = ypVar;
        this.i = j;
        if (j == 0) {
            f();
        }
    }

    @Override // defpackage.up, defpackage.h60
    public final long b(long j, h9 h9Var) {
        if (this.g) {
            g9.s("closed");
            return 0L;
        }
        long j2 = this.i;
        if (j2 == 0) {
            return -1L;
        }
        long b = super.b(Math.min(j2, 8192L), h9Var);
        if (b == -1) {
            this.j.b.k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            f();
            throw protocolException;
        }
        long j3 = this.i - b;
        this.i = j3;
        if (j3 == 0) {
            f();
        }
        return b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        if (this.g) {
            return;
        }
        if (this.i != 0) {
            byte[] bArr = cb0.a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                z = cb0.r(this, 100);
            } catch (IOException unused) {
                z = false;
            }
            if (!z) {
                this.j.b.k();
                f();
            }
        }
        this.g = true;
    }
}
