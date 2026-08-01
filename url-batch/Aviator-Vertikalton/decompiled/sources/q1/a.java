package q1;

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
    public static final boolean f3931d;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3932c;

    static {
        f3931d = H0.e.i() && Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        ArrayList y02 = O0.g.y0(new r1.m[]{(!H0.e.i() || Build.VERSION.SDK_INT < 29) ? null : new r1.a(), new r1.l(r1.f.f3969f), new r1.l(r1.j.f3976a), new r1.l(r1.h.f3975a)});
        ArrayList arrayList = new ArrayList();
        Iterator it = y02.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((r1.m) next).c()) {
                arrayList.add(next);
            }
        }
        this.f3932c = arrayList;
    }

    @Override // q1.n
    public final i1.m b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        r1.b bVar = x509TrustManagerExtensions != null ? new r1.b(x509TrustManager, x509TrustManagerExtensions) : null;
        return bVar != null ? bVar : new u1.a(c(x509TrustManager));
    }

    @Override // q1.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        X0.f.e(list, "protocols");
        Iterator it = this.f3932c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((r1.m) obj).a(sSLSocket)) {
                    break;
                }
            }
        }
        r1.m mVar = (r1.m) obj;
        if (mVar != null) {
            mVar.d(sSLSocket, str, list);
        }
    }

    @Override // q1.n
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.f3932c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((r1.m) obj).a(sSLSocket)) {
                break;
            }
        }
        r1.m mVar = (r1.m) obj;
        if (mVar != null) {
            return mVar.b(sSLSocket);
        }
        return null;
    }

    @Override // q1.n
    public final boolean h(String str) {
        X0.f.e(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
