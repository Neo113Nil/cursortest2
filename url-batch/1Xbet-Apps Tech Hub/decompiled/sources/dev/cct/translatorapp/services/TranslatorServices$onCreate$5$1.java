package dev.cct.translatorapp.services;

import android.widget.TextView;
import dev.cct.translatorapp.databinding.SmallLayoutBinding;
import dev.cct.translatorapp.util.ApiService;
import dev.cct.translatorapp.util.ExtensionFunctionKt;
import dev.cct.translatorapp.util.Preferences;
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

/* compiled from: TranslatorServices.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "dev.cct.translatorapp.services.TranslatorServices$onCreate$5$1", f = "TranslatorServices.kt", i = {}, l = {245}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class TranslatorServices$onCreate$5$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ TranslatorServices this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TranslatorServices$onCreate$5$1(TranslatorServices translatorServices, Continuation<? super TranslatorServices$onCreate$5$1> continuation) {
        super(2, continuation);
        this.this$0 = translatorServices;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TranslatorServices$onCreate$5$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TranslatorServices$onCreate$5$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SmallLayoutBinding smallLayoutBinding;
        SmallLayoutBinding smallLayoutBinding2;
        TextView textView;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            smallLayoutBinding = this.this$0.smallLayoutBinding;
            SmallLayoutBinding smallLayoutBinding3 = null;
            if (smallLayoutBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("smallLayoutBinding");
                smallLayoutBinding = null;
            }
            TextView textView2 = smallLayoutBinding.outputTxt;
            ApiService apiService = new ApiService();
            smallLayoutBinding2 = this.this$0.smallLayoutBinding;
            if (smallLayoutBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("smallLayoutBinding");
            } else {
                smallLayoutBinding3 = smallLayoutBinding2;
            }
            this.L$0 = textView2;
            this.label = 1;
            Object translateText = apiService.translateText(smallLayoutBinding3.editText.getText().toString(), ExtensionFunctionKt.getTranslateLangList().get(new Preferences(this.this$0).getInputLangWidget()).getLangCode(), ExtensionFunctionKt.getTranslateLangList().get(new Preferences(this.this$0).getOutputLangWidget()).getLangCode(), this);
            if (translateText == coroutine_suspended) {
                return coroutine_suspended;
            }
            textView = textView2;
            obj = translateText;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            textView = (TextView) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        textView.setText((CharSequence) obj);
        return Unit.INSTANCE;
    }
}
