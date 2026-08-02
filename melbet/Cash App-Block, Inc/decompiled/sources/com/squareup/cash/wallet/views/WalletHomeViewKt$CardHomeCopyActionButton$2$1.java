package com.squareup.cash.wallet.views;

import androidx.compose.runtime.MutableState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimatable;
import com.airbnb.lottie.compose.LottieCompositionResult;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class WalletHomeViewKt$CardHomeCopyActionButton$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ LottieAnimatable $anim;
    public final /* synthetic */ LottieCompositionResult $composition$delegate;
    public final /* synthetic */ MutableState $isAnimating$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletHomeViewKt$CardHomeCopyActionButton$2$1(LottieAnimatable lottieAnimatable, MutableState mutableState, LottieCompositionResult lottieCompositionResult, Continuation continuation) {
        super(2, continuation);
        this.$anim = lottieAnimatable;
        this.$isAnimating$delegate = mutableState;
        this.$composition$delegate = lottieCompositionResult;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WalletHomeViewKt$CardHomeCopyActionButton$2$1(this.$anim, this.$isAnimating$delegate, this.$composition$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((WalletHomeViewKt$CardHomeCopyActionButton$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0070, code lost:
    
        if (com.airbnb.lottie.compose.LottieAnimatable.DefaultImpls.animate$default(r17.$anim, r1, 0, 0, false, androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE, null, androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE, false, null, false, false, r17, 2046, null) == r15) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0072, code lost:
    
        return r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
    
        if (com.airbnb.lottie.compose.LottieAnimatable.DefaultImpls.snapTo$default(r17.$anim, null, androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE, 0, false, r17, 13, null) == r15) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MutableState mutableState;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        LottieCompositionResult lottieCompositionResult = this.$composition$delegate;
        MutableState mutableState2 = this.$isAnimating$delegate;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            if (!((Boolean) mutableState2.getValue()).booleanValue() || ((LottieComposition) lottieCompositionResult.getValue()) == null) {
                return Unit.INSTANCE;
            }
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                mutableState = mutableState2;
                mutableState.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            }
            SafeTrace.throwOnFailure(obj);
        }
        LottieComposition lottieComposition = (LottieComposition) lottieCompositionResult.getValue();
        this.label = 2;
        mutableState = mutableState2;
    }
}
