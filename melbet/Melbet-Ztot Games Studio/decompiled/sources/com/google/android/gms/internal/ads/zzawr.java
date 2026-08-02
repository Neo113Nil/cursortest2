package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzawr extends zzaxd {
    public zzawr(zzavp zzavpVar, String str, String str2, zzaro zzaroVar, int i, int i2) {
        super(zzavpVar, "WfvM4SeNDVyFarUKUVpVTE2MRQkjnaN4GpgwC5lMrmyQkCennlTSSkgCAZvzOVXK", "Kq6mcF8LH4HqXGyg5/DR3VvLtDExNTPXoCRIPhkdOGM=", zzaroVar, i, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzaxd
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzcu);
        bool.booleanValue();
        zzauv zzauvVar = new zzauv((String) this.zze.invoke(null, this.zza.zzb(), bool));
        synchronized (this.zzd) {
            this.zzd.zzj(zzauvVar.zza);
            this.zzd.zzC(zzauvVar.zzb);
        }
    }
}
