package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzajd extends zzajh {
    private static final byte[] zza = {79, 112, 117, 115, 72, 101, 97, 100};
    private static final byte[] zzb = {79, 112, 117, 115, 84, 97, 103, 115};
    private boolean zzc;

    zzajd() {
    }

    public static boolean zzd(zzfj zzfjVar) {
        return zzk(zzfjVar, zza);
    }

    private static boolean zzk(zzfj zzfjVar, byte[] bArr) {
        if (zzfjVar.zza() < 8) {
            return false;
        }
        int zzc = zzfjVar.zzc();
        byte[] bArr2 = new byte[8];
        zzfjVar.zzC(bArr2, 0, 8);
        zzfjVar.zzG(zzc);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzajh
    protected final long zza(zzfj zzfjVar) {
        return zzg(zzada.zzd(zzfjVar.zzI()));
    }

    @Override // com.google.android.gms.internal.ads.zzajh
    protected final void zzb(boolean z) {
        super.zzb(z);
        if (z) {
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajh
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected final boolean zzc(zzfj zzfjVar, long j, zzaje zzajeVar) throws zzcf {
        if (zzk(zzfjVar, zza)) {
            byte[] copyOf = Arrays.copyOf(zzfjVar.zzI(), zzfjVar.zzd());
            int i = copyOf[9] & 255;
            List zze = zzada.zze(copyOf);
            if (zzajeVar.zza == null) {
                zzak zzakVar = new zzak();
                zzakVar.zzU("audio/opus");
                zzakVar.zzy(i);
                zzakVar.zzV(48000);
                zzakVar.zzK(zze);
                zzajeVar.zza = zzakVar.zzac();
                return true;
            }
        } else {
            if (!zzk(zzfjVar, zzb)) {
                zzef.zzb(zzajeVar.zza);
                return false;
            }
            zzef.zzb(zzajeVar.zza);
            if (!this.zzc) {
                this.zzc = true;
                zzfjVar.zzH(8);
                zzcb zzb2 = zzadq.zzb(zzfwu.zzk(zzadq.zzc(zzfjVar, false, false).zzb));
                if (zzb2 != null) {
                    zzak zzb3 = zzajeVar.zza.zzb();
                    zzb3.zzO(zzb2.zzd(zzajeVar.zza.zzk));
                    zzajeVar.zza = zzb3.zzac();
                }
            }
        }
        return true;
    }
}
