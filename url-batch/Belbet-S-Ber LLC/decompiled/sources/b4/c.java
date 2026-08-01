package b4;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class c extends n {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f831e;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f832c;
    public final c3.b d;

    static {
        boolean z4 = false;
        if (o2.f.j() && Build.VERSION.SDK_INT < 30) {
            z4 = true;
        }
        f831e = z4;
    }

    public c() {
        c4.n nVar;
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            nVar = new c4.n(cls);
        } catch (Exception e4) {
            n.f853a.getClass();
            n.i("unable to load android socket classes", 5, e4);
            nVar = null;
        }
        int i = 0;
        ArrayList L = x2.g.L(new c4.m[]{nVar, new c4.l(c4.f.f888f), new c4.l(c4.j.f894a), new c4.l(c4.h.f893a)});
        ArrayList arrayList = new ArrayList();
        int size = L.size();
        while (i < size) {
            Object obj = L.get(i);
            i++;
            if (((c4.m) obj).c()) {
                arrayList.add(obj);
            }
        }
        this.f832c = arrayList;
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
        this.d = new c3.b(method3, method2, method);
    }

    @Override // b4.n
    public final d b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        c4.b bVar = x509TrustManagerExtensions != null ? new c4.b(x509TrustManager, x509TrustManagerExtensions) : null;
        return bVar != null ? bVar : new f4.a(c(x509TrustManager));
    }

    @Override // b4.n
    public final f4.d c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // b4.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        i3.d.e(list, "protocols");
        ArrayList arrayList = this.f832c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
            if (((c4.m) obj).a(sSLSocket)) {
                break;
            }
        }
        c4.m mVar = (c4.m) obj;
        if (mVar != null) {
            mVar.d(sSLSocket, str, list);
        }
    }

    @Override // b4.n
    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        i3.d.e(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e4) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e4;
            }
            throw new IOException("Exception in connect", e4);
        }
    }

    @Override // b4.n
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        ArrayList arrayList = this.f832c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
            if (((c4.m) obj).a(sSLSocket)) {
                break;
            }
        }
        c4.m mVar = (c4.m) obj;
        if (mVar != null) {
            return mVar.b(sSLSocket);
        }
        return null;
    }

    @Override // b4.n
    public final Object g() {
        c3.b bVar = this.d;
        bVar.getClass();
        Method method = bVar.f878a;
        if (method != null) {
            try {
                Object invoke = method.invoke(null, null);
                Method method2 = bVar.f879b;
                i3.d.b(method2);
                method2.invoke(invoke, "response.body().close()");
                return invoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // b4.n
    public final boolean h(String str) {
        i3.d.e(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // b4.n
    public final void j(Object obj, String str) {
        i3.d.e(str, "message");
        c3.b bVar = this.d;
        bVar.getClass();
        if (obj != null) {
            try {
                Method method = bVar.f880c;
                i3.d.b(method);
                method.invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        n.i(str, 5, null);
    }
}
