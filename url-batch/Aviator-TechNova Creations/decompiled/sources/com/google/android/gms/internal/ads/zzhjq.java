package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzhjq {
    private HashMap zza = new HashMap();

    public final zzhjr zza() {
        if (this.zza == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        zzhjr zzhjrVar = new zzhjr(Collections.unmodifiableMap(this.zza), null);
        this.zza = null;
        return zzhjrVar;
    }
}
