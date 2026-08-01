package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgdk {
    private final ConcurrentMap zza;
    private final List zzb;
    private final zzgdg zzc;
    private final Class zzd;
    private final zzgop zze;

    /* synthetic */ zzgdk(ConcurrentMap concurrentMap, List list, zzgdg zzgdgVar, zzgop zzgopVar, Class cls, zzgdj zzgdjVar) {
        this.zza = concurrentMap;
        this.zzb = list;
        this.zzc = zzgdgVar;
        this.zzd = cls;
        this.zze = zzgopVar;
    }

    @Nullable
    public final zzgdg zza() {
        return this.zzc;
    }

    public final zzgop zzb() {
        return this.zze;
    }

    public final Class zzc() {
        return this.zzd;
    }

    public final Collection zzd() {
        return this.zza.values();
    }

    public final List zze(byte[] bArr) {
        List list = (List) this.zza.get(new zzgdi(bArr, null));
        return list != null ? list : Collections.emptyList();
    }

    public final boolean zzf() {
        return !this.zze.zza().isEmpty();
    }
}
