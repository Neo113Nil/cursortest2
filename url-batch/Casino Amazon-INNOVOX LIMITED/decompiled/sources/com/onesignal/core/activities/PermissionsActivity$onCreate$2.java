package com.onesignal.core.activities;

import com.onesignal.core.internal.permissions.PermissionsViewModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PermissionsActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.core.activities.PermissionsActivity$onCreate$2", f = "PermissionsActivity.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class PermissionsActivity$onCreate$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ PermissionsActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PermissionsActivity$onCreate$2(PermissionsActivity permissionsActivity, Continuation<? super PermissionsActivity$onCreate$2> continuation) {
        super(2, continuation);
        this.this$0 = permissionsActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PermissionsActivity$onCreate$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PermissionsActivity$onCreate$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PermissionsViewModel viewModel;
        Object handleBundleParams;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            viewModel = this.this$0.getViewModel();
            if (viewModel.getPermissionRequestType() == null) {
                PermissionsActivity permissionsActivity = this.this$0;
                this.label = 1;
                handleBundleParams = permissionsActivity.handleBundleParams(permissionsActivity.getIntent().getExtras(), this);
                if (handleBundleParams == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
