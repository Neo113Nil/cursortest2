package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public abstract class zzfc extends zzem {
    public static final /* synthetic */ int zzb = 0;
    private static final boolean zzc = zzii.zzx();
    Object zza;

    private zzfc() {
        throw null;
    }

    public static int zzx(zzhb zzhbVar) {
        int zzn = zzhbVar.zzn();
        return zzy(zzn) + zzn;
    }

    public static int zzy(int i4) {
        return (352 - (Integer.numberOfLeadingZeros(i4) * 9)) >>> 6;
    }

    public static int zzz(long j4) {
        return (640 - (Long.numberOfLeadingZeros(j4) * 9)) >>> 6;
    }

    public final void zzA() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b4);

    public abstract void zzd(int i4, boolean z4);

    abstract void zze(byte[] bArr, int i4, int i5);

    public abstract void zzf(int i4, zzev zzevVar);

    public abstract void zzg(zzev zzevVar);

    public abstract void zzh(int i4, int i5);

    public abstract void zzi(int i4);

    public abstract void zzj(int i4, long j4);

    public abstract void zzk(long j4);

    public abstract void zzl(int i4, int i5);

    public abstract void zzm(int i4);

    public abstract void zzn(zzhb zzhbVar);

    public abstract void zzo(int i4, zzhb zzhbVar);

    public abstract void zzp(int i4, zzev zzevVar);

    public abstract void zzq(int i4, String str);

    public abstract void zzr(String str);

    public abstract void zzs(int i4, int i5);

    public abstract void zzt(int i4, int i5);

    public abstract void zzu(int i4);

    public abstract void zzv(int i4, long j4);

    public abstract void zzw(long j4);

    /* synthetic */ zzfc(zzfb zzfbVar) {
    }
}
