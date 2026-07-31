package okhttp3.internal.platform.android;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes3.dex */
public final class DeferredSocketAdapter implements SocketAdapter {

    /* renamed from: a, reason: collision with root package name */
    private final Factory f43147a;

    /* renamed from: b, reason: collision with root package name */
    private SocketAdapter f43148b;

    @Metadata
    public interface Factory {
        boolean a(SSLSocket sSLSocket);

        SocketAdapter b(SSLSocket sSLSocket);
    }

    public DeferredSocketAdapter(Factory socketAdapterFactory) {
        Intrinsics.checkNotNullParameter(socketAdapterFactory, "socketAdapterFactory");
        this.f43147a = socketAdapterFactory;
    }

    private final synchronized SocketAdapter e(SSLSocket sSLSocket) {
        try {
            if (this.f43148b == null && this.f43147a.a(sSLSocket)) {
                this.f43148b = this.f43147a.b(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f43148b;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.f43147a.a(sslSocket);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean b() {
        return true;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public String c(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        SocketAdapter e4 = e(sslSocket);
        if (e4 != null) {
            return e4.c(sslSocket);
        }
        return null;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public void d(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        SocketAdapter e4 = e(sslSocket);
        if (e4 != null) {
            e4.d(sslSocket, str, protocols);
        }
    }
}
