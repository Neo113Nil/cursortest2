package I2;

import J2.o;
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
public final class c extends n {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f2492e;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2493c;

    /* renamed from: d, reason: collision with root package name */
    public final J2.i f2494d;

    static {
        boolean z3 = false;
        if (F0.a.o() && Build.VERSION.SDK_INT < 30) {
            z3 = true;
        }
        f2492e = z3;
    }

    public c() {
        o oVar;
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            oVar = new o(cls);
        } catch (Exception e3) {
            n.f2519a.getClass();
            n.i("unable to load android socket classes", 5, e3);
            oVar = null;
        }
        ArrayList d02 = M1.m.d0(oVar, new J2.m(J2.f.f2621f), new J2.m(J2.k.f2631a), new J2.m(J2.h.f2627a));
        ArrayList arrayList = new ArrayList();
        Iterator it = d02.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((J2.n) next).c()) {
                arrayList.add(next);
            }
        }
        this.f2493c = arrayList;
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
        this.f2494d = new J2.i(method3, method2, method);
    }

    @Override // I2.n
    public final l b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        J2.b bVar = x509TrustManagerExtensions != null ? new J2.b(x509TrustManager, x509TrustManagerExtensions) : null;
        return bVar != null ? bVar : new M2.a(c(x509TrustManager));
    }

    @Override // I2.n
    public final M2.d c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // I2.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        Z1.i.f(list, "protocols");
        Iterator it = this.f2493c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((J2.n) obj).a(sSLSocket)) {
                    break;
                }
            }
        }
        J2.n nVar = (J2.n) obj;
        if (nVar != null) {
            nVar.d(sSLSocket, str, list);
        }
    }

    @Override // I2.n
    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i3) {
        Z1.i.f(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i3);
        } catch (ClassCastException e3) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e3;
            }
            throw new IOException("Exception in connect", e3);
        }
    }

    @Override // I2.n
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.f2493c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((J2.n) obj).a(sSLSocket)) {
                break;
            }
        }
        J2.n nVar = (J2.n) obj;
        if (nVar != null) {
            return nVar.b(sSLSocket);
        }
        return null;
    }

    @Override // I2.n
    public final Object g() {
        J2.i iVar = this.f2494d;
        iVar.getClass();
        Method method = iVar.f2628a;
        if (method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke(null, null);
            Method method2 = iVar.f2629b;
            Z1.i.c(method2);
            method2.invoke(invoke, "response.body().close()");
            return invoke;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // I2.n
    public final boolean h(String str) {
        Z1.i.f(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // I2.n
    public final void j(Object obj, String str) {
        Z1.i.f(str, "message");
        J2.i iVar = this.f2494d;
        iVar.getClass();
        if (obj != null) {
            try {
                Method method = iVar.f2630c;
                Z1.i.c(method);
                method.invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        n.i(str, 5, null);
    }
}
