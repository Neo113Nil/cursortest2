package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzfyu extends zzibr implements zzidd {
    private static final zzfyu zzn;
    private static volatile zzidk zzo;
    private int zza;
    private long zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private String zzb = "";
    private zzicc zzk = zzbE();
    private zzicc zzl = zzbE();
    private zzicc zzm = zzbE();

    static {
        zzfyu zzfyuVar = new zzfyu();
        zzn = zzfyuVar;
        zzibr.zzbu(zzfyu.class, zzfyuVar);
    }

    private zzfyu() {
    }

    public static zzfyu zzp() {
        return zzn;
    }

    final /* synthetic */ void zzA(long j) {
        zzicc zziccVar = this.zzl;
        if (!zziccVar.zza()) {
            this.zzl = zzibr.zzbF(zziccVar);
        }
        this.zzl.zzd(j);
    }

    final /* synthetic */ void zzB(long j) {
        zzicc zziccVar = this.zzm;
        if (!zziccVar.zza()) {
            this.zzm = zzibr.zzbF(zziccVar);
        }
        this.zzm.zzd(j);
    }

    final /* synthetic */ void zzC() {
        this.zzm = zzbE();
    }

    public final String zza() {
        return this.zzb;
    }

    public final long zzb() {
        return this.zzc;
    }

    public final int zzc() {
        return this.zzd;
    }

    public final boolean zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzn, "\u0004\f\u0000\u0001\u0001\f\f\u0000\u0003\u0000\u0001Ȉ\u0002ဂ\u0000\u0003င\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဂ\u0004\u0007\u0002\bဂ\u0005\tဂ\u0006\n%\u000b%\f%", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (ordinal == 3) {
            return new zzfyu();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzfyt(bArr);
        }
        if (ordinal == 5) {
            return zzn;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar2 = zzo;
        if (zzidkVar2 != null) {
            return zzidkVar2;
        }
        synchronized (zzfyu.class) {
            zzidkVar = zzo;
            if (zzidkVar == null) {
                zzidkVar = new zzibm(zzn);
                zzo = zzidkVar;
            }
        }
        return zzidkVar;
    }

    public final boolean zze() {
        return this.zzf;
    }

    public final long zzg() {
        return this.zzg;
    }

    public final long zzh() {
        return this.zzh;
    }

    public final long zzi() {
        return this.zzi;
    }

    public final boolean zzj() {
        return (this.zza & 64) != 0;
    }

    public final List zzk() {
        return this.zzk;
    }

    public final int zzl() {
        return this.zzk.size();
    }

    public final int zzm() {
        return this.zzl.size();
    }

    public final List zzn() {
        return this.zzm;
    }

    public final int zzo() {
        return this.zzm.size();
    }

    final /* synthetic */ void zzq(String str) {
        str.getClass();
        this.zzb = str;
    }

    final /* synthetic */ void zzr(long j) {
        this.zza |= 1;
        this.zzc = j;
    }

    final /* synthetic */ void zzs(int i) {
        this.zza |= 2;
        this.zzd = i;
    }

    final /* synthetic */ void zzt(boolean z) {
        this.zza |= 4;
        this.zze = true;
    }

    final /* synthetic */ void zzu(boolean z) {
        this.zza |= 8;
        this.zzf = true;
    }

    final /* synthetic */ void zzv(long j) {
        this.zza |= 16;
        this.zzg = j;
    }

    final /* synthetic */ void zzw(long j) {
        this.zzh = j;
    }

    final /* synthetic */ void zzx(long j) {
        this.zza |= 32;
        this.zzi = j;
    }

    final /* synthetic */ void zzy(long j) {
        this.zza |= 64;
        this.zzj = j;
    }

    final /* synthetic */ void zzz(long j) {
        zzicc zziccVar = this.zzk;
        if (!zziccVar.zza()) {
            this.zzk = zzibr.zzbF(zziccVar);
        }
        this.zzk.zzd(j);
    }
}
