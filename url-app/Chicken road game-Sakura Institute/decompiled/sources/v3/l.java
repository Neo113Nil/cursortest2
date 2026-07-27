package v3;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l implements m {

    /* renamed from: a, reason: collision with root package name */
    public final k f11006a;

    /* renamed from: b, reason: collision with root package name */
    public m f11007b;

    public l(k socketAdapterFactory) {
        Intrinsics.checkNotNullParameter(socketAdapterFactory, "socketAdapterFactory");
        this.f11006a = socketAdapterFactory;
    }

    @Override // v3.m
    public final boolean a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.f11006a.a(sslSocket);
    }

    @Override // v3.m
    public final String b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        m e4 = e(sslSocket);
        if (e4 != null) {
            return e4.b(sslSocket);
        }
        return null;
    }

    @Override // v3.m
    public final boolean c() {
        return true;
    }

    @Override // v3.m
    public final void d(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        m e4 = e(sslSocket);
        if (e4 != null) {
            e4.d(sslSocket, str, protocols);
        }
    }

    public final synchronized m e(SSLSocket sSLSocket) {
        try {
            if (this.f11007b == null && this.f11006a.a(sSLSocket)) {
                this.f11007b = this.f11006a.b(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f11007b;
    }
}
