package a8;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a extends o {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f537d;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f538c;

    static {
        f537d = j4.i.p() && Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        int i7 = 0;
        ArrayList f02 = e6.k.f0(new b8.n[]{(!j4.i.p() || Build.VERSION.SDK_INT < 29) ? null : new b8.a(), new b8.m(b8.f.f1406f), new b8.m(b8.k.f1416a), new b8.m(b8.h.f1412a)});
        ArrayList arrayList = new ArrayList();
        int size = f02.size();
        while (i7 < size) {
            Object obj = f02.get(i7);
            i7++;
            if (((b8.n) obj).c()) {
                arrayList.add(obj);
            }
        }
        this.f538c = arrayList;
    }

    @Override // a8.o
    public final t6.a b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        b8.b bVar = x509TrustManagerExtensions != null ? new b8.b(x509TrustManager, x509TrustManagerExtensions) : null;
        return bVar != null ? bVar : new e8.a(c(x509TrustManager));
    }

    @Override // a8.o
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        r6.k.f(list, "protocols");
        ArrayList arrayList = this.f538c;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i7);
            i7++;
            if (((b8.n) obj).a(sSLSocket)) {
                break;
            }
        }
        b8.n nVar = (b8.n) obj;
        if (nVar != null) {
            nVar.d(sSLSocket, str, list);
        }
    }

    @Override // a8.o
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        ArrayList arrayList = this.f538c;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i7);
            i7++;
            if (((b8.n) obj).a(sSLSocket)) {
                break;
            }
        }
        b8.n nVar = (b8.n) obj;
        if (nVar != null) {
            return nVar.b(sSLSocket);
        }
        return null;
    }

    @Override // a8.o
    public final boolean h(String str) {
        r6.k.f(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
