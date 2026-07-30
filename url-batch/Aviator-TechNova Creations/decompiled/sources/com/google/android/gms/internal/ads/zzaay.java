package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final /* synthetic */ class zzaay implements zzdr {
    static final /* synthetic */ zzaay zza = new zzaay();

    private /* synthetic */ zzaay() {
    }

    @Override // com.google.android.gms.internal.ads.zzdr
    public final /* synthetic */ void zza(Object obj) {
        ((ExecutorService) obj).shutdown();
    }
}
