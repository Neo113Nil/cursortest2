package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* loaded from: classes3.dex */
final class zzgrx implements zzgru {
    private static final zzgru zzb = zzgrw.zza;
    private final zzgsb zza = new zzgsb();
    private volatile zzgru zzc;
    private Object zzd;

    zzgrx(zzgru zzgruVar) {
        this.zzc = zzgruVar;
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

    @Override // com.google.android.gms.internal.ads.zzgru
    public final Object zza() {
        zzgru zzgruVar = this.zzc;
        zzgru zzgruVar2 = zzb;
        if (zzgruVar != zzgruVar2) {
            synchronized (this.zza) {
                if (this.zzc != zzgruVar2) {
                    Object zza = this.zzc.zza();
                    this.zzd = zza;
                    this.zzc = zzgruVar2;
                    return zza;
                }
            }
        }
        return this.zzd;
    }
}
