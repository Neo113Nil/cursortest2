package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzdun {
    private final Context zzf;
    private final WeakReference zzg;
    private final zzdqb zzh;
    private final Executor zzi;
    private final Executor zzj;
    private final ScheduledExecutorService zzk;
    private final zzdsu zzl;
    private final VersionInfoParcel zzm;
    private final zzddp zzo;
    private final zzfki zzp;
    private boolean zza = false;
    private boolean zzb = false;
    private boolean zzc = false;
    private final zzbzt zze = new zzbzt();
    private final Map zzn = new ConcurrentHashMap();
    private boolean zzq = true;
    private final long zzd = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime();

    public zzdun(Executor executor, Context context, WeakReference weakReference, Executor executor2, zzdqb zzdqbVar, ScheduledExecutorService scheduledExecutorService, zzdsu zzdsuVar, VersionInfoParcel versionInfoParcel, zzddp zzddpVar, zzfki zzfkiVar) {
        this.zzh = zzdqbVar;
        this.zzf = context;
        this.zzg = weakReference;
        this.zzi = executor2;
        this.zzk = scheduledExecutorService;
        this.zzj = executor;
        this.zzl = zzdsuVar;
        this.zzm = versionInfoParcel;
        this.zzo = zzddpVar;
        this.zzp = zzfkiVar;
        zzv("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    static /* bridge */ /* synthetic */ void zzj(final zzdun zzdunVar, String str) {
        int i = 5;
        final zzfju zza = zzfjt.zza(zzdunVar.zzf, 5);
        zza.zzi();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                final String next = keys.next();
                final zzfju zza2 = zzfjt.zza(zzdunVar.zzf, i);
                zza2.zzi();
                zza2.zzd(next);
                final Object obj = new Object();
                final zzbzt zzbztVar = new zzbzt();
                ListenableFuture zzo = zzgcj.zzo(zzbztVar, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzbE)).longValue(), TimeUnit.SECONDS, zzdunVar.zzk);
                zzdunVar.zzl.zzc(next);
                zzdunVar.zzo.zzc(next);
                final long elapsedRealtime = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime();
                zzo.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdue
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdun.this.zzq(obj, zzbztVar, next, elapsedRealtime, zza2);
                    }
                }, zzdunVar.zzi);
                arrayList.add(zzo);
                final zzdum zzdumVar = new zzdum(zzdunVar, obj, next, elapsedRealtime, zza2, zzbztVar);
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
                            arrayList2.add(new zzblf(optString, bundle));
                            i2++;
                            jSONArray = jSONArray2;
                        }
                    } catch (JSONException unused) {
                    }
                }
                zzdunVar.zzv(next, false, "", 0);
                try {
                    try {
                        final zzfge zzc = zzdunVar.zzh.zzc(next, new JSONObject());
                        zzdunVar.zzj.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdui
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzdun.this.zzn(next, zzdumVar, zzc, arrayList2);
                            }
                        });
                    } catch (zzffn unused2) {
                        zzdumVar.zze("Failed to create Adapter.");
                    }
                } catch (RemoteException e) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzh("", e);
                }
                i = 5;
            }
            zzgcj.zza(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzduf
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzdun.this.zzf(zza);
                    return null;
                }
            }, zzdunVar.zzi);
        } catch (JSONException e2) {
            com.google.android.gms.ads.internal.util.zze.zzb("Malformed CLD response", e2);
            zzdunVar.zzo.zza("MalformedJson");
            zzdunVar.zzl.zza("MalformedJson");
            zzdunVar.zze.zzd(e2);
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e2, "AdapterInitializer.updateAdapterStatus");
            zzfki zzfkiVar = zzdunVar.zzp;
            zza.zzh(e2);
            zza.zzg(false);
            zzfkiVar.zzb(zza.zzm());
        }
    }

    private final synchronized ListenableFuture zzu() {
        String zzc = com.google.android.gms.ads.internal.zzu.zzo().zzi().zzh().zzc();
        if (!TextUtils.isEmpty(zzc)) {
            return zzgcj.zzh(zzc);
        }
        final zzbzt zzbztVar = new zzbzt();
        com.google.android.gms.ads.internal.zzu.zzo().zzi().zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdug
            @Override // java.lang.Runnable
            public final void run() {
                zzdun.this.zzo(zzbztVar);
            }
        });
        return zzbztVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzv(String str, boolean z, String str2, int i) {
        this.zzn.put(str, new zzbkv(str, z, i, str2));
    }

    final /* synthetic */ Object zzf(zzfju zzfjuVar) throws Exception {
        this.zze.zzc(true);
        zzfjuVar.zzg(true);
        this.zzp.zzb(zzfjuVar.zzm());
        return null;
    }

    public final List zzg() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.zzn.keySet()) {
            zzbkv zzbkvVar = (zzbkv) this.zzn.get(str);
            arrayList.add(new zzbkv(str, zzbkvVar.zzb, zzbkvVar.zzc, zzbkvVar.zzd));
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
            zzv("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - this.zzd));
            this.zzl.zzb("com.google.android.gms.ads.MobileAds", "timeout");
            this.zzo.zzb("com.google.android.gms.ads.MobileAds", "timeout");
            this.zze.zzd(new Exception());
        }
    }

    final /* synthetic */ void zzn(String str, zzbkz zzbkzVar, zzfge zzfgeVar, List list) {
        try {
            try {
                if (Objects.equals(str, "com.google.ads.mediation.admob.AdMobAdapter")) {
                    zzbkzVar.zzf();
                    return;
                }
                Context context = (Context) this.zzg.get();
                if (context == null) {
                    context = this.zzf;
                }
                zzfgeVar.zzi(context, zzbkzVar, list);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", e);
            }
        } catch (RemoteException e2) {
            throw new zzfvq(e2);
        } catch (zzffn unused) {
            zzbkzVar.zze("Failed to initialize adapter. " + str + " does not implement the initialize() method.");
        }
    }

    final /* synthetic */ void zzo(final zzbzt zzbztVar) {
        this.zzi.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzdud
            @Override // java.lang.Runnable
            public final void run() {
                String zzc = com.google.android.gms.ads.internal.zzu.zzo().zzi().zzh().zzc();
                boolean isEmpty = TextUtils.isEmpty(zzc);
                zzbzt zzbztVar2 = zzbztVar;
                if (isEmpty) {
                    zzbztVar2.zzd(new Exception());
                } else {
                    zzbztVar2.zzc(zzc);
                }
            }
        });
    }

    final /* synthetic */ void zzp() {
        this.zzl.zze();
        this.zzo.zze();
        this.zzb = true;
    }

    final /* synthetic */ void zzq(Object obj, zzbzt zzbztVar, String str, long j, zzfju zzfjuVar) {
        synchronized (obj) {
            if (!zzbztVar.isDone()) {
                zzv(str, false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - j));
                this.zzl.zzb(str, "timeout");
                this.zzo.zzb(str, "timeout");
                zzfki zzfkiVar = this.zzp;
                zzfjuVar.zzc("Timeout");
                zzfjuVar.zzg(false);
                zzfkiVar.zzb(zzfjuVar.zzm());
                zzbztVar.zzc(false);
            }
        }
    }

    public final void zzr() {
        if (!((Boolean) zzbdy.zza.zze()).booleanValue()) {
            if (this.zzm.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzbD)).intValue() && this.zzq) {
                if (this.zza) {
                    return;
                }
                synchronized (this) {
                    if (this.zza) {
                        return;
                    }
                    this.zzl.zzf();
                    this.zzo.zzf();
                    this.zze.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzduj
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzdun.this.zzp();
                        }
                    }, this.zzi);
                    this.zza = true;
                    ListenableFuture zzu = zzu();
                    this.zzk.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzduc
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzdun.this.zzm();
                        }
                    }, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzbF)).longValue(), TimeUnit.SECONDS);
                    zzgcj.zzr(zzu, new zzdul(this), this.zzi);
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

    public final void zzs(final zzblc zzblcVar) {
        this.zze.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzduh
            @Override // java.lang.Runnable
            public final void run() {
                zzdun zzdunVar = zzdun.this;
                try {
                    zzblcVar.zzb(zzdunVar.zzg());
                } catch (RemoteException e) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzh("", e);
                }
            }
        }, this.zzj);
    }

    public final boolean zzt() {
        return this.zzb;
    }
}
