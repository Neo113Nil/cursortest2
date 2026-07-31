package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.MutableState;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: Swipeable.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "anchors", "", ""}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes10.dex */
final class SwipeableState$animateTo$2 implements FlowCollector {
    final /* synthetic */ AnimationSpec $anim;
    final /* synthetic */ Object $targetValue;
    final /* synthetic */ SwipeableState this$0;

    SwipeableState$animateTo$2(Object obj, SwipeableState swipeableState, AnimationSpec animationSpec) {
        this.$targetValue = obj;
        this.this$0 = swipeableState;
        this.$anim = animationSpec;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Map map, Continuation continuation) {
        SwipeableState$animateTo$2$emit$1 swipeableState$animateTo$2$emit$1;
        int i;
        SwipeableState$animateTo$2 swipeableState$animateTo$2;
        Float offset;
        Object animateInternalToOffset;
        MutableState mutableState;
        Object firstOrNull;
        MutableState mutableState2;
        Object firstOrNull2;
        if (continuation instanceof SwipeableState$animateTo$2$emit$1) {
            swipeableState$animateTo$2$emit$1 = (SwipeableState$animateTo$2$emit$1) continuation;
            int i2 = swipeableState$animateTo$2$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                swipeableState$animateTo$2$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = swipeableState$animateTo$2$emit$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = swipeableState$animateTo$2$emit$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        offset = SwipeableKt.getOffset(map, this.$targetValue);
                        if (offset == null) {
                            throw new IllegalArgumentException("The target value must have an associated anchor.");
                        }
                        SwipeableState swipeableState = this.this$0;
                        float floatValue = offset.floatValue();
                        AnimationSpec animationSpec = this.$anim;
                        swipeableState$animateTo$2$emit$1.L$0 = this;
                        swipeableState$animateTo$2$emit$1.L$1 = map;
                        swipeableState$animateTo$2$emit$1.label = 1;
                        animateInternalToOffset = swipeableState.animateInternalToOffset(floatValue, animationSpec, swipeableState$animateTo$2$emit$1);
                        if (animateInternalToOffset == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        swipeableState$animateTo$2 = this;
                    } catch (Throwable th) {
                        th = th;
                        swipeableState$animateTo$2 = this;
                        mutableState = swipeableState$animateTo$2.this$0.absoluteOffset;
                        float floatValue2 = ((Number) mutableState.getValue()).floatValue();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : map.entrySet()) {
                            if (Math.abs(((Number) entry.getKey()).floatValue() - floatValue2) < 0.5f) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        firstOrNull = CollectionsKt.firstOrNull(linkedHashMap.values());
                        if (firstOrNull == null) {
                            firstOrNull = swipeableState$animateTo$2.this$0.getCurrentValue();
                        }
                        swipeableState$animateTo$2.this$0.setCurrentValue(firstOrNull);
                        throw th;
                    }
                } else if (i == 1) {
                    map = (Map) swipeableState$animateTo$2$emit$1.L$1;
                    swipeableState$animateTo$2 = (SwipeableState$animateTo$2) swipeableState$animateTo$2$emit$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        mutableState = swipeableState$animateTo$2.this$0.absoluteOffset;
                        float floatValue22 = ((Number) mutableState.getValue()).floatValue();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        while (r7.hasNext()) {
                        }
                        firstOrNull = CollectionsKt.firstOrNull(linkedHashMap2.values());
                        if (firstOrNull == null) {
                        }
                        swipeableState$animateTo$2.this$0.setCurrentValue(firstOrNull);
                        throw th;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableState2 = swipeableState$animateTo$2.this$0.absoluteOffset;
                float floatValue3 = ((Number) mutableState2.getValue()).floatValue();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Map.Entry entry2 : map.entrySet()) {
                    if (Math.abs(((Number) entry2.getKey()).floatValue() - floatValue3) < 0.5f) {
                        linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                    }
                }
                firstOrNull2 = CollectionsKt.firstOrNull(linkedHashMap3.values());
                if (firstOrNull2 == null) {
                    firstOrNull2 = swipeableState$animateTo$2.this$0.getCurrentValue();
                }
                swipeableState$animateTo$2.this$0.setCurrentValue(firstOrNull2);
                return Unit.INSTANCE;
            }
        }
        swipeableState$animateTo$2$emit$1 = new SwipeableState$animateTo$2$emit$1(this, continuation);
        Object obj2 = swipeableState$animateTo$2$emit$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = swipeableState$animateTo$2$emit$1.label;
        if (i != 0) {
        }
        mutableState2 = swipeableState$animateTo$2.this$0.absoluteOffset;
        float floatValue32 = ((Number) mutableState2.getValue()).floatValue();
        LinkedHashMap linkedHashMap32 = new LinkedHashMap();
        while (r7.hasNext()) {
        }
        firstOrNull2 = CollectionsKt.firstOrNull(linkedHashMap32.values());
        if (firstOrNull2 == null) {
        }
        swipeableState$animateTo$2.this$0.setCurrentValue(firstOrNull2);
        return Unit.INSTANCE;
    }
}
