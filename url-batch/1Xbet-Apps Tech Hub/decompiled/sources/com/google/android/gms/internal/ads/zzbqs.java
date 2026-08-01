package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.OnContextChangedListener;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbqs extends zzbpt {
    private final Object zza;
    private zzbqu zzb;
    private zzbxb zzc;
    private IObjectWrapper zzd;
    private View zze;
    private MediationInterstitialAd zzf;
    private UnifiedNativeAdMapper zzg;
    private MediationRewardedAd zzh;
    private MediationInterscrollerAd zzi;
    private MediationAppOpenAd zzj;
    private final String zzk = "";

    public zzbqs(Adapter adapter) {
        this.zza = adapter;
    }

    private final Bundle zzU(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        Bundle bundle;
        Bundle bundle2 = zzlVar.zzm;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.zza.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    private final Bundle zzV(String str, com.google.android.gms.ads.internal.client.zzl zzlVar, String str2) throws RemoteException {
        zzcbn.zze("Server parameters: ".concat(String.valueOf(str)));
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
            if (this.zza instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (zzlVar != null) {
                    bundle.putInt("tagForChildDirectedTreatment", zzlVar.zzg);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            zzcbn.zzh("", th);
            throw new RemoteException();
        }
    }

    private static final boolean zzW(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        if (zzlVar.zzf) {
            return true;
        }
        com.google.android.gms.ads.internal.client.zzay.zzb();
        return zzcbg.zzr();
    }

    private static final String zzX(String str, com.google.android.gms.ads.internal.client.zzl zzlVar) {
        String str2 = zzlVar.zzu;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzA(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbpx zzbpxVar) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            zzcbn.zze("Requesting rewarded ad from adapter.");
            try {
                ((Adapter) this.zza).loadRewardedAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzV(str, zzlVar, null), zzU(zzlVar), zzW(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzX(str, zzlVar), ""), new zzbqq(this, zzbpxVar));
                return;
            } catch (Exception e) {
                zzcbn.zzh("", e);
                throw new RemoteException();
            }
        }
        zzcbn.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzB(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            zzA(this.zzd, zzlVar, str, new zzbqv((Adapter) obj, this.zzc));
            return;
        }
        zzcbn.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzC(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbpx zzbpxVar) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            zzcbn.zze("Requesting rewarded interstitial ad from adapter.");
            try {
                ((Adapter) this.zza).loadRewardedInterstitialAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzV(str, zzlVar, null), zzU(zzlVar), zzW(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzX(str, zzlVar), ""), new zzbqq(this, zzbpxVar));
                return;
            } catch (Exception e) {
                zzcbn.zzh("", e);
                throw new RemoteException();
            }
        }
        zzcbn.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzD(IObjectWrapper iObjectWrapper) throws RemoteException {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        Object obj = this.zza;
        if (obj instanceof OnContextChangedListener) {
            ((OnContextChangedListener) obj).onContextChanged(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzE() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onPause();
            } catch (Throwable th) {
                zzcbn.zzh("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzF() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onResume();
            } catch (Throwable th) {
                zzcbn.zzh("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzG(boolean z) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof OnImmersiveModeUpdatedListener) {
            try {
                ((OnImmersiveModeUpdatedListener) obj).onImmersiveModeUpdated(z);
                return;
            } catch (Throwable th) {
                zzcbn.zzh("", th);
                return;
            }
        }
        zzcbn.zze(OnImmersiveModeUpdatedListener.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzH(IObjectWrapper iObjectWrapper) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            zzcbn.zze("Show app open ad from adapter.");
            MediationAppOpenAd mediationAppOpenAd = this.zzj;
            if (mediationAppOpenAd != null) {
                mediationAppOpenAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
                return;
            } else {
                zzcbn.zzg("Can not show null mediation app open ad.");
                throw new RemoteException();
            }
        }
        zzcbn.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzI() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationInterstitialAdapter) {
            zzcbn.zze("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) this.zza).showInterstitial();
                return;
            } catch (Throwable th) {
                zzcbn.zzh("", th);
                throw new RemoteException();
            }
        }
        zzcbn.zzj(MediationInterstitialAdapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzJ(IObjectWrapper iObjectWrapper) throws RemoteException {
        Object obj = this.zza;
        if ((obj instanceof Adapter) || (obj instanceof MediationInterstitialAdapter)) {
            if (obj instanceof MediationInterstitialAdapter) {
                zzI();
                return;
            }
            zzcbn.zze("Show interstitial ad from adapter.");
            MediationInterstitialAd mediationInterstitialAd = this.zzf;
            if (mediationInterstitialAd != null) {
                mediationInterstitialAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
                return;
            } else {
                zzcbn.zzg("Can not show null mediation interstitial ad.");
                throw new RemoteException();
            }
        }
        zzcbn.zzj(MediationInterstitialAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzK(IObjectWrapper iObjectWrapper) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            zzcbn.zze("Show rewarded ad from adapter.");
            MediationRewardedAd mediationRewardedAd = this.zzh;
            if (mediationRewardedAd != null) {
                mediationRewardedAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
                return;
            } else {
                zzcbn.zzg("Can not show null mediation rewarded ad.");
                throw new RemoteException();
            }
        }
        zzcbn.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzL() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            MediationRewardedAd mediationRewardedAd = this.zzh;
            if (mediationRewardedAd != null) {
                mediationRewardedAd.showAd((Context) ObjectWrapper.unwrap(this.zzd));
                return;
            } else {
                zzcbn.zzg("Can not show null mediated rewarded ad.");
                throw new RemoteException();
            }
        }
        zzcbn.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final boolean zzM() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final boolean zzN() throws RemoteException {
        Object obj = this.zza;
        if ((obj instanceof Adapter) || zzbqk.zza(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            return this.zzc != null;
        }
        Object obj2 = this.zza;
        zzcbn.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj2.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final zzbqc zzO() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final zzbqd zzP() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final Bundle zze() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final Bundle zzf() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final Bundle zzg() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final com.google.android.gms.ads.internal.client.zzdq zzh() {
        Object obj = this.zza;
        if (obj instanceof com.google.android.gms.ads.mediation.zza) {
            try {
                return ((com.google.android.gms.ads.mediation.zza) obj).getVideoController();
            } catch (Throwable th) {
                zzcbn.zzh("", th);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final zzbhc zzi() {
        zzbqu zzbquVar = this.zzb;
        if (zzbquVar == null) {
            return null;
        }
        NativeCustomTemplateAd zza = zzbquVar.zza();
        if (zza instanceof zzbhd) {
            return ((zzbhd) zza).zza();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final zzbqa zzj() {
        MediationInterscrollerAd mediationInterscrollerAd = this.zzi;
        if (mediationInterscrollerAd != null) {
            return new zzbqt(mediationInterscrollerAd);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final zzbqg zzk() {
        UnifiedNativeAdMapper unifiedNativeAdMapper;
        UnifiedNativeAdMapper zzb;
        Object obj = this.zza;
        if (!(obj instanceof MediationNativeAdapter)) {
            if (!(obj instanceof Adapter) || (unifiedNativeAdMapper = this.zzg) == null) {
                return null;
            }
            return new zzbqx(unifiedNativeAdMapper);
        }
        zzbqu zzbquVar = this.zzb;
        if (zzbquVar == null || (zzb = zzbquVar.zzb()) == null) {
            return null;
        }
        return new zzbqx(zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final zzbsd zzl() {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            return zzbsd.zza(((Adapter) obj).getVersionInfo());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final zzbsd zzm() {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            return zzbsd.zza(((Adapter) obj).getSDKVersionInfo());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final IObjectWrapper zzn() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return ObjectWrapper.wrap(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th) {
                zzcbn.zzh("", th);
                throw new RemoteException();
            }
        }
        if (obj instanceof Adapter) {
            return ObjectWrapper.wrap(this.zze);
        }
        zzcbn.zzj(MediationBannerAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzo() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onDestroy();
            } catch (Throwable th) {
                zzcbn.zzh("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzp(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbxb zzbxbVar, String str2) throws RemoteException {
        Object obj = this.zza;
        if ((obj instanceof Adapter) || zzbqk.zza(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            this.zzd = iObjectWrapper;
            this.zzc = zzbxbVar;
            zzbxbVar.zzl(ObjectWrapper.wrap(this.zza));
            return;
        }
        Object obj2 = this.zza;
        zzcbn.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj2.getClass().getCanonicalName());
        throw new RemoteException();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzq(IObjectWrapper iObjectWrapper, zzbme zzbmeVar, List list) throws RemoteException {
        char c;
        if (!(this.zza instanceof Adapter)) {
            throw new RemoteException();
        }
        zzbqm zzbqmVar = new zzbqm(this, zzbmeVar);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzbmk zzbmkVar = (zzbmk) it.next();
            String str = zzbmkVar.zza;
            switch (str.hashCode()) {
                case -1396342996:
                    if (str.equals("banner")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1052618729:
                    if (str.equals("native")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -239580146:
                    if (str.equals("rewarded")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 604727084:
                    if (str.equals("interstitial")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1167692200:
                    if (str.equals(FirebaseAnalytics.Event.APP_OPEN)) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1778294298:
                    if (str.equals("app_open_ad")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 1911491517:
                    if (str.equals("rewarded_interstitial")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            AdFormat adFormat = null;
            switch (c) {
                case 0:
                    adFormat = AdFormat.BANNER;
                    break;
                case 1:
                    adFormat = AdFormat.INTERSTITIAL;
                    break;
                case 2:
                    adFormat = AdFormat.REWARDED;
                    break;
                case 3:
                    adFormat = AdFormat.REWARDED_INTERSTITIAL;
                    break;
                case 4:
                    adFormat = AdFormat.NATIVE;
                    break;
                case 5:
                    adFormat = AdFormat.APP_OPEN_AD;
                    break;
                case 6:
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzkU)).booleanValue()) {
                        adFormat = AdFormat.APP_OPEN_AD;
                        break;
                    }
                    break;
            }
            if (adFormat != null) {
                arrayList.add(new MediationConfiguration(adFormat, zzbmkVar.zzb));
            }
        }
        ((Adapter) this.zza).initialize((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbqmVar, arrayList);
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzr(IObjectWrapper iObjectWrapper, zzbxb zzbxbVar, List list) throws RemoteException {
        zzcbn.zzj("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzs(com.google.android.gms.ads.internal.client.zzl zzlVar, String str) throws RemoteException {
        zzB(zzlVar, str, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzt(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbpx zzbpxVar) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            zzcbn.zze("Requesting app open ad from adapter.");
            try {
                ((Adapter) this.zza).loadAppOpenAd(new MediationAppOpenAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzV(str, zzlVar, null), zzU(zzlVar), zzW(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzX(str, zzlVar), ""), new zzbqr(this, zzbpxVar));
                return;
            } catch (Exception e) {
                zzcbn.zzh("", e);
                throw new RemoteException();
            }
        }
        zzcbn.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzu(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbpx zzbpxVar) throws RemoteException {
        zzv(iObjectWrapper, zzqVar, zzlVar, str, null, zzbpxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzv(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbpx zzbpxVar) throws RemoteException {
        RemoteException remoteException;
        Object obj = this.zza;
        if (!(obj instanceof MediationBannerAdapter) && !(obj instanceof Adapter)) {
            zzcbn.zzj(MediationBannerAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        zzcbn.zze("Requesting banner ad from adapter.");
        AdSize zzd = zzqVar.zzn ? com.google.android.gms.ads.zzb.zzd(zzqVar.zze, zzqVar.zzb) : com.google.android.gms.ads.zzb.zzc(zzqVar.zze, zzqVar.zzb, zzqVar.zza);
        Object obj2 = this.zza;
        if (!(obj2 instanceof MediationBannerAdapter)) {
            if (obj2 instanceof Adapter) {
                try {
                    ((Adapter) obj2).loadBannerAd(new MediationBannerAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzV(str, zzlVar, str2), zzU(zzlVar), zzW(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzX(str, zzlVar), zzd, this.zzk), new zzbqn(this, zzbpxVar));
                    return;
                } finally {
                }
            }
            return;
        }
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) obj2;
            List list = zzlVar.zze;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j = zzlVar.zzb;
            zzbqj zzbqjVar = new zzbqj(j == -1 ? null : new Date(j), zzlVar.zzd, hashSet, zzlVar.zzk, zzW(zzlVar), zzlVar.zzg, zzlVar.zzr, zzlVar.zzt, zzX(str, zzlVar));
            Bundle bundle = zzlVar.zzm;
            mediationBannerAdapter.requestBannerAd((Context) ObjectWrapper.unwrap(iObjectWrapper), new zzbqu(zzbpxVar), zzV(str, zzlVar, str2), zzd, zzbqjVar, bundle != null ? bundle.getBundle(mediationBannerAdapter.getClass().getName()) : null);
        } finally {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzw(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbpx zzbpxVar) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            zzcbn.zze("Requesting interscroller ad from adapter.");
            try {
                Adapter adapter = (Adapter) this.zza;
                adapter.loadInterscrollerAd(new MediationBannerAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzV(str, zzlVar, str2), zzU(zzlVar), zzW(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzX(str, zzlVar), com.google.android.gms.ads.zzb.zze(zzqVar.zze, zzqVar.zzb), ""), new zzbql(this, zzbpxVar, adapter));
                return;
            } catch (Exception e) {
                zzcbn.zzh("", e);
                throw new RemoteException();
            }
        }
        zzcbn.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzx(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbpx zzbpxVar) throws RemoteException {
        zzy(iObjectWrapper, zzlVar, str, null, zzbpxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzy(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbpx zzbpxVar) throws RemoteException {
        RemoteException remoteException;
        Object obj = this.zza;
        if (!(obj instanceof MediationInterstitialAdapter) && !(obj instanceof Adapter)) {
            zzcbn.zzj(MediationInterstitialAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        zzcbn.zze("Requesting interstitial ad from adapter.");
        Object obj2 = this.zza;
        if (!(obj2 instanceof MediationInterstitialAdapter)) {
            if (obj2 instanceof Adapter) {
                try {
                    ((Adapter) obj2).loadInterstitialAd(new MediationInterstitialAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzV(str, zzlVar, str2), zzU(zzlVar), zzW(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzX(str, zzlVar), this.zzk), new zzbqo(this, zzbpxVar));
                    return;
                } finally {
                }
            }
            return;
        }
        try {
            MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) obj2;
            List list = zzlVar.zze;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j = zzlVar.zzb;
            zzbqj zzbqjVar = new zzbqj(j == -1 ? null : new Date(j), zzlVar.zzd, hashSet, zzlVar.zzk, zzW(zzlVar), zzlVar.zzg, zzlVar.zzr, zzlVar.zzt, zzX(str, zzlVar));
            Bundle bundle = zzlVar.zzm;
            mediationInterstitialAdapter.requestInterstitialAd((Context) ObjectWrapper.unwrap(iObjectWrapper), new zzbqu(zzbpxVar), zzV(str, zzlVar, str2), zzbqjVar, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
        } finally {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzz(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbpx zzbpxVar, zzbfw zzbfwVar, List list) throws RemoteException {
        RemoteException remoteException;
        Object obj = this.zza;
        if (!(obj instanceof MediationNativeAdapter) && !(obj instanceof Adapter)) {
            zzcbn.zzj(MediationNativeAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        zzcbn.zze("Requesting native ad from adapter.");
        Object obj2 = this.zza;
        if (!(obj2 instanceof MediationNativeAdapter)) {
            if (obj2 instanceof Adapter) {
                try {
                    ((Adapter) obj2).loadNativeAd(new MediationNativeAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzV(str, zzlVar, str2), zzU(zzlVar), zzW(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzX(str, zzlVar), this.zzk, zzbfwVar), new zzbqp(this, zzbpxVar));
                    return;
                } finally {
                }
            }
            return;
        }
        try {
            MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj2;
            List list2 = zzlVar.zze;
            HashSet hashSet = list2 != null ? new HashSet(list2) : null;
            long j = zzlVar.zzb;
            zzbqw zzbqwVar = new zzbqw(j == -1 ? null : new Date(j), zzlVar.zzd, hashSet, zzlVar.zzk, zzW(zzlVar), zzlVar.zzg, zzbfwVar, list, zzlVar.zzr, zzlVar.zzt, zzX(str, zzlVar));
            Bundle bundle = zzlVar.zzm;
            Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
            this.zzb = new zzbqu(zzbpxVar);
            mediationNativeAdapter.requestNativeAd((Context) ObjectWrapper.unwrap(iObjectWrapper), this.zzb, zzV(str, zzlVar, str2), zzbqwVar, bundle2);
        } finally {
        }
    }

    public zzbqs(MediationAdapter mediationAdapter) {
        this.zza = mediationAdapter;
    }
}
