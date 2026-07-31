package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ce0 extends fd0 {

    /* renamed from: f, reason: collision with root package name */
    private final Object f3820f;

    /* renamed from: g, reason: collision with root package name */
    private ee0 f3821g;

    /* renamed from: h, reason: collision with root package name */
    private xj0 f3822h;

    /* renamed from: i, reason: collision with root package name */
    private x3.a f3823i;

    /* renamed from: j, reason: collision with root package name */
    private View f3824j;

    /* renamed from: k, reason: collision with root package name */
    private c3.l f3825k;

    /* renamed from: l, reason: collision with root package name */
    private c3.v f3826l;

    /* renamed from: m, reason: collision with root package name */
    private c3.q f3827m;

    /* renamed from: n, reason: collision with root package name */
    private c3.k f3828n;

    /* renamed from: o, reason: collision with root package name */
    private final String f3829o = "";

    public ce0(c3.a aVar) {
        this.f3820f = aVar;
    }

    public ce0(c3.f fVar) {
        this.f3820f = fVar;
    }

    private final Bundle s6(kv kvVar) {
        Bundle bundle;
        Bundle bundle2 = kvVar.f7655r;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.f3820f.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    private final Bundle t6(String str, kv kvVar, String str2) {
        String valueOf = String.valueOf(str);
        io0.b(valueOf.length() != 0 ? "Server parameters: ".concat(valueOf) : new String("Server parameters: "));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.f3820f instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (kvVar != null) {
                    bundle.putInt("tagForChildDirectedTreatment", kvVar.f7649l);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            io0.e("", th);
            throw new RemoteException();
        }
    }

    private static final boolean u6(kv kvVar) {
        if (kvVar.f7648k) {
            return true;
        }
        qw.b();
        return bo0.m();
    }

    private static final String v6(String str, kv kvVar) {
        String str2 = kvVar.f7663z;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void A5(x3.a aVar, kv kvVar, String str, String str2, jd0 jd0Var) {
        RemoteException remoteException;
        Object obj = this.f3820f;
        if (!(obj instanceof MediationInterstitialAdapter) && !(obj instanceof c3.a)) {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = c3.a.class.getCanonicalName();
            String canonicalName3 = this.f3820f.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            io0.g(sb.toString());
            throw new RemoteException();
        }
        io0.b("Requesting interstitial ad from adapter.");
        Object obj2 = this.f3820f;
        if (!(obj2 instanceof MediationInterstitialAdapter)) {
            if (obj2 instanceof c3.a) {
                try {
                    ((c3.a) obj2).loadInterstitialAd(new c3.m((Context) x3.b.O0(aVar), "", t6(str, kvVar, str2), s6(kvVar), u6(kvVar), kvVar.f7653p, kvVar.f7649l, kvVar.f7662y, v6(str, kvVar), this.f3829o), new zd0(this, jd0Var));
                    return;
                } finally {
                }
            }
            return;
        }
        try {
            MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) obj2;
            List<String> list = kvVar.f7647j;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j7 = kvVar.f7644g;
            ud0 ud0Var = new ud0(j7 == -1 ? null : new Date(j7), kvVar.f7646i, hashSet, kvVar.f7653p, u6(kvVar), kvVar.f7649l, kvVar.f7660w, kvVar.f7662y, v6(str, kvVar));
            Bundle bundle = kvVar.f7655r;
            mediationInterstitialAdapter.requestInterstitialAd((Context) x3.b.O0(aVar), new ee0(jd0Var), t6(str, kvVar, str2), ud0Var, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
        } finally {
        }
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final boolean I() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void J() {
        if (this.f3820f instanceof MediationInterstitialAdapter) {
            io0.b("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) this.f3820f).showInterstitial();
                return;
            } catch (Throwable th) {
                io0.e("", th);
                throw new RemoteException();
            }
        }
        String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
        String canonicalName2 = this.f3820f.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        io0.g(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final boolean K() {
        if (this.f3820f instanceof c3.a) {
            return this.f3822h != null;
        }
        String canonicalName = c3.a.class.getCanonicalName();
        String canonicalName2 = this.f3820f.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        io0.g(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void M() {
        Object obj = this.f3820f;
        if (obj instanceof c3.f) {
            try {
                ((c3.f) obj).onResume();
            } catch (Throwable th) {
                io0.e("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void N1(x3.a aVar, xj0 xj0Var, List<String> list) {
        io0.g("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final pd0 P() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void V3(x3.a aVar) {
        Context context = (Context) x3.b.O0(aVar);
        Object obj = this.f3820f;
        if (obj instanceof c3.t) {
            ((c3.t) obj).a(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void W0(x3.a aVar, pv pvVar, kv kvVar, String str, String str2, jd0 jd0Var) {
        if (this.f3820f instanceof c3.a) {
            io0.b("Requesting interscroller ad from adapter.");
            try {
                c3.a aVar2 = (c3.a) this.f3820f;
                aVar2.loadInterscrollerAd(new c3.h((Context) x3.b.O0(aVar), "", t6(str, kvVar, str2), s6(kvVar), u6(kvVar), kvVar.f7653p, kvVar.f7649l, kvVar.f7662y, v6(str, kvVar), r2.y.e(pvVar.f10380j, pvVar.f10377g), ""), new wd0(this, jd0Var, aVar2));
                return;
            } catch (Exception e7) {
                io0.e("", e7);
                throw new RemoteException();
            }
        }
        String canonicalName = c3.a.class.getCanonicalName();
        String canonicalName2 = this.f3820f.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        io0.g(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void Y2(kv kvVar, String str, String str2) {
        Object obj = this.f3820f;
        if (obj instanceof c3.a) {
            h1(this.f3823i, kvVar, str, new fe0((c3.a) obj, this.f3822h));
            return;
        }
        String canonicalName = c3.a.class.getCanonicalName();
        String canonicalName2 = this.f3820f.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        io0.g(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final Bundle b() {
        Object obj = this.f3820f;
        if (obj instanceof zzcqk) {
            return ((zzcqk) obj).zza();
        }
        String canonicalName = zzcqk.class.getCanonicalName();
        String canonicalName2 = this.f3820f.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        io0.g(sb.toString());
        return new Bundle();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.gd0
    public final void c4(x3.a aVar, j90 j90Var, List<p90> list) {
        char c7;
        if (!(this.f3820f instanceof c3.a)) {
            throw new RemoteException();
        }
        xd0 xd0Var = new xd0(this, j90Var);
        ArrayList arrayList = new ArrayList();
        for (p90 p90Var : list) {
            String str = p90Var.f10124f;
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
            r2.b bVar = c7 != 0 ? c7 != 1 ? c7 != 2 ? c7 != 3 ? c7 != 4 ? null : r2.b.NATIVE : r2.b.REWARDED_INTERSTITIAL : r2.b.REWARDED : r2.b.INTERSTITIAL : r2.b.BANNER;
            if (bVar != null) {
                arrayList.add(new c3.j(bVar, p90Var.f10125g));
            }
        }
        ((c3.a) this.f3820f).initialize((Context) x3.b.O0(aVar), xd0Var, arrayList);
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final Bundle d() {
        Object obj = this.f3820f;
        if (obj instanceof zzcql) {
            return ((zzcql) obj).getInterstitialAdapterInfo();
        }
        String canonicalName = zzcql.class.getCanonicalName();
        String canonicalName2 = this.f3820f.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        io0.g(sb.toString());
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void d3(x3.a aVar, kv kvVar, String str, String str2, jd0 jd0Var, b40 b40Var, List<String> list) {
        RemoteException remoteException;
        Object obj = this.f3820f;
        if (!(obj instanceof MediationNativeAdapter) && !(obj instanceof c3.a)) {
            String canonicalName = MediationNativeAdapter.class.getCanonicalName();
            String canonicalName2 = c3.a.class.getCanonicalName();
            String canonicalName3 = this.f3820f.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            io0.g(sb.toString());
            throw new RemoteException();
        }
        io0.b("Requesting native ad from adapter.");
        Object obj2 = this.f3820f;
        if (!(obj2 instanceof MediationNativeAdapter)) {
            if (obj2 instanceof c3.a) {
                try {
                    ((c3.a) obj2).loadNativeAd(new c3.o((Context) x3.b.O0(aVar), "", t6(str, kvVar, str2), s6(kvVar), u6(kvVar), kvVar.f7653p, kvVar.f7649l, kvVar.f7662y, v6(str, kvVar), this.f3829o, b40Var), new ae0(this, jd0Var));
                    return;
                } finally {
                }
            }
            return;
        }
        try {
            MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj2;
            List<String> list2 = kvVar.f7647j;
            HashSet hashSet = list2 != null ? new HashSet(list2) : null;
            long j7 = kvVar.f7644g;
            ge0 ge0Var = new ge0(j7 == -1 ? null : new Date(j7), kvVar.f7646i, hashSet, kvVar.f7653p, u6(kvVar), kvVar.f7649l, b40Var, list, kvVar.f7660w, kvVar.f7662y, v6(str, kvVar));
            Bundle bundle = kvVar.f7655r;
            Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
            this.f3821g = new ee0(jd0Var);
            mediationNativeAdapter.requestNativeAd((Context) x3.b.O0(aVar), this.f3821g, t6(str, kvVar, str2), ge0Var, bundle2);
        } finally {
        }
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final Bundle e() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void e0() {
        Object obj = this.f3820f;
        if (obj instanceof c3.f) {
            try {
                ((c3.f) obj).onPause();
            } catch (Throwable th) {
                io0.e("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void e1(x3.a aVar) {
        if (this.f3820f instanceof c3.a) {
            io0.b("Show rewarded ad from adapter.");
            c3.q qVar = this.f3827m;
            if (qVar != null) {
                qVar.a((Context) x3.b.O0(aVar));
                return;
            } else {
                io0.d("Can not show null mediation rewarded ad.");
                throw new RemoteException();
            }
        }
        String canonicalName = c3.a.class.getCanonicalName();
        String canonicalName2 = this.f3820f.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        io0.g(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final cz f() {
        Object obj = this.f3820f;
        if (obj instanceof c3.y) {
            try {
                return ((c3.y) obj).getVideoController();
            } catch (Throwable th) {
                io0.e("", th);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final od0 f0() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final e50 h() {
        ee0 ee0Var = this.f3821g;
        if (ee0Var == null) {
            return null;
        }
        u2.f t6 = ee0Var.t();
        if (t6 instanceof f50) {
            return ((f50) t6).b();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void h1(x3.a aVar, kv kvVar, String str, jd0 jd0Var) {
        if (this.f3820f instanceof c3.a) {
            io0.b("Requesting rewarded ad from adapter.");
            try {
                ((c3.a) this.f3820f).loadRewardedAd(new c3.r((Context) x3.b.O0(aVar), "", t6(str, kvVar, null), s6(kvVar), u6(kvVar), kvVar.f7653p, kvVar.f7649l, kvVar.f7662y, v6(str, kvVar), ""), new be0(this, jd0Var));
                return;
            } catch (Exception e7) {
                io0.e("", e7);
                throw new RemoteException();
            }
        }
        String canonicalName = c3.a.class.getCanonicalName();
        String canonicalName2 = this.f3820f.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        io0.g(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void h6(x3.a aVar, kv kvVar, String str, jd0 jd0Var) {
        if (this.f3820f instanceof c3.a) {
            io0.b("Requesting rewarded interstitial ad from adapter.");
            try {
                ((c3.a) this.f3820f).loadRewardedInterstitialAd(new c3.r((Context) x3.b.O0(aVar), "", t6(str, kvVar, null), s6(kvVar), u6(kvVar), kvVar.f7653p, kvVar.f7649l, kvVar.f7662y, v6(str, kvVar), ""), new be0(this, jd0Var));
                return;
            } catch (Exception e7) {
                io0.e("", e7);
                throw new RemoteException();
            }
        }
        String canonicalName = c3.a.class.getCanonicalName();
        String canonicalName2 = this.f3820f.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        io0.g(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final md0 i() {
        c3.k kVar = this.f3828n;
        if (kVar != null) {
            return new de0(kVar);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void i4(x3.a aVar, pv pvVar, kv kvVar, String str, jd0 jd0Var) {
        u2(aVar, pvVar, kvVar, str, null, jd0Var);
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final sd0 j() {
        c3.v vVar;
        c3.v u6;
        Object obj = this.f3820f;
        if (!(obj instanceof MediationNativeAdapter)) {
            if (!(obj instanceof c3.a) || (vVar = this.f3826l) == null) {
                return null;
            }
            return new me0(vVar);
        }
        ee0 ee0Var = this.f3821g;
        if (ee0Var == null || (u6 = ee0Var.u()) == null) {
            return null;
        }
        return new me0(u6);
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final qf0 k() {
        Object obj = this.f3820f;
        if (obj instanceof c3.a) {
            return qf0.c(((c3.a) obj).getVersionInfo());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final x3.a m() {
        Object obj = this.f3820f;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return x3.b.B3(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th) {
                io0.e("", th);
                throw new RemoteException();
            }
        }
        if (obj instanceof c3.a) {
            return x3.b.B3(this.f3824j);
        }
        String canonicalName = MediationBannerAdapter.class.getCanonicalName();
        String canonicalName2 = c3.a.class.getCanonicalName();
        String canonicalName3 = this.f3820f.getClass().getCanonicalName();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(length + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
        sb.append(canonicalName);
        sb.append(" or ");
        sb.append(canonicalName2);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName3);
        io0.g(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void n() {
        Object obj = this.f3820f;
        if (obj instanceof c3.f) {
            try {
                ((c3.f) obj).onDestroy();
            } catch (Throwable th) {
                io0.e("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final qf0 o() {
        Object obj = this.f3820f;
        if (obj instanceof c3.a) {
            return qf0.c(((c3.a) obj).getSDKVersionInfo());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void o2(x3.a aVar, kv kvVar, String str, jd0 jd0Var) {
        A5(aVar, kvVar, str, null, jd0Var);
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void p2(kv kvVar, String str) {
        Y2(kvVar, str, null);
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void r1(boolean z6) {
        Object obj = this.f3820f;
        if (obj instanceof c3.u) {
            try {
                ((c3.u) obj).onImmersiveModeUpdated(z6);
                return;
            } catch (Throwable th) {
                io0.e("", th);
                return;
            }
        }
        String canonicalName = c3.u.class.getCanonicalName();
        String canonicalName2 = this.f3820f.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        io0.b(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void u2(x3.a aVar, pv pvVar, kv kvVar, String str, String str2, jd0 jd0Var) {
        RemoteException remoteException;
        Object obj = this.f3820f;
        if (!(obj instanceof MediationBannerAdapter) && !(obj instanceof c3.a)) {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = c3.a.class.getCanonicalName();
            String canonicalName3 = this.f3820f.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            io0.g(sb.toString());
            throw new RemoteException();
        }
        io0.b("Requesting banner ad from adapter.");
        r2.h d7 = pvVar.f10389s ? r2.y.d(pvVar.f10380j, pvVar.f10377g) : r2.y.c(pvVar.f10380j, pvVar.f10377g, pvVar.f10376f);
        Object obj2 = this.f3820f;
        if (!(obj2 instanceof MediationBannerAdapter)) {
            if (obj2 instanceof c3.a) {
                try {
                    ((c3.a) obj2).loadBannerAd(new c3.h((Context) x3.b.O0(aVar), "", t6(str, kvVar, str2), s6(kvVar), u6(kvVar), kvVar.f7653p, kvVar.f7649l, kvVar.f7662y, v6(str, kvVar), d7, this.f3829o), new yd0(this, jd0Var));
                    return;
                } finally {
                }
            }
            return;
        }
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) obj2;
            List<String> list = kvVar.f7647j;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j7 = kvVar.f7644g;
            ud0 ud0Var = new ud0(j7 == -1 ? null : new Date(j7), kvVar.f7646i, hashSet, kvVar.f7653p, u6(kvVar), kvVar.f7649l, kvVar.f7660w, kvVar.f7662y, v6(str, kvVar));
            Bundle bundle = kvVar.f7655r;
            mediationBannerAdapter.requestBannerAd((Context) x3.b.O0(aVar), new ee0(jd0Var), t6(str, kvVar, str2), d7, ud0Var, bundle != null ? bundle.getBundle(mediationBannerAdapter.getClass().getName()) : null);
        } finally {
        }
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void u5(x3.a aVar, kv kvVar, String str, xj0 xj0Var, String str2) {
        Object obj = this.f3820f;
        if (obj instanceof c3.a) {
            this.f3823i = aVar;
            this.f3822h = xj0Var;
            xj0Var.U(x3.b.B3(obj));
            return;
        }
        String canonicalName = c3.a.class.getCanonicalName();
        String canonicalName2 = this.f3820f.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        io0.g(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void v() {
        if (this.f3820f instanceof c3.a) {
            c3.q qVar = this.f3827m;
            if (qVar != null) {
                qVar.a((Context) x3.b.O0(this.f3823i));
                return;
            } else {
                io0.d("Can not show null mediated rewarded ad.");
                throw new RemoteException();
            }
        }
        String canonicalName = c3.a.class.getCanonicalName();
        String canonicalName2 = this.f3820f.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        io0.g(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void w2(x3.a aVar) {
        Object obj = this.f3820f;
        if ((obj instanceof c3.a) || (obj instanceof MediationInterstitialAdapter)) {
            if (obj instanceof MediationInterstitialAdapter) {
                J();
                return;
            }
            io0.b("Show interstitial ad from adapter.");
            c3.l lVar = this.f3825k;
            if (lVar != null) {
                lVar.a((Context) x3.b.O0(aVar));
                return;
            } else {
                io0.d("Can not show null mediation interstitial ad.");
                throw new RemoteException();
            }
        }
        String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
        String canonicalName2 = c3.a.class.getCanonicalName();
        String canonicalName3 = this.f3820f.getClass().getCanonicalName();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(length + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
        sb.append(canonicalName);
        sb.append(" or ");
        sb.append(canonicalName2);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName3);
        io0.g(sb.toString());
        throw new RemoteException();
    }
}
