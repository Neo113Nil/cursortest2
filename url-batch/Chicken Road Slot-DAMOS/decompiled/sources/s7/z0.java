package s7;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.internal.measurement.c9;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class z0 extends d4 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f9138r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0(j4 j4Var, int i3) {
        super(j4Var);
        this.f9138r = i3;
    }

    @Override // s7.d4
    public final void v() {
        int i3 = this.f9138r;
    }

    public boolean w() {
        t();
        ConnectivityManager connectivityManager = (ConnectivityManager) ((q1) this.f1478d).f8932d.getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return networkInfo != null && networkInfo.isConnected();
    }

    public void z(String str, e4 e4Var, c9 c9Var, x0 x0Var) {
        String str2;
        URL url;
        byte[] a9;
        o1 o1Var;
        Map map;
        String str3 = e4Var.f8678a;
        q1 q1Var = (q1) this.f1478d;
        s();
        t();
        try {
            url = new URI(str3).toURL();
            this.f9150e.j0();
            a9 = c9Var.a();
            o1Var = q1Var.f8938u;
            q1.l(o1Var);
            map = e4Var.f8679b;
            if (map == null) {
                map = Collections.EMPTY_MAP;
            }
            str2 = str;
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            str2 = str;
        }
        try {
            o1Var.E(new y0(this, str2, url, a9, map, x0Var));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            v0 v0Var = q1Var.f8937t;
            q1.l(v0Var);
            v0Var.f9050t.c(v0.A(str2), str3, "Failed to parse URL. Not uploading MeasurementBatch. appId");
        }
    }

    private final void x() {
    }

    private final void y() {
    }
}
