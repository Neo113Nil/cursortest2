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

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class m2 extends ww {
    public static final boolean e;
    public final ArrayList c;
    public final ya d;

    static {
        boolean z = false;
        if (vw.g() && Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        e = z;
    }

    public m2() {
        s30 s30Var;
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            s30Var = new s30(cls);
        } catch (Exception e2) {
            ww.a.getClass();
            ww.i("unable to load android socket classes", 5, e2);
            s30Var = null;
        }
        int i = 0;
        ArrayList g0 = q6.g0(new a30[]{s30Var, new cf(n2.f), new cf(jc.a), new cf(r8.a)});
        ArrayList arrayList = new ArrayList();
        int size = g0.size();
        while (i < size) {
            Object obj = g0.get(i);
            i++;
            if (((a30) obj).c()) {
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
        ya yaVar = new ya();
        yaVar.a = method3;
        yaVar.b = method2;
        yaVar.c = method;
        this.d = yaVar;
    }

    @Override // defpackage.ww
    public final o8 b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        i2 i2Var = x509TrustManagerExtensions != null ? new i2(x509TrustManager, x509TrustManagerExtensions) : null;
        return i2Var != null ? i2Var : new u7(c(x509TrustManager));
    }

    @Override // defpackage.ww
    public final b70 c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new l2(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // defpackage.ww
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
            if (((a30) obj).b(sSLSocket)) {
                break;
            }
        }
        a30 a30Var = (a30) obj;
        if (a30Var != null) {
            a30Var.d(sSLSocket, str, list);
        }
    }

    @Override // defpackage.ww
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

    @Override // defpackage.ww
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
            if (((a30) obj).b(sSLSocket)) {
                break;
            }
        }
        a30 a30Var = (a30) obj;
        if (a30Var != null) {
            return a30Var.a(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.ww
    public final Object g() {
        ya yaVar = this.d;
        yaVar.getClass();
        Method method = yaVar.a;
        if (method != null) {
            try {
                Object invoke = method.invoke(null, null);
                Method method2 = yaVar.b;
                method2.getClass();
                method2.invoke(invoke, "response.body().close()");
                return invoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // defpackage.ww
    public final boolean h(String str) {
        str.getClass();
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // defpackage.ww
    public final void j(Object obj, String str) {
        ya yaVar = this.d;
        yaVar.getClass();
        if (obj != null) {
            try {
                Method method = yaVar.c;
                method.getClass();
                method.invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        ww.i(str, 5, null);
    }
}
