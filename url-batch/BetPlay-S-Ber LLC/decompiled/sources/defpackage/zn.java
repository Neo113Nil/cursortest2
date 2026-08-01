package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class zn extends xn {
    public long i;
    public final /* synthetic */ bo j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zn(bo boVar, long j) {
        super(boVar);
        this.j = boVar;
        this.i = j;
        if (j == 0) {
            m();
        }
    }

    @Override // defpackage.xn, defpackage.q30
    public final long b(long j, p8 p8Var) {
        if (this.g) {
            o8.t("closed");
            return 0L;
        }
        long j2 = this.i;
        if (j2 == 0) {
            return -1L;
        }
        long b = super.b(Math.min(j2, 8192L), p8Var);
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
            byte[] bArr = y70.a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                z = y70.r(this, 100);
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
