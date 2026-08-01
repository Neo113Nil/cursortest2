package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public class zzcrw {
    private final zzctp zza;
    private final View zzb;
    private final zzfdv zzc;
    private final zzcgv zzd;

    public zzcrw(View view, zzcgv zzcgvVar, zzctp zzctpVar, zzfdv zzfdvVar) {
        this.zzb = view;
        this.zzd = zzcgvVar;
        this.zza = zzctpVar;
        this.zzc = zzfdvVar;
    }

    public static final zzdfw zzf(final Context context, final zzcbt zzcbtVar, final zzfdu zzfduVar, final zzfeq zzfeqVar) {
        return new zzdfw(new zzczv() { // from class: com.google.android.gms.internal.ads.zzcru
            @Override // com.google.android.gms.internal.ads.zzczv
            public final void zzr() {
                com.google.android.gms.ads.internal.zzt.zzs().zzn(context, zzcbtVar.zza, zzfduVar.zzD.toString(), zzfeqVar.zzf);
            }
        }, zzcca.zzf);
    }

    public static final Set zzg(zzctg zzctgVar) {
        return Collections.singleton(new zzdfw(zzctgVar, zzcca.zzf));
    }

    public static final zzdfw zzh(zzcte zzcteVar) {
        return new zzdfw(zzcteVar, zzcca.zze);
    }

    public final View zza() {
        return this.zzb;
    }

    public final zzcgv zzb() {
        return this.zzd;
    }

    public final zzctp zzc() {
        return this.zza;
    }

    public zzczt zzd(Set set) {
        return new zzczt(set);
    }

    public final zzfdv zze() {
        return this.zzc;
    }
}
