package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$LongRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DragGestureDetector.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5", f = "DragGestureDetector.kt", l = {224}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class DragGestureDetectorKt$detectDragGestures$5 extends SuspendLambda implements Function2 {
    final /* synthetic */ Function2 $onDrag;
    final /* synthetic */ Function0 $onDragCancel;
    final /* synthetic */ Function0 $onDragEnd;
    final /* synthetic */ Function1 $onDragStart;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DragGestureDetectorKt$detectDragGestures$5(Function1 function1, Function2 function2, Function0 function0, Function0 function02, Continuation continuation) {
        super(2, continuation);
        this.$onDragStart = function1;
        this.$onDrag = function2;
        this.$onDragCancel = function0;
        this.$onDragEnd = function02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        DragGestureDetectorKt$detectDragGestures$5 dragGestureDetectorKt$detectDragGestures$5 = new DragGestureDetectorKt$detectDragGestures$5(this.$onDragStart, this.$onDrag, this.$onDragCancel, this.$onDragEnd, continuation);
        dragGestureDetectorKt$detectDragGestures$5.L$0 = obj;
        return dragGestureDetectorKt$detectDragGestures$5;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation continuation) {
        return ((DragGestureDetectorKt$detectDragGestures$5) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: DragGestureDetector.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5$1", f = "DragGestureDetector.kt", l = {Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 229, 241}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5$1, reason: invalid class name */
    static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2 {
        final /* synthetic */ Function2 $onDrag;
        final /* synthetic */ Function0 $onDragCancel;
        final /* synthetic */ Function0 $onDragEnd;
        final /* synthetic */ Function1 $onDragStart;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Function1 function1, Function2 function2, Function0 function0, Function0 function02, Continuation continuation) {
            super(2, continuation);
            this.$onDragStart = function1;
            this.$onDrag = function2;
            this.$onDragCancel = function0;
            this.$onDragEnd = function02;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$onDragStart, this.$onDrag, this.$onDragCancel, this.$onDragEnd, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable Continuation continuation) {
            return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x00ce  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x007a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x00c8  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007b -> B:17:0x007e). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            AwaitPointerEventScope awaitPointerEventScope;
            PointerInputChange pointerInputChange;
            AwaitPointerEventScope awaitPointerEventScope2;
            final Ref$LongRef ref$LongRef;
            Object m233awaitPointerSlopOrCancellationgDDlDlE;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                this.L$0 = awaitPointerEventScope;
                this.label = 1;
                obj = TapGestureDetectorKt.awaitFirstDown(awaitPointerEventScope, false, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
                    ref$LongRef = (Ref$LongRef) this.L$2;
                    pointerInputChange = (PointerInputChange) this.L$1;
                    AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    PointerInputChange pointerInputChange2 = (PointerInputChange) obj;
                    if (pointerInputChange2 != null || pointerInputChange2.isConsumed()) {
                        if (pointerInputChange2 != null) {
                            this.$onDragStart.invoke(Offset.m1288boximpl(pointerInputChange2.getPosition()));
                            this.$onDrag.invoke(pointerInputChange2, Offset.m1288boximpl(ref$LongRef.element));
                            long id = pointerInputChange2.getId();
                            final Function2 function2 = this.$onDrag;
                            Function1 function1 = new Function1() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures.5.1.2
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
                                    Function2.this.invoke(it, Offset.m1288boximpl(PointerEventKt.positionChange(it)));
                                    it.consume();
                                }
                            };
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 3;
                            obj = DragGestureDetectorKt.m237dragjO51t88(awaitPointerEventScope3, id, function1, this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            if (((Boolean) obj).booleanValue()) {
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    awaitPointerEventScope2 = awaitPointerEventScope3;
                    long id2 = pointerInputChange.getId();
                    int type = pointerInputChange.getType();
                    Function2 function22 = new Function2() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures.5.1.1
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                            m245invokeUv8p0NA((PointerInputChange) obj2, ((Offset) obj3).getPackedValue());
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
                        public final void m245invokeUv8p0NA(@NotNull PointerInputChange change, long j) {
                            Intrinsics.checkNotNullParameter(change, "change");
                            change.consume();
                            Ref$LongRef.this.element = j;
                        }
                    };
                    this.L$0 = awaitPointerEventScope2;
                    this.L$1 = pointerInputChange;
                    this.L$2 = ref$LongRef;
                    this.label = 2;
                    m233awaitPointerSlopOrCancellationgDDlDlE = DragGestureDetectorKt.m233awaitPointerSlopOrCancellationgDDlDlE(awaitPointerEventScope2, id2, type, function22, this);
                    if (m233awaitPointerSlopOrCancellationgDDlDlE != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    awaitPointerEventScope3 = awaitPointerEventScope2;
                    obj = m233awaitPointerSlopOrCancellationgDDlDlE;
                    PointerInputChange pointerInputChange22 = (PointerInputChange) obj;
                    if (pointerInputChange22 != null) {
                    }
                    if (pointerInputChange22 != null) {
                    }
                    return Unit.INSTANCE;
                }
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            Ref$LongRef ref$LongRef2 = new Ref$LongRef();
            ref$LongRef2.element = Offset.INSTANCE.m1308getZeroF1C5BW0();
            pointerInputChange = (PointerInputChange) obj;
            awaitPointerEventScope2 = awaitPointerEventScope;
            ref$LongRef = ref$LongRef2;
            long id22 = pointerInputChange.getId();
            int type2 = pointerInputChange.getType();
            Function2 function222 = new Function2() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures.5.1.1
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    m245invokeUv8p0NA((PointerInputChange) obj2, ((Offset) obj3).getPackedValue());
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
                public final void m245invokeUv8p0NA(@NotNull PointerInputChange change, long j) {
                    Intrinsics.checkNotNullParameter(change, "change");
                    change.consume();
                    Ref$LongRef.this.element = j;
                }
            };
            this.L$0 = awaitPointerEventScope2;
            this.L$1 = pointerInputChange;
            this.L$2 = ref$LongRef;
            this.label = 2;
            m233awaitPointerSlopOrCancellationgDDlDlE = DragGestureDetectorKt.m233awaitPointerSlopOrCancellationgDDlDlE(awaitPointerEventScope2, id22, type2, function222, this);
            if (m233awaitPointerSlopOrCancellationgDDlDlE != coroutine_suspended) {
            }
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
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$onDragStart, this.$onDrag, this.$onDragCancel, this.$onDragEnd, null);
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
