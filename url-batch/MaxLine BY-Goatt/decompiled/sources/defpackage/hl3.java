package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.google.firebase.encoders.json.BuildConfig;
import defpackage.l5;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Objects;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class hl3 extends uc3 {
    public final /* synthetic */ int e;
    public final /* synthetic */ jm3 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hl3(jm3 jm3Var, qk3 qk3Var, int i) {
        super(qk3Var);
        this.e = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(jm3Var);
                this.f = jm3Var;
                super(qk3Var);
                break;
            case 2:
                Objects.requireNonNull(jm3Var);
                this.f = jm3Var;
                super(qk3Var);
                break;
            case 3:
                this.f = jm3Var;
                super(qk3Var);
                break;
            default:
                Objects.requireNonNull(jm3Var);
                this.f = jm3Var;
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0127, code lost:
    
        if (r0.d0() >= 234200) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[ADDED_TO_REGION, REMOVE, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0303  */
    @Override // defpackage.uc3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        Pair pair;
        NetworkInfo activeNetworkInfo;
        jc3 f;
        Bundle bundle;
        URL url;
        int i = this.e;
        jm3 jm3Var = this.f;
        switch (i) {
            case 0:
                jm3 jm3Var2 = ((pj3) jm3Var.m).y;
                pj3.l(jm3Var2);
                new Thread(new fl3(jm3Var2, r2)).start();
                break;
            case 1:
                jm3Var.V();
                break;
            case 2:
                jm3Var.C();
                break;
            default:
                pj3 pj3Var = (pj3) jm3Var.m;
                qi3 qi3Var = pj3Var.q;
                vh3 vh3Var = pj3Var.r;
                lj3 lj3Var = pj3Var.s;
                pj3.m(lj3Var);
                lj3Var.v();
                om3 om3Var = pj3Var.A;
                pj3.m(om3Var);
                pj3 pj3Var2 = (pj3) om3Var.m;
                pj3.m(om3Var);
                String C = pj3Var.r().C();
                Boolean I = pj3Var.p.I("google_analytics_adid_collection_enabled");
                if (I == null || I.booleanValue()) {
                    pj3.k(qi3Var);
                    pj3 pj3Var3 = (pj3) qi3Var.m;
                    qi3Var.v();
                    if (qi3Var.D().i(vk3.AD_STORAGE)) {
                        pj3Var3.w.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        String str = qi3Var.t;
                        if (str == null || elapsedRealtime >= qi3Var.v) {
                            qi3Var.v = pj3Var3.p.D(C, ug3.b) + elapsedRealtime;
                            try {
                                l5.a a = l5.a(pj3Var3.m);
                                qi3Var.t = BuildConfig.FLAVOR;
                                String str2 = a.a;
                                if (str2 != null) {
                                    qi3Var.t = str2;
                                }
                                qi3Var.u = a.b;
                            } catch (Exception e) {
                                vh3 vh3Var2 = pj3Var3.r;
                                pj3.m(vh3Var2);
                                vh3Var2.y.c(e, "Unable to get advertising id");
                                qi3Var.t = BuildConfig.FLAVOR;
                            }
                            pair = new Pair(qi3Var.t, Boolean.valueOf(qi3Var.u));
                        } else {
                            pair = new Pair(str, Boolean.valueOf(qi3Var.u));
                        }
                    } else {
                        pair = new Pair(BuildConfig.FLAVOR, Boolean.FALSE);
                    }
                    if (((Boolean) pair.second).booleanValue() || TextUtils.isEmpty((CharSequence) pair.first)) {
                        pj3.m(vh3Var);
                        vh3Var.z.b("ADID unavailable to retrieve Deferred Deep Link. Skipping");
                    } else {
                        pj3.m(om3Var);
                        om3Var.y();
                        ConnectivityManager connectivityManager = (ConnectivityManager) pj3Var2.m.getSystemService("connectivity");
                        if (connectivityManager != null) {
                            try {
                                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                            } catch (SecurityException unused) {
                            }
                            if (activeNetworkInfo == null && activeNetworkInfo.isConnected()) {
                                StringBuilder sb = new StringBuilder();
                                jo3 p = pj3Var.p();
                                p.v();
                                p.x();
                                int i2 = 1;
                                if (p.D()) {
                                    zq3 zq3Var = ((pj3) p.m).u;
                                    pj3.k(zq3Var);
                                    break;
                                }
                                jm3 jm3Var3 = pj3Var.y;
                                pj3.l(jm3Var3);
                                pj3 pj3Var4 = (pj3) jm3Var3.m;
                                jm3Var3.v();
                                jo3 p2 = pj3Var4.p();
                                pj3 pj3Var5 = (pj3) p2.m;
                                p2.v();
                                p2.x();
                                yg3 yg3Var = p2.p;
                                if (yg3Var == null) {
                                    p2.C();
                                    vh3 vh3Var3 = pj3Var5.r;
                                    pj3.m(vh3Var3);
                                    vh3Var3.y.b("Failed to get consents; not connected to service yet.");
                                } else {
                                    try {
                                        f = yg3Var.f(p2.M(false));
                                        p2.J();
                                    } catch (RemoteException e2) {
                                        vh3 vh3Var4 = pj3Var5.r;
                                        pj3.m(vh3Var4);
                                        vh3Var4.r.c(e2, "Failed to get consents; remote exception");
                                    }
                                    bundle = f == null ? f.m : null;
                                    if (bundle != null) {
                                        int i3 = pj3Var.N;
                                        pj3Var.N = i3 + 1;
                                        r2 = i3 < 10 ? 1 : 0;
                                        pj3.m(vh3Var);
                                        String str3 = i3 < 10 ? "Retrying." : "Skipping.";
                                        g10 g10Var = vh3Var.y;
                                        StringBuilder sb2 = new StringBuilder(str3.length() + 60);
                                        sb2.append("Failed to retrieve DMA consent from the service, ");
                                        sb2.append(str3);
                                        sb2.append(" retryCount");
                                        g10Var.c(Integer.valueOf(pj3Var.N), sb2.toString());
                                    } else {
                                        xk3 b = xk3.b(100, bundle);
                                        sb.append("&gcs=");
                                        sb.append(b.f());
                                        vc3 c = vc3.c(100, bundle);
                                        String str4 = c.d;
                                        sb.append("&dma=");
                                        Boolean bool = c.c;
                                        Boolean bool2 = Boolean.FALSE;
                                        sb.append(!Objects.equals(bool, bool2) ? 1 : 0);
                                        if (!TextUtils.isEmpty(str4)) {
                                            sb.append("&dma_cps=");
                                            sb.append(str4);
                                        }
                                        int ordinal = xk3.d(bundle.getString("ad_personalization")).ordinal();
                                        if (ordinal != 2) {
                                            bool2 = ordinal != 3 ? null : Boolean.TRUE;
                                        }
                                        int i4 = !Objects.equals(bool2, Boolean.TRUE) ? 1 : 0;
                                        sb.append("&npa=");
                                        sb.append(i4);
                                        pj3.m(vh3Var);
                                        vh3Var.z.c(sb, "Consent query parameters to Bow");
                                        zq3 zq3Var2 = pj3Var.u;
                                        pj3.k(zq3Var2);
                                        ((pj3) pj3Var.r().m).p.B();
                                        String str5 = (String) pair.first;
                                        long a2 = qi3Var.G.a() - 1;
                                        String sb3 = sb.toString();
                                        pj3 pj3Var6 = (pj3) zq3Var2.m;
                                        try {
                                            ll3.s(str5);
                                            ll3.s(C);
                                            String str6 = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v133005." + zq3Var2.d0()) + "&rdid=" + str5 + "&bundleid=" + C + "&retry=" + a2;
                                            if (C.equals(pj3Var6.p.A("debug.deferred.deeplink"))) {
                                                str6 = str6.concat("&ddl_test=1");
                                            }
                                            if (!sb3.isEmpty()) {
                                                if (sb3.charAt(0) != '&') {
                                                    str6 = str6.concat("&");
                                                }
                                                str6 = str6.concat(sb3);
                                            }
                                            url = new URL(str6);
                                        } catch (IllegalArgumentException e3) {
                                            e = e3;
                                            vh3 vh3Var5 = pj3Var6.r;
                                            pj3.m(vh3Var5);
                                            vh3Var5.r.c(e.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
                                            url = null;
                                            if (url != null) {
                                            }
                                            if (r2 != 0) {
                                                return;
                                            }
                                        } catch (MalformedURLException e4) {
                                            e = e4;
                                            vh3 vh3Var52 = pj3Var6.r;
                                            pj3.m(vh3Var52);
                                            vh3Var52.r.c(e.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
                                            url = null;
                                            if (url != null) {
                                            }
                                            if (r2 != 0) {
                                            }
                                        }
                                        if (url != null) {
                                            pj3.m(om3Var);
                                            ti3 ti3Var = new ti3(pj3Var, i2);
                                            om3Var.y();
                                            lj3 lj3Var2 = pj3Var2.s;
                                            pj3.m(lj3Var2);
                                            lj3Var2.I(new zh3(om3Var, C, url, (byte[]) null, (HashMap) null, ti3Var));
                                        }
                                    }
                                }
                                f = null;
                                if (f == null) {
                                }
                                if (bundle != null) {
                                }
                            } else {
                                pj3.m(vh3Var);
                                vh3Var.u.b("Network is not available for Deferred Deep Link request. Skipping");
                            }
                        }
                        activeNetworkInfo = null;
                        if (activeNetworkInfo == null) {
                        }
                        pj3.m(vh3Var);
                        vh3Var.u.b("Network is not available for Deferred Deep Link request. Skipping");
                    }
                } else {
                    pj3.m(vh3Var);
                    vh3Var.z.b("ADID collection is disabled from Manifest. Skipping");
                }
                if (r2 != 0) {
                    jm3Var.F.b(2000L);
                    break;
                }
                break;
        }
    }
}
