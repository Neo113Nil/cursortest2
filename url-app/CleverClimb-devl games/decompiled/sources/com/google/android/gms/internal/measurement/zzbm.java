package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
final class zzbm implements Callable<String> {
    private final /* synthetic */ zzbl zzxo;

    zzbm(zzbl zzblVar) {
        this.zzxo = zzblVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() throws Exception {
        return this.zzxo.zzdp();
    }
}
