package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzsg extends zzib {
    private long zzg;
    private int zzh;
    private int zzi;

    public zzsg() {
        super(2, 0);
        this.zzi = 32;
    }

    @Override // com.google.android.gms.internal.ads.zzib, com.google.android.gms.internal.ads.zzhv
    public final void zzb() {
        super.zzb();
        this.zzh = 0;
    }

    public final int zzl() {
        return this.zzh;
    }

    public final long zzm() {
        return this.zzg;
    }

    public final void zzn(int i) {
        this.zzi = i;
    }

    public final boolean zzo(zzib zzibVar) {
        ByteBuffer byteBuffer;
        zzef.zzd(!zzibVar.zzd(1073741824));
        zzef.zzd(!zzibVar.zzd(268435456));
        zzef.zzd(!zzibVar.zzd(4));
        if (zzp()) {
            if (this.zzh >= this.zzi) {
                return false;
            }
            ByteBuffer byteBuffer2 = zzibVar.zzc;
            if (byteBuffer2 != null && (byteBuffer = this.zzc) != null && byteBuffer.position() + byteBuffer2.remaining() > 3072000) {
                return false;
            }
        }
        int i = this.zzh;
        this.zzh = i + 1;
        if (i == 0) {
            this.zze = zzibVar.zze;
            if (zzibVar.zzd(1)) {
                zzc(1);
            }
        }
        ByteBuffer byteBuffer3 = zzibVar.zzc;
        if (byteBuffer3 != null) {
            zzi(byteBuffer3.remaining());
            this.zzc.put(byteBuffer3);
        }
        this.zzg = zzibVar.zze;
        return true;
    }

    public final boolean zzp() {
        return this.zzh > 0;
    }
}
