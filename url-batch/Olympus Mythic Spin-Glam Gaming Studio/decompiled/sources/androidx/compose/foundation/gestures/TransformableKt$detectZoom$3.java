package androidx.compose.foundation.gestures;

import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$LongRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Transformable.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/TransformScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableKt$detectZoom$3", f = "Transformable.kt", l = {101}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class TransformableKt$detectZoom$3 extends SuspendLambda implements Function2 {
    final /* synthetic */ Ref$BooleanRef $lockedToPanZoom;
    final /* synthetic */ Ref$LongRef $pan;
    final /* synthetic */ State<Boolean> $panZoomLock;
    final /* synthetic */ Ref$BooleanRef $pastTouchSlop;
    final /* synthetic */ Ref$FloatRef $rotation;
    final /* synthetic */ PointerInputScope $this_detectZoom;
    final /* synthetic */ float $touchSlop;
    final /* synthetic */ Ref$FloatRef $zoom;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransformableKt$detectZoom$3(PointerInputScope pointerInputScope, Ref$BooleanRef ref$BooleanRef, Ref$FloatRef ref$FloatRef, Ref$FloatRef ref$FloatRef2, Ref$LongRef ref$LongRef, float f, Ref$BooleanRef ref$BooleanRef2, State<Boolean> state, Continuation continuation) {
        super(2, continuation);
        this.$this_detectZoom = pointerInputScope;
        this.$pastTouchSlop = ref$BooleanRef;
        this.$zoom = ref$FloatRef;
        this.$rotation = ref$FloatRef2;
        this.$pan = ref$LongRef;
        this.$touchSlop = f;
        this.$lockedToPanZoom = ref$BooleanRef2;
        this.$panZoomLock = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        TransformableKt$detectZoom$3 transformableKt$detectZoom$3 = new TransformableKt$detectZoom$3(this.$this_detectZoom, this.$pastTouchSlop, this.$zoom, this.$rotation, this.$pan, this.$touchSlop, this.$lockedToPanZoom, this.$panZoomLock, continuation);
        transformableKt$detectZoom$3.L$0 = obj;
        return transformableKt$detectZoom$3;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull TransformScope transformScope, @Nullable Continuation continuation) {
        return ((TransformableKt$detectZoom$3) create(transformScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: Transformable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableKt$detectZoom$3$1", f = "Transformable.kt", l = {103}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.TransformableKt$detectZoom$3$1, reason: invalid class name */
    static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2 {
        final /* synthetic */ TransformScope $$this$transform;
        final /* synthetic */ Ref$BooleanRef $lockedToPanZoom;
        final /* synthetic */ Ref$LongRef $pan;
        final /* synthetic */ State<Boolean> $panZoomLock;
        final /* synthetic */ Ref$BooleanRef $pastTouchSlop;
        final /* synthetic */ Ref$FloatRef $rotation;
        final /* synthetic */ float $touchSlop;
        final /* synthetic */ Ref$FloatRef $zoom;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Ref$BooleanRef ref$BooleanRef, Ref$FloatRef ref$FloatRef, Ref$FloatRef ref$FloatRef2, Ref$LongRef ref$LongRef, float f, Ref$BooleanRef ref$BooleanRef2, State<Boolean> state, TransformScope transformScope, Continuation continuation) {
            super(2, continuation);
            this.$pastTouchSlop = ref$BooleanRef;
            this.$zoom = ref$FloatRef;
            this.$rotation = ref$FloatRef2;
            this.$pan = ref$LongRef;
            this.$touchSlop = f;
            this.$lockedToPanZoom = ref$BooleanRef2;
            this.$panZoomLock = state;
            this.$$this$transform = transformScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$pastTouchSlop, this.$zoom, this.$rotation, this.$pan, this.$touchSlop, this.$lockedToPanZoom, this.$panZoomLock, this.$$this$transform, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable Continuation continuation) {
            return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0117  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x002e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:63:0x004e A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x003d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x002c -> B:5:0x002f). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            AwaitPointerEventScope awaitPointerEventScope;
            int size;
            int i;
            boolean z;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                this.L$0 = awaitPointerEventScope;
                this.label = 1;
                obj = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, this, 1, null);
                if (obj == coroutine_suspended) {
                }
                PointerEvent pointerEvent = (PointerEvent) obj;
                List changes = pointerEvent.getChanges();
                size = changes.size();
                int i3 = 0;
                i = 0;
                while (true) {
                    if (i >= size) {
                    }
                    i++;
                }
                if (!z) {
                }
                if (!z) {
                }
                return Unit.INSTANCE;
            }
            if (i2 == 1) {
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                PointerEvent pointerEvent2 = (PointerEvent) obj;
                List changes2 = pointerEvent2.getChanges();
                size = changes2.size();
                int i32 = 0;
                i = 0;
                while (true) {
                    if (i >= size) {
                        z = false;
                        break;
                    }
                    if (((PointerInputChange) changes2.get(i)).isConsumed()) {
                        z = true;
                        break;
                    }
                    i++;
                }
                if (!z) {
                    float calculateZoom = TransformGestureDetectorKt.calculateZoom(pointerEvent2);
                    float calculateRotation = TransformGestureDetectorKt.calculateRotation(pointerEvent2);
                    long calculatePan = TransformGestureDetectorKt.calculatePan(pointerEvent2);
                    if (!this.$pastTouchSlop.element) {
                        this.$zoom.element *= calculateZoom;
                        this.$rotation.element += calculateRotation;
                        Ref$LongRef ref$LongRef = this.$pan;
                        ref$LongRef.element = Offset.m1302plusMKHz9U(ref$LongRef.element, calculatePan);
                        float calculateCentroidSize = TransformGestureDetectorKt.calculateCentroidSize(pointerEvent2, false);
                        float abs = Math.abs(1 - this.$zoom.element) * calculateCentroidSize;
                        float abs2 = Math.abs(((this.$rotation.element * 3.1415927f) * calculateCentroidSize) / 180.0f);
                        float m1295getDistanceimpl = Offset.m1295getDistanceimpl(this.$pan.element);
                        float f = this.$touchSlop;
                        if (abs > f || abs2 > f || m1295getDistanceimpl > f) {
                            this.$pastTouchSlop.element = true;
                            this.$lockedToPanZoom.element = ((Boolean) this.$panZoomLock.getValue()).booleanValue() && abs2 < this.$touchSlop;
                        }
                    }
                    if (this.$pastTouchSlop.element) {
                        if (this.$lockedToPanZoom.element) {
                            calculateRotation = 0.0f;
                        }
                        if (calculateRotation != 0.0f || calculateZoom != 1.0f || !Offset.m1294equalsimpl0(calculatePan, Offset.INSTANCE.m1308getZeroF1C5BW0())) {
                            this.$$this$transform.mo225transformByd4ec7I(calculateZoom, calculatePan, calculateRotation);
                        }
                        List changes3 = pointerEvent2.getChanges();
                        int size2 = changes3.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            PointerInputChange pointerInputChange = (PointerInputChange) changes3.get(i4);
                            if (PointerEventKt.positionChanged(pointerInputChange)) {
                                pointerInputChange.consume();
                            }
                        }
                    }
                }
                if (!z) {
                    List changes4 = pointerEvent2.getChanges();
                    int size3 = changes4.size();
                    while (i32 < size3) {
                        if (((PointerInputChange) changes4.get(i32)).getPressed()) {
                            this.L$0 = awaitPointerEventScope;
                            this.label = 1;
                            obj = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, this, 1, null);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            PointerEvent pointerEvent22 = (PointerEvent) obj;
                            List changes22 = pointerEvent22.getChanges();
                            size = changes22.size();
                            int i322 = 0;
                            i = 0;
                            while (true) {
                                if (i >= size) {
                                }
                                i++;
                            }
                            if (!z) {
                            }
                            if (!z) {
                            }
                        } else {
                            i322++;
                        }
                    }
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            TransformScope transformScope = (TransformScope) this.L$0;
            PointerInputScope pointerInputScope = this.$this_detectZoom;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$pastTouchSlop, this.$zoom, this.$rotation, this.$pan, this.$touchSlop, this.$lockedToPanZoom, this.$panZoomLock, transformScope, null);
            this.label = 1;
            if (pointerInputScope.awaitPointerEventScope(anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
