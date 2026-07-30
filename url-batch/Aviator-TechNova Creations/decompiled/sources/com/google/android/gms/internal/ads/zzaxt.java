package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzaxt extends zzibr implements zzidd {
    private static final zzaxt zze;
    private static volatile zzidk zzf;
    private int zza;
    private long zzb;
    private String zzc = "";
    private zzian zzd = zzian.zza;

    static {
        zzaxt zzaxtVar = new zzaxt();
        zze = zzaxtVar;
        zzibr.zzbu(zzaxt.class, zzaxtVar);
    }

    private zzaxt() {
    }

    public static zzaxt zze() {
        return zze;
    }

    public final boolean zza() {
        return (this.zza & 1) != 0;
    }

    public final long zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final zzian zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zze, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzaxt();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzaxs(bArr);
        }
        if (ordinal == 5) {
            return zze;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar2 = zzf;
        if (zzidkVar2 != null) {
            return zzidkVar2;
        }
        synchronized (zzaxt.class) {
            zzidkVar = zzf;
            if (zzidkVar == null) {
                zzidkVar = new zzibm(zze);
                zzf = zzidkVar;
            }
        }
        return zzidkVar;
    }
}
