package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$FloatRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DragGestureDetector.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5", f = "DragGestureDetector.kt", l = {575}, m = "invokeSuspend")
/* loaded from: classes14.dex */
final class DragGestureDetectorKt$detectHorizontalDragGestures$5 extends SuspendLambda implements Function2 {
    final /* synthetic */ Function0 $onDragCancel;
    final /* synthetic */ Function0 $onDragEnd;
    final /* synthetic */ Function1 $onDragStart;
    final /* synthetic */ Function2 $onHorizontalDrag;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DragGestureDetectorKt$detectHorizontalDragGestures$5(Function1 function1, Function2 function2, Function0 function0, Function0 function02, Continuation continuation) {
        super(2, continuation);
        this.$onDragStart = function1;
        this.$onHorizontalDrag = function2;
        this.$onDragEnd = function0;
        this.$onDragCancel = function02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        DragGestureDetectorKt$detectHorizontalDragGestures$5 dragGestureDetectorKt$detectHorizontalDragGestures$5 = new DragGestureDetectorKt$detectHorizontalDragGestures$5(this.$onDragStart, this.$onHorizontalDrag, this.$onDragEnd, this.$onDragCancel, continuation);
        dragGestureDetectorKt$detectHorizontalDragGestures$5.L$0 = obj;
        return dragGestureDetectorKt$detectHorizontalDragGestures$5;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation continuation) {
        return ((DragGestureDetectorKt$detectHorizontalDragGestures$5) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: DragGestureDetector.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5$1", f = "DragGestureDetector.kt", l = {576, 578, 589}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5$1, reason: invalid class name */
    static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2 {
        final /* synthetic */ Function0 $onDragCancel;
        final /* synthetic */ Function0 $onDragEnd;
        final /* synthetic */ Function1 $onDragStart;
        final /* synthetic */ Function2 $onHorizontalDrag;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Function1 function1, Function2 function2, Function0 function0, Function0 function02, Continuation continuation) {
            super(2, continuation);
            this.$onDragStart = function1;
            this.$onHorizontalDrag = function2;
            this.$onDragEnd = function0;
            this.$onDragCancel = function02;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$onDragStart, this.$onHorizontalDrag, this.$onDragEnd, this.$onDragCancel, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable Continuation continuation) {
            return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x00b0  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x00aa  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            AwaitPointerEventScope awaitPointerEventScope;
            AwaitPointerEventScope awaitPointerEventScope2;
            Ref$FloatRef ref$FloatRef;
            PointerInputChange pointerInputChange;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) this.L$0;
                this.L$0 = awaitPointerEventScope3;
                this.label = 1;
                Object awaitFirstDown = TapGestureDetectorKt.awaitFirstDown(awaitPointerEventScope3, false, this);
                if (awaitFirstDown == coroutine_suspended) {
                    return coroutine_suspended;
                }
                awaitPointerEventScope = awaitPointerEventScope3;
                obj = awaitFirstDown;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        if (((Boolean) obj).booleanValue()) {
                            this.$onDragCancel.mo4828invoke();
                        } else {
                            this.$onDragEnd.mo4828invoke();
                        }
                        return Unit.INSTANCE;
                    }
                    ref$FloatRef = (Ref$FloatRef) this.L$1;
                    awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    pointerInputChange = (PointerInputChange) obj;
                    if (pointerInputChange != null) {
                        this.$onDragStart.invoke(Offset.m1288boximpl(pointerInputChange.getPosition()));
                        this.$onHorizontalDrag.invoke(pointerInputChange, Boxing.boxFloat(ref$FloatRef.element));
                        long id = pointerInputChange.getId();
                        final Function2 function2 = this.$onHorizontalDrag;
                        Function1 function1 = new Function1() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectHorizontalDragGestures.5.1.1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                invoke((PointerInputChange) obj2);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull PointerInputChange it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                Function2.this.invoke(it, Float.valueOf(Offset.m1297getXimpl(PointerEventKt.positionChange(it))));
                                it.consume();
                            }
                        };
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 3;
                        obj = DragGestureDetectorKt.m238horizontalDragjO51t88(awaitPointerEventScope2, id, function1, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        if (((Boolean) obj).booleanValue()) {
                        }
                    }
                    return Unit.INSTANCE;
                }
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            PointerInputChange pointerInputChange2 = (PointerInputChange) obj;
            final Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
            long id2 = pointerInputChange2.getId();
            int type = pointerInputChange2.getType();
            Function2 function22 = new Function2() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5$1$drag$1
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((PointerInputChange) obj2, ((Number) obj3).floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull PointerInputChange change, float f) {
                    Intrinsics.checkNotNullParameter(change, "change");
                    change.consume();
                    Ref$FloatRef.this.element = f;
                }
            };
            this.L$0 = awaitPointerEventScope;
            this.L$1 = ref$FloatRef2;
            this.label = 2;
            obj = DragGestureDetectorKt.m231awaitHorizontalPointerSlopOrCancellationgDDlDlE(awaitPointerEventScope, id2, type, function22, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            awaitPointerEventScope2 = awaitPointerEventScope;
            ref$FloatRef = ref$FloatRef2;
            pointerInputChange = (PointerInputChange) obj;
            if (pointerInputChange != null) {
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$onDragStart, this.$onHorizontalDrag, this.$onDragEnd, this.$onDragCancel, null);
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
