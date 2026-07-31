package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class zzaiw implements Serializable, Iterable<Byte> {
    public static final zzaiw zza = new zzajh(zzaki.zzb);
    private static final zzajd zzb = new zzajg();
    private int zzc = 0;

    static {
        new zzaiy();
    }

    zzaiw() {
    }

    static /* synthetic */ int zza(byte b4) {
        return b4 & 255;
    }

    static zzaiw zzb(byte[] bArr) {
        return new zzajh(bArr);
    }

    static zzajf zzc(int i4) {
        return new zzajf(i4);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i4 = this.zzc;
        if (i4 == 0) {
            int zzb2 = zzb();
            i4 = zzb(zzb2, 0, zzb2);
            if (i4 == 0) {
                i4 = 1;
            }
            this.zzc = i4;
        }
        return i4;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new zzaiz(this);
    }

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        Integer valueOf = Integer.valueOf(zzb());
        if (zzb() <= 50) {
            str = zzamo.zza(this);
        } else {
            str = zzamo.zza(zza(0, 47)) + "...";
        }
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", hexString, valueOf, str);
    }

    public abstract byte zza(int i4);

    public abstract zzaiw zza(int i4, int i5);

    abstract void zza(zzaix zzaixVar);

    protected abstract void zza(byte[] bArr, int i4, int i5, int i6);

    abstract byte zzb(int i4);

    public abstract int zzb();

    protected abstract int zzb(int i4, int i5, int i6);

    public abstract zzaji zzc();

    public final byte[] zzd() {
        int zzb2 = zzb();
        if (zzb2 == 0) {
            return zzaki.zzb;
        }
        byte[] bArr = new byte[zzb2];
        zza(bArr, 0, 0, zzb2);
        return bArr;
    }

    static int zza(int i4, int i5, int i6) {
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

    protected final int zza() {
        return this.zzc;
    }

    public static zzaiw zza(byte[] bArr) {
        return zza(bArr, 0, bArr.length);
    }

    public static zzaiw zza(byte[] bArr, int i4, int i5) {
        zza(i4, i4 + i5, bArr.length);
        return new zzajh(zzb.zza(bArr, i4, i5));
    }

    public static zzaiw zza(String str) {
        return new zzajh(str.getBytes(zzaki.zza));
    }
}
