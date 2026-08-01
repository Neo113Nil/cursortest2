package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzebw extends zzbvl {
    private final Context zza;
    private final zzgbl zzb;
    private final zzeco zzc;
    private final zzcoc zzd;
    private final ArrayDeque zze;
    private final zzfkk zzf;
    private final zzbwm zzg;
    private final zzecl zzh;

    public zzebw(Context context, zzgbl zzgblVar, zzbwm zzbwmVar, zzcoc zzcocVar, zzeco zzecoVar, ArrayDeque arrayDeque, zzecl zzeclVar, zzfkk zzfkkVar) {
        zzbdc.zza(context);
        this.zza = context;
        this.zzb = zzgblVar;
        this.zzg = zzbwmVar;
        this.zzc = zzecoVar;
        this.zzd = zzcocVar;
        this.zze = arrayDeque;
        this.zzh = zzeclVar;
        this.zzf = zzfkkVar;
    }

    private final synchronized zzebt zzk(String str) {
        Iterator it = this.zze.iterator();
        while (it.hasNext()) {
            zzebt zzebtVar = (zzebt) it.next();
            if (zzebtVar.zzc.equals(str)) {
                it.remove();
                return zzebtVar;
            }
        }
        return null;
    }

    private static ListenableFuture zzl(ListenableFuture listenableFuture, zzfiu zzfiuVar, zzbou zzbouVar, zzfkh zzfkhVar, zzfjw zzfjwVar) {
        zzbok zza = zzbouVar.zza("AFMA_getAdDictionary", zzbor.zza, new zzbom() { // from class: com.google.android.gms.internal.ads.zzebp
            @Override // com.google.android.gms.internal.ads.zzbom
            public final Object zza(JSONObject jSONObject) {
                return new zzbwd(jSONObject);
            }
        });
        zzfkg.zzd(listenableFuture, zzfjwVar);
        zzfhz zza2 = zzfiuVar.zzb(zzfio.BUILD_URL, listenableFuture).zzf(zza).zza();
        zzfkg.zzc(zza2, zzfkhVar, zzfjwVar);
        return zza2;
    }

    private static ListenableFuture zzm(zzbwa zzbwaVar, zzfiu zzfiuVar, final zzevw zzevwVar) {
        zzgai zzgaiVar = new zzgai() { // from class: com.google.android.gms.internal.ads.zzebj
            @Override // com.google.android.gms.internal.ads.zzgai
            public final ListenableFuture zza(Object obj) {
                return zzevw.this.zzb().zza(com.google.android.gms.ads.internal.client.zzay.zzb().zzh((Bundle) obj));
            }
        };
        return zzfiuVar.zzb(zzfio.GMS_SIGNALS, zzgbb.zzh(zzbwaVar.zza)).zzf(zzgaiVar).zze(new zzfhx() { // from class: com.google.android.gms.internal.ads.zzebk
            @Override // com.google.android.gms.internal.ads.zzfhx
            public final Object zza(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                com.google.android.gms.ads.internal.util.zze.zza("Ad request signals:");
                com.google.android.gms.ads.internal.util.zze.zza(jSONObject.toString(2));
                return jSONObject;
            }
        }).zza();
    }

    private final synchronized void zzn(zzebt zzebtVar) {
        zzo();
        this.zze.addLast(zzebtVar);
    }

    private final synchronized void zzo() {
        int intValue = ((Long) zzbfc.zzc.zze()).intValue();
        while (this.zze.size() >= intValue) {
            this.zze.removeFirst();
        }
    }

    private final void zzp(ListenableFuture listenableFuture, zzbvw zzbvwVar) {
        zzgbb.zzr(zzgbb.zzn(listenableFuture, new zzgai() { // from class: com.google.android.gms.internal.ads.zzebh
            @Override // com.google.android.gms.internal.ads.zzgai
            public final ListenableFuture zza(Object obj) {
                return zzgbb.zzh(zzffq.zza((InputStream) obj));
            }
        }, zzcca.zza), new zzebs(this, zzbvwVar), zzcca.zzf);
    }

    public final ListenableFuture zzb(final zzbwa zzbwaVar, int i) {
        if (!((Boolean) zzbfc.zza.zze()).booleanValue()) {
            return zzgbb.zzg(new Exception("Split request is disabled."));
        }
        zzfgk zzfgkVar = zzbwaVar.zzi;
        if (zzfgkVar == null) {
            return zzgbb.zzg(new Exception("Pool configuration missing from request."));
        }
        if (zzfgkVar.zzc == 0 || zzfgkVar.zzd == 0) {
            return zzgbb.zzg(new Exception("Caching is disabled."));
        }
        zzbou zzb = com.google.android.gms.ads.internal.zzt.zzf().zzb(this.zza, zzcbt.zza(), this.zzf);
        zzevw zzq = this.zzd.zzq(zzbwaVar, i);
        zzfiu zzc = zzq.zzc();
        final ListenableFuture zzm = zzm(zzbwaVar, zzc, zzq);
        zzfkh zzd = zzq.zzd();
        final zzfjw zza = zzfjv.zza(this.zza, 9);
        final ListenableFuture zzl = zzl(zzm, zzc, zzb, zzd, zza);
        return zzc.zza(zzfio.GET_URL_AND_CACHE_KEY, zzm, zzl).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzebn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzebw.this.zzj(zzl, zzm, zzbwaVar, zza);
            }
        }).zza();
    }

    public final ListenableFuture zzc(zzbwa zzbwaVar, int i) {
        zzebt zzk;
        zzfhz zza;
        zzbou zzb = com.google.android.gms.ads.internal.zzt.zzf().zzb(this.zza, zzcbt.zza(), this.zzf);
        zzevw zzq = this.zzd.zzq(zzbwaVar, i);
        zzbok zza2 = zzb.zza("google.afma.response.normalize", zzebv.zza, zzbor.zzb);
        if (((Boolean) zzbfc.zza.zze()).booleanValue()) {
            zzk = zzk(zzbwaVar.zzh);
            if (zzk == null) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but no matching parameters were found.");
            }
        } else {
            String str = zzbwaVar.zzj;
            zzk = null;
            if (str != null && !str.isEmpty()) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but split request is disabled.");
            }
        }
        zzfjw zza3 = zzk == null ? zzfjv.zza(this.zza, 9) : zzk.zze;
        zzfkh zzd = zzq.zzd();
        zzd.zzd(zzbwaVar.zza.getStringArrayList("ad_types"));
        zzecn zzecnVar = new zzecn(zzbwaVar.zzg, zzd, zza3);
        zzeck zzeckVar = new zzeck(this.zza, zzbwaVar.zzb.zza, this.zzg, i);
        zzfiu zzc = zzq.zzc();
        zzfjw zza4 = zzfjv.zza(this.zza, 11);
        if (zzk == null) {
            final ListenableFuture zzm = zzm(zzbwaVar, zzc, zzq);
            final ListenableFuture zzl = zzl(zzm, zzc, zzb, zzd, zza3);
            zzfjw zza5 = zzfjv.zza(this.zza, 10);
            final zzfhz zza6 = zzc.zza(zzfio.HTTP, zzl, zzm).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzebl
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new zzecm((JSONObject) ListenableFuture.this.get(), (zzbwd) zzl.get());
                }
            }).zze(zzecnVar).zze(new zzfkc(zza5)).zze(zzeckVar).zza();
            zzfkg.zza(zza6, zzd, zza5);
            zzfkg.zzd(zza6, zza4);
            zza = zzc.zza(zzfio.PRE_PROCESS, zzm, zzl, zza6).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzebm
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new zzebv((zzecj) ListenableFuture.this.get(), (JSONObject) zzm.get(), (zzbwd) zzl.get());
                }
            }).zzf(zza2).zza();
        } else {
            zzecm zzecmVar = new zzecm(zzk.zzb, zzk.zza);
            zzfjw zza7 = zzfjv.zza(this.zza, 10);
            final zzfhz zza8 = zzc.zzb(zzfio.HTTP, zzgbb.zzh(zzecmVar)).zze(zzecnVar).zze(new zzfkc(zza7)).zze(zzeckVar).zza();
            zzfkg.zza(zza8, zzd, zza7);
            final ListenableFuture zzh = zzgbb.zzh(zzk);
            zzfkg.zzd(zza8, zza4);
            zza = zzc.zza(zzfio.PRE_PROCESS, zza8, zzh).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzebi
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzecj zzecjVar = (zzecj) ListenableFuture.this.get();
                    ListenableFuture listenableFuture = zzh;
                    return new zzebv(zzecjVar, ((zzebt) listenableFuture.get()).zzb, ((zzebt) listenableFuture.get()).zza);
                }
            }).zzf(zza2).zza();
        }
        zzfkg.zza(zza, zzd, zza4);
        return zza;
    }

    public final ListenableFuture zzd(zzbwa zzbwaVar, int i) {
        zzbou zzb = com.google.android.gms.ads.internal.zzt.zzf().zzb(this.zza, zzcbt.zza(), this.zzf);
        if (!((Boolean) zzbfh.zza.zze()).booleanValue()) {
            return zzgbb.zzg(new Exception("Signal collection disabled."));
        }
        zzevw zzq = this.zzd.zzq(zzbwaVar, i);
        final zzevb zza = zzq.zza();
        zzbok zza2 = zzb.zza("google.afma.request.getSignals", zzbor.zza, zzbor.zzb);
        zzfjw zza3 = zzfjv.zza(this.zza, 22);
        zzfhz zza4 = zzq.zzc().zzb(zzfio.GET_SIGNALS, zzgbb.zzh(zzbwaVar.zza)).zze(new zzfkc(zza3)).zzf(new zzgai() { // from class: com.google.android.gms.internal.ads.zzebq
            @Override // com.google.android.gms.internal.ads.zzgai
            public final ListenableFuture zza(Object obj) {
                return zzevb.this.zza(com.google.android.gms.ads.internal.client.zzay.zzb().zzh((Bundle) obj));
            }
        }).zzb(zzfio.JS_SIGNALS).zzf(zza2).zza();
        zzfkh zzd = zzq.zzd();
        zzd.zzd(zzbwaVar.zza.getStringArrayList("ad_types"));
        zzfkg.zzb(zza4, zzd, zza3);
        if (((Boolean) zzbev.zze.zze()).booleanValue()) {
            zzeco zzecoVar = this.zzc;
            zzecoVar.getClass();
            zza4.addListener(new zzebo(zzecoVar), this.zzb);
        }
        return zza4;
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zze(zzbwa zzbwaVar, zzbvw zzbvwVar) {
        zzp(zzb(zzbwaVar, Binder.getCallingUid()), zzbvwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzf(zzbwa zzbwaVar, zzbvw zzbvwVar) {
        zzp(zzd(zzbwaVar, Binder.getCallingUid()), zzbvwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzg(zzbwa zzbwaVar, zzbvw zzbvwVar) {
        ListenableFuture zzc = zzc(zzbwaVar, Binder.getCallingUid());
        zzp(zzc, zzbvwVar);
        if (((Boolean) zzbev.zzc.zze()).booleanValue()) {
            zzeco zzecoVar = this.zzc;
            zzecoVar.getClass();
            zzc.addListener(new zzebo(zzecoVar), this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzh(String str, zzbvw zzbvwVar) {
        zzp(zzi(str), zzbvwVar);
    }

    public final ListenableFuture zzi(String str) {
        if (((Boolean) zzbfc.zza.zze()).booleanValue()) {
            return zzk(str) == null ? zzgbb.zzg(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str)))) : zzgbb.zzh(new zzebr(this));
        }
        return zzgbb.zzg(new Exception("Split request is disabled."));
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ InputStream zzj(ListenableFuture listenableFuture, ListenableFuture listenableFuture2, zzbwa zzbwaVar, zzfjw zzfjwVar) throws Exception {
        String zzc = ((zzbwd) listenableFuture.get()).zzc();
        zzn(new zzebt((zzbwd) listenableFuture.get(), (JSONObject) listenableFuture2.get(), zzbwaVar.zzh, zzc, zzfjwVar));
        return new ByteArrayInputStream(zzc.getBytes(zzftl.zzc));
    }
}
