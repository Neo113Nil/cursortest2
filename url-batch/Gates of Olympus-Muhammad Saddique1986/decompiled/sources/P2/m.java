package P2;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class m implements n {

    /* renamed from: a, reason: collision with root package name */
    public final l f3940a;

    /* renamed from: b, reason: collision with root package name */
    public n f3941b;

    public m(l lVar) {
        this.f3940a = lVar;
    }

    @Override // P2.n
    public final boolean a(SSLSocket sSLSocket) {
        return this.f3940a.a(sSLSocket);
    }

    @Override // P2.n
    public final String b(SSLSocket sSLSocket) {
        n e3 = e(sSLSocket);
        if (e3 != null) {
            return e3.b(sSLSocket);
        }
        return null;
    }

    @Override // P2.n
    public final boolean c() {
        return true;
    }

    @Override // P2.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        f2.j.f(list, "protocols");
        n e3 = e(sSLSocket);
        if (e3 != null) {
            e3.d(sSLSocket, str, list);
        }
    }

    public final synchronized n e(SSLSocket sSLSocket) {
        try {
            if (this.f3941b == null && this.f3940a.a(sSLSocket)) {
                this.f3941b = this.f3940a.b(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f3941b;
    }
}
