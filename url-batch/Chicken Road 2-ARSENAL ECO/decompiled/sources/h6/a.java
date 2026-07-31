package h6;

import D.U;
import a1.AbstractC0223a;
import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.CloseGuard;
import android.util.Log;
import i6.h;
import i6.k;
import i6.m;
import i6.n;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.i;
import l5.AbstractC0505i;

/* loaded from: classes.dex */
public final class a extends e implements d {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f4347e;

    /* renamed from: c, reason: collision with root package name */
    public Context f4348c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f4349d;

    static {
        f4347e = Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        int i7 = 0;
        ArrayList K6 = AbstractC0505i.K(new n[]{Build.VERSION.SDK_INT >= 29 ? new i6.a() : null, new m(i6.e.f4437e), new m(k.f4444a), new m(h.f4442a)});
        ArrayList arrayList = new ArrayList();
        int size = K6.size();
        while (i7 < size) {
            Object obj = K6.get(i7);
            i7++;
            if (((n) obj).c()) {
                arrayList.add(obj);
            }
        }
        this.f4349d = arrayList;
    }

    @Override // h6.d
    public final void a(Context context) {
        this.f4348c = context;
    }

    @Override // h6.d
    public final Context b() {
        return this.f4348c;
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
        StrictMode.noteSlowCall("buildTrustRootIndex");
        return super.d(trustManager);
    }

    @Override // h6.e
    public final void e(SSLSocket sSLSocket, String str, List protocols) {
        Object obj;
        i.e(protocols, "protocols");
        ArrayList arrayList = this.f4349d;
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
    public final String g(SSLSocket sSLSocket) {
        Object obj;
        ArrayList arrayList = this.f4349d;
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
    public final Object h() {
        if (Build.VERSION.SDK_INT < 30) {
            return super.h();
        }
        CloseGuard e4 = U.e();
        e4.open("response.body().close()");
        return e4;
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
            boolean z5 = c.f4352e;
            Log.w("OkHttp", message, th);
        } else {
            boolean z6 = c.f4352e;
            Log.i("OkHttp", message, th);
        }
    }

    @Override // h6.e
    public final void k(Object obj, String message) {
        i.e(message, "message");
        if (Build.VERSION.SDK_INT < 30) {
            super.k(obj, message);
        } else {
            i.c(obj, "null cannot be cast to non-null type android.util.CloseGuard");
            U.f(obj).warnIfOpen();
        }
    }

    @Override // h6.e
    public final SSLContext l() {
        StrictMode.noteSlowCall("newSSLContext");
        return super.l();
    }
}
