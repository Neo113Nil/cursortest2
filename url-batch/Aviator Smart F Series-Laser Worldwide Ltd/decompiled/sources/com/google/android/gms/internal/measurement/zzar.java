package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class zzar implements Iterator {
    final /* synthetic */ zzat zza;
    private int zzb = 0;

    zzar(zzat zzatVar) {
        this.zza = zzatVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int i8 = this.zzb;
        str = this.zza.zza;
        return i8 < str.length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        String str;
        int i8 = this.zzb;
        str = this.zza.zza;
        if (i8 >= str.length()) {
            throw new NoSuchElementException();
        }
        this.zzb = i8 + 1;
        return new zzat(String.valueOf(i8));
    }
}
