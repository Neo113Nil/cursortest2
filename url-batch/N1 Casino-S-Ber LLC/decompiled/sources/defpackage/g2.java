package defpackage;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class g2 extends ww {
    public static final boolean d;
    public final ArrayList c;

    static {
        d = vw.g() && Build.VERSION.SDK_INT >= 29;
    }

    public g2() {
        int i = 0;
        ArrayList g0 = q6.g0(new a30[]{(!vw.g() || Build.VERSION.SDK_INT < 29) ? null : new h2(), new cf(n2.f), new cf(jc.a), new cf(r8.a)});
        ArrayList arrayList = new ArrayList();
        int size = g0.size();
        while (i < size) {
            Object obj = g0.get(i);
            i++;
            if (((a30) obj).c()) {
                arrayList.add(obj);
            }
        }
        this.c = arrayList;
    }

    @Override // defpackage.ww
    public final o8 b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        i2 i2Var = x509TrustManagerExtensions != null ? new i2(x509TrustManager, x509TrustManagerExtensions) : null;
        return i2Var != null ? i2Var : new u7(c(x509TrustManager));
    }

    @Override // defpackage.ww
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
            if (((a30) obj).b(sSLSocket)) {
                break;
            }
        }
        a30 a30Var = (a30) obj;
        if (a30Var != null) {
            a30Var.d(sSLSocket, str, list);
        }
    }

    @Override // defpackage.ww
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
            if (((a30) obj).b(sSLSocket)) {
                break;
            }
        }
        a30 a30Var = (a30) obj;
        if (a30Var != null) {
            return a30Var.a(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.ww
    public final boolean h(String str) {
        str.getClass();
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
