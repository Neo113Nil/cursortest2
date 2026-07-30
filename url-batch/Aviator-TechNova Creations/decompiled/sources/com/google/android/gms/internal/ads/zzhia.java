package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzhia implements zzhic {
    private final AtomicBoolean zza = new AtomicBoolean(false);

    zzhia(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzhic
    public final boolean zza() {
        return this.zza.get();
    }
}
