package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzyn {
    private int zza;
    private int zzb;
    private int zzc = 0;
    private zzyg[] zzd = new zzyg[100];

    public zzyn(boolean z, int i) {
    }

    public final synchronized int zza() {
        return this.zzb * 65536;
    }

    public final synchronized zzyg zzb() {
        zzyg zzygVar;
        this.zzb++;
        int i = this.zzc;
        if (i > 0) {
            zzyg[] zzygVarArr = this.zzd;
            int i2 = i - 1;
            this.zzc = i2;
            zzygVar = zzygVarArr[i2];
            zzygVar.getClass();
            zzygVarArr[i2] = null;
        } else {
            zzygVar = new zzyg(new byte[65536], 0);
            int i3 = this.zzb;
            zzyg[] zzygVarArr2 = this.zzd;
            int length = zzygVarArr2.length;
            if (i3 > length) {
                this.zzd = (zzyg[]) Arrays.copyOf(zzygVarArr2, length + length);
                return zzygVar;
            }
        }
        return zzygVar;
    }

    public final synchronized void zzc(zzyg zzygVar) {
        zzyg[] zzygVarArr = this.zzd;
        int i = this.zzc;
        this.zzc = i + 1;
        zzygVarArr[i] = zzygVar;
        this.zzb--;
        notifyAll();
    }

    public final synchronized void zzd(zzyh zzyhVar) {
        while (zzyhVar != null) {
            zzyg[] zzygVarArr = this.zzd;
            int i = this.zzc;
            this.zzc = i + 1;
            zzygVarArr[i] = zzyhVar.zzc();
            this.zzb--;
            zzyhVar = zzyhVar.zzd();
        }
        notifyAll();
    }

    public final synchronized void zze() {
        zzf(0);
    }

    public final synchronized void zzf(int i) {
        int i2 = this.zza;
        this.zza = i;
        if (i < i2) {
            zzg();
        }
    }

    public final synchronized void zzg() {
        int i = this.zza;
        int i2 = zzfs.zza;
        int max = Math.max(0, ((i + 65535) / 65536) - this.zzb);
        int i3 = this.zzc;
        if (max >= i3) {
            return;
        }
        Arrays.fill(this.zzd, max, i3, (Object) null);
        this.zzc = max;
    }
}
