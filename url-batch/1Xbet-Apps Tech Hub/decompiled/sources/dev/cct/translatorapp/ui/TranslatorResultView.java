package dev.cct.translatorapp.ui;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import dev.cct.translatorapp.databinding.ActivityTranslatorResultViewBinding;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TranslatorResultView.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0011H\u0014J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0011H\u0014J\b\u0010\u0019\u001a\u00020\u0011H\u0014J\b\u0010\u001a\u001a\u00020\u0011H\u0014R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Ldev/cct/translatorapp/ui/TranslatorResultView;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/speech/tts/TextToSpeech$OnInitListener;", "()V", "binding", "Ldev/cct/translatorapp/databinding/ActivityTranslatorResultViewBinding;", "getBinding", "()Ldev/cct/translatorapp/databinding/ActivityTranslatorResultViewBinding;", "binding$delegate", "Lkotlin/Lazy;", "tts", "Landroid/speech/tts/TextToSpeech;", "getTts", "()Landroid/speech/tts/TextToSpeech;", "setTts", "(Landroid/speech/tts/TextToSpeech;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onInit", NotificationCompat.CATEGORY_STATUS, "", "onPause", "onResume", "onStart", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TranslatorResultView extends AppCompatActivity implements TextToSpeech.OnInitListener {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Lazy binding = LazyKt.lazy(new Function0<ActivityTranslatorResultViewBinding>() { // from class: dev.cct.translatorapp.ui.TranslatorResultView$binding$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ActivityTranslatorResultViewBinding invoke() {
            return ActivityTranslatorResultViewBinding.inflate(TranslatorResultView.this.getLayoutInflater());
        }
    });
    private TextToSpeech tts;

    @Override // android.speech.tts.TextToSpeech.OnInitListener
    public void onInit(int status) {
    }

    private final ActivityTranslatorResultViewBinding getBinding() {
        return (ActivityTranslatorResultViewBinding) this.binding.getValue();
    }

    public final TextToSpeech getTts() {
        return this.tts;
    }

    public final void setTts(TextToSpeech textToSpeech) {
        this.tts = textToSpeech;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getBinding().getRoot());
        this.tts = new TextToSpeech(this, this);
        getBinding().outputTextResult.setText(getIntent().getStringExtra("result"));
        getBinding().back.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.TranslatorResultView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TranslatorResultView.onCreate$lambda$0(TranslatorResultView.this, view);
            }
        });
        getBinding().backToResultView.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.TranslatorResultView$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TranslatorResultView.onCreate$lambda$1(TranslatorResultView.this, view);
            }
        });
        getBinding().speakIcon.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.TranslatorResultView$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TranslatorResultView.onCreate$lambda$2(TranslatorResultView.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(TranslatorResultView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        TextToSpeech textToSpeech = this$0.tts;
        if (textToSpeech != null) {
            textToSpeech.stop();
        }
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1(TranslatorResultView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        TextToSpeech textToSpeech = this$0.tts;
        if (textToSpeech != null) {
            textToSpeech.stop();
        }
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$2(TranslatorResultView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        TextToSpeech textToSpeech = this$0.tts;
        if (textToSpeech != null) {
            textToSpeech.stop();
        }
        TextToSpeech textToSpeech2 = this$0.tts;
        if (textToSpeech2 != null) {
            textToSpeech2.speak(this$0.getBinding().outputTextResult.getText().toString(), 0, null, "");
        }
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
