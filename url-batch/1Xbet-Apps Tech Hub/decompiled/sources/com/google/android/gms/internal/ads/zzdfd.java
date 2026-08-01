package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdfd extends zzddv implements zzdff {
    public zzdfd(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzdff
    public final void zza(String str) {
        final String str2 = "MalformedJson";
        zzt(new zzddu(str2) { // from class: com.google.android.gms.internal.ads.zzdex
            public final /* synthetic */ String zza = "MalformedJson";

            @Override // com.google.android.gms.internal.ads.zzddu
            public final void zza(Object obj) {
                ((zzdff) obj).zza(this.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdff
    public final void zzb(final String str, final String str2) {
        zzt(new zzddu() { // from class: com.google.android.gms.internal.ads.zzdfa
            @Override // com.google.android.gms.internal.ads.zzddu
            public final void zza(Object obj) {
                ((zzdff) obj).zzb(str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdff
    public final void zzc(final String str) {
        zzt(new zzddu() { // from class: com.google.android.gms.internal.ads.zzdez
            @Override // com.google.android.gms.internal.ads.zzddu
            public final void zza(Object obj) {
                ((zzdff) obj).zzc(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdff
    public final void zzd(final String str) {
        zzt(new zzddu() { // from class: com.google.android.gms.internal.ads.zzdfb
            @Override // com.google.android.gms.internal.ads.zzddu
            public final void zza(Object obj) {
                ((zzdff) obj).zzd(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdff
    public final void zze() {
        zzt(new zzddu() { // from class: com.google.android.gms.internal.ads.zzdfc
            @Override // com.google.android.gms.internal.ads.zzddu
            public final void zza(Object obj) {
                ((zzdff) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdff
    public final void zzf() {
        zzt(new zzddu() { // from class: com.google.android.gms.internal.ads.zzdey
            @Override // com.google.android.gms.internal.ads.zzddu
            public final void zza(Object obj) {
                ((zzdff) obj).zzf();
            }
        });
    }
}
