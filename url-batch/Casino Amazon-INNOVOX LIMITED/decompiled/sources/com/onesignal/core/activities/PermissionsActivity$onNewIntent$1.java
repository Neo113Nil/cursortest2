package com.onesignal.core.activities;

import android.content.Intent;
import com.facebook.soloader.Elf64;
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
@DebugMetadata(c = "com.onesignal.core.activities.PermissionsActivity$onNewIntent$1", f = "PermissionsActivity.kt", i = {}, l = {Elf64.Ehdr.E_SHSTRNDX}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class PermissionsActivity$onNewIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Intent $intent;
    int label;
    final /* synthetic */ PermissionsActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PermissionsActivity$onNewIntent$1(PermissionsActivity permissionsActivity, Intent intent, Continuation<? super PermissionsActivity$onNewIntent$1> continuation) {
        super(2, continuation);
        this.this$0 = permissionsActivity;
        this.$intent = intent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PermissionsActivity$onNewIntent$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PermissionsActivity$onNewIntent$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object handleBundleParams;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            handleBundleParams = this.this$0.handleBundleParams(this.$intent.getExtras(), this);
            if (handleBundleParams == coroutine_suspended) {
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
