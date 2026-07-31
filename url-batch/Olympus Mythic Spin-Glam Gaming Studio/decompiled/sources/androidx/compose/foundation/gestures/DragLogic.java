package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Draggable.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001B{\u0012(\u0010\u0007\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012(\u0010\t\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\rø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0015H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u0006*\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019R?\u0010\u0007\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0006ø\u0001\u0000ø\u0001\u0000¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR<\u0010\t\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010!\u001a\u0004\b\"\u0010#\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"Landroidx/compose/foundation/gestures/DragLogic;", "", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/coroutines/Continuation;", "", "onDragStarted", "", "onDragStopped", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/foundation/interaction/DragInteraction$Start;", "dragStartInteraction", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "<init>", "(Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/MutableState;Landroidx/compose/foundation/interaction/MutableInteractionSource;)V", "Landroidx/compose/foundation/gestures/DragEvent$DragStarted;", "event", "processDragStart", "(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/foundation/gestures/DragEvent$DragStarted;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/foundation/gestures/DragEvent$DragStopped;", "processDragStop", "(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/foundation/gestures/DragEvent$DragStopped;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processDragCancel", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/jvm/functions/Function3;", "getOnDragStarted", "()Lkotlin/jvm/functions/Function3;", "getOnDragStopped", "Landroidx/compose/runtime/MutableState;", "getDragStartInteraction", "()Landroidx/compose/runtime/MutableState;", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes10.dex */
final class DragLogic {
    private final MutableState dragStartInteraction;
    private final MutableInteractionSource interactionSource;
    private final Function3 onDragStarted;
    private final Function3 onDragStopped;

    public DragLogic(Function3 onDragStarted, Function3 onDragStopped, MutableState dragStartInteraction, MutableInteractionSource mutableInteractionSource) {
        Intrinsics.checkNotNullParameter(onDragStarted, "onDragStarted");
        Intrinsics.checkNotNullParameter(onDragStopped, "onDragStopped");
        Intrinsics.checkNotNullParameter(dragStartInteraction, "dragStartInteraction");
        this.onDragStarted = onDragStarted;
        this.onDragStopped = onDragStopped;
        this.dragStartInteraction = dragStartInteraction;
        this.interactionSource = mutableInteractionSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processDragStart(CoroutineScope coroutineScope, DragEvent.DragStarted dragStarted, Continuation continuation) {
        DragLogic$processDragStart$1 dragLogic$processDragStart$1;
        Object coroutine_suspended;
        int i;
        DragLogic dragLogic;
        MutableInteractionSource mutableInteractionSource;
        DragInteraction.Start start;
        MutableInteractionSource mutableInteractionSource2;
        DragLogic dragLogic2;
        CoroutineScope coroutineScope2;
        DragInteraction.Start start2;
        Function3 function3;
        Offset m1288boximpl;
        if (continuation instanceof DragLogic$processDragStart$1) {
            dragLogic$processDragStart$1 = (DragLogic$processDragStart$1) continuation;
            int i2 = dragLogic$processDragStart$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dragLogic$processDragStart$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dragLogic$processDragStart$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragLogic$processDragStart$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    DragInteraction.Start start3 = (DragInteraction.Start) this.dragStartInteraction.getValue();
                    if (start3 != null && (mutableInteractionSource = this.interactionSource) != null) {
                        DragInteraction.Cancel cancel = new DragInteraction.Cancel(start3);
                        dragLogic$processDragStart$1.L$0 = this;
                        dragLogic$processDragStart$1.L$1 = coroutineScope;
                        dragLogic$processDragStart$1.L$2 = dragStarted;
                        dragLogic$processDragStart$1.label = 1;
                        if (mutableInteractionSource.emit(cancel, dragLogic$processDragStart$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    dragLogic = this;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                ResultKt.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        start2 = (DragInteraction.Start) dragLogic$processDragStart$1.L$3;
                        dragStarted = (DragEvent.DragStarted) dragLogic$processDragStart$1.L$2;
                        coroutineScope2 = (CoroutineScope) dragLogic$processDragStart$1.L$1;
                        dragLogic2 = (DragLogic) dragLogic$processDragStart$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        start = start2;
                        coroutineScope = coroutineScope2;
                        dragLogic = dragLogic2;
                        dragLogic.dragStartInteraction.setValue(start);
                        function3 = dragLogic.onDragStarted;
                        m1288boximpl = Offset.m1288boximpl(dragStarted.getStartPoint());
                        dragLogic$processDragStart$1.L$0 = null;
                        dragLogic$processDragStart$1.L$1 = null;
                        dragLogic$processDragStart$1.L$2 = null;
                        dragLogic$processDragStart$1.L$3 = null;
                        dragLogic$processDragStart$1.label = 3;
                        if (function3.invoke(coroutineScope, m1288boximpl, dragLogic$processDragStart$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    dragStarted = (DragEvent.DragStarted) dragLogic$processDragStart$1.L$2;
                    coroutineScope = (CoroutineScope) dragLogic$processDragStart$1.L$1;
                    dragLogic = (DragLogic) dragLogic$processDragStart$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                start = new DragInteraction.Start();
                mutableInteractionSource2 = dragLogic.interactionSource;
                if (mutableInteractionSource2 != null) {
                    dragLogic$processDragStart$1.L$0 = dragLogic;
                    dragLogic$processDragStart$1.L$1 = coroutineScope;
                    dragLogic$processDragStart$1.L$2 = dragStarted;
                    dragLogic$processDragStart$1.L$3 = start;
                    dragLogic$processDragStart$1.label = 2;
                    if (mutableInteractionSource2.emit(start, dragLogic$processDragStart$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    dragLogic2 = dragLogic;
                    coroutineScope2 = coroutineScope;
                    start2 = start;
                    start = start2;
                    coroutineScope = coroutineScope2;
                    dragLogic = dragLogic2;
                }
                dragLogic.dragStartInteraction.setValue(start);
                function3 = dragLogic.onDragStarted;
                m1288boximpl = Offset.m1288boximpl(dragStarted.getStartPoint());
                dragLogic$processDragStart$1.L$0 = null;
                dragLogic$processDragStart$1.L$1 = null;
                dragLogic$processDragStart$1.L$2 = null;
                dragLogic$processDragStart$1.L$3 = null;
                dragLogic$processDragStart$1.label = 3;
                if (function3.invoke(coroutineScope, m1288boximpl, dragLogic$processDragStart$1) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            }
        }
        dragLogic$processDragStart$1 = new DragLogic$processDragStart$1(this, continuation);
        Object obj2 = dragLogic$processDragStart$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragLogic$processDragStart$1.label;
        if (i != 0) {
        }
        start = new DragInteraction.Start();
        mutableInteractionSource2 = dragLogic.interactionSource;
        if (mutableInteractionSource2 != null) {
        }
        dragLogic.dragStartInteraction.setValue(start);
        function3 = dragLogic.onDragStarted;
        m1288boximpl = Offset.m1288boximpl(dragStarted.getStartPoint());
        dragLogic$processDragStart$1.L$0 = null;
        dragLogic$processDragStart$1.L$1 = null;
        dragLogic$processDragStart$1.L$2 = null;
        dragLogic$processDragStart$1.L$3 = null;
        dragLogic$processDragStart$1.label = 3;
        if (function3.invoke(coroutineScope, m1288boximpl, dragLogic$processDragStart$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processDragStop(CoroutineScope coroutineScope, DragEvent.DragStopped dragStopped, Continuation continuation) {
        DragLogic$processDragStop$1 dragLogic$processDragStop$1;
        Object coroutine_suspended;
        int i;
        DragLogic dragLogic;
        Function3 function3;
        Float boxFloat;
        if (continuation instanceof DragLogic$processDragStop$1) {
            dragLogic$processDragStop$1 = (DragLogic$processDragStop$1) continuation;
            int i2 = dragLogic$processDragStop$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dragLogic$processDragStop$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dragLogic$processDragStop$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragLogic$processDragStop$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    DragInteraction.Start start = (DragInteraction.Start) this.dragStartInteraction.getValue();
                    if (start != null) {
                        MutableInteractionSource mutableInteractionSource = this.interactionSource;
                        if (mutableInteractionSource != null) {
                            DragInteraction.Stop stop = new DragInteraction.Stop(start);
                            dragLogic$processDragStop$1.L$0 = this;
                            dragLogic$processDragStop$1.L$1 = coroutineScope;
                            dragLogic$processDragStop$1.L$2 = dragStopped;
                            dragLogic$processDragStop$1.label = 1;
                            if (mutableInteractionSource.emit(stop, dragLogic$processDragStop$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        dragLogic = this;
                    } else {
                        dragLogic = this;
                        function3 = dragLogic.onDragStopped;
                        boxFloat = Boxing.boxFloat(dragStopped.getVelocity());
                        dragLogic$processDragStop$1.L$0 = null;
                        dragLogic$processDragStop$1.L$1 = null;
                        dragLogic$processDragStop$1.L$2 = null;
                        dragLogic$processDragStop$1.label = 2;
                        if (function3.invoke(coroutineScope, boxFloat, dragLogic$processDragStop$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dragStopped = (DragEvent.DragStopped) dragLogic$processDragStop$1.L$2;
                    coroutineScope = (CoroutineScope) dragLogic$processDragStop$1.L$1;
                    dragLogic = (DragLogic) dragLogic$processDragStop$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                dragLogic.dragStartInteraction.setValue(null);
                function3 = dragLogic.onDragStopped;
                boxFloat = Boxing.boxFloat(dragStopped.getVelocity());
                dragLogic$processDragStop$1.L$0 = null;
                dragLogic$processDragStop$1.L$1 = null;
                dragLogic$processDragStop$1.L$2 = null;
                dragLogic$processDragStop$1.label = 2;
                if (function3.invoke(coroutineScope, boxFloat, dragLogic$processDragStop$1) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            }
        }
        dragLogic$processDragStop$1 = new DragLogic$processDragStop$1(this, continuation);
        Object obj2 = dragLogic$processDragStop$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragLogic$processDragStop$1.label;
        if (i != 0) {
        }
        dragLogic.dragStartInteraction.setValue(null);
        function3 = dragLogic.onDragStopped;
        boxFloat = Boxing.boxFloat(dragStopped.getVelocity());
        dragLogic$processDragStop$1.L$0 = null;
        dragLogic$processDragStop$1.L$1 = null;
        dragLogic$processDragStop$1.L$2 = null;
        dragLogic$processDragStop$1.label = 2;
        if (function3.invoke(coroutineScope, boxFloat, dragLogic$processDragStop$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processDragCancel(CoroutineScope coroutineScope, Continuation continuation) {
        DragLogic$processDragCancel$1 dragLogic$processDragCancel$1;
        Object coroutine_suspended;
        int i;
        DragLogic dragLogic;
        Function3 function3;
        Float boxFloat;
        if (continuation instanceof DragLogic$processDragCancel$1) {
            dragLogic$processDragCancel$1 = (DragLogic$processDragCancel$1) continuation;
            int i2 = dragLogic$processDragCancel$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dragLogic$processDragCancel$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dragLogic$processDragCancel$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragLogic$processDragCancel$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    DragInteraction.Start start = (DragInteraction.Start) this.dragStartInteraction.getValue();
                    if (start != null) {
                        MutableInteractionSource mutableInteractionSource = this.interactionSource;
                        if (mutableInteractionSource != null) {
                            DragInteraction.Cancel cancel = new DragInteraction.Cancel(start);
                            dragLogic$processDragCancel$1.L$0 = this;
                            dragLogic$processDragCancel$1.L$1 = coroutineScope;
                            dragLogic$processDragCancel$1.label = 1;
                            if (mutableInteractionSource.emit(cancel, dragLogic$processDragCancel$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        dragLogic = this;
                    } else {
                        dragLogic = this;
                        function3 = dragLogic.onDragStopped;
                        boxFloat = Boxing.boxFloat(0.0f);
                        dragLogic$processDragCancel$1.L$0 = null;
                        dragLogic$processDragCancel$1.L$1 = null;
                        dragLogic$processDragCancel$1.label = 2;
                        if (function3.invoke(coroutineScope, boxFloat, dragLogic$processDragCancel$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    coroutineScope = (CoroutineScope) dragLogic$processDragCancel$1.L$1;
                    dragLogic = (DragLogic) dragLogic$processDragCancel$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                dragLogic.dragStartInteraction.setValue(null);
                function3 = dragLogic.onDragStopped;
                boxFloat = Boxing.boxFloat(0.0f);
                dragLogic$processDragCancel$1.L$0 = null;
                dragLogic$processDragCancel$1.L$1 = null;
                dragLogic$processDragCancel$1.label = 2;
                if (function3.invoke(coroutineScope, boxFloat, dragLogic$processDragCancel$1) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            }
        }
        dragLogic$processDragCancel$1 = new DragLogic$processDragCancel$1(this, continuation);
        Object obj2 = dragLogic$processDragCancel$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragLogic$processDragCancel$1.label;
        if (i != 0) {
        }
        dragLogic.dragStartInteraction.setValue(null);
        function3 = dragLogic.onDragStopped;
        boxFloat = Boxing.boxFloat(0.0f);
        dragLogic$processDragCancel$1.L$0 = null;
        dragLogic$processDragCancel$1.L$1 = null;
        dragLogic$processDragCancel$1.label = 2;
        if (function3.invoke(coroutineScope, boxFloat, dragLogic$processDragCancel$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }
}
