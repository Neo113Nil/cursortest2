package w1;

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
    public static final boolean f4173e;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f4174c;
    public final W0.b d;

    static {
        boolean z2 = false;
        if (J0.e.m() && Build.VERSION.SDK_INT < 30) {
            z2 = true;
        }
        f4173e = z2;
    }

    public c() {
        x1.n nVar;
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            nVar = new x1.n(cls);
        } catch (Exception e2) {
            n.f4190a.getClass();
            n.i("unable to load android socket classes", 5, e2);
            nVar = null;
        }
        ArrayList g02 = S0.f.g0(new x1.m[]{nVar, new x1.l(x1.f.f4239f), new x1.l(x1.j.f4245a), new x1.l(x1.h.f4244a)});
        ArrayList arrayList = new ArrayList();
        Iterator it = g02.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((x1.m) next).c()) {
                arrayList.add(next);
            }
        }
        this.f4174c = arrayList;
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
        this.d = new W0.b(method3, method2, method);
    }

    @Override // w1.n
    public final d b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        x1.b bVar = x509TrustManagerExtensions != null ? new x1.b(x509TrustManager, x509TrustManagerExtensions) : null;
        return bVar != null ? bVar : new A1.a(c(x509TrustManager));
    }

    @Override // w1.n
    public final A1.d c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // w1.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        d1.d.e(list, "protocols");
        Iterator it = this.f4174c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((x1.m) obj).a(sSLSocket)) {
                    break;
                }
            }
        }
        x1.m mVar = (x1.m) obj;
        if (mVar != null) {
            mVar.d(sSLSocket, str, list);
        }
    }

    @Override // w1.n
    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        d1.d.e(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e2;
            }
            throw new IOException("Exception in connect", e2);
        }
    }

    @Override // w1.n
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.f4174c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((x1.m) obj).a(sSLSocket)) {
                break;
            }
        }
        x1.m mVar = (x1.m) obj;
        if (mVar != null) {
            return mVar.b(sSLSocket);
        }
        return null;
    }

    @Override // w1.n
    public final Object g() {
        W0.b bVar = this.d;
        bVar.getClass();
        Method method = bVar.f911a;
        if (method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke(null, null);
            Method method2 = bVar.f912b;
            d1.d.b(method2);
            method2.invoke(invoke, "response.body().close()");
            return invoke;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // w1.n
    public final boolean h(String str) {
        d1.d.e(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // w1.n
    public final void j(Object obj, String str) {
        d1.d.e(str, "message");
        W0.b bVar = this.d;
        bVar.getClass();
        if (obj != null) {
            try {
                Method method = bVar.f913c;
                d1.d.b(method);
                method.invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        n.i(str, 5, null);
    }
}
