package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class nf0 extends bf0 {

    /* renamed from: f, reason: collision with root package name */
    private final RtbAdapter f9066f;

    /* renamed from: g, reason: collision with root package name */
    private c3.l f9067g;

    /* renamed from: h, reason: collision with root package name */
    private c3.q f9068h;

    /* renamed from: i, reason: collision with root package name */
    private String f9069i = "";

    public nf0(RtbAdapter rtbAdapter) {
        this.f9066f = rtbAdapter;
    }

    private final Bundle t6(kv kvVar) {
        Bundle bundle;
        Bundle bundle2 = kvVar.f7655r;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.f9066f.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    private static final Bundle u6(String str) {
        String valueOf = String.valueOf(str);
        io0.g(valueOf.length() != 0 ? "Server parameters: ".concat(valueOf) : new String("Server parameters: "));
        try {
            Bundle bundle = new Bundle();
            if (str == null) {
                return bundle;
            }
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle2 = new Bundle();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle2.putString(next, jSONObject.getString(next));
            }
            return bundle2;
        } catch (JSONException e7) {
            io0.e("", e7);
            throw new RemoteException();
        }
    }

    private static final boolean v6(kv kvVar) {
        if (kvVar.f7648k) {
            return true;
        }
        qw.b();
        return bo0.m();
    }

    private static final String w6(String str, kv kvVar) {
        String str2 = kvVar.f7663z;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void A2(String str, String str2, kv kvVar, x3.a aVar, te0 te0Var, jd0 jd0Var) {
        try {
            this.f9066f.loadRtbInterstitialAd(new c3.m((Context) x3.b.O0(aVar), str, u6(str2), t6(kvVar), v6(kvVar), kvVar.f7653p, kvVar.f7649l, kvVar.f7662y, w6(str2, kvVar), this.f9069i), new jf0(this, te0Var, jd0Var));
        } catch (Throwable th) {
            io0.e("Adapter failed to render interstitial ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final boolean B0(x3.a aVar) {
        c3.q qVar = this.f9068h;
        if (qVar == null) {
            return false;
        }
        try {
            qVar.a((Context) x3.b.O0(aVar));
            return true;
        } catch (Throwable th) {
            io0.e("", th);
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void H3(String str, String str2, kv kvVar, x3.a aVar, ze0 ze0Var, jd0 jd0Var) {
        try {
            this.f9066f.loadRtbRewardedInterstitialAd(new c3.r((Context) x3.b.O0(aVar), str, u6(str2), t6(kvVar), v6(kvVar), kvVar.f7653p, kvVar.f7649l, kvVar.f7662y, w6(str2, kvVar), this.f9069i), new mf0(this, ze0Var, jd0Var));
        } catch (Throwable th) {
            io0.e("Adapter failed to render rewarded interstitial ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final boolean N0(x3.a aVar) {
        c3.l lVar = this.f9067g;
        if (lVar == null) {
            return false;
        }
        try {
            lVar.a((Context) x3.b.O0(aVar));
            return true;
        } catch (Throwable th) {
            io0.e("", th);
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void P4(String str, String str2, kv kvVar, x3.a aVar, we0 we0Var, jd0 jd0Var, b40 b40Var) {
        try {
            this.f9066f.loadRtbNativeAd(new c3.o((Context) x3.b.O0(aVar), str, u6(str2), t6(kvVar), v6(kvVar), kvVar.f7653p, kvVar.f7649l, kvVar.f7662y, w6(str2, kvVar), this.f9069i, b40Var), new kf0(this, we0Var, jd0Var));
        } catch (Throwable th) {
            io0.e("Adapter failed to render native ad.", th);
            throw new RemoteException();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.cf0
    public final void T2(x3.a aVar, String str, Bundle bundle, Bundle bundle2, pv pvVar, ff0 ff0Var) {
        char c7;
        r2.b bVar;
        try {
            lf0 lf0Var = new lf0(this, ff0Var);
            RtbAdapter rtbAdapter = this.f9066f;
            switch (str.hashCode()) {
                case -1396342996:
                    if (str.equals("banner")) {
                        c7 = 0;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -1052618729:
                    if (str.equals("native")) {
                        c7 = 4;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -239580146:
                    if (str.equals("rewarded")) {
                        c7 = 2;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 604727084:
                    if (str.equals("interstitial")) {
                        c7 = 1;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 1911491517:
                    if (str.equals("rewarded_interstitial")) {
                        c7 = 3;
                        break;
                    }
                    c7 = 65535;
                    break;
                default:
                    c7 = 65535;
                    break;
            }
            if (c7 == 0) {
                bVar = r2.b.BANNER;
            } else if (c7 == 1) {
                bVar = r2.b.INTERSTITIAL;
            } else if (c7 == 2) {
                bVar = r2.b.REWARDED;
            } else if (c7 == 3) {
                bVar = r2.b.REWARDED_INTERSTITIAL;
            } else {
                if (c7 != 4) {
                    throw new IllegalArgumentException("Internal Error");
                }
                bVar = r2.b.NATIVE;
            }
            c3.j jVar = new c3.j(bVar, bundle2);
            ArrayList arrayList = new ArrayList();
            arrayList.add(jVar);
            rtbAdapter.collectSignals(new e3.a((Context) x3.b.O0(aVar), arrayList, bundle, r2.y.c(pvVar.f10380j, pvVar.f10377g, pvVar.f10376f)), lf0Var);
        } catch (Throwable th) {
            io0.e("Error generating signals for RTB", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final cz b() {
        Object obj = this.f9066f;
        if (obj instanceof c3.y) {
            try {
                return ((c3.y) obj).getVideoController();
            } catch (Throwable th) {
                io0.e("", th);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final qf0 d() {
        return qf0.c(this.f9066f.getVersionInfo());
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final qf0 e() {
        return qf0.c(this.f9066f.getSDKVersionInfo());
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void h0(String str) {
        this.f9069i = str;
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void k5(String str, String str2, kv kvVar, x3.a aVar, ze0 ze0Var, jd0 jd0Var) {
        try {
            this.f9066f.loadRtbRewardedAd(new c3.r((Context) x3.b.O0(aVar), str, u6(str2), t6(kvVar), v6(kvVar), kvVar.f7653p, kvVar.f7649l, kvVar.f7662y, w6(str2, kvVar), this.f9069i), new mf0(this, ze0Var, jd0Var));
        } catch (Throwable th) {
            io0.e("Adapter failed to render rewarded ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void n2(String str, String str2, kv kvVar, x3.a aVar, we0 we0Var, jd0 jd0Var) {
        P4(str, str2, kvVar, aVar, we0Var, jd0Var, null);
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void t3(String str, String str2, kv kvVar, x3.a aVar, qe0 qe0Var, jd0 jd0Var, pv pvVar) {
        try {
            this.f9066f.loadRtbBannerAd(new c3.h((Context) x3.b.O0(aVar), str, u6(str2), t6(kvVar), v6(kvVar), kvVar.f7653p, kvVar.f7649l, kvVar.f7662y, w6(str2, kvVar), r2.y.c(pvVar.f10380j, pvVar.f10377g, pvVar.f10376f), this.f9069i), new hf0(this, qe0Var, jd0Var));
        } catch (Throwable th) {
            io0.e("Adapter failed to render banner ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void y4(String str, String str2, kv kvVar, x3.a aVar, qe0 qe0Var, jd0 jd0Var, pv pvVar) {
        try {
            this.f9066f.loadRtbInterscrollerAd(new c3.h((Context) x3.b.O0(aVar), str, u6(str2), t6(kvVar), v6(kvVar), kvVar.f7653p, kvVar.f7649l, kvVar.f7662y, w6(str2, kvVar), r2.y.c(pvVar.f10380j, pvVar.f10377g, pvVar.f10376f), this.f9069i), new if0(this, qe0Var, jd0Var));
        } catch (Throwable th) {
            io0.e("Adapter failed to render interscroller ad.", th);
            throw new RemoteException();
        }
    }
}
