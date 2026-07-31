package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$13", f = "DragGestureDetector.kt", i = {0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7}, l = {248, 254, 1116, 1158, 279, 1197, 1240, 1252}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "initialDown", "awaitTouchSlop", "$this$awaitEachGesture", "down", "$this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv", "pointer$iv", "touchSlopDetector$iv", "touchSlop$iv", "$this$awaitEachGesture", "down", "$this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv", "pointer$iv", "touchSlopDetector$iv", "dragEvent$iv", "touchSlop$iv", "$this$awaitEachGesture", "down", "drag", "$this$awaitEachGesture", "down", "$this$awaitPointerSlopOrCancellation_u2d6ksA65w$iv", "pointer$iv", "touchSlopDetector$iv", "touchSlop$iv", "$this$awaitEachGesture", "down", "$this$awaitPointerSlopOrCancellation_u2d6ksA65w$iv", "pointer$iv", "touchSlopDetector$iv", "dragEvent$iv", "touchSlop$iv", "$this$drag_u2dVnAYq1g$iv", "$this$awaitDragOrUp_u2djO51t88$iv$iv", "pointer$iv$iv"}, s = {"L$0", "L$0", "L$1", "Z$0", "L$0", "L$1", "L$2", "L$4", "L$5", "F$0", "L$0", "L$1", "L$2", "L$4", "L$5", "L$6", "F$0", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$4", "L$5", "F$0", "L$0", "L$1", "L$2", "L$4", "L$5", "L$6", "F$0", "L$0", "L$2", "L$3"}, v = 1)
/* loaded from: classes.dex */
final class DragGestureDetectorKt$detectDragGestures$13 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
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
    DragGestureDetectorKt$detectDragGestures$13(Function0<Boolean> function0, Ref.LongRef longRef, Orientation orientation, Function3<? super PointerInputChange, ? super PointerInputChange, ? super Offset, Unit> function3, Function2<? super PointerInputChange, ? super Offset, Unit> function2, Function0<Unit> function02, Function1<? super PointerInputChange, Unit> function1, Continuation<? super DragGestureDetectorKt$detectDragGestures$13> continuation) {
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
        DragGestureDetectorKt$detectDragGestures$13 dragGestureDetectorKt$detectDragGestures$13 = new DragGestureDetectorKt$detectDragGestures$13(this.$shouldAwaitTouchSlop, this.$overSlop, this.$orientationLock, this.$onDragStart, this.$onDrag, this.$onDragCancel, this.$onDragEnd, continuation);
        dragGestureDetectorKt$detectDragGestures$13.L$0 = obj;
        return dragGestureDetectorKt$detectDragGestures$13;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
        return ((DragGestureDetectorKt$detectDragGestures$13) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:213:0x01a9, code lost:
    
        if (r6 != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0199, code lost:
    
        if (r2 == r1) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0167, code lost:
    
        if (r5 == r1) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x055c, code lost:
    
        if (r7 == r1) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x05e9, code lost:
    
        if (r7 == false) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0325, code lost:
    
        if (r3 == r1) goto L172;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:35:0x0596, B:46:0x05c3], limit reached: 222 */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x042a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x022c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02e8  */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r11v7, types: [kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:126:0x04d5 -> B:58:0x04da). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:130:0x04f4 -> B:62:0x02e6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:149:0x01c5 -> B:143:0x02d1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:161:0x0232 -> B:142:0x02cf). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:163:0x023a -> B:142:0x02cf). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:172:0x0266 -> B:142:0x02cf). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:180:0x0296 -> B:144:0x02d2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:184:0x02c5 -> B:140:0x02c9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x055c -> B:7:0x055f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x035d -> B:68:0x030b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x03b5 -> B:61:0x04e4). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        long j2;
        AwaitPointerEventScope awaitPointerEventScope;
        Object awaitFirstDown;
        PointerInputChange pointerInputChange;
        boolean booleanValue;
        AwaitPointerEventScope awaitPointerEventScope2;
        Object awaitFirstDown$default;
        PointerInputChange pointerInputChange2;
        Ref.LongRef longRef;
        AwaitPointerEventScope awaitPointerEventScope3;
        PointerInputChange pointerInputChange3;
        Ref.LongRef longRef2;
        AwaitPointerEventScope awaitPointerEventScope4;
        TouchSlopDetector touchSlopDetector;
        float f;
        PointerInputChange pointerInputChange4;
        PointerInputChange pointerInputChange5;
        PointerInputChange pointerInputChange6;
        AwaitPointerEventScope awaitPointerEventScope5;
        Object obj2;
        TouchSlopDetector touchSlopDetector2;
        PointerInputChange pointerInputChange7;
        Object obj3;
        float f2;
        Ref.LongRef longRef3;
        AwaitPointerEventScope awaitPointerEventScope6;
        AwaitPointerEventScope awaitPointerEventScope7;
        Ref.LongRef longRef4;
        PointerEvent pointerEvent;
        int size;
        int i;
        PointerEvent pointerEvent2;
        TouchSlopDetector touchSlopDetector3;
        PointerInputChange pointerInputChange8;
        PointerInputChange pointerInputChange9;
        PointerInputChange pointerInputChange10;
        TouchSlopDetector touchSlopDetector4;
        AwaitPointerEventScope awaitPointerEventScope8;
        float f3;
        Ref.LongRef longRef5;
        TouchSlopDetector touchSlopDetector5;
        TouchSlopDetector touchSlopDetector6;
        Ref.LongRef longRef6;
        PointerInputChange pointerInputChange11;
        long id;
        Function2<PointerInputChange, Offset, Unit> function2;
        Orientation orientation;
        PointerInputChange pointerInputChange12;
        AwaitPointerEventScope awaitPointerEventScope9;
        AwaitPointerEventScope awaitPointerEventScope10;
        Ref.LongRef longRef7;
        Object awaitPointerEvent$default;
        PointerInputChange pointerInputChange13;
        boolean z;
        PointerInputChange pointerInputChange14;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = 0;
        int i3 = 1;
        PointerEventPass pointerEventPass = 0;
        Object obj4 = null;
        pointerEventPass = 0;
        pointerEventPass = 0;
        switch (this.label) {
            case 0:
                j = InlineClassHelperKt.UnspecifiedPackedFloats;
                j2 = 9223372034707292159L;
                ResultKt.throwOnFailure(obj);
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                this.L$0 = awaitPointerEventScope;
                this.label = 1;
                awaitFirstDown = TapGestureDetectorKt.awaitFirstDown(awaitPointerEventScope, false, PointerEventPass.Initial, this);
                break;
            case 1:
                j = InlineClassHelperKt.UnspecifiedPackedFloats;
                j2 = 9223372034707292159L;
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                awaitFirstDown = obj;
                pointerInputChange = (PointerInputChange) awaitFirstDown;
                booleanValue = this.$shouldAwaitTouchSlop.invoke().booleanValue();
                if (!booleanValue) {
                    pointerInputChange.consume();
                }
                this.L$0 = awaitPointerEventScope;
                this.L$1 = pointerInputChange;
                this.Z$0 = booleanValue;
                this.label = 2;
                awaitPointerEventScope2 = awaitPointerEventScope;
                awaitFirstDown$default = TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope2, false, null, this, 2, null);
                break;
            case 2:
                j = InlineClassHelperKt.UnspecifiedPackedFloats;
                j2 = 9223372034707292159L;
                boolean z2 = this.Z$0;
                pointerInputChange = (PointerInputChange) this.L$1;
                AwaitPointerEventScope awaitPointerEventScope11 = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                awaitPointerEventScope2 = awaitPointerEventScope11;
                booleanValue = z2;
                awaitFirstDown$default = obj;
                pointerInputChange2 = (PointerInputChange) awaitFirstDown$default;
                this.$overSlop.element = Offset.INSTANCE.m5164getZeroF1C5BW0();
                break;
            case 3:
                j = InlineClassHelperKt.UnspecifiedPackedFloats;
                j2 = 9223372034707292159L;
                float f4 = this.F$0;
                TouchSlopDetector touchSlopDetector7 = (TouchSlopDetector) this.L$5;
                Ref.LongRef longRef8 = (Ref.LongRef) this.L$4;
                Ref.LongRef longRef9 = (Ref.LongRef) this.L$3;
                AwaitPointerEventScope awaitPointerEventScope12 = (AwaitPointerEventScope) this.L$2;
                PointerInputChange pointerInputChange15 = (PointerInputChange) this.L$1;
                AwaitPointerEventScope awaitPointerEventScope13 = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                float f5 = f4;
                longRef = longRef8;
                AwaitPointerEventScope awaitPointerEventScope14 = awaitPointerEventScope12;
                pointerInputChange2 = pointerInputChange15;
                awaitPointerEventScope3 = awaitPointerEventScope13;
                Object obj5 = obj;
                Ref.LongRef longRef10 = longRef9;
                TouchSlopDetector touchSlopDetector8 = touchSlopDetector7;
                PointerEvent pointerEvent3 = (PointerEvent) obj5;
                List<PointerInputChange> changes = pointerEvent3.getChanges();
                int size2 = changes.size();
                int i4 = i2;
                while (true) {
                    if (i4 >= size2) {
                        pointerInputChange3 = changes.get(i4);
                        if (!PointerId.m6695equalsimpl0(pointerInputChange3.getId(), longRef.element)) {
                            i4++;
                        }
                    } else {
                        pointerInputChange3 = null;
                    }
                }
                pointerInputChange = pointerInputChange3;
                if (pointerInputChange != null && !pointerInputChange.isConsumed()) {
                    if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                        long m690addPositionsakrDWew = touchSlopDetector8.m690addPositionsakrDWew(pointerInputChange.getPosition(), pointerInputChange.getPreviousPosition(), f5);
                        float f6 = f5;
                        if ((m690addPositionsakrDWew & j2) == j) {
                            this.L$0 = awaitPointerEventScope3;
                            this.L$1 = pointerInputChange2;
                            this.L$2 = awaitPointerEventScope14;
                            this.L$3 = longRef10;
                            this.L$4 = longRef;
                            this.L$5 = touchSlopDetector8;
                            this.L$6 = pointerInputChange;
                            this.F$0 = f6;
                            this.label = 4;
                            if (awaitPointerEventScope14.awaitPointerEvent(PointerEventPass.Final, this) != coroutine_suspended) {
                                longRef2 = longRef10;
                                awaitPointerEventScope4 = awaitPointerEventScope14;
                                touchSlopDetector = touchSlopDetector8;
                                f = f6;
                                if (!pointerInputChange.isConsumed()) {
                                    touchSlopDetector7 = touchSlopDetector;
                                    awaitPointerEventScope14 = awaitPointerEventScope4;
                                    i2 = 0;
                                    i3 = 1;
                                    longRef10 = longRef2;
                                }
                            }
                            return coroutine_suspended;
                        }
                        pointerInputChange.consume();
                        longRef10.element = m690addPositionsakrDWew;
                        if (pointerInputChange.isConsumed()) {
                            awaitPointerEventScope2 = awaitPointerEventScope3;
                            if (pointerInputChange != null && !pointerInputChange.isConsumed()) {
                                i2 = 0;
                                i3 = 1;
                                long id2 = pointerInputChange2.getId();
                                int type = pointerInputChange2.getType();
                                Orientation orientation2 = this.$orientationLock;
                                longRef10 = this.$overSlop;
                                long m5164getZeroF1C5BW0 = Offset.INSTANCE.m5164getZeroF1C5BW0();
                                if (!DragGestureDetectorKt.m550isPointerUpDmW0f2w(awaitPointerEventScope2.getCurrentEvent(), id2)) {
                                    f = DragGestureDetectorKt.m551pointerSlopE8SPZFQ(awaitPointerEventScope2.getViewConfiguration(), type);
                                    longRef = new Ref.LongRef();
                                    longRef.element = id2;
                                    touchSlopDetector7 = new TouchSlopDetector(orientation2, m5164getZeroF1C5BW0, null);
                                    awaitPointerEventScope14 = awaitPointerEventScope2;
                                    awaitPointerEventScope3 = awaitPointerEventScope14;
                                }
                                pointerInputChange = null;
                                if (pointerInputChange != null) {
                                    i2 = 0;
                                    i3 = 1;
                                    long id22 = pointerInputChange2.getId();
                                    int type2 = pointerInputChange2.getType();
                                    Orientation orientation22 = this.$orientationLock;
                                    longRef10 = this.$overSlop;
                                    long m5164getZeroF1C5BW02 = Offset.INSTANCE.m5164getZeroF1C5BW0();
                                    if (!DragGestureDetectorKt.m550isPointerUpDmW0f2w(awaitPointerEventScope2.getCurrentEvent(), id22)) {
                                    }
                                    pointerInputChange = null;
                                    if (pointerInputChange != null) {
                                    }
                                }
                            }
                            if (pointerInputChange == null) {
                                List<PointerInputChange> changes2 = awaitPointerEventScope2.getCurrentEvent().getChanges();
                                int size3 = changes2.size();
                                int i5 = 0;
                                obj4 = pointerEventPass;
                                while (i5 < size3) {
                                    if (changes2.get(i5).getPressed()) {
                                        PointerInputChange pointerInputChange16 = pointerInputChange;
                                        pointerInputChange6 = pointerInputChange2;
                                        pointerInputChange5 = pointerInputChange16;
                                        awaitPointerEventScope5 = awaitPointerEventScope2;
                                        this.L$0 = awaitPointerEventScope5;
                                        this.L$1 = pointerInputChange6;
                                        this.L$2 = pointerInputChange5;
                                        this.L$3 = obj4;
                                        this.L$4 = obj4;
                                        this.L$5 = obj4;
                                        this.L$6 = obj4;
                                        this.label = 5;
                                        obj2 = awaitPointerEventScope5.awaitPointerEvent(PointerEventPass.Final, this);
                                        obj4 = obj4;
                                        break;
                                    } else {
                                        i5++;
                                        obj4 = null;
                                    }
                                }
                            }
                            if (pointerInputChange != null) {
                                this.$onDragStart.invoke(pointerInputChange2, pointerInputChange, Offset.m5137boximpl(this.$overSlop.element));
                                this.$onDrag.invoke(pointerInputChange, Offset.m5137boximpl(this.$overSlop.element));
                                id = pointerInputChange.getId();
                                function2 = this.$onDrag;
                                if (!DragGestureDetectorKt.m550isPointerUpDmW0f2w(awaitPointerEventScope2.getCurrentEvent(), id)) {
                                    orientation = null;
                                    Ref.LongRef longRef11 = new Ref.LongRef();
                                    longRef11.element = id;
                                    longRef7 = longRef11;
                                    awaitPointerEventScope10 = awaitPointerEventScope2;
                                    awaitPointerEventScope9 = awaitPointerEventScope10;
                                    this.L$0 = awaitPointerEventScope9;
                                    this.L$1 = function2;
                                    this.L$2 = awaitPointerEventScope10;
                                    this.L$3 = longRef7;
                                    this.L$4 = null;
                                    this.L$5 = null;
                                    this.L$6 = null;
                                    this.label = 8;
                                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope10, null, this, 1, null);
                                    break;
                                }
                                pointerInputChange12 = null;
                                if (pointerInputChange12 == null) {
                                    this.$onDragCancel.invoke();
                                } else {
                                    this.$onDragEnd.invoke(pointerInputChange12);
                                }
                            }
                            return Unit.INSTANCE;
                        }
                        TouchSlopDetector.m689resetk4lQ0M$default(touchSlopDetector8, 0L, 1, null);
                        touchSlopDetector7 = touchSlopDetector8;
                        f = f6;
                        i2 = 0;
                        i3 = 1;
                    } else {
                        List<PointerInputChange> changes3 = pointerEvent3.getChanges();
                        int size4 = changes3.size();
                        int i6 = 0;
                        while (true) {
                            if (i6 < size4) {
                                pointerInputChange4 = changes3.get(i6);
                                if (!pointerInputChange4.getPressed()) {
                                    i6++;
                                }
                            } else {
                                pointerInputChange4 = null;
                            }
                        }
                        PointerInputChange pointerInputChange17 = pointerInputChange4;
                        if (pointerInputChange17 != null) {
                            longRef.element = pointerInputChange17.getId();
                            touchSlopDetector7 = touchSlopDetector8;
                            f = f5;
                            i2 = 0;
                            i3 = 1;
                        }
                    }
                    this.L$0 = awaitPointerEventScope3;
                    this.L$1 = pointerInputChange2;
                    this.L$2 = awaitPointerEventScope14;
                    this.L$3 = longRef10;
                    this.L$4 = longRef;
                    this.L$5 = touchSlopDetector7;
                    this.L$6 = null;
                    this.F$0 = f;
                    this.label = 3;
                    obj5 = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope14, null, this, i3, null);
                    if (obj5 != coroutine_suspended) {
                        f5 = f;
                        TouchSlopDetector touchSlopDetector82 = touchSlopDetector7;
                        PointerEvent pointerEvent32 = (PointerEvent) obj5;
                        List<PointerInputChange> changes4 = pointerEvent32.getChanges();
                        int size22 = changes4.size();
                        int i42 = i2;
                        while (true) {
                            if (i42 >= size22) {
                            }
                            i42++;
                        }
                        pointerInputChange = pointerInputChange3;
                        if (pointerInputChange != null) {
                            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                            }
                            this.L$0 = awaitPointerEventScope3;
                            this.L$1 = pointerInputChange2;
                            this.L$2 = awaitPointerEventScope14;
                            this.L$3 = longRef10;
                            this.L$4 = longRef;
                            this.L$5 = touchSlopDetector7;
                            this.L$6 = null;
                            this.F$0 = f;
                            this.label = 3;
                            obj5 = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope14, null, this, i3, null);
                            if (obj5 != coroutine_suspended) {
                            }
                        }
                    }
                    return coroutine_suspended;
                }
                awaitPointerEventScope2 = awaitPointerEventScope3;
                pointerInputChange = null;
                if (pointerInputChange != null) {
                }
                if (pointerInputChange == null) {
                }
                if (pointerInputChange != null) {
                }
                return Unit.INSTANCE;
            case 4:
                j = InlineClassHelperKt.UnspecifiedPackedFloats;
                j2 = 9223372034707292159L;
                float f7 = this.F$0;
                pointerInputChange = (PointerInputChange) this.L$6;
                touchSlopDetector = (TouchSlopDetector) this.L$5;
                Ref.LongRef longRef12 = (Ref.LongRef) this.L$4;
                Ref.LongRef longRef13 = (Ref.LongRef) this.L$3;
                awaitPointerEventScope4 = (AwaitPointerEventScope) this.L$2;
                PointerInputChange pointerInputChange18 = (PointerInputChange) this.L$1;
                AwaitPointerEventScope awaitPointerEventScope15 = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                longRef = longRef12;
                longRef2 = longRef13;
                awaitPointerEventScope3 = awaitPointerEventScope15;
                f = f7;
                pointerInputChange2 = pointerInputChange18;
                if (!pointerInputChange.isConsumed()) {
                }
                awaitPointerEventScope2 = awaitPointerEventScope3;
                pointerInputChange = null;
                if (pointerInputChange != null) {
                }
                if (pointerInputChange == null) {
                }
                if (pointerInputChange != null) {
                }
                return Unit.INSTANCE;
            case 5:
                j = InlineClassHelperKt.UnspecifiedPackedFloats;
                j2 = 9223372034707292159L;
                pointerInputChange5 = (PointerInputChange) this.L$2;
                pointerInputChange6 = (PointerInputChange) this.L$1;
                awaitPointerEventScope5 = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                obj2 = obj;
                PointerEvent pointerEvent4 = (PointerEvent) obj2;
                List<PointerInputChange> changes5 = pointerEvent4.getChanges();
                int size5 = changes5.size();
                int i7 = 0;
                while (true) {
                    if (i7 < size5) {
                        if (changes5.get(i7).isConsumed()) {
                            List<PointerInputChange> changes6 = pointerEvent4.getChanges();
                            int size6 = changes6.size();
                            for (int i8 = 0; i8 < size6; i8++) {
                                if (changes6.get(i8).getPressed()) {
                                    break;
                                }
                            }
                        } else {
                            i7++;
                        }
                    }
                }
                List<PointerInputChange> changes7 = pointerEvent4.getChanges();
                int size7 = changes7.size();
                int i9 = 0;
                pointerEventPass = obj4;
                while (i9 < size7) {
                    if (changes7.get(i9).getPressed()) {
                        PointerInputChange pointerInputChange19 = (PointerInputChange) CollectionsKt.firstOrNull((List) pointerEvent4.getChanges());
                        long m5152minusMKHz9U = Offset.m5152minusMKHz9U(pointerInputChange19 != null ? pointerInputChange19.getPosition() : Offset.INSTANCE.m5164getZeroF1C5BW0(), pointerInputChange6.getPosition());
                        long id3 = pointerInputChange6.getId();
                        int type3 = pointerInputChange6.getType();
                        Orientation orientation3 = this.$orientationLock;
                        longRef5 = this.$overSlop;
                        if (DragGestureDetectorKt.m550isPointerUpDmW0f2w(awaitPointerEventScope5.getCurrentEvent(), id3)) {
                            pointerInputChange2 = pointerInputChange6;
                            awaitPointerEventScope2 = awaitPointerEventScope5;
                            pointerInputChange = pointerEventPass;
                            pointerEventPass = 0;
                            if (pointerInputChange == null) {
                            }
                            if (pointerInputChange != null) {
                            }
                            return Unit.INSTANCE;
                        }
                        float m551pointerSlopE8SPZFQ = DragGestureDetectorKt.m551pointerSlopE8SPZFQ(awaitPointerEventScope5.getViewConfiguration(), type3);
                        longRef6 = new Ref.LongRef();
                        longRef6.element = id3;
                        touchSlopDetector6 = new TouchSlopDetector(orientation3, m5152minusMKHz9U, pointerEventPass);
                        f3 = m551pointerSlopE8SPZFQ;
                        awaitPointerEventScope7 = awaitPointerEventScope5;
                        this.L$0 = awaitPointerEventScope7;
                        this.L$1 = pointerInputChange6;
                        this.L$2 = awaitPointerEventScope5;
                        this.L$3 = longRef5;
                        this.L$4 = longRef6;
                        this.L$5 = touchSlopDetector6;
                        this.L$6 = pointerEventPass;
                        this.F$0 = f3;
                        this.label = 6;
                        obj3 = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope5, pointerEventPass, this, 1, pointerEventPass);
                        if (obj3 != coroutine_suspended) {
                            longRef4 = longRef5;
                            longRef3 = longRef6;
                            f2 = f3;
                            pointerInputChange7 = pointerInputChange6;
                            awaitPointerEventScope6 = awaitPointerEventScope5;
                            touchSlopDetector2 = touchSlopDetector6;
                            pointerEvent = (PointerEvent) obj3;
                            List<PointerInputChange> changes8 = pointerEvent.getChanges();
                            size = changes8.size();
                            i = 0;
                            while (true) {
                                if (i >= size) {
                                    pointerInputChange9 = changes8.get(i);
                                    pointerInputChange8 = pointerInputChange7;
                                    pointerEvent2 = pointerEvent;
                                    touchSlopDetector3 = touchSlopDetector2;
                                    if (!PointerId.m6695equalsimpl0(pointerInputChange9.getId(), longRef3.element)) {
                                        i++;
                                        touchSlopDetector2 = touchSlopDetector3;
                                        pointerEvent = pointerEvent2;
                                        pointerInputChange7 = pointerInputChange8;
                                    }
                                } else {
                                    pointerEvent2 = pointerEvent;
                                    touchSlopDetector3 = touchSlopDetector2;
                                    pointerInputChange8 = pointerInputChange7;
                                    pointerInputChange9 = null;
                                }
                            }
                            pointerInputChange10 = pointerInputChange9;
                            if (pointerInputChange10 != null && !pointerInputChange10.isConsumed()) {
                                if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange10)) {
                                    touchSlopDetector4 = touchSlopDetector3;
                                    if ((touchSlopDetector4.m690addPositionsakrDWew(pointerInputChange10.getPosition(), pointerInputChange10.getPreviousPosition(), f2) & j2) != j) {
                                        pointerInputChange10.consume();
                                        longRef4.element = PointerEventKt.positionChange(pointerInputChange10);
                                        if (pointerInputChange10.isConsumed()) {
                                            pointerInputChange = pointerInputChange10;
                                            pointerInputChange2 = pointerInputChange8;
                                            awaitPointerEventScope2 = awaitPointerEventScope7;
                                            pointerEventPass = 0;
                                            if (pointerInputChange == null) {
                                            }
                                            if (pointerInputChange != null) {
                                            }
                                            return Unit.INSTANCE;
                                        }
                                        TouchSlopDetector.m689resetk4lQ0M$default(touchSlopDetector4, 0L, 1, null);
                                    } else {
                                        this.L$0 = awaitPointerEventScope7;
                                        PointerInputChange pointerInputChange20 = pointerInputChange8;
                                        this.L$1 = pointerInputChange20;
                                        this.L$2 = awaitPointerEventScope6;
                                        this.L$3 = longRef4;
                                        this.L$4 = longRef3;
                                        this.L$5 = touchSlopDetector4;
                                        this.L$6 = pointerInputChange10;
                                        this.F$0 = f2;
                                        this.label = 7;
                                        if (awaitPointerEventScope6.awaitPointerEvent(PointerEventPass.Final, this) != coroutine_suspended) {
                                            awaitPointerEventScope8 = awaitPointerEventScope6;
                                            f3 = f2;
                                            longRef5 = longRef4;
                                            touchSlopDetector5 = touchSlopDetector4;
                                            pointerInputChange6 = pointerInputChange20;
                                            if (!pointerInputChange10.isConsumed()) {
                                                awaitPointerEventScope2 = awaitPointerEventScope7;
                                                pointerInputChange2 = pointerInputChange6;
                                                pointerInputChange = null;
                                                pointerEventPass = 0;
                                                if (pointerInputChange == null) {
                                                }
                                                if (pointerInputChange != null) {
                                                }
                                                return Unit.INSTANCE;
                                            }
                                            awaitPointerEventScope5 = awaitPointerEventScope8;
                                            touchSlopDetector6 = touchSlopDetector5;
                                            longRef6 = longRef3;
                                            pointerEventPass = 0;
                                            this.L$0 = awaitPointerEventScope7;
                                            this.L$1 = pointerInputChange6;
                                            this.L$2 = awaitPointerEventScope5;
                                            this.L$3 = longRef5;
                                            this.L$4 = longRef6;
                                            this.L$5 = touchSlopDetector6;
                                            this.L$6 = pointerEventPass;
                                            this.F$0 = f3;
                                            this.label = 6;
                                            obj3 = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope5, pointerEventPass, this, 1, pointerEventPass);
                                            if (obj3 != coroutine_suspended) {
                                            }
                                        }
                                    }
                                } else {
                                    List<PointerInputChange> changes9 = pointerEvent2.getChanges();
                                    int size8 = changes9.size();
                                    int i10 = 0;
                                    while (true) {
                                        if (i10 < size8) {
                                            pointerInputChange11 = changes9.get(i10);
                                            if (!pointerInputChange11.getPressed()) {
                                                i10++;
                                            }
                                        } else {
                                            pointerInputChange11 = null;
                                        }
                                    }
                                    PointerInputChange pointerInputChange21 = pointerInputChange11;
                                    if (pointerInputChange21 != null) {
                                        longRef3.element = pointerInputChange21.getId();
                                        touchSlopDetector4 = touchSlopDetector3;
                                    }
                                }
                                awaitPointerEventScope5 = awaitPointerEventScope6;
                                touchSlopDetector6 = touchSlopDetector4;
                                f3 = f2;
                                longRef5 = longRef4;
                                longRef6 = longRef3;
                                pointerInputChange6 = pointerInputChange8;
                                pointerEventPass = 0;
                                this.L$0 = awaitPointerEventScope7;
                                this.L$1 = pointerInputChange6;
                                this.L$2 = awaitPointerEventScope5;
                                this.L$3 = longRef5;
                                this.L$4 = longRef6;
                                this.L$5 = touchSlopDetector6;
                                this.L$6 = pointerEventPass;
                                this.F$0 = f3;
                                this.label = 6;
                                obj3 = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope5, pointerEventPass, this, 1, pointerEventPass);
                                if (obj3 != coroutine_suspended) {
                                }
                            }
                            pointerInputChange2 = pointerInputChange8;
                            pointerInputChange = null;
                            awaitPointerEventScope2 = awaitPointerEventScope7;
                            pointerEventPass = 0;
                            if (pointerInputChange == null) {
                            }
                            if (pointerInputChange != null) {
                            }
                            return Unit.INSTANCE;
                        }
                        return coroutine_suspended;
                    }
                    i9++;
                    pointerEventPass = 0;
                }
                PointerInputChange pointerInputChange22 = pointerInputChange6;
                pointerInputChange = pointerInputChange5;
                pointerInputChange2 = pointerInputChange22;
                awaitPointerEventScope2 = awaitPointerEventScope5;
                if (pointerInputChange == null) {
                }
                if (pointerInputChange != null) {
                }
                return Unit.INSTANCE;
            case 6:
                j = InlineClassHelperKt.UnspecifiedPackedFloats;
                j2 = 9223372034707292159L;
                float f8 = this.F$0;
                touchSlopDetector2 = (TouchSlopDetector) this.L$5;
                Ref.LongRef longRef14 = (Ref.LongRef) this.L$4;
                Ref.LongRef longRef15 = (Ref.LongRef) this.L$3;
                AwaitPointerEventScope awaitPointerEventScope16 = (AwaitPointerEventScope) this.L$2;
                pointerInputChange7 = (PointerInputChange) this.L$1;
                AwaitPointerEventScope awaitPointerEventScope17 = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                obj3 = obj;
                f2 = f8;
                longRef3 = longRef14;
                awaitPointerEventScope6 = awaitPointerEventScope16;
                awaitPointerEventScope7 = awaitPointerEventScope17;
                longRef4 = longRef15;
                pointerEvent = (PointerEvent) obj3;
                List<PointerInputChange> changes82 = pointerEvent.getChanges();
                size = changes82.size();
                i = 0;
                while (true) {
                    if (i >= size) {
                    }
                    i++;
                    touchSlopDetector2 = touchSlopDetector3;
                    pointerEvent = pointerEvent2;
                    pointerInputChange7 = pointerInputChange8;
                }
                pointerInputChange10 = pointerInputChange9;
                if (pointerInputChange10 != null) {
                    if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange10)) {
                    }
                    awaitPointerEventScope5 = awaitPointerEventScope6;
                    touchSlopDetector6 = touchSlopDetector4;
                    f3 = f2;
                    longRef5 = longRef4;
                    longRef6 = longRef3;
                    pointerInputChange6 = pointerInputChange8;
                    pointerEventPass = 0;
                    this.L$0 = awaitPointerEventScope7;
                    this.L$1 = pointerInputChange6;
                    this.L$2 = awaitPointerEventScope5;
                    this.L$3 = longRef5;
                    this.L$4 = longRef6;
                    this.L$5 = touchSlopDetector6;
                    this.L$6 = pointerEventPass;
                    this.F$0 = f3;
                    this.label = 6;
                    obj3 = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope5, pointerEventPass, this, 1, pointerEventPass);
                    if (obj3 != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                pointerInputChange2 = pointerInputChange8;
                pointerInputChange = null;
                awaitPointerEventScope2 = awaitPointerEventScope7;
                pointerEventPass = 0;
                if (pointerInputChange == null) {
                }
                if (pointerInputChange != null) {
                }
                return Unit.INSTANCE;
            case 7:
                f3 = this.F$0;
                pointerInputChange10 = (PointerInputChange) this.L$6;
                touchSlopDetector5 = (TouchSlopDetector) this.L$5;
                longRef3 = (Ref.LongRef) this.L$4;
                Ref.LongRef longRef16 = (Ref.LongRef) this.L$3;
                j = InlineClassHelperKt.UnspecifiedPackedFloats;
                AwaitPointerEventScope awaitPointerEventScope18 = (AwaitPointerEventScope) this.L$2;
                PointerInputChange pointerInputChange23 = (PointerInputChange) this.L$1;
                j2 = 9223372034707292159L;
                AwaitPointerEventScope awaitPointerEventScope19 = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                awaitPointerEventScope8 = awaitPointerEventScope18;
                pointerInputChange6 = pointerInputChange23;
                awaitPointerEventScope7 = awaitPointerEventScope19;
                longRef5 = longRef16;
                if (!pointerInputChange10.isConsumed()) {
                }
                break;
            case 8:
                longRef7 = (Ref.LongRef) this.L$3;
                awaitPointerEventScope10 = (AwaitPointerEventScope) this.L$2;
                function2 = (Function2) this.L$1;
                AwaitPointerEventScope awaitPointerEventScope20 = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                awaitPointerEvent$default = obj;
                awaitPointerEventScope9 = awaitPointerEventScope20;
                orientation = null;
                PointerEvent pointerEvent5 = (PointerEvent) awaitPointerEvent$default;
                List<PointerInputChange> changes10 = pointerEvent5.getChanges();
                int size9 = changes10.size();
                int i11 = 0;
                while (true) {
                    if (i11 < size9) {
                        pointerInputChange13 = changes10.get(i11);
                        if (!PointerId.m6695equalsimpl0(pointerInputChange13.getId(), longRef7.element)) {
                            i11++;
                        }
                    } else {
                        pointerInputChange13 = null;
                    }
                }
                PointerInputChange pointerInputChange24 = pointerInputChange13;
                if (pointerInputChange24 != null) {
                    if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange24)) {
                        List<PointerInputChange> changes11 = pointerEvent5.getChanges();
                        int size10 = changes11.size();
                        int i12 = 0;
                        while (true) {
                            if (i12 < size10) {
                                pointerInputChange14 = changes11.get(i12);
                                if (!pointerInputChange14.getPressed()) {
                                    i12++;
                                }
                            } else {
                                pointerInputChange14 = null;
                            }
                        }
                        PointerInputChange pointerInputChange25 = pointerInputChange14;
                        if (pointerInputChange25 != null) {
                            longRef7.element = pointerInputChange25.getId();
                            this.L$0 = awaitPointerEventScope9;
                            this.L$1 = function2;
                            this.L$2 = awaitPointerEventScope10;
                            this.L$3 = longRef7;
                            this.L$4 = null;
                            this.L$5 = null;
                            this.L$6 = null;
                            this.label = 8;
                            awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope10, null, this, 1, null);
                            break;
                        }
                    } else {
                        long positionChangeIgnoreConsumed = PointerEventKt.positionChangeIgnoreConsumed(pointerInputChange24);
                        if ((orientation != null ? Float.intBitsToFloat((int) (orientation == Orientation.Vertical ? positionChangeIgnoreConsumed & 4294967295L : positionChangeIgnoreConsumed >> 32)) : Offset.m5146getDistanceimpl(positionChangeIgnoreConsumed)) == 0.0f) {
                            z = true;
                            break;
                        } else {
                            z = false;
                            break;
                        }
                    }
                } else {
                    pointerInputChange24 = null;
                }
                if (pointerInputChange24 != null && !pointerInputChange24.isConsumed()) {
                    if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange24)) {
                        pointerInputChange12 = pointerInputChange24;
                        if (pointerInputChange12 == null) {
                        }
                        return Unit.INSTANCE;
                    }
                    function2.invoke(pointerInputChange24, Offset.m5137boximpl(PointerEventKt.positionChange(pointerInputChange24)));
                    pointerInputChange24.consume();
                    id = pointerInputChange24.getId();
                    awaitPointerEventScope2 = awaitPointerEventScope9;
                    Ref.LongRef longRef112 = new Ref.LongRef();
                    longRef112.element = id;
                    longRef7 = longRef112;
                    awaitPointerEventScope10 = awaitPointerEventScope2;
                    awaitPointerEventScope9 = awaitPointerEventScope10;
                    this.L$0 = awaitPointerEventScope9;
                    this.L$1 = function2;
                    this.L$2 = awaitPointerEventScope10;
                    this.L$3 = longRef7;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.label = 8;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope10, null, this, 1, null);
                }
                pointerInputChange12 = null;
                if (pointerInputChange12 == null) {
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
