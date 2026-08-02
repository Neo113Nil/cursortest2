package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes3.dex */
public abstract class zzgww {
    public static final /* synthetic */ int zzd = 0;
    private static volatile int zze = 100;
    int zza;
    final int zzb = zze;
    zzgwx zzc;

    /* synthetic */ zzgww(zzgwv zzgwvVar) {
    }

    public static int zzD(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static int zzE(int i, InputStream inputStream) throws IOException {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & WorkQueueKt.MASK;
        int i3 = 7;
        while (i3 < 32) {
            int read = inputStream.read();
            if (read == -1) {
                throw zzgyn.zzi();
            }
            i2 |= (read & WorkQueueKt.MASK) << i3;
            if ((read & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        while (i3 < 64) {
            int read2 = inputStream.read();
            if (read2 == -1) {
                throw zzgyn.zzi();
            }
            if ((read2 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        throw zzgyn.zze();
    }

    public static long zzF(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public static zzgww zzG(InputStream inputStream, int i) {
        if (inputStream != null) {
            return new zzgws(inputStream, 4096, null);
        }
        byte[] bArr = zzgyl.zzb;
        int length = bArr.length;
        return zzH(bArr, 0, 0, false);
    }

    static zzgww zzH(byte[] bArr, int i, int i2, boolean z) {
        zzgwo zzgwoVar = new zzgwo(bArr, i, i2, z, null);
        try {
            zzgwoVar.zzd(i2);
            return zzgwoVar;
        } catch (zzgyn e) {
            throw new IllegalArgumentException(e);
        }
    }

    public abstract boolean zzA() throws IOException;

    public abstract boolean zzB() throws IOException;

    public abstract double zza() throws IOException;

    public abstract float zzb() throws IOException;

    public abstract int zzc();

    public abstract int zzd(int i) throws zzgyn;

    public abstract int zze() throws IOException;

    public abstract int zzf() throws IOException;

    public abstract int zzg() throws IOException;

    public abstract int zzj() throws IOException;

    public abstract int zzk() throws IOException;

    public abstract int zzl() throws IOException;

    public abstract int zzm() throws IOException;

    public abstract long zzn() throws IOException;

    public abstract long zzo() throws IOException;

    public abstract long zzs() throws IOException;

    public abstract long zzt() throws IOException;

    public abstract long zzu() throws IOException;

    public abstract zzgwm zzv() throws IOException;

    public abstract String zzw() throws IOException;

    public abstract String zzx() throws IOException;

    public abstract void zzy(int i) throws zzgyn;

    public abstract void zzz(int i);
}
