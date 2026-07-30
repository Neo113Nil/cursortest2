package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzddq extends zzdhd implements com.google.android.gms.ads.internal.overlay.zzr {
    public zzddq(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdS() {
        zzs(zzddi.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdT(final int i) {
        zzs(new zzdhc() { // from class: com.google.android.gms.internal.ads.zzddp
            @Override // com.google.android.gms.internal.ads.zzdhc
            public final /* synthetic */ void zza(Object obj) {
                ((com.google.android.gms.ads.internal.overlay.zzr) obj).zzdT(i);
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
        zzs(zzddf.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
        zzs(zzddg.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
        zzs(zzddh.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdv() {
        zzs(zzddj.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdw() {
        zzs(zzddk.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdx() {
        zzs(zzddl.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdy() {
        zzs(zzddm.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdz() {
        zzs(zzddn.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzh() {
        zzs(zzddo.zza);
    }
}
