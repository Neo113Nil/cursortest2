package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
final class zzghu implements Serializable, zzght {
    final zzght zza;
    volatile transient boolean zzb;
    transient Object zzc;
    private final transient zzgia zzd = new zzgia();

    zzghu(zzght zzghtVar) {
        this.zza = zzghtVar;
    }

    public final String toString() {
        Object obj;
        if (this.zzb) {
            String valueOf = String.valueOf(this.zzc);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        } else {
            obj = this.zza;
        }
        String obj2 = obj.toString();
        StringBuilder sb2 = new StringBuilder(obj2.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(obj2);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzght
    public final Object zza() {
        if (!this.zzb) {
            synchronized (this.zzd) {
                if (!this.zzb) {
                    Object zza = this.zza.zza();
                    this.zzc = zza;
                    this.zzb = true;
                    return zza;
                }
            }
        }
        return this.zzc;
    }
}
