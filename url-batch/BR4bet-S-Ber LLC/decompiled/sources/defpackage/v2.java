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

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class v2 extends zz {
    public static final boolean e;
    public final ArrayList c;
    public final sb d;

    static {
        boolean z = false;
        if (ky.g() && Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        e = z;
    }

    public v2() {
        v60 v60Var;
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            v60Var = new v60(cls);
        } catch (Exception e2) {
            zz.a.getClass();
            zz.i("unable to load android socket classes", 5, e2);
            v60Var = null;
        }
        int i = 0;
        ArrayList c0 = a7.c0(new c60[]{v60Var, new zg(w2.f), new zg(jd.a), new zg(e9.a)});
        ArrayList arrayList = new ArrayList();
        int size = c0.size();
        while (i < size) {
            Object obj = c0.get(i);
            i++;
            if (((c60) obj).c()) {
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
        this.d = new sb(method3, method2, method);
    }

    @Override // defpackage.zz
    public final xf b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        p2 p2Var = x509TrustManagerExtensions != null ? new p2(x509TrustManager, x509TrustManagerExtensions) : null;
        return p2Var != null ? p2Var : new h8(c(x509TrustManager));
    }

    @Override // defpackage.zz
    public final ia0 c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new u2(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // defpackage.zz
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
            if (((c60) obj).b(sSLSocket)) {
                break;
            }
        }
        c60 c60Var = (c60) obj;
        if (c60Var != null) {
            c60Var.d(sSLSocket, str, list);
        }
    }

    @Override // defpackage.zz
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

    @Override // defpackage.zz
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
            if (((c60) obj).b(sSLSocket)) {
                break;
            }
        }
        c60 c60Var = (c60) obj;
        if (c60Var != null) {
            return c60Var.a(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.zz
    public final Object g() {
        sb sbVar = this.d;
        sbVar.getClass();
        Method method = sbVar.a;
        if (method != null) {
            try {
                Object invoke = method.invoke(null, null);
                Method method2 = sbVar.b;
                method2.getClass();
                method2.invoke(invoke, "response.body().close()");
                return invoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // defpackage.zz
    public final boolean h(String str) {
        str.getClass();
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // defpackage.zz
    public final void j(Object obj, String str) {
        sb sbVar = this.d;
        sbVar.getClass();
        if (obj != null) {
            try {
                Method method = sbVar.c;
                method.getClass();
                method.invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        zz.i(str, 5, null);
    }
}
