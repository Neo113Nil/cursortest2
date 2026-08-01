package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdfy extends zzddv implements zzavq {
    private final Map zzb;
    private final Context zzc;
    private final zzfdu zzd;

    public zzdfy(Context context, Set set, zzfdu zzfduVar) {
        super(set);
        this.zzb = new WeakHashMap(1);
        this.zzc = context;
        this.zzd = zzfduVar;
    }

    public final synchronized void zza(View view) {
        zzavr zzavrVar = (zzavr) this.zzb.get(view);
        if (zzavrVar == null) {
            zzavr zzavrVar2 = new zzavr(this.zzc, view);
            zzavrVar2.zzc(this);
            this.zzb.put(view, zzavrVar2);
            zzavrVar = zzavrVar2;
        }
        if (this.zzd.zzY) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzbm)).booleanValue()) {
                zzavrVar.zzg(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzbl)).longValue());
                return;
            }
        }
        zzavrVar.zzf();
    }

    public final synchronized void zzb(View view) {
        if (this.zzb.containsKey(view)) {
            ((zzavr) this.zzb.get(view)).zze(this);
            this.zzb.remove(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavq
    public final synchronized void zzbu(final zzavp zzavpVar) {
        zzt(new zzddu() { // from class: com.google.android.gms.internal.ads.zzdfx
            @Override // com.google.android.gms.internal.ads.zzddu
            public final void zza(Object obj) {
                ((zzavq) obj).zzbu(zzavp.this);
            }
        });
    }
}
