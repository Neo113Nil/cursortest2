package com.google.android.gms.internal.measurement;

import com.jieli.jl_audio_decode.constant.ErrorCode;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public abstract class zzki extends zzjq {
    public static final /* synthetic */ int zzb = 0;
    private static final Logger zzc = Logger.getLogger(zzki.class.getName());
    private static final boolean zzd = zznu.zzx();
    zzkj zza;

    private zzki() {
    }

    @Deprecated
    static int zzt(int i8, zzmi zzmiVar, zzmt zzmtVar) {
        int zzbu = ((zzjk) zzmiVar).zzbu(zzmtVar);
        int zzx = zzx(i8 << 3);
        return zzx + zzx + zzbu;
    }

    public static int zzu(int i8) {
        if (i8 >= 0) {
            return zzx(i8);
        }
        return 10;
    }

    static int zzv(zzmi zzmiVar, zzmt zzmtVar) {
        int zzbu = ((zzjk) zzmiVar).zzbu(zzmtVar);
        return zzx(zzbu) + zzbu;
    }

    public static int zzw(String str) {
        int length;
        try {
            length = zznz.zzc(str);
        } catch (zzny unused) {
            length = str.getBytes(zzlj.zzb).length;
        }
        return zzx(length) + length;
    }

    public static int zzx(int i8) {
        if ((i8 & ErrorCode.ERR_OUTPUT_EXCEPTION) == 0) {
            return 1;
        }
        if ((i8 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i8) == 0) {
            return 3;
        }
        return (i8 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int zzy(long j8) {
        int i8;
        if (((-128) & j8) == 0) {
            return 1;
        }
        if (j8 < 0) {
            return 10;
        }
        if (((-34359738368L) & j8) != 0) {
            j8 >>>= 28;
            i8 = 6;
        } else {
            i8 = 2;
        }
        if (((-2097152) & j8) != 0) {
            j8 >>>= 14;
            i8 += 2;
        }
        return (j8 & (-16384)) != 0 ? i8 + 1 : i8;
    }

    public static zzki zzz(byte[] bArr, int i8, int i9) {
        return new zzkf(bArr, 0, i9);
    }

    public final void zzA() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void zzB(String str, zzny zznyVar) {
        zzc.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zznyVar);
        byte[] bytes = str.getBytes(zzlj.zzb);
        try {
            int length = bytes.length;
            zzq(length);
            zzl(bytes, 0, length);
        } catch (IndexOutOfBoundsException e8) {
            throw new zzkg(e8);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b8);

    public abstract void zzd(int i8, boolean z7);

    public abstract void zze(int i8, zzka zzkaVar);

    public abstract void zzf(int i8, int i9);

    public abstract void zzg(int i8);

    public abstract void zzh(int i8, long j8);

    public abstract void zzi(long j8);

    public abstract void zzj(int i8, int i9);

    public abstract void zzk(int i8);

    public abstract void zzl(byte[] bArr, int i8, int i9);

    public abstract void zzm(int i8, String str);

    public abstract void zzo(int i8, int i9);

    public abstract void zzp(int i8, int i9);

    public abstract void zzq(int i8);

    public abstract void zzr(int i8, long j8);

    public abstract void zzs(long j8);

    /* synthetic */ zzki(zzkh zzkhVar) {
    }
}
