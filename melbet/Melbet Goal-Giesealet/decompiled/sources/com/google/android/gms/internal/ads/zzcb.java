package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzcb {
    private final zzgjz zza;
    private final List zzb = new ArrayList();
    private ByteBuffer[] zzc = new ByteBuffer[0];
    private boolean zzd;

    public zzcb(zzgjz zzgjzVar) {
        this.zza = zzgjzVar;
        zzcc zzccVar = zzcc.zza;
        this.zzd = false;
    }

    private final void zzi(ByteBuffer byteBuffer) {
        boolean z;
        do {
            int i = 0;
            z = false;
            while (i <= zzj()) {
                if (!this.zzc[i].hasRemaining()) {
                    List list = this.zzb;
                    zzcf zzcfVar = (zzcf) list.get(i);
                    if (!zzcfVar.zzg()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.zzc[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : zzcf.zza;
                        long remaining = byteBuffer2.remaining();
                        zzcfVar.zzd(byteBuffer2);
                        this.zzc[i] = zzcfVar.zzf();
                        boolean z2 = true;
                        if (remaining - byteBuffer2.remaining() <= 0 && !this.zzc[i].hasRemaining()) {
                            z2 = false;
                        }
                        z |= z2;
                    } else if (!this.zzc[i].hasRemaining() && i < zzj()) {
                        ((zzcf) list.get(i + 1)).zze();
                    }
                }
                i++;
            }
        } while (z);
    }

    private final int zzj() {
        return this.zzc.length - 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzcb)) {
            return false;
        }
        zzgjz zzgjzVar = this.zza;
        int size = zzgjzVar.size();
        zzgjz zzgjzVar2 = ((zzcb) obj).zza;
        if (size != zzgjzVar2.size()) {
            return false;
        }
        for (int i = 0; i < zzgjzVar.size(); i++) {
            if (zzgjzVar.get(i) != zzgjzVar2.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final zzcc zza(zzcc zzccVar) throws zzce {
        if (zzccVar.equals(zzcc.zza)) {
            throw new zzce("Unhandled input format:", zzccVar);
        }
        int i = 0;
        while (true) {
            zzgjz zzgjzVar = this.zza;
            if (i >= zzgjzVar.size()) {
                return zzccVar;
            }
            zzcf zzcfVar = (zzcf) zzgjzVar.get(i);
            zzcc zzb = zzcfVar.zzb(zzccVar);
            if (zzcfVar.zzc()) {
                zzghc.zzh(!zzb.equals(r0));
                zzccVar = zzb;
            }
            i++;
        }
    }

    public final void zzb(zzcd zzcdVar) {
        List list = this.zzb;
        list.clear();
        this.zzd = false;
        long j = zzcdVar.zzb;
        int i = 0;
        while (true) {
            zzgjz zzgjzVar = this.zza;
            if (i >= zzgjzVar.size()) {
                break;
            }
            zzcf zzcfVar = (zzcf) zzgjzVar.get(i);
            zzcfVar.zzi(new zzcd(j));
            if (zzcfVar.zzc()) {
                j = zzcfVar.zza(j);
                zzghc.zzh(j >= 0);
                list.add(zzcfVar);
            }
            i++;
        }
        this.zzc = new ByteBuffer[list.size()];
        for (int i2 = 0; i2 <= zzj(); i2++) {
            this.zzc[i2] = ((zzcf) list.get(i2)).zzf();
        }
    }

    public final boolean zzc() {
        return !this.zzb.isEmpty();
    }

    public final void zzd(ByteBuffer byteBuffer) {
        if (!zzc() || this.zzd) {
            return;
        }
        zzi(byteBuffer);
    }

    public final ByteBuffer zze() {
        if (!zzc()) {
            return zzcf.zza;
        }
        ByteBuffer byteBuffer = this.zzc[zzj()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        zzi(zzcf.zza);
        return this.zzc[zzj()];
    }

    public final void zzf() {
        if (!zzc() || this.zzd) {
            return;
        }
        this.zzd = true;
        ((zzcf) this.zzb.get(0)).zze();
    }

    public final boolean zzg() {
        return this.zzd && ((zzcf) this.zzb.get(zzj())).zzg() && !this.zzc[zzj()].hasRemaining();
    }

    public final void zzh() {
        int i = 0;
        while (true) {
            zzgjz zzgjzVar = this.zza;
            if (i >= zzgjzVar.size()) {
                this.zzc = new ByteBuffer[0];
                zzcc zzccVar = zzcc.zza;
                this.zzd = false;
                return;
            } else {
                zzcf zzcfVar = (zzcf) zzgjzVar.get(i);
                zzcfVar.zzi(zzcd.zza);
                zzcfVar.zzj();
                i++;
            }
        }
    }
}
