package c4;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class l implements m {

    /* renamed from: a, reason: collision with root package name */
    public final k f895a;

    /* renamed from: b, reason: collision with root package name */
    public m f896b;

    public l(k kVar) {
        this.f895a = kVar;
    }

    @Override // c4.m
    public final boolean a(SSLSocket sSLSocket) {
        return this.f895a.a(sSLSocket);
    }

    @Override // c4.m
    public final String b(SSLSocket sSLSocket) {
        m e4 = e(sSLSocket);
        if (e4 != null) {
            return e4.b(sSLSocket);
        }
        return null;
    }

    @Override // c4.m
    public final boolean c() {
        return true;
    }

    @Override // c4.m
    public final void d(SSLSocket sSLSocket, String str, List list) {
        i3.d.e(list, "protocols");
        m e4 = e(sSLSocket);
        if (e4 != null) {
            e4.d(sSLSocket, str, list);
        }
    }

    public final synchronized m e(SSLSocket sSLSocket) {
        try {
            if (this.f896b == null && this.f895a.a(sSLSocket)) {
                this.f896b = this.f895a.b(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f896b;
    }
}
