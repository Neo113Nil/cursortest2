package com.google.android.gms.internal.fitness;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
abstract class zzfh extends zzfu {
    private final int zza;
    private int zzb;

    protected zzfh(int i8, int i9) {
        zzff.zzb(i9, i8, "index");
        this.zza = i8;
        this.zzb = i9;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.zzb < this.zza;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.zzb > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i8 = this.zzb;
        this.zzb = i8 + 1;
        return zza(i8);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.zzb;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i8 = this.zzb - 1;
        this.zzb = i8;
        return zza(i8);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.zzb - 1;
    }

    protected abstract Object zza(int i8);
}
