package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class k90 implements in2 {
    public final j90 a;
    public in2 b;

    public k90(j90 j90Var) {
        this.a = j90Var;
    }

    @Override // defpackage.in2
    public final String a(SSLSocket sSLSocket) {
        in2 e = e(sSLSocket);
        if (e != null) {
            return e.a(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.in2
    public final boolean b() {
        return true;
    }

    @Override // defpackage.in2
    public final boolean c(SSLSocket sSLSocket) {
        return this.a.c(sSLSocket);
    }

    @Override // defpackage.in2
    public final void d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        in2 e = e(sSLSocket);
        if (e != null) {
            e.d(sSLSocket, str, list);
        }
    }

    public final synchronized in2 e(SSLSocket sSLSocket) {
        try {
            if (this.b == null && this.a.c(sSLSocket)) {
                this.b = this.a.e(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }
}
