package kotlinx.coroutines.flow;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.flow.internal.SafeCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class FlowKt__MergeKt$flatMapConcat$$inlined$map$1 implements Flow {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Flow $this_unsafeTransform$inlined;
    public final /* synthetic */ Function2 $transform$inlined$1;

    /* renamed from: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2, reason: invalid class name */
    public final class AnonymousClass2 implements FlowCollector {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ FlowCollector $this_unsafeFlow;
        public final /* synthetic */ Function2 $transform$inlined;

        /* renamed from: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends ContinuationImpl {
            public int I$0;
            public FlowCollector L$4;
            public int label;
            public /* synthetic */ Object result;

            public AnonymousClass1(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= PKIFailureInfo.systemUnavail;
                return AnonymousClass2.this.emit(null, this);
            }
        }

        public /* synthetic */ AnonymousClass2(FlowCollector flowCollector, Function2 function2, int i) {
            this.$r8$classId = i;
            this.$this_unsafeFlow = flowCollector;
            this.$transform$inlined = function2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
        
            if (r3.emit(r12, r0) != r13) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
        
            if (r1.invoke(r12, r0) == r13) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00b6, code lost:
        
            if (r3.emit(r11, r0) != r13) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00a9, code lost:
        
            if (r11 == r13) goto L43;
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x009c  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1;
            int i;
            FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1;
            int i2;
            int i3 = this.$r8$classId;
            Function2 function2 = this.$transform$inlined;
            int i4 = 0;
            FlowCollector flowCollector = this.$this_unsafeFlow;
            switch (i3) {
                case 0:
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i5 = anonymousClass1.label;
                        if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                            anonymousClass1.label = i5 - PKIFailureInfo.systemUnavail;
                            Object obj2 = anonymousClass1.result;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = anonymousClass1.label;
                            if (i != 0) {
                                SafeTrace.throwOnFailure(obj2);
                                anonymousClass1.L$4 = flowCollector;
                                anonymousClass1.I$0 = 0;
                                anonymousClass1.label = 1;
                                obj2 = function2.invoke(obj, anonymousClass1);
                                break;
                            } else if (i == 1) {
                                i4 = anonymousClass1.I$0;
                                flowCollector = anonymousClass1.L$4;
                                SafeTrace.throwOnFailure(obj2);
                            } else if (i != 2) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj2);
                                break;
                            }
                            anonymousClass1.L$4 = null;
                            anonymousClass1.I$0 = i4;
                            anonymousClass1.label = 2;
                            break;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    anonymousClass1.L$4 = null;
                    anonymousClass1.I$0 = i4;
                    anonymousClass1.label = 2;
                default:
                    if (continuation instanceof FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1) {
                        flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1 = (FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1) continuation;
                        int i6 = flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1.label;
                        if ((i6 & PKIFailureInfo.systemUnavail) != 0) {
                            flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1.label = i6 - PKIFailureInfo.systemUnavail;
                            Object obj3 = flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1.result;
                            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i2 = flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1.label;
                            if (i2 != 0) {
                                SafeTrace.throwOnFailure(obj3);
                                flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1.L$2 = obj;
                                flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1.L$3 = flowCollector;
                                flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1.I$0 = 0;
                                flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1.label = 1;
                                break;
                            } else if (i2 == 1) {
                                i4 = flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1.I$0;
                                flowCollector = flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1.L$3;
                                obj = flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1.L$2;
                                SafeTrace.throwOnFailure(obj3);
                            } else if (i2 != 2) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj3);
                                break;
                            }
                            flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1.L$2 = null;
                            flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1.L$3 = null;
                            flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1.I$0 = i4;
                            flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1.label = 2;
                            break;
                        }
                    }
                    flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1(this, continuation);
                    Object obj32 = flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1.result;
                    CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1.label;
                    if (i2 != 0) {
                    }
                    flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1.L$2 = null;
                    flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1.L$3 = null;
                    flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1.I$0 = i4;
                    flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1.label = 2;
            }
            return Unit.INSTANCE;
        }
    }

    public FlowKt__MergeKt$flatMapConcat$$inlined$map$1(Function2 function2, Flow flow) {
        this.$r8$classId = 1;
        this.$transform$inlined$1 = function2;
        this.$this_unsafeTransform$inlined = flow;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1 flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        SafeCollector safeCollector;
        Throwable th;
        FlowCollector flowCollector2;
        int i2 = this.$r8$classId;
        int i3 = 0;
        int i4 = 1;
        Function2 function2 = this.$transform$inlined$1;
        Flow flow = this.$this_unsafeTransform$inlined;
        switch (i2) {
            case 0:
                Object collect = flow.collect(new AnonymousClass2(flowCollector, function2, i3), continuation);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : Unit.INSTANCE;
            case 1:
                if (continuation instanceof FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1) {
                    flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1 = (FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1) continuation;
                    int i5 = flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.label;
                    if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                        flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.label = i5 - PKIFailureInfo.systemUnavail;
                        Object obj = flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.result;
                        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj);
                            SafeCollector safeCollector2 = new SafeCollector(flowCollector, flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.getContext());
                            try {
                                flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.L$2 = flowCollector;
                                flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.L$3 = safeCollector2;
                                flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.I$0 = 0;
                                flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.label = 1;
                                if (function2.invoke(safeCollector2, flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                flowCollector2 = flowCollector;
                                safeCollector = safeCollector2;
                            } catch (Throwable th2) {
                                safeCollector = safeCollector2;
                                th = th2;
                                safeCollector.releaseIntercepted();
                                throw th;
                            }
                        } else {
                            if (i != 1) {
                                if (i == 2) {
                                    SafeTrace.throwOnFailure(obj);
                                    return Unit.INSTANCE;
                                }
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i3 = flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.I$0;
                            safeCollector = flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.L$3;
                            flowCollector2 = flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.L$2;
                            try {
                                SafeTrace.throwOnFailure(obj);
                            } catch (Throwable th3) {
                                th = th3;
                                safeCollector.releaseIntercepted();
                                throw th;
                            }
                        }
                        safeCollector.releaseIntercepted();
                        flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.L$2 = null;
                        flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.L$3 = null;
                        flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.I$0 = i3;
                        flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.label = 2;
                        if (flow.collect(flowCollector2, flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return Unit.INSTANCE;
                    }
                }
                flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1 = new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1(this, continuation);
                Object obj2 = flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.label;
                if (i != 0) {
                }
                safeCollector.releaseIntercepted();
                flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.L$2 = null;
                flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.L$3 = null;
                flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.I$0 = i3;
                flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.label = 2;
                if (flow.collect(flowCollector2, flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1) == coroutineSingletons) {
                }
                return Unit.INSTANCE;
            case 2:
                Object collect2 = flow.collect(new DistinctFlowImpl$collect$2(new Ref$BooleanRef(), flowCollector, function2), continuation);
                return collect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect2 : Unit.INSTANCE;
            default:
                Object collect3 = flow.collect(new AnonymousClass2(flowCollector, function2, i4), continuation);
                return collect3 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect3 : Unit.INSTANCE;
        }
    }

    public /* synthetic */ FlowKt__MergeKt$flatMapConcat$$inlined$map$1(Flow flow, Function2 function2, int i) {
        this.$r8$classId = i;
        this.$this_unsafeTransform$inlined = flow;
        this.$transform$inlined$1 = function2;
    }
}
