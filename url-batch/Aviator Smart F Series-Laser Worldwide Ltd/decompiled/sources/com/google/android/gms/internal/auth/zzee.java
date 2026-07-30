package com.google.android.gms.internal.auth;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class zzee implements Iterable, Serializable {
    private static final Comparator zza;
    public static final zzee zzb = new zzeb(zzez.zzd);
    private static final zzed zzd;
    private int zzc = 0;

    static {
        int i8 = zzdr.zza;
        zzd = new zzed(null);
        zza = new zzdw();
    }

    zzee() {
    }

    static int zzi(int i8, int i9, int i10) {
        int i11 = i9 - i8;
        if ((i8 | i9 | i11 | (i10 - i9)) >= 0) {
            return i11;
        }
        if (i8 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i8 + " < 0");
        }
        if (i9 < i8) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i8 + ", " + i9);
        }
        throw new IndexOutOfBoundsException("End index: " + i9 + " >= " + i10);
    }

    public static zzee zzk(byte[] bArr, int i8, int i9) {
        zzi(i8, i8 + i9, bArr.length);
        byte[] bArr2 = new byte[i9];
        System.arraycopy(bArr, i8, bArr2, 0, i9);
        return new zzeb(bArr2);
    }

    public static zzee zzl(String str) {
        return new zzeb(str.getBytes(zzez.zzb));
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i8 = this.zzc;
        if (i8 == 0) {
            int zzd2 = zzd();
            i8 = zze(zzd2, 0, zzd2);
            if (i8 == 0) {
                i8 = 1;
            }
            this.zzc = i8;
        }
        return i8;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzdv(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzd());
        objArr[2] = zzd() <= 50 ? zzgw.zza(this) : zzgw.zza(zzf(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract byte zza(int i8);

    abstract byte zzb(int i8);

    public abstract int zzd();

    protected abstract int zze(int i8, int i9, int i10);

    public abstract zzee zzf(int i8, int i9);

    protected abstract String zzg(Charset charset);

    public abstract boolean zzh();

    protected final int zzj() {
        return this.zzc;
    }

    public final String zzm(Charset charset) {
        return zzd() == 0 ? "" : zzg(charset);
    }
}
