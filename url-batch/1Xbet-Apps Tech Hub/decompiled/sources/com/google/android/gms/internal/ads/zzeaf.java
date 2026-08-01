package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzeaf {
    private final zzgbl zza;
    private final zzgbl zzb;
    private final zzeba zzc;
    private final zzhdj zzd;

    zzeaf(zzgbl zzgblVar, zzgbl zzgblVar2, zzeba zzebaVar, zzhdj zzhdjVar) {
        this.zza = zzgblVar;
        this.zzb = zzgblVar2;
        this.zzc = zzebaVar;
        this.zzd = zzhdjVar;
    }

    final /* synthetic */ ListenableFuture zza(zzbvi zzbviVar) throws Exception {
        return this.zzc.zza(zzbviVar, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzkJ)).longValue());
    }

    final /* synthetic */ ListenableFuture zzb(zzbvi zzbviVar, int i, zzdzp zzdzpVar) throws Exception {
        return ((zzecg) this.zzd.zzb()).zzb(zzbviVar, i);
    }

    public final ListenableFuture zzc(final zzbvi zzbviVar) {
        ListenableFuture zzf;
        String str = zzbviVar.zzf;
        com.google.android.gms.ads.internal.zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzt.zzB(str)) {
            zzf = zzgbb.zzg(new zzdzp(1, "Ads service proxy force local"));
        } else {
            zzf = zzgbb.zzf(zzgbb.zzk(new zzgah() { // from class: com.google.android.gms.internal.ads.zzeac
                @Override // com.google.android.gms.internal.ads.zzgah
                public final ListenableFuture zza() {
                    return zzeaf.this.zza(zzbviVar);
                }
            }, this.zza), ExecutionException.class, new zzgai() { // from class: com.google.android.gms.internal.ads.zzead
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
        final int callingUid = Binder.getCallingUid();
        return zzgbb.zzf(zzf, zzdzp.class, new zzgai() { // from class: com.google.android.gms.internal.ads.zzeae
            @Override // com.google.android.gms.internal.ads.zzgai
            public final ListenableFuture zza(Object obj) {
                return zzeaf.this.zzb(zzbviVar, callingUid, (zzdzp) obj);
            }
        }, this.zzb);
    }
}
