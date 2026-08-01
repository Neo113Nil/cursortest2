package H1;

import I1.o;
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
    public static final boolean f508e;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f509c;
    public final I1.i d;

    static {
        boolean z2 = false;
        if (R0.e.n() && Build.VERSION.SDK_INT < 30) {
            z2 = true;
        }
        f508e = z2;
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
        } catch (Exception e2) {
            n.f525a.getClass();
            n.i("unable to load android socket classes", 5, e2);
            oVar = null;
        }
        ArrayList m02 = Y0.i.m0(new I1.n[]{oVar, new I1.m(I1.f.f550f), new I1.m(I1.k.f559a), new I1.m(I1.h.f555a)});
        ArrayList arrayList = new ArrayList();
        Iterator it = m02.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((I1.n) next).c()) {
                arrayList.add(next);
            }
        }
        this.f509c = arrayList;
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
        this.d = new I1.i(method3, method2, method);
    }

    @Override // H1.n
    public final d b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        I1.b bVar = x509TrustManagerExtensions != null ? new I1.b(x509TrustManager, x509TrustManagerExtensions) : null;
        return bVar != null ? bVar : new L1.a(c(x509TrustManager));
    }

    @Override // H1.n
    public final L1.d c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // H1.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        k1.e.e(list, "protocols");
        Iterator it = this.f509c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((I1.n) obj).a(sSLSocket)) {
                    break;
                }
            }
        }
        I1.n nVar = (I1.n) obj;
        if (nVar != null) {
            nVar.d(sSLSocket, str, list);
        }
    }

    @Override // H1.n
    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        k1.e.e(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e2;
            }
            throw new IOException("Exception in connect", e2);
        }
    }

    @Override // H1.n
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.f509c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((I1.n) obj).a(sSLSocket)) {
                break;
            }
        }
        I1.n nVar = (I1.n) obj;
        if (nVar != null) {
            return nVar.b(sSLSocket);
        }
        return null;
    }

    @Override // H1.n
    public final Object g() {
        I1.i iVar = this.d;
        iVar.getClass();
        Method method = iVar.f556a;
        if (method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke(null, null);
            Method method2 = iVar.f557b;
            k1.e.b(method2);
            method2.invoke(invoke, "response.body().close()");
            return invoke;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // H1.n
    public final boolean h(String str) {
        k1.e.e(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // H1.n
    public final void j(Object obj, String str) {
        k1.e.e(str, "message");
        I1.i iVar = this.d;
        iVar.getClass();
        if (obj != null) {
            try {
                Method method = iVar.f558c;
                k1.e.b(method);
                method.invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        n.i(str, 5, null);
    }
}
