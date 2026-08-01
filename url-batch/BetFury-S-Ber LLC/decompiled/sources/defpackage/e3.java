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

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class e3 extends q50 {
    public static final boolean e;
    public final ArrayList c;
    public final qc d;

    static {
        boolean z = false;
        if (xy.j() && Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        e = z;
    }

    public e3() {
        bf0 bf0Var;
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            bf0Var = new bf0(cls);
        } catch (Exception e2) {
            q50.a.getClass();
            q50.i("unable to load android socket classes", 5, e2);
            bf0Var = null;
        }
        int i = 0;
        ArrayList b0 = j7.b0(new fe0[]{bf0Var, new ej(f3.f), new ej(ue.a), new ej(q9.a)});
        ArrayList arrayList = new ArrayList();
        int size = b0.size();
        while (i < size) {
            Object obj = b0.get(i);
            i++;
            if (((fe0) obj).c()) {
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
        this.d = new qc(method3, method2, method);
    }

    @Override // defpackage.q50
    public final n9 b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        y2 y2Var = x509TrustManagerExtensions != null ? new y2(x509TrustManager, x509TrustManagerExtensions) : null;
        return y2Var != null ? y2Var : new s8(c(x509TrustManager));
    }

    @Override // defpackage.q50
    public final dk0 c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new d3(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // defpackage.q50
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
            if (((fe0) obj).b(sSLSocket)) {
                break;
            }
        }
        fe0 fe0Var = (fe0) obj;
        if (fe0Var != null) {
            fe0Var.d(sSLSocket, str, list);
        }
    }

    @Override // defpackage.q50
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

    @Override // defpackage.q50
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
            if (((fe0) obj).b(sSLSocket)) {
                break;
            }
        }
        fe0 fe0Var = (fe0) obj;
        if (fe0Var != null) {
            return fe0Var.a(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.q50
    public final Object g() {
        qc qcVar = this.d;
        qcVar.getClass();
        Method method = qcVar.a;
        if (method != null) {
            try {
                Object invoke = method.invoke(null, null);
                Method method2 = qcVar.b;
                method2.getClass();
                method2.invoke(invoke, "response.body().close()");
                return invoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // defpackage.q50
    public final boolean h(String str) {
        str.getClass();
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // defpackage.q50
    public final void j(Object obj, String str) {
        qc qcVar = this.d;
        qcVar.getClass();
        if (obj != null) {
            try {
                Method method = qcVar.c;
                method.getClass();
                method.invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        q50.i(str, 5, null);
    }
}
