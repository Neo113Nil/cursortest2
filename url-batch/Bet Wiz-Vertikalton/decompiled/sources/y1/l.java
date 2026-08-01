package y1;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class l implements m {

    /* renamed from: a, reason: collision with root package name */
    public final k f4304a;

    /* renamed from: b, reason: collision with root package name */
    public m f4305b;

    public l(k kVar) {
        this.f4304a = kVar;
    }

    @Override // y1.m
    public final boolean a(SSLSocket sSLSocket) {
        return this.f4304a.a(sSLSocket);
    }

    @Override // y1.m
    public final String b(SSLSocket sSLSocket) {
        m e2 = e(sSLSocket);
        if (e2 != null) {
            return e2.b(sSLSocket);
        }
        return null;
    }

    @Override // y1.m
    public final boolean c() {
        return true;
    }

    @Override // y1.m
    public final void d(SSLSocket sSLSocket, String str, List list) {
        e1.d.e(list, "protocols");
        m e2 = e(sSLSocket);
        if (e2 != null) {
            e2.d(sSLSocket, str, list);
        }
    }

    public final synchronized m e(SSLSocket sSLSocket) {
        try {
            if (this.f4305b == null && this.f4304a.a(sSLSocket)) {
                this.f4305b = this.f4304a.b(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f4305b;
    }
}
