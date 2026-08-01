package s1;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import k0.y;

/* loaded from: classes.dex */
public final class a extends n {
    public static final boolean d;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3802c;

    static {
        d = I0.e.n() && Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        ArrayList r02 = R0.g.r0(new t1.m[]{(!I0.e.n() || Build.VERSION.SDK_INT < 29) ? null : new t1.a(), new t1.l(t1.f.f3878f), new t1.l(t1.j.f3884a), new t1.l(t1.h.f3883a)});
        ArrayList arrayList = new ArrayList();
        Iterator it = r02.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((t1.m) next).c()) {
                arrayList.add(next);
            }
        }
        this.f3802c = arrayList;
    }

    @Override // s1.n
    public final y b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        t1.b bVar = x509TrustManagerExtensions != null ? new t1.b(x509TrustManager, x509TrustManagerExtensions) : null;
        return bVar != null ? bVar : new w1.a(c(x509TrustManager));
    }

    @Override // s1.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        Z0.d.e(list, "protocols");
        Iterator it = this.f3802c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((t1.m) obj).a(sSLSocket)) {
                    break;
                }
            }
        }
        t1.m mVar = (t1.m) obj;
        if (mVar != null) {
            mVar.d(sSLSocket, str, list);
        }
    }

    @Override // s1.n
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.f3802c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((t1.m) obj).a(sSLSocket)) {
                break;
            }
        }
        t1.m mVar = (t1.m) obj;
        if (mVar != null) {
            return mVar.b(sSLSocket);
        }
        return null;
    }

    @Override // s1.n
    public final boolean h(String str) {
        Z0.d.e(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
