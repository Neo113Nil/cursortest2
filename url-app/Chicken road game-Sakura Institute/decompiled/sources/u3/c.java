package u3;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;
import m3.s;
import z2.C1439w;

/* loaded from: classes.dex */
public final class c extends n {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f10935e;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f10936c;

    /* renamed from: d, reason: collision with root package name */
    public final E2.f f10937d;

    static {
        boolean z4 = false;
        if (H1.f.o() && Build.VERSION.SDK_INT < 30) {
            z4 = true;
        }
        f10935e = z4;
    }

    public c() {
        v3.n nVar;
        Method method;
        Method method2;
        int i2 = v3.n.f11008g;
        Intrinsics.checkNotNullParameter("com.android.org.conscrypt", "packageName");
        Method method3 = null;
        try {
            Class<?> sslSocketClass = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            Class<?> sslSocketFactoryClass = Class.forName("com.android.org.conscrypt.OpenSSLSocketFactoryImpl");
            Class<?> paramClass = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            Intrinsics.checkNotNullExpressionValue(paramClass, "paramsClass");
            Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
            Intrinsics.checkNotNullParameter(sslSocketFactoryClass, "sslSocketFactoryClass");
            Intrinsics.checkNotNullParameter(paramClass, "paramClass");
            nVar = new v3.n(sslSocketClass);
        } catch (Exception e4) {
            n.f10964a.getClass();
            n.i("unable to load android socket classes", 5, e4);
            nVar = null;
        }
        v3.m[] elements = {nVar, new v3.l(v3.f.f10998f), new v3.l(v3.j.f11005a), new v3.l(v3.h.f11004a)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        ArrayList t4 = C1439w.t(elements);
        ArrayList arrayList = new ArrayList();
        Iterator it = t4.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((v3.m) next).c()) {
                arrayList.add(next);
            }
        }
        this.f10936c = arrayList;
        try {
            Class<?> cls = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls.getMethod("get", null);
            method2 = cls.getMethod("open", String.class);
            method = cls.getMethod("warnIfOpen", null);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.f10937d = new E2.f(method3, method2, method);
    }

    @Override // u3.n
    public final s b(X509TrustManager trustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(trustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        v3.b bVar = x509TrustManagerExtensions != null ? new v3.b(trustManager, x509TrustManagerExtensions) : null;
        return bVar != null ? bVar : super.b(trustManager);
    }

    @Override // u3.n
    public final y3.d c(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            Method method = trustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            method.setAccessible(true);
            Intrinsics.checkNotNullExpressionValue(method, "method");
            return new b(trustManager, method);
        } catch (NoSuchMethodException unused) {
            return super.c(trustManager);
        }
    }

    @Override // u3.n
    public final void d(SSLSocket sslSocket, String str, List protocols) {
        Object obj;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Iterator it = this.f10936c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((v3.m) obj).a(sslSocket)) {
                    break;
                }
            }
        }
        v3.m mVar = (v3.m) obj;
        if (mVar != null) {
            mVar.d(sslSocket, str, protocols);
        }
    }

    @Override // u3.n
    public final void e(Socket socket, InetSocketAddress address, int i2) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(address, "address");
        try {
            socket.connect(address, i2);
        } catch (ClassCastException e4) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e4;
            }
            throw new IOException("Exception in connect", e4);
        }
    }

    @Override // u3.n
    public final String f(SSLSocket sslSocket) {
        Object obj;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Iterator it = this.f10936c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((v3.m) obj).a(sslSocket)) {
                break;
            }
        }
        v3.m mVar = (v3.m) obj;
        if (mVar != null) {
            return mVar.b(sslSocket);
        }
        return null;
    }

    @Override // u3.n
    public final Object g() {
        Intrinsics.checkNotNullParameter("response.body().close()", "closer");
        E2.f fVar = this.f10937d;
        fVar.getClass();
        Intrinsics.checkNotNullParameter("response.body().close()", "closer");
        Method method = fVar.f2313a;
        if (method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke(null, null);
            Method method2 = fVar.f2314b;
            Intrinsics.c(method2);
            method2.invoke(invoke, "response.body().close()");
            return invoke;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // u3.n
    public final boolean h(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // u3.n
    public final void j(Object obj, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        E2.f fVar = this.f10937d;
        fVar.getClass();
        if (obj != null) {
            try {
                Method method = fVar.f2315c;
                Intrinsics.c(method);
                method.invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        n.i(message, 5, null);
    }
}
