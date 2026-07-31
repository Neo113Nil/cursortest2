package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScopeKt;

/* compiled from: TapGestureDetector.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u008e\u0001\u0010\f\u001a\u00020\u0003*\u00020\u00002\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012*\b\u0002\u0010\n\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00062\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\u0086@ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000f\u001a\u00020\u0003*\u00020\u000eH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a!\u0010\u0013\u001a\u0004\u0018\u00010\u0011*\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a^\u0010\u0015\u001a\u00020\u0003*\u00020\u00002*\b\u0002\u0010\n\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00062\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\u0080@ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a!\u0010\u0019\u001a\u00020\u0011*\u00020\u000e2\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a'\u0010\u001d\u001a\u00020\u0011*\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u0011*\u00020\u000eH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0010\"<\u0010 \u001a$\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0000¢\u0006\u0006\n\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "", "onDoubleTap", "onLongPress", "Lkotlin/Function3;", "Landroidx/compose/foundation/gestures/PressGestureScope;", "Lkotlin/coroutines/Continuation;", "", "onPress", "onTap", "detectTapGestures", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "consumeUntilUp", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "firstUp", "awaitSecondDown", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerInputChange;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detectTapAndPress", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "requireUnconsumed", "awaitFirstDown", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "awaitFirstDownOnPass", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "waitForUpOrCancellation", "NoPressGesture", "Lkotlin/jvm/functions/Function3;", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TapGestureDetectorKt {
    private static final Function3 NoPressGesture = new TapGestureDetectorKt$NoPressGesture$1(null);

    public static /* synthetic */ Object detectTapGestures$default(PointerInputScope pointerInputScope, Function1 function1, Function1 function12, Function3 function3, Function1 function13, Continuation continuation, int i, Object obj) {
        Function1 function14 = (i & 1) != 0 ? null : function1;
        Function1 function15 = (i & 2) != 0 ? null : function12;
        if ((i & 4) != 0) {
            function3 = NoPressGesture;
        }
        return detectTapGestures(pointerInputScope, function14, function15, function3, (i & 8) != 0 ? null : function13, continuation);
    }

    public static final Object detectTapGestures(PointerInputScope pointerInputScope, Function1 function1, Function1 function12, Function3 function3, Function1 function13, Continuation continuation) {
        Object coroutineScope = CoroutineScopeKt.coroutineScope(new TapGestureDetectorKt$detectTapGestures$2(pointerInputScope, function3, function12, function1, function13, null), continuation);
        return coroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutineScope : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0052 A[LOOP:0: B:11:0x0050->B:12:0x0052, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0041 -> B:10:0x0044). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object consumeUntilUp(AwaitPointerEventScope awaitPointerEventScope, Continuation continuation) {
        TapGestureDetectorKt$consumeUntilUp$1 tapGestureDetectorKt$consumeUntilUp$1;
        int i;
        int size;
        int i2;
        int i3;
        int size2;
        if (continuation instanceof TapGestureDetectorKt$consumeUntilUp$1) {
            tapGestureDetectorKt$consumeUntilUp$1 = (TapGestureDetectorKt$consumeUntilUp$1) continuation;
            int i4 = tapGestureDetectorKt$consumeUntilUp$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                tapGestureDetectorKt$consumeUntilUp$1.label = i4 - Integer.MIN_VALUE;
                Object obj = tapGestureDetectorKt$consumeUntilUp$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = tapGestureDetectorKt$consumeUntilUp$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    tapGestureDetectorKt$consumeUntilUp$1.L$0 = awaitPointerEventScope;
                    tapGestureDetectorKt$consumeUntilUp$1.label = 1;
                    obj = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, tapGestureDetectorKt$consumeUntilUp$1, 1, null);
                    if (obj == coroutine_suspended) {
                    }
                    PointerEvent pointerEvent = (PointerEvent) obj;
                    List changes = pointerEvent.getChanges();
                    size = changes.size();
                    i2 = 0;
                    while (i3 < size) {
                    }
                    List changes2 = pointerEvent.getChanges();
                    size2 = changes2.size();
                    while (i2 < size2) {
                    }
                    return Unit.INSTANCE;
                }
                if (i == 1) {
                    awaitPointerEventScope = (AwaitPointerEventScope) tapGestureDetectorKt$consumeUntilUp$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    PointerEvent pointerEvent2 = (PointerEvent) obj;
                    List changes3 = pointerEvent2.getChanges();
                    size = changes3.size();
                    i2 = 0;
                    for (i3 = 0; i3 < size; i3++) {
                        ((PointerInputChange) changes3.get(i3)).consume();
                    }
                    List changes22 = pointerEvent2.getChanges();
                    size2 = changes22.size();
                    while (i2 < size2) {
                        if (((PointerInputChange) changes22.get(i2)).getPressed()) {
                            tapGestureDetectorKt$consumeUntilUp$1.L$0 = awaitPointerEventScope;
                            tapGestureDetectorKt$consumeUntilUp$1.label = 1;
                            obj = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, tapGestureDetectorKt$consumeUntilUp$1, 1, null);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            PointerEvent pointerEvent22 = (PointerEvent) obj;
                            List changes32 = pointerEvent22.getChanges();
                            size = changes32.size();
                            i2 = 0;
                            while (i3 < size) {
                            }
                            List changes222 = pointerEvent22.getChanges();
                            size2 = changes222.size();
                            while (i2 < size2) {
                            }
                        } else {
                            i2++;
                        }
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
        tapGestureDetectorKt$consumeUntilUp$1 = new TapGestureDetectorKt$consumeUntilUp$1(continuation);
        Object obj2 = tapGestureDetectorKt$consumeUntilUp$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = tapGestureDetectorKt$consumeUntilUp$1.label;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object awaitSecondDown(AwaitPointerEventScope awaitPointerEventScope, PointerInputChange pointerInputChange, Continuation continuation) {
        return awaitPointerEventScope.withTimeoutOrNull(awaitPointerEventScope.getViewConfiguration().getDoubleTapTimeoutMillis(), new TapGestureDetectorKt$awaitSecondDown$2(pointerInputChange, null), continuation);
    }

    public static final Object detectTapAndPress(PointerInputScope pointerInputScope, Function3 function3, Function1 function1, Continuation continuation) {
        Object forEachGesture = ForEachGestureKt.forEachGesture(pointerInputScope, new TapGestureDetectorKt$detectTapAndPress$2(new PressGestureScopeImpl(pointerInputScope), function3, function1, null), continuation);
        return forEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? forEachGesture : Unit.INSTANCE;
    }

    public static /* synthetic */ Object awaitFirstDown$default(AwaitPointerEventScope awaitPointerEventScope, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return awaitFirstDown(awaitPointerEventScope, z, continuation);
    }

    public static final Object awaitFirstDown(AwaitPointerEventScope awaitPointerEventScope, boolean z, Continuation continuation) {
        return awaitFirstDownOnPass(awaitPointerEventScope, PointerEventPass.Main, z, continuation);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004d -> B:10:0x0050). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object awaitFirstDownOnPass(androidx.compose.ui.input.pointer.AwaitPointerEventScope r9, androidx.compose.ui.input.pointer.PointerEventPass r10, boolean r11, kotlin.coroutines.Continuation r12) {
        /*
            boolean r0 = r12 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDownOnPass$1
            if (r0 == 0) goto L13
            r0 = r12
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDownOnPass$1 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDownOnPass$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDownOnPass$1 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDownOnPass$1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            boolean r9 = r0.Z$0
            java.lang.Object r10 = r0.L$1
            androidx.compose.ui.input.pointer.PointerEventPass r10 = (androidx.compose.ui.input.pointer.PointerEventPass) r10
            java.lang.Object r11 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r11 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r11
            kotlin.ResultKt.throwOnFailure(r12)
            r8 = r11
            r11 = r9
            r9 = r8
            goto L50
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3e:
            kotlin.ResultKt.throwOnFailure(r12)
        L41:
            r0.L$0 = r9
            r0.L$1 = r10
            r0.Z$0 = r11
            r0.label = r3
            java.lang.Object r12 = r9.awaitPointerEvent(r10, r0)
            if (r12 != r1) goto L50
            return r1
        L50:
            androidx.compose.ui.input.pointer.PointerEvent r12 = (androidx.compose.ui.input.pointer.PointerEvent) r12
            java.util.List r2 = r12.getChanges()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L5c:
            if (r6 >= r4) goto L76
            java.lang.Object r7 = r2.get(r6)
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
            if (r11 == 0) goto L6b
            boolean r7 = androidx.compose.ui.input.pointer.PointerEventKt.changedToDown(r7)
            goto L6f
        L6b:
            boolean r7 = androidx.compose.ui.input.pointer.PointerEventKt.changedToDownIgnoreConsumed(r7)
        L6f:
            if (r7 != 0) goto L73
            r2 = r5
            goto L77
        L73:
            int r6 = r6 + 1
            goto L5c
        L76:
            r2 = r3
        L77:
            if (r2 == 0) goto L41
            java.util.List r9 = r12.getChanges()
            java.lang.Object r9 = r9.get(r5)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDownOnPass(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.ui.input.pointer.PointerEventPass, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0095, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00a0 -> B:11:0x00a3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object waitForUpOrCancellation(AwaitPointerEventScope awaitPointerEventScope, Continuation continuation) {
        TapGestureDetectorKt$waitForUpOrCancellation$1 tapGestureDetectorKt$waitForUpOrCancellation$1;
        int i;
        int size;
        int i2;
        if (continuation instanceof TapGestureDetectorKt$waitForUpOrCancellation$1) {
            tapGestureDetectorKt$waitForUpOrCancellation$1 = (TapGestureDetectorKt$waitForUpOrCancellation$1) continuation;
            int i3 = tapGestureDetectorKt$waitForUpOrCancellation$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                tapGestureDetectorKt$waitForUpOrCancellation$1.label = i3 - Integer.MIN_VALUE;
                Object obj = tapGestureDetectorKt$waitForUpOrCancellation$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = tapGestureDetectorKt$waitForUpOrCancellation$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    PointerEventPass pointerEventPass = PointerEventPass.Main;
                    tapGestureDetectorKt$waitForUpOrCancellation$1.L$0 = awaitPointerEventScope;
                    tapGestureDetectorKt$waitForUpOrCancellation$1.label = 1;
                    obj = awaitPointerEventScope.awaitPointerEvent(pointerEventPass, tapGestureDetectorKt$waitForUpOrCancellation$1);
                    if (obj == coroutine_suspended) {
                    }
                    PointerEvent pointerEvent = (PointerEvent) obj;
                    List changes = pointerEvent.getChanges();
                    size = changes.size();
                    i2 = 0;
                    while (i2 < size) {
                    }
                    return pointerEvent.getChanges().get(0);
                }
                if (i == 1) {
                    awaitPointerEventScope = (AwaitPointerEventScope) tapGestureDetectorKt$waitForUpOrCancellation$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    PointerEvent pointerEvent2 = (PointerEvent) obj;
                    List changes2 = pointerEvent2.getChanges();
                    size = changes2.size();
                    i2 = 0;
                    while (i2 < size) {
                    }
                    return pointerEvent2.getChanges().get(0);
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                awaitPointerEventScope = (AwaitPointerEventScope) tapGestureDetectorKt$waitForUpOrCancellation$1.L$0;
                ResultKt.throwOnFailure(obj);
                List changes3 = ((PointerEvent) obj).getChanges();
                int size2 = changes3.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    if (((PointerInputChange) changes3.get(i4)).isConsumed()) {
                        return null;
                    }
                }
                PointerEventPass pointerEventPass2 = PointerEventPass.Main;
                tapGestureDetectorKt$waitForUpOrCancellation$1.L$0 = awaitPointerEventScope;
                tapGestureDetectorKt$waitForUpOrCancellation$1.label = 1;
                obj = awaitPointerEventScope.awaitPointerEvent(pointerEventPass2, tapGestureDetectorKt$waitForUpOrCancellation$1);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                PointerEvent pointerEvent22 = (PointerEvent) obj;
                List changes22 = pointerEvent22.getChanges();
                size = changes22.size();
                i2 = 0;
                while (i2 < size) {
                    if (PointerEventKt.changedToUp((PointerInputChange) changes22.get(i2))) {
                        i2++;
                    } else {
                        List changes4 = pointerEvent22.getChanges();
                        int size3 = changes4.size();
                        for (int i5 = 0; i5 < size3; i5++) {
                            PointerInputChange pointerInputChange = (PointerInputChange) changes4.get(i5);
                            if (pointerInputChange.isConsumed() || PointerEventKt.m1850isOutOfBoundsjwHxaWs(pointerInputChange, awaitPointerEventScope.mo1834getSizeYbymL2g(), awaitPointerEventScope.mo1833getExtendedTouchPaddingNHjbRc())) {
                                break;
                            }
                        }
                        PointerEventPass pointerEventPass3 = PointerEventPass.Final;
                        tapGestureDetectorKt$waitForUpOrCancellation$1.L$0 = awaitPointerEventScope;
                        tapGestureDetectorKt$waitForUpOrCancellation$1.label = 2;
                        obj = awaitPointerEventScope.awaitPointerEvent(pointerEventPass3, tapGestureDetectorKt$waitForUpOrCancellation$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        List changes32 = ((PointerEvent) obj).getChanges();
                        int size22 = changes32.size();
                        while (i4 < size22) {
                        }
                        PointerEventPass pointerEventPass22 = PointerEventPass.Main;
                        tapGestureDetectorKt$waitForUpOrCancellation$1.L$0 = awaitPointerEventScope;
                        tapGestureDetectorKt$waitForUpOrCancellation$1.label = 1;
                        obj = awaitPointerEventScope.awaitPointerEvent(pointerEventPass22, tapGestureDetectorKt$waitForUpOrCancellation$1);
                        if (obj == coroutine_suspended) {
                        }
                        PointerEvent pointerEvent222 = (PointerEvent) obj;
                        List changes222 = pointerEvent222.getChanges();
                        size = changes222.size();
                        i2 = 0;
                        while (i2 < size) {
                        }
                    }
                }
                return pointerEvent222.getChanges().get(0);
            }
        }
        tapGestureDetectorKt$waitForUpOrCancellation$1 = new TapGestureDetectorKt$waitForUpOrCancellation$1(continuation);
        Object obj2 = tapGestureDetectorKt$waitForUpOrCancellation$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = tapGestureDetectorKt$waitForUpOrCancellation$1.label;
        if (i != 0) {
        }
    }
}
