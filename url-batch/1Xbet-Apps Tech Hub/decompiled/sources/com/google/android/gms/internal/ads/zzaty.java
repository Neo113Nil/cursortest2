package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzaty extends zzaux {
    public zzaty(zzatj zzatjVar, String str, String str2, zzapg zzapgVar, int i, int i2) {
        super(zzatjVar, "ZHFOx+FjaOsul7gEkIcfA8auDnyRWXmT0qbiHVEO6U1RLulNSOFK3tPEgm+pvQxr", "RSyr2AK130nKbepDTsaNV0Uv17TWUb4O6ebIiV3GgVs=", zzapgVar, i, 5);
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzm(-1L);
        this.zze.zzl(-1L);
        int[] iArr = (int[]) this.zzf.invoke(null, this.zzb.zzb());
        synchronized (this.zze) {
            this.zze.zzm(iArr[0]);
            this.zze.zzl(iArr[1]);
            int i = iArr[2];
            if (i != Integer.MIN_VALUE) {
                this.zze.zzk(i);
            }
        }
    }
}
