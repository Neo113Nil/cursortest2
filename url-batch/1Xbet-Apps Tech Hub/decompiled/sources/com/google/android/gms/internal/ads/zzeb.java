package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzeb implements zzdy {
    private int zzb;
    private float zzc = 1.0f;
    private float zzd = 1.0f;
    private zzdw zze = zzdw.zza;
    private zzdw zzf;
    private zzdw zzg;
    private zzdw zzh;
    private boolean zzi;
    private zzea zzj;
    private ByteBuffer zzk;
    private ShortBuffer zzl;
    private ByteBuffer zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;

    public zzeb() {
        zzdw zzdwVar = zzdw.zza;
        this.zzf = zzdwVar;
        this.zzg = zzdwVar;
        this.zzh = zzdwVar;
        ByteBuffer byteBuffer = zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = zza;
        this.zzb = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzdy
    public final zzdw zza(zzdw zzdwVar) throws zzdx {
        if (zzdwVar.zzd != 2) {
            throw new zzdx("Unhandled input format:", zzdwVar);
        }
        int i = this.zzb;
        if (i == -1) {
            i = zzdwVar.zzb;
        }
        this.zze = zzdwVar;
        zzdw zzdwVar2 = new zzdw(i, zzdwVar.zzc, 2);
        this.zzf = zzdwVar2;
        this.zzi = true;
        return zzdwVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzdy
    public final ByteBuffer zzb() {
        int zza;
        zzea zzeaVar = this.zzj;
        if (zzeaVar != null && (zza = zzeaVar.zza()) > 0) {
            if (this.zzk.capacity() < zza) {
                ByteBuffer order = ByteBuffer.allocateDirect(zza).order(ByteOrder.nativeOrder());
                this.zzk = order;
                this.zzl = order.asShortBuffer();
            } else {
                this.zzk.clear();
                this.zzl.clear();
            }
            zzeaVar.zzd(this.zzl);
            this.zzo += zza;
            this.zzk.limit(zza);
            this.zzm = this.zzk;
        }
        ByteBuffer byteBuffer = this.zzm;
        this.zzm = zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzdy
    public final void zzc() {
        if (zzg()) {
            this.zzg = this.zze;
            this.zzh = this.zzf;
            if (this.zzi) {
                zzdw zzdwVar = this.zzg;
                this.zzj = new zzea(zzdwVar.zzb, zzdwVar.zzc, this.zzc, this.zzd, this.zzh.zzb);
            } else {
                zzea zzeaVar = this.zzj;
                if (zzeaVar != null) {
                    zzeaVar.zzc();
                }
            }
        }
        this.zzm = zza;
        this.zzn = 0L;
        this.zzo = 0L;
        this.zzp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzdy
    public final void zzd() {
        zzea zzeaVar = this.zzj;
        if (zzeaVar != null) {
            zzeaVar.zze();
        }
        this.zzp = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdy
    public final void zze(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            zzea zzeaVar = this.zzj;
            zzeaVar.getClass();
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.zzn += remaining;
            zzeaVar.zzf(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdy
    public final void zzf() {
        this.zzc = 1.0f;
        this.zzd = 1.0f;
        this.zze = zzdw.zza;
        zzdw zzdwVar = zzdw.zza;
        this.zzf = zzdwVar;
        this.zzg = zzdwVar;
        this.zzh = zzdwVar;
        ByteBuffer byteBuffer = zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = zza;
        this.zzb = -1;
        this.zzi = false;
        this.zzj = null;
        this.zzn = 0L;
        this.zzo = 0L;
        this.zzp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzdy
    public final boolean zzg() {
        if (this.zzf.zzb == -1) {
            return false;
        }
        if (Math.abs(this.zzc - 1.0f) >= 1.0E-4f || Math.abs(this.zzd - 1.0f) >= 1.0E-4f) {
            return true;
        }
        return this.zzf.zzb != this.zze.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdy
    public final boolean zzh() {
        if (!this.zzp) {
            return false;
        }
        zzea zzeaVar = this.zzj;
        return zzeaVar == null || zzeaVar.zza() == 0;
    }

    public final long zzi(long j) {
        long j2 = this.zzo;
        if (j2 < 1024) {
            return (long) (this.zzc * j);
        }
        long j3 = this.zzn;
        this.zzj.getClass();
        long zzb = j3 - r3.zzb();
        int i = this.zzh.zzb;
        int i2 = this.zzg.zzb;
        return i == i2 ? zzfs.zzs(j, zzb, j2, RoundingMode.FLOOR) : zzfs.zzs(j, zzb * i, j2 * i2, RoundingMode.FLOOR);
    }

    public final void zzj(float f) {
        if (this.zzd != f) {
            this.zzd = f;
            this.zzi = true;
        }
    }

    public final void zzk(float f) {
        if (this.zzc != f) {
            this.zzc = f;
            this.zzi = true;
        }
    }
}
