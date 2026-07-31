package O2;

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
    public static final boolean f3883d;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3884c;

    static {
        f3883d = A1.i.o() && Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        ArrayList B02 = S1.m.B0((!A1.i.o() || Build.VERSION.SDK_INT < 29) ? null : new P2.a(), new P2.m(P2.f.f3929f), new P2.m(P2.k.f3939a), new P2.m(P2.h.f3935a));
        ArrayList arrayList = new ArrayList();
        Iterator it = B02.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((P2.n) next).c()) {
                arrayList.add(next);
            }
        }
        this.f3884c = arrayList;
    }

    @Override // O2.n
    public final l0.c b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        P2.b bVar = x509TrustManagerExtensions != null ? new P2.b(x509TrustManager, x509TrustManagerExtensions) : null;
        return bVar != null ? bVar : new S2.a(c(x509TrustManager));
    }

    @Override // O2.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        f2.j.f(list, "protocols");
        Iterator it = this.f3884c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((P2.n) obj).a(sSLSocket)) {
                    break;
                }
            }
        }
        P2.n nVar = (P2.n) obj;
        if (nVar != null) {
            nVar.d(sSLSocket, str, list);
        }
    }

    @Override // O2.n
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.f3884c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((P2.n) obj).a(sSLSocket)) {
                break;
            }
        }
        P2.n nVar = (P2.n) obj;
        if (nVar != null) {
            return nVar.b(sSLSocket);
        }
        return null;
    }

    @Override // O2.n
    public final boolean h(String str) {
        f2.j.f(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
