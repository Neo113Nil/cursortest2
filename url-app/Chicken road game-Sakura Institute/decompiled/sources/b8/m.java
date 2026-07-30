package b8;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class m implements n {

    /* renamed from: a, reason: collision with root package name */
    public final l f1417a;

    /* renamed from: b, reason: collision with root package name */
    public n f1418b;

    public m(l lVar) {
        this.f1417a = lVar;
    }

    @Override // b8.n
    public final boolean a(SSLSocket sSLSocket) {
        return this.f1417a.a(sSLSocket);
    }

    @Override // b8.n
    public final String b(SSLSocket sSLSocket) {
        n e9 = e(sSLSocket);
        if (e9 != null) {
            return e9.b(sSLSocket);
        }
        return null;
    }

    @Override // b8.n
    public final boolean c() {
        return true;
    }

    @Override // b8.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        r6.k.f(list, "protocols");
        n e9 = e(sSLSocket);
        if (e9 != null) {
            e9.d(sSLSocket, str, list);
        }
    }

    public final synchronized n e(SSLSocket sSLSocket) {
        try {
            if (this.f1418b == null && this.f1417a.a(sSLSocket)) {
                this.f1418b = this.f1417a.b(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f1418b;
    }
}
