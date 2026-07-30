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

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class sa extends r12 {
    public static final boolean e;
    public final ArrayList c;
    public final wu d;

    static {
        boolean z = false;
        if (nm1.t() && Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        e = z;
    }

    public sa() {
        ko2 ko2Var;
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            ko2Var = new ko2(cls);
        } catch (Exception e2) {
            r12.a.getClass();
            r12.i("unable to load android socket classes", 5, e2);
            ko2Var = null;
        }
        int i = 0;
        ArrayList p = oi.p(new in2[]{ko2Var, new k90(qb.f), new k90(s10.a), new k90(dp.a)});
        ArrayList arrayList = new ArrayList();
        int size = p.size();
        while (i < size) {
            Object obj = p.get(i);
            i++;
            if (((in2) obj).b()) {
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
        this.d = new wu(method3, method2, method);
    }

    @Override // defpackage.r12
    public final yj1 b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        a7 a7Var = x509TrustManagerExtensions != null ? new a7(x509TrustManager, x509TrustManagerExtensions) : null;
        return a7Var != null ? a7Var : new pn(c(x509TrustManager));
    }

    @Override // defpackage.r12
    public final g03 c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new ra(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // defpackage.r12
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
            if (((in2) obj).c(sSLSocket)) {
                break;
            }
        }
        in2 in2Var = (in2) obj;
        if (in2Var != null) {
            in2Var.d(sSLSocket, str, list);
        }
    }

    @Override // defpackage.r12
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

    @Override // defpackage.r12
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
            if (((in2) obj).c(sSLSocket)) {
                break;
            }
        }
        in2 in2Var = (in2) obj;
        if (in2Var != null) {
            return in2Var.a(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.r12
    public final Object g() {
        wu wuVar = this.d;
        wuVar.getClass();
        Method method = wuVar.a;
        if (method != null) {
            try {
                Object invoke = method.invoke(null, null);
                Method method2 = wuVar.b;
                method2.getClass();
                method2.invoke(invoke, "response.body().close()");
                return invoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // defpackage.r12
    public final boolean h(String str) {
        str.getClass();
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // defpackage.r12
    public final void j(Object obj, String str) {
        wu wuVar = this.d;
        wuVar.getClass();
        if (obj != null) {
            try {
                Method method = wuVar.c;
                method.getClass();
                method.invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        r12.i(str, 5, null);
    }
}
