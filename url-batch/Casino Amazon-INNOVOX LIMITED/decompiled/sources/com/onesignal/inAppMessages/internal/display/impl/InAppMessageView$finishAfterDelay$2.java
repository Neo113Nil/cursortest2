package com.onesignal.inAppMessages.internal.display.impl;

import android.widget.RelativeLayout;
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

/* compiled from: InAppMessageView.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.inAppMessages.internal.display.impl.InAppMessageView$finishAfterDelay$2", f = "InAppMessageView.kt", i = {}, l = {477, 479}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class InAppMessageView$finishAfterDelay$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ InAppMessageView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InAppMessageView$finishAfterDelay$2(InAppMessageView inAppMessageView, Continuation<? super InAppMessageView$finishAfterDelay$2> continuation) {
        super(2, continuation);
        this.this$0 = inAppMessageView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InAppMessageView$finishAfterDelay$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InAppMessageView$finishAfterDelay$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        if (r6 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002c, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(600, r5) == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        RelativeLayout relativeLayout;
        RelativeLayout relativeLayout2;
        Object animateAndDismissLayout;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        z = this.this$0.hasBackground;
        if (z) {
            relativeLayout = this.this$0.parentRelativeLayout;
            if (relativeLayout != null) {
                InAppMessageView inAppMessageView = this.this$0;
                relativeLayout2 = inAppMessageView.parentRelativeLayout;
                Intrinsics.checkNotNull(relativeLayout2);
                this.label = 2;
                animateAndDismissLayout = inAppMessageView.animateAndDismissLayout(relativeLayout2, this);
            }
        }
        this.this$0.cleanupViewsAfterDismiss();
        return Unit.INSTANCE;
    }
}
