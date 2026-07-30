package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzagu implements zzagq {
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzagu(int i, int i2, int i3, int i4) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
    }

    public static zzagu zzb(zzer zzerVar) {
        int zzC = zzerVar.zzC();
        zzerVar.zzk(8);
        int zzC2 = zzerVar.zzC();
        int zzC3 = zzerVar.zzC();
        zzerVar.zzk(4);
        int zzC4 = zzerVar.zzC();
        zzerVar.zzk(12);
        return new zzagu(zzC, zzC2, zzC3, zzC4);
    }

    @Override // com.google.android.gms.internal.ads.zzagq
    public final int zza() {
        return 1751742049;
    }
}
