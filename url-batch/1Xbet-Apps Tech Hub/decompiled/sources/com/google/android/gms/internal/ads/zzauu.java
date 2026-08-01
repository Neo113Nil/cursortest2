package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzauu extends zzaux {
    private final View zzi;

    public zzauu(zzatj zzatjVar, String str, String str2, zzapg zzapgVar, int i, int i2, View view) {
        super(zzatjVar, "0+zdyC6VPJhTjPaEoqOWHTMOFQN+wcQzU7Oc0uK1pdETw1P+GgKsW//19LiWUDiB", "beFEMZ/YBSUug4MSXb2BKymKiM6ZxOOlxExWa37jMlM=", zzapgVar, i, 57);
        this.zzi = view;
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzi != null) {
            Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzdi);
            Boolean bool2 = (Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzkh);
            zzatn zzatnVar = new zzatn((String) this.zzf.invoke(null, this.zzi, this.zzb.zzb().getResources().getDisplayMetrics(), bool, bool2));
            zzaqb zza = zzaqc.zza();
            zza.zzb(zzatnVar.zza.longValue());
            zza.zzd(zzatnVar.zzb.longValue());
            zza.zze(zzatnVar.zzc.longValue());
            if (bool2.booleanValue()) {
                zza.zzc(zzatnVar.zze.longValue());
            }
            if (bool.booleanValue()) {
                zza.zza(zzatnVar.zzd.longValue());
            }
            this.zze.zzY((zzaqc) zza.zzal());
        }
    }
}
