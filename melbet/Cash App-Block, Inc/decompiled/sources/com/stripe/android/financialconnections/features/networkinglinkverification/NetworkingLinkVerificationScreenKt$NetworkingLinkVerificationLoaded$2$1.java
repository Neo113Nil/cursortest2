package com.stripe.android.financialconnections.features.networkinglinkverification;

import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import com.stripe.android.financialconnections.presentation.Async;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class NetworkingLinkVerificationScreenKt$NetworkingLinkVerificationLoaded$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Async $confirmVerificationAsync;
    public final /* synthetic */ FocusOwnerImpl $focusManager;
    public final /* synthetic */ DelegatingSoftwareKeyboardController $keyboardController;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NetworkingLinkVerificationScreenKt$NetworkingLinkVerificationLoaded$2$1(Async async, FocusOwnerImpl focusOwnerImpl, DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$confirmVerificationAsync = async;
        this.$focusManager = focusOwnerImpl;
        this.$keyboardController = delegatingSoftwareKeyboardController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new NetworkingLinkVerificationScreenKt$NetworkingLinkVerificationLoaded$2$1(this.$confirmVerificationAsync, this.$focusManager, this.$keyboardController, continuation, 0);
            default:
                return new NetworkingLinkVerificationScreenKt$NetworkingLinkVerificationLoaded$2$1(this.$confirmVerificationAsync, this.$focusManager, this.$keyboardController, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((NetworkingLinkVerificationScreenKt$NetworkingLinkVerificationLoaded$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = this.$keyboardController;
        FocusOwnerImpl focusOwnerImpl = this.$focusManager;
        Async async = this.$confirmVerificationAsync;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (async instanceof Async.Loading) {
                    focusOwnerImpl.clearFocus(true);
                    if (delegatingSoftwareKeyboardController != null) {
                        delegatingSoftwareKeyboardController.hide();
                    }
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (async instanceof Async.Loading) {
                    focusOwnerImpl.clearFocus(true);
                    if (delegatingSoftwareKeyboardController != null) {
                        delegatingSoftwareKeyboardController.hide();
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
