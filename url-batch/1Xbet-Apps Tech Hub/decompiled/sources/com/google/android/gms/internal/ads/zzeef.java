package com.google.android.gms.internal.ads;

import android.app.Activity;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzeef extends zzefb {
    private Activity zza;
    private com.google.android.gms.ads.internal.overlay.zzl zzb;
    private String zzc;
    private String zzd;

    zzeef() {
    }

    @Override // com.google.android.gms.internal.ads.zzefb
    public final zzefb zza(Activity activity) {
        if (activity == null) {
            throw new NullPointerException("Null activity");
        }
        this.zza = activity;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzefb
    public final zzefb zzb(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        this.zzb = zzlVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzefb
    public final zzefb zzc(String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzefb
    public final zzefb zzd(String str) {
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzefb
    public final zzefc zze() {
        Activity activity = this.zza;
        if (activity != null) {
            return new zzeeh(activity, this.zzb, this.zzc, this.zzd, null);
        }
        throw new IllegalStateException("Missing required properties: activity");
    }
}
