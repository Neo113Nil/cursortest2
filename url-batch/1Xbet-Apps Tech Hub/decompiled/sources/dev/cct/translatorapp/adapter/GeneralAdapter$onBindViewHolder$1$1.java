package dev.cct.translatorapp.adapter;

import android.content.Context;
import android.widget.TextView;
import dev.cct.translatorapp.adapter.GeneralAdapter;
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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GeneralAdapter.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "dev.cct.translatorapp.adapter.GeneralAdapter$onBindViewHolder$1$1", f = "GeneralAdapter.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class GeneralAdapter$onBindViewHolder$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ GeneralAdapter.ViewHolder $holder;
    final /* synthetic */ String $phrase;
    Object L$0;
    int label;
    final /* synthetic */ GeneralAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GeneralAdapter$onBindViewHolder$1$1(GeneralAdapter generalAdapter, String str, GeneralAdapter.ViewHolder viewHolder, Continuation<? super GeneralAdapter$onBindViewHolder$1$1> continuation) {
        super(2, continuation);
        this.this$0 = generalAdapter;
        this.$phrase = str;
        this.$holder = viewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GeneralAdapter$onBindViewHolder$1$1(this.this$0, this.$phrase, this.$holder, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GeneralAdapter$onBindViewHolder$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        GeneralAdapter generalAdapter;
        Context context;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            GeneralAdapter generalAdapter2 = this.this$0;
            ApiService apiService = new ApiService();
            String str = this.$phrase;
            Intrinsics.checkNotNull(str, "null cannot be cast to non-null type kotlin.String");
            this.L$0 = generalAdapter2;
            this.label = 1;
            Object translateText = apiService.translateText(str, this.this$0.getILang(), this.this$0.getOLang(), this);
            if (translateText == coroutine_suspended) {
                return coroutine_suspended;
            }
            generalAdapter = generalAdapter2;
            obj = translateText;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            generalAdapter = (GeneralAdapter) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        generalAdapter.setOutputText((String) obj);
        this.$holder.getOutText().setText(this.this$0.getOutputText());
        this.$holder.getDropdownCard().setVisibility(0);
        this.$holder.getArrowIcon().setRotation(180.0f);
        TextView outputCardLang = this.$holder.getOutputCardLang();
        context = this.this$0.mContext;
        outputCardLang.setText(context.getString(ExtensionFunctionKt.getTranslateLangList().get(this.this$0.getPref().getPhOutputLang()).getLangName()));
        return Unit.INSTANCE;
    }
}
