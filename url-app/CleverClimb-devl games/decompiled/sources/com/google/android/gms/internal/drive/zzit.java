package com.google.android.gms.internal.drive;

/* loaded from: classes2.dex */
public final class zzit implements Cloneable {
    private static final zziu zzmy = new zziu();
    private int mSize;
    private boolean zzmz;
    private int[] zzna;
    private zziu[] zznb;

    zzit() {
        this(10);
    }

    private zzit(int i) {
        this.zzmz = false;
        int idealIntArraySize = idealIntArraySize(i);
        this.zzna = new int[idealIntArraySize];
        this.zznb = new zziu[idealIntArraySize];
        this.mSize = 0;
    }

    private static int idealIntArraySize(int i) {
        int i2 = i << 2;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        return i2 / 4;
    }

    private final int zzt(int i) {
        int i2 = this.mSize - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int i5 = this.zzna[i4];
            if (i5 < i) {
                i3 = i4 + 1;
            } else {
                if (i5 <= i) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return i3 ^ (-1);
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        int i = this.mSize;
        zzit zzitVar = new zzit(i);
        System.arraycopy(this.zzna, 0, zzitVar.zzna, 0, i);
        for (int i2 = 0; i2 < i; i2++) {
            if (this.zznb[i2] != null) {
                zzitVar.zznb[i2] = (zziu) this.zznb[i2].clone();
            }
        }
        zzitVar.mSize = i;
        return zzitVar;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzit)) {
            return false;
        }
        zzit zzitVar = (zzit) obj;
        if (this.mSize != zzitVar.mSize) {
            return false;
        }
        int[] iArr = this.zzna;
        int[] iArr2 = zzitVar.zzna;
        int i = this.mSize;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                z = true;
                break;
            }
            if (iArr[i2] != iArr2[i2]) {
                z = false;
                break;
            }
            i2++;
        }
        if (z) {
            zziu[] zziuVarArr = this.zznb;
            zziu[] zziuVarArr2 = zzitVar.zznb;
            int i3 = this.mSize;
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    z2 = true;
                    break;
                }
                if (!zziuVarArr[i4].equals(zziuVarArr2[i4])) {
                    z2 = false;
                    break;
                }
                i4++;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 17;
        for (int i2 = 0; i2 < this.mSize; i2++) {
            i = (((i * 31) + this.zzna[i2]) * 31) + this.zznb[i2].hashCode();
        }
        return i;
    }

    public final boolean isEmpty() {
        return this.mSize == 0;
    }

    final int size() {
        return this.mSize;
    }

    final void zza(int i, zziu zziuVar) {
        int zzt = zzt(i);
        if (zzt >= 0) {
            this.zznb[zzt] = zziuVar;
            return;
        }
        int i2 = zzt ^ (-1);
        if (i2 < this.mSize && this.zznb[i2] == zzmy) {
            this.zzna[i2] = i;
            this.zznb[i2] = zziuVar;
            return;
        }
        if (this.mSize >= this.zzna.length) {
            int idealIntArraySize = idealIntArraySize(this.mSize + 1);
            int[] iArr = new int[idealIntArraySize];
            zziu[] zziuVarArr = new zziu[idealIntArraySize];
            System.arraycopy(this.zzna, 0, iArr, 0, this.zzna.length);
            System.arraycopy(this.zznb, 0, zziuVarArr, 0, this.zznb.length);
            this.zzna = iArr;
            this.zznb = zziuVarArr;
        }
        if (this.mSize - i2 != 0) {
            int i3 = i2 + 1;
            System.arraycopy(this.zzna, i2, this.zzna, i3, this.mSize - i2);
            System.arraycopy(this.zznb, i2, this.zznb, i3, this.mSize - i2);
        }
        this.zzna[i2] = i;
        this.zznb[i2] = zziuVar;
        this.mSize++;
    }

    final zziu zzr(int i) {
        int zzt = zzt(i);
        if (zzt < 0 || this.zznb[zzt] == zzmy) {
            return null;
        }
        return this.zznb[zzt];
    }

    final zziu zzs(int i) {
        return this.zznb[i];
    }
}
