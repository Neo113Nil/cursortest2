package dev.cct.translatorapp.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.speech.tts.TextToSpeech;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.translator.alllanguagetranslations.ath.R;
import dev.cct.translatorapp.ads.ConstantParam;
import dev.cct.translatorapp.customFirebaseEvents.TranslatorCustomFirebaseEvents;
import dev.cct.translatorapp.dataModel.DictionaryModel;
import dev.cct.translatorapp.databinding.ActivityDictionaryBinding;
import dev.cct.translatorapp.util.ExtensionFunction;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: DictionaryActivity.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0014J\b\u0010\u001a\u001a\u00020\u0017H\u0002J\u0018\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u0017H\u0016J\u0012\u0010 \u001a\u00020\u00172\b\u0010!\u001a\u0004\u0018\u00010\"H\u0014J\b\u0010#\u001a\u00020\u0017H\u0014J\u0010\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\rH\u0016J\b\u0010&\u001a\u00020\u0017H\u0014J\b\u0010'\u001a\u00020\u0017H\u0014J\b\u0010(\u001a\u00020\u0017H\u0014J\b\u0010)\u001a\u00020\u0017H\u0002J\b\u0010*\u001a\u00020\u0017H\u0002J\u0010\u0010+\u001a\u00020\u00172\u0006\u0010,\u001a\u00020-H\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006."}, d2 = {"Ldev/cct/translatorapp/ui/DictionaryActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/speech/tts/TextToSpeech$OnInitListener;", "()V", "binding", "Ldev/cct/translatorapp/databinding/ActivityDictionaryBinding;", "getBinding", "()Ldev/cct/translatorapp/databinding/ActivityDictionaryBinding;", "setBinding", "(Ldev/cct/translatorapp/databinding/ActivityDictionaryBinding;)V", "clickEventsFirebase", "Ldev/cct/translatorapp/customFirebaseEvents/TranslatorCustomFirebaseEvents;", "countAd", "", "remoteConfig", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "tts", "Landroid/speech/tts/TextToSpeech;", "getTts", "()Landroid/speech/tts/TextToSpeech;", "setTts", "(Landroid/speech/tts/TextToSpeech;)V", "attachBaseContext", "", "newBase", "Landroid/content/Context;", "initListeners", "languageChange", "context", "locale", "Ljava/util/Locale;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onInit", NotificationCompat.CATEGORY_STATUS, "onPause", "onResume", "onStart", "showBannerAd", "speakOut", "updateUI", "result", "Ldev/cct/translatorapp/dataModel/DictionaryModel;", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DictionaryActivity extends AppCompatActivity implements TextToSpeech.OnInitListener {
    public ActivityDictionaryBinding binding;
    private TranslatorCustomFirebaseEvents clickEventsFirebase;
    private int countAd;
    private FirebaseRemoteConfig remoteConfig;
    private TextToSpeech tts;

    @Override // android.speech.tts.TextToSpeech.OnInitListener
    public void onInit(int status) {
    }

    public final ActivityDictionaryBinding getBinding() {
        ActivityDictionaryBinding activityDictionaryBinding = this.binding;
        if (activityDictionaryBinding != null) {
            return activityDictionaryBinding;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final void setBinding(ActivityDictionaryBinding activityDictionaryBinding) {
        Intrinsics.checkNotNullParameter(activityDictionaryBinding, "<set-?>");
        this.binding = activityDictionaryBinding;
    }

    public final TextToSpeech getTts() {
        return this.tts;
    }

    public final void setTts(TextToSpeech textToSpeech) {
        this.tts = textToSpeech;
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
        ActivityDictionaryBinding inflate = ActivityDictionaryBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        setBinding(inflate);
        setContentView(getBinding().getRoot());
        this.remoteConfig = FirebaseRemoteConfig.getInstance();
        DictionaryActivity dictionaryActivity = this;
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(dictionaryActivity);
        Intrinsics.checkNotNullExpressionValue(firebaseAnalytics, "getInstance(this)");
        this.clickEventsFirebase = new TranslatorCustomFirebaseEvents(firebaseAnalytics);
        this.tts = new TextToSpeech(dictionaryActivity, this);
        initListeners();
        showBannerAd();
    }

    private final void showBannerAd() {
        if (ConstantParam.INSTANCE.getFbBannerEnableOrNot()) {
            Log.d("languageNativeAd", "checkNativeLoadAdStatus: admob");
            getBinding().fbBannerContainer.setVisibility(8);
            getBinding().admobBannerContainer.setVisibility(0);
            String dicCollapsibleInterstitialsAdId = ConstantParam.INSTANCE.getDicCollapsibleInterstitialsAdId();
            FrameLayout frameLayout = getBinding().smallBannerLayout.bannerAdLayout;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.smallBannerLayout.bannerAdLayout");
            ShimmerFrameLayout shimmerFrameLayout = getBinding().smallBannerLayout.shimmerViewContainer;
            Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "binding.smallBannerLayout.shimmerViewContainer");
            ConstantParam.INSTANCE.getBannerCollapsibleAd().loadBanner(this, dicCollapsibleInterstitialsAdId, frameLayout, shimmerFrameLayout);
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

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        finish();
        overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
    }

    private final void initListeners() {
        final ActivityDictionaryBinding binding = getBinding();
        binding.backFromDictionaryBtn.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.DictionaryActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DictionaryActivity.initListeners$lambda$6$lambda$0(DictionaryActivity.this, view);
            }
        });
        binding.SearchBtn.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.DictionaryActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DictionaryActivity.initListeners$lambda$6$lambda$1(DictionaryActivity.this, binding, view);
            }
        });
        binding.delete.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.DictionaryActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DictionaryActivity.initListeners$lambda$6$lambda$2(DictionaryActivity.this, view);
            }
        });
        binding.copyIcon.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.DictionaryActivity$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DictionaryActivity.initListeners$lambda$6$lambda$3(DictionaryActivity.this, binding, view);
            }
        });
        binding.speakIcon.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.DictionaryActivity$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DictionaryActivity.initListeners$lambda$6$lambda$4(DictionaryActivity.this, view);
            }
        });
        binding.shareIcon.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.DictionaryActivity$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DictionaryActivity.initListeners$lambda$6$lambda$5(ActivityDictionaryBinding.this, this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$6$lambda$0(DictionaryActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
        this$0.overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$6$lambda$1(DictionaryActivity this$0, ActivityDictionaryBinding this_with, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        if (ExtensionFunction.INSTANCE.checkInternetConnection(this$0)) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new DictionaryActivity$initListeners$1$2$1(this_with, this$0, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$6$lambda$2(DictionaryActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getBinding().editText.setText("");
        this$0.getBinding().delete.setVisibility(8);
        this$0.getBinding().SearchBtn.setVisibility(0);
        this$0.getBinding().resultCardView.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$6$lambda$3(DictionaryActivity this$0, ActivityDictionaryBinding this_with, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        CharSequence text = this_with.defTv.getText();
        Intrinsics.checkNotNullExpressionValue(text, "defTv.text");
        ExtensionFunction.INSTANCE.copyToClipboard(this$0, text);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$6$lambda$4(DictionaryActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.speakOut();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$6$lambda$5(ActivityDictionaryBinding this_with, DictionaryActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Editable text = this_with.editText.getText();
        Intrinsics.checkNotNullExpressionValue(text, "editText.text");
        if (text.length() > 0) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", this_with.defTv.getText());
            this$0.startActivity(Intent.createChooser(intent, null));
            this$0.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateUI(DictionaryModel result) {
        getBinding().defTv.setText(result.getDefinition());
        if (Intrinsics.areEqual(result.getExample(), AbstractJsonLexerKt.NULL)) {
            getBinding().expTv.setText("Not Found");
        } else {
            getBinding().expTv.setText(result.getExample());
        }
        if (result.getSynonyms().length() != 2) {
            if (!(result.getSynonyms().length() == 0)) {
                getBinding().synTv.setText(StringsKt.substring(result.getSynonyms(), RangesKt.until(1, result.getSynonyms().length() - 1)));
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: dev.cct.translatorapp.ui.DictionaryActivity$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        DictionaryActivity.updateUI$lambda$7(DictionaryActivity.this);
                    }
                }, 500L);
            }
        }
        getBinding().synTv.setText("Not Found");
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: dev.cct.translatorapp.ui.DictionaryActivity$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                DictionaryActivity.updateUI$lambda$7(DictionaryActivity.this);
            }
        }, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateUI$lambda$7(DictionaryActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getBinding().delete.setVisibility(0);
        this$0.getBinding().SearchBtn.setVisibility(4);
        this$0.getBinding().resultCardView.setVisibility(0);
    }

    private final void speakOut() {
        CharSequence text = getBinding().defTv.getText();
        TextToSpeech textToSpeech = this.tts;
        Intrinsics.checkNotNull(textToSpeech);
        textToSpeech.speak(text, 0, null, "");
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
    }
}
