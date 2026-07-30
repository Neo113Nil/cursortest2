package com.google.android.gms.internal.ads;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzfza {
    private final zzfyw zza;

    public final /* synthetic */ zzfyy zza() {
        zzibr zzbu = this.zza.zzbu();
        Intrinsics.checkNotNullExpressionValue(zzbu, "build(...)");
        return (zzfyy) zzbu;
    }

    public final /* synthetic */ zziev zzb() {
        Map zzb = this.zza.zzb();
        Intrinsics.checkNotNullExpressionValue(zzb, "getQueryIdToAdQualityDataMapMap(...)");
        return new zziev(zzb);
    }

    public final void zzc(zziev zzievVar, String key, zzfyu value) {
        Intrinsics.checkNotNullParameter(zzievVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.zza.zzc(key, value);
    }

    public final /* synthetic */ void zzd(zziev zzievVar, String key) {
        Intrinsics.checkNotNullParameter(zzievVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        this.zza.zza(key);
    }
}
