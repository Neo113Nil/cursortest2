package dev.cct.translatorapp.ui;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.LocaleList;
import android.speech.tts.TextToSpeech;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.translator.alllanguagetranslations.ath.R;
import dev.cct.translatorapp.LanguageListModel;
import dev.cct.translatorapp.databinding.ActivityTranslateInputBinding;
import dev.cct.translatorapp.databinding.NetworkBottomDialogBinding;
import dev.cct.translatorapp.util.ExtensionFunction;
import dev.cct.translatorapp.util.ExtensionFunctionKt;
import dev.cct.translatorapp.util.Preferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: TranslateInputActivity.kt */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0014J\b\u0010$\u001a\u00020!H\u0002J\b\u0010%\u001a\u00020&H\u0002J\u0018\u0010'\u001a\u00020#2\u0006\u0010(\u001a\u00020#2\u0006\u0010)\u001a\u00020*H\u0002J\b\u0010+\u001a\u00020!H\u0016J\u0012\u0010,\u001a\u00020!2\b\u0010-\u001a\u0004\u0018\u00010.H\u0014J\u0010\u0010/\u001a\u00020!2\u0006\u00100\u001a\u00020\u0005H\u0016J-\u00101\u001a\u00020!2\u0006\u00102\u001a\u00020\u00052\u000e\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0007042\u0006\u00105\u001a\u000206H\u0016¢\u0006\u0002\u00107J\b\u00108\u001a\u00020!H\u0002J\b\u00109\u001a\u00020!H\u0002J\b\u0010:\u001a\u00020!H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0010\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\u00180\u00180\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006;"}, d2 = {"Ldev/cct/translatorapp/ui/TranslateInputActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/speech/tts/TextToSpeech$OnInitListener;", "()V", "MICROPHONE_PERMISSION_REQUEST_CODE", "", "TAG", "", "getTAG", "()Ljava/lang/String;", "binding", "Ldev/cct/translatorapp/databinding/ActivityTranslateInputBinding;", "getBinding", "()Ldev/cct/translatorapp/databinding/ActivityTranslateInputBinding;", "setBinding", "(Ldev/cct/translatorapp/databinding/ActivityTranslateInputBinding;)V", "pref", "Ldev/cct/translatorapp/util/Preferences;", "getPref", "()Ldev/cct/translatorapp/util/Preferences;", "setPref", "(Ldev/cct/translatorapp/util/Preferences;)V", "speakLunchResult", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "tts", "Landroid/speech/tts/TextToSpeech;", "getTts", "()Landroid/speech/tts/TextToSpeech;", "setTts", "(Landroid/speech/tts/TextToSpeech;)V", "attachBaseContext", "", "newBase", "Landroid/content/Context;", "initListeners", "isMicrophonePermissionGranted", "", "languageChange", "context", "locale", "Ljava/util/Locale;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onInit", NotificationCompat.CATEGORY_STATUS, "onRequestPermissionsResult", "requestCode", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "requestMicrophonePermission", "showBottomSheetNetwork", "speechInput", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TranslateInputActivity extends AppCompatActivity implements TextToSpeech.OnInitListener {
    public ActivityTranslateInputBinding binding;
    public Preferences pref;
    private ActivityResultLauncher<Intent> speakLunchResult;
    private TextToSpeech tts;
    private final String TAG = "TranslateInputActivityLogs";
    private final int MICROPHONE_PERMISSION_REQUEST_CODE = 1;

    @Override // android.speech.tts.TextToSpeech.OnInitListener
    public void onInit(int status) {
    }

    public TranslateInputActivity() {
        ActivityResultLauncher<Intent> registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: dev.cct.translatorapp.ui.TranslateInputActivity$$ExternalSyntheticLambda5
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                TranslateInputActivity.speakLunchResult$lambda$6(TranslateInputActivity.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResul…\n            }\n\n        }");
        this.speakLunchResult = registerForActivityResult;
    }

    public final ActivityTranslateInputBinding getBinding() {
        ActivityTranslateInputBinding activityTranslateInputBinding = this.binding;
        if (activityTranslateInputBinding != null) {
            return activityTranslateInputBinding;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final void setBinding(ActivityTranslateInputBinding activityTranslateInputBinding) {
        Intrinsics.checkNotNullParameter(activityTranslateInputBinding, "<set-?>");
        this.binding = activityTranslateInputBinding;
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
        Log.d("TAG", "TranslateInputActivity onCreate: called");
        ActivityTranslateInputBinding inflate = ActivityTranslateInputBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        setBinding(inflate);
        setContentView(getBinding().getRoot());
        TranslateInputActivity translateInputActivity = this;
        this.tts = new TextToSpeech(translateInputActivity, this);
        setPref(new Preferences(translateInputActivity));
        LanguageListModel languageListModel = ExtensionFunctionKt.getTranslateLangList().get(getPref().getTranslateInput());
        Intrinsics.checkNotNullExpressionValue(languageListModel, "translateLangList[pref.translateInput]");
        getBinding().inputLangCardTv.setText(getString(languageListModel.getLangName()));
        initListeners();
        getBinding().editText.setText(getIntent().getStringExtra("type_text"));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Log.d("TAG", "TranslateInputActivity onBackPressed: called");
        Intent intent = new Intent(this, (Class<?>) HomeScreenActivity.class);
        intent.putExtra("translate_input", getBinding().editText.getText().toString());
        setResult(-1, intent);
        finish();
        overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
    }

    private final void initListeners() {
        final ActivityTranslateInputBinding binding = getBinding();
        binding.speakIcon.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.TranslateInputActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TranslateInputActivity.initListeners$lambda$5$lambda$0(TranslateInputActivity.this, binding, view);
            }
        });
        binding.micIcon.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.TranslateInputActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TranslateInputActivity.initListeners$lambda$5$lambda$1(TranslateInputActivity.this, view);
            }
        });
        binding.pasteIcon.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.TranslateInputActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TranslateInputActivity.initListeners$lambda$5$lambda$2(TranslateInputActivity.this, binding, view);
            }
        });
        binding.crossIcon.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.TranslateInputActivity$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TranslateInputActivity.initListeners$lambda$5$lambda$3(ActivityTranslateInputBinding.this, view);
            }
        });
        binding.translateBtn.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.TranslateInputActivity$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TranslateInputActivity.initListeners$lambda$5$lambda$4(TranslateInputActivity.this, binding, view);
            }
        });
        binding.editText.addTextChangedListener(new TextWatcher() { // from class: dev.cct.translatorapp.ui.TranslateInputActivity$initListeners$1$6
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
                    ActivityTranslateInputBinding.this.crossIcon.setVisibility(0);
                } else {
                    ActivityTranslateInputBinding.this.crossIcon.setVisibility(8);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$5$lambda$0(TranslateInputActivity this$0, ActivityTranslateInputBinding this_with, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        TextToSpeech textToSpeech = this$0.tts;
        if (textToSpeech != null) {
            textToSpeech.speak(this_with.editText.getText().toString(), 0, null, "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$5$lambda$1(TranslateInputActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!this$0.isMicrophonePermissionGranted()) {
            this$0.requestMicrophonePermission();
        } else {
            this$0.speechInput();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$5$lambda$2(TranslateInputActivity this$0, ActivityTranslateInputBinding this_with, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        TranslateInputActivity translateInputActivity = this$0;
        if (ExtensionFunction.INSTANCE.getFromClipboard(translateInputActivity) != null) {
            this_with.editText.append(ExtensionFunction.INSTANCE.getFromClipboard(translateInputActivity));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$5$lambda$3(ActivityTranslateInputBinding this_with, View view) {
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        this_with.editText.setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$5$lambda$4(TranslateInputActivity this$0, ActivityTranslateInputBinding this_with, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        if (ExtensionFunction.INSTANCE.checkInternetConnection(this$0)) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = "";
            Editable text = this_with.editText.getText();
            Intrinsics.checkNotNullExpressionValue(text, "editText.text");
            if (text.length() > 0) {
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new TranslateInputActivity$initListeners$1$5$1(objectRef, this_with, this$0, null), 3, null);
                return;
            }
            return;
        }
        this$0.showBottomSheetNetwork();
    }

    private final boolean isMicrophonePermissionGranted() {
        return ContextCompat.checkSelfPermission(this, "android.permission.RECORD_AUDIO") == 0;
    }

    private final void requestMicrophonePermission() {
        TranslateInputActivity translateInputActivity = this;
        if (ActivityCompat.shouldShowRequestPermissionRationale(translateInputActivity, "android.permission.RECORD_AUDIO")) {
            Toast.makeText(this, "Microphone permission is required to use the microphone.", 0).show();
        }
        ActivityCompat.requestPermissions(translateInputActivity, new String[]{"android.permission.RECORD_AUDIO"}, this.MICROPHONE_PERMISSION_REQUEST_CODE);
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

    private final void speechInput() {
        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
        Iterator<LanguageListModel> it = ExtensionFunctionKt.getTranslateLangList().iterator();
        String str = "";
        while (it.hasNext()) {
            LanguageListModel next = it.next();
            if (Intrinsics.areEqual(getString(next.getLangName()), getBinding().inputLangCardTv.getText())) {
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
    public static final void speakLunchResult$lambda$6(TranslateInputActivity this$0, ActivityResult activityResult) {
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
            this$0.getBinding().editText.append(" " + stringArrayListExtra.get(0));
            this$0.getBinding().crossIcon.setVisibility(0);
        }
    }

    private final void showBottomSheetNetwork() {
        NetworkBottomDialogBinding inflate = NetworkBottomDialogBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this);
        bottomSheetDialog.setContentView(inflate.getRoot());
        inflate.okBtn.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.TranslateInputActivity$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TranslateInputActivity.showBottomSheetNetwork$lambda$7(BottomSheetDialog.this, this, view);
            }
        });
        bottomSheetDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showBottomSheetNetwork$lambda$7(BottomSheetDialog dialog, TranslateInputActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        dialog.dismiss();
        Intent intent = new Intent(this$0, (Class<?>) HomeScreenActivity.class);
        intent.putExtra("translate_input", this$0.getBinding().editText.getText().toString());
        intent.putExtra("translate_output", "");
        this$0.setResult(-1, intent);
        this$0.finish();
    }
}
