package expo.modules.updates.loader;

import expo.modules.updates.loader.RemoteLoader;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RemoteLoader.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.updates.loader.RemoteLoader$Companion", f = "RemoteLoader.kt", i = {0, 0, 0}, l = {125}, m = "processRollBackToEmbeddedDirective", n = {"logger", "database", "updateDirective"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes2.dex */
final class RemoteLoader$Companion$processRollBackToEmbeddedDirective$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RemoteLoader.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RemoteLoader$Companion$processRollBackToEmbeddedDirective$1(RemoteLoader.Companion companion, Continuation<? super RemoteLoader$Companion$processRollBackToEmbeddedDirective$1> continuation) {
        super(continuation);
        this.this$0 = companion;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object processRollBackToEmbeddedDirective;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        processRollBackToEmbeddedDirective = this.this$0.processRollBackToEmbeddedDirective(null, null, null, null, null, null, null, null, this);
        return processRollBackToEmbeddedDirective;
    }
}
