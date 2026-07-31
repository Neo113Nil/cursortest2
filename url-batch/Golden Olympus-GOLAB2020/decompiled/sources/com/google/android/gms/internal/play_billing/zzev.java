package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class zzev implements Iterable, Serializable {
    public static final zzev zza = new zzet(zzga.zzb);
    private int zzb = 0;

    static {
        int i4 = zzei.zza;
    }

    zzev() {
    }

    static int zzj(int i4, int i5, int i6) {
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

    public static zzev zzk(byte[] bArr, int i4, int i5) {
        try {
            zzj(i4, i4 + i5, bArr.length);
            byte[] bArr2 = new byte[i5];
            System.arraycopy(bArr, i4, bArr2, 0, i5);
            return new zzet(bArr2);
        } catch (zzgc e4) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e4);
        }
    }

    static /* bridge */ /* synthetic */ boolean zzl(byte[] bArr, int i4, byte[] bArr2, int i5, int i6) {
        int i7 = i4 + i6;
        zzj(i4, i7, bArr.length);
        zzj(i5, i6 + i5, bArr2.length);
        while (i4 < i7) {
            if (bArr[i4] != bArr2[i5]) {
                return false;
            }
            i4++;
            i5++;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzev)) {
            return false;
        }
        zzev zzevVar = (zzev) obj;
        int zze = zze();
        if (zze != zzevVar.zze()) {
            return false;
        }
        if (zze == 0) {
            return true;
        }
        int i4 = this.zzb;
        int i5 = zzevVar.zzb;
        if (i4 == 0 || i5 == 0 || i4 == i5) {
            return zzh(zzevVar);
        }
        return false;
    }

    public final int hashCode() {
        int i4 = this.zzb;
        if (i4 == 0) {
            int zze = zze();
            i4 = zzd(zze, 0, zze);
            if (i4 == 0) {
                i4 = 1;
            }
            this.zzb = i4;
        }
        return i4;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzen(this);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(zze()), zze() <= 50 ? zzhz.zza(this) : zzhz.zza(zzf(0, 47)).concat("..."));
    }

    public abstract byte zza(int i4);

    abstract byte zzb(int i4);

    protected abstract int zzd(int i4, int i5, int i6);

    public abstract int zze();

    public abstract zzev zzf(int i4, int i5);

    abstract void zzg(zzem zzemVar);

    protected abstract boolean zzh(zzev zzevVar);
}
