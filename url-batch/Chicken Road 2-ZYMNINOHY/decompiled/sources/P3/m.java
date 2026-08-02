package P3;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class m implements n {

    /* renamed from: a, reason: collision with root package name */
    public final l f2109a;

    /* renamed from: b, reason: collision with root package name */
    public n f2110b;

    public m(l lVar) {
        this.f2109a = lVar;
    }

    @Override // P3.n
    public final boolean a(SSLSocket sSLSocket) {
        return this.f2109a.a(sSLSocket);
    }

    @Override // P3.n
    public final String b(SSLSocket sSLSocket) {
        n d4 = d(sSLSocket);
        if (d4 == null) {
            return null;
        }
        return d4.b(sSLSocket);
    }

    @Override // P3.n
    public final void c(SSLSocket sSLSocket, String str, List protocols) {
        kotlin.jvm.internal.i.e(protocols, "protocols");
        n d4 = d(sSLSocket);
        if (d4 == null) {
            return;
        }
        d4.c(sSLSocket, str, protocols);
    }

    public final synchronized n d(SSLSocket sSLSocket) {
        try {
            if (this.f2110b == null && this.f2109a.a(sSLSocket)) {
                this.f2110b = this.f2109a.b(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f2110b;
    }

    @Override // P3.n
    public final boolean isSupported() {
        return true;
    }
}
