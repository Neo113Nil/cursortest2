package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdkk {
    private int zza;
    private com.google.android.gms.ads.internal.client.zzdq zzb;
    private zzbga zzc;
    private View zzd;
    private List zze;
    private com.google.android.gms.ads.internal.client.zzel zzg;
    private Bundle zzh;
    private zzcgv zzi;
    private zzcgv zzj;
    private zzcgv zzk;
    private zzflf zzl;
    private ListenableFuture zzm;
    private zzccf zzn;
    private View zzo;
    private View zzp;
    private IObjectWrapper zzq;
    private double zzr;
    private zzbgi zzs;
    private zzbgi zzt;
    private String zzu;
    private float zzx;
    private String zzy;
    private final SimpleArrayMap zzv = new SimpleArrayMap();
    private final SimpleArrayMap zzw = new SimpleArrayMap();
    private List zzf = Collections.emptyList();

    public static zzdkk zzag(zzbqc zzbqcVar) {
        try {
            zzdkj zzak = zzak(zzbqcVar.zzg(), null);
            zzbga zzh = zzbqcVar.zzh();
            View view = (View) zzam(zzbqcVar.zzj());
            String zzo = zzbqcVar.zzo();
            List zzr = zzbqcVar.zzr();
            String zzm = zzbqcVar.zzm();
            Bundle zzf = zzbqcVar.zzf();
            String zzn = zzbqcVar.zzn();
            View view2 = (View) zzam(zzbqcVar.zzk());
            IObjectWrapper zzl = zzbqcVar.zzl();
            String zzq = zzbqcVar.zzq();
            String zzp = zzbqcVar.zzp();
            double zze = zzbqcVar.zze();
            zzbgi zzi = zzbqcVar.zzi();
            zzdkk zzdkkVar = new zzdkk();
            zzdkkVar.zza = 2;
            zzdkkVar.zzb = zzak;
            zzdkkVar.zzc = zzh;
            zzdkkVar.zzd = view;
            zzdkkVar.zzZ("headline", zzo);
            zzdkkVar.zze = zzr;
            zzdkkVar.zzZ("body", zzm);
            zzdkkVar.zzh = zzf;
            zzdkkVar.zzZ("call_to_action", zzn);
            zzdkkVar.zzo = view2;
            zzdkkVar.zzq = zzl;
            zzdkkVar.zzZ("store", zzq);
            zzdkkVar.zzZ(FirebaseAnalytics.Param.PRICE, zzp);
            zzdkkVar.zzr = zze;
            zzdkkVar.zzs = zzi;
            return zzdkkVar;
        } catch (RemoteException e) {
            zzcbn.zzk("Failed to get native ad from app install ad mapper", e);
            return null;
        }
    }

    public static zzdkk zzah(zzbqd zzbqdVar) {
        try {
            zzdkj zzak = zzak(zzbqdVar.zzf(), null);
            zzbga zzg = zzbqdVar.zzg();
            View view = (View) zzam(zzbqdVar.zzi());
            String zzo = zzbqdVar.zzo();
            List zzp = zzbqdVar.zzp();
            String zzm = zzbqdVar.zzm();
            Bundle zze = zzbqdVar.zze();
            String zzn = zzbqdVar.zzn();
            View view2 = (View) zzam(zzbqdVar.zzj());
            IObjectWrapper zzk = zzbqdVar.zzk();
            String zzl = zzbqdVar.zzl();
            zzbgi zzh = zzbqdVar.zzh();
            zzdkk zzdkkVar = new zzdkk();
            zzdkkVar.zza = 1;
            zzdkkVar.zzb = zzak;
            zzdkkVar.zzc = zzg;
            zzdkkVar.zzd = view;
            zzdkkVar.zzZ("headline", zzo);
            zzdkkVar.zze = zzp;
            zzdkkVar.zzZ("body", zzm);
            zzdkkVar.zzh = zze;
            zzdkkVar.zzZ("call_to_action", zzn);
            zzdkkVar.zzo = view2;
            zzdkkVar.zzq = zzk;
            zzdkkVar.zzZ("advertiser", zzl);
            zzdkkVar.zzt = zzh;
            return zzdkkVar;
        } catch (RemoteException e) {
            zzcbn.zzk("Failed to get native ad from content ad mapper", e);
            return null;
        }
    }

    public static zzdkk zzai(zzbqc zzbqcVar) {
        try {
            return zzal(zzak(zzbqcVar.zzg(), null), zzbqcVar.zzh(), (View) zzam(zzbqcVar.zzj()), zzbqcVar.zzo(), zzbqcVar.zzr(), zzbqcVar.zzm(), zzbqcVar.zzf(), zzbqcVar.zzn(), (View) zzam(zzbqcVar.zzk()), zzbqcVar.zzl(), zzbqcVar.zzq(), zzbqcVar.zzp(), zzbqcVar.zze(), zzbqcVar.zzi(), null, 0.0f);
        } catch (RemoteException e) {
            zzcbn.zzk("Failed to get native ad assets from app install ad mapper", e);
            return null;
        }
    }

    public static zzdkk zzaj(zzbqd zzbqdVar) {
        try {
            return zzal(zzak(zzbqdVar.zzf(), null), zzbqdVar.zzg(), (View) zzam(zzbqdVar.zzi()), zzbqdVar.zzo(), zzbqdVar.zzp(), zzbqdVar.zzm(), zzbqdVar.zze(), zzbqdVar.zzn(), (View) zzam(zzbqdVar.zzj()), zzbqdVar.zzk(), null, null, -1.0d, zzbqdVar.zzh(), zzbqdVar.zzl(), 0.0f);
        } catch (RemoteException e) {
            zzcbn.zzk("Failed to get native ad assets from content ad mapper", e);
            return null;
        }
    }

    private static zzdkj zzak(com.google.android.gms.ads.internal.client.zzdq zzdqVar, zzbqg zzbqgVar) {
        if (zzdqVar == null) {
            return null;
        }
        return new zzdkj(zzdqVar, zzbqgVar);
    }

    private static zzdkk zzal(com.google.android.gms.ads.internal.client.zzdq zzdqVar, zzbga zzbgaVar, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, IObjectWrapper iObjectWrapper, String str4, String str5, double d, zzbgi zzbgiVar, String str6, float f) {
        zzdkk zzdkkVar = new zzdkk();
        zzdkkVar.zza = 6;
        zzdkkVar.zzb = zzdqVar;
        zzdkkVar.zzc = zzbgaVar;
        zzdkkVar.zzd = view;
        zzdkkVar.zzZ("headline", str);
        zzdkkVar.zze = list;
        zzdkkVar.zzZ("body", str2);
        zzdkkVar.zzh = bundle;
        zzdkkVar.zzZ("call_to_action", str3);
        zzdkkVar.zzo = view2;
        zzdkkVar.zzq = iObjectWrapper;
        zzdkkVar.zzZ("store", str4);
        zzdkkVar.zzZ(FirebaseAnalytics.Param.PRICE, str5);
        zzdkkVar.zzr = d;
        zzdkkVar.zzs = zzbgiVar;
        zzdkkVar.zzZ("advertiser", str6);
        zzdkkVar.zzR(f);
        return zzdkkVar;
    }

    private static Object zzam(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return null;
        }
        return ObjectWrapper.unwrap(iObjectWrapper);
    }

    public static zzdkk zzt(zzbqg zzbqgVar) {
        try {
            return zzal(zzak(zzbqgVar.zzj(), zzbqgVar), zzbqgVar.zzk(), (View) zzam(zzbqgVar.zzm()), zzbqgVar.zzs(), zzbqgVar.zzv(), zzbqgVar.zzq(), zzbqgVar.zzi(), zzbqgVar.zzr(), (View) zzam(zzbqgVar.zzn()), zzbqgVar.zzo(), zzbqgVar.zzu(), zzbqgVar.zzt(), zzbqgVar.zze(), zzbqgVar.zzl(), zzbqgVar.zzp(), zzbqgVar.zzf());
        } catch (RemoteException e) {
            zzcbn.zzk("Failed to get native ad assets from unified ad mapper", e);
            return null;
        }
    }

    public final synchronized String zzA() {
        return this.zzu;
    }

    public final synchronized String zzB() {
        return zzF("headline");
    }

    public final synchronized String zzC() {
        return this.zzy;
    }

    public final synchronized String zzD() {
        return zzF(FirebaseAnalytics.Param.PRICE);
    }

    public final synchronized String zzE() {
        return zzF("store");
    }

    public final synchronized String zzF(String str) {
        return (String) this.zzw.get(str);
    }

    public final synchronized List zzG() {
        return this.zze;
    }

    public final synchronized List zzH() {
        return this.zzf;
    }

    public final synchronized void zzI() {
        zzcgv zzcgvVar = this.zzi;
        if (zzcgvVar != null) {
            zzcgvVar.destroy();
            this.zzi = null;
        }
        zzcgv zzcgvVar2 = this.zzj;
        if (zzcgvVar2 != null) {
            zzcgvVar2.destroy();
            this.zzj = null;
        }
        zzcgv zzcgvVar3 = this.zzk;
        if (zzcgvVar3 != null) {
            zzcgvVar3.destroy();
            this.zzk = null;
        }
        ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture != null) {
            listenableFuture.cancel(false);
            this.zzm = null;
        }
        zzccf zzccfVar = this.zzn;
        if (zzccfVar != null) {
            zzccfVar.cancel(false);
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

    public final synchronized void zzJ(zzbga zzbgaVar) {
        this.zzc = zzbgaVar;
    }

    public final synchronized void zzK(String str) {
        this.zzu = str;
    }

    public final synchronized void zzL(com.google.android.gms.ads.internal.client.zzel zzelVar) {
        this.zzg = zzelVar;
    }

    public final synchronized void zzM(zzbgi zzbgiVar) {
        this.zzs = zzbgiVar;
    }

    public final synchronized void zzN(String str, zzbfu zzbfuVar) {
        if (zzbfuVar == null) {
            this.zzv.remove(str);
        } else {
            this.zzv.put(str, zzbfuVar);
        }
    }

    public final synchronized void zzO(zzcgv zzcgvVar) {
        this.zzj = zzcgvVar;
    }

    public final synchronized void zzP(List list) {
        this.zze = list;
    }

    public final synchronized void zzQ(zzbgi zzbgiVar) {
        this.zzt = zzbgiVar;
    }

    public final synchronized void zzR(float f) {
        this.zzx = f;
    }

    public final synchronized void zzS(List list) {
        this.zzf = list;
    }

    public final synchronized void zzT(zzcgv zzcgvVar) {
        this.zzk = zzcgvVar;
    }

    public final synchronized void zzU(ListenableFuture listenableFuture) {
        this.zzm = listenableFuture;
    }

    public final synchronized void zzV(String str) {
        this.zzy = str;
    }

    public final synchronized void zzW(zzflf zzflfVar) {
        this.zzl = zzflfVar;
    }

    public final synchronized void zzX(zzccf zzccfVar) {
        this.zzn = zzccfVar;
    }

    public final synchronized void zzY(double d) {
        this.zzr = d;
    }

    public final synchronized void zzZ(String str, String str2) {
        if (str2 == null) {
            this.zzw.remove(str);
        } else {
            this.zzw.put(str, str2);
        }
    }

    public final synchronized double zza() {
        return this.zzr;
    }

    public final synchronized void zzaa(int i) {
        this.zza = i;
    }

    public final synchronized void zzab(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        this.zzb = zzdqVar;
    }

    public final synchronized void zzac(View view) {
        this.zzo = view;
    }

    public final synchronized void zzad(zzcgv zzcgvVar) {
        this.zzi = zzcgvVar;
    }

    public final synchronized void zzae(View view) {
        this.zzp = view;
    }

    public final synchronized boolean zzaf() {
        return this.zzj != null;
    }

    public final synchronized float zzb() {
        return this.zzx;
    }

    public final synchronized int zzc() {
        return this.zza;
    }

    public final synchronized Bundle zzd() {
        if (this.zzh == null) {
            this.zzh = new Bundle();
        }
        return this.zzh;
    }

    public final synchronized View zze() {
        return this.zzd;
    }

    public final synchronized View zzf() {
        return this.zzo;
    }

    public final synchronized View zzg() {
        return this.zzp;
    }

    public final synchronized SimpleArrayMap zzh() {
        return this.zzv;
    }

    public final synchronized SimpleArrayMap zzi() {
        return this.zzw;
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzdq zzj() {
        return this.zzb;
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzel zzk() {
        return this.zzg;
    }

    public final synchronized zzbga zzl() {
        return this.zzc;
    }

    public final zzbgi zzm() {
        List list = this.zze;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Object obj = this.zze.get(0);
        if (obj instanceof IBinder) {
            return zzbgh.zzg((IBinder) obj);
        }
        return null;
    }

    public final synchronized zzbgi zzn() {
        return this.zzs;
    }

    public final synchronized zzbgi zzo() {
        return this.zzt;
    }

    public final synchronized zzccf zzp() {
        return this.zzn;
    }

    public final synchronized zzcgv zzq() {
        return this.zzj;
    }

    public final synchronized zzcgv zzr() {
        return this.zzk;
    }

    public final synchronized zzcgv zzs() {
        return this.zzi;
    }

    public final synchronized zzflf zzu() {
        return this.zzl;
    }

    public final synchronized IObjectWrapper zzv() {
        return this.zzq;
    }

    public final synchronized ListenableFuture zzw() {
        return this.zzm;
    }

    public final synchronized String zzx() {
        return zzF("advertiser");
    }

    public final synchronized String zzy() {
        return zzF("body");
    }

    public final synchronized String zzz() {
        return zzF("call_to_action");
    }
}
