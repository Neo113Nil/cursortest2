package dev.cct.translatorapp.ui;

import android.app.AlertDialog;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.card.MaterialCardViewHelper;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import dev.cct.translatorapp.dataModel.HistoryModel;
import dev.cct.translatorapp.databinding.ActivityTextTranslationBinding;
import dev.cct.translatorapp.util.ExtensionFunctionKt;
import dev.cct.translatorapp.util.HitTranslationApi;
import dev.cct.translatorapp.viewModel.HistoryViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextTranslation.kt */
@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"dev/cct/translatorapp/ui/TextTranslation$translate$1", "Ldev/cct/translatorapp/util/HitTranslationApi$TranslationComplete;", "translationCompleted", "", "translation", "", "language", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TextTranslation$translate$1 implements HitTranslationApi.TranslationComplete {
    final /* synthetic */ TextTranslation this$0;

    TextTranslation$translate$1(TextTranslation textTranslation) {
        this.this$0 = textTranslation;
    }

    @Override // dev.cct.translatorapp.util.HitTranslationApi.TranslationComplete
    public void translationCompleted(String translation, String language) {
        ActivityTextTranslationBinding binding;
        AlertDialog alertDialog;
        HistoryViewModel historyViewModel;
        ActivityTextTranslationBinding binding2;
        ActivityTextTranslationBinding binding3;
        ActivityTextTranslationBinding binding4;
        Intrinsics.checkNotNullParameter(translation, "translation");
        Intrinsics.checkNotNullParameter(language, "language");
        Log.d(this.this$0.getTAG(), "translationCompleted: " + translation + " //" + language);
        binding = this.this$0.getBinding();
        binding.outputText.setText(translation);
        alertDialog = this.this$0.loadingDialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        historyViewModel = this.this$0.getHistoryViewModel();
        String langCode = ExtensionFunctionKt.getTranslateLangList().get(this.this$0.getPref().getTranslateInput()).getLangCode();
        String langCode2 = ExtensionFunctionKt.getTranslateLangList().get(this.this$0.getPref().getTranslateOutput()).getLangCode();
        binding2 = this.this$0.getBinding();
        String obj = binding2.editText.getText().toString();
        binding3 = this.this$0.getBinding();
        CharSequence text = binding3.outputText.getText();
        Intrinsics.checkNotNull(text, "null cannot be cast to non-null type kotlin.String");
        historyViewModel.insert(new HistoryModel(0, langCode, langCode2, obj, (String) text, false, false, 64, null));
        Handler handler = new Handler(Looper.getMainLooper());
        final TextTranslation textTranslation = this.this$0;
        handler.postDelayed(new Runnable() { // from class: dev.cct.translatorapp.ui.TextTranslation$translate$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                TextTranslation$translate$1.translationCompleted$lambda$0(TextTranslation.this);
            }
        }, 500L);
        binding4 = this.this$0.getBinding();
        NestedScrollView nestedScrollView = binding4.scrollable;
        final TextTranslation textTranslation2 = this.this$0;
        nestedScrollView.post(new Runnable() { // from class: dev.cct.translatorapp.ui.TextTranslation$translate$1$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                TextTranslation$translate$1.translationCompleted$lambda$1(TextTranslation.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void translationCompleted$lambda$0(TextTranslation this$0) {
        ActivityTextTranslationBinding binding;
        ActivityTextTranslationBinding binding2;
        ActivityTextTranslationBinding binding3;
        ActivityTextTranslationBinding binding4;
        ActivityTextTranslationBinding binding5;
        ActivityTextTranslationBinding binding6;
        ActivityTextTranslationBinding binding7;
        ActivityTextTranslationBinding binding8;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        binding = this$0.getBinding();
        ExtendedFloatingActionButton extendedFloatingActionButton = binding.extFloatingActionButton;
        Intrinsics.checkNotNullExpressionValue(extendedFloatingActionButton, "binding.extFloatingActionButton");
        this$0.fadeInView(extendedFloatingActionButton);
        binding2 = this$0.getBinding();
        View view = binding2.viewColorLine;
        Intrinsics.checkNotNullExpressionValue(view, "binding.viewColorLine");
        this$0.fadeInView(view);
        binding3 = this$0.getBinding();
        TextView textView = binding3.outputText;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.outputText");
        this$0.fadeInView(textView);
        binding4 = this$0.getBinding();
        LinearLayout linearLayout = binding4.linearIconLayout;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.linearIconLayout");
        this$0.fadeInView(linearLayout);
        binding5 = this$0.getBinding();
        LinearLayout linearLayout2 = binding5.linearIconLayoutInput;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "binding.linearIconLayoutInput");
        this$0.fadeInView(linearLayout2);
        binding6 = this$0.getBinding();
        MaterialCardView materialCardView = binding6.pasteIcon;
        Intrinsics.checkNotNullExpressionValue(materialCardView, "binding.pasteIcon");
        materialCardView.setVisibility(8);
        binding7 = this$0.getBinding();
        ImageView imageView = binding7.micIcon;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.micIcon");
        imageView.setVisibility(8);
        binding8 = this$0.getBinding();
        Button button = binding8.translateBtn;
        Intrinsics.checkNotNullExpressionValue(button, "binding.translateBtn");
        button.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void translationCompleted$lambda$1(TextTranslation this$0) {
        ActivityTextTranslationBinding binding;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        binding = this$0.getBinding();
        binding.scrollable.scrollTo(0, MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION);
    }
}
