package dev.cct.translatorapp.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.facebook.ads.NativeAdLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import com.translator.alllanguagetranslations.ath.R;
import dev.cct.translatorapp.ads.ConstantParam;
import dev.cct.translatorapp.ads.IntersAdSimple;
import dev.cct.translatorapp.ads.NativeSplashAd;
import dev.cct.translatorapp.customFirebaseEvents.TranslatorCustomFirebaseEvents;
import dev.cct.translatorapp.databinding.ActivitySplashBinding;
import dev.cct.translatorapp.util.ExtensionFunction;
import dev.cct.translatorapp.util.Preferences;
import io.ktor.http.LinkHeader;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LunchingView.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 *2\u00020\u0001:\u0001*B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0014J\b\u0010\u001b\u001a\u00020\u0018H\u0002J\b\u0010\u001c\u001a\u00020\u0018H\u0002J\b\u0010\u001d\u001a\u00020\u0018H\u0002J\b\u0010\u001e\u001a\u00020\u0018H\u0002J\u0018\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020\u0018H\u0002J\u0012\u0010$\u001a\u00020\u00182\b\u0010%\u001a\u0004\u0018\u00010&H\u0014J\b\u0010'\u001a\u00020\u0018H\u0002J\b\u0010\u0015\u001a\u00020\u0018H\u0002J\b\u0010(\u001a\u00020\u0018H\u0002J\b\u0010)\u001a\u00020\u0018H\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Ldev/cct/translatorapp/ui/LunchingView;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "binding", "Ldev/cct/translatorapp/databinding/ActivitySplashBinding;", "getBinding", "()Ldev/cct/translatorapp/databinding/ActivitySplashBinding;", "setBinding", "(Ldev/cct/translatorapp/databinding/ActivitySplashBinding;)V", "clickEventsFirebase", "Ldev/cct/translatorapp/customFirebaseEvents/TranslatorCustomFirebaseEvents;", "pref", "Ldev/cct/translatorapp/util/Preferences;", "getPref", "()Ldev/cct/translatorapp/util/Preferences;", "setPref", "(Ldev/cct/translatorapp/util/Preferences;)V", "remoteConfig", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "attachBaseContext", "", "newBase", "Landroid/content/Context;", "checkInterstitialLoadAdStatus", "checkLoading", "checkNativeLoadAdStatus", "checkParamFirebase", "languageChange", "context", "locale", "Ljava/util/Locale;", "loadData", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "premiumNavigate", "showNext", "showTimer", "Companion", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LunchingView extends AppCompatActivity {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static boolean isAdLoaded;
    private final String TAG = "splash_logs";
    public ActivitySplashBinding binding;
    private TranslatorCustomFirebaseEvents clickEventsFirebase;
    public Preferences pref;
    private FirebaseRemoteConfig remoteConfig;

    public final ActivitySplashBinding getBinding() {
        ActivitySplashBinding activitySplashBinding = this.binding;
        if (activitySplashBinding != null) {
            return activitySplashBinding;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final void setBinding(ActivitySplashBinding activitySplashBinding) {
        Intrinsics.checkNotNullParameter(activitySplashBinding, "<set-?>");
        this.binding = activitySplashBinding;
    }

    public final Preferences getPref() {
        Preferences preferences = this.pref;
        if (preferences != null) {
            return preferences;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pref");
        return null;
    }

    public final void setPref(Preferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "<set-?>");
        this.pref = preferences;
    }

    public final String getTAG() {
        return this.TAG;
    }

    /* compiled from: LunchingView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ldev/cct/translatorapp/ui/LunchingView$Companion;", "", "()V", "isAdLoaded", "", "()Z", "setAdLoaded", "(Z)V", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean isAdLoaded() {
            return LunchingView.isAdLoaded;
        }

        public final void setAdLoaded(boolean z) {
            LunchingView.isAdLoaded = z;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context newBase) {
        Intrinsics.checkNotNullParameter(newBase, "newBase");
        String string = newBase.getSharedPreferences(newBase.getPackageName(), 0).getString("code", "en");
        Intrinsics.checkNotNull(string);
        Locale locale = new Locale(string);
        Locale.setDefault(locale);
        super.attachBaseContext(languageChange(newBase, locale));
    }

    private final Context languageChange(Context context, Locale locale) {
        Configuration configuration = context.getResources().getConfiguration();
        configuration.setLocale(locale);
        LocaleList localeList = new LocaleList(locale);
        LocaleList.setDefault(localeList);
        configuration.setLocales(localeList);
        Context createConfigurationContext = context.createConfigurationContext(configuration);
        Intrinsics.checkNotNullExpressionValue(createConfigurationContext, "tempContext.createConfig…ionContext(configuration)");
        return createConfigurationContext;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySplashBinding inflate = ActivitySplashBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        setBinding(inflate);
        setContentView(getBinding().getRoot());
        LunchingView lunchingView = this;
        setPref(new Preferences(lunchingView));
        this.remoteConfig = FirebaseRemoteConfig.getInstance();
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(lunchingView);
        Intrinsics.checkNotNullExpressionValue(firebaseAnalytics, "getInstance(this)");
        this.clickEventsFirebase = new TranslatorCustomFirebaseEvents(firebaseAnalytics);
        new Preferences(lunchingView).setFirstTimeOpenAd(true);
        if (!new Preferences(lunchingView).getCheckBillingStatus()) {
            showTimer();
        } else {
            premiumNavigate();
        }
        remoteConfig();
        TranslatorCustomFirebaseEvents translatorCustomFirebaseEvents = this.clickEventsFirebase;
        if (translatorCustomFirebaseEvents != null) {
            translatorCustomFirebaseEvents.splashMain();
        }
        getBinding().startButton.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.LunchingView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LunchingView.onCreate$lambda$0(LunchingView.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(LunchingView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.checkLoading();
    }

    private final void loadData() {
        if (getPref().isFirst()) {
            LunchingView lunchingView = this;
            Intent intent = new Intent(lunchingView, (Class<?>) LanguageActivity.class);
            intent.putExtra("splash", "toLanguage");
            startActivity(intent);
            finish();
            IntersAdSimple.INSTANCE.getInstance().showSplashIntersAd(this);
            getPref().setFirst(false);
            new Preferences(lunchingView).setFirstTimeOpenAd(true);
            return;
        }
        if (getPref().getCount() % 5 == 0) {
            LunchingView lunchingView2 = this;
            Intent intent2 = new Intent(lunchingView2, (Class<?>) PremiumActivity.class);
            intent2.putExtra(LinkHeader.Parameters.Type, "fromSplash");
            startActivity(intent2);
            finish();
            IntersAdSimple.INSTANCE.getInstance().showSplashIntersAd(this);
            TranslatorCustomFirebaseEvents translatorCustomFirebaseEvents = this.clickEventsFirebase;
            if (translatorCustomFirebaseEvents != null) {
                translatorCustomFirebaseEvents.splashToPremium();
            }
            new Preferences(lunchingView2).setFirstTimeOpenAd(false);
        } else {
            LunchingView lunchingView3 = this;
            ExtensionFunction.INSTANCE.openActivity(lunchingView3, HomeScreenActivity.class);
            finish();
            IntersAdSimple.INSTANCE.getInstance().showSplashIntersAd(this);
            new Preferences(lunchingView3).setFirstTimeOpenAd(false);
        }
        Preferences pref = getPref();
        pref.setCount(pref.getCount() + 1);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [dev.cct.translatorapp.ui.LunchingView$showTimer$timer$1] */
    private final void showTimer() {
        new CountDownTimer() { // from class: dev.cct.translatorapp.ui.LunchingView$showTimer$timer$1
            @Override // android.os.CountDownTimer
            public void onTick(long millisUntilFinished) {
            }

            {
                super(7500L, 1000L);
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                Log.e(LunchingView.this.getTAG(), "onFinish: " + new Preferences(LunchingView.this).getCheckBillingStatus());
                if (!ExtensionFunction.INSTANCE.checkInternetConnection(LunchingView.this)) {
                    LunchingView.this.showNext();
                } else {
                    LunchingView.this.getBinding().startButton.setVisibility(0);
                    LunchingView.this.getBinding().animationView.setVisibility(4);
                }
            }
        }.start();
    }

    private final void checkLoading() {
        loadData();
    }

    private final void remoteConfig() {
        FirebaseRemoteConfigSettings build = new FirebaseRemoteConfigSettings.Builder().setMinimumFetchIntervalInSeconds(0L).build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder()\n            .s…s(0)\n            .build()");
        FirebaseRemoteConfig firebaseRemoteConfig = this.remoteConfig;
        Intrinsics.checkNotNull(firebaseRemoteConfig);
        firebaseRemoteConfig.setConfigSettingsAsync(build);
        FirebaseRemoteConfig firebaseRemoteConfig2 = this.remoteConfig;
        Intrinsics.checkNotNull(firebaseRemoteConfig2);
        firebaseRemoteConfig2.fetchAndActivate().addOnCompleteListener(this, new OnCompleteListener() { // from class: dev.cct.translatorapp.ui.LunchingView$$ExternalSyntheticLambda2
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                LunchingView.remoteConfig$lambda$1(LunchingView.this, task);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void remoteConfig$lambda$1(LunchingView this$0, Task task) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(task, "task");
        if (task.isSuccessful()) {
            Log.d("remoteConfig", "Config params updated: " + ((Boolean) task.getResult()));
        } else {
            Log.d("remoteConfig", "Fetch failed: ");
        }
        this$0.checkParamFirebase();
        this$0.checkInterstitialLoadAdStatus();
        this$0.checkNativeLoadAdStatus();
    }

    private final void checkNativeLoadAdStatus() {
        if (ConstantParam.INSTANCE.isEnableSplashAdmobOrFbNativeAd()) {
            Log.d(this.TAG, "checkNativeLoadAdStatus: admob");
            getBinding().adFbLayout.setVisibility(8);
            getBinding().adLayout.setVisibility(0);
            LunchingView lunchingView = this;
            String splashAdmobNativeAdId = ConstantParam.INSTANCE.getSplashAdmobNativeAdId();
            FrameLayout frameLayout = getBinding().adFrame;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.adFrame");
            ShimmerFrameLayout shimmerFrameLayout = getBinding().shimmerViewContainer1;
            Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "binding.shimmerViewContainer1");
            new NativeSplashAd(lunchingView).loadLargeNativeAds(R.layout.ad_native_layout, this, lunchingView, splashAdmobNativeAdId, frameLayout, shimmerFrameLayout);
            return;
        }
        Log.d(this.TAG, "checkNativeLoadAdStatus: fb ");
        getBinding().adFbLayout.setVisibility(0);
        getBinding().adLayout.setVisibility(8);
        LunchingView lunchingView2 = this;
        NativeSplashAd nativeSplashAd = new NativeSplashAd(lunchingView2);
        String splashFbNativeAdId = ConstantParam.INSTANCE.getSplashFbNativeAdId();
        NativeAdLayout nativeAdLayout = getBinding().nativeAdContainer;
        Intrinsics.checkNotNullExpressionValue(nativeAdLayout, "binding.nativeAdContainer");
        ShimmerFrameLayout shimmerFrameLayout2 = getBinding().shimmerViewContainer;
        Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout2, "binding.shimmerViewContainer");
        nativeSplashAd.loadFbNativeAd(R.layout.large_facebook_native_ad, lunchingView2, splashFbNativeAdId, nativeAdLayout, shimmerFrameLayout2);
    }

    private final void checkInterstitialLoadAdStatus() {
        if (ConstantParam.INSTANCE.isEnableSplashAdmobOrFbInterAd()) {
            IntersAdSimple.INSTANCE.getInstance().loadSplashIntersAd(this, ConstantParam.INSTANCE.getSplashAdmobInterstitialId());
        } else {
            IntersAdSimple.INSTANCE.getInstance().loadFacebookIntersAd(this, ConstantParam.INSTANCE.getSplashFbInterstitialId());
        }
    }

    private final void checkParamFirebase() {
        FirebaseRemoteConfig firebaseRemoteConfig = this.remoteConfig;
        if (firebaseRemoteConfig != null) {
            ConstantParam constantParam = ConstantParam.INSTANCE;
            String string = firebaseRemoteConfig.getString("splash_inters");
            Intrinsics.checkNotNullExpressionValue(string, "it.getString(\"splash_inters\")");
            constantParam.setSplashAdmobInterstitialId(string);
            ConstantParam constantParam2 = ConstantParam.INSTANCE;
            String string2 = firebaseRemoteConfig.getString("fb_splash_int");
            Intrinsics.checkNotNullExpressionValue(string2, "it.getString(\"fb_splash_int\")");
            constantParam2.setSplashFbInterstitialId(string2);
            ConstantParam constantParam3 = ConstantParam.INSTANCE;
            String string3 = firebaseRemoteConfig.getString("splash_native");
            Intrinsics.checkNotNullExpressionValue(string3, "it.getString(\"splash_native\")");
            constantParam3.setSplashAdmobNativeAdId(string3);
            ConstantParam constantParam4 = ConstantParam.INSTANCE;
            String string4 = firebaseRemoteConfig.getString("fb_splash_native");
            Intrinsics.checkNotNullExpressionValue(string4, "it.getString(\"fb_splash_native\")");
            constantParam4.setSplashFbNativeAdId(string4);
            ConstantParam.INSTANCE.setEnableSplashAdmobOrFbInterAd(firebaseRemoteConfig.getBoolean("is_splashinters_enable"));
            ConstantParam.INSTANCE.setEnableSplashAdmobOrFbNativeAd(firebaseRemoteConfig.getBoolean("is_splashnative_enable"));
            ConstantParam constantParam5 = ConstantParam.INSTANCE;
            String string5 = firebaseRemoteConfig.getString("native_language");
            Intrinsics.checkNotNullExpressionValue(string5, "it.getString(\"native_language\")");
            constantParam5.setLanguageAdmobNativeAdId(string5);
            ConstantParam constantParam6 = ConstantParam.INSTANCE;
            String string6 = firebaseRemoteConfig.getString("fb_language_native");
            Intrinsics.checkNotNullExpressionValue(string6, "it.getString(\"fb_language_native\")");
            constantParam6.setLanguageFbNativeAdId(string6);
            ConstantParam.INSTANCE.setEnableLanguageAdmobOrFbNativeAd(firebaseRemoteConfig.getBoolean("is_language_native_enable"));
            ConstantParam constantParam7 = ConstantParam.INSTANCE;
            String string7 = firebaseRemoteConfig.getString("mainscr_native");
            Intrinsics.checkNotNullExpressionValue(string7, "it.getString(\"mainscr_native\")");
            constantParam7.setMainAdmobNativeAdId(string7);
            ConstantParam constantParam8 = ConstantParam.INSTANCE;
            String string8 = firebaseRemoteConfig.getString("text_native");
            Intrinsics.checkNotNullExpressionValue(string8, "it.getString(\"text_native\")");
            constantParam8.setTextPangleNativeAdId(string8);
            ConstantParam constantParam9 = ConstantParam.INSTANCE;
            String string9 = firebaseRemoteConfig.getString("phrase_native");
            Intrinsics.checkNotNullExpressionValue(string9, "it.getString(\"phrase_native\")");
            constantParam9.setPhrasesPangleNativeAdId(string9);
            ConstantParam constantParam10 = ConstantParam.INSTANCE;
            String string10 = firebaseRemoteConfig.getString("floating_native");
            Intrinsics.checkNotNullExpressionValue(string10, "it.getString(\"floating_native\")");
            constantParam10.setFloatingFbNativeAdId(string10);
            ConstantParam constantParam11 = ConstantParam.INSTANCE;
            String string11 = firebaseRemoteConfig.getString("fb_banner");
            Intrinsics.checkNotNullExpressionValue(string11, "it.getString(\"fb_banner\")");
            constantParam11.setFbBannerId(string11);
            ConstantParam constantParam12 = ConstantParam.INSTANCE;
            String string12 = firebaseRemoteConfig.getString("fb_native");
            Intrinsics.checkNotNullExpressionValue(string12, "it.getString(\"fb_native\")");
            constantParam12.setFbNativeAdId(string12);
            ConstantParam constantParam13 = ConstantParam.INSTANCE;
            String string13 = firebaseRemoteConfig.getString("fb_inters");
            Intrinsics.checkNotNullExpressionValue(string13, "it.getString(\"fb_inters\")");
            constantParam13.setFbInterstitialAdId(string13);
            ConstantParam constantParam14 = ConstantParam.INSTANCE;
            String string14 = firebaseRemoteConfig.getString("interstitial_text");
            Intrinsics.checkNotNullExpressionValue(string14, "it.getString(\"interstitial_text\")");
            constantParam14.setTextInterstitialsAdmobId(string14);
            ConstantParam constantParam15 = ConstantParam.INSTANCE;
            String string15 = firebaseRemoteConfig.getString("rewarded_floating");
            Intrinsics.checkNotNullExpressionValue(string15, "it.getString(\"rewarded_floating\")");
            constantParam15.setRewardedInterstitials(string15);
            ConstantParam constantParam16 = ConstantParam.INSTANCE;
            String string16 = firebaseRemoteConfig.getString("app_openresume");
            Intrinsics.checkNotNullExpressionValue(string16, "it.getString(\"app_openresume\")");
            constantParam16.setOnResumeAppOpenId(string16);
            ConstantParam constantParam17 = ConstantParam.INSTANCE;
            String string17 = firebaseRemoteConfig.getString("collapsible");
            Intrinsics.checkNotNullExpressionValue(string17, "it.getString(\"collapsible\")");
            constantParam17.setHomeCollapsibleInterstitialsAdId(string17);
            ConstantParam constantParam18 = ConstantParam.INSTANCE;
            String string18 = firebaseRemoteConfig.getString("collapsible_texttranslate");
            Intrinsics.checkNotNullExpressionValue(string18, "it.getString(\"collapsible_texttranslate\")");
            constantParam18.setTextCollapsibleInterstitialsAdId(string18);
            ConstantParam constantParam19 = ConstantParam.INSTANCE;
            String string19 = firebaseRemoteConfig.getString("phrase_banner_collapsible");
            Intrinsics.checkNotNullExpressionValue(string19, "it.getString(\"phrase_banner_collapsible\")");
            constantParam19.setPhraseCollapsibleInterstitialsAdId(string19);
            ConstantParam constantParam20 = ConstantParam.INSTANCE;
            String string20 = firebaseRemoteConfig.getString("collapsable_dictionary");
            Intrinsics.checkNotNullExpressionValue(string20, "it.getString(\"collapsable_dictionary\")");
            constantParam20.setDicCollapsibleInterstitialsAdId(string20);
            ConstantParam.INSTANCE.setFbBannerEnableOrNot(firebaseRemoteConfig.getBoolean("is_fb_banner_enable"));
            ConstantParam.INSTANCE.setFbNativeEnableOrNot(firebaseRemoteConfig.getBoolean("is_fb_native_enable"));
            ConstantParam.INSTANCE.setFbInterstitialEnableOrNot(firebaseRemoteConfig.getBoolean("is_fb_inters_enable"));
            Log.d(this.TAG, "checkParamFirebase: text inter:" + ConstantParam.INSTANCE.getTextInterstitialsAdmobId() + "\n onResumeAdId:" + ConstantParam.INSTANCE.getOnResumeAppOpenId() + "\n home:" + ConstantParam.INSTANCE.getHomeCollapsibleInterstitialsAdId() + "\ntext:" + ConstantParam.INSTANCE.getTextCollapsibleInterstitialsAdId() + "\nphrase:" + ConstantParam.INSTANCE.getPhraseCollapsibleInterstitialsAdId() + "\ndic:" + ConstantParam.INSTANCE.getDicCollapsibleInterstitialsAdId() + "\nrewarded" + ConstantParam.INSTANCE.getRewardedInterstitials());
        }
    }

    private final void premiumNavigate() {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: dev.cct.translatorapp.ui.LunchingView$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                LunchingView.premiumNavigate$lambda$3(LunchingView.this);
            }
        }, 3000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void premiumNavigate$lambda$3(LunchingView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ExtensionFunction.INSTANCE.openActivity(this$0, HomeScreenActivity.class);
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showNext() {
        if (getPref().isFirst()) {
            ExtensionFunction.INSTANCE.openActivity(this, LanguageActivity.class);
            finish();
            getPref().setFirst(false);
            return;
        }
        if (getPref().getCount() % 2 != 0) {
            Intent intent = new Intent(this, (Class<?>) PremiumActivity.class);
            intent.putExtra(LinkHeader.Parameters.Type, "fromSplash");
            startActivity(intent);
            finish();
        } else {
            ExtensionFunction.INSTANCE.openActivity(this, HomeScreenActivity.class);
            finish();
        }
        Preferences pref = getPref();
        pref.setCount(pref.getCount() + 1);
    }
}
