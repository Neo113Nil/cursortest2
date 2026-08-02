package com.squareup.util.coroutines;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.clientsync.util.coroutines.StateFlowsKt$mapState$$inlined$map$1$2$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class StateFlowKt$mapState$$inlined$map$1 implements Flow {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Flow $this_unsafeTransform$inlined;
    public final /* synthetic */ Function1 $transform$inlined;

    /* renamed from: com.squareup.util.coroutines.StateFlowKt$mapState$$inlined$map$1$2, reason: invalid class name */
    public final class AnonymousClass2 implements FlowCollector {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ FlowCollector $this_unsafeFlow;
        public final /* synthetic */ Function1 $transform$inlined$1;

        /* renamed from: com.squareup.util.coroutines.StateFlowKt$mapState$$inlined$map$1$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends ContinuationImpl {
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

        public /* synthetic */ AnonymousClass2(FlowCollector flowCollector, Function1 function1, int i) {
            this.$r8$classId = i;
            this.$this_unsafeFlow = flowCollector;
            this.$transform$inlined$1 = function1;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00a5  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x00af  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1;
            int i;
            StateFlowsKt$mapState$$inlined$map$1$2$1 stateFlowsKt$mapState$$inlined$map$1$2$1;
            int i2;
            FlowExtensionsKt$doWhile$$inlined$map$1$2$1 flowExtensionsKt$doWhile$$inlined$map$1$2$1;
            int i3;
            int i4 = this.$r8$classId;
            Function1 function1 = this.$transform$inlined$1;
            FlowCollector flowCollector = this.$this_unsafeFlow;
            switch (i4) {
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
                                Object invoke = function1.invoke(obj);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(invoke, anonymousClass1) == coroutineSingletons) {
                                    break;
                                }
                            } else if (i != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj2);
                            }
                            break;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                case 1:
                    if (continuation instanceof StateFlowsKt$mapState$$inlined$map$1$2$1) {
                        stateFlowsKt$mapState$$inlined$map$1$2$1 = (StateFlowsKt$mapState$$inlined$map$1$2$1) continuation;
                        int i6 = stateFlowsKt$mapState$$inlined$map$1$2$1.label;
                        if ((i6 & PKIFailureInfo.systemUnavail) != 0) {
                            stateFlowsKt$mapState$$inlined$map$1$2$1.label = i6 - PKIFailureInfo.systemUnavail;
                            Object obj3 = stateFlowsKt$mapState$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i2 = stateFlowsKt$mapState$$inlined$map$1$2$1.label;
                            if (i2 != 0) {
                                SafeTrace.throwOnFailure(obj3);
                                Object invoke2 = function1.invoke(obj);
                                stateFlowsKt$mapState$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(invoke2, stateFlowsKt$mapState$$inlined$map$1$2$1) == coroutineSingletons3) {
                                    break;
                                }
                            } else if (i2 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj3);
                            }
                            break;
                        }
                    }
                    stateFlowsKt$mapState$$inlined$map$1$2$1 = new StateFlowsKt$mapState$$inlined$map$1$2$1(this, continuation);
                    Object obj32 = stateFlowsKt$mapState$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = stateFlowsKt$mapState$$inlined$map$1$2$1.label;
                    if (i2 != 0) {
                    }
                default:
                    if (continuation instanceof FlowExtensionsKt$doWhile$$inlined$map$1$2$1) {
                        flowExtensionsKt$doWhile$$inlined$map$1$2$1 = (FlowExtensionsKt$doWhile$$inlined$map$1$2$1) continuation;
                        int i7 = flowExtensionsKt$doWhile$$inlined$map$1$2$1.label;
                        if ((i7 & PKIFailureInfo.systemUnavail) != 0) {
                            flowExtensionsKt$doWhile$$inlined$map$1$2$1.label = i7 - PKIFailureInfo.systemUnavail;
                            Object obj4 = flowExtensionsKt$doWhile$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i3 = flowExtensionsKt$doWhile$$inlined$map$1$2$1.label;
                            if (i3 != 0) {
                                SafeTrace.throwOnFailure(obj4);
                                Object invoke3 = function1.invoke(obj);
                                flowExtensionsKt$doWhile$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(invoke3, flowExtensionsKt$doWhile$$inlined$map$1$2$1) == coroutineSingletons4) {
                                    break;
                                }
                            } else if (i3 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj4);
                            }
                            break;
                        }
                    }
                    flowExtensionsKt$doWhile$$inlined$map$1$2$1 = new FlowExtensionsKt$doWhile$$inlined$map$1$2$1(this, continuation);
                    Object obj42 = flowExtensionsKt$doWhile$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i3 = flowExtensionsKt$doWhile$$inlined$map$1$2$1.label;
                    if (i3 != 0) {
                    }
            }
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ StateFlowKt$mapState$$inlined$map$1(Flow flow, Function1 function1, int i) {
        this.$r8$classId = i;
        this.$this_unsafeTransform$inlined = flow;
        this.$transform$inlined = function1;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        Function1 function1 = this.$transform$inlined;
        Flow flow = this.$this_unsafeTransform$inlined;
        switch (i) {
            case 0:
                Object collect = flow.collect(new AnonymousClass2(flowCollector, function1, 0), continuation);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object collect2 = flow.collect(new AnonymousClass2(flowCollector, function1, 1), continuation);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect3 = flow.collect(new AnonymousClass2(flowCollector, function1, 2), continuation);
                if (collect3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
