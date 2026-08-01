package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzehk implements zzefv {
    private final Context zza;
    private final zzdhy zzb;
    private final Executor zzc;
    private final zzfdt zzd;

    public zzehk(Context context, Executor executor, zzdhy zzdhyVar, zzfdt zzfdtVar) {
        this.zza = context;
        this.zzb = zzdhyVar;
        this.zzc = executor;
        this.zzd = zzfdtVar;
    }

    private static String zzd(zzfdu zzfduVar) {
        try {
            return zzfduVar.zzw.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzefv
    public final ListenableFuture zza(final zzfeh zzfehVar, final zzfdu zzfduVar) {
        String zzd = zzd(zzfduVar);
        final Uri parse = zzd != null ? Uri.parse(zzd) : null;
        return zzgbb.zzn(zzgbb.zzh(null), new zzgai() { // from class: com.google.android.gms.internal.ads.zzehi
            @Override // com.google.android.gms.internal.ads.zzgai
            public final ListenableFuture zza(Object obj) {
                return zzehk.this.zzc(parse, zzfehVar, zzfduVar, obj);
            }
        }, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzefv
    public final boolean zzb(zzfeh zzfehVar, zzfdu zzfduVar) {
        Context context = this.zza;
        return (context instanceof Activity) && zzbed.zzg(context) && !TextUtils.isEmpty(zzd(zzfduVar));
    }

    final /* synthetic */ ListenableFuture zzc(Uri uri, zzfeh zzfehVar, zzfdu zzfduVar, Object obj) throws Exception {
        try {
            CustomTabsIntent build = new CustomTabsIntent.Builder().build();
            build.intent.setData(uri);
            com.google.android.gms.ads.internal.overlay.zzc zzcVar = new com.google.android.gms.ads.internal.overlay.zzc(build.intent, null);
            final zzccf zzccfVar = new zzccf();
            zzdgy zze = this.zzb.zze(new zzcuh(zzfehVar, zzfduVar, null), new zzdhb(new zzdig() { // from class: com.google.android.gms.internal.ads.zzehj
                @Override // com.google.android.gms.internal.ads.zzdig
                public final void zza(boolean z, Context context, zzcyu zzcyuVar) {
                    zzccf zzccfVar2 = zzccf.this;
                    try {
                        com.google.android.gms.ads.internal.zzt.zzi();
                        com.google.android.gms.ads.internal.overlay.zzm.zza(context, (AdOverlayInfoParcel) zzccfVar2.get(), true);
                    } catch (Exception unused) {
                    }
                }
            }, null));
            zzccfVar.zzc(new AdOverlayInfoParcel(zzcVar, null, zze.zza(), null, new zzcbt(0, 0, false, false, false), null, null));
            this.zzd.zza();
            return zzgbb.zzh(zze.zzg());
        } catch (Throwable th) {
            zzcbn.zzh("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }
}
