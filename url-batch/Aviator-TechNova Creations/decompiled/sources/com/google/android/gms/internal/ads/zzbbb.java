package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzbbb extends zzbby {
    private final long zzh;

    public zzbbb(zzbak zzbakVar, String str, String str2, zzawg zzawgVar, long j, int i, int i2) {
        super(zzbakVar, "KS95o7MbZWIdKuBkGY5EucArwEmarpDzvrPJlr4r6NTEwXHZ52g0Gof8SUaYNmWh", "sZhcPfATNezp7ZcisFX7I2sqsKQPBRrUcm6y3tpw6ig=", zzawgVar, i, 25);
        this.zzh = j;
    }

    @Override // com.google.android.gms.internal.ads.zzbby
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.zze.invoke(null, new Object[0])).longValue();
        zzawg zzawgVar = this.zzd;
        synchronized (zzawgVar) {
            zzawgVar.zzac(longValue);
            long j = this.zzh;
            if (j != 0) {
                zzawgVar.zzk(longValue - j);
                zzawgVar.zzn(j);
            }
        }
    }
}
