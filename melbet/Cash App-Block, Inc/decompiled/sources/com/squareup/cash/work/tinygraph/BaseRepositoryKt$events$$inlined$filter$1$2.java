package com.squareup.cash.work.tinygraph;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.clientsync.readers.RealSyncValueReaderV2$getValues$$inlined$map$1$2$1;
import com.squareup.cash.work.tinygraph.models.IBaseEntity;
import com.stripe.android.uicore.utils.StateFlowsKt$mapAsStateFlow$$inlined$map$1$2$1;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class BaseRepositoryKt$events$$inlined$filter$1$2 implements FlowCollector {
    public final /* synthetic */ Function1 $filter$inlined;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FlowCollector $this_unsafeFlow;

    /* renamed from: com.squareup.cash.work.tinygraph.BaseRepositoryKt$events$$inlined$filter$1$2$1, reason: invalid class name */
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
            return BaseRepositoryKt$events$$inlined$filter$1$2.this.emit(null, this);
        }
    }

    public /* synthetic */ BaseRepositoryKt$events$$inlined$filter$1$2(FlowCollector flowCollector, Function1 function1, int i) {
        this.$r8$classId = i;
        this.$this_unsafeFlow = flowCollector;
        this.$filter$inlined = function1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b1  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AnonymousClass1 anonymousClass1;
        int i;
        RealSyncValueReaderV2$getValues$$inlined$map$1$2$1 realSyncValueReaderV2$getValues$$inlined$map$1$2$1;
        int i2;
        StateFlowsKt$mapAsStateFlow$$inlined$map$1$2$1 stateFlowsKt$mapAsStateFlow$$inlined$map$1$2$1;
        int i3;
        int i4 = this.$r8$classId;
        Function1 function1 = this.$filter$inlined;
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
                            if (((Boolean) function1.invoke((IBaseEntity) ((Pair) obj).first)).booleanValue()) {
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(obj, anonymousClass1) == coroutineSingletons) {
                                    break;
                                }
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
                if (continuation instanceof RealSyncValueReaderV2$getValues$$inlined$map$1$2$1) {
                    realSyncValueReaderV2$getValues$$inlined$map$1$2$1 = (RealSyncValueReaderV2$getValues$$inlined$map$1$2$1) continuation;
                    int i6 = realSyncValueReaderV2$getValues$$inlined$map$1$2$1.label;
                    if ((i6 & PKIFailureInfo.systemUnavail) != 0) {
                        realSyncValueReaderV2$getValues$$inlined$map$1$2$1.label = i6 - PKIFailureInfo.systemUnavail;
                        Object obj3 = realSyncValueReaderV2$getValues$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = realSyncValueReaderV2$getValues$$inlined$map$1$2$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj3);
                            Object invoke = function1.invoke((List) obj);
                            realSyncValueReaderV2$getValues$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(invoke, realSyncValueReaderV2$getValues$$inlined$map$1$2$1) == coroutineSingletons3) {
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
                realSyncValueReaderV2$getValues$$inlined$map$1$2$1 = new RealSyncValueReaderV2$getValues$$inlined$map$1$2$1(this, continuation);
                Object obj32 = realSyncValueReaderV2$getValues$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = realSyncValueReaderV2$getValues$$inlined$map$1$2$1.label;
                if (i2 != 0) {
                }
            default:
                if (continuation instanceof StateFlowsKt$mapAsStateFlow$$inlined$map$1$2$1) {
                    stateFlowsKt$mapAsStateFlow$$inlined$map$1$2$1 = (StateFlowsKt$mapAsStateFlow$$inlined$map$1$2$1) continuation;
                    int i7 = stateFlowsKt$mapAsStateFlow$$inlined$map$1$2$1.label;
                    if ((i7 & PKIFailureInfo.systemUnavail) != 0) {
                        stateFlowsKt$mapAsStateFlow$$inlined$map$1$2$1.label = i7 - PKIFailureInfo.systemUnavail;
                        Object obj4 = stateFlowsKt$mapAsStateFlow$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i3 = stateFlowsKt$mapAsStateFlow$$inlined$map$1$2$1.label;
                        if (i3 != 0) {
                            SafeTrace.throwOnFailure(obj4);
                            Object invoke2 = function1.invoke(obj);
                            stateFlowsKt$mapAsStateFlow$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(invoke2, stateFlowsKt$mapAsStateFlow$$inlined$map$1$2$1) == coroutineSingletons4) {
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
                stateFlowsKt$mapAsStateFlow$$inlined$map$1$2$1 = new StateFlowsKt$mapAsStateFlow$$inlined$map$1$2$1(this, continuation);
                Object obj42 = stateFlowsKt$mapAsStateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = stateFlowsKt$mapAsStateFlow$$inlined$map$1$2$1.label;
                if (i3 != 0) {
                }
        }
        return Unit.INSTANCE;
    }
}
