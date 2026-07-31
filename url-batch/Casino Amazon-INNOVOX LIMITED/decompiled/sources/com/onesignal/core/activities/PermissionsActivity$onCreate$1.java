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
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: PermissionsActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.core.activities.PermissionsActivity$onCreate$1", f = "PermissionsActivity.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class PermissionsActivity$onCreate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ PermissionsActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PermissionsActivity$onCreate$1(PermissionsActivity permissionsActivity, Continuation<? super PermissionsActivity$onCreate$1> continuation) {
        super(2, continuation);
        this.this$0 = permissionsActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PermissionsActivity$onCreate$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PermissionsActivity$onCreate$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: PermissionsActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "shouldFinish", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.onesignal.core.activities.PermissionsActivity$onCreate$1$1", f = "PermissionsActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.onesignal.core.activities.PermissionsActivity$onCreate$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ PermissionsActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PermissionsActivity permissionsActivity, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = permissionsActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (this.Z$0) {
                this.this$0.finishActivity();
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PermissionsViewModel viewModel;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            viewModel = this.this$0.getViewModel();
            this.label = 1;
            if (FlowKt.collectLatest(viewModel.getShouldFinish(), new AnonymousClass1(this.this$0, null), this) == coroutine_suspended) {
                return coroutine_suspended;
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
