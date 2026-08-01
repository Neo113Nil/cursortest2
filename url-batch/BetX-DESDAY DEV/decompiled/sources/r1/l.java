package r1;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class l implements m {

    /* renamed from: a, reason: collision with root package name */
    public final k f3981a;

    /* renamed from: b, reason: collision with root package name */
    public m f3982b;

    public l(k kVar) {
        this.f3981a = kVar;
    }

    @Override // r1.m
    public final boolean a(SSLSocket sSLSocket) {
        return this.f3981a.a(sSLSocket);
    }

    @Override // r1.m
    public final String b(SSLSocket sSLSocket) {
        m e2 = e(sSLSocket);
        if (e2 != null) {
            return e2.b(sSLSocket);
        }
        return null;
    }

    @Override // r1.m
    public final boolean c() {
        return true;
    }

    @Override // r1.m
    public final void d(SSLSocket sSLSocket, String str, List list) {
        X0.f.e(list, "protocols");
        m e2 = e(sSLSocket);
        if (e2 != null) {
            e2.d(sSLSocket, str, list);
        }
    }

    public final synchronized m e(SSLSocket sSLSocket) {
        try {
            if (this.f3982b == null && this.f3981a.a(sSLSocket)) {
                this.f3982b = this.f3981a.b(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f3982b;
    }
}
