package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: Transformable.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a!\u0010\u000b\u001a\u00020\u0006*\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Landroidx/compose/runtime/State;", "", "panZoomLock", "Landroidx/compose/foundation/gestures/TransformableState;", "state", "", "detectZoom", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "requireUnconsumed", "awaitTwoDowns", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TransformableKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(1:(4:11|12|13|14)(2:17|18))(1:19))(2:23|(1:25)(1:26))|20|(1:22)|12|13|14))|28|6|7|(0)(0)|20|(0)|12|13|14) */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object detectZoom(PointerInputScope pointerInputScope, State state, State state2, Continuation continuation) {
        TransformableKt$detectZoom$1 transformableKt$detectZoom$1;
        Object coroutine_suspended;
        int i;
        Ref$BooleanRef ref$BooleanRef;
        State state3;
        float f;
        Ref$LongRef ref$LongRef;
        Ref$FloatRef ref$FloatRef;
        Ref$FloatRef ref$FloatRef2;
        Ref$BooleanRef ref$BooleanRef2;
        State state4;
        PointerInputScope pointerInputScope2;
        TransformableState transformableState;
        MutatePriority mutatePriority;
        TransformableKt$detectZoom$3 transformableKt$detectZoom$3;
        if (continuation instanceof TransformableKt$detectZoom$1) {
            transformableKt$detectZoom$1 = (TransformableKt$detectZoom$1) continuation;
            int i2 = transformableKt$detectZoom$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transformableKt$detectZoom$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transformableKt$detectZoom$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = transformableKt$detectZoom$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref$FloatRef ref$FloatRef3 = new Ref$FloatRef();
                    Ref$FloatRef ref$FloatRef4 = new Ref$FloatRef();
                    ref$FloatRef4.element = 1.0f;
                    Ref$LongRef ref$LongRef2 = new Ref$LongRef();
                    ref$LongRef2.element = Offset.INSTANCE.m1308getZeroF1C5BW0();
                    ref$BooleanRef = new Ref$BooleanRef();
                    float touchSlop = pointerInputScope.getViewConfiguration().getTouchSlop();
                    Ref$BooleanRef ref$BooleanRef3 = new Ref$BooleanRef();
                    TransformableKt$detectZoom$2 transformableKt$detectZoom$2 = new TransformableKt$detectZoom$2(null);
                    transformableKt$detectZoom$1.L$0 = pointerInputScope;
                    transformableKt$detectZoom$1.L$1 = state;
                    state3 = state2;
                    transformableKt$detectZoom$1.L$2 = state3;
                    transformableKt$detectZoom$1.L$3 = ref$FloatRef3;
                    transformableKt$detectZoom$1.L$4 = ref$FloatRef4;
                    transformableKt$detectZoom$1.L$5 = ref$LongRef2;
                    transformableKt$detectZoom$1.L$6 = ref$BooleanRef;
                    transformableKt$detectZoom$1.L$7 = ref$BooleanRef3;
                    transformableKt$detectZoom$1.F$0 = touchSlop;
                    transformableKt$detectZoom$1.label = 1;
                    if (pointerInputScope.awaitPointerEventScope(transformableKt$detectZoom$2, transformableKt$detectZoom$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    f = touchSlop;
                    ref$LongRef = ref$LongRef2;
                    ref$FloatRef = ref$FloatRef4;
                    ref$FloatRef2 = ref$FloatRef3;
                    ref$BooleanRef2 = ref$BooleanRef3;
                    state4 = state;
                    pointerInputScope2 = pointerInputScope;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    float f2 = transformableKt$detectZoom$1.F$0;
                    Ref$BooleanRef ref$BooleanRef4 = (Ref$BooleanRef) transformableKt$detectZoom$1.L$7;
                    Ref$BooleanRef ref$BooleanRef5 = (Ref$BooleanRef) transformableKt$detectZoom$1.L$6;
                    Ref$LongRef ref$LongRef3 = (Ref$LongRef) transformableKt$detectZoom$1.L$5;
                    Ref$FloatRef ref$FloatRef5 = (Ref$FloatRef) transformableKt$detectZoom$1.L$4;
                    Ref$FloatRef ref$FloatRef6 = (Ref$FloatRef) transformableKt$detectZoom$1.L$3;
                    State state5 = (State) transformableKt$detectZoom$1.L$2;
                    State state6 = (State) transformableKt$detectZoom$1.L$1;
                    pointerInputScope2 = (PointerInputScope) transformableKt$detectZoom$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    f = f2;
                    ref$BooleanRef2 = ref$BooleanRef4;
                    ref$BooleanRef = ref$BooleanRef5;
                    ref$LongRef = ref$LongRef3;
                    ref$FloatRef = ref$FloatRef5;
                    ref$FloatRef2 = ref$FloatRef6;
                    state3 = state5;
                    state4 = state6;
                }
                transformableState = (TransformableState) state3.getValue();
                mutatePriority = MutatePriority.UserInput;
                transformableKt$detectZoom$3 = new TransformableKt$detectZoom$3(pointerInputScope2, ref$BooleanRef, ref$FloatRef, ref$FloatRef2, ref$LongRef, f, ref$BooleanRef2, state4, null);
                transformableKt$detectZoom$1.L$0 = null;
                transformableKt$detectZoom$1.L$1 = null;
                transformableKt$detectZoom$1.L$2 = null;
                transformableKt$detectZoom$1.L$3 = null;
                transformableKt$detectZoom$1.L$4 = null;
                transformableKt$detectZoom$1.L$5 = null;
                transformableKt$detectZoom$1.L$6 = null;
                transformableKt$detectZoom$1.L$7 = null;
                transformableKt$detectZoom$1.label = 2;
                if (transformableState.transform(mutatePriority, transformableKt$detectZoom$3, transformableKt$detectZoom$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        transformableKt$detectZoom$1 = new TransformableKt$detectZoom$1(continuation);
        Object obj2 = transformableKt$detectZoom$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = transformableKt$detectZoom$1.label;
        if (i != 0) {
        }
        transformableState = (TransformableState) state3.getValue();
        mutatePriority = MutatePriority.UserInput;
        transformableKt$detectZoom$3 = new TransformableKt$detectZoom$3(pointerInputScope2, ref$BooleanRef, ref$FloatRef, ref$FloatRef2, ref$LongRef, f, ref$BooleanRef2, state4, null);
        transformableKt$detectZoom$1.L$0 = null;
        transformableKt$detectZoom$1.L$1 = null;
        transformableKt$detectZoom$1.L$2 = null;
        transformableKt$detectZoom$1.L$3 = null;
        transformableKt$detectZoom$1.L$4 = null;
        transformableKt$detectZoom$1.L$5 = null;
        transformableKt$detectZoom$1.L$6 = null;
        transformableKt$detectZoom$1.L$7 = null;
        transformableKt$detectZoom$1.label = 2;
        if (transformableState.transform(mutatePriority, transformableKt$detectZoom$3, transformableKt$detectZoom$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r5v6, types: [T, androidx.compose.ui.input.pointer.PointerId] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0060 -> B:10:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object awaitTwoDowns(AwaitPointerEventScope awaitPointerEventScope, boolean z, Continuation continuation) {
        TransformableKt$awaitTwoDowns$1 transformableKt$awaitTwoDowns$1;
        int i;
        Ref$ObjectRef ref$ObjectRef;
        TransformableKt$awaitTwoDowns$1 transformableKt$awaitTwoDowns$12;
        AwaitPointerEventScope awaitPointerEventScope2;
        boolean z2;
        Object awaitPointerEvent$default;
        int i2;
        if (continuation instanceof TransformableKt$awaitTwoDowns$1) {
            transformableKt$awaitTwoDowns$1 = (TransformableKt$awaitTwoDowns$1) continuation;
            int i3 = transformableKt$awaitTwoDowns$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                transformableKt$awaitTwoDowns$1.label = i3 - Integer.MIN_VALUE;
                Object obj = transformableKt$awaitTwoDowns$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = transformableKt$awaitTwoDowns$1.label;
                PointerEventPass pointerEventPass = null;
                int i4 = 1;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ref$ObjectRef = new Ref$ObjectRef();
                    transformableKt$awaitTwoDowns$12 = transformableKt$awaitTwoDowns$1;
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    z2 = z;
                    transformableKt$awaitTwoDowns$12.L$0 = awaitPointerEventScope2;
                    transformableKt$awaitTwoDowns$12.L$1 = ref$ObjectRef;
                    transformableKt$awaitTwoDowns$12.Z$0 = z2;
                    transformableKt$awaitTwoDowns$12.label = i4;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, transformableKt$awaitTwoDowns$12, i4, pointerEventPass);
                    if (awaitPointerEvent$default != coroutine_suspended) {
                    }
                } else if (i == 1) {
                    boolean z3 = transformableKt$awaitTwoDowns$1.Z$0;
                    ref$ObjectRef = (Ref$ObjectRef) transformableKt$awaitTwoDowns$1.L$1;
                    AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) transformableKt$awaitTwoDowns$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    transformableKt$awaitTwoDowns$12 = transformableKt$awaitTwoDowns$1;
                    z2 = z3;
                    PointerEvent pointerEvent = (PointerEvent) obj;
                    Ref$IntRef ref$IntRef = new Ref$IntRef();
                    ref$IntRef.element = ref$ObjectRef.element == 0 ? i4 : 0;
                    List changes = pointerEvent.getChanges();
                    int size = changes.size();
                    int i5 = 0;
                    while (i5 < size) {
                        PointerInputChange pointerInputChange = (PointerInputChange) changes.get(i5);
                        boolean changedToDown = z2 ? PointerEventKt.changedToDown(pointerInputChange) : PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange);
                        if (z2 ? PointerEventKt.changedToUp(pointerInputChange) : PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                            long id = pointerInputChange.getId();
                            T t = ref$ObjectRef.element;
                            if (t == 0 ? false : PointerId.m1868equalsimpl0(((PointerId) t).getValue(), id)) {
                                pointerEventPass = null;
                                ref$ObjectRef.element = null;
                                i2 = 1;
                                ref$IntRef.element--;
                            } else {
                                pointerEventPass = null;
                                i2 = 1;
                            }
                        } else {
                            i2 = i4;
                        }
                        if (changedToDown) {
                            ref$ObjectRef.element = PointerId.m1865boximpl(pointerInputChange.getId());
                            ref$IntRef.element += i2;
                        }
                        i5++;
                        i4 = i2;
                    }
                    int i6 = i4;
                    if ((ref$IntRef.element <= i6 ? i6 : 0) != 0) {
                        awaitPointerEventScope2 = awaitPointerEventScope3;
                        i4 = i6;
                        transformableKt$awaitTwoDowns$12.L$0 = awaitPointerEventScope2;
                        transformableKt$awaitTwoDowns$12.L$1 = ref$ObjectRef;
                        transformableKt$awaitTwoDowns$12.Z$0 = z2;
                        transformableKt$awaitTwoDowns$12.label = i4;
                        awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, transformableKt$awaitTwoDowns$12, i4, pointerEventPass);
                        if (awaitPointerEvent$default != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        awaitPointerEventScope3 = awaitPointerEventScope2;
                        obj = awaitPointerEvent$default;
                        PointerEvent pointerEvent2 = (PointerEvent) obj;
                        Ref$IntRef ref$IntRef2 = new Ref$IntRef();
                        ref$IntRef2.element = ref$ObjectRef.element == 0 ? i4 : 0;
                        List changes2 = pointerEvent2.getChanges();
                        int size2 = changes2.size();
                        int i52 = 0;
                        while (i52 < size2) {
                        }
                        int i62 = i4;
                        if ((ref$IntRef2.element <= i62 ? i62 : 0) != 0) {
                        }
                    } else {
                        return Unit.INSTANCE;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        transformableKt$awaitTwoDowns$1 = new TransformableKt$awaitTwoDowns$1(continuation);
        Object obj2 = transformableKt$awaitTwoDowns$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = transformableKt$awaitTwoDowns$1.label;
        PointerEventPass pointerEventPass2 = null;
        int i42 = 1;
        if (i != 0) {
        }
    }
}
