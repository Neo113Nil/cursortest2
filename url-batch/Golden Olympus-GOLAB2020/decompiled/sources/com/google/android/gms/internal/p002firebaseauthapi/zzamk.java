package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class zzamk implements Iterator {
    private int zza;
    private boolean zzb;
    private Iterator zzc;
    private final /* synthetic */ zzamh zzd;

    private final Iterator zza() {
        Map map;
        if (this.zzc == null) {
            map = this.zzd.zzc;
            this.zzc = map.entrySet().iterator();
        }
        return this.zzc;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i4;
        Map map;
        int i5 = this.zza + 1;
        i4 = this.zzd.zzb;
        if (i5 >= i4) {
            map = this.zzd.zzc;
            if (map.isEmpty() || !zza().hasNext()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        int i4;
        Object[] objArr;
        this.zzb = true;
        int i5 = this.zza + 1;
        this.zza = i5;
        i4 = this.zzd.zzb;
        if (i5 >= i4) {
            return (Map.Entry) zza().next();
        }
        objArr = this.zzd.zza;
        return (zzaml) objArr[this.zza];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i4;
        if (!this.zzb) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzb = false;
        this.zzd.zzg();
        int i5 = this.zza;
        i4 = this.zzd.zzb;
        if (i5 >= i4) {
            zza().remove();
            return;
        }
        zzamh zzamhVar = this.zzd;
        int i6 = this.zza;
        this.zza = i6 - 1;
        zzamhVar.zzb(i6);
    }

    private zzamk(zzamh zzamhVar) {
        this.zzd = zzamhVar;
        this.zza = -1;
    }
}
