package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzhf implements zzgj {
    private final /* synthetic */ zzhd zzajt;

    zzhf(zzhd zzhdVar) {
        this.zzajt = zzhdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public final void zzh(boolean z) {
        if (z) {
            this.zzajt.connect();
        } else {
            this.zzajt.disconnect();
        }
    }
}
