package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.PointerIconCompat;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;

/* compiled from: DragGestureDetector.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$9", f = "DragGestureDetector.kt", i = {0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4}, l = {247, 253, 972, PointerIconCompat.TYPE_HORIZONTAL_DOUBLE_ARROW, InputDeviceCompat.SOURCE_GAMEPAD}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "initialDown", "awaitTouchSlop", "$this$awaitEachGesture", "down", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointer$iv", "touchSlopDetector$iv", "touchSlop$iv", "$this$awaitEachGesture", "down", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointer$iv", "touchSlopDetector$iv", "dragEvent$iv", "touchSlop$iv", "$this$drag_u2dVnAYq1g$iv", "orientation$iv", "$this$awaitDragOrUp_u2djO51t88$iv$iv", "pointer$iv$iv"}, s = {"L$0", "L$0", "L$1", "Z$0", "L$0", "L$1", "L$2", "L$4", "L$5", "F$0", "L$0", "L$1", "L$2", "L$4", "L$5", "L$6", "F$0", "L$0", "L$2", "L$3", "L$4"})
/* loaded from: classes.dex */
final class DragGestureDetectorKt$detectDragGestures$9 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<PointerInputChange, Offset, Unit> $onDrag;
    final /* synthetic */ Function0<Unit> $onDragCancel;
    final /* synthetic */ Function1<PointerInputChange, Unit> $onDragEnd;
    final /* synthetic */ Function3<PointerInputChange, PointerInputChange, Offset, Unit> $onDragStart;
    final /* synthetic */ Orientation $orientationLock;
    final /* synthetic */ Ref.LongRef $overSlop;
    final /* synthetic */ Function0<Boolean> $shouldAwaitTouchSlop;
    float F$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DragGestureDetectorKt$detectDragGestures$9(Function0<Boolean> function0, Ref.LongRef longRef, Orientation orientation, Function3<? super PointerInputChange, ? super PointerInputChange, ? super Offset, Unit> function3, Function2<? super PointerInputChange, ? super Offset, Unit> function2, Function0<Unit> function02, Function1<? super PointerInputChange, Unit> function1, Continuation<? super DragGestureDetectorKt$detectDragGestures$9> continuation) {
        super(2, continuation);
        this.$shouldAwaitTouchSlop = function0;
        this.$overSlop = longRef;
        this.$orientationLock = orientation;
        this.$onDragStart = function3;
        this.$onDrag = function2;
        this.$onDragCancel = function02;
        this.$onDragEnd = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DragGestureDetectorKt$detectDragGestures$9 dragGestureDetectorKt$detectDragGestures$9 = new DragGestureDetectorKt$detectDragGestures$9(this.$shouldAwaitTouchSlop, this.$overSlop, this.$orientationLock, this.$onDragStart, this.$onDrag, this.$onDragCancel, this.$onDragEnd, continuation);
        dragGestureDetectorKt$detectDragGestures$9.L$0 = obj;
        return dragGestureDetectorKt$detectDragGestures$9;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
        return ((DragGestureDetectorKt$detectDragGestures$9) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x0261, code lost:
    
        if (androidx.compose.foundation.gestures.DragGestureDetectorKt.m416isPointerUpDmW0f2w(r11.getCurrentEvent(), r2) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0103, code lost:
    
        if (r2 == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x00c1, code lost:
    
        if (r10 == r1) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x028b, code lost:
    
        if (r3 != r1) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0311, code lost:
    
        if (((r5 != null ? r5 == androidx.compose.foundation.gestures.Orientation.Vertical ? androidx.compose.ui.geometry.Offset.m3583getYimpl(r7) : androidx.compose.ui.geometry.Offset.m3582getXimpl(r7) : androidx.compose.ui.geometry.Offset.m3580getDistanceimpl(r7)) == 0.0f) == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x014d, code lost:
    
        if (r13 == r1) goto L89;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:38:0x02c8, B:50:0x02f1], limit reached: 135 */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x011f  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v5, types: [androidx.compose.ui.input.pointer.PointerEventPass, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:103:0x01d7 -> B:67:0x021a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:107:0x020b -> B:63:0x0211). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x028b -> B:9:0x028e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x011b -> B:67:0x021a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x0187 -> B:66:0x0219). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AwaitPointerEventScope awaitPointerEventScope;
        Object awaitFirstDown;
        AwaitPointerEventScope awaitPointerEventScope2;
        Object awaitFirstDown$default;
        PointerInputChange pointerInputChange;
        boolean z;
        PointerInputChange pointerInputChange2;
        long id;
        Function2<PointerInputChange, Offset, Unit> function2;
        Orientation orientation;
        Ref.LongRef longRef;
        Ref.LongRef longRef2;
        Object obj2;
        TouchSlopDetector touchSlopDetector;
        AwaitPointerEventScope awaitPointerEventScope3;
        float f;
        AwaitPointerEventScope awaitPointerEventScope4;
        PointerInputChange pointerInputChange3;
        char c;
        PointerInputChange pointerInputChange4;
        Ref.LongRef longRef3;
        PointerInputChange pointerInputChange5;
        PointerInputChange pointerInputChange6;
        PointerInputChange pointerInputChange7;
        AwaitPointerEventScope awaitPointerEventScope5;
        PointerInputChange pointerInputChange8;
        PointerInputChange pointerInputChange9;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        char c2 = 4;
        int i2 = 3;
        int i3 = 1;
        ?? r9 = 0;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
            this.L$0 = awaitPointerEventScope;
            this.label = 1;
            awaitFirstDown = TapGestureDetectorKt.awaitFirstDown(awaitPointerEventScope, false, PointerEventPass.Initial, this);
        } else if (i == 1) {
            awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            awaitFirstDown = obj;
        } else if (i == 2) {
            z = this.Z$0;
            PointerInputChange pointerInputChange10 = (PointerInputChange) this.L$1;
            AwaitPointerEventScope awaitPointerEventScope6 = (AwaitPointerEventScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            awaitPointerEventScope2 = awaitPointerEventScope6;
            pointerInputChange = pointerInputChange10;
            awaitFirstDown$default = obj;
            pointerInputChange2 = (PointerInputChange) awaitFirstDown$default;
            this.$overSlop.element = Offset.INSTANCE.m3598getZeroF1C5BW0();
        } else {
            if (i == 3) {
                f = this.F$0;
                TouchSlopDetector touchSlopDetector2 = (TouchSlopDetector) this.L$5;
                Ref.LongRef longRef4 = (Ref.LongRef) this.L$4;
                Ref.LongRef longRef5 = (Ref.LongRef) this.L$3;
                AwaitPointerEventScope awaitPointerEventScope7 = (AwaitPointerEventScope) this.L$2;
                PointerInputChange pointerInputChange11 = (PointerInputChange) this.L$1;
                AwaitPointerEventScope awaitPointerEventScope8 = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                longRef = longRef4;
                awaitPointerEventScope3 = awaitPointerEventScope8;
                longRef2 = longRef5;
                awaitPointerEventScope2 = awaitPointerEventScope7;
                touchSlopDetector = touchSlopDetector2;
                pointerInputChange2 = pointerInputChange11;
                obj2 = obj;
                PointerEvent pointerEvent = (PointerEvent) obj2;
                List<PointerInputChange> changes = pointerEvent.getChanges();
                int size = changes.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size) {
                        awaitPointerEventScope4 = awaitPointerEventScope3;
                        pointerInputChange3 = null;
                        break;
                    }
                    pointerInputChange3 = changes.get(i4);
                    awaitPointerEventScope4 = awaitPointerEventScope3;
                    if (PointerId.m5005equalsimpl0(pointerInputChange3.getId(), longRef.element)) {
                        break;
                    }
                    i4++;
                    awaitPointerEventScope3 = awaitPointerEventScope4;
                }
                PointerInputChange pointerInputChange12 = pointerInputChange3;
                if (pointerInputChange12 != null && !pointerInputChange12.isConsumed()) {
                    if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange12)) {
                        List<PointerInputChange> changes2 = pointerEvent.getChanges();
                        int size2 = changes2.size();
                        int i5 = 0;
                        while (true) {
                            if (i5 >= size2) {
                                pointerInputChange6 = null;
                                break;
                            }
                            pointerInputChange6 = changes2.get(i5);
                            if (pointerInputChange6.getPressed()) {
                                break;
                            }
                            i5++;
                        }
                        PointerInputChange pointerInputChange13 = pointerInputChange6;
                        if (pointerInputChange13 != null) {
                            longRef.element = pointerInputChange13.getId();
                            awaitPointerEventScope3 = awaitPointerEventScope4;
                            i2 = 3;
                            i3 = 1;
                            r9 = 0;
                        }
                    } else {
                        Offset m496addPointerInputChangeGcwITfU = touchSlopDetector.m496addPointerInputChangeGcwITfU(pointerInputChange12, f);
                        if (m496addPointerInputChangeGcwITfU == null) {
                            awaitPointerEventScope3 = awaitPointerEventScope4;
                            this.L$0 = awaitPointerEventScope3;
                            this.L$1 = pointerInputChange2;
                            this.L$2 = awaitPointerEventScope2;
                            this.L$3 = longRef2;
                            this.L$4 = longRef;
                            this.L$5 = touchSlopDetector;
                            this.L$6 = pointerInputChange12;
                            this.F$0 = f;
                            c = 4;
                            this.label = 4;
                            if (awaitPointerEventScope2.awaitPointerEvent(PointerEventPass.Final, this) != coroutine_suspended) {
                                PointerInputChange pointerInputChange14 = pointerInputChange2;
                                pointerInputChange4 = pointerInputChange12;
                                longRef3 = longRef2;
                                pointerInputChange5 = pointerInputChange14;
                                if (!pointerInputChange4.isConsumed()) {
                                }
                            }
                            return coroutine_suspended;
                        }
                        long packedValue = m496addPointerInputChangeGcwITfU.getPackedValue();
                        pointerInputChange12.consume();
                        longRef2.element = packedValue;
                        if (pointerInputChange12.isConsumed()) {
                            awaitPointerEventScope2 = awaitPointerEventScope4;
                            pointerInputChange = pointerInputChange12;
                            c = 4;
                            if (pointerInputChange != null) {
                            }
                            if (pointerInputChange != null) {
                            }
                            return Unit.INSTANCE;
                        }
                        touchSlopDetector.reset();
                        awaitPointerEventScope3 = awaitPointerEventScope4;
                        i2 = 3;
                        i3 = 1;
                        r9 = 0;
                    }
                    this.L$0 = awaitPointerEventScope3;
                    this.L$1 = pointerInputChange2;
                    this.L$2 = awaitPointerEventScope2;
                    this.L$3 = longRef2;
                    this.L$4 = longRef;
                    this.L$5 = touchSlopDetector;
                    this.L$6 = r9;
                    this.F$0 = f;
                    this.label = i2;
                    obj2 = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, r9, this, i3, r9);
                }
                awaitPointerEventScope2 = awaitPointerEventScope4;
                c = 4;
                pointerInputChange = null;
                if (pointerInputChange != null) {
                }
                if (pointerInputChange != null) {
                }
                return Unit.INSTANCE;
            }
            if (i != 4) {
                if (i != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Ref.LongRef longRef6 = (Ref.LongRef) this.L$4;
                AwaitPointerEventScope awaitPointerEventScope9 = (AwaitPointerEventScope) this.L$3;
                orientation = (Orientation) this.L$2;
                Function2<PointerInputChange, Offset, Unit> function22 = (Function2) this.L$1;
                AwaitPointerEventScope awaitPointerEventScope10 = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                Object awaitPointerEvent$default = obj;
                PointerEvent pointerEvent2 = (PointerEvent) awaitPointerEvent$default;
                List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                int size3 = changes3.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size3) {
                        awaitPointerEventScope5 = awaitPointerEventScope10;
                        pointerInputChange8 = null;
                        break;
                    }
                    pointerInputChange8 = changes3.get(i6);
                    awaitPointerEventScope5 = awaitPointerEventScope10;
                    if (PointerId.m5005equalsimpl0(pointerInputChange8.getId(), longRef6.element)) {
                        break;
                    }
                    i6++;
                    awaitPointerEventScope10 = awaitPointerEventScope5;
                }
                PointerInputChange pointerInputChange15 = pointerInputChange8;
                if (pointerInputChange15 == null) {
                    pointerInputChange15 = null;
                } else if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange15)) {
                    List<PointerInputChange> changes4 = pointerEvent2.getChanges();
                    int size4 = changes4.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= size4) {
                            pointerInputChange9 = null;
                            break;
                        }
                        pointerInputChange9 = changes4.get(i7);
                        if (pointerInputChange9.getPressed()) {
                            break;
                        }
                        i7++;
                    }
                    PointerInputChange pointerInputChange16 = pointerInputChange9;
                    if (pointerInputChange16 != null) {
                        longRef6.element = pointerInputChange16.getId();
                        awaitPointerEventScope10 = awaitPointerEventScope5;
                        this.L$0 = awaitPointerEventScope10;
                        this.L$1 = function22;
                        this.L$2 = orientation;
                        this.L$3 = awaitPointerEventScope9;
                        this.L$4 = longRef6;
                        this.L$5 = null;
                        this.L$6 = null;
                        this.label = 5;
                        awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope9, null, this, 1, null);
                    }
                } else {
                    long positionChangeIgnoreConsumed = PointerEventKt.positionChangeIgnoreConsumed(pointerInputChange15);
                }
                if (pointerInputChange15 != null && !pointerInputChange15.isConsumed()) {
                    if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange15)) {
                        pointerInputChange7 = pointerInputChange15;
                        if (pointerInputChange7 != null) {
                            this.$onDragCancel.invoke();
                        } else {
                            this.$onDragEnd.invoke(pointerInputChange7);
                        }
                        return Unit.INSTANCE;
                    }
                    function22.invoke(pointerInputChange15, Offset.m3571boximpl(PointerEventKt.positionChange(pointerInputChange15)));
                    pointerInputChange15.consume();
                    id = pointerInputChange15.getId();
                    awaitPointerEventScope2 = awaitPointerEventScope5;
                    function2 = function22;
                    Ref.LongRef longRef7 = new Ref.LongRef();
                    longRef7.element = id;
                    longRef6 = longRef7;
                    awaitPointerEventScope10 = awaitPointerEventScope2;
                    function22 = function2;
                    awaitPointerEventScope9 = awaitPointerEventScope10;
                    this.L$0 = awaitPointerEventScope10;
                    this.L$1 = function22;
                    this.L$2 = orientation;
                    this.L$3 = awaitPointerEventScope9;
                    this.L$4 = longRef6;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.label = 5;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope9, null, this, 1, null);
                }
                pointerInputChange7 = null;
                if (pointerInputChange7 != null) {
                }
                return Unit.INSTANCE;
            }
            f = this.F$0;
            pointerInputChange4 = (PointerInputChange) this.L$6;
            TouchSlopDetector touchSlopDetector3 = (TouchSlopDetector) this.L$5;
            Ref.LongRef longRef8 = (Ref.LongRef) this.L$4;
            Ref.LongRef longRef9 = (Ref.LongRef) this.L$3;
            AwaitPointerEventScope awaitPointerEventScope11 = (AwaitPointerEventScope) this.L$2;
            pointerInputChange5 = (PointerInputChange) this.L$1;
            AwaitPointerEventScope awaitPointerEventScope12 = (AwaitPointerEventScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            c = 4;
            longRef3 = longRef9;
            touchSlopDetector = touchSlopDetector3;
            awaitPointerEventScope3 = awaitPointerEventScope12;
            longRef = longRef8;
            awaitPointerEventScope2 = awaitPointerEventScope11;
            if (!pointerInputChange4.isConsumed()) {
                awaitPointerEventScope2 = awaitPointerEventScope3;
                pointerInputChange2 = pointerInputChange5;
                pointerInputChange = null;
                if (pointerInputChange != null && !pointerInputChange.isConsumed()) {
                    c2 = c;
                    i2 = 3;
                    i3 = 1;
                    r9 = 0;
                    long id2 = pointerInputChange2.getId();
                    int type = pointerInputChange2.getType();
                    Orientation orientation2 = this.$orientationLock;
                    longRef2 = this.$overSlop;
                    if (!DragGestureDetectorKt.m416isPointerUpDmW0f2w(awaitPointerEventScope2.getCurrentEvent(), id2)) {
                        c = c2;
                        pointerInputChange = r9;
                        if (pointerInputChange != null) {
                            c2 = c;
                            i2 = 3;
                            i3 = 1;
                            r9 = 0;
                            long id22 = pointerInputChange2.getId();
                            int type2 = pointerInputChange2.getType();
                            Orientation orientation22 = this.$orientationLock;
                            longRef2 = this.$overSlop;
                            if (!DragGestureDetectorKt.m416isPointerUpDmW0f2w(awaitPointerEventScope2.getCurrentEvent(), id22)) {
                                f = DragGestureDetectorKt.m417pointerSlopE8SPZFQ(awaitPointerEventScope2.getViewConfiguration(), type2);
                                longRef = new Ref.LongRef();
                                longRef.element = id22;
                                touchSlopDetector = new TouchSlopDetector(orientation22);
                                awaitPointerEventScope3 = awaitPointerEventScope2;
                                this.L$0 = awaitPointerEventScope3;
                                this.L$1 = pointerInputChange2;
                                this.L$2 = awaitPointerEventScope2;
                                this.L$3 = longRef2;
                                this.L$4 = longRef;
                                this.L$5 = touchSlopDetector;
                                this.L$6 = r9;
                                this.F$0 = f;
                                this.label = i2;
                                obj2 = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, r9, this, i3, r9);
                            }
                        }
                    }
                }
                if (pointerInputChange != null) {
                    this.$onDragStart.invoke(pointerInputChange2, pointerInputChange, Offset.m3571boximpl(this.$overSlop.element));
                    this.$onDrag.invoke(pointerInputChange, Offset.m3571boximpl(this.$overSlop.element));
                    id = pointerInputChange.getId();
                    function2 = this.$onDrag;
                    orientation = this.$orientationLock;
                }
                return Unit.INSTANCE;
            }
            pointerInputChange2 = pointerInputChange5;
            i2 = 3;
            i3 = 1;
            r9 = 0;
            longRef2 = longRef3;
            this.L$0 = awaitPointerEventScope3;
            this.L$1 = pointerInputChange2;
            this.L$2 = awaitPointerEventScope2;
            this.L$3 = longRef2;
            this.L$4 = longRef;
            this.L$5 = touchSlopDetector;
            this.L$6 = r9;
            this.F$0 = f;
            this.label = i2;
            obj2 = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, r9, this, i3, r9);
        }
        awaitPointerEventScope2 = awaitPointerEventScope;
        PointerInputChange pointerInputChange17 = (PointerInputChange) awaitFirstDown;
        boolean booleanValue = this.$shouldAwaitTouchSlop.invoke().booleanValue();
        if (!booleanValue) {
            pointerInputChange17.consume();
        }
        this.L$0 = awaitPointerEventScope2;
        this.L$1 = pointerInputChange17;
        this.Z$0 = booleanValue;
        this.label = 2;
        awaitFirstDown$default = TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope2, false, null, this, 2, null);
        if (awaitFirstDown$default != coroutine_suspended) {
            pointerInputChange = pointerInputChange17;
            z = booleanValue;
            pointerInputChange2 = (PointerInputChange) awaitFirstDown$default;
            this.$overSlop.element = Offset.INSTANCE.m3598getZeroF1C5BW0();
        }
        return coroutine_suspended;
    }
}
