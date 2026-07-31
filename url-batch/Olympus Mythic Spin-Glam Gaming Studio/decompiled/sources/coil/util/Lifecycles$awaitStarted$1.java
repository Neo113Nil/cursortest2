package coil.util;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Lifecycles.kt */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@DebugMetadata(c = "coil.util.-Lifecycles", f = "Lifecycles.kt", l = {44}, m = "awaitStarted")
/* renamed from: coil.util.-Lifecycles$awaitStarted$1, reason: invalid class name */
/* loaded from: classes15.dex */
final class Lifecycles$awaitStarted$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    Lifecycles$awaitStarted$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return Lifecycles.awaitStarted(null, this);
    }
}
