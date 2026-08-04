package com.google.android.gms.internal.ads;

import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzafb extends zzafg {
    private static final int[] zzb = {5512, 11025, 22050, 44100};
    private boolean zzc;
    private boolean zzd;
    private int zze;

    public zzafb(zzaeb zzaebVar) {
        super(zzaebVar);
    }

    @Override // com.google.android.gms.internal.ads.zzafg
    protected final boolean zza(zzef zzefVar) throws zzaff {
        if (this.zzc) {
            zzefVar.zzk(1);
        } else {
            int zzs = zzefVar.zzs();
            int i = zzs >> 4;
            this.zze = i;
            if (i == 2) {
                int i2 = zzb[(zzs >> 2) & 3];
                zzs zzsVar = new zzs();
                zzsVar.zzl("video/x-flv");
                zzsVar.zzm("audio/mpeg");
                zzsVar.zzE(1);
                zzsVar.zzF(i2);
                this.zza.zzu(zzsVar.zzM());
                this.zzd = true;
            } else if (i == 7 || i == 8) {
                zzs zzsVar2 = new zzs();
                zzsVar2.zzl("video/x-flv");
                zzsVar2.zzm(i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw");
                zzsVar2.zzE(1);
                zzsVar2.zzF(8000);
                this.zza.zzu(zzsVar2.zzM());
                this.zzd = true;
            } else if (i != 10) {
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 28);
                sb.append("Audio format not supported: ");
                sb.append(i);
                throw new zzaff(sb.toString());
            }
            this.zzc = true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafg
    protected final boolean zzb(zzef zzefVar, long j) throws zzas {
        if (this.zze == 2) {
            int zzd = zzefVar.zzd();
            zzaeb zzaebVar = this.zza;
            zzaebVar.zzz(zzefVar, zzd);
            zzaebVar.zzx(j, 1, zzd, 0, null);
            return true;
        }
        int zzs = zzefVar.zzs();
        if (zzs != 0 || this.zzd) {
            if (this.zze == 10 && zzs != 1) {
                return false;
            }
            int zzd2 = zzefVar.zzd();
            zzaeb zzaebVar2 = this.zza;
            zzaebVar2.zzz(zzefVar, zzd2);
            zzaebVar2.zzx(j, 1, zzd2, 0, null);
            return true;
        }
        int zzd3 = zzefVar.zzd();
        byte[] bArr = new byte[zzd3];
        zzefVar.zzm(bArr, 0, zzd3);
        zzabs zza = zzabt.zza(bArr);
        zzs zzsVar = new zzs();
        zzsVar.zzl("video/x-flv");
        zzsVar.zzm("audio/mp4a-latm");
        zzsVar.zzj(zza.zzc);
        zzsVar.zzE(zza.zzb);
        zzsVar.zzF(zza.zza);
        zzsVar.zzp(Collections.singletonList(bArr));
        this.zza.zzu(zzsVar.zzM());
        this.zzd = true;
        return false;
    }
}
