package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.internal.ads.zzbeb;
import com.google.android.gms.internal.ads.zzbed;
import com.google.android.gms.internal.ads.zzhed;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzo implements zzbeb {
    final /* synthetic */ zzbed zza;
    final /* synthetic */ Context zzb;
    final /* synthetic */ Uri zzc;

    zzo(zzt zztVar, zzbed zzbedVar, Context context, Uri uri) {
        this.zza = zzbedVar;
        this.zzb = context;
        this.zzc = uri;
    }

    @Override // com.google.android.gms.internal.ads.zzbeb
    public final void zza() {
        CustomTabsIntent build = new CustomTabsIntent.Builder(this.zza.zza()).build();
        build.intent.setPackage(zzhed.zza(this.zzb));
        build.launchUrl(this.zzb, this.zzc);
        this.zza.zzf((Activity) this.zzb);
    }
}
