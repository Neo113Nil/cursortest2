package com.google.android.gms.internal.measurement;

import cn.hutool.core.util.l;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public final class zzlj {
    static final Charset zza = Charset.forName("US-ASCII");
    static final Charset zzb = Charset.forName(l.UTF_8);
    static final Charset zzc = Charset.forName(l.ISO_8859_1);
    public static final byte[] zzd;
    public static final ByteBuffer zze;
    public static final zzke zzf;

    static {
        byte[] bArr = new byte[0];
        zzd = bArr;
        zze = ByteBuffer.wrap(bArr);
        int i8 = zzke.zza;
        zzkc zzkcVar = new zzkc(bArr, 0, 0, false, null);
        try {
            zzkcVar.zza(0);
            zzf = zzkcVar;
        } catch (zzll e8) {
            throw new IllegalArgumentException(e8);
        }
    }

    public static int zza(boolean z7) {
        return z7 ? 1231 : 1237;
    }

    static int zzb(int i8, byte[] bArr, int i9, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            i8 = (i8 * 31) + bArr[i11];
        }
        return i8;
    }

    static Object zzc(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static String zzd(byte[] bArr) {
        return new String(bArr, zzb);
    }
}
