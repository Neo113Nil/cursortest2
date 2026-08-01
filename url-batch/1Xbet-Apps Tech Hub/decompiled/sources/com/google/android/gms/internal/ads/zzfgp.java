package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfgp implements zzfgn {
    private final String zza;

    public zzfgp(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfgn
    public final boolean equals(Object obj) {
        if (obj instanceof zzfgp) {
            return this.zza.equals(((zzfgp) obj).zza);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfgn
    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza;
    }
}
