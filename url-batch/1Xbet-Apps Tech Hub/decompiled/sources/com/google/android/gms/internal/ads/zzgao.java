package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzgao extends zzgaa {

    @CheckForNull
    private zzgan zza;

    zzgao(zzfwp zzfwpVar, boolean z, Executor executor, Callable callable) {
        super(zzfwpVar, z, false);
        this.zza = new zzgam(this, callable, executor);
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzgaa
    final void zzf(int i, @CheckForNull Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    protected final void zzq() {
        zzgan zzganVar = this.zza;
        if (zzganVar != null) {
            zzganVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgaa
    final void zzu() {
        zzgan zzganVar = this.zza;
        if (zzganVar != null) {
            zzganVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgaa
    final void zzy(int i) {
        super.zzy(i);
        if (i == 1) {
            this.zza = null;
        }
    }
}
