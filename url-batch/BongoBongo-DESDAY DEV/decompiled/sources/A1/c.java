package A1;

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

/* loaded from: classes.dex */
public final class c extends o {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f22e;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f23c;
    public final B1.i d;

    static {
        boolean z2 = false;
        if (K0.e.m() && Build.VERSION.SDK_INT < 30) {
            z2 = true;
        }
        f22e = z2;
    }

    public c() {
        B1.o oVar;
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            oVar = new B1.o(cls);
        } catch (Exception e2) {
            o.f39a.getClass();
            o.i("unable to load android socket classes", 5, e2);
            oVar = null;
        }
        ArrayList u02 = W0.f.u0(new B1.n[]{oVar, new B1.m(B1.f.f49f), new B1.m(B1.k.f58a), new B1.m(B1.h.f54a)});
        ArrayList arrayList = new ArrayList();
        Iterator it = u02.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((B1.n) next).c()) {
                arrayList.add(next);
            }
        }
        this.f23c = arrayList;
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
        this.d = new B1.i(method3, method2, method);
    }

    @Override // A1.o
    public final d b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        B1.b bVar = x509TrustManagerExtensions != null ? new B1.b(x509TrustManager, x509TrustManagerExtensions) : null;
        return bVar != null ? bVar : new E1.a(c(x509TrustManager));
    }

    @Override // A1.o
    public final E1.d c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // A1.o
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        h1.d.e(list, "protocols");
        Iterator it = this.f23c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((B1.n) obj).a(sSLSocket)) {
                    break;
                }
            }
        }
        B1.n nVar = (B1.n) obj;
        if (nVar != null) {
            nVar.d(sSLSocket, str, list);
        }
    }

    @Override // A1.o
    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        h1.d.e(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e2;
            }
            throw new IOException("Exception in connect", e2);
        }
    }

    @Override // A1.o
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.f23c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((B1.n) obj).a(sSLSocket)) {
                break;
            }
        }
        B1.n nVar = (B1.n) obj;
        if (nVar != null) {
            return nVar.b(sSLSocket);
        }
        return null;
    }

    @Override // A1.o
    public final Object g() {
        B1.i iVar = this.d;
        iVar.getClass();
        Method method = iVar.f55a;
        if (method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke(null, null);
            Method method2 = iVar.f56b;
            h1.d.b(method2);
            method2.invoke(invoke, "response.body().close()");
            return invoke;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // A1.o
    public final boolean h(String str) {
        h1.d.e(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // A1.o
    public final void j(Object obj, String str) {
        h1.d.e(str, "message");
        B1.i iVar = this.d;
        iVar.getClass();
        if (obj != null) {
            try {
                Method method = iVar.f57c;
                h1.d.b(method);
                method.invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        o.i(str, 5, null);
    }
}
