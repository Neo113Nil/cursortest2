package B1;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class m implements n {

    /* renamed from: a, reason: collision with root package name */
    public final l f59a;

    /* renamed from: b, reason: collision with root package name */
    public n f60b;

    public m(l lVar) {
        this.f59a = lVar;
    }

    @Override // B1.n
    public final boolean a(SSLSocket sSLSocket) {
        return this.f59a.a(sSLSocket);
    }

    @Override // B1.n
    public final String b(SSLSocket sSLSocket) {
        n e2 = e(sSLSocket);
        if (e2 != null) {
            return e2.b(sSLSocket);
        }
        return null;
    }

    @Override // B1.n
    public final boolean c() {
        return true;
    }

    @Override // B1.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        h1.d.e(list, "protocols");
        n e2 = e(sSLSocket);
        if (e2 != null) {
            e2.d(sSLSocket, str, list);
        }
    }

    public final synchronized n e(SSLSocket sSLSocket) {
        try {
            if (this.f60b == null && this.f59a.a(sSLSocket)) {
                this.f60b = this.f59a.b(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f60b;
    }
}
