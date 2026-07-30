package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.objectweb.asm.Opcodes;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzapr implements zzaef {
    private final zzfg zza;
    private final zzer zzb = new zzer();
    private final int zzc;

    public zzapr(int i, zzfg zzfgVar, int i2) {
        this.zzc = i;
        this.zza = zzfgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final zzaee zza(zzaev zzaevVar, long j) throws IOException {
        int zza;
        int zza2;
        long zzn = zzaevVar.zzn();
        int min = (int) Math.min(112800L, zzaevVar.zzo() - zzn);
        zzer zzerVar = this.zzb;
        zzerVar.zza(min);
        zzaevVar.zzi(zzerVar.zzi(), 0, min);
        int zze = zzerVar.zze();
        long j2 = -1;
        long j3 = -9223372036854775807L;
        long j4 = -1;
        while (zzerVar.zzd() >= 188 && (zza2 = (zza = zzaqd.zza(zzerVar.zzi(), zzerVar.zzg(), zze)) + Opcodes.NEWARRAY) <= zze) {
            long zzb = zzaqd.zzb(zzerVar, zza, this.zzc);
            if (zzb != -9223372036854775807L) {
                long zze2 = this.zza.zze(zzb);
                if (zze2 > j) {
                    return j3 == -9223372036854775807L ? zzaee.zza(zze2, zzn) : zzaee.zzc(zzn + j4);
                }
                j4 = zza;
                if (100000 + zze2 > j) {
                    return zzaee.zzc(zzn + j4);
                }
                j3 = zze2;
            }
            zzerVar.zzh(zza2);
            j2 = zza2;
        }
        return j3 != -9223372036854775807L ? zzaee.zzb(j3, zzn + j2) : zzaee.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final void zzb() {
        byte[] bArr = zzfj.zzb;
        int length = bArr.length;
        this.zzb.zzb(bArr, 0);
    }
}
