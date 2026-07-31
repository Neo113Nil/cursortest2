package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class zzim extends zzmd implements zzni {
    private static final zzim zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzim zzimVar = new zzim();
        zzb = zzimVar;
        zzmd.zzct(zzim.class, zzimVar);
    }

    private zzim() {
    }

    public static zzif zza() {
        return (zzif) zzb.zzcg();
    }

    public static zzim zzd() {
        return zzb;
    }

    static /* synthetic */ void zze(zzim zzimVar, zzih zzihVar) {
        zzimVar.zzf = zzihVar.zza();
        zzimVar.zzd |= 2;
    }

    static /* synthetic */ void zzh(zzim zzimVar, int i4) {
        zzimVar.zzg = i4 - 1;
        zzimVar.zzd |= 4;
    }

    static /* synthetic */ void zzi(zzim zzimVar, int i4) {
        zzimVar.zze = i4 - 1;
        zzimVar.zzd |= 1;
    }

    public final zzih zzb() {
        zzih zzb2 = zzih.zzb(this.zzf);
        return zzb2 == null ? zzih.CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN : zzb2;
    }

    public final int zzf() {
        int zza = zzij.zza(this.zzg);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzg() {
        int zza = zzil.zza(this.zze);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    protected final Object zzl(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzmd.zzcq(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", zzik.zza, "zzf", zzig.zza, "zzg", zzii.zza});
        }
        if (i5 == 3) {
            return new zzim();
        }
        zzip zzipVar = null;
        if (i5 == 4) {
            return new zzif(zzipVar);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }
}
