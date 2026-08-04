package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzeap extends zzbui {
    private final Context zza;
    private final zzgpd zzb;
    private final zzeax zzc;
    private final zzckv zzd;
    private final ArrayDeque zze;
    private final zzfie zzf;
    private final zzbvd zzg;

    public zzeap(Context context, zzgpd zzgpdVar, zzbvd zzbvdVar, zzckv zzckvVar, zzeax zzeaxVar, ArrayDeque arrayDeque, zzeau zzeauVar, zzfie zzfieVar) {
        zzbci.zza(context);
        this.zza = context;
        this.zzb = zzgpdVar;
        this.zzg = zzbvdVar;
        this.zzc = zzeaxVar;
        this.zzd = zzckvVar;
        this.zze = arrayDeque;
        this.zzf = zzfieVar;
    }

    private static ListenableFuture zzl(final zzbuv zzbuvVar, zzfhh zzfhhVar, final zzevr zzevrVar) {
        zzgob zzgobVar = new zzgob() { // from class: com.google.android.gms.internal.ads.zzead
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzevr.this.zzc().zza(com.google.android.gms.ads.internal.client.zzbb.zza().zzm((Bundle) obj), zzbuvVar.zzm, false);
            }
        };
        return zzfhhVar.zza(zzfhb.GMS_SIGNALS, zzgot.zza(zzbuvVar.zza)).zzc(zzgobVar).zzb(zzeae.zza).zzi();
    }

    private static ListenableFuture zzm(ListenableFuture listenableFuture, zzfhh zzfhhVar, zzbod zzbodVar, zzfib zzfibVar, zzfhr zzfhrVar) {
        zzbnt zza = zzbodVar.zza("AFMA_getAdDictionary", zzboa.zza, zzeaj.zza);
        zzfia.zzb(listenableFuture, zzfhrVar);
        zzfgo zzi = zzfhhVar.zza(zzfhb.BUILD_URL, listenableFuture).zzc(zza).zzi();
        zzfia.zzf(zzi, zzfibVar, zzfhrVar);
        return zzi;
    }

    private final void zzn(ListenableFuture listenableFuture, zzbun zzbunVar, zzbuv zzbuvVar) {
        zzgot.zzq(zzgot.zzj(listenableFuture, new zzgob(this) { // from class: com.google.android.gms.internal.ads.zzeah
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzgot.zza(zzfed.zza((InputStream) obj));
            }
        }, zzbzh.zza), new zzeaa(this, zzbuvVar, zzbunVar), zzbzh.zzg);
    }

    private final synchronized void zzo() {
        int intValue = ((Long) zzbep.zzb.zze()).intValue();
        while (true) {
            ArrayDeque arrayDeque = this.zze;
            if (arrayDeque.size() >= intValue) {
                arrayDeque.removeFirst();
            }
        }
    }

    private final synchronized void zzp(zzeak zzeakVar) {
        zzo();
        this.zze.addLast(zzeakVar);
    }

    private final synchronized zzeak zzq(String str) {
        Iterator it = this.zze.iterator();
        while (it.hasNext()) {
            zzeak zzeakVar = (zzeak) it.next();
            if (zzeakVar.zzc.equals(str)) {
                it.remove();
                return zzeakVar;
            }
        }
        return null;
    }

    public final ListenableFuture zzb(final zzbuv zzbuvVar, int i) {
        zzeak zzq;
        zzfgo zzi;
        zzbnu zzr = com.google.android.gms.ads.internal.zzt.zzr();
        Context context = this.zza;
        zzbod zza = zzr.zza(context, VersionInfoParcel.forPackage(), this.zzf);
        zzevr zzw = this.zzd.zzw(zzbuvVar, i);
        zzbnt zza2 = zza.zza("google.afma.response.normalize", zzeam.zzd, zzboa.zzb);
        if (((Boolean) zzbep.zza.zze()).booleanValue()) {
            zzq = zzq(zzbuvVar.zzh);
            if (zzq == null) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but no matching parameters were found.");
            }
        } else {
            String str = zzbuvVar.zzj;
            zzq = null;
            if (str != null && !str.isEmpty()) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but split request is disabled.");
            }
        }
        zzfhr zzn = zzq == null ? zzfhr.zzn(context, 9) : zzq.zzd;
        zzfib zzf = zzw.zzf();
        zzf.zzb(zzbuvVar.zza.getStringArrayList("ad_types"));
        zzeaw zzeawVar = new zzeaw(zzbuvVar.zzg, zzf, zzn);
        zzeat zzeatVar = new zzeat(context, zzbuvVar.zzb.afmaVersion, this.zzg, i);
        zzfhh zze = zzw.zze();
        zzfhr zzn2 = zzfhr.zzn(context, 11);
        if (zzq == null) {
            final ListenableFuture zzl = zzl(zzbuvVar, zze, zzw);
            final ListenableFuture zzm = zzm(zzl, zze, zza, zzf, zzn);
            zzfhr zzn3 = zzfhr.zzn(context, 10);
            final zzfgo zzi2 = zze.zzb(zzfhb.HTTP, zzm, zzl).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeai
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    Bundle bundle;
                    zzbux zzbuxVar = (zzbux) ListenableFuture.this.get();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcr)).booleanValue() && (bundle = zzbuvVar.zzm) != null) {
                        bundle.putLong(zzdru.GET_AD_DICTIONARY_SDKCORE_START.zza(), zzbuxVar.zzj());
                        bundle.putLong(zzdru.GET_AD_DICTIONARY_SDKCORE_END.zza(), zzbuxVar.zzk());
                    }
                    return new zzeav((JSONObject) zzl.get(), zzbuxVar);
                }
            }).zzb(zzeawVar).zzb(zzfia.zzc(zzn3)).zzb(zzeatVar).zzi();
            zzfia.zzd(zzi2, zzf, zzn3);
            zzfia.zzb(zzi2, zzn2);
            zzi = zze.zzb(zzfhb.PRE_PROCESS, zzl, zzm, zzi2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeab
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    Bundle bundle;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcr)).booleanValue() && (bundle = zzbuv.this.zzm) != null) {
                        bundle.putLong(zzdru.HTTP_RESPONSE_READY.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
                    }
                    return new zzeam((zzeas) zzi2.get(), (JSONObject) zzl.get(), (zzbux) zzm.get());
                }
            }).zzc(zza2).zzi();
        } else {
            zzeav zzeavVar = new zzeav(zzq.zzb, zzq.zza);
            zzfhr zzn4 = zzfhr.zzn(context, 10);
            final zzfgo zzi3 = zze.zza(zzfhb.HTTP, zzgot.zza(zzeavVar)).zzb(zzeawVar).zzb(zzfia.zzc(zzn4)).zzb(zzeatVar).zzi();
            zzfia.zzd(zzi3, zzf, zzn4);
            final ListenableFuture zza3 = zzgot.zza(zzq);
            zzfia.zzb(zzi3, zzn2);
            zzi = zze.zzb(zzfhb.PRE_PROCESS, zzi3, zza3).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeac
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    zzeas zzeasVar = (zzeas) ListenableFuture.this.get();
                    ListenableFuture listenableFuture = zza3;
                    return new zzeam(zzeasVar, ((zzeak) listenableFuture.get()).zzb, ((zzeak) listenableFuture.get()).zza);
                }
            }).zzc(zza2).zzi();
        }
        zzfia.zzd(zzi, zzf, zzn2);
        return zzi;
    }

    public final ListenableFuture zzc(final zzbuv zzbuvVar, int i) {
        if (!((Boolean) zzbep.zza.zze()).booleanValue()) {
            return zzgot.zzc(new Exception("Split request is disabled."));
        }
        zzfey zzfeyVar = zzbuvVar.zzi;
        if (zzfeyVar == null) {
            return zzgot.zzc(new Exception("Pool configuration missing from request."));
        }
        if (zzfeyVar.zzc == 0 || zzfeyVar.zzd == 0) {
            return zzgot.zzc(new Exception("Caching is disabled."));
        }
        Context context = this.zza;
        zzbod zza = com.google.android.gms.ads.internal.zzt.zzr().zza(context, VersionInfoParcel.forPackage(), this.zzf);
        zzevr zzw = this.zzd.zzw(zzbuvVar, i);
        zzfhh zze = zzw.zze();
        final ListenableFuture zzl = zzl(zzbuvVar, zze, zzw);
        zzfib zzf = zzw.zzf();
        final zzfhr zzn = zzfhr.zzn(context, 9);
        final ListenableFuture zzm = zzm(zzl, zze, zza, zzf, zzn);
        return zze.zzb(zzfhb.GET_URL_AND_CACHE_KEY, zzl, zzm).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeaf
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzeap.this.zzk(zzm, zzl, zzbuvVar, zzn);
            }
        }).zzi();
    }

    public final ListenableFuture zzd(String str) {
        if (!((Boolean) zzbep.zza.zze()).booleanValue()) {
            return zzgot.zzc(new Exception("Split request is disabled."));
        }
        zzdzz zzdzzVar = new zzdzz(this);
        if (zzq(str) != null) {
            return zzgot.zza(zzdzzVar);
        }
        String.valueOf(str);
        return zzgot.zzc(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str))));
    }

    @Override // com.google.android.gms.internal.ads.zzbuj
    public final void zze(zzbuv zzbuvVar, zzbun zzbunVar) {
        Bundle bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcr)).booleanValue() && (bundle = zzbuvVar.zzm) != null) {
            bundle.putLong(zzdru.SERVICE_CONNECTED.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        ListenableFuture zzb = zzb(zzbuvVar, Binder.getCallingUid());
        zzn(zzb, zzbunVar, zzbuvVar);
        if (((Boolean) zzbei.zzg.zze()).booleanValue()) {
            final zzeax zzeaxVar = this.zzc;
            Objects.requireNonNull(zzeaxVar);
            zzb.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeao
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzeax.this.zza();
                }
            }, this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuj
    public final void zzf(zzbuv zzbuvVar, zzbun zzbunVar) {
        Bundle bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcr)).booleanValue() && (bundle = zzbuvVar.zzm) != null) {
            bundle.putLong(zzdru.SERVICE_CONNECTED.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzn(zzj(zzbuvVar, Binder.getCallingUid()), zzbunVar, zzbuvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbuj
    public final void zzg(zzbuv zzbuvVar, zzbun zzbunVar) {
        zzn(zzc(zzbuvVar, Binder.getCallingUid()), zzbunVar, zzbuvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbuj
    public final void zzh(String str, zzbun zzbunVar) {
        zzn(zzd(str), zzbunVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbuj
    public final void zzi(zzbuf zzbufVar, zzbuo zzbuoVar) {
        if (((Boolean) zzbex.zza.zze()).booleanValue()) {
            this.zzd.zzD();
            String str = zzbufVar.zza;
            zzgot.zzq(zzgot.zza(null), new zzdzy(this, zzbuoVar, zzbufVar), zzbzh.zzg);
        } else {
            try {
                zzbuoVar.zze("", zzbufVar);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e);
            }
        }
    }

    public final ListenableFuture zzj(final zzbuv zzbuvVar, int i) {
        zzbnu zzr = com.google.android.gms.ads.internal.zzt.zzr();
        Context context = this.zza;
        zzbod zza = zzr.zza(context, VersionInfoParcel.forPackage(), this.zzf);
        if (!((Boolean) zzbev.zza.zze()).booleanValue()) {
            return zzgot.zzc(new Exception("Signal collection disabled."));
        }
        zzevr zzw = this.zzd.zzw(zzbuvVar, i);
        final zzeus zzd = zzw.zzd();
        zzbnt zza2 = zza.zza("google.afma.request.getSignals", zzboa.zza, zzboa.zzb);
        zzfhr zzn = zzfhr.zzn(context, 22);
        zzfhh zze = zzw.zze();
        zzfhb zzfhbVar = zzfhb.GET_SIGNALS;
        Bundle bundle = zzbuvVar.zza;
        zzfgo zzi = zze.zza(zzfhbVar, zzgot.zza(bundle)).zzb(zzfia.zzc(zzn)).zzc(new zzgob() { // from class: com.google.android.gms.internal.ads.zzeag
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzeus.this.zza(com.google.android.gms.ads.internal.client.zzbb.zza().zzm((Bundle) obj), zzbuvVar.zzm, false);
            }
        }).zzj(zzfhb.JS_SIGNALS).zzc(zza2).zzi();
        zzfib zzf = zzw.zzf();
        zzf.zzb(bundle.getStringArrayList("ad_types"));
        zzf.zzd(bundle.getBundle("extras"));
        zzfia.zze(zzi, zzf, zzn);
        if (((Boolean) zzbei.zzh.zze()).booleanValue()) {
            final zzeax zzeaxVar = this.zzc;
            Objects.requireNonNull(zzeaxVar);
            zzi.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzean
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzeax.this.zza();
                }
            }, this.zzb);
        }
        return zzi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ InputStream zzk(ListenableFuture listenableFuture, ListenableFuture listenableFuture2, zzbuv zzbuvVar, zzfhr zzfhrVar) {
        String zzi = ((zzbux) listenableFuture.get()).zzi();
        zzp(new zzeak((zzbux) listenableFuture.get(), (JSONObject) listenableFuture2.get(), zzbuvVar.zzh, zzi, zzfhrVar));
        return new ByteArrayInputStream(zzi.getBytes(StandardCharsets.UTF_8));
    }
}
