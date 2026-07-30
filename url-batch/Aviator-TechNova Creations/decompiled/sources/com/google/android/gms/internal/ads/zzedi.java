package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzedi implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;
    private final zzikp zzc;
    private final zzikp zzd;

    private zzedi(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4, zzikp zzikpVar5) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
        this.zzc = zzikpVar3;
        this.zzd = zzikpVar4;
    }

    public static zzedi zza(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4, zzikp zzikpVar5) {
        return new zzedi(zzikpVar, zzikpVar2, zzikpVar3, zzikpVar4, zzikpVar5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0056, code lost:
    
        if (java.lang.Integer.toString(r6).equals(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzc(r2.zzd))) != false) goto L6;
     */
    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ Object zzb() {
        ListenableFuture submit;
        final zzazh zzazhVar = (zzazh) this.zza.zzb();
        final Context zza = ((zzcmj) this.zzb).zza();
        zzfjk zza2 = ((zzdaw) this.zzc).zza();
        long longValue = ((Long) this.zzd.zzb()).longValue();
        zzgzy zzc = zzfmk.zzc();
        int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdu)).intValue();
        if (intValue != -1) {
        }
        if (com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - longValue < ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdw)).intValue()) {
            submit = zzc.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzedd
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return zzazh.this.zzb().zzk(zza);
                }
            });
            zziko.zzb(submit);
            return submit;
        }
        submit = zzc.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzedc
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzazh.this.zzb().zzl(zza);
            }
        });
        zziko.zzb(submit);
        return submit;
    }
}
