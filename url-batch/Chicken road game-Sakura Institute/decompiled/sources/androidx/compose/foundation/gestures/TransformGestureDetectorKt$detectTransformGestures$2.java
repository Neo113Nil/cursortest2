package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* compiled from: TransformGestureDetector.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2", f = "TransformGestureDetector.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, l = {59, LockFreeTaskQueueCore.CLOSED_SHIFT}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "rotation", "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom", "$this$awaitEachGesture", "rotation", "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom"}, s = {"L$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1", "L$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1"})
/* loaded from: classes.dex */
final class TransformGestureDetectorKt$detectTransformGestures$2 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function4<Offset, Offset, Float, Float, Unit> $onGesture;
    final /* synthetic */ boolean $panZoomLock;
    float F$0;
    float F$1;
    float F$2;
    int I$0;
    int I$1;
    long J$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TransformGestureDetectorKt$detectTransformGestures$2(boolean z, Function4<? super Offset, ? super Offset, ? super Float, ? super Float, Unit> function4, Continuation<? super TransformGestureDetectorKt$detectTransformGestures$2> continuation) {
        super(2, continuation);
        this.$panZoomLock = z;
        this.$onGesture = function4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TransformGestureDetectorKt$detectTransformGestures$2 transformGestureDetectorKt$detectTransformGestures$2 = new TransformGestureDetectorKt$detectTransformGestures$2(this.$panZoomLock, this.$onGesture, continuation);
        transformGestureDetectorKt$detectTransformGestures$2.L$0 = obj;
        return transformGestureDetectorKt$detectTransformGestures$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
        return ((TransformGestureDetectorKt$detectTransformGestures$2) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x013c, code lost:
    
        if (androidx.compose.ui.geometry.Offset.m3596equalsimpl0(r7, androidx.compose.ui.geometry.Offset.INSTANCE.m3615getZeroF1C5BW0()) == false) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00b2  */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00a2 -> B:6:0x00a5). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AwaitPointerEventScope awaitPointerEventScope;
        float f;
        float f2;
        float f3;
        int i;
        int i2;
        long j;
        Object awaitPointerEvent$default;
        int size;
        ?? r5;
        boolean z;
        Object obj2;
        boolean z2;
        float f4;
        char c;
        boolean z3;
        int i3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.label;
        int i5 = 2;
        boolean z4 = false;
        boolean z5 = true;
        z5 = true;
        z5 = true;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
            long m3615getZeroF1C5BW0 = Offset.INSTANCE.m3615getZeroF1C5BW0();
            float touchSlop = awaitPointerEventScope.getViewConfiguration().getTouchSlop();
            this.L$0 = awaitPointerEventScope;
            this.F$0 = 0.0f;
            this.F$1 = 1.0f;
            this.J$0 = m3615getZeroF1C5BW0;
            this.I$0 = 0;
            this.F$2 = touchSlop;
            this.I$1 = 0;
            this.label = 1;
            if (TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope, false, null, this, 2, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            f = touchSlop;
            f2 = 1.0f;
            f3 = 0.0f;
            i = 0;
            i2 = 0;
            j = m3615getZeroF1C5BW0;
        } else {
            if (i4 != 1) {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.I$1;
                f = this.F$2;
                i2 = this.I$0;
                j = this.J$0;
                f2 = this.F$1;
                f3 = this.F$0;
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                awaitPointerEvent$default = obj;
                PointerEvent pointerEvent = (PointerEvent) awaitPointerEvent$default;
                List<PointerInputChange> changes = pointerEvent.getChanges();
                size = changes.size();
                r5 = z4;
                while (true) {
                    if (r5 >= size) {
                        z = z4;
                        break;
                    }
                    if (changes.get(r5).isConsumed()) {
                        z = z5;
                        break;
                    }
                    r5++;
                }
                if (z) {
                    float calculateZoom = TransformGestureDetectorKt.calculateZoom(pointerEvent);
                    float calculateRotation = TransformGestureDetectorKt.calculateRotation(pointerEvent);
                    f4 = f;
                    long calculatePan = TransformGestureDetectorKt.calculatePan(pointerEvent);
                    if (i2 == 0) {
                        f2 *= calculateZoom;
                        f3 += calculateRotation;
                        j = Offset.m3604plusMKHz9U(j, calculatePan);
                        float calculateCentroidSize = TransformGestureDetectorKt.calculateCentroidSize(pointerEvent, z4);
                        obj2 = coroutine_suspended;
                        z2 = true;
                        float abs = Math.abs(1 - f2) * calculateCentroidSize;
                        float abs2 = Math.abs(((3.1415927f * f3) * calculateCentroidSize) / 180.0f);
                        float m3597getDistanceimpl = Offset.m3597getDistanceimpl(j);
                        if (abs > f4 || abs2 > f4 || m3597getDistanceimpl > f4) {
                            i = (!this.$panZoomLock || abs2 >= f4) ? 0 : 1;
                            i2 = 1;
                        }
                    } else {
                        obj2 = coroutine_suspended;
                        z2 = true;
                    }
                    if (i2 != 0) {
                        long calculateCentroid = TransformGestureDetectorKt.calculateCentroid(pointerEvent, false);
                        if (i != 0) {
                            calculateRotation = 0.0f;
                        }
                        z3 = false;
                        if (calculateRotation == 0.0f) {
                            c = 0;
                            if (calculateZoom == 1.0f) {
                                i3 = i;
                            } else {
                                i3 = i;
                            }
                        } else {
                            i3 = i;
                            c = 0;
                        }
                        this.$onGesture.invoke(Offset.m3588boximpl(calculateCentroid), Offset.m3588boximpl(calculatePan), Boxing.boxFloat(calculateZoom), Boxing.boxFloat(calculateRotation));
                        List<PointerInputChange> changes2 = pointerEvent.getChanges();
                        int size2 = changes2.size();
                        for (int i6 = 0; i6 < size2; i6++) {
                            PointerInputChange pointerInputChange = changes2.get(i6);
                            if (PointerEventKt.positionChanged(pointerInputChange)) {
                                pointerInputChange.consume();
                            }
                        }
                    } else {
                        i3 = i;
                        c = 0;
                        z3 = false;
                    }
                    i = i3;
                } else {
                    obj2 = coroutine_suspended;
                    z2 = z5;
                    f4 = f;
                    c = 0;
                    z3 = false;
                }
                if (!z) {
                    List<PointerInputChange> changes3 = pointerEvent.getChanges();
                    int size3 = changes3.size();
                    for (int i7 = 0; i7 < size3; i7++) {
                        if (changes3.get(i7).getPressed()) {
                            f = f4;
                            z5 = z2;
                            coroutine_suspended = obj2;
                            i5 = 2;
                            z4 = false;
                        }
                    }
                }
                return Unit.INSTANCE;
            }
            i = this.I$1;
            f = this.F$2;
            i2 = this.I$0;
            j = this.J$0;
            f2 = this.F$1;
            f3 = this.F$0;
            awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        this.L$0 = awaitPointerEventScope;
        this.F$0 = f3;
        this.F$1 = f2;
        this.J$0 = j;
        this.I$0 = i2;
        this.F$2 = f;
        this.I$1 = i;
        this.label = i5;
        awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, this, z5 ? 1 : 0, null);
        if (awaitPointerEvent$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        PointerEvent pointerEvent2 = (PointerEvent) awaitPointerEvent$default;
        List<PointerInputChange> changes4 = pointerEvent2.getChanges();
        size = changes4.size();
        r5 = z4;
        while (true) {
            if (r5 >= size) {
            }
            r5++;
        }
        if (z) {
        }
        if (!z) {
        }
        return Unit.INSTANCE;
    }
}
