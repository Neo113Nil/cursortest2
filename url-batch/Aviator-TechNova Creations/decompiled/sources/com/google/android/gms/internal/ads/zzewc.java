package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzewc implements zzikg {
    public static zzewc zza() {
        return zzewb.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* synthetic */ Object zzb() {
        List arrayList = new ArrayList();
        zzbgv zzbgvVar = zzbhe.zzni;
        if (!((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).isEmpty()) {
            arrayList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).split(","));
        }
        zziko.zzb(arrayList);
        return arrayList;
    }
}
