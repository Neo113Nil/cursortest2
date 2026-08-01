package u1;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import k0.z;

/* loaded from: classes.dex */
public final class a extends n {
    public static final boolean d;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3944c;

    static {
        d = M0.e.m() && Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        ArrayList v02 = T0.g.v0(new v1.m[]{(!M0.e.m() || Build.VERSION.SDK_INT < 29) ? null : new v1.a(), new v1.l(v1.f.f4170f), new v1.l(v1.j.f4176a), new v1.l(v1.h.f4175a)});
        ArrayList arrayList = new ArrayList();
        Iterator it = v02.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((v1.m) next).c()) {
                arrayList.add(next);
            }
        }
        this.f3944c = arrayList;
    }

    @Override // u1.n
    public final z b(X509TrustManager x509TrustManager) {
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
        Iterator it = this.f3944c.iterator();
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
        Iterator it = this.f3944c.iterator();
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
