package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.net.HttpHeaders;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzegw extends zzbzg {
    private final Context zza;
    private final zzgzy zzb;
    private final zzehe zzc;
    private final zzcqi zzd;
    private final ArrayDeque zze;
    private final zzfor zzf;
    private final zzcac zzg;

    public zzegw(Context context, zzgzy zzgzyVar, zzcac zzcacVar, zzcqi zzcqiVar, zzehe zzeheVar, ArrayDeque arrayDeque, zzehb zzehbVar, zzfor zzforVar) {
        zzbhe.zza(context);
        this.zza = context;
        this.zzb = zzgzyVar;
        this.zzg = zzcacVar;
        this.zzc = zzeheVar;
        this.zzd = zzcqiVar;
        this.zze = arrayDeque;
        this.zzf = zzforVar;
    }

    private static ListenableFuture zzm(final zzbzu zzbzuVar, zzfnu zzfnuVar, final zzfbz zzfbzVar) {
        zzgyw zzgywVar = new zzgyw() { // from class: com.google.android.gms.internal.ads.zzegk
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzfbz.this.zzc().zza(com.google.android.gms.ads.internal.client.zzbb.zza().zzm((Bundle) obj), zzbzuVar.zzm, false);
            }
        };
        return zzfnuVar.zza(zzfno.GMS_SIGNALS, zzgzo.zza(zzbzuVar.zza)).zzc(zzgywVar).zzb(zzegl.zza).zzi();
    }

    private static ListenableFuture zzn(ListenableFuture listenableFuture, zzfnu zzfnuVar, zzbsz zzbszVar, zzfoo zzfooVar, zzfoe zzfoeVar) {
        zzbsp zza = zzbszVar.zza("AFMA_getAdDictionary", zzbsw.zza, zzegq.zza);
        zzfon.zzb(listenableFuture, zzfoeVar);
        zzfnb zzi = zzfnuVar.zza(zzfno.BUILD_URL, listenableFuture).zzc(zza).zzi();
        zzfon.zzf(zzi, zzfooVar, zzfoeVar);
        return zzi;
    }

    private final void zzo(ListenableFuture listenableFuture, zzbzl zzbzlVar, zzbzu zzbzuVar) {
        zzgzo.zzr(zzgzo.zzj(listenableFuture, new zzgyw(this) { // from class: com.google.android.gms.internal.ads.zzego
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzgzo.zza(zzfkl.zza((InputStream) obj));
            }
        }, zzcei.zza), new zzegh(this, zzbzuVar, zzbzlVar), zzcei.zzg);
    }

    private final synchronized void zzp() {
        int intValue = ((Long) zzbjl.zzb.zze()).intValue();
        while (true) {
            ArrayDeque arrayDeque = this.zze;
            if (arrayDeque.size() >= intValue) {
                arrayDeque.removeFirst();
            }
        }
    }

    private final synchronized void zzq(zzegr zzegrVar) {
        zzp();
        this.zze.addLast(zzegrVar);
    }

    private final synchronized zzegr zzr(String str) {
        Iterator it = this.zze.iterator();
        while (it.hasNext()) {
            zzegr zzegrVar = (zzegr) it.next();
            if (zzegrVar.zzc.equals(str)) {
                it.remove();
                return zzegrVar;
            }
        }
        return null;
    }

    public final ListenableFuture zzb(final zzbzu zzbzuVar, int i) {
        zzegr zzr;
        zzfnb zzi;
        zzbsq zzr2 = com.google.android.gms.ads.internal.zzt.zzr();
        Context context = this.zza;
        zzbsz zza = zzr2.zza(context, VersionInfoParcel.forPackage(), this.zzf);
        zzfbz zzy = this.zzd.zzy(zzbzuVar, i);
        zzbsp zza2 = zza.zza("google.afma.response.normalize", zzegt.zzd, zzbsw.zzb);
        if (((Boolean) zzbjl.zza.zze()).booleanValue()) {
            zzr = zzr(zzbzuVar.zzh);
            if (zzr == null) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but no matching parameters were found.");
            }
        } else {
            String str = zzbzuVar.zzj;
            zzr = null;
            if (str != null && !str.isEmpty()) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but split request is disabled.");
            }
        }
        zzegr zzegrVar = zzr;
        zzfoe zzn = zzegrVar == null ? zzfoe.zzn(context, 9) : zzegrVar.zzd;
        zzfoo zzf = zzy.zzf();
        zzf.zzb(zzbzuVar.zza.getStringArrayList("ad_types"));
        zzehd zzehdVar = new zzehd(zzbzuVar.zzg, zzf, zzn);
        zzeha zzehaVar = new zzeha(context, zzbzuVar.zzb.afmaVersion, this.zzg, i, null);
        zzfnu zze = zzy.zze();
        zzfoe zzn2 = zzfoe.zzn(context, 11);
        if (zzegrVar == null) {
            final ListenableFuture zzm = zzm(zzbzuVar, zze, zzy);
            final ListenableFuture zzn3 = zzn(zzm, zze, zza, zzf, zzn);
            zzfoe zzn4 = zzfoe.zzn(context, 10);
            final zzfnb zzi2 = zze.zzb(zzfno.HTTP, zzn3, zzm).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzegp
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    Bundle bundle;
                    zzbzw zzbzwVar = (zzbzw) ListenableFuture.this.get();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcK)).booleanValue() && (bundle = zzbzuVar.zzm) != null) {
                        bundle.putLong(zzdxh.GET_AD_DICTIONARY_SDKCORE_START.zza(), zzbzwVar.zzj());
                        bundle.putLong(zzdxh.GET_AD_DICTIONARY_SDKCORE_END.zza(), zzbzwVar.zzk());
                    }
                    return new zzehc((JSONObject) zzm.get(), zzbzwVar);
                }
            }).zzb(zzehdVar).zzb(zzfon.zzc(zzn4)).zzb(zzehaVar).zzi();
            zzfon.zzd(zzi2, zzf, zzn4);
            zzfon.zzb(zzi2, zzn2);
            zzi = zze.zzb(zzfno.PRE_PROCESS, zzm, zzn3, zzi2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzegi
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    Bundle bundle;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcK)).booleanValue() && (bundle = zzbzu.this.zzm) != null) {
                        bundle.putLong(zzdxh.HTTP_RESPONSE_READY.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
                    }
                    return new zzegt((zzegz) zzi2.get(), (JSONObject) zzm.get(), (zzbzw) zzn3.get());
                }
            }).zzc(zza2).zzi();
        } else {
            zzehc zzehcVar = new zzehc(zzegrVar.zzb, zzegrVar.zza);
            zzfoe zzn5 = zzfoe.zzn(context, 10);
            final zzfnb zzi3 = zze.zza(zzfno.HTTP, zzgzo.zza(zzehcVar)).zzb(zzehdVar).zzb(zzfon.zzc(zzn5)).zzb(zzehaVar).zzi();
            zzfon.zzd(zzi3, zzf, zzn5);
            final ListenableFuture zza3 = zzgzo.zza(zzegrVar);
            zzfon.zzb(zzi3, zzn2);
            zzi = zze.zzb(zzfno.PRE_PROCESS, zzi3, zza3).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzegj
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    zzegz zzegzVar = (zzegz) ListenableFuture.this.get();
                    ListenableFuture listenableFuture = zza3;
                    return new zzegt(zzegzVar, ((zzegr) listenableFuture.get()).zzb, ((zzegr) listenableFuture.get()).zza);
                }
            }).zzc(zza2).zzi();
        }
        zzfon.zzd(zzi, zzf, zzn2);
        return zzi;
    }

    public final ListenableFuture zzc(final zzbzu zzbzuVar, int i) {
        if (!((Boolean) zzbjl.zza.zze()).booleanValue()) {
            return zzgzo.zzc(new Exception("Split request is disabled."));
        }
        zzflg zzflgVar = zzbzuVar.zzi;
        if (zzflgVar == null) {
            return zzgzo.zzc(new Exception("Pool configuration missing from request."));
        }
        if (zzflgVar.zzc == 0 || zzflgVar.zzd == 0) {
            return zzgzo.zzc(new Exception("Caching is disabled."));
        }
        Context context = this.zza;
        zzbsz zza = com.google.android.gms.ads.internal.zzt.zzr().zza(context, VersionInfoParcel.forPackage(), this.zzf);
        zzfbz zzy = this.zzd.zzy(zzbzuVar, i);
        zzfnu zze = zzy.zze();
        final ListenableFuture zzm = zzm(zzbzuVar, zze, zzy);
        zzfoo zzf = zzy.zzf();
        final zzfoe zzn = zzfoe.zzn(context, 9);
        final ListenableFuture zzn2 = zzn(zzm, zze, zza, zzf, zzn);
        return zze.zzb(zzfno.GET_URL_AND_CACHE_KEY, zzm, zzn2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzegm
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzegw.this.zzl(zzn2, zzm, zzbzuVar, zzn);
            }
        }).zzi();
    }

    public final ListenableFuture zzd(String str) {
        if (!((Boolean) zzbjl.zza.zze()).booleanValue()) {
            return zzgzo.zzc(new Exception("Split request is disabled."));
        }
        zzegg zzeggVar = new zzegg(this);
        if (zzr(str) != null) {
            return zzgzo.zza(zzeggVar);
        }
        String.valueOf(str);
        return zzgzo.zzc(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str))));
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zze(zzbzu zzbzuVar, zzbzl zzbzlVar) {
        Bundle bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcK)).booleanValue() && (bundle = zzbzuVar.zzm) != null) {
            bundle.putLong(zzdxh.SERVICE_CONNECTED.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        ListenableFuture zzb = zzb(zzbzuVar, Binder.getCallingUid());
        zzo(zzb, zzbzlVar, zzbzuVar);
        if (((Boolean) zzbje.zzi.zze()).booleanValue()) {
            final zzehe zzeheVar = this.zzc;
            Objects.requireNonNull(zzeheVar);
            zzb.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzegv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzehe.this.zza();
                }
            }, this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzf(zzbzu zzbzuVar, zzbzl zzbzlVar) {
        Bundle bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcK)).booleanValue() && (bundle = zzbzuVar.zzm) != null) {
            bundle.putLong(zzdxh.SERVICE_CONNECTED.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzo(zzk(zzbzuVar, Binder.getCallingUid()), zzbzlVar, zzbzuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzg(zzbzu zzbzuVar, zzbzl zzbzlVar) {
        zzo(zzc(zzbzuVar, Binder.getCallingUid()), zzbzlVar, zzbzuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzh(String str, zzbzl zzbzlVar) {
        zzo(zzd(str), zzbzlVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzi(String str) throws RemoteException {
        int callingUid = Binder.getCallingUid();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpz)).booleanValue()) {
            String str2 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpA);
            if (str2.isEmpty()) {
                return;
            }
            Iterable<String> zzd = zzgrr.zza(zzgqq.zzc(AbstractJsonLexerKt.COMMA)).zzd(str2);
            com.google.android.gms.ads.internal.util.zze.zza("AdRequestServiceImpl: Preconnecting");
            for (String str3 : zzd) {
                Context context = this.zza;
                zzeha zzehaVar = new zzeha(context, str, this.zzg, callingUid, "HEAD");
                HashMap hashMap = new HashMap();
                hashMap.put(HttpHeaders.USER_AGENT, com.google.android.gms.ads.internal.zzt.zzc().zze(context, str));
                zzegy zzegyVar = new zzegy(str3, 30000, hashMap, new byte[0], "", false);
                try {
                    zzegy zzegyVar2 = zzegyVar;
                    zzegz zza = zzehaVar.zza(zzegyVar);
                    zzegz zzegzVar = zza;
                    if (zza.zza != 200) {
                        int i = zza.zza;
                        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 32);
                        sb.append("Unexpected preconnect response: ");
                        sb.append(i);
                        throw new RemoteException(sb.toString());
                    }
                } catch (Exception e) {
                    throw new RemoteException(e.getMessage());
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzj(zzbzd zzbzdVar, zzbzm zzbzmVar) {
        if (((Boolean) zzbjt.zza.zze()).booleanValue()) {
            this.zzd.zzF();
            String str = zzbzdVar.zza;
            zzgzo.zzr(zzgzo.zza(null), new zzegf(this, zzbzmVar, zzbzdVar), zzcei.zzg);
        } else {
            try {
                zzbzmVar.zze("", zzbzdVar);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e);
            }
        }
    }

    public final ListenableFuture zzk(final zzbzu zzbzuVar, int i) {
        zzbsq zzr = com.google.android.gms.ads.internal.zzt.zzr();
        Context context = this.zza;
        zzbsz zza = zzr.zza(context, VersionInfoParcel.forPackage(), this.zzf);
        if (!((Boolean) zzbjr.zza.zze()).booleanValue()) {
            return zzgzo.zzc(new Exception("Signal collection disabled."));
        }
        zzfbz zzy = this.zzd.zzy(zzbzuVar, i);
        final zzfba zzd = zzy.zzd();
        zzbsp zza2 = zza.zza("google.afma.request.getSignals", zzbsw.zza, zzbsw.zzb);
        zzfoe zzn = zzfoe.zzn(context, 22);
        zzfnu zze = zzy.zze();
        zzfno zzfnoVar = zzfno.GET_SIGNALS;
        Bundle bundle = zzbzuVar.zza;
        zzfnb zzi = zze.zza(zzfnoVar, zzgzo.zza(bundle)).zzb(zzfon.zzc(zzn)).zzc(new zzgyw() { // from class: com.google.android.gms.internal.ads.zzegn
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzfba.this.zza(com.google.android.gms.ads.internal.client.zzbb.zza().zzm((Bundle) obj), zzbzuVar.zzm, false);
            }
        }).zzj(zzfno.JS_SIGNALS).zzc(zza2).zzi();
        zzfoo zzf = zzy.zzf();
        zzf.zzb(bundle.getStringArrayList("ad_types"));
        zzf.zzd(bundle.getBundle("extras"));
        zzfon.zze(zzi, zzf, zzn);
        if (((Boolean) zzbje.zzj.zze()).booleanValue()) {
            final zzehe zzeheVar = this.zzc;
            Objects.requireNonNull(zzeheVar);
            zzi.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzegu
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzehe.this.zza();
                }
            }, this.zzb);
        }
        return zzi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ InputStream zzl(ListenableFuture listenableFuture, ListenableFuture listenableFuture2, zzbzu zzbzuVar, zzfoe zzfoeVar) {
        String zzi = ((zzbzw) listenableFuture.get()).zzi();
        zzq(new zzegr((zzbzw) listenableFuture.get(), (JSONObject) listenableFuture2.get(), zzbzuVar.zzh, zzi, zzfoeVar));
        return new ByteArrayInputStream(zzi.getBytes(StandardCharsets.UTF_8));
    }
}
