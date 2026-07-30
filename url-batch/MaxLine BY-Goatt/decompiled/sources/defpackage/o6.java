package defpackage;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class o6 extends r12 {
    public static final boolean d;
    public final ArrayList c;

    static {
        d = nm1.t() && Build.VERSION.SDK_INT >= 29;
    }

    public o6() {
        int i = 0;
        ArrayList p = oi.p(new in2[]{(!nm1.t() || Build.VERSION.SDK_INT < 29) ? null : new p6(), new k90(qb.f), new k90(s10.a), new k90(dp.a)});
        ArrayList arrayList = new ArrayList();
        int size = p.size();
        while (i < size) {
            Object obj = p.get(i);
            i++;
            if (((in2) obj).b()) {
                arrayList.add(obj);
            }
        }
        this.c = arrayList;
    }

    @Override // defpackage.r12
    public final yj1 b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        a7 a7Var = x509TrustManagerExtensions != null ? new a7(x509TrustManager, x509TrustManagerExtensions) : null;
        return a7Var != null ? a7Var : new pn(c(x509TrustManager));
    }

    @Override // defpackage.r12
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
            if (((in2) obj).c(sSLSocket)) {
                break;
            }
        }
        in2 in2Var = (in2) obj;
        if (in2Var != null) {
            in2Var.d(sSLSocket, str, list);
        }
    }

    @Override // defpackage.r12
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
            if (((in2) obj).c(sSLSocket)) {
                break;
            }
        }
        in2 in2Var = (in2) obj;
        if (in2Var != null) {
            return in2Var.a(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.r12
    public final boolean h(String str) {
        str.getClass();
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
