package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzaci {
    public static int zza(zzacf zzacfVar, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int zzb = zzacfVar.zzb(bArr, i + i3, i2 - i3);
            if (zzb == -1) {
                break;
            }
            i3 += zzb;
        }
        return i3;
    }

    @Pure
    public static void zzb(boolean z, String str) throws zzcf {
        if (!z) {
            throw zzcf.zza(str, null);
        }
    }

    public static boolean zzc(zzacf zzacfVar, byte[] bArr, int i, int i2, boolean z) throws IOException {
        try {
            return zzacfVar.zzm(bArr, 0, i2, z);
        } catch (EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }

    public static boolean zzd(zzacf zzacfVar, byte[] bArr, int i, int i2) throws IOException {
        try {
            ((zzabu) zzacfVar).zzn(bArr, i, i2, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean zze(zzacf zzacfVar, int i) throws IOException {
        try {
            ((zzabu) zzacfVar).zzo(i, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
