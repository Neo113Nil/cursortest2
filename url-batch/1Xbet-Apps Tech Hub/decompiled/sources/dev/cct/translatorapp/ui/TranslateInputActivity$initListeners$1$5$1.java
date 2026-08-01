package dev.cct.translatorapp.ui;

import android.content.Intent;
import dev.cct.translatorapp.databinding.ActivityTranslateInputBinding;
import dev.cct.translatorapp.util.ApiService;
import dev.cct.translatorapp.util.ExtensionFunctionKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TranslateInputActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "dev.cct.translatorapp.ui.TranslateInputActivity$initListeners$1$5$1", f = "TranslateInputActivity.kt", i = {}, l = {118}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class TranslateInputActivity$initListeners$1$5$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.ObjectRef<String> $outputText;
    final /* synthetic */ ActivityTranslateInputBinding $this_with;
    Object L$0;
    int label;
    final /* synthetic */ TranslateInputActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TranslateInputActivity$initListeners$1$5$1(Ref.ObjectRef<String> objectRef, ActivityTranslateInputBinding activityTranslateInputBinding, TranslateInputActivity translateInputActivity, Continuation<? super TranslateInputActivity$initListeners$1$5$1> continuation) {
        super(2, continuation);
        this.$outputText = objectRef;
        this.$this_with = activityTranslateInputBinding;
        this.this$0 = translateInputActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TranslateInputActivity$initListeners$1$5$1(this.$outputText, this.$this_with, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TranslateInputActivity$initListeners$1$5$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref.ObjectRef<String> objectRef;
        T t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.ObjectRef<String> objectRef2 = this.$outputText;
            this.L$0 = objectRef2;
            this.label = 1;
            Object translateText = new ApiService().translateText(this.$this_with.editText.getText().toString(), ExtensionFunctionKt.getTranslateLangList().get(this.this$0.getPref().getTranslateInput()).getLangCode(), ExtensionFunctionKt.getTranslateLangList().get(this.this$0.getPref().getTranslateOutput()).getLangCode(), this);
            if (translateText == coroutine_suspended) {
                return coroutine_suspended;
            }
            objectRef = objectRef2;
            t = translateText;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) this.L$0;
            ResultKt.throwOnFailure(obj);
            t = obj;
        }
        objectRef.element = t;
        Intent intent = new Intent(this.this$0, (Class<?>) HomeScreenActivity.class);
        intent.putExtra("translate_input", this.this$0.getBinding().editText.getText().toString());
        intent.putExtra("translate_output", this.$outputText.element);
        this.this$0.setResult(-1, intent);
        this.this$0.finish();
        return Unit.INSTANCE;
    }
}
