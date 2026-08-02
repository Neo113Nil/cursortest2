package com.google.android.gms.internal.games;

import androidx.lifecycle.LifecycleKt$$ExternalSyntheticBackportWithForwarding0;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes3.dex */
public abstract class zzfo {
    private final AtomicReference zza = new AtomicReference();

    protected abstract zzfn zza();

    public final void zzb() {
        zzfn zzfnVar = (zzfn) this.zza.get();
        if (zzfnVar != null) {
            zzfnVar.zzd();
        }
    }

    public final void zzc(String str, int i) {
        zzfn zzfnVar = (zzfn) this.zza.get();
        if (zzfnVar == null) {
            zzfn zza = zza();
            AtomicReference atomicReference = this.zza;
            while (true) {
                if (LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, null, zza)) {
                    zzfnVar = zza;
                    break;
                } else if (atomicReference.get() != null) {
                    zzfnVar = (zzfn) this.zza.get();
                    break;
                }
            }
        }
        zzfnVar.zzc(str, i);
    }
}
