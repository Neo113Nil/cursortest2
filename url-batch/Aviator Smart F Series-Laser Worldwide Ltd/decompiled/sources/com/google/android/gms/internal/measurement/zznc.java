package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class zznc implements Iterator {
    final /* synthetic */ zzng zza;
    private int zzb = -1;
    private boolean zzc;
    private Iterator zzd;

    /* synthetic */ zznc(zzng zzngVar, zznb zznbVar) {
        this.zza = zzngVar;
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
        List list;
        Map map;
        int i8 = this.zzb + 1;
        list = this.zza.zzb;
        if (i8 < list.size()) {
            return true;
        }
        map = this.zza.zzc;
        return !map.isEmpty() && zza().hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        List list;
        List list2;
        this.zzc = true;
        int i8 = this.zzb + 1;
        this.zzb = i8;
        list = this.zza.zzb;
        if (i8 >= list.size()) {
            return (Map.Entry) zza().next();
        }
        list2 = this.zza.zzb;
        return (Map.Entry) list2.get(this.zzb);
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (!this.zzc) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        this.zza.zzn();
        int i8 = this.zzb;
        list = this.zza.zzb;
        if (i8 >= list.size()) {
            zza().remove();
            return;
        }
        zzng zzngVar = this.zza;
        int i9 = this.zzb;
        this.zzb = i9 - 1;
        zzngVar.zzl(i9);
    }
}
