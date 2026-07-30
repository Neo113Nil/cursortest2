package org.game.play.aviator.gameplay;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.Window;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.ConsentRequestParameters;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;
import com.pesonal.adsdk.ADS_SplashActivity;
import com.pesonal.adsdk.AppManage;
import com.pesonal.adsdk.Click;
import com.pesonal.adsdk.getDataListner;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Executors;
import org.game.play.aviator.gameplay.AppOpenManager;
import org.game.play.aviator.gameplay.FirebaseConfigUtil;
import org.game.play.aviator.gameplay.SplashActivity;
import org.game.play.aviator.gameplay.databinding.ActivitySplashBinding;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class SplashActivity extends ADS_SplashActivity {
    ActivitySplashBinding binding;
    ConsentInformation consentInformation;
    String deviceId;
    String ConsentTag = "Status :";
    String installReferrer = "notset";

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.pesonal.adsdk.ADS_SplashActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.binding = ActivitySplashBinding.inflate(getLayoutInflater());
        Window window = getWindow();
        window.clearFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        window.clearFlags(134217728);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.getDecorView().setSystemUiVisibility(1792);
        window.addFlags(Integer.MIN_VALUE);
        setContentView(this.binding.getRoot());
        this.deviceId = md5(Settings.Secure.getString(getContentResolver(), "android_id")).toUpperCase();
        AppManage.mysharedpreferences = getSharedPreferences(getPackageName(), 0);
        if (AppManage.mysharedpreferences.getString("installReferrer", "").equalsIgnoreCase("")) {
            Executors.newSingleThreadExecutor().execute(new ExternalSynthetic(InstallReferrerClient.newBuilder(this).build()));
        } else {
            initUi();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initUi() {
        ADSinit(this, this.installReferrer, getCurrentVersionCode(), new getDataListner() { // from class: org.game.play.aviator.gameplay.SplashActivity.1
            @Override // com.pesonal.adsdk.getDataListner
            public void ongetExtradata(JSONObject jSONObject) {
            }

            @Override // com.pesonal.adsdk.getDataListner
            public void reloadActivity() {
            }

            @Override // com.pesonal.adsdk.getDataListner
            public void onsuccess() {
                FirebaseConfigUtil.fetchGamesData(new FirebaseConfigUtil.OnConfigFetchListener() { // from class: org.game.play.aviator.gameplay.SplashActivity.1.1
                    @Override // org.game.play.aviator.gameplay.FirebaseConfigUtil.OnConfigFetchListener
                    public void onFetchSuccess(String str) {
                        SplashActivity.this.getConsentStatus();
                    }

                    @Override // org.game.play.aviator.gameplay.FirebaseConfigUtil.OnConfigFetchListener
                    public void onFetchFailure() {
                        SplashActivity.this.getConsentStatus();
                    }
                });
            }

            @Override // com.pesonal.adsdk.getDataListner
            public void onUpdate(String str) {
                SplashActivity.this.showupdateDialog();
            }

            @Override // com.pesonal.adsdk.getDataListner
            public void onRedirect(String str) {
                SplashActivity.this.showRedirectDialog(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getConsentStatus() {
        this.consentInformation = UserMessagingPlatform.getConsentInformation(this);
        this.consentInformation.requestConsentInfoUpdate(this, new ConsentRequestParameters.Builder().setTagForUnderAgeOfConsent(false).setAdMobAppId(AppManage.AppId).build(), new ConsentInformation.OnConsentInfoUpdateSuccessListener() { // from class: org.game.play.aviator.gameplay.SplashActivity.2
            @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateSuccessListener
            public void onConsentInfoUpdateSuccess() {
                if (SplashActivity.this.consentInformation.isConsentFormAvailable()) {
                    Log.e(SplashActivity.this.ConsentTag, "Avil");
                    SplashActivity.this.loadConsentForm();
                } else {
                    SplashActivity.this.loadAds();
                }
            }
        }, new ConsentInformation.OnConsentInfoUpdateFailureListener() { // from class: org.game.play.aviator.gameplay.SplashActivity.3
            @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateFailureListener
            public void onConsentInfoUpdateFailure(FormError formError) {
                SplashActivity.this.loadAds();
                Log.e(SplashActivity.this.ConsentTag, formError.getMessage());
            }
        });
    }

    public void loadConsentForm() {
        UserMessagingPlatform.loadConsentForm(this, new UserMessagingPlatform.OnConsentFormLoadSuccessListener() { // from class: org.game.play.aviator.gameplay.SplashActivity.4
            @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener
            public void onConsentFormLoadSuccess(ConsentForm consentForm) {
                if (SplashActivity.this.consentInformation.getConsentStatus() == 2) {
                    AppManage.mysharedpreferences.edit().putBoolean("IABTCF_gdprApplies", true).apply();
                    consentForm.show(SplashActivity.this, new ConsentForm.OnConsentFormDismissedListener() { // from class: org.game.play.aviator.gameplay.SplashActivity.4.1
                        @Override // com.google.android.ump.ConsentForm.OnConsentFormDismissedListener
                        public void onConsentFormDismissed(FormError formError) {
                            if (SplashActivity.this.consentInformation.getConsentStatus() == 3) {
                                SplashActivity.this.loadAds();
                            } else {
                                SplashActivity.this.loadConsentForm();
                            }
                        }
                    });
                } else {
                    SplashActivity.this.loadAds();
                }
            }
        }, new UserMessagingPlatform.OnConsentFormLoadFailureListener() { // from class: org.game.play.aviator.gameplay.SplashActivity.5
            @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener
            public void onConsentFormLoadFailure(FormError formError) {
                SplashActivity.this.loadConsentForm();
            }
        });
    }

    public static String md5(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : digest) {
                String hexString = Integer.toHexString(b & 255);
                while (hexString.length() < 2) {
                    hexString = AppEventsConstants.EVENT_PARAM_VALUE_NO + hexString;
                }
                stringBuffer.append(hexString);
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadAds() {
        if (isUserNotConsent() && AppManage.app_UserNotAcceptConsentAutoResetConsent == 1 && this.consentInformation != null) {
            AppManage.mysharedpreferences.edit().putBoolean("IABTCF_gdprApplies", false).apply();
            this.consentInformation.reset();
        }
        if (AppManage.admob_AdStatus == 1 && AppManage.app_UserNotAcceptConsentFormCustomAdShow == 0 && AppManage.getInstance(this).isUserNotConsent()) {
            SharedPreferences.Editor edit = AppManage.mysharedpreferences.edit();
            AppManage.app_adShowStatus = 0;
            edit.putInt("app_adShowStatus", AppManage.app_adShowStatus);
            edit.apply();
        }
        if (!AppManage.APP_ID.isEmpty()) {
            FacebookSdk.setApplicationId(AppManage.APP_ID);
            FacebookSdk.setClientToken(AppManage.CLIENT_TOKEN);
            FacebookSdk.addLoggingBehavior(LoggingBehavior.APP_EVENTS);
        }
        AppManage.getInstance(this).preloadAds();
        if (AppManage.ad_showSplashAdsStatus == 1) {
            if (AppManage.splashBannerShow == 1) {
                setSplashBanner();
            }
            if (AppManage.splashAppOpenOrInterShow == 1) {
                fetchAd();
                return;
            } else if (AppManage.splashAppOpenOrInterShow == 2) {
                new Handler().postDelayed(new Runnable() { // from class: org.game.play.aviator.gameplay.SplashActivity$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        SplashActivity.this.interAds();
                    }
                }, 4000L);
                return;
            } else {
                GotoMainScreen();
                return;
            }
        }
        GotoMainScreen();
    }

    public boolean isUserNotConsent() {
        SharedPreferences.Editor edit = AppManage.mysharedpreferences.edit();
        String string = getSharedPreferences(getPackageName() + "_preferences", 0).getString("IABTCF_VendorConsents", "");
        if (string.matches("^0+$")) {
            edit.putBoolean("isUserConsent", false);
            edit.apply();
            return true;
        }
        if (string.matches(".*1.*")) {
            edit.putBoolean("isUserConsent", true);
            edit.apply();
            return false;
        }
        edit.putBoolean("isUserConsent", true);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void interAds() {
        AppManage.getInstance(this).show_INTERSTIAL(new AppManage.MyCallback() { // from class: org.game.play.aviator.gameplay.SplashActivity$$ExternalSyntheticLambda0
            @Override // com.pesonal.adsdk.AppManage.MyCallback
            public final void callbackCall() {
                SplashActivity.this.GotoMainScreen();
            }
        }, Click.FORWARD, AppManage.ADMOB_I1, AppManage.FACEBOOK_I1);
    }

    /* renamed from: org.game.play.aviator.gameplay.SplashActivity$6, reason: invalid class name */
    class AnonymousClass6 implements AppOpenManager.splshADlistner {
        AnonymousClass6() {
        }

        @Override // org.game.play.aviator.gameplay.AppOpenManager.splshADlistner
        public void onsuccess() {
            SplashActivity.this.GotoMainScreen();
        }

        @Override // org.game.play.aviator.gameplay.AppOpenManager.splshADlistner
        public void onerror() {
            SplashActivity.this.runOnUiThread(new Runnable() { // from class: org.game.play.aviator.gameplay.SplashActivity$6$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    SplashActivity.AnonymousClass6.this.m2262lambda$onerror$1$orggameplayaviatorgameplaySplashActivity$6();
                }
            });
        }

        /* renamed from: lambda$onerror$0$org-game-play-aviator-gameplay-SplashActivity$6, reason: not valid java name */
        /* synthetic */ void m2261lambda$onerror$0$orggameplayaviatorgameplaySplashActivity$6() {
            SplashActivity.this.interAds();
        }

        /* renamed from: lambda$onerror$1$org-game-play-aviator-gameplay-SplashActivity$6, reason: not valid java name */
        /* synthetic */ void m2262lambda$onerror$1$orggameplayaviatorgameplaySplashActivity$6() {
            new Handler().postDelayed(new Runnable() { // from class: org.game.play.aviator.gameplay.SplashActivity$6$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    SplashActivity.AnonymousClass6.this.m2261lambda$onerror$0$orggameplayaviatorgameplaySplashActivity$6();
                }
            }, 2000L);
        }
    }

    public void fetchAd() {
        MyApplication.appOpenManager.fetchAd(new AnonymousClass6());
    }

    private AdSize getAdSize() {
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        float f = displayMetrics.density;
        float width = this.binding.rlBannerAd.getWidth();
        if (width == 0.0f) {
            width = displayMetrics.widthPixels;
        }
        return AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(this, (int) (width / f));
    }

    public void setSplashBanner() {
        if (AppManage.admob_AdStatus != 1 || AppManage.SplashBanner1.isEmpty() || this.binding.rlBannerAd == null) {
            return;
        }
        final AdView adView = new AdView(this);
        adView.setAdSize(getAdSize());
        adView.setAdUnitId(AppManage.SplashBanner1);
        adView.loadAd(new AdRequest.Builder().build());
        adView.setAdListener(new AdListener() { // from class: org.game.play.aviator.gameplay.SplashActivity.7
            @Override // com.google.android.gms.ads.AdListener
            public void onAdLoaded() {
                if (SplashActivity.this.binding.tvBannerAd != null) {
                    SplashActivity.this.binding.tvBannerAd.setVisibility(8);
                }
                if (SplashActivity.this.binding.rlBannerAd == null || adView == null) {
                    return;
                }
                SplashActivity.this.binding.rlBannerAd.removeAllViews();
                SplashActivity.this.binding.rlBannerAd.setVisibility(0);
                SplashActivity.this.binding.rlBannerAd.addView(adView);
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                super.onAdFailedToLoad(loadAdError);
            }
        });
    }

    public void setScreenCount(String str, Class<?> cls) {
        int i = AppManage.mysharedpreferences.getInt(str, 0);
        if (AppManage.app_screenCount == 0) {
            startActivity(new Intent(this, cls));
        } else if (AppManage.app_screenCount == 1) {
            if (i == 0) {
                AppManage.mysharedpreferences.edit().putInt(str, i + 1).apply();
                startActivity(new Intent(this, cls));
            } else {
                startActivity(new Intent(this, (Class<?>) MainActivity.class));
            }
        } else if (AppManage.app_screenCount == 2) {
            if (i == 0) {
                AppManage.mysharedpreferences.edit().putInt(str, i + 1).apply();
                startActivity(new Intent(this, cls));
            } else if (i == 1) {
                AppManage.mysharedpreferences.edit().putInt(str, i + 1).apply();
                startActivity(new Intent(this, (Class<?>) MainActivity.class));
            } else {
                AppManage.mysharedpreferences.edit().putInt(str, 1).apply();
                startActivity(new Intent(this, cls));
            }
        } else if (AppManage.app_screenCount == 3) {
            if (i == 0) {
                AppManage.mysharedpreferences.edit().putInt(str, i + 1).apply();
                startActivity(new Intent(this, cls));
            } else if (i == 1 || i == 2) {
                AppManage.mysharedpreferences.edit().putInt(str, i + 1).apply();
                startActivity(new Intent(this, (Class<?>) MainActivity.class));
            } else {
                AppManage.mysharedpreferences.edit().putInt(str, 0).apply();
                startActivity(new Intent(this, cls));
            }
        }
        finishAffinity();
    }

    public void GotoMainScreen() {
        if (AppManage.app_screenShow == 0) {
            startActivity(new Intent(this, (Class<?>) MainActivity.class));
            finish();
            return;
        }
        if (AppManage.app_screenShow == 1) {
            setScreenCount("screen_fifth_count", GuideActivity5.class);
            return;
        }
        if (AppManage.app_screenShow == 2) {
            setScreenCount("screen_fourth_count", GuideActivity4.class);
            return;
        }
        if (AppManage.app_screenShow == 3) {
            setScreenCount("screen_third_count", GuideActivity3.class);
            return;
        }
        if (AppManage.app_screenShow == 4) {
            setScreenCount("screen_two_count", GuideActivity2.class);
        } else if (AppManage.app_screenShow == 5) {
            setScreenCount("screen_one_count", GuideActivity1.class);
        } else {
            startActivity(new Intent(this, (Class<?>) MainActivity.class));
            finish();
        }
    }

    private class ExternalSynthetic implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
        }

        public ExternalSynthetic(final InstallReferrerClient installReferrerClient) {
            installReferrerClient.startConnection(new InstallReferrerStateListener() { // from class: org.game.play.aviator.gameplay.SplashActivity.ExternalSynthetic.1
                @Override // com.android.installreferrer.api.InstallReferrerStateListener
                public void onInstallReferrerServiceDisconnected() {
                }

                @Override // com.android.installreferrer.api.InstallReferrerStateListener
                public void onInstallReferrerSetupFinished(int i) {
                    if (i != 0) {
                        if (i == 1) {
                            SplashActivity.this.installReferrer = "unavailable_notset";
                            AppManage.mysharedpreferences.edit().putString("installReferrer", SplashActivity.this.installReferrer).apply();
                            SplashActivity.this.initUi();
                            return;
                        } else {
                            if (i == 2) {
                                SplashActivity.this.installReferrer = "not_supported_notset";
                                AppManage.mysharedpreferences.edit().putString("installReferrer", SplashActivity.this.installReferrer).apply();
                                SplashActivity.this.initUi();
                                return;
                            }
                            return;
                        }
                    }
                    try {
                        String installReferrer = installReferrerClient.getInstallReferrer().getInstallReferrer();
                        AppManage.mysharedpreferences.edit().putString("installReferrer", installReferrer).apply();
                        SplashActivity.this.installReferrer = installReferrer;
                        SplashActivity.this.initUi();
                        installReferrerClient.endConnection();
                    } catch (RemoteException e) {
                        SplashActivity.this.installReferrer = "exception_notset";
                        AppManage.mysharedpreferences.edit().putString("installReferrer", SplashActivity.this.installReferrer).apply();
                        SplashActivity.this.initUi();
                        e.printStackTrace();
                    }
                }
            });
        }
    }
}
