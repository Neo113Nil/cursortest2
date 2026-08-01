package expo.modules.updates.procedures;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.eac.EACTags;

/* compiled from: FetchUpdateProcedure.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.updates.procedures.FetchUpdateProcedure", f = "FetchUpdateProcedure.kt", i = {}, l = {EACTags.ADDRESS}, m = "startRemoteLoader", n = {}, s = {})
/* loaded from: classes2.dex */
final class FetchUpdateProcedure$startRemoteLoader$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FetchUpdateProcedure this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FetchUpdateProcedure$startRemoteLoader$1(FetchUpdateProcedure fetchUpdateProcedure, Continuation<? super FetchUpdateProcedure$startRemoteLoader$1> continuation) {
        super(continuation);
        this.this$0 = fetchUpdateProcedure;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object startRemoteLoader;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        startRemoteLoader = this.this$0.startRemoteLoader(null, null, this);
        return startRemoteLoader;
    }
}
