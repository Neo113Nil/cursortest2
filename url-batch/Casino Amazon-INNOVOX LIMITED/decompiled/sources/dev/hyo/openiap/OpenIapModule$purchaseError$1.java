package dev.hyo.openiap;

import dev.hyo.openiap.helpers.HelpersKt;
import dev.hyo.openiap.listener.OpenIapPurchaseErrorListener;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OpenIapModule.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Ldev/hyo/openiap/PurchaseError;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "dev.hyo.openiap.OpenIapModule$purchaseError$1", f = "OpenIapModule.kt", i = {}, l = {1198}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class OpenIapModule$purchaseError$1 extends SuspendLambda implements Function1<Continuation<? super PurchaseError>, Object> {
    int label;
    final /* synthetic */ OpenIapModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OpenIapModule$purchaseError$1(OpenIapModule openIapModule, Continuation<? super OpenIapModule$purchaseError$1> continuation) {
        super(1, continuation);
        this.this$0 = openIapModule;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new OpenIapModule$purchaseError$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super PurchaseError> continuation) {
        return ((OpenIapModule$purchaseError$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: OpenIapModule.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: dev.hyo.openiap.OpenIapModule$purchaseError$1$1, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<OpenIapPurchaseErrorListener, Unit> {
        AnonymousClass1(Object obj) {
            super(1, obj, OpenIapModule.class, "addPurchaseErrorListener", "addPurchaseErrorListener(Ldev/hyo/openiap/listener/OpenIapPurchaseErrorListener;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OpenIapPurchaseErrorListener openIapPurchaseErrorListener) {
            invoke2(openIapPurchaseErrorListener);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(OpenIapPurchaseErrorListener p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((OpenIapModule) this.receiver).addPurchaseErrorListener(p0);
        }
    }

    /* compiled from: OpenIapModule.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: dev.hyo.openiap.OpenIapModule$purchaseError$1$2, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function1<OpenIapPurchaseErrorListener, Unit> {
        AnonymousClass2(Object obj) {
            super(1, obj, OpenIapModule.class, "removePurchaseErrorListener", "removePurchaseErrorListener(Ldev/hyo/openiap/listener/OpenIapPurchaseErrorListener;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OpenIapPurchaseErrorListener openIapPurchaseErrorListener) {
            invoke2(openIapPurchaseErrorListener);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(OpenIapPurchaseErrorListener p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((OpenIapModule) this.receiver).removePurchaseErrorListener(p0);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        this.label = 1;
        Object onPurchaseError = HelpersKt.onPurchaseError(new AnonymousClass1(this.this$0), new AnonymousClass2(this.this$0), this);
        return onPurchaseError == coroutine_suspended ? coroutine_suspended : onPurchaseError;
    }
}
