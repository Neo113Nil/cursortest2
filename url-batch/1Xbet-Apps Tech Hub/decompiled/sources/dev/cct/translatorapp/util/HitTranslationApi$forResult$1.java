package dev.cct.translatorapp.util;

import dev.cct.translatorapp.util.HitTranslationApi;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: HitTranslationApi.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "dev.cct.translatorapp.util.HitTranslationApi$forResult$1", f = "HitTranslationApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class HitTranslationApi$forResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $result;
    int label;
    final /* synthetic */ HitTranslationApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HitTranslationApi$forResult$1(HitTranslationApi hitTranslationApi, String str, Continuation<? super HitTranslationApi$forResult$1> continuation) {
        super(2, continuation);
        this.this$0 = hitTranslationApi;
        this.$result = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HitTranslationApi$forResult$1(this.this$0, this.$result, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HitTranslationApi$forResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        HitTranslationApi.TranslationComplete translationComplete;
        String str;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            translationComplete = this.this$0.translationComplete;
            if (translationComplete != null) {
                String str2 = this.$result;
                str = this.this$0.language;
                translationComplete.translationCompleted(str2, str);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
