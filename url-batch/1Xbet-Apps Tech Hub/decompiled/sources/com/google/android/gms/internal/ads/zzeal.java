package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzeal {
    private final zzgbl zza;
    private final zzgbl zzb;
    private final zzebd zzc;

    zzeal(zzgbl zzgblVar, zzgbl zzgblVar2, zzebd zzebdVar) {
        this.zza = zzgblVar;
        this.zzb = zzgblVar2;
        this.zzc = zzebdVar;
    }

    final /* synthetic */ ListenableFuture zza(zzbve zzbveVar) throws Exception {
        return this.zzc.zza(zzbveVar, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzkI)).longValue());
    }

    public final ListenableFuture zzb(final zzbve zzbveVar) {
        ListenableFuture zzf;
        String str = zzbveVar.zzb;
        com.google.android.gms.ads.internal.zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzt.zzB(str)) {
            zzf = zzgbb.zzg(new zzdzp(1, "Ads signal service force local"));
        } else {
            zzf = zzgbb.zzf(zzgbb.zzk(new zzgah() { // from class: com.google.android.gms.internal.ads.zzeah
                @Override // com.google.android.gms.internal.ads.zzgah
                public final ListenableFuture zza() {
                    return zzeal.this.zza(zzbveVar);
                }
            }, this.zza), ExecutionException.class, new zzgai() { // from class: com.google.android.gms.internal.ads.zzeai
                @Override // com.google.android.gms.internal.ads.zzgai
                public final ListenableFuture zza(Object obj) {
                    ExecutionException executionException = (ExecutionException) obj;
                    Throwable cause = executionException.getCause();
                    Throwable th = executionException;
                    if (cause != null) {
                        th = executionException.getCause();
                    }
                    return zzgbb.zzg(th);
                }
            }, this.zzb);
        }
        return zzgbb.zzn(zzgbb.zzf(zzgas.zzu(zzf), zzdzp.class, new zzgai() { // from class: com.google.android.gms.internal.ads.zzeaj
            @Override // com.google.android.gms.internal.ads.zzgai
            public final ListenableFuture zza(Object obj) {
                return zzgbb.zzh(null);
            }
        }, this.zzb), new zzgai() { // from class: com.google.android.gms.internal.ads.zzeak
            @Override // com.google.android.gms.internal.ads.zzgai
            public final ListenableFuture zza(Object obj) {
                InputStream inputStream = (InputStream) obj;
                JSONObject jSONObject = new JSONObject();
                if (inputStream == null) {
                    return zzgbb.zzh(jSONObject);
                }
                try {
                    com.google.android.gms.ads.internal.zzt.zzp();
                    jSONObject = new JSONObject(com.google.android.gms.ads.internal.util.zzt.zzM(new InputStreamReader(inputStream)));
                } catch (IOException | JSONException e) {
                    com.google.android.gms.ads.internal.zzt.zzo().zzw(e, "AdsServiceSignalTask.startAdsServiceSignalTask");
                }
                return zzgbb.zzh(jSONObject);
            }
        }, this.zzb);
    }
}
