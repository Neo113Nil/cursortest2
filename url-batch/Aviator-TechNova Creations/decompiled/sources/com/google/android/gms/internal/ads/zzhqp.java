package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzhqp extends zzibr implements zzidd {
    private static final zzhqp zzc;
    private static volatile zzidk zzd;
    private int zza;
    private zzicd zzb = zzbM();

    static {
        zzhqp zzhqpVar = new zzhqp();
        zzc = zzhqpVar;
        zzibr.zzbu(zzhqp.class, zzhqpVar);
    }

    private zzhqp() {
    }

    public static zzhqm zza() {
        return (zzhqm) zzc.zzbn();
    }

    final /* synthetic */ void zzb(int i) {
        this.zza = i;
    }

    final /* synthetic */ void zzc(zzhqo zzhqoVar) {
        zzhqoVar.getClass();
        zzicd zzicdVar = this.zzb;
        if (!zzicdVar.zza()) {
            this.zzb = zzibr.zzbN(zzicdVar);
        }
        this.zzb.add(zzhqoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zza", "zzb", zzhqo.class});
        }
        if (ordinal == 3) {
            return new zzhqp();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhqm(bArr);
        }
        if (ordinal == 5) {
            return zzc;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar2 = zzd;
        if (zzidkVar2 != null) {
            return zzidkVar2;
        }
        synchronized (zzhqp.class) {
            zzidkVar = zzd;
            if (zzidkVar == null) {
                zzidkVar = new zzibm(zzc);
                zzd = zzidkVar;
            }
        }
        return zzidkVar;
    }
}
