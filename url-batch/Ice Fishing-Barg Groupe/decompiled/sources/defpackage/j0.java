package defpackage;

import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.CloseGuard;
import android.util.Log;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class j0 extends km1 implements ms {
    public static final i0 Companion = new i0();
    public static final boolean e9gEMXR7LXtO;
    public Context TSizfFm2Yiuu;
    public final ArrayList Y1f8riQaR6yg;

    static {
        km1.Companion.getClass();
        e9gEMXR7LXtO = Build.VERSION.SDK_INT >= 29;
    }

    public j0() {
        l0.Companion.getClass();
        km1.Companion.getClass();
        l0 l0Var = Build.VERSION.SDK_INT >= 29 ? new l0() : null;
        b6.Companion.getClass();
        px pxVar = new px(b6.e9gEMXR7LXtO);
        or.Companion.getClass();
        px pxVar2 = new px(or.PxuCJdSBwIXG);
        oe.Companion.getClass();
        int i = 0;
        ArrayList uURZJOrwXbxn = na.uURZJOrwXbxn(new h82[]{l0Var, pxVar, pxVar2, new px(oe.PxuCJdSBwIXG)});
        ArrayList arrayList = new ArrayList();
        int size = uURZJOrwXbxn.size();
        while (i < size) {
            Object obj = uURZJOrwXbxn.get(i);
            i++;
            if (((h82) obj).TSizfFm2Yiuu()) {
                arrayList.add(obj);
            }
        }
        this.Y1f8riQaR6yg = arrayList;
    }

    @Override // defpackage.km1
    public final void OPXfSBeufaJ8(String str, int i, Throwable th) {
        if (i == 5) {
            w4.Companion.getClass();
            Log.w("OkHttp", str, th);
        } else {
            w4.Companion.getClass();
            Log.i("OkHttp", str, th);
        }
    }

    @Override // defpackage.ms
    public final void PxuCJdSBwIXG(Context context) {
        this.TSizfFm2Yiuu = context;
    }

    @Override // defpackage.km1
    public final Object RAsUl2FVSrh6() {
        if (Build.VERSION.SDK_INT < 30) {
            return super.RAsUl2FVSrh6();
        }
        CloseGuard RAsUl2FVSrh6 = uURZJOrwXbxn.RAsUl2FVSrh6();
        RAsUl2FVSrh6.open("response.body().close()");
        return RAsUl2FVSrh6;
    }

    @Override // defpackage.km1
    public final pi TSizfFm2Yiuu(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        w0.Companion.getClass();
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        w0 w0Var = x509TrustManagerExtensions != null ? new w0(x509TrustManager, x509TrustManagerExtensions) : null;
        if (w0Var != null) {
            return w0Var;
        }
        StrictMode.noteSlowCall("buildTrustRootIndex");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        return new xc(new id((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length)));
    }

    @Override // defpackage.km1
    public final void Y1f8riQaR6yg(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        list.getClass();
        ArrayList arrayList = this.Y1f8riQaR6yg;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
            if (((h82) obj).lS5Rgt96tfkO(sSLSocket)) {
                break;
            }
        }
        h82 h82Var = (h82) obj;
        if (h82Var != null) {
            h82Var.Y1f8riQaR6yg(sSLSocket, str, list);
        }
    }

    @Override // defpackage.km1
    public final String a92UlCVFR9N8(SSLSocket sSLSocket) {
        Object obj;
        ArrayList arrayList = this.Y1f8riQaR6yg;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
            if (((h82) obj).lS5Rgt96tfkO(sSLSocket)) {
                break;
            }
        }
        h82 h82Var = (h82) obj;
        if (h82Var != null) {
            return h82Var.PxuCJdSBwIXG(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.km1
    public final SSLContext dgRBjINgWbAK() {
        StrictMode.noteSlowCall("newSSLContext");
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.getClass();
        return sSLContext;
    }

    @Override // defpackage.ms
    public final Context lS5Rgt96tfkO() {
        return this.TSizfFm2Yiuu;
    }

    @Override // defpackage.km1
    public final boolean rtx2ld2ELZv4(String str) {
        str.getClass();
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // defpackage.km1
    public final void wdg6QnbFHrFF(Object obj, String str) {
        if (Build.VERSION.SDK_INT < 30) {
            super.wdg6QnbFHrFF(obj, str);
        } else {
            obj.getClass();
            uURZJOrwXbxn.rtx2ld2ELZv4(obj).warnIfOpen();
        }
    }
}
