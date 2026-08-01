package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Date;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzaop extends zzhcy {
    private Date zza;
    private Date zzh;
    private long zzi;
    private long zzj;
    private double zzk;
    private float zzl;
    private zzhdi zzm;
    private long zzn;

    public zzaop() {
        super("mvhd");
        this.zzk = 1.0d;
        this.zzl = 1.0f;
        this.zzm = zzhdi.zza;
    }

    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.zza + ";modificationTime=" + this.zzh + ";timescale=" + this.zzi + ";duration=" + this.zzj + ";rate=" + this.zzk + ";volume=" + this.zzl + ";matrix=" + this.zzm + ";nextTrackId=" + this.zzn + "]";
    }

    public final long zzd() {
        return this.zzj;
    }

    public final long zze() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzhcw
    public final void zzf(ByteBuffer byteBuffer) {
        zzi(byteBuffer);
        if (zzh() == 1) {
            this.zza = zzhdd.zza(zzaol.zzf(byteBuffer));
            this.zzh = zzhdd.zza(zzaol.zzf(byteBuffer));
            this.zzi = zzaol.zze(byteBuffer);
            this.zzj = zzaol.zzf(byteBuffer);
        } else {
            this.zza = zzhdd.zza(zzaol.zze(byteBuffer));
            this.zzh = zzhdd.zza(zzaol.zze(byteBuffer));
            this.zzi = zzaol.zze(byteBuffer);
            this.zzj = zzaol.zze(byteBuffer);
        }
        this.zzk = zzaol.zzb(byteBuffer);
        byteBuffer.get(new byte[2]);
        this.zzl = ((short) ((r1[1] & 255) | ((short) (65280 & (r1[0] << 8))))) / 256.0f;
        zzaol.zzd(byteBuffer);
        zzaol.zze(byteBuffer);
        zzaol.zze(byteBuffer);
        this.zzm = new zzhdi(zzaol.zzb(byteBuffer), zzaol.zzb(byteBuffer), zzaol.zzb(byteBuffer), zzaol.zzb(byteBuffer), zzaol.zza(byteBuffer), zzaol.zza(byteBuffer), zzaol.zza(byteBuffer), zzaol.zzb(byteBuffer), zzaol.zzb(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.zzn = zzaol.zze(byteBuffer);
    }
}
