package O3;

import P3.o;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class c extends n {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f2060e;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2061c;

    /* renamed from: d, reason: collision with root package name */
    public final P3.i f2062d;

    static {
        boolean z = false;
        if (a2.i.r() && Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        f2060e = z;
    }

    public c() {
        o oVar;
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName(kotlin.jvm.internal.i.h(".OpenSSLSocketImpl", "com.android.org.conscrypt"));
            Class.forName(kotlin.jvm.internal.i.h(".OpenSSLSocketFactoryImpl", "com.android.org.conscrypt"));
            Class.forName(kotlin.jvm.internal.i.h(".SSLParametersImpl", "com.android.org.conscrypt"));
            oVar = new o(cls);
        } catch (Exception e4) {
            n.f2081a.getClass();
            n.i("unable to load android socket classes", 5, e4);
            oVar = null;
        }
        int i4 = 0;
        ArrayList T4 = d3.g.T(new P3.n[]{oVar, new P3.m(P3.f.f2098f), new P3.m(P3.k.f2108a), new P3.m(P3.h.f2104a)});
        ArrayList arrayList = new ArrayList();
        int size = T4.size();
        while (i4 < size) {
            Object obj = T4.get(i4);
            i4++;
            if (((P3.n) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.f2061c = arrayList;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls2.getMethod("get", null);
            method2 = cls2.getMethod("open", String.class);
            method = cls2.getMethod("warnIfOpen", null);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.f2062d = new P3.i(method3, method2, method);
    }

    @Override // O3.n
    public final l b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        P3.b bVar = x509TrustManagerExtensions != null ? new P3.b(x509TrustManager, x509TrustManagerExtensions) : null;
        return bVar == null ? new S3.a(c(x509TrustManager)) : bVar;
    }

    @Override // O3.n
    public final S3.d c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // O3.n
    public final void d(SSLSocket sSLSocket, String str, List protocols) {
        Object obj;
        kotlin.jvm.internal.i.e(protocols, "protocols");
        ArrayList arrayList = this.f2061c;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i4);
            i4++;
            if (((P3.n) obj).a(sSLSocket)) {
                break;
            }
        }
        P3.n nVar = (P3.n) obj;
        if (nVar == null) {
            return;
        }
        nVar.c(sSLSocket, str, protocols);
    }

    @Override // O3.n
    public final void e(Socket socket, InetSocketAddress address, int i4) {
        kotlin.jvm.internal.i.e(address, "address");
        try {
            socket.connect(address, i4);
        } catch (ClassCastException e4) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e4;
            }
            throw new IOException("Exception in connect", e4);
        }
    }

    @Override // O3.n
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        ArrayList arrayList = this.f2061c;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i4);
            i4++;
            if (((P3.n) obj).a(sSLSocket)) {
                break;
            }
        }
        P3.n nVar = (P3.n) obj;
        if (nVar == null) {
            return null;
        }
        return nVar.b(sSLSocket);
    }

    @Override // O3.n
    public final Object g() {
        P3.i iVar = this.f2062d;
        iVar.getClass();
        Method method = iVar.f2105a;
        if (method != null) {
            try {
                Object invoke = method.invoke(null, null);
                Method method2 = iVar.f2106b;
                kotlin.jvm.internal.i.b(method2);
                method2.invoke(invoke, "response.body().close()");
                return invoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // O3.n
    public final boolean h(String hostname) {
        kotlin.jvm.internal.i.e(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // O3.n
    public final void j(Object obj, String message) {
        kotlin.jvm.internal.i.e(message, "message");
        P3.i iVar = this.f2062d;
        iVar.getClass();
        if (obj != null) {
            try {
                Method method = iVar.f2107c;
                kotlin.jvm.internal.i.b(method);
                method.invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        n.i(message, 5, null);
    }
}
