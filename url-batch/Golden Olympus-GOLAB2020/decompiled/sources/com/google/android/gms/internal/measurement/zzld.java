package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class zzld implements Iterable, Serializable {
    public static final zzld zzb = new zzlb(zzmk.zzb);
    private int zza = 0;

    static {
        int i4 = zzkr.zza;
    }

    zzld() {
    }

    static int zzh(int i4, int i5, int i6) {
        int i7 = i5 - i4;
        if ((i4 | i5 | i7 | (i6 - i5)) >= 0) {
            return i7;
        }
        if (i4 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i4 + " < 0");
        }
        if (i5 < i4) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i4 + ", " + i5);
        }
        throw new IndexOutOfBoundsException("End index: " + i5 + " >= " + i6);
    }

    public static zzld zzj(byte[] bArr, int i4, int i5) {
        zzh(i4, i4 + i5, bArr.length);
        byte[] bArr2 = new byte[i5];
        System.arraycopy(bArr, i4, bArr2, 0, i5);
        return new zzlb(bArr2);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i4 = this.zza;
        if (i4 == 0) {
            int zzd = zzd();
            i4 = zze(zzd, 0, zzd);
            if (i4 == 0) {
                i4 = 1;
            }
            this.zza = i4;
        }
        return i4;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzkw(this);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(zzd()), zzd() <= 50 ? zzoc.zza(this) : zzoc.zza(zzf(0, 47)).concat("..."));
    }

    public abstract byte zza(int i4);

    abstract byte zzb(int i4);

    public abstract int zzd();

    protected abstract int zze(int i4, int i5, int i6);

    public abstract zzld zzf(int i4, int i5);

    abstract void zzg(zzkv zzkvVar);

    protected final int zzi() {
        return this.zza;
    }
}
