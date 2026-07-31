package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzhq implements Iterator {
    final /* synthetic */ zzht zza;
    private int zzb;
    private boolean zzc;
    private Iterator zzd;

    /* synthetic */ zzhq(zzht zzhtVar, zzhs zzhsVar) {
        Objects.requireNonNull(zzhtVar);
        this.zza = zzhtVar;
        this.zzb = -1;
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
        zzht zzhtVar = this.zza;
        i4 = zzhtVar.zzb;
        if (i5 < i4) {
            return true;
        }
        map = zzhtVar.zzc;
        return !map.isEmpty() && zza().hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i4;
        Object[] objArr;
        this.zzc = true;
        int i5 = this.zzb + 1;
        this.zzb = i5;
        zzht zzhtVar = this.zza;
        i4 = zzhtVar.zzb;
        if (i5 >= i4) {
            return (Map.Entry) zza().next();
        }
        objArr = zzhtVar.zza;
        return (zzhp) objArr[i5];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i4;
        if (!this.zzc) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        zzht zzhtVar = this.zza;
        zzhtVar.zzo();
        int i5 = this.zzb;
        i4 = zzhtVar.zzb;
        if (i5 >= i4) {
            zza().remove();
        } else {
            this.zzb = i5 - 1;
            zzhtVar.zzm(i5);
        }
    }
}
