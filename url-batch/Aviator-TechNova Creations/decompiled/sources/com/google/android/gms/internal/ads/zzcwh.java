package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzcwh implements zzcwi {
    private final Map zza;

    zzcwh(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    public final zzekg zza(int i, String str) {
        return (zzekg) this.zza.get(str);
    }
}
