package dev.cct.translatorapp.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.LocaleList;
import android.speech.tts.TextToSpeech;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import com.translator.alllanguagetranslations.ath.R;
import dev.cct.translatorapp.LanguageListModel;
import dev.cct.translatorapp.databinding.ActivityTranslateOutputBinding;
import dev.cct.translatorapp.util.ExtensionFunction;
import dev.cct.translatorapp.util.ExtensionFunctionKt;
import dev.cct.translatorapp.util.Preferences;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TranslateOutputActivity.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0014J\b\u0010\u001a\u001a\u00020\u0017H\u0002J\u0018\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u0017H\u0016J\u0012\u0010 \u001a\u00020\u00172\b\u0010!\u001a\u0004\u0018\u00010\"H\u0014J\u0010\u0010#\u001a\u00020\u00172\u0006\u0010$\u001a\u00020%H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006&"}, d2 = {"Ldev/cct/translatorapp/ui/TranslateOutputActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/speech/tts/TextToSpeech$OnInitListener;", "()V", "binding", "Ldev/cct/translatorapp/databinding/ActivityTranslateOutputBinding;", "getBinding", "()Ldev/cct/translatorapp/databinding/ActivityTranslateOutputBinding;", "setBinding", "(Ldev/cct/translatorapp/databinding/ActivityTranslateOutputBinding;)V", "pref", "Ldev/cct/translatorapp/util/Preferences;", "getPref", "()Ldev/cct/translatorapp/util/Preferences;", "setPref", "(Ldev/cct/translatorapp/util/Preferences;)V", "tts", "Landroid/speech/tts/TextToSpeech;", "getTts", "()Landroid/speech/tts/TextToSpeech;", "setTts", "(Landroid/speech/tts/TextToSpeech;)V", "attachBaseContext", "", "newBase", "Landroid/content/Context;", "initListeners", "languageChange", "context", "locale", "Ljava/util/Locale;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onInit", NotificationCompat.CATEGORY_STATUS, "", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TranslateOutputActivity extends AppCompatActivity implements TextToSpeech.OnInitListener {
    public ActivityTranslateOutputBinding binding;
    public Preferences pref;
    private TextToSpeech tts;

    @Override // android.speech.tts.TextToSpeech.OnInitListener
    public void onInit(int status) {
    }

    public final ActivityTranslateOutputBinding getBinding() {
        ActivityTranslateOutputBinding activityTranslateOutputBinding = this.binding;
        if (activityTranslateOutputBinding != null) {
            return activityTranslateOutputBinding;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final void setBinding(ActivityTranslateOutputBinding activityTranslateOutputBinding) {
        Intrinsics.checkNotNullParameter(activityTranslateOutputBinding, "<set-?>");
        this.binding = activityTranslateOutputBinding;
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
        ActivityTranslateOutputBinding inflate = ActivityTranslateOutputBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        setBinding(inflate);
        setContentView(getBinding().getRoot());
        TranslateOutputActivity translateOutputActivity = this;
        setPref(new Preferences(translateOutputActivity));
        this.tts = new TextToSpeech(translateOutputActivity, this);
        getBinding().outputText.setText(getIntent().getStringExtra("translated_text"));
        LanguageListModel languageListModel = ExtensionFunctionKt.getTranslateLangList().get(getPref().getTranslateOutput());
        Intrinsics.checkNotNullExpressionValue(languageListModel, "translateLangList[pref.translateOutput]");
        getBinding().outputLangCardTv.setText(getString(languageListModel.getLangName()));
        initListeners();
    }

    private final void initListeners() {
        final ActivityTranslateOutputBinding binding = getBinding();
        binding.outSpeakerIcon.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.TranslateOutputActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TranslateOutputActivity.initListeners$lambda$4$lambda$0(TranslateOutputActivity.this, binding, view);
            }
        });
        binding.backBtn.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.TranslateOutputActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TranslateOutputActivity.initListeners$lambda$4$lambda$1(TranslateOutputActivity.this, view);
            }
        });
        binding.outClipboardIcon.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.TranslateOutputActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TranslateOutputActivity.initListeners$lambda$4$lambda$2(TranslateOutputActivity.this, binding, view);
            }
        });
        binding.shareOutIcon.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.TranslateOutputActivity$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TranslateOutputActivity.initListeners$lambda$4$lambda$3(ActivityTranslateOutputBinding.this, this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$4$lambda$0(TranslateOutputActivity this$0, ActivityTranslateOutputBinding this_with, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        TextToSpeech textToSpeech = this$0.tts;
        if (textToSpeech != null) {
            textToSpeech.speak(this_with.outputText.getText(), 0, null, "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$4$lambda$1(TranslateOutputActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$4$lambda$2(TranslateOutputActivity this$0, ActivityTranslateOutputBinding this_with, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        CharSequence text = this_with.outputText.getText();
        Intrinsics.checkNotNullExpressionValue(text, "outputText.text");
        ExtensionFunction.INSTANCE.copyToClipboard(this$0, text);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$4$lambda$3(ActivityTranslateOutputBinding this_with, TranslateOutputActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CharSequence text = this_with.outputText.getText();
        Intrinsics.checkNotNullExpressionValue(text, "outputText.text");
        if (text.length() > 0) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", this_with.outputText.getText());
            this$0.startActivity(Intent.createChooser(intent, null));
            this$0.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        finish();
    }
}
