package com.google.android.gms.ads.interstitial;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzbx;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbmg;
import com.google.android.gms.internal.ads.zzbtt;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
public abstract class InterstitialAd {
    @Deprecated
    public static boolean isAdAvailable(Context context, String str) {
        try {
            return zzb.zza(context).zzj(str);
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            return false;
        }
    }

    public static void load(final Context context, final String str, final AdRequest adRequest, final InterstitialAdLoadCallback interstitialAdLoadCallback) {
        Preconditions.checkNotNull(context, "Context cannot be null.");
        Preconditions.checkNotNull(str, "AdUnitId cannot be null.");
        Preconditions.checkNotNull(adRequest, "AdRequest cannot be null.");
        Preconditions.checkNotNull(interstitialAdLoadCallback, "LoadCallback cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbci.zza(context);
        if (((Boolean) zzbeg.zzi.zze()).booleanValue()) {
            if (((Boolean) zzbd.zzc().zzd(zzbci.zzlX)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.interstitial.zza
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        InterstitialAdLoadCallback interstitialAdLoadCallback2 = interstitialAdLoadCallback;
                        AdRequest adRequest2 = adRequest;
                        Context context2 = context;
                        try {
                            new zzbmg(context2, str).zza(adRequest2.zza(), interstitialAdLoadCallback2);
                        } catch (IllegalStateException e) {
                            zzbtt.zza(context2).zzh(e, "InterstitialAd.load");
                        }
                    }
                });
                return;
            }
        }
        new zzbmg(context, str).zza(adRequest.zza(), interstitialAdLoadCallback);
    }

    @Deprecated
    public static InterstitialAd pollAd(Context context, String str) {
        try {
            zzbx zzk = zzb.zza(context).zzk(str);
            if (zzk != null) {
                return new zzbmg(context, str, zzk);
            }
            zzo.zzl("Failed to obtain an Interstitial Ad from the preloader.", null);
            return null;
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            return null;
        }
    }

    public abstract String getAdUnitId();

    public abstract FullScreenContentCallback getFullScreenContentCallback();

    public abstract OnPaidEventListener getOnPaidEventListener();

    public abstract long getPlacementId();

    public abstract ResponseInfo getResponseInfo();

    public abstract void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback);

    public abstract void setImmersiveMode(boolean z);

    public abstract void setOnPaidEventListener(OnPaidEventListener onPaidEventListener);

    public abstract void setPlacementId(long j);

    public abstract void show(Activity activity);
}
