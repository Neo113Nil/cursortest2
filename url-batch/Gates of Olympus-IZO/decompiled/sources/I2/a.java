package I2;

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
    public static final boolean f2488d;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2489c;

    static {
        f2488d = F0.a.o() && Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        ArrayList d02 = M1.m.d0((!F0.a.o() || Build.VERSION.SDK_INT < 29) ? null : new J2.a(), new J2.m(J2.f.f2621f), new J2.m(J2.k.f2631a), new J2.m(J2.h.f2627a));
        ArrayList arrayList = new ArrayList();
        Iterator it = d02.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((J2.n) next).c()) {
                arrayList.add(next);
            }
        }
        this.f2489c = arrayList;
    }

    @Override // I2.n
    public final l b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        J2.b bVar = x509TrustManagerExtensions != null ? new J2.b(x509TrustManager, x509TrustManagerExtensions) : null;
        return bVar != null ? bVar : new M2.a(c(x509TrustManager));
    }

    @Override // I2.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        Z1.i.f(list, "protocols");
        Iterator it = this.f2489c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((J2.n) obj).a(sSLSocket)) {
                    break;
                }
            }
        }
        J2.n nVar = (J2.n) obj;
        if (nVar != null) {
            nVar.d(sSLSocket, str, list);
        }
    }

    @Override // I2.n
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.f2489c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((J2.n) obj).a(sSLSocket)) {
                break;
            }
        }
        J2.n nVar = (J2.n) obj;
        if (nVar != null) {
            return nVar.b(sSLSocket);
        }
        return null;
    }

    @Override // I2.n
    public final boolean h(String str) {
        Z1.i.f(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
