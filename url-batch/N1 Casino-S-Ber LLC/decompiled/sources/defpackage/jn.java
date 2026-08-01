package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class jn extends in {
    public final jo i;
    public long j;
    public boolean k;
    public final /* synthetic */ mn l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jn(mn mnVar, jo joVar) {
        super(mnVar);
        joVar.getClass();
        this.l = mnVar;
        this.i = joVar;
        this.j = -1L;
        this.k = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0071, code lost:
    
        if (r9.k == false) goto L25;
     */
    @Override // defpackage.in, defpackage.f30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long b(long j, u8 u8Var) {
        mn mnVar = this.l;
        w8 w8Var = mnVar.c;
        if (this.g) {
            t8.t("closed");
            return 0L;
        }
        if (this.k) {
            long j2 = this.j;
            if (j2 == 0 || j2 == -1) {
                if (j2 != -1) {
                    w8Var.d();
                }
                try {
                    this.j = w8Var.k();
                    String obj = c40.y0(w8Var.d()).toString();
                    if (this.j < 0 || (obj.length() > 0 && !k40.m0(obj, ";", false))) {
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.j + obj + '\"');
                    }
                    if (this.j == 0) {
                        this.k = false;
                        mnVar.g = mnVar.f.f();
                        uv uvVar = mnVar.a;
                        uvVar.getClass();
                        dh dhVar = uvVar.o;
                        ym ymVar = mnVar.g;
                        ymVar.getClass();
                        ho.b(dhVar, this.i, ymVar);
                        m();
                    }
                } catch (NumberFormatException e) {
                    throw new ProtocolException(e.getMessage());
                }
            }
            long b = super.b(Math.min(8192L, this.j), u8Var);
            if (b != -1) {
                this.j -= b;
                return b;
            }
            mnVar.b.k();
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
            byte[] bArr = r70.a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                z = r70.r(this, 100);
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
