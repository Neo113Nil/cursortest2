package A1;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class a extends o {
    public static final boolean d;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f19c;

    static {
        d = K0.e.m() && Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        ArrayList u02 = W0.f.u0(new B1.n[]{(!K0.e.m() || Build.VERSION.SDK_INT < 29) ? null : new B1.a(), new B1.m(B1.f.f49f), new B1.m(B1.k.f58a), new B1.m(B1.h.f54a)});
        ArrayList arrayList = new ArrayList();
        Iterator it = u02.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((B1.n) next).c()) {
                arrayList.add(next);
            }
        }
        this.f19c = arrayList;
    }

    @Override // A1.o
    public final d b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        B1.b bVar = x509TrustManagerExtensions != null ? new B1.b(x509TrustManager, x509TrustManagerExtensions) : null;
        return bVar != null ? bVar : new E1.a(c(x509TrustManager));
    }

    @Override // A1.o
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        h1.d.e(list, "protocols");
        Iterator it = this.f19c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((B1.n) obj).a(sSLSocket)) {
                    break;
                }
            }
        }
        B1.n nVar = (B1.n) obj;
        if (nVar != null) {
            nVar.d(sSLSocket, str, list);
        }
    }

    @Override // A1.o
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.f19c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((B1.n) obj).a(sSLSocket)) {
                break;
            }
        }
        B1.n nVar = (B1.n) obj;
        if (nVar != null) {
            return nVar.b(sSLSocket);
        }
        return null;
    }

    @Override // A1.o
    public final boolean h(String str) {
        h1.d.e(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
