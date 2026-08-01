package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbay extends zzgwm implements zzgxx {
    private static final zzgws zzb = new zzbaw();
    private static final zzbay zzd;
    private int zze;
    private long zzf;
    private int zzg;
    private long zzh;
    private long zzi;
    private zzgwr zzj = zzaJ();
    private zzbat zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private long zzr;

    static {
        zzbay zzbayVar = new zzbay();
        zzd = zzbayVar;
        zzgwm.zzaU(zzbay.class, zzbayVar);
    }

    private zzbay() {
    }

    static /* synthetic */ void zzA(zzbay zzbayVar, int i) {
        zzbayVar.zzm = i - 1;
        zzbayVar.zze |= 64;
    }

    static /* synthetic */ void zzB(zzbay zzbayVar, int i) {
        zzbayVar.zzn = i - 1;
        zzbayVar.zze |= 128;
    }

    static /* synthetic */ void zzC(zzbay zzbayVar, int i) {
        zzbayVar.zzp = i - 1;
        zzbayVar.zze |= 512;
    }

    public static zzbax zzg() {
        return (zzbax) zzd.zzaA();
    }

    public static zzbay zzi(byte[] bArr) throws zzgwy {
        return (zzbay) zzgwm.zzaF(zzd, bArr);
    }

    static /* synthetic */ void zzl(zzbay zzbayVar, long j) {
        zzbayVar.zze |= 1;
        zzbayVar.zzf = j;
    }

    static /* synthetic */ void zzm(zzbay zzbayVar, long j) {
        zzbayVar.zze |= 4;
        zzbayVar.zzh = j;
    }

    static /* synthetic */ void zzn(zzbay zzbayVar, long j) {
        zzbayVar.zze |= 8;
        zzbayVar.zzi = j;
    }

    static /* synthetic */ void zzo(zzbay zzbayVar, Iterable iterable) {
        zzgwr zzgwrVar = zzbayVar.zzj;
        if (!zzgwrVar.zzc()) {
            zzbayVar.zzj = zzgwm.zzaK(zzgwrVar);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzbayVar.zzj.zzh(((zzazn) it.next()).zza());
        }
    }

    static /* synthetic */ void zzp(zzbay zzbayVar, zzbat zzbatVar) {
        zzbatVar.getClass();
        zzbayVar.zzk = zzbatVar;
        zzbayVar.zze |= 16;
    }

    static /* synthetic */ void zzq(zzbay zzbayVar, int i) {
        zzbayVar.zze |= 256;
        zzbayVar.zzo = i;
    }

    static /* synthetic */ void zzr(zzbay zzbayVar, zzbbc zzbbcVar) {
        zzbayVar.zzq = zzbbcVar.zza();
        zzbayVar.zze |= 1024;
    }

    static /* synthetic */ void zzs(zzbay zzbayVar, long j) {
        zzbayVar.zze |= 2048;
        zzbayVar.zzr = j;
    }

    static /* synthetic */ void zzy(zzbay zzbayVar, int i) {
        zzbayVar.zzg = i - 1;
        zzbayVar.zze |= 2;
    }

    static /* synthetic */ void zzz(zzbay zzbayVar, int i) {
        zzbayVar.zzl = i - 1;
        zzbayVar.zze |= 32;
    }

    public final int zza() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zzgwq zzgwqVar = zzbac.zza;
            return zzaR(zzd, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ࠞ\u0006ဉ\u0004\u0007᠌\u0005\b᠌\u0006\t᠌\u0007\nင\b\u000b᠌\t\f᠌\n\rဂ\u000b", new Object[]{"zze", "zzf", "zzg", zzbac.zza, "zzh", "zzi", "zzj", zzazm.zza, "zzk", "zzl", zzgwqVar, "zzm", zzgwqVar, "zzn", zzgwqVar, "zzo", "zzp", zzgwqVar, "zzq", zzbbb.zza, "zzr"});
        }
        if (i2 == 3) {
            return new zzbay();
        }
        zzayw zzaywVar = null;
        if (i2 == 4) {
            return new zzbax(zzaywVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzd;
    }

    public final long zzc() {
        return this.zzi;
    }

    public final long zzd() {
        return this.zzh;
    }

    public final long zze() {
        return this.zzf;
    }

    public final zzbat zzf() {
        zzbat zzbatVar = this.zzk;
        return zzbatVar == null ? zzbat.zzd() : zzbatVar;
    }

    public final zzbbc zzj() {
        zzbbc zzb2 = zzbbc.zzb(this.zzq);
        return zzb2 == null ? zzbbc.UNSPECIFIED : zzb2;
    }

    public final List zzk() {
        return new zzgwt(this.zzj, zzb);
    }

    public final int zzt() {
        int zza = zzbad.zza(this.zzm);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzu() {
        int zza = zzbad.zza(this.zzn);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzv() {
        int zza = zzbad.zza(this.zzp);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzw() {
        int zza = zzbad.zza(this.zzg);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzx() {
        int zza = zzbad.zza(this.zzl);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }
}
