package O6;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m implements n {

    /* renamed from: a, reason: collision with root package name */
    public final l f1945a;

    /* renamed from: b, reason: collision with root package name */
    public n f1946b;

    public m(l socketAdapterFactory) {
        Intrinsics.checkNotNullParameter(socketAdapterFactory, "socketAdapterFactory");
        this.f1945a = socketAdapterFactory;
    }

    @Override // O6.n
    public final boolean a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.f1945a.a(sslSocket);
    }

    @Override // O6.n
    public final String b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        n e7 = e(sslSocket);
        if (e7 != null) {
            return e7.b(sslSocket);
        }
        return null;
    }

    @Override // O6.n
    public final boolean c() {
        return true;
    }

    @Override // O6.n
    public final void d(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        n e7 = e(sslSocket);
        if (e7 != null) {
            e7.d(sslSocket, str, protocols);
        }
    }

    public final synchronized n e(SSLSocket sSLSocket) {
        try {
            if (this.f1946b == null && this.f1945a.a(sSLSocket)) {
                this.f1946b = this.f1945a.b(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f1946b;
    }
}
