package A1;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class n implements o {

    /* renamed from: a, reason: collision with root package name */
    public final m f18a;

    /* renamed from: b, reason: collision with root package name */
    public o f19b;

    public n(m mVar) {
        this.f18a = mVar;
    }

    @Override // A1.o
    public final boolean a(SSLSocket sSLSocket) {
        return this.f18a.a(sSLSocket);
    }

    @Override // A1.o
    public final String b(SSLSocket sSLSocket) {
        o e2 = e(sSLSocket);
        if (e2 != null) {
            return e2.b(sSLSocket);
        }
        return null;
    }

    @Override // A1.o
    public final boolean c() {
        return true;
    }

    @Override // A1.o
    public final void d(SSLSocket sSLSocket, String str, List list) {
        g1.d.e(list, "protocols");
        o e2 = e(sSLSocket);
        if (e2 != null) {
            e2.d(sSLSocket, str, list);
        }
    }

    public final synchronized o e(SSLSocket sSLSocket) {
        try {
            if (this.f19b == null && this.f18a.a(sSLSocket)) {
                this.f19b = this.f18a.b(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f19b;
    }
}
