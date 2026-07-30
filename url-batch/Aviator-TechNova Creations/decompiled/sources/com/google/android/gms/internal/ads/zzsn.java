package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzsn implements zzqa {
    final /* synthetic */ zzsw zza;
    private final zzql zzb;

    /* synthetic */ zzsn(zzsw zzswVar, zzql zzqlVar, byte[] bArr) {
        Objects.requireNonNull(zzswVar);
        this.zza = zzswVar;
        this.zzb = zzqlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqa
    public final void zza(long j) {
        zzsw zzswVar = this.zza;
        if (equals(zzswVar.zzI()) && zzswVar.zzJ() != null) {
            ((zzsz) zzswVar.zzJ()).zza.zzaw().zzd(j);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        r0 = ((com.google.android.gms.internal.ads.zzsz) r0.zzJ()).zza.zzaY();
     */
    @Override // com.google.android.gms.internal.ads.zzqa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzb() {
        zzmk zzaY;
        zzsw zzswVar = this.zza;
        if (equals(zzswVar.zzI()) && zzswVar.zzJ() != null && zzswVar.zzN() && zzaY != null) {
            zzaY.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqa
    public final void zzc() {
        zzsw zzswVar = this.zza;
        if (equals(zzswVar.zzI())) {
            zzswVar.zzM(true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqa
    public final void zzd() {
        long j;
        zzsw zzswVar = this.zza;
        if (equals(zzswVar.zzI()) && zzswVar.zzJ() != null) {
            if (zzswVar.zzK().zzj() != -1) {
                long zzj = zzswVar.zzK().zzk().zze / zzswVar.zzK().zzj();
                zzqc zzL = zzswVar.zzL();
                zzL.getClass();
                j = zzfj.zzr(zzj, zzL.zzi());
            } else {
                j = -9223372036854775807L;
            }
            ((zzsz) zzswVar.zzJ()).zza.zzaw().zze(zzswVar.zzK().zzk().zze, zzfj.zzp(j), SystemClock.elapsedRealtime() - zzswVar.zzO());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqa
    public final void zze() {
        AtomicInteger atomicInteger;
        atomicInteger = zzsw.zza;
        atomicInteger.getAndDecrement();
        zzsw zzswVar = this.zza;
        if (zzswVar.zzJ() != null) {
            zzql zzqlVar = this.zzb;
            ((zzsz) zzswVar.zzJ()).zza.zzaw().zzl(new zzrd(zzqlVar.zza, zzqlVar.zzb, zzqlVar.zzc, false, false, zzqlVar.zze));
        }
    }
}
