package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdv {
    private final zzfwu zza;
    private final List zzb = new ArrayList();
    private ByteBuffer[] zzc = new ByteBuffer[0];
    private zzdw zzd = zzdw.zza;
    private zzdw zze = zzdw.zza;
    private boolean zzf = false;

    public zzdv(zzfwu zzfwuVar) {
        this.zza = zzfwuVar;
    }

    private final int zzi() {
        return this.zzc.length - 1;
    }

    private final void zzj(ByteBuffer byteBuffer) {
        boolean z;
        do {
            int i = 0;
            z = false;
            while (i <= zzi()) {
                int i2 = i + 1;
                if (!this.zzc[i].hasRemaining()) {
                    zzdy zzdyVar = (zzdy) this.zzb.get(i);
                    if (!zzdyVar.zzh()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.zzc[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : zzdy.zza;
                        long remaining = byteBuffer2.remaining();
                        zzdyVar.zze(byteBuffer2);
                        this.zzc[i] = zzdyVar.zzb();
                        long remaining2 = remaining - byteBuffer2.remaining();
                        boolean z2 = true;
                        if (remaining2 <= 0 && !this.zzc[i].hasRemaining()) {
                            z2 = false;
                        }
                        z |= z2;
                    } else if (!this.zzc[i].hasRemaining() && i < zzi()) {
                        ((zzdy) this.zzb.get(i2)).zzd();
                    }
                }
                i = i2;
            }
        } while (z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdv)) {
            return false;
        }
        zzdv zzdvVar = (zzdv) obj;
        if (this.zza.size() != zzdvVar.zza.size()) {
            return false;
        }
        for (int i = 0; i < this.zza.size(); i++) {
            if (this.zza.get(i) != zzdvVar.zza.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final zzdw zza(zzdw zzdwVar) throws zzdx {
        if (zzdwVar.equals(zzdw.zza)) {
            throw new zzdx("Unhandled input format:", zzdwVar);
        }
        for (int i = 0; i < this.zza.size(); i++) {
            zzdy zzdyVar = (zzdy) this.zza.get(i);
            zzdw zza = zzdyVar.zza(zzdwVar);
            if (zzdyVar.zzg()) {
                zzef.zzf(!zza.equals(zzdw.zza));
                zzdwVar = zza;
            }
        }
        this.zze = zzdwVar;
        return zzdwVar;
    }

    public final ByteBuffer zzb() {
        if (!zzh()) {
            return zzdy.zza;
        }
        ByteBuffer byteBuffer = this.zzc[zzi()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        zzj(zzdy.zza);
        return this.zzc[zzi()];
    }

    public final void zzc() {
        this.zzb.clear();
        this.zzd = this.zze;
        this.zzf = false;
        for (int i = 0; i < this.zza.size(); i++) {
            zzdy zzdyVar = (zzdy) this.zza.get(i);
            zzdyVar.zzc();
            if (zzdyVar.zzg()) {
                this.zzb.add(zzdyVar);
            }
        }
        this.zzc = new ByteBuffer[this.zzb.size()];
        for (int i2 = 0; i2 <= zzi(); i2++) {
            this.zzc[i2] = ((zzdy) this.zzb.get(i2)).zzb();
        }
    }

    public final void zzd() {
        if (!zzh() || this.zzf) {
            return;
        }
        this.zzf = true;
        ((zzdy) this.zzb.get(0)).zzd();
    }

    public final void zze(ByteBuffer byteBuffer) {
        if (!zzh() || this.zzf) {
            return;
        }
        zzj(byteBuffer);
    }

    public final void zzf() {
        for (int i = 0; i < this.zza.size(); i++) {
            zzdy zzdyVar = (zzdy) this.zza.get(i);
            zzdyVar.zzc();
            zzdyVar.zzf();
        }
        this.zzc = new ByteBuffer[0];
        this.zzd = zzdw.zza;
        this.zze = zzdw.zza;
        this.zzf = false;
    }

    public final boolean zzg() {
        return this.zzf && ((zzdy) this.zzb.get(zzi())).zzh() && !this.zzc[zzi()].hasRemaining();
    }

    public final boolean zzh() {
        return !this.zzb.isEmpty();
    }
}
