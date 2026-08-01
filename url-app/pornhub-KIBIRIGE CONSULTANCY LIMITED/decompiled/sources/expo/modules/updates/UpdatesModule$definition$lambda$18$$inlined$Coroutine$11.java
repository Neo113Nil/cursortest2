package expo.modules.updates;

import android.content.Context;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.updates.UpdatesModule;
import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AsyncFunctionBuilder.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0010\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0004H\n¨\u0006\u0005"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "it", "", "expo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$1"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.updates.UpdatesModule$definition$lambda$18$$inlined$Coroutine$11", f = "UpdatesModule.kt", i = {}, l = {22}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class UpdatesModule$definition$lambda$18$$inlined$Coroutine$11 extends SuspendLambda implements Function3<CoroutineScope, Object[], Continuation<? super Object>, Object> {
    int label;
    final /* synthetic */ UpdatesModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdatesModule$definition$lambda$18$$inlined$Coroutine$11(Continuation continuation, UpdatesModule updatesModule) {
        super(3, continuation);
        this.this$0 = updatesModule;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Object[] objArr, Continuation<? super Object> continuation) {
        return invoke2(coroutineScope, objArr, (Continuation<Object>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Object[] objArr, Continuation<Object> continuation) {
        return new UpdatesModule$definition$lambda$18$$inlined$Coroutine$11(continuation, this.this$0).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Context context;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            UpdatesModule.Companion companion = UpdatesModule.INSTANCE;
            context = this.this$0.getContext();
            File filesDir = context.getFilesDir();
            Intrinsics.checkNotNullExpressionValue(filesDir, "getFilesDir(...)");
            UpdatesModule$definition$1$11$1 updatesModule$definition$1$11$1 = new Function1<Exception, Unit>() { // from class: expo.modules.updates.UpdatesModule$definition$1$11$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Exception exc) {
                    invoke2(exc);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Exception exc) {
                    if (exc != null) {
                        throw new CodedException("ERR_UPDATES_READ_LOGS", "There was an error when clearing the expo-updates log file", exc);
                    }
                }
            };
            this.label = 1;
            if (companion.clearLogEntries$expo_updates_release(filesDir, updatesModule$definition$1$11$1, this) == coroutine_suspended) {
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
