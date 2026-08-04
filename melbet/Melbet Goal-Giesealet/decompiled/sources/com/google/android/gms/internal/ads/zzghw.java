package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
final class zzghw implements zzght {
    private static final zzght zzb = zzghv.zza;
    private final zzgia zza = new zzgia();
    private volatile zzght zzc;
    private Object zzd;

    zzghw(zzght zzghtVar) {
        this.zzc = zzghtVar;
    }

    public final String toString() {
        Object obj = this.zzc;
        if (obj == zzb) {
            String valueOf = String.valueOf(this.zzd);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzght
    public final Object zza() {
        zzght zzghtVar = this.zzc;
        zzght zzghtVar2 = zzb;
        if (zzghtVar != zzghtVar2) {
            synchronized (this.zza) {
                if (this.zzc != zzghtVar2) {
                    Object zza = this.zzc.zza();
                    this.zzd = zza;
                    this.zzc = zzghtVar2;
                    return zza;
                }
            }
        }
        return this.zzd;
    }
}
