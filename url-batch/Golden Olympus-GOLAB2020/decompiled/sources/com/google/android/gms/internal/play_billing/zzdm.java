package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class zzdm extends zzfu implements zzhc {
    private static final zzdm zzb;
    private int zzd = 0;
    private Object zze;

    static {
        zzdm zzdmVar = new zzdm();
        zzb = zzdmVar;
        zzfu.zzB(zzdm.class, zzdmVar);
    }

    private zzdm() {
    }

    public static zzdm zzb(byte[] bArr) {
        return (zzdm) zzfu.zzt(zzb, bArr);
    }

    public final zzdp zzc() {
        return this.zzd == 2 ? (zzdp) this.zze : zzdp.zzb();
    }

    @Override // com.google.android.gms.internal.play_billing.zzfu
    protected final Object zzd(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzfu.zzy(zzb, "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001;\u0000\u0002<\u0000", new Object[]{"zze", "zzd", zzdp.class});
        }
        if (i5 == 3) {
            return new zzdm();
        }
        zzdl zzdlVar = null;
        if (i5 == 4) {
            return new zzdk(zzdlVar);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }
}
