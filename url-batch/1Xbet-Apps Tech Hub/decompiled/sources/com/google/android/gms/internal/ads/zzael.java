package com.google.android.gms.internal.ads;

import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzael extends zzaeq {
    private static final int[] zzb = {5512, 11025, 22050, 44100};
    private boolean zzc;
    private boolean zzd;
    private int zze;

    public zzael(zzadk zzadkVar) {
        super(zzadkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaeq
    protected final boolean zza(zzfj zzfjVar) throws zzaep {
        if (this.zzc) {
            zzfjVar.zzH(1);
        } else {
            int zzl = zzfjVar.zzl();
            int i = zzl >> 4;
            this.zze = i;
            if (i == 2) {
                int i2 = zzb[(zzl >> 2) & 3];
                zzak zzakVar = new zzak();
                zzakVar.zzU("audio/mpeg");
                zzakVar.zzy(1);
                zzakVar.zzV(i2);
                this.zza.zzl(zzakVar.zzac());
                this.zzd = true;
            } else if (i == 7 || i == 8) {
                zzak zzakVar2 = new zzak();
                zzakVar2.zzU(i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw");
                zzakVar2.zzy(1);
                zzakVar2.zzV(8000);
                this.zza.zzl(zzakVar2.zzac());
                this.zzd = true;
            } else if (i != 10) {
                throw new zzaep("Audio format not supported: " + i);
            }
            this.zzc = true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaeq
    protected final boolean zzb(zzfj zzfjVar, long j) throws zzcf {
        if (this.zze == 2) {
            int zza = zzfjVar.zza();
            this.zza.zzr(zzfjVar, zza);
            this.zza.zzt(j, 1, zza, 0, null);
            return true;
        }
        int zzl = zzfjVar.zzl();
        if (zzl != 0 || this.zzd) {
            if (this.zze == 10 && zzl != 1) {
                return false;
            }
            int zza2 = zzfjVar.zza();
            this.zza.zzr(zzfjVar, zza2);
            this.zza.zzt(j, 1, zza2, 0, null);
            return true;
        }
        int zza3 = zzfjVar.zza();
        byte[] bArr = new byte[zza3];
        zzfjVar.zzC(bArr, 0, zza3);
        zzabb zza4 = zzabc.zza(bArr);
        zzak zzakVar = new zzak();
        zzakVar.zzU("audio/mp4a-latm");
        zzakVar.zzz(zza4.zzc);
        zzakVar.zzy(zza4.zzb);
        zzakVar.zzV(zza4.zza);
        zzakVar.zzK(Collections.singletonList(bArr));
        this.zza.zzl(zzakVar.zzac());
        this.zzd = true;
        return false;
    }
}
