package org.asyncstorage.storage;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableMap;
import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.asyncstorage.shared_storage.StorageException;

/* compiled from: RNStorage.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.asyncstorage.storage.RNStorageKt$lunchWithRejection$1", f = "RNStorage.kt", i = {}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class RNStorageKt$lunchWithRejection$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Continuation<? super T>, Object> $block;
    final /* synthetic */ Promise $promise;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    RNStorageKt$lunchWithRejection$1(Function1<? super Continuation<? super T>, ? extends Object> function1, Promise promise, Continuation<? super RNStorageKt$lunchWithRejection$1> continuation) {
        super(2, continuation);
        this.$block = function1;
        this.$promise = promise;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RNStorageKt$lunchWithRejection$1(this.$block, this.$promise, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RNStorageKt$lunchWithRejection$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        WritableMap writableMap;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Function1<Continuation<? super T>, Object> function1 = this.$block;
                this.label = 1;
                if (function1.invoke(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            if (e2 instanceof StorageException) {
                writableMap = Arguments.createMap();
                if (e2 instanceof StorageException.SqliteException) {
                    writableMap.putString(WebViewManager.EVENT_TYPE_KEY, "SqliteException");
                } else {
                    writableMap.putString(WebViewManager.EVENT_TYPE_KEY, "OtherException");
                }
            } else {
                writableMap = null;
            }
            this.$promise.reject("AsyncStorageError", e2.getMessage(), e2, writableMap);
        }
        return Unit.INSTANCE;
    }
}
