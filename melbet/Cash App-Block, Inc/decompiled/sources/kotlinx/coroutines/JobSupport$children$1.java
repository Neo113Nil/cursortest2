package kotlinx.coroutines;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class JobSupport$children$1 extends RestrictedSuspendLambda implements Function2 {
    public int I$0;
    public int I$1;
    public /* synthetic */ Object L$0;
    public NodeList L$3;
    public ChildHandleNode L$4;
    public int label;
    public final /* synthetic */ JobSupport this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JobSupport$children$1(Continuation continuation, JobSupport jobSupport) {
        super(2, continuation);
        this.this$0 = jobSupport;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        JobSupport$children$1 jobSupport$children$1 = new JobSupport$children$1(continuation, this.this$0);
        jobSupport$children$1.L$0 = obj;
        return jobSupport$children$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((JobSupport$children$1) create((SequenceScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x005f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0061 -> B:6:0x0079). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        NodeList list;
        int i;
        NodeList nodeList;
        LockFreeLinkedListNode lockFreeLinkedListNode;
        int i2;
        SequenceScope sequenceScope = (SequenceScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        if (i3 == 0) {
            SafeTrace.throwOnFailure(obj);
            Object state$kotlinx_coroutines_core = this.this$0.getState$kotlinx_coroutines_core();
            if (state$kotlinx_coroutines_core instanceof ChildHandleNode) {
                JobSupport jobSupport = ((ChildHandleNode) state$kotlinx_coroutines_core).childJob;
                this.L$0 = null;
                this.label = 1;
                sequenceScope.yield(jobSupport, this);
                return coroutineSingletons;
            }
            if ((state$kotlinx_coroutines_core instanceof Incomplete) && (list = ((Incomplete) state$kotlinx_coroutines_core).getList()) != null) {
                Object next = list.getNext();
                next.getClass();
                i = 0;
                nodeList = list;
                lockFreeLinkedListNode = (LockFreeLinkedListNode) next;
                i2 = 0;
                if (!lockFreeLinkedListNode.equals(nodeList)) {
                }
            }
        } else if (i3 == 1) {
            SafeTrace.throwOnFailure(obj);
        } else {
            if (i3 != 2) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = this.I$1;
            i = this.I$0;
            lockFreeLinkedListNode = this.L$4;
            nodeList = this.L$3;
            SafeTrace.throwOnFailure(obj);
            lockFreeLinkedListNode = lockFreeLinkedListNode.getNextNode();
            if (!lockFreeLinkedListNode.equals(nodeList)) {
                if (lockFreeLinkedListNode instanceof ChildHandleNode) {
                    ChildHandleNode childHandleNode = (ChildHandleNode) lockFreeLinkedListNode;
                    JobSupport jobSupport2 = childHandleNode.childJob;
                    this.L$0 = sequenceScope;
                    this.L$3 = nodeList;
                    this.L$4 = childHandleNode;
                    this.I$0 = i;
                    this.I$1 = i2;
                    this.label = 2;
                    sequenceScope.yield(jobSupport2, this);
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    return coroutineSingletons;
                }
                lockFreeLinkedListNode = lockFreeLinkedListNode.getNextNode();
                if (!lockFreeLinkedListNode.equals(nodeList)) {
                }
            }
        }
        return Unit.INSTANCE;
    }
}
