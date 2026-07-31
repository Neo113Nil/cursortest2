package h6;

import X5.s;
import a1.AbstractC0223a;
import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.Log;
import i6.h;
import i6.k;
import i6.m;
import i6.n;
import i6.o;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.i;
import l5.AbstractC0505i;

/* loaded from: classes.dex */
public final class c extends e implements d {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f4352e;

    /* renamed from: c, reason: collision with root package name */
    public Context f4353c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f4354d;

    static {
        f4352e = Build.VERSION.SDK_INT < 29;
    }

    public c() {
        o oVar;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            oVar = new o(cls);
        } catch (Exception e4) {
            CopyOnWriteArraySet copyOnWriteArraySet = i6.c.f4434a;
            i6.c.a(s.class.getName(), 5, "unable to load android socket classes", e4);
            oVar = null;
        }
        int i7 = 0;
        ArrayList K6 = AbstractC0505i.K(new n[]{oVar, new m(i6.e.f4437e), new m(k.f4444a), new m(h.f4442a)});
        ArrayList arrayList = new ArrayList();
        int size = K6.size();
        while (i7 < size) {
            Object obj = K6.get(i7);
            i7++;
            if (((n) obj).c()) {
                arrayList.add(obj);
            }
        }
        this.f4354d = arrayList;
    }

    @Override // h6.d
    public final void a(Context context) {
        this.f4353c = context;
    }

    @Override // h6.d
    public final Context b() {
        return this.f4353c;
    }

    @Override // h6.e
    public final AbstractC0223a c(X509TrustManager trustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        i.e(trustManager, "trustManager");
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(trustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        i6.b bVar = x509TrustManagerExtensions != null ? new i6.b(trustManager, x509TrustManagerExtensions) : null;
        return bVar != null ? bVar : super.c(trustManager);
    }

    @Override // h6.e
    public final l6.d d(X509TrustManager trustManager) {
        i.e(trustManager, "trustManager");
        try {
            StrictMode.noteSlowCall("buildTrustRootIndex");
            Method declaredMethod = trustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new b(trustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.d(trustManager);
        }
    }

    @Override // h6.e
    public final void e(SSLSocket sSLSocket, String str, List protocols) {
        Object obj;
        i.e(protocols, "protocols");
        ArrayList arrayList = this.f4354d;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i7);
            i7++;
            if (((n) obj).a(sSLSocket)) {
                break;
            }
        }
        n nVar = (n) obj;
        if (nVar != null) {
            nVar.d(sSLSocket, str, protocols);
        }
    }

    @Override // h6.e
    public final void f(Socket socket, InetSocketAddress address, int i7) {
        i.e(address, "address");
        try {
            socket.connect(address, i7);
        } catch (ClassCastException e4) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e4;
            }
            throw new IOException("Exception in connect", e4);
        }
    }

    @Override // h6.e
    public final String g(SSLSocket sSLSocket) {
        Object obj;
        ArrayList arrayList = this.f4354d;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i7);
            i7++;
            if (((n) obj).a(sSLSocket)) {
                break;
            }
        }
        n nVar = (n) obj;
        if (nVar != null) {
            return nVar.b(sSLSocket);
        }
        return null;
    }

    @Override // h6.e
    public final boolean i(String hostname) {
        i.e(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // h6.e
    public final void j(String message, int i7, Throwable th) {
        i.e(message, "message");
        if (i7 == 5) {
            Log.w("OkHttp", message, th);
        } else {
            Log.i("OkHttp", message, th);
        }
    }

    @Override // h6.e
    public final SSLContext l() {
        StrictMode.noteSlowCall("newSSLContext");
        return super.l();
    }
}
