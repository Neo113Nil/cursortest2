package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbn;
import com.google.android.gms.ads.internal.client.zzbq;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzeu;
import com.google.android.gms.ads.internal.client.zzfl;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbet;
import com.google.android.gms.internal.ads.zzbfw;
import com.google.android.gms.internal.ads.zzbin;
import com.google.android.gms.internal.ads.zzbip;
import com.google.android.gms.internal.ads.zzbiq;
import com.google.android.gms.internal.ads.zzbpo;
import com.google.android.gms.internal.ads.zzbtc;
import com.google.android.gms.internal.ads.zzbte;
import com.google.android.gms.internal.ads.zzcbc;
import com.google.android.gms.internal.ads.zzcbn;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public class AdLoader {
    private final zzp zza;
    private final Context zzb;
    private final zzbn zzc;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
    public static class Builder {
        private final Context zza;
        private final zzbq zzb;

        public Builder(Context context, String str) {
            Context context2 = (Context) Preconditions.checkNotNull(context, "context cannot be null");
            zzbq zzc = zzay.zza().zzc(context, str, new zzbpo());
            this.zza = context2;
            this.zzb = zzc;
        }

        public AdLoader build() {
            try {
                return new AdLoader(this.zza, this.zzb.zze(), zzp.zza);
            } catch (RemoteException e) {
                zzcbn.zzh("Failed to build AdLoader.", e);
                return new AdLoader(this.zza, new zzeu().zzc(), zzp.zza);
            }
        }

        public Builder forCustomFormatAd(String str, NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener, NativeCustomFormatAd.OnCustomClickListener onCustomClickListener) {
            zzbtc zzbtcVar = new zzbtc(onCustomFormatAdLoadedListener, onCustomClickListener);
            try {
                this.zzb.zzh(str, zzbtcVar.zzb(), zzbtcVar.zza());
            } catch (RemoteException e) {
                zzcbn.zzk("Failed to add custom format ad listener", e);
            }
            return this;
        }

        @Deprecated
        public Builder forCustomTemplateAd(String str, NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener, NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener) {
            zzbin zzbinVar = new zzbin(onCustomTemplateAdLoadedListener, onCustomClickListener);
            try {
                this.zzb.zzh(str, zzbinVar.zze(), zzbinVar.zzd());
            } catch (RemoteException e) {
                zzcbn.zzk("Failed to add custom template ad listener", e);
            }
            return this;
        }

        public Builder forNativeAd(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
            try {
                this.zzb.zzk(new zzbte(onNativeAdLoadedListener));
            } catch (RemoteException e) {
                zzcbn.zzk("Failed to add google native ad listener", e);
            }
            return this;
        }

        @Deprecated
        public Builder forUnifiedNativeAd(UnifiedNativeAd.OnUnifiedNativeAdLoadedListener onUnifiedNativeAdLoadedListener) {
            try {
                this.zzb.zzk(new zzbiq(onUnifiedNativeAdLoadedListener));
            } catch (RemoteException e) {
                zzcbn.zzk("Failed to add google native ad listener", e);
            }
            return this;
        }

        public Builder withAdListener(AdListener adListener) {
            try {
                this.zzb.zzl(new com.google.android.gms.ads.internal.client.zzg(adListener));
            } catch (RemoteException e) {
                zzcbn.zzk("Failed to set AdListener.", e);
            }
            return this;
        }

        public Builder withAdManagerAdViewOptions(AdManagerAdViewOptions adManagerAdViewOptions) {
            try {
                this.zzb.zzm(adManagerAdViewOptions);
            } catch (RemoteException e) {
                zzcbn.zzk("Failed to specify Ad Manager banner ad options", e);
            }
            return this;
        }

        @Deprecated
        public Builder withNativeAdOptions(NativeAdOptions nativeAdOptions) {
            try {
                this.zzb.zzo(new zzbfw(nativeAdOptions));
            } catch (RemoteException e) {
                zzcbn.zzk("Failed to specify native ad options", e);
            }
            return this;
        }

        public Builder forAdManagerAdView(OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener, AdSize... adSizeArr) {
            if (adSizeArr == null || adSizeArr.length <= 0) {
                throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
            }
            try {
                this.zzb.zzj(new zzbip(onAdManagerAdViewLoadedListener), new zzq(this.zza, adSizeArr));
            } catch (RemoteException e) {
                zzcbn.zzk("Failed to add Google Ad Manager banner ad listener", e);
            }
            return this;
        }

        public Builder withNativeAdOptions(com.google.android.gms.ads.nativead.NativeAdOptions nativeAdOptions) {
            try {
                this.zzb.zzo(new zzbfw(4, nativeAdOptions.shouldReturnUrlsForImageAssets(), -1, nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new zzfl(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zzc(), nativeAdOptions.getMediaAspectRatio(), nativeAdOptions.zza(), nativeAdOptions.zzb(), nativeAdOptions.zzd() - 1));
            } catch (RemoteException e) {
                zzcbn.zzk("Failed to specify native ad options", e);
            }
            return this;
        }
    }

    AdLoader(Context context, zzbn zzbnVar, zzp zzpVar) {
        this.zzb = context;
        this.zzc = zzbnVar;
        this.zza = zzpVar;
    }

    private final void zzb(final zzdx zzdxVar) {
        zzbdc.zza(this.zzb);
        if (((Boolean) zzbet.zzc.zze()).booleanValue()) {
            if (((Boolean) zzba.zzc().zza(zzbdc.zzkt)).booleanValue()) {
                zzcbc.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        AdLoader.this.zza(zzdxVar);
                    }
                });
                return;
            }
        }
        try {
            this.zzc.zzg(this.zza.zza(this.zzb, zzdxVar));
        } catch (RemoteException e) {
            zzcbn.zzh("Failed to load ad.", e);
        }
    }

    public boolean isLoading() {
        try {
            return this.zzc.zzi();
        } catch (RemoteException e) {
            zzcbn.zzk("Failed to check if ad is loading.", e);
            return false;
        }
    }

    public void loadAd(AdRequest adRequest) {
        zzb(adRequest.zza);
    }

    public void loadAds(AdRequest adRequest, int i) {
        try {
            this.zzc.zzh(this.zza.zza(this.zzb, adRequest.zza), i);
        } catch (RemoteException e) {
            zzcbn.zzh("Failed to load ads.", e);
        }
    }

    final /* synthetic */ void zza(zzdx zzdxVar) {
        try {
            this.zzc.zzg(this.zza.zza(this.zzb, zzdxVar));
        } catch (RemoteException e) {
            zzcbn.zzh("Failed to load ad.", e);
        }
    }

    public void loadAd(AdManagerAdRequest adManagerAdRequest) {
        zzb(adManagerAdRequest.zza);
    }
}
