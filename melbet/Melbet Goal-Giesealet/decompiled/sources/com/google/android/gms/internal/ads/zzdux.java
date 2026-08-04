package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.facebook.common.util.UriUtil;
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

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzdux {
    private final Context zzf;
    private final WeakReference zzg;
    private final zzdqc zzh;
    private final Executor zzi;
    private final Executor zzj;
    private final ScheduledExecutorService zzk;
    private final zzdsx zzl;
    private final VersionInfoParcel zzm;
    private final zzdcy zzo;
    private final zzfie zzp;
    private boolean zza = false;
    private boolean zzb = false;
    private boolean zzc = false;
    private final zzbzm zze = new zzbzm();
    private final Map zzn = new ConcurrentHashMap();
    private boolean zzq = true;
    private final long zzd = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();

    public zzdux(Executor executor, Context context, WeakReference weakReference, Executor executor2, zzdqc zzdqcVar, ScheduledExecutorService scheduledExecutorService, zzdsx zzdsxVar, VersionInfoParcel versionInfoParcel, zzdcy zzdcyVar, zzfie zzfieVar) {
        this.zzh = zzdqcVar;
        this.zzf = context;
        this.zzg = weakReference;
        this.zzi = executor2;
        this.zzk = scheduledExecutorService;
        this.zzj = executor;
        this.zzl = zzdsxVar;
        this.zzm = versionInfoParcel;
        this.zzo = zzdcyVar;
        this.zzp = zzfieVar;
        zzm("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    private final synchronized ListenableFuture zzu() {
        String zzd = com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzd();
        if (!TextUtils.isEmpty(zzd)) {
            return zzgot.zza(zzd);
        }
        final zzbzm zzbzmVar = new zzbzm();
        com.google.android.gms.ads.internal.zzt.zzh().zzo().zzk(new Runnable() { // from class: com.google.android.gms.internal.ads.zzduq
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzdux.this.zzg(zzbzmVar);
            }
        });
        return zzbzmVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzv, reason: merged with bridge method [inline-methods] */
    public final void zzm(String str, boolean z, String str2, int i) {
        this.zzn.put(str, new zzblk(str, z, i, str2));
    }

    public final void zza() {
        this.zzq = false;
    }

    public final void zzb(final zzblr zzblrVar) {
        this.zze.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzduw
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                try {
                    zzblrVar.zzb(zzdux.this.zzd());
                } catch (RemoteException e) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
                }
            }
        }, this.zzj);
    }

    public final void zzc() {
        if (!((Boolean) zzbeo.zza.zze()).booleanValue()) {
            if (this.zzm.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzca)).intValue() && this.zzq) {
                if (this.zza) {
                    return;
                }
                synchronized (this) {
                    if (this.zza) {
                        return;
                    }
                    this.zzl.zze();
                    this.zzo.zze();
                    zzbzm zzbzmVar = this.zze;
                    Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzdup
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzdux.this.zzf();
                        }
                    };
                    Executor executor = this.zzi;
                    zzbzmVar.addListener(runnable, executor);
                    this.zza = true;
                    ListenableFuture zzu = zzu();
                    this.zzk.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdur
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzdux.this.zzh();
                        }
                    }, ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcc)).longValue(), TimeUnit.SECONDS);
                    zzgot.zzq(zzu, new zzdun(this), executor);
                    return;
                }
            }
        }
        if (this.zza) {
            return;
        }
        zzm("com.google.android.gms.ads.MobileAds", true, "", 0);
        this.zze.zzc(false);
        this.zza = true;
        this.zzb = true;
    }

    public final List zzd() {
        ArrayList arrayList = new ArrayList();
        Map map = this.zzn;
        for (String str : map.keySet()) {
            zzblk zzblkVar = (zzblk) map.get(str);
            arrayList.add(new zzblk(str, zzblkVar.zzb, zzblkVar.zzc, zzblkVar.zzd));
        }
        return arrayList;
    }

    public final boolean zze() {
        return this.zzb;
    }

    final /* synthetic */ void zzf() {
        this.zzl.zzf();
        this.zzo.zzf();
        this.zzb = true;
    }

    final /* synthetic */ void zzg(final zzbzm zzbzmVar) {
        this.zzi.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzduv
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                String zzd = com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzd();
                boolean isEmpty = TextUtils.isEmpty(zzd);
                zzbzm zzbzmVar2 = zzbzmVar;
                if (isEmpty) {
                    zzbzmVar2.zzd(new Exception());
                } else {
                    zzbzmVar2.zzc(zzd);
                }
            }
        });
    }

    final /* synthetic */ void zzh() {
        synchronized (this) {
            if (this.zzc) {
                return;
            }
            zzm("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - this.zzd));
            this.zzl.zzc("com.google.android.gms.ads.MobileAds", "timeout");
            this.zzo.zzc("com.google.android.gms.ads.MobileAds", "timeout");
            this.zze.zzd(new Exception());
        }
    }

    final /* synthetic */ void zzi(Object obj, zzbzm zzbzmVar, String str, long j, zzfhr zzfhrVar) {
        synchronized (obj) {
            if (!zzbzmVar.isDone()) {
                zzm(str, false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - j));
                this.zzl.zzc(str, "timeout");
                this.zzo.zzc(str, "timeout");
                zzfie zzfieVar = this.zzp;
                zzfhrVar.zzk("Timeout");
                zzfhrVar.zzd(false);
                zzfieVar.zzb(zzfhrVar.zzm());
                zzbzmVar.zzc(false);
            }
        }
    }

    final /* synthetic */ Object zzj(zzfhr zzfhrVar) {
        this.zze.zzc(true);
        zzfhrVar.zzd(true);
        this.zzp.zzb(zzfhrVar.zzm());
        return null;
    }

    final /* synthetic */ void zzk(String str, zzblo zzbloVar, zzfea zzfeaVar, List list) {
        try {
            try {
                if (Objects.equals(str, "com.google.ads.mediation.admob.AdMobAdapter")) {
                    zzbloVar.zze();
                    return;
                }
                Context context = (Context) this.zzg.get();
                if (context == null) {
                    context = this.zzf;
                }
                zzfeaVar.zzA(context, zzbloVar, list);
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            }
        } catch (RemoteException e2) {
            throw new zzghz(e2);
        } catch (zzfdj unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 74);
            sb.append("Failed to initialize adapter. ");
            sb.append(str);
            sb.append(" does not implement the initialize() method.");
            zzbloVar.zzf(sb.toString());
        }
    }

    final /* synthetic */ void zzl(String str) {
        final zzdux zzduxVar = this;
        Context context = zzduxVar.zzf;
        int i = 5;
        final zzfhr zzn = zzfhr.zzn(context, 5);
        zzn.zza();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                final String next = keys.next();
                final zzfhr zzn2 = zzfhr.zzn(context, i);
                zzn2.zza();
                zzn2.zzi(next);
                final Object obj = new Object();
                final zzbzm zzbzmVar = new zzbzm();
                ListenableFuture zzi = zzgot.zzi(zzbzmVar, ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcb)).longValue(), TimeUnit.SECONDS, zzduxVar.zzk);
                zzduxVar.zzl.zza(next);
                zzduxVar.zzo.zza(next);
                final long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
                zzi.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdus
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzdux.this.zzi(obj, zzbzmVar, next, elapsedRealtime, zzn2);
                    }
                }, zzduxVar.zzi);
                arrayList.add(zzi);
                try {
                    try {
                        final zzduo zzduoVar = new zzduo(this, obj, next, elapsedRealtime, zzn2, zzbzmVar);
                        zzduxVar = this;
                        JSONObject optJSONObject = jSONObject.optJSONObject(next);
                        final ArrayList arrayList2 = new ArrayList();
                        if (optJSONObject != null) {
                            try {
                                JSONArray jSONArray = optJSONObject.getJSONArray(UriUtil.DATA_SCHEME);
                                int i2 = 0;
                                while (i2 < jSONArray.length()) {
                                    JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                                    String optString = jSONObject2.optString("format", "");
                                    JSONObject optJSONObject2 = jSONObject2.optJSONObject(UriUtil.DATA_SCHEME);
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
                                    arrayList2.add(new zzblu(optString, bundle));
                                    i2++;
                                    jSONArray = jSONArray2;
                                }
                            } catch (JSONException unused) {
                            }
                        }
                        zzduxVar.zzm(next, false, "", 0);
                        try {
                            final zzfea zza = zzduxVar.zzh.zza(next, new JSONObject());
                            zzduxVar.zzj.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzduu
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    zzdux.this.zzk(next, zzduoVar, zza, arrayList2);
                                }
                            });
                        } catch (zzfdj e) {
                            try {
                                String str2 = "Failed to create Adapter.";
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zznP)).booleanValue()) {
                                    String message = e.getMessage();
                                    StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 26);
                                    sb.append("Failed to create Adapter.");
                                    sb.append(" ");
                                    sb.append(message);
                                    str2 = sb.toString();
                                }
                                zzduoVar.zzf(str2);
                            } catch (RemoteException e2) {
                                int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                                com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
                            }
                        }
                        i = 5;
                    } catch (JSONException e3) {
                        e = e3;
                        zzduxVar = this;
                        com.google.android.gms.ads.internal.util.zze.zzb("Malformed CLD response", e);
                        zzduxVar.zzo.zzd("MalformedJson");
                        zzduxVar.zzl.zzd("MalformedJson");
                        zzduxVar.zze.zzd(e);
                        com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdapterInitializer.updateAdapterStatus");
                        zzfie zzfieVar = zzduxVar.zzp;
                        zzn.zzj(e);
                        zzn.zzd(false);
                        zzfieVar.zzb(zzn.zzm());
                    }
                } catch (JSONException e4) {
                    e = e4;
                    zzduxVar = this;
                }
            }
            zzgot.zzm(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdut
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    zzdux.this.zzj(zzn);
                    return null;
                }
            }, zzduxVar.zzi);
        } catch (JSONException e5) {
            e = e5;
            com.google.android.gms.ads.internal.util.zze.zzb("Malformed CLD response", e);
            zzduxVar.zzo.zzd("MalformedJson");
            zzduxVar.zzl.zzd("MalformedJson");
            zzduxVar.zze.zzd(e);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdapterInitializer.updateAdapterStatus");
            zzfie zzfieVar2 = zzduxVar.zzp;
            zzn.zzj(e);
            zzn.zzd(false);
            zzfieVar2.zzb(zzn.zzm());
        }
    }

    final /* synthetic */ void zzn(boolean z) {
        this.zzc = true;
    }

    final /* synthetic */ long zzo() {
        return this.zzd;
    }

    final /* synthetic */ zzbzm zzp() {
        return this.zze;
    }

    final /* synthetic */ Executor zzq() {
        return this.zzi;
    }

    final /* synthetic */ zzdsx zzr() {
        return this.zzl;
    }

    final /* synthetic */ zzdcy zzs() {
        return this.zzo;
    }

    final /* synthetic */ zzfie zzt() {
        return this.zzp;
    }
}
