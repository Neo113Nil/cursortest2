package a8;

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

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c extends o {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f541e;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f542c;

    /* renamed from: d, reason: collision with root package name */
    public final b8.i f543d;

    static {
        boolean z8 = false;
        if (j4.i.p() && Build.VERSION.SDK_INT < 30) {
            z8 = true;
        }
        f541e = z8;
    }

    public c() {
        b8.o oVar;
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            oVar = new b8.o(cls);
        } catch (Exception e9) {
            o.f570a.getClass();
            o.i("unable to load android socket classes", 5, e9);
            oVar = null;
        }
        int i7 = 0;
        ArrayList f02 = e6.k.f0(new b8.n[]{oVar, new b8.m(b8.f.f1406f), new b8.m(b8.k.f1416a), new b8.m(b8.h.f1412a)});
        ArrayList arrayList = new ArrayList();
        int size = f02.size();
        while (i7 < size) {
            Object obj = f02.get(i7);
            i7++;
            if (((b8.n) obj).c()) {
                arrayList.add(obj);
            }
        }
        this.f542c = arrayList;
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
        this.f543d = new b8.i(method3, method2, method);
    }

    @Override // a8.o
    public final t6.a b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        b8.b bVar = x509TrustManagerExtensions != null ? new b8.b(x509TrustManager, x509TrustManagerExtensions) : null;
        return bVar != null ? bVar : new e8.a(c(x509TrustManager));
    }

    @Override // a8.o
    public final e8.d c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // a8.o
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        r6.k.f(list, "protocols");
        ArrayList arrayList = this.f542c;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i7);
            i7++;
            if (((b8.n) obj).a(sSLSocket)) {
                break;
            }
        }
        b8.n nVar = (b8.n) obj;
        if (nVar != null) {
            nVar.d(sSLSocket, str, list);
        }
    }

    @Override // a8.o
    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i7) {
        r6.k.f(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i7);
        } catch (ClassCastException e9) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e9;
            }
            throw new IOException("Exception in connect", e9);
        }
    }

    @Override // a8.o
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        ArrayList arrayList = this.f542c;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i7);
            i7++;
            if (((b8.n) obj).a(sSLSocket)) {
                break;
            }
        }
        b8.n nVar = (b8.n) obj;
        if (nVar != null) {
            return nVar.b(sSLSocket);
        }
        return null;
    }

    @Override // a8.o
    public final Object g() {
        b8.i iVar = this.f543d;
        iVar.getClass();
        Method method = iVar.f1413a;
        if (method != null) {
            try {
                Object invoke = method.invoke(null, null);
                Method method2 = iVar.f1414b;
                r6.k.c(method2);
                method2.invoke(invoke, "response.body().close()");
                return invoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // a8.o
    public final boolean h(String str) {
        r6.k.f(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // a8.o
    public final void j(Object obj, String str) {
        r6.k.f(str, "message");
        b8.i iVar = this.f543d;
        iVar.getClass();
        if (obj != null) {
            try {
                Method method = iVar.f1415c;
                r6.k.c(method);
                method.invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        o.i(str, 5, null);
    }
}
