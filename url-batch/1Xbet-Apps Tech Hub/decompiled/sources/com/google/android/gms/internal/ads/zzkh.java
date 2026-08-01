package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzkh implements zzlg {
    private final Object zza;
    private final zzum zzb;
    private zzda zzc;

    public zzkh(Object obj, zzuf zzufVar) {
        this.zza = obj;
        this.zzb = zzufVar;
        this.zzc = zzufVar.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzlg
    public final zzda zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzlg
    public final Object zzb() {
        return this.zza;
    }

    public final void zzc(zzda zzdaVar) {
        this.zzc = zzdaVar;
    }
}
