package i6;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class m implements n {

    /* renamed from: a, reason: collision with root package name */
    public final l f4446a;

    /* renamed from: b, reason: collision with root package name */
    public n f4447b;

    public m(l lVar) {
        this.f4446a = lVar;
    }

    @Override // i6.n
    public final boolean a(SSLSocket sSLSocket) {
        return this.f4446a.a(sSLSocket);
    }

    @Override // i6.n
    public final String b(SSLSocket sSLSocket) {
        n e4 = e(sSLSocket);
        if (e4 != null) {
            return e4.b(sSLSocket);
        }
        return null;
    }

    @Override // i6.n
    public final boolean c() {
        return true;
    }

    @Override // i6.n
    public final void d(SSLSocket sSLSocket, String str, List protocols) {
        kotlin.jvm.internal.i.e(protocols, "protocols");
        n e4 = e(sSLSocket);
        if (e4 != null) {
            e4.d(sSLSocket, str, protocols);
        }
    }

    public final synchronized n e(SSLSocket sSLSocket) {
        try {
            if (this.f4447b == null && this.f4446a.a(sSLSocket)) {
                this.f4447b = this.f4446a.b(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f4447b;
    }
}
