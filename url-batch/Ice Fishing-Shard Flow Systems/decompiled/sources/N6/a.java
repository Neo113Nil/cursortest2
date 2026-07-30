package N6;

import O6.h;
import O6.k;
import O6.m;
import O6.n;
import a.AbstractC0169a;
import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.CloseGuard;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.p;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a extends e implements d {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f1871e;

    /* renamed from: c, reason: collision with root package name */
    public Context f1872c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f1873d;

    static {
        f1871e = Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        int i2 = 0;
        n[] elements = {Build.VERSION.SDK_INT >= 29 ? new O6.a() : null, new m(O6.e.f1936e), new m(k.f1943a), new m(h.f1941a)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        ArrayList l7 = p.l(elements);
        ArrayList arrayList = new ArrayList();
        int size = l7.size();
        while (i2 < size) {
            Object obj = l7.get(i2);
            i2++;
            if (((n) obj).c()) {
                arrayList.add(obj);
            }
        }
        this.f1873d = arrayList;
    }

    @Override // N6.d
    public final void a(Context context) {
        this.f1872c = context;
    }

    @Override // N6.d
    public final Context b() {
        return this.f1872c;
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
        StrictMode.noteSlowCall("buildTrustRootIndex");
        return super.d(trustManager);
    }

    @Override // N6.e
    public final void e(SSLSocket sslSocket, String str, List protocols) {
        Object obj;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        ArrayList arrayList = this.f1873d;
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
    public final String g(SSLSocket sslSocket) {
        Object obj;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        ArrayList arrayList = this.f1873d;
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
    public final Object h() {
        Intrinsics.checkNotNullParameter("response.body().close()", "closer");
        if (Build.VERSION.SDK_INT < 30) {
            return super.h();
        }
        CloseGuard f7 = E0.a.f();
        f7.open("response.body().close()");
        return f7;
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
            boolean z7 = c.f1876e;
            Log.w("OkHttp", message, th);
        } else {
            boolean z8 = c.f1876e;
            Log.i("OkHttp", message, th);
        }
    }

    @Override // N6.e
    public final void k(Object obj, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (Build.VERSION.SDK_INT < 30) {
            super.k(obj, message);
        } else {
            Intrinsics.c(obj, "null cannot be cast to non-null type android.util.CloseGuard");
            E0.a.g(obj).warnIfOpen();
        }
    }

    @Override // N6.e
    public final SSLContext l() {
        StrictMode.noteSlowCall("newSSLContext");
        return super.l();
    }
}
