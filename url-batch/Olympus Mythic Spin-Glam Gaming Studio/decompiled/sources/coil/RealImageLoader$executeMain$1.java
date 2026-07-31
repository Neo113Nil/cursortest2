package coil;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RealImageLoader.kt */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@DebugMetadata(c = "coil.RealImageLoader", f = "RealImageLoader.kt", l = {169, 180, 184}, m = "executeMain")
/* loaded from: classes11.dex */
final class RealImageLoader$executeMain$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RealImageLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RealImageLoader$executeMain$1(RealImageLoader realImageLoader, Continuation continuation) {
        super(continuation);
        this.this$0 = realImageLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object executeMain;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        executeMain = this.this$0.executeMain(null, 0, this);
        return executeMain;
    }
}
