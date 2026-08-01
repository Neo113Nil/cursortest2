package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzaul extends zzaux {
    public zzaul(zzatj zzatjVar, String str, String str2, zzapg zzapgVar, int i, int i2) {
        super(zzatjVar, "zmLnsak1Fo/LHy30EeWswBCxcOoFKuH08l3DkSTUgzb476o6nI+C8ZUC+d8tLJwZ", "sK9i540XcONymgaiZVMKYXr1VbNcwMhjwo2LFhhSCFg=", zzapgVar, i, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        zzasp zzaspVar = new zzasp((String) this.zzf.invoke(null, this.zzb.zzb(), Boolean.valueOf(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzcy)).booleanValue())));
        synchronized (this.zze) {
            this.zze.zzj(zzaspVar.zza);
            this.zze.zzC(zzaspVar.zzb);
        }
    }
}
