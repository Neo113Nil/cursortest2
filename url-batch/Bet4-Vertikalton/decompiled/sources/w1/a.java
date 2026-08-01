package w1;

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
    public static final boolean d;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f4170c;

    static {
        d = J0.e.m() && Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        ArrayList g02 = S0.f.g0(new x1.m[]{(!J0.e.m() || Build.VERSION.SDK_INT < 29) ? null : new x1.a(), new x1.l(x1.f.f4239f), new x1.l(x1.j.f4245a), new x1.l(x1.h.f4244a)});
        ArrayList arrayList = new ArrayList();
        Iterator it = g02.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((x1.m) next).c()) {
                arrayList.add(next);
            }
        }
        this.f4170c = arrayList;
    }

    @Override // w1.n
    public final d b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        x1.b bVar = x509TrustManagerExtensions != null ? new x1.b(x509TrustManager, x509TrustManagerExtensions) : null;
        return bVar != null ? bVar : new A1.a(c(x509TrustManager));
    }

    @Override // w1.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        d1.d.e(list, "protocols");
        Iterator it = this.f4170c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((x1.m) obj).a(sSLSocket)) {
                    break;
                }
            }
        }
        x1.m mVar = (x1.m) obj;
        if (mVar != null) {
            mVar.d(sSLSocket, str, list);
        }
    }

    @Override // w1.n
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.f4170c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((x1.m) obj).a(sSLSocket)) {
                break;
            }
        }
        x1.m mVar = (x1.m) obj;
        if (mVar != null) {
            return mVar.b(sSLSocket);
        }
        return null;
    }

    @Override // w1.n
    public final boolean h(String str) {
        d1.d.e(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
