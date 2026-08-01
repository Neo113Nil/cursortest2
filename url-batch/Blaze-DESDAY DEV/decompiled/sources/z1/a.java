package z1;

import A1.o;
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
    public final ArrayList f4346c;

    static {
        d = J0.e.m() && Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        ArrayList h02 = V0.f.h0(new o[]{(!J0.e.m() || Build.VERSION.SDK_INT < 29) ? null : new A1.b(), new A1.n(A1.g.f8f), new A1.n(A1.l.f17a), new A1.n(A1.i.f13a)});
        ArrayList arrayList = new ArrayList();
        Iterator it = h02.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((o) next).c()) {
                arrayList.add(next);
            }
        }
        this.f4346c = arrayList;
    }

    @Override // z1.n
    public final l b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        A1.c cVar = x509TrustManagerExtensions != null ? new A1.c(x509TrustManager, x509TrustManagerExtensions) : null;
        return cVar != null ? cVar : new D1.a(c(x509TrustManager));
    }

    @Override // z1.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        g1.d.e(list, "protocols");
        Iterator it = this.f4346c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((o) obj).a(sSLSocket)) {
                    break;
                }
            }
        }
        o oVar = (o) obj;
        if (oVar != null) {
            oVar.d(sSLSocket, str, list);
        }
    }

    @Override // z1.n
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.f4346c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((o) obj).a(sSLSocket)) {
                break;
            }
        }
        o oVar = (o) obj;
        if (oVar != null) {
            return oVar.b(sSLSocket);
        }
        return null;
    }

    @Override // z1.n
    public final boolean h(String str) {
        g1.d.e(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
