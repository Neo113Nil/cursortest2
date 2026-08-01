package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzlp implements zzlg {
    public final zzuf zza;
    public int zzd;
    public boolean zze;
    public final List zzc = new ArrayList();
    public final Object zzb = new Object();

    public zzlp(zzum zzumVar, boolean z) {
        this.zza = new zzuf(zzumVar, z);
    }

    @Override // com.google.android.gms.internal.ads.zzlg
    public final zzda zza() {
        return this.zza.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzlg
    public final Object zzb() {
        return this.zzb;
    }

    public final void zzc(int i) {
        this.zzd = i;
        this.zze = false;
        this.zzc.clear();
    }
}
