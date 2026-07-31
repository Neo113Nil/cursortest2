package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes.dex */
public abstract class zzaji {
    private static volatile int zzd = 100;
    int zza;
    int zzb;
    zzajm zzc;
    private int zze;
    private int zzf;

    public static int zza(int i4) {
        return (-(i4 & 1)) ^ (i4 >>> 1);
    }

    public abstract double zza();

    public abstract float zzb();

    public abstract int zzb(int i4);

    public abstract int zzc();

    public abstract void zzc(int i4);

    public abstract int zzd();

    public abstract void zzd(int i4);

    public abstract int zze();

    public abstract boolean zze(int i4);

    public abstract int zzf();

    public abstract int zzg();

    public abstract int zzh();

    public abstract int zzi();

    public abstract int zzj();

    public abstract long zzk();

    public abstract long zzl();

    abstract long zzm();

    public abstract long zzn();

    public abstract long zzo();

    public abstract long zzp();

    public abstract zzaiw zzq();

    public abstract String zzr();

    public abstract String zzs();

    public final void zzt() {
        if (this.zza + this.zze >= this.zzf) {
            throw zzakm.zzh();
        }
    }

    public final void zzu() {
        if (this.zze == 0) {
            zzc(0);
        }
    }

    public final void zzv() {
        int zzi;
        do {
            zzi = zzi();
            if (zzi == 0) {
                return;
            }
            zzt();
            this.zze++;
            this.zze--;
        } while (zze(zzi));
    }

    public abstract boolean zzw();

    public abstract boolean zzx();

    private zzaji() {
        this.zzf = zzd;
        this.zzb = Integer.MAX_VALUE;
    }

    public static long zza(long j4) {
        return (-(j4 & 1)) ^ (j4 >>> 1);
    }

    static zzaji zza(byte[] bArr, int i4, int i5, boolean z4) {
        zzajl zzajlVar = new zzajl(bArr, i4, i5, z4);
        try {
            zzajlVar.zzb(i5);
            return zzajlVar;
        } catch (zzakm e4) {
            throw new IllegalArgumentException(e4);
        }
    }
}
