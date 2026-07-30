package com.google.android.gms.measurement.internal;

import androidx.collection.LruCache;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
final class zzfs extends LruCache {
    final /* synthetic */ zzfv zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfs(zzfv zzfvVar, int i8) {
        super(20);
        this.zza = zzfvVar;
    }

    @Override // androidx.collection.LruCache
    protected final /* bridge */ /* synthetic */ Object create(Object obj) {
        String str = (String) obj;
        Preconditions.checkNotEmpty(str);
        return zzfv.zzd(this.zza, str);
    }
}
