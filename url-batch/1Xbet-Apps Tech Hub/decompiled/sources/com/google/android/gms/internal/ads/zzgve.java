package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import org.slf4j.Marker;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public abstract class zzgve implements Iterable, Serializable {
    private static final Comparator zza;
    public static final zzgve zzb = new zzgva(zzgww.zzd);
    private static final zzgvd zzd;
    private int zzc = 0;

    static {
        int i = zzgup.zza;
        zzd = new zzgvd(null);
        zza = new zzguv();
    }

    zzgve() {
    }

    public static zzgvb zzt() {
        return new zzgvb(128);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzgve zzu(Iterable iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = iterable.size();
        } else {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? zzb : zzc(iterable.iterator(), size);
    }

    public static zzgve zzv(byte[] bArr, int i, int i2) {
        zzq(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new zzgva(bArr2);
    }

    public static zzgve zzw(String str) {
        return new zzgva(str.getBytes(zzgww.zzb));
    }

    static void zzy(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
        }
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.zzc;
        if (i == 0) {
            int zzd2 = zzd();
            i = zzi(zzd2, 0, zzd2);
            if (i == 0) {
                i = 1;
            }
            this.zzc = i;
        }
        return i;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzd());
        objArr[2] = zzd() <= 50 ? zzgze.zza(this) : zzgze.zza(zzk(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public final byte[] zzA() {
        int zzd2 = zzd();
        if (zzd2 == 0) {
            return zzgww.zzd;
        }
        byte[] bArr = new byte[zzd2];
        zze(bArr, 0, 0, zzd2);
        return bArr;
    }

    public abstract byte zza(int i);

    abstract byte zzb(int i);

    public abstract int zzd();

    protected abstract void zze(byte[] bArr, int i, int i2, int i3);

    protected abstract int zzf();

    protected abstract boolean zzh();

    protected abstract int zzi(int i, int i2, int i3);

    protected abstract int zzj(int i, int i2, int i3);

    public abstract zzgve zzk(int i, int i2);

    public abstract zzgvm zzl();

    protected abstract String zzm(Charset charset);

    public abstract ByteBuffer zzn();

    abstract void zzo(zzgut zzgutVar) throws IOException;

    public abstract boolean zzp();

    protected final int zzr() {
        return this.zzc;
    }

    @Override // java.lang.Iterable
    /* renamed from: zzs, reason: merged with bridge method [inline-methods] */
    public zzguy iterator() {
        return new zzguu(this);
    }

    public final String zzx(Charset charset) {
        return zzd() == 0 ? "" : zzm(charset);
    }

    @Deprecated
    public final void zzz(byte[] bArr, int i, int i2, int i3) {
        zzq(0, i3, zzd());
        zzq(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            zze(bArr, 0, i2, i3);
        }
    }

    private static zzgve zzc(Iterator it, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i)));
        }
        if (i == 1) {
            return (zzgve) it.next();
        }
        int i2 = i >>> 1;
        zzgve zzc = zzc(it, i2);
        zzgve zzc2 = zzc(it, i - i2);
        if (Integer.MAX_VALUE - zzc.zzd() >= zzc2.zzd()) {
            return zzgyo.zzC(zzc, zzc2);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + zzc.zzd() + Marker.ANY_NON_NULL_MARKER + zzc2.zzd());
    }

    static int zzq(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i + " < 0");
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i + ", " + i2);
        }
        throw new IndexOutOfBoundsException("End index: " + i2 + " >= " + i3);
    }
}
