package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class zzamb<E> extends zzaiq<E> implements RandomAccess {
    private static final Object[] zza;
    private static final zzamb<Object> zzb;
    private E[] zzc;
    private int zzd;

    static {
        Object[] objArr = new Object[0];
        zza = objArr;
        zzb = new zzamb<>(objArr, 0, false);
    }

    zzamb() {
        this(zza, 0, true);
    }

    private static int zzb(int i4) {
        return Math.max(((i4 * 3) / 2) + 1, 10);
    }

    private final String zzc(int i4) {
        return "Index:" + i4 + ", Size:" + this.zzd;
    }

    public static <E> zzamb<E> zzd() {
        return (zzamb<E>) zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiq, java.util.AbstractList, java.util.List
    public final void add(int i4, E e4) {
        int i5;
        zza();
        if (i4 < 0 || i4 > (i5 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzc(i4));
        }
        E[] eArr = this.zzc;
        if (i5 < eArr.length) {
            System.arraycopy(eArr, i4, eArr, i4 + 1, i5 - i4);
        } else {
            E[] eArr2 = (E[]) new Object[zzb(eArr.length)];
            System.arraycopy(this.zzc, 0, eArr2, 0, i4);
            System.arraycopy(this.zzc, i4, eArr2, i4 + 1, this.zzd - i4);
            this.zzc = eArr2;
        }
        this.zzc[i4] = e4;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i4) {
        zzd(i4);
        return this.zzc[i4];
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiq, java.util.AbstractList, java.util.List
    public final E remove(int i4) {
        zza();
        zzd(i4);
        E[] eArr = this.zzc;
        E e4 = eArr[i4];
        if (i4 < this.zzd - 1) {
            System.arraycopy(eArr, i4 + 1, eArr, i4, (r2 - i4) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return e4;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiq, java.util.AbstractList, java.util.List
    public final E set(int i4, E e4) {
        zza();
        zzd(i4);
        E[] eArr = this.zzc;
        E e5 = eArr[i4];
        eArr[i4] = e4;
        ((AbstractList) this).modCount++;
        return e5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
    public final /* synthetic */ zzakn zza(int i4) {
        if (i4 >= this.zzd) {
            return new zzamb(i4 == 0 ? zza : Arrays.copyOf(this.zzc, i4), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    private zzamb(E[] eArr, int i4, boolean z4) {
        super(z4);
        this.zzc = eArr;
        this.zzd = i4;
    }

    private final void zzd(int i4) {
        if (i4 < 0 || i4 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzc(i4));
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiq, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e4) {
        zza();
        int i4 = this.zzd;
        E[] eArr = this.zzc;
        if (i4 == eArr.length) {
            this.zzc = (E[]) Arrays.copyOf(this.zzc, zzb(eArr.length));
        }
        E[] eArr2 = this.zzc;
        int i5 = this.zzd;
        this.zzd = i5 + 1;
        eArr2[i5] = e4;
        ((AbstractList) this).modCount++;
        return true;
    }
}
