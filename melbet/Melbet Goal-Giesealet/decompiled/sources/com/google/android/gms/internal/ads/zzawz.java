package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzawz extends zzaxl {
    public zzawz(zzavx zzavxVar, String str, String str2, zzarw zzarwVar, int i, int i2) {
        super(zzavxVar, "8W5EiIZWvw8ca0gdEf2baMelwD0v1LgWFEv6AqIRDGIzRlZJKgzzVYcusXATxgKN", "ZXwHOojdfPkjtU4/T1kRX8Zucxdzz/LL+/XimOcPDrc=", zzarwVar, i, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzaxl
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        zzavd zzavdVar = new zzavd((String) this.zze.invoke(null, this.zza.zzb(), Boolean.valueOf(((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzdm)).booleanValue())));
        zzarw zzarwVar = this.zzd;
        synchronized (zzarwVar) {
            zzarwVar.zzc(zzavdVar.zza);
            zzarwVar.zzP(zzavdVar.zzb);
        }
    }
}
