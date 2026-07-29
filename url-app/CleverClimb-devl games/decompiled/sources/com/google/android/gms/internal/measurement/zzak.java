package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
final class zzak implements Runnable {
    private final /* synthetic */ zzai zzvc;
    private final /* synthetic */ boolean zzvd;

    zzak(zzai zzaiVar, boolean z) {
        this.zzvc = zzaiVar;
        this.zzvd = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbf zzbfVar;
        zzbfVar = this.zzvc.zzva;
        zzbfVar.zzdi();
    }
}
