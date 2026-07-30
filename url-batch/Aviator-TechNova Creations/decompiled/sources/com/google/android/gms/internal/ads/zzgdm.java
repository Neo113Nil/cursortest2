package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzgdm extends zzibr implements zzidd {
    private static final zzgdm zzd;
    private static volatile zzidk zze;
    private int zza;
    private zzicd zzb = zzbM();
    private zzifd zzc;

    static {
        zzgdm zzgdmVar = new zzgdm();
        zzd = zzgdmVar;
        zzibr.zzbu(zzgdm.class, zzgdmVar);
    }

    private zzgdm() {
    }

    public static zzgdl zza() {
        return (zzgdl) zzd.zzbn();
    }

    final /* synthetic */ void zzb(zzgdk zzgdkVar) {
        zzgdkVar.getClass();
        zzicd zzicdVar = this.zzb;
        if (!zzicdVar.zza()) {
            this.zzb = zzibr.zzbN(zzicdVar);
        }
        this.zzb.add(zzgdkVar);
    }

    final /* synthetic */ void zzc(zzifd zzifdVar) {
        zzifdVar.getClass();
        this.zzc = zzifdVar;
        this.zza |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zza", "zzb", zzgdk.class, "zzc"});
        }
        if (ordinal == 3) {
            return new zzgdm();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzgdl(bArr);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar2 = zze;
        if (zzidkVar2 != null) {
            return zzidkVar2;
        }
        synchronized (zzgdm.class) {
            zzidkVar = zze;
            if (zzidkVar == null) {
                zzidkVar = new zzibm(zzd);
                zze = zzidkVar;
            }
        }
        return zzidkVar;
    }
}
