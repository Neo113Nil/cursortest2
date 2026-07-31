package dev.hyo.openiap;

import com.android.billingclient.api.BillingClient;
import dev.hyo.openiap.helpers.ProductManager;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: OpenIapModule.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "dev.hyo.openiap.OpenIapModule$endConnection$1", f = "OpenIapModule.kt", i = {}, l = {159}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class OpenIapModule$endConnection$1 extends SuspendLambda implements Function1<Continuation<? super Boolean>, Object> {
    int label;
    final /* synthetic */ OpenIapModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OpenIapModule$endConnection$1(OpenIapModule openIapModule, Continuation<? super OpenIapModule$endConnection$1> continuation) {
        super(1, continuation);
        this.this$0 = openIapModule;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new OpenIapModule$endConnection$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Boolean> continuation) {
        return ((OpenIapModule$endConnection$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: OpenIapModule.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "dev.hyo.openiap.OpenIapModule$endConnection$1$1", f = "OpenIapModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: dev.hyo.openiap.OpenIapModule$endConnection$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ OpenIapModule this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(OpenIapModule openIapModule, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = openIapModule;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m3984constructorimpl;
            boolean z;
            BillingClient billingClient;
            ProductManager productManager;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            OpenIapModule openIapModule = this.this$0;
            try {
                Result.Companion companion = Result.INSTANCE;
                billingClient = openIapModule.billingClient;
                if (billingClient != null) {
                    billingClient.endConnection();
                }
                productManager = openIapModule.productManager;
                productManager.clear();
                openIapModule.billingClient = null;
                m3984constructorimpl = Result.m3984constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m3984constructorimpl = Result.m3984constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m3987exceptionOrNullimpl(m3984constructorimpl) == null) {
                z = true;
            } else {
                z = false;
            }
            return Boxing.boxBoolean(z);
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
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass1(this.this$0, null), this);
        return withContext == coroutine_suspended ? coroutine_suspended : withContext;
    }
}
