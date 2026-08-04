package com.google.android.gms.internal.ads;

import com.google.common.base.Ascii;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzaqr {
    public static long zza(ByteBuffer byteBuffer) {
        long j = byteBuffer.getInt();
        return j < 0 ? j + 4294967296L : j;
    }

    public static int zzb(ByteBuffer byteBuffer) {
        return (zzc(byteBuffer.get()) << 8) + zzc(byteBuffer.get());
    }

    public static int zzc(byte b) {
        return b < 0 ? b + 256 : b;
    }

    public static long zzd(ByteBuffer byteBuffer) {
        long zza = zza(byteBuffer) << 32;
        if (zza >= 0) {
            return zza + zza(byteBuffer);
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }

    public static double zze(ByteBuffer byteBuffer) {
        byteBuffer.get(new byte[4]);
        return (((((r0[0] << Ascii.CAN) & (-16777216)) | ((r0[1] << Ascii.DLE) & 16711680)) | (65280 & (r0[2] << 8))) | (r0[3] & 255)) / 65536.0d;
    }

    public static double zzf(ByteBuffer byteBuffer) {
        byteBuffer.get(new byte[4]);
        return (((((r0[0] << Ascii.CAN) & (-16777216)) | ((r0[1] << Ascii.DLE) & 16711680)) | (65280 & (r0[2] << 8))) | (r0[3] & 255)) / 1.073741824E9d;
    }
}
