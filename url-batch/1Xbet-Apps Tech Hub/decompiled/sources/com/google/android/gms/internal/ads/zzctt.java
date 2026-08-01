package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzctt implements zzctu {
    private final Map zza;

    zzctt(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzctu
    public final zzefv zza(int i, String str) {
        return (zzefv) this.zza.get(str);
    }
}
