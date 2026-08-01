package defpackage;

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

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class d3 extends jx {
    public static final boolean e;
    public final ArrayList c;
    public final r6 d;

    static {
        boolean z = false;
        if (ix.h() && Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        e = z;
    }

    public d3() {
        b40 b40Var;
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            b40Var = new b40(cls);
        } catch (Exception e2) {
            jx.a.getClass();
            jx.i("unable to load android socket classes", 5, e2);
            b40Var = null;
        }
        int i = 0;
        ArrayList j0 = h7.j0(new l30[]{b40Var, new bf(e3.f), new bf(nc.a), new bf(m8.a)});
        ArrayList arrayList = new ArrayList();
        int size = j0.size();
        while (i < size) {
            Object obj = j0.get(i);
            i++;
            if (((l30) obj).c()) {
                arrayList.add(obj);
            }
        }
        this.c = arrayList;
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
        this.d = new r6(method3, method2, method);
    }

    @Override // defpackage.jx
    public final l70 b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        z2 z2Var = x509TrustManagerExtensions != null ? new z2(x509TrustManager, x509TrustManagerExtensions) : null;
        return z2Var != null ? z2Var : new a8(c(x509TrustManager));
    }

    @Override // defpackage.jx
    public final i70 c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new c3(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // defpackage.jx
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        list.getClass();
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
            if (((l30) obj).b(sSLSocket)) {
                break;
            }
        }
        l30 l30Var = (l30) obj;
        if (l30Var != null) {
            l30Var.d(sSLSocket, str, list);
        }
    }

    @Override // defpackage.jx
    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        inetSocketAddress.getClass();
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e2;
            }
            throw new IOException("Exception in connect", e2);
        }
    }

    @Override // defpackage.jx
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
            if (((l30) obj).b(sSLSocket)) {
                break;
            }
        }
        l30 l30Var = (l30) obj;
        if (l30Var != null) {
            return l30Var.a(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.jx
    public final Object g() {
        r6 r6Var = this.d;
        r6Var.getClass();
        Method method = (Method) r6Var.b;
        if (method != null) {
            try {
                Object invoke = method.invoke(null, null);
                Method method2 = (Method) r6Var.c;
                method2.getClass();
                method2.invoke(invoke, "response.body().close()");
                return invoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // defpackage.jx
    public final boolean h(String str) {
        str.getClass();
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // defpackage.jx
    public final void j(Object obj, String str) {
        r6 r6Var = this.d;
        r6Var.getClass();
        if (obj != null) {
            try {
                Method method = (Method) r6Var.d;
                method.getClass();
                method.invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        jx.i(str, 5, null);
    }
}
