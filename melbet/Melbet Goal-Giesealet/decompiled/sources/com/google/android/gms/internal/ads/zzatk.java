package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzatk extends zzhih implements zzhjt {
    private static final zzatk zzf;
    private static volatile zzhka zzg;
    private int zza;
    private zzhit zzb = zzbM();
    private zzhhb zzc = zzhhb.zzb;
    private int zzd = 1;
    private int zze = 1;

    static {
        zzatk zzatkVar = new zzatk();
        zzf = zzatkVar;
        zzhih.zzbu(zzatk.class, zzatkVar);
    }

    private zzatk() {
    }

    public static zzatj zza() {
        return (zzatj) zzf.zzbn();
    }

    final /* synthetic */ void zzb(zzhhb zzhhbVar) {
        zzhit zzhitVar = this.zzb;
        if (!zzhitVar.zza()) {
            this.zzb = zzhih.zzbN(zzhitVar);
        }
        this.zzb.add(zzhhbVar);
    }

    final /* synthetic */ void zzc(zzhhb zzhhbVar) {
        this.zza |= 1;
        this.zzc = zzhhbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhkaVar;
        int ordinal = zzhigVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"zza", "zzb", "zzc", "zzd", zzate.zza, "zze", zzata.zza});
        }
        if (ordinal == 3) {
            return new zzatk();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzatj(bArr);
        }
        if (ordinal == 5) {
            return zzf;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzhka zzhkaVar2 = zzg;
        if (zzhkaVar2 != null) {
            return zzhkaVar2;
        }
        synchronized (zzatk.class) {
            zzhkaVar = zzg;
            if (zzhkaVar == null) {
                zzhkaVar = new zzhic(zzf);
                zzg = zzhkaVar;
            }
        }
        return zzhkaVar;
    }

    final /* synthetic */ void zze(int i) {
        this.zzd = 4;
        this.zza |= 2;
    }

    final /* synthetic */ void zzg(int i) {
        this.zze = i - 1;
        this.zza |= 4;
    }
}
