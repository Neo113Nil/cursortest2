package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzfrc extends zzfzp {
    Object zza;

    zzfrc(Object obj, Runnable runnable) {
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final String zza() {
        Object obj = this.zza;
        return obj == null ? "" : obj.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    protected final void zzb() {
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final boolean zzc(Object obj) {
        return super.zzc(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final boolean zzd(Throwable th) {
        return super.zzd(th);
    }
}
