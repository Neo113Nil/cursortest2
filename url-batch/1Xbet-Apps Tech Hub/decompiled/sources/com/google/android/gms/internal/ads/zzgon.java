package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgon {
    private HashMap zza = new HashMap();

    public final zzgop zza() {
        if (this.zza == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        zzgop zzgopVar = new zzgop(Collections.unmodifiableMap(this.zza), null);
        this.zza = null;
        return zzgopVar;
    }
}
