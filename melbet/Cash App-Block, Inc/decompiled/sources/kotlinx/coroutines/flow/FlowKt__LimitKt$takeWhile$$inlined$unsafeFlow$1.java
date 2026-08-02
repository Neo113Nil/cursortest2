package kotlinx.coroutines.flow;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import kotlinx.coroutines.flow.internal.SafeCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public final class FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1 implements Flow {
    public final /* synthetic */ Function2 $predicate$inlined;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Flow $this_takeWhile$inlined;

    /* renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends ContinuationImpl {
        public FlowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1 L$5;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= PKIFailureInfo.systemUnavail;
            return FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    public /* synthetic */ FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1(Flow flow, Function2 function2, int i) {
        this.$r8$classId = i;
        this.$this_takeWhile$inlined = flow;
        this.$predicate$inlined = function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c5  */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        AnonymousClass1 anonymousClass1;
        int i;
        FlowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1 flowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1;
        AbortFlowException e;
        FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1 flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1;
        int i2;
        int i3;
        Ref$BooleanRef ref$BooleanRef;
        SafeCollector safeCollector;
        Throwable th;
        int i4 = this.$r8$classId;
        Function2 function2 = this.$predicate$inlined;
        Flow flow = this.$this_takeWhile$inlined;
        switch (i4) {
            case 0:
                if (continuation instanceof AnonymousClass1) {
                    anonymousClass1 = (AnonymousClass1) continuation;
                    int i5 = anonymousClass1.label;
                    if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                        anonymousClass1.label = i5 - PKIFailureInfo.systemUnavail;
                        Object obj = anonymousClass1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = anonymousClass1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj);
                            FlowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1 flowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$12 = new FlowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1(function2, flowCollector);
                            try {
                                anonymousClass1.L$5 = flowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$12;
                                anonymousClass1.label = 1;
                                if (flow.collect(flowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$12, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } catch (AbortFlowException e2) {
                                flowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1 = flowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$12;
                                e = e2;
                                if (e.owner == flowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1) {
                                }
                            }
                        } else {
                            if (i != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            flowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1 = anonymousClass1.L$5;
                            try {
                                SafeTrace.throwOnFailure(obj);
                            } catch (AbortFlowException e3) {
                                e = e3;
                                if (e.owner == flowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1) {
                                    throw e;
                                }
                                JobKt.ensureActive(anonymousClass1.getContext());
                                return Unit.INSTANCE;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }
                anonymousClass1 = new AnonymousClass1(continuation);
                Object obj2 = anonymousClass1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = anonymousClass1.label;
                if (i != 0) {
                }
                return Unit.INSTANCE;
            default:
                if (continuation instanceof FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1) {
                    flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1 = (FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1) continuation;
                    int i6 = flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1.label;
                    if ((i6 & PKIFailureInfo.systemUnavail) != 0) {
                        flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1.label = i6 - PKIFailureInfo.systemUnavail;
                        Object obj3 = flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1.result;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj3);
                            Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
                            ref$BooleanRef2.element = true;
                            StartedLazily$command$1$1 startedLazily$command$1$1 = new StartedLazily$command$1$1(ref$BooleanRef2, flowCollector, 1);
                            flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1.L$2 = flowCollector;
                            flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1.L$3 = ref$BooleanRef2;
                            i3 = 0;
                            flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1.I$0 = 0;
                            flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1.label = 1;
                            if (flow.collect(startedLazily$command$1$1, flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1) != coroutineSingletons3) {
                                ref$BooleanRef = ref$BooleanRef2;
                            }
                            return coroutineSingletons3;
                        }
                        if (i2 != 1) {
                            if (i2 != 2) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            safeCollector = flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1.L$4;
                            try {
                                SafeTrace.throwOnFailure(obj3);
                                safeCollector.releaseIntercepted();
                                return Unit.INSTANCE;
                            } catch (Throwable th2) {
                                th = th2;
                                safeCollector.releaseIntercepted();
                                throw th;
                            }
                        }
                        int i7 = flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1.I$0;
                        ref$BooleanRef = flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1.L$3;
                        FlowCollector flowCollector2 = flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1.L$2;
                        SafeTrace.throwOnFailure(obj3);
                        i3 = i7;
                        flowCollector = flowCollector2;
                        if (ref$BooleanRef.element) {
                            SafeCollector safeCollector2 = new SafeCollector(flowCollector, flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1.getContext());
                            try {
                                flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1.L$2 = null;
                                flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1.L$3 = null;
                                flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1.L$4 = safeCollector2;
                                flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1.I$0 = i3;
                                flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1.label = 2;
                                if (function2.invoke(safeCollector2, flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1) != coroutineSingletons3) {
                                    safeCollector = safeCollector2;
                                    safeCollector.releaseIntercepted();
                                }
                                return coroutineSingletons3;
                            } catch (Throwable th3) {
                                safeCollector = safeCollector2;
                                th = th3;
                                safeCollector.releaseIntercepted();
                                throw th;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }
                flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1 = new FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1(this, continuation);
                Object obj32 = flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1.result;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1.label;
                if (i2 != 0) {
                }
                if (ref$BooleanRef.element) {
                }
                return Unit.INSTANCE;
        }
    }
}
