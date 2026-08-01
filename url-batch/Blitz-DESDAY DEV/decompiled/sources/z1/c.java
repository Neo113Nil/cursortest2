package z1;

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
public final class c extends o {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f4348e;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f4349c;
    public final A1.j d;

    static {
        boolean z2 = false;
        if (n.c() && Build.VERSION.SDK_INT < 30) {
            z2 = true;
        }
        f4348e = z2;
    }

    public c() {
        p pVar;
        Method method;
        Method method2;
        int i = 0;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            pVar = new p(cls);
        } catch (Exception e2) {
            o.f4365a.getClass();
            o.i("unable to load android socket classes", 5, e2);
            pVar = null;
        }
        ArrayList j02 = X0.i.j0(new A1.o[]{pVar, new A1.n(A1.g.f72f), new A1.n(A1.l.f82a), new A1.n(A1.i.f77a)});
        ArrayList arrayList = new ArrayList();
        Iterator it = j02.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((A1.o) next).c()) {
                arrayList.add(next);
            }
        }
        this.f4349c = arrayList;
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
        this.d = new A1.j(method3, method2, method, i);
    }

    @Override // z1.o
    public final d b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        A1.c cVar = x509TrustManagerExtensions != null ? new A1.c(x509TrustManager, x509TrustManagerExtensions) : null;
        return cVar != null ? cVar : new D1.a(c(x509TrustManager));
    }

    @Override // z1.o
    public final D1.d c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // z1.o
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        g1.d.e(list, "protocols");
        Iterator it = this.f4349c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((A1.o) obj).a(sSLSocket)) {
                    break;
                }
            }
        }
        A1.o oVar = (A1.o) obj;
        if (oVar != null) {
            oVar.d(sSLSocket, str, list);
        }
    }

    @Override // z1.o
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

    @Override // z1.o
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.f4349c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((A1.o) obj).a(sSLSocket)) {
                break;
            }
        }
        A1.o oVar = (A1.o) obj;
        if (oVar != null) {
            return oVar.b(sSLSocket);
        }
        return null;
    }

    @Override // z1.o
    public final Object g() {
        A1.j jVar = this.d;
        jVar.getClass();
        Method method = (Method) jVar.f80b;
        if (method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke(null, null);
            Method method2 = (Method) jVar.f81c;
            g1.d.b(method2);
            method2.invoke(invoke, "response.body().close()");
            return invoke;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // z1.o
    public final boolean h(String str) {
        g1.d.e(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // z1.o
    public final void j(Object obj, String str) {
        g1.d.e(str, "message");
        A1.j jVar = this.d;
        jVar.getClass();
        if (obj != null) {
            try {
                Method method = (Method) jVar.d;
                g1.d.b(method);
                method.invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        o.i(str, 5, null);
    }
}
