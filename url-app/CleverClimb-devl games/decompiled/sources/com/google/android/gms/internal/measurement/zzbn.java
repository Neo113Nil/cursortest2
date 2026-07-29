package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
final class zzbn implements Callable<String> {
    private final /* synthetic */ zzbl zzxo;

    zzbn(zzbl zzblVar) {
        this.zzxo = zzblVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() throws Exception {
        String zzdq;
        zzdq = this.zzxo.zzdq();
        return zzdq;
    }
}
