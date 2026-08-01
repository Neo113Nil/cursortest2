package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.PlatformVersion;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzeip implements zzeij {
    private final zzdiu zza;
    private final zzgbl zzb;
    private final zzdna zzc;
    private final zzffn zzd;
    private final zzdpp zze;

    public zzeip(zzdiu zzdiuVar, zzgbl zzgblVar, zzdna zzdnaVar, zzffn zzffnVar, zzdpp zzdppVar) {
        this.zza = zzdiuVar;
        this.zzb = zzgblVar;
        this.zzc = zzdnaVar;
        this.zzd = zzffnVar;
        this.zze = zzdppVar;
    }

    private final ListenableFuture zzg(final zzfeh zzfehVar, final zzfdu zzfduVar, final JSONObject jSONObject) {
        zzdna zzdnaVar = this.zzc;
        final ListenableFuture zza = this.zzd.zza();
        final ListenableFuture zza2 = zzdnaVar.zza(zzfehVar, zzfduVar, jSONObject);
        return zzgbb.zzc(zza, zza2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeik
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeip.this.zzc(zza2, zza, zzfehVar, zzfduVar, jSONObject);
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzefv
    public final ListenableFuture zza(final zzfeh zzfehVar, final zzfdu zzfduVar) {
        return zzgbb.zzn(zzgbb.zzn(this.zzd.zza(), new zzgai() { // from class: com.google.android.gms.internal.ads.zzeim
            @Override // com.google.android.gms.internal.ads.zzgai
            public final ListenableFuture zza(Object obj) {
                return zzeip.this.zze(zzfduVar, (zzdpj) obj);
            }
        }, this.zzb), new zzgai() { // from class: com.google.android.gms.internal.ads.zzein
            @Override // com.google.android.gms.internal.ads.zzgai
            public final ListenableFuture zza(Object obj) {
                return zzeip.this.zzf(zzfehVar, zzfduVar, (JSONArray) obj);
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzefv
    public final boolean zzb(zzfeh zzfehVar, zzfdu zzfduVar) {
        zzfea zzfeaVar = zzfduVar.zzt;
        return (zzfeaVar == null || zzfeaVar.zzc == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ zzdkf zzc(ListenableFuture listenableFuture, ListenableFuture listenableFuture2, zzfeh zzfehVar, zzfdu zzfduVar, JSONObject jSONObject) throws Exception {
        zzdkk zzdkkVar = (zzdkk) listenableFuture.get();
        zzdpj zzdpjVar = (zzdpj) listenableFuture2.get();
        zzdkl zzd = this.zza.zzd(new zzcuh(zzfehVar, zzfduVar, null), new zzdkw(zzdkkVar), new zzdjj(jSONObject, zzdpjVar));
        zzd.zzh().zzb();
        zzd.zzk().zza(zzdpjVar);
        zzd.zzg().zza(zzdkkVar.zzs());
        zzd.zzl().zza(this.zze);
        return zzd.zza();
    }

    final /* synthetic */ ListenableFuture zzd(zzdpj zzdpjVar, JSONObject jSONObject) throws Exception {
        this.zzd.zzb(zzgbb.zzh(zzdpjVar));
        if (jSONObject.optBoolean(FirebaseAnalytics.Param.SUCCESS)) {
            return zzgbb.zzh(jSONObject.getJSONObject("json").getJSONArray("ads"));
        }
        throw new zzboj("process json failed");
    }

    final /* synthetic */ ListenableFuture zze(zzfdu zzfduVar, final zzdpj zzdpjVar) throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isNonagon", true);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzis)).booleanValue() && PlatformVersion.isAtLeastR()) {
            jSONObject.put("skipDeepLinkValidation", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("response", zzfduVar.zzt.zzc);
        jSONObject2.put("sdk_params", jSONObject);
        return zzgbb.zzn(zzdpjVar.zzd("google.afma.nativeAds.preProcessJson", jSONObject2), new zzgai() { // from class: com.google.android.gms.internal.ads.zzeil
            @Override // com.google.android.gms.internal.ads.zzgai
            public final ListenableFuture zza(Object obj) {
                return zzeip.this.zzd(zzdpjVar, (JSONObject) obj);
            }
        }, this.zzb);
    }

    final /* synthetic */ ListenableFuture zzf(zzfeh zzfehVar, zzfdu zzfduVar, JSONArray jSONArray) throws Exception {
        if (jSONArray.length() == 0) {
            return zzgbb.zzg(new zzdxn(3));
        }
        if (zzfehVar.zza.zza.zzk <= 1) {
            return zzgbb.zzm(zzg(zzfehVar, zzfduVar, jSONArray.getJSONObject(0)), new zzftn() { // from class: com.google.android.gms.internal.ads.zzeio
                @Override // com.google.android.gms.internal.ads.zzftn
                public final Object apply(Object obj) {
                    return Collections.singletonList(zzgbb.zzh((zzdkf) obj));
                }
            }, this.zzb);
        }
        int length = jSONArray.length();
        this.zzd.zzc(Math.min(length, zzfehVar.zza.zza.zzk));
        ArrayList arrayList = new ArrayList(zzfehVar.zza.zza.zzk);
        for (int i = 0; i < zzfehVar.zza.zza.zzk; i++) {
            if (i < length) {
                arrayList.add(zzg(zzfehVar, zzfduVar, jSONArray.getJSONObject(i)));
            } else {
                arrayList.add(zzgbb.zzg(new zzdxn(3)));
            }
        }
        return zzgbb.zzh(arrayList);
    }
}
