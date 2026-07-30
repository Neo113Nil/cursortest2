package kotlinx.coroutines.flow;

import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;

@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.StartedLazily$command$1", f = "SharingStarted.kt", i = {}, l = {155}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class StartedLazily$command$1 extends SuspendLambda implements f6.p {
    final /* synthetic */ t $subscriptionCount;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StartedLazily$command$1(t tVar, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.$subscriptionCount = tVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
        StartedLazily$command$1 startedLazily$command$1 = new StartedLazily$command$1(this.$subscriptionCount, cVar);
        startedLazily$command$1.L$0 = obj;
        return startedLazily$command$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        int i8 = this.label;
        if (i8 == 0) {
            y5.g.throwOnFailure(obj);
            f fVar = (f) this.L$0;
            Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            t tVar = this.$subscriptionCount;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(ref$BooleanRef, fVar);
            this.label = 1;
            if (tVar.collect(anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y5.g.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }

    @Override // f6.p
    public final Object invoke(f fVar, kotlin.coroutines.c cVar) {
        return ((StartedLazily$command$1) create(fVar, cVar)).invokeSuspend(y5.w.INSTANCE);
    }

    /* renamed from: kotlinx.coroutines.flow.StartedLazily$command$1$1, reason: invalid class name */
    static final class AnonymousClass1 implements f {
        final /* synthetic */ f $$this$flow;
        final /* synthetic */ Ref$BooleanRef $started;

        AnonymousClass1(Ref$BooleanRef ref$BooleanRef, f fVar) {
            this.$started = ref$BooleanRef;
            this.$$this$flow = fVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(int i8, kotlin.coroutines.c cVar) {
            StartedLazily$command$1$1$emit$1 startedLazily$command$1$1$emit$1;
            Object coroutine_suspended;
            int i9;
            if (cVar instanceof StartedLazily$command$1$1$emit$1) {
                startedLazily$command$1$1$emit$1 = (StartedLazily$command$1$1$emit$1) cVar;
                int i10 = startedLazily$command$1$1$emit$1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    startedLazily$command$1$1$emit$1.label = i10 - Integer.MIN_VALUE;
                    Object obj = startedLazily$command$1$1$emit$1.result;
                    coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                    i9 = startedLazily$command$1$1$emit$1.label;
                    if (i9 != 0) {
                        y5.g.throwOnFailure(obj);
                        if (i8 > 0) {
                            Ref$BooleanRef ref$BooleanRef = this.$started;
                            if (!ref$BooleanRef.element) {
                                ref$BooleanRef.element = true;
                                f fVar = this.$$this$flow;
                                SharingCommand sharingCommand = SharingCommand.START;
                                startedLazily$command$1$1$emit$1.label = 1;
                                if (fVar.emit(sharingCommand, startedLazily$command$1$1$emit$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        }
                        return y5.w.INSTANCE;
                    }
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y5.g.throwOnFailure(obj);
                    return y5.w.INSTANCE;
                }
            }
            startedLazily$command$1$1$emit$1 = new StartedLazily$command$1$1$emit$1(this, cVar);
            Object obj2 = startedLazily$command$1$1$emit$1.result;
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            i9 = startedLazily$command$1$1$emit$1.label;
            if (i9 != 0) {
            }
            return y5.w.INSTANCE;
        }

        @Override // kotlinx.coroutines.flow.f
        public /* bridge */ /* synthetic */ Object emit(Object obj, kotlin.coroutines.c cVar) {
            return emit(((Number) obj).intValue(), cVar);
        }
    }
}
