package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdxr {
    private final zzgbl zza;
    private final zzgbl zzb;
    private final zzdyy zzc;
    private final zzhdj zzd;

    public zzdxr(zzgbl zzgblVar, zzgbl zzgblVar2, zzdyy zzdyyVar, zzhdj zzhdjVar) {
        this.zza = zzgblVar;
        this.zzb = zzgblVar2;
        this.zzc = zzdyyVar;
        this.zzd = zzhdjVar;
    }

    final /* synthetic */ ListenableFuture zza(zzbwa zzbwaVar, int i, zzdzp zzdzpVar) throws Exception {
        return ((zzebw) this.zzd.zzb()).zzc(zzbwaVar, i);
    }

    public final ListenableFuture zzb(final zzbwa zzbwaVar) {
        ListenableFuture zzf;
        String str = zzbwaVar.zzd;
        com.google.android.gms.ads.internal.zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzt.zzB(str)) {
            zzf = zzgbb.zzg(new zzdzp(1));
        } else {
            zzf = zzgbb.zzf(this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdxo
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzdxr.this.zzc(zzbwaVar);
                }
            }), ExecutionException.class, new zzgai() { // from class: com.google.android.gms.internal.ads.zzdxp
                @Override // com.google.android.gms.internal.ads.zzgai
                public final ListenableFuture zza(Object obj) {
                    return zzgbb.zzg(((ExecutionException) obj).getCause());
                }
            }, this.zzb);
        }
        final int callingUid = Binder.getCallingUid();
        return zzgbb.zzf(zzf, zzdzp.class, new zzgai() { // from class: com.google.android.gms.internal.ads.zzdxq
            @Override // com.google.android.gms.internal.ads.zzgai
            public final ListenableFuture zza(Object obj) {
                return zzdxr.this.zza(zzbwaVar, callingUid, (zzdzp) obj);
            }
        }, this.zzb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ InputStream zzc(zzbwa zzbwaVar) throws Exception {
        zzccf zzccfVar;
        final zzdyy zzdyyVar = this.zzc;
        synchronized (zzdyyVar.zzb) {
            if (zzdyyVar.zzc) {
                zzccfVar = zzdyyVar.zza;
            } else {
                zzdyyVar.zzc = true;
                zzdyyVar.zze = zzbwaVar;
                zzdyyVar.zzf.checkAvailabilityAndConnect();
                zzdyyVar.zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdyx
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdyy.this.zza();
                    }
                }, zzcca.zzf);
                zzccfVar = zzdyyVar.zza;
            }
        }
        return (InputStream) zzccfVar.get(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzfw)).intValue(), TimeUnit.SECONDS);
    }
}
