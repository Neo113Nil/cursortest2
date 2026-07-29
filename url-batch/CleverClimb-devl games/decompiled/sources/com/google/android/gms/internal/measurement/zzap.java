package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
final class zzap implements Callable<Void> {
    private final /* synthetic */ zzai zzvc;

    zzap(zzai zzaiVar) {
        this.zzvc = zzaiVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Void call() throws Exception {
        zzbf zzbfVar;
        zzbfVar = this.zzvc.zzva;
        zzbfVar.zzdh();
        return null;
    }
}
