package com.stripe.android.googlepaylauncher;

import androidx.activity.result.ActivityResultLauncher;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.valentinilk.shimmer.ShimmerModifierKt$shimmer$1$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class GooglePayLauncherActivity$onCreate$4 extends SuspendLambda implements Function2 {
    public final /* synthetic */ ActivityResultLauncher $googlePayLauncher;
    public int label;
    public final /* synthetic */ GooglePayLauncherActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePayLauncherActivity$onCreate$4(GooglePayLauncherActivity googlePayLauncherActivity, ActivityResultLauncher activityResultLauncher, Continuation continuation) {
        super(2, continuation);
        this.this$0 = googlePayLauncherActivity;
        this.$googlePayLauncher = activityResultLauncher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GooglePayLauncherActivity$onCreate$4(this.this$0, this.$googlePayLauncher, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((GooglePayLauncherActivity$onCreate$4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Continuation continuation = null;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Lifecycle.State state = Lifecycle.State.RESUMED;
            GooglePayLauncherActivity googlePayLauncherActivity = this.this$0;
            ShimmerModifierKt$shimmer$1$1 shimmerModifierKt$shimmer$1$1 = new ShimmerModifierKt$shimmer$1$1(googlePayLauncherActivity, this.$googlePayLauncher, continuation, 17);
            this.label = 1;
            Object repeatOnLifecycle = RepeatOnLifecycleKt.repeatOnLifecycle(googlePayLauncherActivity.getLifecycle(), state, shimmerModifierKt$shimmer$1$1, this);
            if (repeatOnLifecycle != obj2) {
                repeatOnLifecycle = Unit.INSTANCE;
            }
            if (repeatOnLifecycle == obj2) {
                return obj2;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
