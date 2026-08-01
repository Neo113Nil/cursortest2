package z1;

import A1.o;
import A1.p;
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
    public static final boolean f4349e;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f4350c;
    public final A1.j d;

    static {
        boolean z2 = false;
        if (J0.e.m() && Build.VERSION.SDK_INT < 30) {
            z2 = true;
        }
        f4349e = z2;
    }

    public c() {
        p pVar;
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            pVar = new p(cls);
        } catch (Exception e2) {
            n.f4366a.getClass();
            n.i("unable to load android socket classes", 5, e2);
            pVar = null;
        }
        ArrayList h02 = V0.f.h0(new o[]{pVar, new A1.n(A1.g.f8f), new A1.n(A1.l.f17a), new A1.n(A1.i.f13a)});
        ArrayList arrayList = new ArrayList();
        Iterator it = h02.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((o) next).c()) {
                arrayList.add(next);
            }
        }
        this.f4350c = arrayList;
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
        this.d = new A1.j(method3, method2, method);
    }

    @Override // z1.n
    public final l b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        A1.c cVar = x509TrustManagerExtensions != null ? new A1.c(x509TrustManager, x509TrustManagerExtensions) : null;
        return cVar != null ? cVar : new D1.a(c(x509TrustManager));
    }

    @Override // z1.n
    public final D1.d c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // z1.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        g1.d.e(list, "protocols");
        Iterator it = this.f4350c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((o) obj).a(sSLSocket)) {
                    break;
                }
            }
        }
        o oVar = (o) obj;
        if (oVar != null) {
            oVar.d(sSLSocket, str, list);
        }
    }

    @Override // z1.n
    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        g1.d.e(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e2;
            }
            throw new IOException("Exception in connect", e2);
        }
    }

    @Override // z1.n
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.f4350c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((o) obj).a(sSLSocket)) {
                break;
            }
        }
        o oVar = (o) obj;
        if (oVar != null) {
            return oVar.b(sSLSocket);
        }
        return null;
    }

    @Override // z1.n
    public final Object g() {
        A1.j jVar = this.d;
        jVar.getClass();
        Method method = jVar.f14a;
        if (method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke(null, null);
            Method method2 = jVar.f15b;
            g1.d.b(method2);
            method2.invoke(invoke, "response.body().close()");
            return invoke;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // z1.n
    public final boolean h(String str) {
        g1.d.e(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // z1.n
    public final void j(Object obj, String str) {
        g1.d.e(str, "message");
        A1.j jVar = this.d;
        jVar.getClass();
        if (obj != null) {
            try {
                Method method = jVar.f16c;
                g1.d.b(method);
                method.invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        n.i(str, 5, null);
    }
}
