package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzgld implements zzgky {
    private final zzgct zza;
    private final zzgct zzb;
    private final zzgct zzc;
    private final zzgct zzd;
    private final zzika zze;
    private final zzika zzf;
    private final File zzg;
    private final ExecutorService zzh;
    private final zzgoe zzi;

    zzgld(zzgct zzgctVar, zzgct zzgctVar2, zzika zzikaVar, zzgct zzgctVar3, zzgct zzgctVar4, zzika zzikaVar2, File file, ExecutorService executorService, zzgoe zzgoeVar) {
        this.zza = zzgctVar;
        this.zzc = zzgctVar2;
        this.zze = zzikaVar;
        this.zzb = zzgctVar3;
        this.zzd = zzgctVar4;
        this.zzf = zzikaVar2;
        this.zzg = file;
        this.zzh = executorService;
        this.zzi = zzgoeVar;
    }

    private final ListenableFuture zzj(byte[] bArr) {
        ListenableFuture zzc = this.zzd.zzc(bArr);
        this.zzi.zze(15305, zzc);
        return zzc;
    }

    private final ListenableFuture zzk(zzgdu zzgduVar) {
        ListenableFuture zzc = this.zzb.zzc(zzgduVar);
        this.zzi.zze(15303, zzc);
        return zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final ListenableFuture zza() {
        return zzgzo.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzglc
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new Boolean(zzgld.this.zzf());
            }
        }, this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final ListenableFuture zzb() {
        ListenableFuture zzb = this.zza.zzb();
        this.zzi.zze(15302, zzb);
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final ListenableFuture zzc(final zzgdu zzgduVar, byte[] bArr, byte[] bArr2) {
        ListenableFuture zzc = ((zzgct) this.zzf.zzb()).zzc(bArr);
        this.zzi.zze(15307, zzc);
        return (zzgzg) zzgzo.zzj(zzgzg.zzw(zzgzo.zzl(zzc, zzj(bArr2))), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzglb
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzgld.this.zzi(zzgduVar, (List) obj);
            }
        }, zzhaf.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final ListenableFuture zzd(final zzgdu zzgduVar, byte[] bArr) {
        return (zzgzg) zzgzo.zzj(zzgzg.zzw(zzj(bArr)), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzgla
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzgld.this.zzh(zzgduVar, (Void) obj);
            }
        }, zzhaf.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgky
    public final ListenableFuture zze() {
        zzgzg zzgzgVar = (zzgzg) zzgzo.zzk(zzgzg.zzw(this.zza.zzb()), new zzgqt() { // from class: com.google.android.gms.internal.ads.zzgkz
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                return zzgld.this.zzg((zzgdu) obj);
            }
        }, zzhaf.zza());
        this.zzi.zze(15314, zzgzgVar);
        return zzgzgVar;
    }

    final /* synthetic */ boolean zzf() {
        zzgct zzgctVar;
        try {
            zzgct zzgctVar2 = this.zzb;
            File zza = zzgctVar2.zza();
            if (!zza.exists()) {
                zzgctVar2.zza().delete();
                ((zzgct) this.zzf.zzb()).zza().delete();
                this.zzd.zza().delete();
                return false;
            }
            File zza2 = ((zzgct) this.zzf.zzb()).zza();
            File zza3 = ((zzgct) this.zze.zzb()).zza();
            try {
                if (zza2.exists()) {
                    File parentFile = zza3.getParentFile();
                    if (parentFile != null) {
                        zzfws.zze(parentFile);
                    }
                    zzgxm.zzb(zza3);
                    zzgxm.zzc(zza2, zza3);
                }
                File zza4 = this.zzd.zza();
                File zza5 = this.zzc.zza();
                try {
                    if (zza4.exists()) {
                        zzgxm.zzb(zza5);
                        zzgxm.zzc(zza4, zza5);
                    }
                    File zza6 = this.zza.zza();
                    try {
                        if (zza.exists()) {
                            zzgxm.zzb(zza6);
                            zzgxm.zzc(zza, zza6);
                        }
                        this.zzb.zza().delete();
                        ((zzgct) this.zzf.zzb()).zza().delete();
                        this.zzd.zza().delete();
                        return true;
                    } catch (IOException | SecurityException e) {
                        this.zzi.zzd(15313, e);
                        zzgctVar = this.zzb;
                        zzgctVar.zza().delete();
                        ((zzgct) this.zzf.zzb()).zza().delete();
                        this.zzd.zza().delete();
                        return false;
                    }
                } catch (IOException | SecurityException e2) {
                    this.zzi.zzd(15312, e2);
                    zzgctVar = this.zzb;
                }
            } catch (IOException | SecurityException e3) {
                this.zzi.zzd(15311, e3);
                zzgctVar = this.zzb;
            }
        } catch (Throwable th) {
            this.zzb.zza().delete();
            ((zzgct) this.zzf.zzb()).zza().delete();
            this.zzd.zza().delete();
            throw th;
        }
    }

    final /* synthetic */ zzfwq zzg(zzgdu zzgduVar) {
        if (zzgduVar == null || zzgduVar.equals(zzgdu.zzg())) {
            return null;
        }
        zzbcp zza = zzgduVar.zza();
        File zza2 = ((zzgct) this.zze.zzb()).zza();
        zzgct zzgctVar = this.zzc;
        return new zzfwq(zza, zza2, zzgctVar.zza(), this.zzg);
    }

    final /* synthetic */ ListenableFuture zzh(zzgdu zzgduVar, Void r2) {
        return zzk(zzgduVar);
    }

    final /* synthetic */ ListenableFuture zzi(zzgdu zzgduVar, List list) {
        return zzk(zzgduVar);
    }
}
