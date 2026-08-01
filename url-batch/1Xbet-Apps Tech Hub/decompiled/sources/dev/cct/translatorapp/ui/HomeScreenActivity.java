package dev.cct.translatorapp.ui;

import android.app.AlertDialog;
import android.app.Application;
import android.app.UiModeManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.speech.tts.TextToSpeech;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.CycleInterpolator;
import android.view.animation.TranslateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.card.MaterialCardViewHelper;
import com.google.android.material.navigation.NavigationBarView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.translator.alllanguagetranslations.ath.R;
import dev.cct.translatorapp.LanguageListModel;
import dev.cct.translatorapp.MainApplication;
import dev.cct.translatorapp.TranslatorAdmobAds.AdsExtensionKt;
import dev.cct.translatorapp.adapter.HistoryHomeAdapter;
import dev.cct.translatorapp.ads.ConstantParam;
import dev.cct.translatorapp.ads.IntersContentAd;
import dev.cct.translatorapp.ads.NativeSplashAd;
import dev.cct.translatorapp.customFirebaseEvents.TranslatorCustomFirebaseEvents;
import dev.cct.translatorapp.dataModel.HistoryModel;
import dev.cct.translatorapp.databinding.ActivityHomeScreenBinding;
import dev.cct.translatorapp.databinding.CloseAppDialogLayoutBinding;
import dev.cct.translatorapp.databinding.NetworkBottomDialogBinding;
import dev.cct.translatorapp.util.ExtensionFunction;
import dev.cct.translatorapp.util.ExtensionFunctionKt;
import dev.cct.translatorapp.util.Preferences;
import dev.cct.translatorapp.viewModel.HistoryViewModel;
import io.ktor.http.LinkHeader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jacoco.core.runtime.AgentOptions;

/* compiled from: HomeScreenActivity.kt */
@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 k2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001kB\u0005¢\u0006\u0002\u0010\u0004J\u0010\u00106\u001a\u0002072\u0006\u00108\u001a\u000209H\u0014J\b\u0010:\u001a\u000207H\u0002J\b\u0010;\u001a\u000207H\u0016J\u0010\u0010<\u001a\u0002072\u0006\u0010=\u001a\u00020>H\u0002J\b\u0010?\u001a\u000207H\u0003J\b\u0010@\u001a\u00020 H\u0002J\u0018\u0010A\u001a\u0002092\u0006\u0010B\u001a\u0002092\u0006\u0010C\u001a\u00020DH\u0002J\b\u0010E\u001a\u000207H\u0002J\b\u0010F\u001a\u000207H\u0016J\u0018\u0010G\u001a\u0002072\u0006\u0010H\u001a\u00020\u00132\u0006\u0010I\u001a\u00020\u0006H\u0016J\u0010\u0010J\u001a\u0002072\u0006\u0010K\u001a\u00020LH\u0016J\u0012\u0010M\u001a\u0002072\b\u0010N\u001a\u0004\u0018\u00010OH\u0014J\b\u0010P\u001a\u000207H\u0014J\u0010\u0010Q\u001a\u0002072\u0006\u0010R\u001a\u00020\u0006H\u0016J\b\u0010S\u001a\u000207H\u0014J-\u0010T\u001a\u0002072\u0006\u0010U\u001a\u00020\u00062\u000e\u0010V\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0W2\u0006\u0010X\u001a\u00020YH\u0016¢\u0006\u0002\u0010ZJ\b\u0010[\u001a\u000207H\u0014J\b\u0010\\\u001a\u000207H\u0014J\u0010\u0010]\u001a\u0002072\u0006\u0010H\u001a\u00020\u0013H\u0016J\b\u0010^\u001a\u000207H\u0002J\b\u0010_\u001a\u000207H\u0002J\u0010\u0010`\u001a\u0002072\u0006\u0010=\u001a\u00020aH\u0002J\b\u0010b\u001a\u000207H\u0002J\b\u0010c\u001a\u000207H\u0002J\b\u0010d\u001a\u000207H\u0002J\b\u0010e\u001a\u000207H\u0016J\b\u0010f\u001a\u000207H\u0002J\b\u0010g\u001a\u000207H\u0002J\b\u0010h\u001a\u000207H\u0002J\b\u0010i\u001a\u000207H\u0002J\b\u0010j\u001a\u000207H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010!\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b#\u0010$R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u0004\u0018\u00010.X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010/\u001a\b\u0012\u0004\u0012\u00020100X\u0082.¢\u0006\u0002\n\u0000R\u001c\u00102\u001a\u0010\u0012\f\u0012\n 3*\u0004\u0018\u0001010100X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00104\u001a\u0004\u0018\u000105X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006l"}, d2 = {"Ldev/cct/translatorapp/ui/HomeScreenActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Ldev/cct/translatorapp/adapter/HistoryHomeAdapter$Favorite;", "Landroid/speech/tts/TextToSpeech$OnInitListener;", "()V", "MICROPHONE_PERMISSION_REQUEST_CODE", "", "TAG", "", "getTAG", "()Ljava/lang/String;", "adapter", "Ldev/cct/translatorapp/adapter/HistoryHomeAdapter;", "getAdapter", "()Ldev/cct/translatorapp/adapter/HistoryHomeAdapter;", "setAdapter", "(Ldev/cct/translatorapp/adapter/HistoryHomeAdapter;)V", "allHistory", "", "Ldev/cct/translatorapp/dataModel/HistoryModel;", "binding", "Ldev/cct/translatorapp/databinding/ActivityHomeScreenBinding;", "getBinding", "()Ldev/cct/translatorapp/databinding/ActivityHomeScreenBinding;", "setBinding", "(Ldev/cct/translatorapp/databinding/ActivityHomeScreenBinding;)V", "bottomNav", "Lcom/google/android/material/bottomnavigation/BottomNavigationView;", "clickEventsFirebase", "Ldev/cct/translatorapp/customFirebaseEvents/TranslatorCustomFirebaseEvents;", "countAdClick", "doubleBackToExitPressedOnce", "", "historyViewModel", "Ldev/cct/translatorapp/viewModel/HistoryViewModel;", "getHistoryViewModel", "()Ldev/cct/translatorapp/viewModel/HistoryViewModel;", "historyViewModel$delegate", "Lkotlin/Lazy;", "loadingDialog", "Landroid/app/AlertDialog;", "pref", "Ldev/cct/translatorapp/util/Preferences;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "remoteConfig", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "resultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "speakLunchResult", "kotlin.jvm.PlatformType", "tts", "Landroid/speech/tts/TextToSpeech;", "attachBaseContext", "", "newBase", "Landroid/content/Context;", "checkClipboardData", "hideDeleteBtn", "hideKeyboard", "view", "Landroid/view/View;", "initListeners", "isMicrophonePermissionGranted", "languageChange", "context", "locale", "Ljava/util/Locale;", "loadFbInterstitial", "onBackPressed", "onClickFavorite", "itemsViewModel", "position", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onInit", NotificationCompat.CATEGORY_STATUS, "onPause", "onRequestPermissionsResult", "requestCode", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onStart", "onTranslationClick", "requestMicrophonePermission", "setRecyclerView", "shakeTextAnimation", "Landroid/widget/TextView;", "showBackDialog", "showBannerAd", "showBottomSheetNetwork", "showDeleteBtn", "showInterAd", "showLoadingDialog", "speechInput", "translateData", "updateDarkMode", "Companion", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HomeScreenActivity extends AppCompatActivity implements HistoryHomeAdapter.Favorite, TextToSpeech.OnInitListener {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static boolean fromConversation;
    private static boolean fromHome;
    private static boolean isBackInterShow;
    public HistoryHomeAdapter adapter;
    public ActivityHomeScreenBinding binding;
    private BottomNavigationView bottomNav;
    private TranslatorCustomFirebaseEvents clickEventsFirebase;
    private int countAdClick;
    private boolean doubleBackToExitPressedOnce;

    /* renamed from: historyViewModel$delegate, reason: from kotlin metadata */
    private final Lazy historyViewModel;
    private AlertDialog loadingDialog;
    private Preferences pref;
    private RecyclerView recyclerView;
    private FirebaseRemoteConfig remoteConfig;
    private ActivityResultLauncher<Intent> resultLauncher;
    private ActivityResultLauncher<Intent> speakLunchResult;
    private TextToSpeech tts;
    private final int MICROPHONE_PERMISSION_REQUEST_CODE = 1;
    private final String TAG = "home_screen_logs";
    private List<HistoryModel> allHistory = CollectionsKt.emptyList();

    @Override // dev.cct.translatorapp.adapter.HistoryHomeAdapter.Favorite
    public void hideDeleteBtn() {
    }

    @Override // android.speech.tts.TextToSpeech.OnInitListener
    public void onInit(int status) {
    }

    @Override // dev.cct.translatorapp.adapter.HistoryHomeAdapter.Favorite
    public void showDeleteBtn() {
    }

    public HomeScreenActivity() {
        final HomeScreenActivity homeScreenActivity = this;
        final Function0 function0 = null;
        this.historyViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(HistoryViewModel.class), new Function0<ViewModelStore>() { // from class: dev.cct.translatorapp.ui.HomeScreenActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: dev.cct.translatorapp.ui.HomeScreenActivity$historyViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                Application application = HomeScreenActivity.this.getApplication();
                Intrinsics.checkNotNull(application, "null cannot be cast to non-null type dev.cct.translatorapp.MainApplication");
                return new HistoryViewModel.HistoryViewModelFactory(((MainApplication) application).getRepository());
            }
        }, new Function0<CreationExtras>() { // from class: dev.cct.translatorapp.ui.HomeScreenActivity$special$$inlined$viewModels$default$3
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
                CreationExtras defaultViewModelCreationExtras = homeScreenActivity.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        });
        ActivityResultLauncher<Intent> registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: dev.cct.translatorapp.ui.HomeScreenActivity$$ExternalSyntheticLambda23
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                HomeScreenActivity.speakLunchResult$lambda$25(HomeScreenActivity.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResul…\n            }\n\n        }");
        this.speakLunchResult = registerForActivityResult;
    }

    public final ActivityHomeScreenBinding getBinding() {
        ActivityHomeScreenBinding activityHomeScreenBinding = this.binding;
        if (activityHomeScreenBinding != null) {
            return activityHomeScreenBinding;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final void setBinding(ActivityHomeScreenBinding activityHomeScreenBinding) {
        Intrinsics.checkNotNullParameter(activityHomeScreenBinding, "<set-?>");
        this.binding = activityHomeScreenBinding;
    }

    public final String getTAG() {
        return this.TAG;
    }

    public final HistoryHomeAdapter getAdapter() {
        HistoryHomeAdapter historyHomeAdapter = this.adapter;
        if (historyHomeAdapter != null) {
            return historyHomeAdapter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("adapter");
        return null;
    }

    public final void setAdapter(HistoryHomeAdapter historyHomeAdapter) {
        Intrinsics.checkNotNullParameter(historyHomeAdapter, "<set-?>");
        this.adapter = historyHomeAdapter;
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
        ActivityHomeScreenBinding inflate = ActivityHomeScreenBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        setBinding(inflate);
        setContentView(getBinding().getRoot());
        checkClipboardData();
        this.remoteConfig = FirebaseRemoteConfig.getInstance();
        HomeScreenActivity homeScreenActivity = this;
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(homeScreenActivity);
        Intrinsics.checkNotNullExpressionValue(firebaseAnalytics, "getInstance(this)");
        this.clickEventsFirebase = new TranslatorCustomFirebaseEvents(firebaseAnalytics);
        getBinding().bottomNavigationView.getMenu().getItem(0).setCheckable(false);
        this.tts = new TextToSpeech(homeScreenActivity, this);
        this.pref = new Preferences(homeScreenActivity);
        showBannerAd();
        String stringExtra = getIntent().getStringExtra("currentInputText");
        if (stringExtra != null) {
            getBinding().editText.setText(stringExtra);
        }
        Log.e(this.TAG, "onCreate: " + new Preferences(homeScreenActivity).isNoSelectedLang());
        ArrayList<LanguageListModel> translateLangList = ExtensionFunctionKt.getTranslateLangList();
        Preferences preferences = this.pref;
        Preferences preferences2 = null;
        if (preferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pref");
            preferences = null;
        }
        LanguageListModel languageListModel = translateLangList.get(preferences.getTranslateInput());
        Intrinsics.checkNotNullExpressionValue(languageListModel, "translateLangList[pref.translateInput]");
        LanguageListModel languageListModel2 = languageListModel;
        ArrayList<LanguageListModel> translateLangList2 = ExtensionFunctionKt.getTranslateLangList();
        Preferences preferences3 = this.pref;
        if (preferences3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pref");
        } else {
            preferences2 = preferences3;
        }
        LanguageListModel languageListModel3 = translateLangList2.get(preferences2.getTranslateOutput());
        Intrinsics.checkNotNullExpressionValue(languageListModel3, "translateLangList[pref.translateOutput]");
        LanguageListModel languageListModel4 = languageListModel3;
        getBinding().inputLangTv.setText(getString(languageListModel2.getLangName()));
        getBinding().inputLangCardTv.setText(getString(languageListModel2.getLangName()));
        getBinding().outputLangTv.setText(getString(languageListModel4.getLangName()));
        getBinding().outputLangCardTv.setText(getString(languageListModel4.getLangName()));
        BottomNavigationView bottomNavigationView = getBinding().bottomNavigationView;
        Intrinsics.checkNotNullExpressionValue(bottomNavigationView, "binding.bottomNavigationView");
        this.bottomNav = bottomNavigationView;
        TranslatorCustomFirebaseEvents translatorCustomFirebaseEvents = this.clickEventsFirebase;
        if (translatorCustomFirebaseEvents != null) {
            translatorCustomFirebaseEvents.homeScreen();
        }
        TranslatorCustomFirebaseEvents translatorCustomFirebaseEvents2 = this.clickEventsFirebase;
        if (translatorCustomFirebaseEvents2 != null) {
            String string = getString(languageListModel2.getLangName());
            Intrinsics.checkNotNullExpressionValue(string, "this.getString(inputLang.langName)");
            translatorCustomFirebaseEvents2.inputLangT(string);
        }
        TranslatorCustomFirebaseEvents translatorCustomFirebaseEvents3 = this.clickEventsFirebase;
        if (translatorCustomFirebaseEvents3 != null) {
            String string2 = getString(languageListModel4.getLangName());
            Intrinsics.checkNotNullExpressionValue(string2, "this.getString(outputLang.langName)");
            translatorCustomFirebaseEvents3.outputLangT(string2);
        }
        setRecyclerView();
        ActivityResultLauncher<Intent> registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: dev.cct.translatorapp.ui.HomeScreenActivity$$ExternalSyntheticLambda24
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                HomeScreenActivity.onCreate$lambda$0(HomeScreenActivity.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResul…          }\n            }");
        this.resultLauncher = registerForActivityResult;
        initListeners();
        loadFbInterstitial();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(final HomeScreenActivity this$0, ActivityResult activityResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (activityResult.getResultCode() == -1) {
            Intent data = activityResult.getData();
            Preferences preferences = null;
            String stringExtra = data != null ? data.getStringExtra("translate_input") : null;
            String stringExtra2 = data != null ? data.getStringExtra("translate_output") : null;
            this$0.getBinding().editText.setText(stringExtra);
            Log.d(this$0.TAG, "TranslateInputActivityLogs onCreate: translated i=" + stringExtra);
            Log.d(this$0.TAG, "TranslateInputActivityLogs onCreate: translated o=" + stringExtra2);
            this$0.getBinding().outputText.setText(stringExtra2);
            Editable text = this$0.getBinding().editText.getText();
            Intrinsics.checkNotNullExpressionValue(text, "binding.editText.text");
            if ((text.length() > 0) && !Intrinsics.areEqual(stringExtra2, "") && stringExtra2 != null) {
                this$0.getBinding().outputCardView.setVisibility(0);
                this$0.getBinding().seeMoreBtn.setVisibility(8);
                this$0.getBinding().historyTv.setVisibility(8);
                HistoryViewModel historyViewModel = this$0.getHistoryViewModel();
                ArrayList<LanguageListModel> translateLangList = ExtensionFunctionKt.getTranslateLangList();
                Preferences preferences2 = this$0.pref;
                if (preferences2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pref");
                    preferences2 = null;
                }
                String langCode = translateLangList.get(preferences2.getTranslateInput()).getLangCode();
                ArrayList<LanguageListModel> translateLangList2 = ExtensionFunctionKt.getTranslateLangList();
                Preferences preferences3 = this$0.pref;
                if (preferences3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pref");
                } else {
                    preferences = preferences3;
                }
                String langCode2 = translateLangList2.get(preferences.getTranslateOutput()).getLangCode();
                String obj = this$0.getBinding().editText.getText().toString();
                CharSequence text2 = this$0.getBinding().outputText.getText();
                Intrinsics.checkNotNull(text2, "null cannot be cast to non-null type kotlin.String");
                historyViewModel.insert(new HistoryModel(0, langCode, langCode2, obj, (String) text2, false, false, 64, null)).invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: dev.cct.translatorapp.ui.HomeScreenActivity$onCreate$1$1
                    {
                        super(1);
                    }

                    /* compiled from: HomeScreenActivity.kt */
                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                    @DebugMetadata(c = "dev.cct.translatorapp.ui.HomeScreenActivity$onCreate$1$1$1", f = "HomeScreenActivity.kt", i = {}, l = {221}, m = "invokeSuspend", n = {}, s = {})
                    /* renamed from: dev.cct.translatorapp.ui.HomeScreenActivity$onCreate$1$1$1, reason: invalid class name */
                    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        int label;
                        final /* synthetic */ HomeScreenActivity this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(HomeScreenActivity homeScreenActivity, Continuation<? super AnonymousClass1> continuation) {
                            super(2, continuation);
                            this.this$0 = homeScreenActivity;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new AnonymousClass1(this.this$0, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            HistoryViewModel historyViewModel;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.label;
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                historyViewModel = this.this$0.getHistoryViewModel();
                                HistoryModel lastTranslation = historyViewModel.getLastTranslation();
                                this.label = 1;
                                if (BuildersKt.withContext(Dispatchers.getMain(), new C01241(this.this$0, lastTranslation, null), this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                            }
                            return Unit.INSTANCE;
                        }

                        /* compiled from: HomeScreenActivity.kt */
                        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                        @DebugMetadata(c = "dev.cct.translatorapp.ui.HomeScreenActivity$onCreate$1$1$1$1", f = "HomeScreenActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                        /* renamed from: dev.cct.translatorapp.ui.HomeScreenActivity$onCreate$1$1$1$1, reason: invalid class name and collision with other inner class name */
                        static final class C01241 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            final /* synthetic */ HistoryModel $lastTranslation;
                            int label;
                            final /* synthetic */ HomeScreenActivity this$0;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C01241(HomeScreenActivity homeScreenActivity, HistoryModel historyModel, Continuation<? super C01241> continuation) {
                                super(2, continuation);
                                this.this$0 = homeScreenActivity;
                                this.$lastTranslation = historyModel;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                return new C01241(this.this$0, this.$lastTranslation, continuation);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                return ((C01241) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                if (this.label != 0) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                                this.this$0.getAdapter().addData(this.$lastTranslation);
                                return Unit.INSTANCE;
                            }
                        }
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                        invoke2(th);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Throwable th) {
                        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new AnonymousClass1(HomeScreenActivity.this, null), 3, null);
                    }
                });
                return;
            }
            this$0.getBinding().outputCardView.setVisibility(8);
        }
    }

    private final void loadFbInterstitial() {
        AdsExtensionKt.loadFbInterstitial(this, ConstantParam.INSTANCE.getFbInterstitialAdId());
    }

    private final void showBannerAd() {
        if (ConstantParam.INSTANCE.getFbBannerEnableOrNot()) {
            Log.d("languageNativeAd", "checkNativeLoadAdStatus: admob");
            getBinding().fbBannerContainer.setVisibility(8);
            getBinding().admobBannerContainer.setVisibility(0);
            String homeCollapsibleInterstitialsAdId = ConstantParam.INSTANCE.getHomeCollapsibleInterstitialsAdId();
            FrameLayout frameLayout = getBinding().smallBannerLayout.bannerAdLayout;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.smallBannerLayout.bannerAdLayout");
            ShimmerFrameLayout shimmerFrameLayout = getBinding().smallBannerLayout.shimmerViewContainer;
            Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "binding.smallBannerLayout.shimmerViewContainer");
            ConstantParam.INSTANCE.getBannerCollapsibleAd().loadBanner(this, homeCollapsibleInterstitialsAdId, frameLayout, shimmerFrameLayout);
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

    private final void checkClipboardData() {
        ExtensionFunction.INSTANCE.hasTextCopied(this, new Function1<Boolean, Unit>() { // from class: dev.cct.translatorapp.ui.HomeScreenActivity$checkClipboardData$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                if (z) {
                    HomeScreenActivity.this.getBinding().pasteIcon.setVisibility(0);
                } else {
                    HomeScreenActivity.this.getBinding().pasteIcon.setVisibility(4);
                }
            }
        });
    }

    /* compiled from: HomeScreenActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0006\"\u0004\b\r\u0010\b¨\u0006\u000e"}, d2 = {"Ldev/cct/translatorapp/ui/HomeScreenActivity$Companion;", "", "()V", "fromConversation", "", "getFromConversation", "()Z", "setFromConversation", "(Z)V", "fromHome", "getFromHome", "setFromHome", "isBackInterShow", "setBackInterShow", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean getFromHome() {
            return HomeScreenActivity.fromHome;
        }

        public final void setFromHome(boolean z) {
            HomeScreenActivity.fromHome = z;
        }

        public final boolean getFromConversation() {
            return HomeScreenActivity.fromConversation;
        }

        public final void setFromConversation(boolean z) {
            HomeScreenActivity.fromConversation = z;
        }

        public final boolean isBackInterShow() {
            return HomeScreenActivity.isBackInterShow;
        }

        public final void setBackInterShow(boolean z) {
            HomeScreenActivity.isBackInterShow = z;
        }
    }

    private final void setRecyclerView() {
        RecyclerView recyclerView = getBinding().historyRecy;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.historyRecy");
        this.recyclerView = recyclerView;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new HomeScreenActivity$setRecyclerView$1(this, null), 3, null);
    }

    private final void initListeners() {
        final ActivityHomeScreenBinding binding = getBinding();
        binding.bgLayout.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.HomeScreenActivity$$ExternalSyntheticLambda26
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeScreenActivity.initListeners$lambda$21$lambda$1(HomeScreenActivity.this, view);
            }
        });
        binding.openSetting.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.HomeScreenActivity$$ExternalSyntheticLambda8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeScreenActivity.initListeners$lambda$21$lambda$2(HomeScreenActivity.this, view);
            }
        });
        binding.premiumIcon.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.HomeScreenActivity$$ExternalSyntheticLambda9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeScreenActivity.initListeners$lambda$21$lambda$3(HomeScreenActivity.this, view);
            }
        });
        binding.inputLanguageLayout.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.HomeScreenActivity$$ExternalSyntheticLambda10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeScreenActivity.initListeners$lambda$21$lambda$4(HomeScreenActivity.this, view);
            }
        });
        binding.outputLanguageLayout.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.HomeScreenActivity$$ExternalSyntheticLambda12
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeScreenActivity.initListeners$lambda$21$lambda$5(HomeScreenActivity.this, view);
            }
        });
        binding.seeMoreBtn.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.HomeScreenActivity$$ExternalSyntheticLambda13
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeScreenActivity.initListeners$lambda$21$lambda$6(HomeScreenActivity.this, view);
            }
        });
        binding.speakIcon.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.HomeScreenActivity$$ExternalSyntheticLambda14
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeScreenActivity.initListeners$lambda$21$lambda$7(HomeScreenActivity.this, binding, view);
            }
        });
        binding.outSpeakerIcon.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.HomeScreenActivity$$ExternalSyntheticLambda15
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeScreenActivity.initListeners$lambda$21$lambda$8(HomeScreenActivity.this, binding, view);
            }
        });
        binding.translateBtn.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.HomeScreenActivity$$ExternalSyntheticLambda16
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeScreenActivity.initListeners$lambda$21$lambda$10(HomeScreenActivity.this, binding, view);
            }
        });
        binding.crossIcon.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.HomeScreenActivity$$ExternalSyntheticLambda17
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeScreenActivity.initListeners$lambda$21$lambda$11(HomeScreenActivity.this, binding, view);
            }
        });
        binding.expandIcon.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.HomeScreenActivity$$ExternalSyntheticLambda27
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeScreenActivity.initListeners$lambda$21$lambda$12(HomeScreenActivity.this, binding, view);
            }
        });
        binding.editText.setOnTouchListener(new View.OnTouchListener() { // from class: dev.cct.translatorapp.ui.HomeScreenActivity$$ExternalSyntheticLambda28
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean initListeners$lambda$21$lambda$13;
                initListeners$lambda$21$lambda$13 = HomeScreenActivity.initListeners$lambda$21$lambda$13(view, motionEvent);
                return initListeners$lambda$21$lambda$13;
            }
        });
        binding.editText.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.HomeScreenActivity$$ExternalSyntheticLambda29
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeScreenActivity.initListeners$lambda$21$lambda$14(HomeScreenActivity.this, view);
            }
        });
        getBinding().expandTextView.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.HomeScreenActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeScreenActivity.initListeners$lambda$21$lambda$15(HomeScreenActivity.this, view);
            }
        });
        binding.editText.addTextChangedListener(new TextWatcher() { // from class: dev.cct.translatorapp.ui.HomeScreenActivity$initListeners$1$15
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
            
                if ((r3.length() > 0) == true) goto L11;
             */
            @Override // android.text.TextWatcher
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void afterTextChanged(Editable s) {
                boolean z;
                if (s != null) {
                    z = true;
                }
                z = false;
                if (z) {
                    ActivityHomeScreenBinding.this.crossIcon.setVisibility(0);
                    return;
                }
                ActivityHomeScreenBinding.this.crossIcon.setVisibility(8);
                ActivityHomeScreenBinding.this.outputText.setText("");
                ActivityHomeScreenBinding.this.outputCardView.setVisibility(8);
            }
        });
        binding.swapLangIcon.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.HomeScreenActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeScreenActivity.initListeners$lambda$21$lambda$16(HomeScreenActivity.this, binding, view);
            }
        });
        binding.micIcon.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.HomeScreenActivity$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeScreenActivity.initListeners$lambda$21$lambda$17(HomeScreenActivity.this, view);
            }
        });
        binding.pasteIcon.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.HomeScreenActivity$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeScreenActivity.initListeners$lambda$21$lambda$18(HomeScreenActivity.this, view);
            }
        });
        binding.outClipboardIcon.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.HomeScreenActivity$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeScreenActivity.initListeners$lambda$21$lambda$19(HomeScreenActivity.this, binding, view);
            }
        });
        binding.shareOutIcon.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.HomeScreenActivity$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeScreenActivity.initListeners$lambda$21$lambda$20(HomeScreenActivity.this, binding, view);
            }
        });
        BottomNavigationView bottomNavigationView = this.bottomNav;
        if (bottomNavigationView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomNav");
            bottomNavigationView = null;
        }
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() { // from class: dev.cct.translatorapp.ui.HomeScreenActivity$$ExternalSyntheticLambda7
            @Override // com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener
            public final boolean onNavigationItemSelected(MenuItem menuItem) {
                boolean initListeners$lambda$22;
                initListeners$lambda$22 = HomeScreenActivity.initListeners$lambda$22(HomeScreenActivity.this, menuItem);
                return initListeners$lambda$22;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$21$lambda$1(HomeScreenActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) TextTranslation.class);
        intent.putExtra("edit", "editText");
        this$0.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$21$lambda$2(HomeScreenActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ExtensionFunction.INSTANCE.openActivity(this$0, SettingActivity.class);
        this$0.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$21$lambda$3(HomeScreenActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        TranslatorCustomFirebaseEvents translatorCustomFirebaseEvents = this$0.clickEventsFirebase;
        if (translatorCustomFirebaseEvents != null) {
            translatorCustomFirebaseEvents.homeToPremium();
        }
        HomeScreenActivity homeScreenActivity = this$0;
        if (ExtensionFunction.INSTANCE.checkInternetConnection(homeScreenActivity)) {
            ExtensionFunction.INSTANCE.openActivity(homeScreenActivity, PremiumActivity.class);
            this$0.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        } else {
            this$0.showBottomSheetNetwork();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$21$lambda$4(HomeScreenActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) LangSelectionActivity.class);
        intent.putExtra(LinkHeader.Parameters.Type, "input");
        intent.putExtra("inputTxt", this$0.getBinding().editText.getText().toString());
        this$0.startActivity(intent);
        this$0.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        LangSelectionActivity.INSTANCE.setFromTranslationText(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$21$lambda$5(HomeScreenActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) LangSelectionActivity.class);
        intent.putExtra(LinkHeader.Parameters.Type, AgentOptions.OUTPUT);
        intent.putExtra("inputTxt", this$0.getBinding().editText.getText().toString());
        this$0.startActivity(intent);
        this$0.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        LangSelectionActivity.INSTANCE.setFromTranslationText(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$21$lambda$6(HomeScreenActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        fromHome = true;
        ExtensionFunction.INSTANCE.openActivity(this$0, HistoryActivity.class);
        this$0.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$21$lambda$7(HomeScreenActivity this$0, ActivityHomeScreenBinding this_with, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        TextToSpeech textToSpeech = this$0.tts;
        if (textToSpeech != null) {
            textToSpeech.speak(this_with.editText.getText().toString(), 0, null, "");
        }
        TranslatorCustomFirebaseEvents translatorCustomFirebaseEvents = this$0.clickEventsFirebase;
        if (translatorCustomFirebaseEvents != null) {
            translatorCustomFirebaseEvents.micBtn();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$21$lambda$8(HomeScreenActivity this$0, ActivityHomeScreenBinding this_with, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        TextToSpeech textToSpeech = this$0.tts;
        if (textToSpeech != null) {
            textToSpeech.speak(this_with.outputText.getText().toString(), 0, null, "");
        }
        TranslatorCustomFirebaseEvents translatorCustomFirebaseEvents = this$0.clickEventsFirebase;
        if (translatorCustomFirebaseEvents != null) {
            translatorCustomFirebaseEvents.micBtn();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$21$lambda$10(final HomeScreenActivity this$0, ActivityHomeScreenBinding this_with, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        TextToSpeech textToSpeech = this$0.tts;
        if (textToSpeech != null) {
            textToSpeech.stop();
        }
        EditText editText = this$0.getBinding().editText;
        Intrinsics.checkNotNullExpressionValue(editText, "binding.editText");
        this$0.hideKeyboard(editText);
        Log.e("TAG", "initListeners: " + ((Object) this_with.outputLangTv.getText()));
        if (Intrinsics.areEqual(this_with.outputLangTv.getText().toString(), "Choose\nLanguage")) {
            this_with.outputLangTv.setTextColor(ContextCompat.getColor(this$0, R.color.redColor));
            TextView outputLangTv = this_with.outputLangTv;
            Intrinsics.checkNotNullExpressionValue(outputLangTv, "outputLangTv");
            this$0.shakeTextAnimation(outputLangTv);
            return;
        }
        HomeScreenActivity homeScreenActivity = this$0;
        this$0.getBinding().outputLangTv.setTextColor(ContextCompat.getColor(homeScreenActivity, R.color.blue_text_color));
        if (this$0.getBinding().editText.getText().toString().length() > 0) {
            this$0.showLoadingDialog();
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: dev.cct.translatorapp.ui.HomeScreenActivity$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    HomeScreenActivity.initListeners$lambda$21$lambda$10$lambda$9(HomeScreenActivity.this);
                }
            }, 1000L);
        } else {
            Toast.makeText(homeScreenActivity, "Please Enter Text", 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$21$lambda$10$lambda$9(HomeScreenActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.translateData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$21$lambda$11(HomeScreenActivity this$0, ActivityHomeScreenBinding this_with, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        TextToSpeech textToSpeech = this$0.tts;
        if (textToSpeech != null) {
            textToSpeech.stop();
        }
        this_with.editText.setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$21$lambda$12(HomeScreenActivity this$0, ActivityHomeScreenBinding this_with, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        TextToSpeech textToSpeech = this$0.tts;
        if (textToSpeech != null) {
            textToSpeech.stop();
        }
        Intent intent = new Intent(this$0, (Class<?>) TranslateOutputActivity.class);
        intent.putExtra("translated_text", this_with.outputText.getText());
        this$0.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initListeners$lambda$21$lambda$13(View view, MotionEvent motionEvent) {
        view.getParent().requestDisallowInterceptTouchEvent(true);
        if ((motionEvent.getAction() & 255) == 1) {
            view.getParent().requestDisallowInterceptTouchEvent(false);
            view.performClick();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$21$lambda$14(HomeScreenActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) TextTranslation.class);
        intent.putExtra("edit", "editText");
        this$0.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$21$lambda$15(HomeScreenActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        TextToSpeech textToSpeech = this$0.tts;
        if (textToSpeech != null) {
            textToSpeech.stop();
        }
        String obj = StringsKt.trim((CharSequence) this$0.getBinding().editText.getText().toString()).toString();
        Intent intent = new Intent(this$0, (Class<?>) TranslateInputActivity.class);
        intent.putExtra("type_text", obj);
        ActivityResultLauncher<Intent> activityResultLauncher = this$0.resultLauncher;
        if (activityResultLauncher == null) {
            Intrinsics.throwUninitializedPropertyAccessException("resultLauncher");
            activityResultLauncher = null;
        }
        activityResultLauncher.launch(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$21$lambda$16(HomeScreenActivity this$0, ActivityHomeScreenBinding this_with, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        TextToSpeech textToSpeech = this$0.tts;
        if (textToSpeech != null) {
            textToSpeech.stop();
        }
        if (Intrinsics.areEqual(this_with.outputLangTv.getText().toString(), "Choose\nLanguage")) {
            this_with.outputLangTv.setTextColor(ContextCompat.getColor(this$0, R.color.redColor));
            TextView outputLangTv = this_with.outputLangTv;
            Intrinsics.checkNotNullExpressionValue(outputLangTv, "outputLangTv");
            this$0.shakeTextAnimation(outputLangTv);
            return;
        }
        Preferences preferences = this$0.pref;
        Preferences preferences2 = null;
        if (preferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pref");
            preferences = null;
        }
        int translateInput = preferences.getTranslateInput();
        Preferences preferences3 = this$0.pref;
        if (preferences3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pref");
            preferences3 = null;
        }
        int translateOutput = preferences3.getTranslateOutput();
        Preferences preferences4 = this$0.pref;
        if (preferences4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pref");
            preferences4 = null;
        }
        preferences4.setTranslateInput(translateOutput);
        Preferences preferences5 = this$0.pref;
        if (preferences5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pref");
            preferences5 = null;
        }
        preferences5.setTranslateOutput(translateInput);
        TextView textView = this_with.inputLangTv;
        ArrayList<LanguageListModel> translateLangList = ExtensionFunctionKt.getTranslateLangList();
        Preferences preferences6 = this$0.pref;
        if (preferences6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pref");
            preferences6 = null;
        }
        textView.setText(this$0.getString(translateLangList.get(preferences6.getTranslateInput()).getLangName()));
        TextView textView2 = this_with.inputLangCardTv;
        ArrayList<LanguageListModel> translateLangList2 = ExtensionFunctionKt.getTranslateLangList();
        Preferences preferences7 = this$0.pref;
        if (preferences7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pref");
            preferences7 = null;
        }
        textView2.setText(this$0.getString(translateLangList2.get(preferences7.getTranslateInput()).getLangName()));
        TextView textView3 = this_with.outputLangTv;
        ArrayList<LanguageListModel> translateLangList3 = ExtensionFunctionKt.getTranslateLangList();
        Preferences preferences8 = this$0.pref;
        if (preferences8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pref");
            preferences8 = null;
        }
        textView3.setText(this$0.getString(translateLangList3.get(preferences8.getTranslateOutput()).getLangName()));
        TextView textView4 = this_with.outputLangCardTv;
        ArrayList<LanguageListModel> translateLangList4 = ExtensionFunctionKt.getTranslateLangList();
        Preferences preferences9 = this$0.pref;
        if (preferences9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pref");
        } else {
            preferences2 = preferences9;
        }
        textView4.setText(this$0.getString(translateLangList4.get(preferences2.getTranslateOutput()).getLangName()));
        Editable text = this_with.editText.getText();
        this_with.editText.setText(this_with.outputText.getText());
        this_with.outputText.setText(text);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$21$lambda$17(HomeScreenActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
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
    public static final void initListeners$lambda$21$lambda$18(HomeScreenActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        TextToSpeech textToSpeech = this$0.tts;
        if (textToSpeech != null) {
            textToSpeech.stop();
        }
        HomeScreenActivity homeScreenActivity = this$0;
        if (ExtensionFunction.INSTANCE.getFromClipboard(homeScreenActivity) != null) {
            CharSequence fromClipboard = ExtensionFunction.INSTANCE.getFromClipboard(homeScreenActivity);
            if (fromClipboard != null) {
                Log.d(this$0.TAG, "initListeners: " + ((Object) fromClipboard));
                Intent intent = new Intent(homeScreenActivity, (Class<?>) TextTranslation.class);
                intent.putExtra("copy", fromClipboard);
                this$0.startActivity(intent);
            } else {
                Log.d(this$0.TAG, "Clipboard is empty or null");
            }
        }
        TranslatorCustomFirebaseEvents translatorCustomFirebaseEvents = this$0.clickEventsFirebase;
        if (translatorCustomFirebaseEvents != null) {
            translatorCustomFirebaseEvents.pasteBtn();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$21$lambda$19(HomeScreenActivity this$0, ActivityHomeScreenBinding this_with, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        TextToSpeech textToSpeech = this$0.tts;
        if (textToSpeech != null) {
            textToSpeech.stop();
        }
        CharSequence text = this_with.outputText.getText();
        Intrinsics.checkNotNullExpressionValue(text, "outputText.text");
        ExtensionFunction.INSTANCE.copyToClipboard(this$0, text);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$21$lambda$20(HomeScreenActivity this$0, ActivityHomeScreenBinding this_with, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        TextToSpeech textToSpeech = this$0.tts;
        if (textToSpeech != null) {
            textToSpeech.stop();
        }
        Editable text = this_with.editText.getText();
        Intrinsics.checkNotNullExpressionValue(text, "editText.text");
        if (text.length() > 0) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", this_with.outputText.getText());
            this$0.startActivity(Intent.createChooser(intent, null));
            this$0.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initListeners$lambda$22(HomeScreenActivity this$0, MenuItem it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        switch (it.getItemId()) {
            case R.id.conversation /* 2131296466 */:
                HomeScreenActivity homeScreenActivity = this$0;
                new Preferences(homeScreenActivity).setFirstTimeOpenAd(true);
                it.setCheckable(true);
                Log.e(RemoteConfigConstants.ResponseFieldKey.STATE, "initListeners: " + fromConversation);
                if (fromConversation) {
                    Intent intent = new Intent(homeScreenActivity, (Class<?>) ConversationActivity.class);
                    intent.putExtra("previous_state", "previousState");
                    this$0.setResult(-1, intent);
                    this$0.finish();
                    this$0.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                    fromConversation = false;
                } else {
                    Intent intent2 = new Intent(homeScreenActivity, (Class<?>) ConversationActivity.class);
                    intent2.addFlags(536870912);
                    this$0.startActivity(intent2);
                    this$0.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                }
                TranslatorCustomFirebaseEvents translatorCustomFirebaseEvents = this$0.clickEventsFirebase;
                if (translatorCustomFirebaseEvents != null) {
                    translatorCustomFirebaseEvents.homeConversation();
                    break;
                }
                break;
            case R.id.dictionary /* 2131296512 */:
                HomeScreenActivity homeScreenActivity2 = this$0;
                new Preferences(homeScreenActivity2).setFirstTimeOpenAd(true);
                this$0.startActivity(new Intent(homeScreenActivity2, (Class<?>) DictionaryActivity.class));
                this$0.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                TranslatorCustomFirebaseEvents translatorCustomFirebaseEvents2 = this$0.clickEventsFirebase;
                if (translatorCustomFirebaseEvents2 != null) {
                    translatorCustomFirebaseEvents2.homeDictionary();
                    break;
                }
                break;
            case R.id.phrasebook /* 2131296842 */:
                HomeScreenActivity homeScreenActivity3 = this$0;
                new Preferences(homeScreenActivity3).setFirstTimeOpenAd(true);
                this$0.startActivity(new Intent(homeScreenActivity3, (Class<?>) PhrasebookActivity.class));
                this$0.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                TranslatorCustomFirebaseEvents translatorCustomFirebaseEvents3 = this$0.clickEventsFirebase;
                if (translatorCustomFirebaseEvents3 != null) {
                    translatorCustomFirebaseEvents3.homePhraseBook();
                    break;
                }
                break;
            case R.id.speech_to_text /* 2131296982 */:
                HomeScreenActivity homeScreenActivity4 = this$0;
                new Preferences(homeScreenActivity4).setFirstTimeOpenAd(true);
                this$0.startActivity(new Intent(homeScreenActivity4, (Class<?>) SpeechToTextActivity.class));
                this$0.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                TranslatorCustomFirebaseEvents translatorCustomFirebaseEvents4 = this$0.clickEventsFirebase;
                if (translatorCustomFirebaseEvents4 != null) {
                    translatorCustomFirebaseEvents4.homeSpeechToText();
                    break;
                }
                break;
            case R.id.widget /* 2131297131 */:
                HomeScreenActivity homeScreenActivity5 = this$0;
                new Preferences(homeScreenActivity5).setFirstTimeOpenAd(true);
                Intent intent3 = new Intent(homeScreenActivity5, (Class<?>) WidgetActivity.class);
                intent3.putExtra(LinkHeader.Parameters.Type, "fromHome");
                this$0.startActivity(intent3);
                this$0.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                TranslatorCustomFirebaseEvents translatorCustomFirebaseEvents5 = this$0.clickEventsFirebase;
                if (translatorCustomFirebaseEvents5 != null) {
                    translatorCustomFirebaseEvents5.homeFloating();
                    break;
                }
                break;
            default:
                return false;
        }
        return true;
    }

    private final void hideKeyboard(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    private final void translateData() {
        TranslatorCustomFirebaseEvents translatorCustomFirebaseEvents = this.clickEventsFirebase;
        if (translatorCustomFirebaseEvents != null) {
            translatorCustomFirebaseEvents.translationBtn();
        }
        if (ExtensionFunction.INSTANCE.checkInternetConnection(this)) {
            Editable text = getBinding().editText.getText();
            Intrinsics.checkNotNullExpressionValue(text, "binding.editText.text");
            if (text.length() > 0) {
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new HomeScreenActivity$translateData$1(this, null), 3, null);
                AlertDialog alertDialog = this.loadingDialog;
                if (alertDialog != null) {
                    alertDialog.dismiss();
                }
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: dev.cct.translatorapp.ui.HomeScreenActivity$$ExternalSyntheticLambda19
                    @Override // java.lang.Runnable
                    public final void run() {
                        HomeScreenActivity.translateData$lambda$23(HomeScreenActivity.this);
                    }
                }, 500L);
                getBinding().scrollView2.post(new Runnable() { // from class: dev.cct.translatorapp.ui.HomeScreenActivity$$ExternalSyntheticLambda20
                    @Override // java.lang.Runnable
                    public final void run() {
                        HomeScreenActivity.translateData$lambda$24(HomeScreenActivity.this);
                    }
                });
                return;
            }
            return;
        }
        showBottomSheetNetwork();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void translateData$lambda$23(HomeScreenActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getBinding().outputCardView.setVisibility(0);
        this$0.getBinding().seeMoreBtn.setVisibility(8);
        this$0.getBinding().historyTv.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void translateData$lambda$24(HomeScreenActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getBinding().scrollView2.scrollTo(0, MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION);
    }

    private final void shakeTextAnimation(TextView view) {
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 10.0f, 0.0f, 0.0f);
        translateAnimation.setDuration(100L);
        translateAnimation.setInterpolator(new CycleInterpolator(5.0f));
        translateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: dev.cct.translatorapp.ui.HomeScreenActivity$shakeTextAnimation$1
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

    private final boolean isMicrophonePermissionGranted() {
        return ContextCompat.checkSelfPermission(this, "android.permission.RECORD_AUDIO") == 0;
    }

    private final void requestMicrophonePermission() {
        HomeScreenActivity homeScreenActivity = this;
        if (ActivityCompat.shouldShowRequestPermissionRationale(homeScreenActivity, "android.permission.RECORD_AUDIO")) {
            Toast.makeText(this, "Microphone permission is required to use the microphone.", 0).show();
        }
        ActivityCompat.requestPermissions(homeScreenActivity, new String[]{"android.permission.RECORD_AUDIO"}, this.MICROPHONE_PERMISSION_REQUEST_CODE);
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
    public static final void speakLunchResult$lambda$25(HomeScreenActivity this$0, ActivityResult activityResult) {
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
            String str = stringArrayListExtra.get(0);
            Intent intent = new Intent(this$0, (Class<?>) TextTranslation.class);
            intent.putExtra("copy", str);
            this$0.startActivity(intent);
            this$0.getBinding().crossIcon.setVisibility(0);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        HomeScreenActivity homeScreenActivity = this;
        if (!new Preferences(homeScreenActivity).getCheckBillingStatus()) {
            showBackDialog();
        } else {
            if (this.doubleBackToExitPressedOnce) {
                finishAffinity();
                return;
            }
            this.doubleBackToExitPressedOnce = true;
            Toast.makeText(homeScreenActivity, "Please click  again to exit", 0).show();
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: dev.cct.translatorapp.ui.HomeScreenActivity$$ExternalSyntheticLambda18
                @Override // java.lang.Runnable
                public final void run() {
                    HomeScreenActivity.onBackPressed$lambda$26(HomeScreenActivity.this);
                }
            }, 2000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBackPressed$lambda$26(HomeScreenActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.doubleBackToExitPressedOnce = false;
    }

    private final void showBackDialog() {
        CloseAppDialogLayoutBinding inflate = CloseAppDialogLayoutBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        ConstraintLayout root = inflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "dialogBinding.root");
        HomeScreenActivity homeScreenActivity = this;
        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(homeScreenActivity);
        bottomSheetDialog.setContentView(root);
        bottomSheetDialog.setCanceledOnTouchOutside(true);
        Window window = bottomSheetDialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        if (ExtensionFunction.INSTANCE.checkInternetConnection(homeScreenActivity)) {
            inflate.adLayout.setVisibility(0);
        } else {
            inflate.adLayout.setVisibility(8);
        }
        FirebaseRemoteConfig firebaseRemoteConfig = this.remoteConfig;
        String string = firebaseRemoteConfig != null ? firebaseRemoteConfig.getString("native_exit") : null;
        if (string != null) {
            Log.d(this.TAG, "showBackDialog: " + string);
            FrameLayout frameLayout = inflate.adFrame;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "dialogBinding.adFrame");
            ShimmerFrameLayout shimmerFrameLayout = inflate.shimmerViewContainer1;
            Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "dialogBinding.shimmerViewContainer1");
            new NativeSplashAd(homeScreenActivity).loadLargeNativeAds(R.layout.ad_native_layout, this, homeScreenActivity, string, frameLayout, shimmerFrameLayout);
        }
        inflate.exit.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.HomeScreenActivity$$ExternalSyntheticLambda25
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeScreenActivity.showBackDialog$lambda$27(HomeScreenActivity.this, bottomSheetDialog, view);
            }
        });
        bottomSheetDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showBackDialog$lambda$27(HomeScreenActivity this$0, BottomSheetDialog bottomSheetDialog, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bottomSheetDialog, "$bottomSheetDialog");
        this$0.finishAffinity();
        bottomSheetDialog.dismiss();
    }

    private final void showBottomSheetNetwork() {
        NetworkBottomDialogBinding inflate = NetworkBottomDialogBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this);
        bottomSheetDialog.setContentView(inflate.getRoot());
        inflate.okBtn.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.HomeScreenActivity$$ExternalSyntheticLambda22
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeScreenActivity.showBottomSheetNetwork$lambda$28(BottomSheetDialog.this, view);
            }
        });
        bottomSheetDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showBottomSheetNetwork$lambda$28(BottomSheetDialog dialog, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        dialog.dismiss();
    }

    @Override // dev.cct.translatorapp.adapter.HistoryHomeAdapter.Favorite
    public void onClickFavorite(HistoryModel itemsViewModel, int position) {
        Intrinsics.checkNotNullParameter(itemsViewModel, "itemsViewModel");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(getHistoryViewModel()), Dispatchers.getIO(), null, new HomeScreenActivity$onClickFavorite$1(this, itemsViewModel, position, null), 2, null);
    }

    @Override // dev.cct.translatorapp.adapter.HistoryHomeAdapter.Favorite
    public void onTranslationClick(HistoryModel itemsViewModel) {
        Intrinsics.checkNotNullParameter(itemsViewModel, "itemsViewModel");
        getBinding().editText.setText(itemsViewModel.getInput());
        int i = 0;
        getBinding().crossIcon.setVisibility(0);
        getBinding().outputText.setText(itemsViewModel.getOutput());
        getBinding().outputCardView.setVisibility(0);
        getBinding().seeMoreBtn.setVisibility(8);
        String str = new String();
        String str2 = new String();
        for (Object obj : ExtensionFunctionKt.getTranslateLangList()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            LanguageListModel languageListModel = (LanguageListModel) obj;
            Preferences preferences = null;
            if (Intrinsics.areEqual(languageListModel.getLangCode(), itemsViewModel.getILangC())) {
                str = getString(languageListModel.getLangName());
                Intrinsics.checkNotNullExpressionValue(str, "this.getString(i.langName)");
                Preferences preferences2 = this.pref;
                if (preferences2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pref");
                    preferences2 = null;
                }
                preferences2.setTranslateInput(i);
            }
            if (Intrinsics.areEqual(languageListModel.getLangCode(), itemsViewModel.getOLangC())) {
                str2 = getString(languageListModel.getLangName());
                Intrinsics.checkNotNullExpressionValue(str2, "this.getString(i.langName)");
                Preferences preferences3 = this.pref;
                if (preferences3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pref");
                } else {
                    preferences = preferences3;
                }
                preferences.setTranslateOutput(i);
            }
            i = i2;
        }
        String str3 = str;
        getBinding().inputLangTv.setText(str3);
        getBinding().inputLangCardTv.setText(str3);
        String str4 = str2;
        getBinding().outputLangTv.setText(str4);
        getBinding().outputLangCardTv.setText(str4);
        getBinding().outputLangTv.setTextColor(ContextCompat.getColor(this, R.color.blue_text_color));
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
        TextToSpeech textToSpeech = this.tts;
        if (textToSpeech != null) {
            textToSpeech.stop();
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: dev.cct.translatorapp.ui.HomeScreenActivity$$ExternalSyntheticLambda21
            @Override // java.lang.Runnable
            public final void run() {
                HomeScreenActivity.onStart$lambda$30(HomeScreenActivity.this);
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onStart$lambda$30(HomeScreenActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.checkClipboardData();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        updateDarkMode();
        super.onResume();
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: dev.cct.translatorapp.ui.HomeScreenActivity$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                HomeScreenActivity.onResume$lambda$31(HomeScreenActivity.this);
            }
        }, 100L);
        TextToSpeech textToSpeech = this.tts;
        if (textToSpeech != null) {
            textToSpeech.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResume$lambda$31(HomeScreenActivity this$0) {
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

    private final void showInterAd() {
        HomeScreenActivity homeScreenActivity = this;
        if (new Preferences(homeScreenActivity).getCheckBillingStatus() || new Preferences(homeScreenActivity).isAdRequestNull()) {
            return;
        }
        if (new Preferences(homeScreenActivity).isFirstTimeOpenAd()) {
            IntersContentAd.INSTANCE.getInstance().showMainIntersAd(this);
            return;
        }
        if (this.countAdClick > 0) {
            IntersContentAd.INSTANCE.getInstance().showMainIntersAd(this);
        }
        this.countAdClick++;
    }
}
