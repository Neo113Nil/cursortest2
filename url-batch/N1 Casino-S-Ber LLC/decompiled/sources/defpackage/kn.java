package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class kn extends in {
    public long i;
    public final /* synthetic */ mn j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kn(mn mnVar, long j) {
        super(mnVar);
        this.j = mnVar;
        this.i = j;
        if (j == 0) {
            m();
        }
    }

    @Override // defpackage.in, defpackage.f30
    public final long b(long j, u8 u8Var) {
        if (this.g) {
            t8.t("closed");
            return 0L;
        }
        long j2 = this.i;
        if (j2 == 0) {
            return -1L;
        }
        long b = super.b(Math.min(j2, 8192L), u8Var);
        if (b == -1) {
            this.j.b.k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m();
            throw protocolException;
        }
        long j3 = this.i - b;
        this.i = j3;
        if (j3 == 0) {
            m();
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
            byte[] bArr = r70.a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                z = r70.r(this, 100);
            } catch (IOException unused) {
                z = false;
            }
            if (!z) {
                this.j.b.k();
                m();
            }
        }
        this.g = true;
    }
}
