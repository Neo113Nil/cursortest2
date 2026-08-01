package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzauq extends zzaux {
    public zzauq(zzatj zzatjVar, String str, String str2, zzapg zzapgVar, int i, int i2) {
        super(zzatjVar, "4/SMeJXpDEQUjIN8ctjvaq+191KHQFpFbvfik3xx/Qb+eWbRMHKpllc1rI0p7EXQ", "Jz2tk/JKeGJKcc4wwXH5Pf6ZM64fYgV4wWxByPOgNQE=", zzapgVar, i, 51);
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        synchronized (this.zze) {
            zzate zzateVar = new zzate((String) this.zzf.invoke(null, new Object[0]));
            this.zze.zzp(zzateVar.zza.longValue());
            this.zze.zzq(zzateVar.zzb.longValue());
        }
    }
}
