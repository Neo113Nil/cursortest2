package dev.cct.translatorapp.ui;

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
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.translator.alllanguagetranslations.ath.R;
import dev.cct.translatorapp.adapter.GeneralAdapter;
import dev.cct.translatorapp.databinding.ActivityGeneralBinding;
import dev.cct.translatorapp.util.ExtensionFunction;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Charsets;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: GeneralActivity.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0014J\u0010\u0010+\u001a\u00020(2\u0006\u0010,\u001a\u00020\u0012H\u0016J\b\u0010-\u001a\u00020(H\u0002J\b\u0010.\u001a\u00020(H\u0002J\u0018\u0010/\u001a\u00020*2\u0006\u00100\u001a\u00020*2\u0006\u00101\u001a\u000202H\u0002J\b\u00103\u001a\u00020(H\u0016J\u0012\u00104\u001a\u00020(2\b\u00105\u001a\u0004\u0018\u000106H\u0014J\b\u00107\u001a\u00020(H\u0014J\u0010\u00108\u001a\u00020(2\u0006\u00109\u001a\u00020:H\u0016J\b\u0010;\u001a\u00020(H\u0014J\b\u0010<\u001a\u00020(H\u0014J\b\u0010=\u001a\u00020(H\u0014J\u0018\u0010>\u001a\u00020?2\u0006\u00100\u001a\u00020*2\u0006\u0010@\u001a\u00020\u0012H\u0002J\u0010\u0010A\u001a\u00020(2\u0006\u0010,\u001a\u00020\u0012H\u0016J\u0010\u0010B\u001a\u00020(2\u0006\u0010,\u001a\u00020\u0012H\u0016J\u0018\u0010C\u001a\u00020(2\u0006\u0010D\u001a\u00020?2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0014j\b\u0012\u0004\u0012\u00020\u0012`\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u00020\u001cX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006E"}, d2 = {"Ldev/cct/translatorapp/ui/GeneralActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Ldev/cct/translatorapp/adapter/GeneralAdapter$Output;", "Landroid/speech/tts/TextToSpeech$OnInitListener;", "()V", "adapter", "Ldev/cct/translatorapp/adapter/GeneralAdapter;", "getAdapter", "()Ldev/cct/translatorapp/adapter/GeneralAdapter;", "setAdapter", "(Ldev/cct/translatorapp/adapter/GeneralAdapter;)V", "binding", "Ldev/cct/translatorapp/databinding/ActivityGeneralBinding;", "getBinding", "()Ldev/cct/translatorapp/databinding/ActivityGeneralBinding;", "setBinding", "(Ldev/cct/translatorapp/databinding/ActivityGeneralBinding;)V", "iLang", "", "list", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getList", "()Ljava/util/ArrayList;", "setList", "(Ljava/util/ArrayList;)V", "oLang", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "tts", "Landroid/speech/tts/TextToSpeech;", "getTts", "()Landroid/speech/tts/TextToSpeech;", "setTts", "(Landroid/speech/tts/TextToSpeech;)V", "attachBaseContext", "", "newBase", "Landroid/content/Context;", "copy", "text", "hideSearch", "initListeners", "languageChange", "context", "locale", "Ljava/util/Locale;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onInit", NotificationCompat.CATEGORY_STATUS, "", "onPause", "onResume", "onStart", "readJSONFromAssets", "Lorg/json/JSONArray;", "path", FirebaseAnalytics.Event.SHARE, "speak", "translate", "phList", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GeneralActivity extends AppCompatActivity implements GeneralAdapter.Output, TextToSpeech.OnInitListener {
    public GeneralAdapter adapter;
    public ActivityGeneralBinding binding;
    private String iLang;
    private ArrayList<String> list = new ArrayList<>();
    private String oLang;
    public RecyclerView recyclerView;
    private TextToSpeech tts;

    @Override // android.speech.tts.TextToSpeech.OnInitListener
    public void onInit(int status) {
    }

    public final ActivityGeneralBinding getBinding() {
        ActivityGeneralBinding activityGeneralBinding = this.binding;
        if (activityGeneralBinding != null) {
            return activityGeneralBinding;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final void setBinding(ActivityGeneralBinding activityGeneralBinding) {
        Intrinsics.checkNotNullParameter(activityGeneralBinding, "<set-?>");
        this.binding = activityGeneralBinding;
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

    public final GeneralAdapter getAdapter() {
        GeneralAdapter generalAdapter = this.adapter;
        if (generalAdapter != null) {
            return generalAdapter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("adapter");
        return null;
    }

    public final void setAdapter(GeneralAdapter generalAdapter) {
        Intrinsics.checkNotNullParameter(generalAdapter, "<set-?>");
        this.adapter = generalAdapter;
    }

    public final ArrayList<String> getList() {
        return this.list;
    }

    public final void setList(ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.list = arrayList;
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
        String str;
        super.onCreate(savedInstanceState);
        ActivityGeneralBinding inflate = ActivityGeneralBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        setBinding(inflate);
        setContentView(getBinding().getRoot());
        GeneralActivity generalActivity = this;
        this.tts = new TextToSpeech(generalActivity, this);
        RecyclerView recyclerView = getBinding().generalRec;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.generalRec");
        setRecyclerView(recyclerView);
        getRecyclerView().setLayoutManager(new LinearLayoutManager(this) { // from class: dev.cct.translatorapp.ui.GeneralActivity$onCreate$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }

            {
                super(this);
            }
        });
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("category");
        String stringExtra2 = intent.getStringExtra("phrasesFile");
        this.iLang = intent.getStringExtra("inputLangC");
        this.oLang = intent.getStringExtra("outputLangC");
        GeneralAdapter generalAdapter = null;
        JSONArray readJSONFromAssets = stringExtra2 != null ? readJSONFromAssets(generalActivity, stringExtra2) : null;
        Intrinsics.checkNotNull(readJSONFromAssets);
        getBinding().categoryTv.setText(stringExtra);
        String str2 = this.iLang;
        if (str2 != null && (str = this.oLang) != null) {
            generalAdapter = new GeneralAdapter(generalActivity, str2, str, this);
        }
        Intrinsics.checkNotNull(generalAdapter);
        setAdapter(generalAdapter);
        getRecyclerView().setAdapter(getAdapter());
        if (ExtensionFunction.INSTANCE.checkInternetConnection(generalActivity)) {
            translate(readJSONFromAssets, getAdapter());
        } else {
            this.list.clear();
            int length = readJSONFromAssets.length();
            for (int i = 0; i < length; i++) {
                ArrayList<String> arrayList = this.list;
                Object obj = readJSONFromAssets.get(i);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                arrayList.add((String) obj);
            }
            getAdapter().setData(this.list);
            getBinding().progressBar.setVisibility(4);
        }
        initListeners();
    }

    private final void translate(JSONArray phList, GeneralAdapter adapter) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new GeneralActivity$translate$1(phList, objectRef, this, adapter, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final JSONArray readJSONFromAssets(Context context, String path) {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = new JSONArray();
        try {
            InputStream open = context.getAssets().open(path);
            Intrinsics.checkNotNullExpressionValue(open, "context.assets.open(path)");
            Reader inputStreamReader = new InputStreamReader(open, Charsets.UTF_8);
            BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
            try {
                String readText = TextStreamsKt.readText(bufferedReader);
                CloseableKt.closeFinally(bufferedReader, null);
                JSONArray jSONArray2 = new JSONObject(readText).getJSONArray("general_phrases");
                Intrinsics.checkNotNullExpressionValue(jSONArray2, "obj.getJSONArray(\"general_phrases\")");
                try {
                    CollectionsKt.addAll(arrayList, (String[]) jSONArray2);
                    return jSONArray2;
                } catch (Exception unused) {
                    jSONArray = jSONArray2;
                    return jSONArray;
                }
            } finally {
            }
        } catch (Exception unused2) {
        }
    }

    private final void initListeners() {
        final ActivityGeneralBinding binding = getBinding();
        binding.backFromPhrasebookIcon.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.GeneralActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GeneralActivity.initListeners$lambda$8$lambda$4(GeneralActivity.this, view);
            }
        });
        binding.backFromSearchIcon.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.GeneralActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GeneralActivity.initListeners$lambda$8$lambda$5(GeneralActivity.this, view);
            }
        });
        binding.crossIcon.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.GeneralActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GeneralActivity.initListeners$lambda$8$lambda$6(GeneralActivity.this, view);
            }
        });
        binding.searchGeneral.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.GeneralActivity$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GeneralActivity.initListeners$lambda$8$lambda$7(ActivityGeneralBinding.this, view);
            }
        });
        binding.searchPhrases.addTextChangedListener(new TextWatcher() { // from class: dev.cct.translatorapp.ui.GeneralActivity$initListeners$1$5
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence searchedText, int start, int before, int count) {
                GeneralActivity.this.getAdapter().searchList(searchedText, GeneralActivity.this.getList());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$8$lambda$4(GeneralActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ExtensionFunction.INSTANCE.openActivity(this$0, PhrasebookActivity.class);
        this$0.finish();
        this$0.overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$8$lambda$5(GeneralActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideSearch();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$8$lambda$6(GeneralActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideSearch();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$8$lambda$7(ActivityGeneralBinding this_with, View view) {
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        this_with.searchPhrases.setVisibility(0);
        this_with.searchPhrases.setEnabled(true);
        this_with.searchGeneral.setVisibility(8);
        this_with.crossIcon.setVisibility(0);
        this_with.categoryTv.setVisibility(8);
        this_with.backFromPhrasebookIcon.setVisibility(8);
        this_with.backFromSearchIcon.setVisibility(0);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ExtensionFunction.INSTANCE.openActivity(this, PhrasebookActivity.class);
        finish();
        overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
    }

    @Override // dev.cct.translatorapp.adapter.GeneralAdapter.Output
    public void speak(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        Log.d("TAG", "speakOut: text=" + text);
        TextToSpeech textToSpeech = this.tts;
        Intrinsics.checkNotNull(textToSpeech);
        textToSpeech.speak(text, 0, null, "");
    }

    @Override // dev.cct.translatorapp.adapter.GeneralAdapter.Output
    public void share(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", text);
        startActivity(Intent.createChooser(intent, null));
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    private final void hideSearch() {
        ActivityGeneralBinding binding = getBinding();
        binding.searchPhrases.setText("");
        binding.searchPhrases.setVisibility(8);
        binding.searchPhrases.setEnabled(false);
        binding.crossIcon.setVisibility(8);
        binding.categoryTv.setVisibility(0);
        binding.searchGeneral.setVisibility(0);
        binding.backFromPhrasebookIcon.setVisibility(0);
        binding.backFromSearchIcon.setVisibility(8);
    }

    @Override // dev.cct.translatorapp.adapter.GeneralAdapter.Output
    public void copy(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        ExtensionFunction.INSTANCE.copyToClipboard(this, text);
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
