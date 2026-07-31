package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;

/* compiled from: DragGestureDetector.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aV\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000426\u0010\u0005\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0006H\u0086@¢\u0006\u0004\b\r\u0010\u000e\u001a0\u0010\u000f\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f0\u0012H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0080\u0001\u0010\u0018\u001a\u00020\f*\u00020\u00192\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\u00122\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u001c2\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u001c26\u0010\u0011\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\f0\u0006H\u0086@¢\u0006\u0002\u0010\u001f\u001aè\u0001\u0010\u0018\u001a\u00020\f*\u00020\u00192\b\u0010 \u001a\u0004\u0018\u00010!2M\b\u0002\u0010\u001a\u001aG\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(#\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b($\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\f0\"2#\b\u0002\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\f0\u00122\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u001c2\u000e\b\u0002\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00100\u001c26\u0010\u0011\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\f0\u0006H\u0086@¢\u0006\u0002\u0010'\u001a\u0080\u0001\u0010(\u001a\u00020\f*\u00020\u00192\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\u00122\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u001c2\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u001c26\u0010\u0011\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\f0\u0006H\u0086@¢\u0006\u0002\u0010\u001f\u001aV\u0010)\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000426\u0010\u0005\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110*¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0006H\u0086@¢\u0006\u0004\b+\u0010\u000e\u001a^\u0010,\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010-\u001a\u00020.26\u0010/\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110*¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0006H\u0086@¢\u0006\u0004\b0\u00101\u001a0\u00102\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f0\u0012H\u0086@¢\u0006\u0004\b3\u0010\u0014\u001a\u001e\u00104\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b5\u0010\u0017\u001a\u0080\u0001\u00106\u001a\u00020\f*\u00020\u00192\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\u00122\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u001c2\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u001c26\u00107\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110*¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\f0\u0006H\u0086@¢\u0006\u0002\u0010\u001f\u001aV\u00108\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000426\u0010\u0005\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110*¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0006H\u0086@¢\u0006\u0004\b9\u0010\u000e\u001a^\u0010:\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010-\u001a\u00020.26\u0010/\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110*¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0006H\u0086@¢\u0006\u0004\b;\u00101\u001a0\u0010<\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f0\u0012H\u0086@¢\u0006\u0004\b=\u0010\u0014\u001a\u001e\u0010>\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b?\u0010\u0017\u001a\u0080\u0001\u0010@\u001a\u00020\f*\u00020\u00192\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\u00122\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u001c2\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u001c26\u0010A\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110*¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\f0\u0006H\u0086@¢\u0006\u0002\u0010\u001f\u001aP\u0010\u000f\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f0\u00122\b\u0010B\u001a\u0004\u0018\u00010!2\u0012\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00100\u0012H\u0080H¢\u0006\u0004\bD\u0010E\u001a2\u0010F\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0012\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00100\u0012H\u0082H¢\u0006\u0004\bH\u0010\u0014\u001aT\u0010I\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010-\u001a\u00020.2\b\u0010B\u001a\u0004\u0018\u00010!2\b\b\u0002\u0010J\u001a\u00020\n2\u0018\u0010/\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\u0006H\u0080H¢\u0006\u0004\bK\u0010L\u001a$\u0010M\u001a\u00020\u0010*\u00020\u00022\u0006\u0010J\u001a\u00020\u00012\b\b\u0002\u0010N\u001a\u00020OH\u0080@¢\u0006\u0002\u0010P\u001a\u001e\u0010Q\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086@¢\u0006\u0004\bR\u0010\u0017\u001a\u001b\u0010S\u001a\u00020\u0010*\u00020T2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0004\bU\u0010V\u001a\u001b\u0010\\\u001a\u00020**\u00020]2\u0006\u0010-\u001a\u00020.H\u0000¢\u0006\u0004\b^\u0010_\"\u0010\u0010W\u001a\u00020XX\u0082\u0004¢\u0006\u0004\n\u0002\u0010Y\"\u0010\u0010Z\u001a\u00020XX\u0082\u0004¢\u0006\u0004\n\u0002\u0010Y\"\u000e\u0010[\u001a\u00020*X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006`"}, d2 = {"awaitTouchSlopOrCancellation", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "pointerId", "Landroidx/compose/ui/input/pointer/PointerId;", "onTouchSlopReached", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "change", "Landroidx/compose/ui/geometry/Offset;", "overSlop", "", "awaitTouchSlopOrCancellation-jO51t88", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "drag", "", "onDrag", "Lkotlin/Function1;", "drag-jO51t88", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitDragOrCancellation", "awaitDragOrCancellation-rnUCldI", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detectDragGestures", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "onDragStart", "onDragEnd", "Lkotlin/Function0;", "onDragCancel", "dragAmount", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "orientationLock", "Landroidx/compose/foundation/gestures/Orientation;", "Lkotlin/Function3;", "down", "slopTriggerChange", "overSlopOffset", "shouldAwaitTouchSlop", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/foundation/gestures/Orientation;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detectDragGesturesAfterLongPress", "awaitVerticalTouchSlopOrCancellation", "", "awaitVerticalTouchSlopOrCancellation-jO51t88", "awaitVerticalPointerSlopOrCancellation", "pointerType", "Landroidx/compose/ui/input/pointer/PointerType;", "onPointerSlopReached", "awaitVerticalPointerSlopOrCancellation-gDDlDlE", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verticalDrag", "verticalDrag-jO51t88", "awaitVerticalDragOrCancellation", "awaitVerticalDragOrCancellation-rnUCldI", "detectVerticalDragGestures", "onVerticalDrag", "awaitHorizontalTouchSlopOrCancellation", "awaitHorizontalTouchSlopOrCancellation-jO51t88", "awaitHorizontalPointerSlopOrCancellation", "awaitHorizontalPointerSlopOrCancellation-gDDlDlE", "horizontalDrag", "horizontalDrag-jO51t88", "awaitHorizontalDragOrCancellation", "awaitHorizontalDragOrCancellation-rnUCldI", "detectHorizontalDragGestures", "onHorizontalDrag", "orientation", "motionConsumed", "drag-VnAYq1g", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/jvm/functions/Function1;Landroidx/compose/foundation/gestures/Orientation;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitDragOrUp", "hasDragged", "awaitDragOrUp-jO51t88", "awaitPointerSlopOrCancellation", "initialPositionChange", "awaitPointerSlopOrCancellation-6ksA65w", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILandroidx/compose/foundation/gestures/Orientation;JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitAllPointersUpWithSlopDetection", "pass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerInputChange;Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitLongPressOrCancellation", "awaitLongPressOrCancellation-rnUCldI", "isPointerUp", "Landroidx/compose/ui/input/pointer/PointerEvent;", "isPointerUp-DmW0f2w", "(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z", "mouseSlop", "Landroidx/compose/ui/unit/Dp;", "F", "defaultTouchSlop", "mouseToTouchSlopRatio", "pointerSlop", "Landroidx/compose/ui/platform/ViewConfiguration;", "pointerSlop-E8SPZFQ", "(Landroidx/compose/ui/platform/ViewConfiguration;I)F", "foundation"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DragGestureDetectorKt {
    private static final float defaultTouchSlop;
    private static final float mouseSlop;
    private static final float mouseToTouchSlopRatio;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean detectDragGestures$lambda$5() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean detectDragGestures$lambda$9() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x018e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0182 -> B:11:0x0188). Please report as a decompilation issue!!! */
    /* renamed from: awaitTouchSlopOrCancellation-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m542awaitTouchSlopOrCancellationjO51t88(AwaitPointerEventScope awaitPointerEventScope, long j, Function2<? super PointerInputChange, ? super Offset, Unit> function2, Continuation<? super PointerInputChange> continuation) {
        DragGestureDetectorKt$awaitTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitTouchSlopOrCancellation$1;
        int i;
        float m551pointerSlopE8SPZFQ;
        Function2<? super PointerInputChange, ? super Offset, Unit> function22;
        Ref.LongRef longRef;
        DragGestureDetectorKt$awaitTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitTouchSlopOrCancellation$12;
        TouchSlopDetector touchSlopDetector;
        AwaitPointerEventScope awaitPointerEventScope2;
        float f;
        TouchSlopDetector touchSlopDetector2;
        int size;
        int i2;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        PointerInputChange pointerInputChange3;
        int i3;
        Object awaitPointerEvent$default;
        if (continuation instanceof DragGestureDetectorKt$awaitTouchSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$1 = (DragGestureDetectorKt$awaitTouchSlopOrCancellation$1) continuation;
            if ((dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.label -= Integer.MIN_VALUE;
                Object obj = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.label;
                int i4 = 1;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    int m6791getTouchT8wyACA = PointerType.INSTANCE.m6791getTouchT8wyACA();
                    long m5164getZeroF1C5BW0 = Offset.INSTANCE.m5164getZeroF1C5BW0();
                    if (m550isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                        return null;
                    }
                    m551pointerSlopE8SPZFQ = m551pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), m6791getTouchT8wyACA);
                    Ref.LongRef longRef2 = new Ref.LongRef();
                    longRef2.element = j;
                    TouchSlopDetector touchSlopDetector3 = new TouchSlopDetector(null, m5164getZeroF1C5BW0, null);
                    function22 = function2;
                    longRef = longRef2;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1;
                    touchSlopDetector = touchSlopDetector3;
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$0 = function22;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$2 = longRef;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$3 = touchSlopDetector;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$4 = null;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.F$0 = m551pointerSlopE8SPZFQ;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.label = i4;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitTouchSlopOrCancellation$12, i4, null);
                    if (awaitPointerEvent$default != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    float f2 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.F$0;
                    TouchSlopDetector touchSlopDetector4 = (TouchSlopDetector) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$3;
                    Ref.LongRef longRef3 = (Ref.LongRef) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$2;
                    AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$1;
                    Function2<? super PointerInputChange, ? super Offset, Unit> function23 = (Function2) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    f = f2;
                    touchSlopDetector2 = touchSlopDetector4;
                    awaitPointerEventScope2 = awaitPointerEventScope3;
                    function22 = function23;
                    longRef = longRef3;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1;
                    PointerEvent pointerEvent = (PointerEvent) obj;
                    List<PointerInputChange> changes = pointerEvent.getChanges();
                    size = changes.size();
                    i2 = 0;
                    while (true) {
                        if (i2 < size) {
                        }
                        i2 = i3 + 1;
                    }
                    pointerInputChange2 = pointerInputChange;
                    if (pointerInputChange2 != null) {
                        return null;
                    }
                    if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                    }
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$0 = function22;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$2 = longRef;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$3 = touchSlopDetector;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$4 = null;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.F$0 = m551pointerSlopE8SPZFQ;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.label = i4;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitTouchSlopOrCancellation$12, i4, null);
                    if (awaitPointerEvent$default != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                float f3 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.F$0;
                PointerInputChange pointerInputChange4 = (PointerInputChange) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$4;
                TouchSlopDetector touchSlopDetector5 = (TouchSlopDetector) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$3;
                longRef = (Ref.LongRef) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$2;
                AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$1;
                Function2<? super PointerInputChange, ? super Offset, Unit> function24 = (Function2) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$0;
                ResultKt.throwOnFailure(obj);
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1;
                touchSlopDetector = touchSlopDetector5;
                m551pointerSlopE8SPZFQ = f3;
                awaitPointerEventScope2 = awaitPointerEventScope4;
                int i5 = 1;
                char c = 2;
                if (!pointerInputChange4.isConsumed()) {
                    return null;
                }
                i4 = i5;
                function22 = function24;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$0 = function22;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$2 = longRef;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$3 = touchSlopDetector;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$4 = null;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.F$0 = m551pointerSlopE8SPZFQ;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.label = i4;
                awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitTouchSlopOrCancellation$12, i4, null);
                if (awaitPointerEvent$default != coroutine_suspended) {
                    f = m551pointerSlopE8SPZFQ;
                    touchSlopDetector2 = touchSlopDetector;
                    obj = awaitPointerEvent$default;
                    PointerEvent pointerEvent2 = (PointerEvent) obj;
                    List<PointerInputChange> changes2 = pointerEvent2.getChanges();
                    size = changes2.size();
                    i2 = 0;
                    while (true) {
                        if (i2 < size) {
                            pointerInputChange = null;
                            break;
                        }
                        pointerInputChange = changes2.get(i2);
                        i3 = i2;
                        if (PointerId.m6695equalsimpl0(pointerInputChange.getId(), longRef.element)) {
                            break;
                        }
                        i2 = i3 + 1;
                    }
                    pointerInputChange2 = pointerInputChange;
                    if (pointerInputChange2 != null || pointerInputChange2.isConsumed()) {
                        return null;
                    }
                    if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                        List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                        int size2 = changes3.size();
                        int i6 = 0;
                        while (true) {
                            if (i6 >= size2) {
                                pointerInputChange3 = null;
                                break;
                            }
                            pointerInputChange3 = changes3.get(i6);
                            if (pointerInputChange3.getPressed()) {
                                break;
                            }
                            i6++;
                        }
                        PointerInputChange pointerInputChange5 = pointerInputChange3;
                        if (pointerInputChange5 == null) {
                            return null;
                        }
                        longRef.element = pointerInputChange5.getId();
                        m551pointerSlopE8SPZFQ = f;
                        i4 = 1;
                        touchSlopDetector = touchSlopDetector2;
                    } else {
                        long m690addPositionsakrDWew = touchSlopDetector2.m690addPositionsakrDWew(pointerInputChange2.getPosition(), pointerInputChange2.getPreviousPosition(), f);
                        m551pointerSlopE8SPZFQ = f;
                        if ((9223372034707292159L & m690addPositionsakrDWew) != InlineClassHelperKt.UnspecifiedPackedFloats) {
                            function22.invoke(pointerInputChange2, Offset.m5137boximpl(m690addPositionsakrDWew));
                            if (pointerInputChange2.isConsumed()) {
                                return pointerInputChange2;
                            }
                            TouchSlopDetector.m689resetk4lQ0M$default(touchSlopDetector2, 0L, 1, null);
                            i4 = 1;
                            touchSlopDetector = touchSlopDetector2;
                        } else {
                            i5 = 1;
                            PointerEventPass pointerEventPass = PointerEventPass.Final;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$0 = function22;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$2 = longRef;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$3 = touchSlopDetector2;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$4 = pointerInputChange2;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.F$0 = m551pointerSlopE8SPZFQ;
                            c = 2;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.label = 2;
                            if (awaitPointerEventScope2.awaitPointerEvent(pointerEventPass, dragGestureDetectorKt$awaitTouchSlopOrCancellation$12) != coroutine_suspended) {
                                TouchSlopDetector touchSlopDetector6 = touchSlopDetector2;
                                function24 = function22;
                                pointerInputChange4 = pointerInputChange2;
                                touchSlopDetector = touchSlopDetector6;
                                if (!pointerInputChange4.isConsumed()) {
                                }
                            }
                        }
                    }
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$0 = function22;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$2 = longRef;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$3 = touchSlopDetector;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$4 = null;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.F$0 = m551pointerSlopE8SPZFQ;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.label = i4;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitTouchSlopOrCancellation$12, i4, null);
                    if (awaitPointerEvent$default != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
        }
        dragGestureDetectorKt$awaitTouchSlopOrCancellation$1 = new DragGestureDetectorKt$awaitTouchSlopOrCancellation$1(continuation);
        Object obj2 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.label;
        int i42 = 1;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x004a -> B:10:0x004d). Please report as a decompilation issue!!! */
    /* renamed from: drag-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m548dragjO51t88(AwaitPointerEventScope awaitPointerEventScope, long j, Function1<? super PointerInputChange, Unit> function1, Continuation<? super Boolean> continuation) {
        DragGestureDetectorKt$drag$1 dragGestureDetectorKt$drag$1;
        int i;
        PointerInputChange pointerInputChange;
        if (continuation instanceof DragGestureDetectorKt$drag$1) {
            dragGestureDetectorKt$drag$1 = (DragGestureDetectorKt$drag$1) continuation;
            if ((dragGestureDetectorKt$drag$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$drag$1.label -= Integer.MIN_VALUE;
                Object obj = dragGestureDetectorKt$drag$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$drag$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    dragGestureDetectorKt$drag$1.L$0 = awaitPointerEventScope;
                    dragGestureDetectorKt$drag$1.L$1 = function1;
                    dragGestureDetectorKt$drag$1.label = 1;
                    obj = m533awaitDragOrCancellationrnUCldI(awaitPointerEventScope, j, dragGestureDetectorKt$drag$1);
                    if (obj == coroutine_suspended) {
                    }
                    pointerInputChange = (PointerInputChange) obj;
                    if (pointerInputChange == null) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Function1<? super PointerInputChange, Unit> function12 = (Function1) dragGestureDetectorKt$drag$1.L$1;
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
                        obj = m533awaitDragOrCancellationrnUCldI(awaitPointerEventScope, j, dragGestureDetectorKt$drag$1);
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

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d2, code lost:
    
        if (androidx.compose.ui.input.pointer.PointerEventKt.positionChangedIgnoreConsumed(r11) != false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0069 -> B:10:0x006e). Please report as a decompilation issue!!! */
    /* renamed from: awaitDragOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m533awaitDragOrCancellationrnUCldI(AwaitPointerEventScope awaitPointerEventScope, long j, Continuation<? super PointerInputChange> continuation) {
        DragGestureDetectorKt$awaitDragOrCancellation$1 dragGestureDetectorKt$awaitDragOrCancellation$1;
        int i;
        Ref.LongRef longRef;
        AwaitPointerEventScope awaitPointerEventScope2;
        Object awaitPointerEvent$default;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        if (continuation instanceof DragGestureDetectorKt$awaitDragOrCancellation$1) {
            dragGestureDetectorKt$awaitDragOrCancellation$1 = (DragGestureDetectorKt$awaitDragOrCancellation$1) continuation;
            if ((dragGestureDetectorKt$awaitDragOrCancellation$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitDragOrCancellation$1.label -= Integer.MIN_VALUE;
                Object obj = dragGestureDetectorKt$awaitDragOrCancellation$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$awaitDragOrCancellation$1.label;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Ref.LongRef longRef2 = (Ref.LongRef) dragGestureDetectorKt$awaitDragOrCancellation$1.L$1;
                    AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitDragOrCancellation$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    Ref.LongRef longRef3 = longRef2;
                    awaitPointerEventScope2 = awaitPointerEventScope3;
                    PointerEvent pointerEvent = (PointerEvent) obj;
                    List<PointerInputChange> changes = pointerEvent.getChanges();
                    int size = changes.size();
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        if (i3 < size) {
                            pointerInputChange = null;
                            break;
                        }
                        pointerInputChange = changes.get(i3);
                        if (PointerId.m6695equalsimpl0(pointerInputChange.getId(), longRef3.element)) {
                            break;
                        }
                        i3++;
                    }
                    PointerInputChange pointerInputChange3 = pointerInputChange;
                    if (pointerInputChange3 == null) {
                        if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                            List<PointerInputChange> changes2 = pointerEvent.getChanges();
                            int size2 = changes2.size();
                            while (true) {
                                if (i2 >= size2) {
                                    pointerInputChange2 = null;
                                    break;
                                }
                                pointerInputChange2 = changes2.get(i2);
                                if (pointerInputChange2.getPressed()) {
                                    break;
                                }
                                i2++;
                            }
                            PointerInputChange pointerInputChange4 = pointerInputChange2;
                            if (pointerInputChange4 != null) {
                                longRef3.element = pointerInputChange4.getId();
                                longRef = longRef3;
                            }
                        }
                        dragGestureDetectorKt$awaitDragOrCancellation$1.L$0 = awaitPointerEventScope2;
                        dragGestureDetectorKt$awaitDragOrCancellation$1.L$1 = longRef;
                        dragGestureDetectorKt$awaitDragOrCancellation$1.label = 1;
                        awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitDragOrCancellation$1, 1, null);
                        if (awaitPointerEvent$default != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Ref.LongRef longRef4 = longRef;
                        obj = awaitPointerEvent$default;
                        longRef3 = longRef4;
                        PointerEvent pointerEvent2 = (PointerEvent) obj;
                        List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                        int size3 = changes3.size();
                        int i22 = 0;
                        int i32 = 0;
                        while (true) {
                            if (i32 < size3) {
                            }
                            i32++;
                        }
                        PointerInputChange pointerInputChange32 = pointerInputChange;
                        if (pointerInputChange32 == null) {
                            pointerInputChange32 = null;
                        }
                    }
                    if (pointerInputChange32 == null || pointerInputChange32.isConsumed()) {
                        return null;
                    }
                    return pointerInputChange32;
                }
                ResultKt.throwOnFailure(obj);
                if (m550isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                    return null;
                }
                longRef = new Ref.LongRef();
                longRef.element = j;
                awaitPointerEventScope2 = awaitPointerEventScope;
                dragGestureDetectorKt$awaitDragOrCancellation$1.L$0 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitDragOrCancellation$1.L$1 = longRef;
                dragGestureDetectorKt$awaitDragOrCancellation$1.label = 1;
                awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitDragOrCancellation$1, 1, null);
                if (awaitPointerEvent$default != coroutine_suspended) {
                }
            }
        }
        dragGestureDetectorKt$awaitDragOrCancellation$1 = new DragGestureDetectorKt$awaitDragOrCancellation$1(continuation);
        Object obj2 = dragGestureDetectorKt$awaitDragOrCancellation$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$awaitDragOrCancellation$1.label;
        if (i == 0) {
        }
    }

    public static /* synthetic */ Object detectDragGestures$default(PointerInputScope pointerInputScope, Function1 function1, Function0 function0, Function0 function02, Function2 function2, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit detectDragGestures$lambda$0;
                    detectDragGestures$lambda$0 = DragGestureDetectorKt.detectDragGestures$lambda$0((Offset) obj2);
                    return detectDragGestures$lambda$0;
                }
            };
        }
        if ((i & 2) != 0) {
            function0 = new Function0() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            };
        }
        if ((i & 4) != 0) {
            function02 = new Function0() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            };
        }
        Function0 function03 = function02;
        return detectDragGestures(pointerInputScope, function1, function0, function03, function2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit detectDragGestures$lambda$0(Offset offset) {
        return Unit.INSTANCE;
    }

    public static final Object detectDragGestures(PointerInputScope pointerInputScope, final Function1<? super Offset, Unit> function1, final Function0<Unit> function0, Function0<Unit> function02, Function2<? super PointerInputChange, ? super Offset, Unit> function2, Continuation<? super Unit> continuation) {
        Object detectDragGestures = detectDragGestures(pointerInputScope, null, new Function3() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Unit detectDragGestures$lambda$3;
                detectDragGestures$lambda$3 = DragGestureDetectorKt.detectDragGestures$lambda$3(Function1.this, (PointerInputChange) obj, (PointerInputChange) obj2, (Offset) obj3);
                return detectDragGestures$lambda$3;
            }
        }, new Function1() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit detectDragGestures$lambda$4;
                detectDragGestures$lambda$4 = DragGestureDetectorKt.detectDragGestures$lambda$4(Function0.this, (PointerInputChange) obj);
                return detectDragGestures$lambda$4;
            }
        }, function02, new Function0() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean detectDragGestures$lambda$5;
                detectDragGestures$lambda$5 = DragGestureDetectorKt.detectDragGestures$lambda$5();
                return Boolean.valueOf(detectDragGestures$lambda$5);
            }
        }, function2, continuation);
        return detectDragGestures == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? detectDragGestures : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit detectDragGestures$lambda$3(Function1 function1, PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2, Offset offset) {
        function1.invoke(Offset.m5137boximpl(pointerInputChange2.getPosition()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit detectDragGestures$lambda$4(Function0 function0, PointerInputChange pointerInputChange) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object detectDragGestures$default(PointerInputScope pointerInputScope, Orientation orientation, Function3 function3, Function1 function1, Function0 function0, Function0 function02, Function2 function2, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function3 = new Function3() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    Unit detectDragGestures$lambda$6;
                    detectDragGestures$lambda$6 = DragGestureDetectorKt.detectDragGestures$lambda$6((PointerInputChange) obj2, (PointerInputChange) obj3, (Offset) obj4);
                    return detectDragGestures$lambda$6;
                }
            };
        }
        Function3 function32 = function3;
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit detectDragGestures$lambda$7;
                    detectDragGestures$lambda$7 = DragGestureDetectorKt.detectDragGestures$lambda$7((PointerInputChange) obj2);
                    return detectDragGestures$lambda$7;
                }
            };
        }
        Function1 function12 = function1;
        if ((i & 8) != 0) {
            function0 = new Function0() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            };
        }
        Function0 function03 = function0;
        if ((i & 16) != 0) {
            function02 = new Function0() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    boolean detectDragGestures$lambda$9;
                    detectDragGestures$lambda$9 = DragGestureDetectorKt.detectDragGestures$lambda$9();
                    return Boolean.valueOf(detectDragGestures$lambda$9);
                }
            };
        }
        return detectDragGestures(pointerInputScope, orientation, function32, function12, function03, function02, function2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit detectDragGestures$lambda$6(PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2, Offset offset) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit detectDragGestures$lambda$7(PointerInputChange pointerInputChange) {
        return Unit.INSTANCE;
    }

    public static final Object detectDragGestures(PointerInputScope pointerInputScope, Orientation orientation, Function3<? super PointerInputChange, ? super PointerInputChange, ? super Offset, Unit> function3, Function1<? super PointerInputChange, Unit> function1, Function0<Unit> function0, Function0<Boolean> function02, Function2<? super PointerInputChange, ? super Offset, Unit> function2, Continuation<? super Unit> continuation) {
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new DragGestureDetectorKt$detectDragGestures$13(function02, new Ref.LongRef(), orientation, function3, function2, function0, function1, null), continuation);
        return awaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitEachGesture : Unit.INSTANCE;
    }

    public static /* synthetic */ Object detectDragGesturesAfterLongPress$default(PointerInputScope pointerInputScope, Function1 function1, Function0 function0, Function0 function02, Function2 function2, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit detectDragGesturesAfterLongPress$lambda$0;
                    detectDragGesturesAfterLongPress$lambda$0 = DragGestureDetectorKt.detectDragGesturesAfterLongPress$lambda$0((Offset) obj2);
                    return detectDragGesturesAfterLongPress$lambda$0;
                }
            };
        }
        if ((i & 2) != 0) {
            function0 = new Function0() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            };
        }
        if ((i & 4) != 0) {
            function02 = new Function0() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            };
        }
        Function0 function03 = function02;
        return detectDragGesturesAfterLongPress(pointerInputScope, function1, function0, function03, function2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit detectDragGesturesAfterLongPress$lambda$0(Offset offset) {
        return Unit.INSTANCE;
    }

    public static final Object detectDragGesturesAfterLongPress(PointerInputScope pointerInputScope, Function1<? super Offset, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function2<? super PointerInputChange, ? super Offset, Unit> function2, Continuation<? super Unit> continuation) {
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new DragGestureDetectorKt$detectDragGesturesAfterLongPress$5(function1, function0, function02, function2, null), continuation);
        return awaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitEachGesture : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x01a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x019b -> B:11:0x019f). Please report as a decompilation issue!!! */
    /* renamed from: awaitVerticalTouchSlopOrCancellation-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m545awaitVerticalTouchSlopOrCancellationjO51t88(AwaitPointerEventScope awaitPointerEventScope, long j, Function2<? super PointerInputChange, ? super Float, Unit> function2, Continuation<? super PointerInputChange> continuation) {
        DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;
        int i;
        float m551pointerSlopE8SPZFQ;
        Ref.LongRef longRef;
        Function2<? super PointerInputChange, ? super Float, Unit> function22;
        DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12;
        TouchSlopDetector touchSlopDetector;
        AwaitPointerEventScope awaitPointerEventScope2;
        float f;
        TouchSlopDetector touchSlopDetector2;
        int size;
        int i2;
        PointerEventPass pointerEventPass;
        Object obj;
        PointerInputChange pointerInputChange;
        Object obj2;
        int i3;
        Object awaitPointerEvent$default;
        if (continuation instanceof DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 = (DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1) continuation;
            if ((dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.label -= Integer.MIN_VALUE;
                Object obj3 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.label;
                int i4 = 1;
                PointerEventPass pointerEventPass2 = null;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj3);
                    int m6791getTouchT8wyACA = PointerType.INSTANCE.m6791getTouchT8wyACA();
                    Orientation orientation = Orientation.Vertical;
                    long m5164getZeroF1C5BW0 = Offset.INSTANCE.m5164getZeroF1C5BW0();
                    if (m550isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                        return null;
                    }
                    m551pointerSlopE8SPZFQ = m551pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), m6791getTouchT8wyACA);
                    longRef = new Ref.LongRef();
                    longRef.element = j;
                    TouchSlopDetector touchSlopDetector3 = new TouchSlopDetector(orientation, m5164getZeroF1C5BW0, null);
                    function22 = function2;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;
                    touchSlopDetector = touchSlopDetector3;
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$0 = function22;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$2 = longRef;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$3 = touchSlopDetector;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$4 = pointerEventPass2;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.F$0 = m551pointerSlopE8SPZFQ;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.label = i4;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12, i4, pointerEventPass2);
                    if (awaitPointerEvent$default != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    float f2 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.F$0;
                    TouchSlopDetector touchSlopDetector4 = (TouchSlopDetector) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$3;
                    Ref.LongRef longRef2 = (Ref.LongRef) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$2;
                    AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$1;
                    Function2<? super PointerInputChange, ? super Float, Unit> function23 = (Function2) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$0;
                    ResultKt.throwOnFailure(obj3);
                    f = f2;
                    touchSlopDetector2 = touchSlopDetector4;
                    longRef = longRef2;
                    awaitPointerEventScope2 = awaitPointerEventScope3;
                    function22 = function23;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;
                    PointerEvent pointerEvent = (PointerEvent) obj3;
                    List<PointerInputChange> changes = pointerEvent.getChanges();
                    size = changes.size();
                    int i5 = 0;
                    i2 = 0;
                    while (true) {
                        if (i2 < size) {
                        }
                        i2++;
                        size = i3;
                        pointerEventPass2 = pointerEventPass;
                    }
                    pointerInputChange = (PointerInputChange) obj;
                    if (pointerInputChange != null) {
                        return pointerEventPass;
                    }
                    if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                    }
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$0 = function22;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$2 = longRef;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$3 = touchSlopDetector;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$4 = pointerEventPass2;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.F$0 = m551pointerSlopE8SPZFQ;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.label = i4;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12, i4, pointerEventPass2);
                    if (awaitPointerEvent$default != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                float f3 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.F$0;
                PointerInputChange pointerInputChange2 = (PointerInputChange) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$4;
                TouchSlopDetector touchSlopDetector5 = (TouchSlopDetector) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$3;
                Ref.LongRef longRef3 = (Ref.LongRef) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$2;
                AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$1;
                Function2<? super PointerInputChange, ? super Float, Unit> function24 = (Function2) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$0;
                ResultKt.throwOnFailure(obj3);
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;
                touchSlopDetector = touchSlopDetector5;
                m551pointerSlopE8SPZFQ = f3;
                int i6 = 1;
                awaitPointerEventScope2 = awaitPointerEventScope4;
                char c = 2;
                if (!pointerInputChange2.isConsumed()) {
                    return null;
                }
                i4 = i6;
                function22 = function24;
                pointerEventPass2 = null;
                longRef = longRef3;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$0 = function22;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$2 = longRef;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$3 = touchSlopDetector;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$4 = pointerEventPass2;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.F$0 = m551pointerSlopE8SPZFQ;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.label = i4;
                awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12, i4, pointerEventPass2);
                if (awaitPointerEvent$default != coroutine_suspended) {
                    f = m551pointerSlopE8SPZFQ;
                    touchSlopDetector2 = touchSlopDetector;
                    obj3 = awaitPointerEvent$default;
                    PointerEvent pointerEvent2 = (PointerEvent) obj3;
                    List<PointerInputChange> changes2 = pointerEvent2.getChanges();
                    size = changes2.size();
                    int i52 = 0;
                    i2 = 0;
                    while (true) {
                        if (i2 < size) {
                            pointerEventPass = pointerEventPass2;
                            obj = pointerEventPass;
                            break;
                        }
                        obj = changes2.get(i2);
                        pointerEventPass = pointerEventPass2;
                        i3 = size;
                        if (PointerId.m6695equalsimpl0(((PointerInputChange) obj).getId(), longRef.element)) {
                            break;
                        }
                        i2++;
                        size = i3;
                        pointerEventPass2 = pointerEventPass;
                    }
                    pointerInputChange = (PointerInputChange) obj;
                    if (pointerInputChange != null || pointerInputChange.isConsumed()) {
                        return pointerEventPass;
                    }
                    if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                        List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                        int size2 = changes3.size();
                        while (true) {
                            if (i52 >= size2) {
                                obj2 = pointerEventPass;
                                break;
                            }
                            obj2 = changes3.get(i52);
                            if (((PointerInputChange) obj2).getPressed()) {
                                break;
                            }
                            i52++;
                        }
                        PointerInputChange pointerInputChange3 = (PointerInputChange) obj2;
                        if (pointerInputChange3 == null) {
                            return pointerEventPass;
                        }
                        longRef.element = pointerInputChange3.getId();
                        m551pointerSlopE8SPZFQ = f;
                        i4 = 1;
                        touchSlopDetector = touchSlopDetector2;
                        pointerEventPass2 = null;
                    } else {
                        long m690addPositionsakrDWew = touchSlopDetector2.m690addPositionsakrDWew(pointerInputChange.getPosition(), pointerInputChange.getPreviousPosition(), f);
                        m551pointerSlopE8SPZFQ = f;
                        if ((9223372034707292159L & m690addPositionsakrDWew) != InlineClassHelperKt.UnspecifiedPackedFloats) {
                            function22.invoke(pointerInputChange, Boxing.boxFloat(Float.intBitsToFloat((int) (m690addPositionsakrDWew & 4294967295L))));
                            if (pointerInputChange.isConsumed()) {
                                return pointerInputChange;
                            }
                            TouchSlopDetector.m689resetk4lQ0M$default(touchSlopDetector2, 0L, 1, pointerEventPass);
                            i4 = 1;
                            touchSlopDetector = touchSlopDetector2;
                            pointerEventPass2 = null;
                        } else {
                            i6 = 1;
                            PointerEventPass pointerEventPass3 = PointerEventPass.Final;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$0 = function22;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$2 = longRef;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$3 = touchSlopDetector2;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$4 = pointerInputChange;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.F$0 = m551pointerSlopE8SPZFQ;
                            c = 2;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.label = 2;
                            if (awaitPointerEventScope2.awaitPointerEvent(pointerEventPass3, dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12) != coroutine_suspended) {
                                longRef3 = longRef;
                                function24 = function22;
                                pointerInputChange2 = pointerInputChange;
                                touchSlopDetector = touchSlopDetector2;
                                if (!pointerInputChange2.isConsumed()) {
                                }
                            }
                        }
                    }
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$0 = function22;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$2 = longRef;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$3 = touchSlopDetector;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$4 = pointerEventPass2;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.F$0 = m551pointerSlopE8SPZFQ;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.label = i4;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12, i4, pointerEventPass2);
                    if (awaitPointerEvent$default != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
        }
        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 = new DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1(continuation);
        Object obj32 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.label;
        int i42 = 1;
        PointerEventPass pointerEventPass22 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0197 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0190 -> B:11:0x0191). Please report as a decompilation issue!!! */
    /* renamed from: awaitVerticalPointerSlopOrCancellation-gDDlDlE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m544awaitVerticalPointerSlopOrCancellationgDDlDlE(AwaitPointerEventScope awaitPointerEventScope, long j, int i, Function2<? super PointerInputChange, ? super Float, Unit> function2, Continuation<? super PointerInputChange> continuation) {
        DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;
        int i2;
        float m551pointerSlopE8SPZFQ;
        Ref.LongRef longRef;
        Function2<? super PointerInputChange, ? super Float, Unit> function22;
        TouchSlopDetector touchSlopDetector;
        AwaitPointerEventScope awaitPointerEventScope2;
        Function2<? super PointerInputChange, ? super Float, Unit> function23;
        AwaitPointerEventScope awaitPointerEventScope3;
        TouchSlopDetector touchSlopDetector2;
        float f;
        int size;
        int i3;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        PointerInputChange pointerInputChange3;
        int i4;
        Object awaitPointerEvent$default;
        if (continuation instanceof DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 = (DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1) continuation;
            if ((dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label -= Integer.MIN_VALUE;
                Object obj = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label;
                int i5 = 1;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Orientation orientation = Orientation.Vertical;
                    long m5164getZeroF1C5BW0 = Offset.INSTANCE.m5164getZeroF1C5BW0();
                    if (m550isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                        return null;
                    }
                    m551pointerSlopE8SPZFQ = m551pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i);
                    longRef = new Ref.LongRef();
                    longRef.element = j;
                    function22 = function2;
                    touchSlopDetector = new TouchSlopDetector(orientation, m5164getZeroF1C5BW0, null);
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$0 = function22;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$1 = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$2 = longRef;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$3 = touchSlopDetector;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$4 = null;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$0 = m551pointerSlopE8SPZFQ;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label = i5;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1, i5, null);
                    if (awaitPointerEvent$default != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i2 == 1) {
                    f = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$0;
                    touchSlopDetector2 = (TouchSlopDetector) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$3;
                    Ref.LongRef longRef2 = (Ref.LongRef) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$2;
                    awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$1;
                    function23 = (Function2) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    longRef = longRef2;
                    PointerEvent pointerEvent = (PointerEvent) obj;
                    List<PointerInputChange> changes = pointerEvent.getChanges();
                    size = changes.size();
                    i3 = 0;
                    while (true) {
                        if (i3 < size) {
                        }
                        i3 = i4 + 1;
                    }
                    pointerInputChange2 = pointerInputChange;
                    if (pointerInputChange2 != null) {
                        return null;
                    }
                    if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                    }
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$0 = function22;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$1 = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$2 = longRef;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$3 = touchSlopDetector;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$4 = null;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$0 = m551pointerSlopE8SPZFQ;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label = i5;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1, i5, null);
                    if (awaitPointerEvent$default != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                float f2 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$0;
                PointerInputChange pointerInputChange4 = (PointerInputChange) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$4;
                TouchSlopDetector touchSlopDetector3 = (TouchSlopDetector) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$3;
                Ref.LongRef longRef3 = (Ref.LongRef) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$2;
                AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$1;
                Function2<? super PointerInputChange, ? super Float, Unit> function24 = (Function2) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$0;
                ResultKt.throwOnFailure(obj);
                touchSlopDetector = touchSlopDetector3;
                pointerInputChange2 = pointerInputChange4;
                char c = 2;
                float f3 = f2;
                awaitPointerEventScope2 = awaitPointerEventScope4;
                function23 = function24;
                longRef = longRef3;
                if (!pointerInputChange2.isConsumed()) {
                    return null;
                }
                m551pointerSlopE8SPZFQ = f3;
                function22 = function23;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$0 = function22;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$1 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$2 = longRef;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$3 = touchSlopDetector;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$4 = null;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$0 = m551pointerSlopE8SPZFQ;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label = i5;
                awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1, i5, null);
                if (awaitPointerEvent$default != coroutine_suspended) {
                    function23 = function22;
                    touchSlopDetector2 = touchSlopDetector;
                    obj = awaitPointerEvent$default;
                    awaitPointerEventScope3 = awaitPointerEventScope2;
                    f = m551pointerSlopE8SPZFQ;
                    PointerEvent pointerEvent2 = (PointerEvent) obj;
                    List<PointerInputChange> changes2 = pointerEvent2.getChanges();
                    size = changes2.size();
                    i3 = 0;
                    while (true) {
                        if (i3 < size) {
                            pointerInputChange = null;
                            break;
                        }
                        pointerInputChange = changes2.get(i3);
                        i4 = i3;
                        if (PointerId.m6695equalsimpl0(pointerInputChange.getId(), longRef.element)) {
                            break;
                        }
                        i3 = i4 + 1;
                    }
                    pointerInputChange2 = pointerInputChange;
                    if (pointerInputChange2 != null || pointerInputChange2.isConsumed()) {
                        return null;
                    }
                    if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                        List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                        int size2 = changes3.size();
                        int i6 = 0;
                        while (true) {
                            if (i6 >= size2) {
                                pointerInputChange3 = null;
                                break;
                            }
                            pointerInputChange3 = changes3.get(i6);
                            if (pointerInputChange3.getPressed()) {
                                break;
                            }
                            i6++;
                        }
                        PointerInputChange pointerInputChange5 = pointerInputChange3;
                        if (pointerInputChange5 == null) {
                            return null;
                        }
                        longRef.element = pointerInputChange5.getId();
                        touchSlopDetector = touchSlopDetector2;
                        i5 = 1;
                        m551pointerSlopE8SPZFQ = f;
                        awaitPointerEventScope2 = awaitPointerEventScope3;
                        function22 = function23;
                    } else {
                        float f4 = f;
                        TouchSlopDetector touchSlopDetector4 = touchSlopDetector2;
                        long m690addPositionsakrDWew = touchSlopDetector4.m690addPositionsakrDWew(pointerInputChange2.getPosition(), pointerInputChange2.getPreviousPosition(), f4);
                        touchSlopDetector = touchSlopDetector4;
                        f3 = f4;
                        if ((9223372034707292159L & m690addPositionsakrDWew) != InlineClassHelperKt.UnspecifiedPackedFloats) {
                            function23.invoke(pointerInputChange2, Boxing.boxFloat(Float.intBitsToFloat((int) (m690addPositionsakrDWew & 4294967295L))));
                            if (pointerInputChange2.isConsumed()) {
                                return pointerInputChange2;
                            }
                            i5 = 1;
                            TouchSlopDetector.m689resetk4lQ0M$default(touchSlopDetector, 0L, 1, null);
                            m551pointerSlopE8SPZFQ = f3;
                            awaitPointerEventScope2 = awaitPointerEventScope3;
                            function22 = function23;
                        } else {
                            i5 = 1;
                            PointerEventPass pointerEventPass = PointerEventPass.Final;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$0 = function23;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$1 = awaitPointerEventScope3;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$2 = longRef;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$3 = touchSlopDetector;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$4 = pointerInputChange2;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$0 = f3;
                            c = 2;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label = 2;
                            if (awaitPointerEventScope3.awaitPointerEvent(pointerEventPass, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1) != coroutine_suspended) {
                                awaitPointerEventScope2 = awaitPointerEventScope3;
                                if (!pointerInputChange2.isConsumed()) {
                                }
                            }
                        }
                    }
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$0 = function22;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$1 = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$2 = longRef;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$3 = touchSlopDetector;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$4 = null;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$0 = m551pointerSlopE8SPZFQ;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label = i5;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1, i5, null);
                    if (awaitPointerEvent$default != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
        }
        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 = new DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1(continuation);
        Object obj2 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label;
        int i52 = 1;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0119, code lost:
    
        if ((r0 == 0.0f) == false) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0085 -> B:10:0x008b). Please report as a decompilation issue!!! */
    /* renamed from: verticalDrag-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m552verticalDragjO51t88(AwaitPointerEventScope awaitPointerEventScope, long j, Function1<? super PointerInputChange, Unit> function1, Continuation<? super Boolean> continuation) {
        DragGestureDetectorKt$verticalDrag$1 dragGestureDetectorKt$verticalDrag$1;
        int i;
        long j2;
        Orientation orientation;
        DragGestureDetectorKt$verticalDrag$1 dragGestureDetectorKt$verticalDrag$12;
        AwaitPointerEventScope awaitPointerEventScope2;
        Function1<? super PointerInputChange, Unit> function12;
        Orientation orientation2;
        AwaitPointerEventScope awaitPointerEventScope3;
        Ref.LongRef longRef;
        Object awaitPointerEvent$default;
        AwaitPointerEventScope awaitPointerEventScope4;
        PointerInputChange pointerInputChange;
        float intBitsToFloat;
        PointerInputChange pointerInputChange2;
        if (continuation instanceof DragGestureDetectorKt$verticalDrag$1) {
            dragGestureDetectorKt$verticalDrag$1 = (DragGestureDetectorKt$verticalDrag$1) continuation;
            if ((dragGestureDetectorKt$verticalDrag$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$verticalDrag$1.label -= Integer.MIN_VALUE;
                Object obj = dragGestureDetectorKt$verticalDrag$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$verticalDrag$1.label;
                int i2 = 1;
                PointerEventPass pointerEventPass = null;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Orientation orientation3 = Orientation.Vertical;
                    j2 = j;
                    if (!m550isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j2)) {
                        orientation = orientation3;
                        dragGestureDetectorKt$verticalDrag$12 = dragGestureDetectorKt$verticalDrag$1;
                        awaitPointerEventScope2 = awaitPointerEventScope;
                        function12 = function1;
                        Ref.LongRef longRef2 = new Ref.LongRef();
                        longRef2.element = j2;
                        awaitPointerEventScope3 = awaitPointerEventScope2;
                        orientation2 = orientation;
                        longRef = longRef2;
                        dragGestureDetectorKt$verticalDrag$12.L$0 = function12;
                        dragGestureDetectorKt$verticalDrag$12.L$1 = awaitPointerEventScope2;
                        dragGestureDetectorKt$verticalDrag$12.L$2 = orientation2;
                        dragGestureDetectorKt$verticalDrag$12.L$3 = awaitPointerEventScope3;
                        dragGestureDetectorKt$verticalDrag$12.L$4 = longRef;
                        dragGestureDetectorKt$verticalDrag$12.label = i2;
                        awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, dragGestureDetectorKt$verticalDrag$12, i2, pointerEventPass);
                        if (awaitPointerEvent$default == coroutine_suspended) {
                        }
                    }
                    return Boxing.boxBoolean(pointerEventPass == null);
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                longRef = (Ref.LongRef) dragGestureDetectorKt$verticalDrag$1.L$4;
                awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$verticalDrag$1.L$3;
                orientation2 = (Orientation) dragGestureDetectorKt$verticalDrag$1.L$2;
                AwaitPointerEventScope awaitPointerEventScope5 = (AwaitPointerEventScope) dragGestureDetectorKt$verticalDrag$1.L$1;
                Function1<? super PointerInputChange, Unit> function13 = (Function1) dragGestureDetectorKt$verticalDrag$1.L$0;
                ResultKt.throwOnFailure(obj);
                DragGestureDetectorKt$verticalDrag$1 dragGestureDetectorKt$verticalDrag$13 = dragGestureDetectorKt$verticalDrag$1;
                function12 = function13;
                PointerEvent pointerEvent = (PointerEvent) obj;
                List<PointerInputChange> changes = pointerEvent.getChanges();
                int size = changes.size();
                int i3 = 0;
                while (true) {
                    if (i3 < size) {
                        awaitPointerEventScope4 = awaitPointerEventScope3;
                        pointerInputChange = null;
                        break;
                    }
                    pointerInputChange = changes.get(i3);
                    awaitPointerEventScope4 = awaitPointerEventScope3;
                    if (PointerId.m6695equalsimpl0(pointerInputChange.getId(), longRef.element)) {
                        break;
                    }
                    i3++;
                    awaitPointerEventScope3 = awaitPointerEventScope4;
                }
                PointerInputChange pointerInputChange3 = pointerInputChange;
                if (pointerInputChange3 == 0) {
                    if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                        List<PointerInputChange> changes2 = pointerEvent.getChanges();
                        int size2 = changes2.size();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= size2) {
                                pointerInputChange2 = null;
                                break;
                            }
                            pointerInputChange2 = changes2.get(i4);
                            if (pointerInputChange2.getPressed()) {
                                break;
                            }
                            i4++;
                        }
                        PointerInputChange pointerInputChange4 = pointerInputChange2;
                        if (pointerInputChange4 != null) {
                            longRef.element = pointerInputChange4.getId();
                            awaitPointerEventScope3 = awaitPointerEventScope4;
                            awaitPointerEventScope2 = awaitPointerEventScope5;
                            dragGestureDetectorKt$verticalDrag$12 = dragGestureDetectorKt$verticalDrag$13;
                            i2 = 1;
                            pointerEventPass = null;
                            dragGestureDetectorKt$verticalDrag$12.L$0 = function12;
                            dragGestureDetectorKt$verticalDrag$12.L$1 = awaitPointerEventScope2;
                            dragGestureDetectorKt$verticalDrag$12.L$2 = orientation2;
                            dragGestureDetectorKt$verticalDrag$12.L$3 = awaitPointerEventScope3;
                            dragGestureDetectorKt$verticalDrag$12.L$4 = longRef;
                            dragGestureDetectorKt$verticalDrag$12.label = i2;
                            awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, dragGestureDetectorKt$verticalDrag$12, i2, pointerEventPass);
                            if (awaitPointerEvent$default == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            DragGestureDetectorKt$verticalDrag$1 dragGestureDetectorKt$verticalDrag$14 = dragGestureDetectorKt$verticalDrag$12;
                            awaitPointerEventScope5 = awaitPointerEventScope2;
                            obj = awaitPointerEvent$default;
                            dragGestureDetectorKt$verticalDrag$13 = dragGestureDetectorKt$verticalDrag$14;
                        }
                    } else {
                        long positionChangeIgnoreConsumed = PointerEventKt.positionChangeIgnoreConsumed(pointerInputChange3);
                        if (orientation2 == null) {
                            intBitsToFloat = Offset.m5146getDistanceimpl(positionChangeIgnoreConsumed);
                        } else {
                            intBitsToFloat = Float.intBitsToFloat((int) (orientation2 == Orientation.Vertical ? positionChangeIgnoreConsumed & 4294967295L : positionChangeIgnoreConsumed >> 32));
                        }
                    }
                    PointerEvent pointerEvent2 = (PointerEvent) obj;
                    List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                    int size3 = changes3.size();
                    int i32 = 0;
                    while (true) {
                        if (i32 < size3) {
                        }
                        i32++;
                        awaitPointerEventScope3 = awaitPointerEventScope4;
                    }
                    PointerInputChange pointerInputChange32 = pointerInputChange;
                    if (pointerInputChange32 == 0) {
                        pointerInputChange32 = 0;
                    }
                }
                if (pointerInputChange32 == 0 || pointerInputChange32.isConsumed()) {
                    pointerEventPass = null;
                } else if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange32)) {
                    pointerEventPass = pointerInputChange32;
                } else {
                    function12.invoke(pointerInputChange32);
                    orientation = orientation2;
                    j2 = pointerInputChange32.getId();
                    awaitPointerEventScope2 = awaitPointerEventScope5;
                    dragGestureDetectorKt$verticalDrag$12 = dragGestureDetectorKt$verticalDrag$13;
                    i2 = 1;
                    pointerEventPass = null;
                    Ref.LongRef longRef22 = new Ref.LongRef();
                    longRef22.element = j2;
                    awaitPointerEventScope3 = awaitPointerEventScope2;
                    orientation2 = orientation;
                    longRef = longRef22;
                    dragGestureDetectorKt$verticalDrag$12.L$0 = function12;
                    dragGestureDetectorKt$verticalDrag$12.L$1 = awaitPointerEventScope2;
                    dragGestureDetectorKt$verticalDrag$12.L$2 = orientation2;
                    dragGestureDetectorKt$verticalDrag$12.L$3 = awaitPointerEventScope3;
                    dragGestureDetectorKt$verticalDrag$12.L$4 = longRef;
                    dragGestureDetectorKt$verticalDrag$12.label = i2;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, dragGestureDetectorKt$verticalDrag$12, i2, pointerEventPass);
                    if (awaitPointerEvent$default == coroutine_suspended) {
                    }
                }
                return Boxing.boxBoolean(pointerEventPass == null);
            }
        }
        dragGestureDetectorKt$verticalDrag$1 = new DragGestureDetectorKt$verticalDrag$1(continuation);
        Object obj2 = dragGestureDetectorKt$verticalDrag$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$verticalDrag$1.label;
        int i22 = 1;
        PointerEventPass pointerEventPass2 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e3, code lost:
    
        if ((java.lang.Float.intBitsToFloat((int) (androidx.compose.ui.input.pointer.PointerEventKt.positionChangeIgnoreConsumed(r11) & 4294967295L)) == 0.0f ? 1 : 0) == 0) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0069 -> B:10:0x006e). Please report as a decompilation issue!!! */
    /* renamed from: awaitVerticalDragOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m543awaitVerticalDragOrCancellationrnUCldI(AwaitPointerEventScope awaitPointerEventScope, long j, Continuation<? super PointerInputChange> continuation) {
        DragGestureDetectorKt$awaitVerticalDragOrCancellation$1 dragGestureDetectorKt$awaitVerticalDragOrCancellation$1;
        int i;
        Ref.LongRef longRef;
        AwaitPointerEventScope awaitPointerEventScope2;
        Object awaitPointerEvent$default;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        if (continuation instanceof DragGestureDetectorKt$awaitVerticalDragOrCancellation$1) {
            dragGestureDetectorKt$awaitVerticalDragOrCancellation$1 = (DragGestureDetectorKt$awaitVerticalDragOrCancellation$1) continuation;
            if ((dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.label -= Integer.MIN_VALUE;
                Object obj = dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.label;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Ref.LongRef longRef2 = (Ref.LongRef) dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.L$1;
                    AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    Ref.LongRef longRef3 = longRef2;
                    awaitPointerEventScope2 = awaitPointerEventScope3;
                    PointerEvent pointerEvent = (PointerEvent) obj;
                    List<PointerInputChange> changes = pointerEvent.getChanges();
                    int size = changes.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 < size) {
                            pointerInputChange = null;
                            break;
                        }
                        pointerInputChange = changes.get(i2);
                        if (PointerId.m6695equalsimpl0(pointerInputChange.getId(), longRef3.element)) {
                            break;
                        }
                        i2++;
                    }
                    PointerInputChange pointerInputChange3 = pointerInputChange;
                    if (pointerInputChange3 == null) {
                        if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                            List<PointerInputChange> changes2 = pointerEvent.getChanges();
                            int size2 = changes2.size();
                            while (true) {
                                if (r9 >= size2) {
                                    pointerInputChange2 = null;
                                    break;
                                }
                                pointerInputChange2 = changes2.get(r9);
                                if (pointerInputChange2.getPressed()) {
                                    break;
                                }
                                r9++;
                            }
                            PointerInputChange pointerInputChange4 = pointerInputChange2;
                            if (pointerInputChange4 != null) {
                                longRef3.element = pointerInputChange4.getId();
                                longRef = longRef3;
                            }
                        }
                        dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.L$0 = awaitPointerEventScope2;
                        dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.L$1 = longRef;
                        dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.label = 1;
                        awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitVerticalDragOrCancellation$1, 1, null);
                        if (awaitPointerEvent$default != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Ref.LongRef longRef4 = longRef;
                        obj = awaitPointerEvent$default;
                        longRef3 = longRef4;
                        PointerEvent pointerEvent2 = (PointerEvent) obj;
                        List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                        int size3 = changes3.size();
                        int i22 = 0;
                        while (true) {
                            if (i22 < size3) {
                            }
                            i22++;
                        }
                        PointerInputChange pointerInputChange32 = pointerInputChange;
                        if (pointerInputChange32 == null) {
                            pointerInputChange32 = null;
                        }
                    }
                    if (pointerInputChange32 == null || pointerInputChange32.isConsumed()) {
                        return null;
                    }
                    return pointerInputChange32;
                }
                ResultKt.throwOnFailure(obj);
                if (m550isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                    return null;
                }
                longRef = new Ref.LongRef();
                longRef.element = j;
                awaitPointerEventScope2 = awaitPointerEventScope;
                dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.L$0 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.L$1 = longRef;
                dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.label = 1;
                awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitVerticalDragOrCancellation$1, 1, null);
                if (awaitPointerEvent$default != coroutine_suspended) {
                }
            }
        }
        dragGestureDetectorKt$awaitVerticalDragOrCancellation$1 = new DragGestureDetectorKt$awaitVerticalDragOrCancellation$1(continuation);
        Object obj2 = dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.label;
        if (i == 0) {
        }
    }

    public static /* synthetic */ Object detectVerticalDragGestures$default(PointerInputScope pointerInputScope, Function1 function1, Function0 function0, Function0 function02, Function2 function2, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit detectVerticalDragGestures$lambda$0;
                    detectVerticalDragGestures$lambda$0 = DragGestureDetectorKt.detectVerticalDragGestures$lambda$0((Offset) obj2);
                    return detectVerticalDragGestures$lambda$0;
                }
            };
        }
        if ((i & 2) != 0) {
            function0 = new Function0() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            };
        }
        if ((i & 4) != 0) {
            function02 = new Function0() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            };
        }
        Function0 function03 = function02;
        return detectVerticalDragGestures(pointerInputScope, function1, function0, function03, function2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit detectVerticalDragGestures$lambda$0(Offset offset) {
        return Unit.INSTANCE;
    }

    public static final Object detectVerticalDragGestures(PointerInputScope pointerInputScope, Function1<? super Offset, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function2<? super PointerInputChange, ? super Float, Unit> function2, Continuation<? super Unit> continuation) {
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new DragGestureDetectorKt$detectVerticalDragGestures$5(function1, function2, function0, function02, null), continuation);
        return awaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitEachGesture : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x01a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0198 -> B:11:0x019c). Please report as a decompilation issue!!! */
    /* renamed from: awaitHorizontalTouchSlopOrCancellation-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m537awaitHorizontalTouchSlopOrCancellationjO51t88(AwaitPointerEventScope awaitPointerEventScope, long j, Function2<? super PointerInputChange, ? super Float, Unit> function2, Continuation<? super PointerInputChange> continuation) {
        DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;
        int i;
        float m551pointerSlopE8SPZFQ;
        Ref.LongRef longRef;
        Function2<? super PointerInputChange, ? super Float, Unit> function22;
        DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12;
        TouchSlopDetector touchSlopDetector;
        AwaitPointerEventScope awaitPointerEventScope2;
        float f;
        TouchSlopDetector touchSlopDetector2;
        int size;
        int i2;
        PointerEventPass pointerEventPass;
        Object obj;
        PointerInputChange pointerInputChange;
        Object obj2;
        int i3;
        Object awaitPointerEvent$default;
        if (continuation instanceof DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 = (DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1) continuation;
            if ((dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.label -= Integer.MIN_VALUE;
                Object obj3 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.label;
                int i4 = 1;
                PointerEventPass pointerEventPass2 = null;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj3);
                    int m6791getTouchT8wyACA = PointerType.INSTANCE.m6791getTouchT8wyACA();
                    Orientation orientation = Orientation.Horizontal;
                    long m5164getZeroF1C5BW0 = Offset.INSTANCE.m5164getZeroF1C5BW0();
                    if (m550isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                        return null;
                    }
                    m551pointerSlopE8SPZFQ = m551pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), m6791getTouchT8wyACA);
                    longRef = new Ref.LongRef();
                    longRef.element = j;
                    TouchSlopDetector touchSlopDetector3 = new TouchSlopDetector(orientation, m5164getZeroF1C5BW0, null);
                    function22 = function2;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;
                    touchSlopDetector = touchSlopDetector3;
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$0 = function22;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$2 = longRef;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$3 = touchSlopDetector;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$4 = pointerEventPass2;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.F$0 = m551pointerSlopE8SPZFQ;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.label = i4;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12, i4, pointerEventPass2);
                    if (awaitPointerEvent$default != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    float f2 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.F$0;
                    TouchSlopDetector touchSlopDetector4 = (TouchSlopDetector) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$3;
                    Ref.LongRef longRef2 = (Ref.LongRef) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$2;
                    AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$1;
                    Function2<? super PointerInputChange, ? super Float, Unit> function23 = (Function2) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$0;
                    ResultKt.throwOnFailure(obj3);
                    f = f2;
                    touchSlopDetector2 = touchSlopDetector4;
                    longRef = longRef2;
                    awaitPointerEventScope2 = awaitPointerEventScope3;
                    function22 = function23;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;
                    PointerEvent pointerEvent = (PointerEvent) obj3;
                    List<PointerInputChange> changes = pointerEvent.getChanges();
                    size = changes.size();
                    int i5 = 0;
                    i2 = 0;
                    while (true) {
                        if (i2 < size) {
                        }
                        i2++;
                        size = i3;
                        pointerEventPass2 = pointerEventPass;
                    }
                    pointerInputChange = (PointerInputChange) obj;
                    if (pointerInputChange != null) {
                        return pointerEventPass;
                    }
                    if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                    }
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$0 = function22;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$2 = longRef;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$3 = touchSlopDetector;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$4 = pointerEventPass2;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.F$0 = m551pointerSlopE8SPZFQ;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.label = i4;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12, i4, pointerEventPass2);
                    if (awaitPointerEvent$default != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                float f3 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.F$0;
                PointerInputChange pointerInputChange2 = (PointerInputChange) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$4;
                TouchSlopDetector touchSlopDetector5 = (TouchSlopDetector) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$3;
                Ref.LongRef longRef3 = (Ref.LongRef) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$2;
                AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$1;
                Function2<? super PointerInputChange, ? super Float, Unit> function24 = (Function2) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$0;
                ResultKt.throwOnFailure(obj3);
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;
                touchSlopDetector = touchSlopDetector5;
                m551pointerSlopE8SPZFQ = f3;
                int i6 = 1;
                awaitPointerEventScope2 = awaitPointerEventScope4;
                char c = 2;
                if (!pointerInputChange2.isConsumed()) {
                    return null;
                }
                i4 = i6;
                function22 = function24;
                pointerEventPass2 = null;
                longRef = longRef3;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$0 = function22;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$2 = longRef;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$3 = touchSlopDetector;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$4 = pointerEventPass2;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.F$0 = m551pointerSlopE8SPZFQ;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.label = i4;
                awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12, i4, pointerEventPass2);
                if (awaitPointerEvent$default != coroutine_suspended) {
                    f = m551pointerSlopE8SPZFQ;
                    touchSlopDetector2 = touchSlopDetector;
                    obj3 = awaitPointerEvent$default;
                    PointerEvent pointerEvent2 = (PointerEvent) obj3;
                    List<PointerInputChange> changes2 = pointerEvent2.getChanges();
                    size = changes2.size();
                    int i52 = 0;
                    i2 = 0;
                    while (true) {
                        if (i2 < size) {
                            pointerEventPass = pointerEventPass2;
                            obj = pointerEventPass;
                            break;
                        }
                        obj = changes2.get(i2);
                        pointerEventPass = pointerEventPass2;
                        i3 = size;
                        if (PointerId.m6695equalsimpl0(((PointerInputChange) obj).getId(), longRef.element)) {
                            break;
                        }
                        i2++;
                        size = i3;
                        pointerEventPass2 = pointerEventPass;
                    }
                    pointerInputChange = (PointerInputChange) obj;
                    if (pointerInputChange != null || pointerInputChange.isConsumed()) {
                        return pointerEventPass;
                    }
                    if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                        List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                        int size2 = changes3.size();
                        while (true) {
                            if (i52 >= size2) {
                                obj2 = pointerEventPass;
                                break;
                            }
                            obj2 = changes3.get(i52);
                            if (((PointerInputChange) obj2).getPressed()) {
                                break;
                            }
                            i52++;
                        }
                        PointerInputChange pointerInputChange3 = (PointerInputChange) obj2;
                        if (pointerInputChange3 == null) {
                            return pointerEventPass;
                        }
                        longRef.element = pointerInputChange3.getId();
                        m551pointerSlopE8SPZFQ = f;
                        i4 = 1;
                        touchSlopDetector = touchSlopDetector2;
                        pointerEventPass2 = null;
                    } else {
                        long m690addPositionsakrDWew = touchSlopDetector2.m690addPositionsakrDWew(pointerInputChange.getPosition(), pointerInputChange.getPreviousPosition(), f);
                        m551pointerSlopE8SPZFQ = f;
                        if ((9223372034707292159L & m690addPositionsakrDWew) != InlineClassHelperKt.UnspecifiedPackedFloats) {
                            function22.invoke(pointerInputChange, Boxing.boxFloat(Float.intBitsToFloat((int) (m690addPositionsakrDWew >> 32))));
                            if (pointerInputChange.isConsumed()) {
                                return pointerInputChange;
                            }
                            TouchSlopDetector.m689resetk4lQ0M$default(touchSlopDetector2, 0L, 1, pointerEventPass);
                            i4 = 1;
                            touchSlopDetector = touchSlopDetector2;
                            pointerEventPass2 = null;
                        } else {
                            i6 = 1;
                            PointerEventPass pointerEventPass3 = PointerEventPass.Final;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$0 = function22;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$2 = longRef;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$3 = touchSlopDetector2;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$4 = pointerInputChange;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.F$0 = m551pointerSlopE8SPZFQ;
                            c = 2;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.label = 2;
                            if (awaitPointerEventScope2.awaitPointerEvent(pointerEventPass3, dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12) != coroutine_suspended) {
                                longRef3 = longRef;
                                function24 = function22;
                                pointerInputChange2 = pointerInputChange;
                                touchSlopDetector = touchSlopDetector2;
                                if (!pointerInputChange2.isConsumed()) {
                                }
                            }
                        }
                    }
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$0 = function22;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$2 = longRef;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$3 = touchSlopDetector;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$4 = pointerEventPass2;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.F$0 = m551pointerSlopE8SPZFQ;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.label = i4;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12, i4, pointerEventPass2);
                    if (awaitPointerEvent$default != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
        }
        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 = new DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1(continuation);
        Object obj32 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.label;
        int i42 = 1;
        PointerEventPass pointerEventPass22 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0194 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x018d -> B:11:0x018e). Please report as a decompilation issue!!! */
    /* renamed from: awaitHorizontalPointerSlopOrCancellation-gDDlDlE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m536awaitHorizontalPointerSlopOrCancellationgDDlDlE(AwaitPointerEventScope awaitPointerEventScope, long j, int i, Function2<? super PointerInputChange, ? super Float, Unit> function2, Continuation<? super PointerInputChange> continuation) {
        DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;
        int i2;
        float m551pointerSlopE8SPZFQ;
        Ref.LongRef longRef;
        Function2<? super PointerInputChange, ? super Float, Unit> function22;
        TouchSlopDetector touchSlopDetector;
        AwaitPointerEventScope awaitPointerEventScope2;
        Function2<? super PointerInputChange, ? super Float, Unit> function23;
        AwaitPointerEventScope awaitPointerEventScope3;
        TouchSlopDetector touchSlopDetector2;
        float f;
        int size;
        int i3;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        PointerInputChange pointerInputChange3;
        int i4;
        Object awaitPointerEvent$default;
        if (continuation instanceof DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 = (DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1) continuation;
            if ((dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label -= Integer.MIN_VALUE;
                Object obj = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label;
                int i5 = 1;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Orientation orientation = Orientation.Horizontal;
                    long m5164getZeroF1C5BW0 = Offset.INSTANCE.m5164getZeroF1C5BW0();
                    if (m550isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                        return null;
                    }
                    m551pointerSlopE8SPZFQ = m551pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i);
                    longRef = new Ref.LongRef();
                    longRef.element = j;
                    function22 = function2;
                    touchSlopDetector = new TouchSlopDetector(orientation, m5164getZeroF1C5BW0, null);
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$0 = function22;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$1 = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$2 = longRef;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$3 = touchSlopDetector;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$4 = null;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$0 = m551pointerSlopE8SPZFQ;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label = i5;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1, i5, null);
                    if (awaitPointerEvent$default != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i2 == 1) {
                    f = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$0;
                    touchSlopDetector2 = (TouchSlopDetector) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$3;
                    Ref.LongRef longRef2 = (Ref.LongRef) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$2;
                    awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$1;
                    function23 = (Function2) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    longRef = longRef2;
                    PointerEvent pointerEvent = (PointerEvent) obj;
                    List<PointerInputChange> changes = pointerEvent.getChanges();
                    size = changes.size();
                    i3 = 0;
                    while (true) {
                        if (i3 < size) {
                        }
                        i3 = i4 + 1;
                    }
                    pointerInputChange2 = pointerInputChange;
                    if (pointerInputChange2 != null) {
                        return null;
                    }
                    if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                    }
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$0 = function22;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$1 = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$2 = longRef;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$3 = touchSlopDetector;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$4 = null;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$0 = m551pointerSlopE8SPZFQ;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label = i5;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1, i5, null);
                    if (awaitPointerEvent$default != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                float f2 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$0;
                PointerInputChange pointerInputChange4 = (PointerInputChange) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$4;
                TouchSlopDetector touchSlopDetector3 = (TouchSlopDetector) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$3;
                Ref.LongRef longRef3 = (Ref.LongRef) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$2;
                AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$1;
                Function2<? super PointerInputChange, ? super Float, Unit> function24 = (Function2) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$0;
                ResultKt.throwOnFailure(obj);
                touchSlopDetector = touchSlopDetector3;
                pointerInputChange2 = pointerInputChange4;
                char c = 2;
                float f3 = f2;
                awaitPointerEventScope2 = awaitPointerEventScope4;
                function23 = function24;
                longRef = longRef3;
                if (!pointerInputChange2.isConsumed()) {
                    return null;
                }
                m551pointerSlopE8SPZFQ = f3;
                function22 = function23;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$0 = function22;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$1 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$2 = longRef;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$3 = touchSlopDetector;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$4 = null;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$0 = m551pointerSlopE8SPZFQ;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label = i5;
                awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1, i5, null);
                if (awaitPointerEvent$default != coroutine_suspended) {
                    function23 = function22;
                    touchSlopDetector2 = touchSlopDetector;
                    obj = awaitPointerEvent$default;
                    awaitPointerEventScope3 = awaitPointerEventScope2;
                    f = m551pointerSlopE8SPZFQ;
                    PointerEvent pointerEvent2 = (PointerEvent) obj;
                    List<PointerInputChange> changes2 = pointerEvent2.getChanges();
                    size = changes2.size();
                    i3 = 0;
                    while (true) {
                        if (i3 < size) {
                            pointerInputChange = null;
                            break;
                        }
                        pointerInputChange = changes2.get(i3);
                        i4 = i3;
                        if (PointerId.m6695equalsimpl0(pointerInputChange.getId(), longRef.element)) {
                            break;
                        }
                        i3 = i4 + 1;
                    }
                    pointerInputChange2 = pointerInputChange;
                    if (pointerInputChange2 != null || pointerInputChange2.isConsumed()) {
                        return null;
                    }
                    if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                        List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                        int size2 = changes3.size();
                        int i6 = 0;
                        while (true) {
                            if (i6 >= size2) {
                                pointerInputChange3 = null;
                                break;
                            }
                            pointerInputChange3 = changes3.get(i6);
                            if (pointerInputChange3.getPressed()) {
                                break;
                            }
                            i6++;
                        }
                        PointerInputChange pointerInputChange5 = pointerInputChange3;
                        if (pointerInputChange5 == null) {
                            return null;
                        }
                        longRef.element = pointerInputChange5.getId();
                        touchSlopDetector = touchSlopDetector2;
                        i5 = 1;
                        m551pointerSlopE8SPZFQ = f;
                        awaitPointerEventScope2 = awaitPointerEventScope3;
                        function22 = function23;
                    } else {
                        float f4 = f;
                        TouchSlopDetector touchSlopDetector4 = touchSlopDetector2;
                        long m690addPositionsakrDWew = touchSlopDetector4.m690addPositionsakrDWew(pointerInputChange2.getPosition(), pointerInputChange2.getPreviousPosition(), f4);
                        touchSlopDetector = touchSlopDetector4;
                        f3 = f4;
                        if ((9223372034707292159L & m690addPositionsakrDWew) != InlineClassHelperKt.UnspecifiedPackedFloats) {
                            function23.invoke(pointerInputChange2, Boxing.boxFloat(Float.intBitsToFloat((int) (m690addPositionsakrDWew >> 32))));
                            if (pointerInputChange2.isConsumed()) {
                                return pointerInputChange2;
                            }
                            i5 = 1;
                            TouchSlopDetector.m689resetk4lQ0M$default(touchSlopDetector, 0L, 1, null);
                            m551pointerSlopE8SPZFQ = f3;
                            awaitPointerEventScope2 = awaitPointerEventScope3;
                            function22 = function23;
                        } else {
                            i5 = 1;
                            PointerEventPass pointerEventPass = PointerEventPass.Final;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$0 = function23;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$1 = awaitPointerEventScope3;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$2 = longRef;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$3 = touchSlopDetector;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$4 = pointerInputChange2;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$0 = f3;
                            c = 2;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label = 2;
                            if (awaitPointerEventScope3.awaitPointerEvent(pointerEventPass, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1) != coroutine_suspended) {
                                awaitPointerEventScope2 = awaitPointerEventScope3;
                                if (!pointerInputChange2.isConsumed()) {
                                }
                            }
                        }
                    }
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$0 = function22;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$1 = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$2 = longRef;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$3 = touchSlopDetector;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$4 = null;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$0 = m551pointerSlopE8SPZFQ;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label = i5;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1, i5, null);
                    if (awaitPointerEvent$default != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
        }
        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 = new DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1(continuation);
        Object obj2 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label;
        int i52 = 1;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0119, code lost:
    
        if ((r0 == 0.0f) == false) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0085 -> B:10:0x008b). Please report as a decompilation issue!!! */
    /* renamed from: horizontalDrag-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m549horizontalDragjO51t88(AwaitPointerEventScope awaitPointerEventScope, long j, Function1<? super PointerInputChange, Unit> function1, Continuation<? super Boolean> continuation) {
        DragGestureDetectorKt$horizontalDrag$1 dragGestureDetectorKt$horizontalDrag$1;
        int i;
        long j2;
        Orientation orientation;
        DragGestureDetectorKt$horizontalDrag$1 dragGestureDetectorKt$horizontalDrag$12;
        AwaitPointerEventScope awaitPointerEventScope2;
        Function1<? super PointerInputChange, Unit> function12;
        Orientation orientation2;
        AwaitPointerEventScope awaitPointerEventScope3;
        Ref.LongRef longRef;
        Object awaitPointerEvent$default;
        AwaitPointerEventScope awaitPointerEventScope4;
        PointerInputChange pointerInputChange;
        float intBitsToFloat;
        PointerInputChange pointerInputChange2;
        if (continuation instanceof DragGestureDetectorKt$horizontalDrag$1) {
            dragGestureDetectorKt$horizontalDrag$1 = (DragGestureDetectorKt$horizontalDrag$1) continuation;
            if ((dragGestureDetectorKt$horizontalDrag$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$horizontalDrag$1.label -= Integer.MIN_VALUE;
                Object obj = dragGestureDetectorKt$horizontalDrag$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$horizontalDrag$1.label;
                int i2 = 1;
                PointerEventPass pointerEventPass = null;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Orientation orientation3 = Orientation.Horizontal;
                    j2 = j;
                    if (!m550isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j2)) {
                        orientation = orientation3;
                        dragGestureDetectorKt$horizontalDrag$12 = dragGestureDetectorKt$horizontalDrag$1;
                        awaitPointerEventScope2 = awaitPointerEventScope;
                        function12 = function1;
                        Ref.LongRef longRef2 = new Ref.LongRef();
                        longRef2.element = j2;
                        awaitPointerEventScope3 = awaitPointerEventScope2;
                        orientation2 = orientation;
                        longRef = longRef2;
                        dragGestureDetectorKt$horizontalDrag$12.L$0 = function12;
                        dragGestureDetectorKt$horizontalDrag$12.L$1 = awaitPointerEventScope2;
                        dragGestureDetectorKt$horizontalDrag$12.L$2 = orientation2;
                        dragGestureDetectorKt$horizontalDrag$12.L$3 = awaitPointerEventScope3;
                        dragGestureDetectorKt$horizontalDrag$12.L$4 = longRef;
                        dragGestureDetectorKt$horizontalDrag$12.label = i2;
                        awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, dragGestureDetectorKt$horizontalDrag$12, i2, pointerEventPass);
                        if (awaitPointerEvent$default == coroutine_suspended) {
                        }
                    }
                    return Boxing.boxBoolean(pointerEventPass == null);
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                longRef = (Ref.LongRef) dragGestureDetectorKt$horizontalDrag$1.L$4;
                awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$horizontalDrag$1.L$3;
                orientation2 = (Orientation) dragGestureDetectorKt$horizontalDrag$1.L$2;
                AwaitPointerEventScope awaitPointerEventScope5 = (AwaitPointerEventScope) dragGestureDetectorKt$horizontalDrag$1.L$1;
                Function1<? super PointerInputChange, Unit> function13 = (Function1) dragGestureDetectorKt$horizontalDrag$1.L$0;
                ResultKt.throwOnFailure(obj);
                DragGestureDetectorKt$horizontalDrag$1 dragGestureDetectorKt$horizontalDrag$13 = dragGestureDetectorKt$horizontalDrag$1;
                function12 = function13;
                PointerEvent pointerEvent = (PointerEvent) obj;
                List<PointerInputChange> changes = pointerEvent.getChanges();
                int size = changes.size();
                int i3 = 0;
                while (true) {
                    if (i3 < size) {
                        awaitPointerEventScope4 = awaitPointerEventScope3;
                        pointerInputChange = null;
                        break;
                    }
                    pointerInputChange = changes.get(i3);
                    awaitPointerEventScope4 = awaitPointerEventScope3;
                    if (PointerId.m6695equalsimpl0(pointerInputChange.getId(), longRef.element)) {
                        break;
                    }
                    i3++;
                    awaitPointerEventScope3 = awaitPointerEventScope4;
                }
                PointerInputChange pointerInputChange3 = pointerInputChange;
                if (pointerInputChange3 == 0) {
                    if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                        List<PointerInputChange> changes2 = pointerEvent.getChanges();
                        int size2 = changes2.size();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= size2) {
                                pointerInputChange2 = null;
                                break;
                            }
                            pointerInputChange2 = changes2.get(i4);
                            if (pointerInputChange2.getPressed()) {
                                break;
                            }
                            i4++;
                        }
                        PointerInputChange pointerInputChange4 = pointerInputChange2;
                        if (pointerInputChange4 != null) {
                            longRef.element = pointerInputChange4.getId();
                            awaitPointerEventScope3 = awaitPointerEventScope4;
                            awaitPointerEventScope2 = awaitPointerEventScope5;
                            dragGestureDetectorKt$horizontalDrag$12 = dragGestureDetectorKt$horizontalDrag$13;
                            i2 = 1;
                            pointerEventPass = null;
                            dragGestureDetectorKt$horizontalDrag$12.L$0 = function12;
                            dragGestureDetectorKt$horizontalDrag$12.L$1 = awaitPointerEventScope2;
                            dragGestureDetectorKt$horizontalDrag$12.L$2 = orientation2;
                            dragGestureDetectorKt$horizontalDrag$12.L$3 = awaitPointerEventScope3;
                            dragGestureDetectorKt$horizontalDrag$12.L$4 = longRef;
                            dragGestureDetectorKt$horizontalDrag$12.label = i2;
                            awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, dragGestureDetectorKt$horizontalDrag$12, i2, pointerEventPass);
                            if (awaitPointerEvent$default == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            DragGestureDetectorKt$horizontalDrag$1 dragGestureDetectorKt$horizontalDrag$14 = dragGestureDetectorKt$horizontalDrag$12;
                            awaitPointerEventScope5 = awaitPointerEventScope2;
                            obj = awaitPointerEvent$default;
                            dragGestureDetectorKt$horizontalDrag$13 = dragGestureDetectorKt$horizontalDrag$14;
                        }
                    } else {
                        long positionChangeIgnoreConsumed = PointerEventKt.positionChangeIgnoreConsumed(pointerInputChange3);
                        if (orientation2 == null) {
                            intBitsToFloat = Offset.m5146getDistanceimpl(positionChangeIgnoreConsumed);
                        } else {
                            intBitsToFloat = Float.intBitsToFloat((int) (orientation2 == Orientation.Vertical ? positionChangeIgnoreConsumed & 4294967295L : positionChangeIgnoreConsumed >> 32));
                        }
                    }
                    PointerEvent pointerEvent2 = (PointerEvent) obj;
                    List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                    int size3 = changes3.size();
                    int i32 = 0;
                    while (true) {
                        if (i32 < size3) {
                        }
                        i32++;
                        awaitPointerEventScope3 = awaitPointerEventScope4;
                    }
                    PointerInputChange pointerInputChange32 = pointerInputChange;
                    if (pointerInputChange32 == 0) {
                        pointerInputChange32 = 0;
                    }
                }
                if (pointerInputChange32 == 0 || pointerInputChange32.isConsumed()) {
                    pointerEventPass = null;
                } else if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange32)) {
                    pointerEventPass = pointerInputChange32;
                } else {
                    function12.invoke(pointerInputChange32);
                    orientation = orientation2;
                    j2 = pointerInputChange32.getId();
                    awaitPointerEventScope2 = awaitPointerEventScope5;
                    dragGestureDetectorKt$horizontalDrag$12 = dragGestureDetectorKt$horizontalDrag$13;
                    i2 = 1;
                    pointerEventPass = null;
                    Ref.LongRef longRef22 = new Ref.LongRef();
                    longRef22.element = j2;
                    awaitPointerEventScope3 = awaitPointerEventScope2;
                    orientation2 = orientation;
                    longRef = longRef22;
                    dragGestureDetectorKt$horizontalDrag$12.L$0 = function12;
                    dragGestureDetectorKt$horizontalDrag$12.L$1 = awaitPointerEventScope2;
                    dragGestureDetectorKt$horizontalDrag$12.L$2 = orientation2;
                    dragGestureDetectorKt$horizontalDrag$12.L$3 = awaitPointerEventScope3;
                    dragGestureDetectorKt$horizontalDrag$12.L$4 = longRef;
                    dragGestureDetectorKt$horizontalDrag$12.label = i2;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, dragGestureDetectorKt$horizontalDrag$12, i2, pointerEventPass);
                    if (awaitPointerEvent$default == coroutine_suspended) {
                    }
                }
                return Boxing.boxBoolean(pointerEventPass == null);
            }
        }
        dragGestureDetectorKt$horizontalDrag$1 = new DragGestureDetectorKt$horizontalDrag$1(continuation);
        Object obj2 = dragGestureDetectorKt$horizontalDrag$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$horizontalDrag$1.label;
        int i22 = 1;
        PointerEventPass pointerEventPass2 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e0, code lost:
    
        if ((java.lang.Float.intBitsToFloat((int) (androidx.compose.ui.input.pointer.PointerEventKt.positionChangeIgnoreConsumed(r11) >> 32)) == 0.0f ? 1 : 0) == 0) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0069 -> B:10:0x006e). Please report as a decompilation issue!!! */
    /* renamed from: awaitHorizontalDragOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m535awaitHorizontalDragOrCancellationrnUCldI(AwaitPointerEventScope awaitPointerEventScope, long j, Continuation<? super PointerInputChange> continuation) {
        DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1 dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1;
        int i;
        Ref.LongRef longRef;
        AwaitPointerEventScope awaitPointerEventScope2;
        Object awaitPointerEvent$default;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        if (continuation instanceof DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1) {
            dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1 = (DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1) continuation;
            if ((dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.label -= Integer.MIN_VALUE;
                Object obj = dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.label;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Ref.LongRef longRef2 = (Ref.LongRef) dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.L$1;
                    AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    Ref.LongRef longRef3 = longRef2;
                    awaitPointerEventScope2 = awaitPointerEventScope3;
                    PointerEvent pointerEvent = (PointerEvent) obj;
                    List<PointerInputChange> changes = pointerEvent.getChanges();
                    int size = changes.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 < size) {
                            pointerInputChange = null;
                            break;
                        }
                        pointerInputChange = changes.get(i2);
                        if (PointerId.m6695equalsimpl0(pointerInputChange.getId(), longRef3.element)) {
                            break;
                        }
                        i2++;
                    }
                    PointerInputChange pointerInputChange3 = pointerInputChange;
                    if (pointerInputChange3 == null) {
                        if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                            List<PointerInputChange> changes2 = pointerEvent.getChanges();
                            int size2 = changes2.size();
                            while (true) {
                                if (r9 >= size2) {
                                    pointerInputChange2 = null;
                                    break;
                                }
                                pointerInputChange2 = changes2.get(r9);
                                if (pointerInputChange2.getPressed()) {
                                    break;
                                }
                                r9++;
                            }
                            PointerInputChange pointerInputChange4 = pointerInputChange2;
                            if (pointerInputChange4 != null) {
                                longRef3.element = pointerInputChange4.getId();
                                longRef = longRef3;
                            }
                        }
                        dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.L$0 = awaitPointerEventScope2;
                        dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.L$1 = longRef;
                        dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.label = 1;
                        awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1, 1, null);
                        if (awaitPointerEvent$default != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Ref.LongRef longRef4 = longRef;
                        obj = awaitPointerEvent$default;
                        longRef3 = longRef4;
                        PointerEvent pointerEvent2 = (PointerEvent) obj;
                        List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                        int size3 = changes3.size();
                        int i22 = 0;
                        while (true) {
                            if (i22 < size3) {
                            }
                            i22++;
                        }
                        PointerInputChange pointerInputChange32 = pointerInputChange;
                        if (pointerInputChange32 == null) {
                            pointerInputChange32 = null;
                        }
                    }
                    if (pointerInputChange32 == null || pointerInputChange32.isConsumed()) {
                        return null;
                    }
                    return pointerInputChange32;
                }
                ResultKt.throwOnFailure(obj);
                if (m550isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                    return null;
                }
                longRef = new Ref.LongRef();
                longRef.element = j;
                awaitPointerEventScope2 = awaitPointerEventScope;
                dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.L$0 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.L$1 = longRef;
                dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.label = 1;
                awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1, 1, null);
                if (awaitPointerEvent$default != coroutine_suspended) {
                }
            }
        }
        dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1 = new DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1(continuation);
        Object obj2 = dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.label;
        if (i == 0) {
        }
    }

    public static /* synthetic */ Object detectHorizontalDragGestures$default(PointerInputScope pointerInputScope, Function1 function1, Function0 function0, Function0 function02, Function2 function2, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit detectHorizontalDragGestures$lambda$0;
                    detectHorizontalDragGestures$lambda$0 = DragGestureDetectorKt.detectHorizontalDragGestures$lambda$0((Offset) obj2);
                    return detectHorizontalDragGestures$lambda$0;
                }
            };
        }
        if ((i & 2) != 0) {
            function0 = new Function0() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            };
        }
        if ((i & 4) != 0) {
            function02 = new Function0() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            };
        }
        Function0 function03 = function02;
        return detectHorizontalDragGestures(pointerInputScope, function1, function0, function03, function2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit detectHorizontalDragGestures$lambda$0(Offset offset) {
        return Unit.INSTANCE;
    }

    public static final Object detectHorizontalDragGestures(PointerInputScope pointerInputScope, Function1<? super Offset, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function2<? super PointerInputChange, ? super Float, Unit> function2, Continuation<? super Unit> continuation) {
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new DragGestureDetectorKt$detectHorizontalDragGestures$5(function1, function2, function0, function02, null), continuation);
        return awaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitEachGesture : Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x012d, code lost:
    
        if ((r0 == 0.0f) == false) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x008f -> B:10:0x0095). Please report as a decompilation issue!!! */
    /* renamed from: drag-VnAYq1g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m546dragVnAYq1g(AwaitPointerEventScope awaitPointerEventScope, long j, Function1<? super PointerInputChange, Unit> function1, Orientation orientation, Function1<? super PointerInputChange, Boolean> function12, Continuation<? super PointerInputChange> continuation) {
        DragGestureDetectorKt$drag$2 dragGestureDetectorKt$drag$2;
        int i;
        long j2;
        AwaitPointerEventScope awaitPointerEventScope2;
        Orientation orientation2;
        Function1<? super PointerInputChange, Boolean> function13;
        DragGestureDetectorKt$drag$2 dragGestureDetectorKt$drag$22;
        Function1<? super PointerInputChange, Unit> function14;
        Ref.LongRef longRef;
        AwaitPointerEventScope awaitPointerEventScope3;
        Object awaitPointerEvent$default;
        PointerEventPass pointerEventPass;
        Object obj;
        float intBitsToFloat;
        Object obj2;
        int i2;
        if (continuation instanceof DragGestureDetectorKt$drag$2) {
            dragGestureDetectorKt$drag$2 = (DragGestureDetectorKt$drag$2) continuation;
            if ((dragGestureDetectorKt$drag$2.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$drag$2.label -= Integer.MIN_VALUE;
                Object obj3 = dragGestureDetectorKt$drag$2.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$drag$2.label;
                int i3 = 1;
                PointerEventPass pointerEventPass2 = null;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj3);
                    j2 = j;
                    if (m550isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j2)) {
                        return null;
                    }
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    orientation2 = orientation;
                    function13 = function12;
                    dragGestureDetectorKt$drag$22 = dragGestureDetectorKt$drag$2;
                    function14 = function1;
                    longRef = new Ref.LongRef();
                    longRef.element = j2;
                    awaitPointerEventScope3 = awaitPointerEventScope2;
                    dragGestureDetectorKt$drag$22.L$0 = awaitPointerEventScope2;
                    dragGestureDetectorKt$drag$22.L$1 = function14;
                    dragGestureDetectorKt$drag$22.L$2 = orientation2;
                    dragGestureDetectorKt$drag$22.L$3 = function13;
                    dragGestureDetectorKt$drag$22.L$4 = awaitPointerEventScope3;
                    dragGestureDetectorKt$drag$22.L$5 = longRef;
                    dragGestureDetectorKt$drag$22.label = i3;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass2, dragGestureDetectorKt$drag$22, i3, pointerEventPass2);
                    if (awaitPointerEvent$default == coroutine_suspended) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Ref.LongRef longRef2 = (Ref.LongRef) dragGestureDetectorKt$drag$2.L$5;
                    awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$drag$2.L$4;
                    Function1<? super PointerInputChange, Boolean> function15 = (Function1) dragGestureDetectorKt$drag$2.L$3;
                    Orientation orientation3 = (Orientation) dragGestureDetectorKt$drag$2.L$2;
                    Function1<? super PointerInputChange, Unit> function16 = (Function1) dragGestureDetectorKt$drag$2.L$1;
                    AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) dragGestureDetectorKt$drag$2.L$0;
                    ResultKt.throwOnFailure(obj3);
                    dragGestureDetectorKt$drag$22 = dragGestureDetectorKt$drag$2;
                    function14 = function16;
                    Ref.LongRef longRef3 = longRef2;
                    orientation2 = orientation3;
                    function13 = function15;
                    PointerEvent pointerEvent = (PointerEvent) obj3;
                    List<PointerInputChange> changes = pointerEvent.getChanges();
                    int size = changes.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 < size) {
                            pointerEventPass = pointerEventPass2;
                            obj = pointerEventPass;
                            break;
                        }
                        obj = changes.get(i4);
                        pointerEventPass = pointerEventPass2;
                        i2 = i4;
                        if (PointerId.m6695equalsimpl0(((PointerInputChange) obj).getId(), longRef3.element)) {
                            break;
                        }
                        i4 = i2 + 1;
                        pointerEventPass2 = pointerEventPass;
                    }
                    PointerInputChange pointerInputChange = (PointerInputChange) obj;
                    if (pointerInputChange == 0) {
                        if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                            long positionChangeIgnoreConsumed = PointerEventKt.positionChangeIgnoreConsumed(pointerInputChange);
                            if (orientation2 == null) {
                                intBitsToFloat = Offset.m5146getDistanceimpl(positionChangeIgnoreConsumed);
                            } else if (orientation2 == Orientation.Vertical) {
                                intBitsToFloat = Float.intBitsToFloat((int) (positionChangeIgnoreConsumed & 4294967295L));
                            } else {
                                intBitsToFloat = Float.intBitsToFloat((int) (positionChangeIgnoreConsumed >> 32));
                            }
                        } else {
                            List<PointerInputChange> changes2 = pointerEvent.getChanges();
                            int size2 = changes2.size();
                            int i5 = 0;
                            while (true) {
                                if (i5 >= size2) {
                                    obj2 = pointerEventPass;
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
                                longRef3.element = pointerInputChange2.getId();
                                awaitPointerEventScope2 = awaitPointerEventScope4;
                                pointerEventPass2 = pointerEventPass;
                                i3 = 1;
                                longRef = longRef3;
                                dragGestureDetectorKt$drag$22.L$0 = awaitPointerEventScope2;
                                dragGestureDetectorKt$drag$22.L$1 = function14;
                                dragGestureDetectorKt$drag$22.L$2 = orientation2;
                                dragGestureDetectorKt$drag$22.L$3 = function13;
                                dragGestureDetectorKt$drag$22.L$4 = awaitPointerEventScope3;
                                dragGestureDetectorKt$drag$22.L$5 = longRef;
                                dragGestureDetectorKt$drag$22.label = i3;
                                awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass2, dragGestureDetectorKt$drag$22, i3, pointerEventPass2);
                                if (awaitPointerEvent$default == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                Ref.LongRef longRef4 = longRef;
                                awaitPointerEventScope4 = awaitPointerEventScope2;
                                obj3 = awaitPointerEvent$default;
                                longRef3 = longRef4;
                            }
                        }
                        PointerEvent pointerEvent2 = (PointerEvent) obj3;
                        List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                        int size3 = changes3.size();
                        int i42 = 0;
                        while (true) {
                            if (i42 < size3) {
                            }
                            i42 = i2 + 1;
                            pointerEventPass2 = pointerEventPass;
                        }
                        PointerInputChange pointerInputChange3 = (PointerInputChange) obj;
                        if (pointerInputChange3 == 0) {
                            pointerInputChange3 = pointerEventPass;
                        }
                    }
                    if (pointerInputChange3 == 0 || function13.invoke(pointerInputChange3).booleanValue()) {
                        return pointerEventPass;
                    }
                    if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                        return pointerInputChange3;
                    }
                    function14.invoke(pointerInputChange3);
                    j2 = pointerInputChange3.getId();
                    awaitPointerEventScope2 = awaitPointerEventScope4;
                    pointerEventPass2 = pointerEventPass;
                    i3 = 1;
                    longRef = new Ref.LongRef();
                    longRef.element = j2;
                    awaitPointerEventScope3 = awaitPointerEventScope2;
                    dragGestureDetectorKt$drag$22.L$0 = awaitPointerEventScope2;
                    dragGestureDetectorKt$drag$22.L$1 = function14;
                    dragGestureDetectorKt$drag$22.L$2 = orientation2;
                    dragGestureDetectorKt$drag$22.L$3 = function13;
                    dragGestureDetectorKt$drag$22.L$4 = awaitPointerEventScope3;
                    dragGestureDetectorKt$drag$22.L$5 = longRef;
                    dragGestureDetectorKt$drag$22.label = i3;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass2, dragGestureDetectorKt$drag$22, i3, pointerEventPass2);
                    if (awaitPointerEvent$default == coroutine_suspended) {
                    }
                }
            }
        }
        dragGestureDetectorKt$drag$2 = new DragGestureDetectorKt$drag$2(continuation);
        Object obj32 = dragGestureDetectorKt$drag$2.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$drag$2.label;
        int i32 = 1;
        PointerEventPass pointerEventPass22 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: drag-VnAYq1g$$forInline, reason: not valid java name */
    private static final Object m547dragVnAYq1g$$forInline(AwaitPointerEventScope awaitPointerEventScope, long j, Function1<? super PointerInputChange, Unit> function1, Orientation orientation, Function1<? super PointerInputChange, Boolean> function12, Continuation<? super PointerInputChange> continuation) {
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        PointerInputChange pointerInputChange3;
        long j2 = j;
        if (m550isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j2)) {
            return null;
        }
        while (true) {
            Ref.LongRef longRef = new Ref.LongRef();
            longRef.element = j2;
            while (true) {
                PointerEvent pointerEvent = (PointerEvent) AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, continuation, 1, null);
                List<PointerInputChange> changes = pointerEvent.getChanges();
                int size = changes.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        pointerInputChange = null;
                        break;
                    }
                    pointerInputChange = changes.get(i);
                    if (Boolean.valueOf(PointerId.m6695equalsimpl0(pointerInputChange.getId(), longRef.element)).booleanValue()) {
                        break;
                    }
                    i++;
                }
                pointerInputChange2 = pointerInputChange;
                if (pointerInputChange2 == null) {
                    pointerInputChange2 = null;
                    break;
                }
                if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                    List<PointerInputChange> changes2 = pointerEvent.getChanges();
                    int size2 = changes2.size();
                    while (true) {
                        if (r9 >= size2) {
                            pointerInputChange3 = null;
                            break;
                        }
                        pointerInputChange3 = changes2.get(r9);
                        if (Boolean.valueOf(pointerInputChange3.getPressed()).booleanValue()) {
                            break;
                        }
                        r9++;
                    }
                    PointerInputChange pointerInputChange4 = pointerInputChange3;
                    if (pointerInputChange4 == null) {
                        break;
                    }
                    longRef.element = pointerInputChange4.getId();
                } else {
                    long positionChangeIgnoreConsumed = PointerEventKt.positionChangeIgnoreConsumed(pointerInputChange2);
                    if (Boolean.valueOf(1 ^ ((orientation == null ? Offset.m5146getDistanceimpl(positionChangeIgnoreConsumed) : orientation == Orientation.Vertical ? Float.intBitsToFloat((int) (positionChangeIgnoreConsumed & 4294967295L)) : Float.intBitsToFloat((int) (positionChangeIgnoreConsumed >> 32))) == 0.0f ? 1 : 0)).booleanValue()) {
                        break;
                    }
                }
            }
            if (pointerInputChange2 == null || function12.invoke(pointerInputChange2).booleanValue()) {
                return null;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                return pointerInputChange2;
            }
            function1.invoke(pointerInputChange2);
            j2 = pointerInputChange2.getId();
        }
    }

    /* renamed from: awaitDragOrUp-jO51t88, reason: not valid java name */
    private static final Object m534awaitDragOrUpjO51t88(AwaitPointerEventScope awaitPointerEventScope, long j, Function1<? super PointerInputChange, Boolean> function1, Continuation<? super PointerInputChange> continuation) {
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = j;
        while (true) {
            PointerInputChange pointerInputChange3 = null;
            PointerEvent pointerEvent = (PointerEvent) AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, continuation, 1, null);
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    pointerInputChange = null;
                    break;
                }
                pointerInputChange = changes.get(i2);
                if (Boolean.valueOf(PointerId.m6695equalsimpl0(pointerInputChange.getId(), longRef.element)).booleanValue()) {
                    break;
                }
                i2++;
            }
            pointerInputChange2 = pointerInputChange;
            if (pointerInputChange2 == null) {
                return null;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                int size2 = changes2.size();
                while (true) {
                    if (i >= size2) {
                        break;
                    }
                    PointerInputChange pointerInputChange4 = changes2.get(i);
                    if (Boolean.valueOf(pointerInputChange4.getPressed()).booleanValue()) {
                        pointerInputChange3 = pointerInputChange4;
                        break;
                    }
                    i++;
                }
                PointerInputChange pointerInputChange5 = pointerInputChange3;
                if (pointerInputChange5 == null) {
                    break;
                }
                longRef.element = pointerInputChange5.getId();
            } else if (function1.invoke(pointerInputChange2).booleanValue()) {
                break;
            }
        }
        return pointerInputChange2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x019b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0191 -> B:11:0x0195). Please report as a decompilation issue!!! */
    /* renamed from: awaitPointerSlopOrCancellation-6ksA65w, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m539awaitPointerSlopOrCancellation6ksA65w(AwaitPointerEventScope awaitPointerEventScope, long j, int i, Orientation orientation, long j2, Function2<? super PointerInputChange, ? super Offset, Unit> function2, Continuation<? super PointerInputChange> continuation) {
        DragGestureDetectorKt$awaitPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitPointerSlopOrCancellation$1;
        int i2;
        float m551pointerSlopE8SPZFQ;
        Function2<? super PointerInputChange, ? super Offset, Unit> function22;
        Ref.LongRef longRef;
        DragGestureDetectorKt$awaitPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitPointerSlopOrCancellation$12;
        TouchSlopDetector touchSlopDetector;
        AwaitPointerEventScope awaitPointerEventScope2;
        Ref.LongRef longRef2;
        AwaitPointerEventScope awaitPointerEventScope3;
        Function2<? super PointerInputChange, ? super Offset, Unit> function23;
        TouchSlopDetector touchSlopDetector2;
        float f;
        int size;
        int i3;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        int i4;
        PointerInputChange pointerInputChange3;
        int i5;
        Object awaitPointerEvent$default;
        if (continuation instanceof DragGestureDetectorKt$awaitPointerSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$1 = (DragGestureDetectorKt$awaitPointerSlopOrCancellation$1) continuation;
            if ((dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.label -= Integer.MIN_VALUE;
                Object obj = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.label;
                int i6 = 1;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (m550isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                        return null;
                    }
                    m551pointerSlopE8SPZFQ = m551pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i);
                    Ref.LongRef longRef3 = new Ref.LongRef();
                    longRef3.element = j;
                    function22 = function2;
                    longRef = longRef3;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1;
                    touchSlopDetector = new TouchSlopDetector(orientation, j2, null);
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$0 = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$1 = function22;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$2 = longRef;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$3 = touchSlopDetector;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$4 = null;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.F$0 = m551pointerSlopE8SPZFQ;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.label = i6;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitPointerSlopOrCancellation$12, i6, null);
                    if (awaitPointerEvent$default != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i2 == 1) {
                    f = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.F$0;
                    touchSlopDetector2 = (TouchSlopDetector) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$3;
                    Ref.LongRef longRef4 = (Ref.LongRef) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$2;
                    function23 = (Function2) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$1;
                    awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    longRef2 = longRef4;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1;
                    Ref.LongRef longRef5 = longRef2;
                    PointerEvent pointerEvent = (PointerEvent) obj;
                    List<PointerInputChange> changes = pointerEvent.getChanges();
                    size = changes.size();
                    i3 = 0;
                    while (true) {
                        if (i3 < size) {
                        }
                        i3 = i5 + 1;
                    }
                    pointerInputChange2 = pointerInputChange;
                    if (pointerInputChange2 != null) {
                        return null;
                    }
                    if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                    }
                    i6 = i4;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$0 = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$1 = function22;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$2 = longRef;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$3 = touchSlopDetector;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$4 = null;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.F$0 = m551pointerSlopE8SPZFQ;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.label = i6;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitPointerSlopOrCancellation$12, i6, null);
                    if (awaitPointerEvent$default != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                float f2 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.F$0;
                PointerInputChange pointerInputChange4 = (PointerInputChange) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$4;
                TouchSlopDetector touchSlopDetector3 = (TouchSlopDetector) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$3;
                Ref.LongRef longRef6 = (Ref.LongRef) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$2;
                Function2<? super PointerInputChange, ? super Offset, Unit> function24 = (Function2) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$1;
                AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$0;
                ResultKt.throwOnFailure(obj);
                pointerInputChange2 = pointerInputChange4;
                char c = 2;
                dragGestureDetectorKt$awaitPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1;
                touchSlopDetector = touchSlopDetector3;
                m551pointerSlopE8SPZFQ = f2;
                awaitPointerEventScope2 = awaitPointerEventScope4;
                i4 = 1;
                Ref.LongRef longRef7 = longRef6;
                function23 = function24;
                if (!pointerInputChange2.isConsumed()) {
                    return null;
                }
                function22 = function23;
                longRef = longRef7;
                i6 = i4;
                dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$0 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$1 = function22;
                dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$2 = longRef;
                dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$3 = touchSlopDetector;
                dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$4 = null;
                dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.F$0 = m551pointerSlopE8SPZFQ;
                dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.label = i6;
                awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitPointerSlopOrCancellation$12, i6, null);
                if (awaitPointerEvent$default != coroutine_suspended) {
                    awaitPointerEventScope3 = awaitPointerEventScope2;
                    f = m551pointerSlopE8SPZFQ;
                    obj = awaitPointerEvent$default;
                    longRef2 = longRef;
                    function23 = function22;
                    touchSlopDetector2 = touchSlopDetector;
                    Ref.LongRef longRef52 = longRef2;
                    PointerEvent pointerEvent2 = (PointerEvent) obj;
                    List<PointerInputChange> changes2 = pointerEvent2.getChanges();
                    size = changes2.size();
                    i3 = 0;
                    while (true) {
                        if (i3 < size) {
                            pointerInputChange = null;
                            break;
                        }
                        pointerInputChange = changes2.get(i3);
                        i5 = i3;
                        if (PointerId.m6695equalsimpl0(pointerInputChange.getId(), longRef52.element)) {
                            break;
                        }
                        i3 = i5 + 1;
                    }
                    pointerInputChange2 = pointerInputChange;
                    if (pointerInputChange2 != null || pointerInputChange2.isConsumed()) {
                        return null;
                    }
                    if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                        List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                        int size2 = changes3.size();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size2) {
                                pointerInputChange3 = null;
                                break;
                            }
                            pointerInputChange3 = changes3.get(i7);
                            if (pointerInputChange3.getPressed()) {
                                break;
                            }
                            i7++;
                        }
                        PointerInputChange pointerInputChange5 = pointerInputChange3;
                        if (pointerInputChange5 == null) {
                            return null;
                        }
                        longRef52.element = pointerInputChange5.getId();
                        m551pointerSlopE8SPZFQ = f;
                        TouchSlopDetector touchSlopDetector4 = touchSlopDetector2;
                        i4 = 1;
                        function22 = function23;
                        awaitPointerEventScope2 = awaitPointerEventScope3;
                        longRef = longRef52;
                        touchSlopDetector = touchSlopDetector4;
                    } else {
                        float f3 = f;
                        TouchSlopDetector touchSlopDetector5 = touchSlopDetector2;
                        long m690addPositionsakrDWew = touchSlopDetector5.m690addPositionsakrDWew(pointerInputChange2.getPosition(), pointerInputChange2.getPreviousPosition(), f3);
                        m551pointerSlopE8SPZFQ = f3;
                        if ((9223372034707292159L & m690addPositionsakrDWew) != InlineClassHelperKt.UnspecifiedPackedFloats) {
                            function23.invoke(pointerInputChange2, Offset.m5137boximpl(m690addPositionsakrDWew));
                            if (pointerInputChange2.isConsumed()) {
                                return pointerInputChange2;
                            }
                            i4 = 1;
                            TouchSlopDetector.m689resetk4lQ0M$default(touchSlopDetector5, 0L, 1, null);
                            function22 = function23;
                            awaitPointerEventScope2 = awaitPointerEventScope3;
                            longRef = longRef52;
                            touchSlopDetector = touchSlopDetector5;
                        } else {
                            i4 = 1;
                            PointerEventPass pointerEventPass = PointerEventPass.Final;
                            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$0 = awaitPointerEventScope3;
                            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$1 = function23;
                            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$2 = longRef52;
                            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$3 = touchSlopDetector5;
                            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$4 = pointerInputChange2;
                            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.F$0 = m551pointerSlopE8SPZFQ;
                            c = 2;
                            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.label = 2;
                            if (awaitPointerEventScope3.awaitPointerEvent(pointerEventPass, dragGestureDetectorKt$awaitPointerSlopOrCancellation$12) != coroutine_suspended) {
                                longRef7 = longRef52;
                                touchSlopDetector = touchSlopDetector5;
                                awaitPointerEventScope2 = awaitPointerEventScope3;
                                if (!pointerInputChange2.isConsumed()) {
                                }
                            }
                        }
                    }
                    i6 = i4;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$0 = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$1 = function22;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$2 = longRef;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$3 = touchSlopDetector;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$4 = null;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.F$0 = m551pointerSlopE8SPZFQ;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.label = i6;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitPointerSlopOrCancellation$12, i6, null);
                    if (awaitPointerEvent$default != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
        }
        dragGestureDetectorKt$awaitPointerSlopOrCancellation$1 = new DragGestureDetectorKt$awaitPointerSlopOrCancellation$1(continuation);
        Object obj2 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.label;
        int i62 = 1;
        if (i2 != 0) {
        }
    }

    /* renamed from: awaitPointerSlopOrCancellation-6ksA65w$default, reason: not valid java name */
    public static /* synthetic */ Object m541awaitPointerSlopOrCancellation6ksA65w$default(AwaitPointerEventScope awaitPointerEventScope, long j, int i, Orientation orientation, long j2, Function2 function2, Continuation continuation, int i2, Object obj) {
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        long m5164getZeroF1C5BW0 = (i2 & 8) != 0 ? Offset.INSTANCE.m5164getZeroF1C5BW0() : j2;
        long j3 = j;
        if (m550isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j3)) {
            return null;
        }
        float m551pointerSlopE8SPZFQ = m551pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i);
        TouchSlopDetector touchSlopDetector = new TouchSlopDetector(orientation, m5164getZeroF1C5BW0, null);
        while (true) {
            PointerEvent pointerEvent = (PointerEvent) AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, continuation, 1, null);
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    pointerInputChange = null;
                    break;
                }
                pointerInputChange = changes.get(i4);
                if (PointerId.m6695equalsimpl0(pointerInputChange.getId(), j3)) {
                    break;
                }
                i4++;
            }
            PointerInputChange pointerInputChange3 = pointerInputChange;
            if (pointerInputChange3 == null || pointerInputChange3.isConsumed()) {
                return null;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                int size2 = changes2.size();
                while (true) {
                    if (i3 >= size2) {
                        pointerInputChange2 = null;
                        break;
                    }
                    pointerInputChange2 = changes2.get(i3);
                    if (pointerInputChange2.getPressed()) {
                        break;
                    }
                    i3++;
                }
                PointerInputChange pointerInputChange4 = pointerInputChange2;
                if (pointerInputChange4 == null) {
                    return null;
                }
                j3 = pointerInputChange4.getId();
            } else {
                float f = m551pointerSlopE8SPZFQ;
                TouchSlopDetector touchSlopDetector2 = touchSlopDetector;
                long m690addPositionsakrDWew = touchSlopDetector2.m690addPositionsakrDWew(pointerInputChange3.getPosition(), pointerInputChange3.getPreviousPosition(), f);
                if ((9223372034707292159L & m690addPositionsakrDWew) != InlineClassHelperKt.UnspecifiedPackedFloats) {
                    function2.invoke(pointerInputChange3, Offset.m5137boximpl(m690addPositionsakrDWew));
                    if (pointerInputChange3.isConsumed()) {
                        return pointerInputChange3;
                    }
                    TouchSlopDetector.m689resetk4lQ0M$default(touchSlopDetector2, 0L, 1, null);
                } else {
                    awaitPointerEventScope.awaitPointerEvent(PointerEventPass.Final, continuation);
                    if (pointerInputChange3.isConsumed()) {
                        return null;
                    }
                }
                m551pointerSlopE8SPZFQ = f;
                touchSlopDetector = touchSlopDetector2;
            }
        }
    }

    /* renamed from: awaitPointerSlopOrCancellation-6ksA65w$$forInline, reason: not valid java name */
    private static final Object m540awaitPointerSlopOrCancellation6ksA65w$$forInline(AwaitPointerEventScope awaitPointerEventScope, long j, int i, Orientation orientation, long j2, Function2<? super PointerInputChange, ? super Offset, Unit> function2, Continuation<? super PointerInputChange> continuation) {
        PointerInputChange pointerInputChange;
        TouchSlopDetector touchSlopDetector;
        float f;
        PointerInputChange pointerInputChange2;
        if (m550isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
            return null;
        }
        float m551pointerSlopE8SPZFQ = m551pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i);
        Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = j;
        TouchSlopDetector touchSlopDetector2 = new TouchSlopDetector(orientation, j2, null);
        while (true) {
            PointerEvent pointerEvent = (PointerEvent) AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, continuation, 1, null);
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    pointerInputChange = null;
                    break;
                }
                pointerInputChange = changes.get(i2);
                int i3 = i2;
                if (Boolean.valueOf(PointerId.m6695equalsimpl0(pointerInputChange.getId(), longRef.element)).booleanValue()) {
                    break;
                }
                i2 = i3 + 1;
            }
            PointerInputChange pointerInputChange3 = pointerInputChange;
            if (pointerInputChange3 == null || pointerInputChange3.isConsumed()) {
                return null;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                int size2 = changes2.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size2) {
                        pointerInputChange2 = null;
                        break;
                    }
                    pointerInputChange2 = changes2.get(i4);
                    if (Boolean.valueOf(pointerInputChange2.getPressed()).booleanValue()) {
                        break;
                    }
                    i4++;
                }
                PointerInputChange pointerInputChange4 = pointerInputChange2;
                if (pointerInputChange4 == null) {
                    return null;
                }
                longRef.element = pointerInputChange4.getId();
                float f2 = m551pointerSlopE8SPZFQ;
                touchSlopDetector = touchSlopDetector2;
                f = f2;
            } else {
                TouchSlopDetector touchSlopDetector3 = touchSlopDetector2;
                float f3 = m551pointerSlopE8SPZFQ;
                long m690addPositionsakrDWew = touchSlopDetector3.m690addPositionsakrDWew(pointerInputChange3.getPosition(), pointerInputChange3.getPreviousPosition(), f3);
                touchSlopDetector = touchSlopDetector3;
                f = f3;
                if ((9223372034707292159L & m690addPositionsakrDWew) != InlineClassHelperKt.UnspecifiedPackedFloats) {
                    function2.invoke(pointerInputChange3, Offset.m5137boximpl(m690addPositionsakrDWew));
                    if (pointerInputChange3.isConsumed()) {
                        return pointerInputChange3;
                    }
                    TouchSlopDetector.m689resetk4lQ0M$default(touchSlopDetector, 0L, 1, null);
                } else {
                    awaitPointerEventScope.awaitPointerEvent(PointerEventPass.Final, continuation);
                    if (pointerInputChange3.isConsumed()) {
                        return null;
                    }
                }
            }
            TouchSlopDetector touchSlopDetector4 = touchSlopDetector;
            m551pointerSlopE8SPZFQ = f;
            touchSlopDetector2 = touchSlopDetector4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x009d -> B:10:0x00a4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object awaitAllPointersUpWithSlopDetection(AwaitPointerEventScope awaitPointerEventScope, PointerInputChange pointerInputChange, PointerEventPass pointerEventPass, Continuation<? super Boolean> continuation) {
        DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1 dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1;
        int i;
        Ref.LongRef longRef;
        int i2;
        TouchSlopDetector touchSlopDetector;
        AwaitPointerEventScope awaitPointerEventScope2;
        float f;
        DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1 dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12;
        PointerEventPass pointerEventPass2;
        Object awaitPointerEvent;
        PointerInputChange pointerInputChange2;
        int size;
        int i3;
        PointerInputChange pointerInputChange3;
        PointerInputChange pointerInputChange4;
        int size2;
        int i4;
        if (continuation instanceof DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1) {
            dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1 = (DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1) continuation;
            if ((dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.label -= Integer.MIN_VALUE;
                Object obj = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.label;
                int i5 = 0;
                int i6 = 1;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    float f2 = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.F$0;
                    int i7 = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.I$0;
                    TouchSlopDetector touchSlopDetector2 = (TouchSlopDetector) dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.L$3;
                    Ref.LongRef longRef2 = (Ref.LongRef) dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.L$2;
                    PointerEventPass pointerEventPass3 = (PointerEventPass) dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.L$1;
                    AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    float f3 = f2;
                    TouchSlopDetector touchSlopDetector3 = touchSlopDetector2;
                    dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12 = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1;
                    pointerEventPass2 = pointerEventPass3;
                    longRef = longRef2;
                    PointerEvent pointerEvent = (PointerEvent) obj;
                    List<PointerInputChange> changes = pointerEvent.getChanges();
                    int size3 = changes.size();
                    int i8 = i5;
                    while (true) {
                        if (i8 < size3) {
                            pointerInputChange2 = null;
                            break;
                        }
                        PointerInputChange pointerInputChange5 = changes.get(i8);
                        if (PointerId.m6695equalsimpl0(pointerInputChange5.getId(), longRef.element)) {
                            pointerInputChange2 = pointerInputChange5;
                            break;
                        }
                        i8++;
                    }
                    PointerInputChange pointerInputChange6 = pointerInputChange2;
                    if (pointerInputChange6 != null || PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange6)) {
                        List<PointerInputChange> changes2 = pointerEvent.getChanges();
                        size = changes2.size();
                        i3 = 0;
                        while (true) {
                            if (i3 < size) {
                                pointerInputChange3 = null;
                                break;
                            }
                            PointerInputChange pointerInputChange7 = changes2.get(i3);
                            if (pointerInputChange7.getPressed()) {
                                pointerInputChange3 = pointerInputChange7;
                                break;
                            }
                            i3++;
                        }
                        pointerInputChange4 = pointerInputChange3;
                        if (pointerInputChange4 != null) {
                            return Boxing.boxBoolean(i7 != 0);
                        }
                        longRef.element = pointerInputChange4.getId();
                    } else if ((touchSlopDetector3.m690addPositionsakrDWew(pointerInputChange6.getPosition(), pointerInputChange6.getPreviousPosition(), f3) & 9223372034707292159L) != InlineClassHelperKt.UnspecifiedPackedFloats) {
                        i2 = 1;
                        List<PointerInputChange> changes3 = pointerEvent.getChanges();
                        size2 = changes3.size();
                        for (i4 = 0; i4 < size2; i4++) {
                            if (changes3.get(i4).getPressed()) {
                                awaitPointerEventScope2 = awaitPointerEventScope3;
                                touchSlopDetector = touchSlopDetector3;
                                f = f3;
                                i5 = 0;
                                i6 = 1;
                                dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.L$0 = awaitPointerEventScope2;
                                dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.L$1 = pointerEventPass2;
                                dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.L$2 = longRef;
                                dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.L$3 = touchSlopDetector;
                                dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.I$0 = i2;
                                dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.F$0 = f;
                                dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.label = i6;
                                awaitPointerEvent = awaitPointerEventScope2.awaitPointerEvent(pointerEventPass2, dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12);
                                if (awaitPointerEvent != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                awaitPointerEventScope3 = awaitPointerEventScope2;
                                obj = awaitPointerEvent;
                                f3 = f;
                                i7 = i2;
                                touchSlopDetector3 = touchSlopDetector;
                                PointerEvent pointerEvent2 = (PointerEvent) obj;
                                List<PointerInputChange> changes4 = pointerEvent2.getChanges();
                                int size32 = changes4.size();
                                int i82 = i5;
                                while (true) {
                                    if (i82 < size32) {
                                    }
                                    i82++;
                                }
                                PointerInputChange pointerInputChange62 = pointerInputChange2;
                                if (pointerInputChange62 != null) {
                                }
                                List<PointerInputChange> changes22 = pointerEvent2.getChanges();
                                size = changes22.size();
                                i3 = 0;
                                while (true) {
                                    if (i3 < size) {
                                    }
                                    i3++;
                                }
                                pointerInputChange4 = pointerInputChange3;
                                if (pointerInputChange4 != null) {
                                }
                            }
                        }
                        return Boxing.boxBoolean(i2 == 0);
                    }
                    i2 = i7;
                    List<PointerInputChange> changes32 = pointerEvent2.getChanges();
                    size2 = changes32.size();
                    while (i4 < size2) {
                    }
                    return Boxing.boxBoolean(i2 == 0);
                }
                ResultKt.throwOnFailure(obj);
                if (ForEachGestureKt.allPointersUp(awaitPointerEventScope)) {
                    return Boxing.boxBoolean(false);
                }
                Ref.LongRef longRef3 = new Ref.LongRef();
                longRef3.element = pointerInputChange.getId();
                float m551pointerSlopE8SPZFQ = m551pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), pointerInputChange.getType());
                longRef = longRef3;
                i2 = 0;
                touchSlopDetector = new TouchSlopDetector(null, 0L, 3, null);
                awaitPointerEventScope2 = awaitPointerEventScope;
                f = m551pointerSlopE8SPZFQ;
                dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12 = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1;
                pointerEventPass2 = pointerEventPass;
                dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.L$0 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.L$1 = pointerEventPass2;
                dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.L$2 = longRef;
                dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.L$3 = touchSlopDetector;
                dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.I$0 = i2;
                dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.F$0 = f;
                dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.label = i6;
                awaitPointerEvent = awaitPointerEventScope2.awaitPointerEvent(pointerEventPass2, dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12);
                if (awaitPointerEvent != coroutine_suspended) {
                }
            }
        }
        dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1 = new DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1(continuation);
        Object obj2 = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.label;
        int i52 = 0;
        int i62 = 1;
        if (i == 0) {
        }
    }

    public static /* synthetic */ Object awaitAllPointersUpWithSlopDetection$default(AwaitPointerEventScope awaitPointerEventScope, PointerInputChange pointerInputChange, PointerEventPass pointerEventPass, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return awaitAllPointersUpWithSlopDetection(awaitPointerEventScope, pointerInputChange, pointerEventPass, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b1 A[Catch: PointerEventTimeoutCancellationException -> 0x00ba, TRY_LEAVE, TryCatch #0 {PointerEventTimeoutCancellationException -> 0x00ba, blocks: (B:11:0x0033, B:12:0x00ad, B:14:0x00b1, B:36:0x0091), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r10v3, types: [kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r11v3, types: [T, androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Object] */
    /* renamed from: awaitLongPressOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m538awaitLongPressOrCancellationrnUCldI(AwaitPointerEventScope awaitPointerEventScope, long j, Continuation<? super PointerInputChange> continuation) {
        DragGestureDetectorKt$awaitLongPressOrCancellation$1 dragGestureDetectorKt$awaitLongPressOrCancellation$1;
        int i;
        PointerInputChange pointerInputChange;
        Ref.BooleanRef booleanRef;
        PointerInputChange pointerInputChange2;
        try {
            if (continuation instanceof DragGestureDetectorKt$awaitLongPressOrCancellation$1) {
                dragGestureDetectorKt$awaitLongPressOrCancellation$1 = (DragGestureDetectorKt$awaitLongPressOrCancellation$1) continuation;
                if ((dragGestureDetectorKt$awaitLongPressOrCancellation$1.label & Integer.MIN_VALUE) != 0) {
                    dragGestureDetectorKt$awaitLongPressOrCancellation$1.label -= Integer.MIN_VALUE;
                    Object obj = dragGestureDetectorKt$awaitLongPressOrCancellation$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = dragGestureDetectorKt$awaitLongPressOrCancellation$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        if (m550isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                            return null;
                        }
                        List<PointerInputChange> changes = awaitPointerEventScope.getCurrentEvent().getChanges();
                        int size = changes.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 >= size) {
                                pointerInputChange = null;
                                break;
                            }
                            pointerInputChange = changes.get(i2);
                            if (PointerId.m6695equalsimpl0(pointerInputChange.getId(), j)) {
                                break;
                            }
                            i2++;
                        }
                        PointerInputChange pointerInputChange3 = pointerInputChange;
                        if (pointerInputChange3 == 0) {
                            return null;
                        }
                        Ref.ObjectRef objectRef = new Ref.ObjectRef();
                        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                        objectRef2.element = pointerInputChange3;
                        long longPressTimeoutMillis = awaitPointerEventScope.getViewConfiguration().getLongPressTimeoutMillis();
                        Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                        DragGestureDetectorKt$awaitLongPressOrCancellation$2 dragGestureDetectorKt$awaitLongPressOrCancellation$2 = new DragGestureDetectorKt$awaitLongPressOrCancellation$2(booleanRef2, objectRef2, objectRef, null);
                        dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$0 = pointerInputChange3;
                        dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$1 = objectRef;
                        dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$2 = booleanRef2;
                        dragGestureDetectorKt$awaitLongPressOrCancellation$1.label = 1;
                        if (awaitPointerEventScope.withTimeout(longPressTimeoutMillis, dragGestureDetectorKt$awaitLongPressOrCancellation$2, dragGestureDetectorKt$awaitLongPressOrCancellation$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        booleanRef = booleanRef2;
                        j = objectRef;
                        pointerInputChange2 = pointerInputChange3;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        booleanRef = (Ref.BooleanRef) dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$2;
                        Ref.ObjectRef objectRef3 = (Ref.ObjectRef) dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$1;
                        PointerInputChange pointerInputChange4 = (PointerInputChange) dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        j = objectRef3;
                        pointerInputChange2 = pointerInputChange4;
                    }
                    if (booleanRef.element) {
                        return null;
                    }
                    PointerInputChange pointerInputChange5 = (PointerInputChange) j.element;
                    return pointerInputChange5 == null ? pointerInputChange2 : pointerInputChange5;
                }
            }
            if (i != 0) {
            }
            if (booleanRef.element) {
            }
        } catch (PointerEventTimeoutCancellationException unused) {
            PointerInputChange pointerInputChange6 = (PointerInputChange) j.element;
            return pointerInputChange6 == null ? pointerInputChange2 : pointerInputChange6;
        }
        dragGestureDetectorKt$awaitLongPressOrCancellation$1 = new DragGestureDetectorKt$awaitLongPressOrCancellation$1(continuation);
        Object obj2 = dragGestureDetectorKt$awaitLongPressOrCancellation$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$awaitLongPressOrCancellation$1.label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isPointerUp-DmW0f2w, reason: not valid java name */
    public static final boolean m550isPointerUpDmW0f2w(PointerEvent pointerEvent, long j) {
        PointerInputChange pointerInputChange;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                pointerInputChange = null;
                break;
            }
            pointerInputChange = changes.get(i);
            if (PointerId.m6695equalsimpl0(pointerInputChange.getId(), j)) {
                break;
            }
            i++;
        }
        PointerInputChange pointerInputChange2 = pointerInputChange;
        if (pointerInputChange2 != null && pointerInputChange2.getPressed()) {
            z = true;
        }
        return true ^ z;
    }

    /* renamed from: pointerSlop-E8SPZFQ, reason: not valid java name */
    public static final float m551pointerSlopE8SPZFQ(ViewConfiguration viewConfiguration, int i) {
        return PointerType.m6784equalsimpl0(i, PointerType.INSTANCE.m6789getMouseT8wyACA()) ? viewConfiguration.getTouchSlop() * mouseToTouchSlopRatio : viewConfiguration.getTouchSlop();
    }

    static {
        float m8227constructorimpl = Dp.m8227constructorimpl((float) 0.125d);
        mouseSlop = m8227constructorimpl;
        float m8227constructorimpl2 = Dp.m8227constructorimpl(18);
        defaultTouchSlop = m8227constructorimpl2;
        mouseToTouchSlopRatio = m8227constructorimpl / m8227constructorimpl2;
    }
}
