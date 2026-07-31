package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;

/* compiled from: DragGestureDetector.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aI\u0010\f\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005H\u0080@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a9\u0010\u0012\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\rH\u0086@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a'\u0010\u0015\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001aj\u0010\u001b\u001a\u00020\b*\u00020\u00162\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\r2\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005H\u0086@ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001aj\u0010\u001d\u001a\u00020\b*\u00020\u00162\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\r2\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005H\u0086@ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001c\u001aA\u0010\"\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0018\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\b0\u0005H\u0086@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!\u001aI\u0010$\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0018\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\b0\u0005H\u0080@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010\u000b\u001a9\u0010&\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\rH\u0086@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010\u0011\u001a'\u0010(\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010\u0014\u001aA\u0010*\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0018\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\b0\u0005H\u0086@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010!\u001aI\u0010,\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\b0\u0005H\u0080@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010\u000b\u001a9\u0010.\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\rH\u0086@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010\u0011\u001a'\u00100\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b/\u0010\u0014\u001a!\u00102\u001a\u0004\u0018\u00010\u0006*\u00020\u00162\u0006\u00101\u001a\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b2\u00103\u001a!\u00107\u001a\u00020\u000f*\u0002042\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b5\u00106\u001a!\u0010;\u001a\u00020\u001e*\u0002082\u0006\u0010\u0004\u001a\u00020\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b9\u0010:\"\u0017\u0010=\u001a\u00020<8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b=\u0010>\"\u0017\u0010?\u001a\u00020<8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b?\u0010>\"\u0014\u0010@\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010>\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006A"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/input/pointer/PointerId;", "pointerId", "Landroidx/compose/ui/input/pointer/PointerType;", "pointerType", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/geometry/Offset;", "", "onPointerSlopReached", "awaitPointerSlopOrCancellation-gDDlDlE", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitPointerSlopOrCancellation", "Lkotlin/Function1;", "onDrag", "", "drag-jO51t88", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "drag", "awaitDragOrCancellation-rnUCldI", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitDragOrCancellation", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "onDragStart", "Lkotlin/Function0;", "onDragEnd", "onDragCancel", "detectDragGestures", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detectDragGesturesAfterLongPress", "", "onTouchSlopReached", "awaitVerticalTouchSlopOrCancellation-jO51t88", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitVerticalTouchSlopOrCancellation", "awaitVerticalPointerSlopOrCancellation-gDDlDlE", "awaitVerticalPointerSlopOrCancellation", "verticalDrag-jO51t88", "verticalDrag", "awaitVerticalDragOrCancellation-rnUCldI", "awaitVerticalDragOrCancellation", "awaitHorizontalTouchSlopOrCancellation-jO51t88", "awaitHorizontalTouchSlopOrCancellation", "awaitHorizontalPointerSlopOrCancellation-gDDlDlE", "awaitHorizontalPointerSlopOrCancellation", "horizontalDrag-jO51t88", "horizontalDrag", "awaitHorizontalDragOrCancellation-rnUCldI", "awaitHorizontalDragOrCancellation", "initialDown", "awaitLongPressOrCancellation", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/ui/input/pointer/PointerInputChange;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/PointerEvent;", "isPointerUp-DmW0f2w", "(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z", "isPointerUp", "Landroidx/compose/ui/platform/ViewConfiguration;", "pointerSlop-E8SPZFQ", "(Landroidx/compose/ui/platform/ViewConfiguration;I)F", "pointerSlop", "Landroidx/compose/ui/unit/Dp;", "mouseSlop", "F", "defaultTouchSlop", "mouseToTouchSlopRatio", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DragGestureDetectorKt {
    private static final float defaultTouchSlop;
    private static final float mouseSlop;
    private static final float mouseToTouchSlopRatio;

    /* JADX WARN: Removed duplicated region for block: B:13:0x017b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0156 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0114 -> B:16:0x011f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x016f -> B:11:0x0175). Please report as a decompilation issue!!! */
    /* renamed from: awaitPointerSlopOrCancellation-gDDlDlE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m233awaitPointerSlopOrCancellationgDDlDlE(AwaitPointerEventScope awaitPointerEventScope, long j, int i, Function2 function2, Continuation continuation) {
        DragGestureDetectorKt$awaitPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitPointerSlopOrCancellation$1;
        int i2;
        long m1308getZeroF1C5BW0;
        float m240pointerSlopE8SPZFQ;
        Ref$LongRef ref$LongRef;
        AwaitPointerEventScope awaitPointerEventScope2;
        Function2 function22;
        DragGestureDetectorKt$awaitPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitPointerSlopOrCancellation$12;
        long j2;
        Ref$LongRef ref$LongRef2;
        float f;
        int size;
        int i3;
        Object obj;
        PointerInputChange pointerInputChange;
        boolean z;
        Object obj2;
        int i4;
        Object awaitPointerEvent$default;
        if (continuation instanceof DragGestureDetectorKt$awaitPointerSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$1 = (DragGestureDetectorKt$awaitPointerSlopOrCancellation$1) continuation;
            int i5 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.label = i5 - Integer.MIN_VALUE;
                Object obj3 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.label;
                int i6 = 1;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj3);
                    if (m239isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                        return null;
                    }
                    m1308getZeroF1C5BW0 = Offset.INSTANCE.m1308getZeroF1C5BW0();
                    m240pointerSlopE8SPZFQ = m240pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i);
                    ref$LongRef = new Ref$LongRef();
                    ref$LongRef.element = j;
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    function22 = function2;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$0 = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$1 = function22;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$2 = ref$LongRef;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$3 = null;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.J$0 = m1308getZeroF1C5BW0;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.F$0 = m240pointerSlopE8SPZFQ;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.label = i6;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitPointerSlopOrCancellation$1, i6, null);
                    if (awaitPointerEvent$default == coroutine_suspended) {
                    }
                } else if (i2 == 1) {
                    float f2 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.F$0;
                    long j3 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.J$0;
                    Ref$LongRef ref$LongRef3 = (Ref$LongRef) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$2;
                    Function2 function23 = (Function2) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$1;
                    AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$0;
                    ResultKt.throwOnFailure(obj3);
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1;
                    f = f2;
                    awaitPointerEventScope2 = awaitPointerEventScope3;
                    j2 = j3;
                    ref$LongRef2 = ref$LongRef3;
                    function22 = function23;
                    DragGestureDetectorKt$awaitPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitPointerSlopOrCancellation$13 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$12;
                    PointerEvent pointerEvent = (PointerEvent) obj3;
                    List changes = pointerEvent.getChanges();
                    size = changes.size();
                    i3 = 0;
                    while (true) {
                        if (i3 < size) {
                        }
                        i3 = i4 + 1;
                    }
                    pointerInputChange = (PointerInputChange) obj;
                    if (pointerInputChange != null) {
                        return null;
                    }
                    if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                    }
                } else if (i2 == 2) {
                    float f3 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.F$0;
                    m1308getZeroF1C5BW0 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.J$0;
                    PointerInputChange pointerInputChange2 = (PointerInputChange) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$3;
                    ref$LongRef = (Ref$LongRef) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$2;
                    Function2 function24 = (Function2) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$1;
                    AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$0;
                    ResultKt.throwOnFailure(obj3);
                    m240pointerSlopE8SPZFQ = f3;
                    char c = 2;
                    awaitPointerEventScope2 = awaitPointerEventScope4;
                    if (!pointerInputChange2.isConsumed()) {
                        return null;
                    }
                    function22 = function24;
                    i6 = 1;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$0 = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$1 = function22;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$2 = ref$LongRef;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$3 = null;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.J$0 = m1308getZeroF1C5BW0;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.F$0 = m240pointerSlopE8SPZFQ;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.label = i6;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitPointerSlopOrCancellation$1, i6, null);
                    if (awaitPointerEvent$default == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1;
                    f = m240pointerSlopE8SPZFQ;
                    obj3 = awaitPointerEvent$default;
                    j2 = m1308getZeroF1C5BW0;
                    ref$LongRef2 = ref$LongRef;
                    DragGestureDetectorKt$awaitPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitPointerSlopOrCancellation$132 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$12;
                    PointerEvent pointerEvent2 = (PointerEvent) obj3;
                    List changes2 = pointerEvent2.getChanges();
                    size = changes2.size();
                    i3 = 0;
                    while (true) {
                        if (i3 < size) {
                            obj = null;
                            break;
                        }
                        obj = changes2.get(i3);
                        i4 = i3;
                        if (PointerId.m1868equalsimpl0(((PointerInputChange) obj).getId(), ref$LongRef2.element)) {
                            break;
                        }
                        i3 = i4 + 1;
                    }
                    pointerInputChange = (PointerInputChange) obj;
                    if (pointerInputChange != null || pointerInputChange.isConsumed()) {
                        return null;
                    }
                    if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                        List changes3 = pointerEvent2.getChanges();
                        int size2 = changes3.size();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size2) {
                                obj2 = null;
                                break;
                            }
                            obj2 = changes3.get(i7);
                            if (((PointerInputChange) obj2).getPressed()) {
                                break;
                            }
                            i7++;
                        }
                        PointerInputChange pointerInputChange3 = (PointerInputChange) obj2;
                        if (pointerInputChange3 == null) {
                            return null;
                        }
                        ref$LongRef2.element = pointerInputChange3.getId();
                        m240pointerSlopE8SPZFQ = f;
                        dragGestureDetectorKt$awaitPointerSlopOrCancellation$1 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$132;
                        ref$LongRef = ref$LongRef2;
                        m1308getZeroF1C5BW0 = j2;
                        i6 = 1;
                        dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$0 = awaitPointerEventScope2;
                        dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$1 = function22;
                        dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$2 = ref$LongRef;
                        dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$3 = null;
                        dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.J$0 = m1308getZeroF1C5BW0;
                        dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.F$0 = m240pointerSlopE8SPZFQ;
                        dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.label = i6;
                        awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitPointerSlopOrCancellation$1, i6, null);
                        if (awaitPointerEvent$default == coroutine_suspended) {
                        }
                    } else {
                        long m1302plusMKHz9U = Offset.m1302plusMKHz9U(j2, PointerEventKt.positionChange(pointerInputChange));
                        float m1295getDistanceimpl = Offset.m1295getDistanceimpl(m1302plusMKHz9U);
                        if (m1295getDistanceimpl >= f) {
                            function22.invoke(pointerInputChange, Offset.m1288boximpl(Offset.m1301minusMKHz9U(m1302plusMKHz9U, Offset.m1303timestuRUvjQ(Offset.m1292divtuRUvjQ(m1302plusMKHz9U, m1295getDistanceimpl), f))));
                            if (pointerInputChange.isConsumed()) {
                                z = true;
                                if (!z) {
                                    return pointerInputChange;
                                }
                                PointerEventPass pointerEventPass = PointerEventPass.Final;
                                dragGestureDetectorKt$awaitPointerSlopOrCancellation$132.L$0 = awaitPointerEventScope2;
                                dragGestureDetectorKt$awaitPointerSlopOrCancellation$132.L$1 = function22;
                                dragGestureDetectorKt$awaitPointerSlopOrCancellation$132.L$2 = ref$LongRef2;
                                dragGestureDetectorKt$awaitPointerSlopOrCancellation$132.L$3 = pointerInputChange;
                                dragGestureDetectorKt$awaitPointerSlopOrCancellation$132.J$0 = m1302plusMKHz9U;
                                dragGestureDetectorKt$awaitPointerSlopOrCancellation$132.F$0 = f;
                                c = 2;
                                dragGestureDetectorKt$awaitPointerSlopOrCancellation$132.label = 2;
                                if (awaitPointerEventScope2.awaitPointerEvent(pointerEventPass, dragGestureDetectorKt$awaitPointerSlopOrCancellation$132) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                m240pointerSlopE8SPZFQ = f;
                                dragGestureDetectorKt$awaitPointerSlopOrCancellation$1 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$132;
                                ref$LongRef = ref$LongRef2;
                                m1308getZeroF1C5BW0 = m1302plusMKHz9U;
                                function24 = function22;
                                pointerInputChange2 = pointerInputChange;
                                if (!pointerInputChange2.isConsumed()) {
                                }
                            } else {
                                m1302plusMKHz9U = Offset.INSTANCE.m1308getZeroF1C5BW0();
                            }
                        }
                        z = false;
                        if (!z) {
                        }
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        dragGestureDetectorKt$awaitPointerSlopOrCancellation$1 = new DragGestureDetectorKt$awaitPointerSlopOrCancellation$1(continuation);
        Object obj32 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.label;
        int i62 = 1;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0048 -> B:10:0x004b). Please report as a decompilation issue!!! */
    /* renamed from: drag-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m237dragjO51t88(AwaitPointerEventScope awaitPointerEventScope, long j, Function1 function1, Continuation continuation) {
        DragGestureDetectorKt$drag$1 dragGestureDetectorKt$drag$1;
        int i;
        PointerInputChange pointerInputChange;
        if (continuation instanceof DragGestureDetectorKt$drag$1) {
            dragGestureDetectorKt$drag$1 = (DragGestureDetectorKt$drag$1) continuation;
            int i2 = dragGestureDetectorKt$drag$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$drag$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dragGestureDetectorKt$drag$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$drag$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    dragGestureDetectorKt$drag$1.L$0 = awaitPointerEventScope;
                    dragGestureDetectorKt$drag$1.L$1 = function1;
                    dragGestureDetectorKt$drag$1.label = 1;
                    obj = m229awaitDragOrCancellationrnUCldI(awaitPointerEventScope, j, dragGestureDetectorKt$drag$1);
                    if (obj == coroutine_suspended) {
                    }
                    pointerInputChange = (PointerInputChange) obj;
                    if (pointerInputChange == null) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Function1 function12 = (Function1) dragGestureDetectorKt$drag$1.L$1;
                    AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) dragGestureDetectorKt$drag$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    function1 = function12;
                    awaitPointerEventScope = awaitPointerEventScope2;
                    pointerInputChange = (PointerInputChange) obj;
                    if (pointerInputChange == null) {
                        if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                            return Boxing.boxBoolean(true);
                        }
                        function1.invoke(pointerInputChange);
                        j = pointerInputChange.getId();
                        dragGestureDetectorKt$drag$1.L$0 = awaitPointerEventScope;
                        dragGestureDetectorKt$drag$1.L$1 = function1;
                        dragGestureDetectorKt$drag$1.label = 1;
                        obj = m229awaitDragOrCancellationrnUCldI(awaitPointerEventScope, j, dragGestureDetectorKt$drag$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        pointerInputChange = (PointerInputChange) obj;
                        if (pointerInputChange == null) {
                            return Boxing.boxBoolean(false);
                        }
                    }
                }
            }
        }
        dragGestureDetectorKt$drag$1 = new DragGestureDetectorKt$drag$1(continuation);
        Object obj2 = dragGestureDetectorKt$drag$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$drag$1.label;
        if (i != 0) {
        }
    }

    static {
        float m2507constructorimpl = Dp.m2507constructorimpl((float) 0.125d);
        mouseSlop = m2507constructorimpl;
        float m2507constructorimpl2 = Dp.m2507constructorimpl(18);
        defaultTouchSlop = m2507constructorimpl2;
        mouseToTouchSlopRatio = m2507constructorimpl / m2507constructorimpl2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ca, code lost:
    
        if (androidx.compose.ui.input.pointer.PointerEventKt.positionChangedIgnoreConsumed(r11) != false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0067 -> B:10:0x006c). Please report as a decompilation issue!!! */
    /* renamed from: awaitDragOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m229awaitDragOrCancellationrnUCldI(AwaitPointerEventScope awaitPointerEventScope, long j, Continuation continuation) {
        DragGestureDetectorKt$awaitDragOrCancellation$1 dragGestureDetectorKt$awaitDragOrCancellation$1;
        int i;
        Ref$LongRef ref$LongRef;
        AwaitPointerEventScope awaitPointerEventScope2;
        Object awaitPointerEvent$default;
        Object obj;
        Object obj2;
        if (continuation instanceof DragGestureDetectorKt$awaitDragOrCancellation$1) {
            dragGestureDetectorKt$awaitDragOrCancellation$1 = (DragGestureDetectorKt$awaitDragOrCancellation$1) continuation;
            int i2 = dragGestureDetectorKt$awaitDragOrCancellation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitDragOrCancellation$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = dragGestureDetectorKt$awaitDragOrCancellation$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$awaitDragOrCancellation$1.label;
                if (i == 0) {
                    if (i == 1) {
                        Ref$LongRef ref$LongRef2 = (Ref$LongRef) dragGestureDetectorKt$awaitDragOrCancellation$1.L$1;
                        AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitDragOrCancellation$1.L$0;
                        ResultKt.throwOnFailure(obj3);
                        Ref$LongRef ref$LongRef3 = ref$LongRef2;
                        awaitPointerEventScope2 = awaitPointerEventScope3;
                        PointerEvent pointerEvent = (PointerEvent) obj3;
                        List changes = pointerEvent.getChanges();
                        int size = changes.size();
                        int i3 = 0;
                        int i4 = 0;
                        while (true) {
                            if (i4 < size) {
                                obj = null;
                                break;
                            }
                            obj = changes.get(i4);
                            if (PointerId.m1868equalsimpl0(((PointerInputChange) obj).getId(), ref$LongRef3.element)) {
                                break;
                            }
                            i4++;
                        }
                        PointerInputChange pointerInputChange = (PointerInputChange) obj;
                        if (pointerInputChange == null) {
                            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                                List changes2 = pointerEvent.getChanges();
                                int size2 = changes2.size();
                                while (true) {
                                    if (i3 >= size2) {
                                        obj2 = null;
                                        break;
                                    }
                                    obj2 = changes2.get(i3);
                                    if (((PointerInputChange) obj2).getPressed()) {
                                        break;
                                    }
                                    i3++;
                                }
                                PointerInputChange pointerInputChange2 = (PointerInputChange) obj2;
                                if (pointerInputChange2 != null) {
                                    ref$LongRef3.element = pointerInputChange2.getId();
                                    ref$LongRef = ref$LongRef3;
                                }
                            }
                            dragGestureDetectorKt$awaitDragOrCancellation$1.L$0 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitDragOrCancellation$1.L$1 = ref$LongRef;
                            dragGestureDetectorKt$awaitDragOrCancellation$1.label = 1;
                            awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitDragOrCancellation$1, 1, null);
                            if (awaitPointerEvent$default != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            Ref$LongRef ref$LongRef4 = ref$LongRef;
                            obj3 = awaitPointerEvent$default;
                            ref$LongRef3 = ref$LongRef4;
                            PointerEvent pointerEvent2 = (PointerEvent) obj3;
                            List changes3 = pointerEvent2.getChanges();
                            int size3 = changes3.size();
                            int i32 = 0;
                            int i42 = 0;
                            while (true) {
                                if (i42 < size3) {
                                }
                                i42++;
                            }
                            PointerInputChange pointerInputChange3 = (PointerInputChange) obj;
                            if (pointerInputChange3 == null) {
                                pointerInputChange3 = null;
                            }
                        }
                        if (pointerInputChange3 == null || pointerInputChange3.isConsumed()) {
                            return null;
                        }
                        return pointerInputChange3;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj3);
                if (m239isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                    return null;
                }
                ref$LongRef = new Ref$LongRef();
                ref$LongRef.element = j;
                awaitPointerEventScope2 = awaitPointerEventScope;
                dragGestureDetectorKt$awaitDragOrCancellation$1.L$0 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitDragOrCancellation$1.L$1 = ref$LongRef;
                dragGestureDetectorKt$awaitDragOrCancellation$1.label = 1;
                awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitDragOrCancellation$1, 1, null);
                if (awaitPointerEvent$default != coroutine_suspended) {
                }
            }
        }
        dragGestureDetectorKt$awaitDragOrCancellation$1 = new DragGestureDetectorKt$awaitDragOrCancellation$1(continuation);
        Object obj32 = dragGestureDetectorKt$awaitDragOrCancellation$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$awaitDragOrCancellation$1.label;
        if (i == 0) {
        }
    }

    public static final Object detectDragGestures(PointerInputScope pointerInputScope, Function1 function1, Function0 function0, Function0 function02, Function2 function2, Continuation continuation) {
        Object forEachGesture = ForEachGestureKt.forEachGesture(pointerInputScope, new DragGestureDetectorKt$detectDragGestures$5(function1, function2, function02, function0, null), continuation);
        return forEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? forEachGesture : Unit.INSTANCE;
    }

    public static final Object detectDragGesturesAfterLongPress(PointerInputScope pointerInputScope, Function1 function1, Function0 function0, Function0 function02, Function2 function2, Continuation continuation) {
        Object forEachGesture = ForEachGestureKt.forEachGesture(pointerInputScope, new DragGestureDetectorKt$detectDragGesturesAfterLongPress$5(function1, function02, function0, function2, null), continuation);
        return forEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? forEachGesture : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x011f -> B:14:0x012a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0160 -> B:11:0x0162). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0182 -> B:14:0x012a). Please report as a decompilation issue!!! */
    /* renamed from: awaitVerticalTouchSlopOrCancellation-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m236awaitVerticalTouchSlopOrCancellationjO51t88(AwaitPointerEventScope awaitPointerEventScope, long j, Function2 function2, Continuation continuation) {
        DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;
        int i;
        AwaitPointerEventScope awaitPointerEventScope2;
        Function2 function22;
        Ref$LongRef ref$LongRef;
        DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12;
        float f;
        float f2;
        Ref$LongRef ref$LongRef2;
        DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13;
        float f3;
        float f4;
        int size;
        int i2;
        Object obj;
        PointerInputChange pointerInputChange;
        Object obj2;
        Object awaitPointerEvent$default;
        if (continuation instanceof DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 = (DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1) continuation;
            int i3 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.label = i3 - Integer.MIN_VALUE;
                Object obj3 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.label;
                int i4 = 1;
                PointerEventPass pointerEventPass = null;
                if (i == 0) {
                    if (i == 1) {
                        float f5 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.F$1;
                        float f6 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.F$0;
                        Ref$LongRef ref$LongRef3 = (Ref$LongRef) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$2;
                        AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$1;
                        Function2 function23 = (Function2) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$0;
                        ResultKt.throwOnFailure(obj3);
                        DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$14 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;
                        f4 = f5;
                        awaitPointerEventScope2 = awaitPointerEventScope3;
                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$14;
                        f3 = f6;
                        function22 = function23;
                        ref$LongRef2 = ref$LongRef3;
                        PointerEvent pointerEvent = (PointerEvent) obj3;
                        List changes = pointerEvent.getChanges();
                        size = changes.size();
                        int i5 = 0;
                        i2 = 0;
                        while (true) {
                            if (i2 < size) {
                            }
                            i2++;
                        }
                        pointerInputChange = (PointerInputChange) obj;
                        if (pointerInputChange != null) {
                            if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                            }
                            i4 = 1;
                            pointerEventPass = null;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$0 = function22;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$2 = ref$LongRef;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$3 = pointerEventPass;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.F$0 = f;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.F$1 = f2;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.label = i4;
                            awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12, i4, pointerEventPass);
                            if (awaitPointerEvent$default != coroutine_suspended) {
                            }
                        }
                        return null;
                    }
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    float f7 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.F$1;
                    float f8 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.F$0;
                    PointerInputChange pointerInputChange2 = (PointerInputChange) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$3;
                    Ref$LongRef ref$LongRef4 = (Ref$LongRef) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$2;
                    AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$1;
                    Function2 function24 = (Function2) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$0;
                    ResultKt.throwOnFailure(obj3);
                    f2 = f7;
                    awaitPointerEventScope2 = awaitPointerEventScope4;
                    ref$LongRef2 = ref$LongRef4;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;
                    f = f8;
                    function22 = function24;
                    if (!pointerInputChange2.isConsumed()) {
                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13;
                        ref$LongRef = ref$LongRef2;
                        i4 = 1;
                        pointerEventPass = null;
                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$0 = function22;
                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$2 = ref$LongRef;
                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$3 = pointerEventPass;
                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.F$0 = f;
                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.F$1 = f2;
                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.label = i4;
                        awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12, i4, pointerEventPass);
                        if (awaitPointerEvent$default != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        float f9 = f;
                        f4 = f2;
                        obj3 = awaitPointerEvent$default;
                        ref$LongRef2 = ref$LongRef;
                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12;
                        f3 = f9;
                        PointerEvent pointerEvent2 = (PointerEvent) obj3;
                        List changes2 = pointerEvent2.getChanges();
                        size = changes2.size();
                        int i52 = 0;
                        i2 = 0;
                        while (true) {
                            if (i2 < size) {
                                obj = null;
                                break;
                            }
                            obj = changes2.get(i2);
                            if (PointerId.m1868equalsimpl0(((PointerInputChange) obj).getId(), ref$LongRef2.element)) {
                                break;
                            }
                            i2++;
                        }
                        pointerInputChange = (PointerInputChange) obj;
                        if (pointerInputChange != null && !pointerInputChange.isConsumed()) {
                            if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                                List changes3 = pointerEvent2.getChanges();
                                int size2 = changes3.size();
                                while (true) {
                                    if (i52 >= size2) {
                                        obj2 = null;
                                        break;
                                    }
                                    obj2 = changes3.get(i52);
                                    if (((PointerInputChange) obj2).getPressed()) {
                                        break;
                                    }
                                    i52++;
                                }
                                PointerInputChange pointerInputChange3 = (PointerInputChange) obj2;
                                if (pointerInputChange3 != null) {
                                    ref$LongRef2.element = pointerInputChange3.getId();
                                    f2 = f4;
                                    f = f3;
                                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13;
                                    ref$LongRef = ref$LongRef2;
                                }
                            } else {
                                f2 = (Offset.m1298getYimpl(pointerInputChange.getPosition()) - Offset.m1298getYimpl(pointerInputChange.getPreviousPosition())) + f4;
                                if (Math.abs(f2) < f3) {
                                    PointerEventPass pointerEventPass2 = PointerEventPass.Final;
                                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13.L$0 = function22;
                                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13.L$1 = awaitPointerEventScope2;
                                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13.L$2 = ref$LongRef2;
                                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13.L$3 = pointerInputChange;
                                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13.F$0 = f3;
                                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13.F$1 = f2;
                                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13.label = 2;
                                    if (awaitPointerEventScope2.awaitPointerEvent(pointerEventPass2, dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13) == coroutine_suspended) {
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
                                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13;
                                    ref$LongRef = ref$LongRef2;
                                    f2 = 0.0f;
                                }
                            }
                            i4 = 1;
                            pointerEventPass = null;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$0 = function22;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$2 = ref$LongRef;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$3 = pointerEventPass;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.F$0 = f;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.F$1 = f2;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.label = i4;
                            awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12, i4, pointerEventPass);
                            if (awaitPointerEvent$default != coroutine_suspended) {
                            }
                        }
                    }
                    return null;
                }
                ResultKt.throwOnFailure(obj3);
                int m1905getTouchT8wyACA = PointerType.INSTANCE.m1905getTouchT8wyACA();
                if (m239isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                    return null;
                }
                float m240pointerSlopE8SPZFQ = m240pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), m1905getTouchT8wyACA);
                Ref$LongRef ref$LongRef5 = new Ref$LongRef();
                ref$LongRef5.element = j;
                awaitPointerEventScope2 = awaitPointerEventScope;
                function22 = function2;
                ref$LongRef = ref$LongRef5;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;
                f = m240pointerSlopE8SPZFQ;
                f2 = 0.0f;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$0 = function22;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$2 = ref$LongRef;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$3 = pointerEventPass;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.F$0 = f;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.F$1 = f2;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.label = i4;
                awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12, i4, pointerEventPass);
                if (awaitPointerEvent$default != coroutine_suspended) {
                }
            }
        }
        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 = new DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1(continuation);
        Object obj32 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.label;
        int i42 = 1;
        PointerEventPass pointerEventPass3 = null;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x011b -> B:14:0x0126). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x015c -> B:11:0x015e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x017e -> B:14:0x0126). Please report as a decompilation issue!!! */
    /* renamed from: awaitVerticalPointerSlopOrCancellation-gDDlDlE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m235awaitVerticalPointerSlopOrCancellationgDDlDlE(AwaitPointerEventScope awaitPointerEventScope, long j, int i, Function2 function2, Continuation continuation) {
        DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;
        int i2;
        AwaitPointerEventScope awaitPointerEventScope2;
        Function2 function22;
        Ref$LongRef ref$LongRef;
        DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12;
        float f;
        float f2;
        Ref$LongRef ref$LongRef2;
        DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$13;
        float f3;
        float f4;
        int size;
        int i3;
        Object obj;
        PointerInputChange pointerInputChange;
        Object obj2;
        Object awaitPointerEvent$default;
        if (continuation instanceof DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 = (DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1) continuation;
            int i4 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label = i4 - Integer.MIN_VALUE;
                Object obj3 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label;
                int i5 = 1;
                PointerEventPass pointerEventPass = null;
                if (i2 == 0) {
                    if (i2 == 1) {
                        float f5 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$1;
                        float f6 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$0;
                        Ref$LongRef ref$LongRef3 = (Ref$LongRef) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$2;
                        AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$1;
                        Function2 function23 = (Function2) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$0;
                        ResultKt.throwOnFailure(obj3);
                        DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$14 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;
                        f4 = f5;
                        awaitPointerEventScope2 = awaitPointerEventScope3;
                        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$13 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$14;
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
                        pointerInputChange = (PointerInputChange) obj;
                        if (pointerInputChange != null) {
                            if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                            }
                            i5 = 1;
                            pointerEventPass = null;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$0 = function22;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$2 = ref$LongRef;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$3 = pointerEventPass;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.F$0 = f;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.F$1 = f2;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.label = i5;
                            awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12, i5, pointerEventPass);
                            if (awaitPointerEvent$default != coroutine_suspended) {
                            }
                        }
                        return null;
                    }
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    float f7 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$1;
                    float f8 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$0;
                    PointerInputChange pointerInputChange2 = (PointerInputChange) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$3;
                    Ref$LongRef ref$LongRef4 = (Ref$LongRef) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$2;
                    AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$1;
                    Function2 function24 = (Function2) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$0;
                    ResultKt.throwOnFailure(obj3);
                    f2 = f7;
                    awaitPointerEventScope2 = awaitPointerEventScope4;
                    ref$LongRef2 = ref$LongRef4;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$13 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;
                    f = f8;
                    function22 = function24;
                    if (!pointerInputChange2.isConsumed()) {
                        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$13;
                        ref$LongRef = ref$LongRef2;
                        i5 = 1;
                        pointerEventPass = null;
                        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$0 = function22;
                        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$2 = ref$LongRef;
                        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$3 = pointerEventPass;
                        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.F$0 = f;
                        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.F$1 = f2;
                        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.label = i5;
                        awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12, i5, pointerEventPass);
                        if (awaitPointerEvent$default != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        float f9 = f;
                        f4 = f2;
                        obj3 = awaitPointerEvent$default;
                        ref$LongRef2 = ref$LongRef;
                        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$13 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12;
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
                        pointerInputChange = (PointerInputChange) obj;
                        if (pointerInputChange != null && !pointerInputChange.isConsumed()) {
                            if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
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
                                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$13;
                                    ref$LongRef = ref$LongRef2;
                                }
                            } else {
                                f2 = (Offset.m1298getYimpl(pointerInputChange.getPosition()) - Offset.m1298getYimpl(pointerInputChange.getPreviousPosition())) + f4;
                                if (Math.abs(f2) < f3) {
                                    PointerEventPass pointerEventPass2 = PointerEventPass.Final;
                                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$13.L$0 = function22;
                                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$13.L$1 = awaitPointerEventScope2;
                                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$13.L$2 = ref$LongRef2;
                                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$13.L$3 = pointerInputChange;
                                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$13.F$0 = f3;
                                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$13.F$1 = f2;
                                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$13.label = 2;
                                    if (awaitPointerEventScope2.awaitPointerEvent(pointerEventPass2, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$13) == coroutine_suspended) {
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
                                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$13;
                                    ref$LongRef = ref$LongRef2;
                                    f2 = 0.0f;
                                }
                            }
                            i5 = 1;
                            pointerEventPass = null;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$0 = function22;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$2 = ref$LongRef;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$3 = pointerEventPass;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.F$0 = f;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.F$1 = f2;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.label = i5;
                            awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12, i5, pointerEventPass);
                            if (awaitPointerEvent$default != coroutine_suspended) {
                            }
                        }
                    }
                    return null;
                }
                ResultKt.throwOnFailure(obj3);
                if (m239isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                    return null;
                }
                float m240pointerSlopE8SPZFQ = m240pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i);
                Ref$LongRef ref$LongRef5 = new Ref$LongRef();
                ref$LongRef5.element = j;
                awaitPointerEventScope2 = awaitPointerEventScope;
                function22 = function2;
                ref$LongRef = ref$LongRef5;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;
                f = m240pointerSlopE8SPZFQ;
                f2 = 0.0f;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$0 = function22;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$2 = ref$LongRef;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$3 = pointerEventPass;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.F$0 = f;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.F$1 = f2;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.label = i5;
                awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12, i5, pointerEventPass);
                if (awaitPointerEvent$default != coroutine_suspended) {
                }
            }
        }
        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 = new DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1(continuation);
        Object obj32 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label;
        int i52 = 1;
        PointerEventPass pointerEventPass3 = null;
        if (i2 == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f5, code lost:
    
        if ((androidx.compose.ui.geometry.Offset.m1298getYimpl(androidx.compose.ui.input.pointer.PointerEventKt.positionChangeIgnoreConsumed(r13)) == 0.0f) == false) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x007e -> B:10:0x0083). Please report as a decompilation issue!!! */
    /* renamed from: verticalDrag-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m241verticalDragjO51t88(AwaitPointerEventScope awaitPointerEventScope, long j, Function1 function1, Continuation continuation) {
        DragGestureDetectorKt$verticalDrag$1 dragGestureDetectorKt$verticalDrag$1;
        int i;
        long j2;
        AwaitPointerEventScope awaitPointerEventScope2;
        DragGestureDetectorKt$verticalDrag$1 dragGestureDetectorKt$verticalDrag$12;
        Function1 function12;
        Ref$LongRef ref$LongRef;
        AwaitPointerEventScope awaitPointerEventScope3;
        Object awaitPointerEvent$default;
        AwaitPointerEventScope awaitPointerEventScope4;
        Object obj;
        Object obj2;
        if (continuation instanceof DragGestureDetectorKt$verticalDrag$1) {
            dragGestureDetectorKt$verticalDrag$1 = (DragGestureDetectorKt$verticalDrag$1) continuation;
            int i2 = dragGestureDetectorKt$verticalDrag$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$verticalDrag$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = dragGestureDetectorKt$verticalDrag$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$verticalDrag$1.label;
                int i3 = 1;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj3);
                    j2 = j;
                    if (m239isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j2)) {
                        return Boxing.boxBoolean(false);
                    }
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    dragGestureDetectorKt$verticalDrag$12 = dragGestureDetectorKt$verticalDrag$1;
                    function12 = function1;
                    ref$LongRef = new Ref$LongRef();
                    ref$LongRef.element = j2;
                    awaitPointerEventScope3 = awaitPointerEventScope2;
                    dragGestureDetectorKt$verticalDrag$12.L$0 = function12;
                    dragGestureDetectorKt$verticalDrag$12.L$1 = awaitPointerEventScope2;
                    dragGestureDetectorKt$verticalDrag$12.L$2 = awaitPointerEventScope3;
                    dragGestureDetectorKt$verticalDrag$12.L$3 = ref$LongRef;
                    dragGestureDetectorKt$verticalDrag$12.label = i3;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, null, dragGestureDetectorKt$verticalDrag$12, i3, null);
                    if (awaitPointerEvent$default == coroutine_suspended) {
                    }
                } else if (i == 1) {
                    Ref$LongRef ref$LongRef2 = (Ref$LongRef) dragGestureDetectorKt$verticalDrag$1.L$3;
                    awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$verticalDrag$1.L$2;
                    AwaitPointerEventScope awaitPointerEventScope5 = (AwaitPointerEventScope) dragGestureDetectorKt$verticalDrag$1.L$1;
                    Function1 function13 = (Function1) dragGestureDetectorKt$verticalDrag$1.L$0;
                    ResultKt.throwOnFailure(obj3);
                    dragGestureDetectorKt$verticalDrag$12 = dragGestureDetectorKt$verticalDrag$1;
                    function12 = function13;
                    ref$LongRef = ref$LongRef2;
                    PointerEvent pointerEvent = (PointerEvent) obj3;
                    List changes = pointerEvent.getChanges();
                    int size = changes.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 < size) {
                            awaitPointerEventScope4 = awaitPointerEventScope3;
                            obj = null;
                            break;
                        }
                        obj = changes.get(i4);
                        awaitPointerEventScope4 = awaitPointerEventScope3;
                        if (PointerId.m1868equalsimpl0(((PointerInputChange) obj).getId(), ref$LongRef.element)) {
                            break;
                        }
                        i4++;
                        awaitPointerEventScope3 = awaitPointerEventScope4;
                    }
                    PointerInputChange pointerInputChange = (PointerInputChange) obj;
                    if (pointerInputChange == null) {
                        if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                            List changes2 = pointerEvent.getChanges();
                            int size2 = changes2.size();
                            int i5 = 0;
                            while (true) {
                                if (i5 >= size2) {
                                    obj2 = null;
                                    break;
                                }
                                obj2 = changes2.get(i5);
                                if (((PointerInputChange) obj2).getPressed()) {
                                    break;
                                }
                                i5++;
                            }
                            PointerInputChange pointerInputChange2 = (PointerInputChange) obj2;
                            if (pointerInputChange2 != null) {
                                ref$LongRef.element = pointerInputChange2.getId();
                                awaitPointerEventScope3 = awaitPointerEventScope4;
                                i3 = 1;
                                awaitPointerEventScope2 = awaitPointerEventScope5;
                                dragGestureDetectorKt$verticalDrag$12.L$0 = function12;
                                dragGestureDetectorKt$verticalDrag$12.L$1 = awaitPointerEventScope2;
                                dragGestureDetectorKt$verticalDrag$12.L$2 = awaitPointerEventScope3;
                                dragGestureDetectorKt$verticalDrag$12.L$3 = ref$LongRef;
                                dragGestureDetectorKt$verticalDrag$12.label = i3;
                                awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, null, dragGestureDetectorKt$verticalDrag$12, i3, null);
                                if (awaitPointerEvent$default == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                awaitPointerEventScope5 = awaitPointerEventScope2;
                                obj3 = awaitPointerEvent$default;
                            }
                        }
                        PointerEvent pointerEvent2 = (PointerEvent) obj3;
                        List changes3 = pointerEvent2.getChanges();
                        int size3 = changes3.size();
                        int i42 = 0;
                        while (true) {
                            if (i42 < size3) {
                            }
                            i42++;
                            awaitPointerEventScope3 = awaitPointerEventScope4;
                        }
                        PointerInputChange pointerInputChange3 = (PointerInputChange) obj;
                        if (pointerInputChange3 == null) {
                            pointerInputChange3 = null;
                        }
                    }
                    if (pointerInputChange3 != null) {
                        if (pointerInputChange3.isConsumed()) {
                            return Boxing.boxBoolean(false);
                        }
                        if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                            return Boxing.boxBoolean(true);
                        }
                        function12.invoke(pointerInputChange3);
                        i3 = 1;
                        awaitPointerEventScope2 = awaitPointerEventScope5;
                        j2 = pointerInputChange3.getId();
                        ref$LongRef = new Ref$LongRef();
                        ref$LongRef.element = j2;
                        awaitPointerEventScope3 = awaitPointerEventScope2;
                        dragGestureDetectorKt$verticalDrag$12.L$0 = function12;
                        dragGestureDetectorKt$verticalDrag$12.L$1 = awaitPointerEventScope2;
                        dragGestureDetectorKt$verticalDrag$12.L$2 = awaitPointerEventScope3;
                        dragGestureDetectorKt$verticalDrag$12.L$3 = ref$LongRef;
                        dragGestureDetectorKt$verticalDrag$12.label = i3;
                        awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, null, dragGestureDetectorKt$verticalDrag$12, i3, null);
                        if (awaitPointerEvent$default == coroutine_suspended) {
                        }
                    } else {
                        return Boxing.boxBoolean(false);
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        dragGestureDetectorKt$verticalDrag$1 = new DragGestureDetectorKt$verticalDrag$1(continuation);
        Object obj32 = dragGestureDetectorKt$verticalDrag$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$verticalDrag$1.label;
        int i32 = 1;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d4, code lost:
    
        if ((androidx.compose.ui.geometry.Offset.m1298getYimpl(androidx.compose.ui.input.pointer.PointerEventKt.positionChangeIgnoreConsumed(r11)) == 0.0f ? 1 : 0) == 0) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0067 -> B:10:0x006c). Please report as a decompilation issue!!! */
    /* renamed from: awaitVerticalDragOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m234awaitVerticalDragOrCancellationrnUCldI(AwaitPointerEventScope awaitPointerEventScope, long j, Continuation continuation) {
        DragGestureDetectorKt$awaitVerticalDragOrCancellation$1 dragGestureDetectorKt$awaitVerticalDragOrCancellation$1;
        int i;
        Ref$LongRef ref$LongRef;
        AwaitPointerEventScope awaitPointerEventScope2;
        Object awaitPointerEvent$default;
        Object obj;
        Object obj2;
        if (continuation instanceof DragGestureDetectorKt$awaitVerticalDragOrCancellation$1) {
            dragGestureDetectorKt$awaitVerticalDragOrCancellation$1 = (DragGestureDetectorKt$awaitVerticalDragOrCancellation$1) continuation;
            int i2 = dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.label;
                if (i == 0) {
                    if (i == 1) {
                        Ref$LongRef ref$LongRef2 = (Ref$LongRef) dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.L$1;
                        AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.L$0;
                        ResultKt.throwOnFailure(obj3);
                        Ref$LongRef ref$LongRef3 = ref$LongRef2;
                        awaitPointerEventScope2 = awaitPointerEventScope3;
                        PointerEvent pointerEvent = (PointerEvent) obj3;
                        List changes = pointerEvent.getChanges();
                        int size = changes.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 < size) {
                                obj = null;
                                break;
                            }
                            obj = changes.get(i3);
                            if (PointerId.m1868equalsimpl0(((PointerInputChange) obj).getId(), ref$LongRef3.element)) {
                                break;
                            }
                            i3++;
                        }
                        PointerInputChange pointerInputChange = (PointerInputChange) obj;
                        if (pointerInputChange == null) {
                            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                                List changes2 = pointerEvent.getChanges();
                                int size2 = changes2.size();
                                while (true) {
                                    if (r9 >= size2) {
                                        obj2 = null;
                                        break;
                                    }
                                    obj2 = changes2.get(r9);
                                    if (((PointerInputChange) obj2).getPressed()) {
                                        break;
                                    }
                                    r9++;
                                }
                                PointerInputChange pointerInputChange2 = (PointerInputChange) obj2;
                                if (pointerInputChange2 != null) {
                                    ref$LongRef3.element = pointerInputChange2.getId();
                                    ref$LongRef = ref$LongRef3;
                                }
                            }
                            dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.L$0 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.L$1 = ref$LongRef;
                            dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.label = 1;
                            awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitVerticalDragOrCancellation$1, 1, null);
                            if (awaitPointerEvent$default != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            Ref$LongRef ref$LongRef4 = ref$LongRef;
                            obj3 = awaitPointerEvent$default;
                            ref$LongRef3 = ref$LongRef4;
                            PointerEvent pointerEvent2 = (PointerEvent) obj3;
                            List changes3 = pointerEvent2.getChanges();
                            int size3 = changes3.size();
                            int i32 = 0;
                            while (true) {
                                if (i32 < size3) {
                                }
                                i32++;
                            }
                            PointerInputChange pointerInputChange3 = (PointerInputChange) obj;
                            if (pointerInputChange3 == null) {
                                pointerInputChange3 = null;
                            }
                        }
                        if (pointerInputChange3 == null || pointerInputChange3.isConsumed()) {
                            return null;
                        }
                        return pointerInputChange3;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj3);
                if (m239isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                    return null;
                }
                ref$LongRef = new Ref$LongRef();
                ref$LongRef.element = j;
                awaitPointerEventScope2 = awaitPointerEventScope;
                dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.L$0 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.L$1 = ref$LongRef;
                dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.label = 1;
                awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitVerticalDragOrCancellation$1, 1, null);
                if (awaitPointerEvent$default != coroutine_suspended) {
                }
            }
        }
        dragGestureDetectorKt$awaitVerticalDragOrCancellation$1 = new DragGestureDetectorKt$awaitVerticalDragOrCancellation$1(continuation);
        Object obj32 = dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x011f -> B:14:0x012a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0160 -> B:11:0x0162). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0182 -> B:14:0x012a). Please report as a decompilation issue!!! */
    /* renamed from: awaitHorizontalTouchSlopOrCancellation-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m232awaitHorizontalTouchSlopOrCancellationjO51t88(AwaitPointerEventScope awaitPointerEventScope, long j, Function2 function2, Continuation continuation) {
        DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;
        int i;
        AwaitPointerEventScope awaitPointerEventScope2;
        Function2 function22;
        Ref$LongRef ref$LongRef;
        DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12;
        float f;
        float f2;
        Ref$LongRef ref$LongRef2;
        DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13;
        float f3;
        float f4;
        int size;
        int i2;
        Object obj;
        PointerInputChange pointerInputChange;
        Object obj2;
        Object awaitPointerEvent$default;
        if (continuation instanceof DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 = (DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1) continuation;
            int i3 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.label = i3 - Integer.MIN_VALUE;
                Object obj3 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.label;
                int i4 = 1;
                PointerEventPass pointerEventPass = null;
                if (i == 0) {
                    if (i == 1) {
                        float f5 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.F$1;
                        float f6 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.F$0;
                        Ref$LongRef ref$LongRef3 = (Ref$LongRef) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$2;
                        AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$1;
                        Function2 function23 = (Function2) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$0;
                        ResultKt.throwOnFailure(obj3);
                        DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$14 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;
                        f4 = f5;
                        awaitPointerEventScope2 = awaitPointerEventScope3;
                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$14;
                        f3 = f6;
                        function22 = function23;
                        ref$LongRef2 = ref$LongRef3;
                        PointerEvent pointerEvent = (PointerEvent) obj3;
                        List changes = pointerEvent.getChanges();
                        size = changes.size();
                        int i5 = 0;
                        i2 = 0;
                        while (true) {
                            if (i2 < size) {
                            }
                            i2++;
                        }
                        pointerInputChange = (PointerInputChange) obj;
                        if (pointerInputChange != null) {
                            if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                            }
                            i4 = 1;
                            pointerEventPass = null;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$0 = function22;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$2 = ref$LongRef;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$3 = pointerEventPass;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.F$0 = f;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.F$1 = f2;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.label = i4;
                            awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12, i4, pointerEventPass);
                            if (awaitPointerEvent$default != coroutine_suspended) {
                            }
                        }
                        return null;
                    }
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    float f7 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.F$1;
                    float f8 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.F$0;
                    PointerInputChange pointerInputChange2 = (PointerInputChange) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$3;
                    Ref$LongRef ref$LongRef4 = (Ref$LongRef) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$2;
                    AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$1;
                    Function2 function24 = (Function2) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$0;
                    ResultKt.throwOnFailure(obj3);
                    f2 = f7;
                    awaitPointerEventScope2 = awaitPointerEventScope4;
                    ref$LongRef2 = ref$LongRef4;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;
                    f = f8;
                    function22 = function24;
                    if (!pointerInputChange2.isConsumed()) {
                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13;
                        ref$LongRef = ref$LongRef2;
                        i4 = 1;
                        pointerEventPass = null;
                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$0 = function22;
                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$2 = ref$LongRef;
                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$3 = pointerEventPass;
                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.F$0 = f;
                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.F$1 = f2;
                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.label = i4;
                        awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12, i4, pointerEventPass);
                        if (awaitPointerEvent$default != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        float f9 = f;
                        f4 = f2;
                        obj3 = awaitPointerEvent$default;
                        ref$LongRef2 = ref$LongRef;
                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12;
                        f3 = f9;
                        PointerEvent pointerEvent2 = (PointerEvent) obj3;
                        List changes2 = pointerEvent2.getChanges();
                        size = changes2.size();
                        int i52 = 0;
                        i2 = 0;
                        while (true) {
                            if (i2 < size) {
                                obj = null;
                                break;
                            }
                            obj = changes2.get(i2);
                            if (PointerId.m1868equalsimpl0(((PointerInputChange) obj).getId(), ref$LongRef2.element)) {
                                break;
                            }
                            i2++;
                        }
                        pointerInputChange = (PointerInputChange) obj;
                        if (pointerInputChange != null && !pointerInputChange.isConsumed()) {
                            if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                                List changes3 = pointerEvent2.getChanges();
                                int size2 = changes3.size();
                                while (true) {
                                    if (i52 >= size2) {
                                        obj2 = null;
                                        break;
                                    }
                                    obj2 = changes3.get(i52);
                                    if (((PointerInputChange) obj2).getPressed()) {
                                        break;
                                    }
                                    i52++;
                                }
                                PointerInputChange pointerInputChange3 = (PointerInputChange) obj2;
                                if (pointerInputChange3 != null) {
                                    ref$LongRef2.element = pointerInputChange3.getId();
                                    f2 = f4;
                                    f = f3;
                                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13;
                                    ref$LongRef = ref$LongRef2;
                                }
                            } else {
                                f2 = (Offset.m1297getXimpl(pointerInputChange.getPosition()) - Offset.m1297getXimpl(pointerInputChange.getPreviousPosition())) + f4;
                                if (Math.abs(f2) < f3) {
                                    PointerEventPass pointerEventPass2 = PointerEventPass.Final;
                                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13.L$0 = function22;
                                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13.L$1 = awaitPointerEventScope2;
                                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13.L$2 = ref$LongRef2;
                                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13.L$3 = pointerInputChange;
                                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13.F$0 = f3;
                                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13.F$1 = f2;
                                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13.label = 2;
                                    if (awaitPointerEventScope2.awaitPointerEvent(pointerEventPass2, dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13) == coroutine_suspended) {
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
                                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13;
                                    ref$LongRef = ref$LongRef2;
                                    f2 = 0.0f;
                                }
                            }
                            i4 = 1;
                            pointerEventPass = null;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$0 = function22;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$2 = ref$LongRef;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$3 = pointerEventPass;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.F$0 = f;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.F$1 = f2;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.label = i4;
                            awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12, i4, pointerEventPass);
                            if (awaitPointerEvent$default != coroutine_suspended) {
                            }
                        }
                    }
                    return null;
                }
                ResultKt.throwOnFailure(obj3);
                int m1905getTouchT8wyACA = PointerType.INSTANCE.m1905getTouchT8wyACA();
                if (m239isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                    return null;
                }
                float m240pointerSlopE8SPZFQ = m240pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), m1905getTouchT8wyACA);
                Ref$LongRef ref$LongRef5 = new Ref$LongRef();
                ref$LongRef5.element = j;
                awaitPointerEventScope2 = awaitPointerEventScope;
                function22 = function2;
                ref$LongRef = ref$LongRef5;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;
                f = m240pointerSlopE8SPZFQ;
                f2 = 0.0f;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$0 = function22;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$2 = ref$LongRef;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$3 = pointerEventPass;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.F$0 = f;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.F$1 = f2;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.label = i4;
                awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12, i4, pointerEventPass);
                if (awaitPointerEvent$default != coroutine_suspended) {
                }
            }
        }
        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 = new DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1(continuation);
        Object obj32 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.label;
        int i42 = 1;
        PointerEventPass pointerEventPass3 = null;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x011b -> B:14:0x0126). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x015c -> B:11:0x015e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x017e -> B:14:0x0126). Please report as a decompilation issue!!! */
    /* renamed from: awaitHorizontalPointerSlopOrCancellation-gDDlDlE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m231awaitHorizontalPointerSlopOrCancellationgDDlDlE(AwaitPointerEventScope awaitPointerEventScope, long j, int i, Function2 function2, Continuation continuation) {
        DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;
        int i2;
        AwaitPointerEventScope awaitPointerEventScope2;
        Function2 function22;
        Ref$LongRef ref$LongRef;
        DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12;
        float f;
        float f2;
        Ref$LongRef ref$LongRef2;
        DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$13;
        float f3;
        float f4;
        int size;
        int i3;
        Object obj;
        PointerInputChange pointerInputChange;
        Object obj2;
        Object awaitPointerEvent$default;
        if (continuation instanceof DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 = (DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1) continuation;
            int i4 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label = i4 - Integer.MIN_VALUE;
                Object obj3 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label;
                int i5 = 1;
                PointerEventPass pointerEventPass = null;
                if (i2 == 0) {
                    if (i2 == 1) {
                        float f5 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$1;
                        float f6 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$0;
                        Ref$LongRef ref$LongRef3 = (Ref$LongRef) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$2;
                        AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$1;
                        Function2 function23 = (Function2) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$0;
                        ResultKt.throwOnFailure(obj3);
                        DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$14 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;
                        f4 = f5;
                        awaitPointerEventScope2 = awaitPointerEventScope3;
                        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$13 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$14;
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
                        pointerInputChange = (PointerInputChange) obj;
                        if (pointerInputChange != null) {
                            if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                            }
                            i5 = 1;
                            pointerEventPass = null;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$0 = function22;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$2 = ref$LongRef;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$3 = pointerEventPass;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.F$0 = f;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.F$1 = f2;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.label = i5;
                            awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12, i5, pointerEventPass);
                            if (awaitPointerEvent$default != coroutine_suspended) {
                            }
                        }
                        return null;
                    }
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    float f7 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$1;
                    float f8 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$0;
                    PointerInputChange pointerInputChange2 = (PointerInputChange) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$3;
                    Ref$LongRef ref$LongRef4 = (Ref$LongRef) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$2;
                    AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$1;
                    Function2 function24 = (Function2) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$0;
                    ResultKt.throwOnFailure(obj3);
                    f2 = f7;
                    awaitPointerEventScope2 = awaitPointerEventScope4;
                    ref$LongRef2 = ref$LongRef4;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$13 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;
                    f = f8;
                    function22 = function24;
                    if (!pointerInputChange2.isConsumed()) {
                        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$13;
                        ref$LongRef = ref$LongRef2;
                        i5 = 1;
                        pointerEventPass = null;
                        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$0 = function22;
                        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$2 = ref$LongRef;
                        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$3 = pointerEventPass;
                        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.F$0 = f;
                        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.F$1 = f2;
                        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.label = i5;
                        awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12, i5, pointerEventPass);
                        if (awaitPointerEvent$default != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        float f9 = f;
                        f4 = f2;
                        obj3 = awaitPointerEvent$default;
                        ref$LongRef2 = ref$LongRef;
                        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$13 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12;
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
                        pointerInputChange = (PointerInputChange) obj;
                        if (pointerInputChange != null && !pointerInputChange.isConsumed()) {
                            if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
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
                                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$13;
                                    ref$LongRef = ref$LongRef2;
                                }
                            } else {
                                f2 = (Offset.m1297getXimpl(pointerInputChange.getPosition()) - Offset.m1297getXimpl(pointerInputChange.getPreviousPosition())) + f4;
                                if (Math.abs(f2) < f3) {
                                    PointerEventPass pointerEventPass2 = PointerEventPass.Final;
                                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$13.L$0 = function22;
                                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$13.L$1 = awaitPointerEventScope2;
                                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$13.L$2 = ref$LongRef2;
                                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$13.L$3 = pointerInputChange;
                                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$13.F$0 = f3;
                                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$13.F$1 = f2;
                                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$13.label = 2;
                                    if (awaitPointerEventScope2.awaitPointerEvent(pointerEventPass2, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$13) == coroutine_suspended) {
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
                                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$13;
                                    ref$LongRef = ref$LongRef2;
                                    f2 = 0.0f;
                                }
                            }
                            i5 = 1;
                            pointerEventPass = null;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$0 = function22;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$2 = ref$LongRef;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$3 = pointerEventPass;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.F$0 = f;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.F$1 = f2;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.label = i5;
                            awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12, i5, pointerEventPass);
                            if (awaitPointerEvent$default != coroutine_suspended) {
                            }
                        }
                    }
                    return null;
                }
                ResultKt.throwOnFailure(obj3);
                if (m239isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                    return null;
                }
                float m240pointerSlopE8SPZFQ = m240pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i);
                Ref$LongRef ref$LongRef5 = new Ref$LongRef();
                ref$LongRef5.element = j;
                awaitPointerEventScope2 = awaitPointerEventScope;
                function22 = function2;
                ref$LongRef = ref$LongRef5;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;
                f = m240pointerSlopE8SPZFQ;
                f2 = 0.0f;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$0 = function22;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$2 = ref$LongRef;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$3 = pointerEventPass;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.F$0 = f;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.F$1 = f2;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.label = i5;
                awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12, i5, pointerEventPass);
                if (awaitPointerEvent$default != coroutine_suspended) {
                }
            }
        }
        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 = new DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1(continuation);
        Object obj32 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label;
        int i52 = 1;
        PointerEventPass pointerEventPass3 = null;
        if (i2 == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f5, code lost:
    
        if ((androidx.compose.ui.geometry.Offset.m1297getXimpl(androidx.compose.ui.input.pointer.PointerEventKt.positionChangeIgnoreConsumed(r13)) == 0.0f) == false) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x007e -> B:10:0x0083). Please report as a decompilation issue!!! */
    /* renamed from: horizontalDrag-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m238horizontalDragjO51t88(AwaitPointerEventScope awaitPointerEventScope, long j, Function1 function1, Continuation continuation) {
        DragGestureDetectorKt$horizontalDrag$1 dragGestureDetectorKt$horizontalDrag$1;
        int i;
        long j2;
        AwaitPointerEventScope awaitPointerEventScope2;
        DragGestureDetectorKt$horizontalDrag$1 dragGestureDetectorKt$horizontalDrag$12;
        Function1 function12;
        Ref$LongRef ref$LongRef;
        AwaitPointerEventScope awaitPointerEventScope3;
        Object awaitPointerEvent$default;
        AwaitPointerEventScope awaitPointerEventScope4;
        Object obj;
        Object obj2;
        if (continuation instanceof DragGestureDetectorKt$horizontalDrag$1) {
            dragGestureDetectorKt$horizontalDrag$1 = (DragGestureDetectorKt$horizontalDrag$1) continuation;
            int i2 = dragGestureDetectorKt$horizontalDrag$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$horizontalDrag$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = dragGestureDetectorKt$horizontalDrag$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$horizontalDrag$1.label;
                int i3 = 1;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj3);
                    j2 = j;
                    if (m239isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j2)) {
                        return Boxing.boxBoolean(false);
                    }
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    dragGestureDetectorKt$horizontalDrag$12 = dragGestureDetectorKt$horizontalDrag$1;
                    function12 = function1;
                    ref$LongRef = new Ref$LongRef();
                    ref$LongRef.element = j2;
                    awaitPointerEventScope3 = awaitPointerEventScope2;
                    dragGestureDetectorKt$horizontalDrag$12.L$0 = function12;
                    dragGestureDetectorKt$horizontalDrag$12.L$1 = awaitPointerEventScope2;
                    dragGestureDetectorKt$horizontalDrag$12.L$2 = awaitPointerEventScope3;
                    dragGestureDetectorKt$horizontalDrag$12.L$3 = ref$LongRef;
                    dragGestureDetectorKt$horizontalDrag$12.label = i3;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, null, dragGestureDetectorKt$horizontalDrag$12, i3, null);
                    if (awaitPointerEvent$default == coroutine_suspended) {
                    }
                } else if (i == 1) {
                    Ref$LongRef ref$LongRef2 = (Ref$LongRef) dragGestureDetectorKt$horizontalDrag$1.L$3;
                    awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$horizontalDrag$1.L$2;
                    AwaitPointerEventScope awaitPointerEventScope5 = (AwaitPointerEventScope) dragGestureDetectorKt$horizontalDrag$1.L$1;
                    Function1 function13 = (Function1) dragGestureDetectorKt$horizontalDrag$1.L$0;
                    ResultKt.throwOnFailure(obj3);
                    dragGestureDetectorKt$horizontalDrag$12 = dragGestureDetectorKt$horizontalDrag$1;
                    function12 = function13;
                    ref$LongRef = ref$LongRef2;
                    PointerEvent pointerEvent = (PointerEvent) obj3;
                    List changes = pointerEvent.getChanges();
                    int size = changes.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 < size) {
                            awaitPointerEventScope4 = awaitPointerEventScope3;
                            obj = null;
                            break;
                        }
                        obj = changes.get(i4);
                        awaitPointerEventScope4 = awaitPointerEventScope3;
                        if (PointerId.m1868equalsimpl0(((PointerInputChange) obj).getId(), ref$LongRef.element)) {
                            break;
                        }
                        i4++;
                        awaitPointerEventScope3 = awaitPointerEventScope4;
                    }
                    PointerInputChange pointerInputChange = (PointerInputChange) obj;
                    if (pointerInputChange == null) {
                        if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                            List changes2 = pointerEvent.getChanges();
                            int size2 = changes2.size();
                            int i5 = 0;
                            while (true) {
                                if (i5 >= size2) {
                                    obj2 = null;
                                    break;
                                }
                                obj2 = changes2.get(i5);
                                if (((PointerInputChange) obj2).getPressed()) {
                                    break;
                                }
                                i5++;
                            }
                            PointerInputChange pointerInputChange2 = (PointerInputChange) obj2;
                            if (pointerInputChange2 != null) {
                                ref$LongRef.element = pointerInputChange2.getId();
                                awaitPointerEventScope3 = awaitPointerEventScope4;
                                i3 = 1;
                                awaitPointerEventScope2 = awaitPointerEventScope5;
                                dragGestureDetectorKt$horizontalDrag$12.L$0 = function12;
                                dragGestureDetectorKt$horizontalDrag$12.L$1 = awaitPointerEventScope2;
                                dragGestureDetectorKt$horizontalDrag$12.L$2 = awaitPointerEventScope3;
                                dragGestureDetectorKt$horizontalDrag$12.L$3 = ref$LongRef;
                                dragGestureDetectorKt$horizontalDrag$12.label = i3;
                                awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, null, dragGestureDetectorKt$horizontalDrag$12, i3, null);
                                if (awaitPointerEvent$default == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                awaitPointerEventScope5 = awaitPointerEventScope2;
                                obj3 = awaitPointerEvent$default;
                            }
                        }
                        PointerEvent pointerEvent2 = (PointerEvent) obj3;
                        List changes3 = pointerEvent2.getChanges();
                        int size3 = changes3.size();
                        int i42 = 0;
                        while (true) {
                            if (i42 < size3) {
                            }
                            i42++;
                            awaitPointerEventScope3 = awaitPointerEventScope4;
                        }
                        PointerInputChange pointerInputChange3 = (PointerInputChange) obj;
                        if (pointerInputChange3 == null) {
                            pointerInputChange3 = null;
                        }
                    }
                    if (pointerInputChange3 != null) {
                        if (pointerInputChange3.isConsumed()) {
                            return Boxing.boxBoolean(false);
                        }
                        if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                            return Boxing.boxBoolean(true);
                        }
                        function12.invoke(pointerInputChange3);
                        i3 = 1;
                        awaitPointerEventScope2 = awaitPointerEventScope5;
                        j2 = pointerInputChange3.getId();
                        ref$LongRef = new Ref$LongRef();
                        ref$LongRef.element = j2;
                        awaitPointerEventScope3 = awaitPointerEventScope2;
                        dragGestureDetectorKt$horizontalDrag$12.L$0 = function12;
                        dragGestureDetectorKt$horizontalDrag$12.L$1 = awaitPointerEventScope2;
                        dragGestureDetectorKt$horizontalDrag$12.L$2 = awaitPointerEventScope3;
                        dragGestureDetectorKt$horizontalDrag$12.L$3 = ref$LongRef;
                        dragGestureDetectorKt$horizontalDrag$12.label = i3;
                        awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, null, dragGestureDetectorKt$horizontalDrag$12, i3, null);
                        if (awaitPointerEvent$default == coroutine_suspended) {
                        }
                    } else {
                        return Boxing.boxBoolean(false);
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        dragGestureDetectorKt$horizontalDrag$1 = new DragGestureDetectorKt$horizontalDrag$1(continuation);
        Object obj32 = dragGestureDetectorKt$horizontalDrag$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$horizontalDrag$1.label;
        int i32 = 1;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d4, code lost:
    
        if ((androidx.compose.ui.geometry.Offset.m1297getXimpl(androidx.compose.ui.input.pointer.PointerEventKt.positionChangeIgnoreConsumed(r11)) == 0.0f ? 1 : 0) == 0) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0067 -> B:10:0x006c). Please report as a decompilation issue!!! */
    /* renamed from: awaitHorizontalDragOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m230awaitHorizontalDragOrCancellationrnUCldI(AwaitPointerEventScope awaitPointerEventScope, long j, Continuation continuation) {
        DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1 dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1;
        int i;
        Ref$LongRef ref$LongRef;
        AwaitPointerEventScope awaitPointerEventScope2;
        Object awaitPointerEvent$default;
        Object obj;
        Object obj2;
        if (continuation instanceof DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1) {
            dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1 = (DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1) continuation;
            int i2 = dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.label;
                if (i == 0) {
                    if (i == 1) {
                        Ref$LongRef ref$LongRef2 = (Ref$LongRef) dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.L$1;
                        AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.L$0;
                        ResultKt.throwOnFailure(obj3);
                        Ref$LongRef ref$LongRef3 = ref$LongRef2;
                        awaitPointerEventScope2 = awaitPointerEventScope3;
                        PointerEvent pointerEvent = (PointerEvent) obj3;
                        List changes = pointerEvent.getChanges();
                        int size = changes.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 < size) {
                                obj = null;
                                break;
                            }
                            obj = changes.get(i3);
                            if (PointerId.m1868equalsimpl0(((PointerInputChange) obj).getId(), ref$LongRef3.element)) {
                                break;
                            }
                            i3++;
                        }
                        PointerInputChange pointerInputChange = (PointerInputChange) obj;
                        if (pointerInputChange == null) {
                            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                                List changes2 = pointerEvent.getChanges();
                                int size2 = changes2.size();
                                while (true) {
                                    if (r9 >= size2) {
                                        obj2 = null;
                                        break;
                                    }
                                    obj2 = changes2.get(r9);
                                    if (((PointerInputChange) obj2).getPressed()) {
                                        break;
                                    }
                                    r9++;
                                }
                                PointerInputChange pointerInputChange2 = (PointerInputChange) obj2;
                                if (pointerInputChange2 != null) {
                                    ref$LongRef3.element = pointerInputChange2.getId();
                                    ref$LongRef = ref$LongRef3;
                                }
                            }
                            dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.L$0 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.L$1 = ref$LongRef;
                            dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.label = 1;
                            awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1, 1, null);
                            if (awaitPointerEvent$default != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            Ref$LongRef ref$LongRef4 = ref$LongRef;
                            obj3 = awaitPointerEvent$default;
                            ref$LongRef3 = ref$LongRef4;
                            PointerEvent pointerEvent2 = (PointerEvent) obj3;
                            List changes3 = pointerEvent2.getChanges();
                            int size3 = changes3.size();
                            int i32 = 0;
                            while (true) {
                                if (i32 < size3) {
                                }
                                i32++;
                            }
                            PointerInputChange pointerInputChange3 = (PointerInputChange) obj;
                            if (pointerInputChange3 == null) {
                                pointerInputChange3 = null;
                            }
                        }
                        if (pointerInputChange3 == null || pointerInputChange3.isConsumed()) {
                            return null;
                        }
                        return pointerInputChange3;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj3);
                if (m239isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                    return null;
                }
                ref$LongRef = new Ref$LongRef();
                ref$LongRef.element = j;
                awaitPointerEventScope2 = awaitPointerEventScope;
                dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.L$0 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.L$1 = ref$LongRef;
                dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.label = 1;
                awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1, 1, null);
                if (awaitPointerEvent$default != coroutine_suspended) {
                }
            }
        }
        dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1 = new DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1(continuation);
        Object obj32 = dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.label;
        if (i == 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r9v0, types: [T, androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v4, types: [androidx.compose.ui.input.pointer.PointerInputChange] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object awaitLongPressOrCancellation(PointerInputScope pointerInputScope, PointerInputChange pointerInputChange, Continuation continuation) {
        DragGestureDetectorKt$awaitLongPressOrCancellation$1 dragGestureDetectorKt$awaitLongPressOrCancellation$1;
        int i;
        Ref$ObjectRef ref$ObjectRef;
        if (continuation instanceof DragGestureDetectorKt$awaitLongPressOrCancellation$1) {
            dragGestureDetectorKt$awaitLongPressOrCancellation$1 = (DragGestureDetectorKt$awaitLongPressOrCancellation$1) continuation;
            int i2 = dragGestureDetectorKt$awaitLongPressOrCancellation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitLongPressOrCancellation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dragGestureDetectorKt$awaitLongPressOrCancellation$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$awaitLongPressOrCancellation$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
                    ref$ObjectRef3.element = pointerInputChange;
                    long longPressTimeoutMillis = pointerInputScope.getViewConfiguration().getLongPressTimeoutMillis();
                    try {
                        DragGestureDetectorKt$awaitLongPressOrCancellation$2 dragGestureDetectorKt$awaitLongPressOrCancellation$2 = new DragGestureDetectorKt$awaitLongPressOrCancellation$2(pointerInputScope, ref$ObjectRef3, ref$ObjectRef2, null);
                        dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$0 = pointerInputChange;
                        dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$1 = ref$ObjectRef2;
                        dragGestureDetectorKt$awaitLongPressOrCancellation$1.label = 1;
                        if (TimeoutKt.withTimeout(longPressTimeoutMillis, dragGestureDetectorKt$awaitLongPressOrCancellation$2, dragGestureDetectorKt$awaitLongPressOrCancellation$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return null;
                    } catch (TimeoutCancellationException unused) {
                        ref$ObjectRef = ref$ObjectRef2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ref$ObjectRef = (Ref$ObjectRef) dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$1;
                    pointerInputChange = (PointerInputChange) dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        return null;
                    } catch (TimeoutCancellationException unused2) {
                    }
                }
                PointerInputChange pointerInputChange2 = (PointerInputChange) ref$ObjectRef.element;
                return pointerInputChange2 != null ? pointerInputChange : pointerInputChange2;
            }
        }
        dragGestureDetectorKt$awaitLongPressOrCancellation$1 = new DragGestureDetectorKt$awaitLongPressOrCancellation$1(continuation);
        Object obj2 = dragGestureDetectorKt$awaitLongPressOrCancellation$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$awaitLongPressOrCancellation$1.label;
        if (i != 0) {
        }
        PointerInputChange pointerInputChange22 = (PointerInputChange) ref$ObjectRef.element;
        if (pointerInputChange22 != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isPointerUp-DmW0f2w, reason: not valid java name */
    public static final boolean m239isPointerUpDmW0f2w(PointerEvent pointerEvent, long j) {
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
    public static final float m240pointerSlopE8SPZFQ(ViewConfiguration pointerSlop, int i) {
        Intrinsics.checkNotNullParameter(pointerSlop, "$this$pointerSlop");
        return PointerType.m1898equalsimpl0(i, PointerType.INSTANCE.m1903getMouseT8wyACA()) ? pointerSlop.getTouchSlop() * mouseToTouchSlopRatio : pointerSlop.getTouchSlop();
    }
}
