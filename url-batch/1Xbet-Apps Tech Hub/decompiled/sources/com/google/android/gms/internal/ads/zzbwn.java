package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbwn extends zzbwp {
    private final String zza;
    private final int zzb;

    public zzbwn(String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzbwn)) {
            zzbwn zzbwnVar = (zzbwn) obj;
            if (Objects.equal(this.zza, zzbwnVar.zza)) {
                if (Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(zzbwnVar.zzb))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final String zzc() {
        return this.zza;
    }
}
