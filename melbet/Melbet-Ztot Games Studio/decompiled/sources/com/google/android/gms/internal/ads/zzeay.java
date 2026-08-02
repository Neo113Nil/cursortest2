package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzeay extends zzbuj {
    private final Context zza;
    private final zzgcu zzb;
    private final zzebq zzc;
    private final zzclv zzd;
    private final ArrayDeque zze;
    private final zzfki zzf;
    private final zzbvj zzg;

    public zzeay(Context context, zzgcu zzgcuVar, zzbvj zzbvjVar, zzclv zzclvVar, zzebq zzebqVar, ArrayDeque arrayDeque, zzebn zzebnVar, zzfki zzfkiVar) {
        zzbbw.zza(context);
        this.zza = context;
        this.zzb = zzgcuVar;
        this.zzg = zzbvjVar;
        this.zzc = zzebqVar;
        this.zzd = zzclvVar;
        this.zze = arrayDeque;
        this.zzf = zzfkiVar;
    }

    private final synchronized zzeav zzk(String str) {
        Iterator it = this.zze.iterator();
        while (it.hasNext()) {
            zzeav zzeavVar = (zzeav) it.next();
            if (zzeavVar.zzc.equals(str)) {
                it.remove();
                return zzeavVar;
            }
        }
        return null;
    }

    private static ListenableFuture zzl(ListenableFuture listenableFuture, zzfjl zzfjlVar, zzbno zzbnoVar, zzfkf zzfkfVar, zzfju zzfjuVar) {
        zzbne zza = zzbnoVar.zza("AFMA_getAdDictionary", zzbnl.zza, new zzbng() { // from class: com.google.android.gms.internal.ads.zzeaq
            @Override // com.google.android.gms.internal.ads.zzbng
            public final Object zza(JSONObject jSONObject) {
                return new zzbvd(jSONObject);
            }
        });
        zzfke.zzd(listenableFuture, zzfjuVar);
        zzfiq zza2 = zzfjlVar.zzb(zzfjf.BUILD_URL, listenableFuture).zzf(zza).zza();
        zzfke.zzc(zza2, zzfkfVar, zzfjuVar);
        return zza2;
    }

    private static ListenableFuture zzm(final zzbvb zzbvbVar, zzfjl zzfjlVar, final zzewr zzewrVar) {
        zzgbq zzgbqVar = new zzgbq() { // from class: com.google.android.gms.internal.ads.zzeak
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final ListenableFuture zza(Object obj) {
                return zzewr.this.zzb().zza(com.google.android.gms.ads.internal.client.zzay.zzb().zzi((Bundle) obj), zzbvbVar.zzm);
            }
        };
        return zzfjlVar.zzb(zzfjf.GMS_SIGNALS, zzgcj.zzh(zzbvbVar.zza)).zzf(zzgbqVar).zze(new zzfio() { // from class: com.google.android.gms.internal.ads.zzeal
            @Override // com.google.android.gms.internal.ads.zzfio
            public final Object zza(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                com.google.android.gms.ads.internal.util.zze.zza("Ad request signals:");
                com.google.android.gms.ads.internal.util.zze.zza(jSONObject.toString(2));
                return jSONObject;
            }
        }).zza();
    }

    private final synchronized void zzn(zzeav zzeavVar) {
        zzo();
        this.zze.addLast(zzeavVar);
    }

    private final synchronized void zzo() {
        int intValue = ((Long) zzbdz.zzc.zze()).intValue();
        while (this.zze.size() >= intValue) {
            this.zze.removeFirst();
        }
    }

    private final void zzp(ListenableFuture listenableFuture, zzbuu zzbuuVar, zzbvb zzbvbVar) {
        zzgcj.zzr(zzgcj.zzn(listenableFuture, new zzgbq(this) { // from class: com.google.android.gms.internal.ads.zzear
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final ListenableFuture zza(Object obj) {
                return zzgcj.zzh(zzfgh.zza((InputStream) obj));
            }
        }, zzbzo.zza), new zzeau(this, zzbuuVar, zzbvbVar), zzbzo.zzf);
    }

    public final ListenableFuture zzb(final zzbvb zzbvbVar, int i) {
        if (!((Boolean) zzbdz.zza.zze()).booleanValue()) {
            return zzgcj.zzg(new Exception("Split request is disabled."));
        }
        zzfhb zzfhbVar = zzbvbVar.zzi;
        if (zzfhbVar == null) {
            return zzgcj.zzg(new Exception("Pool configuration missing from request."));
        }
        if (zzfhbVar.zzc == 0 || zzfhbVar.zzd == 0) {
            return zzgcj.zzg(new Exception("Caching is disabled."));
        }
        zzbno zzb = com.google.android.gms.ads.internal.zzu.zzf().zzb(this.zza, VersionInfoParcel.forPackage(), this.zzf);
        zzewr zzr = this.zzd.zzr(zzbvbVar, i);
        zzfjl zzc = zzr.zzc();
        final ListenableFuture zzm = zzm(zzbvbVar, zzc, zzr);
        zzfkf zzd = zzr.zzd();
        final zzfju zza = zzfjt.zza(this.zza, 9);
        final ListenableFuture zzl = zzl(zzm, zzc, zzb, zzd, zza);
        return zzc.zza(zzfjf.GET_URL_AND_CACHE_KEY, zzm, zzl).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeao
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeay.this.zzj(zzl, zzm, zzbvbVar, zza);
            }
        }).zza();
    }

    public final ListenableFuture zzc(final zzbvb zzbvbVar, int i) {
        zzeav zzk;
        zzfiq zza;
        zzbno zzb = com.google.android.gms.ads.internal.zzu.zzf().zzb(this.zza, VersionInfoParcel.forPackage(), this.zzf);
        zzewr zzr = this.zzd.zzr(zzbvbVar, i);
        zzbne zza2 = zzb.zza("google.afma.response.normalize", zzeax.zza, zzbnl.zzb);
        if (((Boolean) zzbdz.zza.zze()).booleanValue()) {
            zzk = zzk(zzbvbVar.zzh);
            if (zzk == null) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but no matching parameters were found.");
            }
        } else {
            String str = zzbvbVar.zzj;
            zzk = null;
            if (str != null && !str.isEmpty()) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but split request is disabled.");
            }
        }
        zzfju zza3 = zzk == null ? zzfjt.zza(this.zza, 9) : zzk.zzd;
        zzfkf zzd = zzr.zzd();
        zzd.zzd(zzbvbVar.zza.getStringArrayList("ad_types"));
        zzebp zzebpVar = new zzebp(zzbvbVar.zzg, zzd, zza3);
        zzebm zzebmVar = new zzebm(this.zza, zzbvbVar.zzb.afmaVersion, this.zzg, i);
        zzfjl zzc = zzr.zzc();
        zzfju zza4 = zzfjt.zza(this.zza, 11);
        if (zzk == null) {
            final ListenableFuture zzm = zzm(zzbvbVar, zzc, zzr);
            final ListenableFuture zzl = zzl(zzm, zzc, zzb, zzd, zza3);
            zzfju zza5 = zzfjt.zza(this.zza, 10);
            final zzfiq zza6 = zzc.zza(zzfjf.HTTP, zzl, zzm).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeam
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzbvb zzbvbVar2;
                    Bundle bundle;
                    zzbvd zzbvdVar = (zzbvd) ListenableFuture.this.get();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzbS)).booleanValue() && (bundle = (zzbvbVar2 = zzbvbVar).zzm) != null) {
                        bundle.putLong(zzdrt.GET_AD_DICTIONARY_SDKCORE_START.zza(), zzbvdVar.zzc());
                        zzbvbVar2.zzm.putLong(zzdrt.GET_AD_DICTIONARY_SDKCORE_END.zza(), zzbvdVar.zzb());
                    }
                    return new zzebo((JSONObject) zzm.get(), zzbvdVar);
                }
            }).zze(zzebpVar).zze(new zzfka(zza5)).zze(zzebmVar).zza();
            zzfke.zza(zza6, zzd, zza5);
            zzfke.zzd(zza6, zza4);
            zza = zzc.zza(zzfjf.PRE_PROCESS, zzm, zzl, zza6).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzean
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bundle bundle;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzbS)).booleanValue() && (bundle = zzbvb.this.zzm) != null) {
                        bundle.putLong(zzdrt.HTTP_RESPONSE_READY.zza(), com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis());
                    }
                    return new zzeax((zzebl) zza6.get(), (JSONObject) zzm.get(), (zzbvd) zzl.get());
                }
            }).zzf(zza2).zza();
        } else {
            zzebo zzeboVar = new zzebo(zzk.zzb, zzk.zza);
            zzfju zza7 = zzfjt.zza(this.zza, 10);
            final zzfiq zza8 = zzc.zzb(zzfjf.HTTP, zzgcj.zzh(zzeboVar)).zze(zzebpVar).zze(new zzfka(zza7)).zze(zzebmVar).zza();
            zzfke.zza(zza8, zzd, zza7);
            final ListenableFuture zzh = zzgcj.zzh(zzk);
            zzfke.zzd(zza8, zza4);
            zza = zzc.zza(zzfjf.PRE_PROCESS, zza8, zzh).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeaj
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzebl zzeblVar = (zzebl) ListenableFuture.this.get();
                    ListenableFuture listenableFuture = zzh;
                    return new zzeax(zzeblVar, ((zzeav) listenableFuture.get()).zzb, ((zzeav) listenableFuture.get()).zza);
                }
            }).zzf(zza2).zza();
        }
        zzfke.zza(zza, zzd, zza4);
        return zza;
    }

    public final ListenableFuture zzd(final zzbvb zzbvbVar, int i) {
        zzbno zzb = com.google.android.gms.ads.internal.zzu.zzf().zzb(this.zza, VersionInfoParcel.forPackage(), this.zzf);
        if (!((Boolean) zzbee.zza.zze()).booleanValue()) {
            return zzgcj.zzg(new Exception("Signal collection disabled."));
        }
        zzewr zzr = this.zzd.zzr(zzbvbVar, i);
        final zzevr zza = zzr.zza();
        zzbne zza2 = zzb.zza("google.afma.request.getSignals", zzbnl.zza, zzbnl.zzb);
        zzfju zza3 = zzfjt.zza(this.zza, 22);
        zzfiq zza4 = zzr.zzc().zzb(zzfjf.GET_SIGNALS, zzgcj.zzh(zzbvbVar.zza)).zze(new zzfka(zza3)).zzf(new zzgbq() { // from class: com.google.android.gms.internal.ads.zzeas
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final ListenableFuture zza(Object obj) {
                return zzevr.this.zza(com.google.android.gms.ads.internal.client.zzay.zzb().zzi((Bundle) obj), zzbvbVar.zzm);
            }
        }).zzb(zzfjf.JS_SIGNALS).zzf(zza2).zza();
        zzfkf zzd = zzr.zzd();
        zzd.zzd(zzbvbVar.zza.getStringArrayList("ad_types"));
        zzd.zzf(zzbvbVar.zza.getBundle("extras"));
        zzfke.zzb(zza4, zzd, zza3);
        if (((Boolean) zzbds.zzg.zze()).booleanValue()) {
            zzebq zzebqVar = this.zzc;
            Objects.requireNonNull(zzebqVar);
            zza4.addListener(new zzeap(zzebqVar), this.zzb);
        }
        return zza4;
    }

    @Override // com.google.android.gms.internal.ads.zzbuk
    public final void zze(zzbvb zzbvbVar, zzbuu zzbuuVar) {
        zzp(zzb(zzbvbVar, Binder.getCallingUid()), zzbuuVar, zzbvbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbuk
    public final void zzf(zzbvb zzbvbVar, zzbuu zzbuuVar) {
        Bundle bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzbS)).booleanValue() && (bundle = zzbvbVar.zzm) != null) {
            bundle.putLong(zzdrt.SERVICE_CONNECTED.zza(), com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis());
        }
        zzp(zzd(zzbvbVar, Binder.getCallingUid()), zzbuuVar, zzbvbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbuk
    public final void zzg(zzbvb zzbvbVar, zzbuu zzbuuVar) {
        Bundle bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzbS)).booleanValue() && (bundle = zzbvbVar.zzm) != null) {
            bundle.putLong(zzdrt.SERVICE_CONNECTED.zza(), com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis());
        }
        ListenableFuture zzc = zzc(zzbvbVar, Binder.getCallingUid());
        zzp(zzc, zzbuuVar, zzbvbVar);
        if (((Boolean) zzbds.zze.zze()).booleanValue()) {
            zzebq zzebqVar = this.zzc;
            Objects.requireNonNull(zzebqVar);
            zzc.addListener(new zzeap(zzebqVar), this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuk
    public final void zzh(String str, zzbuu zzbuuVar) {
        zzp(zzi(str), zzbuuVar, null);
    }

    public final ListenableFuture zzi(String str) {
        if (((Boolean) zzbdz.zza.zze()).booleanValue()) {
            return zzk(str) == null ? zzgcj.zzg(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str)))) : zzgcj.zzh(new zzeat(this));
        }
        return zzgcj.zzg(new Exception("Split request is disabled."));
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ InputStream zzj(ListenableFuture listenableFuture, ListenableFuture listenableFuture2, zzbvb zzbvbVar, zzfju zzfjuVar) throws Exception {
        String zze = ((zzbvd) listenableFuture.get()).zze();
        zzn(new zzeav((zzbvd) listenableFuture.get(), (JSONObject) listenableFuture2.get(), zzbvbVar.zzh, zze, zzfjuVar));
        return new ByteArrayInputStream(zze.getBytes(zzfuj.zzc));
    }
}
