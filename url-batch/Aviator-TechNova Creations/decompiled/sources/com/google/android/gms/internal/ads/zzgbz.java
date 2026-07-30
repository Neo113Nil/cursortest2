package com.google.android.gms.internal.ads;

import com.facebook.AuthenticationTokenClaims;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzgbz extends zzibr implements zzidd {
    private static final zzgbz zzl;
    private static volatile zzidk zzm;
    private int zza;
    private boolean zzc;
    private boolean zzd;
    private long zzh;
    private boolean zzi;
    private boolean zzb = true;
    private long zze = AuthenticationTokenClaims.MAX_TIME_SINCE_TOKEN_ISSUED;
    private long zzf = 3600000;
    private String zzg = "https://pagead2.googlesyndication.com/mads/asp";
    private long zzj = 5;
    private long zzk = 60000;

    static {
        zzgbz zzgbzVar = new zzgbz();
        zzl = zzgbzVar;
        zzibr.zzbu(zzgbz.class, zzgbzVar);
    }

    private zzgbz() {
    }

    public static zzgby zzi() {
        return (zzgby) zzl.zzbn();
    }

    public static zzgbz zzj() {
        return zzl;
    }

    public final boolean zza() {
        return this.zzd;
    }

    public final long zzb() {
        return this.zzf;
    }

    public final String zzc() {
        return this.zzg;
    }

    public final long zzd() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzl, "\u0004\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဈ\u0005\u0007ဂ\u0006\bဇ\u0007\tဂ\b\nဂ\t", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (ordinal == 3) {
            return new zzgbz();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzgby(bArr);
        }
        if (ordinal == 5) {
            return zzl;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar2 = zzm;
        if (zzidkVar2 != null) {
            return zzidkVar2;
        }
        synchronized (zzgbz.class) {
            zzidkVar = zzm;
            if (zzidkVar == null) {
                zzidkVar = new zzibm(zzl);
                zzm = zzidkVar;
            }
        }
        return zzidkVar;
    }

    public final boolean zze() {
        return this.zzi;
    }

    public final long zzg() {
        return this.zzj;
    }

    public final long zzh() {
        return this.zzk;
    }

    final /* synthetic */ void zzk(boolean z) {
        this.zza |= 4;
        this.zzd = z;
    }

    final /* synthetic */ void zzl(long j) {
        this.zza |= 64;
        this.zzh = j;
    }
}
