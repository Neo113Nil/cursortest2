package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzifj extends zzibr implements zzidd {
    private static final zzifj zzd;
    private static volatile zzidk zze;
    private int zza;
    private long zzb;
    private long zzc;

    static {
        zzifj zzifjVar = new zzifj();
        zzd = zzifjVar;
        zzibr.zzbu(zzifj.class, zzifjVar);
    }

    private zzifj() {
    }

    public static zzifi zzc() {
        return (zzifi) zzd.zzbn();
    }

    final /* synthetic */ void zzd(int i) {
        this.zza = i;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\u0002", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzifj();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzifi(bArr);
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
        synchronized (zzifj.class) {
            zzidkVar = zze;
            if (zzidkVar == null) {
                zzidkVar = new zzibm(zzd);
                zze = zzidkVar;
            }
        }
        return zzidkVar;
    }

    final /* synthetic */ void zze(long j) {
        this.zzb = j;
    }

    final /* synthetic */ void zzg(long j) {
        this.zzc = j;
    }
}
