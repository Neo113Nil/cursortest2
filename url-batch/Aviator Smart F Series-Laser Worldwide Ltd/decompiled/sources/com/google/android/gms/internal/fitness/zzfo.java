package com.google.android.gms.internal.fitness;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class zzfo extends zzft {
    boolean zza;
    final /* synthetic */ Object zzb;

    zzfo(Object obj) {
        this.zzb = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.zza;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.zza) {
            throw new NoSuchElementException();
        }
        this.zza = true;
        return this.zzb;
    }
}
