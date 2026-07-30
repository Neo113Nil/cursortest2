package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public interface zzaeu {
    boolean zza(zzaev zzaevVar) throws IOException;

    default List zzb() {
        return zzguf.zzi();
    }

    void zzc(zzaex zzaexVar);

    int zzd(zzaev zzaevVar, zzafv zzafvVar) throws IOException;

    void zze(long j, long j2);

    void zzf();

    @SideEffectFree
    default zzaeu zzg() {
        return this;
    }
}
