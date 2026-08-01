package b4;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class a extends n {
    public static final boolean d;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f828c;

    static {
        d = o2.f.j() && Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        int i = 0;
        ArrayList L = x2.g.L(new c4.m[]{(!o2.f.j() || Build.VERSION.SDK_INT < 29) ? null : new c4.a(), new c4.l(c4.f.f888f), new c4.l(c4.j.f894a), new c4.l(c4.h.f893a)});
        ArrayList arrayList = new ArrayList();
        int size = L.size();
        while (i < size) {
            Object obj = L.get(i);
            i++;
            if (((c4.m) obj).c()) {
                arrayList.add(obj);
            }
        }
        this.f828c = arrayList;
    }

    @Override // b4.n
    public final d b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        c4.b bVar = x509TrustManagerExtensions != null ? new c4.b(x509TrustManager, x509TrustManagerExtensions) : null;
        return bVar != null ? bVar : new f4.a(c(x509TrustManager));
    }

    @Override // b4.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        i3.d.e(list, "protocols");
        ArrayList arrayList = this.f828c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
            if (((c4.m) obj).a(sSLSocket)) {
                break;
            }
        }
        c4.m mVar = (c4.m) obj;
        if (mVar != null) {
            mVar.d(sSLSocket, str, list);
        }
    }

    @Override // b4.n
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        ArrayList arrayList = this.f828c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
            if (((c4.m) obj).a(sSLSocket)) {
                break;
            }
        }
        c4.m mVar = (c4.m) obj;
        if (mVar != null) {
            return mVar.b(sSLSocket);
        }
        return null;
    }

    @Override // b4.n
    public final boolean h(String str) {
        i3.d.e(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
