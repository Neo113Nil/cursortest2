package com.google.android.gms.internal.ads;

import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzaja extends zzajj {
    private zzadh zza;
    private zzaiz zzb;

    zzaja() {
    }

    private static boolean zzd(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    protected final void zza(boolean z) {
        super.zza(z);
        if (z) {
            this.zza = null;
            this.zzb = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    protected final long zzb(zzef zzefVar) {
        if (!zzd(zzefVar.zzi())) {
            return -1L;
        }
        int i = (zzefVar.zzi()[2] & 255) >> 4;
        if (i != 6) {
            if (i == 7) {
                i = 7;
            }
            int zzc = zzadc.zzc(zzefVar, i);
            zzefVar.zzh(0);
            return zzc;
        }
        zzefVar.zzk(4);
        zzefVar.zzO();
        int zzc2 = zzadc.zzc(zzefVar, i);
        zzefVar.zzh(0);
        return zzc2;
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected final boolean zzc(zzef zzefVar, long j, zzajh zzajhVar) {
        byte[] zzi = zzefVar.zzi();
        zzadh zzadhVar = this.zza;
        if (zzadhVar == null) {
            zzadh zzadhVar2 = new zzadh(zzi, 17);
            this.zza = zzadhVar2;
            zzs zza = zzadhVar2.zzc(Arrays.copyOfRange(zzi, 9, zzefVar.zze()), null).zza();
            zza.zzl("audio/ogg");
            zzajhVar.zza = zza.zzM();
            return true;
        }
        if ((zzi[0] & Byte.MAX_VALUE) == 3) {
            zzadg zzc = zzade.zzc(zzefVar);
            zzadh zze = zzadhVar.zze(zzc);
            this.zza = zze;
            this.zzb = new zzaiz(zze, zzc);
            return true;
        }
        if (!zzd(zzi)) {
            return true;
        }
        zzaiz zzaizVar = this.zzb;
        if (zzaizVar != null) {
            zzaizVar.zzd(j);
            zzajhVar.zzb = this.zzb;
        }
        zzajhVar.zza.getClass();
        return false;
    }
}
