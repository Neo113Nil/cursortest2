package x1;

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
    public final ArrayList f4266c;

    static {
        d = I0.e.m() && Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        ArrayList s02 = W0.g.s0(new y1.m[]{(!I0.e.m() || Build.VERSION.SDK_INT < 29) ? null : new y1.a(), new y1.l(y1.f.f4297f), new y1.l(y1.j.f4303a), new y1.l(y1.h.f4302a)});
        ArrayList arrayList = new ArrayList();
        Iterator it = s02.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((y1.m) next).c()) {
                arrayList.add(next);
            }
        }
        this.f4266c = arrayList;
    }

    @Override // x1.n
    public final l b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        y1.b bVar = x509TrustManagerExtensions != null ? new y1.b(x509TrustManager, x509TrustManagerExtensions) : null;
        return bVar != null ? bVar : new B1.a(c(x509TrustManager));
    }

    @Override // x1.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        e1.d.e(list, "protocols");
        Iterator it = this.f4266c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((y1.m) obj).a(sSLSocket)) {
                    break;
                }
            }
        }
        y1.m mVar = (y1.m) obj;
        if (mVar != null) {
            mVar.d(sSLSocket, str, list);
        }
    }

    @Override // x1.n
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.f4266c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((y1.m) obj).a(sSLSocket)) {
                break;
            }
        }
        y1.m mVar = (y1.m) obj;
        if (mVar != null) {
            return mVar.b(sSLSocket);
        }
        return null;
    }

    @Override // x1.n
    public final boolean h(String str) {
        e1.d.e(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
