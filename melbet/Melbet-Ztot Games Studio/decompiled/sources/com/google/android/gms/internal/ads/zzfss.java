package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
final class zzfss extends zzftl {
    private int zza;
    private String zzb;
    private byte zzc;

    zzfss() {
    }

    @Override // com.google.android.gms.internal.ads.zzftl
    public final zzftl zza(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzftl
    public final zzftl zzb(int i) {
        this.zza = i;
        this.zzc = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzftl
    public final zzftm zzc() {
        if (this.zzc == 1) {
            return new zzfsu(this.zza, this.zzb, null);
        }
        throw new IllegalStateException("Missing required properties: statusCode");
    }
}
