package u1;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import j0.AbstractC0143a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class a extends n {
    public static final boolean d;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3884c;

    static {
        d = I0.e.m() && Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        ArrayList n0 = T0.g.n0(new v1.m[]{(!I0.e.m() || Build.VERSION.SDK_INT < 29) ? null : new v1.a(), new v1.l(v1.f.f4116f), new v1.l(v1.j.f4122a), new v1.l(v1.h.f4121a)});
        ArrayList arrayList = new ArrayList();
        Iterator it = n0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((v1.m) next).c()) {
                arrayList.add(next);
            }
        }
        this.f3884c = arrayList;
    }

    @Override // u1.n
    public final AbstractC0143a b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        v1.b bVar = x509TrustManagerExtensions != null ? new v1.b(x509TrustManager, x509TrustManagerExtensions) : null;
        return bVar != null ? bVar : new y1.a(c(x509TrustManager));
    }

    @Override // u1.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        b1.d.e(list, "protocols");
        Iterator it = this.f3884c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((v1.m) obj).a(sSLSocket)) {
                    break;
                }
            }
        }
        v1.m mVar = (v1.m) obj;
        if (mVar != null) {
            mVar.d(sSLSocket, str, list);
        }
    }

    @Override // u1.n
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.f3884c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((v1.m) obj).a(sSLSocket)) {
                break;
            }
        }
        v1.m mVar = (v1.m) obj;
        if (mVar != null) {
            return mVar.b(sSLSocket);
        }
        return null;
    }

    @Override // u1.n
    public final boolean h(String str) {
        b1.d.e(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
