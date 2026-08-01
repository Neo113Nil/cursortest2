package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzxx {
    public final zzdc zza;
    public final int[] zzb;

    public zzxx(zzdc zzdcVar, int[] iArr, int i) {
        if (iArr.length == 0) {
            zzez.zzd("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.zza = zzdcVar;
        this.zzb = iArr;
    }
}
