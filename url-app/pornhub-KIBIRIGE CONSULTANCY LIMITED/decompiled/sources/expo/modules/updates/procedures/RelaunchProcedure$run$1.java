package expo.modules.updates.procedures;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.eac.EACTags;

/* compiled from: RelaunchProcedure.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.updates.procedures.RelaunchProcedure", f = "RelaunchProcedure.kt", i = {0, 0, 0, 0}, l = {EACTags.ELEMENT_LIST}, m = "run", n = {"procedureContext", "reactApplication", "oldLaunchAssetFile", "newLauncher"}, s = {"L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes2.dex */
final class RelaunchProcedure$run$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RelaunchProcedure this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RelaunchProcedure$run$1(RelaunchProcedure relaunchProcedure, Continuation<? super RelaunchProcedure$run$1> continuation) {
        super(continuation);
        this.this$0 = relaunchProcedure;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.run(null, this);
    }
}
