package androidx.datastore.core;

import androidx.compose.runtime.ComposerKt;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* compiled from: FileStorage.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.FileWriteScope$writeData$2", f = "FileStorage.kt", i = {0}, l = {ComposerKt.referenceKey}, m = "invokeSuspend", n = {"stream"}, s = {"L$1"}, v = 1)
/* loaded from: classes2.dex */
final class FileWriteScope$writeData$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ T $value;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ FileWriteScope<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FileWriteScope$writeData$2(FileWriteScope<T> fileWriteScope, T t, Continuation<? super FileWriteScope$writeData$2> continuation) {
        super(1, continuation);
        this.this$0 = fileWriteScope;
        this.$value = t;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new FileWriteScope$writeData$2(this.this$0, this.$value, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((FileWriteScope$writeData$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FileOutputStream fileOutputStream;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r1 = this.label;
        try {
            try {
                if (r1 == 0) {
                    ResultKt.throwOnFailure(obj);
                    FileOutputStream fileOutputStream2 = new FileOutputStream(this.this$0.getFile());
                    FileReadScope fileReadScope = this.this$0;
                    Object obj2 = this.$value;
                    FileOutputStream fileOutputStream3 = fileOutputStream2;
                    Serializer serializer = fileReadScope.getSerializer();
                    UncloseableOutputStream uncloseableOutputStream = new UncloseableOutputStream(fileOutputStream3);
                    this.L$0 = fileOutputStream2;
                    this.L$1 = fileOutputStream3;
                    this.label = 1;
                    if (serializer.writeTo(obj2, uncloseableOutputStream, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    fileOutputStream = fileOutputStream3;
                    r1 = fileOutputStream2;
                } else {
                    if (r1 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fileOutputStream = (FileOutputStream) this.L$1;
                    java.io.Closeable closeable = (java.io.Closeable) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    r1 = closeable;
                }
                fileOutputStream.getFD().sync();
                Unit unit = Unit.INSTANCE;
                kotlin.io.CloseableKt.closeFinally(r1, null);
                return Unit.INSTANCE;
            } finally {
            }
        } catch (Exception e) {
            if (e instanceof FileNotFoundException) {
                throw DirectBootExceptionUtilKt.wrapExceptionIfDueToDirectBoot(this.this$0.getFile().getParent(), e);
            }
            throw e;
        }
    }
}
