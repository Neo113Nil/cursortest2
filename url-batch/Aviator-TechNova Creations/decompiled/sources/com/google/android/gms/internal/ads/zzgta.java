package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzgta extends zzgvz implements Serializable {
    final zzgqt zza;
    final zzgvz zzb;

    zzgta(zzgqt zzgqtVar, zzgvz zzgvzVar) {
        this.zza = zzgqtVar;
        this.zzb = zzgvzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgvz, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        zzgqt zzgqtVar = this.zza;
        return this.zzb.compare(zzgqtVar.apply(obj), zzgqtVar.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgta) {
            zzgta zzgtaVar = (zzgta) obj;
            if (this.zza.equals(zzgtaVar.zza) && this.zzb.equals(zzgtaVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        String obj = this.zzb.toString();
        int length = obj.length();
        String obj2 = this.zza.toString();
        StringBuilder sb = new StringBuilder(length + 12 + obj2.length() + 1);
        sb.append(obj);
        sb.append(".onResultOf(");
        sb.append(obj2);
        sb.append(")");
        return sb.toString();
    }
}
