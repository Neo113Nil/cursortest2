package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class vp extends up {
    public final uq i;
    public long j;
    public boolean k;
    public final /* synthetic */ yp l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vp(yp ypVar, uq uqVar) {
        super(ypVar);
        uqVar.getClass();
        this.l = ypVar;
        this.i = uqVar;
        this.j = -1L;
        this.k = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0071, code lost:
    
        if (r9.k == false) goto L25;
     */
    @Override // defpackage.up, defpackage.h60
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long b(long j, h9 h9Var) {
        yp ypVar = this.l;
        j9 j9Var = ypVar.c;
        if (this.g) {
            g9.s("closed");
            return 0L;
        }
        if (this.k) {
            long j2 = this.j;
            if (j2 == 0 || j2 == -1) {
                if (j2 != -1) {
                    j9Var.d();
                }
                try {
                    this.j = j9Var.o();
                    String obj = f70.g0(j9Var.d()).toString();
                    if (this.j < 0 || (obj.length() > 0 && !n70.U(obj, ";", false))) {
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.j + obj + '\"');
                    }
                    if (this.j == 0) {
                        this.k = false;
                        ypVar.g = ypVar.f.f();
                        xy xyVar = ypVar.a;
                        xyVar.getClass();
                        ej ejVar = xyVar.o;
                        kp kpVar = ypVar.g;
                        kpVar.getClass();
                        sq.b(ejVar, this.i, kpVar);
                        f();
                    }
                } catch (NumberFormatException e) {
                    throw new ProtocolException(e.getMessage());
                }
            }
            long b = super.b(Math.min(8192L, this.j), h9Var);
            if (b != -1) {
                this.j -= b;
                return b;
            }
            ypVar.b.k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            f();
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
            byte[] bArr = cb0.a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                z = cb0.r(this, 100);
            } catch (IOException unused) {
                z = false;
            }
            if (!z) {
                this.l.b.k();
                f();
            }
        }
        this.g = true;
    }
}
