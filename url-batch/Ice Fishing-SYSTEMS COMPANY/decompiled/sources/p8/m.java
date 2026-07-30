package p8;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes2.dex */
public final class m implements n {

    /* renamed from: a, reason: collision with root package name */
    public final l f39849a;

    /* renamed from: b, reason: collision with root package name */
    public n f39850b;

    public m(l lVar) {
        this.f39849a = lVar;
    }

    @Override // p8.n
    public final boolean a(SSLSocket sSLSocket) {
        return this.f39849a.a(sSLSocket);
    }

    @Override // p8.n
    public final boolean b() {
        return true;
    }

    @Override // p8.n
    public final String c(SSLSocket sSLSocket) {
        n e6 = e(sSLSocket);
        if (e6 != null) {
            return e6.c(sSLSocket);
        }
        return null;
    }

    @Override // p8.n
    public final void d(SSLSocket sSLSocket, String str, List protocols) {
        kotlin.jvm.internal.h.e(protocols, "protocols");
        n e6 = e(sSLSocket);
        if (e6 != null) {
            e6.d(sSLSocket, str, protocols);
        }
    }

    public final synchronized n e(SSLSocket sSLSocket) {
        try {
            if (this.f39850b == null && this.f39849a.a(sSLSocket)) {
                this.f39850b = this.f39849a.k(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f39850b;
    }
}
