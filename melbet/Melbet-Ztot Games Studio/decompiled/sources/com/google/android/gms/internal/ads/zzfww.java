package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
abstract class zzfww implements Iterator {
    int zzb;
    int zzc;
    int zzd;
    final /* synthetic */ zzfxa zze;

    /* synthetic */ zzfww(zzfxa zzfxaVar, zzfwv zzfwvVar) {
        int i;
        this.zze = zzfxaVar;
        i = zzfxaVar.zzf;
        this.zzb = i;
        this.zzc = zzfxaVar.zze();
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
        zzfuu.zzk(this.zzd >= 0, "no calls to next() since the last call to remove()");
        this.zzb += 32;
        int i = this.zzd;
        zzfxa zzfxaVar = this.zze;
        zzfxaVar.remove(zzfxa.zzg(zzfxaVar, i));
        this.zzc--;
        this.zzd = -1;
    }

    abstract Object zza(int i);
}
