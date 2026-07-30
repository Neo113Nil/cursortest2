package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzfpl extends zzibr implements zzidd {
    private static final zzfpl zzc;
    private static volatile zzidk zzd;
    private zzicd zza = zzbM();
    private long zzb;

    static {
        zzfpl zzfplVar = new zzfpl();
        zzc = zzfplVar;
        zzibr.zzbu(zzfpl.class, zzfplVar);
    }

    private zzfpl() {
    }

    public static zzfpk zza() {
        return (zzfpk) zzc.zzbn();
    }

    final /* synthetic */ void zzb(zzfod zzfodVar) {
        zzfodVar.getClass();
        zzicd zzicdVar = this.zza;
        if (!zzicdVar.zza()) {
            this.zza = zzibr.zzbN(zzicdVar);
        }
        this.zza.add(zzfodVar);
    }

    final /* synthetic */ void zzc(long j) {
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzc, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0002", new Object[]{"zza", zzfod.class, "zzb"});
        }
        if (ordinal == 3) {
            return new zzfpl();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzfpk(bArr);
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
        synchronized (zzfpl.class) {
            zzidkVar = zzd;
            if (zzidkVar == null) {
                zzidkVar = new zzibm(zzc);
                zzd = zzidkVar;
            }
        }
        return zzidkVar;
    }
}
