package J2;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class m implements n {

    /* renamed from: a, reason: collision with root package name */
    public final l f2632a;

    /* renamed from: b, reason: collision with root package name */
    public n f2633b;

    public m(l lVar) {
        this.f2632a = lVar;
    }

    @Override // J2.n
    public final boolean a(SSLSocket sSLSocket) {
        return this.f2632a.a(sSLSocket);
    }

    @Override // J2.n
    public final String b(SSLSocket sSLSocket) {
        n e3 = e(sSLSocket);
        if (e3 != null) {
            return e3.b(sSLSocket);
        }
        return null;
    }

    @Override // J2.n
    public final boolean c() {
        return true;
    }

    @Override // J2.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Z1.i.f(list, "protocols");
        n e3 = e(sSLSocket);
        if (e3 != null) {
            e3.d(sSLSocket, str, list);
        }
    }

    public final synchronized n e(SSLSocket sSLSocket) {
        try {
            if (this.f2633b == null && this.f2632a.a(sSLSocket)) {
                this.f2633b = this.f2632a.b(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f2633b;
    }
}
