package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.platform.ViewConfiguration;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* compiled from: SelectionGestures.kt */
@Metadata(d1 = {"\u0000Z\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u001a\u0012\u0010\f\u001a\u00020\u0004*\u00020\rH\u0082@¢\u0006\u0002\u0010\u000e\u001a*\u0010\u000f\u001a\u00020\u0010*\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0004H\u0082@¢\u0006\u0002\u0010\u0016\u001a*\u0010\u0017\u001a\u00020\u0010*\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0004H\u0082@¢\u0006\u0002\u0010\u0016\u001a\u001c\u0010\u0018\u001a\u00020\u0019*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001cH\u0000\u001a\"\u0010\u001d\u001a\u00020\u0010*\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001cH\u0080@¢\u0006\u0002\u0010\u001f\u001a\"\u0010 \u001a\u00020\u0010*\u00020\r2\u0006\u0010\u0011\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u0004H\u0082@¢\u0006\u0002\u0010!\u001a\"\u0010\"\u001a\u00020\u0010*\u00020\r2\u0006\u0010\u0011\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u0004H\u0082@¢\u0006\u0002\u0010!\u001a\"\u0010$\u001a\u00020\u0010*\u00020\r2\u0006\u0010\u0011\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u0004H\u0082@¢\u0006\u0002\u0010!\u001a \u0010%\u001a\u00020\u0019*\u00020\u00192\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100'H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0018\u0010\u0002\u001a\u00020\u0003*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0005¨\u0006("}, d2 = {"STATIC_KEY", "", "isPrecisePointer", "", "Landroidx/compose/ui/input/pointer/PointerEvent;", "(Landroidx/compose/ui/input/pointer/PointerEvent;)Z", "distanceIsTolerable", "viewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "change1", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "change2", "awaitDown", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mouseSelection", "", "observer", "Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "clicksCounter", "Landroidx/compose/foundation/text/selection/ClicksCounter;", "down", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/foundation/text/selection/MouseSelectionObserver;Landroidx/compose/foundation/text/selection/ClicksCounter;Landroidx/compose/ui/input/pointer/PointerEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mouseSelectionBtf2", "selectionGestureInput", "Landroidx/compose/ui/Modifier;", "mouseSelectionObserver", "textDragObserver", "Landroidx/compose/foundation/text/TextDragObserver;", "selectionGesturePointerInputBtf2", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/foundation/text/selection/MouseSelectionObserver;Landroidx/compose/foundation/text/TextDragObserver;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "touchSelection", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/foundation/text/TextDragObserver;Landroidx/compose/ui/input/pointer/PointerEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "touchSelectionFirstPress", "downEvent", "touchSelectionSubsequentPress", "updateSelectionTouchMode", "updateTouchMode", "Lkotlin/Function1;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SelectionGesturesKt {
    private static final int STATIC_KEY = 8675309;

    public static final Modifier updateSelectionTouchMode(Modifier modifier, Function1<? super Boolean, Unit> function1) {
        return SuspendingPointerInputFilterKt.pointerInput(modifier, Integer.valueOf(STATIC_KEY), new SelectionGesturesKt$updateSelectionTouchMode$1(function1, null));
    }

    public static final Modifier selectionGestureInput(Modifier modifier, MouseSelectionObserver mouseSelectionObserver, TextDragObserver textDragObserver) {
        return SuspendingPointerInputFilterKt.pointerInput(modifier, mouseSelectionObserver, textDragObserver, new SelectionGesturesKt$selectionGestureInput$1(mouseSelectionObserver, textDragObserver, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00aa A[Catch: CancellationException -> 0x00d5, TryCatch #0 {CancellationException -> 0x00d5, blocks: (B:12:0x0032, B:13:0x00a2, B:15:0x00aa, B:17:0x00b9, B:19:0x00c5, B:21:0x00c8, B:24:0x00cb, B:28:0x00cf, B:32:0x004b, B:34:0x0072, B:36:0x0076, B:38:0x0080, B:42:0x0055), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cf A[Catch: CancellationException -> 0x00d5, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x00d5, blocks: (B:12:0x0032, B:13:0x00a2, B:15:0x00aa, B:17:0x00b9, B:19:0x00c5, B:21:0x00c8, B:24:0x00cb, B:28:0x00cf, B:32:0x004b, B:34:0x0072, B:36:0x0076, B:38:0x0080, B:42:0x0055), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object touchSelection(AwaitPointerEventScope awaitPointerEventScope, final TextDragObserver textDragObserver, PointerEvent pointerEvent, Continuation<? super Unit> continuation) {
        SelectionGesturesKt$touchSelection$1 selectionGesturesKt$touchSelection$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        try {
            if (continuation instanceof SelectionGesturesKt$touchSelection$1) {
                selectionGesturesKt$touchSelection$1 = (SelectionGesturesKt$touchSelection$1) continuation;
                if ((selectionGesturesKt$touchSelection$1.label & Integer.MIN_VALUE) != 0) {
                    selectionGesturesKt$touchSelection$1.label -= Integer.MIN_VALUE;
                    obj = selectionGesturesKt$touchSelection$1.result;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = selectionGesturesKt$touchSelection$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        pointerInputChange = (PointerInputChange) CollectionsKt.first((List) pointerEvent.getChanges());
                        long id = pointerInputChange.getId();
                        selectionGesturesKt$touchSelection$1.L$0 = awaitPointerEventScope;
                        selectionGesturesKt$touchSelection$1.L$1 = textDragObserver;
                        selectionGesturesKt$touchSelection$1.L$2 = pointerInputChange;
                        selectionGesturesKt$touchSelection$1.label = 1;
                        obj = DragGestureDetectorKt.m414awaitLongPressOrCancellationrnUCldI(awaitPointerEventScope, id, selectionGesturesKt$touchSelection$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            textDragObserver = (TextDragObserver) selectionGesturesKt$touchSelection$1.L$1;
                            awaitPointerEventScope = (AwaitPointerEventScope) selectionGesturesKt$touchSelection$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            if (((Boolean) obj).booleanValue()) {
                                List<PointerInputChange> changes = awaitPointerEventScope.getCurrentEvent().getChanges();
                                int size = changes.size();
                                for (int i2 = 0; i2 < size; i2++) {
                                    PointerInputChange pointerInputChange3 = changes.get(i2);
                                    if (PointerEventKt.changedToUp(pointerInputChange3)) {
                                        pointerInputChange3.consume();
                                    }
                                }
                                textDragObserver.onStop();
                            } else {
                                textDragObserver.onCancel();
                            }
                            return Unit.INSTANCE;
                        }
                        PointerInputChange pointerInputChange4 = (PointerInputChange) selectionGesturesKt$touchSelection$1.L$2;
                        textDragObserver = (TextDragObserver) selectionGesturesKt$touchSelection$1.L$1;
                        AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) selectionGesturesKt$touchSelection$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        pointerInputChange = pointerInputChange4;
                        awaitPointerEventScope = awaitPointerEventScope2;
                    }
                    pointerInputChange2 = (PointerInputChange) obj;
                    if (pointerInputChange2 != null && distanceIsTolerable(awaitPointerEventScope.getViewConfiguration(), pointerInputChange, pointerInputChange2)) {
                        textDragObserver.mo1060onStartk4lQ0M(pointerInputChange2.getPosition());
                        long id2 = pointerInputChange2.getId();
                        Function1<PointerInputChange, Unit> function1 = new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$2
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange5) {
                                invoke2(pointerInputChange5);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(PointerInputChange pointerInputChange5) {
                                TextDragObserver.this.mo1059onDragk4lQ0M(PointerEventKt.positionChange(pointerInputChange5));
                                pointerInputChange5.consume();
                            }
                        };
                        selectionGesturesKt$touchSelection$1.L$0 = awaitPointerEventScope;
                        selectionGesturesKt$touchSelection$1.L$1 = textDragObserver;
                        selectionGesturesKt$touchSelection$1.L$2 = null;
                        selectionGesturesKt$touchSelection$1.label = 2;
                        obj = DragGestureDetectorKt.m422dragjO51t88(awaitPointerEventScope, id2, function1, selectionGesturesKt$touchSelection$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        if (((Boolean) obj).booleanValue()) {
                        }
                    }
                    return Unit.INSTANCE;
                }
            }
            if (i != 0) {
            }
            pointerInputChange2 = (PointerInputChange) obj;
            if (pointerInputChange2 != null) {
                textDragObserver.mo1060onStartk4lQ0M(pointerInputChange2.getPosition());
                long id22 = pointerInputChange2.getId();
                Function1<PointerInputChange, Unit> function12 = new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$2
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange5) {
                        invoke2(pointerInputChange5);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(PointerInputChange pointerInputChange5) {
                        TextDragObserver.this.mo1059onDragk4lQ0M(PointerEventKt.positionChange(pointerInputChange5));
                        pointerInputChange5.consume();
                    }
                };
                selectionGesturesKt$touchSelection$1.L$0 = awaitPointerEventScope;
                selectionGesturesKt$touchSelection$1.L$1 = textDragObserver;
                selectionGesturesKt$touchSelection$1.L$2 = null;
                selectionGesturesKt$touchSelection$1.label = 2;
                obj = DragGestureDetectorKt.m422dragjO51t88(awaitPointerEventScope, id22, function12, selectionGesturesKt$touchSelection$1);
                if (obj == coroutine_suspended) {
                }
                if (((Boolean) obj).booleanValue()) {
                }
            }
            return Unit.INSTANCE;
        } catch (CancellationException e) {
            textDragObserver.onCancel();
            throw e;
        }
        selectionGesturesKt$touchSelection$1 = new SelectionGesturesKt$touchSelection$1(continuation);
        obj = selectionGesturesKt$touchSelection$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = selectionGesturesKt$touchSelection$1.label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object mouseSelection(AwaitPointerEventScope awaitPointerEventScope, final MouseSelectionObserver mouseSelectionObserver, ClicksCounter clicksCounter, PointerEvent pointerEvent, Continuation<? super Unit> continuation) {
        SelectionGesturesKt$mouseSelection$1 selectionGesturesKt$mouseSelection$1;
        int i;
        final SelectionAdjustment none;
        if (continuation instanceof SelectionGesturesKt$mouseSelection$1) {
            selectionGesturesKt$mouseSelection$1 = (SelectionGesturesKt$mouseSelection$1) continuation;
            if ((selectionGesturesKt$mouseSelection$1.label & Integer.MIN_VALUE) != 0) {
                selectionGesturesKt$mouseSelection$1.label -= Integer.MIN_VALUE;
                Object obj = selectionGesturesKt$mouseSelection$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = selectionGesturesKt$mouseSelection$1.label;
                int i2 = 0;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    clicksCounter.update(pointerEvent);
                    PointerInputChange pointerInputChange = pointerEvent.getChanges().get(0);
                    if (TextFieldSelectionManager_androidKt.isShiftPressed(pointerEvent)) {
                        if (mouseSelectionObserver.mo1273onExtendk4lQ0M(pointerInputChange.getPosition())) {
                            long id = pointerInputChange.getId();
                            Function1<PointerInputChange, Unit> function1 = new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionGesturesKt$mouseSelection$shouldConsumeUp$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange2) {
                                    invoke2(pointerInputChange2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(PointerInputChange pointerInputChange2) {
                                    if (MouseSelectionObserver.this.mo1274onExtendDragk4lQ0M(pointerInputChange2.getPosition())) {
                                        pointerInputChange2.consume();
                                    }
                                }
                            };
                            selectionGesturesKt$mouseSelection$1.L$0 = awaitPointerEventScope;
                            selectionGesturesKt$mouseSelection$1.L$1 = mouseSelectionObserver;
                            selectionGesturesKt$mouseSelection$1.label = 1;
                            obj = DragGestureDetectorKt.m422dragjO51t88(awaitPointerEventScope, id, function1, selectionGesturesKt$mouseSelection$1);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            if (((Boolean) obj).booleanValue()) {
                            }
                            mouseSelectionObserver.onDragDone();
                        }
                    } else {
                        int clicks = clicksCounter.getClicks();
                        if (clicks == 1) {
                            none = SelectionAdjustment.INSTANCE.getNone();
                        } else if (clicks == 2) {
                            none = SelectionAdjustment.INSTANCE.getWord();
                        } else {
                            none = SelectionAdjustment.INSTANCE.getParagraph();
                        }
                        if (mouseSelectionObserver.mo1275onStart3MmeM6k(pointerInputChange.getPosition(), none)) {
                            long id2 = pointerInputChange.getId();
                            Function1<PointerInputChange, Unit> function12 = new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionGesturesKt$mouseSelection$shouldConsumeUp$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange2) {
                                    invoke2(pointerInputChange2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(PointerInputChange pointerInputChange2) {
                                    if (MouseSelectionObserver.this.mo1272onDrag3MmeM6k(pointerInputChange2.getPosition(), none)) {
                                        pointerInputChange2.consume();
                                    }
                                }
                            };
                            selectionGesturesKt$mouseSelection$1.L$0 = awaitPointerEventScope;
                            selectionGesturesKt$mouseSelection$1.L$1 = mouseSelectionObserver;
                            selectionGesturesKt$mouseSelection$1.label = 2;
                            obj = DragGestureDetectorKt.m422dragjO51t88(awaitPointerEventScope, id2, function12, selectionGesturesKt$mouseSelection$1);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            if (((Boolean) obj).booleanValue()) {
                            }
                            mouseSelectionObserver.onDragDone();
                        }
                    }
                } else if (i == 1) {
                    mouseSelectionObserver = (MouseSelectionObserver) selectionGesturesKt$mouseSelection$1.L$1;
                    awaitPointerEventScope = (AwaitPointerEventScope) selectionGesturesKt$mouseSelection$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    if (((Boolean) obj).booleanValue()) {
                        List<PointerInputChange> changes = awaitPointerEventScope.getCurrentEvent().getChanges();
                        int size = changes.size();
                        while (i2 < size) {
                            PointerInputChange pointerInputChange2 = changes.get(i2);
                            if (PointerEventKt.changedToUp(pointerInputChange2)) {
                                pointerInputChange2.consume();
                            }
                            i2++;
                        }
                    }
                    mouseSelectionObserver.onDragDone();
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mouseSelectionObserver = (MouseSelectionObserver) selectionGesturesKt$mouseSelection$1.L$1;
                    awaitPointerEventScope = (AwaitPointerEventScope) selectionGesturesKt$mouseSelection$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    if (((Boolean) obj).booleanValue()) {
                        List<PointerInputChange> changes2 = awaitPointerEventScope.getCurrentEvent().getChanges();
                        int size2 = changes2.size();
                        while (i2 < size2) {
                            PointerInputChange pointerInputChange3 = changes2.get(i2);
                            if (PointerEventKt.changedToUp(pointerInputChange3)) {
                                pointerInputChange3.consume();
                            }
                            i2++;
                        }
                    }
                    mouseSelectionObserver.onDragDone();
                }
                return Unit.INSTANCE;
            }
        }
        selectionGesturesKt$mouseSelection$1 = new SelectionGesturesKt$mouseSelection$1(continuation);
        Object obj2 = selectionGesturesKt$mouseSelection$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = selectionGesturesKt$mouseSelection$1.label;
        int i22 = 0;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }

    public static final Object selectionGesturePointerInputBtf2(PointerInputScope pointerInputScope, MouseSelectionObserver mouseSelectionObserver, TextDragObserver textDragObserver, Continuation<? super Unit> continuation) {
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new SelectionGesturesKt$selectionGesturePointerInputBtf2$2(new ClicksCounter(pointerInputScope.getViewConfiguration()), mouseSelectionObserver, textDragObserver, null), continuation);
        return awaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitEachGesture : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00aa A[Catch: CancellationException -> 0x00d5, TryCatch #0 {CancellationException -> 0x00d5, blocks: (B:12:0x0032, B:13:0x00a2, B:15:0x00aa, B:17:0x00b9, B:19:0x00c5, B:21:0x00c8, B:24:0x00cb, B:28:0x00cf, B:32:0x004b, B:34:0x0072, B:36:0x0076, B:38:0x0080, B:42:0x0055), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cf A[Catch: CancellationException -> 0x00d5, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x00d5, blocks: (B:12:0x0032, B:13:0x00a2, B:15:0x00aa, B:17:0x00b9, B:19:0x00c5, B:21:0x00c8, B:24:0x00cb, B:28:0x00cf, B:32:0x004b, B:34:0x0072, B:36:0x0076, B:38:0x0080, B:42:0x0055), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object touchSelectionFirstPress(AwaitPointerEventScope awaitPointerEventScope, final TextDragObserver textDragObserver, PointerEvent pointerEvent, Continuation<? super Unit> continuation) {
        SelectionGesturesKt$touchSelectionFirstPress$1 selectionGesturesKt$touchSelectionFirstPress$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        try {
            if (continuation instanceof SelectionGesturesKt$touchSelectionFirstPress$1) {
                selectionGesturesKt$touchSelectionFirstPress$1 = (SelectionGesturesKt$touchSelectionFirstPress$1) continuation;
                if ((selectionGesturesKt$touchSelectionFirstPress$1.label & Integer.MIN_VALUE) != 0) {
                    selectionGesturesKt$touchSelectionFirstPress$1.label -= Integer.MIN_VALUE;
                    obj = selectionGesturesKt$touchSelectionFirstPress$1.result;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = selectionGesturesKt$touchSelectionFirstPress$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        pointerInputChange = (PointerInputChange) CollectionsKt.first((List) pointerEvent.getChanges());
                        long id = pointerInputChange.getId();
                        selectionGesturesKt$touchSelectionFirstPress$1.L$0 = awaitPointerEventScope;
                        selectionGesturesKt$touchSelectionFirstPress$1.L$1 = textDragObserver;
                        selectionGesturesKt$touchSelectionFirstPress$1.L$2 = pointerInputChange;
                        selectionGesturesKt$touchSelectionFirstPress$1.label = 1;
                        obj = DragGestureDetectorKt.m414awaitLongPressOrCancellationrnUCldI(awaitPointerEventScope, id, selectionGesturesKt$touchSelectionFirstPress$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            textDragObserver = (TextDragObserver) selectionGesturesKt$touchSelectionFirstPress$1.L$1;
                            awaitPointerEventScope = (AwaitPointerEventScope) selectionGesturesKt$touchSelectionFirstPress$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            if (((Boolean) obj).booleanValue()) {
                                List<PointerInputChange> changes = awaitPointerEventScope.getCurrentEvent().getChanges();
                                int size = changes.size();
                                for (int i2 = 0; i2 < size; i2++) {
                                    PointerInputChange pointerInputChange3 = changes.get(i2);
                                    if (PointerEventKt.changedToUp(pointerInputChange3)) {
                                        pointerInputChange3.consume();
                                    }
                                }
                                textDragObserver.onStop();
                            } else {
                                textDragObserver.onCancel();
                            }
                            return Unit.INSTANCE;
                        }
                        PointerInputChange pointerInputChange4 = (PointerInputChange) selectionGesturesKt$touchSelectionFirstPress$1.L$2;
                        textDragObserver = (TextDragObserver) selectionGesturesKt$touchSelectionFirstPress$1.L$1;
                        AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) selectionGesturesKt$touchSelectionFirstPress$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        pointerInputChange = pointerInputChange4;
                        awaitPointerEventScope = awaitPointerEventScope2;
                    }
                    pointerInputChange2 = (PointerInputChange) obj;
                    if (pointerInputChange2 != null && distanceIsTolerable(awaitPointerEventScope.getViewConfiguration(), pointerInputChange, pointerInputChange2)) {
                        textDragObserver.mo1060onStartk4lQ0M(pointerInputChange2.getPosition());
                        long id2 = pointerInputChange2.getId();
                        Function1<PointerInputChange, Unit> function1 = new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionFirstPress$dragCompletedWithUp$1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange5) {
                                invoke2(pointerInputChange5);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(PointerInputChange pointerInputChange5) {
                                TextDragObserver.this.mo1059onDragk4lQ0M(PointerEventKt.positionChange(pointerInputChange5));
                                pointerInputChange5.consume();
                            }
                        };
                        selectionGesturesKt$touchSelectionFirstPress$1.L$0 = awaitPointerEventScope;
                        selectionGesturesKt$touchSelectionFirstPress$1.L$1 = textDragObserver;
                        selectionGesturesKt$touchSelectionFirstPress$1.L$2 = null;
                        selectionGesturesKt$touchSelectionFirstPress$1.label = 2;
                        obj = DragGestureDetectorKt.m422dragjO51t88(awaitPointerEventScope, id2, function1, selectionGesturesKt$touchSelectionFirstPress$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        if (((Boolean) obj).booleanValue()) {
                        }
                    }
                    return Unit.INSTANCE;
                }
            }
            if (i != 0) {
            }
            pointerInputChange2 = (PointerInputChange) obj;
            if (pointerInputChange2 != null) {
                textDragObserver.mo1060onStartk4lQ0M(pointerInputChange2.getPosition());
                long id22 = pointerInputChange2.getId();
                Function1<PointerInputChange, Unit> function12 = new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionFirstPress$dragCompletedWithUp$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange5) {
                        invoke2(pointerInputChange5);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(PointerInputChange pointerInputChange5) {
                        TextDragObserver.this.mo1059onDragk4lQ0M(PointerEventKt.positionChange(pointerInputChange5));
                        pointerInputChange5.consume();
                    }
                };
                selectionGesturesKt$touchSelectionFirstPress$1.L$0 = awaitPointerEventScope;
                selectionGesturesKt$touchSelectionFirstPress$1.L$1 = textDragObserver;
                selectionGesturesKt$touchSelectionFirstPress$1.L$2 = null;
                selectionGesturesKt$touchSelectionFirstPress$1.label = 2;
                obj = DragGestureDetectorKt.m422dragjO51t88(awaitPointerEventScope, id22, function12, selectionGesturesKt$touchSelectionFirstPress$1);
                if (obj == coroutine_suspended) {
                }
                if (((Boolean) obj).booleanValue()) {
                }
            }
            return Unit.INSTANCE;
        } catch (CancellationException e) {
            textDragObserver.onCancel();
            throw e;
        }
        selectionGesturesKt$touchSelectionFirstPress$1 = new SelectionGesturesKt$touchSelectionFirstPress$1(continuation);
        obj = selectionGesturesKt$touchSelectionFirstPress$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = selectionGesturesKt$touchSelectionFirstPress$1.label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ea A[Catch: CancellationException -> 0x0115, TryCatch #1 {CancellationException -> 0x0115, blocks: (B:12:0x0033, B:13:0x00e2, B:15:0x00ea, B:17:0x00f9, B:19:0x0105, B:21:0x0108, B:24:0x010b, B:28:0x010f, B:35:0x00a3, B:37:0x00a7, B:38:0x00a9, B:40:0x00ad, B:42:0x00b0, B:44:0x00bb, B:46:0x00c1, B:48:0x00c5, B:49:0x00ca, B:58:0x0065), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010f A[Catch: CancellationException -> 0x0115, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x0115, blocks: (B:12:0x0033, B:13:0x00e2, B:15:0x00ea, B:17:0x00f9, B:19:0x0105, B:21:0x0108, B:24:0x010b, B:28:0x010f, B:35:0x00a3, B:37:0x00a7, B:38:0x00a9, B:40:0x00ad, B:42:0x00b0, B:44:0x00bb, B:46:0x00c1, B:48:0x00c5, B:49:0x00ca, B:58:0x0065), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a7 A[Catch: CancellationException -> 0x0115, TryCatch #1 {CancellationException -> 0x0115, blocks: (B:12:0x0033, B:13:0x00e2, B:15:0x00ea, B:17:0x00f9, B:19:0x0105, B:21:0x0108, B:24:0x010b, B:28:0x010f, B:35:0x00a3, B:37:0x00a7, B:38:0x00a9, B:40:0x00ad, B:42:0x00b0, B:44:0x00bb, B:46:0x00c1, B:48:0x00c5, B:49:0x00ca, B:58:0x0065), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ad A[Catch: CancellationException -> 0x0115, TryCatch #1 {CancellationException -> 0x0115, blocks: (B:12:0x0033, B:13:0x00e2, B:15:0x00ea, B:17:0x00f9, B:19:0x0105, B:21:0x0108, B:24:0x010b, B:28:0x010f, B:35:0x00a3, B:37:0x00a7, B:38:0x00a9, B:40:0x00ad, B:42:0x00b0, B:44:0x00bb, B:46:0x00c1, B:48:0x00c5, B:49:0x00ca, B:58:0x0065), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b0 A[Catch: CancellationException -> 0x0115, TryCatch #1 {CancellationException -> 0x0115, blocks: (B:12:0x0033, B:13:0x00e2, B:15:0x00ea, B:17:0x00f9, B:19:0x0105, B:21:0x0108, B:24:0x010b, B:28:0x010f, B:35:0x00a3, B:37:0x00a7, B:38:0x00a9, B:40:0x00ad, B:42:0x00b0, B:44:0x00bb, B:46:0x00c1, B:48:0x00c5, B:49:0x00ca, B:58:0x0065), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object touchSelectionSubsequentPress(AwaitPointerEventScope awaitPointerEventScope, final TextDragObserver textDragObserver, PointerEvent pointerEvent, Continuation<? super Unit> continuation) {
        SelectionGesturesKt$touchSelectionSubsequentPress$1 selectionGesturesKt$touchSelectionSubsequentPress$1;
        int i;
        PointerInputChange pointerInputChange;
        long id;
        Ref.LongRef longRef;
        Object withTimeoutOrNull;
        DownResolution downResolution;
        try {
            if (continuation instanceof SelectionGesturesKt$touchSelectionSubsequentPress$1) {
                selectionGesturesKt$touchSelectionSubsequentPress$1 = (SelectionGesturesKt$touchSelectionSubsequentPress$1) continuation;
                if ((selectionGesturesKt$touchSelectionSubsequentPress$1.label & Integer.MIN_VALUE) != 0) {
                    selectionGesturesKt$touchSelectionSubsequentPress$1.label -= Integer.MIN_VALUE;
                    Object obj = selectionGesturesKt$touchSelectionSubsequentPress$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = selectionGesturesKt$touchSelectionSubsequentPress$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        pointerInputChange = (PointerInputChange) CollectionsKt.first((List) pointerEvent.getChanges());
                        id = pointerInputChange.getId();
                        longRef = new Ref.LongRef();
                        longRef.element = Offset.INSTANCE.m3614getUnspecifiedF1C5BW0();
                        long longPressTimeoutMillis = awaitPointerEventScope.getViewConfiguration().getLongPressTimeoutMillis();
                        SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1 selectionGesturesKt$touchSelectionSubsequentPress$downResolution$1 = new SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1(id, longRef, null);
                        selectionGesturesKt$touchSelectionSubsequentPress$1.L$0 = awaitPointerEventScope;
                        selectionGesturesKt$touchSelectionSubsequentPress$1.L$1 = textDragObserver;
                        selectionGesturesKt$touchSelectionSubsequentPress$1.L$2 = pointerInputChange;
                        selectionGesturesKt$touchSelectionSubsequentPress$1.L$3 = longRef;
                        selectionGesturesKt$touchSelectionSubsequentPress$1.J$0 = id;
                        selectionGesturesKt$touchSelectionSubsequentPress$1.label = 1;
                        withTimeoutOrNull = awaitPointerEventScope.withTimeoutOrNull(longPressTimeoutMillis, selectionGesturesKt$touchSelectionSubsequentPress$downResolution$1, selectionGesturesKt$touchSelectionSubsequentPress$1);
                        if (withTimeoutOrNull == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            textDragObserver = (TextDragObserver) selectionGesturesKt$touchSelectionSubsequentPress$1.L$1;
                            awaitPointerEventScope = (AwaitPointerEventScope) selectionGesturesKt$touchSelectionSubsequentPress$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            if (!((Boolean) obj).booleanValue()) {
                                List<PointerInputChange> changes = awaitPointerEventScope.getCurrentEvent().getChanges();
                                int size = changes.size();
                                for (int i2 = 0; i2 < size; i2++) {
                                    PointerInputChange pointerInputChange2 = changes.get(i2);
                                    if (PointerEventKt.changedToUp(pointerInputChange2)) {
                                        pointerInputChange2.consume();
                                    }
                                }
                                textDragObserver.onStop();
                            } else {
                                textDragObserver.onCancel();
                            }
                            return Unit.INSTANCE;
                        }
                        long j = selectionGesturesKt$touchSelectionSubsequentPress$1.J$0;
                        Ref.LongRef longRef2 = (Ref.LongRef) selectionGesturesKt$touchSelectionSubsequentPress$1.L$3;
                        pointerInputChange = (PointerInputChange) selectionGesturesKt$touchSelectionSubsequentPress$1.L$2;
                        TextDragObserver textDragObserver2 = (TextDragObserver) selectionGesturesKt$touchSelectionSubsequentPress$1.L$1;
                        AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) selectionGesturesKt$touchSelectionSubsequentPress$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            longRef = longRef2;
                            withTimeoutOrNull = obj;
                            id = j;
                            textDragObserver = textDragObserver2;
                            awaitPointerEventScope = awaitPointerEventScope2;
                        } catch (CancellationException e) {
                            e = e;
                            textDragObserver = textDragObserver2;
                            textDragObserver.onCancel();
                            throw e;
                        }
                    }
                    downResolution = (DownResolution) withTimeoutOrNull;
                    if (downResolution == null) {
                        downResolution = DownResolution.Timeout;
                    }
                    if (downResolution != DownResolution.Cancel) {
                        return Unit.INSTANCE;
                    }
                    textDragObserver.mo1060onStartk4lQ0M(pointerInputChange.getPosition());
                    if (downResolution == DownResolution.Up) {
                        textDragObserver.onStop();
                        return Unit.INSTANCE;
                    }
                    if (downResolution == DownResolution.Drag) {
                        textDragObserver.mo1059onDragk4lQ0M(longRef.element);
                    }
                    Function1<PointerInputChange, Unit> function1 = new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$dragCompletedWithUp$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange3) {
                            invoke2(pointerInputChange3);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(PointerInputChange pointerInputChange3) {
                            TextDragObserver.this.mo1059onDragk4lQ0M(PointerEventKt.positionChange(pointerInputChange3));
                            pointerInputChange3.consume();
                        }
                    };
                    selectionGesturesKt$touchSelectionSubsequentPress$1.L$0 = awaitPointerEventScope;
                    selectionGesturesKt$touchSelectionSubsequentPress$1.L$1 = textDragObserver;
                    selectionGesturesKt$touchSelectionSubsequentPress$1.L$2 = null;
                    selectionGesturesKt$touchSelectionSubsequentPress$1.L$3 = null;
                    selectionGesturesKt$touchSelectionSubsequentPress$1.label = 2;
                    obj = DragGestureDetectorKt.m422dragjO51t88(awaitPointerEventScope, id, function1, selectionGesturesKt$touchSelectionSubsequentPress$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (!((Boolean) obj).booleanValue()) {
                    }
                    return Unit.INSTANCE;
                }
            }
            if (i != 0) {
            }
            downResolution = (DownResolution) withTimeoutOrNull;
            if (downResolution == null) {
            }
            if (downResolution != DownResolution.Cancel) {
            }
        } catch (CancellationException e2) {
            e = e2;
        }
        selectionGesturesKt$touchSelectionSubsequentPress$1 = new SelectionGesturesKt$touchSelectionSubsequentPress$1(continuation);
        Object obj2 = selectionGesturesKt$touchSelectionSubsequentPress$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = selectionGesturesKt$touchSelectionSubsequentPress$1.label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0105 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:12:0x0033, B:13:0x00fd, B:15:0x0105, B:17:0x0113, B:19:0x011f, B:59:0x00e2), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0093 A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:32:0x004d, B:33:0x008b, B:35:0x0093, B:37:0x00a1, B:39:0x00ad, B:50:0x0070), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object mouseSelectionBtf2(AwaitPointerEventScope awaitPointerEventScope, final MouseSelectionObserver mouseSelectionObserver, ClicksCounter clicksCounter, PointerEvent pointerEvent, Continuation<? super Unit> continuation) {
        SelectionGesturesKt$mouseSelectionBtf2$1 selectionGesturesKt$mouseSelectionBtf2$1;
        int i;
        final SelectionAdjustment none;
        try {
            try {
                if (continuation instanceof SelectionGesturesKt$mouseSelectionBtf2$1) {
                    selectionGesturesKt$mouseSelectionBtf2$1 = (SelectionGesturesKt$mouseSelectionBtf2$1) continuation;
                    if ((selectionGesturesKt$mouseSelectionBtf2$1.label & Integer.MIN_VALUE) != 0) {
                        selectionGesturesKt$mouseSelectionBtf2$1.label -= Integer.MIN_VALUE;
                        Object obj = selectionGesturesKt$mouseSelectionBtf2$1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = selectionGesturesKt$mouseSelectionBtf2$1.label;
                        int i2 = 0;
                        if (i == 0) {
                            if (i == 1) {
                                mouseSelectionObserver = (MouseSelectionObserver) selectionGesturesKt$mouseSelectionBtf2$1.L$1;
                                awaitPointerEventScope = (AwaitPointerEventScope) selectionGesturesKt$mouseSelectionBtf2$1.L$0;
                                ResultKt.throwOnFailure(obj);
                                if (((Boolean) obj).booleanValue()) {
                                    List<PointerInputChange> changes = awaitPointerEventScope.getCurrentEvent().getChanges();
                                    int size = changes.size();
                                    while (i2 < size) {
                                        PointerInputChange pointerInputChange = changes.get(i2);
                                        if (PointerEventKt.changedToUp(pointerInputChange)) {
                                            pointerInputChange.consume();
                                        }
                                        i2++;
                                    }
                                }
                                return Unit.INSTANCE;
                            }
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mouseSelectionObserver = (MouseSelectionObserver) selectionGesturesKt$mouseSelectionBtf2$1.L$1;
                            awaitPointerEventScope = (AwaitPointerEventScope) selectionGesturesKt$mouseSelectionBtf2$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            if (((Boolean) obj).booleanValue()) {
                                List<PointerInputChange> changes2 = awaitPointerEventScope.getCurrentEvent().getChanges();
                                int size2 = changes2.size();
                                while (i2 < size2) {
                                    PointerInputChange pointerInputChange2 = changes2.get(i2);
                                    if (PointerEventKt.changedToUp(pointerInputChange2)) {
                                        pointerInputChange2.consume();
                                    }
                                    i2++;
                                }
                            }
                            mouseSelectionObserver.onDragDone();
                            return Unit.INSTANCE;
                        }
                        ResultKt.throwOnFailure(obj);
                        PointerInputChange pointerInputChange3 = pointerEvent.getChanges().get(0);
                        if (TextFieldSelectionManager_androidKt.isShiftPressed(pointerEvent)) {
                            if (mouseSelectionObserver.mo1273onExtendk4lQ0M(pointerInputChange3.getPosition())) {
                                pointerInputChange3.consume();
                                long id = pointerInputChange3.getId();
                                Function1<PointerInputChange, Unit> function1 = new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionGesturesKt$mouseSelectionBtf2$shouldConsumeUp$1
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange4) {
                                        invoke2(pointerInputChange4);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(PointerInputChange pointerInputChange4) {
                                        if (MouseSelectionObserver.this.mo1274onExtendDragk4lQ0M(pointerInputChange4.getPosition())) {
                                            pointerInputChange4.consume();
                                        }
                                    }
                                };
                                selectionGesturesKt$mouseSelectionBtf2$1.L$0 = awaitPointerEventScope;
                                selectionGesturesKt$mouseSelectionBtf2$1.L$1 = mouseSelectionObserver;
                                selectionGesturesKt$mouseSelectionBtf2$1.label = 1;
                                obj = DragGestureDetectorKt.m422dragjO51t88(awaitPointerEventScope, id, function1, selectionGesturesKt$mouseSelectionBtf2$1);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                if (((Boolean) obj).booleanValue()) {
                                }
                            }
                        } else {
                            int clicks = clicksCounter.getClicks();
                            if (clicks == 1) {
                                none = SelectionAdjustment.INSTANCE.getNone();
                            } else if (clicks == 2) {
                                none = SelectionAdjustment.INSTANCE.getWord();
                            } else {
                                none = SelectionAdjustment.INSTANCE.getParagraph();
                            }
                            if (mouseSelectionObserver.mo1275onStart3MmeM6k(pointerInputChange3.getPosition(), none)) {
                                pointerInputChange3.consume();
                                long id2 = pointerInputChange3.getId();
                                Function1<PointerInputChange, Unit> function12 = new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionGesturesKt$mouseSelectionBtf2$shouldConsumeUp$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange4) {
                                        invoke2(pointerInputChange4);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(PointerInputChange pointerInputChange4) {
                                        if (MouseSelectionObserver.this.mo1272onDrag3MmeM6k(pointerInputChange4.getPosition(), none)) {
                                            pointerInputChange4.consume();
                                        }
                                    }
                                };
                                selectionGesturesKt$mouseSelectionBtf2$1.L$0 = awaitPointerEventScope;
                                selectionGesturesKt$mouseSelectionBtf2$1.L$1 = mouseSelectionObserver;
                                selectionGesturesKt$mouseSelectionBtf2$1.label = 2;
                                obj = DragGestureDetectorKt.m422dragjO51t88(awaitPointerEventScope, id2, function12, selectionGesturesKt$mouseSelectionBtf2$1);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                if (((Boolean) obj).booleanValue()) {
                                }
                                mouseSelectionObserver.onDragDone();
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }
                if (i == 0) {
                }
            } finally {
            }
        } finally {
        }
        selectionGesturesKt$mouseSelectionBtf2$1 = new SelectionGesturesKt$mouseSelectionBtf2$1(continuation);
        Object obj2 = selectionGesturesKt$mouseSelectionBtf2$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = selectionGesturesKt$mouseSelectionBtf2$1.label;
        int i22 = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0044 -> B:10:0x0047). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object awaitDown(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super PointerEvent> continuation) {
        SelectionGesturesKt$awaitDown$1 selectionGesturesKt$awaitDown$1;
        int i;
        int size;
        int i2;
        if (continuation instanceof SelectionGesturesKt$awaitDown$1) {
            selectionGesturesKt$awaitDown$1 = (SelectionGesturesKt$awaitDown$1) continuation;
            if ((selectionGesturesKt$awaitDown$1.label & Integer.MIN_VALUE) != 0) {
                selectionGesturesKt$awaitDown$1.label -= Integer.MIN_VALUE;
                Object obj = selectionGesturesKt$awaitDown$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = selectionGesturesKt$awaitDown$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    PointerEventPass pointerEventPass = PointerEventPass.Main;
                    selectionGesturesKt$awaitDown$1.L$0 = awaitPointerEventScope;
                    selectionGesturesKt$awaitDown$1.label = 1;
                    obj = awaitPointerEventScope.awaitPointerEvent(pointerEventPass, selectionGesturesKt$awaitDown$1);
                    if (obj == coroutine_suspended) {
                    }
                    PointerEvent pointerEvent = (PointerEvent) obj;
                    List<PointerInputChange> changes = pointerEvent.getChanges();
                    size = changes.size();
                    i2 = 0;
                    while (i2 < size) {
                    }
                    return pointerEvent;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                awaitPointerEventScope = (AwaitPointerEventScope) selectionGesturesKt$awaitDown$1.L$0;
                ResultKt.throwOnFailure(obj);
                PointerEvent pointerEvent2 = (PointerEvent) obj;
                List<PointerInputChange> changes2 = pointerEvent2.getChanges();
                size = changes2.size();
                i2 = 0;
                while (i2 < size) {
                    if (PointerEventKt.changedToDownIgnoreConsumed(changes2.get(i2))) {
                        i2++;
                    } else {
                        PointerEventPass pointerEventPass2 = PointerEventPass.Main;
                        selectionGesturesKt$awaitDown$1.L$0 = awaitPointerEventScope;
                        selectionGesturesKt$awaitDown$1.label = 1;
                        obj = awaitPointerEventScope.awaitPointerEvent(pointerEventPass2, selectionGesturesKt$awaitDown$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        PointerEvent pointerEvent22 = (PointerEvent) obj;
                        List<PointerInputChange> changes22 = pointerEvent22.getChanges();
                        size = changes22.size();
                        i2 = 0;
                        while (i2 < size) {
                        }
                    }
                }
                return pointerEvent22;
            }
        }
        selectionGesturesKt$awaitDown$1 = new SelectionGesturesKt$awaitDown$1(continuation);
        Object obj2 = selectionGesturesKt$awaitDown$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = selectionGesturesKt$awaitDown$1.label;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean distanceIsTolerable(ViewConfiguration viewConfiguration, PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2) {
        return Offset.m3597getDistanceimpl(Offset.m3603minusMKHz9U(pointerInputChange.getPosition(), pointerInputChange2.getPosition())) < DragGestureDetectorKt.m425pointerSlopE8SPZFQ(viewConfiguration, pointerInputChange.getType());
    }

    public static final boolean isPrecisePointer(PointerEvent pointerEvent) {
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i = 0; i < size; i++) {
            if (!PointerType.m5118equalsimpl0(changes.get(i).getType(), PointerType.INSTANCE.m5123getMouseT8wyACA())) {
                return false;
            }
        }
        return true;
    }
}
