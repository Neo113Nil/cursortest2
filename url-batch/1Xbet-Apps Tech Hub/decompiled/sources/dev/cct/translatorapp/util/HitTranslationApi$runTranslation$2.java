package dev.cct.translatorapp.util;

import android.app.Activity;
import dev.cct.translatorapp.util.HitTranslationApi;
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

/* compiled from: HitTranslationApi.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "dev.cct.translatorapp.util.HitTranslationApi$runTranslation$2", f = "HitTranslationApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class HitTranslationApi$runTranslation$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $inputCode;
    final /* synthetic */ String $outputCode;
    final /* synthetic */ String $text;
    int label;
    final /* synthetic */ HitTranslationApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HitTranslationApi$runTranslation$2(HitTranslationApi hitTranslationApi, String str, String str2, String str3, Continuation<? super HitTranslationApi$runTranslation$2> continuation) {
        super(2, continuation);
        this.this$0 = hitTranslationApi;
        this.$text = str;
        this.$outputCode = str2;
        this.$inputCode = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HitTranslationApi$runTranslation$2(this.this$0, this.$text, this.$outputCode, this.$inputCode, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HitTranslationApi$runTranslation$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final String execute;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            execute = this.this$0.execute("manual", this.$text, this.$outputCode, this.$inputCode);
            Activity activity = this.this$0.getActivity();
            final HitTranslationApi hitTranslationApi = this.this$0;
            activity.runOnUiThread(new Runnable() { // from class: dev.cct.translatorapp.util.HitTranslationApi$runTranslation$2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    HitTranslationApi$runTranslation$2.invokeSuspend$lambda$0(HitTranslationApi.this, execute);
                }
            });
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(HitTranslationApi hitTranslationApi, String str) {
        HitTranslationApi.TranslationComplete translationComplete;
        String str2;
        translationComplete = hitTranslationApi.translationComplete;
        if (translationComplete != null) {
            Intrinsics.checkNotNull(str);
            str2 = hitTranslationApi.language;
            translationComplete.translationCompleted(str, str2);
        }
    }
}
