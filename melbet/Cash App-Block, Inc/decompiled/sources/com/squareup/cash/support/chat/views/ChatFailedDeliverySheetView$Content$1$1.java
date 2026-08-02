package com.squareup.cash.support.chat.views;

import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class ChatFailedDeliverySheetView$Content$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ DelegatingSoftwareKeyboardController $keyboardController;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChatFailedDeliverySheetView$Content$1$1(DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$keyboardController = delegatingSoftwareKeyboardController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new ChatFailedDeliverySheetView$Content$1$1(this.$keyboardController, continuation, 0);
            case 1:
                return new ChatFailedDeliverySheetView$Content$1$1(this.$keyboardController, continuation, 1);
            case 2:
                return new ChatFailedDeliverySheetView$Content$1$1(this.$keyboardController, continuation, 2);
            default:
                return new ChatFailedDeliverySheetView$Content$1$1(this.$keyboardController, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((ChatFailedDeliverySheetView$Content$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = this.$keyboardController;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (delegatingSoftwareKeyboardController != null) {
                    delegatingSoftwareKeyboardController.hide();
                }
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (delegatingSoftwareKeyboardController != null) {
                    delegatingSoftwareKeyboardController.hide();
                }
                break;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (delegatingSoftwareKeyboardController != null) {
                    delegatingSoftwareKeyboardController.hide();
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (delegatingSoftwareKeyboardController != null) {
                    delegatingSoftwareKeyboardController.hide();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
