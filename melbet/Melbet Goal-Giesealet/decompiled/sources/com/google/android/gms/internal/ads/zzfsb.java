package com.google.android.gms.internal.ads;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzfsb {
    private final zzfrx zza;

    public final /* synthetic */ zzfrz zza() {
        zzhih zzbu = this.zza.zzbu();
        Intrinsics.checkNotNullExpressionValue(zzbu, "build(...)");
        return (zzfrz) zzbu;
    }

    public final /* synthetic */ zzhll zzb() {
        Map zzb = this.zza.zzb();
        Intrinsics.checkNotNullExpressionValue(zzb, "getQueryIdToAdQualityDataMapMap(...)");
        return new zzhll(zzb);
    }

    public final void zzc(zzhll zzhllVar, String key, zzfrv value) {
        Intrinsics.checkNotNullParameter(zzhllVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.zza.zzc(key, value);
    }

    public final /* synthetic */ void zzd(zzhll zzhllVar, String key) {
        Intrinsics.checkNotNullParameter(zzhllVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        this.zza.zza(key);
    }
}
