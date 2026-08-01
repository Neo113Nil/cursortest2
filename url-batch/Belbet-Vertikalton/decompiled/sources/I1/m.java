package I1;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class m implements n {

    /* renamed from: a, reason: collision with root package name */
    public final l f618a;

    /* renamed from: b, reason: collision with root package name */
    public n f619b;

    public m(l lVar) {
        this.f618a = lVar;
    }

    @Override // I1.n
    public final boolean a(SSLSocket sSLSocket) {
        return this.f618a.a(sSLSocket);
    }

    @Override // I1.n
    public final String b(SSLSocket sSLSocket) {
        n e = e(sSLSocket);
        if (e != null) {
            return e.b(sSLSocket);
        }
        return null;
    }

    @Override // I1.n
    public final boolean c() {
        return true;
    }

    @Override // I1.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        j1.h.e(list, "protocols");
        n e = e(sSLSocket);
        if (e != null) {
            e.d(sSLSocket, str, list);
        }
    }

    public final synchronized n e(SSLSocket sSLSocket) {
        try {
            if (this.f619b == null && this.f618a.a(sSLSocket)) {
                this.f619b = this.f618a.b(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f619b;
    }
}
