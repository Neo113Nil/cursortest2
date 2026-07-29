package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzabu implements Runnable {
    private final /* synthetic */ zzajh zzaam;
    private final /* synthetic */ zzabt zzbzw;

    zzabu(zzabt zzabtVar, zzajh zzajhVar) {
        this.zzbzw = zzabtVar;
        this.zzaam = zzajhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzabm zzabmVar;
        zzabmVar = this.zzbzw.zzbzd;
        zzabmVar.zzb(this.zzaam);
    }
}
