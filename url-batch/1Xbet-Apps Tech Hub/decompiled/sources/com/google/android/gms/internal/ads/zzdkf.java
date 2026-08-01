package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.collection.ArrayMap;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdkf extends zzctr {
    public static final zzfwu zzc = zzfwu.zzq("3010", "3008", "1005", "1009", "2011", "2007");
    private final zzavs zzA;
    private final Executor zzd;
    private final zzdkk zze;
    private final zzdks zzf;
    private final zzdlk zzg;
    private final zzdkp zzh;
    private final zzdkv zzi;
    private final zzhdj zzj;
    private final zzhdj zzk;
    private final zzhdj zzl;
    private final zzhdj zzm;
    private final zzhdj zzn;
    private zzdmg zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private final zzbza zzs;
    private final zzasi zzt;
    private final zzcbt zzu;
    private final Context zzv;
    private final zzdkh zzw;
    private final zzenp zzx;
    private final Map zzy;
    private final List zzz;

    public zzdkf(zzctq zzctqVar, Executor executor, zzdkk zzdkkVar, zzdks zzdksVar, zzdlk zzdlkVar, zzdkp zzdkpVar, zzdkv zzdkvVar, zzhdj zzhdjVar, zzhdj zzhdjVar2, zzhdj zzhdjVar3, zzhdj zzhdjVar4, zzhdj zzhdjVar5, zzbza zzbzaVar, zzasi zzasiVar, zzcbt zzcbtVar, Context context, zzdkh zzdkhVar, zzenp zzenpVar, zzavs zzavsVar) {
        super(zzctqVar);
        this.zzd = executor;
        this.zze = zzdkkVar;
        this.zzf = zzdksVar;
        this.zzg = zzdlkVar;
        this.zzh = zzdkpVar;
        this.zzi = zzdkvVar;
        this.zzj = zzhdjVar;
        this.zzk = zzhdjVar2;
        this.zzl = zzhdjVar3;
        this.zzm = zzhdjVar4;
        this.zzn = zzhdjVar5;
        this.zzs = zzbzaVar;
        this.zzt = zzasiVar;
        this.zzu = zzcbtVar;
        this.zzv = context;
        this.zzw = zzdkhVar;
        this.zzx = zzenpVar;
        this.zzy = new HashMap();
        this.zzz = new ArrayList();
        this.zzA = zzavsVar;
    }

    public static boolean zzW(View view) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzjT)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), null);
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        long zzv = com.google.android.gms.ads.internal.util.zzt.zzv(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), null)) {
            if (zzv >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzjU)).intValue()) {
                return true;
            }
        }
        return false;
    }

    private final synchronized View zzY(Map map) {
        if (map != null) {
            zzfwu zzfwuVar = zzc;
            int size = zzfwuVar.size();
            int i = 0;
            while (i < size) {
                WeakReference weakReference = (WeakReference) map.get((String) zzfwuVar.get(i));
                i++;
                if (weakReference != null) {
                    return (View) weakReference.get();
                }
            }
        }
        return null;
    }

    private final synchronized ImageView.ScaleType zzZ() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzhP)).booleanValue()) {
            return null;
        }
        zzdmg zzdmgVar = this.zzo;
        if (zzdmgVar == null) {
            zzcbn.zze("Ad should be associated with an ad view before calling getMediaviewScaleType()");
            return null;
        }
        IObjectWrapper zzj = zzdmgVar.zzj();
        if (zzj != null) {
            return (ImageView.ScaleType) ObjectWrapper.unwrap(zzj);
        }
        return zzdlk.zza;
    }

    private final void zzaa(String str, boolean z) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzeZ)).booleanValue()) {
            zzf("Google", true);
            return;
        }
        ListenableFuture zzw = this.zze.zzw();
        if (zzw == null) {
            return;
        }
        zzgbb.zzr(zzw, new zzdkd(this, "Google", true), this.zzd);
    }

    private final synchronized void zzab(View view, Map map, Map map2) {
        this.zzg.zzd(this.zzo);
        this.zzf.zzq(view, map, map2, zzZ());
        this.zzq = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzac(View view, zzflf zzflfVar) {
        zzcgv zzr = this.zze.zzr();
        if (!this.zzh.zzd() || zzflfVar == null || zzr == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzA().zzh(zzflfVar, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzad, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzy(zzdmg zzdmgVar) {
        Iterator<String> keys;
        View view;
        if (!this.zzp) {
            this.zzo = zzdmgVar;
            this.zzg.zze(zzdmgVar);
            this.zzf.zzy(zzdmgVar.zzf(), zzdmgVar.zzm(), zzdmgVar.zzn(), zzdmgVar, zzdmgVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzct)).booleanValue()) {
                this.zzt.zzc().zzo(zzdmgVar.zzf());
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzbI)).booleanValue()) {
                zzfdu zzfduVar = this.zzb;
                if (zzfduVar.zzal && (keys = zzfduVar.zzak.keys()) != null) {
                    while (keys.hasNext()) {
                        String next = keys.next();
                        WeakReference weakReference = (WeakReference) this.zzo.zzl().get(next);
                        this.zzy.put(next, false);
                        if (weakReference != null && (view = (View) weakReference.get()) != null) {
                            zzavr zzavrVar = new zzavr(this.zzv, view);
                            this.zzz.add(zzavrVar);
                            zzavrVar.zzc(new zzdkc(this, next));
                        }
                    }
                }
            }
            if (zzdmgVar.zzi() != null) {
                zzdmgVar.zzi().zzc(this.zzs);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzae, reason: merged with bridge method [inline-methods] */
    public final void zzz(zzdmg zzdmgVar) {
        this.zzf.zzz(zzdmgVar.zzf(), zzdmgVar.zzl());
        if (zzdmgVar.zzh() != null) {
            zzdmgVar.zzh().setClickable(false);
            zzdmgVar.zzh().removeAllViews();
        }
        if (zzdmgVar.zzi() != null) {
            zzdmgVar.zzi().zze(this.zzs);
        }
        this.zzo = null;
    }

    public final synchronized void zzA(View view, Map map, Map map2, boolean z) {
        if (!this.zzq) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzbI)).booleanValue() && this.zzb.zzal) {
                Iterator it = this.zzy.keySet().iterator();
                while (it.hasNext()) {
                    if (!((Boolean) this.zzy.get((String) it.next())).booleanValue()) {
                        break;
                    }
                }
            }
            if (z) {
                View zzY = zzY(map);
                if (zzY == null) {
                    zzab(view, map, map2);
                    return;
                }
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzdK)).booleanValue()) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzdL)).booleanValue()) {
                        zzab(view, map, map2);
                        return;
                    }
                    Rect rect = new Rect();
                    if (zzY.getGlobalVisibleRect(rect, null) && zzY.getHeight() == rect.height() && zzY.getWidth() == rect.width()) {
                        zzab(view, map, map2);
                    }
                } else if (zzW(zzY)) {
                    zzab(view, map, map2);
                }
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzdJ)).booleanValue() && map != null) {
                    Iterator it2 = map.entrySet().iterator();
                    while (it2.hasNext()) {
                        View view2 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                        if (view2 != null && zzW(view2)) {
                            zzab(view, map, map2);
                            return;
                        }
                    }
                }
            }
        }
    }

    public final synchronized void zzB(com.google.android.gms.ads.internal.client.zzcw zzcwVar) {
        this.zzf.zzj(zzcwVar);
    }

    public final synchronized void zzC(View view, View view2, Map map, Map map2, boolean z) {
        this.zzg.zzc(this.zzo);
        this.zzf.zzk(view, view2, map, map2, z, zzZ());
        if (this.zzr) {
            zzdkk zzdkkVar = this.zze;
            if (zzdkkVar.zzs() != null) {
                zzdkkVar.zzs().zzd("onSdkAdUserInteractionClick", new ArrayMap());
            }
        }
    }

    public final synchronized void zzD(final View view, final int i) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzkG)).booleanValue()) {
            zzdmg zzdmgVar = this.zzo;
            if (zzdmgVar == null) {
                zzcbn.zze("Ad should be associated with an ad view before calling performClickForCustomGesture()");
            } else {
                final boolean z = zzdmgVar instanceof zzdle;
                this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdjz
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdkf.this.zzw(view, z, i);
                    }
                });
            }
        }
    }

    public final synchronized void zzE(String str) {
        this.zzf.zzl(str);
    }

    public final synchronized void zzF(Bundle bundle) {
        this.zzf.zzm(bundle);
    }

    public final synchronized void zzG() {
        zzdmg zzdmgVar = this.zzo;
        if (zzdmgVar == null) {
            zzcbn.zze("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            final boolean z = zzdmgVar instanceof zzdle;
            this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdkb
                @Override // java.lang.Runnable
                public final void run() {
                    zzdkf.this.zzx(z);
                }
            });
        }
    }

    public final synchronized void zzH() {
        if (this.zzq) {
            return;
        }
        this.zzf.zzr();
    }

    public final void zzI(View view) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzeZ)).booleanValue()) {
            zzac(view, this.zze.zzu());
            return;
        }
        zzccf zzp = this.zze.zzp();
        if (zzp == null) {
            return;
        }
        zzgbb.zzr(zzp, new zzdke(this, view), this.zzd);
    }

    public final synchronized void zzJ(View view, MotionEvent motionEvent, View view2) {
        this.zzf.zzs(view, motionEvent, view2);
    }

    public final synchronized void zzK(Bundle bundle) {
        this.zzf.zzt(bundle);
    }

    public final synchronized void zzL(View view) {
        this.zzf.zzu(view);
    }

    public final synchronized void zzM() {
        this.zzf.zzv();
    }

    public final synchronized void zzN(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
        this.zzf.zzw(zzcsVar);
    }

    public final synchronized void zzO(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        this.zzx.zza(zzdgVar);
    }

    public final synchronized void zzP(zzbic zzbicVar) {
        this.zzf.zzx(zzbicVar);
    }

    public final synchronized void zzQ(final zzdmg zzdmgVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzbG)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdjv
                @Override // java.lang.Runnable
                public final void run() {
                    zzdkf.this.zzy(zzdmgVar);
                }
            });
        } else {
            zzy(zzdmgVar);
        }
    }

    public final synchronized void zzR(final zzdmg zzdmgVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzbG)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdjw
                @Override // java.lang.Runnable
                public final void run() {
                    zzdkf.this.zzz(zzdmgVar);
                }
            });
        } else {
            zzz(zzdmgVar);
        }
    }

    public final boolean zzS() {
        return this.zzh.zze();
    }

    public final synchronized boolean zzT() {
        return this.zzf.zzA();
    }

    public final synchronized boolean zzU() {
        return this.zzf.zzB();
    }

    public final boolean zzV() {
        return this.zzh.zzd();
    }

    public final synchronized boolean zzX(Bundle bundle) {
        if (this.zzq) {
            return true;
        }
        boolean zzC = this.zzf.zzC(bundle);
        this.zzq = zzC;
        return zzC;
    }

    public final synchronized int zza() {
        return this.zzf.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzctr
    public final synchronized void zzb() {
        this.zzp = true;
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdka
            @Override // java.lang.Runnable
            public final void run() {
                zzdkf.this.zzv();
            }
        });
        super.zzb();
    }

    public final zzdkh zzc() {
        return this.zzw;
    }

    public final zzflf zzf(String str, boolean z) {
        String str2;
        zzefq zzefqVar;
        zzefp zzefpVar;
        if (!this.zzh.zzd() || TextUtils.isEmpty(str)) {
            return null;
        }
        zzdkk zzdkkVar = this.zze;
        zzcgv zzr = zzdkkVar.zzr();
        zzcgv zzs = zzdkkVar.zzs();
        if (zzr == null && zzs == null) {
            zzcbn.zzj("Omid display and video webview are null. Skipping initialization.");
            return null;
        }
        boolean z2 = false;
        boolean z3 = zzr != null;
        boolean z4 = zzs != null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzeX)).booleanValue()) {
            this.zzh.zza();
            int zzb = this.zzh.zza().zzb();
            int i = zzb - 1;
            if (i != 0) {
                if (i != 1) {
                    zzcbn.zzj("Unknown omid media type: " + (zzb != 1 ? zzb != 2 ? "UNKNOWN" : "DISPLAY" : "VIDEO") + ". Not initializing Omid.");
                    return null;
                }
                if (zzr == null) {
                    zzcbn.zzj("Omid media type was display but there was no display webview.");
                    return null;
                }
                z4 = false;
                z2 = true;
            } else {
                if (zzs == null) {
                    zzcbn.zzj("Omid media type was video but there was no video webview.");
                    return null;
                }
                z4 = true;
            }
        } else {
            z2 = z3;
        }
        if (z2) {
            str2 = null;
        } else {
            str2 = "javascript";
            zzr = zzs;
        }
        zzr.zzG();
        if (!com.google.android.gms.ads.internal.zzt.zzA().zzj(this.zzv)) {
            zzcbn.zzj("Failed to initialize omid in InternalNativeAd");
            return null;
        }
        zzcbt zzcbtVar = this.zzu;
        String str3 = zzcbtVar.zzb + "." + zzcbtVar.zzc;
        if (z4) {
            zzefpVar = zzefp.VIDEO;
            zzefqVar = zzefq.DEFINED_BY_JAVASCRIPT;
        } else {
            zzdkk zzdkkVar2 = this.zze;
            zzefp zzefpVar2 = zzefp.NATIVE_DISPLAY;
            zzefqVar = zzdkkVar2.zzc() == 3 ? zzefq.UNSPECIFIED : zzefq.ONE_PIXEL;
            zzefpVar = zzefpVar2;
        }
        zzflf zzb2 = com.google.android.gms.ads.internal.zzt.zzA().zzb(str3, zzr.zzG(), "", "javascript", str2, str, zzefqVar, zzefpVar, this.zzb.zzam);
        if (zzb2 == null) {
            zzcbn.zzj("Failed to create omid session in InternalNativeAd");
            return null;
        }
        this.zze.zzW(zzb2);
        zzr.zzap(zzb2);
        if (z4) {
            com.google.android.gms.ads.internal.zzt.zzA().zzh(zzb2, zzs.zzF());
            this.zzr = true;
        }
        if (z) {
            com.google.android.gms.ads.internal.zzt.zzA().zzi(zzb2);
            zzr.zzd("onSdkLoaded", new ArrayMap());
        }
        return zzb2;
    }

    public final String zzg() {
        return this.zzh.zzb();
    }

    public final synchronized JSONObject zzi(View view, Map map, Map map2) {
        return this.zzf.zze(view, map, map2, zzZ());
    }

    @Override // com.google.android.gms.internal.ads.zzctr
    public final void zzj() {
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdjx
            @Override // java.lang.Runnable
            public final void run() {
                zzdkf.zzr(zzdkf.this);
            }
        });
        if (this.zze.zzc() != 7) {
            Executor executor = this.zzd;
            final zzdks zzdksVar = this.zzf;
            zzdksVar.getClass();
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdjy
                @Override // java.lang.Runnable
                public final void run() {
                    zzdks.this.zzp();
                }
            });
        }
        super.zzj();
    }

    public final synchronized JSONObject zzk(View view, Map map, Map map2) {
        return this.zzf.zzf(view, map, map2, zzZ());
    }

    public final void zzt(View view) {
        zzflf zzu = this.zze.zzu();
        if (!this.zzh.zzd() || zzu == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzA().zzf(zzu, view);
    }

    public final synchronized void zzu() {
        this.zzf.zzh();
    }

    final /* synthetic */ void zzv() {
        this.zzf.zzi();
        this.zze.zzI();
    }

    final /* synthetic */ void zzw(View view, boolean z, int i) {
        this.zzf.zzo(view, this.zzo.zzf(), this.zzo.zzl(), this.zzo.zzm(), z, zzZ(), i);
    }

    final /* synthetic */ void zzx(boolean z) {
        this.zzf.zzo(null, this.zzo.zzf(), this.zzo.zzl(), this.zzo.zzm(), z, zzZ(), 0);
    }

    public static /* synthetic */ void zzr(zzdkf zzdkfVar) {
        try {
            zzdkk zzdkkVar = zzdkfVar.zze;
            int zzc2 = zzdkkVar.zzc();
            if (zzc2 == 1) {
                if (zzdkfVar.zzi.zzb() != null) {
                    zzdkfVar.zzaa("Google", true);
                    zzdkfVar.zzi.zzb().zze((zzbgz) zzdkfVar.zzj.zzb());
                    return;
                }
                return;
            }
            if (zzc2 == 2) {
                if (zzdkfVar.zzi.zza() != null) {
                    zzdkfVar.zzaa("Google", true);
                    zzdkfVar.zzi.zza().zze((zzbgx) zzdkfVar.zzk.zzb());
                    return;
                }
                return;
            }
            if (zzc2 == 3) {
                if (zzdkfVar.zzi.zzd(zzdkkVar.zzA()) != null) {
                    if (zzdkfVar.zze.zzs() != null) {
                        zzdkfVar.zzf("Google", true);
                    }
                    zzdkfVar.zzi.zzd(zzdkfVar.zze.zzA()).zze((zzbhc) zzdkfVar.zzn.zzb());
                    return;
                }
                return;
            }
            if (zzc2 == 6) {
                if (zzdkfVar.zzi.zzf() != null) {
                    zzdkfVar.zzaa("Google", true);
                    zzdkfVar.zzi.zzf().zze((zzbif) zzdkfVar.zzl.zzb());
                    return;
                }
                return;
            }
            if (zzc2 != 7) {
                zzcbn.zzg("Wrong native template id!");
                return;
            }
            zzdkv zzdkvVar = zzdkfVar.zzi;
            if (zzdkvVar.zzg() != null) {
                zzdkvVar.zzg().zzg((zzbmp) zzdkfVar.zzm.zzb());
            }
        } catch (RemoteException e) {
            zzcbn.zzh("RemoteException when notifyAdLoad is called", e);
        }
    }
}
