package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final /* synthetic */ class zzza implements zzdf {
    static final /* synthetic */ zzza zza = new zzza();

    private /* synthetic */ zzza() {
    }

    @Override // com.google.android.gms.internal.ads.zzdf
    public final /* synthetic */ void zza(Object obj) {
        ((ExecutorService) obj).shutdown();
    }
}
