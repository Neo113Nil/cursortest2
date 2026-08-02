package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes3.dex */
final class zzhak implements Iterator {
    final /* synthetic */ zzhao zza;
    private int zzb = -1;
    private boolean zzc;
    private Iterator zzd;

    /* synthetic */ zzhak(zzhao zzhaoVar, zzhaj zzhajVar) {
        this.zza = zzhaoVar;
    }

    private final Iterator zza() {
        Map map;
        if (this.zzd == null) {
            map = this.zza.zzb;
            this.zzd = map.entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i = this.zzb + 1;
        list = this.zza.zza;
        if (i < list.size()) {
            return true;
        }
        map = this.zza.zzb;
        return !map.isEmpty() && zza().hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        List list;
        List list2;
        this.zzc = true;
        int i = this.zzb + 1;
        this.zzb = i;
        list = this.zza.zza;
        if (i >= list.size()) {
            return (Map.Entry) zza().next();
        }
        list2 = this.zza.zza;
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
        int i = this.zzb;
        list = this.zza.zza;
        if (i >= list.size()) {
            zza().remove();
            return;
        }
        zzhao zzhaoVar = this.zza;
        int i2 = this.zzb;
        this.zzb = i2 - 1;
        zzhaoVar.zzl(i2);
    }
}
