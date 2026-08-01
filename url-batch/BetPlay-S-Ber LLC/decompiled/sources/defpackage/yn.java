package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class yn extends xn {
    public final yo i;
    public long j;
    public boolean k;
    public final /* synthetic */ bo l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yn(bo boVar, yo yoVar) {
        super(boVar);
        yoVar.getClass();
        this.l = boVar;
        this.i = yoVar;
        this.j = -1L;
        this.k = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0071, code lost:
    
        if (r9.k == false) goto L25;
     */
    @Override // defpackage.xn, defpackage.q30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long b(long j, p8 p8Var) {
        bo boVar = this.l;
        r8 r8Var = boVar.c;
        if (this.g) {
            o8.t("closed");
            return 0L;
        }
        if (this.k) {
            long j2 = this.j;
            if (j2 == 0 || j2 == -1) {
                if (j2 != -1) {
                    r8Var.d();
                }
                try {
                    this.j = r8Var.k();
                    String obj = l40.q0(r8Var.d()).toString();
                    if (this.j < 0 || (obj.length() > 0 && !t40.e0(obj, ";", false))) {
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.j + obj + '\"');
                    }
                    if (this.j == 0) {
                        this.k = false;
                        boVar.g = boVar.f.f();
                        bw bwVar = boVar.a;
                        bwVar.getClass();
                        vg vgVar = bwVar.o;
                        nn nnVar = boVar.g;
                        nnVar.getClass();
                        wo.b(vgVar, this.i, nnVar);
                        m();
                    }
                } catch (NumberFormatException e) {
                    throw new ProtocolException(e.getMessage());
                }
            }
            long b = super.b(Math.min(8192L, this.j), p8Var);
            if (b != -1) {
                this.j -= b;
                return b;
            }
            boVar.b.k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m();
            throw protocolException;
        }
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        if (this.g) {
            return;
        }
        if (this.k) {
            byte[] bArr = y70.a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                z = y70.r(this, 100);
            } catch (IOException unused) {
                z = false;
            }
            if (!z) {
                this.l.b.k();
                m();
            }
        }
        this.g = true;
    }
}
