package k3;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import androidx.emoji2.text.s;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class c extends o {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f2823e;
    public final ArrayList c;

    /* renamed from: d, reason: collision with root package name */
    public final s f2824d;

    static {
        boolean z3 = false;
        if (g2.f.o() && Build.VERSION.SDK_INT < 30) {
            z3 = true;
        }
        f2823e = z3;
    }

    public c() {
        l3.n nVar;
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            nVar = new l3.n(cls);
        } catch (Exception e4) {
            o.f2841a.getClass();
            o.i("unable to load android socket classes", 5, e4);
            nVar = null;
        }
        int i4 = 0;
        ArrayList G = n2.f.G(new l3.m[]{nVar, new l3.l(l3.f.f2888f), new l3.l(l3.j.f2894a), new l3.l(l3.h.f2893a)});
        ArrayList arrayList = new ArrayList();
        int size = G.size();
        while (i4 < size) {
            Object obj = G.get(i4);
            i4++;
            if (((l3.m) obj).c()) {
                arrayList.add(obj);
            }
        }
        this.c = arrayList;
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
        this.f2824d = new s(method3, method2, method);
    }

    @Override // k3.o
    public final l0.g b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        l3.b bVar = x509TrustManagerExtensions != null ? new l3.b(x509TrustManager, x509TrustManagerExtensions) : null;
        return bVar != null ? bVar : new o3.a(c(x509TrustManager));
    }

    @Override // k3.o
    public final o3.d c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // k3.o
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        u2.c.e(list, "protocols");
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i4);
            i4++;
            if (((l3.m) obj).a(sSLSocket)) {
                break;
            }
        }
        l3.m mVar = (l3.m) obj;
        if (mVar != null) {
            mVar.d(sSLSocket, str, list);
        }
    }

    @Override // k3.o
    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i4) {
        u2.c.e(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i4);
        } catch (ClassCastException e4) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e4;
            }
            throw new IOException("Exception in connect", e4);
        }
    }

    @Override // k3.o
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i4);
            i4++;
            if (((l3.m) obj).a(sSLSocket)) {
                break;
            }
        }
        l3.m mVar = (l3.m) obj;
        if (mVar != null) {
            return mVar.b(sSLSocket);
        }
        return null;
    }

    @Override // k3.o
    public final Object g() {
        s sVar = this.f2824d;
        sVar.getClass();
        Method method = (Method) sVar.f357b;
        if (method != null) {
            try {
                Object invoke = method.invoke(null, null);
                Method method2 = (Method) sVar.c;
                u2.c.b(method2);
                method2.invoke(invoke, "response.body().close()");
                return invoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // k3.o
    public final boolean h(String str) {
        u2.c.e(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // k3.o
    public final void j(Object obj, String str) {
        u2.c.e(str, "message");
        s sVar = this.f2824d;
        sVar.getClass();
        if (obj != null) {
            try {
                Method method = (Method) sVar.f358d;
                u2.c.b(method);
                method.invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        o.i(str, 5, null);
    }
}
