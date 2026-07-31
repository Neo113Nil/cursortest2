package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class zzamj implements Iterator {
    private int zza;
    private Iterator zzb;
    private final /* synthetic */ zzamh zzc;

    private final Iterator zza() {
        Map map;
        if (this.zzb == null) {
            map = this.zzc.zzf;
            this.zzb = map.entrySet().iterator();
        }
        return this.zzb;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i4;
        int i5 = this.zza;
        if (i5 > 0) {
            i4 = this.zzc.zzb;
            if (i5 <= i4) {
                return true;
            }
        }
        return zza().hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Object[] objArr;
        if (zza().hasNext()) {
            return (Map.Entry) zza().next();
        }
        objArr = this.zzc.zza;
        int i4 = this.zza - 1;
        this.zza = i4;
        return (zzaml) objArr[i4];
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    private zzamj(zzamh zzamhVar) {
        int i4;
        this.zzc = zzamhVar;
        i4 = zzamhVar.zzb;
        this.zza = i4;
    }
}
