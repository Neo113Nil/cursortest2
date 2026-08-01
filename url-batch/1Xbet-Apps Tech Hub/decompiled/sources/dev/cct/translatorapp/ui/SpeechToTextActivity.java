package dev.cct.translatorapp.ui;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.LocaleList;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.translator.alllanguagetranslations.ath.R;
import dev.cct.translatorapp.LanguageListModel;
import dev.cct.translatorapp.ads.CollapsibleBannerAd;
import dev.cct.translatorapp.customFirebaseEvents.TranslatorCustomFirebaseEvents;
import dev.cct.translatorapp.databinding.ActivitySpeechToTextBinding;
import dev.cct.translatorapp.util.ExtensionFunction;
import dev.cct.translatorapp.util.ExtensionFunctionKt;
import dev.cct.translatorapp.util.Preferences;
import io.ktor.http.LinkHeader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SpeechToTextActivity.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0014J\b\u0010\u001f\u001a\u00020\u001cH\u0002J\b\u0010 \u001a\u00020!H\u0002J\u0018\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020\u001cH\u0002J\b\u0010'\u001a\u00020\u001cH\u0016J\u0012\u0010(\u001a\u00020\u001c2\b\u0010)\u001a\u0004\u0018\u00010*H\u0014J\b\u0010+\u001a\u00020\u001cH\u0014J\u0010\u0010,\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020\u0005H\u0016J\b\u0010.\u001a\u00020\u001cH\u0014J-\u0010/\u001a\u00020\u001c2\u0006\u00100\u001a\u00020\u00052\u000e\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u000103022\u0006\u00104\u001a\u000205H\u0016¢\u0006\u0002\u00106J\b\u00107\u001a\u00020\u001cH\u0014J\b\u00108\u001a\u00020\u001cH\u0014J\b\u00109\u001a\u00020\u001cH\u0002J\b\u0010:\u001a\u00020\u001cH\u0002J\b\u0010;\u001a\u00020\u001cH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00130\u00130\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006<"}, d2 = {"Ldev/cct/translatorapp/ui/SpeechToTextActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/speech/tts/TextToSpeech$OnInitListener;", "()V", "MICROPHONE_PERMISSION_REQUEST_CODE", "", "binding", "Ldev/cct/translatorapp/databinding/ActivitySpeechToTextBinding;", "getBinding", "()Ldev/cct/translatorapp/databinding/ActivitySpeechToTextBinding;", "setBinding", "(Ldev/cct/translatorapp/databinding/ActivitySpeechToTextBinding;)V", "clickEventsFirebase", "Ldev/cct/translatorapp/customFirebaseEvents/TranslatorCustomFirebaseEvents;", "countAd", "remoteConfig", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "speakLunchResult", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "tts", "Landroid/speech/tts/TextToSpeech;", "getTts", "()Landroid/speech/tts/TextToSpeech;", "setTts", "(Landroid/speech/tts/TextToSpeech;)V", "attachBaseContext", "", "newBase", "Landroid/content/Context;", "initListener", "isMicrophonePermissionGranted", "", "languageChange", "context", "locale", "Ljava/util/Locale;", "loadBannerAds", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onInit", NotificationCompat.CATEGORY_STATUS, "onPause", "onRequestPermissionsResult", "requestCode", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onStart", "requestMicrophonePermission", "speakOut", "speechInput", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SpeechToTextActivity extends AppCompatActivity implements TextToSpeech.OnInitListener {
    private final int MICROPHONE_PERMISSION_REQUEST_CODE = 1;
    public ActivitySpeechToTextBinding binding;
    private TranslatorCustomFirebaseEvents clickEventsFirebase;
    private int countAd;
    private FirebaseRemoteConfig remoteConfig;
    private ActivityResultLauncher<Intent> speakLunchResult;
    private TextToSpeech tts;

    @Override // android.speech.tts.TextToSpeech.OnInitListener
    public void onInit(int status) {
    }

    public SpeechToTextActivity() {
        ActivityResultLauncher<Intent> registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: dev.cct.translatorapp.ui.SpeechToTextActivity$$ExternalSyntheticLambda0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                SpeechToTextActivity.speakLunchResult$lambda$8(SpeechToTextActivity.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResul…\n            }\n\n        }");
        this.speakLunchResult = registerForActivityResult;
    }

    public final ActivitySpeechToTextBinding getBinding() {
        ActivitySpeechToTextBinding activitySpeechToTextBinding = this.binding;
        if (activitySpeechToTextBinding != null) {
            return activitySpeechToTextBinding;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final void setBinding(ActivitySpeechToTextBinding activitySpeechToTextBinding) {
        Intrinsics.checkNotNullParameter(activitySpeechToTextBinding, "<set-?>");
        this.binding = activitySpeechToTextBinding;
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
        ActivitySpeechToTextBinding inflate = ActivitySpeechToTextBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        setBinding(inflate);
        setContentView(getBinding().getRoot());
        this.remoteConfig = FirebaseRemoteConfig.getInstance();
        SpeechToTextActivity speechToTextActivity = this;
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(speechToTextActivity);
        Intrinsics.checkNotNullExpressionValue(firebaseAnalytics, "getInstance(this)");
        this.clickEventsFirebase = new TranslatorCustomFirebaseEvents(firebaseAnalytics);
        this.tts = new TextToSpeech(speechToTextActivity, this);
        getBinding().speechLangBtn.setText(getString(ExtensionFunctionKt.getTranslateLangList().get(new Preferences(speechToTextActivity).getSpeechToTextLang()).getLangName()));
        getBinding().inputLangCardTv.setText(getBinding().speechLangBtn.getText());
        initListener();
        loadBannerAds();
    }

    private final void loadBannerAds() {
        FirebaseRemoteConfig firebaseRemoteConfig = this.remoteConfig;
        String string = firebaseRemoteConfig != null ? firebaseRemoteConfig.getString("collapsable_speech") : null;
        if (string != null) {
            CollapsibleBannerAd collapsibleBannerAd = new CollapsibleBannerAd(this);
            FrameLayout frameLayout = getBinding().collapsableBannerAd;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.collapsableBannerAd");
            collapsibleBannerAd.loadBanner(frameLayout, string);
        }
    }

    private final void initListener() {
        final ActivitySpeechToTextBinding binding = getBinding();
        getBinding().backBtn.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.SpeechToTextActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SpeechToTextActivity.initListener$lambda$7$lambda$0(SpeechToTextActivity.this, view);
            }
        });
        binding.micIcon.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.SpeechToTextActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SpeechToTextActivity.initListener$lambda$7$lambda$1(SpeechToTextActivity.this, view);
            }
        });
        binding.speechLangBtn.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.SpeechToTextActivity$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SpeechToTextActivity.initListener$lambda$7$lambda$2(SpeechToTextActivity.this, view);
            }
        });
        binding.textShareIcon.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.SpeechToTextActivity$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SpeechToTextActivity.initListener$lambda$7$lambda$3(ActivitySpeechToTextBinding.this, this, view);
            }
        });
        binding.deleteIcon.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.SpeechToTextActivity$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SpeechToTextActivity.initListener$lambda$7$lambda$4(ActivitySpeechToTextBinding.this, view);
            }
        });
        binding.copyIcon.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.SpeechToTextActivity$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SpeechToTextActivity.initListener$lambda$7$lambda$5(SpeechToTextActivity.this, binding, view);
            }
        });
        binding.speakIcon.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.SpeechToTextActivity$$ExternalSyntheticLambda7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SpeechToTextActivity.initListener$lambda$7$lambda$6(SpeechToTextActivity.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListener$lambda$7$lambda$0(SpeechToTextActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
        this$0.overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListener$lambda$7$lambda$1(SpeechToTextActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!this$0.isMicrophonePermissionGranted()) {
            this$0.requestMicrophonePermission();
        } else {
            this$0.speechInput();
        }
        TranslatorCustomFirebaseEvents translatorCustomFirebaseEvents = this$0.clickEventsFirebase;
        if (translatorCustomFirebaseEvents != null) {
            translatorCustomFirebaseEvents.micBtn();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListener$lambda$7$lambda$2(SpeechToTextActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Log.d("TAG22", "initListener: called");
        Intent intent = new Intent(this$0, (Class<?>) LangSelectionActivity.class);
        intent.putExtra(LinkHeader.Parameters.Type, "speech");
        this$0.startActivity(intent);
        this$0.finish();
        LangSelectionActivity.INSTANCE.setFromSpeechToText(true);
        this$0.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListener$lambda$7$lambda$3(ActivitySpeechToTextBinding this_with, SpeechToTextActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CharSequence text = this_with.editText.getText();
        Intrinsics.checkNotNullExpressionValue(text, "editText.text");
        if (text.length() > 0) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", this_with.editText.getText());
            this$0.startActivity(Intent.createChooser(intent, null));
            this$0.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListener$lambda$7$lambda$4(ActivitySpeechToTextBinding this_with, View view) {
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        this_with.editText.setText("");
        this_with.inputLangCardTv.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListener$lambda$7$lambda$5(SpeechToTextActivity this$0, ActivitySpeechToTextBinding this_with, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        CharSequence text = this_with.editText.getText();
        Intrinsics.checkNotNullExpressionValue(text, "editText.text");
        ExtensionFunction.INSTANCE.copyToClipboard(this$0, text);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListener$lambda$7$lambda$6(SpeechToTextActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.speakOut();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        finish();
        overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
    }

    private final void speechInput() {
        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
        Iterator<LanguageListModel> it = ExtensionFunctionKt.getTranslateLangList().iterator();
        String str = "";
        while (it.hasNext()) {
            LanguageListModel next = it.next();
            if (Intrinsics.areEqual(getString(next.getLangName()), getBinding().speechLangBtn.getText())) {
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
    public static final void speakLunchResult$lambda$8(SpeechToTextActivity this$0, ActivityResult activityResult) {
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
            this$0.getBinding().editText.append(" " + stringArrayListExtra.get(0) + " ");
            this$0.getBinding().inputLangCardTv.setVisibility(0);
        }
    }

    private final boolean isMicrophonePermissionGranted() {
        return ContextCompat.checkSelfPermission(this, "android.permission.RECORD_AUDIO") == 0;
    }

    private final void requestMicrophonePermission() {
        SpeechToTextActivity speechToTextActivity = this;
        if (ActivityCompat.shouldShowRequestPermissionRationale(speechToTextActivity, "android.permission.RECORD_AUDIO")) {
            Toast.makeText(this, "Microphone permission is required to use the microphone.", 0).show();
        }
        ActivityCompat.requestPermissions(speechToTextActivity, new String[]{"android.permission.RECORD_AUDIO"}, this.MICROPHONE_PERMISSION_REQUEST_CODE);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == this.MICROPHONE_PERMISSION_REQUEST_CODE) {
            if (grantResults.length <= 0 || grantResults[0] != 0) {
                Toast.makeText(this, "Microphone permission denied.", 0).show();
            }
        }
    }

    private final void speakOut() {
        String obj = getBinding().editText.getText().toString();
        TextToSpeech textToSpeech = this.tts;
        Intrinsics.checkNotNull(textToSpeech);
        textToSpeech.speak(obj, 0, null, "");
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
