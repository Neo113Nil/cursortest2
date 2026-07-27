package v3;

import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* loaded from: classes.dex */
public final class e implements k {
    @Override // v3.k
    public final boolean a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        String name = sslSocket.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "sslSocket.javaClass.name");
        return u.n(name, "com.google.android.gms.org.conscrypt.");
    }

    @Override // v3.k
    public final m b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        e eVar = f.f10998f;
        Class<?> cls = sslSocket.getClass();
        Class<?> cls2 = cls;
        while (!cls2.getSimpleName().equals("OpenSSLSocketImpl")) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new f(cls2);
    }
}
