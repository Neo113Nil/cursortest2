package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
abstract class zzfvz implements Iterator {
    int zzb;
    int zzc;
    int zzd;
    final /* synthetic */ zzfwd zze;

    /* synthetic */ zzfvz(zzfwd zzfwdVar, zzfvy zzfvyVar) {
        int i;
        this.zze = zzfwdVar;
        i = zzfwdVar.zzf;
        this.zzb = i;
        this.zzc = zzfwdVar.zze();
        this.zzd = -1;
    }

    private final void zzb() {
        int i;
        i = this.zze.zzf;
        if (i != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzc >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        zzb();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.zzc;
        this.zzd = i;
        Object zza = zza(i);
        this.zzc = this.zze.zzf(this.zzc);
        return zza;
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzb();
        zzfty.zzj(this.zzd >= 0, "no calls to next() since the last call to remove()");
        this.zzb += 32;
        zzfwd zzfwdVar = this.zze;
        int i = this.zzd;
        Object[] objArr = zzfwdVar.zzb;
        objArr.getClass();
        zzfwdVar.remove(objArr[i]);
        this.zzc--;
        this.zzd = -1;
    }

    abstract Object zza(int i);
}
