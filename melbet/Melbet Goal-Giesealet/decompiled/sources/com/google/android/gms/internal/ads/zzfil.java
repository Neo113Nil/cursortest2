package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzfil extends zzhih implements zzhjt {
    private static final zzfil zzb;
    private static volatile zzhka zzc;
    private zzhit zza = zzbM();

    static {
        zzfil zzfilVar = new zzfil();
        zzb = zzfilVar;
        zzhih.zzbu(zzfil.class, zzfilVar);
    }

    private zzfil() {
    }

    public static zzfii zzb() {
        return (zzfii) zzb.zzbn();
    }

    public final int zza() {
        return this.zza.size();
    }

    final /* synthetic */ void zzc(zzfik zzfikVar) {
        zzfikVar.getClass();
        zzhit zzhitVar = this.zza;
        if (!zzhitVar.zza()) {
            this.zza = zzhih.zzbN(zzhitVar);
        }
        this.zza.add(zzfikVar);
    }

    final /* synthetic */ void zzd() {
        this.zza = zzbM();
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhkaVar;
        int ordinal = zzhigVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", zzfik.class});
        }
        if (ordinal == 3) {
            return new zzfil();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzfii(bArr);
        }
        if (ordinal == 5) {
            return zzb;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzhka zzhkaVar2 = zzc;
        if (zzhkaVar2 != null) {
            return zzhkaVar2;
        }
        synchronized (zzfil.class) {
            zzhkaVar = zzc;
            if (zzhkaVar == null) {
                zzhkaVar = new zzhic(zzb);
                zzc = zzhkaVar;
            }
        }
        return zzhkaVar;
    }
}
