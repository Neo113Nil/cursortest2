package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.Map;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ti3 implements mm3 {
    public final /* synthetic */ int m;
    public final pj3 n;

    public ti3(oq3 oq3Var) {
        this.m = 0;
        this.n = oq3Var.x;
    }

    @Override // defpackage.mm3, defpackage.xh3
    public /* synthetic */ void a(String str, int i, Throwable th, byte[] bArr, Map map) {
        this.n.i(i, th, bArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean b() {
        int i = this.m;
        pj3 pj3Var = this.n;
        switch (i) {
            case 0:
                boolean z = false;
                try {
                    mm a = i93.a(pj3Var.m);
                    if (a == null) {
                        vh3 vh3Var = pj3Var.r;
                        pj3.m(vh3Var);
                        vh3Var.z.b("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                        pj3Var = pj3Var;
                    } else {
                        int i2 = a.c(128, "com.android.vending").versionCode;
                        pj3Var = i2;
                        if (i2 >= 80837300) {
                            z = true;
                            pj3Var = i2;
                        }
                    }
                } catch (Exception e) {
                    vh3 vh3Var2 = pj3Var.r;
                    pj3.m(vh3Var2);
                    vh3Var2.z.c(e, "Failed to retrieve Play Store version for Install Referrer");
                }
                return z;
            default:
                vh3 vh3Var3 = pj3Var.r;
                pj3.m(vh3Var3);
                return Log.isLoggable(vh3Var3.G(), 3);
        }
    }

    public void c(Bundle bundle, String str) {
        String uri;
        pj3 pj3Var = this.n;
        lj3 lj3Var = pj3Var.s;
        qi3 qi3Var = pj3Var.q;
        pj3.m(lj3Var);
        lj3Var.v();
        if (pj3Var.b()) {
            return;
        }
        if (bundle.isEmpty()) {
            uri = null;
        } else {
            if (true == str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            uri = builder.build().toString();
        }
        if (TextUtils.isEmpty(uri)) {
            return;
        }
        pj3.k(qi3Var);
        qi3Var.I.e(uri);
        li3 li3Var = qi3Var.J;
        pj3Var.w.getClass();
        li3Var.b(System.currentTimeMillis());
    }

    public boolean d() {
        if (!e()) {
            return false;
        }
        pj3 pj3Var = this.n;
        pj3Var.w.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        qi3 qi3Var = pj3Var.q;
        pj3.k(qi3Var);
        return currentTimeMillis - qi3Var.J.a() > pj3Var.p.D(null, ug3.j0);
    }

    public boolean e() {
        qi3 qi3Var = this.n.q;
        pj3.k(qi3Var);
        return qi3Var.J.a() > 0;
    }

    public /* synthetic */ ti3(pj3 pj3Var, int i) {
        this.m = i;
        this.n = pj3Var;
    }

    public ti3(el3 el3Var, pj3 pj3Var) {
        this.m = 2;
        this.n = pj3Var;
    }
}
