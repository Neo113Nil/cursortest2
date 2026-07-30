package androidx.compose.foundation.gestures;

import androidx.autofill.HintConstants;
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
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Ref;

/* compiled from: DragGestureDetector.kt */
@Metadata(d1 = {"\u0000|\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a!\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a5\u0010\r\u001a\u0004\u0018\u00010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00100\u000fH\u0082Hø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a!\u0010\u0013\u001a\u0004\u0018\u00010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\f\u001aa\u0010\u0015\u001a\u0004\u0018\u00010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u001726\u0010\u0018\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u001e0\u0019H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001aY\u0010!\u001a\u0004\u0018\u00010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n26\u0010\"\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u001e0\u0019H\u0086@ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a!\u0010%\u001a\u0004\u0018\u00010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b&\u0010\f\u001aM\u0010'\u001a\u0004\u0018\u00010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010(\u001a\u0004\u0018\u00010)2\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u001e0\u0019H\u0082Hø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001aY\u0010-\u001a\u0004\u0018\u00010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n26\u0010\"\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110*¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u001e0\u0019H\u0086@ø\u0001\u0000¢\u0006\u0004\b.\u0010$\u001a!\u0010/\u001a\u0004\u0018\u00010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b0\u0010\f\u001aa\u00101\u001a\u0004\u0018\u00010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u001726\u0010\"\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u001e0\u0019H\u0080@ø\u0001\u0000¢\u0006\u0004\b2\u0010 \u001aY\u00103\u001a\u0004\u0018\u00010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n26\u0010\"\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u001e0\u0019H\u0086@ø\u0001\u0000¢\u0006\u0004\b4\u0010$\u001a\u0080\u0001\u00105\u001a\u00020\u001e*\u0002062\u0014\b\u0002\u00107\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u001e0\u000f2\u000e\b\u0002\u00108\u001a\b\u0012\u0004\u0012\u00020\u001e092\u000e\b\u0002\u0010:\u001a\b\u0012\u0004\u0012\u00020\u001e0926\u0010;\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110*¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(<\u0012\u0004\u0012\u00020\u001e0\u0019H\u0086@¢\u0006\u0002\u0010=\u001aà\u0001\u00105\u001a\u00020\u001e*\u0002062K\u00107\u001aG\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(?\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(@\u0012\u0013\u0012\u00110*¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(A\u0012\u0004\u0012\u00020\u001e0>2!\u00108\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u001e0\u000f2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u001e092\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u0010092\b\u0010C\u001a\u0004\u0018\u00010)26\u0010;\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110*¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(<\u0012\u0004\u0012\u00020\u001e0\u0019H\u0080@¢\u0006\u0002\u0010D\u001a\u0080\u0001\u0010E\u001a\u00020\u001e*\u0002062\u0014\b\u0002\u00107\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u001e0\u000f2\u000e\b\u0002\u00108\u001a\b\u0012\u0004\u0012\u00020\u001e092\u000e\b\u0002\u0010:\u001a\b\u0012\u0004\u0012\u00020\u001e0926\u0010;\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110*¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(<\u0012\u0004\u0012\u00020\u001e0\u0019H\u0086@¢\u0006\u0002\u0010=\u001a\u0080\u0001\u0010F\u001a\u00020\u001e*\u0002062\u0014\b\u0002\u00107\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u001e0\u000f2\u000e\b\u0002\u00108\u001a\b\u0012\u0004\u0012\u00020\u001e092\u000e\b\u0002\u0010:\u001a\b\u0012\u0004\u0012\u00020\u001e0926\u0010G\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(<\u0012\u0004\u0012\u00020\u001e0\u0019H\u0086@¢\u0006\u0002\u0010=\u001a\u0080\u0001\u0010H\u001a\u00020\u001e*\u0002062\u0014\b\u0002\u00107\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u001e0\u000f2\u000e\b\u0002\u00108\u001a\b\u0012\u0004\u0012\u00020\u001e092\u000e\b\u0002\u0010:\u001a\b\u0012\u0004\u0012\u00020\u001e0926\u0010I\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(<\u0012\u0004\u0012\u00020\u001e0\u0019H\u0086@¢\u0006\u0002\u0010=\u001a3\u0010J\u001a\u00020\u0010*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001e0\u000fH\u0086@ø\u0001\u0000¢\u0006\u0004\bK\u0010\u0012\u001aS\u0010J\u001a\u0004\u0018\u00010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001e0\u000f2\b\u0010(\u001a\u0004\u0018\u00010)2\u0012\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00100\u000fH\u0080Hø\u0001\u0000¢\u0006\u0004\bM\u0010N\u001a3\u0010O\u001a\u00020\u0010*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001e0\u000fH\u0086@ø\u0001\u0000¢\u0006\u0004\bP\u0010\u0012\u001a\u001e\u0010Q\u001a\u00020\u0010*\u00020R2\u0006\u0010\t\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\bS\u0010T\u001a\u001e\u0010U\u001a\u00020\u0005*\u00020V2\u0006\u0010\u0016\u001a\u00020\u0017H\u0000ø\u0001\u0000¢\u0006\u0004\bW\u0010X\u001a3\u0010Y\u001a\u00020\u0010*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001e0\u000fH\u0086@ø\u0001\u0000¢\u0006\u0004\bZ\u0010\u0012\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006["}, d2 = {"defaultTouchSlop", "Landroidx/compose/ui/unit/Dp;", "F", "mouseSlop", "mouseToTouchSlopRatio", "", "awaitDragOrCancellation", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "pointerId", "Landroidx/compose/ui/input/pointer/PointerId;", "awaitDragOrCancellation-rnUCldI", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitDragOrUp", "hasDragged", "Lkotlin/Function1;", "", "awaitDragOrUp-jO51t88", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitHorizontalDragOrCancellation", "awaitHorizontalDragOrCancellation-rnUCldI", "awaitHorizontalPointerSlopOrCancellation", "pointerType", "Landroidx/compose/ui/input/pointer/PointerType;", "onPointerSlopReached", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "change", "overSlop", "", "awaitHorizontalPointerSlopOrCancellation-gDDlDlE", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitHorizontalTouchSlopOrCancellation", "onTouchSlopReached", "awaitHorizontalTouchSlopOrCancellation-jO51t88", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitLongPressOrCancellation", "awaitLongPressOrCancellation-rnUCldI", "awaitPointerSlopOrCancellation", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "Landroidx/compose/ui/geometry/Offset;", "awaitPointerSlopOrCancellation-pn7EDYM", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILandroidx/compose/foundation/gestures/Orientation;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitTouchSlopOrCancellation", "awaitTouchSlopOrCancellation-jO51t88", "awaitVerticalDragOrCancellation", "awaitVerticalDragOrCancellation-rnUCldI", "awaitVerticalPointerSlopOrCancellation", "awaitVerticalPointerSlopOrCancellation-gDDlDlE", "awaitVerticalTouchSlopOrCancellation", "awaitVerticalTouchSlopOrCancellation-jO51t88", "detectDragGestures", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "onDragStart", "onDragEnd", "Lkotlin/Function0;", "onDragCancel", "onDrag", "dragAmount", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function3;", "down", "slopTriggerChange", "overSlopOffset", "shouldAwaitTouchSlop", "orientationLock", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/gestures/Orientation;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detectDragGesturesAfterLongPress", "detectHorizontalDragGestures", "onHorizontalDrag", "detectVerticalDragGestures", "onVerticalDrag", "drag", "drag-jO51t88", "motionConsumed", "drag-VnAYq1g", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/jvm/functions/Function1;Landroidx/compose/foundation/gestures/Orientation;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "horizontalDrag", "horizontalDrag-jO51t88", "isPointerUp", "Landroidx/compose/ui/input/pointer/PointerEvent;", "isPointerUp-DmW0f2w", "(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z", "pointerSlop", "Landroidx/compose/ui/platform/ViewConfiguration;", "pointerSlop-E8SPZFQ", "(Landroidx/compose/ui/platform/ViewConfiguration;I)F", "verticalDrag", "verticalDrag-jO51t88", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DragGestureDetectorKt {
    private static final float defaultTouchSlop;
    private static final float mouseSlop;
    private static final float mouseToTouchSlopRatio;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x015b -> B:11:0x0161). Please report as a decompilation issue!!! */
    /* renamed from: awaitTouchSlopOrCancellation-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m416awaitTouchSlopOrCancellationjO51t88(AwaitPointerEventScope awaitPointerEventScope, long j, Function2<? super PointerInputChange, ? super Offset, Unit> function2, Continuation<? super PointerInputChange> continuation) {
        DragGestureDetectorKt$awaitTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitTouchSlopOrCancellation$1;
        int i;
        Function2<? super PointerInputChange, ? super Offset, Unit> function22;
        Ref.LongRef longRef;
        DragGestureDetectorKt$awaitTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitTouchSlopOrCancellation$12;
        float f;
        TouchSlopDetector touchSlopDetector;
        AwaitPointerEventScope awaitPointerEventScope2;
        Ref.LongRef longRef2;
        DragGestureDetectorKt$awaitTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitTouchSlopOrCancellation$13;
        float f2;
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
                PointerEventPass pointerEventPass = null;
                if (i == 0) {
                    if (i == 1) {
                        float f3 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.F$0;
                        TouchSlopDetector touchSlopDetector3 = (TouchSlopDetector) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$3;
                        Ref.LongRef longRef3 = (Ref.LongRef) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$2;
                        AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$1;
                        Function2<? super PointerInputChange, ? super Offset, Unit> function23 = (Function2) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        f2 = f3;
                        awaitPointerEventScope2 = awaitPointerEventScope3;
                        dragGestureDetectorKt$awaitTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1;
                        touchSlopDetector2 = touchSlopDetector3;
                        function22 = function23;
                        longRef2 = longRef3;
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
                            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                            }
                            i4 = 1;
                            pointerEventPass = null;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$0 = function22;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$2 = longRef;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$3 = touchSlopDetector;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$4 = pointerEventPass;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.F$0 = f;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.label = i4;
                            awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitTouchSlopOrCancellation$12, i4, pointerEventPass);
                            if (awaitPointerEvent$default != coroutine_suspended) {
                            }
                        }
                        return null;
                    }
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    float f4 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.F$0;
                    PointerInputChange pointerInputChange4 = (PointerInputChange) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$4;
                    TouchSlopDetector touchSlopDetector4 = (TouchSlopDetector) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$3;
                    longRef = (Ref.LongRef) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$2;
                    AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$1;
                    Function2<? super PointerInputChange, ? super Offset, Unit> function24 = (Function2) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    touchSlopDetector = touchSlopDetector4;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1;
                    f = f4;
                    awaitPointerEventScope2 = awaitPointerEventScope4;
                    if (!pointerInputChange4.isConsumed()) {
                        function22 = function24;
                        i4 = 1;
                        pointerEventPass = null;
                        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$0 = function22;
                        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$2 = longRef;
                        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$3 = touchSlopDetector;
                        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$4 = pointerEventPass;
                        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.F$0 = f;
                        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.label = i4;
                        awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitTouchSlopOrCancellation$12, i4, pointerEventPass);
                        if (awaitPointerEvent$default != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        float f5 = f;
                        touchSlopDetector2 = touchSlopDetector;
                        obj = awaitPointerEvent$default;
                        longRef2 = longRef;
                        dragGestureDetectorKt$awaitTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$12;
                        f2 = f5;
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
                            if (PointerId.m5028equalsimpl0(pointerInputChange.getId(), longRef2.element)) {
                                break;
                            }
                            i2 = i3 + 1;
                        }
                        pointerInputChange2 = pointerInputChange;
                        if (pointerInputChange2 != null && !pointerInputChange2.isConsumed()) {
                            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                                List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                                int size2 = changes3.size();
                                int i5 = 0;
                                while (true) {
                                    if (i5 >= size2) {
                                        pointerInputChange3 = null;
                                        break;
                                    }
                                    pointerInputChange3 = changes3.get(i5);
                                    if (pointerInputChange3.getPressed()) {
                                        break;
                                    }
                                    i5++;
                                }
                                PointerInputChange pointerInputChange5 = pointerInputChange3;
                                if (pointerInputChange5 != null) {
                                    longRef2.element = pointerInputChange5.getId();
                                    touchSlopDetector = touchSlopDetector2;
                                    f = f2;
                                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$13;
                                    longRef = longRef2;
                                }
                            } else {
                                Offset m504addPointerInputChangeGcwITfU = touchSlopDetector2.m504addPointerInputChangeGcwITfU(pointerInputChange2, f2);
                                if (m504addPointerInputChangeGcwITfU != null) {
                                    function22.invoke(pointerInputChange2, m504addPointerInputChangeGcwITfU);
                                    if (pointerInputChange2.isConsumed()) {
                                        return pointerInputChange2;
                                    }
                                    touchSlopDetector2.reset();
                                    touchSlopDetector = touchSlopDetector2;
                                    f = f2;
                                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$13;
                                    longRef = longRef2;
                                } else {
                                    PointerEventPass pointerEventPass2 = PointerEventPass.Final;
                                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$13.L$0 = function22;
                                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$13.L$1 = awaitPointerEventScope2;
                                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$13.L$2 = longRef2;
                                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$13.L$3 = touchSlopDetector2;
                                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$13.L$4 = pointerInputChange2;
                                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$13.F$0 = f2;
                                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$13.label = 2;
                                    if (awaitPointerEventScope2.awaitPointerEvent(pointerEventPass2, dragGestureDetectorKt$awaitTouchSlopOrCancellation$13) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    function24 = function22;
                                    touchSlopDetector = touchSlopDetector2;
                                    f = f2;
                                    pointerInputChange4 = pointerInputChange2;
                                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$13;
                                    longRef = longRef2;
                                    if (!pointerInputChange4.isConsumed()) {
                                    }
                                }
                            }
                            i4 = 1;
                            pointerEventPass = null;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$0 = function22;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$2 = longRef;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$3 = touchSlopDetector;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$4 = pointerEventPass;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.F$0 = f;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.label = i4;
                            awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitTouchSlopOrCancellation$12, i4, pointerEventPass);
                            if (awaitPointerEvent$default != coroutine_suspended) {
                            }
                        }
                    }
                    return null;
                }
                ResultKt.throwOnFailure(obj);
                int m5125getTouchT8wyACA = PointerType.INSTANCE.m5125getTouchT8wyACA();
                if (m424isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                    return null;
                }
                float m425pointerSlopE8SPZFQ = m425pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), m5125getTouchT8wyACA);
                Ref.LongRef longRef4 = new Ref.LongRef();
                longRef4.element = j;
                function22 = function2;
                longRef = longRef4;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1;
                f = m425pointerSlopE8SPZFQ;
                touchSlopDetector = new TouchSlopDetector(null);
                awaitPointerEventScope2 = awaitPointerEventScope;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$0 = function22;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$2 = longRef;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$3 = touchSlopDetector;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$4 = pointerEventPass;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.F$0 = f;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.label = i4;
                awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitTouchSlopOrCancellation$12, i4, pointerEventPass);
                if (awaitPointerEvent$default != coroutine_suspended) {
                }
            }
        }
        dragGestureDetectorKt$awaitTouchSlopOrCancellation$1 = new DragGestureDetectorKt$awaitTouchSlopOrCancellation$1(continuation);
        Object obj2 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.label;
        int i42 = 1;
        PointerEventPass pointerEventPass3 = null;
        if (i == 0) {
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
    public static final Object m422dragjO51t88(AwaitPointerEventScope awaitPointerEventScope, long j, Function1<? super PointerInputChange, Unit> function1, Continuation<? super Boolean> continuation) {
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
                    obj = m409awaitDragOrCancellationrnUCldI(awaitPointerEventScope, j, dragGestureDetectorKt$drag$1);
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
                        obj = m409awaitDragOrCancellationrnUCldI(awaitPointerEventScope, j, dragGestureDetectorKt$drag$1);
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

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cc, code lost:
    
        if (androidx.compose.ui.input.pointer.PointerEventKt.positionChangedIgnoreConsumed(r11) != false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0069 -> B:10:0x006e). Please report as a decompilation issue!!! */
    /* renamed from: awaitDragOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m409awaitDragOrCancellationrnUCldI(AwaitPointerEventScope awaitPointerEventScope, long j, Continuation<? super PointerInputChange> continuation) {
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
                        if (PointerId.m5028equalsimpl0(pointerInputChange.getId(), longRef3.element)) {
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
                if (m424isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
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
            function1 = new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$2
                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m427invokek4lQ0M(long j) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                    m427invokek4lQ0M(offset.getPackedValue());
                    return Unit.INSTANCE;
                }
            };
        }
        Function1 function12 = function1;
        if ((i & 2) != 0) {
            function0 = new Function0<Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            };
        }
        Function0 function03 = function0;
        if ((i & 4) != 0) {
            function02 = new Function0<Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$4
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            };
        }
        return detectDragGestures(pointerInputScope, function12, function03, function02, function2, continuation);
    }

    public static final Object detectDragGestures(PointerInputScope pointerInputScope, final Function1<? super Offset, Unit> function1, final Function0<Unit> function0, Function0<Unit> function02, Function2<? super PointerInputChange, ? super Offset, Unit> function2, Continuation<? super Unit> continuation) {
        Object detectDragGestures = detectDragGestures(pointerInputScope, new Function3<PointerInputChange, PointerInputChange, Offset, Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2, Offset offset) {
                m428invoke0AR0LA0(pointerInputChange, pointerInputChange2, offset.getPackedValue());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-0AR0LA0, reason: not valid java name */
            public final void m428invoke0AR0LA0(PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2, long j) {
                function1.invoke(Offset.m3588boximpl(pointerInputChange2.getPosition()));
            }
        }, new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange) {
                invoke2(pointerInputChange);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(PointerInputChange pointerInputChange) {
                function0.invoke();
            }
        }, function02, new Function0<Boolean>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$7
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return true;
            }
        }, null, function2, continuation);
        return detectDragGestures == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? detectDragGestures : Unit.INSTANCE;
    }

    public static final Object detectDragGestures(PointerInputScope pointerInputScope, Function3<? super PointerInputChange, ? super PointerInputChange, ? super Offset, Unit> function3, Function1<? super PointerInputChange, Unit> function1, Function0<Unit> function0, Function0<Boolean> function02, Orientation orientation, Function2<? super PointerInputChange, ? super Offset, Unit> function2, Continuation<? super Unit> continuation) {
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new DragGestureDetectorKt$detectDragGestures$9(function02, new Ref.LongRef(), orientation, function3, function2, function0, function1, null), continuation);
        return awaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitEachGesture : Unit.INSTANCE;
    }

    public static /* synthetic */ Object detectDragGesturesAfterLongPress$default(PointerInputScope pointerInputScope, Function1 function1, Function0 function0, Function0 function02, Function2 function2, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$2
                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m429invokek4lQ0M(long j) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                    m429invokek4lQ0M(offset.getPackedValue());
                    return Unit.INSTANCE;
                }
            };
        }
        Function1 function12 = function1;
        if ((i & 2) != 0) {
            function0 = new Function0<Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            };
        }
        Function0 function03 = function0;
        if ((i & 4) != 0) {
            function02 = new Function0<Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$4
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            };
        }
        return detectDragGesturesAfterLongPress(pointerInputScope, function12, function03, function02, function2, continuation);
    }

    public static final Object detectDragGesturesAfterLongPress(PointerInputScope pointerInputScope, Function1<? super Offset, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function2<? super PointerInputChange, ? super Offset, Unit> function2, Continuation<? super Unit> continuation) {
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new DragGestureDetectorKt$detectDragGesturesAfterLongPress$5(function1, function0, function02, function2, null), continuation);
        return awaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitEachGesture : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0168 -> B:11:0x016e). Please report as a decompilation issue!!! */
    /* renamed from: awaitVerticalTouchSlopOrCancellation-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m419awaitVerticalTouchSlopOrCancellationjO51t88(AwaitPointerEventScope awaitPointerEventScope, long j, Function2<? super PointerInputChange, ? super Float, Unit> function2, Continuation<? super PointerInputChange> continuation) {
        DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;
        int i;
        Ref.LongRef longRef;
        Function2<? super PointerInputChange, ? super Float, Unit> function22;
        DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12;
        float f;
        TouchSlopDetector touchSlopDetector;
        AwaitPointerEventScope awaitPointerEventScope2;
        Ref.LongRef longRef2;
        DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13;
        float f2;
        TouchSlopDetector touchSlopDetector2;
        int size;
        int i2;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        PointerInputChange pointerInputChange3;
        int i3;
        Object awaitPointerEvent$default;
        if (continuation instanceof DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 = (DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1) continuation;
            if ((dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.label -= Integer.MIN_VALUE;
                Object obj = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.label;
                int i4 = 1;
                PointerEventPass pointerEventPass = null;
                if (i == 0) {
                    if (i == 1) {
                        float f3 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.F$0;
                        TouchSlopDetector touchSlopDetector3 = (TouchSlopDetector) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$3;
                        Ref.LongRef longRef3 = (Ref.LongRef) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$2;
                        AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$1;
                        Function2<? super PointerInputChange, ? super Float, Unit> function23 = (Function2) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        f2 = f3;
                        awaitPointerEventScope2 = awaitPointerEventScope3;
                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;
                        touchSlopDetector2 = touchSlopDetector3;
                        function22 = function23;
                        longRef2 = longRef3;
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
                            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                            }
                            i4 = 1;
                            pointerEventPass = null;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$0 = function22;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$2 = longRef;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$3 = touchSlopDetector;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$4 = pointerEventPass;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.F$0 = f;
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
                    float f4 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.F$0;
                    PointerInputChange pointerInputChange4 = (PointerInputChange) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$4;
                    TouchSlopDetector touchSlopDetector4 = (TouchSlopDetector) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$3;
                    longRef = (Ref.LongRef) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$2;
                    AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$1;
                    Function2<? super PointerInputChange, ? super Float, Unit> function24 = (Function2) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    touchSlopDetector = touchSlopDetector4;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;
                    f = f4;
                    awaitPointerEventScope2 = awaitPointerEventScope4;
                    if (!pointerInputChange4.isConsumed()) {
                        function22 = function24;
                        i4 = 1;
                        pointerEventPass = null;
                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$0 = function22;
                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$2 = longRef;
                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$3 = touchSlopDetector;
                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$4 = pointerEventPass;
                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.F$0 = f;
                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.label = i4;
                        awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12, i4, pointerEventPass);
                        if (awaitPointerEvent$default != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        float f5 = f;
                        touchSlopDetector2 = touchSlopDetector;
                        obj = awaitPointerEvent$default;
                        longRef2 = longRef;
                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12;
                        f2 = f5;
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
                            if (PointerId.m5028equalsimpl0(pointerInputChange.getId(), longRef2.element)) {
                                break;
                            }
                            i2 = i3 + 1;
                        }
                        pointerInputChange2 = pointerInputChange;
                        if (pointerInputChange2 != null && !pointerInputChange2.isConsumed()) {
                            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                                List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                                int size2 = changes3.size();
                                int i5 = 0;
                                while (true) {
                                    if (i5 >= size2) {
                                        pointerInputChange3 = null;
                                        break;
                                    }
                                    pointerInputChange3 = changes3.get(i5);
                                    if (pointerInputChange3.getPressed()) {
                                        break;
                                    }
                                    i5++;
                                }
                                PointerInputChange pointerInputChange5 = pointerInputChange3;
                                if (pointerInputChange5 != null) {
                                    longRef2.element = pointerInputChange5.getId();
                                    touchSlopDetector = touchSlopDetector2;
                                    f = f2;
                                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13;
                                    longRef = longRef2;
                                }
                            } else {
                                Offset m504addPointerInputChangeGcwITfU = touchSlopDetector2.m504addPointerInputChangeGcwITfU(pointerInputChange2, f2);
                                if (m504addPointerInputChangeGcwITfU != null) {
                                    function22.invoke(pointerInputChange2, Boxing.boxFloat(Offset.m3600getYimpl(m504addPointerInputChangeGcwITfU.getPackedValue())));
                                    if (pointerInputChange2.isConsumed()) {
                                        return pointerInputChange2;
                                    }
                                    touchSlopDetector2.reset();
                                    touchSlopDetector = touchSlopDetector2;
                                    f = f2;
                                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13;
                                    longRef = longRef2;
                                } else {
                                    PointerEventPass pointerEventPass2 = PointerEventPass.Final;
                                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13.L$0 = function22;
                                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13.L$1 = awaitPointerEventScope2;
                                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13.L$2 = longRef2;
                                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13.L$3 = touchSlopDetector2;
                                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13.L$4 = pointerInputChange2;
                                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13.F$0 = f2;
                                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13.label = 2;
                                    if (awaitPointerEventScope2.awaitPointerEvent(pointerEventPass2, dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    function24 = function22;
                                    touchSlopDetector = touchSlopDetector2;
                                    f = f2;
                                    pointerInputChange4 = pointerInputChange2;
                                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13;
                                    longRef = longRef2;
                                    if (!pointerInputChange4.isConsumed()) {
                                    }
                                }
                            }
                            i4 = 1;
                            pointerEventPass = null;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$0 = function22;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$2 = longRef;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$3 = touchSlopDetector;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$4 = pointerEventPass;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.F$0 = f;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.label = i4;
                            awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12, i4, pointerEventPass);
                            if (awaitPointerEvent$default != coroutine_suspended) {
                            }
                        }
                    }
                    return null;
                }
                ResultKt.throwOnFailure(obj);
                int m5125getTouchT8wyACA = PointerType.INSTANCE.m5125getTouchT8wyACA();
                Orientation orientation = Orientation.Vertical;
                if (m424isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                    return null;
                }
                float m425pointerSlopE8SPZFQ = m425pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), m5125getTouchT8wyACA);
                longRef = new Ref.LongRef();
                longRef.element = j;
                TouchSlopDetector touchSlopDetector5 = new TouchSlopDetector(orientation);
                function22 = function2;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;
                f = m425pointerSlopE8SPZFQ;
                touchSlopDetector = touchSlopDetector5;
                awaitPointerEventScope2 = awaitPointerEventScope;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$0 = function22;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$2 = longRef;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$3 = touchSlopDetector;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$4 = pointerEventPass;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.F$0 = f;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.label = i4;
                awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12, i4, pointerEventPass);
                if (awaitPointerEvent$default != coroutine_suspended) {
                }
            }
        }
        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 = new DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1(continuation);
        Object obj2 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.label;
        int i42 = 1;
        PointerEventPass pointerEventPass3 = null;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0164 -> B:11:0x016a). Please report as a decompilation issue!!! */
    /* renamed from: awaitVerticalPointerSlopOrCancellation-gDDlDlE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m418awaitVerticalPointerSlopOrCancellationgDDlDlE(AwaitPointerEventScope awaitPointerEventScope, long j, int i, Function2<? super PointerInputChange, ? super Float, Unit> function2, Continuation<? super PointerInputChange> continuation) {
        DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;
        int i2;
        float m425pointerSlopE8SPZFQ;
        Ref.LongRef longRef;
        Function2<? super PointerInputChange, ? super Float, Unit> function22;
        TouchSlopDetector touchSlopDetector;
        AwaitPointerEventScope awaitPointerEventScope2;
        Ref.LongRef longRef2;
        float f;
        DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12;
        TouchSlopDetector touchSlopDetector2;
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
                PointerEventPass pointerEventPass = null;
                if (i2 == 0) {
                    if (i2 == 1) {
                        float f2 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$0;
                        TouchSlopDetector touchSlopDetector3 = (TouchSlopDetector) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$3;
                        Ref.LongRef longRef3 = (Ref.LongRef) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$2;
                        AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$1;
                        Function2<? super PointerInputChange, ? super Float, Unit> function23 = (Function2) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        f = f2;
                        awaitPointerEventScope2 = awaitPointerEventScope3;
                        DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$13 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;
                        touchSlopDetector2 = touchSlopDetector3;
                        function22 = function23;
                        longRef2 = longRef3;
                        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$13;
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
                            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                            }
                            i5 = 1;
                            pointerEventPass = null;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$0 = function22;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$1 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$2 = longRef;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$3 = touchSlopDetector;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$4 = pointerEventPass;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$0 = m425pointerSlopE8SPZFQ;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label = i5;
                            awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1, i5, pointerEventPass);
                            if (awaitPointerEvent$default != coroutine_suspended) {
                            }
                        }
                        return null;
                    }
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    float f3 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$0;
                    PointerInputChange pointerInputChange4 = (PointerInputChange) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$4;
                    TouchSlopDetector touchSlopDetector4 = (TouchSlopDetector) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$3;
                    longRef = (Ref.LongRef) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$2;
                    AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$1;
                    Function2<? super PointerInputChange, ? super Float, Unit> function24 = (Function2) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    touchSlopDetector = touchSlopDetector4;
                    m425pointerSlopE8SPZFQ = f3;
                    awaitPointerEventScope2 = awaitPointerEventScope4;
                    if (!pointerInputChange4.isConsumed()) {
                        function22 = function24;
                        i5 = 1;
                        pointerEventPass = null;
                        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$0 = function22;
                        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$1 = awaitPointerEventScope2;
                        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$2 = longRef;
                        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$3 = touchSlopDetector;
                        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$4 = pointerEventPass;
                        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$0 = m425pointerSlopE8SPZFQ;
                        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label = i5;
                        awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1, i5, pointerEventPass);
                        if (awaitPointerEvent$default != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$14 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;
                        touchSlopDetector2 = touchSlopDetector;
                        obj = awaitPointerEvent$default;
                        longRef2 = longRef;
                        f = m425pointerSlopE8SPZFQ;
                        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$14;
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
                            if (PointerId.m5028equalsimpl0(pointerInputChange.getId(), longRef2.element)) {
                                break;
                            }
                            i3 = i4 + 1;
                        }
                        pointerInputChange2 = pointerInputChange;
                        if (pointerInputChange2 != null && !pointerInputChange2.isConsumed()) {
                            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
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
                                if (pointerInputChange5 != null) {
                                    longRef2.element = pointerInputChange5.getId();
                                    touchSlopDetector = touchSlopDetector2;
                                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12;
                                    m425pointerSlopE8SPZFQ = f;
                                    longRef = longRef2;
                                }
                            } else {
                                Offset m504addPointerInputChangeGcwITfU = touchSlopDetector2.m504addPointerInputChangeGcwITfU(pointerInputChange2, f);
                                if (m504addPointerInputChangeGcwITfU != null) {
                                    function22.invoke(pointerInputChange2, Boxing.boxFloat(Offset.m3600getYimpl(m504addPointerInputChangeGcwITfU.getPackedValue())));
                                    if (pointerInputChange2.isConsumed()) {
                                        return pointerInputChange2;
                                    }
                                    touchSlopDetector2.reset();
                                    touchSlopDetector = touchSlopDetector2;
                                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12;
                                    m425pointerSlopE8SPZFQ = f;
                                    longRef = longRef2;
                                } else {
                                    PointerEventPass pointerEventPass2 = PointerEventPass.Final;
                                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$0 = function22;
                                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$2 = longRef2;
                                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$3 = touchSlopDetector2;
                                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$4 = pointerInputChange2;
                                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.F$0 = f;
                                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.label = 2;
                                    if (awaitPointerEventScope2.awaitPointerEvent(pointerEventPass2, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    function24 = function22;
                                    touchSlopDetector = touchSlopDetector2;
                                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12;
                                    pointerInputChange4 = pointerInputChange2;
                                    m425pointerSlopE8SPZFQ = f;
                                    longRef = longRef2;
                                    if (!pointerInputChange4.isConsumed()) {
                                    }
                                }
                            }
                            i5 = 1;
                            pointerEventPass = null;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$0 = function22;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$1 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$2 = longRef;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$3 = touchSlopDetector;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$4 = pointerEventPass;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$0 = m425pointerSlopE8SPZFQ;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label = i5;
                            awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1, i5, pointerEventPass);
                            if (awaitPointerEvent$default != coroutine_suspended) {
                            }
                        }
                    }
                    return null;
                }
                ResultKt.throwOnFailure(obj);
                Orientation orientation = Orientation.Vertical;
                if (m424isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                    return null;
                }
                m425pointerSlopE8SPZFQ = m425pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i);
                longRef = new Ref.LongRef();
                longRef.element = j;
                function22 = function2;
                touchSlopDetector = new TouchSlopDetector(orientation);
                awaitPointerEventScope2 = awaitPointerEventScope;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$0 = function22;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$1 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$2 = longRef;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$3 = touchSlopDetector;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$4 = pointerEventPass;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$0 = m425pointerSlopE8SPZFQ;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label = i5;
                awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1, i5, pointerEventPass);
                if (awaitPointerEvent$default != coroutine_suspended) {
                }
            }
        }
        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 = new DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1(continuation);
        Object obj2 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label;
        int i52 = 1;
        PointerEventPass pointerEventPass3 = null;
        if (i2 == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0115, code lost:
    
        if ((!r15) != false) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0086 -> B:10:0x008c). Please report as a decompilation issue!!! */
    /* renamed from: verticalDrag-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m426verticalDragjO51t88(AwaitPointerEventScope awaitPointerEventScope, long j, Function1<? super PointerInputChange, Unit> function1, Continuation<? super Boolean> continuation) {
        DragGestureDetectorKt$verticalDrag$1 dragGestureDetectorKt$verticalDrag$1;
        int i;
        long j2;
        Orientation orientation;
        DragGestureDetectorKt$verticalDrag$1 dragGestureDetectorKt$verticalDrag$12;
        AwaitPointerEventScope awaitPointerEventScope2;
        Function1<? super PointerInputChange, Unit> function12;
        int i2;
        Orientation orientation2;
        AwaitPointerEventScope awaitPointerEventScope3;
        Ref.LongRef longRef;
        Object awaitPointerEvent$default;
        AwaitPointerEventScope awaitPointerEventScope4;
        PointerInputChange pointerInputChange;
        float m3600getYimpl;
        boolean z;
        PointerInputChange pointerInputChange2;
        PointerInputChange pointerInputChange3;
        if (continuation instanceof DragGestureDetectorKt$verticalDrag$1) {
            dragGestureDetectorKt$verticalDrag$1 = (DragGestureDetectorKt$verticalDrag$1) continuation;
            if ((dragGestureDetectorKt$verticalDrag$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$verticalDrag$1.label -= Integer.MIN_VALUE;
                Object obj = dragGestureDetectorKt$verticalDrag$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$verticalDrag$1.label;
                PointerEventPass pointerEventPass = null;
                int i3 = 1;
                if (i == 0) {
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
                    int i4 = 0;
                    while (true) {
                        if (i4 < size) {
                            awaitPointerEventScope4 = awaitPointerEventScope3;
                            pointerInputChange = null;
                            break;
                        }
                        pointerInputChange = changes.get(i4);
                        awaitPointerEventScope4 = awaitPointerEventScope3;
                        if (PointerId.m5028equalsimpl0(pointerInputChange.getId(), longRef.element)) {
                            break;
                        }
                        i4++;
                        awaitPointerEventScope3 = awaitPointerEventScope4;
                    }
                    PointerInputChange pointerInputChange4 = pointerInputChange;
                    if (pointerInputChange4 == null) {
                        if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange4)) {
                            List<PointerInputChange> changes2 = pointerEvent.getChanges();
                            int size2 = changes2.size();
                            int i5 = 0;
                            while (true) {
                                if (i5 >= size2) {
                                    pointerInputChange2 = null;
                                    break;
                                }
                                pointerInputChange2 = changes2.get(i5);
                                if (pointerInputChange2.getPressed()) {
                                    break;
                                }
                                i5++;
                            }
                            PointerInputChange pointerInputChange5 = pointerInputChange2;
                            if (pointerInputChange5 == null) {
                                i2 = 1;
                                pointerInputChange3 = pointerInputChange4;
                            } else {
                                longRef.element = pointerInputChange5.getId();
                                i2 = 1;
                                awaitPointerEventScope3 = awaitPointerEventScope4;
                                i3 = i2;
                                awaitPointerEventScope2 = awaitPointerEventScope5;
                                dragGestureDetectorKt$verticalDrag$12 = dragGestureDetectorKt$verticalDrag$13;
                                pointerEventPass = null;
                                dragGestureDetectorKt$verticalDrag$12.L$0 = function12;
                                dragGestureDetectorKt$verticalDrag$12.L$1 = awaitPointerEventScope2;
                                dragGestureDetectorKt$verticalDrag$12.L$2 = orientation2;
                                dragGestureDetectorKt$verticalDrag$12.L$3 = awaitPointerEventScope3;
                                dragGestureDetectorKt$verticalDrag$12.L$4 = longRef;
                                dragGestureDetectorKt$verticalDrag$12.label = i3;
                                awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, dragGestureDetectorKt$verticalDrag$12, i3, pointerEventPass);
                                if (awaitPointerEvent$default == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                DragGestureDetectorKt$verticalDrag$1 dragGestureDetectorKt$verticalDrag$14 = dragGestureDetectorKt$verticalDrag$12;
                                awaitPointerEventScope5 = awaitPointerEventScope2;
                                obj = awaitPointerEvent$default;
                                dragGestureDetectorKt$verticalDrag$13 = dragGestureDetectorKt$verticalDrag$14;
                            }
                        } else {
                            long positionChangeIgnoreConsumed = PointerEventKt.positionChangeIgnoreConsumed(pointerInputChange4);
                            if (orientation2 == null) {
                                m3600getYimpl = Offset.m3597getDistanceimpl(positionChangeIgnoreConsumed);
                            } else {
                                m3600getYimpl = orientation2 == Orientation.Vertical ? Offset.m3600getYimpl(positionChangeIgnoreConsumed) : Offset.m3599getXimpl(positionChangeIgnoreConsumed);
                            }
                            if (m3600getYimpl == 0.0f) {
                                i2 = 1;
                                z = true;
                            } else {
                                i2 = 1;
                                z = false;
                            }
                            pointerInputChange3 = pointerInputChange4;
                        }
                        PointerEvent pointerEvent2 = (PointerEvent) obj;
                        List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                        int size3 = changes3.size();
                        int i42 = 0;
                        while (true) {
                            if (i42 < size3) {
                            }
                            i42++;
                            awaitPointerEventScope3 = awaitPointerEventScope4;
                        }
                        PointerInputChange pointerInputChange42 = pointerInputChange;
                        if (pointerInputChange42 == null) {
                            i2 = 1;
                            pointerInputChange3 = 0;
                        }
                    }
                    if (pointerInputChange3 == 0 || pointerInputChange3.isConsumed()) {
                        pointerEventPass = null;
                    } else if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                        pointerEventPass = pointerInputChange3;
                    } else {
                        function12.invoke(pointerInputChange3);
                        i3 = i2;
                        awaitPointerEventScope2 = awaitPointerEventScope5;
                        dragGestureDetectorKt$verticalDrag$12 = dragGestureDetectorKt$verticalDrag$13;
                        pointerEventPass = null;
                        orientation = orientation2;
                        j2 = pointerInputChange3.getId();
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
                        dragGestureDetectorKt$verticalDrag$12.label = i3;
                        awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, dragGestureDetectorKt$verticalDrag$12, i3, pointerEventPass);
                        if (awaitPointerEvent$default == coroutine_suspended) {
                        }
                    }
                    return Boxing.boxBoolean(pointerEventPass == null ? i2 : 0);
                }
                ResultKt.throwOnFailure(obj);
                Orientation orientation3 = Orientation.Vertical;
                j2 = j;
                if (!m424isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j2)) {
                    orientation = orientation3;
                    dragGestureDetectorKt$verticalDrag$12 = dragGestureDetectorKt$verticalDrag$1;
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    function12 = function1;
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
                    dragGestureDetectorKt$verticalDrag$12.label = i3;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, dragGestureDetectorKt$verticalDrag$12, i3, pointerEventPass);
                    if (awaitPointerEvent$default == coroutine_suspended) {
                    }
                } else {
                    i2 = 1;
                    return Boxing.boxBoolean(pointerEventPass == null ? i2 : 0);
                }
            }
        }
        dragGestureDetectorKt$verticalDrag$1 = new DragGestureDetectorKt$verticalDrag$1(continuation);
        Object obj2 = dragGestureDetectorKt$verticalDrag$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$verticalDrag$1.label;
        PointerEventPass pointerEventPass2 = null;
        int i32 = 1;
        if (i == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d8, code lost:
    
        if (((androidx.compose.ui.geometry.Offset.m3600getYimpl(androidx.compose.ui.input.pointer.PointerEventKt.positionChangeIgnoreConsumed(r11)) == 0.0f ? 1 : 0) ^ 1) != 0) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0069 -> B:10:0x006e). Please report as a decompilation issue!!! */
    /* renamed from: awaitVerticalDragOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m417awaitVerticalDragOrCancellationrnUCldI(AwaitPointerEventScope awaitPointerEventScope, long j, Continuation<? super PointerInputChange> continuation) {
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
                        if (PointerId.m5028equalsimpl0(pointerInputChange.getId(), longRef3.element)) {
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
                if (m424isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
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
            function1 = new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$2
                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m431invokek4lQ0M(long j) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                    m431invokek4lQ0M(offset.getPackedValue());
                    return Unit.INSTANCE;
                }
            };
        }
        Function1 function12 = function1;
        if ((i & 2) != 0) {
            function0 = new Function0<Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            };
        }
        Function0 function03 = function0;
        if ((i & 4) != 0) {
            function02 = new Function0<Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$4
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            };
        }
        return detectVerticalDragGestures(pointerInputScope, function12, function03, function02, function2, continuation);
    }

    public static final Object detectVerticalDragGestures(PointerInputScope pointerInputScope, Function1<? super Offset, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function2<? super PointerInputChange, ? super Float, Unit> function2, Continuation<? super Unit> continuation) {
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new DragGestureDetectorKt$detectVerticalDragGestures$5(function1, function2, function0, function02, null), continuation);
        return awaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitEachGesture : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0168 -> B:11:0x016e). Please report as a decompilation issue!!! */
    /* renamed from: awaitHorizontalTouchSlopOrCancellation-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m413awaitHorizontalTouchSlopOrCancellationjO51t88(AwaitPointerEventScope awaitPointerEventScope, long j, Function2<? super PointerInputChange, ? super Float, Unit> function2, Continuation<? super PointerInputChange> continuation) {
        DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;
        int i;
        Ref.LongRef longRef;
        Function2<? super PointerInputChange, ? super Float, Unit> function22;
        DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12;
        float f;
        TouchSlopDetector touchSlopDetector;
        AwaitPointerEventScope awaitPointerEventScope2;
        Ref.LongRef longRef2;
        DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13;
        float f2;
        TouchSlopDetector touchSlopDetector2;
        int size;
        int i2;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        PointerInputChange pointerInputChange3;
        int i3;
        Object awaitPointerEvent$default;
        if (continuation instanceof DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 = (DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1) continuation;
            if ((dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.label -= Integer.MIN_VALUE;
                Object obj = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.label;
                int i4 = 1;
                PointerEventPass pointerEventPass = null;
                if (i == 0) {
                    if (i == 1) {
                        float f3 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.F$0;
                        TouchSlopDetector touchSlopDetector3 = (TouchSlopDetector) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$3;
                        Ref.LongRef longRef3 = (Ref.LongRef) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$2;
                        AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$1;
                        Function2<? super PointerInputChange, ? super Float, Unit> function23 = (Function2) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        f2 = f3;
                        awaitPointerEventScope2 = awaitPointerEventScope3;
                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;
                        touchSlopDetector2 = touchSlopDetector3;
                        function22 = function23;
                        longRef2 = longRef3;
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
                            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                            }
                            i4 = 1;
                            pointerEventPass = null;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$0 = function22;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$2 = longRef;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$3 = touchSlopDetector;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$4 = pointerEventPass;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.F$0 = f;
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
                    float f4 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.F$0;
                    PointerInputChange pointerInputChange4 = (PointerInputChange) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$4;
                    TouchSlopDetector touchSlopDetector4 = (TouchSlopDetector) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$3;
                    longRef = (Ref.LongRef) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$2;
                    AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$1;
                    Function2<? super PointerInputChange, ? super Float, Unit> function24 = (Function2) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    touchSlopDetector = touchSlopDetector4;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;
                    f = f4;
                    awaitPointerEventScope2 = awaitPointerEventScope4;
                    if (!pointerInputChange4.isConsumed()) {
                        function22 = function24;
                        i4 = 1;
                        pointerEventPass = null;
                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$0 = function22;
                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$2 = longRef;
                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$3 = touchSlopDetector;
                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$4 = pointerEventPass;
                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.F$0 = f;
                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.label = i4;
                        awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12, i4, pointerEventPass);
                        if (awaitPointerEvent$default != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        float f5 = f;
                        touchSlopDetector2 = touchSlopDetector;
                        obj = awaitPointerEvent$default;
                        longRef2 = longRef;
                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12;
                        f2 = f5;
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
                            if (PointerId.m5028equalsimpl0(pointerInputChange.getId(), longRef2.element)) {
                                break;
                            }
                            i2 = i3 + 1;
                        }
                        pointerInputChange2 = pointerInputChange;
                        if (pointerInputChange2 != null && !pointerInputChange2.isConsumed()) {
                            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                                List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                                int size2 = changes3.size();
                                int i5 = 0;
                                while (true) {
                                    if (i5 >= size2) {
                                        pointerInputChange3 = null;
                                        break;
                                    }
                                    pointerInputChange3 = changes3.get(i5);
                                    if (pointerInputChange3.getPressed()) {
                                        break;
                                    }
                                    i5++;
                                }
                                PointerInputChange pointerInputChange5 = pointerInputChange3;
                                if (pointerInputChange5 != null) {
                                    longRef2.element = pointerInputChange5.getId();
                                    touchSlopDetector = touchSlopDetector2;
                                    f = f2;
                                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13;
                                    longRef = longRef2;
                                }
                            } else {
                                Offset m504addPointerInputChangeGcwITfU = touchSlopDetector2.m504addPointerInputChangeGcwITfU(pointerInputChange2, f2);
                                if (m504addPointerInputChangeGcwITfU != null) {
                                    function22.invoke(pointerInputChange2, Boxing.boxFloat(Offset.m3599getXimpl(m504addPointerInputChangeGcwITfU.getPackedValue())));
                                    if (pointerInputChange2.isConsumed()) {
                                        return pointerInputChange2;
                                    }
                                    touchSlopDetector2.reset();
                                    touchSlopDetector = touchSlopDetector2;
                                    f = f2;
                                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13;
                                    longRef = longRef2;
                                } else {
                                    PointerEventPass pointerEventPass2 = PointerEventPass.Final;
                                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13.L$0 = function22;
                                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13.L$1 = awaitPointerEventScope2;
                                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13.L$2 = longRef2;
                                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13.L$3 = touchSlopDetector2;
                                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13.L$4 = pointerInputChange2;
                                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13.F$0 = f2;
                                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13.label = 2;
                                    if (awaitPointerEventScope2.awaitPointerEvent(pointerEventPass2, dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    function24 = function22;
                                    touchSlopDetector = touchSlopDetector2;
                                    f = f2;
                                    pointerInputChange4 = pointerInputChange2;
                                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13;
                                    longRef = longRef2;
                                    if (!pointerInputChange4.isConsumed()) {
                                    }
                                }
                            }
                            i4 = 1;
                            pointerEventPass = null;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$0 = function22;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$2 = longRef;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$3 = touchSlopDetector;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$4 = pointerEventPass;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.F$0 = f;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.label = i4;
                            awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12, i4, pointerEventPass);
                            if (awaitPointerEvent$default != coroutine_suspended) {
                            }
                        }
                    }
                    return null;
                }
                ResultKt.throwOnFailure(obj);
                int m5125getTouchT8wyACA = PointerType.INSTANCE.m5125getTouchT8wyACA();
                Orientation orientation = Orientation.Horizontal;
                if (m424isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                    return null;
                }
                float m425pointerSlopE8SPZFQ = m425pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), m5125getTouchT8wyACA);
                longRef = new Ref.LongRef();
                longRef.element = j;
                TouchSlopDetector touchSlopDetector5 = new TouchSlopDetector(orientation);
                function22 = function2;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;
                f = m425pointerSlopE8SPZFQ;
                touchSlopDetector = touchSlopDetector5;
                awaitPointerEventScope2 = awaitPointerEventScope;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$0 = function22;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$2 = longRef;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$3 = touchSlopDetector;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$4 = pointerEventPass;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.F$0 = f;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.label = i4;
                awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12, i4, pointerEventPass);
                if (awaitPointerEvent$default != coroutine_suspended) {
                }
            }
        }
        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 = new DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1(continuation);
        Object obj2 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.label;
        int i42 = 1;
        PointerEventPass pointerEventPass3 = null;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0164 -> B:11:0x016a). Please report as a decompilation issue!!! */
    /* renamed from: awaitHorizontalPointerSlopOrCancellation-gDDlDlE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m412awaitHorizontalPointerSlopOrCancellationgDDlDlE(AwaitPointerEventScope awaitPointerEventScope, long j, int i, Function2<? super PointerInputChange, ? super Float, Unit> function2, Continuation<? super PointerInputChange> continuation) {
        DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;
        int i2;
        float m425pointerSlopE8SPZFQ;
        Ref.LongRef longRef;
        Function2<? super PointerInputChange, ? super Float, Unit> function22;
        TouchSlopDetector touchSlopDetector;
        AwaitPointerEventScope awaitPointerEventScope2;
        Ref.LongRef longRef2;
        float f;
        DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12;
        TouchSlopDetector touchSlopDetector2;
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
                PointerEventPass pointerEventPass = null;
                if (i2 == 0) {
                    if (i2 == 1) {
                        float f2 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$0;
                        TouchSlopDetector touchSlopDetector3 = (TouchSlopDetector) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$3;
                        Ref.LongRef longRef3 = (Ref.LongRef) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$2;
                        AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$1;
                        Function2<? super PointerInputChange, ? super Float, Unit> function23 = (Function2) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        f = f2;
                        awaitPointerEventScope2 = awaitPointerEventScope3;
                        DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$13 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;
                        touchSlopDetector2 = touchSlopDetector3;
                        function22 = function23;
                        longRef2 = longRef3;
                        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$13;
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
                            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                            }
                            i5 = 1;
                            pointerEventPass = null;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$0 = function22;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$1 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$2 = longRef;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$3 = touchSlopDetector;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$4 = pointerEventPass;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$0 = m425pointerSlopE8SPZFQ;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label = i5;
                            awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1, i5, pointerEventPass);
                            if (awaitPointerEvent$default != coroutine_suspended) {
                            }
                        }
                        return null;
                    }
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    float f3 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$0;
                    PointerInputChange pointerInputChange4 = (PointerInputChange) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$4;
                    TouchSlopDetector touchSlopDetector4 = (TouchSlopDetector) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$3;
                    longRef = (Ref.LongRef) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$2;
                    AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$1;
                    Function2<? super PointerInputChange, ? super Float, Unit> function24 = (Function2) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    touchSlopDetector = touchSlopDetector4;
                    m425pointerSlopE8SPZFQ = f3;
                    awaitPointerEventScope2 = awaitPointerEventScope4;
                    if (!pointerInputChange4.isConsumed()) {
                        function22 = function24;
                        i5 = 1;
                        pointerEventPass = null;
                        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$0 = function22;
                        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$1 = awaitPointerEventScope2;
                        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$2 = longRef;
                        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$3 = touchSlopDetector;
                        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$4 = pointerEventPass;
                        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$0 = m425pointerSlopE8SPZFQ;
                        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label = i5;
                        awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1, i5, pointerEventPass);
                        if (awaitPointerEvent$default != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$14 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;
                        touchSlopDetector2 = touchSlopDetector;
                        obj = awaitPointerEvent$default;
                        longRef2 = longRef;
                        f = m425pointerSlopE8SPZFQ;
                        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$14;
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
                            if (PointerId.m5028equalsimpl0(pointerInputChange.getId(), longRef2.element)) {
                                break;
                            }
                            i3 = i4 + 1;
                        }
                        pointerInputChange2 = pointerInputChange;
                        if (pointerInputChange2 != null && !pointerInputChange2.isConsumed()) {
                            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
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
                                if (pointerInputChange5 != null) {
                                    longRef2.element = pointerInputChange5.getId();
                                    touchSlopDetector = touchSlopDetector2;
                                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12;
                                    m425pointerSlopE8SPZFQ = f;
                                    longRef = longRef2;
                                }
                            } else {
                                Offset m504addPointerInputChangeGcwITfU = touchSlopDetector2.m504addPointerInputChangeGcwITfU(pointerInputChange2, f);
                                if (m504addPointerInputChangeGcwITfU != null) {
                                    function22.invoke(pointerInputChange2, Boxing.boxFloat(Offset.m3599getXimpl(m504addPointerInputChangeGcwITfU.getPackedValue())));
                                    if (pointerInputChange2.isConsumed()) {
                                        return pointerInputChange2;
                                    }
                                    touchSlopDetector2.reset();
                                    touchSlopDetector = touchSlopDetector2;
                                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12;
                                    m425pointerSlopE8SPZFQ = f;
                                    longRef = longRef2;
                                } else {
                                    PointerEventPass pointerEventPass2 = PointerEventPass.Final;
                                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$0 = function22;
                                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$2 = longRef2;
                                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$3 = touchSlopDetector2;
                                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$4 = pointerInputChange2;
                                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.F$0 = f;
                                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.label = 2;
                                    if (awaitPointerEventScope2.awaitPointerEvent(pointerEventPass2, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    function24 = function22;
                                    touchSlopDetector = touchSlopDetector2;
                                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12;
                                    pointerInputChange4 = pointerInputChange2;
                                    m425pointerSlopE8SPZFQ = f;
                                    longRef = longRef2;
                                    if (!pointerInputChange4.isConsumed()) {
                                    }
                                }
                            }
                            i5 = 1;
                            pointerEventPass = null;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$0 = function22;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$1 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$2 = longRef;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$3 = touchSlopDetector;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$4 = pointerEventPass;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$0 = m425pointerSlopE8SPZFQ;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label = i5;
                            awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1, i5, pointerEventPass);
                            if (awaitPointerEvent$default != coroutine_suspended) {
                            }
                        }
                    }
                    return null;
                }
                ResultKt.throwOnFailure(obj);
                Orientation orientation = Orientation.Horizontal;
                if (m424isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                    return null;
                }
                m425pointerSlopE8SPZFQ = m425pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i);
                longRef = new Ref.LongRef();
                longRef.element = j;
                function22 = function2;
                touchSlopDetector = new TouchSlopDetector(orientation);
                awaitPointerEventScope2 = awaitPointerEventScope;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$0 = function22;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$1 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$2 = longRef;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$3 = touchSlopDetector;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$4 = pointerEventPass;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$0 = m425pointerSlopE8SPZFQ;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label = i5;
                awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1, i5, pointerEventPass);
                if (awaitPointerEvent$default != coroutine_suspended) {
                }
            }
        }
        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 = new DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1(continuation);
        Object obj2 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label;
        int i52 = 1;
        PointerEventPass pointerEventPass3 = null;
        if (i2 == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0115, code lost:
    
        if ((!r15) != false) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0086 -> B:10:0x008c). Please report as a decompilation issue!!! */
    /* renamed from: horizontalDrag-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m423horizontalDragjO51t88(AwaitPointerEventScope awaitPointerEventScope, long j, Function1<? super PointerInputChange, Unit> function1, Continuation<? super Boolean> continuation) {
        DragGestureDetectorKt$horizontalDrag$1 dragGestureDetectorKt$horizontalDrag$1;
        int i;
        long j2;
        Orientation orientation;
        DragGestureDetectorKt$horizontalDrag$1 dragGestureDetectorKt$horizontalDrag$12;
        AwaitPointerEventScope awaitPointerEventScope2;
        Function1<? super PointerInputChange, Unit> function12;
        int i2;
        Orientation orientation2;
        AwaitPointerEventScope awaitPointerEventScope3;
        Ref.LongRef longRef;
        Object awaitPointerEvent$default;
        AwaitPointerEventScope awaitPointerEventScope4;
        PointerInputChange pointerInputChange;
        float m3600getYimpl;
        boolean z;
        PointerInputChange pointerInputChange2;
        PointerInputChange pointerInputChange3;
        if (continuation instanceof DragGestureDetectorKt$horizontalDrag$1) {
            dragGestureDetectorKt$horizontalDrag$1 = (DragGestureDetectorKt$horizontalDrag$1) continuation;
            if ((dragGestureDetectorKt$horizontalDrag$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$horizontalDrag$1.label -= Integer.MIN_VALUE;
                Object obj = dragGestureDetectorKt$horizontalDrag$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$horizontalDrag$1.label;
                PointerEventPass pointerEventPass = null;
                int i3 = 1;
                if (i == 0) {
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
                    int i4 = 0;
                    while (true) {
                        if (i4 < size) {
                            awaitPointerEventScope4 = awaitPointerEventScope3;
                            pointerInputChange = null;
                            break;
                        }
                        pointerInputChange = changes.get(i4);
                        awaitPointerEventScope4 = awaitPointerEventScope3;
                        if (PointerId.m5028equalsimpl0(pointerInputChange.getId(), longRef.element)) {
                            break;
                        }
                        i4++;
                        awaitPointerEventScope3 = awaitPointerEventScope4;
                    }
                    PointerInputChange pointerInputChange4 = pointerInputChange;
                    if (pointerInputChange4 == null) {
                        if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange4)) {
                            List<PointerInputChange> changes2 = pointerEvent.getChanges();
                            int size2 = changes2.size();
                            int i5 = 0;
                            while (true) {
                                if (i5 >= size2) {
                                    pointerInputChange2 = null;
                                    break;
                                }
                                pointerInputChange2 = changes2.get(i5);
                                if (pointerInputChange2.getPressed()) {
                                    break;
                                }
                                i5++;
                            }
                            PointerInputChange pointerInputChange5 = pointerInputChange2;
                            if (pointerInputChange5 == null) {
                                i2 = 1;
                                pointerInputChange3 = pointerInputChange4;
                            } else {
                                longRef.element = pointerInputChange5.getId();
                                i2 = 1;
                                awaitPointerEventScope3 = awaitPointerEventScope4;
                                i3 = i2;
                                awaitPointerEventScope2 = awaitPointerEventScope5;
                                dragGestureDetectorKt$horizontalDrag$12 = dragGestureDetectorKt$horizontalDrag$13;
                                pointerEventPass = null;
                                dragGestureDetectorKt$horizontalDrag$12.L$0 = function12;
                                dragGestureDetectorKt$horizontalDrag$12.L$1 = awaitPointerEventScope2;
                                dragGestureDetectorKt$horizontalDrag$12.L$2 = orientation2;
                                dragGestureDetectorKt$horizontalDrag$12.L$3 = awaitPointerEventScope3;
                                dragGestureDetectorKt$horizontalDrag$12.L$4 = longRef;
                                dragGestureDetectorKt$horizontalDrag$12.label = i3;
                                awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, dragGestureDetectorKt$horizontalDrag$12, i3, pointerEventPass);
                                if (awaitPointerEvent$default == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                DragGestureDetectorKt$horizontalDrag$1 dragGestureDetectorKt$horizontalDrag$14 = dragGestureDetectorKt$horizontalDrag$12;
                                awaitPointerEventScope5 = awaitPointerEventScope2;
                                obj = awaitPointerEvent$default;
                                dragGestureDetectorKt$horizontalDrag$13 = dragGestureDetectorKt$horizontalDrag$14;
                            }
                        } else {
                            long positionChangeIgnoreConsumed = PointerEventKt.positionChangeIgnoreConsumed(pointerInputChange4);
                            if (orientation2 == null) {
                                m3600getYimpl = Offset.m3597getDistanceimpl(positionChangeIgnoreConsumed);
                            } else {
                                m3600getYimpl = orientation2 == Orientation.Vertical ? Offset.m3600getYimpl(positionChangeIgnoreConsumed) : Offset.m3599getXimpl(positionChangeIgnoreConsumed);
                            }
                            if (m3600getYimpl == 0.0f) {
                                i2 = 1;
                                z = true;
                            } else {
                                i2 = 1;
                                z = false;
                            }
                            pointerInputChange3 = pointerInputChange4;
                        }
                        PointerEvent pointerEvent2 = (PointerEvent) obj;
                        List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                        int size3 = changes3.size();
                        int i42 = 0;
                        while (true) {
                            if (i42 < size3) {
                            }
                            i42++;
                            awaitPointerEventScope3 = awaitPointerEventScope4;
                        }
                        PointerInputChange pointerInputChange42 = pointerInputChange;
                        if (pointerInputChange42 == null) {
                            i2 = 1;
                            pointerInputChange3 = 0;
                        }
                    }
                    if (pointerInputChange3 == 0 || pointerInputChange3.isConsumed()) {
                        pointerEventPass = null;
                    } else if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                        pointerEventPass = pointerInputChange3;
                    } else {
                        function12.invoke(pointerInputChange3);
                        i3 = i2;
                        awaitPointerEventScope2 = awaitPointerEventScope5;
                        dragGestureDetectorKt$horizontalDrag$12 = dragGestureDetectorKt$horizontalDrag$13;
                        pointerEventPass = null;
                        orientation = orientation2;
                        j2 = pointerInputChange3.getId();
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
                        dragGestureDetectorKt$horizontalDrag$12.label = i3;
                        awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, dragGestureDetectorKt$horizontalDrag$12, i3, pointerEventPass);
                        if (awaitPointerEvent$default == coroutine_suspended) {
                        }
                    }
                    return Boxing.boxBoolean(pointerEventPass == null ? i2 : 0);
                }
                ResultKt.throwOnFailure(obj);
                Orientation orientation3 = Orientation.Horizontal;
                j2 = j;
                if (!m424isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j2)) {
                    orientation = orientation3;
                    dragGestureDetectorKt$horizontalDrag$12 = dragGestureDetectorKt$horizontalDrag$1;
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    function12 = function1;
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
                    dragGestureDetectorKt$horizontalDrag$12.label = i3;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, dragGestureDetectorKt$horizontalDrag$12, i3, pointerEventPass);
                    if (awaitPointerEvent$default == coroutine_suspended) {
                    }
                } else {
                    i2 = 1;
                    return Boxing.boxBoolean(pointerEventPass == null ? i2 : 0);
                }
            }
        }
        dragGestureDetectorKt$horizontalDrag$1 = new DragGestureDetectorKt$horizontalDrag$1(continuation);
        Object obj2 = dragGestureDetectorKt$horizontalDrag$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$horizontalDrag$1.label;
        PointerEventPass pointerEventPass2 = null;
        int i32 = 1;
        if (i == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d8, code lost:
    
        if (((androidx.compose.ui.geometry.Offset.m3599getXimpl(androidx.compose.ui.input.pointer.PointerEventKt.positionChangeIgnoreConsumed(r11)) == 0.0f ? 1 : 0) ^ 1) != 0) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0069 -> B:10:0x006e). Please report as a decompilation issue!!! */
    /* renamed from: awaitHorizontalDragOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m411awaitHorizontalDragOrCancellationrnUCldI(AwaitPointerEventScope awaitPointerEventScope, long j, Continuation<? super PointerInputChange> continuation) {
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
                        if (PointerId.m5028equalsimpl0(pointerInputChange.getId(), longRef3.element)) {
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
                if (m424isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
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
            function1 = new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$2
                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m430invokek4lQ0M(long j) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                    m430invokek4lQ0M(offset.getPackedValue());
                    return Unit.INSTANCE;
                }
            };
        }
        Function1 function12 = function1;
        if ((i & 2) != 0) {
            function0 = new Function0<Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            };
        }
        Function0 function03 = function0;
        if ((i & 4) != 0) {
            function02 = new Function0<Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$4
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            };
        }
        return detectHorizontalDragGestures(pointerInputScope, function12, function03, function02, function2, continuation);
    }

    public static final Object detectHorizontalDragGestures(PointerInputScope pointerInputScope, Function1<? super Offset, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function2<? super PointerInputChange, ? super Float, Unit> function2, Continuation<? super Unit> continuation) {
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new DragGestureDetectorKt$detectHorizontalDragGestures$5(function1, function2, function0, function02, null), continuation);
        return awaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitEachGesture : Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x011c, code lost:
    
        if ((!(r0 == 0.0f)) != false) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x008f -> B:10:0x0095). Please report as a decompilation issue!!! */
    /* renamed from: drag-VnAYq1g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m420dragVnAYq1g(AwaitPointerEventScope awaitPointerEventScope, long j, Function1<? super PointerInputChange, Unit> function1, Orientation orientation, Function1<? super PointerInputChange, Boolean> function12, Continuation<? super PointerInputChange> continuation) {
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
        AwaitPointerEventScope awaitPointerEventScope4;
        PointerInputChange pointerInputChange;
        float m3600getYimpl;
        PointerInputChange pointerInputChange2;
        int i2;
        if (continuation instanceof DragGestureDetectorKt$drag$2) {
            dragGestureDetectorKt$drag$2 = (DragGestureDetectorKt$drag$2) continuation;
            if ((dragGestureDetectorKt$drag$2.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$drag$2.label -= Integer.MIN_VALUE;
                Object obj = dragGestureDetectorKt$drag$2.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$drag$2.label;
                PointerEventPass pointerEventPass = null;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    j2 = j;
                    if (m424isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j2)) {
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
                    dragGestureDetectorKt$drag$22.label = 1;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, dragGestureDetectorKt$drag$22, 1, pointerEventPass);
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
                    AwaitPointerEventScope awaitPointerEventScope5 = (AwaitPointerEventScope) dragGestureDetectorKt$drag$2.L$0;
                    ResultKt.throwOnFailure(obj);
                    dragGestureDetectorKt$drag$22 = dragGestureDetectorKt$drag$2;
                    function14 = function16;
                    Ref.LongRef longRef3 = longRef2;
                    orientation2 = orientation3;
                    function13 = function15;
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
                        i2 = i3;
                        if (PointerId.m5028equalsimpl0(pointerInputChange.getId(), longRef3.element)) {
                            break;
                        }
                        i3 = i2 + 1;
                        awaitPointerEventScope3 = awaitPointerEventScope4;
                    }
                    PointerInputChange pointerInputChange3 = pointerInputChange;
                    if (pointerInputChange3 == null) {
                        if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                            long positionChangeIgnoreConsumed = PointerEventKt.positionChangeIgnoreConsumed(pointerInputChange3);
                            if (orientation2 == null) {
                                m3600getYimpl = Offset.m3597getDistanceimpl(positionChangeIgnoreConsumed);
                            } else {
                                m3600getYimpl = orientation2 == Orientation.Vertical ? Offset.m3600getYimpl(positionChangeIgnoreConsumed) : Offset.m3599getXimpl(positionChangeIgnoreConsumed);
                            }
                        } else {
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
                                longRef3.element = pointerInputChange4.getId();
                                awaitPointerEventScope3 = awaitPointerEventScope4;
                                pointerEventPass = null;
                                awaitPointerEventScope2 = awaitPointerEventScope5;
                                longRef = longRef3;
                                dragGestureDetectorKt$drag$22.L$0 = awaitPointerEventScope2;
                                dragGestureDetectorKt$drag$22.L$1 = function14;
                                dragGestureDetectorKt$drag$22.L$2 = orientation2;
                                dragGestureDetectorKt$drag$22.L$3 = function13;
                                dragGestureDetectorKt$drag$22.L$4 = awaitPointerEventScope3;
                                dragGestureDetectorKt$drag$22.L$5 = longRef;
                                dragGestureDetectorKt$drag$22.label = 1;
                                awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, dragGestureDetectorKt$drag$22, 1, pointerEventPass);
                                if (awaitPointerEvent$default == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                Ref.LongRef longRef4 = longRef;
                                awaitPointerEventScope5 = awaitPointerEventScope2;
                                obj = awaitPointerEvent$default;
                                longRef3 = longRef4;
                            }
                        }
                        PointerEvent pointerEvent2 = (PointerEvent) obj;
                        List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                        int size3 = changes3.size();
                        int i32 = 0;
                        while (true) {
                            if (i32 < size3) {
                            }
                            i32 = i2 + 1;
                            awaitPointerEventScope3 = awaitPointerEventScope4;
                        }
                        PointerInputChange pointerInputChange32 = pointerInputChange;
                        if (pointerInputChange32 == null) {
                            pointerInputChange32 = null;
                        }
                    }
                    if (pointerInputChange32 == null || function13.invoke(pointerInputChange32).booleanValue()) {
                        return null;
                    }
                    if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange32)) {
                        return pointerInputChange32;
                    }
                    function14.invoke(pointerInputChange32);
                    j2 = pointerInputChange32.getId();
                    pointerEventPass = null;
                    awaitPointerEventScope2 = awaitPointerEventScope5;
                    longRef = new Ref.LongRef();
                    longRef.element = j2;
                    awaitPointerEventScope3 = awaitPointerEventScope2;
                    dragGestureDetectorKt$drag$22.L$0 = awaitPointerEventScope2;
                    dragGestureDetectorKt$drag$22.L$1 = function14;
                    dragGestureDetectorKt$drag$22.L$2 = orientation2;
                    dragGestureDetectorKt$drag$22.L$3 = function13;
                    dragGestureDetectorKt$drag$22.L$4 = awaitPointerEventScope3;
                    dragGestureDetectorKt$drag$22.L$5 = longRef;
                    dragGestureDetectorKt$drag$22.label = 1;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, dragGestureDetectorKt$drag$22, 1, pointerEventPass);
                    if (awaitPointerEvent$default == coroutine_suspended) {
                    }
                }
            }
        }
        dragGestureDetectorKt$drag$2 = new DragGestureDetectorKt$drag$2(continuation);
        Object obj2 = dragGestureDetectorKt$drag$2.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$drag$2.label;
        PointerEventPass pointerEventPass2 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: drag-VnAYq1g$$forInline, reason: not valid java name */
    private static final Object m421dragVnAYq1g$$forInline(AwaitPointerEventScope awaitPointerEventScope, long j, Function1<? super PointerInputChange, Unit> function1, Orientation orientation, Function1<? super PointerInputChange, Boolean> function12, Continuation<? super PointerInputChange> continuation) {
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        PointerInputChange pointerInputChange3;
        long j2 = j;
        if (m424isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j2)) {
            return null;
        }
        while (true) {
            Ref.LongRef longRef = new Ref.LongRef();
            longRef.element = j2;
            while (true) {
                InlineMarker.mark(0);
                Object awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, continuation, 1, null);
                InlineMarker.mark(1);
                PointerEvent pointerEvent = (PointerEvent) awaitPointerEvent$default;
                List<PointerInputChange> changes = pointerEvent.getChanges();
                int size = changes.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        pointerInputChange = null;
                        break;
                    }
                    pointerInputChange = changes.get(i);
                    if (Boolean.valueOf(PointerId.m5028equalsimpl0(pointerInputChange.getId(), longRef.element)).booleanValue()) {
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
                        if (r2 >= size2) {
                            pointerInputChange3 = null;
                            break;
                        }
                        pointerInputChange3 = changes2.get(r2);
                        if (Boolean.valueOf(pointerInputChange3.getPressed()).booleanValue()) {
                            break;
                        }
                        r2++;
                    }
                    PointerInputChange pointerInputChange4 = pointerInputChange3;
                    if (pointerInputChange4 == null) {
                        break;
                    }
                    longRef.element = pointerInputChange4.getId();
                } else {
                    long positionChangeIgnoreConsumed = PointerEventKt.positionChangeIgnoreConsumed(pointerInputChange2);
                    if (Boolean.valueOf(((orientation == null ? Offset.m3597getDistanceimpl(positionChangeIgnoreConsumed) : orientation == Orientation.Vertical ? Offset.m3600getYimpl(positionChangeIgnoreConsumed) : Offset.m3599getXimpl(positionChangeIgnoreConsumed)) == 0.0f ? 1 : 0) ^ 1).booleanValue()) {
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
    private static final Object m410awaitDragOrUpjO51t88(AwaitPointerEventScope awaitPointerEventScope, long j, Function1<? super PointerInputChange, Boolean> function1, Continuation<? super PointerInputChange> continuation) {
        PointerInputChange pointerInputChange;
        Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = j;
        while (true) {
            int i = 0;
            InlineMarker.mark(0);
            PointerInputChange pointerInputChange2 = null;
            Object awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, continuation, 1, null);
            InlineMarker.mark(1);
            PointerEvent pointerEvent = (PointerEvent) awaitPointerEvent$default;
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    pointerInputChange = null;
                    break;
                }
                pointerInputChange = changes.get(i2);
                if (Boolean.valueOf(PointerId.m5028equalsimpl0(pointerInputChange.getId(), longRef.element)).booleanValue()) {
                    break;
                }
                i2++;
            }
            PointerInputChange pointerInputChange3 = pointerInputChange;
            if (pointerInputChange3 == null) {
                return null;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                int size2 = changes2.size();
                while (true) {
                    if (i >= size2) {
                        break;
                    }
                    PointerInputChange pointerInputChange4 = changes2.get(i);
                    if (Boolean.valueOf(pointerInputChange4.getPressed()).booleanValue()) {
                        pointerInputChange2 = pointerInputChange4;
                        break;
                    }
                    i++;
                }
                PointerInputChange pointerInputChange5 = pointerInputChange2;
                if (pointerInputChange5 == null) {
                    return pointerInputChange3;
                }
                longRef.element = pointerInputChange5.getId();
            } else if (function1.invoke(pointerInputChange3).booleanValue()) {
                return pointerInputChange3;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: awaitPointerSlopOrCancellation-pn7EDYM, reason: not valid java name */
    private static final Object m415awaitPointerSlopOrCancellationpn7EDYM(AwaitPointerEventScope awaitPointerEventScope, long j, int i, Orientation orientation, Function2<? super PointerInputChange, ? super Offset, Unit> function2, Continuation<? super PointerInputChange> continuation) {
        PointerInputChange pointerInputChange;
        Continuation<? super PointerEvent> continuation2;
        PointerInputChange pointerInputChange2;
        Continuation<? super PointerEvent> continuation3 = continuation;
        if (m424isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
            return null;
        }
        float m425pointerSlopE8SPZFQ = m425pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i);
        Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = j;
        TouchSlopDetector touchSlopDetector = new TouchSlopDetector(orientation);
        while (true) {
            InlineMarker.mark(0);
            Object awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, continuation3, 1, null);
            InlineMarker.mark(1);
            PointerEvent pointerEvent = (PointerEvent) awaitPointerEvent$default;
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    pointerInputChange = null;
                    break;
                }
                pointerInputChange = changes.get(i2);
                if (Boolean.valueOf(PointerId.m5028equalsimpl0(pointerInputChange.getId(), longRef.element)).booleanValue()) {
                    break;
                }
                i2++;
            }
            PointerInputChange pointerInputChange3 = pointerInputChange;
            if (pointerInputChange3 == null || pointerInputChange3.isConsumed()) {
                return null;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                int size2 = changes2.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size2) {
                        pointerInputChange2 = null;
                        break;
                    }
                    pointerInputChange2 = changes2.get(i3);
                    if (Boolean.valueOf(pointerInputChange2.getPressed()).booleanValue()) {
                        break;
                    }
                    i3++;
                }
                PointerInputChange pointerInputChange4 = pointerInputChange2;
                if (pointerInputChange4 == null) {
                    return null;
                }
                longRef.element = pointerInputChange4.getId();
            } else {
                Offset m504addPointerInputChangeGcwITfU = touchSlopDetector.m504addPointerInputChangeGcwITfU(pointerInputChange3, m425pointerSlopE8SPZFQ);
                if (m504addPointerInputChangeGcwITfU != null) {
                    function2.invoke(pointerInputChange3, m504addPointerInputChangeGcwITfU);
                    if (pointerInputChange3.isConsumed()) {
                        return pointerInputChange3;
                    }
                    touchSlopDetector.reset();
                } else {
                    PointerEventPass pointerEventPass = PointerEventPass.Final;
                    InlineMarker.mark(0);
                    continuation2 = continuation;
                    awaitPointerEventScope.awaitPointerEvent(pointerEventPass, continuation2);
                    InlineMarker.mark(1);
                    if (pointerInputChange3.isConsumed()) {
                        return null;
                    }
                    continuation3 = continuation2;
                }
            }
            continuation2 = continuation;
            continuation3 = continuation2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r10v2, types: [T, androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v6, types: [androidx.compose.ui.input.pointer.PointerInputChange] */
    /* renamed from: awaitLongPressOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m414awaitLongPressOrCancellationrnUCldI(AwaitPointerEventScope awaitPointerEventScope, long j, Continuation<? super PointerInputChange> continuation) {
        DragGestureDetectorKt$awaitLongPressOrCancellation$1 dragGestureDetectorKt$awaitLongPressOrCancellation$1;
        int i;
        PointerInputChange pointerInputChange;
        Object obj;
        Ref.ObjectRef objectRef;
        if (continuation instanceof DragGestureDetectorKt$awaitLongPressOrCancellation$1) {
            dragGestureDetectorKt$awaitLongPressOrCancellation$1 = (DragGestureDetectorKt$awaitLongPressOrCancellation$1) continuation;
            if ((dragGestureDetectorKt$awaitLongPressOrCancellation$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitLongPressOrCancellation$1.label -= Integer.MIN_VALUE;
                Object obj2 = dragGestureDetectorKt$awaitLongPressOrCancellation$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$awaitLongPressOrCancellation$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    if (m424isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
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
                        if (PointerId.m5028equalsimpl0(pointerInputChange.getId(), j)) {
                            break;
                        }
                        i2++;
                    }
                    obj = pointerInputChange;
                    if (obj == 0) {
                        return null;
                    }
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                    objectRef3.element = obj;
                    long longPressTimeoutMillis = awaitPointerEventScope.getViewConfiguration().getLongPressTimeoutMillis();
                    try {
                        DragGestureDetectorKt$awaitLongPressOrCancellation$2 dragGestureDetectorKt$awaitLongPressOrCancellation$2 = new DragGestureDetectorKt$awaitLongPressOrCancellation$2(objectRef3, objectRef2, null);
                        dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$0 = obj;
                        dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$1 = objectRef2;
                        dragGestureDetectorKt$awaitLongPressOrCancellation$1.label = 1;
                        if (awaitPointerEventScope.withTimeout(longPressTimeoutMillis, dragGestureDetectorKt$awaitLongPressOrCancellation$2, dragGestureDetectorKt$awaitLongPressOrCancellation$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return null;
                    } catch (PointerEventTimeoutCancellationException unused) {
                        objectRef = objectRef2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef = (Ref.ObjectRef) dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$1;
                    obj = (PointerInputChange) dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj2);
                        return null;
                    } catch (PointerEventTimeoutCancellationException unused2) {
                    }
                }
                PointerInputChange pointerInputChange2 = (PointerInputChange) objectRef.element;
                return pointerInputChange2 != null ? obj : pointerInputChange2;
            }
        }
        dragGestureDetectorKt$awaitLongPressOrCancellation$1 = new DragGestureDetectorKt$awaitLongPressOrCancellation$1(continuation);
        Object obj22 = dragGestureDetectorKt$awaitLongPressOrCancellation$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$awaitLongPressOrCancellation$1.label;
        if (i != 0) {
        }
        PointerInputChange pointerInputChange22 = (PointerInputChange) objectRef.element;
        if (pointerInputChange22 != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isPointerUp-DmW0f2w, reason: not valid java name */
    public static final boolean m424isPointerUpDmW0f2w(PointerEvent pointerEvent, long j) {
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
            if (PointerId.m5028equalsimpl0(pointerInputChange.getId(), j)) {
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
    public static final float m425pointerSlopE8SPZFQ(ViewConfiguration viewConfiguration, int i) {
        return PointerType.m5118equalsimpl0(i, PointerType.INSTANCE.m5123getMouseT8wyACA()) ? viewConfiguration.getTouchSlop() * mouseToTouchSlopRatio : viewConfiguration.getTouchSlop();
    }

    static {
        float m6299constructorimpl = Dp.m6299constructorimpl((float) 0.125d);
        mouseSlop = m6299constructorimpl;
        float m6299constructorimpl2 = Dp.m6299constructorimpl(18);
        defaultTouchSlop = m6299constructorimpl2;
        mouseToTouchSlopRatio = m6299constructorimpl / m6299constructorimpl2;
    }
}
