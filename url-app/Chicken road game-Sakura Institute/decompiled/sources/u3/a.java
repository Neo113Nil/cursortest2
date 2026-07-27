package u3;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;
import m3.s;
import z2.C1439w;

/* loaded from: classes.dex */
public final class a extends n {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f10931d;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f10932c;

    static {
        f10931d = H1.f.o() && Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        v3.m[] elements = {(!H1.f.o() || Build.VERSION.SDK_INT < 29) ? null : new v3.a(), new v3.l(v3.f.f10998f), new v3.l(v3.j.f11005a), new v3.l(v3.h.f11004a)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        ArrayList t4 = C1439w.t(elements);
        ArrayList arrayList = new ArrayList();
        Iterator it = t4.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((v3.m) next).c()) {
                arrayList.add(next);
            }
        }
        this.f10932c = arrayList;
    }

    @Override // u3.n
    public final s b(X509TrustManager trustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(trustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        v3.b bVar = x509TrustManagerExtensions != null ? new v3.b(trustManager, x509TrustManagerExtensions) : null;
        return bVar != null ? bVar : super.b(trustManager);
    }

    @Override // u3.n
    public final void d(SSLSocket sslSocket, String str, List protocols) {
        Object obj;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Iterator it = this.f10932c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((v3.m) obj).a(sslSocket)) {
                    break;
                }
            }
        }
        v3.m mVar = (v3.m) obj;
        if (mVar != null) {
            mVar.d(sslSocket, str, protocols);
        }
    }

    @Override // u3.n
    public final String f(SSLSocket sslSocket) {
        Object obj;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Iterator it = this.f10932c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((v3.m) obj).a(sslSocket)) {
                break;
            }
        }
        v3.m mVar = (v3.m) obj;
        if (mVar != null) {
            return mVar.b(sslSocket);
        }
        return null;
    }

    @Override // u3.n
    public final boolean h(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }
}
