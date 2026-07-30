package kotlinx.coroutines;

import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;

@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", i = {1, 1, 1}, l = {956, 958}, m = "invokeSuspend", n = {"$this$sequence", "this_$iv", "cur$iv"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes3.dex */
final class JobSupport$children$1 extends RestrictedSuspendLambda implements f6.p {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ JobSupport this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    JobSupport$children$1(JobSupport jobSupport, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.this$0 = jobSupport;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
        JobSupport$children$1 jobSupport$children$1 = new JobSupport$children$1(this.this$0, cVar);
        jobSupport$children$1.L$0 = obj;
        return jobSupport$children$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x006b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x006d -> B:6:0x0083). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0080 -> B:6:0x0083). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        w1 list;
        kotlin.sequences.o oVar;
        JobSupport$children$1 jobSupport$children$1;
        kotlinx.coroutines.internal.r rVar;
        LockFreeLinkedListNode lockFreeLinkedListNode;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        int i8 = this.label;
        if (i8 == 0) {
            y5.g.throwOnFailure(obj);
            kotlin.sequences.o oVar2 = (kotlin.sequences.o) this.L$0;
            Object state$kotlinx_coroutines_core = this.this$0.getState$kotlinx_coroutines_core();
            if (state$kotlinx_coroutines_core instanceof u) {
                v vVar = ((u) state$kotlinx_coroutines_core).childJob;
                this.label = 1;
                if (oVar2.yield(vVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if ((state$kotlinx_coroutines_core instanceof g1) && (list = ((g1) state$kotlinx_coroutines_core).getList()) != null) {
                Object next = list.getNext();
                kotlin.jvm.internal.s.checkNotNull(next, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                LockFreeLinkedListNode lockFreeLinkedListNode2 = (LockFreeLinkedListNode) next;
                oVar = oVar2;
                jobSupport$children$1 = this;
                rVar = list;
                lockFreeLinkedListNode = lockFreeLinkedListNode2;
                if (!kotlin.jvm.internal.s.areEqual(lockFreeLinkedListNode, rVar)) {
                }
            }
        } else if (i8 == 1) {
            y5.g.throwOnFailure(obj);
        } else {
            if (i8 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lockFreeLinkedListNode = (LockFreeLinkedListNode) this.L$2;
            rVar = (kotlinx.coroutines.internal.r) this.L$1;
            oVar = (kotlin.sequences.o) this.L$0;
            y5.g.throwOnFailure(obj);
            jobSupport$children$1 = this;
            lockFreeLinkedListNode = lockFreeLinkedListNode.getNextNode();
            if (!kotlin.jvm.internal.s.areEqual(lockFreeLinkedListNode, rVar)) {
                if (lockFreeLinkedListNode instanceof u) {
                    v vVar2 = ((u) lockFreeLinkedListNode).childJob;
                    jobSupport$children$1.L$0 = oVar;
                    jobSupport$children$1.L$1 = rVar;
                    jobSupport$children$1.L$2 = lockFreeLinkedListNode;
                    jobSupport$children$1.label = 2;
                    if (oVar.yield(vVar2, jobSupport$children$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                lockFreeLinkedListNode = lockFreeLinkedListNode.getNextNode();
                if (!kotlin.jvm.internal.s.areEqual(lockFreeLinkedListNode, rVar)) {
                }
            }
        }
        return y5.w.INSTANCE;
    }

    @Override // f6.p
    public final Object invoke(kotlin.sequences.o oVar, kotlin.coroutines.c cVar) {
        return ((JobSupport$children$1) create(oVar, cVar)).invokeSuspend(y5.w.INSTANCE);
    }
}
