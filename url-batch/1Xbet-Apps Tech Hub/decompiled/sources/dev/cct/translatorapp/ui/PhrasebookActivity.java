package dev.cct.translatorapp.ui;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.translator.alllanguagetranslations.ath.R;
import dev.cct.translatorapp.LanguageListModel;
import dev.cct.translatorapp.adapter.PhrasebookAdapter;
import dev.cct.translatorapp.ads.ConstantParam;
import dev.cct.translatorapp.customFirebaseEvents.TranslatorCustomFirebaseEvents;
import dev.cct.translatorapp.dataModel.PhrasebookModel;
import dev.cct.translatorapp.databinding.ActivityPhrasebookBinding;
import dev.cct.translatorapp.databinding.NetworkBottomDialogBinding;
import dev.cct.translatorapp.util.ExtensionFunction;
import dev.cct.translatorapp.util.ExtensionFunctionKt;
import dev.cct.translatorapp.util.Preferences;
import io.ktor.http.LinkHeader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: PhrasebookActivity.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0014J\b\u00100\u001a\u00020-H\u0002J\u0006\u00101\u001a\u00020-J\u0018\u00102\u001a\u00020/2\u0006\u00103\u001a\u00020/2\u0006\u00104\u001a\u000205H\u0002J\b\u00106\u001a\u00020-H\u0016J\u0012\u00107\u001a\u00020-2\b\u00108\u001a\u0004\u0018\u000109H\u0014J\b\u0010:\u001a\u00020-H\u0002J\b\u0010;\u001a\u00020-H\u0002J\b\u0010<\u001a\u00020-H\u0016J\b\u0010=\u001a\u00020-H\u0002J\b\u0010>\u001a\u00020-H\u0002J\b\u0010?\u001a\u00020-H\u0002J\b\u0010@\u001a\u00020-H\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u001a0\u0019j\b\u0012\u0004\u0012\u00020\u001a`\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010$\u001a\u00020%X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006A"}, d2 = {"Ldev/cct/translatorapp/ui/PhrasebookActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Ldev/cct/translatorapp/adapter/PhrasebookAdapter$Test;", "()V", "adapter", "Ldev/cct/translatorapp/adapter/PhrasebookAdapter;", "getAdapter", "()Ldev/cct/translatorapp/adapter/PhrasebookAdapter;", "setAdapter", "(Ldev/cct/translatorapp/adapter/PhrasebookAdapter;)V", "binding", "Ldev/cct/translatorapp/databinding/ActivityPhrasebookBinding;", "getBinding", "()Ldev/cct/translatorapp/databinding/ActivityPhrasebookBinding;", "setBinding", "(Ldev/cct/translatorapp/databinding/ActivityPhrasebookBinding;)V", "clickEventsFirebase", "Ldev/cct/translatorapp/customFirebaseEvents/TranslatorCustomFirebaseEvents;", "getResult", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "isShowMicInterstitials", "", "list", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getList", "()Ljava/util/ArrayList;", "setList", "(Ljava/util/ArrayList;)V", "loadingDialog", "Landroid/app/AlertDialog;", "pref", "Ldev/cct/translatorapp/util/Preferences;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "remoteConfig", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "attachBaseContext", "", "newBase", "Landroid/content/Context;", "hideSearch", "initListeners", "languageChange", "context", "locale", "Ljava/util/Locale;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showBannerAd", "showBottomSheetNetwork", "showDialog", "showFbInterstitial", "showLoadingDialog", "showNativeAd", "translate", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PhrasebookActivity extends AppCompatActivity implements PhrasebookAdapter.Test {
    public PhrasebookAdapter adapter;
    public ActivityPhrasebookBinding binding;
    private TranslatorCustomFirebaseEvents clickEventsFirebase;
    private final ActivityResultLauncher<Intent> getResult;
    private boolean isShowMicInterstitials;
    private ArrayList<String> list = new ArrayList<>();
    private AlertDialog loadingDialog;
    private Preferences pref;
    public RecyclerView recyclerView;
    private FirebaseRemoteConfig remoteConfig;

    public PhrasebookActivity() {
        ActivityResultLauncher<Intent> registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: dev.cct.translatorapp.ui.PhrasebookActivity$$ExternalSyntheticLambda7
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                PhrasebookActivity.getResult$lambda$9(PhrasebookActivity.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResul…)\n            }\n        }");
        this.getResult = registerForActivityResult;
    }

    public final ActivityPhrasebookBinding getBinding() {
        ActivityPhrasebookBinding activityPhrasebookBinding = this.binding;
        if (activityPhrasebookBinding != null) {
            return activityPhrasebookBinding;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final void setBinding(ActivityPhrasebookBinding activityPhrasebookBinding) {
        Intrinsics.checkNotNullParameter(activityPhrasebookBinding, "<set-?>");
        this.binding = activityPhrasebookBinding;
    }

    public final RecyclerView getRecyclerView() {
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
        return null;
    }

    public final void setRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<set-?>");
        this.recyclerView = recyclerView;
    }

    public final PhrasebookAdapter getAdapter() {
        PhrasebookAdapter phrasebookAdapter = this.adapter;
        if (phrasebookAdapter != null) {
            return phrasebookAdapter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("adapter");
        return null;
    }

    public final void setAdapter(PhrasebookAdapter phrasebookAdapter) {
        Intrinsics.checkNotNullParameter(phrasebookAdapter, "<set-?>");
        this.adapter = phrasebookAdapter;
    }

    public final ArrayList<String> getList() {
        return this.list;
    }

    public final void setList(ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.list = arrayList;
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
        ActivityPhrasebookBinding inflate = ActivityPhrasebookBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        setBinding(inflate);
        setContentView(getBinding().getRoot());
        this.remoteConfig = FirebaseRemoteConfig.getInstance();
        PhrasebookActivity phrasebookActivity = this;
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(phrasebookActivity);
        Intrinsics.checkNotNullExpressionValue(firebaseAnalytics, "getInstance(this)");
        this.clickEventsFirebase = new TranslatorCustomFirebaseEvents(firebaseAnalytics);
        this.pref = new Preferences(phrasebookActivity);
        TextView textView = getBinding().inputLangTv;
        ArrayList<LanguageListModel> translateLangList = ExtensionFunctionKt.getTranslateLangList();
        Preferences preferences = this.pref;
        Preferences preferences2 = null;
        if (preferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pref");
            preferences = null;
        }
        textView.setText(getString(translateLangList.get(preferences.getPhInputLang()).getLangName()));
        TextView textView2 = getBinding().outputLangTv;
        ArrayList<LanguageListModel> translateLangList2 = ExtensionFunctionKt.getTranslateLangList();
        Preferences preferences3 = this.pref;
        if (preferences3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pref");
        } else {
            preferences2 = preferences3;
        }
        textView2.setText(getString(translateLangList2.get(preferences2.getPhOutputLang()).getLangName()));
        RecyclerView recyclerView = getBinding().phrasebookRecycler;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.phrasebookRecycler");
        setRecyclerView(recyclerView);
        getRecyclerView().setLayoutManager(new LinearLayoutManager(phrasebookActivity));
        setAdapter(new PhrasebookAdapter(phrasebookActivity, this));
        getRecyclerView().setAdapter(getAdapter());
        if (ExtensionFunction.INSTANCE.checkInternetConnection(phrasebookActivity)) {
            translate();
        } else {
            this.list.clear();
            Iterator<PhrasebookModel> it = ExtensionFunctionKt.getCategoryList().iterator();
            while (it.hasNext()) {
                this.list.add(it.next().getCategory());
            }
            getAdapter().setData(this.list);
            getBinding().progressBar.setVisibility(4);
        }
        showNativeAd();
        initListeners();
    }

    private final void showNativeAd() {
        if (!new Preferences(this).getCheckBillingStatus()) {
            getBinding().bannerContainer.setVisibility(0);
            showBannerAd();
        } else {
            getBinding().bannerContainer.setVisibility(8);
        }
    }

    private final void showBannerAd() {
        if (ConstantParam.INSTANCE.getFbBannerEnableOrNot()) {
            Log.d("languageNativeAd", "checkNativeLoadAdStatus: admob");
            getBinding().fbBannerContainer.setVisibility(8);
            getBinding().admobBannerContainer.setVisibility(0);
            String phraseCollapsibleInterstitialsAdId = ConstantParam.INSTANCE.getPhraseCollapsibleInterstitialsAdId();
            FrameLayout frameLayout = getBinding().smallBannerLayout.bannerAdLayout;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.smallBannerLayout.bannerAdLayout");
            ShimmerFrameLayout shimmerFrameLayout = getBinding().smallBannerLayout.shimmerViewContainer;
            Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "binding.smallBannerLayout.shimmerViewContainer");
            ConstantParam.INSTANCE.getBannerCollapsibleAd().loadBanner(this, phraseCollapsibleInterstitialsAdId, frameLayout, shimmerFrameLayout);
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

    private final void translate() {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new PhrasebookActivity$translate$1(objectRef, this, null), 3, null);
    }

    public final void initListeners() {
        final ActivityPhrasebookBinding binding = getBinding();
        binding.backFromPhrasebookIcon.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.PhrasebookActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhrasebookActivity.initListeners$lambda$7$lambda$0(PhrasebookActivity.this, view);
            }
        });
        binding.inputLanguageLayout.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.PhrasebookActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhrasebookActivity.initListeners$lambda$7$lambda$1(PhrasebookActivity.this, view);
            }
        });
        binding.outputLanguageLayout.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.PhrasebookActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhrasebookActivity.initListeners$lambda$7$lambda$2(PhrasebookActivity.this, view);
            }
        });
        binding.swapLangIcon.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.PhrasebookActivity$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhrasebookActivity.initListeners$lambda$7$lambda$3(PhrasebookActivity.this, binding, view);
            }
        });
        binding.searchPhrasebookIcon.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.PhrasebookActivity$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhrasebookActivity.initListeners$lambda$7$lambda$4(ActivityPhrasebookBinding.this, view);
            }
        });
        binding.backFromSearchIcon.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.PhrasebookActivity$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhrasebookActivity.initListeners$lambda$7$lambda$5(PhrasebookActivity.this, view);
            }
        });
        binding.searchCategory.addTextChangedListener(new TextWatcher() { // from class: dev.cct.translatorapp.ui.PhrasebookActivity$initListeners$1$7
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence searchedText, int start, int before, int count) {
                PhrasebookActivity.this.getAdapter().searchCategoryList(searchedText, PhrasebookActivity.this.getList());
            }
        });
        binding.crossIcon.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.PhrasebookActivity$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhrasebookActivity.initListeners$lambda$7$lambda$6(PhrasebookActivity.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$7$lambda$0(PhrasebookActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
        this$0.overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$7$lambda$1(PhrasebookActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) LangSelectionActivity.class);
        intent.putExtra(LinkHeader.Parameters.Type, "ph_input");
        this$0.startActivity(intent);
        this$0.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        LangSelectionActivity.INSTANCE.setFromPhrasesText(true);
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$7$lambda$2(PhrasebookActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) LangSelectionActivity.class);
        intent.putExtra(LinkHeader.Parameters.Type, "ph_output");
        this$0.getResult.launch(intent);
        this$0.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        LangSelectionActivity.INSTANCE.setFromPhrasesText(true);
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$7$lambda$3(PhrasebookActivity this$0, ActivityPhrasebookBinding this_with, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        Preferences preferences = this$0.pref;
        Preferences preferences2 = null;
        if (preferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pref");
            preferences = null;
        }
        int phInputLang = preferences.getPhInputLang();
        Preferences preferences3 = this$0.pref;
        if (preferences3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pref");
            preferences3 = null;
        }
        int phOutputLang = preferences3.getPhOutputLang();
        Preferences preferences4 = this$0.pref;
        if (preferences4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pref");
            preferences4 = null;
        }
        preferences4.setPhInputLang(phOutputLang);
        Preferences preferences5 = this$0.pref;
        if (preferences5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pref");
            preferences5 = null;
        }
        preferences5.setPhOutputLang(phInputLang);
        TextView textView = this_with.inputLangTv;
        ArrayList<LanguageListModel> translateLangList = ExtensionFunctionKt.getTranslateLangList();
        Preferences preferences6 = this$0.pref;
        if (preferences6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pref");
            preferences6 = null;
        }
        textView.setText(this$0.getString(translateLangList.get(preferences6.getPhInputLang()).getLangName()));
        TextView textView2 = this_with.outputLangTv;
        ArrayList<LanguageListModel> translateLangList2 = ExtensionFunctionKt.getTranslateLangList();
        Preferences preferences7 = this$0.pref;
        if (preferences7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pref");
        } else {
            preferences2 = preferences7;
        }
        textView2.setText(this$0.getString(translateLangList2.get(preferences2.getPhOutputLang()).getLangName()));
        if (ExtensionFunction.INSTANCE.checkInternetConnection(this$0)) {
            this$0.translate();
        } else {
            this$0.showBottomSheetNetwork();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$7$lambda$4(ActivityPhrasebookBinding this_with, View view) {
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        this_with.searchCategory.setVisibility(0);
        this_with.searchLayout.setVisibility(0);
        this_with.searchCategory.setEnabled(true);
        this_with.searchPhrasebookIcon.setVisibility(8);
        this_with.crossIcon.setVisibility(0);
        this_with.phrasebookTv.setVisibility(8);
        this_with.backFromPhrasebookIcon.setVisibility(8);
        this_with.backFromSearchIcon.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$7$lambda$5(PhrasebookActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideSearch();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$7$lambda$6(PhrasebookActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideSearch();
    }

    private final void showBottomSheetNetwork() {
        NetworkBottomDialogBinding inflate = NetworkBottomDialogBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this);
        bottomSheetDialog.setContentView(inflate.getRoot());
        inflate.okBtn.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.PhrasebookActivity$$ExternalSyntheticLambda8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhrasebookActivity.showBottomSheetNetwork$lambda$8(BottomSheetDialog.this, view);
            }
        });
        bottomSheetDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showBottomSheetNetwork$lambda$8(BottomSheetDialog dialog, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        dialog.dismiss();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        finish();
        overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
    }

    private final void showFbInterstitial() {
        if (!this.isShowMicInterstitials) {
            showLoadingDialog();
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new PhrasebookActivity$showFbInterstitial$1(this, null), 3, null);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getResult$lambda$9(PhrasebookActivity this$0, ActivityResult activityResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (activityResult.getResultCode() == -1) {
            TextView textView = this$0.getBinding().outputLangTv;
            ArrayList<LanguageListModel> translateLangList = ExtensionFunctionKt.getTranslateLangList();
            Preferences preferences = this$0.pref;
            if (preferences == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pref");
                preferences = null;
            }
            textView.setText(this$0.getString(translateLangList.get(preferences.getPhOutputLang()).getLangName()));
        }
    }

    private final void hideSearch() {
        ActivityPhrasebookBinding binding = getBinding();
        binding.searchCategory.setText("");
        binding.searchCategory.setVisibility(8);
        binding.searchLayout.setVisibility(8);
        binding.searchCategory.setEnabled(false);
        binding.crossIcon.setVisibility(8);
        binding.phrasebookTv.setVisibility(0);
        binding.searchPhrasebookIcon.setVisibility(0);
        binding.backFromPhrasebookIcon.setVisibility(0);
        binding.backFromSearchIcon.setVisibility(8);
    }

    @Override // dev.cct.translatorapp.adapter.PhrasebookAdapter.Test
    public void showDialog() {
        showBottomSheetNetwork();
    }
}
