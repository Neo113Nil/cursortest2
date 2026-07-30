package defpackage;

import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class w4 extends km1 implements ms {
    public static final u4 Companion = new u4();
    public static final boolean e9gEMXR7LXtO;
    public Context TSizfFm2Yiuu;
    public final ArrayList Y1f8riQaR6yg;

    static {
        km1.Companion.getClass();
        e9gEMXR7LXtO = Build.VERSION.SDK_INT < 29;
    }

    public w4() {
        b92 b92Var;
        b92.Companion.getClass();
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            b92Var = new b92(cls);
        } catch (Exception e) {
            CopyOnWriteArraySet copyOnWriteArraySet = g4.PxuCJdSBwIXG;
            g4.PxuCJdSBwIXG(if1.class.getName(), 5, "unable to load android socket classes", e);
            b92Var = null;
        }
        b6.Companion.getClass();
        px pxVar = new px(b6.e9gEMXR7LXtO);
        or.Companion.getClass();
        px pxVar2 = new px(or.PxuCJdSBwIXG);
        oe.Companion.getClass();
        int i = 0;
        ArrayList uURZJOrwXbxn = na.uURZJOrwXbxn(new h82[]{b92Var, pxVar, pxVar2, new px(oe.PxuCJdSBwIXG)});
        ArrayList arrayList = new ArrayList();
        int size = uURZJOrwXbxn.size();
        while (i < size) {
            Object obj = uURZJOrwXbxn.get(i);
            i++;
            if (((h82) obj).TSizfFm2Yiuu()) {
                arrayList.add(obj);
            }
        }
        this.Y1f8riQaR6yg = arrayList;
    }

    @Override // defpackage.km1
    public final void OPXfSBeufaJ8(String str, int i, Throwable th) {
        if (i == 5) {
            Log.w("OkHttp", str, th);
        } else {
            Log.i("OkHttp", str, th);
        }
    }

    @Override // defpackage.ms
    public final void PxuCJdSBwIXG(Context context) {
        this.TSizfFm2Yiuu = context;
    }

    @Override // defpackage.km1
    public final pi TSizfFm2Yiuu(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        jm2 idVar;
        w0.Companion.getClass();
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        w0 w0Var = x509TrustManagerExtensions != null ? new w0(x509TrustManager, x509TrustManagerExtensions) : null;
        if (w0Var != null) {
            return w0Var;
        }
        try {
            StrictMode.noteSlowCall("buildTrustRootIndex");
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            idVar = new v4(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused2) {
            X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
            idVar = new id((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
        }
        return new xc(idVar);
    }

    @Override // defpackage.km1
    public final void Y1f8riQaR6yg(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        list.getClass();
        ArrayList arrayList = this.Y1f8riQaR6yg;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
            if (((h82) obj).lS5Rgt96tfkO(sSLSocket)) {
                break;
            }
        }
        h82 h82Var = (h82) obj;
        if (h82Var != null) {
            h82Var.Y1f8riQaR6yg(sSLSocket, str, list);
        }
    }

    @Override // defpackage.km1
    public final String a92UlCVFR9N8(SSLSocket sSLSocket) {
        Object obj;
        ArrayList arrayList = this.Y1f8riQaR6yg;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
            if (((h82) obj).lS5Rgt96tfkO(sSLSocket)) {
                break;
            }
        }
        h82 h82Var = (h82) obj;
        if (h82Var != null) {
            return h82Var.PxuCJdSBwIXG(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.km1
    public final SSLContext dgRBjINgWbAK() {
        StrictMode.noteSlowCall("newSSLContext");
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.getClass();
        return sSLContext;
    }

    @Override // defpackage.km1
    public final void e9gEMXR7LXtO(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        inetSocketAddress.getClass();
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e;
            }
            throw new IOException("Exception in connect", e);
        }
    }

    @Override // defpackage.ms
    public final Context lS5Rgt96tfkO() {
        return this.TSizfFm2Yiuu;
    }

    @Override // defpackage.km1
    public final boolean rtx2ld2ELZv4(String str) {
        str.getClass();
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
