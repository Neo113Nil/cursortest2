package com.google.android.gms.internal.fido;

import com.ironsource.cc;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class zzch {
    private static final zzch zza;
    private static final zzch zzb;
    private static final zzch zzc;
    private static final zzch zzd;
    private static final zzch zze;

    static {
        Character valueOf = Character.valueOf(cc.f15727T);
        zza = new zzcf("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", valueOf);
        zzb = new zzcf("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", valueOf);
        zzc = new zzcg("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", valueOf);
        zzd = new zzcg("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", valueOf);
        zze = new zzce("base16()", "0123456789ABCDEF");
    }

    zzch() {
    }

    public static zzch zzf() {
        return zze;
    }

    abstract void zzb(Appendable appendable, byte[] bArr, int i4, int i5);

    abstract int zzc(int i4);

    public abstract zzch zzd();

    public final String zzg(byte[] bArr, int i4, int i5) {
        zzap.zze(0, i5, bArr.length);
        StringBuilder sb = new StringBuilder(zzc(i5));
        try {
            zzb(sb, bArr, 0, i5);
            return sb.toString();
        } catch (IOException e4) {
            throw new AssertionError(e4);
        }
    }
}
