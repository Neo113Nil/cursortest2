package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgrh extends zzgwm implements zzgxx {
    private static final zzgrh zzb;
    private int zzd;
    private int zze;

    static {
        zzgrh zzgrhVar = new zzgrh();
        zzb = zzgrhVar;
        zzgwm.zzaU(zzgrh.class, zzgrhVar);
    }

    private zzgrh() {
    }

    public static zzgrg zzd() {
        return (zzgrg) zzb.zzaA();
    }

    public static zzgrh zzf() {
        return zzb;
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new zzgrh();
        }
        zzgrf zzgrfVar = null;
        if (i2 == 4) {
            return new zzgrg(zzgrfVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgqy zzc() {
        int i = this.zzd;
        zzgqy zzgqyVar = zzgqy.UNKNOWN_HASH;
        zzgqy zzgqyVar2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? null : zzgqy.SHA224 : zzgqy.SHA512 : zzgqy.SHA256 : zzgqy.SHA384 : zzgqy.SHA1 : zzgqy.UNKNOWN_HASH;
        return zzgqyVar2 == null ? zzgqy.UNRECOGNIZED : zzgqyVar2;
    }
}
