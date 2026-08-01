package I1;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class m implements n {

    /* renamed from: a, reason: collision with root package name */
    public final l f560a;

    /* renamed from: b, reason: collision with root package name */
    public n f561b;

    public m(l lVar) {
        this.f560a = lVar;
    }

    @Override // I1.n
    public final boolean a(SSLSocket sSLSocket) {
        return this.f560a.a(sSLSocket);
    }

    @Override // I1.n
    public final String b(SSLSocket sSLSocket) {
        n e2 = e(sSLSocket);
        if (e2 != null) {
            return e2.b(sSLSocket);
        }
        return null;
    }

    @Override // I1.n
    public final boolean c() {
        return true;
    }

    @Override // I1.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        k1.e.e(list, "protocols");
        n e2 = e(sSLSocket);
        if (e2 != null) {
            e2.d(sSLSocket, str, list);
        }
    }

    public final synchronized n e(SSLSocket sSLSocket) {
        try {
            if (this.f561b == null && this.f560a.a(sSLSocket)) {
                this.f561b = this.f560a.b(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f561b;
    }
}
