package kotlinx.coroutines.flow;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.reflect.KClass;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.math.raw.Mod$$ExternalSyntheticBUOutline0;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class FlowKt__TransformKt$withIndex$1$1 implements FlowCollector {
    public final /* synthetic */ Object $index;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FlowCollector $this_flow;

    public /* synthetic */ FlowKt__TransformKt$withIndex$1$1(FlowCollector flowCollector, Object obj, int i) {
        this.$r8$classId = i;
        this.$this_flow = flowCollector;
        this.$index = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0077  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        FlowKt__TransformKt$withIndex$1$1$emit$1 flowKt__TransformKt$withIndex$1$1$emit$1;
        int i;
        FlowKt__TransformKt$filterIsInstance$$inlined$filter$2$2$1 flowKt__TransformKt$filterIsInstance$$inlined$filter$2$2$1;
        int i2;
        int i3 = this.$r8$classId;
        Object obj2 = this.$index;
        FlowCollector flowCollector = this.$this_flow;
        switch (i3) {
            case 0:
                if (continuation instanceof FlowKt__TransformKt$withIndex$1$1$emit$1) {
                    flowKt__TransformKt$withIndex$1$1$emit$1 = (FlowKt__TransformKt$withIndex$1$1$emit$1) continuation;
                    int i4 = flowKt__TransformKt$withIndex$1$1$emit$1.label;
                    if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                        flowKt__TransformKt$withIndex$1$1$emit$1.label = i4 - PKIFailureInfo.systemUnavail;
                        Object obj3 = flowKt__TransformKt$withIndex$1$1$emit$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = flowKt__TransformKt$withIndex$1$1$emit$1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj3);
                            Ref$IntRef ref$IntRef = (Ref$IntRef) obj2;
                            int i5 = ref$IntRef.element;
                            ref$IntRef.element = i5 + 1;
                            if (i5 < 0) {
                                Mod$$ExternalSyntheticBUOutline0.m$2("Index overflow has happened");
                                return null;
                            }
                            IndexedValue indexedValue = new IndexedValue(i5, obj);
                            flowKt__TransformKt$withIndex$1$1$emit$1.label = 1;
                            if (flowCollector.emit(indexedValue, flowKt__TransformKt$withIndex$1$1$emit$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj3);
                        }
                        return Unit.INSTANCE;
                    }
                }
                flowKt__TransformKt$withIndex$1$1$emit$1 = new FlowKt__TransformKt$withIndex$1$1$emit$1(this, continuation);
                Object obj32 = flowKt__TransformKt$withIndex$1$1$emit$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flowKt__TransformKt$withIndex$1$1$emit$1.label;
                if (i != 0) {
                }
                return Unit.INSTANCE;
            default:
                if (continuation instanceof FlowKt__TransformKt$filterIsInstance$$inlined$filter$2$2$1) {
                    flowKt__TransformKt$filterIsInstance$$inlined$filter$2$2$1 = (FlowKt__TransformKt$filterIsInstance$$inlined$filter$2$2$1) continuation;
                    int i6 = flowKt__TransformKt$filterIsInstance$$inlined$filter$2$2$1.label;
                    if ((i6 & PKIFailureInfo.systemUnavail) != 0) {
                        flowKt__TransformKt$filterIsInstance$$inlined$filter$2$2$1.label = i6 - PKIFailureInfo.systemUnavail;
                        Object obj4 = flowKt__TransformKt$filterIsInstance$$inlined$filter$2$2$1.result;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = flowKt__TransformKt$filterIsInstance$$inlined$filter$2$2$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj4);
                            if (((KClass) obj2).isInstance(obj)) {
                                flowKt__TransformKt$filterIsInstance$$inlined$filter$2$2$1.label = 1;
                                if (flowCollector.emit(obj, flowKt__TransformKt$filterIsInstance$$inlined$filter$2$2$1) == coroutineSingletons3) {
                                    return coroutineSingletons3;
                                }
                            }
                        } else {
                            if (i2 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj4);
                        }
                        return Unit.INSTANCE;
                    }
                }
                flowKt__TransformKt$filterIsInstance$$inlined$filter$2$2$1 = new FlowKt__TransformKt$filterIsInstance$$inlined$filter$2$2$1(this, continuation);
                Object obj42 = flowKt__TransformKt$filterIsInstance$$inlined$filter$2$2$1.result;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = flowKt__TransformKt$filterIsInstance$$inlined$filter$2$2$1.label;
                if (i2 != 0) {
                }
                return Unit.INSTANCE;
        }
    }
}
