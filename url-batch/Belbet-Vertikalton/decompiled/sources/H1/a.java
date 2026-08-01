package H1;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class a extends n {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f544d;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f545c;

    static {
        f544d = N0.e.l() && Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        ArrayList p02 = X0.j.p0(new I1.n[]{(!N0.e.l() || Build.VERSION.SDK_INT < 29) ? null : new I1.a(), new I1.m(I1.f.f608f), new I1.m(I1.k.f617a), new I1.m(I1.h.f613a)});
        ArrayList arrayList = new ArrayList();
        Iterator it = p02.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((I1.n) next).c()) {
                arrayList.add(next);
            }
        }
        this.f545c = arrayList;
    }

    @Override // H1.n
    public final l b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        I1.b bVar = x509TrustManagerExtensions != null ? new I1.b(x509TrustManager, x509TrustManagerExtensions) : null;
        return bVar != null ? bVar : new L1.a(c(x509TrustManager));
    }

    @Override // H1.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        j1.h.e(list, "protocols");
        Iterator it = this.f545c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((I1.n) obj).a(sSLSocket)) {
                    break;
                }
            }
        }
        I1.n nVar = (I1.n) obj;
        if (nVar != null) {
            nVar.d(sSLSocket, str, list);
        }
    }

    @Override // H1.n
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.f545c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((I1.n) obj).a(sSLSocket)) {
                break;
            }
        }
        I1.n nVar = (I1.n) obj;
        if (nVar != null) {
            return nVar.b(sSLSocket);
        }
        return null;
    }

    @Override // H1.n
    public final boolean h(String str) {
        j1.h.e(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
