package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzdxq implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;
    private final zzhqg zzc;
    private final zzhqg zzd;

    private zzdxq(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4, zzhqg zzhqgVar5) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
        this.zzc = zzhqgVar3;
        this.zzd = zzhqgVar4;
    }

    public static zzdxq zza(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4, zzhqg zzhqgVar5) {
        return new zzdxq(zzhqgVar, zzhqgVar2, zzhqgVar3, zzhqgVar4, zzhqgVar5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0056, code lost:
    
        if (java.lang.Integer.toString(r6).equals(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzc(r2.zzd))) != false) goto L6;
     */
    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ Object zzb() {
        ListenableFuture submit;
        final zzauu zzauuVar = (zzauu) this.zza.zzb();
        final Context zza = ((zzchd) this.zzb).zza();
        zzfdc zza2 = ((zzcvj) this.zzc).zza();
        long longValue = ((Long) this.zzd.zzb()).longValue();
        zzgpd zzc = zzfgc.zzc();
        int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcZ)).intValue();
        if (intValue != -1) {
        }
        if (com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - longValue < ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzdb)).intValue()) {
            submit = zzc.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzdxl
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return zzauu.this.zzb().zzk(zza);
                }
            });
            zzhqf.zzb(submit);
            return submit;
        }
        submit = zzc.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzdxk
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzauu.this.zzb().zzl(zza);
            }
        });
        zzhqf.zzb(submit);
        return submit;
    }
}
