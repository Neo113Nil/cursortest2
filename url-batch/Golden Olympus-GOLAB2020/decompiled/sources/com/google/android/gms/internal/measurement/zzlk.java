package com.google.android.gms.internal.measurement;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class zzlk extends zzkv {
    public static final /* synthetic */ int zzb = 0;
    private static final Logger zzc = Logger.getLogger(zzlk.class.getName());
    private static final boolean zzd = zzol.zzx();
    zzll zza;

    private zzlk() {
        throw null;
    }

    public static int zzA(long j4) {
        return (640 - (Long.numberOfLeadingZeros(j4) * 9)) >>> 6;
    }

    @Deprecated
    static int zzw(int i4, zznh zznhVar, zzns zznsVar) {
        int zzz = zzz(i4 << 3);
        return zzz + zzz + ((zzko) zznhVar).zzca(zznsVar);
    }

    static int zzx(zznh zznhVar, zzns zznsVar) {
        int zzca = ((zzko) zznhVar).zzca(zznsVar);
        return zzz(zzca) + zzca;
    }

    public static int zzy(String str) {
        int length;
        try {
            length = zzoo.zzc(str);
        } catch (zzon unused) {
            length = str.getBytes(zzmk.zza).length;
        }
        return zzz(length) + length;
    }

    public static int zzz(int i4) {
        return (352 - (Integer.numberOfLeadingZeros(i4) * 9)) >>> 6;
    }

    public final void zzB() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void zzC(String str, zzon zzonVar) {
        zzc.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzonVar);
        byte[] bytes = str.getBytes(zzmk.zza);
        try {
            int length = bytes.length;
            zzt(length);
            zzl(bytes, 0, length);
        } catch (IndexOutOfBoundsException e4) {
            throw new zzli(e4);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b4);

    public abstract void zzd(int i4, boolean z4);

    public abstract void zze(int i4, zzld zzldVar);

    public abstract void zzf(int i4, int i5);

    public abstract void zzg(int i4);

    public abstract void zzh(int i4, long j4);

    public abstract void zzi(long j4);

    public abstract void zzj(int i4, int i5);

    public abstract void zzk(int i4);

    public abstract void zzl(byte[] bArr, int i4, int i5);

    abstract void zzm(int i4, zznh zznhVar, zzns zznsVar);

    public abstract void zzn(int i4, zznh zznhVar);

    public abstract void zzo(int i4, zzld zzldVar);

    public abstract void zzp(int i4, String str);

    public abstract void zzr(int i4, int i5);

    public abstract void zzs(int i4, int i5);

    public abstract void zzt(int i4);

    public abstract void zzu(int i4, long j4);

    public abstract void zzv(long j4);

    /* synthetic */ zzlk(zzlj zzljVar) {
    }
}
