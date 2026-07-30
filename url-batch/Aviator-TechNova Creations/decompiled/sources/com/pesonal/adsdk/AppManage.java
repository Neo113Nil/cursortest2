package com.pesonal.adsdk;

import android.app.Activity;
import android.app.Dialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Patterns;
import android.util.TypedValue;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import com.bumptech.glide.Glide;
import com.facebook.ads.AbstractAdListener;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeAdsManager;
import com.facebook.ads.NativeBannerAd;
import com.facebook.internal.AnalyticsEvents;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.pesonal.adsdk.AppManage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.Random;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;

/* loaded from: classes4.dex */
public class AppManage {
    public static String ADMOB_AppOpen1 = "";
    public static String ADMOB_B1 = "";
    public static String ADMOB_ExitNative = "";
    public static String ADMOB_I1 = "";
    public static String ADMOB_IR1 = "";
    public static String ADMOB_N1 = "";
    public static String ADMOB_NB1 = "";
    public static String ADMOB_N_List = "";
    public static String ADMOB_R1 = "";
    public static String APP_ID = "";
    public static String AppId = "";
    public static String CLIENT_TOKEN = "";
    public static String CollapseBanner1 = "";
    public static JSONObject Custom_B1 = null;
    public static JSONObject Custom_I1 = null;
    public static JSONObject Custom_N1 = null;
    public static JSONObject Custom_NB1 = null;
    public static JSONObject Custom_appopen = null;
    public static String ExitBanner = "";
    public static String FACEBOOK_B1 = "";
    public static String FACEBOOK_ExitNative = "";
    public static String FACEBOOK_I1 = "";
    public static String FACEBOOK_N1 = "";
    public static String FACEBOOK_NB1 = "";
    public static String FACEBOOK_N_List = "";
    public static String SplashBanner1 = "";
    static Activity activity = null;
    public static int ad_dialog_time_in_second = 2;
    public static int admob_AdStatus = 0;
    public static int admod_native_ads_height = 180;
    public static int app_ExitAdsShow = 0;
    public static int app_NativeCount = 0;
    public static int app_UserNotAcceptConsentAutoResetConsent = 0;
    public static int app_UserNotAcceptConsentFormCustomAdShow = 0;
    public static String app_adPlatformSequence = "";
    public static int app_adShowStatus = 0;
    public static String app_alernateAdShow = "";
    public static int app_backwardClickAd = 0;
    public static int app_dialogBeforeAdShow = 0;
    public static int app_dualAds = 0;
    public static int app_forwardClickAd = 0;
    public static int app_guideClickAd = 0;
    public static int app_howShowAd = 0;
    public static int app_interTimerSecond = 0;
    public static int app_interUsingTimeShow = 0;
    public static int app_istwist = 0;
    public static String app_mixedAdFlow = "";
    public static int app_nativeAlter = 0;
    public static int app_nativeBannerAlter = 3;
    public static String app_nativeColor = "#00773E";
    public static int app_needInternet = 0;
    public static String app_newPackageName = "";
    public static String app_privacyPolicyLink = "";
    public static int app_redirectOtherAppStatus = 0;
    public static int app_screenCount = 1;
    public static int app_screenShow = 0;
    public static int app_splashInterAndBannerAdShow = 0;
    public static int app_updateAppDialogStatus = 0;
    public static String app_versionCode = "";
    public static int backFill = 0;
    public static int back_count_click = -1;
    public static boolean banner_collapsible = false;
    public static int count_banner = -1;
    public static int count_click = -1;
    public static int count_click_for_alt = -1;
    public static int count_native = -1;
    public static int custom_AdStatus = 0;
    public static int custom_native_ads_height = 0;
    public static int facebook_AdStatus = 0;
    public static int fb_native_ads_height = 180;
    public static int game_show = 0;
    public static String game_url = "";
    public static int googleAdsPos = 0;
    public static int guid_count_click = -1;
    public static boolean interStatus = false;
    private static AppManage mInstance = null;
    static MyCallback myCallback = null;
    public static SharedPreferences mysharedpreferences = null;
    public static boolean refresh_collapse = false;
    public static int refresh_seconds = 60;
    String admob_b;
    String admob_exit_n;
    String admob_i;
    String admob_ir;
    String admob_n;
    String admob_nb;
    String admob_r;
    AdView collapseAdView;
    private Dialog dialog;
    private com.facebook.ads.AdView extraFacebookBannerAd;
    private AdView extraGoogleBannerAd;
    private com.facebook.ads.AdView facebookBannerAd;
    private NativeAd facebookExitNativeAd;
    private NativeAd facebookNativeAd;
    private NativeBannerAd facebookNativeBannerAd;
    String facebook_b;
    String facebook_exit_n;
    String facebook_i;
    String facebook_n;
    String facebook_nb;
    public InterstitialAd fbinterstitialAd1;
    private AdView googleBannerAd;
    private AdView googleExitBannerAd;
    private com.google.android.gms.ads.nativead.NativeAd googleExitNativeAd;
    private com.google.android.gms.ads.nativead.NativeAd googleNativeAd;
    public com.google.android.gms.ads.interstitial.InterstitialAd interstitial1;
    private boolean isFacebookBannerLoaded;
    private boolean isFacebookExitNativeLoaded;
    private boolean isFacebookNativeBannerLoaded;
    private boolean isFacebookNativeLoaded;
    private boolean isGoogleBannerLoaded;
    private boolean isGoogleExitNativeLoaded;
    private boolean isGoogleNativeLoaded;
    private boolean isRewarded;
    private boolean isRewardedInter;
    private boolean isTestExitBannerLoaded;
    private com.google.android.gms.ads.nativead.NativeAd mNativeBannerAd;
    private RewardedInterstitialAd mRewardedInterAd;
    private RewardedAd mRewardedVideoAd;
    private ViewGroup parentView;
    long startTime;
    public static ArrayList<com.google.android.gms.ads.nativead.NativeAd> googleNativeAds = new ArrayList<>();
    public static ArrayList<NativeAd> facebookNativeAds = new ArrayList<>();
    public static int listAdPos = 0;
    public static boolean isFirstInterstitial = false;
    public static int fbAdsPos = 0;
    public static int onResumeDirectUrlOpen = 0;
    public static int appInsideCustomTabShow = 0;
    public static int isEncrypt = 0;
    public static int chromeTabDisplayTime = 0;
    public static int partialCustomTabShow = 0;
    public static String partialCustomTabUrl = "";
    private static long AD_COOLDOWN_MS = 60000;
    public static int ad_showSplashAdsStatus = 0;
    public static int splashAppOpenOrInterShow = 0;
    public static int splashBannerShow = 0;
    public static int nativeAdRefreshTime = 0;
    ArrayList<String> listredirectLink = new ArrayList<>();
    int position = 0;
    ArrayList<String> banner_sequence = new ArrayList<>();
    ArrayList<String> native_sequence = new ArrayList<>();
    ArrayList<String> interstitial_sequence = new ArrayList<>();
    private boolean isNativeBannerAdLoaded = false;
    private long lastAdShownTime = 0;
    ArrayList<String> native_sequence2 = new ArrayList<>();
    Handler handler = null;

    /* renamed from: com.pesonal.adsdk.AppManage$2, reason: invalid class name */
    public final class AnonymousClass2 extends AdListener {
        public AnonymousClass2() {
        }

        public final /* synthetic */ void lambda$onAdLoaded$0(AdValue adValue) {
            AppManage.logEvent(AppManage.this.googleExitBannerAd.getResponseInfo().getMediationAdapterClassName(), "ExitBanner", adValue.getValueMicros(), adValue.getCurrencyCode(), adValue.getPrecisionType());
        }

        @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.ads.internal.client.zza
        public final void onAdClicked() {
            AppManage.interStatus = true;
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdLoaded() {
            AppManage.this.isTestExitBannerLoaded = true;
            AppManage.this.googleExitBannerAd.setOnPaidEventListener(new OnPaidEventListener() { // from class: com.pesonal.adsdk.AppManage$2$$ExternalSyntheticLambda0
                @Override // com.google.android.gms.ads.OnPaidEventListener
                public final void onPaidEvent(AdValue adValue) {
                    AppManage.AnonymousClass2.this.lambda$onAdLoaded$0(adValue);
                }
            });
        }
    }

    /* renamed from: com.pesonal.adsdk.AppManage$3, reason: invalid class name */
    public final class AnonymousClass3 implements NativeAd.OnNativeAdLoadedListener {
        public AnonymousClass3() {
        }

        public final /* synthetic */ void lambda$onNativeAdLoaded$0(AdValue adValue) {
            AppManage.logEvent(AppManage.this.googleExitNativeAd.getResponseInfo().getMediationAdapterClassName(), "ExitNative", adValue.getValueMicros(), adValue.getCurrencyCode(), adValue.getPrecisionType());
        }

        @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
        public final void onNativeAdLoaded(com.google.android.gms.ads.nativead.NativeAd nativeAd) {
            AppManage.this.googleExitNativeAd = nativeAd;
            AppManage.this.isGoogleExitNativeLoaded = true;
            AppManage.this.googleExitNativeAd.setOnPaidEventListener(new OnPaidEventListener() { // from class: com.pesonal.adsdk.AppManage$3$$ExternalSyntheticLambda0
                @Override // com.google.android.gms.ads.OnPaidEventListener
                public final void onPaidEvent(AdValue adValue) {
                    AppManage.AnonymousClass3.this.lambda$onNativeAdLoaded$0(adValue);
                }
            });
        }
    }

    /* renamed from: com.pesonal.adsdk.AppManage$38, reason: invalid class name */
    public final class AnonymousClass38 extends AdListener {
        public AnonymousClass38() {
        }

        public final /* synthetic */ void lambda$onAdLoaded$0(AdValue adValue) {
            AppManage.logEvent(AppManage.this.googleBannerAd.getResponseInfo().getMediationAdapterClassName(), "banner", adValue.getValueMicros(), adValue.getCurrencyCode(), adValue.getPrecisionType());
        }

        @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.ads.internal.client.zza
        public final void onAdClicked() {
            AppManage.interStatus = true;
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdFailedToLoad(LoadAdError loadAdError) {
            loadAdError.getMessage();
            loadAdError.getCode();
            super.onAdFailedToLoad(loadAdError);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdLoaded() {
            AppManage.this.isGoogleBannerLoaded = true;
            AppManage.this.googleBannerAd.setOnPaidEventListener(new OnPaidEventListener() { // from class: com.pesonal.adsdk.AppManage$38$$ExternalSyntheticLambda0
                @Override // com.google.android.gms.ads.OnPaidEventListener
                public final void onPaidEvent(AdValue adValue) {
                    AppManage.AnonymousClass38.this.lambda$onAdLoaded$0(adValue);
                }
            });
        }
    }

    /* renamed from: com.pesonal.adsdk.AppManage$41, reason: invalid class name */
    public final class AnonymousClass41 implements NativeAd.OnNativeAdLoadedListener {
        public AnonymousClass41() {
        }

        @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
        public final void onNativeAdLoaded(final com.google.android.gms.ads.nativead.NativeAd nativeAd) {
            AppManage.this.mNativeBannerAd = nativeAd;
            AppManage.this.isNativeBannerAdLoaded = true;
            AppManage.this.mNativeBannerAd.setOnPaidEventListener(new OnPaidEventListener() { // from class: com.pesonal.adsdk.AppManage$41$$ExternalSyntheticLambda0
                @Override // com.google.android.gms.ads.OnPaidEventListener
                public final void onPaidEvent(AdValue adValue) {
                    AppManage.logEvent(com.google.android.gms.ads.nativead.NativeAd.this.getResponseInfo().getMediationAdapterClassName(), "nativeBanner", adValue.getValueMicros(), adValue.getCurrencyCode(), adValue.getPrecisionType());
                }
            });
        }
    }

    /* renamed from: com.pesonal.adsdk.AppManage$43, reason: invalid class name */
    public final class AnonymousClass43 implements NativeAd.OnNativeAdLoadedListener {
        public AnonymousClass43() {
        }

        @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
        public final void onNativeAdLoaded(final com.google.android.gms.ads.nativead.NativeAd nativeAd) {
            AppManage.this.googleNativeAd = nativeAd;
            AppManage.this.isGoogleNativeLoaded = true;
            AppManage.this.googleNativeAd.setOnPaidEventListener(new OnPaidEventListener() { // from class: com.pesonal.adsdk.AppManage$43$$ExternalSyntheticLambda0
                @Override // com.google.android.gms.ads.OnPaidEventListener
                public final void onPaidEvent(AdValue adValue) {
                    AppManage.logEvent(com.google.android.gms.ads.nativead.NativeAd.this.getResponseInfo().getMediationAdapterClassName(), AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_NATIVE, adValue.getValueMicros(), adValue.getCurrencyCode(), adValue.getPrecisionType());
                }
            });
        }
    }

    /* renamed from: com.pesonal.adsdk.AppManage$46, reason: invalid class name */
    public final class AnonymousClass46 extends InterstitialAdLoadCallback {
        public AnonymousClass46() {
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public final void onAdFailedToLoad(LoadAdError loadAdError) {
            loadAdError.getMessage();
            loadAdError.getCode();
            AppManage.this.interstitial1 = null;
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public final void onAdLoaded(final com.google.android.gms.ads.interstitial.InterstitialAd interstitialAd) {
            AppManage.this.interstitial1 = interstitialAd;
            interstitialAd.setOnPaidEventListener(new OnPaidEventListener() { // from class: com.pesonal.adsdk.AppManage$46$$ExternalSyntheticLambda0
                @Override // com.google.android.gms.ads.OnPaidEventListener
                public final void onPaidEvent(AdValue adValue) {
                    AppManage.logEvent(com.google.android.gms.ads.interstitial.InterstitialAd.this.getResponseInfo().getMediationAdapterClassName(), "interstitial", adValue.getValueMicros(), adValue.getCurrencyCode(), adValue.getPrecisionType());
                }
            });
        }
    }

    /* renamed from: com.pesonal.adsdk.AppManage$55, reason: invalid class name */
    public final class AnonymousClass55 implements NativeAd.OnNativeAdLoadedListener {
        @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
        public final void onNativeAdLoaded(final com.google.android.gms.ads.nativead.NativeAd nativeAd) {
            AppManage.googleNativeAds.add(nativeAd);
            nativeAd.setOnPaidEventListener(new OnPaidEventListener() { // from class: com.pesonal.adsdk.AppManage$55$$ExternalSyntheticLambda0
                @Override // com.google.android.gms.ads.OnPaidEventListener
                public final void onPaidEvent(AdValue adValue) {
                    AppManage.logEvent(com.google.android.gms.ads.nativead.NativeAd.this.getResponseInfo().getMediationAdapterClassName(), "listNative", adValue.getValueMicros(), adValue.getCurrencyCode(), adValue.getPrecisionType());
                }
            });
        }
    }

    /* renamed from: com.pesonal.adsdk.AppManage$57, reason: invalid class name */
    public final class AnonymousClass57 extends RewardedAdLoadCallback {
        public AnonymousClass57() {
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public final void onAdFailedToLoad(LoadAdError loadAdError) {
            AppManage.this.mRewardedVideoAd = null;
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public final void onAdLoaded(final RewardedAd rewardedAd) {
            AppManage.this.mRewardedVideoAd = rewardedAd;
            AppManage.this.isRewarded = false;
            rewardedAd.setOnPaidEventListener(new OnPaidEventListener() { // from class: com.pesonal.adsdk.AppManage$57$$ExternalSyntheticLambda0
                @Override // com.google.android.gms.ads.OnPaidEventListener
                public final void onPaidEvent(AdValue adValue) {
                    AppManage.logEvent(RewardedAd.this.getResponseInfo().getMediationAdapterClassName(), "Reward", adValue.getValueMicros(), adValue.getCurrencyCode(), adValue.getPrecisionType());
                }
            });
        }
    }

    /* renamed from: com.pesonal.adsdk.AppManage$61, reason: invalid class name */
    public final class AnonymousClass61 extends RewardedInterstitialAdLoadCallback {
        public AnonymousClass61() {
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public final void onAdFailedToLoad(LoadAdError loadAdError) {
            AppManage.this.mRewardedInterAd = null;
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public final void onAdLoaded(final RewardedInterstitialAd rewardedInterstitialAd) {
            AppManage.this.mRewardedInterAd = rewardedInterstitialAd;
            AppManage.this.isRewardedInter = false;
            AppManage.this.mRewardedInterAd.setOnPaidEventListener(new OnPaidEventListener() { // from class: com.pesonal.adsdk.AppManage$61$$ExternalSyntheticLambda0
                @Override // com.google.android.gms.ads.OnPaidEventListener
                public final void onPaidEvent(AdValue adValue) {
                    AppManage.logEvent(RewardedInterstitialAd.this.getResponseInfo().getMediationAdapterClassName(), "RewardInter", adValue.getValueMicros(), adValue.getCurrencyCode(), adValue.getPrecisionType());
                }
            });
        }
    }

    public interface MyCallback {
        void callbackCall();
    }

    public interface rewardedCallback {
        void callbackCall(boolean z, boolean z2);

        void onUserEarnedReward(RewardItem rewardItem);
    }

    public AppManage(Activity activity2) {
        activity = activity2;
        mysharedpreferences = activity2.getSharedPreferences(activity2.getPackageName(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void DialogAdsNotLoaded(final Context context, final CustomTabsSession[] customTabsSessionArr, final String str, final String str2) {
        final Dialog dialog = new Dialog(context);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.dialog_ads_loading_error);
        dialog.getWindow().setLayout(-1, -2);
        ((TextView) dialog.findViewById(R.id.txtSecondMsg)).setText(activity.getString(R.string.reopen_ads_message, Integer.valueOf(chromeTabDisplayTime)));
        ((RelativeLayout) dialog.findViewById(R.id.btnReOpen)).setOnClickListener(new View.OnClickListener() { // from class: com.pesonal.adsdk.AppManage.70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dialog.dismiss();
                AppManage.this.startTime = System.currentTimeMillis();
                String str3 = str2;
                if (str3 == null || !Patterns.WEB_URL.matcher(str3).matches()) {
                    return;
                }
                AppManage.interStatus = true;
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder(customTabsSessionArr[0]);
                builder.setToolbarColor(ContextCompat.getColor(context, R.color.white)).setShowTitle(true);
                CustomTabsIntent build = builder.build();
                build.intent.setPackage(str);
                build.intent.setData(Uri.parse(str2));
                build.intent.addFlags(1073741824);
                context.startActivity(build.intent);
            }
        });
        dialog.show();
    }

    public static void FadeIn(final View view) {
        Animation loadAnimation = AnimationUtils.loadAnimation(view.getContext(), R.anim.aviator_cnz_fade_in);
        view.startAnimation(loadAnimation);
        loadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.pesonal.adsdk.AppManage.31
            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                view.setVisibility(0);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
            }
        });
    }

    public static void FadeIn1(final View view) {
        Animation loadAnimation = AnimationUtils.loadAnimation(view.getContext(), R.anim.slide_up);
        view.startAnimation(loadAnimation);
        loadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.pesonal.adsdk.AppManage.32
            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                view.setVisibility(0);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
            }
        });
    }

    public static void SlideToAbove20(final View view, int i) {
        Animation loadAnimation = AnimationUtils.loadAnimation(view.getContext(), R.anim.bottom_to_top);
        loadAnimation.setFillAfter(true);
        view.startAnimation(loadAnimation);
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.5f, 1, 0.0f);
        translateAnimation.setDuration(i);
        translateAnimation.setFillAfter(true);
        translateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.pesonal.adsdk.AppManage.30
            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                Animation loadAnimation2 = AnimationUtils.loadAnimation(view.getContext(), R.anim.item_animation_from_bottom);
                loadAnimation2.setFillAfter(true);
                view.startAnimation(loadAnimation2);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
                view.setVisibility(0);
            }
        });
        translateAnimation.setFillEnabled(true);
        view.startAnimation(translateAnimation);
    }

    public static void SlideToAbove30(final View view, int i) {
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.5f, 1, 0.0f);
        translateAnimation.setDuration(i);
        translateAnimation.setFillAfter(true);
        translateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.pesonal.adsdk.AppManage.33
            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
                view.setVisibility(0);
            }
        });
        translateAnimation.setFillEnabled(true);
        view.startAnimation(translateAnimation);
    }

    public static boolean checkUpdate(int i) {
        if (app_updateAppDialogStatus != 1) {
            return false;
        }
        try {
            return Arrays.asList(app_versionCode.split(",")).contains(new StringBuilder().append(i).append("").toString());
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private void collapseView(final View view) {
        final int measuredHeight = view.getMeasuredHeight();
        Animation animation = new Animation() { // from class: com.pesonal.adsdk.AppManage.66
            @Override // android.view.animation.Animation
            public final void applyTransformation(float f, Transformation transformation) {
                if (f == 1.0f) {
                    view.setVisibility(8);
                    return;
                }
                int i = measuredHeight;
                view.getLayoutParams().height = i - ((int) (i * f));
                view.requestLayout();
            }

            @Override // android.view.animation.Animation
            public final boolean willChangeBounds() {
                return true;
            }
        };
        animation.setDuration(300L);
        view.startAnimation(animation);
    }

    private void expandView(final View view) {
        view.measure(-1, -2);
        final int i = activity.getResources().getDisplayMetrics().heightPixels / 2;
        Animation animation = new Animation() { // from class: com.pesonal.adsdk.AppManage.65
            @Override // android.view.animation.Animation
            public final void applyTransformation(float f, Transformation transformation) {
                view.getLayoutParams().height = (int) (i * f);
                view.requestLayout();
            }

            @Override // android.view.animation.Animation
            public final boolean willChangeBounds() {
                return true;
            }
        };
        animation.setDuration(3000L);
        view.startAnimation(animation);
    }

    public static AdSize getAdSizeCollapsible(Activity activity2) {
        Display defaultDisplay = ((WindowManager) activity2.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(activity2, (int) (displayMetrics.widthPixels / displayMetrics.density));
    }

    public static AppManage getInstance(Activity activity2) {
        activity = activity2;
        if (mInstance == null) {
            mInstance = new AppManage(activity2);
        }
        return mInstance;
    }

    public static boolean hasActiveInternetConnection(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    private static void initAd() {
        if (admob_AdStatus == 1) {
            MobileAds.initialize(activity, new OnInitializationCompleteListener() { // from class: com.pesonal.adsdk.AppManage.1
                @Override // com.google.android.gms.ads.initialization.OnInitializationCompleteListener
                public final void onInitializationComplete(InitializationStatus initializationStatus) {
                }
            });
        }
        if (facebook_AdStatus == 1) {
            AudienceNetworkAds.initialize(activity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadAdmobInterstitial(String str) {
        if (this.interstitial1 == null && admob_AdStatus == 1 && !str.isEmpty()) {
            com.google.android.gms.ads.interstitial.InterstitialAd.load(activity, str, new AdRequest.Builder().build(), new AnonymousClass46());
        }
    }

    private void loadAdmobInterstitialLow(String str) {
        if (this.interstitial1 == null && admob_AdStatus == 1 && !str.isEmpty()) {
            com.google.android.gms.ads.interstitial.InterstitialAd.load(activity, str, new AdRequest.Builder().build(), new InterstitialAdLoadCallback() { // from class: com.pesonal.adsdk.AppManage.47
                @Override // com.google.android.gms.ads.AdLoadCallback
                public final void onAdFailedToLoad(LoadAdError loadAdError) {
                    AppManage.this.interstitial1 = null;
                }

                @Override // com.google.android.gms.ads.AdLoadCallback
                public final void onAdLoaded(com.google.android.gms.ads.interstitial.InterstitialAd interstitialAd) {
                    AppManage.this.interstitial1 = interstitialAd;
                }
            });
        }
    }

    private void loadFacebookInterstitial(String str) {
        if (this.fbinterstitialAd1 == null) {
            this.fbinterstitialAd1 = new InterstitialAd(activity, str);
        }
        if (this.fbinterstitialAd1.isAdLoaded()) {
            return;
        }
        InterstitialAd interstitialAd = this.fbinterstitialAd1;
        interstitialAd.loadAd(interstitialAd.buildLoadAdConfig().withAdListener(new AbstractAdListener() { // from class: com.pesonal.adsdk.AppManage.48
            @Override // com.facebook.ads.AbstractAdListener, com.facebook.ads.AdListener
            public final void onError(Ad ad, AdError adError) {
                adError.getErrorMessage();
                adError.getErrorCode();
                super.onError(ad, adError);
            }

            @Override // com.facebook.ads.AbstractAdListener, com.facebook.ads.InterstitialAdListener
            public final void onInterstitialDismissed(Ad ad) {
                super.onInterstitialDismissed(ad);
                AppManage.this.fbinterstitialAd1.loadAd();
                AppManage.this.lastAdShownTime = System.currentTimeMillis();
                AppManage.this.interstitialCallBack();
            }
        }).build());
    }

    private void loadFacebookMultipleNative() {
        if (facebook_AdStatus != 1 || FACEBOOK_N_List.isEmpty()) {
            return;
        }
        final NativeAdsManager nativeAdsManager = new NativeAdsManager(activity, FACEBOOK_N_List, 5);
        nativeAdsManager.setListener(new NativeAdsManager.Listener() { // from class: com.pesonal.adsdk.AppManage.56
            @Override // com.facebook.ads.NativeAdsManager.Listener
            public final void onAdError(AdError adError) {
            }

            @Override // com.facebook.ads.NativeAdsManager.Listener
            public final void onAdsLoaded() {
                int uniqueNativeAdCount = NativeAdsManager.this.getUniqueNativeAdCount();
                for (int i = 0; i < uniqueNativeAdCount; i++) {
                    AppManage.facebookNativeAds.add(NativeAdsManager.this.nextNativeAd());
                }
            }
        });
        nativeAdsManager.loadAds();
    }

    public static void logEvent(String str, String str2, double d, String str3, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("adNetwork", str);
        bundle.putString(FirebaseAnalytics.Param.AD_FORMAT, str2);
        bundle.putDouble("value", d);
        bundle.putString(FirebaseAnalytics.Param.CURRENCY, str3);
        bundle.putInt("precisionType", i);
        FirebaseAnalytics.getInstance(activity).logEvent("ad_impression_w", bundle);
    }

    private void nextBannerPlatform(ViewGroup viewGroup, TextView textView) {
        if (this.banner_sequence.size() != 0) {
            this.banner_sequence.remove(0);
            if (this.banner_sequence.size() != 0) {
                showBanner(this.banner_sequence.get(0), viewGroup, textView);
            }
        }
    }

    private void nextInterstitialPlatform() {
        if (this.interstitial_sequence.size() == 0) {
            interstitialCallBack();
            return;
        }
        this.interstitial_sequence.remove(0);
        if (this.interstitial_sequence.size() != 0) {
            showInterstitialAd(this.interstitial_sequence.get(0));
        } else {
            interstitialCallBack();
        }
    }

    private void nextNativeBannerListPlatform(ViewGroup viewGroup, TextView textView) {
        if (this.native_sequence.size() != 0) {
            this.native_sequence.remove(0);
            if (this.native_sequence.size() != 0) {
                showNativeBannerList(this.native_sequence.get(0), viewGroup, textView);
            }
        }
    }

    private void nextNativeBannerPlatform(ViewGroup viewGroup, TextView textView) {
        if (this.banner_sequence.size() != 0) {
            this.banner_sequence.remove(0);
            if (this.banner_sequence.size() != 0) {
                showNativeBanner(this.banner_sequence.get(0), viewGroup, textView);
            }
        }
    }

    private void nextNativeListPlatform(ViewGroup viewGroup, TextView textView) {
        if (this.native_sequence2.size() != 0) {
            this.native_sequence2.remove(0);
            if (this.native_sequence2.size() != 0) {
                showNativeList(this.native_sequence2.get(0), viewGroup, textView);
            }
        }
    }

    private void nextNativePlatform(ViewGroup viewGroup, TextView textView) {
        if (this.native_sequence.size() != 0) {
            this.native_sequence.remove(0);
            if (this.native_sequence.size() != 0) {
                showNative(this.native_sequence.get(0), viewGroup, textView);
            }
        }
    }

    private void nextNativePlatform2(ViewGroup viewGroup, TextView textView) {
        if (this.native_sequence.size() != 0) {
            this.native_sequence.remove(0);
            if (this.native_sequence.size() != 0) {
                showNative(this.native_sequence.get(0), viewGroup, textView);
            }
        }
    }

    private void openCustomChromeTab(final Context context, final String str) {
        final String packageName = CustomTabsClient.getPackageName(context, Collections.singletonList("com.android.chrome"));
        if (packageName == null) {
            interstitialCallBack();
            openDefaultBrowser(str);
        } else {
            final long j = chromeTabDisplayTime * 1000;
            final CustomTabsSession[] customTabsSessionArr = {null};
            this.startTime = System.currentTimeMillis();
            CustomTabsClient.bindCustomTabsService(context, packageName, new CustomTabsServiceConnection() { // from class: com.pesonal.adsdk.AppManage.69
                @Override // androidx.browser.customtabs.CustomTabsServiceConnection
                public final void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
                    customTabsClient.warmup(0L);
                    customTabsSessionArr[0] = customTabsClient.newSession(new CustomTabsCallback() { // from class: com.pesonal.adsdk.AppManage.69.1
                        @Override // androidx.browser.customtabs.CustomTabsCallback
                        public final void onNavigationEvent(int i, Bundle bundle) {
                            if (i == 2 || i == 1 || i != 6) {
                                return;
                            }
                            long currentTimeMillis = System.currentTimeMillis();
                            AnonymousClass69 anonymousClass69 = AnonymousClass69.this;
                            AppManage appManage = AppManage.this;
                            if (currentTimeMillis - appManage.startTime >= j) {
                                appManage.interstitialCallBack();
                            } else {
                                appManage.DialogAdsNotLoaded(AppManage.activity, customTabsSessionArr, packageName, str);
                            }
                        }
                    });
                    String str2 = str;
                    if (str2 == null || !Patterns.WEB_URL.matcher(str2).matches()) {
                        AppManage.this.interstitialCallBack();
                        AppManage.this.openDefaultBrowser(str);
                        return;
                    }
                    CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder(customTabsSessionArr[0]);
                    builder.setToolbarColor(ContextCompat.getColor(context, R.color.white)).setShowTitle(true);
                    CustomTabsIntent build = builder.build();
                    build.intent.setPackage(packageName);
                    build.intent.setData(Uri.parse(str));
                    build.intent.addFlags(1073741824);
                    context.startActivity(build.intent);
                }

                @Override // android.content.ServiceConnection
                public final void onServiceDisconnected(ComponentName componentName) {
                    customTabsSessionArr[0] = null;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openDefaultBrowser(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            Activity activity2 = activity;
            if (activity2 != null) {
                activity2.startActivity(intent);
            }
        } catch (Exception unused) {
        }
    }

    private void openPartialChromeTab(final String str, final String str2) {
        final CustomTabsSession[] customTabsSessionArr = {null};
        CustomTabsClient.bindCustomTabsService(activity, str, new CustomTabsServiceConnection() { // from class: com.pesonal.adsdk.AppManage.71
            @Override // androidx.browser.customtabs.CustomTabsServiceConnection
            public final void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
                customTabsClient.warmup(0L);
                customTabsSessionArr[0] = customTabsClient.newSession(new CustomTabsCallback() { // from class: com.pesonal.adsdk.AppManage.71.1
                    @Override // androidx.browser.customtabs.CustomTabsCallback
                    public final void onNavigationEvent(int i, Bundle bundle) {
                    }
                });
                String str3 = str2;
                if (str3 == null || !Patterns.WEB_URL.matcher(str3).matches()) {
                    AppManage.this.openDefaultBrowser(str2);
                    return;
                }
                CustomTabsIntent.Builder initialActivityHeightPx = new CustomTabsIntent.Builder(customTabsSessionArr[0]).setInitialActivityHeightPx((int) TypedValue.applyDimension(1, 200, AppManage.activity.getResources().getDisplayMetrics()), 1);
                CustomTabsSession customTabsSession = customTabsSessionArr[0];
                if (customTabsSession != null) {
                    customTabsSession.mayLaunchUrl(Uri.parse(str2), null, null);
                }
                initialActivityHeightPx.setToolbarColor(ContextCompat.getColor(AppManage.activity, R.color.white)).setShowTitle(true);
                CustomTabsIntent build = initialActivityHeightPx.build();
                build.intent.setPackage(str);
                build.intent.setData(Uri.parse(str2));
                build.intent.addFlags(1073741824);
                AppManage.activity.startActivity(build.intent);
            }

            @Override // android.content.ServiceConnection
            public final void onServiceDisconnected(ComponentName componentName) {
                customTabsSessionArr[0] = null;
            }
        });
    }

    private void preloadAdmobNativeBanner(Activity activity2) {
        if (mysharedpreferences.getInt("app_adShowStatus", 1) == 0 || admob_AdStatus != 1 || this.admob_nb.isEmpty() || this.isNativeBannerAdLoaded) {
            return;
        }
        new AdLoader.Builder(activity2, this.admob_nb).forNativeAd(new AnonymousClass41()).withAdListener(new AdListener() { // from class: com.pesonal.adsdk.AppManage.40
            @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.ads.internal.client.zza
            public final void onAdClicked() {
                AppManage.interStatus = true;
            }

            @Override // com.google.android.gms.ads.AdListener
            public final void onAdFailedToLoad(LoadAdError loadAdError) {
                loadAdError.getMessage();
            }
        }).withNativeAdOptions(new NativeAdOptions.Builder().build()).build().loadAd(new AdRequest.Builder().build());
    }

    private void preloadFacebookBannerAd() {
        if (this.isFacebookBannerLoaded || facebook_AdStatus != 1 || FACEBOOK_B1.isEmpty()) {
            return;
        }
        com.facebook.ads.AdView adView = new com.facebook.ads.AdView(activity, FACEBOOK_B1, com.facebook.ads.AdSize.BANNER_HEIGHT_50);
        this.facebookBannerAd = adView;
        adView.loadAd(adView.buildLoadAdConfig().withAdListener(new com.facebook.ads.AdListener() { // from class: com.pesonal.adsdk.AppManage.39
            @Override // com.facebook.ads.AdListener
            public final void onAdClicked(Ad ad) {
                AppManage.interStatus = true;
            }

            @Override // com.facebook.ads.AdListener
            public final void onAdLoaded(Ad ad) {
                AppManage.this.isFacebookBannerLoaded = true;
            }

            @Override // com.facebook.ads.AdListener
            public final void onError(Ad ad, AdError adError) {
                adError.getErrorMessage();
                adError.getErrorCode();
            }

            @Override // com.facebook.ads.AdListener
            public final void onLoggingImpression(Ad ad) {
            }
        }).build());
    }

    private void preloadFacebookExitNativeAd() {
        if (this.isFacebookExitNativeLoaded || facebook_AdStatus != 1 || FACEBOOK_ExitNative.isEmpty()) {
            return;
        }
        com.facebook.ads.NativeAd nativeAd = new com.facebook.ads.NativeAd(activity, FACEBOOK_ExitNative);
        this.facebookExitNativeAd = nativeAd;
        nativeAd.loadAd(nativeAd.buildLoadAdConfig().withAdListener(new NativeAdListener() { // from class: com.pesonal.adsdk.AppManage.5
            @Override // com.facebook.ads.AdListener
            public final void onAdClicked(Ad ad) {
                AppManage.interStatus = true;
            }

            @Override // com.facebook.ads.AdListener
            public final void onAdLoaded(Ad ad) {
                if (AppManage.this.facebookExitNativeAd == null || AppManage.this.facebookExitNativeAd != ad) {
                    return;
                }
                AppManage.this.isFacebookExitNativeLoaded = true;
            }

            @Override // com.facebook.ads.AdListener
            public final void onError(Ad ad, AdError adError) {
                adError.getErrorMessage();
            }

            @Override // com.facebook.ads.AdListener
            public final void onLoggingImpression(Ad ad) {
            }

            @Override // com.facebook.ads.NativeAdListener
            public final void onMediaDownloaded(Ad ad) {
            }
        }).build());
    }

    private void preloadFacebookNativeAd() {
        if (this.isFacebookNativeLoaded || facebook_AdStatus != 1 || FACEBOOK_N1.isEmpty()) {
            return;
        }
        com.facebook.ads.NativeAd nativeAd = new com.facebook.ads.NativeAd(activity, FACEBOOK_N1);
        this.facebookNativeAd = nativeAd;
        nativeAd.loadAd(nativeAd.buildLoadAdConfig().withAdListener(new NativeAdListener() { // from class: com.pesonal.adsdk.AppManage.45
            @Override // com.facebook.ads.AdListener
            public final void onAdClicked(Ad ad) {
                AppManage.interStatus = true;
            }

            @Override // com.facebook.ads.AdListener
            public final void onAdLoaded(Ad ad) {
                if (AppManage.this.facebookNativeAd == null || AppManage.this.facebookNativeAd != ad) {
                    return;
                }
                AppManage.this.isFacebookNativeLoaded = true;
            }

            @Override // com.facebook.ads.AdListener
            public final void onError(Ad ad, AdError adError) {
                adError.getErrorMessage();
            }

            @Override // com.facebook.ads.AdListener
            public final void onLoggingImpression(Ad ad) {
            }

            @Override // com.facebook.ads.NativeAdListener
            public final void onMediaDownloaded(Ad ad) {
            }
        }).build());
    }

    private void preloadFacebookNativeBannerAd() {
        if (this.isFacebookNativeBannerLoaded || facebook_AdStatus != 1 || FACEBOOK_NB1.isEmpty()) {
            return;
        }
        NativeBannerAd nativeBannerAd = new NativeBannerAd(activity, FACEBOOK_NB1);
        this.facebookNativeBannerAd = nativeBannerAd;
        nativeBannerAd.loadAd(nativeBannerAd.buildLoadAdConfig().withAdListener(new NativeAdListener() { // from class: com.pesonal.adsdk.AppManage.42
            @Override // com.facebook.ads.AdListener
            public final void onAdClicked(Ad ad) {
                AppManage.interStatus = true;
            }

            @Override // com.facebook.ads.AdListener
            public final void onAdLoaded(Ad ad) {
                if (AppManage.this.facebookNativeBannerAd == null || AppManage.this.facebookNativeBannerAd != ad) {
                    return;
                }
                AppManage.this.facebookNativeBannerAd.downloadMedia();
                AppManage.this.isFacebookNativeBannerLoaded = true;
            }

            @Override // com.facebook.ads.AdListener
            public final void onError(Ad ad, AdError adError) {
                adError.getErrorMessage();
            }

            @Override // com.facebook.ads.AdListener
            public final void onLoggingImpression(Ad ad) {
            }

            @Override // com.facebook.ads.NativeAdListener
            public final void onMediaDownloaded(Ad ad) {
            }
        }).build());
    }

    private void preloadGoogleBannerAd() {
        if (!this.isGoogleBannerLoaded && admob_AdStatus == 1) {
            this.googleBannerAd = new AdView(activity);
            if (this.admob_b.isEmpty()) {
                return;
            }
            this.googleBannerAd.setAdSize(AdSize.SMART_BANNER);
            this.googleBannerAd.setAdUnitId(this.admob_b);
            this.googleBannerAd.loadAd(new AdRequest.Builder().build());
            this.googleBannerAd.setAdListener(new AnonymousClass38());
        }
    }

    private void preloadGoogleNativeAd() {
        if (this.isGoogleNativeLoaded || admob_AdStatus != 1 || this.admob_n.isEmpty()) {
            return;
        }
        AdLoader.Builder builder = new AdLoader.Builder(activity, this.admob_n);
        builder.forNativeAd(new AnonymousClass43());
        builder.withNativeAdOptions(new NativeAdOptions.Builder().setVideoOptions(new VideoOptions.Builder().setStartMuted(true).build()).build());
        builder.withAdListener(new AdListener() { // from class: com.pesonal.adsdk.AppManage.44
            @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.ads.internal.client.zza
            public final void onAdClicked() {
                AppManage.interStatus = true;
            }

            @Override // com.google.android.gms.ads.AdListener
            public final void onAdFailedToLoad(LoadAdError loadAdError) {
                loadAdError.getMessage();
                loadAdError.toString();
            }
        }).build().loadAd(new AdRequest.Builder().build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void preloadRewardInterstitial(String str) {
        this.admob_ir = str;
        if (admob_AdStatus == 1 && !str.isEmpty() && this.mRewardedInterAd == null) {
            RewardedInterstitialAd.load((Context) activity, this.admob_ir, new AdManagerAdRequest.Builder().build(), (RewardedInterstitialAdLoadCallback) new AnonymousClass61());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void preloadRewardVideo(String str) {
        this.admob_r = str;
        if (admob_AdStatus == 1 && !str.isEmpty() && this.mRewardedVideoAd == null) {
            RewardedAd.load(activity, this.admob_r, new AdRequest.Builder().build(), new AnonymousClass57());
        }
    }

    private void showAdmobBanner(ViewGroup viewGroup, TextView textView) {
        if (this.admob_b.isEmpty() || admob_AdStatus == 0) {
            nextBannerPlatform(viewGroup, textView);
            return;
        }
        viewGroup.setVisibility(0);
        if (this.isGoogleBannerLoaded) {
            this.extraGoogleBannerAd = this.googleBannerAd;
            if (textView != null) {
                textView.setVisibility(8);
            }
            if (this.extraGoogleBannerAd != null) {
                ViewGroup viewGroup2 = this.parentView;
                if (viewGroup2 != null) {
                    viewGroup2.removeAllViews();
                }
                viewGroup.removeAllViews();
                viewGroup.addView(this.extraGoogleBannerAd);
                this.parentView = viewGroup;
            }
            this.isGoogleBannerLoaded = false;
            preloadGoogleBannerAd();
            return;
        }
        if (!this.isFacebookBannerLoaded) {
            if (backFill == 1) {
                show_custom_BanerADS(viewGroup);
            }
            this.isGoogleBannerLoaded = false;
            preloadGoogleBannerAd();
            return;
        }
        this.extraFacebookBannerAd = this.facebookBannerAd;
        if (textView != null) {
            textView.setVisibility(8);
        }
        if (this.extraFacebookBannerAd != null) {
            ViewGroup viewGroup3 = this.parentView;
            if (viewGroup3 != null) {
                viewGroup3.removeAllViews();
            }
            viewGroup.removeAllViews();
            viewGroup.addView(this.extraFacebookBannerAd);
            this.parentView = viewGroup;
        }
        this.isFacebookBannerLoaded = false;
        preloadFacebookBannerAd();
    }

    private void showAdmobExitNative(ViewGroup viewGroup, TextView textView) {
        if (this.admob_exit_n.isEmpty() || admob_AdStatus == 0) {
            nextNativePlatform(viewGroup, textView);
            return;
        }
        if (this.isGoogleExitNativeLoaded) {
            if (textView != null) {
                textView.setVisibility(8);
            }
            new Inflate_ADS(activity).inflate_NATIV_ADMOB(this.googleExitNativeAd, viewGroup);
            this.isGoogleExitNativeLoaded = false;
            return;
        }
        if (this.isFacebookExitNativeLoaded) {
            if (textView != null) {
                textView.setVisibility(8);
            }
            new Inflate_ADS(activity).inflate_NATIV_FB(this.facebookExitNativeAd, viewGroup);
            this.isFacebookExitNativeLoaded = false;
            return;
        }
        if (backFill == 1) {
            if (textView != null) {
                textView.setVisibility(8);
            }
            show_custom_native(viewGroup);
        }
        this.isGoogleExitNativeLoaded = false;
    }

    private void showAdmobInterstitialAd(View view) {
        com.google.android.gms.ads.interstitial.InterstitialAd interstitialAd = this.interstitial1;
        if (interstitialAd != null) {
            if (app_dialogBeforeAdShow != 1) {
                interstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() { // from class: com.pesonal.adsdk.AppManage.50
                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public final void onAdClicked() {
                        AppManage.interStatus = true;
                    }

                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public final void onAdDismissedFullScreenContent() {
                        AppManage.this.interstitialCallBack();
                        AppManage appManage = AppManage.this;
                        appManage.interstitial1 = null;
                        appManage.loadAdmobInterstitial(appManage.admob_i);
                    }

                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public final void onAdFailedToShowFullScreenContent(com.google.android.gms.ads.AdError adError) {
                        AppManage.this.interstitialCallBack();
                        AppManage appManage = AppManage.this;
                        appManage.interstitial1 = null;
                        appManage.loadAdmobInterstitial(appManage.admob_i);
                    }

                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public final void onAdShowedFullScreenContent() {
                        AppManage.this.lastAdShownTime = System.currentTimeMillis();
                    }
                });
                this.interstitial1.show(activity);
                return;
            } else {
                this.dialog.show();
                final CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) view.findViewById(R.id.circular_progress);
                circularProgressIndicator.setProgress(0);
                new CountDownTimer(ad_dialog_time_in_second * 1000) { // from class: com.pesonal.adsdk.AppManage.49
                    @Override // android.os.CountDownTimer
                    public final void onFinish() {
                        AppManage.this.dialog.dismiss();
                        AppManage.this.interstitial1.show(AppManage.activity);
                        AppManage.this.interstitial1.setFullScreenContentCallback(new FullScreenContentCallback() { // from class: com.pesonal.adsdk.AppManage.49.1
                            @Override // com.google.android.gms.ads.FullScreenContentCallback
                            public final void onAdClicked() {
                                AppManage.interStatus = true;
                            }

                            @Override // com.google.android.gms.ads.FullScreenContentCallback
                            public final void onAdDismissedFullScreenContent() {
                                AppManage.this.interstitialCallBack();
                                AppManage appManage = AppManage.this;
                                appManage.interstitial1 = null;
                                appManage.loadAdmobInterstitial(appManage.admob_i);
                            }

                            @Override // com.google.android.gms.ads.FullScreenContentCallback
                            public final void onAdFailedToShowFullScreenContent(com.google.android.gms.ads.AdError adError) {
                                AppManage.this.interstitialCallBack();
                                AppManage appManage = AppManage.this;
                                appManage.interstitial1 = null;
                                appManage.loadAdmobInterstitial(appManage.admob_i);
                            }

                            @Override // com.google.android.gms.ads.FullScreenContentCallback
                            public final void onAdShowedFullScreenContent() {
                                AppManage.this.lastAdShownTime = System.currentTimeMillis();
                            }
                        });
                    }

                    @Override // android.os.CountDownTimer
                    public final void onTick(long j) {
                        circularProgressIndicator.setProgress((int) ((j / 10) / AppManage.ad_dialog_time_in_second));
                    }
                }.start();
                return;
            }
        }
        if (backFill != 1) {
            interstitialCallBack();
        } else if (app_dialogBeforeAdShow == 1) {
            this.dialog.show();
            final CircularProgressIndicator circularProgressIndicator2 = (CircularProgressIndicator) view.findViewById(R.id.circular_progress);
            circularProgressIndicator2.setProgress(0);
            new CountDownTimer(ad_dialog_time_in_second * 1000) { // from class: com.pesonal.adsdk.AppManage.51
                @Override // android.os.CountDownTimer
                public final void onFinish() {
                    AppManage.this.dialog.dismiss();
                    AppManage.this.show_custom_ads(AppManage.activity);
                    AppManage.this.lastAdShownTime = System.currentTimeMillis();
                }

                @Override // android.os.CountDownTimer
                public final void onTick(long j) {
                    circularProgressIndicator2.setProgress((int) ((j / 10) / AppManage.ad_dialog_time_in_second));
                }
            }.start();
        } else {
            show_custom_ads(activity);
            this.lastAdShownTime = System.currentTimeMillis();
        }
        this.interstitial1 = null;
        loadAdmobInterstitial(this.admob_i);
    }

    private void showAdmobNative(ViewGroup viewGroup, TextView textView) {
        if (this.admob_n.isEmpty() || admob_AdStatus == 0) {
            nextNativePlatform(viewGroup, textView);
            return;
        }
        if (this.isGoogleNativeLoaded) {
            if (textView != null) {
                textView.setVisibility(8);
            }
            new Inflate_ADS(activity).inflate_NATIV_ADMOB(this.googleNativeAd, viewGroup);
            this.isGoogleNativeLoaded = false;
            preloadGoogleNativeAd();
            return;
        }
        if (this.isFacebookNativeLoaded) {
            if (textView != null) {
                textView.setVisibility(8);
            }
            new Inflate_ADS(activity).inflate_NATIV_FB(this.facebookNativeAd, viewGroup);
            this.isFacebookNativeLoaded = false;
            preloadFacebookNativeAd();
            return;
        }
        if (backFill == 1) {
            if (textView != null) {
                textView.setVisibility(8);
            }
            show_custom_native(viewGroup);
        }
        this.isGoogleNativeLoaded = false;
        preloadGoogleNativeAd();
    }

    private void showBanner(String str, ViewGroup viewGroup, TextView textView) {
        if (!app_mixedAdFlow.isEmpty()) {
            String[] split = app_mixedAdFlow.split(",");
            if (split[0].equalsIgnoreCase(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS)) {
                if (isUserNotConsent() && app_UserNotAcceptConsentFormCustomAdShow == 1) {
                    show_custom_BanerADS(viewGroup);
                    return;
                } else {
                    showAdmobBanner(viewGroup, textView);
                    return;
                }
            }
            if (split[0].equalsIgnoreCase("C")) {
                show_custom_BanerADS(viewGroup);
                return;
            } else {
                if (split[0].equalsIgnoreCase("F")) {
                    showFacebookBanner(viewGroup, textView);
                    return;
                }
                return;
            }
        }
        if (str.equals("Admob") && admob_AdStatus == 1) {
            if (isUserNotConsent() && app_UserNotAcceptConsentFormCustomAdShow == 1) {
                show_custom_BanerADS(viewGroup);
                return;
            } else {
                showAdmobBanner(viewGroup, textView);
                return;
            }
        }
        if (str.equals("Facebookaudiencenetwork") && facebook_AdStatus == 1) {
            showFacebookBanner(viewGroup, textView);
        } else if (str.equals("CustomLink") && custom_AdStatus == 1) {
            show_custom_BanerADS(viewGroup);
        } else {
            nextBannerPlatform(viewGroup, textView);
        }
    }

    private void showExitNative(String str, ViewGroup viewGroup, TextView textView) {
        if (!app_mixedAdFlow.isEmpty()) {
            String[] split = app_mixedAdFlow.split(",");
            if (split[1].equalsIgnoreCase(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS)) {
                if (isUserNotConsent() && app_UserNotAcceptConsentFormCustomAdShow == 1) {
                    show_custom_native(viewGroup);
                    return;
                } else {
                    showAdmobExitNative(viewGroup, textView);
                    return;
                }
            }
            if (split[1].equalsIgnoreCase("C")) {
                show_custom_native(viewGroup);
                return;
            } else {
                if (split[1].equalsIgnoreCase("F")) {
                    showFacebookExitNative(viewGroup, textView);
                    return;
                }
                return;
            }
        }
        if (str.equals("Admob") && admob_AdStatus == 1) {
            if (isUserNotConsent() && app_UserNotAcceptConsentFormCustomAdShow == 1) {
                show_custom_native(viewGroup);
                return;
            } else {
                showAdmobExitNative(viewGroup, textView);
                return;
            }
        }
        if (str.equals("Facebookaudiencenetwork") && facebook_AdStatus == 1) {
            showFacebookExitNative(viewGroup, textView);
        } else if (str.equals("CustomLink") && custom_AdStatus == 1) {
            show_custom_native(viewGroup);
        } else {
            nextNativePlatform(viewGroup, textView);
        }
    }

    private void showFacebookBanner(ViewGroup viewGroup, TextView textView) {
        if (this.facebook_b.isEmpty() || facebook_AdStatus == 0) {
            nextBannerPlatform(viewGroup, textView);
            return;
        }
        viewGroup.setVisibility(0);
        if (this.isFacebookBannerLoaded) {
            this.extraFacebookBannerAd = this.facebookBannerAd;
            if (textView != null) {
                textView.setVisibility(8);
            }
            if (this.extraFacebookBannerAd != null) {
                ViewGroup viewGroup2 = this.parentView;
                if (viewGroup2 != null) {
                    viewGroup2.removeAllViews();
                }
                viewGroup.removeAllViews();
                viewGroup.addView(this.extraFacebookBannerAd);
                this.parentView = viewGroup;
            }
            this.isFacebookBannerLoaded = false;
            preloadFacebookBannerAd();
            return;
        }
        if (!this.isGoogleBannerLoaded) {
            if (backFill == 1) {
                show_custom_BanerADS(viewGroup);
            }
            this.isFacebookBannerLoaded = false;
            preloadFacebookBannerAd();
            return;
        }
        this.extraGoogleBannerAd = this.googleBannerAd;
        if (textView != null) {
            textView.setVisibility(8);
        }
        if (this.extraGoogleBannerAd != null) {
            ViewGroup viewGroup3 = this.parentView;
            if (viewGroup3 != null) {
                viewGroup3.removeAllViews();
            }
            viewGroup.removeAllViews();
            viewGroup.addView(this.extraGoogleBannerAd);
            this.parentView = viewGroup;
        }
        this.isGoogleBannerLoaded = false;
        preloadGoogleBannerAd();
    }

    private void showFacebookExitNative(ViewGroup viewGroup, TextView textView) {
        if (this.facebook_exit_n.isEmpty() || facebook_AdStatus == 0) {
            nextNativePlatform(viewGroup, textView);
            return;
        }
        if (this.isFacebookExitNativeLoaded) {
            if (textView != null) {
                textView.setVisibility(8);
            }
            new Inflate_ADS(activity).inflate_NATIV_FB(this.facebookExitNativeAd, viewGroup);
            this.isFacebookExitNativeLoaded = false;
            return;
        }
        if (this.isGoogleExitNativeLoaded) {
            if (textView != null) {
                textView.setVisibility(8);
            }
            new Inflate_ADS(activity).inflate_NATIV_ADMOB(this.googleExitNativeAd, viewGroup);
            this.isGoogleExitNativeLoaded = false;
            return;
        }
        if (textView != null) {
            textView.setVisibility(8);
        }
        if (backFill == 1) {
            show_custom_native(viewGroup);
        }
        this.isFacebookExitNativeLoaded = false;
    }

    private void showFacebookInterstitialAd(View view) {
        InterstitialAd interstitialAd;
        InterstitialAd interstitialAd2 = this.fbinterstitialAd1;
        if (interstitialAd2 == null) {
            if (backFill != 1) {
                interstitialCallBack();
            } else if (app_dialogBeforeAdShow == 1) {
                this.dialog.show();
                final CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) view.findViewById(R.id.circular_progress);
                circularProgressIndicator.setProgress(0);
                new CountDownTimer(ad_dialog_time_in_second * 1000) { // from class: com.pesonal.adsdk.AppManage.53
                    @Override // android.os.CountDownTimer
                    public final void onFinish() {
                        AppManage.this.dialog.dismiss();
                        AppManage.this.show_custom_ads(AppManage.activity);
                        AppManage.this.lastAdShownTime = System.currentTimeMillis();
                    }

                    @Override // android.os.CountDownTimer
                    public final void onTick(long j) {
                        circularProgressIndicator.setProgress((int) ((j / 10) / AppManage.ad_dialog_time_in_second));
                    }
                }.start();
            } else {
                show_custom_ads(activity);
                this.lastAdShownTime = System.currentTimeMillis();
            }
            loadFacebookInterstitial(this.facebook_i);
            return;
        }
        if (!interstitialAd2.isAdLoaded() || (interstitialAd = this.fbinterstitialAd1) == null) {
            this.fbinterstitialAd1.loadAd();
            interstitialCallBack();
        } else {
            if (app_dialogBeforeAdShow != 1) {
                interstitialAd.show();
                return;
            }
            this.dialog.show();
            final CircularProgressIndicator circularProgressIndicator2 = (CircularProgressIndicator) view.findViewById(R.id.circular_progress);
            circularProgressIndicator2.setProgress(0);
            new CountDownTimer(ad_dialog_time_in_second * 1000) { // from class: com.pesonal.adsdk.AppManage.52
                @Override // android.os.CountDownTimer
                public final void onFinish() {
                    AppManage.this.dialog.dismiss();
                    AppManage.this.fbinterstitialAd1.show();
                }

                @Override // android.os.CountDownTimer
                public final void onTick(long j) {
                    circularProgressIndicator2.setProgress((int) ((j / 10) / AppManage.ad_dialog_time_in_second));
                }
            }.start();
        }
    }

    private void showFacebookNative(ViewGroup viewGroup, TextView textView) {
        if (this.facebook_n.isEmpty() || facebook_AdStatus == 0) {
            nextNativePlatform(viewGroup, textView);
            return;
        }
        if (this.isFacebookNativeLoaded) {
            if (textView != null) {
                textView.setVisibility(8);
            }
            new Inflate_ADS(activity).inflate_NATIV_FB(this.facebookNativeAd, viewGroup);
            this.isFacebookNativeLoaded = false;
            preloadFacebookNativeAd();
            return;
        }
        if (this.isGoogleNativeLoaded) {
            if (textView != null) {
                textView.setVisibility(8);
            }
            new Inflate_ADS(activity).inflate_NATIV_ADMOB(this.googleNativeAd, viewGroup);
            this.isGoogleNativeLoaded = false;
            preloadGoogleNativeAd();
            return;
        }
        if (textView != null) {
            textView.setVisibility(8);
        }
        if (backFill == 1) {
            show_custom_native(viewGroup);
        }
        this.isFacebookNativeLoaded = false;
        preloadFacebookNativeAd();
    }

    private void showInterstitialAd(String str) {
        this.dialog = new Dialog(activity);
        View inflate = LayoutInflater.from(activity).inflate(R.layout.ad_progress_dialog, (ViewGroup) null);
        this.dialog.setContentView(inflate);
        this.dialog.setCancelable(false);
        this.dialog.getWindow().setLayout(-1, -2);
        if (!app_mixedAdFlow.isEmpty()) {
            String[] split = app_mixedAdFlow.split(",");
            if (split[3].equalsIgnoreCase(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS)) {
                if (isUserNotConsent() && app_UserNotAcceptConsentFormCustomAdShow == 1) {
                    show_custom_ads(activity);
                    return;
                } else {
                    showAdmobInterstitialAd(inflate);
                    return;
                }
            }
            if (split[3].equalsIgnoreCase("C")) {
                show_custom_ads(activity);
                return;
            } else {
                if (split[3].equalsIgnoreCase("F")) {
                    showFacebookInterstitialAd(inflate);
                    return;
                }
                return;
            }
        }
        if (str.equals("CustomLink") && custom_AdStatus == 1) {
            show_custom_ads(activity);
            return;
        }
        if (str.equals("Admob") && admob_AdStatus == 1) {
            if (isUserNotConsent() && app_UserNotAcceptConsentFormCustomAdShow == 1) {
                show_custom_ads(activity);
                return;
            } else {
                showAdmobInterstitialAd(inflate);
                return;
            }
        }
        if (str.equals("Facebookaudiencenetwork") && facebook_AdStatus == 1) {
            showFacebookInterstitialAd(inflate);
        } else {
            nextInterstitialPlatform();
        }
    }

    private void showNative(String str, ViewGroup viewGroup, TextView textView) {
        if (!app_mixedAdFlow.isEmpty()) {
            String[] split = app_mixedAdFlow.split(",");
            if (split[1].equalsIgnoreCase(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS)) {
                if (isUserNotConsent() && app_UserNotAcceptConsentFormCustomAdShow == 1) {
                    show_custom_native(viewGroup);
                    return;
                } else {
                    showAdmobNative(viewGroup, textView);
                    return;
                }
            }
            if (split[1].equalsIgnoreCase("C")) {
                show_custom_native(viewGroup);
                return;
            } else {
                if (split[1].equalsIgnoreCase("F")) {
                    showFacebookNative(viewGroup, textView);
                    return;
                }
                return;
            }
        }
        if (str.equals("Admob") && admob_AdStatus == 1) {
            if (isUserNotConsent() && app_UserNotAcceptConsentFormCustomAdShow == 1) {
                show_custom_native(viewGroup);
                return;
            } else {
                showAdmobNative(viewGroup, textView);
                return;
            }
        }
        if (str.equals("Facebookaudiencenetwork") && facebook_AdStatus == 1) {
            showFacebookNative(viewGroup, textView);
        } else if (str.equals("CustomLink") && custom_AdStatus == 1) {
            show_custom_native(viewGroup);
        } else {
            nextNativePlatform(viewGroup, textView);
        }
    }

    private void showNativeAdmobBanner(ViewGroup viewGroup, TextView textView) {
        if (this.admob_nb.isEmpty() || admob_AdStatus == 0) {
            nextNativeBannerPlatform(viewGroup, textView);
            return;
        }
        if (this.mNativeBannerAd != null) {
            new Inflate_ADS(activity).inflate_NATIV_BANNER_ADMOB(this.mNativeBannerAd, viewGroup);
        } else if (backFill == 1) {
            show_custom_BanerADS(viewGroup);
        }
        this.isNativeBannerAdLoaded = false;
        preloadAdmobNativeBanner(activity);
    }

    private void showNativeBanner(String str, ViewGroup viewGroup, TextView textView) {
        if (!app_mixedAdFlow.isEmpty()) {
            String[] split = app_mixedAdFlow.split(",");
            if (split[2].equalsIgnoreCase(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS)) {
                if (isUserNotConsent() && app_UserNotAcceptConsentFormCustomAdShow == 1) {
                    show_custom_nativeBanerADS(viewGroup);
                    return;
                } else {
                    showNativeAdmobBanner(viewGroup, textView);
                    return;
                }
            }
            if (split[2].equalsIgnoreCase("C")) {
                show_custom_nativeBanerADS(viewGroup);
                return;
            } else {
                if (split[2].equalsIgnoreCase("F")) {
                    showNativeFacebookBanner(viewGroup, textView);
                    return;
                }
                return;
            }
        }
        if (str.equals("Admob") && admob_AdStatus == 1) {
            if (isUserNotConsent() && app_UserNotAcceptConsentFormCustomAdShow == 1) {
                show_custom_nativeBanerADS(viewGroup);
                return;
            } else {
                showNativeAdmobBanner(viewGroup, textView);
                return;
            }
        }
        if (str.equals("Facebookaudiencenetwork") && facebook_AdStatus == 1) {
            showNativeFacebookBanner(viewGroup, textView);
        } else if (str.equals("CustomLink") && custom_AdStatus == 1) {
            show_custom_nativeBanerADS(viewGroup);
        } else {
            nextNativeBannerPlatform(viewGroup, textView);
        }
    }

    private void showNativeBannerList(String str, ViewGroup viewGroup, TextView textView) {
        if (str.equals("Admob") && admob_AdStatus == 1) {
            if (isUserNotConsent() && app_UserNotAcceptConsentFormCustomAdShow == 1) {
                showCustomLinkMultipleNativeBanner(viewGroup);
                return;
            } else {
                showGoogleMultipleNativeBanner(viewGroup, textView);
                return;
            }
        }
        if (str.equals("Facebookaudiencenetwork") && facebook_AdStatus == 1) {
            showFacebookMultipleNativeBanner(viewGroup, textView);
        } else if (str.equals("CustomLink") && custom_AdStatus == 1) {
            showCustomLinkMultipleNativeBanner(viewGroup);
        } else {
            nextNativeBannerListPlatform(viewGroup, textView);
        }
    }

    private void showNativeFacebookBanner(ViewGroup viewGroup, TextView textView) {
        if (this.facebook_nb.isEmpty() || facebook_AdStatus == 0) {
            nextNativeBannerPlatform(viewGroup, textView);
            return;
        }
        if (this.isFacebookNativeBannerLoaded) {
            viewGroup.removeAllViews();
            viewGroup.setVisibility(0);
            if (textView != null) {
                textView.setVisibility(8);
            }
            new Inflate_ADS(activity).inflate_NB_FB(this.facebookNativeBannerAd, viewGroup);
        } else if (backFill == 1) {
            show_custom_BanerADS(viewGroup);
        }
        this.isFacebookNativeBannerLoaded = false;
        preloadFacebookNativeBannerAd();
    }

    private void showNativeList(String str, ViewGroup viewGroup, TextView textView) {
        if (str.equals("Admob") && admob_AdStatus == 1) {
            if (isUserNotConsent() && app_UserNotAcceptConsentFormCustomAdShow == 1) {
                showCustomLinkMultipleNative(viewGroup);
                return;
            } else {
                showGoogleMultipleNative(viewGroup, textView);
                return;
            }
        }
        if (str.equals("Facebookaudiencenetwork") && facebook_AdStatus == 1) {
            showFacebookMultipleNative(viewGroup, textView);
        } else if (str.equals("CustomLink") && custom_AdStatus == 1) {
            showCustomLinkMultipleNative(viewGroup);
        } else {
            nextNativeListPlatform(viewGroup, textView);
        }
    }

    private void show_custom_BanerADS(ViewGroup viewGroup) {
        viewGroup.setVisibility(0);
        View inflate = LayoutInflater.from(activity).inflate(R.layout.custom_qureka_banner, (ViewGroup) null);
        viewGroup.removeAllViews();
        viewGroup.addView(inflate);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.QurekaAds_banner);
        Random random = new Random();
        ArrayList arrayList = new ArrayList(Arrays.asList(TextUtils.split(Custom_B1.optString("image"), ",")));
        final int nextInt = random.nextInt(arrayList.size());
        if (((String) arrayList.get(nextInt)).contains(".gif")) {
            Glide.with(activity).asGif().load((String) arrayList.get(nextInt)).into(imageView);
        } else {
            Glide.with(activity).load((String) arrayList.get(nextInt)).into(imageView);
        }
        final ArrayList arrayList2 = new ArrayList(Arrays.asList(TextUtils.split(Custom_B1.optString("redirectLink"), ",")));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.pesonal.adsdk.AppManage.36
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                try {
                    AppManage.interStatus = true;
                    if (AppManage.appInsideCustomTabShow == 1) {
                        Intent intent = new Intent(AppManage.activity, (Class<?>) LauncherActivity.class);
                        intent.setData(Uri.parse((String) arrayList2.get(nextInt)));
                        intent.addFlags(805306368);
                        AppManage.activity.startActivity(intent);
                        return;
                    }
                    CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                    builder.setToolbarColor(Color.parseColor(AppManage.activity.getString(R.color.white))).setShowTitle(true);
                    CustomTabsIntent build = builder.build();
                    build.intent.setPackage("com.android.chrome");
                    build.intent.setFlags(1879048192);
                    build.launchUrl(AppManage.activity, Uri.parse((String) arrayList2.get(nextInt)));
                } catch (Exception unused) {
                    AppManage.this.openDefaultBrowser((String) arrayList2.get(nextInt));
                }
            }
        });
    }

    private void show_custom_native(ViewGroup viewGroup) {
        inflate_NATIV_Custom(viewGroup);
    }

    private void show_custom_nativeBanerADS(ViewGroup viewGroup) {
        Random random = new Random();
        ArrayList arrayList = new ArrayList(Arrays.asList(TextUtils.split(Custom_NB1.optString("image"), ",")));
        ArrayList arrayList2 = new ArrayList(Arrays.asList(TextUtils.split(Custom_NB1.optString("image2"), ",")));
        ArrayList arrayList3 = new ArrayList(Arrays.asList(TextUtils.split(Custom_NB1.optString("short_disc"), ",")));
        ArrayList arrayList4 = new ArrayList(Arrays.asList(TextUtils.split(Custom_NB1.optString("disc"), ",")));
        ArrayList arrayList5 = new ArrayList(Arrays.asList(TextUtils.split(Custom_NB1.optString("button_titel"), ",")));
        ArrayList arrayList6 = new ArrayList(Arrays.asList(TextUtils.split(Custom_NB1.optString("title"), ",")));
        final ArrayList arrayList7 = new ArrayList(Arrays.asList(TextUtils.split(Custom_NB1.optString("redirectLink"), ",")));
        viewGroup.setVisibility(0);
        View inflate = LayoutInflater.from(activity).inflate(R.layout.custom_native_banner, (ViewGroup) null);
        viewGroup.removeAllViews();
        viewGroup.addView(inflate);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.img_banner);
        final TextView textView = (TextView) inflate.findViewById(R.id.ad_call_to_action);
        TextView textView2 = (TextView) inflate.findViewById(R.id.title);
        TextView textView3 = (TextView) inflate.findViewById(R.id.dec);
        TextView textView4 = (TextView) inflate.findViewById(R.id.short_dec);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R.id.ads);
        ImageView imageView2 = (ImageView) inflate.findViewById(R.id.gifView);
        final int nextInt = random.nextInt(arrayList7.size());
        textView2.setText((CharSequence) arrayList6.get(nextInt));
        textView3.setText((CharSequence) arrayList4.get(nextInt));
        textView4.setText((CharSequence) arrayList3.get(nextInt));
        textView.setText((CharSequence) arrayList5.get(nextInt));
        if (((String) arrayList.get(nextInt)).contains(".gif")) {
            Glide.with(activity).asGif().load((String) arrayList.get(nextInt)).into(imageView);
        } else {
            Glide.with(activity).load((String) arrayList.get(nextInt)).into(imageView);
        }
        if (((String) arrayList2.get(nextInt)).contains(".gif")) {
            Glide.with(activity).asGif().load((String) arrayList2.get(nextInt)).into(imageView2);
        } else {
            Glide.with(activity).load((String) arrayList2.get(nextInt)).into(imageView2);
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.pesonal.adsdk.AppManage.34
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                try {
                    AppManage.interStatus = true;
                    if (AppManage.appInsideCustomTabShow == 1) {
                        Intent intent = new Intent(AppManage.activity, (Class<?>) LauncherActivity.class);
                        intent.setData(Uri.parse((String) arrayList7.get(nextInt)));
                        intent.addFlags(805306368);
                        AppManage.activity.startActivity(intent);
                        return;
                    }
                    CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                    builder.setToolbarColor(Color.parseColor(AppManage.activity.getString(R.color.white))).setShowTitle(true);
                    CustomTabsIntent build = builder.build();
                    build.intent.setPackage("com.android.chrome");
                    build.intent.setFlags(1879048192);
                    build.launchUrl(AppManage.activity, Uri.parse((String) arrayList7.get(nextInt)));
                } catch (Exception unused) {
                    AppManage.this.openDefaultBrowser((String) arrayList7.get(nextInt));
                }
            }
        });
        relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.pesonal.adsdk.AppManage.35
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                textView.callOnClick();
            }
        });
    }

    public void NoExit() {
        preloadExitBannerAds();
    }

    public void NoExitNative() {
        int i = app_ExitAdsShow;
        if (i == 1 && admob_AdStatus == 1 && !this.isGoogleExitNativeLoaded) {
            preloadGoogleExitNativeAd();
        } else if (i == 1 && facebook_AdStatus == 1 && !this.isFacebookExitNativeLoaded) {
            preloadFacebookExitNativeAd();
        }
    }

    public void closeHandler() {
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.handler = null;
        }
    }

    public void displayInterstitial(MyCallback myCallback2, Click click, String str) {
        int i;
        myCallback = myCallback2;
        Objects.toString(click);
        if (isFirstInterstitial) {
            MyCallback myCallback3 = myCallback;
            if (myCallback3 != null) {
                myCallback3.callbackCall();
                myCallback = null;
            }
            isFirstInterstitial = false;
            return;
        }
        Click click2 = Click.FORWARD;
        if (click == click2) {
            i = app_forwardClickAd;
            count_click++;
        } else if (click == Click.BACKWARD) {
            i = app_backwardClickAd;
            back_count_click++;
        } else if (click == Click.GUIDE) {
            i = app_guideClickAd;
            guid_count_click++;
        } else {
            i = 0;
        }
        if (mysharedpreferences.getInt("app_adShowStatus", 1) == 0) {
            MyCallback myCallback4 = myCallback;
            if (myCallback4 != null) {
                myCallback4.callbackCall();
                myCallback = null;
                return;
            }
            return;
        }
        if (app_interUsingTimeShow == 1) {
            if (System.currentTimeMillis() - this.lastAdShownTime < AD_COOLDOWN_MS) {
                MyCallback myCallback5 = myCallback;
                if (myCallback5 != null) {
                    myCallback5.callbackCall();
                    myCallback = null;
                    return;
                }
                return;
            }
        } else if (i != 0) {
            if ((click == click2 ? count_click : click == Click.BACKWARD ? back_count_click : guid_count_click) % i != 0) {
                MyCallback myCallback6 = myCallback;
                if (myCallback6 != null) {
                    myCallback6.callbackCall();
                    myCallback = null;
                    return;
                }
                return;
            }
        }
        count_click_for_alt++;
        int i2 = mysharedpreferences.getInt("app_howShowAd", 0);
        String string = mysharedpreferences.getString("app_adPlatformSequence", "");
        String string2 = mysharedpreferences.getString("app_alernateAdShow", "");
        admob_AdStatus = mysharedpreferences.getInt("admob_AdStatus", 0);
        facebook_AdStatus = mysharedpreferences.getInt("facebook_AdStatus", 0);
        if (str.isEmpty()) {
            str = string;
        } else {
            i2 = 0;
        }
        this.interstitial_sequence = new ArrayList<>();
        if (i2 == 0 && !str.isEmpty()) {
            Collections.addAll(this.interstitial_sequence, str.split(","));
        } else if (i2 != 1 || string2.isEmpty()) {
            MyCallback myCallback7 = myCallback;
            if (myCallback7 != null) {
                myCallback7.callbackCall();
                myCallback = null;
            }
        } else {
            String[] split = string2.split(",");
            for (int i3 = 0; i3 <= 10; i3++) {
                if (count_click_for_alt % split.length == i3) {
                    this.interstitial_sequence.add(split[i3]);
                }
            }
            String[] split2 = str.split(",");
            for (int i4 = 0; i4 < split2.length; i4++) {
                if (this.interstitial_sequence.size() != 0 && !this.interstitial_sequence.get(0).equals(split2[i4])) {
                    this.interstitial_sequence.add(split2[i4]);
                }
            }
        }
        if (this.interstitial_sequence.size() != 0) {
            showInterstitialAd(this.interstitial_sequence.get(0));
        }
    }

    public void getResponseFromPref(String str, getDataListner getdatalistner, int i) {
        if (str.isEmpty()) {
            getdatalistner.onUpdate("https://play.google.com/store/apps/details?id=" + activity.getPackageName());
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("status") == 200) {
                app_privacyPolicyLink = jSONObject.optString("app_privacyPolicyLink");
                app_adShowStatus = jSONObject.optInt("app_adShowStatus");
                app_needInternet = jSONObject.optInt("app_needInternet");
                app_updateAppDialogStatus = jSONObject.optInt("app_updateAppDialogStatus");
                app_versionCode = jSONObject.optString("app_versionCode");
                app_redirectOtherAppStatus = jSONObject.optInt("app_redirectOtherAppStatus");
                app_newPackageName = jSONObject.optString("app_newPackageName");
                app_howShowAd = jSONObject.optInt("app_howShowAd");
                app_dualAds = jSONObject.optInt("app_dualAds");
                app_adPlatformSequence = jSONObject.optString("app_adPlatformSequence");
                app_alernateAdShow = jSONObject.optString("app_alernateAdShow");
                app_dialogBeforeAdShow = jSONObject.optInt("app_dialogBeforeAdShow");
                app_screenShow = jSONObject.optInt("app_screenShow");
                app_screenCount = jSONObject.optInt("app_screenCount");
                backFill = jSONObject.optInt("backFill");
                app_backwardClickAd = jSONObject.optInt("app_backwardClickAd");
                app_forwardClickAd = jSONObject.optInt("app_forwardClickAd");
                app_guideClickAd = jSONObject.optInt("app_guideClickAd");
                app_splashInterAndBannerAdShow = jSONObject.optInt("app_splashInterAndBannerAdShow");
                app_NativeCount = jSONObject.optInt("app_NativeCount");
                app_nativeAlter = jSONObject.optInt("app_nativeAlter");
                app_nativeBannerAlter = jSONObject.optInt("app_nativeBannerAlter");
                app_istwist = jSONObject.optInt("app_istwist");
                app_nativeColor = jSONObject.optString("app_nativeColor");
                game_show = jSONObject.optInt("game_show");
                game_url = jSONObject.optString("game_url");
                app_UserNotAcceptConsentFormCustomAdShow = jSONObject.optInt("app_UserNotAcceptConsentFormCustomAdShow");
                app_UserNotAcceptConsentAutoResetConsent = jSONObject.optInt("app_UserNotAcceptConsentAutoResetConsent");
                app_mixedAdFlow = jSONObject.optString("app_mixedAdFlow");
                app_ExitAdsShow = jSONObject.optInt("app_ExitAdsShow");
                app_interUsingTimeShow = jSONObject.optInt("app_interUsingTimeShow");
                app_interTimerSecond = jSONObject.optInt("app_interTimerSecond");
                nativeAdRefreshTime = jSONObject.optInt("nativeAdRefreshTime");
                AD_COOLDOWN_MS = app_interTimerSecond * 1000;
                JSONObject optJSONObject = jSONObject.optJSONObject("PLACEMENT").optJSONObject("Admob");
                admob_AdStatus = optJSONObject.optInt("ad_showAdStatus");
                admod_native_ads_height = optJSONObject.optInt("admod_native_ads_height");
                refresh_seconds = optJSONObject.optInt("refresh_seconds");
                SplashBanner1 = optJSONObject.optString("SplashBanner1");
                ADMOB_ExitNative = optJSONObject.optString("ExitNative");
                CollapseBanner1 = optJSONObject.optString("CollapseBanner1");
                ExitBanner = optJSONObject.optString("ExitBanner");
                banner_collapsible = optJSONObject.optBoolean("banner_collapsible");
                refresh_collapse = optJSONObject.optBoolean("refresh_collapse");
                ADMOB_AppOpen1 = optJSONObject.optString("AppOpen1");
                AppId = optJSONObject.optString("AppId");
                ADMOB_B1 = optJSONObject.optString("Banner1");
                ADMOB_I1 = optJSONObject.optString("Interstitial1");
                ADMOB_N1 = optJSONObject.optString("Native1");
                ADMOB_NB1 = optJSONObject.optString("NativeBanner1");
                ADMOB_N_List = optJSONObject.optString("NativeList");
                ADMOB_R1 = optJSONObject.optString("RewardedVideo1");
                ADMOB_IR1 = optJSONObject.optString("RewardedInter1");
                JSONObject optJSONObject2 = jSONObject.optJSONObject("PLACEMENT").optJSONObject("Facebookaudiencenetwork");
                facebook_AdStatus = optJSONObject2.optInt("ad_showAdStatus");
                fb_native_ads_height = optJSONObject2.optInt("fb_native_ads_height");
                FACEBOOK_B1 = optJSONObject2.optString("Banner1");
                FACEBOOK_NB1 = optJSONObject2.optString("NativeBanner1");
                FACEBOOK_I1 = optJSONObject2.optString("Interstitial1");
                FACEBOOK_N1 = optJSONObject2.optString("Native1");
                FACEBOOK_ExitNative = optJSONObject2.optString("ExitNative");
                FACEBOOK_N_List = optJSONObject2.optString("NativeList");
                APP_ID = optJSONObject2.optString("facebook_app_id");
                CLIENT_TOKEN = optJSONObject2.optString("facebook_client_token");
                JSONObject optJSONObject3 = jSONObject.optJSONObject("PLACEMENT").optJSONObject("CustomLink");
                custom_AdStatus = optJSONObject3.optInt("ad_showAdStatus");
                custom_native_ads_height = optJSONObject3.optInt("custom_native_ads_height");
                partialCustomTabShow = optJSONObject3.optInt("partialCustomTabShow");
                partialCustomTabUrl = optJSONObject3.optString("partialCustomTabUrl");
                chromeTabDisplayTime = optJSONObject3.optInt("chromeTabDisplayTime");
                onResumeDirectUrlOpen = optJSONObject3.optInt("onResumeDirectUrlOpen");
                appInsideCustomTabShow = optJSONObject3.optInt("appInsideCustomTabShow");
                Custom_I1 = optJSONObject3.optJSONObject("Interstitial");
                Custom_N1 = optJSONObject3.optJSONObject("nativeads");
                Custom_B1 = optJSONObject3.optJSONObject("BannerAds");
                Custom_NB1 = optJSONObject3.optJSONObject("NativeBannerAds");
                Custom_appopen = optJSONObject3.optJSONObject("appopen");
                JSONObject optJSONObject4 = jSONObject.optJSONObject("splashAds");
                if (optJSONObject4 != null) {
                    ad_showSplashAdsStatus = optJSONObject4.optInt("ad_showSplashAdsStatus");
                    splashAppOpenOrInterShow = optJSONObject4.optInt("splashAppOpenOrInterShow");
                    splashBannerShow = optJSONObject4.optInt("splashBannerShow");
                }
                isEncrypt = jSONObject.optJSONObject("EXTRA").optInt("isEncrypt");
                SharedPreferences.Editor edit = mysharedpreferences.edit();
                edit.putString("app_privacyPolicyLink", app_privacyPolicyLink);
                edit.putInt("app_adShowStatus", app_adShowStatus);
                edit.putInt("app_needInternet", app_needInternet);
                edit.putInt("app_updateAppDialogStatus", app_updateAppDialogStatus);
                edit.putString("app_versionCode", app_versionCode);
                edit.putInt("app_redirectOtherAppStatus", app_redirectOtherAppStatus);
                edit.putString("app_newPackageName", app_newPackageName);
                edit.putInt("app_howShowAd", app_howShowAd);
                edit.putString("app_adPlatformSequence", app_adPlatformSequence);
                edit.putString("app_alernateAdShow", app_alernateAdShow);
                edit.putInt("admob_AdStatus", admob_AdStatus);
                edit.putInt("facebook_AdStatus", facebook_AdStatus);
                edit.commit();
            }
        } catch (Exception unused) {
        }
        if (app_redirectOtherAppStatus == 1) {
            getdatalistner.onRedirect(app_newPackageName);
            return;
        }
        if (app_updateAppDialogStatus == 1 && checkUpdate(i)) {
            getdatalistner.onUpdate("https://play.google.com/store/apps/details?id=" + activity.getPackageName());
            return;
        }
        getdatalistner.onsuccess();
        MyCallback myCallback2 = myCallback;
        if (myCallback2 != null) {
            myCallback2.callbackCall();
            myCallback = null;
        }
    }

    public void inflate_NATIV_Custom(ViewGroup viewGroup) {
        Random random = new Random();
        ArrayList arrayList = new ArrayList(Arrays.asList(TextUtils.split(Custom_N1.optString("image2"), ",")));
        ArrayList arrayList2 = new ArrayList(Arrays.asList(TextUtils.split(Custom_N1.optString("image"), ",")));
        ArrayList arrayList3 = new ArrayList(Arrays.asList(TextUtils.split(Custom_N1.optString("short_disc"), ",")));
        ArrayList arrayList4 = new ArrayList(Arrays.asList(TextUtils.split(Custom_N1.optString("disc"), ",")));
        ArrayList arrayList5 = new ArrayList(Arrays.asList(TextUtils.split(Custom_N1.optString("button_titel"), ",")));
        final ArrayList arrayList6 = new ArrayList(Arrays.asList(TextUtils.split(Custom_N1.optString("redirectLink"), ",")));
        final int nextInt = random.nextInt(arrayList.size());
        viewGroup.setVisibility(0);
        View inflate = LayoutInflater.from(activity).inflate(R.layout.custom_ads_admob_layout, (ViewGroup) null);
        viewGroup.removeAllViews();
        viewGroup.addView(inflate);
        StringBuilder sb = new StringBuilder("_");
        int i = custom_native_ads_height;
        if (i <= 0) {
            i = Opcodes.GETFIELD;
        }
        int identifier = activity.getResources().getIdentifier(sb.append(i).append("sdp").toString(), "dimen", activity.getPackageName());
        if (identifier != 0) {
            int dimension = (int) activity.getResources().getDimension(identifier);
            ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
            layoutParams.height = dimension;
            inflate.setLayoutParams(layoutParams);
        }
        ImageView imageView = (ImageView) inflate.findViewById(R.id.imagview);
        ImageView imageView2 = (ImageView) inflate.findViewById(R.id.gifimagview);
        TextView textView = (TextView) inflate.findViewById(R.id.description);
        TextView textView2 = (TextView) inflate.findViewById(R.id.shortdiscrip);
        TextView textView3 = (TextView) inflate.findViewById(R.id.actionbutton);
        try {
            if (!app_nativeColor.equals("")) {
                textView3.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(app_nativeColor)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        textView3.setBackgroundResource(R.drawable.custom_admob_button);
        textView3.setText("" + ((String) arrayList5.get(nextInt)));
        textView2.setText("" + ((String) arrayList3.get(nextInt)));
        textView.setText("" + ((String) arrayList4.get(nextInt)));
        if (((String) arrayList2.get(nextInt)).contains(".gif")) {
            Glide.with(activity).asGif().load((String) arrayList2.get(nextInt)).into(imageView);
        } else {
            Glide.with(activity).load((String) arrayList2.get(nextInt)).into(imageView);
        }
        if (((String) arrayList.get(nextInt)).contains(".gif")) {
            Glide.with(activity).asGif().load((String) arrayList.get(nextInt)).into(imageView2);
        } else {
            Glide.with(activity).load((String) arrayList.get(nextInt)).into(imageView2);
        }
        ((CardView) inflate.findViewById(R.id.QurekaAds_native)).setOnClickListener(new View.OnClickListener() { // from class: com.pesonal.adsdk.AppManage.37
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                try {
                    AppManage.interStatus = true;
                    if (AppManage.appInsideCustomTabShow == 1) {
                        Intent intent = new Intent(AppManage.activity, (Class<?>) LauncherActivity.class);
                        intent.setData(Uri.parse((String) arrayList6.get(nextInt)));
                        intent.addFlags(805306368);
                        AppManage.activity.startActivity(intent);
                        return;
                    }
                    CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                    builder.setToolbarColor(Color.parseColor(AppManage.activity.getString(R.color.white))).setShowTitle(true);
                    CustomTabsIntent build = builder.build();
                    build.intent.setPackage("com.android.chrome");
                    build.intent.setFlags(1879048192);
                    build.launchUrl(AppManage.activity, Uri.parse(String.valueOf(arrayList6.get(nextInt))));
                } catch (Exception unused) {
                    AppManage.this.openDefaultBrowser((String) arrayList6.get(nextInt));
                }
            }
        });
    }

    public void interstitialCallBack() {
        MyCallback myCallback2 = myCallback;
        if (myCallback2 != null) {
            myCallback2.callbackCall();
            myCallback = null;
        }
    }

    public boolean isUserNotConsent() {
        return !mysharedpreferences.getBoolean("isUserConsent", true);
    }

    public void launchPartialCustomTab(Activity activity2) {
        if (app_adShowStatus == 0 || partialCustomTabShow == 0) {
            return;
        }
        String str = partialCustomTabUrl;
        String packageName = CustomTabsClient.getPackageName(activity2, Collections.singletonList("com.android.chrome"));
        if (packageName == null) {
            return;
        }
        openPartialChromeTab(packageName, str);
    }

    public void loadGoogleMultipleNative() {
        if (admob_AdStatus != 1 || ADMOB_N_List.isEmpty()) {
            return;
        }
        new AdLoader.Builder(activity, ADMOB_N_List).forNativeAd(new AnonymousClass55()).withAdListener(new AdListener() { // from class: com.pesonal.adsdk.AppManage.54
            @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.ads.internal.client.zza
            public final void onAdClicked() {
                AppManage.interStatus = true;
            }

            @Override // com.google.android.gms.ads.AdListener
            public final void onAdFailedToLoad(LoadAdError loadAdError) {
                Objects.toString(loadAdError);
            }
        }).withNativeAdOptions(new NativeAdOptions.Builder().build()).build().loadAds(new AdRequest.Builder().build(), 5);
    }

    public void loadintertialads(String str, String str2) {
        this.admob_i = str;
        this.facebook_i = str2;
        if (mysharedpreferences.getInt("app_adShowStatus", 1) == 0) {
            return;
        }
        if (admob_AdStatus == 1 && !this.admob_i.isEmpty()) {
            loadAdmobInterstitial(this.admob_i);
        }
        if (facebook_AdStatus != 1 || this.facebook_i.isEmpty()) {
            return;
        }
        loadFacebookInterstitial(this.facebook_i);
    }

    public void preLoaded(Activity activity2, final String str, final ViewGroup viewGroup, final AdListener adListener) {
        if (mysharedpreferences.getInt("app_adShowStatus", 1) == 0) {
            return;
        }
        int i = activity2.getResources().getDisplayMetrics().heightPixels;
        if (admob_AdStatus != 1 || CollapseBanner1.isEmpty()) {
            return;
        }
        AdView adView = new AdView(activity2);
        this.collapseAdView = adView;
        adView.setAdSize(getAdSizeCollapsible(activity2));
        AdSize.BANNER.getHeightInPixels(activity2);
        this.collapseAdView.setAdUnitId(CollapseBanner1);
        Bundle bundle = new Bundle();
        bundle.putString("collapsible", str);
        this.collapseAdView.loadAd(new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build());
        this.collapseAdView.setAdListener(new AdListener() { // from class: com.pesonal.adsdk.AppManage.67
            @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.ads.internal.client.zza
            public final void onAdClicked() {
                super.onAdClicked();
                AppManage.interStatus = true;
            }

            @Override // com.google.android.gms.ads.AdListener
            public final void onAdClosed() {
                super.onAdClosed();
                adListener.onAdClosed();
            }

            @Override // com.google.android.gms.ads.AdListener
            public final void onAdLoaded() {
                viewGroup.setVisibility(0);
                ViewGroup viewGroup2 = viewGroup;
                if (viewGroup2 != null && AppManage.this.collapseAdView != null) {
                    viewGroup2.removeAllViews();
                    viewGroup.addView(AppManage.this.collapseAdView);
                }
                AppManage appManage = AppManage.this;
                appManage.scheduleRefresh(AppManage.refresh_seconds, appManage.collapseAdView, str);
            }

            @Override // com.google.android.gms.ads.AdListener
            public final void onAdOpened() {
                super.onAdOpened();
                adListener.onAdOpened();
            }
        });
    }

    public void preloadAds() {
        initAd();
        String[] split = app_howShowAd == 0 ? app_adPlatformSequence.split(",") : app_alernateAdShow.split(",");
        this.admob_nb = ADMOB_NB1;
        this.admob_n = ADMOB_N1;
        this.admob_b = ADMOB_B1;
        this.admob_i = ADMOB_I1;
        this.admob_r = ADMOB_R1;
        this.admob_ir = ADMOB_IR1;
        this.admob_exit_n = ADMOB_ExitNative;
        this.facebook_nb = FACEBOOK_NB1;
        this.facebook_n = FACEBOOK_N1;
        this.facebook_b = FACEBOOK_B1;
        this.facebook_exit_n = FACEBOOK_ExitNative;
        if (app_adShowStatus == 1) {
            getInstance(activity).loadintertialads(ADMOB_I1, FACEBOOK_I1);
            for (String str : split) {
                if (str.equalsIgnoreCase("Admob")) {
                    preloadGoogleBannerAd();
                    preloadGoogleNativeAd();
                } else if (str.equalsIgnoreCase("Facebookaudiencenetwork")) {
                    if (facebook_AdStatus == 1 && app_ExitAdsShow == 1) {
                        preloadFacebookExitNativeAd();
                    }
                    preloadFacebookBannerAd();
                    preloadFacebookNativeAd();
                    preloadFacebookNativeBannerAd();
                    if (facebookNativeAds.size() < 15) {
                        loadFacebookMultipleNative();
                    }
                }
            }
            Collections.shuffle(facebookNativeAds);
            Collections.shuffle(googleNativeAds);
        }
    }

    public void preloadExitBannerAds() {
        if (!this.isTestExitBannerLoaded && admob_AdStatus == 1 && !ExitBanner.isEmpty() && app_ExitAdsShow == 1) {
            AdView adView = new AdView(activity);
            this.googleExitBannerAd = adView;
            adView.setAdSize(AdSize.MEDIUM_RECTANGLE);
            this.googleExitBannerAd.setAdUnitId(ExitBanner);
            this.googleExitBannerAd.loadAd(new AdRequest.Builder().build());
            this.googleExitBannerAd.setAdListener(new AnonymousClass2());
        }
    }

    public void preloadGoogleExitNativeAd() {
        if (this.isGoogleExitNativeLoaded || admob_AdStatus != 1 || this.admob_exit_n.isEmpty()) {
            return;
        }
        AdLoader.Builder builder = new AdLoader.Builder(activity, this.admob_exit_n);
        builder.forNativeAd(new AnonymousClass3());
        builder.withNativeAdOptions(new NativeAdOptions.Builder().setVideoOptions(new VideoOptions.Builder().setStartMuted(true).build()).build());
        builder.withAdListener(new AdListener() { // from class: com.pesonal.adsdk.AppManage.4
            @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.ads.internal.client.zza
            public final void onAdClicked() {
                AppManage.interStatus = true;
            }

            @Override // com.google.android.gms.ads.AdListener
            public final void onAdFailedToLoad(LoadAdError loadAdError) {
                loadAdError.getMessage();
                loadAdError.toString();
            }
        }).build().loadAd(new AdRequest.Builder().build());
    }

    public void scheduleRefresh(int i, final AdView adView, final String str) {
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        Handler handler2 = new Handler(Looper.getMainLooper());
        this.handler = handler2;
        handler2.postDelayed(new Runnable() { // from class: com.pesonal.adsdk.AppManage.68
            @Override // java.lang.Runnable
            public final void run() {
                AdRequest.Builder builder = new AdRequest.Builder();
                if (AppManage.this.shouldRequestCollapsible()) {
                    Bundle bundle = new Bundle();
                    bundle.putString("collapsible", str);
                    builder.addNetworkExtrasBundle(AdMobAdapter.class, bundle);
                }
                adView.loadAd(builder.build());
            }
        }, i * 1000);
    }

    public boolean shouldRequestCollapsible() {
        return refresh_collapse;
    }

    public void showAdapterNativeList(ViewGroup viewGroup, TextView textView) {
        this.admob_n = ADMOB_N1;
        this.facebook_n = FACEBOOK_N1;
        if (app_adShowStatus == 0) {
            return;
        }
        int i = mysharedpreferences.getInt("app_howShowAd", 0);
        String string = mysharedpreferences.getString("app_adPlatformSequence", "");
        String string2 = mysharedpreferences.getString("app_alernateAdShow", "");
        admob_AdStatus = mysharedpreferences.getInt("admob_AdStatus", 0);
        facebook_AdStatus = mysharedpreferences.getInt("facebook_AdStatus", 0);
        this.native_sequence2 = new ArrayList<>();
        if (i == 0 && !string.isEmpty()) {
            Collections.addAll(this.native_sequence2, string.split(","));
        } else if (i == 1 && !string2.isEmpty()) {
            String[] split = string2.split(",");
            for (int i2 = 0; i2 <= 10; i2++) {
                if (count_native % split.length == i2) {
                    this.native_sequence2.add(split[i2]);
                }
            }
            String[] split2 = string.split(",");
            for (int i3 = 0; i3 < split2.length; i3++) {
                if (this.native_sequence2.size() != 0 && !this.native_sequence2.get(0).equals(split2[i3])) {
                    this.native_sequence2.add(split2[i3]);
                }
            }
        }
        for (int i4 = 0; i4 < this.native_sequence2.size(); i4++) {
            if (this.native_sequence2.get(i4).equalsIgnoreCase("Unity")) {
                this.native_sequence2.remove(i4);
            }
        }
        if (this.native_sequence2.size() != 0) {
            showNativeList(this.native_sequence2.get(0), viewGroup, textView);
        }
    }

    public void showCustomLinkMultipleNative(ViewGroup viewGroup) {
        show_custom_native(viewGroup);
    }

    public void showCustomLinkMultipleNativeBanner(ViewGroup viewGroup) {
        show_custom_BanerADS(viewGroup);
    }

    public void showFacebookMultipleNative(ViewGroup viewGroup, TextView textView) {
        if (facebookNativeAds.size() > 0) {
            if (facebookNativeAds.size() > 0 && listAdPos > facebookNativeAds.size() - 1) {
                listAdPos = 0;
            }
            textView.setVisibility(8);
            new Inflate_ADS(activity).inflate_NATIV_FB(facebookNativeAds.get(listAdPos), viewGroup);
            listAdPos++;
            return;
        }
        if (googleNativeAds.size() <= 0) {
            if (backFill == 1) {
                showCustomLinkMultipleNative(viewGroup);
            }
            viewGroup.setVisibility(8);
            return;
        }
        if (googleNativeAds.size() > 0 && listAdPos > googleNativeAds.size() - 1) {
            listAdPos = 0;
        }
        textView.setVisibility(8);
        new Inflate_ADS(activity).inflate_NATIV_ADMOB_adapter(googleNativeAds.get(listAdPos), viewGroup);
        listAdPos++;
    }

    public void showFacebookMultipleNativeBanner(ViewGroup viewGroup, TextView textView) {
        if (this.facebookNativeBannerAd != null) {
            textView.setVisibility(8);
            new Inflate_ADS(activity).inflate_NB_FB(this.facebookNativeBannerAd, viewGroup);
            return;
        }
        if (googleNativeAds.size() <= 0) {
            if (backFill == 1) {
                showCustomLinkMultipleNativeBanner(viewGroup);
            }
            viewGroup.setVisibility(8);
            return;
        }
        if (googleNativeAds.size() > 0 && listAdPos > googleNativeAds.size() - 1) {
            listAdPos = 0;
        }
        textView.setVisibility(8);
        new Inflate_ADS(activity).inflate_NATIV_BANNER_ADMOB(googleNativeAds.get(listAdPos), viewGroup);
        listAdPos++;
    }

    public void showGoogleMultipleNative(ViewGroup viewGroup, TextView textView) {
        if (googleNativeAds.size() > 0) {
            if (googleNativeAds.size() > 0 && listAdPos > googleNativeAds.size() - 1) {
                listAdPos = 0;
            }
            textView.setVisibility(8);
            new Inflate_ADS(activity).inflate_NATIV_ADMOB_adapter(googleNativeAds.get(listAdPos), viewGroup);
            listAdPos++;
            return;
        }
        if (facebookNativeAds.size() <= 0) {
            if (backFill == 1) {
                showCustomLinkMultipleNative(viewGroup);
            }
            viewGroup.setVisibility(8);
            return;
        }
        if (facebookNativeAds.size() > 0 && listAdPos > facebookNativeAds.size() - 1) {
            listAdPos = 0;
        }
        textView.setVisibility(8);
        new Inflate_ADS(activity).inflate_NATIV_FB(facebookNativeAds.get(listAdPos), viewGroup);
        listAdPos++;
    }

    public void showGoogleMultipleNativeBanner(ViewGroup viewGroup, TextView textView) {
        if (googleNativeAds.size() > 0) {
            if (googleNativeAds.size() > 0 && listAdPos > googleNativeAds.size() - 1) {
                listAdPos = 0;
            }
            textView.setVisibility(8);
            new Inflate_ADS(activity).inflate_NATIV_BANNER_ADMOB(googleNativeAds.get(listAdPos), viewGroup);
            listAdPos++;
            return;
        }
        if (this.facebookNativeBannerAd != null) {
            textView.setVisibility(8);
            new Inflate_ADS(activity).inflate_NB_FB(this.facebookNativeBannerAd, viewGroup);
        } else {
            if (backFill == 1) {
                showCustomLinkMultipleNativeBanner(viewGroup);
            }
            viewGroup.setVisibility(8);
        }
    }

    public void showNativeBannerAdInsideList(ViewGroup viewGroup, TextView textView) {
        this.admob_n = ADMOB_N1;
        this.facebook_n = FACEBOOK_N1;
        if (app_adShowStatus == 0) {
            return;
        }
        count_native++;
        int i = mysharedpreferences.getInt("app_howShowAd", 0);
        String string = mysharedpreferences.getString("app_adPlatformSequence", "");
        String string2 = mysharedpreferences.getString("app_alernateAdShow", "");
        admob_AdStatus = mysharedpreferences.getInt("admob_AdStatus", 0);
        facebook_AdStatus = mysharedpreferences.getInt("facebook_AdStatus", 0);
        this.native_sequence = new ArrayList<>();
        if (i == 0 && !string.isEmpty()) {
            Collections.addAll(this.native_sequence, string.split(","));
        } else if (i == 1 && !string2.isEmpty()) {
            String[] split = string2.split(",");
            for (int i2 = 0; i2 <= 10; i2++) {
                if (count_native % split.length == i2) {
                    this.native_sequence.add(split[i2]);
                }
            }
            String[] split2 = string.split(",");
            for (int i3 = 0; i3 < split2.length; i3++) {
                if (this.native_sequence.size() != 0 && !this.native_sequence.get(0).equals(split2[i3])) {
                    this.native_sequence.add(split2[i3]);
                }
            }
        }
        for (int i4 = 0; i4 < this.native_sequence.size(); i4++) {
            if (this.native_sequence.get(i4).equalsIgnoreCase("Unity")) {
                this.native_sequence.remove(i4);
            }
        }
        if (this.native_sequence.size() != 0) {
            showNativeBannerList(this.native_sequence.get(0), viewGroup, textView);
        }
    }

    public void show_BANNER(ViewGroup viewGroup, TextView textView, String str, String str2) {
        this.admob_b = str;
        this.facebook_b = str2;
        if (app_istwist == 1) {
            viewGroup.setVisibility(0);
        } else {
            viewGroup.setVisibility(8);
        }
        if (hasActiveInternetConnection(activity) && mysharedpreferences.getInt("app_adShowStatus", 1) != 0) {
            count_banner++;
            int i = mysharedpreferences.getInt("app_howShowAd", 0);
            String string = mysharedpreferences.getString("app_adPlatformSequence", "");
            String string2 = mysharedpreferences.getString("app_alernateAdShow", "");
            admob_AdStatus = mysharedpreferences.getInt("admob_AdStatus", 0);
            facebook_AdStatus = mysharedpreferences.getInt("facebook_AdStatus", 0);
            this.banner_sequence = new ArrayList<>();
            if (i == 0 && !string.isEmpty()) {
                Collections.addAll(this.banner_sequence, string.split(","));
            } else if (i == 1 && !string2.isEmpty()) {
                String[] split = string2.split(",");
                for (int i2 = 0; i2 <= 10; i2++) {
                    if (count_banner % split.length == i2) {
                        this.banner_sequence.add(split[i2]);
                    }
                }
                String[] split2 = string.split(",");
                for (int i3 = 0; i3 < split2.length; i3++) {
                    if (this.banner_sequence.size() != 0 && !this.banner_sequence.get(0).equals(split2[i3])) {
                        this.banner_sequence.add(split2[i3]);
                    }
                }
            }
            if (this.banner_sequence.size() != 0) {
                showBanner(this.banner_sequence.get(0), viewGroup, textView);
            }
        }
    }

    public void show_Collapse_BANNER(ViewGroup viewGroup, TextView textView, String str) {
        if (app_istwist == 1) {
            viewGroup.setVisibility(0);
        } else {
            viewGroup.setVisibility(8);
        }
        if (hasActiveInternetConnection(activity) && mysharedpreferences.getInt("app_adShowStatus", 1) != 0) {
            count_banner++;
            int i = mysharedpreferences.getInt("app_howShowAd", 0);
            String string = mysharedpreferences.getString("app_adPlatformSequence", "");
            String string2 = mysharedpreferences.getString("app_alernateAdShow", "");
            admob_AdStatus = mysharedpreferences.getInt("admob_AdStatus", 0);
            facebook_AdStatus = mysharedpreferences.getInt("facebook_AdStatus", 0);
            this.banner_sequence = new ArrayList<>();
            if (i == 0 && !string.isEmpty()) {
                Collections.addAll(this.banner_sequence, string.split(","));
            } else if (i == 1 && !string2.isEmpty()) {
                String[] split = string2.split(",");
                for (int i2 = 0; i2 <= 10; i2++) {
                    if (count_banner % split.length == i2) {
                        this.banner_sequence.add(split[i2]);
                    }
                }
                String[] split2 = string.split(",");
                for (int i3 = 0; i3 < split2.length; i3++) {
                    if (this.banner_sequence.size() != 0 && !this.banner_sequence.get(0).equals(split2[i3])) {
                        this.banner_sequence.add(split2[i3]);
                    }
                }
            }
            if (this.banner_sequence.size() != 0) {
                showBanner(this.banner_sequence.get(0), viewGroup, textView);
            }
        }
    }

    public void show_Exit_BANNER(ViewGroup viewGroup, TextView textView) {
        if (hasActiveInternetConnection(activity) && mysharedpreferences.getInt("app_adShowStatus", 1) != 0 && admob_AdStatus == 1 && app_ExitAdsShow == 1 && this.isTestExitBannerLoaded) {
            if (textView != null) {
                textView.setVisibility(8);
            }
            if (viewGroup != null && this.googleExitBannerAd != null) {
                ViewGroup viewGroup2 = this.parentView;
                if (viewGroup2 != null) {
                    viewGroup2.removeAllViews();
                }
                viewGroup.removeAllViews();
                viewGroup.setVisibility(0);
                viewGroup.addView(this.googleExitBannerAd);
                this.parentView = viewGroup;
            }
            this.isTestExitBannerLoaded = false;
        }
    }

    public void show_Exit_Native(ViewGroup viewGroup, TextView textView, String str, String str2) {
        if (app_istwist == 1) {
            viewGroup.setVisibility(0);
        } else {
            viewGroup.setVisibility(8);
        }
        this.admob_exit_n = str;
        this.facebook_exit_n = str2;
        if (mysharedpreferences.getInt("app_adShowStatus", 1) == 0) {
            return;
        }
        count_native++;
        int i = mysharedpreferences.getInt("app_howShowAd", 0);
        String string = mysharedpreferences.getString("app_adPlatformSequence", "");
        String string2 = mysharedpreferences.getString("app_alernateAdShow", "");
        admob_AdStatus = mysharedpreferences.getInt("admob_AdStatus", 0);
        facebook_AdStatus = mysharedpreferences.getInt("facebook_AdStatus", 0);
        this.native_sequence = new ArrayList<>();
        if (i == 0 && !string.isEmpty()) {
            Collections.addAll(this.native_sequence, string.split(","));
        } else if (i == 1 && !string2.isEmpty()) {
            String[] split = string2.split(",");
            for (int i2 = 0; i2 <= 10; i2++) {
                if (count_native % split.length == i2) {
                    this.native_sequence.add(split[i2]);
                }
            }
            String[] split2 = string.split(",");
            for (int i3 = 0; i3 < split2.length; i3++) {
                if (this.native_sequence.size() != 0 && !this.native_sequence.get(0).equals(split2[i3])) {
                    this.native_sequence.add(split2[i3]);
                }
            }
        }
        for (int i4 = 0; i4 < this.native_sequence.size(); i4++) {
            if (this.native_sequence.get(i4).equalsIgnoreCase("Unity")) {
                this.native_sequence.remove(i4);
            }
        }
        if (this.native_sequence.size() != 0) {
            showExitNative(this.native_sequence.get(0), viewGroup, textView);
        }
    }

    public void show_INTERSTIAL(MyCallback myCallback2, Click click, String str, String str2) {
        this.admob_i = str;
        this.facebook_i = str2;
        displayInterstitial(myCallback2, click, "");
    }

    public void show_NATIVE(ViewGroup viewGroup, TextView textView, String str, String str2) {
        if (app_istwist == 1) {
            viewGroup.setVisibility(0);
        } else {
            viewGroup.setVisibility(8);
        }
        this.admob_n = str;
        this.facebook_n = str2;
        if (mysharedpreferences.getInt("app_adShowStatus", 1) == 0) {
            return;
        }
        count_native++;
        int i = mysharedpreferences.getInt("app_howShowAd", 0);
        String string = mysharedpreferences.getString("app_adPlatformSequence", "");
        String string2 = mysharedpreferences.getString("app_alernateAdShow", "");
        admob_AdStatus = mysharedpreferences.getInt("admob_AdStatus", 0);
        facebook_AdStatus = mysharedpreferences.getInt("facebook_AdStatus", 0);
        this.native_sequence = new ArrayList<>();
        if (i == 0 && !string.isEmpty()) {
            Collections.addAll(this.native_sequence, string.split(","));
        } else if (i == 1 && !string2.isEmpty()) {
            String[] split = string2.split(",");
            for (int i2 = 0; i2 <= 10; i2++) {
                if (count_native % split.length == i2) {
                    this.native_sequence.add(split[i2]);
                }
            }
            String[] split2 = string.split(",");
            for (int i3 = 0; i3 < split2.length; i3++) {
                if (this.native_sequence.size() != 0 && !this.native_sequence.get(0).equals(split2[i3])) {
                    this.native_sequence.add(split2[i3]);
                }
            }
        }
        for (int i4 = 0; i4 < this.native_sequence.size(); i4++) {
            if (this.native_sequence.get(i4).equalsIgnoreCase("Unity")) {
                this.native_sequence.remove(i4);
            }
        }
        if (this.native_sequence.size() != 0) {
            showNative(this.native_sequence.get(0), viewGroup, textView);
        }
    }

    public void show_NATIVEBANNER(ViewGroup viewGroup, TextView textView, String str, String str2) {
        if (app_istwist == 1) {
            viewGroup.setVisibility(0);
        } else {
            viewGroup.setVisibility(8);
        }
        this.admob_nb = str;
        this.facebook_nb = str2;
        if (mysharedpreferences.getInt("app_adShowStatus", 1) == 0) {
            return;
        }
        count_banner++;
        int i = mysharedpreferences.getInt("app_howShowAd", 0);
        String string = mysharedpreferences.getString("app_adPlatformSequence", "");
        String string2 = mysharedpreferences.getString("app_alernateAdShow", "");
        admob_AdStatus = mysharedpreferences.getInt("admob_AdStatus", 0);
        facebook_AdStatus = mysharedpreferences.getInt("facebook_AdStatus", 0);
        this.banner_sequence = new ArrayList<>();
        if (i == 0 && !string.isEmpty()) {
            Collections.addAll(this.banner_sequence, string.split(","));
        } else if (i == 1 && !string2.isEmpty()) {
            String[] split = string2.split(",");
            for (int i2 = 0; i2 <= 10; i2++) {
                if (count_banner % split.length == i2) {
                    this.banner_sequence.add(split[i2]);
                }
            }
            String[] split2 = string.split(",");
            for (int i3 = 0; i3 < split2.length; i3++) {
                if (this.banner_sequence.size() != 0 && !this.banner_sequence.get(0).equals(split2[i3])) {
                    this.banner_sequence.add(split2[i3]);
                }
            }
        }
        for (int i4 = 0; i4 < this.banner_sequence.size(); i4++) {
            if (this.banner_sequence.get(i4).equalsIgnoreCase("Unity")) {
                this.banner_sequence.remove(i4);
            }
        }
        if (this.banner_sequence.size() != 0) {
            showNativeBanner(this.banner_sequence.get(0), viewGroup, textView);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.android.gms.ads.FullScreenContentCallback, com.pesonal.adsdk.AppManage$62] */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.android.gms.ads.OnUserEarnedRewardListener, com.pesonal.adsdk.AppManage$63] */
    public void show_REWARDED_Interstitial(final rewardedCallback rewardedcallback, final String str) {
        this.isRewardedInter = false;
        if (app_adShowStatus == 0 || admob_AdStatus == 0) {
            if (rewardedcallback != null) {
                rewardedcallback.callbackCall(false, true);
                return;
            }
            return;
        }
        final ?? r5 = new FullScreenContentCallback() { // from class: com.pesonal.adsdk.AppManage.62
            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public final void onAdClicked() {
                AppManage.interStatus = true;
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public final void onAdDismissedFullScreenContent() {
                AppManage.this.mRewardedInterAd = null;
                rewardedCallback rewardedcallback2 = rewardedcallback;
                if (rewardedcallback2 != null) {
                    rewardedcallback2.callbackCall(AppManage.this.isRewardedInter, false);
                }
                AppManage.this.preloadRewardInterstitial(str);
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public final void onAdFailedToShowFullScreenContent(com.google.android.gms.ads.AdError adError) {
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public final void onAdShowedFullScreenContent() {
            }
        };
        final ?? r6 = new OnUserEarnedRewardListener() { // from class: com.pesonal.adsdk.AppManage.63
            @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
            public final void onUserEarnedReward(RewardItem rewardItem) {
                AppManage.this.isRewardedInter = true;
                rewardedCallback rewardedcallback2 = rewardedcallback;
                if (rewardedcallback2 != null) {
                    rewardedcallback2.onUserEarnedReward(rewardItem);
                }
                AppManage.this.preloadRewardInterstitial(str);
            }
        };
        RewardedInterstitialAd rewardedInterstitialAd = this.mRewardedInterAd;
        if (rewardedInterstitialAd != 0) {
            rewardedInterstitialAd.setFullScreenContentCallback(r5);
            this.mRewardedInterAd.show(activity, r6);
            return;
        }
        final Dialog dialog = new Dialog(activity, android.R.style.Theme.Translucent.NoTitleBar);
        dialog.setContentView(LayoutInflater.from(activity).inflate(R.layout.dialog_video_ad_loading, (ViewGroup) null));
        dialog.setCancelable(false);
        dialog.getWindow().setLayout(-1, -1);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        dialog.show();
        if (this.admob_ir.isEmpty()) {
            return;
        }
        RewardedInterstitialAd.load((Context) activity, this.admob_ir, new AdManagerAdRequest.Builder().build(), new RewardedInterstitialAdLoadCallback() { // from class: com.pesonal.adsdk.AppManage.64
            @Override // com.google.android.gms.ads.AdLoadCallback
            public final void onAdFailedToLoad(LoadAdError loadAdError) {
                rewardedCallback rewardedcallback2 = rewardedcallback;
                if (rewardedcallback2 != null) {
                    rewardedcallback2.callbackCall(AppManage.this.isRewardedInter, true);
                }
            }

            @Override // com.google.android.gms.ads.AdLoadCallback
            public final void onAdLoaded(RewardedInterstitialAd rewardedInterstitialAd2) {
                AppManage.this.mRewardedInterAd = rewardedInterstitialAd2;
                AppManage.this.isRewardedInter = false;
                if (dialog.isShowing()) {
                    dialog.dismiss();
                }
                AppManage.this.mRewardedInterAd.setFullScreenContentCallback(r5);
                AppManage.this.mRewardedInterAd.show(AppManage.activity, r6);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.android.gms.ads.FullScreenContentCallback, com.pesonal.adsdk.AppManage$58] */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.google.android.gms.ads.OnUserEarnedRewardListener, com.pesonal.adsdk.AppManage$59] */
    public void show_REWARDED_VIDEO(final rewardedCallback rewardedcallback, final String str) {
        this.isRewarded = false;
        if (app_adShowStatus == 0 || admob_AdStatus == 0) {
            if (rewardedcallback != null) {
                rewardedcallback.callbackCall(false, true);
                return;
            }
            return;
        }
        final ?? r6 = new FullScreenContentCallback() { // from class: com.pesonal.adsdk.AppManage.58
            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public final void onAdClicked() {
                AppManage.interStatus = true;
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public final void onAdDismissedFullScreenContent() {
                AppManage.this.mRewardedVideoAd = null;
                rewardedCallback rewardedcallback2 = rewardedcallback;
                if (rewardedcallback2 != null) {
                    rewardedcallback2.callbackCall(AppManage.this.isRewarded, false);
                }
                AppManage.this.preloadRewardVideo(str);
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public final void onAdFailedToShowFullScreenContent(com.google.android.gms.ads.AdError adError) {
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public final void onAdShowedFullScreenContent() {
            }
        };
        final ?? r7 = new OnUserEarnedRewardListener() { // from class: com.pesonal.adsdk.AppManage.59
            @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
            public final void onUserEarnedReward(RewardItem rewardItem) {
                AppManage.this.isRewarded = true;
                rewardedCallback rewardedcallback2 = rewardedcallback;
                if (rewardedcallback2 != null) {
                    rewardedcallback2.onUserEarnedReward(rewardItem);
                }
                AppManage.this.preloadRewardVideo(str);
            }
        };
        RewardedAd rewardedAd = this.mRewardedVideoAd;
        if (rewardedAd != 0) {
            rewardedAd.setFullScreenContentCallback(r6);
            this.mRewardedVideoAd.show(activity, r7);
            return;
        }
        final Dialog dialog = new Dialog(activity, android.R.style.Theme.Translucent.NoTitleBar);
        dialog.setContentView(LayoutInflater.from(activity).inflate(R.layout.dialog_video_ad_loading, (ViewGroup) null));
        dialog.setCancelable(false);
        dialog.getWindow().setLayout(-1, -1);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        dialog.show();
        if (this.admob_r.isEmpty()) {
            return;
        }
        RewardedAd.load(activity, this.admob_r, new AdRequest.Builder().build(), new RewardedAdLoadCallback() { // from class: com.pesonal.adsdk.AppManage.60
            @Override // com.google.android.gms.ads.AdLoadCallback
            public final void onAdFailedToLoad(LoadAdError loadAdError) {
                if (rewardedcallback != null) {
                    Dialog dialog2 = dialog;
                    if (dialog2 != null && dialog2.isShowing()) {
                        dialog.dismiss();
                    }
                    rewardedcallback.callbackCall(AppManage.this.isRewarded, true);
                }
            }

            @Override // com.google.android.gms.ads.AdLoadCallback
            public final void onAdLoaded(RewardedAd rewardedAd2) {
                AppManage.this.mRewardedVideoAd = rewardedAd2;
                AppManage.this.isRewarded = false;
                if (dialog.isShowing()) {
                    dialog.dismiss();
                }
                AppManage.this.mRewardedVideoAd.setFullScreenContentCallback(r6);
                AppManage.this.mRewardedVideoAd.show(AppManage.activity, r7);
            }
        });
    }

    public void show_custom_ads(final Activity activity2) {
        interStatus = false;
        ArrayList arrayList = new ArrayList(Arrays.asList(TextUtils.split(Custom_I1.optString("image2"), ",")));
        ArrayList arrayList2 = new ArrayList(Arrays.asList(TextUtils.split(Custom_I1.optString("image"), ",")));
        ArrayList arrayList3 = new ArrayList(Arrays.asList(TextUtils.split(Custom_I1.optString("titel1"), ",")));
        ArrayList arrayList4 = new ArrayList(Arrays.asList(TextUtils.split(Custom_I1.optString("titel2"), ",")));
        ArrayList arrayList5 = new ArrayList(Arrays.asList(TextUtils.split(Custom_I1.optString("button_titel"), ",")));
        this.listredirectLink = new ArrayList<>(Arrays.asList(TextUtils.split(Custom_I1.optString("redirectLink"), ",")));
        this.position = new Random().nextInt(arrayList.size());
        if (Custom_I1.optInt("custom_ads") != 1) {
            interStatus = true;
            try {
                if (appInsideCustomTabShow == 1) {
                    interstitialCallBack();
                    Intent intent = new Intent(activity2, (Class<?>) LauncherActivity.class);
                    intent.setData(Uri.parse(this.listredirectLink.get(this.position)));
                    intent.addFlags(805306368);
                    activity2.startActivity(intent);
                    return;
                }
                if (chromeTabDisplayTime > 0) {
                    openCustomChromeTab(activity2, this.listredirectLink.get(this.position));
                    return;
                }
                interstitialCallBack();
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(Color.parseColor(activity2.getString(R.color.white))).setShowTitle(true);
                CustomTabsIntent build = builder.build();
                build.intent.setPackage("com.android.chrome");
                build.intent.setData(Uri.parse(String.valueOf(this.listredirectLink.get(this.position))));
                build.intent.setFlags(1879048192);
                build.launchUrl(activity2, Uri.parse(String.valueOf(this.listredirectLink.get(this.position))));
                return;
            } catch (Exception unused) {
                interstitialCallBack();
                openDefaultBrowser(this.listredirectLink.get(this.position));
                return;
            }
        }
        interStatus = true;
        int nextInt = new Random().nextInt(4) + 1;
        if (nextInt == 1) {
            final Dialog dialog = new Dialog(activity2, R.style.DialogTheme);
            dialog.setContentView(R.layout.custom_interstitial_layout);
            dialog.setCancelable(false);
            final LinearLayout linearLayout = (LinearLayout) dialog.findViewById(R.id.adCloseBtn);
            LinearLayout linearLayout2 = (LinearLayout) dialog.findViewById(R.id.llPersonalAdCenter);
            ImageView imageView = (ImageView) dialog.findViewById(R.id.native_ad_icon);
            TextView textView = (TextView) dialog.findViewById(R.id.native_ad_title);
            TextView textView2 = (TextView) dialog.findViewById(R.id.native_ad_desc);
            final TextView textView3 = (TextView) dialog.findViewById(R.id.tvTimer1);
            final ImageView imageView2 = (ImageView) dialog.findViewById(R.id.done1);
            Glide.with(activity).load((String) arrayList2.get(this.position)).into(imageView);
            textView.setText("" + ((String) arrayList3.get(this.position)));
            textView2.setText("" + ((String) arrayList4.get(this.position)));
            TextView textView4 = (TextView) dialog.findViewById(R.id.native_ad_call_to_action);
            textView4.setText("" + ((String) arrayList5.get(this.position)));
            try {
                if (!app_nativeColor.equals("")) {
                    textView4.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(app_nativeColor)));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            textView4.setOnClickListener(new View.OnClickListener() { // from class: com.pesonal.adsdk.AppManage.6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AppManage.this.interstitialCallBack();
                    try {
                        if (AppManage.appInsideCustomTabShow == 1) {
                            Intent intent2 = new Intent(activity2, (Class<?>) LauncherActivity.class);
                            AppManage appManage = AppManage.this;
                            intent2.setData(Uri.parse(appManage.listredirectLink.get(appManage.position)));
                            intent2.addFlags(805306368);
                            activity2.startActivity(intent2);
                        } else {
                            CustomTabsIntent.Builder builder2 = new CustomTabsIntent.Builder();
                            builder2.setToolbarColor(Color.parseColor(activity2.getString(R.color.white))).setShowTitle(true);
                            CustomTabsIntent build2 = builder2.build();
                            build2.intent.setPackage("com.android.chrome");
                            build2.intent.setFlags(1879048192);
                            Activity activity3 = activity2;
                            AppManage appManage2 = AppManage.this;
                            build2.launchUrl(activity3, Uri.parse(String.valueOf(appManage2.listredirectLink.get(appManage2.position))));
                        }
                    } catch (Exception unused2) {
                        AppManage appManage3 = AppManage.this;
                        appManage3.openDefaultBrowser(appManage3.listredirectLink.get(appManage3.position));
                    }
                    dialog.dismiss();
                }
            });
            final ImageView imageView3 = (ImageView) dialog.findViewById(R.id.imgClose);
            final TextView textView5 = (TextView) dialog.findViewById(R.id.tvTimer);
            linearLayout.setEnabled(false);
            new CountDownTimer() { // from class: com.pesonal.adsdk.AppManage.7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(5000L, 1000L);
                }

                @Override // android.os.CountDownTimer
                public final void onFinish() {
                    imageView3.setVisibility(0);
                    textView5.setVisibility(8);
                    imageView2.setVisibility(0);
                    textView3.setVisibility(8);
                    linearLayout.setEnabled(true);
                }

                @Override // android.os.CountDownTimer
                public final void onTick(long j) {
                    long j2 = ((j / 1000) % 60) + 1;
                    textView3.setText(" " + j2);
                    textView5.setText(" " + j2);
                }
            }.start();
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.pesonal.adsdk.AppManage.8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AppManage.this.interstitialCallBack();
                    dialog.dismiss();
                }
            });
            imageView3.setOnClickListener(new View.OnClickListener() { // from class: com.pesonal.adsdk.AppManage.9
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AppManage.this.interstitialCallBack();
                    dialog.dismiss();
                }
            });
            linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.pesonal.adsdk.AppManage.10
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AppManage.this.interstitialCallBack();
                    try {
                        if (AppManage.appInsideCustomTabShow == 1) {
                            Intent intent2 = new Intent(activity2, (Class<?>) LauncherActivity.class);
                            AppManage appManage = AppManage.this;
                            intent2.setData(Uri.parse(appManage.listredirectLink.get(appManage.position)));
                            intent2.addFlags(805306368);
                            activity2.startActivity(intent2);
                        } else {
                            CustomTabsIntent.Builder builder2 = new CustomTabsIntent.Builder();
                            builder2.setToolbarColor(Color.parseColor(activity2.getString(R.color.white))).setShowTitle(true);
                            CustomTabsIntent build2 = builder2.build();
                            build2.intent.setPackage("com.android.chrome");
                            build2.intent.setFlags(1879048192);
                            Activity activity3 = activity2;
                            AppManage appManage2 = AppManage.this;
                            build2.launchUrl(activity3, Uri.parse(String.valueOf(appManage2.listredirectLink.get(appManage2.position))));
                        }
                    } catch (Exception unused2) {
                        AppManage appManage3 = AppManage.this;
                        appManage3.openDefaultBrowser(appManage3.listredirectLink.get(appManage3.position));
                    }
                    dialog.dismiss();
                }
            });
            SlideToAbove20(dialog.findViewById(R.id.native_ad_icon), AdError.SERVER_ERROR_CODE);
            SlideToAbove30(dialog.findViewById(R.id.cvTopAd), AdError.SERVER_ERROR_CODE);
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.pesonal.adsdk.AppManage.11
                @Override // java.lang.Runnable
                public final void run() {
                    AppManage.FadeIn(dialog.findViewById(R.id.aa));
                    AppManage.FadeIn(dialog.findViewById(R.id.adPersonalLlCloseInstallBtnsCenter));
                }
            }, 2200L);
            dialog.show();
            return;
        }
        if (nextInt == 2) {
            final Dialog dialog2 = new Dialog(activity2, R.style.DialogTheme);
            dialog2.setContentView(R.layout.custom_link_ad_ins_1);
            dialog2.setCancelable(false);
            ImageView imageView4 = (ImageView) dialog2.findViewById(R.id.logo_ins);
            ImageView imageView5 = (ImageView) dialog2.findViewById(R.id.image_ins);
            RelativeLayout relativeLayout = (RelativeLayout) dialog2.findViewById(R.id.relative);
            TextView textView6 = (TextView) dialog2.findViewById(R.id.ins_title);
            TextView textView7 = (TextView) dialog2.findViewById(R.id.ins_desc);
            final CardView cardView = (CardView) dialog2.findViewById(R.id.card_bottom);
            final TextView textView8 = (TextView) dialog2.findViewById(R.id.left_time);
            final ImageView imageView6 = (ImageView) dialog2.findViewById(R.id.tick);
            final LinearLayout linearLayout3 = (LinearLayout) dialog2.findViewById(R.id.close);
            TextView textView9 = (TextView) dialog2.findViewById(R.id.native_ad_call_to_action);
            textView9.setText("" + ((String) arrayList5.get(this.position)));
            try {
                if (!app_nativeColor.equals("")) {
                    textView9.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(app_nativeColor)));
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            textView9.setOnClickListener(new View.OnClickListener() { // from class: com.pesonal.adsdk.AppManage.12
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AppManage.this.interstitialCallBack();
                    try {
                        if (AppManage.appInsideCustomTabShow == 1) {
                            Intent intent2 = new Intent(activity2, (Class<?>) LauncherActivity.class);
                            AppManage appManage = AppManage.this;
                            intent2.setData(Uri.parse(appManage.listredirectLink.get(appManage.position)));
                            intent2.addFlags(805306368);
                            activity2.startActivity(intent2);
                        } else {
                            CustomTabsIntent.Builder builder2 = new CustomTabsIntent.Builder();
                            builder2.setToolbarColor(Color.parseColor(activity2.getString(R.color.white))).setShowTitle(true);
                            CustomTabsIntent build2 = builder2.build();
                            build2.intent.setPackage("com.android.chrome");
                            build2.intent.setFlags(1879048192);
                            Activity activity3 = activity2;
                            AppManage appManage2 = AppManage.this;
                            build2.launchUrl(activity3, Uri.parse(String.valueOf(appManage2.listredirectLink.get(appManage2.position))));
                        }
                    } catch (Exception unused2) {
                        AppManage appManage3 = AppManage.this;
                        appManage3.openDefaultBrowser(appManage3.listredirectLink.get(appManage3.position));
                    }
                    dialog2.dismiss();
                }
            });
            Glide.with(activity).load((String) arrayList.get(this.position)).into(imageView4);
            Glide.with(activity).load((String) arrayList2.get(this.position)).into(imageView5);
            textView6.setText("" + ((String) arrayList3.get(this.position)));
            textView7.setText("" + ((String) arrayList4.get(this.position)));
            final ImageView imageView7 = (ImageView) dialog2.findViewById(R.id.imgClose);
            final TextView textView10 = (TextView) dialog2.findViewById(R.id.tvTimer);
            linearLayout3.setEnabled(false);
            new CountDownTimer() { // from class: com.pesonal.adsdk.AppManage.13
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(5000L, 1000L);
                }

                @Override // android.os.CountDownTimer
                public final void onFinish() {
                    imageView7.setVisibility(0);
                    textView10.setVisibility(8);
                    imageView6.setVisibility(0);
                    textView8.setVisibility(8);
                    linearLayout3.setEnabled(true);
                }

                @Override // android.os.CountDownTimer
                public final void onTick(long j) {
                    long j2 = ((j / 1000) % 60) + 1;
                    textView8.setText(" " + j2);
                    textView10.setText(" " + j2);
                }
            }.start();
            linearLayout3.setOnClickListener(new View.OnClickListener() { // from class: com.pesonal.adsdk.AppManage.14
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AppManage.this.interstitialCallBack();
                    dialog2.dismiss();
                }
            });
            imageView7.setOnClickListener(new View.OnClickListener() { // from class: com.pesonal.adsdk.AppManage.15
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AppManage.this.interstitialCallBack();
                    dialog2.dismiss();
                }
            });
            relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.pesonal.adsdk.AppManage.16
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AppManage.this.interstitialCallBack();
                    try {
                        if (AppManage.appInsideCustomTabShow == 1) {
                            Intent intent2 = new Intent(activity2, (Class<?>) LauncherActivity.class);
                            AppManage appManage = AppManage.this;
                            intent2.setData(Uri.parse(appManage.listredirectLink.get(appManage.position)));
                            intent2.addFlags(805306368);
                            activity2.startActivity(intent2);
                        } else {
                            CustomTabsIntent.Builder builder2 = new CustomTabsIntent.Builder();
                            builder2.setToolbarColor(Color.parseColor(activity2.getString(R.color.white))).setShowTitle(true);
                            CustomTabsIntent build2 = builder2.build();
                            build2.intent.setPackage("com.android.chrome");
                            build2.intent.setFlags(1879048192);
                            Activity activity3 = activity2;
                            AppManage appManage2 = AppManage.this;
                            build2.launchUrl(activity3, Uri.parse(String.valueOf(appManage2.listredirectLink.get(appManage2.position))));
                        }
                    } catch (Exception unused2) {
                        AppManage appManage3 = AppManage.this;
                        appManage3.openDefaultBrowser(appManage3.listredirectLink.get(appManage3.position));
                    }
                    dialog2.dismiss();
                }
            });
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.pesonal.adsdk.AppManage.17
                @Override // java.lang.Runnable
                public final void run() {
                    AppManage.FadeIn1(CardView.this);
                }
            }, 100L);
            dialog2.show();
            return;
        }
        if (nextInt == 3) {
            final Dialog dialog3 = new Dialog(activity2, R.style.DialogTheme);
            dialog3.setContentView(R.layout.custom_link_ad_ins_2);
            dialog3.setCancelable(false);
            ImageView imageView8 = (ImageView) dialog3.findViewById(R.id.logo_ins);
            ImageView imageView9 = (ImageView) dialog3.findViewById(R.id.image_ins);
            RelativeLayout relativeLayout2 = (RelativeLayout) dialog3.findViewById(R.id.relative);
            TextView textView11 = (TextView) dialog3.findViewById(R.id.ins_title);
            TextView textView12 = (TextView) dialog3.findViewById(R.id.ins_desc);
            final CardView cardView2 = (CardView) dialog3.findViewById(R.id.card_bottom);
            final TextView textView13 = (TextView) dialog3.findViewById(R.id.left_time);
            final ImageView imageView10 = (ImageView) dialog3.findViewById(R.id.tick);
            final LinearLayout linearLayout4 = (LinearLayout) dialog3.findViewById(R.id.close);
            TextView textView14 = (TextView) dialog3.findViewById(R.id.native_ad_call_to_action);
            textView14.setText("" + ((String) arrayList5.get(this.position)));
            try {
                if (!app_nativeColor.equals("")) {
                    textView14.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(app_nativeColor)));
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            textView14.setOnClickListener(new View.OnClickListener() { // from class: com.pesonal.adsdk.AppManage.18
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AppManage.this.interstitialCallBack();
                    try {
                        if (AppManage.appInsideCustomTabShow == 1) {
                            Intent intent2 = new Intent(activity2, (Class<?>) LauncherActivity.class);
                            AppManage appManage = AppManage.this;
                            intent2.setData(Uri.parse(appManage.listredirectLink.get(appManage.position)));
                            intent2.addFlags(805306368);
                            activity2.startActivity(intent2);
                        } else {
                            CustomTabsIntent.Builder builder2 = new CustomTabsIntent.Builder();
                            builder2.setToolbarColor(Color.parseColor(activity2.getString(R.color.white))).setShowTitle(true);
                            CustomTabsIntent build2 = builder2.build();
                            build2.intent.setPackage("com.android.chrome");
                            build2.intent.setFlags(1879048192);
                            Activity activity3 = activity2;
                            AppManage appManage2 = AppManage.this;
                            build2.launchUrl(activity3, Uri.parse(String.valueOf(appManage2.listredirectLink.get(appManage2.position))));
                        }
                    } catch (Exception unused2) {
                        AppManage appManage3 = AppManage.this;
                        appManage3.openDefaultBrowser(appManage3.listredirectLink.get(appManage3.position));
                    }
                    dialog3.dismiss();
                }
            });
            Glide.with(activity).load((String) arrayList.get(this.position)).into(imageView8);
            Glide.with(activity).load((String) arrayList2.get(this.position)).into(imageView9);
            textView11.setText("" + ((String) arrayList3.get(this.position)));
            textView12.setText("" + ((String) arrayList4.get(this.position)));
            final ImageView imageView11 = (ImageView) dialog3.findViewById(R.id.imgClose);
            final TextView textView15 = (TextView) dialog3.findViewById(R.id.tvTimer);
            linearLayout4.setEnabled(false);
            new CountDownTimer() { // from class: com.pesonal.adsdk.AppManage.19
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(5000L, 1000L);
                }

                @Override // android.os.CountDownTimer
                public final void onFinish() {
                    imageView11.setVisibility(0);
                    textView15.setVisibility(8);
                    imageView10.setVisibility(0);
                    textView13.setVisibility(8);
                    linearLayout4.setEnabled(true);
                }

                @Override // android.os.CountDownTimer
                public final void onTick(long j) {
                    long j2 = ((j / 1000) % 60) + 1;
                    textView13.setText(" " + j2);
                    textView15.setText(" " + j2);
                }
            }.start();
            linearLayout4.setOnClickListener(new View.OnClickListener() { // from class: com.pesonal.adsdk.AppManage.20
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AppManage.this.interstitialCallBack();
                    dialog3.dismiss();
                }
            });
            imageView11.setOnClickListener(new View.OnClickListener() { // from class: com.pesonal.adsdk.AppManage.21
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AppManage.this.interstitialCallBack();
                    dialog3.dismiss();
                }
            });
            relativeLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.pesonal.adsdk.AppManage.22
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AppManage.this.interstitialCallBack();
                    try {
                        if (AppManage.appInsideCustomTabShow == 1) {
                            Intent intent2 = new Intent(activity2, (Class<?>) LauncherActivity.class);
                            AppManage appManage = AppManage.this;
                            intent2.setData(Uri.parse(appManage.listredirectLink.get(appManage.position)));
                            intent2.addFlags(805306368);
                            activity2.startActivity(intent2);
                        } else {
                            CustomTabsIntent.Builder builder2 = new CustomTabsIntent.Builder();
                            builder2.setToolbarColor(Color.parseColor(activity2.getString(R.color.white))).setShowTitle(true);
                            CustomTabsIntent build2 = builder2.build();
                            build2.intent.setPackage("com.android.chrome");
                            build2.intent.setFlags(1879048192);
                            Activity activity3 = activity2;
                            AppManage appManage2 = AppManage.this;
                            build2.launchUrl(activity3, Uri.parse(String.valueOf(appManage2.listredirectLink.get(appManage2.position))));
                        }
                    } catch (Exception unused2) {
                        AppManage appManage3 = AppManage.this;
                        appManage3.openDefaultBrowser(appManage3.listredirectLink.get(appManage3.position));
                    }
                    dialog3.dismiss();
                }
            });
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.pesonal.adsdk.AppManage.23
                @Override // java.lang.Runnable
                public final void run() {
                    AppManage.FadeIn1(CardView.this);
                }
            }, 100L);
            dialog3.show();
            return;
        }
        final Dialog dialog4 = new Dialog(activity2, R.style.DialogTheme);
        dialog4.setContentView(R.layout.custom_link_ad_ins_3);
        dialog4.setCancelable(false);
        ImageView imageView12 = (ImageView) dialog4.findViewById(R.id.logo_ins);
        ImageView imageView13 = (ImageView) dialog4.findViewById(R.id.image_ins);
        RelativeLayout relativeLayout3 = (RelativeLayout) dialog4.findViewById(R.id.relative);
        TextView textView16 = (TextView) dialog4.findViewById(R.id.ins_title);
        TextView textView17 = (TextView) dialog4.findViewById(R.id.ins_desc);
        final LinearLayout linearLayout5 = (LinearLayout) dialog4.findViewById(R.id.main_content);
        final TextView textView18 = (TextView) dialog4.findViewById(R.id.left_time);
        final ImageView imageView14 = (ImageView) dialog4.findViewById(R.id.tick);
        final LinearLayout linearLayout6 = (LinearLayout) dialog4.findViewById(R.id.close);
        TextView textView19 = (TextView) dialog4.findViewById(R.id.native_ad_call_to_action);
        textView19.setText("" + ((String) arrayList5.get(this.position)));
        try {
            if (!app_nativeColor.equals("")) {
                textView19.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(app_nativeColor)));
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        textView19.setOnClickListener(new View.OnClickListener() { // from class: com.pesonal.adsdk.AppManage.24
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppManage.this.interstitialCallBack();
                try {
                    if (AppManage.appInsideCustomTabShow == 1) {
                        Intent intent2 = new Intent(activity2, (Class<?>) LauncherActivity.class);
                        AppManage appManage = AppManage.this;
                        intent2.setData(Uri.parse(appManage.listredirectLink.get(appManage.position)));
                        intent2.addFlags(805306368);
                        activity2.startActivity(intent2);
                    } else {
                        CustomTabsIntent.Builder builder2 = new CustomTabsIntent.Builder();
                        builder2.setToolbarColor(Color.parseColor(activity2.getString(R.color.white))).setShowTitle(true);
                        CustomTabsIntent build2 = builder2.build();
                        build2.intent.setPackage("com.android.chrome");
                        build2.intent.setFlags(1879048192);
                        Activity activity3 = activity2;
                        AppManage appManage2 = AppManage.this;
                        build2.launchUrl(activity3, Uri.parse(String.valueOf(appManage2.listredirectLink.get(appManage2.position))));
                    }
                } catch (Exception unused2) {
                    AppManage appManage3 = AppManage.this;
                    appManage3.openDefaultBrowser(appManage3.listredirectLink.get(appManage3.position));
                }
                dialog4.dismiss();
            }
        });
        Glide.with(activity).load((String) arrayList.get(this.position)).into(imageView12);
        Glide.with(activity).load((String) arrayList2.get(this.position)).into(imageView13);
        textView16.setText("" + ((String) arrayList3.get(this.position)));
        textView17.setText("" + ((String) arrayList4.get(this.position)));
        final ImageView imageView15 = (ImageView) dialog4.findViewById(R.id.imgClose);
        final TextView textView20 = (TextView) dialog4.findViewById(R.id.tvTimer);
        linearLayout6.setEnabled(false);
        new CountDownTimer() { // from class: com.pesonal.adsdk.AppManage.25
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(5000L, 1000L);
            }

            @Override // android.os.CountDownTimer
            public final void onFinish() {
                imageView15.setVisibility(0);
                textView20.setVisibility(8);
                imageView14.setVisibility(0);
                textView18.setVisibility(8);
                linearLayout6.setEnabled(true);
            }

            @Override // android.os.CountDownTimer
            public final void onTick(long j) {
                long j2 = ((j / 1000) % 60) + 1;
                textView18.setText(" " + j2);
                textView20.setText(" " + j2);
            }
        }.start();
        linearLayout6.setOnClickListener(new View.OnClickListener() { // from class: com.pesonal.adsdk.AppManage.26
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppManage.this.interstitialCallBack();
                dialog4.dismiss();
            }
        });
        imageView15.setOnClickListener(new View.OnClickListener() { // from class: com.pesonal.adsdk.AppManage.27
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppManage.this.interstitialCallBack();
                dialog4.dismiss();
            }
        });
        relativeLayout3.setOnClickListener(new View.OnClickListener() { // from class: com.pesonal.adsdk.AppManage.28
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppManage.this.interstitialCallBack();
                try {
                    if (AppManage.appInsideCustomTabShow == 1) {
                        Intent intent2 = new Intent(activity2, (Class<?>) LauncherActivity.class);
                        AppManage appManage = AppManage.this;
                        intent2.setData(Uri.parse(appManage.listredirectLink.get(appManage.position)));
                        intent2.addFlags(805306368);
                        activity2.startActivity(intent2);
                    } else {
                        CustomTabsIntent.Builder builder2 = new CustomTabsIntent.Builder();
                        builder2.setToolbarColor(Color.parseColor(activity2.getString(R.color.white))).setShowTitle(true);
                        CustomTabsIntent build2 = builder2.build();
                        build2.intent.setPackage("com.android.chrome");
                        build2.intent.setFlags(1879048192);
                        Activity activity3 = activity2;
                        AppManage appManage2 = AppManage.this;
                        build2.launchUrl(activity3, Uri.parse(String.valueOf(appManage2.listredirectLink.get(appManage2.position))));
                    }
                } catch (Exception unused2) {
                    AppManage appManage3 = AppManage.this;
                    appManage3.openDefaultBrowser(appManage3.listredirectLink.get(appManage3.position));
                }
                dialog4.dismiss();
            }
        });
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.pesonal.adsdk.AppManage.29
            @Override // java.lang.Runnable
            public final void run() {
                AppManage.FadeIn1(linearLayout5);
            }
        }, 100L);
        dialog4.show();
    }
}
