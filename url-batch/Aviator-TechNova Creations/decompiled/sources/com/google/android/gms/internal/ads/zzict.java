package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* loaded from: classes3.dex */
final class zzict implements zzidv {
    private static final zzida zzb = new zzicr();
    private final zzida zza;

    public zzict() {
        zzida zzidaVar = zzb;
        int i = zziaa.zza;
        zzics zzicsVar = new zzics(zzibk.zza(), zzidaVar);
        byte[] bArr = zzice.zzb;
        this.zza = zzicsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzidv
    public final zzidu zza(Class cls) {
        int i = zzidw.zza;
        if (!zzibr.class.isAssignableFrom(cls)) {
            int i2 = zziaa.zza;
        }
        zzicz zzc = this.zza.zzc(cls);
        if (zzc.zza()) {
            int i3 = zziaa.zza;
            return zzidg.zzh(zzidw.zzF(), zzibe.zza(), zzc.zzb());
        }
        int i4 = zziaa.zza;
        return zzidf.zzm(cls, zzc, zzidj.zza(), zzicp.zza(), zzidw.zzF(), zzc.zzc() + (-1) != 1 ? zzibe.zza() : null, zzicy.zza());
    }
}
