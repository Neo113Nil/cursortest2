package defpackage;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class n2 extends zz {
    public static final boolean d;
    public final ArrayList c;

    static {
        d = ky.g() && Build.VERSION.SDK_INT >= 29;
    }

    public n2() {
        int i = 0;
        ArrayList c0 = a7.c0(new c60[]{(!ky.g() || Build.VERSION.SDK_INT < 29) ? null : new o2(), new zg(w2.f), new zg(jd.a), new zg(e9.a)});
        ArrayList arrayList = new ArrayList();
        int size = c0.size();
        while (i < size) {
            Object obj = c0.get(i);
            i++;
            if (((c60) obj).c()) {
                arrayList.add(obj);
            }
        }
        this.c = arrayList;
    }

    @Override // defpackage.zz
    public final xf b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        p2 p2Var = x509TrustManagerExtensions != null ? new p2(x509TrustManager, x509TrustManagerExtensions) : null;
        return p2Var != null ? p2Var : new h8(c(x509TrustManager));
    }

    @Override // defpackage.zz
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
            if (((c60) obj).b(sSLSocket)) {
                break;
            }
        }
        c60 c60Var = (c60) obj;
        if (c60Var != null) {
            c60Var.d(sSLSocket, str, list);
        }
    }

    @Override // defpackage.zz
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
            if (((c60) obj).b(sSLSocket)) {
                break;
            }
        }
        c60 c60Var = (c60) obj;
        if (c60Var != null) {
            return c60Var.a(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.zz
    public final boolean h(String str) {
        str.getClass();
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
