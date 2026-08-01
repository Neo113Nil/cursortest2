package l3;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class l implements m {

    /* renamed from: a, reason: collision with root package name */
    public final k f2895a;

    /* renamed from: b, reason: collision with root package name */
    public m f2896b;

    public l(k kVar) {
        this.f2895a = kVar;
    }

    @Override // l3.m
    public final boolean a(SSLSocket sSLSocket) {
        return this.f2895a.a(sSLSocket);
    }

    @Override // l3.m
    public final String b(SSLSocket sSLSocket) {
        m e4 = e(sSLSocket);
        if (e4 != null) {
            return e4.b(sSLSocket);
        }
        return null;
    }

    @Override // l3.m
    public final boolean c() {
        return true;
    }

    @Override // l3.m
    public final void d(SSLSocket sSLSocket, String str, List list) {
        u2.c.e(list, "protocols");
        m e4 = e(sSLSocket);
        if (e4 != null) {
            e4.d(sSLSocket, str, list);
        }
    }

    public final synchronized m e(SSLSocket sSLSocket) {
        try {
            if (this.f2896b == null && this.f2895a.a(sSLSocket)) {
                this.f2896b = this.f2895a.b(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f2896b;
    }
}
