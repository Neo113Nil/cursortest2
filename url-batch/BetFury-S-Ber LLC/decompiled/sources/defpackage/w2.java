package defpackage;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class w2 extends q50 {
    public static final boolean d;
    public final ArrayList c;

    static {
        d = xy.j() && Build.VERSION.SDK_INT >= 29;
    }

    public w2() {
        int i = 0;
        ArrayList b0 = j7.b0(new fe0[]{(!xy.j() || Build.VERSION.SDK_INT < 29) ? null : new x2(), new ej(f3.f), new ej(ue.a), new ej(q9.a)});
        ArrayList arrayList = new ArrayList();
        int size = b0.size();
        while (i < size) {
            Object obj = b0.get(i);
            i++;
            if (((fe0) obj).c()) {
                arrayList.add(obj);
            }
        }
        this.c = arrayList;
    }

    @Override // defpackage.q50
    public final n9 b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        y2 y2Var = x509TrustManagerExtensions != null ? new y2(x509TrustManager, x509TrustManagerExtensions) : null;
        return y2Var != null ? y2Var : new s8(c(x509TrustManager));
    }

    @Override // defpackage.q50
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
            if (((fe0) obj).b(sSLSocket)) {
                break;
            }
        }
        fe0 fe0Var = (fe0) obj;
        if (fe0Var != null) {
            fe0Var.d(sSLSocket, str, list);
        }
    }

    @Override // defpackage.q50
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
            if (((fe0) obj).b(sSLSocket)) {
                break;
            }
        }
        fe0 fe0Var = (fe0) obj;
        if (fe0Var != null) {
            return fe0Var.a(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.q50
    public final boolean h(String str) {
        str.getClass();
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
