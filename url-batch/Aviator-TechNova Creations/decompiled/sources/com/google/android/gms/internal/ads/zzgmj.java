package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzgmj implements zzgmg {
    private final zzgct zza;
    private final zzgct zzb;
    private final zzika zzc;
    private final zzgoe zzd;

    zzgmj(zzgct zzgctVar, zzgct zzgctVar2, zzika zzikaVar, zzgoe zzgoeVar) {
        this.zza = zzgctVar;
        this.zzb = zzgctVar2;
        this.zzc = zzikaVar;
        this.zzd = zzgoeVar;
    }

    private final ListenableFuture zzh(zzgdu zzgduVar) {
        ListenableFuture zzc = this.zza.zzc(zzgduVar);
        this.zzd.zze(20303, zzc);
        return zzc;
    }

    private final ListenableFuture zzi(byte[] bArr) {
        ListenableFuture zzc = this.zzb.zzc(bArr);
        this.zzd.zze(20305, zzc);
        return zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final ListenableFuture zza() {
        return zzgzo.zza(true);
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final ListenableFuture zzb() {
        ListenableFuture zzb = this.zza.zzb();
        this.zzd.zze(20302, zzb);
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final ListenableFuture zzc(final zzgdu zzgduVar, byte[] bArr, byte[] bArr2) {
        ListenableFuture zzc = ((zzgct) this.zzc.zzb()).zzc(bArr);
        this.zzd.zze(20307, zzc);
        return (zzgzg) zzgzo.zzj(zzgzg.zzw(zzgzo.zzl(zzc, zzi(bArr2))), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzgmh
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzgmj.this.zzg(zzgduVar, (List) obj);
            }
        }, zzhaf.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final ListenableFuture zzd(final zzgdu zzgduVar, byte[] bArr) {
        return (zzgzg) zzgzo.zzj(zzgzg.zzw(zzi(bArr)), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzgmi
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzgmj.this.zzf(zzgduVar, (Void) obj);
            }
        }, zzhaf.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgmg
    public final ListenableFuture zze() {
        ListenableFuture zzb = this.zzb.zzb();
        this.zzd.zze(20304, zzb);
        return zzb;
    }

    final /* synthetic */ ListenableFuture zzf(zzgdu zzgduVar, Void r2) {
        return zzh(zzgduVar);
    }

    final /* synthetic */ ListenableFuture zzg(zzgdu zzgduVar, List list) {
        return zzh(zzgduVar);
    }
}
