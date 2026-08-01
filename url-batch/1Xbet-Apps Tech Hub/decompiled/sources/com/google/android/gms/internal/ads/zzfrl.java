package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzfrl extends zzfse {
    private int zza;
    private String zzb;
    private byte zzc;

    zzfrl() {
    }

    @Override // com.google.android.gms.internal.ads.zzfse
    public final zzfse zza(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfse
    public final zzfse zzb(int i) {
        this.zza = i;
        this.zzc = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfse
    public final zzfsf zzc() {
        if (this.zzc == 1) {
            return new zzfrn(this.zza, this.zzb, null);
        }
        throw new IllegalStateException("Missing required properties: statusCode");
    }
}
