package expo.modules.updates.procedures;

import android.app.Activity;
import com.facebook.react.ReactApplication;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: RecreateReactContextProcedure.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.updates.procedures.RecreateReactContextProcedure$run$2", f = "RecreateReactContextProcedure.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class RecreateReactContextProcedure$run$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ReactApplication $reactApplication;
    int label;
    final /* synthetic */ RecreateReactContextProcedure this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecreateReactContextProcedure$run$2(ReactApplication reactApplication, RecreateReactContextProcedure recreateReactContextProcedure, Continuation<? super RecreateReactContextProcedure$run$2> continuation) {
        super(2, continuation);
        this.$reactApplication = reactApplication;
        this.this$0 = recreateReactContextProcedure;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RecreateReactContextProcedure$run$2(this.$reactApplication, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RecreateReactContextProcedure$run$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: RecreateReactContextProcedure.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "expo.modules.updates.procedures.RecreateReactContextProcedure$run$2$1", f = "RecreateReactContextProcedure.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: expo.modules.updates.procedures.RecreateReactContextProcedure$run$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ReactApplication $reactApplication;
        int label;
        final /* synthetic */ RecreateReactContextProcedure this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ReactApplication reactApplication, RecreateReactContextProcedure recreateReactContextProcedure, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$reactApplication = reactApplication;
            this.this$0 = recreateReactContextProcedure;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$reactApplication, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            WeakReference weakReference;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ReactApplication reactApplication = this.$reactApplication;
            weakReference = this.this$0.weakActivity;
            RestartReactAppExtensionsKt.restart(reactApplication, weakReference != null ? (Activity) weakReference.get() : null, "Restart from RecreateReactContextProcedure");
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass1(this.$reactApplication, this.this$0, null), this) == coroutine_suspended) {
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
