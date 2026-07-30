package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzgth extends AbstractSet {
    final /* synthetic */ zzgtm zza;

    /* synthetic */ zzgth(zzgtm zzgtmVar, byte[] bArr) {
        Objects.requireNonNull(zzgtmVar);
        this.zza = zzgtmVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        zzgtm zzgtmVar = this.zza;
        Map zzc = zzgtmVar.zzc();
        if (zzc != null) {
            return zzc.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int zzi = zzgtmVar.zzi(entry.getKey());
            if (zzi != -1 && Objects.equals(zzgtmVar.zzp(zzi), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzgtm zzgtmVar = this.zza;
        Map zzc = zzgtmVar.zzc();
        return zzc != null ? zzc.entrySet().iterator() : new zzgtf(zzgtmVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int zzh;
        int zze;
        zzgtm zzgtmVar = this.zza;
        Map zzc = zzgtmVar.zzc();
        if (zzc != null) {
            return zzc.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (zzgtmVar.zzb() || (zze = zzgtn.zze(entry.getKey(), entry.getValue(), (zzh = zzgtmVar.zzh()), zzgtmVar.zzk(), zzgtmVar.zzl(), zzgtmVar.zzm(), zzgtmVar.zzn())) == -1) {
            return false;
        }
        zzgtmVar.zze(zze, zzh);
        zzgtmVar.zzu(zzgtmVar.zzt() - 1);
        zzgtmVar.zzd();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
