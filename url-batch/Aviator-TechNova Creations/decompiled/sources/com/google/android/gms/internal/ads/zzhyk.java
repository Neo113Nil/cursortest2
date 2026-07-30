package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzhyk extends zzhyl implements Iterable {
    private final ArrayList zza = new ArrayList();

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof zzhyk) && ((zzhyk) obj).zza.equals(this.zza);
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.zza.iterator();
    }

    public final void zza(zzhyl zzhylVar) {
        this.zza.add(zzhylVar);
    }

    public final int zzb() {
        return this.zza.size();
    }

    public final zzhyl zzc(int i) {
        return (zzhyl) this.zza.get(i);
    }

    @Override // com.google.android.gms.internal.ads.zzhyl
    public final String zzd() {
        ArrayList arrayList = this.zza;
        int size = arrayList.size();
        if (size == 1) {
            return ((zzhyl) arrayList.get(0)).zzd();
        }
        StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 37);
        sb.append("Array must have size 1, but has size ");
        sb.append(size);
        throw new IllegalStateException(sb.toString());
    }
}
