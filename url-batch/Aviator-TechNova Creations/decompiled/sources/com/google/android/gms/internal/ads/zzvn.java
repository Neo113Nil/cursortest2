package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzvn implements zzyc {
    public final zzyc zza;
    final /* synthetic */ zzvo zzb;
    private boolean zzc;

    public zzvn(zzvo zzvoVar, zzyc zzycVar) {
        Objects.requireNonNull(zzvoVar);
        this.zzb = zzvoVar;
        this.zza = zzycVar;
    }

    public final void zza() {
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final boolean zzb() {
        return !this.zzb.zzo() && this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final void zzc() throws IOException {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final int zzd(zzlh zzlhVar, zzih zzihVar, int i) {
        zzvo zzvoVar = this.zzb;
        if (zzvoVar.zzo()) {
            return -3;
        }
        if (this.zzc) {
            zzihVar.zzg(4);
            return -4;
        }
        long zzi = zzvoVar.zzi();
        int zzd = this.zza.zzd(zzlhVar, zzihVar, i);
        if (zzd != -5) {
            long j = zzvoVar.zzb;
            if (j == Long.MIN_VALUE || ((zzd != -4 || zzihVar.zze < j) && !(zzd == -3 && zzi == Long.MIN_VALUE && !zzihVar.zzd))) {
                return zzd;
            }
            zzihVar.zza();
            zzihVar.zzg(4);
            this.zzc = true;
            return -4;
        }
        zzv zzvVar = zzlhVar.zzb;
        zzvVar.getClass();
        int i2 = zzvVar.zzJ;
        if (i2 == 0) {
            if (zzvVar.zzK != 0) {
                i2 = 0;
            }
            return -5;
        }
        int i3 = zzvoVar.zzb == Long.MIN_VALUE ? zzvVar.zzK : 0;
        zzt zza = zzvVar.zza();
        zza.zzH(i2);
        zza.zzI(i3);
        zzlhVar.zzb = zza.zzM();
        return -5;
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final int zze(long j) {
        if (this.zzb.zzo()) {
            return -3;
        }
        return this.zza.zze(j);
    }
}
