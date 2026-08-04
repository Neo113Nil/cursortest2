package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
public abstract class zzhhb implements Iterable<Byte>, Serializable {
    public static final zzhhb zzb = new zzhgz(zzhiu.zzb);
    private int zza = 0;

    static {
        int i = zzhgo.zza;
    }

    zzhhb() {
    }

    public static zzhhb zzr(byte[] bArr, int i, int i2) {
        zzA(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new zzhgz(bArr2);
    }

    public static zzhhb zzs(String str) {
        return new zzhgz(str.getBytes(zzhiu.zza));
    }

    public static zzhhb zzt(Iterable iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = ((Collection) iterable).size();
        } else {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? zzb : zzd(iterable.iterator(), size);
    }

    public static zzhha zzx() {
        return new zzhha(128);
    }

    static void zzz(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 11);
                sb.append("Index < 0: ");
                sb.append(i);
                throw new ArrayIndexOutOfBoundsException(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 18 + String.valueOf(i2).length());
            sb2.append("Index > length: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.zza;
        if (i == 0) {
            int zzc = zzc();
            i = zzo(zzc, 0, zzc);
            if (i == 0) {
                i = 1;
            }
            this.zza = i;
        }
        return i;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(zzc()), zzc() <= 50 ? zzhkt.zza(this) : zzhkt.zza(zzi(0, 47)).concat("..."));
    }

    public abstract byte zza(int i);

    abstract byte zzb(int i);

    public abstract int zzc();

    protected abstract void zze(byte[] bArr, int i, int i2, int i3);

    protected abstract int zzf();

    protected abstract boolean zzg();

    public abstract zzhhb zzi(int i, int i2);

    public abstract ByteBuffer zzj();

    abstract void zzk(zzhgs zzhgsVar) throws IOException;

    protected abstract String zzl(Charset charset);

    public abstract boolean zzm();

    protected abstract int zzn(int i, int i2, int i3);

    protected abstract int zzo(int i, int i2, int i3);

    public abstract zzhhg zzp();

    @Override // java.lang.Iterable
    /* renamed from: zzq, reason: merged with bridge method [inline-methods] */
    public zzhgw iterator() {
        return new zzhgt(this);
    }

    @Deprecated
    public final void zzu(byte[] bArr, int i, int i2, int i3) {
        zzA(0, i3, zzc());
        zzA(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            zze(bArr, 0, i2, i3);
        }
    }

    public final byte[] zzv() {
        int zzc = zzc();
        if (zzc == 0) {
            return zzhiu.zzb;
        }
        byte[] bArr = new byte[zzc];
        zze(bArr, 0, 0, zzc);
        return bArr;
    }

    public final String zzw() {
        return zzc() == 0 ? "" : zzl(zzhiu.zza);
    }

    protected final int zzy() {
        return this.zza;
    }

    private static zzhhb zzd(Iterator it, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i)));
        }
        if (i == 1) {
            return (zzhhb) it.next();
        }
        int i2 = i >>> 1;
        zzhhb zzd = zzd(it, i2);
        zzhhb zzd2 = zzd(it, i - i2);
        if (Integer.MAX_VALUE - zzd.zzc() >= zzd2.zzc()) {
            return zzhkj.zzd(zzd, zzd2);
        }
        int zzc = zzd.zzc();
        int zzc2 = zzd2.zzc();
        StringBuilder sb = new StringBuilder(String.valueOf(zzc).length() + 31 + String.valueOf(zzc2).length());
        sb.append("ByteString would be too long: ");
        sb.append(zzc);
        sb.append("+");
        sb.append(zzc2);
        throw new IllegalArgumentException(sb.toString());
    }

    static int zzA(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 44 + String.valueOf(i2).length());
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(i2).length() + 15 + String.valueOf(i3).length());
        sb3.append("End index: ");
        sb3.append(i2);
        sb3.append(" >= ");
        sb3.append(i3);
        throw new IndexOutOfBoundsException(sb3.toString());
    }
}
