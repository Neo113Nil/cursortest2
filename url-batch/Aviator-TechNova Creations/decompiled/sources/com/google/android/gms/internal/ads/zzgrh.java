package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* loaded from: classes3.dex */
final class zzgrh extends zzgra {
    private final Object zza;

    zzgrh(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgrh) {
            return this.zza.equals(((zzgrh) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        String obj = this.zza.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 13);
        sb.append("Optional.of(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgra
    public final Object zza(Object obj) {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgra
    public final zzgra zzb(zzgqt zzgqtVar) {
        Object apply = zzgqtVar.apply(this.zza);
        zzgrc.zzk(apply, "the Function passed to Optional.transform() must not return null.");
        return new zzgrh(apply);
    }
}
