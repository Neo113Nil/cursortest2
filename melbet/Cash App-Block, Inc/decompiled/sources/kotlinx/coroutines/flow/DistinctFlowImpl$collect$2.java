package kotlinx.coroutines.flow;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.AbstractApplier;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.room.RoomDatabase;
import androidx.room.TransactorKt$$ExternalSyntheticLambda0;
import androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1$2$1;
import androidx.room.util.DBUtil;
import app.cash.molecule.GatedFrameClock;
import app.cash.sqldelight.Query;
import app.cash.sqldelight.coroutines.FlowQuery$mapToOneOrDefault$$inlined$map$1$2$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.featureflags.FeatureFlag$Option;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager$experimentValues$$inlined$map$1$2$1;
import com.squareup.protos.franklin.common.FeatureFlag;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.internal.CombineKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class DistinctFlowImpl$collect$2 implements FlowCollector {
    public final /* synthetic */ Object $collector;
    public final /* synthetic */ Object $previousKey;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object this$0;

    public DistinctFlowImpl$collect$2(Ref$BooleanRef ref$BooleanRef, FlowCollector flowCollector, Function2 function2) {
        this.$r8$classId = 5;
        this.this$0 = ref$BooleanRef;
        this.$collector = flowCollector;
        this.$previousKey = function2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01a1, code lost:
    
        if (r14.emit(r13, r0) != r15) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01fa, code lost:
    
        if (r14.emit(r13, r0) != r15) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
    
        if (((kotlinx.coroutines.flow.FlowCollector) r6).emit(r13, r0) != r15) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d9, code lost:
    
        if (r6.emit(r14, r0) == r15) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b4, code lost:
    
        if (r6.emit(r14, r0) == r15) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c4, code lost:
    
        if (r13 == r15) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0162  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DistinctFlowImpl$collect$2$emit$1 distinctFlowImpl$collect$2$emit$1;
        int i;
        FlowUtil$createFlow$$inlined$map$1$2$1 flowUtil$createFlow$$inlined$map$1$2$1;
        int i2;
        FlowCollector flowCollector;
        FlowQuery$mapToOneOrDefault$$inlined$map$1$2$1 flowQuery$mapToOneOrDefault$$inlined$map$1$2$1;
        int i3;
        FlowCollector flowCollector2;
        RealFeatureFlagManager$experimentValues$$inlined$map$1$2$1 realFeatureFlagManager$experimentValues$$inlined$map$1$2$1;
        int i4;
        RealFeatureFlagManager.FlagValue flagValue;
        String str;
        FlowKt__LimitKt$dropWhile$1$1$emit$1 flowKt__LimitKt$dropWhile$1$1$emit$1;
        int i5;
        FlowKt__TransformKt$runningFold$1$1$emit$1 flowKt__TransformKt$runningFold$1$1$emit$1;
        int i6;
        Ref$ObjectRef ref$ObjectRef;
        int i7 = this.$r8$classId;
        int i8 = 0;
        Object obj2 = this.$collector;
        Object obj3 = this.this$0;
        Object obj4 = this.$previousKey;
        Object[] objArr = 0;
        switch (i7) {
            case 0:
                Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) obj4;
                DistinctFlowImpl distinctFlowImpl = (DistinctFlowImpl) obj3;
                if (continuation instanceof DistinctFlowImpl$collect$2$emit$1) {
                    distinctFlowImpl$collect$2$emit$1 = (DistinctFlowImpl$collect$2$emit$1) continuation;
                    int i9 = distinctFlowImpl$collect$2$emit$1.label;
                    if ((i9 & PKIFailureInfo.systemUnavail) != 0) {
                        distinctFlowImpl$collect$2$emit$1.label = i9 - PKIFailureInfo.systemUnavail;
                        Object obj5 = distinctFlowImpl$collect$2$emit$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = distinctFlowImpl$collect$2$emit$1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj5);
                            Object invoke = distinctFlowImpl.keySelector.invoke(obj);
                            Object obj6 = ref$ObjectRef2.element;
                            if (obj6 == CombineKt.NULL || !((Boolean) distinctFlowImpl.areEquivalent.invoke(obj6, invoke)).booleanValue()) {
                                ref$ObjectRef2.element = invoke;
                                distinctFlowImpl$collect$2$emit$1.label = 1;
                                if (((FlowCollector) obj2).emit(obj, distinctFlowImpl$collect$2$emit$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                        } else {
                            if (i != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj5);
                        }
                        return Unit.INSTANCE;
                    }
                }
                distinctFlowImpl$collect$2$emit$1 = new DistinctFlowImpl$collect$2$emit$1(this, continuation);
                Object obj52 = distinctFlowImpl$collect$2$emit$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = distinctFlowImpl$collect$2$emit$1.label;
                if (i != 0) {
                }
                return Unit.INSTANCE;
            case 1:
                Transition transition = (Transition) obj4;
                ((ProduceStateScope) obj3).setValue(Boolean.valueOf(((Boolean) obj).booleanValue() ? ((Boolean) ((Function2) ((MutableState) obj2).getValue()).invoke(transition.transitionState.getCurrentState(), transition.targetState$delegate.getValue())).booleanValue() : false));
                return Unit.INSTANCE;
            case 2:
                if (continuation instanceof FlowUtil$createFlow$$inlined$map$1$2$1) {
                    flowUtil$createFlow$$inlined$map$1$2$1 = (FlowUtil$createFlow$$inlined$map$1$2$1) continuation;
                    int i10 = flowUtil$createFlow$$inlined$map$1$2$1.label;
                    if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                        flowUtil$createFlow$$inlined$map$1$2$1.label = i10 - PKIFailureInfo.systemUnavail;
                        Object obj7 = flowUtil$createFlow$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = flowUtil$createFlow$$inlined$map$1$2$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj7);
                            FlowCollector flowCollector3 = (FlowCollector) obj2;
                            flowUtil$createFlow$$inlined$map$1$2$1.L$0 = flowCollector3;
                            flowUtil$createFlow$$inlined$map$1$2$1.label = 1;
                            Object performSuspending = DBUtil.performSuspending((RoomDatabase) obj3, true, (TransactorKt$$ExternalSyntheticLambda0) obj4, flowUtil$createFlow$$inlined$map$1$2$1);
                            if (performSuspending != coroutineSingletons3) {
                                flowCollector = flowCollector3;
                                obj7 = performSuspending;
                            }
                            return coroutineSingletons3;
                        }
                        if (i2 != 1) {
                            if (i2 == 2) {
                                SafeTrace.throwOnFailure(obj7);
                                return Unit.INSTANCE;
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        flowCollector = flowUtil$createFlow$$inlined$map$1$2$1.L$0;
                        SafeTrace.throwOnFailure(obj7);
                        flowUtil$createFlow$$inlined$map$1$2$1.L$0 = null;
                        flowUtil$createFlow$$inlined$map$1$2$1.label = 2;
                        break;
                    }
                }
                flowUtil$createFlow$$inlined$map$1$2$1 = new FlowUtil$createFlow$$inlined$map$1$2$1(this, continuation);
                Object obj72 = flowUtil$createFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = flowUtil$createFlow$$inlined$map$1$2$1.label;
                if (i2 != 0) {
                }
                flowUtil$createFlow$$inlined$map$1$2$1.L$0 = null;
                flowUtil$createFlow$$inlined$map$1$2$1.label = 2;
            case 3:
                if (continuation instanceof FlowQuery$mapToOneOrDefault$$inlined$map$1$2$1) {
                    flowQuery$mapToOneOrDefault$$inlined$map$1$2$1 = (FlowQuery$mapToOneOrDefault$$inlined$map$1$2$1) continuation;
                    int i11 = flowQuery$mapToOneOrDefault$$inlined$map$1$2$1.label;
                    if ((i11 & PKIFailureInfo.systemUnavail) != 0) {
                        flowQuery$mapToOneOrDefault$$inlined$map$1$2$1.label = i11 - PKIFailureInfo.systemUnavail;
                        Object obj8 = flowQuery$mapToOneOrDefault$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i3 = flowQuery$mapToOneOrDefault$$inlined$map$1$2$1.label;
                        if (i3 != 0) {
                            SafeTrace.throwOnFailure(obj8);
                            FlowCollector flowCollector4 = (FlowCollector) obj2;
                            GatedFrameClock.AnonymousClass1 anonymousClass1 = new GatedFrameClock.AnonymousClass1((Query) obj, obj4, objArr == true ? 1 : 0, 23);
                            flowQuery$mapToOneOrDefault$$inlined$map$1$2$1.L$4 = flowCollector4;
                            flowQuery$mapToOneOrDefault$$inlined$map$1$2$1.I$0 = 0;
                            flowQuery$mapToOneOrDefault$$inlined$map$1$2$1.label = 1;
                            Object withContext = JobKt.withContext((CoroutineContext) obj3, anonymousClass1, flowQuery$mapToOneOrDefault$$inlined$map$1$2$1);
                            if (withContext != coroutineSingletons4) {
                                flowCollector2 = flowCollector4;
                                obj8 = withContext;
                            }
                            return coroutineSingletons4;
                        }
                        if (i3 != 1) {
                            if (i3 == 2) {
                                SafeTrace.throwOnFailure(obj8);
                                return Unit.INSTANCE;
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i8 = flowQuery$mapToOneOrDefault$$inlined$map$1$2$1.I$0;
                        flowCollector2 = flowQuery$mapToOneOrDefault$$inlined$map$1$2$1.L$4;
                        SafeTrace.throwOnFailure(obj8);
                        flowQuery$mapToOneOrDefault$$inlined$map$1$2$1.L$4 = null;
                        flowQuery$mapToOneOrDefault$$inlined$map$1$2$1.I$0 = i8;
                        flowQuery$mapToOneOrDefault$$inlined$map$1$2$1.label = 2;
                        break;
                    }
                }
                flowQuery$mapToOneOrDefault$$inlined$map$1$2$1 = new FlowQuery$mapToOneOrDefault$$inlined$map$1$2$1(this, continuation);
                Object obj82 = flowQuery$mapToOneOrDefault$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = flowQuery$mapToOneOrDefault$$inlined$map$1$2$1.label;
                if (i3 != 0) {
                }
                flowQuery$mapToOneOrDefault$$inlined$map$1$2$1.L$4 = null;
                flowQuery$mapToOneOrDefault$$inlined$map$1$2$1.I$0 = i8;
                flowQuery$mapToOneOrDefault$$inlined$map$1$2$1.label = 2;
            case 4:
                RealFeatureFlagManager realFeatureFlagManager = (RealFeatureFlagManager) obj4;
                AbstractApplier abstractApplier = (AbstractApplier) obj3;
                if (continuation instanceof RealFeatureFlagManager$experimentValues$$inlined$map$1$2$1) {
                    realFeatureFlagManager$experimentValues$$inlined$map$1$2$1 = (RealFeatureFlagManager$experimentValues$$inlined$map$1$2$1) continuation;
                    int i12 = realFeatureFlagManager$experimentValues$$inlined$map$1$2$1.label;
                    if ((i12 & PKIFailureInfo.systemUnavail) != 0) {
                        realFeatureFlagManager$experimentValues$$inlined$map$1$2$1.label = i12 - PKIFailureInfo.systemUnavail;
                        Object obj9 = realFeatureFlagManager$experimentValues$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i4 = realFeatureFlagManager$experimentValues$$inlined$map$1$2$1.label;
                        if (i4 != 0) {
                            SafeTrace.throwOnFailure(obj9);
                            FlowCollector flowCollector5 = (FlowCollector) obj2;
                            FeatureFlag featureFlag = (FeatureFlag) ((Map) obj).get((String) abstractApplier.root);
                            String access$selected_option_label = featureFlag != null ? RealFeatureFlagManager.access$selected_option_label(realFeatureFlagManager, featureFlag) : null;
                            if (featureFlag == null || (str = featureFlag.selected_option_value) == null) {
                                flagValue = new RealFeatureFlagManager.FlagValue((FeatureFlag$Option) abstractApplier.current, true);
                            } else {
                                if (access$selected_option_label == null) {
                                    access$selected_option_label = str;
                                }
                                flagValue = realFeatureFlagManager.getOption(abstractApplier, access$selected_option_label, str);
                            }
                            realFeatureFlagManager$experimentValues$$inlined$map$1$2$1.label = 1;
                            if (flowCollector5.emit(flagValue, realFeatureFlagManager$experimentValues$$inlined$map$1$2$1) == coroutineSingletons5) {
                                return coroutineSingletons5;
                            }
                        } else {
                            if (i4 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj9);
                        }
                        return Unit.INSTANCE;
                    }
                }
                realFeatureFlagManager$experimentValues$$inlined$map$1$2$1 = new RealFeatureFlagManager$experimentValues$$inlined$map$1$2$1(this, continuation);
                Object obj92 = realFeatureFlagManager$experimentValues$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons52 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i4 = realFeatureFlagManager$experimentValues$$inlined$map$1$2$1.label;
                if (i4 != 0) {
                }
                return Unit.INSTANCE;
            case 5:
                FlowCollector flowCollector6 = (FlowCollector) obj2;
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj3;
                if (continuation instanceof FlowKt__LimitKt$dropWhile$1$1$emit$1) {
                    flowKt__LimitKt$dropWhile$1$1$emit$1 = (FlowKt__LimitKt$dropWhile$1$1$emit$1) continuation;
                    int i13 = flowKt__LimitKt$dropWhile$1$1$emit$1.label;
                    if ((i13 & PKIFailureInfo.systemUnavail) != 0) {
                        flowKt__LimitKt$dropWhile$1$1$emit$1.label = i13 - PKIFailureInfo.systemUnavail;
                        Object obj10 = flowKt__LimitKt$dropWhile$1$1$emit$1.result;
                        Object obj11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i5 = flowKt__LimitKt$dropWhile$1$1$emit$1.label;
                        if (i5 != 0) {
                            SafeTrace.throwOnFailure(obj10);
                            if (!ref$BooleanRef.element) {
                                flowKt__LimitKt$dropWhile$1$1$emit$1.L$0 = obj;
                                flowKt__LimitKt$dropWhile$1$1$emit$1.label = 2;
                                obj10 = ((Function2) obj4).invoke(obj, flowKt__LimitKt$dropWhile$1$1$emit$1);
                                break;
                            } else {
                                flowKt__LimitKt$dropWhile$1$1$emit$1.L$0 = null;
                                flowKt__LimitKt$dropWhile$1$1$emit$1.label = 1;
                                break;
                            }
                        } else {
                            if (i5 != 1) {
                                if (i5 == 2) {
                                    obj = flowKt__LimitKt$dropWhile$1$1$emit$1.L$0;
                                    SafeTrace.throwOnFailure(obj10);
                                    if (!((Boolean) obj10).booleanValue()) {
                                        ref$BooleanRef.element = true;
                                        flowKt__LimitKt$dropWhile$1$1$emit$1.L$0 = null;
                                        flowKt__LimitKt$dropWhile$1$1$emit$1.label = 3;
                                        break;
                                    }
                                    return Unit.INSTANCE;
                                }
                                if (i5 != 3) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                            }
                            SafeTrace.throwOnFailure(obj10);
                            return Unit.INSTANCE;
                        }
                        return obj11;
                    }
                }
                flowKt__LimitKt$dropWhile$1$1$emit$1 = new FlowKt__LimitKt$dropWhile$1$1$emit$1(this, continuation);
                Object obj102 = flowKt__LimitKt$dropWhile$1$1$emit$1.result;
                Object obj112 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i5 = flowKt__LimitKt$dropWhile$1$1$emit$1.label;
                if (i5 != 0) {
                }
                return obj112;
            default:
                Ref$ObjectRef ref$ObjectRef3 = (Ref$ObjectRef) obj4;
                if (continuation instanceof FlowKt__TransformKt$runningFold$1$1$emit$1) {
                    flowKt__TransformKt$runningFold$1$1$emit$1 = (FlowKt__TransformKt$runningFold$1$1$emit$1) continuation;
                    int i14 = flowKt__TransformKt$runningFold$1$1$emit$1.label;
                    if ((i14 & PKIFailureInfo.systemUnavail) != 0) {
                        flowKt__TransformKt$runningFold$1$1$emit$1.label = i14 - PKIFailureInfo.systemUnavail;
                        Object obj12 = flowKt__TransformKt$runningFold$1$1$emit$1.result;
                        CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i6 = flowKt__TransformKt$runningFold$1$1$emit$1.label;
                        if (i6 != 0) {
                            SafeTrace.throwOnFailure(obj12);
                            Object obj13 = ref$ObjectRef3.element;
                            flowKt__TransformKt$runningFold$1$1$emit$1.L$1 = ref$ObjectRef3;
                            flowKt__TransformKt$runningFold$1$1$emit$1.label = 1;
                            obj12 = ((Function3) obj3).invoke(obj13, obj, flowKt__TransformKt$runningFold$1$1$emit$1);
                            if (obj12 != coroutineSingletons6) {
                                ref$ObjectRef = ref$ObjectRef3;
                            }
                            return coroutineSingletons6;
                        }
                        if (i6 != 1) {
                            if (i6 == 2) {
                                SafeTrace.throwOnFailure(obj12);
                                return Unit.INSTANCE;
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ref$ObjectRef = flowKt__TransformKt$runningFold$1$1$emit$1.L$1;
                        SafeTrace.throwOnFailure(obj12);
                        ref$ObjectRef.element = obj12;
                        Object obj14 = ref$ObjectRef3.element;
                        flowKt__TransformKt$runningFold$1$1$emit$1.L$1 = null;
                        flowKt__TransformKt$runningFold$1$1$emit$1.label = 2;
                        break;
                    }
                }
                flowKt__TransformKt$runningFold$1$1$emit$1 = new FlowKt__TransformKt$runningFold$1$1$emit$1(this, continuation);
                Object obj122 = flowKt__TransformKt$runningFold$1$1$emit$1.result;
                CoroutineSingletons coroutineSingletons62 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i6 = flowKt__TransformKt$runningFold$1$1$emit$1.label;
                if (i6 != 0) {
                }
                ref$ObjectRef.element = obj122;
                Object obj142 = ref$ObjectRef3.element;
                flowKt__TransformKt$runningFold$1$1$emit$1.L$1 = null;
                flowKt__TransformKt$runningFold$1$1$emit$1.label = 2;
        }
    }

    public /* synthetic */ DistinctFlowImpl$collect$2(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$previousKey = obj2;
        this.$collector = obj3;
    }

    public DistinctFlowImpl$collect$2(Ref$ObjectRef ref$ObjectRef, Function3 function3, FlowCollector flowCollector) {
        this.$r8$classId = 6;
        this.$previousKey = ref$ObjectRef;
        this.this$0 = function3;
        this.$collector = flowCollector;
    }

    public /* synthetic */ DistinctFlowImpl$collect$2(FlowCollector flowCollector, Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.$collector = flowCollector;
        this.this$0 = obj;
        this.$previousKey = obj2;
    }
}
