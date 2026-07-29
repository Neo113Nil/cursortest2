package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzvu implements zzaoo<zzwb> {
    private final /* synthetic */ zzvs zzbqs;

    zzvu(zzvs zzvsVar) {
        this.zzbqs = zzvsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaoo
    public final /* synthetic */ void zze(zzwb zzwbVar) {
        zzvw zzvwVar;
        zzakb.v("Releasing engine reference.");
        zzvwVar = this.zzbqs.zzbqq;
        zzvwVar.zzma();
    }
}
