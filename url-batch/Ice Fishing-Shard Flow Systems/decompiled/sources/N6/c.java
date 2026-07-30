package N6;

import D6.w;
import O6.h;
import O6.k;
import O6.m;
import O6.n;
import O6.o;
import a.AbstractC0169a;
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
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.p;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c extends e implements d {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f1876e;

    /* renamed from: c, reason: collision with root package name */
    public Context f1877c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f1878d;

    static {
        f1876e = Build.VERSION.SDK_INT < 29;
    }

    public c() {
        o oVar;
        int i2 = o.f1947f;
        Intrinsics.checkNotNullParameter("com.android.org.conscrypt", "packageName");
        try {
            Class<?> sslSocketClass = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            Class<?> sslSocketFactoryClass = Class.forName("com.android.org.conscrypt.OpenSSLSocketFactoryImpl");
            Class<?> paramClass = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
            Intrinsics.checkNotNullParameter(sslSocketFactoryClass, "sslSocketFactoryClass");
            Intrinsics.checkNotNullParameter(paramClass, "paramClass");
            oVar = new o(sslSocketClass);
        } catch (Exception e7) {
            CopyOnWriteArraySet copyOnWriteArraySet = O6.c.f1933a;
            String name = w.class.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            O6.c.a(name, 5, "unable to load android socket classes", e7);
            oVar = null;
        }
        int i5 = 0;
        n[] elements = {oVar, new m(O6.e.f1936e), new m(k.f1943a), new m(h.f1941a)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        ArrayList l7 = p.l(elements);
        ArrayList arrayList = new ArrayList();
        int size = l7.size();
        while (i5 < size) {
            Object obj = l7.get(i5);
            i5++;
            if (((n) obj).c()) {
                arrayList.add(obj);
            }
        }
        this.f1878d = arrayList;
    }

    @Override // N6.d
    public final void a(Context context) {
        this.f1877c = context;
    }

    @Override // N6.d
    public final Context b() {
        return this.f1877c;
    }

    @Override // N6.e
    public final AbstractC0169a c(X509TrustManager trustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(trustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        O6.b bVar = x509TrustManagerExtensions != null ? new O6.b(trustManager, x509TrustManagerExtensions) : null;
        return bVar != null ? bVar : super.c(trustManager);
    }

    @Override // N6.e
    public final R6.d d(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            StrictMode.noteSlowCall("buildTrustRootIndex");
            Method declaredMethod = trustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new b(trustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.d(trustManager);
        }
    }

    @Override // N6.e
    public final void e(SSLSocket sslSocket, String str, List protocols) {
        Object obj;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        ArrayList arrayList = this.f1878d;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i2);
            i2++;
            if (((n) obj).a(sslSocket)) {
                break;
            }
        }
        n nVar = (n) obj;
        if (nVar != null) {
            nVar.d(sslSocket, str, protocols);
        }
    }

    @Override // N6.e
    public final void f(Socket socket, InetSocketAddress address, int i2) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(address, "address");
        try {
            socket.connect(address, i2);
        } catch (ClassCastException e7) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e7;
            }
            throw new IOException("Exception in connect", e7);
        }
    }

    @Override // N6.e
    public final String g(SSLSocket sslSocket) {
        Object obj;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        ArrayList arrayList = this.f1878d;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i2);
            i2++;
            if (((n) obj).a(sslSocket)) {
                break;
            }
        }
        n nVar = (n) obj;
        if (nVar != null) {
            return nVar.b(sslSocket);
        }
        return null;
    }

    @Override // N6.e
    public final boolean i(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // N6.e
    public final void j(String message, int i2, Throwable th) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (i2 == 5) {
            Log.w("OkHttp", message, th);
        } else {
            Log.i("OkHttp", message, th);
        }
    }

    @Override // N6.e
    public final SSLContext l() {
        StrictMode.noteSlowCall("newSSLContext");
        return super.l();
    }
}
