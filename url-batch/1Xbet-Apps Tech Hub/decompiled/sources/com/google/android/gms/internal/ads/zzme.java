package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
@Deprecated
/* loaded from: classes2.dex */
public final class zzme {
    private final zzjc zza;

    @Deprecated
    public zzme(Context context, zzcgf zzcgfVar) {
        this.zza = new zzjc(context, zzcgfVar);
    }

    @Deprecated
    public final zzme zza(final zzkw zzkwVar) {
        zzjc zzjcVar = this.zza;
        zzef.zzf(!zzjcVar.zzq);
        zzkwVar.getClass();
        zzjcVar.zzf = new zzfuo() { // from class: com.google.android.gms.internal.ads.zziu
            @Override // com.google.android.gms.internal.ads.zzfuo
            public final Object zza() {
                return zzkw.this;
            }
        };
        return this;
    }

    @Deprecated
    public final zzme zzb(final zzye zzyeVar) {
        zzjc zzjcVar = this.zza;
        zzef.zzf(!zzjcVar.zzq);
        zzyeVar.getClass();
        zzjcVar.zze = new zzfuo() { // from class: com.google.android.gms.internal.ads.zzjb
            @Override // com.google.android.gms.internal.ads.zzfuo
            public final Object zza() {
                return zzye.this;
            }
        };
        return this;
    }

    @Deprecated
    public final zzmf zzc() {
        zzjc zzjcVar = this.zza;
        zzef.zzf(!zzjcVar.zzq);
        zzjcVar.zzq = true;
        return new zzmf(zzjcVar);
    }
}
