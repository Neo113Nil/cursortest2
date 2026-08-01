package com.google.android.gms.ads.admanager;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbet;
import com.google.android.gms.internal.ads.zzbmw;
import com.google.android.gms.internal.ads.zzbus;
import com.google.android.gms.internal.ads.zzcbc;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public abstract class AdManagerInterstitialAd extends InterstitialAd {
    public static void load(final Context context, final String str, final AdManagerAdRequest adManagerAdRequest, final AdManagerInterstitialAdLoadCallback adManagerInterstitialAdLoadCallback) {
        Preconditions.checkNotNull(context, "Context cannot be null.");
        Preconditions.checkNotNull(str, "AdUnitId cannot be null.");
        Preconditions.checkNotNull(adManagerAdRequest, "AdManagerAdRequest cannot be null.");
        Preconditions.checkNotNull(adManagerInterstitialAdLoadCallback, "LoadCallback cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbdc.zza(context);
        if (((Boolean) zzbet.zzi.zze()).booleanValue()) {
            if (((Boolean) zzba.zzc().zza(zzbdc.zzkt)).booleanValue()) {
                zzcbc.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.admanager.zzc
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        AdManagerAdRequest adManagerAdRequest2 = adManagerAdRequest;
                        try {
                            new zzbmw(context2, str2).zza(adManagerAdRequest2.zza(), adManagerInterstitialAdLoadCallback);
                        } catch (IllegalStateException e) {
                            zzbus.zza(context2).zzf(e, "AdManagerInterstitialAd.load");
                        }
                    }
                });
                return;
            }
        }
        new zzbmw(context, str).zza(adManagerAdRequest.zza(), adManagerInterstitialAdLoadCallback);
    }

    public abstract AppEventListener getAppEventListener();

    public abstract void setAppEventListener(AppEventListener appEventListener);
}
