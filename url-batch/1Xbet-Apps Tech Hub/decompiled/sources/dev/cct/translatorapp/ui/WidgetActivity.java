package dev.cct.translatorapp.ui;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.Toast;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;
import com.google.android.ump.FormError;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.translator.alllanguagetranslations.ath.R;
import dev.cct.translatorapp.TranslatorAdmobAds.AdsExtensionKt;
import dev.cct.translatorapp.UmpSdk.GoogleMobileAdsConsentManager;
import dev.cct.translatorapp.ads.AppOpenAd;
import dev.cct.translatorapp.ads.ConstantParam;
import dev.cct.translatorapp.customFirebaseEvents.TranslatorCustomFirebaseEvents;
import dev.cct.translatorapp.databinding.ActivityWidgetBinding;
import dev.cct.translatorapp.databinding.PermissionDialogBinding;
import dev.cct.translatorapp.databinding.WidgetPerformDialogBinding;
import dev.cct.translatorapp.interfaces.OnClickCloseItems;
import dev.cct.translatorapp.services.TranslatorServices;
import dev.cct.translatorapp.util.ExtensionFunction;
import dev.cct.translatorapp.util.Preferences;
import io.ktor.http.LinkHeader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WidgetActivity.kt */
@Metadata(d1 = {"\u0000·\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\"\b\u0007\u0018\u0000 f2\u00020\u00012\u00020\u0002:\u0001fB\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0014J\b\u0010(\u001a\u00020%H\u0002J\b\u0010)\u001a\u00020%H\u0002J\b\u0010*\u001a\u00020%H\u0002J\b\u0010+\u001a\u00020%H\u0002J\b\u0010,\u001a\u00020\u0015H\u0002J\u0012\u0010-\u001a\u0004\u0018\u00010\u00152\u0006\u0010.\u001a\u00020'H\u0002J\b\u0010/\u001a\u00020%H\u0002J\u0014\u00100\u001a\u0002012\n\u00102\u001a\u0006\u0012\u0002\b\u000303H\u0002J\u0018\u00104\u001a\u00020'2\u0006\u0010.\u001a\u00020'2\u0006\u00105\u001a\u000206H\u0002J\u0018\u00107\u001a\u00020%2\u0006\u00108\u001a\u00020'2\u0006\u00109\u001a\u00020\u0015H\u0002J\b\u0010:\u001a\u00020%H\u0002J\u000e\u0010;\u001a\u00020%2\u0006\u0010<\u001a\u00020=J\b\u0010>\u001a\u00020%H\u0002J\b\u0010?\u001a\u00020%H\u0017J\u0010\u0010@\u001a\u00020%2\u0006\u0010A\u001a\u000201H\u0016J\u0012\u0010B\u001a\u00020%2\b\u0010C\u001a\u0004\u0018\u00010DH\u0015J\b\u0010E\u001a\u00020%H\u0014J\b\u0010F\u001a\u00020%H\u0014J\b\u0010G\u001a\u00020%H\u0014J\b\u0010H\u001a\u00020%H\u0014J\b\u0010I\u001a\u00020%H\u0014J\u0018\u0010J\u001a\u00020%2\u0006\u0010.\u001a\u00020'2\u0006\u0010K\u001a\u00020\u0015H\u0002J\b\u0010L\u001a\u00020%H\u0002J\u0010\u0010M\u001a\u00020%2\u0006\u0010N\u001a\u00020OH\u0002J\b\u0010P\u001a\u00020%H\u0002J\b\u0010Q\u001a\u00020%H\u0002J\b\u0010R\u001a\u00020%H\u0002J\b\u0010S\u001a\u00020%H\u0002J$\u0010T\u001a\u00020%2\u0006\u0010<\u001a\u00020=2\u0012\u0010U\u001a\u000e\u0012\u0004\u0012\u00020W\u0012\u0004\u0012\u00020%0VH\u0002J\u0010\u0010X\u001a\u00020%2\u0006\u0010Y\u001a\u00020\u0015H\u0002J\u0018\u0010Z\u001a\u00020%2\u0006\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020^H\u0002J*\u0010_\u001a\u00020%2\u0006\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020^2\u0010\b\u0002\u0010`\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010aH\u0002J \u0010b\u001a\u00020%2\u0006\u0010c\u001a\u00020\\2\u0006\u0010d\u001a\u00020\\2\u0006\u0010]\u001a\u00020^H\u0002J\u0010\u0010e\u001a\u00020%2\u0006\u00100\u001a\u000201H\u0002R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0018\u001a\u0010\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u001a0\u001a0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0015X\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0004\n\u0002\u0010#¨\u0006g"}, d2 = {"Ldev/cct/translatorapp/ui/WidgetActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Ldev/cct/translatorapp/interfaces/OnClickCloseItems;", "()V", "adInstance", "Lcom/google/android/gms/ads/interstitial/InterstitialAd;", "getAdInstance", "()Lcom/google/android/gms/ads/interstitial/InterstitialAd;", "setAdInstance", "(Lcom/google/android/gms/ads/interstitial/InterstitialAd;)V", "binding", "Ldev/cct/translatorapp/databinding/ActivityWidgetBinding;", "getBinding", "()Ldev/cct/translatorapp/databinding/ActivityWidgetBinding;", "setBinding", "(Ldev/cct/translatorapp/databinding/ActivityWidgetBinding;)V", "clickEventsFirebase", "Ldev/cct/translatorapp/customFirebaseEvents/TranslatorCustomFirebaseEvents;", "googleMobileAdsConsentManager", "Ldev/cct/translatorapp/UmpSdk/GoogleMobileAdsConsentManager;", "lastDateInters", "", "loadingDialog", "Landroid/app/AlertDialog;", "overlayPermissionLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "pref", "Ldev/cct/translatorapp/util/Preferences;", "prefTrans", "rewardInterstitialAds", "Lcom/google/android/gms/ads/rewardedinterstitial/RewardedInterstitialAd;", "serviceStateReceiver", "dev/cct/translatorapp/ui/WidgetActivity$serviceStateReceiver$1", "Ldev/cct/translatorapp/ui/WidgetActivity$serviceStateReceiver$1;", "attachBaseContext", "", "newBase", "Landroid/content/Context;", "check24HourFloatingTranslatorStatus", "checkOverlayPermission", "checkTutorials", "clickListenerItems", "getCurrentDate", "getLastShownDate", "context", "initListeners", "isServiceRunning", "", "serviceClass", "Ljava/lang/Class;", "languageChange", "locale", "Ljava/util/Locale;", "loadFloatingIntersAd", "mContext", FacebookMediationAdapter.KEY_ID, "loadInters", "loadRewardIntersAds", "adUnitIdL", "", "loadUmpSdk", "onBackPressed", "onCloseButtonClicked", "isVisible", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPause", "onResume", "onStart", "onStop", "saveLastShownDate", "date", "showDialog", "showFloatingIntersAd", "activityContext", "Landroid/app/Activity;", "showIntersAd", "showLoadingDialog", "showPurchaseStatusDialog", "showRewardedAd", "showRewardedIntersAds", "afterCodeRewardCoin", "Lkotlin/Function1;", "Lcom/google/android/gms/ads/rewarded/RewardItem;", "showToast", PglCryptUtils.KEY_MESSAGE, "slideIn", "view", "Landroid/view/View;", TypedValues.TransitionType.S_DURATION, "", "slideOut", "onAnimationEnd", "Lkotlin/Function0;", "slideOutAndIn", "viewToSlideOut", "viewToSlideIn", "updateViews", "Companion", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WidgetActivity extends AppCompatActivity implements OnClickCloseItems {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static boolean isCompleteAd;
    private static boolean isRewardedLoadedFailed;
    private InterstitialAd adInstance;
    public ActivityWidgetBinding binding;
    private TranslatorCustomFirebaseEvents clickEventsFirebase;
    private GoogleMobileAdsConsentManager googleMobileAdsConsentManager;
    private AlertDialog loadingDialog;
    private final ActivityResultLauncher<Intent> overlayPermissionLauncher;
    private Preferences pref;
    private RewardedInterstitialAd rewardInterstitialAds;
    private final String prefTrans = "TranslatorPrefs";
    private final String lastDateInters = "lastShownDateInterstitial";
    private final WidgetActivity$serviceStateReceiver$1 serviceStateReceiver = new BroadcastReceiver() { // from class: dev.cct.translatorapp.ui.WidgetActivity$serviceStateReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            WidgetActivity.this.updateViews(intent != null ? intent.getBooleanExtra("isServiceRunning", false) : false);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadUmpSdk$lambda$23(FormError formError) {
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [dev.cct.translatorapp.ui.WidgetActivity$serviceStateReceiver$1] */
    public WidgetActivity() {
        ActivityResultLauncher<Intent> registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: dev.cct.translatorapp.ui.WidgetActivity$$ExternalSyntheticLambda10
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                WidgetActivity.overlayPermissionLauncher$lambda$0(WidgetActivity.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResul…\n\n            }\n        }");
        this.overlayPermissionLauncher = registerForActivityResult;
    }

    public final ActivityWidgetBinding getBinding() {
        ActivityWidgetBinding activityWidgetBinding = this.binding;
        if (activityWidgetBinding != null) {
            return activityWidgetBinding;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final void setBinding(ActivityWidgetBinding activityWidgetBinding) {
        Intrinsics.checkNotNullParameter(activityWidgetBinding, "<set-?>");
        this.binding = activityWidgetBinding;
    }

    public final InterstitialAd getAdInstance() {
        return this.adInstance;
    }

    public final void setAdInstance(InterstitialAd interstitialAd) {
        this.adInstance = interstitialAd;
    }

    /* compiled from: WidgetActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0005\"\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Ldev/cct/translatorapp/ui/WidgetActivity$Companion;", "", "()V", "isCompleteAd", "", "()Z", "setCompleteAd", "(Z)V", "isRewardedLoadedFailed", "setRewardedLoadedFailed", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean isRewardedLoadedFailed() {
            return WidgetActivity.isRewardedLoadedFailed;
        }

        public final void setRewardedLoadedFailed(boolean z) {
            WidgetActivity.isRewardedLoadedFailed = z;
        }

        public final boolean isCompleteAd() {
            return WidgetActivity.isCompleteAd;
        }

        public final void setCompleteAd(boolean z) {
            WidgetActivity.isCompleteAd = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void overlayPermissionLauncher$lambda$0(WidgetActivity this$0, ActivityResult activityResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WidgetActivity widgetActivity = this$0;
        if (Settings.canDrawOverlays(widgetActivity)) {
            this$0.showToast("Overlay permission granted.");
            this$0.startService(new Intent(widgetActivity, (Class<?>) TranslatorServices.class));
            this$0.getBinding().onStateWidget.setVisibility(4);
            this$0.getBinding().offStateWidget.setVisibility(0);
            return;
        }
        this$0.showToast("Overlay permission denied.");
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
        ActivityWidgetBinding inflate = ActivityWidgetBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        setBinding(inflate);
        setContentView(getBinding().getRoot());
        WidgetActivity widgetActivity = this;
        this.pref = new Preferences(widgetActivity);
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(widgetActivity);
        Intrinsics.checkNotNullExpressionValue(firebaseAnalytics, "getInstance(this)");
        this.clickEventsFirebase = new TranslatorCustomFirebaseEvents(firebaseAnalytics);
        this.googleMobileAdsConsentManager = GoogleMobileAdsConsentManager.INSTANCE.getInstance(widgetActivity);
        loadUmpSdk();
        check24HourFloatingTranslatorStatus();
        new TranslatorServices().setCloseButtonVisibilityListener(this);
        initListeners();
        clickListenerItems();
        IntentFilter intentFilter = new IntentFilter("SERVICE_STATE_ACTION");
        if (Build.VERSION.SDK_INT >= 26) {
            registerReceiver(this.serviceStateReceiver, intentFilter, 2);
        } else {
            registerReceiver(this.serviceStateReceiver, intentFilter);
        }
        if (isServiceRunning(TranslatorServices.class)) {
            getBinding().onStateWidget.setVisibility(4);
            getBinding().offStateWidget.setVisibility(0);
        } else {
            getBinding().onStateWidget.setVisibility(0);
            getBinding().offStateWidget.setVisibility(4);
        }
        if (new Preferences(widgetActivity).getCheckBillingStatus()) {
            return;
        }
        loadInters();
    }

    private final void check24HourFloatingTranslatorStatus() {
        String currentDate = getCurrentDate();
        WidgetActivity widgetActivity = this;
        String lastShownDate = getLastShownDate(widgetActivity);
        if (lastShownDate == null || !Intrinsics.areEqual(lastShownDate, currentDate)) {
            Preferences preferences = this.pref;
            if (preferences == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pref");
                preferences = null;
            }
            preferences.setShowRewardedAd(false);
            saveLastShownDate(widgetActivity, currentDate);
        }
    }

    private final void loadInters() {
        Log.d("floating", "loadInters: ca-app-pub-3940256099942544/1033173712");
        loadFloatingIntersAd(this, "ca-app-pub-3940256099942544/1033173712");
    }

    private final void clickListenerItems() {
        final ActivityWidgetBinding binding = getBinding();
        final long j = 600;
        binding.next1.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.WidgetActivity$$ExternalSyntheticLambda11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WidgetActivity.clickListenerItems$lambda$10$lambda$1(WidgetActivity.this, binding, j, view);
            }
        });
        binding.next2.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.WidgetActivity$$ExternalSyntheticLambda12
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WidgetActivity.clickListenerItems$lambda$10$lambda$2(WidgetActivity.this, binding, j, view);
            }
        });
        binding.next3.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.WidgetActivity$$ExternalSyntheticLambda13
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WidgetActivity.clickListenerItems$lambda$10$lambda$3(WidgetActivity.this, binding, j, view);
            }
        });
        binding.skip.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.WidgetActivity$$ExternalSyntheticLambda14
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WidgetActivity.clickListenerItems$lambda$10$lambda$4(WidgetActivity.this, binding, j, view);
            }
        });
        binding.back2.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.WidgetActivity$$ExternalSyntheticLambda15
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WidgetActivity.clickListenerItems$lambda$10$lambda$5(WidgetActivity.this, binding, j, view);
            }
        });
        binding.back3.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.WidgetActivity$$ExternalSyntheticLambda16
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WidgetActivity.clickListenerItems$lambda$10$lambda$6(WidgetActivity.this, binding, j, view);
            }
        });
        binding.back4.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.WidgetActivity$$ExternalSyntheticLambda17
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WidgetActivity.clickListenerItems$lambda$10$lambda$7(WidgetActivity.this, binding, j, view);
            }
        });
        binding.finishTut.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.WidgetActivity$$ExternalSyntheticLambda18
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WidgetActivity.clickListenerItems$lambda$10$lambda$8(WidgetActivity.this, binding, j, view);
            }
        });
        binding.tutorial.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.WidgetActivity$$ExternalSyntheticLambda19
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WidgetActivity.clickListenerItems$lambda$10$lambda$9(WidgetActivity.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clickListenerItems$lambda$10$lambda$1(WidgetActivity this$0, ActivityWidgetBinding this_with, long j, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        ConstraintLayout tutorial1 = this_with.tutorial1;
        Intrinsics.checkNotNullExpressionValue(tutorial1, "tutorial1");
        ConstraintLayout tutorial2 = this_with.tutorial2;
        Intrinsics.checkNotNullExpressionValue(tutorial2, "tutorial2");
        this$0.slideOutAndIn(tutorial1, tutorial2, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clickListenerItems$lambda$10$lambda$2(WidgetActivity this$0, ActivityWidgetBinding this_with, long j, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        ConstraintLayout tutorial2 = this_with.tutorial2;
        Intrinsics.checkNotNullExpressionValue(tutorial2, "tutorial2");
        ConstraintLayout tutorial3 = this_with.tutorial3;
        Intrinsics.checkNotNullExpressionValue(tutorial3, "tutorial3");
        this$0.slideOutAndIn(tutorial2, tutorial3, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clickListenerItems$lambda$10$lambda$3(WidgetActivity this$0, ActivityWidgetBinding this_with, long j, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        ConstraintLayout tutorial3 = this_with.tutorial3;
        Intrinsics.checkNotNullExpressionValue(tutorial3, "tutorial3");
        ConstraintLayout tutorial4 = this_with.tutorial4;
        Intrinsics.checkNotNullExpressionValue(tutorial4, "tutorial4");
        this$0.slideOutAndIn(tutorial3, tutorial4, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clickListenerItems$lambda$10$lambda$4(WidgetActivity this$0, ActivityWidgetBinding this_with, long j, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        ConstraintLayout tutorialsLayout = this_with.tutorialsLayout;
        Intrinsics.checkNotNullExpressionValue(tutorialsLayout, "tutorialsLayout");
        slideOut$default(this$0, tutorialsLayout, j, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clickListenerItems$lambda$10$lambda$5(WidgetActivity this$0, ActivityWidgetBinding this_with, long j, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        ConstraintLayout tutorial2 = this_with.tutorial2;
        Intrinsics.checkNotNullExpressionValue(tutorial2, "tutorial2");
        ConstraintLayout tutorial1 = this_with.tutorial1;
        Intrinsics.checkNotNullExpressionValue(tutorial1, "tutorial1");
        this$0.slideOutAndIn(tutorial2, tutorial1, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clickListenerItems$lambda$10$lambda$6(WidgetActivity this$0, ActivityWidgetBinding this_with, long j, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        ConstraintLayout tutorial3 = this_with.tutorial3;
        Intrinsics.checkNotNullExpressionValue(tutorial3, "tutorial3");
        ConstraintLayout tutorial2 = this_with.tutorial2;
        Intrinsics.checkNotNullExpressionValue(tutorial2, "tutorial2");
        this$0.slideOutAndIn(tutorial3, tutorial2, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clickListenerItems$lambda$10$lambda$7(WidgetActivity this$0, ActivityWidgetBinding this_with, long j, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        ConstraintLayout tutorial4 = this_with.tutorial4;
        Intrinsics.checkNotNullExpressionValue(tutorial4, "tutorial4");
        ConstraintLayout tutorial3 = this_with.tutorial3;
        Intrinsics.checkNotNullExpressionValue(tutorial3, "tutorial3");
        this$0.slideOutAndIn(tutorial4, tutorial3, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clickListenerItems$lambda$10$lambda$8(WidgetActivity this$0, final ActivityWidgetBinding this_with, long j, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        ConstraintLayout tutorialsLayout = this_with.tutorialsLayout;
        Intrinsics.checkNotNullExpressionValue(tutorialsLayout, "tutorialsLayout");
        this$0.slideOut(tutorialsLayout, j, new Function0<Unit>() { // from class: dev.cct.translatorapp.ui.WidgetActivity$clickListenerItems$1$8$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ActivityWidgetBinding.this.widgetLayout.setVisibility(0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clickListenerItems$lambda$10$lambda$9(WidgetActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getBinding().tutorialsLayout.setVisibility(0);
        this$0.getBinding().tutorial1.setVisibility(0);
        this$0.getBinding().tutorial2.setVisibility(4);
        this$0.getBinding().tutorial3.setVisibility(4);
        this$0.getBinding().tutorial4.setVisibility(4);
        TranslatorCustomFirebaseEvents translatorCustomFirebaseEvents = this$0.clickEventsFirebase;
        if (translatorCustomFirebaseEvents != null) {
            translatorCustomFirebaseEvents.floatingTutorial();
        }
    }

    private final void slideOutAndIn(View viewToSlideOut, final View viewToSlideIn, final long duration) {
        slideOut(viewToSlideOut, duration, new Function0<Unit>() { // from class: dev.cct.translatorapp.ui.WidgetActivity$slideOutAndIn$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                WidgetActivity.this.slideIn(viewToSlideIn, duration);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void slideOut$default(WidgetActivity widgetActivity, View view, long j, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            function0 = null;
        }
        widgetActivity.slideOut(view, j, function0);
    }

    private final void slideOut(final View view, long duration, final Function0<Unit> onAnimationEnd) {
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, -view.getWidth(), 0.0f, 0.0f);
        translateAnimation.setDuration(duration);
        translateAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        translateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: dev.cct.translatorapp.ui.WidgetActivity$slideOut$1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                view.setVisibility(4);
                Function0<Unit> function0 = onAnimationEnd;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        });
        view.startAnimation(translateAnimation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void slideIn(View view, long duration) {
        view.setVisibility(0);
        TranslateAnimation translateAnimation = new TranslateAnimation(view.getWidth(), 0.0f, 0.0f, 0.0f);
        translateAnimation.setDuration(duration);
        translateAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        view.startAnimation(translateAnimation);
    }

    private final void checkTutorials() {
        WidgetActivity widgetActivity = this;
        if (new Preferences(widgetActivity).isOpenTutorial()) {
            new Preferences(widgetActivity).setOpenTutorial(false);
            getBinding().tutorialsLayout.setVisibility(0);
        } else {
            getBinding().tutorialsLayout.setVisibility(4);
        }
    }

    private final boolean isServiceRunning(Class<?> serviceClass) {
        Object systemService = getSystemService("activity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        Iterator<ActivityManager.RunningServiceInfo> it = ((ActivityManager) systemService).getRunningServices(Integer.MAX_VALUE).iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(serviceClass.getName(), it.next().service.getClassName())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @Deprecated(message = "Deprecated in Java")
    public void onBackPressed() {
        if (Intrinsics.areEqual(getIntent().getStringExtra(LinkHeader.Parameters.Type), "fromHome")) {
            finish();
        } else {
            finish();
        }
        overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
    }

    private final void initListeners() {
        ActivityWidgetBinding binding = getBinding();
        getBinding().backBtn.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.WidgetActivity$$ExternalSyntheticLambda7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WidgetActivity.initListeners$lambda$18$lambda$13(WidgetActivity.this, view);
            }
        });
        binding.offStateWidget.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.WidgetActivity$$ExternalSyntheticLambda8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WidgetActivity.initListeners$lambda$18$lambda$15(WidgetActivity.this, view);
            }
        });
        binding.onStateWidget.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.WidgetActivity$$ExternalSyntheticLambda9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WidgetActivity.initListeners$lambda$18$lambda$17(WidgetActivity.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$18$lambda$13(WidgetActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
        this$0.overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$18$lambda$15(final WidgetActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        TranslatorCustomFirebaseEvents translatorCustomFirebaseEvents = this$0.clickEventsFirebase;
        if (translatorCustomFirebaseEvents != null) {
            translatorCustomFirebaseEvents.offServices();
        }
        if (Settings.canDrawOverlays(this$0)) {
            this$0.showLoadingDialog();
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: dev.cct.translatorapp.ui.WidgetActivity$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    WidgetActivity.initListeners$lambda$18$lambda$15$lambda$14(WidgetActivity.this);
                }
            }, 500L);
        } else {
            this$0.showDialog();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$18$lambda$15$lambda$14(WidgetActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.stopService(new Intent(this$0, (Class<?>) TranslatorServices.class));
        this$0.sendBroadcast(new Intent("HIDE_FLOATING_BUTTON_ACTION"));
        this$0.getBinding().onStateWidget.setVisibility(0);
        this$0.getBinding().offStateWidget.setVisibility(4);
        AlertDialog alertDialog = this$0.loadingDialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$18$lambda$17(WidgetActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        TranslatorCustomFirebaseEvents translatorCustomFirebaseEvents = this$0.clickEventsFirebase;
        if (translatorCustomFirebaseEvents != null) {
            translatorCustomFirebaseEvents.onServices();
        }
        WidgetActivity widgetActivity = this$0;
        if (!new Preferences(widgetActivity).getCheckBillingStatus()) {
            if (Settings.canDrawOverlays(widgetActivity)) {
                Preferences preferences = this$0.pref;
                if (preferences == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pref");
                    preferences = null;
                }
                if (!preferences.isShowRewardedAd()) {
                    preferences.setShowRewardedAd(true);
                    this$0.showPurchaseStatusDialog();
                    return;
                } else {
                    this$0.startService(new Intent(widgetActivity, (Class<?>) TranslatorServices.class));
                    this$0.getBinding().onStateWidget.setVisibility(4);
                    this$0.getBinding().offStateWidget.setVisibility(0);
                    return;
                }
            }
            this$0.showDialog();
            return;
        }
        this$0.checkOverlayPermission();
    }

    private final void showPurchaseStatusDialog() {
        WidgetPerformDialogBinding inflate = WidgetPerformDialogBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        WidgetActivity widgetActivity = this;
        final Dialog dialog = new Dialog(widgetActivity);
        dialog.setContentView(inflate.getRoot());
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(android.R.color.transparent);
        }
        dialog.setCanceledOnTouchOutside(true);
        dialog.setCancelable(true);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        Window window2 = dialog.getWindow();
        layoutParams.copyFrom(window2 != null ? window2.getAttributes() : null);
        layoutParams.width = -1;
        layoutParams.height = -2;
        layoutParams.gravity = 17;
        Window window3 = dialog.getWindow();
        if (window3 != null) {
            window3.setAttributes(layoutParams);
        }
        inflate.getRoot().startAnimation(AnimationUtils.loadAnimation(widgetActivity, R.anim.opening_anim));
        dialog.show();
        inflate.watchVideoAdBtn.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.WidgetActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WidgetActivity.showPurchaseStatusDialog$lambda$19(WidgetActivity.this, dialog, view);
            }
        });
        inflate.GoToPremiumBtn.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.WidgetActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WidgetActivity.showPurchaseStatusDialog$lambda$20(dialog, this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showPurchaseStatusDialog$lambda$19(WidgetActivity this$0, Dialog statusDialog, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(statusDialog, "$statusDialog");
        this$0.showRewardedAd();
        statusDialog.cancel();
        TranslatorCustomFirebaseEvents translatorCustomFirebaseEvents = this$0.clickEventsFirebase;
        if (translatorCustomFirebaseEvents != null) {
            translatorCustomFirebaseEvents.rewardedAdFloating();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showPurchaseStatusDialog$lambda$20(Dialog statusDialog, WidgetActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(statusDialog, "$statusDialog");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        statusDialog.cancel();
        WidgetActivity widgetActivity = this$0;
        ExtensionFunction.INSTANCE.openActivity(widgetActivity, PremiumActivity.class);
        new Preferences(widgetActivity).setWatchVideo(false);
        TranslatorCustomFirebaseEvents translatorCustomFirebaseEvents = this$0.clickEventsFirebase;
        if (translatorCustomFirebaseEvents != null) {
            translatorCustomFirebaseEvents.floatingPro();
        }
    }

    private final void showRewardedAd() {
        WidgetActivity widgetActivity = this;
        if (!AdsExtensionKt.isNetworkAvailable(widgetActivity)) {
            Toast.makeText(widgetActivity, "Check your network connection", 0).show();
        } else {
            WidgetActivity widgetActivity2 = this;
            AdsExtensionKt.preLoadRewardedVideos(widgetActivity2, widgetActivity2, true, new Function1<Boolean, Unit>() { // from class: dev.cct.translatorapp.ui.WidgetActivity$showRewardedAd$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(boolean z) {
                    Preferences preferences;
                    if (!z) {
                        preferences = WidgetActivity.this.pref;
                        if (preferences == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("pref");
                            preferences = null;
                        }
                        preferences.setShowRewardedAd(false);
                        Toast.makeText(WidgetActivity.this, "Currently Reward is not Available. Try again", 0).show();
                        return;
                    }
                    WidgetActivity widgetActivity3 = WidgetActivity.this;
                    final WidgetActivity widgetActivity4 = WidgetActivity.this;
                    Function0<Unit> function0 = new Function0<Unit>() { // from class: dev.cct.translatorapp.ui.WidgetActivity$showRewardedAd$1.1
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            ConstantParam.INSTANCE.setAppOpenShowed(true);
                            WidgetActivity widgetActivity5 = WidgetActivity.this;
                            widgetActivity5.showFloatingIntersAd(widgetActivity5);
                            WidgetActivity.this.startService(new Intent(WidgetActivity.this, (Class<?>) TranslatorServices.class));
                            WidgetActivity.this.getBinding().onStateWidget.setVisibility(4);
                            WidgetActivity.this.getBinding().offStateWidget.setVisibility(0);
                            Toast.makeText(WidgetActivity.this, "Enjoy 24 hour floating Translation", 0).show();
                        }
                    };
                    final WidgetActivity widgetActivity5 = WidgetActivity.this;
                    AdsExtensionKt.showRewarded(widgetActivity3, false, 8000L, false, false, function0, new Function0<Unit>() { // from class: dev.cct.translatorapp.ui.WidgetActivity$showRewardedAd$1.2
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            Preferences preferences2;
                            preferences2 = WidgetActivity.this.pref;
                            if (preferences2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("pref");
                                preferences2 = null;
                            }
                            preferences2.setShowRewardedAd(false);
                            Toast.makeText(WidgetActivity.this, "Currently Reward is not Available. Try again", 0).show();
                            WidgetActivity widgetActivity6 = WidgetActivity.this;
                            widgetActivity6.showFloatingIntersAd(widgetActivity6);
                            WidgetActivity.this.getBinding().onStateWidget.setVisibility(4);
                            WidgetActivity.this.getBinding().offStateWidget.setVisibility(0);
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showDialog() {
        PermissionDialogBinding inflate = PermissionDialogBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(inflate.getRoot());
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(android.R.color.transparent);
        }
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        Window window2 = dialog.getWindow();
        layoutParams.copyFrom(window2 != null ? window2.getAttributes() : null);
        layoutParams.width = -1;
        layoutParams.height = -2;
        layoutParams.gravity = 17;
        Window window3 = dialog.getWindow();
        if (window3 != null) {
            window3.setAttributes(layoutParams);
        }
        dialog.show();
        inflate.cancelBtn.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.WidgetActivity$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WidgetActivity.showDialog$lambda$21(dialog, view);
            }
        });
        inflate.acceptBtn.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.WidgetActivity$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WidgetActivity.showDialog$lambda$22(WidgetActivity.this, dialog, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDialog$lambda$21(Dialog permissionDialog, View view) {
        Intrinsics.checkNotNullParameter(permissionDialog, "$permissionDialog");
        permissionDialog.cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDialog$lambda$22(WidgetActivity this$0, Dialog permissionDialog, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(permissionDialog, "$permissionDialog");
        new Preferences(this$0).setWatchVideo(true);
        this$0.checkOverlayPermission();
        permissionDialog.cancel();
        AlertDialog alertDialog = this$0.loadingDialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    private final void loadUmpSdk() {
        GoogleMobileAdsConsentManager googleMobileAdsConsentManager = this.googleMobileAdsConsentManager;
        if (googleMobileAdsConsentManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("googleMobileAdsConsentManager");
            googleMobileAdsConsentManager = null;
        }
        googleMobileAdsConsentManager.gatherConsent(this, new GoogleMobileAdsConsentManager.OnConsentGatheringCompleteListener() { // from class: dev.cct.translatorapp.ui.WidgetActivity$$ExternalSyntheticLambda5
            @Override // dev.cct.translatorapp.UmpSdk.GoogleMobileAdsConsentManager.OnConsentGatheringCompleteListener
            public final void consentGatheringComplete(FormError formError) {
                WidgetActivity.loadUmpSdk$lambda$23(formError);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkOverlayPermission() {
        if (!Settings.canDrawOverlays(this)) {
            Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
            intent.setData(Uri.fromParts("package", getPackageName(), null));
            this.overlayPermissionLauncher.launch(intent);
            return;
        }
        WidgetActivity widgetActivity = this;
        Toast.makeText(widgetActivity, "start services", 0).show();
        if (Settings.canDrawOverlays(widgetActivity)) {
            showToast("Overlay permission granted.");
            startService(new Intent(widgetActivity, (Class<?>) TranslatorServices.class));
            getBinding().onStateWidget.setVisibility(4);
            getBinding().offStateWidget.setVisibility(0);
            return;
        }
        showToast("Overlay permission denied.");
    }

    private final void showToast(String message) {
        Toast.makeText(this, message, 0).show();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStop() {
        super.onStop();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        if (isServiceRunning(TranslatorServices.class)) {
            getBinding().onStateWidget.setVisibility(4);
            getBinding().offStateWidget.setVisibility(0);
        } else {
            getBinding().onStateWidget.setVisibility(0);
            getBinding().offStateWidget.setVisibility(4);
        }
    }

    @Override // dev.cct.translatorapp.interfaces.OnClickCloseItems
    public void onCloseButtonClicked(boolean isVisible) {
        if (isVisible) {
            getBinding().onStateWidget.setVisibility(0);
            getBinding().offStateWidget.setVisibility(4);
        } else {
            getBinding().onStateWidget.setVisibility(4);
            getBinding().offStateWidget.setVisibility(0);
        }
    }

    private final void showIntersAd() {
        WidgetActivity widgetActivity = this;
        if (new Preferences(widgetActivity).getCheckBillingStatus() || !ExtensionFunction.INSTANCE.checkInternetConnection(widgetActivity)) {
            return;
        }
        showFloatingIntersAd(this);
    }

    private final void showLoadingDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(R.layout.load_dialog);
        AlertDialog create = builder.create();
        this.loadingDialog = create;
        Window window = create != null ? create.getWindow() : null;
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        AlertDialog alertDialog = this.loadingDialog;
        if (alertDialog != null) {
            alertDialog.show();
        }
        AlertDialog alertDialog2 = this.loadingDialog;
        if (alertDialog2 != null) {
            alertDialog2.setCancelable(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateViews(boolean isServiceRunning) {
        if (isServiceRunning) {
            getBinding().onStateWidget.setVisibility(4);
            getBinding().offStateWidget.setVisibility(0);
        } else {
            getBinding().onStateWidget.setVisibility(0);
            getBinding().offStateWidget.setVisibility(4);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.serviceStateReceiver);
    }

    public final void loadRewardIntersAds(int adUnitIdL) {
        AdRequest build = new AdRequest.Builder().build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder().build()");
        RewardedInterstitialAd.load(this, getString(adUnitIdL), build, new RewardedInterstitialAdLoadCallback() { // from class: dev.cct.translatorapp.ui.WidgetActivity$loadRewardIntersAds$1
            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdFailedToLoad(LoadAdError p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                WidgetActivity.this.rewardInterstitialAds = null;
                Log.e("tag", "onAdFailedToLoad: ");
            }

            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdLoaded(RewardedInterstitialAd mRewardedInterstitialAd) {
                Intrinsics.checkNotNullParameter(mRewardedInterstitialAd, "mRewardedInterstitialAd");
                WidgetActivity.this.rewardInterstitialAds = mRewardedInterstitialAd;
                Log.e("TAG", "onAdLoaded: ");
            }
        });
    }

    private final void showRewardedIntersAds(final int adUnitIdL, final Function1<? super RewardItem, Unit> afterCodeRewardCoin) {
        RewardedInterstitialAd rewardedInterstitialAd = this.rewardInterstitialAds;
        if (rewardedInterstitialAd != null) {
            Intrinsics.checkNotNull(rewardedInterstitialAd);
            rewardedInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() { // from class: dev.cct.translatorapp.ui.WidgetActivity$showRewardedIntersAds$1
                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdDismissedFullScreenContent() {
                    WidgetActivity.this.rewardInterstitialAds = null;
                    new Preferences(WidgetActivity.this).setWatchVideo(true);
                    if (Settings.canDrawOverlays(WidgetActivity.this)) {
                        WidgetActivity.this.checkOverlayPermission();
                    } else {
                        WidgetActivity.this.showDialog();
                    }
                    WidgetActivity.this.loadRewardIntersAds(adUnitIdL);
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdFailedToShowFullScreenContent(AdError p0) {
                    Intrinsics.checkNotNullParameter(p0, "p0");
                    WidgetActivity.this.rewardInterstitialAds = null;
                }
            });
            RewardedInterstitialAd rewardedInterstitialAd2 = this.rewardInterstitialAds;
            Intrinsics.checkNotNull(rewardedInterstitialAd2);
            rewardedInterstitialAd2.show(this, new OnUserEarnedRewardListener() { // from class: dev.cct.translatorapp.ui.WidgetActivity$$ExternalSyntheticLambda6
                @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
                public final void onUserEarnedReward(RewardItem rewardItem) {
                    WidgetActivity.showRewardedIntersAds$lambda$24(Function1.this, rewardItem);
                }
            });
            return;
        }
        Toast.makeText(this, "Ads is not loaded try again", 1).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showRewardedIntersAds$lambda$24(Function1 afterCodeRewardCoin, RewardItem it) {
        Intrinsics.checkNotNullParameter(afterCodeRewardCoin, "$afterCodeRewardCoin");
        Intrinsics.checkNotNullParameter(it, "it");
        afterCodeRewardCoin.invoke(it);
    }

    private final void loadFloatingIntersAd(Context mContext, String id) {
        if (new Preferences(mContext).getCheckBillingStatus()) {
            return;
        }
        InterstitialAd.load(mContext, id, new AdRequest.Builder().build(), new InterstitialAdLoadCallback() { // from class: dev.cct.translatorapp.ui.WidgetActivity$loadFloatingIntersAd$1$1
            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdFailedToLoad(LoadAdError ad) {
                Intrinsics.checkNotNullParameter(ad, "ad");
                Log.e("intersAdSplash", "onAdFailedToLoad: ");
                AppOpenAd.INSTANCE.setIntersAdShow(false);
            }

            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdLoaded(InterstitialAd ad) {
                Intrinsics.checkNotNullParameter(ad, "ad");
                Log.e("intersAdSplash", "onAdLoaded: ");
                WidgetActivity.this.setAdInstance(ad);
                InterstitialAd adInstance = WidgetActivity.this.getAdInstance();
                if (adInstance == null) {
                    return;
                }
                final WidgetActivity widgetActivity = WidgetActivity.this;
                adInstance.setFullScreenContentCallback(new FullScreenContentCallback() { // from class: dev.cct.translatorapp.ui.WidgetActivity$loadFloatingIntersAd$1$1$onAdLoaded$1
                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdDismissedFullScreenContent() {
                        WidgetActivity.this.setAdInstance(null);
                        AppOpenAd.INSTANCE.setIntersAdShow(false);
                        WidgetActivity.this.startService(new Intent(WidgetActivity.this, (Class<?>) TranslatorServices.class));
                        Toast.makeText(WidgetActivity.this, "Your services start for remaining Time", 0).show();
                    }

                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdFailedToShowFullScreenContent(AdError p0) {
                        Intrinsics.checkNotNullParameter(p0, "p0");
                        WidgetActivity.this.setAdInstance(null);
                        AppOpenAd.INSTANCE.setIntersAdShow(false);
                    }

                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdShowedFullScreenContent() {
                        super.onAdShowedFullScreenContent();
                    }
                });
            }
        });
    }

    private final String getCurrentDate() {
        String format = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
        Intrinsics.checkNotNullExpressionValue(format, "dateFormat.format(calendar.time)");
        return format;
    }

    private final void saveLastShownDate(Context context, String date) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(this.prefTrans, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…ns, Context.MODE_PRIVATE)");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        Intrinsics.checkNotNullExpressionValue(edit, "sharedPrefs.edit()");
        edit.putString(this.lastDateInters, date);
        edit.apply();
    }

    private final String getLastShownDate(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(this.prefTrans, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…ns, Context.MODE_PRIVATE)");
        return sharedPreferences.getString(this.lastDateInters, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showFloatingIntersAd(Activity activityContext) {
        if (this.adInstance != null) {
            AppOpenAd.INSTANCE.setIntersAdShow(true);
            InterstitialAd interstitialAd = this.adInstance;
            if (interstitialAd != null) {
                interstitialAd.show(activityContext);
            }
        }
    }
}
