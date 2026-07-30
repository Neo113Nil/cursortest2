package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzihm extends zzibr implements zzidd {
    private static final zzihm zzj;
    private static volatile zzidk zzk;
    private int zza;
    private long zzc;
    private boolean zzd;
    private int zze;
    private boolean zzh;
    private boolean zzi;
    private String zzb = "";
    private String zzf = "";
    private String zzg = "";

    static {
        zzihm zzihmVar = new zzihm();
        zzj = zzihmVar;
        zzibr.zzbu(zzihm.class, zzihmVar);
    }

    private zzihm() {
    }

    public static zzihl zzc() {
        return (zzihl) zzj.zzbn();
    }

    final /* synthetic */ void zzd(String str) {
        this.zza |= 1;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzj, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bဇ\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", zzihn.zza, "zzf", "zzg", "zzh", "zzi"});
        }
        if (ordinal == 3) {
            return new zzihm();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzihl(bArr);
        }
        if (ordinal == 5) {
            return zzj;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar2 = zzk;
        if (zzidkVar2 != null) {
            return zzidkVar2;
        }
        synchronized (zzihm.class) {
            zzidkVar = zzk;
            if (zzidkVar == null) {
                zzidkVar = new zzibm(zzj);
                zzk = zzidkVar;
            }
        }
        return zzidkVar;
    }

    final /* synthetic */ void zze(long j) {
        this.zza |= 2;
        this.zzc = j;
    }

    final /* synthetic */ void zzg(boolean z) {
        this.zza |= 4;
        this.zzd = z;
    }
}
