package androidx.compose.foundation.gestures;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Draggable2D.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u008d\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012>\b\u0002\u0010\r\u001a8\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000e¢\u0006\u0002\b\u0017\u0012#\b\u0002\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00150\u0005\u0012>\b\u0002\u0010\u0019\u001a8\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000e¢\u0006\u0002\b\u0017\u0012#\b\u0002\u0010\u001c\u001a\u001d\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u00150\u0005¢\u0006\u0002\u0010\u001dJM\u0010\u001f\u001a\u00020\u00152=\u0010 \u001a9\b\u0001\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110\"¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00150\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160!H\u0096@¢\u0006\u0002\u0010$J\u001a\u0010\r\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u001a\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001aH\u0016ø\u0001\u0000¢\u0006\u0004\b'\u0010&J\b\u0010\u000b\u001a\u00020\u0007H\u0016J\u0093\u0002\u0010(\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072>\b\u0002\u0010\r\u001a8\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000e¢\u0006\u0002\b\u00172>\b\u0002\u0010\u0019\u001a8\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000e¢\u0006\u0002\b\u00172#\b\u0002\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00150\u00052#\b\u0002\u0010\u001c\u001a\u001d\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u00150\u0005¢\u0006\u0002\u0010)J\u0016\u0010*\u001a\u00020\u0010*\u00020\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u0016\u0010*\u001a\u00020\u001a*\u00020\u001aH\u0002ø\u0001\u0000¢\u0006\u0004\b-\u0010,R)\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00150\u0005X\u0082\u000e¢\u0006\u0002\n\u0000RF\u0010\r\u001a8\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000e¢\u0006\u0002\b\u0017X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001eR)\u0010\u001c\u001a\u001d\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u00150\u0005X\u0082\u000e¢\u0006\u0002\n\u0000RF\u0010\u0019\u001a8\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000e¢\u0006\u0002\b\u0017X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001eR\u000e\u0010\f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006."}, d2 = {"Landroidx/compose/foundation/gestures/Draggable2DNode;", "Landroidx/compose/foundation/gestures/DragGestureNode;", "state", "Landroidx/compose/foundation/gestures/Draggable2DState;", "canDrag", "Lkotlin/Function1;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "", "enabled", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "startDragImmediately", "reverseDirection", "onDragStarted", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "startedPosition", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "onDragStart", "onDragStopped", "Landroidx/compose/ui/unit/Velocity;", "velocity", "onDragStop", "(Landroidx/compose/foundation/gestures/Draggable2DState;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/jvm/functions/Function3;", "drag", "forEachDelta", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/DragEvent$DragDelta;", "dragDelta", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onDragStarted-k-4lQ0M", "(J)V", "onDragStopped-TH1AsA0", "update", "(Landroidx/compose/foundation/gestures/Draggable2DState;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "reverseIfNeeded", "reverseIfNeeded-MK-Hz9U", "(J)J", "reverseIfNeeded-AH228Gc", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Draggable2DNode extends DragGestureNode {
    public static final int $stable = 8;
    private Function1<? super Offset, Unit> onDragStart;
    private Function3<? super CoroutineScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> onDragStarted;
    private Function1<? super Velocity, Unit> onDragStop;
    private Function3<? super CoroutineScope, ? super Velocity, ? super Continuation<? super Unit>, ? extends Object> onDragStopped;
    private boolean reverseDirection;
    private boolean startDragImmediately;
    private Draggable2DState state;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ Draggable2DNode(Draggable2DState draggable2DState, Function1 function1, boolean z, MutableInteractionSource mutableInteractionSource, boolean z2, boolean z3, Function3 function3, Function1 function12, Function3 function32, Function1 function13, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(draggable2DState, function1, z, mutableInteractionSource, z2, z3, r9, r10, r11, r12);
        Function3 function33;
        Function1 function14;
        Function3 function34;
        Function1 function15;
        Function1 function16;
        Function3 function35;
        Function1 function17;
        Function3 function36;
        if ((i & 64) != 0) {
            function36 = Draggable2DKt.NoOpOnDragStarted;
            function33 = function36;
        } else {
            function33 = function3;
        }
        if ((i & 128) != 0) {
            function17 = Draggable2DKt.NoOpOnDragStart;
            function14 = function17;
        } else {
            function14 = function12;
        }
        if ((i & 256) != 0) {
            function35 = Draggable2DKt.NoOpOnDragStopped;
            function34 = function35;
        } else {
            function34 = function32;
        }
        if ((i & 512) != 0) {
            function16 = Draggable2DKt.NoOpOnDragStop;
            function15 = function16;
        } else {
            function15 = function13;
        }
    }

    public Draggable2DNode(Draggable2DState draggable2DState, Function1<? super PointerInputChange, Boolean> function1, boolean z, MutableInteractionSource mutableInteractionSource, boolean z2, boolean z3, Function3<? super CoroutineScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> function3, Function1<? super Offset, Unit> function12, Function3<? super CoroutineScope, ? super Velocity, ? super Continuation<? super Unit>, ? extends Object> function32, Function1<? super Velocity, Unit> function13) {
        super(function1, z, mutableInteractionSource, null);
        this.state = draggable2DState;
        this.startDragImmediately = z2;
        this.reverseDirection = z3;
        this.onDragStarted = function3;
        this.onDragStart = function12;
        this.onDragStopped = function32;
        this.onDragStop = function13;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public Object drag(Function2<? super Function1<? super DragEvent.DragDelta, Unit>, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object drag = this.state.drag(MutatePriority.UserInput, new Draggable2DNode$drag$2(function2, this, null), continuation);
        return drag == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? drag : Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: onDragStarted-k-4lQ0M */
    public void mo382onDragStartedk4lQ0M(long startedPosition) {
        Function3<? super CoroutineScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> function3;
        this.onDragStart.invoke(Offset.m3571boximpl(startedPosition));
        if (getIsAttached()) {
            Function3<? super CoroutineScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> function32 = this.onDragStarted;
            function3 = Draggable2DKt.NoOpOnDragStarted;
            if (function32 == function3) {
                return;
            }
            BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new Draggable2DNode$onDragStarted$1(this, startedPosition, null), 3, null);
        }
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: onDragStopped-TH1AsA0 */
    public void mo383onDragStoppedTH1AsA0(long velocity) {
        Function3<? super CoroutineScope, ? super Velocity, ? super Continuation<? super Unit>, ? extends Object> function3;
        this.onDragStop.invoke(Velocity.m6493boximpl(velocity));
        if (getIsAttached()) {
            Function3<? super CoroutineScope, ? super Velocity, ? super Continuation<? super Unit>, ? extends Object> function32 = this.onDragStopped;
            function3 = Draggable2DKt.NoOpOnDragStopped;
            if (function32 == function3) {
                return;
            }
            BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new Draggable2DNode$onDragStopped$1(this, velocity, null), 3, null);
        }
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: startDragImmediately, reason: from getter */
    public boolean getStartDragImmediately() {
        return this.startDragImmediately;
    }

    public static /* synthetic */ void update$default(Draggable2DNode draggable2DNode, Draggable2DState draggable2DState, Function1 function1, boolean z, MutableInteractionSource mutableInteractionSource, boolean z2, boolean z3, Function3 function3, Function3 function32, Function1 function12, Function1 function13, int i, Object obj) {
        Function1 function14;
        Draggable2DNode draggable2DNode2;
        Draggable2DState draggable2DState2;
        Function1 function15;
        boolean z4;
        MutableInteractionSource mutableInteractionSource2;
        boolean z5;
        boolean z6;
        Function3 function33 = (i & 64) != 0 ? draggable2DNode.onDragStarted : function3;
        Function3 function34 = (i & 128) != 0 ? draggable2DNode.onDragStopped : function32;
        Function1 function16 = (i & 256) != 0 ? draggable2DNode.onDragStart : function12;
        if ((i & 512) != 0) {
            function14 = draggable2DNode.onDragStop;
            draggable2DNode2 = draggable2DNode;
            function15 = function1;
            z4 = z;
            mutableInteractionSource2 = mutableInteractionSource;
            z5 = z2;
            z6 = z3;
            draggable2DState2 = draggable2DState;
        } else {
            function14 = function13;
            draggable2DNode2 = draggable2DNode;
            draggable2DState2 = draggable2DState;
            function15 = function1;
            z4 = z;
            mutableInteractionSource2 = mutableInteractionSource;
            z5 = z2;
            z6 = z3;
        }
        draggable2DNode2.update(draggable2DState2, function15, z4, mutableInteractionSource2, z5, z6, function33, function34, function16, function14);
    }

    public final void update(Draggable2DState state, Function1<? super PointerInputChange, Boolean> canDrag, boolean enabled, MutableInteractionSource interactionSource, boolean startDragImmediately, boolean reverseDirection, Function3<? super CoroutineScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> onDragStarted, Function3<? super CoroutineScope, ? super Velocity, ? super Continuation<? super Unit>, ? extends Object> onDragStopped, Function1<? super Offset, Unit> onDragStart, Function1<? super Velocity, Unit> onDragStop) {
        boolean z;
        boolean z2 = true;
        if (Intrinsics.areEqual(this.state, state)) {
            z = false;
        } else {
            this.state = state;
            z = true;
        }
        if (this.reverseDirection != reverseDirection) {
            this.reverseDirection = reverseDirection;
        } else {
            z2 = z;
        }
        this.onDragStarted = onDragStarted;
        this.onDragStopped = onDragStopped;
        this.onDragStart = onDragStart;
        this.onDragStop = onDragStop;
        this.startDragImmediately = startDragImmediately;
        update(canDrag, enabled, interactionSource, null, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: reverseIfNeeded-AH228Gc, reason: not valid java name */
    public final long m433reverseIfNeededAH228Gc(long j) {
        return Velocity.m6508timesadjELrA(j, this.reverseDirection ? -1.0f : 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: reverseIfNeeded-MK-Hz9U, reason: not valid java name */
    public final long m434reverseIfNeededMKHz9U(long j) {
        return Offset.m3589timestuRUvjQ(j, this.reverseDirection ? -1.0f : 1.0f);
    }
}
