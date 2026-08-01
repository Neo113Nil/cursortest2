package v1;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class l implements m {

    /* renamed from: a, reason: collision with root package name */
    public final k f4177a;

    /* renamed from: b, reason: collision with root package name */
    public m f4178b;

    public l(k kVar) {
        this.f4177a = kVar;
    }

    @Override // v1.m
    public final boolean a(SSLSocket sSLSocket) {
        return this.f4177a.a(sSLSocket);
    }

    @Override // v1.m
    public final String b(SSLSocket sSLSocket) {
        m e2 = e(sSLSocket);
        if (e2 != null) {
            return e2.b(sSLSocket);
        }
        return null;
    }

    @Override // v1.m
    public final boolean c() {
        return true;
    }

    @Override // v1.m
    public final void d(SSLSocket sSLSocket, String str, List list) {
        b1.d.e(list, "protocols");
        m e2 = e(sSLSocket);
        if (e2 != null) {
            e2.d(sSLSocket, str, list);
        }
    }

    public final synchronized m e(SSLSocket sSLSocket) {
        try {
            if (this.f4178b == null && this.f4177a.a(sSLSocket)) {
                this.f4178b = this.f4177a.b(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f4178b;
    }
}
