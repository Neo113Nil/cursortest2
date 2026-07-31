package androidx.compose.material;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$LongRef;

/* compiled from: DragGestureDetectorCopy.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aI\u0010\f\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005H\u0080@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a!\u0010\u0011\u001a\u00020\u000e*\u00020\r2\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a!\u0010\u0015\u001a\u00020\u0007*\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\"\u0017\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\"\u0017\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018\"\u0014\u0010\u001a\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/input/pointer/PointerId;", "pointerId", "Landroidx/compose/ui/input/pointer/PointerType;", "pointerType", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "", "", "onPointerSlopReached", "awaitHorizontalPointerSlopOrCancellation-gDDlDlE", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitHorizontalPointerSlopOrCancellation", "Landroidx/compose/ui/input/pointer/PointerEvent;", "", "isPointerUp-DmW0f2w", "(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z", "isPointerUp", "Landroidx/compose/ui/platform/ViewConfiguration;", "pointerSlop-E8SPZFQ", "(Landroidx/compose/ui/platform/ViewConfiguration;I)F", "pointerSlop", "Landroidx/compose/ui/unit/Dp;", "mouseSlop", "F", "defaultTouchSlop", "mouseToTouchSlopRatio", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DragGestureDetectorCopyKt {
    private static final float defaultTouchSlop;
    private static final float mouseSlop;
    private static final float mouseToTouchSlopRatio;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x011b -> B:14:0x0126). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x015c -> B:11:0x015e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x017e -> B:14:0x0126). Please report as a decompilation issue!!! */
    /* renamed from: awaitHorizontalPointerSlopOrCancellation-gDDlDlE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m837awaitHorizontalPointerSlopOrCancellationgDDlDlE(AwaitPointerEventScope awaitPointerEventScope, long j, int i, Function2 function2, Continuation continuation) {
        DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1 dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;
        int i2;
        AwaitPointerEventScope awaitPointerEventScope2;
        Function2 function22;
        Ref$LongRef ref$LongRef;
        DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1 dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12;
        float f;
        float f2;
        Ref$LongRef ref$LongRef2;
        DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1 dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13;
        float f3;
        float f4;
        int size;
        int i3;
        Object obj;
        PointerInputChange pointerInputChange;
        Object obj2;
        Object awaitPointerEvent$default;
        if (continuation instanceof DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1) {
            dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1 = (DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1) continuation;
            int i4 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.label = i4 - Integer.MIN_VALUE;
                Object obj3 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.label;
                int i5 = 1;
                PointerEventPass pointerEventPass = null;
                if (i2 == 0) {
                    if (i2 == 1) {
                        float f5 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.F$1;
                        float f6 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.F$0;
                        Ref$LongRef ref$LongRef3 = (Ref$LongRef) dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.L$2;
                        AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.L$1;
                        Function2 function23 = (Function2) dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.L$0;
                        ResultKt.throwOnFailure(obj3);
                        DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1 dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$14 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;
                        f4 = f5;
                        awaitPointerEventScope2 = awaitPointerEventScope3;
                        dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$14;
                        f3 = f6;
                        function22 = function23;
                        ref$LongRef2 = ref$LongRef3;
                        PointerEvent pointerEvent = (PointerEvent) obj3;
                        List changes = pointerEvent.getChanges();
                        size = changes.size();
                        int i6 = 0;
                        i3 = 0;
                        while (true) {
                            if (i3 < size) {
                            }
                            i3++;
                        }
                        Intrinsics.checkNotNull(obj);
                        pointerInputChange = (PointerInputChange) obj;
                        if (!pointerInputChange.isConsumed()) {
                        }
                        return null;
                    }
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    float f7 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.F$1;
                    float f8 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.F$0;
                    PointerInputChange pointerInputChange2 = (PointerInputChange) dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.L$3;
                    Ref$LongRef ref$LongRef4 = (Ref$LongRef) dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.L$2;
                    AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.L$1;
                    Function2 function24 = (Function2) dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.L$0;
                    ResultKt.throwOnFailure(obj3);
                    f2 = f7;
                    awaitPointerEventScope2 = awaitPointerEventScope4;
                    ref$LongRef2 = ref$LongRef4;
                    dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;
                    f = f8;
                    function22 = function24;
                    if (!pointerInputChange2.isConsumed()) {
                        dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13;
                        ref$LongRef = ref$LongRef2;
                        i5 = 1;
                        pointerEventPass = null;
                        dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.L$0 = function22;
                        dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                        dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.L$2 = ref$LongRef;
                        dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.L$3 = pointerEventPass;
                        dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.F$0 = f;
                        dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.F$1 = f2;
                        dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.label = i5;
                        awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12, i5, pointerEventPass);
                        if (awaitPointerEvent$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        float f9 = f;
                        f4 = f2;
                        obj3 = awaitPointerEvent$default;
                        ref$LongRef2 = ref$LongRef;
                        dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12;
                        f3 = f9;
                        PointerEvent pointerEvent2 = (PointerEvent) obj3;
                        List changes2 = pointerEvent2.getChanges();
                        size = changes2.size();
                        int i62 = 0;
                        i3 = 0;
                        while (true) {
                            if (i3 < size) {
                                obj = null;
                                break;
                            }
                            obj = changes2.get(i3);
                            if (PointerId.m1868equalsimpl0(((PointerInputChange) obj).getId(), ref$LongRef2.element)) {
                                break;
                            }
                            i3++;
                        }
                        Intrinsics.checkNotNull(obj);
                        pointerInputChange = (PointerInputChange) obj;
                        if (!pointerInputChange.isConsumed()) {
                            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                                List changes3 = pointerEvent2.getChanges();
                                int size2 = changes3.size();
                                while (true) {
                                    if (i62 >= size2) {
                                        obj2 = null;
                                        break;
                                    }
                                    obj2 = changes3.get(i62);
                                    if (((PointerInputChange) obj2).getPressed()) {
                                        break;
                                    }
                                    i62++;
                                }
                                PointerInputChange pointerInputChange3 = (PointerInputChange) obj2;
                                if (pointerInputChange3 != null) {
                                    ref$LongRef2.element = pointerInputChange3.getId();
                                    f2 = f4;
                                    f = f3;
                                    dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13;
                                    ref$LongRef = ref$LongRef2;
                                }
                            } else {
                                f2 = (Offset.m1297getXimpl(pointerInputChange.getPosition()) - Offset.m1297getXimpl(pointerInputChange.getPreviousPosition())) + f4;
                                if (Math.abs(f2) < f3) {
                                    PointerEventPass pointerEventPass2 = PointerEventPass.Final;
                                    dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13.L$0 = function22;
                                    dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13.L$1 = awaitPointerEventScope2;
                                    dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13.L$2 = ref$LongRef2;
                                    dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13.L$3 = pointerInputChange;
                                    dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13.F$0 = f3;
                                    dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13.F$1 = f2;
                                    dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13.label = 2;
                                    if (awaitPointerEventScope2.awaitPointerEvent(pointerEventPass2, dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    f = f3;
                                    pointerInputChange2 = pointerInputChange;
                                    if (!pointerInputChange2.isConsumed()) {
                                    }
                                } else {
                                    function22.invoke(pointerInputChange, Boxing.boxFloat(f2 - (Math.signum(f2) * f3)));
                                    if (pointerInputChange.isConsumed()) {
                                        return pointerInputChange;
                                    }
                                    f = f3;
                                    dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13;
                                    ref$LongRef = ref$LongRef2;
                                    f2 = 0.0f;
                                }
                            }
                            i5 = 1;
                            pointerEventPass = null;
                            dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.L$0 = function22;
                            dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                            dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.L$2 = ref$LongRef;
                            dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.L$3 = pointerEventPass;
                            dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.F$0 = f;
                            dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.F$1 = f2;
                            dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.label = i5;
                            awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12, i5, pointerEventPass);
                            if (awaitPointerEvent$default == coroutine_suspended) {
                            }
                        }
                    }
                    return null;
                }
                ResultKt.throwOnFailure(obj3);
                if (m838isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                    return null;
                }
                float m839pointerSlopE8SPZFQ = m839pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i);
                Ref$LongRef ref$LongRef5 = new Ref$LongRef();
                ref$LongRef5.element = j;
                awaitPointerEventScope2 = awaitPointerEventScope;
                function22 = function2;
                ref$LongRef = ref$LongRef5;
                dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;
                f = m839pointerSlopE8SPZFQ;
                f2 = 0.0f;
                dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.L$0 = function22;
                dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.L$2 = ref$LongRef;
                dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.L$3 = pointerEventPass;
                dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.F$0 = f;
                dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.F$1 = f2;
                dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.label = i5;
                awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12, i5, pointerEventPass);
                if (awaitPointerEvent$default == coroutine_suspended) {
                }
            }
        }
        dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1 = new DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1(continuation);
        Object obj32 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.label;
        int i52 = 1;
        PointerEventPass pointerEventPass3 = null;
        if (i2 == 0) {
        }
    }

    /* renamed from: isPointerUp-DmW0f2w, reason: not valid java name */
    private static final boolean m838isPointerUpDmW0f2w(PointerEvent pointerEvent, long j) {
        Object obj;
        List changes = pointerEvent.getChanges();
        int size = changes.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = changes.get(i);
            if (PointerId.m1868equalsimpl0(((PointerInputChange) obj).getId(), j)) {
                break;
            }
            i++;
        }
        PointerInputChange pointerInputChange = (PointerInputChange) obj;
        if (pointerInputChange != null && pointerInputChange.getPressed()) {
            z = true;
        }
        return true ^ z;
    }

    /* renamed from: pointerSlop-E8SPZFQ, reason: not valid java name */
    public static final float m839pointerSlopE8SPZFQ(ViewConfiguration pointerSlop, int i) {
        Intrinsics.checkNotNullParameter(pointerSlop, "$this$pointerSlop");
        return PointerType.m1898equalsimpl0(i, PointerType.INSTANCE.m1903getMouseT8wyACA()) ? pointerSlop.getTouchSlop() * mouseToTouchSlopRatio : pointerSlop.getTouchSlop();
    }

    static {
        float m2507constructorimpl = Dp.m2507constructorimpl((float) 0.125d);
        mouseSlop = m2507constructorimpl;
        float m2507constructorimpl2 = Dp.m2507constructorimpl(18);
        defaultTouchSlop = m2507constructorimpl2;
        mouseToTouchSlopRatio = m2507constructorimpl / m2507constructorimpl2;
    }
}
