package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.internal.ads.zzbdi;
import com.google.android.gms.internal.ads.zzbdj;
import com.google.android.gms.internal.ads.zzhqn;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzk implements zzbdi {
    final /* synthetic */ zzbdj zza;
    final /* synthetic */ Context zzb;
    final /* synthetic */ Uri zzc;

    zzk(zzs zzsVar, zzbdj zzbdjVar, Context context, Uri uri) {
        this.zza = zzbdjVar;
        this.zzb = context;
        this.zzc = uri;
        Objects.requireNonNull(zzsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbdi
    public final void zza() {
        zzbdj zzbdjVar = this.zza;
        CustomTabsIntent build = new CustomTabsIntent.Builder(zzbdjVar.zzc()).build();
        Intent intent = build.intent;
        Context context = this.zzb;
        intent.setPackage(zzhqn.zza(context));
        build.launchUrl(context, this.zzc);
        zzbdjVar.zzb((Activity) context);
    }
}
