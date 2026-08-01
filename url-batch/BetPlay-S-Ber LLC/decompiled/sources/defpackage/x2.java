package defpackage;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class x2 extends jx {
    public static final boolean d;
    public final ArrayList c;

    static {
        d = ix.h() && Build.VERSION.SDK_INT >= 29;
    }

    public x2() {
        int i = 0;
        ArrayList j0 = h7.j0(new l30[]{(!ix.h() || Build.VERSION.SDK_INT < 29) ? null : new y2(), new bf(e3.f), new bf(nc.a), new bf(m8.a)});
        ArrayList arrayList = new ArrayList();
        int size = j0.size();
        while (i < size) {
            Object obj = j0.get(i);
            i++;
            if (((l30) obj).c()) {
                arrayList.add(obj);
            }
        }
        this.c = arrayList;
    }

    @Override // defpackage.jx
    public final l70 b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        z2 z2Var = x509TrustManagerExtensions != null ? new z2(x509TrustManager, x509TrustManagerExtensions) : null;
        return z2Var != null ? z2Var : new a8(c(x509TrustManager));
    }

    @Override // defpackage.jx
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        list.getClass();
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
            if (((l30) obj).b(sSLSocket)) {
                break;
            }
        }
        l30 l30Var = (l30) obj;
        if (l30Var != null) {
            l30Var.d(sSLSocket, str, list);
        }
    }

    @Override // defpackage.jx
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
            if (((l30) obj).b(sSLSocket)) {
                break;
            }
        }
        l30 l30Var = (l30) obj;
        if (l30Var != null) {
            return l30Var.a(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.jx
    public final boolean h(String str) {
        str.getClass();
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
