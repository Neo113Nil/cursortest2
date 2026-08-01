package com.google.android.gms.internal.ads;

import com.bytedance.sdk.openadsdk.api.PAGErrorCode;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzip implements zzkw {
    private final zzyn zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long zzf;
    private final long zzg;
    private int zzh;
    private boolean zzi;

    public zzip() {
        zzyn zzynVar = new zzyn(true, 65536);
        zzj(2500, 0, "bufferForPlaybackMs", "0");
        zzj(PAGErrorCode.LOAD_FACTORY_NULL_CODE, 0, "bufferForPlaybackAfterRebufferMs", "0");
        zzj(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        zzj(50000, PAGErrorCode.LOAD_FACTORY_NULL_CODE, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        zzj(50000, 50000, "maxBufferMs", "minBufferMs");
        zzj(0, 0, "backBufferDurationMs", "0");
        this.zzb = zzynVar;
        this.zzc = zzfs.zzq(50000L);
        this.zzd = zzfs.zzq(50000L);
        this.zze = zzfs.zzq(2500L);
        this.zzf = zzfs.zzq(5000L);
        this.zzh = 13107200;
        this.zzg = zzfs.zzq(0L);
    }

    private static void zzj(int i, int i2, String str, String str2) {
        zzef.zze(i >= i2, str + " cannot be less than " + str2);
    }

    private final void zzk(boolean z) {
        this.zzh = 13107200;
        this.zzi = false;
        if (z) {
            this.zzb.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkw
    public final long zza() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzkw
    public final void zzb() {
        zzk(false);
    }

    @Override // com.google.android.gms.internal.ads.zzkw
    public final void zzc() {
        zzk(true);
    }

    @Override // com.google.android.gms.internal.ads.zzkw
    public final void zzd() {
        zzk(true);
    }

    @Override // com.google.android.gms.internal.ads.zzkw
    public final void zze(zzda zzdaVar, zzuk zzukVar, zzlz[] zzlzVarArr, zzwl zzwlVar, zzxy[] zzxyVarArr) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int length = zzlzVarArr.length;
            if (i >= 2) {
                int max = Math.max(13107200, i2);
                this.zzh = max;
                this.zzb.zzf(max);
                return;
            } else {
                if (zzxyVarArr[i] != null) {
                    i2 += zzlzVarArr[i].zzb() != 1 ? 131072000 : 13107200;
                }
                i++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkw
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzkw
    public final boolean zzg(long j, long j2, float f) {
        int zza = this.zzb.zza();
        int i = this.zzh;
        long j3 = this.zzc;
        if (f > 1.0f) {
            j3 = Math.min(zzfs.zzo(j3, f), this.zzd);
        }
        if (j2 < Math.max(j3, 500000L)) {
            boolean z = zza < i;
            this.zzi = z;
            if (!z && j2 < 500000) {
                zzez.zzf("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= this.zzd || zza >= i) {
            this.zzi = false;
        }
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzkw
    public final boolean zzh(zzda zzdaVar, zzuk zzukVar, long j, float f, boolean z, long j2) {
        long zzp = zzfs.zzp(j, f);
        long j3 = z ? this.zzf : this.zze;
        if (j2 != -9223372036854775807L) {
            j3 = Math.min(j2 / 2, j3);
        }
        return j3 <= 0 || zzp >= j3 || this.zzb.zza() >= this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzkw
    public final zzyn zzi() {
        return this.zzb;
    }
}
