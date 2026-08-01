package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzqa extends zzdz {
    private int[] zzd;
    private int[] zze;

    zzqa() {
    }

    @Override // com.google.android.gms.internal.ads.zzdy
    public final void zze(ByteBuffer byteBuffer) {
        int[] iArr = this.zze;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer zzj = zzj(((limit - position) / this.zzb.zze) * this.zzc.zze);
        while (position < limit) {
            for (int i : iArr) {
                zzj.putShort(byteBuffer.getShort(i + i + position));
            }
            position += this.zzb.zze;
        }
        byteBuffer.position(limit);
        zzj.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public final zzdw zzi(zzdw zzdwVar) throws zzdx {
        int[] iArr = this.zzd;
        if (iArr == null) {
            return zzdw.zza;
        }
        if (zzdwVar.zzd != 2) {
            throw new zzdx("Unhandled input format:", zzdwVar);
        }
        boolean z = zzdwVar.zzc != iArr.length;
        int i = 0;
        while (true) {
            int length = iArr.length;
            if (i >= length) {
                return z ? new zzdw(zzdwVar.zzb, length, 2) : zzdw.zza;
            }
            int i2 = iArr[i];
            if (i2 >= zzdwVar.zzc) {
                throw new zzdx("Unhandled input format:", zzdwVar);
            }
            z |= i2 != i;
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    protected final void zzk() {
        this.zze = this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    protected final void zzm() {
        this.zze = null;
        this.zzd = null;
    }

    public final void zzo(int[] iArr) {
        this.zzd = iArr;
    }
}
