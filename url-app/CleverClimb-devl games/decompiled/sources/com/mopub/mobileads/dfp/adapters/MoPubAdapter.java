package com.mopub.mobileads.dfp.adapters;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import com.google.ads.a;
import com.google.ads.b;
import com.google.ads.mediation.MediationAdRequest;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationInterstitialListener;
import com.mopub.mobileads.MoPubErrorCode;
import com.mopub.mobileads.MoPubInterstitial;
import com.mopub.mobileads.MoPubView;

/* loaded from: classes2.dex */
public final class MoPubAdapter implements MediationBannerAdapter<MoPubExtras, MoPubServerParameters>, MediationInterstitialAdapter<MoPubExtras, MoPubServerParameters> {
    private static final String MOPUB_NATIVE_CEVENT_VERSION = "tp=dfp_custom_1.0";
    private MoPubInterstitial mMoPubInterstitial;
    private MoPubView mMoPubView;

    @Override // com.google.ads.mediation.MediationAdapter
    public Class<MoPubExtras> getAdditionalParametersType() {
        return MoPubExtras.class;
    }

    @Override // com.google.ads.mediation.MediationAdapter
    public Class<MoPubServerParameters> getServerParametersType() {
        return MoPubServerParameters.class;
    }

    @Override // com.google.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(MediationBannerListener mediationBannerListener, Activity activity, MoPubServerParameters moPubServerParameters, b bVar, MediationAdRequest mediationAdRequest, MoPubExtras moPubExtras) {
        this.mMoPubView = new MoPubView(activity);
        this.mMoPubView.setBannerAdListener(new MBannerListener(mediationBannerListener));
        this.mMoPubView.setAdUnitId(moPubServerParameters.adUnitId);
        if (mediationAdRequest.isTesting()) {
            this.mMoPubView.setTesting(true);
        }
        if (mediationAdRequest.getLocation() != null) {
            this.mMoPubView.setLocation(mediationAdRequest.getLocation());
        }
        this.mMoPubView.setKeywords(getKeywords(mediationAdRequest));
        this.mMoPubView.loadAd();
    }

    @Override // com.google.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(MediationInterstitialListener mediationInterstitialListener, Activity activity, MoPubServerParameters moPubServerParameters, MediationAdRequest mediationAdRequest, MoPubExtras moPubExtras) {
        this.mMoPubInterstitial = new MoPubInterstitial(activity, moPubServerParameters.adUnitId);
        this.mMoPubInterstitial.setInterstitialAdListener(new mMediationInterstitialListener(mediationInterstitialListener));
        if (mediationAdRequest.isTesting()) {
            this.mMoPubInterstitial.setTesting(true);
        }
        this.mMoPubInterstitial.setKeywords(getKeywords(mediationAdRequest));
        this.mMoPubInterstitial.load();
    }

    private String getKeywords(MediationAdRequest mediationAdRequest) {
        String str;
        String str2;
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(MOPUB_NATIVE_CEVENT_VERSION);
        if (mediationAdRequest.getAgeInYears() != null) {
            str = ",m_age:" + mediationAdRequest.getAgeInYears();
        } else {
            str = "";
        }
        sb.append(str);
        if (mediationAdRequest.getBirthday() != null) {
            str2 = ",m_birthday:" + mediationAdRequest.getBirthday();
        } else {
            str2 = "";
        }
        sb.append(str2);
        if (mediationAdRequest.getGender() != null) {
            str3 = ",m_gender:" + mediationAdRequest.getGender();
        } else {
            str3 = "";
        }
        sb.append(str3);
        return sb.toString();
    }

    @Override // com.google.ads.mediation.MediationAdapter
    public void destroy() {
        if (this.mMoPubView != null) {
            this.mMoPubView.destroy();
            this.mMoPubView = null;
        }
        if (this.mMoPubInterstitial != null) {
            this.mMoPubInterstitial.destroy();
            this.mMoPubInterstitial = null;
        }
    }

    @Override // com.google.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        return this.mMoPubView;
    }

    private class MBannerListener implements MoPubView.BannerAdListener {
        private static /* synthetic */ int[] $SWITCH_TABLE$com$mopub$mobileads$MoPubErrorCode;
        private MediationBannerListener mMediationBannerListener;

        static /* synthetic */ int[] $SWITCH_TABLE$com$mopub$mobileads$MoPubErrorCode() {
            int[] iArr = $SWITCH_TABLE$com$mopub$mobileads$MoPubErrorCode;
            if (iArr != null) {
                return iArr;
            }
            int[] iArr2 = new int[MoPubErrorCode.values().length];
            try {
                iArr2[MoPubErrorCode.ADAPTER_CONFIGURATION_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr2[MoPubErrorCode.ADAPTER_NOT_FOUND.ordinal()] = 5;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[MoPubErrorCode.CANCELLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[MoPubErrorCode.INTERNAL_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[MoPubErrorCode.MRAID_LOAD_ERROR.ordinal()] = 10;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[MoPubErrorCode.NETWORK_INVALID_STATE.ordinal()] = 9;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[MoPubErrorCode.NETWORK_NO_FILL.ordinal()] = 8;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[MoPubErrorCode.NETWORK_TIMEOUT.ordinal()] = 7;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[MoPubErrorCode.NO_FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[MoPubErrorCode.SERVER_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[MoPubErrorCode.UNSPECIFIED.ordinal()] = 13;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[MoPubErrorCode.VIDEO_CACHE_ERROR.ordinal()] = 11;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[MoPubErrorCode.VIDEO_DOWNLOAD_ERROR.ordinal()] = 12;
            } catch (NoSuchFieldError unused13) {
            }
            $SWITCH_TABLE$com$mopub$mobileads$MoPubErrorCode = iArr2;
            return iArr2;
        }

        public MBannerListener(MediationBannerListener mediationBannerListener) {
            this.mMediationBannerListener = mediationBannerListener;
        }

        @Override // com.mopub.mobileads.MoPubView.BannerAdListener
        public void onBannerClicked(MoPubView moPubView) {
            this.mMediationBannerListener.onClick(MoPubAdapter.this);
            this.mMediationBannerListener.onPresentScreen(MoPubAdapter.this);
        }

        @Override // com.mopub.mobileads.MoPubView.BannerAdListener
        public void onBannerCollapsed(MoPubView moPubView) {
            this.mMediationBannerListener.onDismissScreen(MoPubAdapter.this);
        }

        @Override // com.mopub.mobileads.MoPubView.BannerAdListener
        public void onBannerExpanded(MoPubView moPubView) {
            this.mMediationBannerListener.onPresentScreen(MoPubAdapter.this);
        }

        @Override // com.mopub.mobileads.MoPubView.BannerAdListener
        public void onBannerFailed(MoPubView moPubView, MoPubErrorCode moPubErrorCode) {
            int i = $SWITCH_TABLE$com$mopub$mobileads$MoPubErrorCode()[moPubErrorCode.ordinal()];
            if (i != 7) {
                switch (i) {
                    case 1:
                        this.mMediationBannerListener.onFailedToReceiveAd(MoPubAdapter.this, a.EnumC0366a.NO_FILL);
                        break;
                    case 2:
                        this.mMediationBannerListener.onFailedToReceiveAd(MoPubAdapter.this, a.EnumC0366a.INVALID_REQUEST);
                        break;
                    default:
                        this.mMediationBannerListener.onFailedToReceiveAd(MoPubAdapter.this, a.EnumC0366a.INTERNAL_ERROR);
                        break;
                }
            }
            this.mMediationBannerListener.onFailedToReceiveAd(MoPubAdapter.this, a.EnumC0366a.NETWORK_ERROR);
        }

        @Override // com.mopub.mobileads.MoPubView.BannerAdListener
        public void onBannerLoaded(MoPubView moPubView) {
            this.mMediationBannerListener.onReceivedAd(MoPubAdapter.this);
        }
    }

    @Override // com.google.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        if (this.mMoPubInterstitial.isReady()) {
            this.mMoPubInterstitial.show();
        } else {
            Log.d("Mopub", "Interstitial was not ready. Unable to load the interstitial");
        }
    }

    private class mMediationInterstitialListener implements MoPubInterstitial.InterstitialAdListener {
        private static /* synthetic */ int[] $SWITCH_TABLE$com$mopub$mobileads$MoPubErrorCode;
        private MediationInterstitialListener mMediationInterstitialListener;

        @Override // com.mopub.mobileads.MoPubInterstitial.InterstitialAdListener
        public void onInterstitialClicked(MoPubInterstitial moPubInterstitial) {
        }

        static /* synthetic */ int[] $SWITCH_TABLE$com$mopub$mobileads$MoPubErrorCode() {
            int[] iArr = $SWITCH_TABLE$com$mopub$mobileads$MoPubErrorCode;
            if (iArr != null) {
                return iArr;
            }
            int[] iArr2 = new int[MoPubErrorCode.values().length];
            try {
                iArr2[MoPubErrorCode.ADAPTER_CONFIGURATION_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr2[MoPubErrorCode.ADAPTER_NOT_FOUND.ordinal()] = 5;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[MoPubErrorCode.CANCELLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[MoPubErrorCode.INTERNAL_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[MoPubErrorCode.MRAID_LOAD_ERROR.ordinal()] = 10;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[MoPubErrorCode.NETWORK_INVALID_STATE.ordinal()] = 9;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[MoPubErrorCode.NETWORK_NO_FILL.ordinal()] = 8;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[MoPubErrorCode.NETWORK_TIMEOUT.ordinal()] = 7;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[MoPubErrorCode.NO_FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[MoPubErrorCode.SERVER_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[MoPubErrorCode.UNSPECIFIED.ordinal()] = 13;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[MoPubErrorCode.VIDEO_CACHE_ERROR.ordinal()] = 11;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[MoPubErrorCode.VIDEO_DOWNLOAD_ERROR.ordinal()] = 12;
            } catch (NoSuchFieldError unused13) {
            }
            $SWITCH_TABLE$com$mopub$mobileads$MoPubErrorCode = iArr2;
            return iArr2;
        }

        public mMediationInterstitialListener(MediationInterstitialListener mediationInterstitialListener) {
            this.mMediationInterstitialListener = mediationInterstitialListener;
        }

        @Override // com.mopub.mobileads.MoPubInterstitial.InterstitialAdListener
        public void onInterstitialDismissed(MoPubInterstitial moPubInterstitial) {
            this.mMediationInterstitialListener.onDismissScreen(MoPubAdapter.this);
        }

        @Override // com.mopub.mobileads.MoPubInterstitial.InterstitialAdListener
        public void onInterstitialFailed(MoPubInterstitial moPubInterstitial, MoPubErrorCode moPubErrorCode) {
            int i = $SWITCH_TABLE$com$mopub$mobileads$MoPubErrorCode()[moPubErrorCode.ordinal()];
            if (i != 7) {
                switch (i) {
                    case 1:
                        this.mMediationInterstitialListener.onFailedToReceiveAd(MoPubAdapter.this, a.EnumC0366a.NO_FILL);
                        break;
                    case 2:
                        this.mMediationInterstitialListener.onFailedToReceiveAd(MoPubAdapter.this, a.EnumC0366a.INVALID_REQUEST);
                        break;
                    default:
                        this.mMediationInterstitialListener.onFailedToReceiveAd(MoPubAdapter.this, a.EnumC0366a.INTERNAL_ERROR);
                        break;
                }
            }
            this.mMediationInterstitialListener.onFailedToReceiveAd(MoPubAdapter.this, a.EnumC0366a.NETWORK_ERROR);
        }

        @Override // com.mopub.mobileads.MoPubInterstitial.InterstitialAdListener
        public void onInterstitialLoaded(MoPubInterstitial moPubInterstitial) {
            this.mMediationInterstitialListener.onReceivedAd(MoPubAdapter.this);
        }

        @Override // com.mopub.mobileads.MoPubInterstitial.InterstitialAdListener
        public void onInterstitialShown(MoPubInterstitial moPubInterstitial) {
            this.mMediationInterstitialListener.onPresentScreen(MoPubAdapter.this);
        }
    }
}
