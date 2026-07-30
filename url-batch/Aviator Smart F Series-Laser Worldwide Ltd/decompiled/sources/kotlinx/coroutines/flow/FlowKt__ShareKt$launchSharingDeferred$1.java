package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.i0;
import kotlinx.coroutines.o1;

@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1", f = "Share.kt", i = {}, l = {340}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class FlowKt__ShareKt$launchSharingDeferred$1 extends SuspendLambda implements f6.p {
    final /* synthetic */ kotlinx.coroutines.w $result;
    final /* synthetic */ e $upstream;
    private /* synthetic */ Object L$0;
    int label;

    static final class a implements f {
        final /* synthetic */ i0 $$this$launch;
        final /* synthetic */ kotlinx.coroutines.w $result;
        final /* synthetic */ Ref$ObjectRef<j> $state;

        a(Ref$ObjectRef<j> ref$ObjectRef, i0 i0Var, kotlinx.coroutines.w wVar) {
            this.$state = ref$ObjectRef;
            this.$$this$launch = i0Var;
            this.$result = wVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [T, kotlinx.coroutines.flow.j, kotlinx.coroutines.flow.t] */
        @Override // kotlinx.coroutines.flow.f
        public final Object emit(Object obj, kotlin.coroutines.c cVar) {
            y5.w wVar;
            j jVar = this.$state.element;
            if (jVar != null) {
                jVar.setValue(obj);
                wVar = y5.w.INSTANCE;
            } else {
                wVar = null;
            }
            if (wVar == null) {
                i0 i0Var = this.$$this$launch;
                Ref$ObjectRef<j> ref$ObjectRef = this.$state;
                kotlinx.coroutines.w wVar2 = this.$result;
                ?? MutableStateFlow = u.MutableStateFlow(obj);
                wVar2.complete(new l(MutableStateFlow, o1.getJob(i0Var.getCoroutineContext())));
                ref$ObjectRef.element = MutableStateFlow;
            }
            return y5.w.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlowKt__ShareKt$launchSharingDeferred$1(e eVar, kotlinx.coroutines.w wVar, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.$upstream = eVar;
        this.$result = wVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
        FlowKt__ShareKt$launchSharingDeferred$1 flowKt__ShareKt$launchSharingDeferred$1 = new FlowKt__ShareKt$launchSharingDeferred$1(this.$upstream, this.$result, cVar);
        flowKt__ShareKt$launchSharingDeferred$1.L$0 = obj;
        return flowKt__ShareKt$launchSharingDeferred$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        int i8 = this.label;
        try {
            if (i8 == 0) {
                y5.g.throwOnFailure(obj);
                i0 i0Var = (i0) this.L$0;
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                e eVar = this.$upstream;
                a aVar = new a(ref$ObjectRef, i0Var, this.$result);
                this.label = 1;
                if (eVar.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y5.g.throwOnFailure(obj);
            }
            return y5.w.INSTANCE;
        } catch (Throwable th) {
            this.$result.completeExceptionally(th);
            throw th;
        }
    }

    @Override // f6.p
    public final Object invoke(i0 i0Var, kotlin.coroutines.c cVar) {
        return ((FlowKt__ShareKt$launchSharingDeferred$1) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
    }
}
