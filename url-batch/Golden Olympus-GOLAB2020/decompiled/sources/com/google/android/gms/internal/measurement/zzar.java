package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class zzar implements Iterator {
    final /* synthetic */ zzat zza;
    private int zzb = 0;

    zzar(zzat zzatVar) {
        this.zza = zzatVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        zzat zzatVar = this.zza;
        int i4 = this.zzb;
        str = zzatVar.zza;
        return i4 < str.length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        String str;
        zzat zzatVar = this.zza;
        int i4 = this.zzb;
        str = zzatVar.zza;
        if (i4 >= str.length()) {
            throw new NoSuchElementException();
        }
        this.zzb = i4 + 1;
        return new zzat(String.valueOf(i4));
    }
}
