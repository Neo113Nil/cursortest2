package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.e;
import com.google.ads.mediation.f;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class he0<NETWORK_EXTRAS extends com.google.ads.mediation.f, SERVER_PARAMETERS extends com.google.ads.mediation.e> extends fd0 {

    /* renamed from: f, reason: collision with root package name */
    private final com.google.ads.mediation.b<NETWORK_EXTRAS, SERVER_PARAMETERS> f6199f;

    /* renamed from: g, reason: collision with root package name */
    private final NETWORK_EXTRAS f6200g;

    public he0(com.google.ads.mediation.b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar, NETWORK_EXTRAS network_extras) {
        this.f6199f = bVar;
        this.f6200g = network_extras;
    }

    private final SERVER_PARAMETERS s6(String str) {
        HashMap hashMap;
        try {
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                hashMap = new HashMap(jSONObject.length());
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.getString(next));
                }
            } else {
                hashMap = new HashMap(0);
            }
            Class<SERVER_PARAMETERS> serverParametersType = this.f6199f.getServerParametersType();
            if (serverParametersType == null) {
                return null;
            }
            SERVER_PARAMETERS newInstance = serverParametersType.newInstance();
            newInstance.a(hashMap);
            return newInstance;
        } catch (Throwable th) {
            io0.e("", th);
            throw new RemoteException();
        }
    }

    private static final boolean t6(kv kvVar) {
        if (kvVar.f7648k) {
            return true;
        }
        qw.b();
        return bo0.m();
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void A5(x3.a aVar, kv kvVar, String str, String str2, jd0 jd0Var) {
        com.google.ads.mediation.b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar = this.f6199f;
        if (!(bVar instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            io0.g(valueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        io0.b("Requesting interstitial ad from adapter.");
        try {
            ((MediationInterstitialAdapter) this.f6199f).requestInterstitialAd(new ke0(jd0Var), (Activity) x3.b.O0(aVar), s6(str), le0.b(kvVar, t6(kvVar)), this.f6200g);
        } catch (Throwable th) {
            io0.e("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final boolean I() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void J() {
        com.google.ads.mediation.b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar = this.f6199f;
        if (!(bVar instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            io0.g(valueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        io0.b("Showing interstitial from adapter.");
        try {
            ((MediationInterstitialAdapter) this.f6199f).showInterstitial();
        } catch (Throwable th) {
            io0.e("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final boolean K() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void M() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void N1(x3.a aVar, xj0 xj0Var, List<String> list) {
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final pd0 P() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void V3(x3.a aVar) {
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void W0(x3.a aVar, pv pvVar, kv kvVar, String str, String str2, jd0 jd0Var) {
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void Y2(kv kvVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final Bundle b() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void c4(x3.a aVar, j90 j90Var, List<p90> list) {
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final Bundle d() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void d3(x3.a aVar, kv kvVar, String str, String str2, jd0 jd0Var, b40 b40Var, List<String> list) {
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final Bundle e() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void e0() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void e1(x3.a aVar) {
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final cz f() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final od0 f0() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final e50 h() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void h1(x3.a aVar, kv kvVar, String str, jd0 jd0Var) {
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void h6(x3.a aVar, kv kvVar, String str, jd0 jd0Var) {
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final md0 i() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void i4(x3.a aVar, pv pvVar, kv kvVar, String str, jd0 jd0Var) {
        u2(aVar, pvVar, kvVar, str, null, jd0Var);
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final sd0 j() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final qf0 k() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final x3.a m() {
        com.google.ads.mediation.b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar = this.f6199f;
        if (!(bVar instanceof MediationBannerAdapter)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            io0.g(valueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(valueOf) : new String("Not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        try {
            return x3.b.B3(((MediationBannerAdapter) bVar).getBannerView());
        } catch (Throwable th) {
            io0.e("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void n() {
        try {
            this.f6199f.destroy();
        } catch (Throwable th) {
            io0.e("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final qf0 o() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void o2(x3.a aVar, kv kvVar, String str, jd0 jd0Var) {
        A5(aVar, kvVar, str, null, jd0Var);
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void p2(kv kvVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void r1(boolean z6) {
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void u2(x3.a aVar, pv pvVar, kv kvVar, String str, String str2, jd0 jd0Var) {
        p0.c cVar;
        com.google.ads.mediation.b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar = this.f6199f;
        if (!(bVar instanceof MediationBannerAdapter)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            io0.g(valueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(valueOf) : new String("Not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        io0.b("Requesting banner ad from adapter.");
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.f6199f;
            ke0 ke0Var = new ke0(jd0Var);
            Activity activity = (Activity) x3.b.O0(aVar);
            SERVER_PARAMETERS s62 = s6(str);
            int i7 = 0;
            p0.c[] cVarArr = {p0.c.f19948b, p0.c.f19949c, p0.c.f19950d, p0.c.f19951e, p0.c.f19952f, p0.c.f19953g};
            while (true) {
                if (i7 >= 6) {
                    cVar = new p0.c(r2.y.c(pvVar.f10380j, pvVar.f10377g, pvVar.f10376f));
                    break;
                } else {
                    if (cVarArr[i7].b() == pvVar.f10380j && cVarArr[i7].a() == pvVar.f10377g) {
                        cVar = cVarArr[i7];
                        break;
                    }
                    i7++;
                }
            }
            mediationBannerAdapter.requestBannerAd(ke0Var, activity, s62, cVar, le0.b(kvVar, t6(kvVar)), this.f6200g);
        } catch (Throwable th) {
            io0.e("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void u5(x3.a aVar, kv kvVar, String str, xj0 xj0Var, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void v() {
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void w2(x3.a aVar) {
    }
}
