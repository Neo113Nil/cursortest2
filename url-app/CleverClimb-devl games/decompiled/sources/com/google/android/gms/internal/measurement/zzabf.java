package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class zzabf implements Cloneable {
    private static final zzabg zzbzl = new zzabg();
    private int mSize;
    private boolean zzbzm;
    private int[] zzbzn;
    private zzabg[] zzbzo;

    zzabf() {
        this(10);
    }

    private zzabf(int i) {
        this.zzbzm = false;
        int idealIntArraySize = idealIntArraySize(i);
        this.zzbzn = new int[idealIntArraySize];
        this.zzbzo = new zzabg[idealIntArraySize];
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

    private final int zzax(int i) {
        int i2 = this.mSize - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int i5 = this.zzbzn[i4];
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
        zzabf zzabfVar = new zzabf(i);
        System.arraycopy(this.zzbzn, 0, zzabfVar.zzbzn, 0, i);
        for (int i2 = 0; i2 < i; i2++) {
            if (this.zzbzo[i2] != null) {
                zzabfVar.zzbzo[i2] = (zzabg) this.zzbzo[i2].clone();
            }
        }
        zzabfVar.mSize = i;
        return zzabfVar;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzabf)) {
            return false;
        }
        zzabf zzabfVar = (zzabf) obj;
        if (this.mSize != zzabfVar.mSize) {
            return false;
        }
        int[] iArr = this.zzbzn;
        int[] iArr2 = zzabfVar.zzbzn;
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
            zzabg[] zzabgVarArr = this.zzbzo;
            zzabg[] zzabgVarArr2 = zzabfVar.zzbzo;
            int i3 = this.mSize;
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    z2 = true;
                    break;
                }
                if (!zzabgVarArr[i4].equals(zzabgVarArr2[i4])) {
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
            i = (((i * 31) + this.zzbzn[i2]) * 31) + this.zzbzo[i2].hashCode();
        }
        return i;
    }

    public final boolean isEmpty() {
        return this.mSize == 0;
    }

    final int size() {
        return this.mSize;
    }

    final void zza(int i, zzabg zzabgVar) {
        int zzax = zzax(i);
        if (zzax >= 0) {
            this.zzbzo[zzax] = zzabgVar;
            return;
        }
        int i2 = zzax ^ (-1);
        if (i2 < this.mSize && this.zzbzo[i2] == zzbzl) {
            this.zzbzn[i2] = i;
            this.zzbzo[i2] = zzabgVar;
            return;
        }
        if (this.mSize >= this.zzbzn.length) {
            int idealIntArraySize = idealIntArraySize(this.mSize + 1);
            int[] iArr = new int[idealIntArraySize];
            zzabg[] zzabgVarArr = new zzabg[idealIntArraySize];
            System.arraycopy(this.zzbzn, 0, iArr, 0, this.zzbzn.length);
            System.arraycopy(this.zzbzo, 0, zzabgVarArr, 0, this.zzbzo.length);
            this.zzbzn = iArr;
            this.zzbzo = zzabgVarArr;
        }
        if (this.mSize - i2 != 0) {
            int i3 = i2 + 1;
            System.arraycopy(this.zzbzn, i2, this.zzbzn, i3, this.mSize - i2);
            System.arraycopy(this.zzbzo, i2, this.zzbzo, i3, this.mSize - i2);
        }
        this.zzbzn[i2] = i;
        this.zzbzo[i2] = zzabgVar;
        this.mSize++;
    }

    final zzabg zzav(int i) {
        int zzax = zzax(i);
        if (zzax < 0 || this.zzbzo[zzax] == zzbzl) {
            return null;
        }
        return this.zzbzo[zzax];
    }

    final zzabg zzaw(int i) {
        return this.zzbzo[i];
    }
}
