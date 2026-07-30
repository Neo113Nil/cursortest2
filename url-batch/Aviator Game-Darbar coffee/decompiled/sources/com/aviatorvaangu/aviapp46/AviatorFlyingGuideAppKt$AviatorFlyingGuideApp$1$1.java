package com.aviatorvaangu.aviapp46;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import com.aviatorvaangu.aviapp46.ads.AdLauncherKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: AviatorFlyingGuideApp.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@DebugMetadata(c = "com.aviatorvaangu.aviapp46.AviatorFlyingGuideAppKt$AviatorFlyingGuideApp$1$1", f = "AviatorFlyingGuideApp.kt", i = {0}, l = {77}, m = "invokeSuspend", n = {"action"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class AviatorFlyingGuideAppKt$AviatorFlyingGuideApp$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ MutableState<Function0<Unit>> $pendingAdAction$delegate;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AviatorFlyingGuideAppKt$AviatorFlyingGuideApp$1$1(Context context, MutableState<Function0<Unit>> mutableState, Continuation<? super AviatorFlyingGuideAppKt$AviatorFlyingGuideApp$1$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$pendingAdAction$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AviatorFlyingGuideAppKt$AviatorFlyingGuideApp$1$1(this.$context, this.$pendingAdAction$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AviatorFlyingGuideAppKt$AviatorFlyingGuideApp$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Function0 AviatorFlyingGuideApp$lambda$5;
        Function0 function0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AviatorFlyingGuideApp$lambda$5 = AviatorFlyingGuideAppKt.AviatorFlyingGuideApp$lambda$5(this.$pendingAdAction$delegate);
            if (AviatorFlyingGuideApp$lambda$5 == null) {
                return Unit.INSTANCE;
            }
            this.L$0 = AviatorFlyingGuideApp$lambda$5;
            this.label = 1;
            if (DelayKt.delay(420L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            function0 = AviatorFlyingGuideApp$lambda$5;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function0 = (Function0) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        AdLauncherKt.openAdTab(this.$context);
        this.$pendingAdAction$delegate.setValue(null);
        function0.invoke();
        return Unit.INSTANCE;
    }
}
