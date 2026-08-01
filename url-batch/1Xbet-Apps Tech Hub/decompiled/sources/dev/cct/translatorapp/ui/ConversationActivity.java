package dev.cct.translatorapp.ui;

import android.app.AlertDialog;
import android.app.Application;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.LocaleList;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.translator.alllanguagetranslations.ath.R;
import dev.cct.translatorapp.LanguageListModel;
import dev.cct.translatorapp.MainApplication;
import dev.cct.translatorapp.adapter.ConversationAdapter;
import dev.cct.translatorapp.ads.ConstantParam;
import dev.cct.translatorapp.ads.NativeSplashAd;
import dev.cct.translatorapp.customFirebaseEvents.TranslatorCustomFirebaseEvents;
import dev.cct.translatorapp.dataModel.ConversationModel;
import dev.cct.translatorapp.databinding.ActivityConversationBinding;
import dev.cct.translatorapp.databinding.DeleteDialogBinding;
import dev.cct.translatorapp.util.ExtensionFunctionKt;
import dev.cct.translatorapp.util.Preferences;
import dev.cct.translatorapp.viewModel.HistoryViewModel;
import io.ktor.http.LinkHeader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: ConversationActivity.kt */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u00106\u001a\u0002072\u0006\u00108\u001a\u000209H\u0014J\u0010\u0010:\u001a\u0002072\u0006\u0010;\u001a\u00020<H\u0002J\b\u0010=\u001a\u000207H\u0016J\b\u0010>\u001a\u000207H\u0002J\b\u0010?\u001a\u00020 H\u0002J\u0018\u0010@\u001a\u0002092\u0006\u0010A\u001a\u0002092\u0006\u0010B\u001a\u00020CH\u0002J\b\u0010D\u001a\u000207H\u0002J\b\u0010E\u001a\u000207H\u0017J\u0012\u0010F\u001a\u0002072\b\u0010G\u001a\u0004\u0018\u00010HH\u0014J\b\u0010I\u001a\u000207H\u0014J\u0010\u0010J\u001a\u0002072\u0006\u0010K\u001a\u00020\u0006H\u0016J\b\u0010L\u001a\u000207H\u0014J-\u0010M\u001a\u0002072\u0006\u0010N\u001a\u00020\u00062\u000e\u0010O\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0P2\u0006\u0010Q\u001a\u00020RH\u0016¢\u0006\u0002\u0010SJ\b\u0010T\u001a\u000207H\u0014J\b\u0010U\u001a\u000207H\u0014J\b\u0010V\u001a\u000207H\u0002J\u0010\u0010W\u001a\u0002072\u0006\u0010X\u001a\u00020YH\u0002J\b\u0010Z\u001a\u000207H\u0016J\b\u0010[\u001a\u000207H\u0002J\b\u0010\\\u001a\u000207H\u0002J\b\u0010]\u001a\u000207H\u0002J\u0010\u0010^\u001a\u0002072\u0006\u0010_\u001a\u00020\u0006H\u0016J\b\u0010`\u001a\u000207H\u0002J\b\u0010a\u001a\u000207H\u0002J\u0010\u0010b\u001a\u0002072\u0006\u0010c\u001a\u00020$H\u0016J\u0010\u0010d\u001a\u0002072\u0006\u0010e\u001a\u00020$H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,X\u0082.¢\u0006\u0002\n\u0000R\u001c\u0010.\u001a\u0010\u0012\f\u0012\n /*\u0004\u0018\u00010-0-0,X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u00100\u001a\u0004\u0018\u000101X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105¨\u0006f"}, d2 = {"Ldev/cct/translatorapp/ui/ConversationActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Ldev/cct/translatorapp/adapter/ConversationAdapter$Output;", "Landroid/speech/tts/TextToSpeech$OnInitListener;", "()V", "MICROPHONE_PERMISSION_REQUEST_CODE", "", "adapter", "Ldev/cct/translatorapp/adapter/ConversationAdapter;", "getAdapter", "()Ldev/cct/translatorapp/adapter/ConversationAdapter;", "setAdapter", "(Ldev/cct/translatorapp/adapter/ConversationAdapter;)V", "allConversations", "Ljava/util/ArrayList;", "Ldev/cct/translatorapp/dataModel/ConversationModel;", "Lkotlin/collections/ArrayList;", "binding", "Ldev/cct/translatorapp/databinding/ActivityConversationBinding;", "getBinding", "()Ldev/cct/translatorapp/databinding/ActivityConversationBinding;", "setBinding", "(Ldev/cct/translatorapp/databinding/ActivityConversationBinding;)V", "clickEventsFirebase", "Ldev/cct/translatorapp/customFirebaseEvents/TranslatorCustomFirebaseEvents;", "historyViewModel", "Ldev/cct/translatorapp/viewModel/HistoryViewModel;", "getHistoryViewModel", "()Ldev/cct/translatorapp/viewModel/HistoryViewModel;", "historyViewModel$delegate", "Lkotlin/Lazy;", "isAllDeleteConv", "", "isSelectedAllOn", "isShowMicInterstitials", "itemType", "", "loadingDialog", "Landroid/app/AlertDialog;", "pref", "Ldev/cct/translatorapp/util/Preferences;", "remoteConfig", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "resultLauncherConversation", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "speakLunchResult", "kotlin.jvm.PlatformType", "tts", "Landroid/speech/tts/TextToSpeech;", "getTts", "()Landroid/speech/tts/TextToSpeech;", "setTts", "(Landroid/speech/tts/TextToSpeech;)V", "attachBaseContext", "", "newBase", "Landroid/content/Context;", "deleteConversation", "delPressDialog", "Landroid/app/Dialog;", "hideDeleteBtn", "initListeners", "isMicrophonePermissionGranted", "languageChange", "context", "locale", "Ljava/util/Locale;", "loadAdapter", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onInit", NotificationCompat.CATEGORY_STATUS, "onPause", "onRequestPermissionsResult", "requestCode", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onStart", "requestMicrophonePermission", "setRecyclerView", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "showDeleteBtn", "showDialog", "showFbInterstitial", "showInterAd", "showLastCard", "position", "showLoadingDialog", "showNativeAd", "speak", "text", "speechInput", "language", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ConversationActivity extends AppCompatActivity implements ConversationAdapter.Output, TextToSpeech.OnInitListener {
    public ConversationAdapter adapter;
    public ActivityConversationBinding binding;
    private TranslatorCustomFirebaseEvents clickEventsFirebase;

    /* renamed from: historyViewModel$delegate, reason: from kotlin metadata */
    private final Lazy historyViewModel;
    private boolean isAllDeleteConv;
    private boolean isSelectedAllOn;
    private boolean isShowMicInterstitials;
    private AlertDialog loadingDialog;
    private Preferences pref;
    private FirebaseRemoteConfig remoteConfig;
    private ActivityResultLauncher<Intent> resultLauncherConversation;
    private ActivityResultLauncher<Intent> speakLunchResult;
    private TextToSpeech tts;
    private final int MICROPHONE_PERMISSION_REQUEST_CODE = 1;
    private String itemType = "";
    private ArrayList<ConversationModel> allConversations = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: private */
    public final void showInterAd() {
    }

    @Override // android.speech.tts.TextToSpeech.OnInitListener
    public void onInit(int status) {
    }

    public ConversationActivity() {
        final ConversationActivity conversationActivity = this;
        final Function0 function0 = null;
        this.historyViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(HistoryViewModel.class), new Function0<ViewModelStore>() { // from class: dev.cct.translatorapp.ui.ConversationActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: dev.cct.translatorapp.ui.ConversationActivity$historyViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                Application application = ConversationActivity.this.getApplication();
                Intrinsics.checkNotNull(application, "null cannot be cast to non-null type dev.cct.translatorapp.MainApplication");
                return new HistoryViewModel.HistoryViewModelFactory(((MainApplication) application).getRepository());
            }
        }, new Function0<CreationExtras>() { // from class: dev.cct.translatorapp.ui.ConversationActivity$special$$inlined$viewModels$default$3
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
                CreationExtras defaultViewModelCreationExtras = conversationActivity.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        });
        ActivityResultLauncher<Intent> registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: dev.cct.translatorapp.ui.ConversationActivity$$ExternalSyntheticLambda2
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                ConversationActivity.speakLunchResult$lambda$13(ConversationActivity.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResul…\n            }\n\n        }");
        this.speakLunchResult = registerForActivityResult;
    }

    public final ActivityConversationBinding getBinding() {
        ActivityConversationBinding activityConversationBinding = this.binding;
        if (activityConversationBinding != null) {
            return activityConversationBinding;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final void setBinding(ActivityConversationBinding activityConversationBinding) {
        Intrinsics.checkNotNullParameter(activityConversationBinding, "<set-?>");
        this.binding = activityConversationBinding;
    }

    public final ConversationAdapter getAdapter() {
        ConversationAdapter conversationAdapter = this.adapter;
        if (conversationAdapter != null) {
            return conversationAdapter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("adapter");
        return null;
    }

    public final void setAdapter(ConversationAdapter conversationAdapter) {
        Intrinsics.checkNotNullParameter(conversationAdapter, "<set-?>");
        this.adapter = conversationAdapter;
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
        ActivityConversationBinding inflate = ActivityConversationBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        setBinding(inflate);
        setContentView(getBinding().getRoot());
        this.remoteConfig = FirebaseRemoteConfig.getInstance();
        ConversationActivity conversationActivity = this;
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(conversationActivity);
        Intrinsics.checkNotNullExpressionValue(firebaseAnalytics, "getInstance(this)");
        this.clickEventsFirebase = new TranslatorCustomFirebaseEvents(firebaseAnalytics);
        this.pref = new Preferences(conversationActivity);
        this.tts = new TextToSpeech(conversationActivity, this);
        TextView textView = getBinding().inputLangTv;
        ArrayList<LanguageListModel> translateLangList = ExtensionFunctionKt.getTranslateLangList();
        Preferences preferences = this.pref;
        Preferences preferences2 = null;
        if (preferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pref");
            preferences = null;
        }
        textView.setText(getString(translateLangList.get(preferences.getConInputLang()).getLangName()));
        TextView textView2 = getBinding().outputLangTv;
        ArrayList<LanguageListModel> translateLangList2 = ExtensionFunctionKt.getTranslateLangList();
        Preferences preferences3 = this.pref;
        if (preferences3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pref");
            preferences3 = null;
        }
        textView2.setText(getString(translateLangList2.get(preferences3.getConOutputLang()).getLangName()));
        TextView textView3 = getBinding().inputLang;
        ArrayList<LanguageListModel> translateLangList3 = ExtensionFunctionKt.getTranslateLangList();
        Preferences preferences4 = this.pref;
        if (preferences4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pref");
            preferences4 = null;
        }
        textView3.setText(getString(translateLangList3.get(preferences4.getConInputLang()).getLangName()));
        TextView textView4 = getBinding().outputLang;
        ArrayList<LanguageListModel> translateLangList4 = ExtensionFunctionKt.getTranslateLangList();
        Preferences preferences5 = this.pref;
        if (preferences5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pref");
        } else {
            preferences2 = preferences5;
        }
        textView4.setText(getString(translateLangList4.get(preferences2.getConOutputLang()).getLangName()));
        getBinding().rippleInputMic.startRippleAnimation();
        getBinding().rippleOutputMic.startRippleAnimation();
        loadAdapter();
        initListeners();
        showNativeAd();
        ActivityResultLauncher<Intent> registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: dev.cct.translatorapp.ui.ConversationActivity$$ExternalSyntheticLambda5
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                ConversationActivity.onCreate$lambda$0((ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResul…          }\n            }");
        this.resultLauncherConversation = registerForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(ActivityResult activityResult) {
        if (activityResult.getResultCode() == -1) {
            Intent data = activityResult.getData();
            Log.d("stateText", "onCreate: " + (data != null ? data.getStringExtra("previous_state") : null));
        }
    }

    private final void showNativeAd() {
        ConversationActivity conversationActivity = this;
        NativeSplashAd nativeSplashAd = new NativeSplashAd(conversationActivity);
        String textPangleNativeAdId = ConstantParam.INSTANCE.getTextPangleNativeAdId();
        FrameLayout frameLayout = getBinding().adFrame;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.adFrame");
        ShimmerFrameLayout shimmerFrameLayout = getBinding().shimmerViewContainer1;
        Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "binding.shimmerViewContainer1");
        nativeSplashAd.loadPangleNative(R.layout.native_ad_layout, conversationActivity, textPangleNativeAdId, frameLayout, shimmerFrameLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadAdapter() {
        RecyclerView recyclerView = getBinding().recyclerView;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.recyclerView");
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        setAdapter(new ConversationAdapter(this));
        setRecyclerView(recyclerView);
    }

    private final void setRecyclerView(RecyclerView recyclerView) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new ConversationActivity$setRecyclerView$1(this, recyclerView, null), 3, null);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @Deprecated(message = "Deprecated in Java")
    public void onBackPressed() {
        showFbInterstitial();
    }

    private final void showFbInterstitial() {
        if (!this.isShowMicInterstitials) {
            showLoadingDialog();
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ConversationActivity$showFbInterstitial$1(this, null), 3, null);
        } else {
            finish();
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
            alertDialog2.setCancelable(false);
        }
    }

    private final void initListeners() {
        final ActivityConversationBinding binding = getBinding();
        binding.speakIcon.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.ConversationActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConversationActivity.initListeners$lambda$12$lambda$1(ConversationActivity.this, view);
            }
        });
        binding.crossIcon.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.ConversationActivity$$ExternalSyntheticLambda7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConversationActivity.initListeners$lambda$12$lambda$2(ConversationActivity.this, binding, view);
            }
        });
        binding.inputLanguageLayout.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.ConversationActivity$$ExternalSyntheticLambda8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConversationActivity.initListeners$lambda$12$lambda$3(ConversationActivity.this, view);
            }
        });
        binding.outputLanguageLayout.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.ConversationActivity$$ExternalSyntheticLambda9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConversationActivity.initListeners$lambda$12$lambda$4(ConversationActivity.this, view);
            }
        });
        getBinding().backBtn.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.ConversationActivity$$ExternalSyntheticLambda10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConversationActivity.initListeners$lambda$12$lambda$5(ConversationActivity.this, view);
            }
        });
        binding.inputMicIcon.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.ConversationActivity$$ExternalSyntheticLambda11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConversationActivity.initListeners$lambda$12$lambda$6(ConversationActivity.this, binding, view);
            }
        });
        binding.outputMicIcon.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.ConversationActivity$$ExternalSyntheticLambda12
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConversationActivity.initListeners$lambda$12$lambda$7(ConversationActivity.this, binding, view);
            }
        });
        binding.swapLangIcon.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.ConversationActivity$$ExternalSyntheticLambda13
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConversationActivity.initListeners$lambda$12$lambda$8(ConversationActivity.this, binding, view);
            }
        });
        binding.deleteIcon.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.ConversationActivity$$ExternalSyntheticLambda14
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConversationActivity.initListeners$lambda$12$lambda$9(ConversationActivity.this, binding, view);
            }
        });
        binding.selectAllLayout.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.ConversationActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConversationActivity.initListeners$lambda$12$lambda$10(ConversationActivity.this, binding, view);
            }
        });
        binding.deleteBtn.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.ConversationActivity$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConversationActivity.initListeners$lambda$12$lambda$11(ConversationActivity.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$12$lambda$1(ConversationActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        TextToSpeech textToSpeech = this$0.tts;
        if (textToSpeech != null) {
            textToSpeech.speak(this$0.getBinding().outputText.getText().toString(), 0, null, "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$12$lambda$2(ConversationActivity this$0, ActivityConversationBinding this_with, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        this$0.getBinding().inputText.setText("");
        this$0.getBinding().outputText.setText("");
        this_with.crossIcon.setVisibility(8);
        this$0.getBinding().scrollableConversation.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$12$lambda$3(ConversationActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) LangSelectionActivity.class);
        intent.putExtra(LinkHeader.Parameters.Type, "con_input");
        this$0.startActivity(intent);
        this$0.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        LangSelectionActivity.INSTANCE.setFromConversationText(true);
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$12$lambda$4(ConversationActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) LangSelectionActivity.class);
        intent.putExtra(LinkHeader.Parameters.Type, "con_output");
        this$0.startActivity(intent);
        this$0.finish();
        this$0.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        LangSelectionActivity.INSTANCE.setFromConversationText(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$12$lambda$5(ConversationActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showFbInterstitial();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$12$lambda$6(ConversationActivity this$0, ActivityConversationBinding this_with, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        TranslatorCustomFirebaseEvents translatorCustomFirebaseEvents = this$0.clickEventsFirebase;
        if (translatorCustomFirebaseEvents != null) {
            translatorCustomFirebaseEvents.inputMicConversation();
        }
        if (!this$0.isMicrophonePermissionGranted()) {
            this$0.requestMicrophonePermission();
            return;
        }
        this$0.itemType = "first_voice";
        if (ConstantParam.INSTANCE.getClickCountMic() == 1) {
            ConstantParam.INSTANCE.setClickCountMic(0);
            this$0.showLoadingDialog();
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this$0), null, null, new ConversationActivity$initListeners$1$6$1(this$0, this_with, null), 3, null);
        } else {
            this$0.isShowMicInterstitials = false;
            CharSequence text = this_with.inputLangTv.getText();
            Intrinsics.checkNotNull(text, "null cannot be cast to non-null type kotlin.String");
            this$0.speechInput((String) text);
        }
        ConstantParam constantParam = ConstantParam.INSTANCE;
        constantParam.setClickCountMic(constantParam.getClickCountMic() + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$12$lambda$7(ConversationActivity this$0, ActivityConversationBinding this_with, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        TranslatorCustomFirebaseEvents translatorCustomFirebaseEvents = this$0.clickEventsFirebase;
        if (translatorCustomFirebaseEvents != null) {
            translatorCustomFirebaseEvents.outputMicConversation();
        }
        if (!this$0.isMicrophonePermissionGranted()) {
            this$0.requestMicrophonePermission();
            return;
        }
        this$0.itemType = "second_voice";
        if (ConstantParam.INSTANCE.getClickCountMic() == 1) {
            ConstantParam.INSTANCE.setClickCountMic(0);
            this$0.showLoadingDialog();
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this$0), null, null, new ConversationActivity$initListeners$1$7$1(this$0, this_with, null), 3, null);
        } else {
            this$0.isShowMicInterstitials = false;
            CharSequence text = this_with.outputLangTv.getText();
            Intrinsics.checkNotNull(text, "null cannot be cast to non-null type kotlin.String");
            this$0.speechInput((String) text);
        }
        ConstantParam constantParam = ConstantParam.INSTANCE;
        constantParam.setClickCountMic(constantParam.getClickCountMic() + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$12$lambda$8(ConversationActivity this$0, ActivityConversationBinding this_with, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        Preferences preferences = this$0.pref;
        Preferences preferences2 = null;
        if (preferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pref");
            preferences = null;
        }
        int conInputLang = preferences.getConInputLang();
        Preferences preferences3 = this$0.pref;
        if (preferences3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pref");
            preferences3 = null;
        }
        int conOutputLang = preferences3.getConOutputLang();
        Preferences preferences4 = this$0.pref;
        if (preferences4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pref");
            preferences4 = null;
        }
        preferences4.setConInputLang(conOutputLang);
        Preferences preferences5 = this$0.pref;
        if (preferences5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pref");
            preferences5 = null;
        }
        preferences5.setConOutputLang(conInputLang);
        TextView textView = this_with.inputLangTv;
        ArrayList<LanguageListModel> translateLangList = ExtensionFunctionKt.getTranslateLangList();
        Preferences preferences6 = this$0.pref;
        if (preferences6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pref");
            preferences6 = null;
        }
        textView.setText(this$0.getString(translateLangList.get(preferences6.getConInputLang()).getLangName()));
        TextView textView2 = this_with.outputLangTv;
        ArrayList<LanguageListModel> translateLangList2 = ExtensionFunctionKt.getTranslateLangList();
        Preferences preferences7 = this$0.pref;
        if (preferences7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pref");
            preferences7 = null;
        }
        textView2.setText(this$0.getString(translateLangList2.get(preferences7.getConOutputLang()).getLangName()));
        TextView textView3 = this$0.getBinding().inputLang;
        ArrayList<LanguageListModel> translateLangList3 = ExtensionFunctionKt.getTranslateLangList();
        Preferences preferences8 = this$0.pref;
        if (preferences8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pref");
            preferences8 = null;
        }
        textView3.setText(this$0.getString(translateLangList3.get(preferences8.getConInputLang()).getLangName()));
        TextView textView4 = this$0.getBinding().outputLang;
        ArrayList<LanguageListModel> translateLangList4 = ExtensionFunctionKt.getTranslateLangList();
        Preferences preferences9 = this$0.pref;
        if (preferences9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pref");
        } else {
            preferences2 = preferences9;
        }
        textView4.setText(this$0.getString(translateLangList4.get(preferences2.getConOutputLang()).getLangName()));
        CharSequence text = this$0.getBinding().inputText.getText();
        this$0.getBinding().inputText.setText(this$0.getBinding().outputText.getText());
        this$0.getBinding().outputText.setText(text);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$12$lambda$9(ConversationActivity this$0, ActivityConversationBinding this_with, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        this$0.isSelectedAllOn = true;
        this_with.deleteIcon.setVisibility(8);
        this_with.selectAllLayout.setVisibility(0);
        this_with.selectAllCheckbox.setImageResource(R.drawable.unselected);
        this$0.getAdapter().showCheckBox();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$12$lambda$10(ConversationActivity this$0, ActivityConversationBinding this_with, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        this$0.isAllDeleteConv = true;
        this_with.selectAllCheckbox.setImageResource(R.drawable.selected_icon);
        this_with.deleteBtn.setVisibility(0);
        this_with.deleteIcon.setVisibility(8);
        ConversationAdapter adapter = this$0.getAdapter();
        ImageView selectAllCheckbox = this_with.selectAllCheckbox;
        Intrinsics.checkNotNullExpressionValue(selectAllCheckbox, "selectAllCheckbox");
        adapter.selectAllClicked(selectAllCheckbox);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$12$lambda$11(ConversationActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showDialog();
    }

    private final boolean isMicrophonePermissionGranted() {
        return ContextCompat.checkSelfPermission(this, "android.permission.RECORD_AUDIO") == 0;
    }

    private final void requestMicrophonePermission() {
        ConversationActivity conversationActivity = this;
        if (ActivityCompat.shouldShowRequestPermissionRationale(conversationActivity, "android.permission.RECORD_AUDIO")) {
            Toast.makeText(this, "Microphone permission is required to use the microphone.", 0).show();
        }
        ActivityCompat.requestPermissions(conversationActivity, new String[]{"android.permission.RECORD_AUDIO"}, this.MICROPHONE_PERMISSION_REQUEST_CODE);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == this.MICROPHONE_PERMISSION_REQUEST_CODE) {
            if ((!(grantResults.length == 0)) && grantResults[0] == 0) {
                return;
            }
            Toast.makeText(this, "Microphone permission denied.", 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void speechInput(String language) {
        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
        Iterator<LanguageListModel> it = ExtensionFunctionKt.getTranslateLangList().iterator();
        String str = "";
        while (it.hasNext()) {
            LanguageListModel next = it.next();
            if (Intrinsics.areEqual(getString(next.getLangName()), language)) {
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
    public static final void speakLunchResult$lambda$13(ConversationActivity this$0, ActivityResult activityResult) {
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
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new ConversationActivity$speakLunchResult$1$1(this$0, stringArrayListExtra.get(0), null), 3, null);
        }
    }

    private final void showDialog() {
        DeleteDialogBinding inflate = DeleteDialogBinding.inflate(getLayoutInflater());
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
        inflate.cancelBtn.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.ConversationActivity$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConversationActivity.showDialog$lambda$14(dialog, this, view);
            }
        });
        inflate.deleteBtn.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.ConversationActivity$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConversationActivity.showDialog$lambda$15(ConversationActivity.this, dialog, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDialog$lambda$14(Dialog delPressDialog, ConversationActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(delPressDialog, "$delPressDialog");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        delPressDialog.cancel();
        this$0.getAdapter().hideCheckBox();
        this$0.getBinding().deleteBtn.setVisibility(8);
        this$0.getBinding().selectAllLayout.setVisibility(8);
        this$0.getBinding().deleteIcon.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDialog$lambda$15(ConversationActivity this$0, Dialog delPressDialog, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(delPressDialog, "$delPressDialog");
        this$0.isSelectedAllOn = false;
        if (this$0.isAllDeleteConv) {
            this$0.getHistoryViewModel().delete();
            delPressDialog.dismiss();
            this$0.isAllDeleteConv = false;
            this$0.getBinding().deleteBtn.setVisibility(8);
            this$0.getBinding().selectAllLayout.setVisibility(8);
            if (this$0.allConversations.isEmpty()) {
                this$0.getBinding().deleteIcon.setVisibility(4);
                this$0.getBinding().conversation.setVisibility(0);
            } else {
                this$0.getBinding().deleteIcon.setVisibility(4);
            }
            this$0.loadAdapter();
        } else {
            this$0.deleteConversation(delPressDialog);
        }
        TranslatorCustomFirebaseEvents translatorCustomFirebaseEvents = this$0.clickEventsFirebase;
        if (translatorCustomFirebaseEvents != null) {
            translatorCustomFirebaseEvents.deleteConversation();
        }
    }

    private final void deleteConversation(Dialog delPressDialog) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new ConversationActivity$deleteConversation$1(getAdapter().getArrayToDelete(), this, delPressDialog, null), 3, null);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
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
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        TextToSpeech textToSpeech = this.tts;
        if (textToSpeech != null) {
            textToSpeech.stop();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        TextToSpeech textToSpeech = this.tts;
        if (textToSpeech != null) {
            textToSpeech.shutdown();
        }
        LunchingView.INSTANCE.setAdLoaded(false);
    }

    @Override // dev.cct.translatorapp.adapter.ConversationAdapter.Output
    public void speak(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        TextToSpeech textToSpeech = this.tts;
        Intrinsics.checkNotNull(textToSpeech);
        textToSpeech.speak(text, 0, null, "");
    }

    @Override // dev.cct.translatorapp.adapter.ConversationAdapter.Output
    public void showDeleteBtn() {
        this.isAllDeleteConv = false;
        getBinding().deleteBtn.setVisibility(0);
    }

    @Override // dev.cct.translatorapp.adapter.ConversationAdapter.Output
    public void hideDeleteBtn() {
        getBinding().deleteBtn.setVisibility(4);
    }

    @Override // dev.cct.translatorapp.adapter.ConversationAdapter.Output
    public void showLastCard(int position) {
        getBinding().recyclerView.scrollToPosition(position);
    }
}
