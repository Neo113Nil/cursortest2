package s7;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Objects;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g2 extends n {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8706e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q2 f8707f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(q2 q2Var, y1 y1Var, int i3) {
        super(y1Var);
        this.f8706e = i3;
        switch (i3) {
            case 1:
                Objects.requireNonNull(q2Var);
                this.f8707f = q2Var;
                super(y1Var);
                break;
            case 2:
                Objects.requireNonNull(q2Var);
                this.f8707f = q2Var;
                super(y1Var);
                break;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                this.f8707f = q2Var;
                super(y1Var);
                break;
            default:
                Objects.requireNonNull(q2Var);
                this.f8707f = q2Var;
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0126, code lost:
    
        if (r0.d0() >= 234200) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[ADDED_TO_REGION, REMOVE, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x02f9  */
    @Override // s7.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        Pair pair;
        NetworkInfo activeNetworkInfo;
        i v10;
        Bundle bundle;
        URL url;
        switch (this.f8706e) {
            case 0:
                q2 q2Var = ((q1) this.f8707f.f1478d).A;
                q1.k(q2Var);
                new Thread(new f2(q2Var, 0)).start();
                break;
            case 1:
                this.f8707f.R();
                break;
            case 2:
                this.f8707f.y();
                break;
            default:
                q2 q2Var2 = this.f8707f;
                q1 q1Var = (q1) q2Var2.f1478d;
                f1 f1Var = q1Var.f8936s;
                v0 v0Var = q1Var.f8937t;
                o1 o1Var = q1Var.f8938u;
                q1.l(o1Var);
                o1Var.s();
                u2 u2Var = q1Var.C;
                q1.l(u2Var);
                q1 q1Var2 = (q1) u2Var.f1478d;
                q1.l(u2Var);
                String y3 = q1Var.q().y();
                Boolean F = q1Var.f8935r.F("google_analytics_adid_collection_enabled");
                if (F == null || F.booleanValue()) {
                    q1.j(f1Var);
                    q1 q1Var3 = (q1) f1Var.f1478d;
                    f1Var.s();
                    if (f1Var.z().i(b2.AD_STORAGE)) {
                        q1Var3.f8942y.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        String str = f1Var.f8687v;
                        if (str == null || elapsedRealtime >= f1Var.f8689x) {
                            f1Var.f8689x = q1Var3.f8935r.A(y3, e0.f8608b) + elapsedRealtime;
                            try {
                                c7.p0 a9 = v6.a.a(q1Var3.f8932d);
                                f1Var.f8687v = "";
                                String str2 = a9.f1971b;
                                if (str2 != null) {
                                    f1Var.f8687v = str2;
                                }
                                f1Var.f8688w = a9.f1972c;
                            } catch (Exception e2) {
                                v0 v0Var2 = q1Var3.f8937t;
                                q1.l(v0Var2);
                                v0Var2.A.b(e2, "Unable to get advertising id");
                                f1Var.f8687v = "";
                            }
                            pair = new Pair(f1Var.f8687v, Boolean.valueOf(f1Var.f8688w));
                        } else {
                            pair = new Pair(str, Boolean.valueOf(f1Var.f8688w));
                        }
                    } else {
                        pair = new Pair("", Boolean.FALSE);
                    }
                    if (((Boolean) pair.second).booleanValue() || TextUtils.isEmpty((CharSequence) pair.first)) {
                        q1.l(v0Var);
                        v0Var.B.a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
                    } else {
                        q1.l(u2Var);
                        u2Var.u();
                        ConnectivityManager connectivityManager = (ConnectivityManager) q1Var2.f8932d.getSystemService("connectivity");
                        if (connectivityManager != null) {
                            try {
                                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                            } catch (SecurityException unused) {
                            }
                            if (activeNetworkInfo == null && activeNetworkInfo.isConnected()) {
                                StringBuilder sb2 = new StringBuilder();
                                l3 o6 = q1Var.o();
                                o6.s();
                                o6.t();
                                if (o6.z()) {
                                    p4 p4Var = ((q1) o6.f1478d).f8940w;
                                    q1.j(p4Var);
                                    break;
                                }
                                q2 q2Var3 = q1Var.A;
                                q1.k(q2Var3);
                                q1 q1Var4 = (q1) q2Var3.f1478d;
                                q2Var3.s();
                                l3 o10 = q1Var4.o();
                                q1 q1Var5 = (q1) o10.f1478d;
                                o10.s();
                                o10.t();
                                h0 h0Var = o10.f8813r;
                                if (h0Var == null) {
                                    o10.y();
                                    v0 v0Var3 = q1Var5.f8937t;
                                    q1.l(v0Var3);
                                    v0Var3.A.a("Failed to get consents; not connected to service yet.");
                                } else {
                                    try {
                                        v10 = h0Var.v(o10.I(false));
                                        o10.F();
                                    } catch (RemoteException e9) {
                                        v0 v0Var4 = q1Var5.f8937t;
                                        q1.l(v0Var4);
                                        v0Var4.f9050t.b(e9, "Failed to get consents; remote exception");
                                    }
                                    bundle = v10 == null ? v10.f8731d : null;
                                    if (bundle != null) {
                                        int i3 = q1Var.P;
                                        q1Var.P = i3 + 1;
                                        r13 = i3 < 10;
                                        q1.l(v0Var);
                                        t0 t0Var = v0Var.A;
                                        StringBuilder sb3 = new StringBuilder(69);
                                        sb3.append("Failed to retrieve DMA consent from the service, ");
                                        t0Var.b(Integer.valueOf(q1Var.P), v4.a.o(sb3, i3 < 10 ? "Retrying." : "Skipping.", " retryCount"));
                                    } else {
                                        c2 b10 = c2.b(bundle, 100);
                                        sb2.append("&gcs=");
                                        sb2.append(b10.f());
                                        o c10 = o.c(bundle, 100);
                                        String str3 = c10.f8890d;
                                        sb2.append("&dma=");
                                        Boolean bool = c10.f8889c;
                                        Boolean bool2 = Boolean.FALSE;
                                        sb2.append(!Objects.equals(bool, bool2) ? 1 : 0);
                                        if (!TextUtils.isEmpty(str3)) {
                                            sb2.append("&dma_cps=");
                                            sb2.append(str3);
                                        }
                                        int ordinal = c2.d(bundle.getString("ad_personalization")).ordinal();
                                        if (ordinal != 2) {
                                            bool2 = ordinal != 3 ? null : Boolean.TRUE;
                                        }
                                        int i10 = !Objects.equals(bool2, Boolean.TRUE) ? 1 : 0;
                                        sb2.append("&npa=");
                                        sb2.append(i10);
                                        q1.l(v0Var);
                                        v0Var.B.b(sb2, "Consent query parameters to Bow");
                                        p4 p4Var2 = q1Var.f8940w;
                                        q1.j(p4Var2);
                                        ((q1) q1Var.q().f1478d).f8935r.y();
                                        String str4 = (String) pair.first;
                                        long a10 = f1Var.I.a() - 1;
                                        String sb4 = sb2.toString();
                                        q1 q1Var6 = (q1) p4Var2.f1478d;
                                        try {
                                            c7.c0.d(str4);
                                            c7.c0.d(y3);
                                            String str5 = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + p4Var2.d0()) + "&rdid=" + str4 + "&bundleid=" + y3 + "&retry=" + a10;
                                            if (y3.equals(q1Var6.f8935r.w("debug.deferred.deeplink"))) {
                                                str5 = str5.concat("&ddl_test=1");
                                            }
                                            if (!sb4.isEmpty()) {
                                                if (sb4.charAt(0) != '&') {
                                                    str5 = str5.concat("&");
                                                }
                                                str5 = str5.concat(sb4);
                                            }
                                            url = new URL(str5);
                                        } catch (IllegalArgumentException e10) {
                                            e = e10;
                                            v0 v0Var5 = q1Var6.f8937t;
                                            q1.l(v0Var5);
                                            v0Var5.f9050t.b(e.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
                                            url = null;
                                            if (url != null) {
                                            }
                                            if (r13) {
                                                return;
                                            }
                                        } catch (MalformedURLException e11) {
                                            e = e11;
                                            v0 v0Var52 = q1Var6.f8937t;
                                            q1.l(v0Var52);
                                            v0Var52.f9050t.b(e.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
                                            url = null;
                                            if (url != null) {
                                            }
                                            if (r13) {
                                            }
                                        }
                                        if (url != null) {
                                            q1.l(u2Var);
                                            h1 h1Var = new h1(q1Var, 1);
                                            u2Var.u();
                                            o1 o1Var2 = q1Var2.f8938u;
                                            q1.l(o1Var2);
                                            o1Var2.E(new y0(u2Var, y3, url, (byte[]) null, (HashMap) null, h1Var));
                                        }
                                    }
                                }
                                v10 = null;
                                if (v10 == null) {
                                }
                                if (bundle != null) {
                                }
                            } else {
                                q1.l(v0Var);
                                v0Var.f9053w.a("Network is not available for Deferred Deep Link request. Skipping");
                            }
                        }
                        activeNetworkInfo = null;
                        if (activeNetworkInfo == null) {
                        }
                        q1.l(v0Var);
                        v0Var.f9053w.a("Network is not available for Deferred Deep Link request. Skipping");
                    }
                } else {
                    q1.l(v0Var);
                    v0Var.B.a("ADID collection is disabled from Manifest. Skipping");
                }
                if (r13) {
                    q2Var2.G.b(2000L);
                    break;
                }
                break;
        }
    }
}
