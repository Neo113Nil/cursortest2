package s1;

import K.C0011l;
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
import k0.y;

/* loaded from: classes.dex */
public final class c extends n {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f3805e;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3806c;
    public final C0011l d;

    static {
        boolean z2 = false;
        if (I0.e.n() && Build.VERSION.SDK_INT < 30) {
            z2 = true;
        }
        f3805e = z2;
    }

    public c() {
        t1.n nVar;
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            nVar = new t1.n(cls);
        } catch (Exception e2) {
            n.f3825a.getClass();
            n.i("unable to load android socket classes", 5, e2);
            nVar = null;
        }
        ArrayList r02 = R0.g.r0(new t1.m[]{nVar, new t1.l(t1.f.f3878f), new t1.l(t1.j.f3884a), new t1.l(t1.h.f3883a)});
        ArrayList arrayList = new ArrayList();
        Iterator it = r02.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((t1.m) next).c()) {
                arrayList.add(next);
            }
        }
        this.f3806c = arrayList;
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
        this.d = new C0011l(method3, method2, method);
    }

    @Override // s1.n
    public final y b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        t1.b bVar = x509TrustManagerExtensions != null ? new t1.b(x509TrustManager, x509TrustManagerExtensions) : null;
        return bVar != null ? bVar : new w1.a(c(x509TrustManager));
    }

    @Override // s1.n
    public final w1.d c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // s1.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        Z0.d.e(list, "protocols");
        Iterator it = this.f3806c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((t1.m) obj).a(sSLSocket)) {
                    break;
                }
            }
        }
        t1.m mVar = (t1.m) obj;
        if (mVar != null) {
            mVar.d(sSLSocket, str, list);
        }
    }

    @Override // s1.n
    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        Z0.d.e(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e2;
            }
            throw new IOException("Exception in connect", e2);
        }
    }

    @Override // s1.n
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.f3806c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((t1.m) obj).a(sSLSocket)) {
                break;
            }
        }
        t1.m mVar = (t1.m) obj;
        if (mVar != null) {
            return mVar.b(sSLSocket);
        }
        return null;
    }

    @Override // s1.n
    public final Object g() {
        C0011l c0011l = this.d;
        c0011l.getClass();
        Method method = (Method) c0011l.f415b;
        if (method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke(null, null);
            Method method2 = (Method) c0011l.f416c;
            Z0.d.b(method2);
            method2.invoke(invoke, "response.body().close()");
            return invoke;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // s1.n
    public final boolean h(String str) {
        Z0.d.e(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // s1.n
    public final void j(Object obj, String str) {
        Z0.d.e(str, "message");
        C0011l c0011l = this.d;
        c0011l.getClass();
        if (obj != null) {
            try {
                Method method = (Method) c0011l.d;
                Z0.d.b(method);
                method.invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        n.i(str, 5, null);
    }
}
