package O2;

import P2.o;
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
    public static final boolean f3887e;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3888c;

    /* renamed from: d, reason: collision with root package name */
    public final P2.i f3889d;

    static {
        boolean z3 = false;
        if (A1.i.o() && Build.VERSION.SDK_INT < 30) {
            z3 = true;
        }
        f3887e = z3;
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
            n.f3910a.getClass();
            n.i("unable to load android socket classes", 5, e3);
            oVar = null;
        }
        ArrayList B02 = S1.m.B0(oVar, new P2.m(P2.f.f3929f), new P2.m(P2.k.f3939a), new P2.m(P2.h.f3935a));
        ArrayList arrayList = new ArrayList();
        Iterator it = B02.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((P2.n) next).c()) {
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
        this.f3889d = new P2.i(method3, method2, method);
    }

    @Override // O2.n
    public final l0.c b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        P2.b bVar = x509TrustManagerExtensions != null ? new P2.b(x509TrustManager, x509TrustManagerExtensions) : null;
        return bVar != null ? bVar : new S2.a(c(x509TrustManager));
    }

    @Override // O2.n
    public final S2.d c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // O2.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        f2.j.f(list, "protocols");
        Iterator it = this.f3888c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((P2.n) obj).a(sSLSocket)) {
                    break;
                }
            }
        }
        P2.n nVar = (P2.n) obj;
        if (nVar != null) {
            nVar.d(sSLSocket, str, list);
        }
    }

    @Override // O2.n
    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i3) {
        f2.j.f(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i3);
        } catch (ClassCastException e3) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e3;
            }
            throw new IOException("Exception in connect", e3);
        }
    }

    @Override // O2.n
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.f3888c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((P2.n) obj).a(sSLSocket)) {
                break;
            }
        }
        P2.n nVar = (P2.n) obj;
        if (nVar != null) {
            return nVar.b(sSLSocket);
        }
        return null;
    }

    @Override // O2.n
    public final Object g() {
        P2.i iVar = this.f3889d;
        iVar.getClass();
        Method method = iVar.f3936a;
        if (method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke(null, null);
            Method method2 = iVar.f3937b;
            f2.j.c(method2);
            method2.invoke(invoke, "response.body().close()");
            return invoke;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // O2.n
    public final boolean h(String str) {
        f2.j.f(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // O2.n
    public final void j(Object obj, String str) {
        f2.j.f(str, "message");
        P2.i iVar = this.f3889d;
        iVar.getClass();
        if (obj != null) {
            try {
                Method method = iVar.f3938c;
                f2.j.c(method);
                method.invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        n.i(str, 5, null);
    }
}
