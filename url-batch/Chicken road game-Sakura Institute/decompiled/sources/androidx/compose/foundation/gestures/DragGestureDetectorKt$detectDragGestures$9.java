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

    /* JADX WARN: Code restructure failed: missing block: B:123:0x025d, code lost:
    
        if (androidx.compose.foundation.gestures.DragGestureDetectorKt.m424isPointerUpDmW0f2w(r11.getCurrentEvent(), r2) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0101, code lost:
    
        if (r2 == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x030d, code lost:
    
        if ((!((r5 != null ? r5 == androidx.compose.foundation.gestures.Orientation.Vertical ? androidx.compose.ui.geometry.Offset.m3600getYimpl(r7) : androidx.compose.ui.geometry.Offset.m3599getXimpl(r7) : androidx.compose.ui.geometry.Offset.m3597getDistanceimpl(r7)) == 0.0f)) != false) goto L126;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0289 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02b0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0196  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v5, types: [androidx.compose.ui.input.pointer.PointerEventPass, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x01d4 -> B:68:0x0216). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:110:0x0207 -> B:64:0x020d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0287 -> B:9:0x028a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x0119 -> B:68:0x0216). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x0184 -> B:67:0x0215). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AwaitPointerEventScope awaitPointerEventScope;
        Object awaitFirstDown;
        PointerInputChange pointerInputChange;
        Object awaitFirstDown$default;
        AwaitPointerEventScope awaitPointerEventScope2;
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
        int size;
        int i;
        AwaitPointerEventScope awaitPointerEventScope4;
        PointerInputChange pointerInputChange3;
        PointerInputChange pointerInputChange4;
        char c;
        PointerInputChange pointerInputChange5;
        PointerInputChange pointerInputChange6;
        PointerInputChange pointerInputChange7;
        PointerInputChange pointerInputChange8;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        char c2 = 4;
        int i3 = 3;
        int i4 = 1;
        ?? r9 = 0;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
            this.L$0 = awaitPointerEventScope;
            this.label = 1;
            awaitFirstDown = TapGestureDetectorKt.awaitFirstDown(awaitPointerEventScope, false, PointerEventPass.Initial, this);
            if (awaitFirstDown == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i2 == 1) {
            awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            awaitFirstDown = obj;
        } else if (i2 == 2) {
            z = this.Z$0;
            PointerInputChange pointerInputChange9 = (PointerInputChange) this.L$1;
            AwaitPointerEventScope awaitPointerEventScope5 = (AwaitPointerEventScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            awaitPointerEventScope2 = awaitPointerEventScope5;
            pointerInputChange = pointerInputChange9;
            awaitFirstDown$default = obj;
            pointerInputChange2 = (PointerInputChange) awaitFirstDown$default;
            this.$overSlop.element = Offset.INSTANCE.m3615getZeroF1C5BW0();
        } else {
            if (i2 == 3) {
                f = this.F$0;
                TouchSlopDetector touchSlopDetector2 = (TouchSlopDetector) this.L$5;
                Ref.LongRef longRef3 = (Ref.LongRef) this.L$4;
                Ref.LongRef longRef4 = (Ref.LongRef) this.L$3;
                AwaitPointerEventScope awaitPointerEventScope6 = (AwaitPointerEventScope) this.L$2;
                PointerInputChange pointerInputChange10 = (PointerInputChange) this.L$1;
                AwaitPointerEventScope awaitPointerEventScope7 = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                longRef = longRef3;
                awaitPointerEventScope3 = awaitPointerEventScope7;
                longRef2 = longRef4;
                awaitPointerEventScope2 = awaitPointerEventScope6;
                touchSlopDetector = touchSlopDetector2;
                pointerInputChange2 = pointerInputChange10;
                obj2 = obj;
                PointerEvent pointerEvent = (PointerEvent) obj2;
                List<PointerInputChange> changes = pointerEvent.getChanges();
                size = changes.size();
                i = 0;
                while (true) {
                    if (i < size) {
                    }
                    i++;
                    awaitPointerEventScope3 = awaitPointerEventScope4;
                }
                pointerInputChange4 = pointerInputChange3;
                if (pointerInputChange4 != null) {
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
            if (i2 != 4) {
                if (i2 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Ref.LongRef longRef5 = (Ref.LongRef) this.L$4;
                AwaitPointerEventScope awaitPointerEventScope8 = (AwaitPointerEventScope) this.L$3;
                orientation = (Orientation) this.L$2;
                Function2<PointerInputChange, Offset, Unit> function22 = (Function2) this.L$1;
                AwaitPointerEventScope awaitPointerEventScope9 = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                Object awaitPointerEvent$default = obj;
                PointerEvent pointerEvent2 = (PointerEvent) awaitPointerEvent$default;
                List<PointerInputChange> changes2 = pointerEvent2.getChanges();
                int size2 = changes2.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size2) {
                        pointerInputChange7 = null;
                        break;
                    }
                    pointerInputChange7 = changes2.get(i5);
                    if (PointerId.m5028equalsimpl0(pointerInputChange7.getId(), longRef5.element)) {
                        break;
                    }
                    i5++;
                }
                PointerInputChange pointerInputChange11 = pointerInputChange7;
                if (pointerInputChange11 == null) {
                    if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange11)) {
                        List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                        int size3 = changes3.size();
                        int i6 = 0;
                        while (true) {
                            if (i6 >= size3) {
                                pointerInputChange8 = null;
                                break;
                            }
                            pointerInputChange8 = changes3.get(i6);
                            if (pointerInputChange8.getPressed()) {
                                break;
                            }
                            i6++;
                        }
                        PointerInputChange pointerInputChange12 = pointerInputChange8;
                        if (pointerInputChange12 != null) {
                            longRef5.element = pointerInputChange12.getId();
                            this.L$0 = awaitPointerEventScope9;
                            this.L$1 = function22;
                            this.L$2 = orientation;
                            this.L$3 = awaitPointerEventScope8;
                            this.L$4 = longRef5;
                            this.L$5 = null;
                            this.L$6 = null;
                            this.label = 5;
                            awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope8, null, this, 1, null);
                            if (awaitPointerEvent$default == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        long positionChangeIgnoreConsumed = PointerEventKt.positionChangeIgnoreConsumed(pointerInputChange11);
                    }
                    PointerEvent pointerEvent22 = (PointerEvent) awaitPointerEvent$default;
                    List<PointerInputChange> changes22 = pointerEvent22.getChanges();
                    int size22 = changes22.size();
                    int i52 = 0;
                    while (true) {
                        if (i52 >= size22) {
                        }
                        i52++;
                    }
                    PointerInputChange pointerInputChange112 = pointerInputChange7;
                    if (pointerInputChange112 == null) {
                        pointerInputChange112 = null;
                    }
                }
                if (pointerInputChange112 != null && !pointerInputChange112.isConsumed()) {
                    if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange112)) {
                        pointerInputChange6 = pointerInputChange112;
                        if (pointerInputChange6 != null) {
                            this.$onDragCancel.invoke();
                        } else {
                            this.$onDragEnd.invoke(pointerInputChange6);
                        }
                        return Unit.INSTANCE;
                    }
                    function22.invoke(pointerInputChange112, Offset.m3588boximpl(PointerEventKt.positionChange(pointerInputChange112)));
                    pointerInputChange112.consume();
                    function2 = function22;
                    id = pointerInputChange112.getId();
                    awaitPointerEventScope2 = awaitPointerEventScope9;
                    Ref.LongRef longRef6 = new Ref.LongRef();
                    longRef6.element = id;
                    longRef5 = longRef6;
                    awaitPointerEventScope9 = awaitPointerEventScope2;
                    function22 = function2;
                    awaitPointerEventScope8 = awaitPointerEventScope9;
                    this.L$0 = awaitPointerEventScope9;
                    this.L$1 = function22;
                    this.L$2 = orientation;
                    this.L$3 = awaitPointerEventScope8;
                    this.L$4 = longRef5;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.label = 5;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope8, null, this, 1, null);
                    if (awaitPointerEvent$default == coroutine_suspended) {
                    }
                    PointerEvent pointerEvent222 = (PointerEvent) awaitPointerEvent$default;
                    List<PointerInputChange> changes222 = pointerEvent222.getChanges();
                    int size222 = changes222.size();
                    int i522 = 0;
                    while (true) {
                        if (i522 >= size222) {
                        }
                        i522++;
                    }
                    PointerInputChange pointerInputChange1122 = pointerInputChange7;
                    if (pointerInputChange1122 == null) {
                    }
                    if (pointerInputChange1122 != null) {
                        if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange1122)) {
                        }
                    }
                }
                pointerInputChange6 = null;
                if (pointerInputChange6 != null) {
                }
                return Unit.INSTANCE;
            }
            f = this.F$0;
            PointerInputChange pointerInputChange13 = (PointerInputChange) this.L$6;
            TouchSlopDetector touchSlopDetector3 = (TouchSlopDetector) this.L$5;
            Ref.LongRef longRef7 = (Ref.LongRef) this.L$4;
            Ref.LongRef longRef8 = (Ref.LongRef) this.L$3;
            AwaitPointerEventScope awaitPointerEventScope10 = (AwaitPointerEventScope) this.L$2;
            PointerInputChange pointerInputChange14 = (PointerInputChange) this.L$1;
            AwaitPointerEventScope awaitPointerEventScope11 = (AwaitPointerEventScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            c = 4;
            Ref.LongRef longRef9 = longRef8;
            touchSlopDetector = touchSlopDetector3;
            awaitPointerEventScope3 = awaitPointerEventScope11;
            longRef = longRef7;
            awaitPointerEventScope2 = awaitPointerEventScope10;
            if (!pointerInputChange13.isConsumed()) {
                awaitPointerEventScope2 = awaitPointerEventScope3;
                pointerInputChange2 = pointerInputChange14;
                pointerInputChange = null;
                if (pointerInputChange != null && !pointerInputChange.isConsumed()) {
                    c2 = c;
                    i3 = 3;
                    i4 = 1;
                    r9 = 0;
                    long id2 = pointerInputChange2.getId();
                    int type = pointerInputChange2.getType();
                    Orientation orientation2 = this.$orientationLock;
                    longRef2 = this.$overSlop;
                    if (!DragGestureDetectorKt.m424isPointerUpDmW0f2w(awaitPointerEventScope2.getCurrentEvent(), id2)) {
                        c = c2;
                        pointerInputChange = r9;
                        if (pointerInputChange != null) {
                            c2 = c;
                            i3 = 3;
                            i4 = 1;
                            r9 = 0;
                            long id22 = pointerInputChange2.getId();
                            int type2 = pointerInputChange2.getType();
                            Orientation orientation22 = this.$orientationLock;
                            longRef2 = this.$overSlop;
                            if (!DragGestureDetectorKt.m424isPointerUpDmW0f2w(awaitPointerEventScope2.getCurrentEvent(), id22)) {
                                f = DragGestureDetectorKt.m425pointerSlopE8SPZFQ(awaitPointerEventScope2.getViewConfiguration(), type2);
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
                                this.label = i3;
                                obj2 = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, r9, this, i4, r9);
                                if (obj2 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                PointerEvent pointerEvent3 = (PointerEvent) obj2;
                                List<PointerInputChange> changes4 = pointerEvent3.getChanges();
                                size = changes4.size();
                                i = 0;
                                while (true) {
                                    if (i < size) {
                                        awaitPointerEventScope4 = awaitPointerEventScope3;
                                        pointerInputChange3 = null;
                                        break;
                                    }
                                    pointerInputChange3 = changes4.get(i);
                                    awaitPointerEventScope4 = awaitPointerEventScope3;
                                    if (PointerId.m5028equalsimpl0(pointerInputChange3.getId(), longRef.element)) {
                                        break;
                                    }
                                    i++;
                                    awaitPointerEventScope3 = awaitPointerEventScope4;
                                }
                                pointerInputChange4 = pointerInputChange3;
                                if (pointerInputChange4 != null && !pointerInputChange4.isConsumed()) {
                                    if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange4)) {
                                        List<PointerInputChange> changes5 = pointerEvent3.getChanges();
                                        int size4 = changes5.size();
                                        int i7 = 0;
                                        while (true) {
                                            if (i7 >= size4) {
                                                pointerInputChange5 = null;
                                                break;
                                            }
                                            pointerInputChange5 = changes5.get(i7);
                                            if (pointerInputChange5.getPressed()) {
                                                break;
                                            }
                                            i7++;
                                        }
                                        PointerInputChange pointerInputChange15 = pointerInputChange5;
                                        if (pointerInputChange15 != null) {
                                            longRef.element = pointerInputChange15.getId();
                                            awaitPointerEventScope3 = awaitPointerEventScope4;
                                            i3 = 3;
                                            i4 = 1;
                                            r9 = 0;
                                        }
                                    } else {
                                        Offset m504addPointerInputChangeGcwITfU = touchSlopDetector.m504addPointerInputChangeGcwITfU(pointerInputChange4, f);
                                        if (m504addPointerInputChangeGcwITfU != null) {
                                            long packedValue = m504addPointerInputChangeGcwITfU.getPackedValue();
                                            pointerInputChange4.consume();
                                            longRef2.element = packedValue;
                                            if (pointerInputChange4.isConsumed()) {
                                                awaitPointerEventScope2 = awaitPointerEventScope4;
                                                pointerInputChange = pointerInputChange4;
                                                c = 4;
                                                if (pointerInputChange != null) {
                                                }
                                            } else {
                                                touchSlopDetector.reset();
                                                awaitPointerEventScope3 = awaitPointerEventScope4;
                                                i3 = 3;
                                                i4 = 1;
                                                r9 = 0;
                                            }
                                        } else {
                                            awaitPointerEventScope3 = awaitPointerEventScope4;
                                            this.L$0 = awaitPointerEventScope3;
                                            this.L$1 = pointerInputChange2;
                                            this.L$2 = awaitPointerEventScope2;
                                            this.L$3 = longRef2;
                                            this.L$4 = longRef;
                                            this.L$5 = touchSlopDetector;
                                            this.L$6 = pointerInputChange4;
                                            this.F$0 = f;
                                            c = 4;
                                            this.label = 4;
                                            if (awaitPointerEventScope2.awaitPointerEvent(PointerEventPass.Final, this) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            PointerInputChange pointerInputChange16 = pointerInputChange2;
                                            pointerInputChange13 = pointerInputChange4;
                                            longRef9 = longRef2;
                                            pointerInputChange14 = pointerInputChange16;
                                            if (!pointerInputChange13.isConsumed()) {
                                                pointerInputChange2 = pointerInputChange14;
                                                i3 = 3;
                                                i4 = 1;
                                                r9 = 0;
                                                longRef2 = longRef9;
                                            }
                                        }
                                    }
                                    this.L$0 = awaitPointerEventScope3;
                                    this.L$1 = pointerInputChange2;
                                    this.L$2 = awaitPointerEventScope2;
                                    this.L$3 = longRef2;
                                    this.L$4 = longRef;
                                    this.L$5 = touchSlopDetector;
                                    this.L$6 = r9;
                                    this.F$0 = f;
                                    this.label = i3;
                                    obj2 = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, r9, this, i4, r9);
                                    if (obj2 == coroutine_suspended) {
                                    }
                                    PointerEvent pointerEvent32 = (PointerEvent) obj2;
                                    List<PointerInputChange> changes42 = pointerEvent32.getChanges();
                                    size = changes42.size();
                                    i = 0;
                                    while (true) {
                                        if (i < size) {
                                        }
                                        i++;
                                        awaitPointerEventScope3 = awaitPointerEventScope4;
                                    }
                                    pointerInputChange4 = pointerInputChange3;
                                    if (pointerInputChange4 != null) {
                                        if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange4)) {
                                        }
                                        this.L$0 = awaitPointerEventScope3;
                                        this.L$1 = pointerInputChange2;
                                        this.L$2 = awaitPointerEventScope2;
                                        this.L$3 = longRef2;
                                        this.L$4 = longRef;
                                        this.L$5 = touchSlopDetector;
                                        this.L$6 = r9;
                                        this.F$0 = f;
                                        this.label = i3;
                                        obj2 = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, r9, this, i4, r9);
                                        if (obj2 == coroutine_suspended) {
                                        }
                                        PointerEvent pointerEvent322 = (PointerEvent) obj2;
                                        List<PointerInputChange> changes422 = pointerEvent322.getChanges();
                                        size = changes422.size();
                                        i = 0;
                                        while (true) {
                                            if (i < size) {
                                            }
                                            i++;
                                            awaitPointerEventScope3 = awaitPointerEventScope4;
                                        }
                                        pointerInputChange4 = pointerInputChange3;
                                        if (pointerInputChange4 != null) {
                                        }
                                    }
                                }
                                awaitPointerEventScope2 = awaitPointerEventScope4;
                                c = 4;
                                pointerInputChange = null;
                                if (pointerInputChange != null) {
                                }
                            }
                        }
                    }
                }
                if (pointerInputChange != null) {
                    this.$onDragStart.invoke(pointerInputChange2, pointerInputChange, Offset.m3588boximpl(this.$overSlop.element));
                    this.$onDrag.invoke(pointerInputChange, Offset.m3588boximpl(this.$overSlop.element));
                    id = pointerInputChange.getId();
                    function2 = this.$onDrag;
                    orientation = this.$orientationLock;
                }
                return Unit.INSTANCE;
            }
        }
        pointerInputChange = (PointerInputChange) awaitFirstDown;
        boolean booleanValue = this.$shouldAwaitTouchSlop.invoke().booleanValue();
        if (!booleanValue) {
            pointerInputChange.consume();
        }
        this.L$0 = awaitPointerEventScope;
        this.L$1 = pointerInputChange;
        this.Z$0 = booleanValue;
        this.label = 2;
        awaitFirstDown$default = TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope, false, null, this, 2, null);
        if (awaitFirstDown$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        awaitPointerEventScope2 = awaitPointerEventScope;
        z = booleanValue;
        pointerInputChange2 = (PointerInputChange) awaitFirstDown$default;
        this.$overSlop.element = Offset.INSTANCE.m3615getZeroF1C5BW0();
    }
}
