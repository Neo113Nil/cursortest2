package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public abstract class zzdz implements zzdy {
    protected zzdw zzb;
    protected zzdw zzc;
    private zzdw zzd;
    private zzdw zze;
    private ByteBuffer zzf;
    private ByteBuffer zzg;
    private boolean zzh;

    public zzdz() {
        ByteBuffer byteBuffer = zza;
        this.zzf = byteBuffer;
        this.zzg = byteBuffer;
        this.zzd = zzdw.zza;
        zzdw zzdwVar = zzdw.zza;
        this.zze = zzdwVar;
        this.zzb = zzdwVar;
        this.zzc = zzdwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdy
    public final zzdw zza(zzdw zzdwVar) throws zzdx {
        this.zzd = zzdwVar;
        this.zze = zzi(zzdwVar);
        return zzg() ? this.zze : zzdw.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzdy
    public ByteBuffer zzb() {
        ByteBuffer byteBuffer = this.zzg;
        this.zzg = zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzdy
    public final void zzc() {
        this.zzg = zza;
        this.zzh = false;
        this.zzb = this.zzd;
        this.zzc = this.zze;
        zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzdy
    public final void zzd() {
        this.zzh = true;
        zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzdy
    public final void zzf() {
        zzc();
        this.zzf = zza;
        this.zzd = zzdw.zza;
        zzdw zzdwVar = zzdw.zza;
        this.zze = zzdwVar;
        this.zzb = zzdwVar;
        this.zzc = zzdwVar;
        zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzdy
    public boolean zzg() {
        return this.zze != zzdw.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzdy
    public boolean zzh() {
        return this.zzh && this.zzg == zza;
    }

    protected zzdw zzi(zzdw zzdwVar) throws zzdx {
        throw null;
    }

    protected final ByteBuffer zzj(int i) {
        if (this.zzf.capacity() < i) {
            this.zzf = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.zzf.clear();
        }
        ByteBuffer byteBuffer = this.zzf;
        this.zzg = byteBuffer;
        return byteBuffer;
    }

    protected void zzk() {
    }

    protected void zzl() {
    }

    protected void zzm() {
    }

    protected final boolean zzn() {
        return this.zzg.hasRemaining();
    }
}
