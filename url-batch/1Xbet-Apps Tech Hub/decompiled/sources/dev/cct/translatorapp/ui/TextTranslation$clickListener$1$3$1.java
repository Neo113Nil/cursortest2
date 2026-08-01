package dev.cct.translatorapp.ui;

import dev.cct.translatorapp.dataModel.FavoriteModel;
import dev.cct.translatorapp.databinding.ActivityTextTranslationBinding;
import dev.cct.translatorapp.util.ExtensionFunctionKt;
import dev.cct.translatorapp.viewModel.HistoryViewModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TextTranslation.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "dev.cct.translatorapp.ui.TextTranslation$clickListener$1$3$1", f = "TextTranslation.kt", i = {}, l = {524}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class TextTranslation$clickListener$1$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ TextTranslation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextTranslation$clickListener$1$3$1(TextTranslation textTranslation, Continuation<? super TextTranslation$clickListener$1$3$1> continuation) {
        super(2, continuation);
        this.this$0 = textTranslation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TextTranslation$clickListener$1$3$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TextTranslation$clickListener$1$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        HistoryViewModel historyViewModel;
        ActivityTextTranslationBinding binding;
        ActivityTextTranslationBinding binding2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            historyViewModel = this.this$0.getHistoryViewModel();
            String langCode = ExtensionFunctionKt.getTranslateLangList().get(this.this$0.getPref().getTranslateInput()).getLangCode();
            String langCode2 = ExtensionFunctionKt.getTranslateLangList().get(this.this$0.getPref().getTranslateOutput()).getLangCode();
            binding = this.this$0.getBinding();
            String obj2 = binding.editText.getText().toString();
            binding2 = this.this$0.getBinding();
            CharSequence text = binding2.outputText.getText();
            Intrinsics.checkNotNull(text, "null cannot be cast to non-null type kotlin.String");
            this.label = 1;
            if (historyViewModel.addToFavorite(new FavoriteModel(0, langCode, langCode2, obj2, (String) text, true, true), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
