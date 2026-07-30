package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import androidx.collection.SimpleArrayMap;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzdoh {
    private int zza;
    private com.google.android.gms.ads.internal.client.zzed zzb;
    private zzbkl zzc;
    private View zzd;
    private List zze;
    private com.google.android.gms.ads.internal.client.zzez zzg;
    private Bundle zzh;
    private zzcjl zzi;
    private zzcjl zzj;
    private zzcjl zzk;
    private zzekb zzl;
    private ListenableFuture zzm;
    private zzcen zzn;
    private View zzo;
    private View zzp;
    private IObjectWrapper zzq;
    private double zzr;
    private zzbks zzs;
    private zzbks zzt;
    private String zzu;
    private float zzx;
    private String zzy;
    private final SimpleArrayMap zzv = new SimpleArrayMap();
    private final SimpleArrayMap zzw = new SimpleArrayMap();
    private List zzf = Collections.emptyList();

    public static zzdoh zzaf(zzbui zzbuiVar) {
        try {
            return zzak(zzam(zzbuiVar.zzn(), zzbuiVar), zzbuiVar.zzo(), (View) zzal(zzbuiVar.zzp()), zzbuiVar.zze(), zzbuiVar.zzf(), zzbuiVar.zzg(), zzbuiVar.zzs(), zzbuiVar.zzi(), (View) zzal(zzbuiVar.zzq()), zzbuiVar.zzr(), zzbuiVar.zzl(), zzbuiVar.zzm(), zzbuiVar.zzk(), zzbuiVar.zzh(), zzbuiVar.zzj(), zzbuiVar.zzz());
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get native ad assets from unified ad mapper", e);
            return null;
        }
    }

    public static zzdoh zzag(zzbuf zzbufVar) {
        try {
            zzdog zzam = zzam(zzbufVar.zzs(), null);
            zzbkl zzt = zzbufVar.zzt();
            View view = (View) zzal(zzbufVar.zzr());
            String zze = zzbufVar.zze();
            List zzf = zzbufVar.zzf();
            String zzg = zzbufVar.zzg();
            Bundle zzp = zzbufVar.zzp();
            String zzi = zzbufVar.zzi();
            View view2 = (View) zzal(zzbufVar.zzu());
            IObjectWrapper zzv = zzbufVar.zzv();
            String zzj = zzbufVar.zzj();
            zzbks zzh = zzbufVar.zzh();
            zzdoh zzdohVar = new zzdoh();
            zzdohVar.zza = 1;
            zzdohVar.zzb = zzam;
            zzdohVar.zzc = zzt;
            zzdohVar.zzd = view;
            zzdohVar.zzs("headline", zze);
            zzdohVar.zze = zzf;
            zzdohVar.zzs(SDKConstants.PARAM_A2U_BODY, zzg);
            zzdohVar.zzh = zzp;
            zzdohVar.zzs("call_to_action", zzi);
            zzdohVar.zzo = view2;
            zzdohVar.zzq = zzv;
            zzdohVar.zzs("advertiser", zzj);
            zzdohVar.zzt = zzh;
            return zzdohVar;
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get native ad from content ad mapper", e);
            return null;
        }
    }

    public static zzdoh zzah(zzbue zzbueVar) {
        zzdoh zzdohVar;
        try {
            zzdog zzam = zzam(zzbueVar.zzt(), null);
            zzbkl zzv = zzbueVar.zzv();
            View view = (View) zzal(zzbueVar.zzu());
            String zze = zzbueVar.zze();
            List zzf = zzbueVar.zzf();
            String zzg = zzbueVar.zzg();
            Bundle zzr = zzbueVar.zzr();
            String zzi = zzbueVar.zzi();
            View view2 = (View) zzal(zzbueVar.zzw());
            IObjectWrapper zzx = zzbueVar.zzx();
            String zzk = zzbueVar.zzk();
            String zzl = zzbueVar.zzl();
            double zzj = zzbueVar.zzj();
            zzbks zzh = zzbueVar.zzh();
            zzdohVar = null;
            try {
                zzdoh zzdohVar2 = new zzdoh();
                zzdohVar2.zza = 2;
                zzdohVar2.zzb = zzam;
                zzdohVar2.zzc = zzv;
                zzdohVar2.zzd = view;
                zzdohVar2.zzs("headline", zze);
                zzdohVar2.zze = zzf;
                zzdohVar2.zzs(SDKConstants.PARAM_A2U_BODY, zzg);
                zzdohVar2.zzh = zzr;
                zzdohVar2.zzs("call_to_action", zzi);
                zzdohVar2.zzo = view2;
                zzdohVar2.zzq = zzx;
                zzdohVar2.zzs("store", zzk);
                zzdohVar2.zzs(FirebaseAnalytics.Param.PRICE, zzl);
                zzdohVar2.zzr = zzj;
                zzdohVar2.zzs = zzh;
                return zzdohVar2;
            } catch (RemoteException e) {
                e = e;
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get native ad from app install ad mapper", e);
                return zzdohVar;
            }
        } catch (RemoteException e2) {
            e = e2;
            zzdohVar = null;
        }
    }

    public static zzdoh zzai(zzbue zzbueVar) {
        try {
            return zzak(zzam(zzbueVar.zzt(), null), zzbueVar.zzv(), (View) zzal(zzbueVar.zzu()), zzbueVar.zze(), zzbueVar.zzf(), zzbueVar.zzg(), zzbueVar.zzr(), zzbueVar.zzi(), (View) zzal(zzbueVar.zzw()), zzbueVar.zzx(), zzbueVar.zzk(), zzbueVar.zzl(), zzbueVar.zzj(), zzbueVar.zzh(), null, 0.0f);
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get native ad assets from app install ad mapper", e);
            return null;
        }
    }

    public static zzdoh zzaj(zzbuf zzbufVar) {
        try {
            return zzak(zzam(zzbufVar.zzs(), null), zzbufVar.zzt(), (View) zzal(zzbufVar.zzr()), zzbufVar.zze(), zzbufVar.zzf(), zzbufVar.zzg(), zzbufVar.zzp(), zzbufVar.zzi(), (View) zzal(zzbufVar.zzu()), zzbufVar.zzv(), null, null, -1.0d, zzbufVar.zzh(), zzbufVar.zzj(), 0.0f);
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get native ad assets from content ad mapper", e);
            return null;
        }
    }

    private static zzdoh zzak(com.google.android.gms.ads.internal.client.zzed zzedVar, zzbkl zzbklVar, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, IObjectWrapper iObjectWrapper, String str4, String str5, double d, zzbks zzbksVar, String str6, float f) {
        zzdoh zzdohVar = new zzdoh();
        zzdohVar.zza = 6;
        zzdohVar.zzb = zzedVar;
        zzdohVar.zzc = zzbklVar;
        zzdohVar.zzd = view;
        zzdohVar.zzs("headline", str);
        zzdohVar.zze = list;
        zzdohVar.zzs(SDKConstants.PARAM_A2U_BODY, str2);
        zzdohVar.zzh = bundle;
        zzdohVar.zzs("call_to_action", str3);
        zzdohVar.zzo = view2;
        zzdohVar.zzq = iObjectWrapper;
        zzdohVar.zzs("store", str4);
        zzdohVar.zzs(FirebaseAnalytics.Param.PRICE, str5);
        zzdohVar.zzr = d;
        zzdohVar.zzs = zzbksVar;
        zzdohVar.zzs("advertiser", str6);
        zzdohVar.zzu(f);
        return zzdohVar;
    }

    private static Object zzal(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return null;
        }
        return ObjectWrapper.unwrap(iObjectWrapper);
    }

    private static zzdog zzam(com.google.android.gms.ads.internal.client.zzed zzedVar, zzbui zzbuiVar) {
        if (zzedVar == null) {
            return null;
        }
        return new zzdog(zzedVar, zzbuiVar);
    }

    public final synchronized View zzA() {
        return this.zzd;
    }

    public final synchronized String zzB() {
        return zzw("headline");
    }

    public final synchronized List zzC() {
        return this.zze;
    }

    public final zzbks zzD() {
        List list = this.zze;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Object obj = this.zze.get(0);
        if (obj instanceof IBinder) {
            return zzbkr.zzh((IBinder) obj);
        }
        return null;
    }

    public final synchronized List zzE() {
        return this.zzf;
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzez zzF() {
        return this.zzg;
    }

    public final synchronized String zzG() {
        return zzw(SDKConstants.PARAM_A2U_BODY);
    }

    public final synchronized Bundle zzH() {
        if (this.zzh == null) {
            this.zzh = new Bundle();
        }
        return this.zzh;
    }

    public final synchronized String zzI() {
        return zzw("call_to_action");
    }

    public final synchronized View zzJ() {
        return this.zzo;
    }

    public final synchronized View zzK() {
        return this.zzp;
    }

    public final synchronized IObjectWrapper zzL() {
        return this.zzq;
    }

    public final synchronized String zzM() {
        return zzw("store");
    }

    public final synchronized String zzN() {
        return zzw(FirebaseAnalytics.Param.PRICE);
    }

    public final synchronized double zzO() {
        return this.zzr;
    }

    public final synchronized zzbks zzP() {
        return this.zzs;
    }

    public final synchronized String zzQ() {
        return zzw("advertiser");
    }

    public final synchronized zzbks zzR() {
        return this.zzt;
    }

    public final synchronized String zzS() {
        return this.zzu;
    }

    public final synchronized zzcjl zzT() {
        return this.zzi;
    }

    public final synchronized zzcjl zzU() {
        return this.zzj;
    }

    public final synchronized boolean zzV() {
        return this.zzj != null;
    }

    public final synchronized zzcjl zzW() {
        return this.zzk;
    }

    public final synchronized ListenableFuture zzX() {
        return this.zzm;
    }

    public final synchronized zzcen zzY() {
        return this.zzn;
    }

    public final synchronized zzekb zzZ() {
        return this.zzl;
    }

    public final synchronized void zza(int i) {
        this.zza = i;
    }

    public final synchronized SimpleArrayMap zzaa() {
        return this.zzv;
    }

    public final synchronized float zzab() {
        return this.zzx;
    }

    public final synchronized String zzac() {
        return this.zzy;
    }

    public final synchronized SimpleArrayMap zzad() {
        return this.zzw;
    }

    public final synchronized void zzae() {
        zzcjl zzcjlVar = this.zzi;
        if (zzcjlVar != null) {
            zzcjlVar.destroy();
            this.zzi = null;
        }
        zzcjl zzcjlVar2 = this.zzj;
        if (zzcjlVar2 != null) {
            zzcjlVar2.destroy();
            this.zzj = null;
        }
        zzcjl zzcjlVar3 = this.zzk;
        if (zzcjlVar3 != null) {
            zzcjlVar3.destroy();
            this.zzk = null;
        }
        ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture != null) {
            listenableFuture.cancel(false);
            this.zzm = null;
        }
        zzcen zzcenVar = this.zzn;
        if (zzcenVar != null) {
            zzcenVar.cancel(false);
            this.zzn = null;
        }
        this.zzl = null;
        this.zzv.clear();
        this.zzw.clear();
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = null;
        this.zzh = null;
        this.zzo = null;
        this.zzp = null;
        this.zzq = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
    }

    public final synchronized void zzb(com.google.android.gms.ads.internal.client.zzed zzedVar) {
        this.zzb = zzedVar;
    }

    public final synchronized void zzc(zzbkl zzbklVar) {
        this.zzc = zzbklVar;
    }

    public final synchronized void zzd(List list) {
        this.zze = list;
    }

    public final synchronized void zze(List list) {
        this.zzf = list;
    }

    public final synchronized void zzf(com.google.android.gms.ads.internal.client.zzez zzezVar) {
        this.zzg = zzezVar;
    }

    public final synchronized void zzg(View view) {
        this.zzo = view;
    }

    public final synchronized void zzh(View view) {
        this.zzp = view;
    }

    public final synchronized void zzi(double d) {
        this.zzr = d;
    }

    public final synchronized void zzj(zzbks zzbksVar) {
        this.zzs = zzbksVar;
    }

    public final synchronized void zzk(zzbks zzbksVar) {
        this.zzt = zzbksVar;
    }

    public final synchronized void zzl(String str) {
        this.zzu = str;
    }

    public final synchronized void zzm(zzcjl zzcjlVar) {
        this.zzi = zzcjlVar;
    }

    public final synchronized void zzn(zzcjl zzcjlVar) {
        this.zzj = zzcjlVar;
    }

    public final synchronized void zzo(zzcjl zzcjlVar) {
        this.zzk = zzcjlVar;
    }

    public final synchronized void zzp(ListenableFuture listenableFuture) {
        this.zzm = listenableFuture;
    }

    public final synchronized void zzq(zzekb zzekbVar) {
        this.zzl = zzekbVar;
    }

    public final synchronized void zzr(zzcen zzcenVar) {
        this.zzn = zzcenVar;
    }

    public final synchronized void zzs(String str, String str2) {
        if (str2 == null) {
            this.zzw.remove(str);
        } else {
            this.zzw.put(str, str2);
        }
    }

    public final synchronized void zzt(String str, zzbkd zzbkdVar) {
        if (zzbkdVar == null) {
            this.zzv.remove(str);
        } else {
            this.zzv.put(str, zzbkdVar);
        }
    }

    public final synchronized void zzu(float f) {
        this.zzx = f;
    }

    public final synchronized void zzv(String str) {
        this.zzy = str;
    }

    public final synchronized String zzw(String str) {
        return (String) this.zzw.get(str);
    }

    public final synchronized int zzx() {
        return this.zza;
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzed zzy() {
        return this.zzb;
    }

    public final synchronized zzbkl zzz() {
        return this.zzc;
    }
}
