package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdvs {
    private final Context zzf;
    private final WeakReference zzg;
    private final zzdrk zzh;
    private final Executor zzi;
    private final Executor zzj;
    private final ScheduledExecutorService zzk;
    private final zzdtz zzl;
    private final zzcbt zzm;
    private final zzdfd zzo;
    private final zzfkk zzp;
    private boolean zza = false;
    private boolean zzb = false;
    private boolean zzc = false;
    private final zzccf zze = new zzccf();
    private final Map zzn = new ConcurrentHashMap();
    private boolean zzq = true;
    private final long zzd = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();

    public zzdvs(Executor executor, Context context, WeakReference weakReference, Executor executor2, zzdrk zzdrkVar, ScheduledExecutorService scheduledExecutorService, zzdtz zzdtzVar, zzcbt zzcbtVar, zzdfd zzdfdVar, zzfkk zzfkkVar) {
        this.zzh = zzdrkVar;
        this.zzf = context;
        this.zzg = weakReference;
        this.zzi = executor2;
        this.zzk = scheduledExecutorService;
        this.zzj = executor;
        this.zzl = zzdtzVar;
        this.zzm = zzcbtVar;
        this.zzo = zzdfdVar;
        this.zzp = zzfkkVar;
        zzv("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    static /* bridge */ /* synthetic */ void zzj(final zzdvs zzdvsVar, String str) {
        int i = 5;
        final zzfjw zza = zzfjv.zza(zzdvsVar.zzf, 5);
        zza.zzh();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                final String next = keys.next();
                final zzfjw zza2 = zzfjv.zza(zzdvsVar.zzf, i);
                zza2.zzh();
                zza2.zzd(next);
                final Object obj = new Object();
                final zzccf zzccfVar = new zzccf();
                ListenableFuture zzo = zzgbb.zzo(zzccfVar, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzbM)).longValue(), TimeUnit.SECONDS, zzdvsVar.zzk);
                zzdvsVar.zzl.zzc(next);
                zzdvsVar.zzo.zzc(next);
                final long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
                zzo.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdvj
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdvs.this.zzq(obj, zzccfVar, next, elapsedRealtime, zza2);
                    }
                }, zzdvsVar.zzi);
                arrayList.add(zzo);
                final zzdvr zzdvrVar = new zzdvr(zzdvsVar, obj, next, elapsedRealtime, zza2, zzccfVar);
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                final ArrayList arrayList2 = new ArrayList();
                if (optJSONObject != null) {
                    try {
                        JSONArray jSONArray = optJSONObject.getJSONArray("data");
                        int i2 = 0;
                        while (i2 < jSONArray.length()) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                            String optString = jSONObject2.optString("format", "");
                            JSONObject optJSONObject2 = jSONObject2.optJSONObject("data");
                            Bundle bundle = new Bundle();
                            if (optJSONObject2 != null) {
                                Iterator<String> keys2 = optJSONObject2.keys();
                                while (keys2.hasNext()) {
                                    String next2 = keys2.next();
                                    bundle.putString(next2, optJSONObject2.optString(next2, ""));
                                    jSONArray = jSONArray;
                                }
                            }
                            JSONArray jSONArray2 = jSONArray;
                            arrayList2.add(new zzbmk(optString, bundle));
                            i2++;
                            jSONArray = jSONArray2;
                        }
                    } catch (JSONException unused) {
                    }
                }
                zzdvsVar.zzv(next, false, "", 0);
                try {
                    try {
                        final zzffm zzc = zzdvsVar.zzh.zzc(next, new JSONObject());
                        zzdvsVar.zzj.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdvn
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzdvs.this.zzn(next, zzdvrVar, zzc, arrayList2);
                            }
                        });
                    } catch (RemoteException e) {
                        zzcbn.zzh("", e);
                    }
                } catch (zzfev unused2) {
                    zzdvrVar.zze("Failed to create Adapter.");
                }
                i = 5;
            }
            zzgbb.zza(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdvk
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzdvs.this.zzf(zza);
                    return null;
                }
            }, zzdvsVar.zzi);
        } catch (JSONException e2) {
            com.google.android.gms.ads.internal.util.zze.zzb("Malformed CLD response", e2);
            zzdvsVar.zzo.zza("MalformedJson");
            zzdvsVar.zzl.zza("MalformedJson");
            zzdvsVar.zze.zzd(e2);
            com.google.android.gms.ads.internal.zzt.zzo().zzw(e2, "AdapterInitializer.updateAdapterStatus");
            zzfkk zzfkkVar = zzdvsVar.zzp;
            zza.zzg(e2);
            zza.zzf(false);
            zzfkkVar.zzb(zza.zzl());
        }
    }

    private final synchronized ListenableFuture zzu() {
        String zzc = com.google.android.gms.ads.internal.zzt.zzo().zzi().zzh().zzc();
        if (!TextUtils.isEmpty(zzc)) {
            return zzgbb.zzh(zzc);
        }
        final zzccf zzccfVar = new zzccf();
        com.google.android.gms.ads.internal.zzt.zzo().zzi().zzq(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdvl
            @Override // java.lang.Runnable
            public final void run() {
                zzdvs.this.zzo(zzccfVar);
            }
        });
        return zzccfVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzv(String str, boolean z, String str2, int i) {
        this.zzn.put(str, new zzbma(str, z, i, str2));
    }

    final /* synthetic */ Object zzf(zzfjw zzfjwVar) throws Exception {
        this.zze.zzc(true);
        zzfjwVar.zzf(true);
        this.zzp.zzb(zzfjwVar.zzl());
        return null;
    }

    public final List zzg() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.zzn.keySet()) {
            zzbma zzbmaVar = (zzbma) this.zzn.get(str);
            arrayList.add(new zzbma(str, zzbmaVar.zzb, zzbmaVar.zzc, zzbmaVar.zzd));
        }
        return arrayList;
    }

    public final void zzl() {
        this.zzq = false;
    }

    final /* synthetic */ void zzm() {
        synchronized (this) {
            if (this.zzc) {
                return;
            }
            zzv("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zzd));
            this.zzl.zzb("com.google.android.gms.ads.MobileAds", "timeout");
            this.zzo.zzb("com.google.android.gms.ads.MobileAds", "timeout");
            this.zze.zzd(new Exception());
        }
    }

    final /* synthetic */ void zzn(String str, zzbme zzbmeVar, zzffm zzffmVar, List list) {
        if (str != "com.google.ads.mediation.admob.AdMobAdapter") {
            if (str != null) {
                try {
                    try {
                        if (str.equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                        }
                    } catch (RemoteException e) {
                        zzcbn.zzh("", e);
                        return;
                    }
                } catch (RemoteException e2) {
                    throw new zzfut(e2);
                } catch (zzfev unused) {
                    zzbmeVar.zze("Failed to initialize adapter. " + str + " does not implement the initialize() method.");
                    return;
                }
            }
            Context context = (Context) this.zzg.get();
            if (context == null) {
                context = this.zzf;
            }
            zzffmVar.zzi(context, zzbmeVar, list);
            return;
        }
        zzbmeVar.zzf();
    }

    final /* synthetic */ void zzo(final zzccf zzccfVar) {
        this.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdvi
            @Override // java.lang.Runnable
            public final void run() {
                String zzc = com.google.android.gms.ads.internal.zzt.zzo().zzi().zzh().zzc();
                boolean isEmpty = TextUtils.isEmpty(zzc);
                zzccf zzccfVar2 = zzccfVar;
                if (isEmpty) {
                    zzccfVar2.zzd(new Exception());
                } else {
                    zzccfVar2.zzc(zzc);
                }
            }
        });
    }

    final /* synthetic */ void zzp() {
        this.zzl.zze();
        this.zzo.zze();
        this.zzb = true;
    }

    final /* synthetic */ void zzq(Object obj, zzccf zzccfVar, String str, long j, zzfjw zzfjwVar) {
        synchronized (obj) {
            if (!zzccfVar.isDone()) {
                zzv(str, false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - j));
                this.zzl.zzb(str, "timeout");
                this.zzo.zzb(str, "timeout");
                zzfkk zzfkkVar = this.zzp;
                zzfjwVar.zzc("Timeout");
                zzfjwVar.zzf(false);
                zzfkkVar.zzb(zzfjwVar.zzl());
                zzccfVar.zzc(false);
            }
        }
    }

    public final void zzr() {
        if (!((Boolean) zzbfb.zza.zze()).booleanValue()) {
            if (this.zzm.zzc >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzbL)).intValue() && this.zzq) {
                if (this.zza) {
                    return;
                }
                synchronized (this) {
                    if (this.zza) {
                        return;
                    }
                    this.zzl.zzf();
                    this.zzo.zzf();
                    this.zze.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdvo
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzdvs.this.zzp();
                        }
                    }, this.zzi);
                    this.zza = true;
                    ListenableFuture zzu = zzu();
                    this.zzk.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdvh
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzdvs.this.zzm();
                        }
                    }, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzbN)).longValue(), TimeUnit.SECONDS);
                    zzgbb.zzr(zzu, new zzdvq(this), this.zzi);
                    return;
                }
            }
        }
        if (this.zza) {
            return;
        }
        zzv("com.google.android.gms.ads.MobileAds", true, "", 0);
        this.zze.zzc(false);
        this.zza = true;
        this.zzb = true;
    }

    public final void zzs(final zzbmh zzbmhVar) {
        this.zze.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdvm
            @Override // java.lang.Runnable
            public final void run() {
                zzdvs zzdvsVar = zzdvs.this;
                try {
                    zzbmhVar.zzb(zzdvsVar.zzg());
                } catch (RemoteException e) {
                    zzcbn.zzh("", e);
                }
            }
        }, this.zzj);
    }

    public final boolean zzt() {
        return this.zzb;
    }
}
