package com.google.android.gms.internal.auth;

import cn.hutool.core.util.l;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public final class zzez {
    static final Charset zza = Charset.forName("US-ASCII");
    static final Charset zzb = Charset.forName(l.UTF_8);
    static final Charset zzc = Charset.forName(l.ISO_8859_1);
    public static final byte[] zzd;
    public static final ByteBuffer zze;
    public static final zzei zzf;

    static {
        byte[] bArr = new byte[0];
        zzd = bArr;
        zze = ByteBuffer.wrap(bArr);
        int i8 = zzei.zza;
        zzeg zzegVar = new zzeg(bArr, 0, 0, false, null);
        try {
            zzegVar.zza(0);
            zzf = zzegVar;
        } catch (zzfa e8) {
            throw new IllegalArgumentException(e8);
        }
    }

    public static int zza(boolean z7) {
        return z7 ? 1231 : 1237;
    }

    public static int zzb(byte[] bArr) {
        int length = bArr.length;
        int zzd2 = zzd(length, bArr, 0, length);
        if (zzd2 == 0) {
            return 1;
        }
        return zzd2;
    }

    public static int zzc(long j8) {
        return (int) (j8 ^ (j8 >>> 32));
    }

    static int zzd(int i8, byte[] bArr, int i9, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            i8 = (i8 * 31) + bArr[i11];
        }
        return i8;
    }

    static Object zze(Object obj) {
        obj.getClass();
        return obj;
    }

    static Object zzf(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    static Object zzg(Object obj, Object obj2) {
        return ((zzfw) obj).zzd().zzc((zzfw) obj2).zzg();
    }

    public static String zzh(byte[] bArr) {
        return new String(bArr, zzb);
    }

    public static boolean zzi(byte[] bArr) {
        return zzhm.zzc(bArr);
    }
}
