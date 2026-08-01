package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzauo extends zzaux {
    private final boolean zzi;

    public zzauo(zzatj zzatjVar, String str, String str2, zzapg zzapgVar, int i, int i2) {
        super(zzatjVar, "geU/I/uTOXqxXXxxH3B6ynfHIlx2RWpE/VU5AsRbtoXFRkvhLNXNLZCaFDUfdv6y", "1ZhioNexfONxLbr8oNixHPTbX/qv3RsJiyYoeeb0m+g=", zzapgVar, i, 61);
        this.zzi = zzatjVar.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.zzf.invoke(null, this.zzb.zzb(), Boolean.valueOf(this.zzi))).longValue();
        synchronized (this.zze) {
            this.zze.zzE(longValue);
        }
    }
}
