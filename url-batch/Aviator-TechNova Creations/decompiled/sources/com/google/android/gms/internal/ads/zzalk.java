package com.google.android.gms.internal.ads;

import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzalk extends zzalt {
    private zzafh zza;
    private zzalj zzb;

    zzalk() {
    }

    private static boolean zzd(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.google.android.gms.internal.ads.zzalt
    protected final void zza(boolean z) {
        super.zza(z);
        if (z) {
            this.zza = null;
            this.zzb = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalt
    protected final long zzb(zzer zzerVar) {
        if (!zzd(zzerVar.zzi())) {
            return -1L;
        }
        int i = (zzerVar.zzi()[2] & 255) >> 4;
        if (i != 6) {
            if (i == 7) {
                i = 7;
            }
            int zzc = zzafc.zzc(zzerVar, i);
            zzerVar.zzh(0);
            return zzc;
        }
        zzerVar.zzk(4);
        zzerVar.zzO();
        int zzc2 = zzafc.zzc(zzerVar, i);
        zzerVar.zzh(0);
        return zzc2;
    }

    @Override // com.google.android.gms.internal.ads.zzalt
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected final boolean zzc(zzer zzerVar, long j, zzalr zzalrVar) {
        byte[] zzi = zzerVar.zzi();
        zzafh zzafhVar = this.zza;
        if (zzafhVar == null) {
            zzafh zzafhVar2 = new zzafh(zzi, 17);
            this.zza = zzafhVar2;
            zzt zza = zzafhVar2.zzc(Arrays.copyOfRange(zzi, 9, zzerVar.zze()), null).zza();
            zza.zzl("audio/ogg");
            zzalrVar.zza = zza.zzM();
            return true;
        }
        if ((zzi[0] & Byte.MAX_VALUE) == 3) {
            zzafg zzc = zzafe.zzc(zzerVar);
            zzafh zze = zzafhVar.zze(zzc);
            this.zza = zze;
            this.zzb = new zzalj(zze, zzc);
            return true;
        }
        if (!zzd(zzi)) {
            return true;
        }
        zzalj zzaljVar = this.zzb;
        if (zzaljVar != null) {
            zzaljVar.zzd(j);
            zzalrVar.zzb = this.zzb;
        }
        zzalrVar.zza.getClass();
        return false;
    }
}
