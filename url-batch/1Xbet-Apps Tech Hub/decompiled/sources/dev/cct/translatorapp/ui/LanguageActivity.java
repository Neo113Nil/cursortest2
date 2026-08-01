package dev.cct.translatorapp.ui;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.ads.NativeAdLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.translator.alllanguagetranslations.ath.R;
import dev.cct.translatorapp.adapter.LanguageAdapter;
import dev.cct.translatorapp.ads.ConstantParam;
import dev.cct.translatorapp.ads.NativeSplashAd;
import dev.cct.translatorapp.customFirebaseEvents.TranslatorCustomFirebaseEvents;
import dev.cct.translatorapp.databinding.ActivityLanguageBinding;
import dev.cct.translatorapp.util.ExtensionFunction;
import dev.cct.translatorapp.util.ExtensionFunctionKt;
import dev.cct.translatorapp.util.Preferences;
import io.ktor.http.LinkHeader;
import java.util.Locale;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LanguageActivity.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 02\u00020\u0001:\u00010B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0014J\b\u0010!\u001a\u00020\u001eH\u0002J\b\u0010\"\u001a\u00020\u001eH\u0002J\u0018\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020&H\u0002J\b\u0010'\u001a\u00020\u001eH\u0002J\b\u0010(\u001a\u00020\u001eH\u0002J\b\u0010)\u001a\u00020\u001eH\u0017J\u0012\u0010*\u001a\u00020\u001e2\b\u0010+\u001a\u0004\u0018\u00010,H\u0014J\u0010\u0010-\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020\u0018H\u0002J\b\u0010/\u001a\u00020\u001eH\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u00061"}, d2 = {"Ldev/cct/translatorapp/ui/LanguageActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "adapter", "Ldev/cct/translatorapp/adapter/LanguageAdapter;", "getAdapter", "()Ldev/cct/translatorapp/adapter/LanguageAdapter;", "setAdapter", "(Ldev/cct/translatorapp/adapter/LanguageAdapter;)V", "appLangTv", "Landroid/widget/TextView;", "binding", "Ldev/cct/translatorapp/databinding/ActivityLanguageBinding;", "getBinding", "()Ldev/cct/translatorapp/databinding/ActivityLanguageBinding;", "setBinding", "(Ldev/cct/translatorapp/databinding/ActivityLanguageBinding;)V", "clickEventsFirebase", "Ldev/cct/translatorapp/customFirebaseEvents/TranslatorCustomFirebaseEvents;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "remoteConfig", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", LinkHeader.Parameters.Type, "", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "attachBaseContext", "", "newBase", "Landroid/content/Context;", "backToPage", "initListeners", "languageChange", "context", "locale", "Ljava/util/Locale;", "loadAdapter", "loadingNavigationScreen", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setLocale", "lang", "showNativeAd", "Companion", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LanguageActivity extends AppCompatActivity {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static boolean isFromSettingScreen;
    public LanguageAdapter adapter;
    private TextView appLangTv;
    public ActivityLanguageBinding binding;
    private TranslatorCustomFirebaseEvents clickEventsFirebase;
    private RecyclerView recyclerView;
    private FirebaseRemoteConfig remoteConfig;
    private String type = "";

    public final ActivityLanguageBinding getBinding() {
        ActivityLanguageBinding activityLanguageBinding = this.binding;
        if (activityLanguageBinding != null) {
            return activityLanguageBinding;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final void setBinding(ActivityLanguageBinding activityLanguageBinding) {
        Intrinsics.checkNotNullParameter(activityLanguageBinding, "<set-?>");
        this.binding = activityLanguageBinding;
    }

    public final LanguageAdapter getAdapter() {
        LanguageAdapter languageAdapter = this.adapter;
        if (languageAdapter != null) {
            return languageAdapter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("adapter");
        return null;
    }

    public final void setAdapter(LanguageAdapter languageAdapter) {
        Intrinsics.checkNotNullParameter(languageAdapter, "<set-?>");
        this.adapter = languageAdapter;
    }

    public final String getType() {
        return this.type;
    }

    public final void setType(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.type = str;
    }

    /* compiled from: LanguageActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ldev/cct/translatorapp/ui/LanguageActivity$Companion;", "", "()V", "isFromSettingScreen", "", "()Z", "setFromSettingScreen", "(Z)V", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean isFromSettingScreen() {
            return LanguageActivity.isFromSettingScreen;
        }

        public final void setFromSettingScreen(boolean z) {
            LanguageActivity.isFromSettingScreen = z;
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
        ActivityLanguageBinding inflate = ActivityLanguageBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        setBinding(inflate);
        setContentView(getBinding().getRoot());
        this.remoteConfig = FirebaseRemoteConfig.getInstance();
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(this);
        Intrinsics.checkNotNullExpressionValue(firebaseAnalytics, "getInstance(this)");
        this.clickEventsFirebase = new TranslatorCustomFirebaseEvents(firebaseAnalytics);
        TextView textView = getBinding().applyLangBtn;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.applyLangBtn");
        this.appLangTv = textView;
        RecyclerView recyclerView = getBinding().langRec;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.langRec");
        this.recyclerView = recyclerView;
        String stringExtra = getIntent().getStringExtra("splash");
        if (stringExtra != null) {
            this.type = stringExtra;
        }
        showNativeAd();
        loadAdapter();
        initListeners();
        getBinding().textView.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.LanguageActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LanguageActivity.onCreate$lambda$0(LanguageActivity.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(LanguageActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) SettingActivity.class);
        intent.putExtra("InputText", "inputText.text");
        this$0.startActivity(intent);
    }

    private final void showNativeAd() {
        if (ConstantParam.INSTANCE.isEnableLanguageAdmobOrFbNativeAd()) {
            Log.d("languageNativeAd", "checkNativeLoadAdStatus: admob");
            getBinding().adFbLayout.setVisibility(8);
            getBinding().adLayout.setVisibility(0);
            LanguageActivity languageActivity = this;
            String languageAdmobNativeAdId = ConstantParam.INSTANCE.getLanguageAdmobNativeAdId();
            FrameLayout frameLayout = getBinding().adFrame;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.adFrame");
            ShimmerFrameLayout shimmerFrameLayout = getBinding().shimmerViewContainer1;
            Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "binding.shimmerViewContainer1");
            new NativeSplashAd(languageActivity).loadLargeNativeAds(R.layout.ad_native_layout, this, languageActivity, languageAdmobNativeAdId, frameLayout, shimmerFrameLayout);
            return;
        }
        Log.d("languageNativeAd", "checkNativeLoadAdStatus: fb ");
        getBinding().adFbLayout.setVisibility(0);
        getBinding().adLayout.setVisibility(8);
        LanguageActivity languageActivity2 = this;
        NativeSplashAd nativeSplashAd = new NativeSplashAd(languageActivity2);
        String languageFbNativeAdId = ConstantParam.INSTANCE.getLanguageFbNativeAdId();
        NativeAdLayout nativeAdLayout = getBinding().nativeAdContainer;
        Intrinsics.checkNotNullExpressionValue(nativeAdLayout, "binding.nativeAdContainer");
        ShimmerFrameLayout shimmerFrameLayout2 = getBinding().shimmerViewContainer;
        Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout2, "binding.shimmerViewContainer");
        nativeSplashAd.loadFbNativeAd(R.layout.large_facebook_native_ad, languageActivity2, languageFbNativeAdId, nativeAdLayout, shimmerFrameLayout2);
    }

    private final void loadAdapter() {
        RecyclerView recyclerView = this.recyclerView;
        RecyclerView recyclerView2 = null;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
            recyclerView = null;
        }
        LanguageActivity languageActivity = this;
        recyclerView.setLayoutManager(new LinearLayoutManager(languageActivity));
        setAdapter(new LanguageAdapter(languageActivity));
        RecyclerView recyclerView3 = this.recyclerView;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
        } else {
            recyclerView2 = recyclerView3;
        }
        recyclerView2.setAdapter(getAdapter());
        getAdapter().setData(ExtensionFunctionKt.getAppLanguageList());
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @Deprecated(message = "Deprecated in Java")
    public void onBackPressed() {
        backToPage();
    }

    private final void backToPage() {
        if (isFromSettingScreen) {
            ExtensionFunction.INSTANCE.openActivity(this, SettingActivity.class);
            finish();
            overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
            isFromSettingScreen = false;
            return;
        }
        ExtensionFunction.INSTANCE.openActivity(this, HomeScreenActivity.class);
        finish();
        overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
    }

    private final void initListeners() {
        ActivityLanguageBinding binding = getBinding();
        binding.backBtn.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.LanguageActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LanguageActivity.initListeners$lambda$3$lambda$1(LanguageActivity.this, view);
            }
        });
        binding.applyLangBtn.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.LanguageActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LanguageActivity.initListeners$lambda$3$lambda$2(LanguageActivity.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$3$lambda$1(LanguageActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.backToPage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$3$lambda$2(LanguageActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Preferences preferences = new Preferences(this$0);
        String langCode = ExtensionFunctionKt.getAppLanguageList().get(preferences.getAppSelectedLang()).getLangCode();
        preferences.setSettingSelectedLang(preferences.getAppSelectedLang());
        if (!Intrinsics.areEqual(preferences.getAppLang(), langCode)) {
            this$0.setLocale(langCode);
            preferences.setAppLang(langCode);
        }
        this$0.loadingNavigationScreen();
    }

    private final void loadingNavigationScreen() {
        if (!Intrinsics.areEqual(this.type, "")) {
            ExtensionFunction.INSTANCE.openActivity(this, PremiumActivity.class);
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        } else {
            ExtensionFunction.INSTANCE.openActivity(this, HomeScreenActivity.class);
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        }
    }

    private final void setLocale(String lang) {
        Log.e("TAG", "setLocale: " + lang);
        SharedPreferences.Editor edit = getSharedPreferences(getPackageName(), 0).edit();
        edit.putString("code", lang);
        edit.commit();
    }
}
