package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzaez implements zzach {
    private final long zzb;
    private final zzach zzc;

    public zzaez(long j, zzach zzachVar) {
        this.zzb = j;
        this.zzc = zzachVar;
    }

    @Override // com.google.android.gms.internal.ads.zzach
    public final void zzD() {
        this.zzc.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzach
    public final void zzO(zzade zzadeVar) {
        this.zzc.zzO(new zzaey(this, zzadeVar, zzadeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzach
    public final zzadk zzw(int i, int i2) {
        return this.zzc.zzw(i, i2);
    }
}
