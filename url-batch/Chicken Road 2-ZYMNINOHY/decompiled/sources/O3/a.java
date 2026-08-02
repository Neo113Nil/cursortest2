package O3;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class a extends n {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f2056d;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2057c;

    static {
        f2056d = a2.i.r() && Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        int i4 = 0;
        ArrayList T4 = d3.g.T(new P3.n[]{(!a2.i.r() || Build.VERSION.SDK_INT < 29) ? null : new P3.a(), new P3.m(P3.f.f2098f), new P3.m(P3.k.f2108a), new P3.m(P3.h.f2104a)});
        ArrayList arrayList = new ArrayList();
        int size = T4.size();
        while (i4 < size) {
            Object obj = T4.get(i4);
            i4++;
            if (((P3.n) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.f2057c = arrayList;
    }

    @Override // O3.n
    public final l b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        P3.b bVar = x509TrustManagerExtensions != null ? new P3.b(x509TrustManager, x509TrustManagerExtensions) : null;
        return bVar == null ? new S3.a(c(x509TrustManager)) : bVar;
    }

    @Override // O3.n
    public final void d(SSLSocket sSLSocket, String str, List protocols) {
        Object obj;
        kotlin.jvm.internal.i.e(protocols, "protocols");
        ArrayList arrayList = this.f2057c;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i4);
            i4++;
            if (((P3.n) obj).a(sSLSocket)) {
                break;
            }
        }
        P3.n nVar = (P3.n) obj;
        if (nVar == null) {
            return;
        }
        nVar.c(sSLSocket, str, protocols);
    }

    @Override // O3.n
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        ArrayList arrayList = this.f2057c;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i4);
            i4++;
            if (((P3.n) obj).a(sSLSocket)) {
                break;
            }
        }
        P3.n nVar = (P3.n) obj;
        if (nVar == null) {
            return null;
        }
        return nVar.b(sSLSocket);
    }

    @Override // O3.n
    public final boolean h(String hostname) {
        kotlin.jvm.internal.i.e(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }
}
