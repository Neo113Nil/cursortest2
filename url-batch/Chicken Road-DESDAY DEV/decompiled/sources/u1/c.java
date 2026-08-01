package u1;

import K.C0011l;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import j0.AbstractC0143a;
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
    public static final boolean f3887e;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3888c;
    public final C0011l d;

    static {
        boolean z2 = false;
        if (I0.e.m() && Build.VERSION.SDK_INT < 30) {
            z2 = true;
        }
        f3887e = z2;
    }

    public c() {
        v1.n nVar;
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            nVar = new v1.n(cls);
        } catch (Exception e2) {
            n.f3904a.getClass();
            n.i("unable to load android socket classes", 5, e2);
            nVar = null;
        }
        ArrayList n0 = T0.g.n0(new v1.m[]{nVar, new v1.l(v1.f.f4116f), new v1.l(v1.j.f4122a), new v1.l(v1.h.f4121a)});
        ArrayList arrayList = new ArrayList();
        Iterator it = n0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((v1.m) next).c()) {
                arrayList.add(next);
            }
        }
        this.f3888c = arrayList;
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

    @Override // u1.n
    public final AbstractC0143a b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        v1.b bVar = x509TrustManagerExtensions != null ? new v1.b(x509TrustManager, x509TrustManagerExtensions) : null;
        return bVar != null ? bVar : new y1.a(c(x509TrustManager));
    }

    @Override // u1.n
    public final y1.d c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // u1.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        b1.d.e(list, "protocols");
        Iterator it = this.f3888c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((v1.m) obj).a(sSLSocket)) {
                    break;
                }
            }
        }
        v1.m mVar = (v1.m) obj;
        if (mVar != null) {
            mVar.d(sSLSocket, str, list);
        }
    }

    @Override // u1.n
    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        b1.d.e(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e2;
            }
            throw new IOException("Exception in connect", e2);
        }
    }

    @Override // u1.n
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.f3888c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((v1.m) obj).a(sSLSocket)) {
                break;
            }
        }
        v1.m mVar = (v1.m) obj;
        if (mVar != null) {
            return mVar.b(sSLSocket);
        }
        return null;
    }

    @Override // u1.n
    public final Object g() {
        C0011l c0011l = this.d;
        c0011l.getClass();
        Method method = (Method) c0011l.f422b;
        if (method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke(null, null);
            Method method2 = (Method) c0011l.f423c;
            b1.d.b(method2);
            method2.invoke(invoke, "response.body().close()");
            return invoke;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // u1.n
    public final boolean h(String str) {
        b1.d.e(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // u1.n
    public final void j(Object obj, String str) {
        b1.d.e(str, "message");
        C0011l c0011l = this.d;
        c0011l.getClass();
        if (obj != null) {
            try {
                Method method = (Method) c0011l.d;
                b1.d.b(method);
                method.invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        n.i(str, 5, null);
    }
}
