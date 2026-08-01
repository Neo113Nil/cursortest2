package k3;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class a extends o {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f2820d;
    public final ArrayList c;

    static {
        f2820d = g2.f.o() && Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        int i4 = 0;
        ArrayList G = n2.f.G(new l3.m[]{(!g2.f.o() || Build.VERSION.SDK_INT < 29) ? null : new l3.a(), new l3.l(l3.f.f2888f), new l3.l(l3.j.f2894a), new l3.l(l3.h.f2893a)});
        ArrayList arrayList = new ArrayList();
        int size = G.size();
        while (i4 < size) {
            Object obj = G.get(i4);
            i4++;
            if (((l3.m) obj).c()) {
                arrayList.add(obj);
            }
        }
        this.c = arrayList;
    }

    @Override // k3.o
    public final l0.g b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        l3.b bVar = x509TrustManagerExtensions != null ? new l3.b(x509TrustManager, x509TrustManagerExtensions) : null;
        return bVar != null ? bVar : new o3.a(c(x509TrustManager));
    }

    @Override // k3.o
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        u2.c.e(list, "protocols");
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i4);
            i4++;
            if (((l3.m) obj).a(sSLSocket)) {
                break;
            }
        }
        l3.m mVar = (l3.m) obj;
        if (mVar != null) {
            mVar.d(sSLSocket, str, list);
        }
    }

    @Override // k3.o
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i4);
            i4++;
            if (((l3.m) obj).a(sSLSocket)) {
                break;
            }
        }
        l3.m mVar = (l3.m) obj;
        if (mVar != null) {
            return mVar.b(sSLSocket);
        }
        return null;
    }

    @Override // k3.o
    public final boolean h(String str) {
        u2.c.e(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
