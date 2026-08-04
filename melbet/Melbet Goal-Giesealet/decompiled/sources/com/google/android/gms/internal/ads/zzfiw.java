package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzfiw extends zzhih implements zzhjt {
    private static final zzfiw zzc;
    private static volatile zzhka zzd;
    private zzhit zza = zzbM();
    private long zzb;

    static {
        zzfiw zzfiwVar = new zzfiw();
        zzc = zzfiwVar;
        zzhih.zzbu(zzfiw.class, zzfiwVar);
    }

    private zzfiw() {
    }

    public static zzfiv zza() {
        return (zzfiv) zzc.zzbn();
    }

    final /* synthetic */ void zzb(zzfhq zzfhqVar) {
        zzfhqVar.getClass();
        zzhit zzhitVar = this.zza;
        if (!zzhitVar.zza()) {
            this.zza = zzhih.zzbN(zzhitVar);
        }
        this.zza.add(zzfhqVar);
    }

    final /* synthetic */ void zzc(long j) {
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhkaVar;
        int ordinal = zzhigVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzc, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0002", new Object[]{"zza", zzfhq.class, "zzb"});
        }
        if (ordinal == 3) {
            return new zzfiw();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzfiv(bArr);
        }
        if (ordinal == 5) {
            return zzc;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzhka zzhkaVar2 = zzd;
        if (zzhkaVar2 != null) {
            return zzhkaVar2;
        }
        synchronized (zzfiw.class) {
            zzhkaVar = zzd;
            if (zzhkaVar == null) {
                zzhkaVar = new zzhic(zzc);
                zzd = zzhkaVar;
            }
        }
        return zzhkaVar;
    }
}
