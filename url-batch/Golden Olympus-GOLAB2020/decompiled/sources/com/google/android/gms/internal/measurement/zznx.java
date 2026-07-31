package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class zznx implements Iterator {
    final /* synthetic */ zzoa zza;
    private int zzb = -1;
    private boolean zzc;
    private Iterator zzd;

    /* synthetic */ zznx(zzoa zzoaVar, zznz zznzVar) {
        this.zza = zzoaVar;
    }

    private final Iterator zza() {
        Map map;
        if (this.zzd == null) {
            map = this.zza.zzc;
            this.zzd = map.entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i4;
        Map map;
        int i5 = this.zzb + 1;
        zzoa zzoaVar = this.zza;
        i4 = zzoaVar.zzb;
        if (i5 < i4) {
            return true;
        }
        map = zzoaVar.zzc;
        return !map.isEmpty() && zza().hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i4;
        Object[] objArr;
        this.zzc = true;
        int i5 = this.zzb + 1;
        this.zzb = i5;
        zzoa zzoaVar = this.zza;
        i4 = zzoaVar.zzb;
        if (i5 >= i4) {
            return (Map.Entry) zza().next();
        }
        objArr = zzoaVar.zza;
        return (zznw) objArr[i5];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i4;
        if (!this.zzc) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        zzoa zzoaVar = this.zza;
        zzoaVar.zzo();
        int i5 = this.zzb;
        i4 = zzoaVar.zzb;
        if (i5 >= i4) {
            zza().remove();
        } else {
            this.zzb = i5 - 1;
            zzoaVar.zzm(i5);
        }
    }
}
