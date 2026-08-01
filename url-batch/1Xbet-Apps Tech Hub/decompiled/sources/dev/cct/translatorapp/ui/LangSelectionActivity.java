package dev.cct.translatorapp.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.translator.alllanguagetranslations.ath.R;
import dev.cct.translatorapp.LanguageListModel;
import dev.cct.translatorapp.adapter.IOLanguages;
import dev.cct.translatorapp.adapter.LangSelAdapter;
import dev.cct.translatorapp.ads.ConstantParam;
import dev.cct.translatorapp.customFirebaseEvents.TranslatorCustomFirebaseEvents;
import dev.cct.translatorapp.databinding.ActivityLangselectionBinding;
import dev.cct.translatorapp.util.ExtensionFunction;
import dev.cct.translatorapp.util.ExtensionFunctionKt;
import dev.cct.translatorapp.util.Preferences;
import io.ktor.http.LinkHeader;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LangSelectionActivity.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 52\u00020\u00012\u00020\u0002:\u00015B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u001bH\u0002J\b\u0010\u001f\u001a\u00020\u001bH\u0002J\u0018\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020\u001bH\u0016J\u0012\u0010%\u001a\u00020\u001b2\b\u0010&\u001a\u0004\u0018\u00010'H\u0014J\u0018\u0010(\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0016J\u0018\u0010-\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0016J\u0018\u0010.\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0016J\u0018\u0010/\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0016J\u0018\u00100\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0016J\u0018\u00101\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0016J\u0018\u00102\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0016J\u0018\u00103\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0016J\u0018\u00104\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u00066"}, d2 = {"Ldev/cct/translatorapp/ui/LangSelectionActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Ldev/cct/translatorapp/adapter/IOLanguages;", "()V", "adapter", "Ldev/cct/translatorapp/adapter/LangSelAdapter;", "getAdapter", "()Ldev/cct/translatorapp/adapter/LangSelAdapter;", "setAdapter", "(Ldev/cct/translatorapp/adapter/LangSelAdapter;)V", "binding", "Ldev/cct/translatorapp/databinding/ActivityLangselectionBinding;", "getBinding", "()Ldev/cct/translatorapp/databinding/ActivityLangselectionBinding;", "setBinding", "(Ldev/cct/translatorapp/databinding/ActivityLangselectionBinding;)V", "clickEventsFirebase", "Ldev/cct/translatorapp/customFirebaseEvents/TranslatorCustomFirebaseEvents;", "inputTxt", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "attachBaseContext", "", "newBase", "Landroid/content/Context;", "backPressFUn", "initListeners", "languageChange", "context", "locale", "Ljava/util/Locale;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setConInputLang", "pos", "", "itemsViewModel", "Ldev/cct/translatorapp/LanguageListModel;", "setConOutputLang", "setInputLang", "setOutputLang", "setPhInputLang", "setPhOutputLang", "setSpeechLang", "setWidgetInputLang", "setWidgetOutputLang", "Companion", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LangSelectionActivity extends AppCompatActivity implements IOLanguages {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static boolean isFromConversationText;
    private static boolean isFromPhrasesText;
    private static boolean isFromSpeechToText;
    private static boolean isFromTranslationText;
    public LangSelAdapter adapter;
    public ActivityLangselectionBinding binding;
    private TranslatorCustomFirebaseEvents clickEventsFirebase;
    private String inputTxt;
    public RecyclerView recyclerView;

    public final ActivityLangselectionBinding getBinding() {
        ActivityLangselectionBinding activityLangselectionBinding = this.binding;
        if (activityLangselectionBinding != null) {
            return activityLangselectionBinding;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final void setBinding(ActivityLangselectionBinding activityLangselectionBinding) {
        Intrinsics.checkNotNullParameter(activityLangselectionBinding, "<set-?>");
        this.binding = activityLangselectionBinding;
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

    public final LangSelAdapter getAdapter() {
        LangSelAdapter langSelAdapter = this.adapter;
        if (langSelAdapter != null) {
            return langSelAdapter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("adapter");
        return null;
    }

    public final void setAdapter(LangSelAdapter langSelAdapter) {
        Intrinsics.checkNotNullParameter(langSelAdapter, "<set-?>");
        this.adapter = langSelAdapter;
    }

    /* compiled from: LangSelectionActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0005\"\u0004\b\t\u0010\u0007R\u001a\u0010\n\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0005\"\u0004\b\u000b\u0010\u0007R\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0005\"\u0004\b\r\u0010\u0007¨\u0006\u000e"}, d2 = {"Ldev/cct/translatorapp/ui/LangSelectionActivity$Companion;", "", "()V", "isFromConversationText", "", "()Z", "setFromConversationText", "(Z)V", "isFromPhrasesText", "setFromPhrasesText", "isFromSpeechToText", "setFromSpeechToText", "isFromTranslationText", "setFromTranslationText", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean isFromSpeechToText() {
            return LangSelectionActivity.isFromSpeechToText;
        }

        public final void setFromSpeechToText(boolean z) {
            LangSelectionActivity.isFromSpeechToText = z;
        }

        public final boolean isFromConversationText() {
            return LangSelectionActivity.isFromConversationText;
        }

        public final void setFromConversationText(boolean z) {
            LangSelectionActivity.isFromConversationText = z;
        }

        public final boolean isFromPhrasesText() {
            return LangSelectionActivity.isFromPhrasesText;
        }

        public final void setFromPhrasesText(boolean z) {
            LangSelectionActivity.isFromPhrasesText = z;
        }

        public final boolean isFromTranslationText() {
            return LangSelectionActivity.isFromTranslationText;
        }

        public final void setFromTranslationText(boolean z) {
            LangSelectionActivity.isFromTranslationText = z;
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
        ActivityLangselectionBinding inflate = ActivityLangselectionBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        setBinding(inflate);
        setContentView(getBinding().getRoot());
        LangSelectionActivity langSelectionActivity = this;
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(langSelectionActivity);
        Intrinsics.checkNotNullExpressionValue(firebaseAnalytics, "getInstance(this)");
        this.clickEventsFirebase = new TranslatorCustomFirebaseEvents(firebaseAnalytics);
        RecyclerView recyclerView = getBinding().langRec;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.langRec");
        setRecyclerView(recyclerView);
        getRecyclerView().setLayoutManager(new LinearLayoutManager(langSelectionActivity));
        String stringExtra = getIntent().getStringExtra(LinkHeader.Parameters.Type);
        String stringExtra2 = getIntent().getStringExtra("inputTxt");
        this.inputTxt = stringExtra2;
        Log.d("TAG22", "LangSelectionActivity onCreate:" + stringExtra2 + " type=" + stringExtra);
        setAdapter(new LangSelAdapter(langSelectionActivity, stringExtra, this));
        getRecyclerView().setAdapter(getAdapter());
        getAdapter().setData(ExtensionFunctionKt.getTranslateLangList());
        getAdapter().notifyDataSetChanged();
        initListeners();
        LinearLayout linearLayout = getBinding().smallBannerLayout.bannerAdLayout;
        ShimmerFrameLayout shimmerFrameLayout = getBinding().smallBannerLayout.shimmerViewContainer;
        Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "binding.smallBannerLayout.shimmerViewContainer");
        ConstantParam.INSTANCE.getFbBannerAd().loadFbBannerAd(this, linearLayout, shimmerFrameLayout);
    }

    private final void initListeners() {
        getBinding().searchLang.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.LangSelectionActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LangSelectionActivity.initListeners$lambda$0(LangSelectionActivity.this, view);
            }
        });
        getBinding().exitSearchIcon.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.LangSelectionActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LangSelectionActivity.initListeners$lambda$1(LangSelectionActivity.this, view);
            }
        });
        getBinding().backBtn.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.LangSelectionActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LangSelectionActivity.initListeners$lambda$2(LangSelectionActivity.this, view);
            }
        });
        getBinding().search.addTextChangedListener(new TextWatcher() { // from class: dev.cct.translatorapp.ui.LangSelectionActivity$initListeners$4
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence searchedText, int start, int before, int count) {
                LangSelectionActivity.this.getAdapter().searchList(searchedText);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$0(LangSelectionActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getBinding().searchLanguageCardview.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$1(LangSelectionActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getBinding().search.setText("");
        this$0.getBinding().searchLanguageCardview.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$2(LangSelectionActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.backPressFUn();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        backPressFUn();
    }

    private final void backPressFUn() {
        if (isFromSpeechToText) {
            startActivity(new Intent(this, (Class<?>) SpeechToTextActivity.class));
            overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
            finish();
            isFromSpeechToText = false;
            return;
        }
        if (isFromConversationText) {
            startActivity(new Intent(this, (Class<?>) ConversationActivity.class));
            overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
            finish();
            isFromConversationText = false;
            return;
        }
        if (isFromPhrasesText) {
            startActivity(new Intent(this, (Class<?>) PhrasebookActivity.class));
            overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
            finish();
            isFromPhrasesText = false;
            return;
        }
        if (isFromTranslationText) {
            finish();
            overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
            finish();
            isFromTranslationText = false;
        }
    }

    @Override // dev.cct.translatorapp.adapter.IOLanguages
    public void setInputLang(int pos, LanguageListModel itemsViewModel) {
        Intrinsics.checkNotNullParameter(itemsViewModel, "itemsViewModel");
        LangSelectionActivity langSelectionActivity = this;
        new Preferences(langSelectionActivity).setTranslateInput(pos);
        Intent intent = new Intent(langSelectionActivity, (Class<?>) TextTranslation.class);
        intent.putExtra("currentInputText", this.inputTxt);
        startActivity(intent);
        finish();
    }

    @Override // dev.cct.translatorapp.adapter.IOLanguages
    public void setOutputLang(int pos, LanguageListModel itemsViewModel) {
        Intrinsics.checkNotNullParameter(itemsViewModel, "itemsViewModel");
        LangSelectionActivity langSelectionActivity = this;
        new Preferences(langSelectionActivity).setTranslateOutput(pos);
        Intent intent = new Intent(langSelectionActivity, (Class<?>) TextTranslation.class);
        intent.putExtra("currentInputText", this.inputTxt);
        startActivity(intent);
        finish();
    }

    @Override // dev.cct.translatorapp.adapter.IOLanguages
    public void setSpeechLang(int pos, LanguageListModel itemsViewModel) {
        Intrinsics.checkNotNullParameter(itemsViewModel, "itemsViewModel");
        LangSelectionActivity langSelectionActivity = this;
        new Preferences(langSelectionActivity).setSpeechToTextLang(pos);
        Intent intent = new Intent(langSelectionActivity, (Class<?>) SpeechToTextActivity.class);
        intent.putExtra("lang", itemsViewModel.getLangName());
        startActivity(intent);
        finish();
        isFromSpeechToText = true;
        TranslatorCustomFirebaseEvents translatorCustomFirebaseEvents = this.clickEventsFirebase;
        if (translatorCustomFirebaseEvents != null) {
            String string = getString(itemsViewModel.getLangName());
            Intrinsics.checkNotNullExpressionValue(string, "getString(itemsViewModel.langName)");
            translatorCustomFirebaseEvents.micSTT(string);
        }
    }

    @Override // dev.cct.translatorapp.adapter.IOLanguages
    public void setPhInputLang(int pos, LanguageListModel itemsViewModel) {
        Intrinsics.checkNotNullParameter(itemsViewModel, "itemsViewModel");
        LangSelectionActivity langSelectionActivity = this;
        new Preferences(langSelectionActivity).setPhInputLang(pos);
        ExtensionFunction.INSTANCE.openActivity(langSelectionActivity, PhrasebookActivity.class);
        finish();
    }

    @Override // dev.cct.translatorapp.adapter.IOLanguages
    public void setPhOutputLang(int pos, LanguageListModel itemsViewModel) {
        Intrinsics.checkNotNullParameter(itemsViewModel, "itemsViewModel");
        LangSelectionActivity langSelectionActivity = this;
        new Preferences(langSelectionActivity).setPhOutputLang(pos);
        ExtensionFunction.INSTANCE.openActivity(langSelectionActivity, PhrasebookActivity.class);
        finish();
    }

    @Override // dev.cct.translatorapp.adapter.IOLanguages
    public void setConInputLang(int pos, LanguageListModel itemsViewModel) {
        Intrinsics.checkNotNullParameter(itemsViewModel, "itemsViewModel");
        LangSelectionActivity langSelectionActivity = this;
        new Preferences(langSelectionActivity).setConInputLang(pos);
        ExtensionFunction.INSTANCE.openActivity(langSelectionActivity, ConversationActivity.class);
        finish();
        TranslatorCustomFirebaseEvents translatorCustomFirebaseEvents = this.clickEventsFirebase;
        if (translatorCustomFirebaseEvents != null) {
            String string = getString(itemsViewModel.getLangName());
            Intrinsics.checkNotNullExpressionValue(string, "getString(itemsViewModel.langName)");
            translatorCustomFirebaseEvents.inputLangC(string);
        }
    }

    @Override // dev.cct.translatorapp.adapter.IOLanguages
    public void setConOutputLang(int pos, LanguageListModel itemsViewModel) {
        Intrinsics.checkNotNullParameter(itemsViewModel, "itemsViewModel");
        LangSelectionActivity langSelectionActivity = this;
        new Preferences(langSelectionActivity).setConOutputLang(pos);
        ExtensionFunction.INSTANCE.openActivity(langSelectionActivity, ConversationActivity.class);
        finish();
        TranslatorCustomFirebaseEvents translatorCustomFirebaseEvents = this.clickEventsFirebase;
        if (translatorCustomFirebaseEvents != null) {
            String string = getString(itemsViewModel.getLangName());
            Intrinsics.checkNotNullExpressionValue(string, "getString(itemsViewModel.langName)");
            translatorCustomFirebaseEvents.outputLangC(string);
        }
    }

    @Override // dev.cct.translatorapp.adapter.IOLanguages
    public void setWidgetInputLang(int pos, LanguageListModel itemsViewModel) {
        Intrinsics.checkNotNullParameter(itemsViewModel, "itemsViewModel");
        LangSelectionActivity langSelectionActivity = this;
        new Preferences(langSelectionActivity).setWidgetInputLang(pos);
        ExtensionFunction.INSTANCE.openActivity(langSelectionActivity, WidgetActivity.class);
        finish();
    }

    @Override // dev.cct.translatorapp.adapter.IOLanguages
    public void setWidgetOutputLang(int pos, LanguageListModel itemsViewModel) {
        Intrinsics.checkNotNullParameter(itemsViewModel, "itemsViewModel");
        LangSelectionActivity langSelectionActivity = this;
        new Preferences(langSelectionActivity).setWidgetOutputLang(pos);
        ExtensionFunction.INSTANCE.openActivity(langSelectionActivity, WidgetActivity.class);
        finish();
    }
}
