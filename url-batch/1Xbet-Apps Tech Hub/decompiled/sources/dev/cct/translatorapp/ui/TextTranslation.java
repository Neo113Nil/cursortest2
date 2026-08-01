package dev.cct.translatorapp.ui;

import android.app.AlertDialog;
import android.app.Application;
import android.app.UiModeManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.speech.tts.TextToSpeech;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.CycleInterpolator;
import android.view.animation.TranslateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.translator.alllanguagetranslations.ath.R;
import dev.cct.translatorapp.LanguageListModel;
import dev.cct.translatorapp.MainApplication;
import dev.cct.translatorapp.TranslatorAdmobAds.AdsExtensionKt;
import dev.cct.translatorapp.ads.ConstantParam;
import dev.cct.translatorapp.dataModel.HistoryModel;
import dev.cct.translatorapp.databinding.ActivityTextTranslationBinding;
import dev.cct.translatorapp.databinding.NetworkBottomDialogBinding;
import dev.cct.translatorapp.util.ExtensionFunction;
import dev.cct.translatorapp.util.ExtensionFunctionKt;
import dev.cct.translatorapp.util.HitTranslationApi;
import dev.cct.translatorapp.util.Preferences;
import dev.cct.translatorapp.viewModel.HistoryViewModel;
import io.ktor.http.LinkHeader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import org.jacoco.core.runtime.AgentOptions;

/* compiled from: TextTranslation.kt */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u00106\u001a\u0002072\u0006\u00108\u001a\u000209H\u0014J\b\u0010:\u001a\u000207H\u0002J\b\u0010;\u001a\u000207H\u0002J\b\u0010<\u001a\u000207H\u0002J\b\u0010=\u001a\u000207H\u0002J\b\u0010>\u001a\u000207H\u0002J\b\u0010?\u001a\u000207H\u0003J\u0010\u0010@\u001a\u0002072\u0006\u0010A\u001a\u00020\u0013H\u0002J\b\u0010B\u001a\u000207H\u0002J\b\u0010C\u001a\u00020\u0007H\u0002J\u0012\u0010D\u001a\u0004\u0018\u00010\u00072\u0006\u0010E\u001a\u000209H\u0002J\b\u0010F\u001a\u000207H\u0002J\b\u0010G\u001a\u000207H\u0002J\b\u0010H\u001a\u00020\u001aH\u0002J\u0018\u0010I\u001a\u0002092\u0006\u0010E\u001a\u0002092\u0006\u0010J\u001a\u00020KH\u0002J\b\u0010L\u001a\u000207H\u0002J\u0010\u0010M\u001a\u0002072\u0006\u0010N\u001a\u00020OH\u0002J\b\u0010P\u001a\u000207H\u0002J\u0010\u0010Q\u001a\u0002072\u0006\u0010R\u001a\u00020\u0007H\u0002J\b\u0010S\u001a\u000207H\u0002J\b\u0010T\u001a\u000207H\u0002J\u0010\u0010U\u001a\u0002072\u0006\u0010V\u001a\u00020WH\u0016J\u0012\u0010X\u001a\u0002072\b\u0010Y\u001a\u0004\u0018\u00010ZH\u0014J\b\u0010[\u001a\u000207H\u0014J\u0010\u0010\\\u001a\u0002072\u0006\u0010]\u001a\u00020\u0005H\u0016J\b\u0010^\u001a\u000207H\u0014J-\u0010_\u001a\u0002072\u0006\u0010`\u001a\u00020\u00052\u000e\u0010a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070b2\u0006\u0010c\u001a\u00020dH\u0016¢\u0006\u0002\u0010eJ\b\u0010f\u001a\u000207H\u0014J\b\u0010g\u001a\u000207H\u0014J\b\u0010h\u001a\u000207H\u0002J\u0018\u0010i\u001a\u0002072\u0006\u0010E\u001a\u0002092\u0006\u0010j\u001a\u00020\u0007H\u0002J\u0010\u0010k\u001a\u0002072\u0006\u0010A\u001a\u00020lH\u0002J\b\u0010m\u001a\u000207H\u0002J\b\u0010n\u001a\u000207H\u0002J\b\u0010o\u001a\u000207H\u0002J\b\u0010p\u001a\u000207H\u0002J\b\u0010q\u001a\u000207H\u0002J\b\u0010r\u001a\u000207H\u0002J\b\u0010s\u001a\u000207H\u0002J\b\u0010t\u001a\u000207H\u0002J \u0010u\u001a\u0002072\u0006\u0010v\u001a\u00020\u00072\u0006\u0010w\u001a\u00020\u00072\u0006\u0010x\u001a\u00020\u0007H\u0002J\b\u0010y\u001a\u000207H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010!\u001a\u00020\"X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u000e\u0010'\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082.¢\u0006\u0002\n\u0000R\u001c\u0010*\u001a\u0010\u0012\f\u0012\n -*\u0004\u0018\u00010,0,0+X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u0082.¢\u0006\u0002\n\u0000R\u001c\u00100\u001a\u0004\u0018\u000101X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105¨\u0006z"}, d2 = {"Ldev/cct/translatorapp/ui/TextTranslation;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/speech/tts/TextToSpeech$OnInitListener;", "()V", "MICROPHONE_PERMISSION_REQUEST_CODE", "", "TAG", "", "getTAG", "()Ljava/lang/String;", "beforeChangeLength", "binding", "Ldev/cct/translatorapp/databinding/ActivityTextTranslationBinding;", "getBinding", "()Ldev/cct/translatorapp/databinding/ActivityTextTranslationBinding;", "binding$delegate", "Lkotlin/Lazy;", "countAd", "currentFocus", "Landroid/view/View;", "historyViewModel", "Ldev/cct/translatorapp/viewModel/HistoryViewModel;", "getHistoryViewModel", "()Ldev/cct/translatorapp/viewModel/HistoryViewModel;", "historyViewModel$delegate", "isKeyboardShow", "", "ispaste", "lastDateInters", "loadingAdDialog", "Landroidx/appcompat/app/AlertDialog;", "loadingDialog", "Landroid/app/AlertDialog;", "pref", "Ldev/cct/translatorapp/util/Preferences;", "getPref", "()Ldev/cct/translatorapp/util/Preferences;", "setPref", "(Ldev/cct/translatorapp/util/Preferences;)V", "prefTrans", "remoteConfig", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "speakLunchResult", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "translationFactory", "Ldev/cct/translatorapp/util/HitTranslationApi;", "tts", "Landroid/speech/tts/TextToSpeech;", "getTts", "()Landroid/speech/tts/TextToSpeech;", "setTts", "(Landroid/speech/tts/TextToSpeech;)V", "attachBaseContext", "", "newBase", "Landroid/content/Context;", "checkClipboard", "checkClipboardData", "checkClipboardData12", "checkPurchaseStatus", "clearData", "clickListener", "fadeInView", "view", "floatingView", "getCurrentDate", "getLastShownDate", "context", "hideKeyboard", "initialization", "isMicrophonePermissionGranted", "languageChange", "locale", "Ljava/util/Locale;", "loadCopyData", "loadFavData", "historyModel", "Ldev/cct/translatorapp/dataModel/HistoryModel;", "loadInterstitialAd", "loadTranslateData", "speakText", "loadingBackData", "onBackPressedTrans", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onInit", NotificationCompat.CATEGORY_STATUS, "onPause", "onRequestPermissionsResult", "requestCode", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onStart", "requestMicrophonePermission", "saveLastShownDate", "date", "shakeTextAnimation", "Landroid/widget/TextView;", "showBannerAd", "showBottomSheetNetwork", "showDatabaseData", "showInterstitials", "showKeyboard", "showKeyboard1", "showLoadingDialog", "speechInput", "translate", "inputText", "outputCode", "inputCode", "updateDarkMode", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TextTranslation extends AppCompatActivity implements TextToSpeech.OnInitListener {
    private int beforeChangeLength;
    private View currentFocus;

    /* renamed from: historyViewModel$delegate, reason: from kotlin metadata */
    private final Lazy historyViewModel;
    private boolean isKeyboardShow;
    private boolean ispaste;
    private AlertDialog loadingAdDialog;
    private android.app.AlertDialog loadingDialog;
    public Preferences pref;
    private FirebaseRemoteConfig remoteConfig;
    private ActivityResultLauncher<Intent> speakLunchResult;
    private HitTranslationApi translationFactory;
    private TextToSpeech tts;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Lazy binding = LazyKt.lazy(new Function0<ActivityTextTranslationBinding>() { // from class: dev.cct.translatorapp.ui.TextTranslation$binding$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ActivityTextTranslationBinding invoke() {
            return ActivityTextTranslationBinding.inflate(TextTranslation.this.getLayoutInflater());
        }
    });
    private final String TAG = "TranslateInputActivityLogs";
    private final int MICROPHONE_PERMISSION_REQUEST_CODE = 1;
    private int countAd = 1;
    private final String prefTrans = "TranslatorPrefs";
    private final String lastDateInters = "lastShownDateInterstitial";

    private final void checkClipboardData() {
    }

    @Override // android.speech.tts.TextToSpeech.OnInitListener
    public void onInit(int status) {
    }

    public TextTranslation() {
        final TextTranslation textTranslation = this;
        final Function0 function0 = null;
        this.historyViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(HistoryViewModel.class), new Function0<ViewModelStore>() { // from class: dev.cct.translatorapp.ui.TextTranslation$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = ComponentActivity.this.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: dev.cct.translatorapp.ui.TextTranslation$historyViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                Application application = TextTranslation.this.getApplication();
                Intrinsics.checkNotNull(application, "null cannot be cast to non-null type dev.cct.translatorapp.MainApplication");
                return new HistoryViewModel.HistoryViewModelFactory(((MainApplication) application).getRepository());
            }
        }, new Function0<CreationExtras>() { // from class: dev.cct.translatorapp.ui.TextTranslation$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = Function0.this;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = textTranslation.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        });
        ActivityResultLauncher<Intent> registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: dev.cct.translatorapp.ui.TextTranslation$$ExternalSyntheticLambda21
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                TextTranslation.speakLunchResult$lambda$26(TextTranslation.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResul…\n            }\n\n        }");
        this.speakLunchResult = registerForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ActivityTextTranslationBinding getBinding() {
        return (ActivityTextTranslationBinding) this.binding.getValue();
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

    public final TextToSpeech getTts() {
        return this.tts;
    }

    public final void setTts(TextToSpeech textToSpeech) {
        this.tts = textToSpeech;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HistoryViewModel getHistoryViewModel() {
        return (HistoryViewModel) this.historyViewModel.getValue();
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
        setContentView(getBinding().getRoot());
        initialization();
        clickListener();
        floatingView();
        showDatabaseData();
        loadCopyData();
        onBackPressedTrans();
        checkPurchaseStatus();
    }

    private final void checkPurchaseStatus() {
        if (!new Preferences(this).getCheckBillingStatus()) {
            getBinding().bannerContainer.setVisibility(0);
            showBannerAd();
            loadInterstitialAd();
            return;
        }
        getBinding().bannerContainer.setVisibility(8);
    }

    private final void showBannerAd() {
        if (ConstantParam.INSTANCE.getFbBannerEnableOrNot()) {
            Log.d("languageNativeAd", "checkNativeLoadAdStatus: admob");
            getBinding().fbBannerContainer.setVisibility(8);
            getBinding().admobBannerContainer.setVisibility(0);
            String textCollapsibleInterstitialsAdId = ConstantParam.INSTANCE.getTextCollapsibleInterstitialsAdId();
            FrameLayout frameLayout = getBinding().smallBannerLayout.bannerAdLayout;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.smallBannerLayout.bannerAdLayout");
            ShimmerFrameLayout shimmerFrameLayout = getBinding().smallBannerLayout.shimmerViewContainer;
            Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "binding.smallBannerLayout.shimmerViewContainer");
            ConstantParam.INSTANCE.getBannerCollapsibleAd().loadBanner(this, textCollapsibleInterstitialsAdId, frameLayout, shimmerFrameLayout);
            return;
        }
        Log.d("languageNativeAd", "checkNativeLoadAdStatus: fb ");
        getBinding().fbBannerContainer.setVisibility(0);
        getBinding().admobBannerContainer.setVisibility(8);
        LinearLayout linearLayout = getBinding().smallFbBannerLayout.bannerAdLayout;
        ShimmerFrameLayout shimmerFrameLayout2 = getBinding().smallFbBannerLayout.shimmerViewContainer;
        Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout2, "binding.smallFbBannerLayout.shimmerViewContainer");
        ConstantParam.INSTANCE.getFbBannerAd().loadFbBannerAd(this, linearLayout, shimmerFrameLayout2);
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

    private final void loadInterstitialAd() {
        if (ConstantParam.INSTANCE.getFbInterstitialEnableOrNot()) {
            AdsExtensionKt.loadPreInterstitial(this, ConstantParam.INSTANCE.getTextInterstitialsAdmobId());
        } else {
            AdsExtensionKt.loadFbInterstitial(this, ConstantParam.INSTANCE.getFbInterstitialAdId());
        }
    }

    private final void checkClipboardData12() {
        ExtensionFunction.INSTANCE.hasTextCopied(this, new Function1<Boolean, Unit>() { // from class: dev.cct.translatorapp.ui.TextTranslation$checkClipboardData12$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                ActivityTextTranslationBinding binding;
                ActivityTextTranslationBinding binding2;
                if (z) {
                    binding2 = TextTranslation.this.getBinding();
                    binding2.pasteIcon.setVisibility(0);
                } else {
                    binding = TextTranslation.this.getBinding();
                    binding.pasteIcon.setVisibility(4);
                }
            }
        });
    }

    private final void checkClipboard() {
        ExtensionFunction.INSTANCE.hasTextCopied(this, new Function1<Boolean, Unit>() { // from class: dev.cct.translatorapp.ui.TextTranslation$checkClipboard$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                ActivityTextTranslationBinding binding;
                ActivityTextTranslationBinding binding2;
                if (z) {
                    binding2 = TextTranslation.this.getBinding();
                    binding2.pasteIcon.setVisibility(0);
                } else {
                    binding = TextTranslation.this.getBinding();
                    binding.pasteIcon.setVisibility(4);
                }
            }
        });
    }

    private final void showDatabaseData() {
        HistoryModel historyModel;
        if (Build.VERSION.SDK_INT >= 33) {
            historyModel = (HistoryModel) getIntent().getParcelableExtra("translation", HistoryModel.class);
        } else {
            historyModel = (HistoryModel) getIntent().getParcelableExtra("translation");
        }
        if (historyModel != null) {
            Log.d(this.TAG, "showDatabaseData: " + historyModel);
            loadFavData(historyModel);
        }
    }

    private final void loadFavData(HistoryModel historyModel) {
        getBinding().editText.setText(historyModel.getInput());
        getBinding().pasteIcon.setVisibility(4);
        int i = 0;
        getBinding().clearIconBtn.setVisibility(0);
        getBinding().outputText.setText(historyModel.getOutput());
        getBinding().favInput.setImageResource(R.drawable.star2);
        getBinding().micIcon.setVisibility(4);
        getBinding().translateBtn.setVisibility(4);
        getBinding().extFloatingActionButton.setVisibility(0);
        getBinding().viewColorLine.setVisibility(0);
        getBinding().outputText.setVisibility(0);
        getBinding().linearIconLayout.setVisibility(0);
        getBinding().linearIconLayoutInput.setVisibility(0);
        String str = new String();
        String str2 = new String();
        for (Object obj : ExtensionFunctionKt.getTranslateLangList()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            LanguageListModel languageListModel = (LanguageListModel) obj;
            if (Intrinsics.areEqual(languageListModel.getLangCode(), historyModel.getILangC())) {
                str = getString(languageListModel.getLangName());
                Intrinsics.checkNotNullExpressionValue(str, "this.getString(i.langName)");
                getPref().setTranslateInput(i);
            }
            if (Intrinsics.areEqual(languageListModel.getLangCode(), historyModel.getOLangC())) {
                str2 = getString(languageListModel.getLangName());
                Intrinsics.checkNotNullExpressionValue(str2, "this.getString(i.langName)");
                getPref().setTranslateOutput(i);
            }
            i = i2;
        }
        getBinding().inputLangTv.setText(str);
        getBinding().outputLangTv.setText(str2);
    }

    private final void loadCopyData() {
        String stringExtra = getIntent().getStringExtra("copy");
        Log.d(this.TAG, "loadCopyData: " + stringExtra);
        if (stringExtra != null) {
            getBinding().translateBtn.setVisibility(4);
            getBinding().clearIconBtn.setVisibility(0);
            getBinding().pasteIcon.setVisibility(4);
            getBinding().editText.setText(StringsKt.trim((CharSequence) stringExtra.toString()).toString());
            TextTranslation textTranslation = this;
            if (ExtensionFunction.INSTANCE.checkInternetConnection(textTranslation)) {
                if (getBinding().outputLangTv.getText().equals("Choose\nlang")) {
                    Toast.makeText(textTranslation, "select output language", 0).show();
                } else {
                    translate(StringsKt.trim((CharSequence) stringExtra.toString()).toString(), ExtensionFunctionKt.getTranslateLangList().get(getPref().getTranslateInput()).getLangCode(), ExtensionFunctionKt.getTranslateLangList().get(getPref().getTranslateOutput()).getLangCode());
                }
            } else {
                Toast.makeText(textTranslation, "No network connection", 0).show();
            }
        }
        if (getIntent().getStringExtra("edit") != null) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: dev.cct.translatorapp.ui.TextTranslation$$ExternalSyntheticLambda18
                @Override // java.lang.Runnable
                public final void run() {
                    TextTranslation.loadCopyData$lambda$2(TextTranslation.this);
                }
            }, 500L);
            getBinding().micIcon.setVisibility(0);
        }
        getBinding().editText.addTextChangedListener(new TextWatcher() { // from class: dev.cct.translatorapp.ui.TextTranslation$loadCopyData$2
            private boolean isTyping;

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                this.isTyping = after > 0;
                TextTranslation.this.beforeChangeLength = s != null ? s.length() : 0;
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                int i;
                boolean z;
                ActivityTextTranslationBinding binding;
                int length = s != null ? s.length() : 0;
                i = TextTranslation.this.beforeChangeLength;
                if (length > i) {
                    z = TextTranslation.this.ispaste;
                    if (!z) {
                        binding = TextTranslation.this.getBinding();
                        binding.translateBtn.setVisibility(0);
                    }
                    TextTranslation.this.ispaste = false;
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
            
                if ((r4.length() > 0) == true) goto L11;
             */
            @Override // android.text.TextWatcher
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void afterTextChanged(Editable s) {
                boolean z;
                ActivityTextTranslationBinding binding;
                ActivityTextTranslationBinding binding2;
                ActivityTextTranslationBinding binding3;
                ActivityTextTranslationBinding binding4;
                ActivityTextTranslationBinding binding5;
                ActivityTextTranslationBinding binding6;
                ActivityTextTranslationBinding binding7;
                ActivityTextTranslationBinding binding8;
                ActivityTextTranslationBinding binding9;
                ActivityTextTranslationBinding binding10;
                ActivityTextTranslationBinding binding11;
                ActivityTextTranslationBinding binding12;
                if (s != null) {
                    z = true;
                }
                z = false;
                if (!z) {
                    binding = TextTranslation.this.getBinding();
                    binding.clearIconBtn.setVisibility(4);
                    binding2 = TextTranslation.this.getBinding();
                    binding2.outputText.setText("");
                    binding3 = TextTranslation.this.getBinding();
                    binding3.pasteIcon.setVisibility(0);
                    binding4 = TextTranslation.this.getBinding();
                    binding4.micIcon.setVisibility(0);
                    binding5 = TextTranslation.this.getBinding();
                    binding5.translateBtn.setVisibility(4);
                    binding6 = TextTranslation.this.getBinding();
                    binding6.linearIconLayoutInput.setVisibility(4);
                    binding7 = TextTranslation.this.getBinding();
                    binding7.linearIconLayout.setVisibility(4);
                    binding8 = TextTranslation.this.getBinding();
                    binding8.viewColorLine.setVisibility(4);
                } else if (this.isTyping) {
                    binding9 = TextTranslation.this.getBinding();
                    binding9.clearIconBtn.setVisibility(0);
                    binding10 = TextTranslation.this.getBinding();
                    binding10.pasteIcon.setVisibility(4);
                    binding11 = TextTranslation.this.getBinding();
                    binding11.micIcon.setVisibility(4);
                    binding12 = TextTranslation.this.getBinding();
                    binding12.linearIconLayoutInput.setVisibility(4);
                }
                this.isTyping = false;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadCopyData$lambda$2(TextTranslation this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.checkClipboardData12();
        this$0.getBinding().editText.setFocusableInTouchMode(true);
        this$0.getBinding().editText.setFocusable(true);
        this$0.getBinding().editText.requestFocus();
        this$0.showKeyboard1();
    }

    private final void hideKeyboard() {
        Object systemService = getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        View view = this.currentFocus;
        if (view == null) {
            view = getWindow().getDecorView();
            Intrinsics.checkNotNullExpressionValue(view, "window.decorView");
        }
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    private final void showKeyboard() {
        getBinding().editText.setFocusable(true);
        Object systemService = getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).showSoftInput(getBinding().editText, 1);
    }

    private final void showKeyboard1() {
        Object systemService = getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        final InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        getBinding().editText.post(new Runnable() { // from class: dev.cct.translatorapp.ui.TextTranslation$$ExternalSyntheticLambda26
            @Override // java.lang.Runnable
            public final void run() {
                TextTranslation.showKeyboard1$lambda$3(TextTranslation.this, inputMethodManager);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showKeyboard1$lambda$3(TextTranslation this$0, InputMethodManager inputMethodManager) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(inputMethodManager, "$inputMethodManager");
        this$0.getBinding().editText.requestFocus();
        inputMethodManager.showSoftInput(this$0.getBinding().editText, 1);
    }

    private final void floatingView() {
        getBinding().extFloatingActionButton.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.TextTranslation$$ExternalSyntheticLambda24
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TextTranslation.floatingView$lambda$4(TextTranslation.this, view);
            }
        });
        getBinding().scrollable.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() { // from class: dev.cct.translatorapp.ui.TextTranslation$$ExternalSyntheticLambda25
            @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
            public final void onScrollChange(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
                TextTranslation.floatingView$lambda$5(TextTranslation.this, nestedScrollView, i, i2, i3, i4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void floatingView$lambda$4(TextTranslation this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showKeyboard1();
        this$0.clearData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void floatingView$lambda$5(TextTranslation this$0, NestedScrollView v, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(v, "v");
        if (i2 > i4 + 12 && this$0.getBinding().extFloatingActionButton.isExtended()) {
            this$0.getBinding().extFloatingActionButton.shrink();
        }
        if (i2 < i4 - 12 && !this$0.getBinding().extFloatingActionButton.isExtended()) {
            this$0.getBinding().extFloatingActionButton.extend();
        }
        if (i2 == 0) {
            this$0.getBinding().extFloatingActionButton.extend();
        }
    }

    private final void initialization() {
        FirebaseRemoteConfig firebaseRemoteConfig = FirebaseRemoteConfig.getInstance();
        Intrinsics.checkNotNullExpressionValue(firebaseRemoteConfig, "getInstance()");
        this.remoteConfig = firebaseRemoteConfig;
        TextTranslation textTranslation = this;
        this.tts = new TextToSpeech(textTranslation, this);
        setPref(new Preferences(textTranslation));
        this.translationFactory = new HitTranslationApi(this);
        String stringExtra = getIntent().getStringExtra("currentInputText");
        Log.d(this.TAG, "initialization: " + stringExtra);
        if (stringExtra != null) {
            getBinding().editText.setText(stringExtra);
            if (Intrinsics.areEqual(stringExtra, "")) {
                checkClipboard();
                getBinding().micIcon.setVisibility(0);
                Toast.makeText(textTranslation, "Enter input Text", 0).show();
            } else {
                getBinding().clearIconBtn.setVisibility(0);
                translate(stringExtra, ExtensionFunctionKt.getTranslateLangList().get(getPref().getTranslateInput()).getLangCode(), ExtensionFunctionKt.getTranslateLangList().get(getPref().getTranslateOutput()).getLangCode());
            }
        }
        LanguageListModel languageListModel = ExtensionFunctionKt.getTranslateLangList().get(getPref().getTranslateInput());
        Intrinsics.checkNotNullExpressionValue(languageListModel, "translateLangList[pref.translateInput]");
        LanguageListModel languageListModel2 = ExtensionFunctionKt.getTranslateLangList().get(getPref().getTranslateOutput());
        Intrinsics.checkNotNullExpressionValue(languageListModel2, "translateLangList[pref.translateOutput]");
        getBinding().inputLangTv.setText(getString(languageListModel.getLangName()));
        getBinding().outputLangTv.setText(getString(languageListModel2.getLangName()));
    }

    private final void shakeTextAnimation(TextView view) {
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 10.0f, 0.0f, 0.0f);
        translateAnimation.setDuration(100L);
        translateAnimation.setInterpolator(new CycleInterpolator(5.0f));
        translateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: dev.cct.translatorapp.ui.TextTranslation$shakeTextAnimation$1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
        view.startAnimation(translateAnimation);
    }

    private final void clickListener() {
        final ActivityTextTranslationBinding binding = getBinding();
        binding.landScapeView.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.TextTranslation$$ExternalSyntheticLambda27
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TextTranslation.clickListener$lambda$24$lambda$6(TextTranslation.this, view);
            }
        });
        binding.swapLangIcon.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.TextTranslation$$ExternalSyntheticLambda8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TextTranslation.clickListener$lambda$24$lambda$7(TextTranslation.this, binding, view);
            }
        });
        binding.favInput.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.TextTranslation$$ExternalSyntheticLambda9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TextTranslation.clickListener$lambda$24$lambda$8(TextTranslation.this, view);
            }
        });
        binding.clearIconBtn.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.TextTranslation$$ExternalSyntheticLambda10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TextTranslation.clickListener$lambda$24$lambda$9(TextTranslation.this, view);
            }
        });
        binding.openSetting.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.TextTranslation$$ExternalSyntheticLambda12
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TextTranslation.clickListener$lambda$24$lambda$10(TextTranslation.this, view);
            }
        });
        binding.premiumIcon.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.TextTranslation$$ExternalSyntheticLambda13
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TextTranslation.clickListener$lambda$24$lambda$11(TextTranslation.this, view);
            }
        });
        binding.inputLanguageLayout.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.TextTranslation$$ExternalSyntheticLambda14
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TextTranslation.clickListener$lambda$24$lambda$12(TextTranslation.this, view);
            }
        });
        binding.outputLanguageLayout.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.TextTranslation$$ExternalSyntheticLambda15
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TextTranslation.clickListener$lambda$24$lambda$13(TextTranslation.this, view);
            }
        });
        binding.speakerInput.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.TextTranslation$$ExternalSyntheticLambda16
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TextTranslation.clickListener$lambda$24$lambda$14(TextTranslation.this, binding, view);
            }
        });
        binding.copy.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.TextTranslation$$ExternalSyntheticLambda17
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TextTranslation.clickListener$lambda$24$lambda$15(TextTranslation.this, view);
            }
        });
        binding.copyInput.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.TextTranslation$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TextTranslation.clickListener$lambda$24$lambda$16(TextTranslation.this, view);
            }
        });
        binding.speaker.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.TextTranslation$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TextTranslation.clickListener$lambda$24$lambda$17(TextTranslation.this, binding, view);
            }
        });
        binding.micIcon.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.TextTranslation$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TextTranslation.clickListener$lambda$24$lambda$18(TextTranslation.this, view);
            }
        });
        binding.pasteIcon.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.TextTranslation$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TextTranslation.clickListener$lambda$24$lambda$20(TextTranslation.this, binding, view);
            }
        });
        binding.copy.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.TextTranslation$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TextTranslation.clickListener$lambda$24$lambda$21(TextTranslation.this, binding, view);
            }
        });
        binding.share.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.TextTranslation$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TextTranslation.clickListener$lambda$24$lambda$22(TextTranslation.this, binding, view);
            }
        });
        binding.translateBtn.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.TextTranslation$$ExternalSyntheticLambda7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TextTranslation.clickListener$lambda$24$lambda$23(TextTranslation.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clickListener$lambda$24$lambda$6(TextTranslation this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) TranslatorResultView.class);
        intent.putExtra("result", this$0.getBinding().outputText.getText().toString());
        this$0.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clickListener$lambda$24$lambda$7(TextTranslation this$0, ActivityTextTranslationBinding this_apply, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        TextToSpeech textToSpeech = this$0.tts;
        if (textToSpeech != null) {
            textToSpeech.stop();
        }
        if (Intrinsics.areEqual(this_apply.outputLangTv.getText().toString(), "Choose\nLanguage")) {
            this_apply.outputLangTv.setTextColor(ContextCompat.getColor(this$0, R.color.redColor));
            TextView outputLangTv = this_apply.outputLangTv;
            Intrinsics.checkNotNullExpressionValue(outputLangTv, "outputLangTv");
            this$0.shakeTextAnimation(outputLangTv);
            return;
        }
        int translateInput = this$0.getPref().getTranslateInput();
        this$0.getPref().setTranslateInput(this$0.getPref().getTranslateOutput());
        this$0.getPref().setTranslateOutput(translateInput);
        this_apply.inputLangTv.setText(this$0.getString(ExtensionFunctionKt.getTranslateLangList().get(this$0.getPref().getTranslateInput()).getLangName()));
        this_apply.outputLangTv.setText(this$0.getString(ExtensionFunctionKt.getTranslateLangList().get(this$0.getPref().getTranslateOutput()).getLangName()));
        Editable text = this_apply.editText.getText();
        this_apply.editText.setText(this_apply.outputText.getText());
        this_apply.outputText.setText(text);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clickListener$lambda$24$lambda$8(TextTranslation this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this$0.getHistoryViewModel()), Dispatchers.getIO(), null, new TextTranslation$clickListener$1$3$1(this$0, null), 2, null);
        this$0.getBinding().favInput.setImageResource(R.drawable.star2);
        Toast.makeText(this$0, "Added to favorite", 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clickListener$lambda$24$lambda$9(TextTranslation this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        TextToSpeech textToSpeech = this$0.tts;
        if (textToSpeech != null) {
            textToSpeech.stop();
        }
        this$0.clearData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clickListener$lambda$24$lambda$10(TextTranslation this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.loadingBackData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clickListener$lambda$24$lambda$11(TextTranslation this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        TextToSpeech textToSpeech = this$0.tts;
        if (textToSpeech != null) {
            textToSpeech.stop();
        }
        TextTranslation textTranslation = this$0;
        if (ExtensionFunction.INSTANCE.checkInternetConnection(textTranslation)) {
            ExtensionFunction.INSTANCE.openActivity(textTranslation, PremiumActivity.class);
            this$0.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        } else {
            this$0.showBottomSheetNetwork();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clickListener$lambda$24$lambda$12(TextTranslation this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        TextToSpeech textToSpeech = this$0.tts;
        if (textToSpeech != null) {
            textToSpeech.stop();
        }
        Intent intent = new Intent(this$0, (Class<?>) LangSelectionActivity.class);
        intent.putExtra(LinkHeader.Parameters.Type, "input");
        intent.putExtra("inputTxt", this$0.getBinding().editText.getText().toString());
        this$0.startActivity(intent);
        this$0.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        LangSelectionActivity.INSTANCE.setFromTranslationText(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clickListener$lambda$24$lambda$13(TextTranslation this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        TextToSpeech textToSpeech = this$0.tts;
        if (textToSpeech != null) {
            textToSpeech.stop();
        }
        Intent intent = new Intent(this$0, (Class<?>) LangSelectionActivity.class);
        intent.putExtra(LinkHeader.Parameters.Type, AgentOptions.OUTPUT);
        intent.putExtra("inputTxt", this$0.getBinding().editText.getText().toString());
        this$0.startActivity(intent);
        this$0.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        LangSelectionActivity.INSTANCE.setFromTranslationText(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clickListener$lambda$24$lambda$14(TextTranslation this$0, ActivityTextTranslationBinding this_apply, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        TextToSpeech textToSpeech = this$0.tts;
        if (textToSpeech != null) {
            textToSpeech.stop();
        }
        TextToSpeech textToSpeech2 = this$0.tts;
        if (textToSpeech2 != null) {
            textToSpeech2.speak(StringsKt.trim((CharSequence) this_apply.editText.getText().toString()).toString(), 0, null, "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clickListener$lambda$24$lambda$15(TextTranslation this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        TextToSpeech textToSpeech = this$0.tts;
        if (textToSpeech != null) {
            textToSpeech.stop();
        }
        ExtensionFunction.INSTANCE.copyToClipboard(this$0, StringsKt.trim((CharSequence) this$0.getBinding().outputText.getText().toString()).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clickListener$lambda$24$lambda$16(TextTranslation this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        TextToSpeech textToSpeech = this$0.tts;
        if (textToSpeech != null) {
            textToSpeech.stop();
        }
        ExtensionFunction.INSTANCE.copyToClipboard(this$0, StringsKt.trim((CharSequence) this$0.getBinding().editText.getText().toString()).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clickListener$lambda$24$lambda$17(TextTranslation this$0, ActivityTextTranslationBinding this_apply, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        TextToSpeech textToSpeech = this$0.tts;
        if (textToSpeech != null) {
            textToSpeech.stop();
        }
        TextToSpeech textToSpeech2 = this$0.tts;
        if (textToSpeech2 != null) {
            textToSpeech2.speak(this_apply.outputText.getText().toString(), 0, null, "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clickListener$lambda$24$lambda$18(TextTranslation this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.ispaste = true;
        this$0.getBinding().translateBtn.setVisibility(4);
        TextToSpeech textToSpeech = this$0.tts;
        if (textToSpeech != null) {
            textToSpeech.stop();
        }
        if (!this$0.isMicrophonePermissionGranted()) {
            this$0.requestMicrophonePermission();
        } else {
            this$0.speechInput();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clickListener$lambda$24$lambda$20(final TextTranslation this$0, ActivityTextTranslationBinding this_apply, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        this$0.hideKeyboard();
        this$0.ispaste = true;
        TextToSpeech textToSpeech = this$0.tts;
        if (textToSpeech != null) {
            textToSpeech.stop();
        }
        TextTranslation textTranslation = this$0;
        if (ExtensionFunction.INSTANCE.getFromClipboard(textTranslation) != null) {
            this_apply.editText.append(ExtensionFunction.INSTANCE.getFromClipboard(textTranslation));
        }
        if (ExtensionFunction.INSTANCE.checkInternetConnection(textTranslation)) {
            Editable text = this$0.getBinding().editText.getText();
            Intrinsics.checkNotNullExpressionValue(text, "binding.editText.text");
            if (text.length() > 0) {
                if (this$0.getBinding().outputLangTv.getText().equals("Choose\nlang")) {
                    Toast.makeText(textTranslation, "select output language", 0).show();
                    return;
                } else {
                    this$0.showLoadingDialog();
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: dev.cct.translatorapp.ui.TextTranslation$$ExternalSyntheticLambda22
                        @Override // java.lang.Runnable
                        public final void run() {
                            TextTranslation.clickListener$lambda$24$lambda$20$lambda$19(TextTranslation.this);
                        }
                    }, 1000L);
                    return;
                }
            }
            Toast.makeText(textTranslation, "enter input text", 0).show();
            return;
        }
        Toast.makeText(textTranslation, "No network connection", 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clickListener$lambda$24$lambda$20$lambda$19(TextTranslation this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.translate(String.valueOf(ExtensionFunction.INSTANCE.getFromClipboard(this$0)), ExtensionFunctionKt.getTranslateLangList().get(this$0.getPref().getTranslateInput()).getLangCode(), ExtensionFunctionKt.getTranslateLangList().get(this$0.getPref().getTranslateOutput()).getLangCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clickListener$lambda$24$lambda$21(TextTranslation this$0, ActivityTextTranslationBinding this_apply, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        TextToSpeech textToSpeech = this$0.tts;
        if (textToSpeech != null) {
            textToSpeech.stop();
        }
        CharSequence text = this_apply.outputText.getText();
        Intrinsics.checkNotNullExpressionValue(text, "outputText.text");
        ExtensionFunction.INSTANCE.copyToClipboard(this$0, text);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clickListener$lambda$24$lambda$22(TextTranslation this$0, ActivityTextTranslationBinding this_apply, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        TextToSpeech textToSpeech = this$0.tts;
        if (textToSpeech != null) {
            textToSpeech.stop();
        }
        Editable text = this_apply.editText.getText();
        Intrinsics.checkNotNullExpressionValue(text, "editText.text");
        if (text.length() > 0) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", this_apply.outputText.getText());
            this$0.startActivity(Intent.createChooser(intent, null));
            this$0.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clickListener$lambda$24$lambda$23(TextTranslation this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideKeyboard();
        TextTranslation textTranslation = this$0;
        if (ExtensionFunction.INSTANCE.checkInternetConnection(textTranslation)) {
            Editable text = this$0.getBinding().editText.getText();
            Intrinsics.checkNotNullExpressionValue(text, "binding.editText.text");
            if (text.length() > 0) {
                if (this$0.getBinding().outputLangTv.getText().equals("Choose\nlang")) {
                    Toast.makeText(textTranslation, "select output language", 0).show();
                } else {
                    this$0.showLoadingDialog();
                    this$0.translate(this$0.getBinding().editText.getText().toString(), ExtensionFunctionKt.getTranslateLangList().get(this$0.getPref().getTranslateInput()).getLangCode(), ExtensionFunctionKt.getTranslateLangList().get(this$0.getPref().getTranslateOutput()).getLangCode());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadingBackData() {
        if (ConstantParam.INSTANCE.getFbInterstitialEnableOrNot()) {
            Log.d(this.TAG, "loadingBackData: admob");
            TextTranslation textTranslation = this;
            if (AdsExtensionKt.isNetworkAvailable(textTranslation) || !ConstantParam.INSTANCE.m204isPurchased()) {
                showInterstitials();
            } else {
                ExtensionFunction.INSTANCE.openActivity(textTranslation, HomeScreenActivity.class);
                finish();
            }
        } else {
            Log.d(this.TAG, "loadingBackData: fb");
            ConstantParam.INSTANCE.getFbInterstitial().showFbInterstitialAd(new Function0<Unit>() { // from class: dev.cct.translatorapp.ui.TextTranslation$loadingBackData$1
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
                    ExtensionFunction.INSTANCE.openActivity(TextTranslation.this, HomeScreenActivity.class);
                }
            }, new Function0<Unit>() { // from class: dev.cct.translatorapp.ui.TextTranslation$loadingBackData$2
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
                    ExtensionFunction.INSTANCE.openActivity(TextTranslation.this, HomeScreenActivity.class);
                }
            });
        }
        new Preferences(this).setCheckLoadingV(false);
    }

    private final void showInterstitials() {
        Log.d("zh", "showInterstitials: " + ConstantParam.INSTANCE.isLoadedAdInters());
        this.loadingAdDialog = AdsExtensionKt.showLoadingDialogProgress(this);
        try {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new TextTranslation$showInterstitials$1(this, null), 2, null);
        } catch (Exception unused) {
            AlertDialog alertDialog = this.loadingAdDialog;
            if (alertDialog != null) {
                AdsExtensionKt.dismissLoadingDialog(alertDialog);
            }
            ExtensionFunction.INSTANCE.openActivity(this, HomeScreenActivity.class);
        }
    }

    private final void clearData() {
        TextToSpeech textToSpeech = this.tts;
        if (textToSpeech != null) {
            textToSpeech.stop();
        }
        getBinding().editText.setText("");
        getBinding().viewColorLine.setVisibility(4);
        getBinding().outputText.setVisibility(4);
        getBinding().linearIconLayout.setVisibility(4);
        getBinding().linearIconLayoutInput.setVisibility(4);
        getBinding().micIcon.setVisibility(0);
        getBinding().linearIconLayoutInput.setVisibility(4);
        getBinding().viewColorLine.setVisibility(4);
        getBinding().extFloatingActionButton.setVisibility(4);
        checkClipboard();
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: dev.cct.translatorapp.ui.TextTranslation$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                TextTranslation.clearData$lambda$25(TextTranslation.this);
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clearData$lambda$25(TextTranslation this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getBinding().editText.setFocusable(true);
        this$0.showKeyboard1();
    }

    private final boolean isMicrophonePermissionGranted() {
        return ContextCompat.checkSelfPermission(this, "android.permission.RECORD_AUDIO") == 0;
    }

    private final void requestMicrophonePermission() {
        TextTranslation textTranslation = this;
        if (ActivityCompat.shouldShowRequestPermissionRationale(textTranslation, "android.permission.RECORD_AUDIO")) {
            Toast.makeText(this, "Microphone permission is required to use the microphone.", 0).show();
        }
        ActivityCompat.requestPermissions(textTranslation, new String[]{"android.permission.RECORD_AUDIO"}, this.MICROPHONE_PERMISSION_REQUEST_CODE);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == this.MICROPHONE_PERMISSION_REQUEST_CODE) {
            if ((!(grantResults.length == 0)) && grantResults[0] == 0) {
                speechInput();
            } else {
                Toast.makeText(this, "Microphone permission denied.", 0).show();
            }
        }
    }

    private final void speechInput() {
        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
        Iterator<LanguageListModel> it = ExtensionFunctionKt.getTranslateLangList().iterator();
        String str = "";
        while (it.hasNext()) {
            LanguageListModel next = it.next();
            if (Intrinsics.areEqual(getString(next.getLangName()), getBinding().inputLangTv.getText())) {
                str = next.getLangCode();
            }
        }
        intent.putExtra("android.speech.extra.LANGUAGE", str);
        intent.putExtra("android.speech.extra.PROMPT", getString(R.string.app_name));
        try {
            this.speakLunchResult.launch(intent);
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(this, "Please try again!", 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void speakLunchResult$lambda$26(TextTranslation this$0, ActivityResult activityResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (activityResult.getResultCode() == -1) {
            Intent data = activityResult.getData();
            if (activityResult.getResultCode() != -1 || data == null) {
                return;
            }
            ArrayList<String> stringArrayListExtra = data.getStringArrayListExtra("android.speech.extra.RESULTS");
            Log.d("TAG", "result: " + stringArrayListExtra);
            ArrayList<String> arrayList = stringArrayListExtra;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            String speakText = stringArrayListExtra.get(0);
            this$0.getBinding().editText.setText(speakText.toString());
            Intrinsics.checkNotNullExpressionValue(speakText, "speakText");
            this$0.loadTranslateData(speakText);
            this$0.getBinding().clearIconBtn.setVisibility(0);
        }
    }

    private final void loadTranslateData(final String speakText) {
        TextTranslation textTranslation = this;
        if (ExtensionFunction.INSTANCE.checkInternetConnection(textTranslation)) {
            if (speakText.length() > 0) {
                if (getBinding().outputLangTv.getText().equals("Choose\nlang")) {
                    Toast.makeText(textTranslation, "select output language", 0).show();
                    return;
                } else {
                    showLoadingDialog();
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: dev.cct.translatorapp.ui.TextTranslation$$ExternalSyntheticLambda11
                        @Override // java.lang.Runnable
                        public final void run() {
                            TextTranslation.loadTranslateData$lambda$27(TextTranslation.this, speakText);
                        }
                    }, 600L);
                    return;
                }
            }
            Toast.makeText(textTranslation, "enter input text", 0).show();
            return;
        }
        Toast.makeText(textTranslation, "No network connection", 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadTranslateData$lambda$27(TextTranslation this$0, String speakText) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(speakText, "$speakText");
        this$0.translate(speakText, ExtensionFunctionKt.getTranslateLangList().get(this$0.getPref().getTranslateInput()).getLangCode(), ExtensionFunctionKt.getTranslateLangList().get(this$0.getPref().getTranslateOutput()).getLangCode());
    }

    private final void showLoadingDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(R.layout.load_dialog);
        android.app.AlertDialog create = builder.create();
        this.loadingDialog = create;
        Window window = create != null ? create.getWindow() : null;
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        android.app.AlertDialog alertDialog = this.loadingDialog;
        if (alertDialog != null) {
            alertDialog.show();
        }
        android.app.AlertDialog alertDialog2 = this.loadingDialog;
        if (alertDialog2 != null) {
            alertDialog2.setCancelable(true);
        }
    }

    private final void translate(String inputText, String outputCode, String inputCode) {
        Log.d(this.TAG, "translate: " + inputText + " //" + outputCode + " //" + inputCode);
        HitTranslationApi hitTranslationApi = this.translationFactory;
        HitTranslationApi hitTranslationApi2 = null;
        if (hitTranslationApi == null) {
            Intrinsics.throwUninitializedPropertyAccessException("translationFactory");
            hitTranslationApi = null;
        }
        hitTranslationApi.runTranslation(inputText, inputCode, outputCode);
        HitTranslationApi hitTranslationApi3 = this.translationFactory;
        if (hitTranslationApi3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("translationFactory");
        } else {
            hitTranslationApi2 = hitTranslationApi3;
        }
        hitTranslationApi2.setTranslationComplete(new TextTranslation$translate$1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fadeInView(View view) {
        view.setVisibility(0);
        view.setAlpha(0.0f);
        view.animate().alpha(1.0f).setDuration(300L).setListener(null);
    }

    private final void showBottomSheetNetwork() {
        NetworkBottomDialogBinding inflate = NetworkBottomDialogBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this);
        bottomSheetDialog.setContentView(inflate.getRoot());
        inflate.okBtn.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.TextTranslation$$ExternalSyntheticLambda20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TextTranslation.showBottomSheetNetwork$lambda$28(BottomSheetDialog.this, view);
            }
        });
        bottomSheetDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showBottomSheetNetwork$lambda$28(BottomSheetDialog dialog, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        dialog.dismiss();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        updateDarkMode();
        super.onPause();
        TextToSpeech textToSpeech = this.tts;
        if (textToSpeech != null) {
            textToSpeech.stop();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: dev.cct.translatorapp.ui.TextTranslation$$ExternalSyntheticLambda23
            @Override // java.lang.Runnable
            public final void run() {
                TextTranslation.onStart$lambda$29(TextTranslation.this);
            }
        }, 100L);
        TextToSpeech textToSpeech = this.tts;
        if (textToSpeech != null) {
            textToSpeech.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onStart$lambda$29(TextTranslation this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.checkClipboardData();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        updateDarkMode();
        super.onResume();
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: dev.cct.translatorapp.ui.TextTranslation$$ExternalSyntheticLambda19
            @Override // java.lang.Runnable
            public final void run() {
                TextTranslation.onResume$lambda$30(TextTranslation.this);
            }
        }, 100L);
        TextToSpeech textToSpeech = this.tts;
        if (textToSpeech != null) {
            textToSpeech.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResume$lambda$30(TextTranslation this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.checkClipboardData();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        TextToSpeech textToSpeech = this.tts;
        if (textToSpeech != null) {
            textToSpeech.shutdown();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        updateDarkMode();
        Toast.makeText(this, String.valueOf(newConfig.hardKeyboardHidden), 0).show();
    }

    private final void updateDarkMode() {
        Object systemService = getSystemService("uimode");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.UiModeManager");
        if (((UiModeManager) systemService).getNightMode() == 2) {
            AppCompatDelegate.setDefaultNightMode(2);
        } else {
            AppCompatDelegate.setDefaultNightMode(1);
        }
    }

    private final void onBackPressedTrans() {
        getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback() { // from class: dev.cct.translatorapp.ui.TextTranslation$onBackPressedTrans$onBackPressedCallback$1
            {
                super(true);
            }

            @Override // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                TextTranslation.this.loadingBackData();
            }
        });
    }
}
