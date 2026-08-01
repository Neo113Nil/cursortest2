package expo.modules.updates;

import android.content.Context;
import expo.modules.updates.UpdatesModule;
import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AsyncFunctionBuilder.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0010\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0004H\n¨\u0006\u0005"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "<destruct>", "", "expo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$3"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.updates.UpdatesModule$definition$lambda$18$$inlined$Coroutine$10", f = "UpdatesModule.kt", i = {}, l = {271}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class UpdatesModule$definition$lambda$18$$inlined$Coroutine$10 extends SuspendLambda implements Function3<CoroutineScope, Object[], Continuation<? super Object>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ UpdatesModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdatesModule$definition$lambda$18$$inlined$Coroutine$10(Continuation continuation, UpdatesModule updatesModule) {
        super(3, continuation);
        this.this$0 = updatesModule;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Object[] objArr, Continuation<? super Object> continuation) {
        return invoke2(coroutineScope, objArr, (Continuation<Object>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Object[] objArr, Continuation<Object> continuation) {
        UpdatesModule$definition$lambda$18$$inlined$Coroutine$10 updatesModule$definition$lambda$18$$inlined$Coroutine$10 = new UpdatesModule$definition$lambda$18$$inlined$Coroutine$10(continuation, this.this$0);
        updatesModule$definition$lambda$18$$inlined$Coroutine$10.L$0 = objArr;
        return updatesModule$definition$lambda$18$$inlined$Coroutine$10.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Context context;
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
        long longValue = ((Number) ((Object[]) this.L$0)[0]).longValue();
        UpdatesModule.Companion companion = UpdatesModule.INSTANCE;
        context = this.this$0.getContext();
        File filesDir = context.getFilesDir();
        Intrinsics.checkNotNullExpressionValue(filesDir, "getFilesDir(...)");
        this.label = 1;
        Object readLogEntries$expo_updates_release = companion.readLogEntries$expo_updates_release(filesDir, longValue, this);
        return readLogEntries$expo_updates_release == coroutine_suspended ? coroutine_suspended : readLogEntries$expo_updates_release;
    }
}
