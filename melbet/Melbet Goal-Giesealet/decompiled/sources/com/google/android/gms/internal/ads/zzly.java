package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import androidx.core.view.PointerIconCompat;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzly {
    final /* synthetic */ zzlz zza;
    private final int zzb;
    private Object zzc;
    private int zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private long zzi;

    public zzly(zzlz zzlzVar, int i) {
        Objects.requireNonNull(zzlzVar);
        this.zza = zzlzVar;
        this.zzb = i;
    }

    public final void zza() {
        zzlz zzlzVar = this.zza;
        if (zzlzVar.zzw().zzg() != 2 || !zzlzVar.zzw().zzj() || zzlzVar.zzw().zzh() != 0) {
            if (this.zzh) {
                zzlzVar.zzz().zzk(1);
            }
            this.zzh = false;
            return;
        }
        zzbe zzo = zzlzVar.zzw().zzo();
        Object zzf = zzo.zzg() ? null : zzo.zzf(zzlzVar.zzw().zzp());
        zzba zzw = zzlzVar.zzw();
        zzba zzw2 = zzlzVar.zzw();
        zzba zzw3 = zzlzVar.zzw();
        zzba zzw4 = zzlzVar.zzw();
        int zzw5 = zzw.zzw();
        int zzx = zzw2.zzx();
        long zzt = zzw3.zzt();
        long max = Math.max(0L, zzlzVar.zzw().zzu() - Math.max(0L, zzt - zzw4.zzs()));
        if (zzf != null && zzw5 == -1) {
            zzo.zzo(zzf, zzlzVar.zzy());
            zzt -= zzeo.zzp(0L);
            zzw5 = -1;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zzh && Objects.equals(zzf, this.zzc) && zzw5 == this.zzd && zzx == this.zze && zzt == this.zzf && max == this.zzg) {
            if (elapsedRealtime - this.zzi >= this.zzb) {
                ((zzir) zzlzVar.zzx()).zza.zzN(zzhz.zzc(new zzma(1), PointerIconCompat.TYPE_HELP));
                return;
            }
            return;
        }
        this.zzh = true;
        this.zzi = elapsedRealtime;
        this.zzc = zzf;
        this.zzd = zzw5;
        this.zze = zzx;
        this.zzf = zzt;
        this.zzg = max;
        zzlzVar.zzz().zzk(1);
        zzlzVar.zzz().zzi(1, this.zzb);
    }
}
